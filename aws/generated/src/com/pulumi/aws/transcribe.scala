package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object transcribe:
  /**
   * Resource for managing an AWS Transcribe LanguageModel.
   *  
   *  &gt; This resource can take a significant amount of time to provision. See Language Model [FAQ](https://aws.amazon.com/transcribe/faqs/) for more details.
   */
  def LanguageModel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transcribe.LanguageModelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.LanguageModelArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transcribe.LanguageModel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Transcribe VocabularyFilter. */
  def VocabularyFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transcribe.VocabularyFilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.VocabularyFilterArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transcribe.VocabularyFilter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transcribe.LanguageModelArgs.Builder)
    /**
     * @param inputDataConfig The input data config for the LanguageModel. See Input Data Config for more details.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.Builder]):
        com.pulumi.aws.transcribe.LanguageModelArgs.Builder =
      val argsBuilder = com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

  /** Resource for managing an AWS Transcribe Vocabulary. */
  def Vocabulary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transcribe.VocabularyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.VocabularyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transcribe.Vocabulary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Transcribe MedicalVocabulary. */
  def MedicalVocabulary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.transcribe.MedicalVocabularyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.transcribe.MedicalVocabularyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.transcribe.MedicalVocabulary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.transcribe.inputs.LanguageModelState.Builder)
    /**
     * @param inputDataConfig The input data config for the LanguageModel. See Input Data Config for more details.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.Builder]):
        com.pulumi.aws.transcribe.inputs.LanguageModelState.Builder =
      val argsBuilder = com.pulumi.aws.transcribe.inputs.LanguageModelInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)
