package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object kendra:
  /** Resource for managing an AWS Kendra Data Source. */
  def DataSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kendra.DataSourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.DataSourceArgs.builder
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
    com.pulumi.aws.kendra.DataSource(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Kendra Experience. */
  def Experience(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kendra.ExperienceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.ExperienceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.kendra.Experience(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Kendra FAQ. */
  def Faq(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kendra.FaqArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.FaqArgs.builder
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
    com.pulumi.aws.kendra.Faq(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides an Amazon Kendra Index resource. */
  def Index(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kendra.IndexArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.IndexArgs.builder
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
    com.pulumi.aws.kendra.Index(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object KendraFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about a specific Amazon Kendra Experience. */
    inline def getExperience(args: Endofunction[com.pulumi.aws.kendra.inputs.GetExperienceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetExperienceResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetExperienceArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getExperience(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Experience. */
    inline def getExperiencePlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetExperiencePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetExperienceResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetExperiencePlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getExperiencePlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Faq. */
    inline def getFaq(args: Endofunction[com.pulumi.aws.kendra.inputs.GetFaqArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetFaqResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetFaqArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getFaq(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Faq. */
    inline def getFaqPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetFaqPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetFaqResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetFaqPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getFaqPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Index. */
    inline def getIndex(args: Endofunction[com.pulumi.aws.kendra.inputs.GetIndexArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetIndexResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetIndexArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getIndex(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Index. */
    inline def getIndexPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetIndexPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetIndexResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetIndexPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getIndexPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra block list used for query suggestions for an index. */
    inline def getQuerySuggestionsBlockList(args: Endofunction[com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetQuerySuggestionsBlockListResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getQuerySuggestionsBlockList(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra block list used for query suggestions for an index. */
    inline def getQuerySuggestionsBlockListPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetQuerySuggestionsBlockListResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetQuerySuggestionsBlockListPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getQuerySuggestionsBlockListPlain(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Thesaurus. */
    inline def getThesaurus(args: Endofunction[com.pulumi.aws.kendra.inputs.GetThesaurusArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.kendra.outputs.GetThesaurusResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetThesaurusArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getThesaurus(args(argsBuilder).build)

    /** Provides details about a specific Amazon Kendra Thesaurus. */
    inline def getThesaurusPlain(args: Endofunction[com.pulumi.aws.kendra.inputs.GetThesaurusPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.kendra.outputs.GetThesaurusResult] =
      val argsBuilder = com.pulumi.aws.kendra.inputs.GetThesaurusPlainArgs.builder
      com.pulumi.aws.kendra.KendraFunctions.getThesaurusPlain(args(argsBuilder).build)

  /** Use the `aws.kendra.QuerySuggestionsBlockList` resource to manage an AWS Kendra block list used for query suggestions for an index. */
  def QuerySuggestionsBlockList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kendra.QuerySuggestionsBlockListArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.QuerySuggestionsBlockListArgs.builder
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
    com.pulumi.aws.kendra.QuerySuggestionsBlockList(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Kendra Thesaurus. */
  def Thesaurus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.kendra.ThesaurusArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.kendra.ThesaurusArgs.builder
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
    com.pulumi.aws.kendra.Thesaurus(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
