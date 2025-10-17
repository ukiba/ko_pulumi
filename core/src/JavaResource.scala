package jp.ukiba.ko_pulumi

import scala.jdk.CollectionConverters.*
import scala.util.Using
import scala.util.matching.Regex
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets.UTF_8
import java.nio.file.{Path, Files}
import java.util.jar.JarFile
import java.util.regex.Pattern

/** Reads / enumerates Java resources */
object JavaResource:
  /**
   * @param from base for relative path
   * @param path relative or absolute (with leading slash)
   */
  def readResource(from: Class[?])(path: String): String =
    Option(from.getResourceAsStream(path)) match  // Class.getResource* should be used for bundled resources
      case Some(is) => Using.resource(InputStreamReader(is, UTF_8))(_.readAllAsString())  // Java 25 API
      case None     => throw IllegalStateException(s"Java resource not found: $path${
          Option.when(!path.startsWith("/"))(s" from ${from.getName}").mkString}")

  def readResources(from: Class[?])(paths: Seq[String]): Seq[String] =
    paths.map(readResource(from))

  def readResourcesRegex(from: Class[?])(regex: String): Seq[String] =
    val absolute = regex.startsWith("/")
    val paths = findResourcesRegex(from)(if absolute then regex.dropWhile(_ == '/').r else regex.r, absolute)
    readResources(from)(paths)

  def readResourcesGlob(from: Class[?])(glob: String): Seq[String] =
    val absolute = glob.startsWith("/")
    val paths = findResourcesRegex(from)(regexOfGlob(if absolute then glob.dropWhile(_ == '/') else glob), absolute)
    readResources(from)(paths)

  def findResourcesRegex(from: Class[?])(regex: Regex, absolute: Boolean): Seq[String] =
    val fromPath = from.getPackageName.replace('.', '/')
    val relativePrefix = if fromPath.nonEmpty then s"$fromPath/" else ""  // empty when default package
    def adopt(name: String): Option[String] =
      if absolute then
        Option.when(regex.matches(name)):
          s"/$name"
      else
        for
          relative <- Option.when(name.startsWith(relativePrefix) && name.length > relativePrefix.length):
            name.drop(relativePrefix.length)
          adopted <- Option.when(regex.matches(relative)):
            relative
        yield adopted

    /*
      Include the following in build.mill

          // "/resources.index" is generated since protectionDomain.getCodeSource returns null in mill, unlike sbt.
          // https://mill-build.org/mill/scalalib/module-config.html says
          // "classpath resources are useful when you want to fetch individual files" ...
          // "But they do not allow you to list folders or perform other filesystem operations"
          override def resources = Task:
            super.resources() ++ resourcesIndex()
          def resourcesIndex = Task:
            val entries = super.resources().map(_.path).filter(os.isDir).flatMap: root =>
                os.walk(root).filter(os.isFile).map(_.subRelativeTo(root).toString)  // SubPath.toString uses '/'
              .distinct.sorted
            os.write.over(Task.dest / "resources.index", entries.map(_ + "\n").mkString)
            Seq(PathRef(Task.dest))

      Note: Even though it is possible for Scala 3 macro to enumerate source files and embed the content,
      the incremental compilation doesn't pick up the content changes.
    */
    Option(from.getResourceAsStream("/resources.index")) match  // the first "resources.index" wins
      case Some(is) =>
        Using.resource(InputStreamReader(is, UTF_8))(_.readAllLines().asScala)  // Java 25 API
            .toSeq.flatMap(adopt)  // "/resources.index" is supposed to be sorted

      case None =>
        val codeSourceLocation = for
          protectionDomain <- Option(from.getProtectionDomain)
          codeSource       <- Option(protectionDomain.getCodeSource)
          loc              <- Option(codeSource.getLocation)
        yield loc

        val names = codeSourceLocation match
          case Some(url) => url.getProtocol match
            case "file" =>
              val path = Path.of(url.toURI)
              if Files.isDirectory(path) then
                val sep = path.getFileSystem.getSeparator
                Using.resource(Files.walk(path)): stream =>
                  stream.iterator.asScala
                    .filter(Files.isRegularFile(_))
                    .map(p => path.relativize(p).toString.replace(sep, "/"))
                    .flatMap(adopt)
                    .toSeq

              else
                val fileName = path.getFileName.toString
                val fileExt = fileName.takeRight(4).toLowerCase
                if fileExt == ".jar" || fileExt == ".zip" then
                  Using.resource(JarFile(path.toFile)): jar =>
                    jar.entries.asScala
                      .filter(!_.isDirectory)
                      .map(_.getName)
                      .flatMap(adopt)
                      .toSeq

                else
                  throw IllegalStateException(s"codeSourceLocation is not directory, .jar, or .zip: $path ($url)")
            case _ => throw IllegalStateException(s"codeSourceLocation is not file: $url")
          case None => throw IllegalStateException("codeSourceLocation is not available")

        names.sorted

  /**
   * Construct regex from glob pattern.
   * 1. "**" followed by "/" matches zero or more path segments at the beginning and in the middle.
   * 2. Unlike zsh
   *     1. "**" is not allowed at the end.
   *     2. "**" is not allowed as part of path segment.  Use "*" instead.
   *     3. Consecutive "**" separated by "/" are not allowed.
   *     4. "*" and "**" match dot-prefixed entries.
   *     5. "[]" and "{}" patterns are not recognized.
   */
  def regexOfGlob(glob: String): Regex =
    val regex = StringBuilder()

    // Pattern.quote outputs \Q...\E
    // calling it for every character except `*` and `?` results in hard to inspect regex for human
    val literal = StringBuilder()
    def flushLiteral(): Unit =
      if literal.nonEmpty then
        regex ++= Pattern.quote(literal.toString)
        literal.clear()

    // "^" and "$" would be unnecessary because the regex is anchored in the default
    // and only `matches` is used in this class,
    // but having them is harmless and should be useful when this method is reused
    regex += '^'

    var i = 0
    var allowStarStarNext = true
    while i < glob.length do
      glob.charAt(i) match
        case '*' if i + 1 < glob.length && glob.charAt(i + 1) == '*' =>
          flushLiteral()
          if allowStarStarNext then
            if i + 2 < glob.length && glob.charAt(i + 2) == '/' then
              if i + 3 == glob.length then
                throw IllegalArgumentException("**/ must not appear at the end")
              regex ++= "(?:[^/]+/)*"  // (?:X) is a non-capturing group
              i += 3

            else
              throw IllegalArgumentException("** must be immediately followed by '/'")

            allowStarStarNext = false

          else
            throw IllegalArgumentException(
                "** must be at the beginning or immediately follow '/', and must not be repeated consecutively")

        case '*' =>
          flushLiteral()
          regex ++= "[^/]*"
          i += 1
          allowStarStarNext = false

        case '?' =>
          flushLiteral()
          regex ++= "[^/]"
          i += 1
          allowStarStarNext = false

        case ch =>
          literal += ch
          i += 1
          allowStarStarNext = ch == '/'

    flushLiteral()
    regex += '$'
    regex.toString.r
