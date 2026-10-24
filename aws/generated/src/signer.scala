package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object signer:
  object SignerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides information about a Signer Signing Job. */
    inline def getSigningJob(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningJobArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.signer.outputs.GetSigningJobResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningJobArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningJob(args(argsBuilder).build)

    /** Provides information about a Signer Signing Job. */
    inline def getSigningJobPlain(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningJobPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.signer.outputs.GetSigningJobResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningJobPlainArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningJobPlain(args(argsBuilder).build)

    /** Provides information about a Signer Signing Profile. */
    inline def getSigningProfile(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningProfileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.signer.outputs.GetSigningProfileResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningProfileArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningProfile(args(argsBuilder).build)

    /** Provides information about a Signer Signing Profile. */
    inline def getSigningProfilePlain(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningProfilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.signer.outputs.GetSigningProfileResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningProfilePlainArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningProfilePlain(args(argsBuilder).build)

  /** Creates a Signer Signing Job. */
  def SigningJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.signer.SigningJobArgs.builder
    com.pulumi.aws.signer.SigningJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Creates a Signer Signing Profile. A signing profile contains information about the code signing configuration parameters that can be used by a given code signing user. */
  def SigningProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.signer.SigningProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.signer.SigningProfile(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile. */
  def SigningProfilePermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningProfilePermissionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.signer.SigningProfilePermissionArgs.builder
    com.pulumi.aws.signer.SigningProfilePermission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
