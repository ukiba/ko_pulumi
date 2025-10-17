package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object transcribe:
  /**
   * Resource for managing an AWS Transcribe LanguageModel.
   * 
   * &gt; This resource can take a significant amount of time to provision. See Language Model [FAQ](https://aws.amazon.com/transcribe/faqs/) for more details.
   */
  def LanguageModel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.transcribe.LanguageModelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.LanguageModelArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.transcribe.LanguageModel(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.transcribe.LanguageModelArgs.Builder)
    /**
     * @param inputDataConfig The input data config for the LanguageModel. See Input Data Config for more details.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.Builder]):
        com.pulumi.aws.transcribe.LanguageModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

  /** Resource for managing an AWS Transcribe MedicalVocabulary. */
  def MedicalVocabulary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.transcribe.MedicalVocabularyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.MedicalVocabularyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.transcribe.MedicalVocabulary(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Transcribe Vocabulary. */
  def Vocabulary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.transcribe.VocabularyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.VocabularyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.transcribe.Vocabulary(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS Transcribe VocabularyFilter. */
  def VocabularyFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.transcribe.VocabularyFilterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.VocabularyFilterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.transcribe.VocabularyFilter(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.transcribe.inputs.LanguageModelState.Builder)
    /**
     * @param inputDataConfig The input data config for the LanguageModel. See Input Data Config for more details.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.Builder]):
        com.pulumi.aws.transcribe.inputs.LanguageModelState.Builder =
      val argsBuilder = com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)
