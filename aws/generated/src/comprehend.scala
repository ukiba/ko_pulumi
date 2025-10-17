package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object comprehend:
  /** Resource for managing an AWS Comprehend Document Classifier. */
  def DocumentClassifier(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.comprehend.DocumentClassifierArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.comprehend.DocumentClassifierArgs.builder
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
    com.pulumi.aws.comprehend.DocumentClassifier(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.comprehend.DocumentClassifierArgs.Builder)
    /**
     * @param inputDataConfig Configuration for the training and testing data.
     * See the `inputDataConfig` Configuration Block section below.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigArgs.Builder]):
        com.pulumi.aws.comprehend.DocumentClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Configuration for the output results of training.
     * See the `outputDataConfig` Configuration Block section below.
     * @return builder
     */
    def outputDataConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.DocumentClassifierOutputDataConfigArgs.Builder]):
        com.pulumi.aws.comprehend.DocumentClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.DocumentClassifierOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration parameters for VPC to contain Document Classifier resources.
     * See the `vpcConfig` Configuration Block section below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.DocumentClassifierVpcConfigArgs.Builder]):
        com.pulumi.aws.comprehend.DocumentClassifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.DocumentClassifierVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  /** Resource for managing an AWS Comprehend Entity Recognizer. */
  def EntityRecognizer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.comprehend.EntityRecognizerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.comprehend.EntityRecognizerArgs.builder
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
    com.pulumi.aws.comprehend.EntityRecognizer(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.comprehend.EntityRecognizerArgs.Builder)
    /**
     * @param inputDataConfig Configuration for the training and testing data.
     * See the `inputDataConfig` Configuration Block section below.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder]):
        com.pulumi.aws.comprehend.EntityRecognizerArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration parameters for VPC to contain Entity Recognizer resources.
     * See the `vpcConfig` Configuration Block section below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerVpcConfigArgs.Builder]):
        com.pulumi.aws.comprehend.EntityRecognizerArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigArgs.Builder)
    /**
     * @param augmentedManifests List of training datasets produced by Amazon SageMaker AI Ground Truth.
     * Used if `dataFormat` is `AUGMENTED_MANIFEST`.
     * See the `augmentedManifests` Configuration Block section below.
     * @return builder
     */
    def augmentedManifests(args: Endofunction[com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigAugmentedManifestArgs.Builder]*):
        com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigAugmentedManifestArgs.builder
      builder.augmentedManifests(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.comprehend.inputs.DocumentClassifierState.Builder)
    /**
     * @param inputDataConfig Configuration for the training and testing data.
     * See the `inputDataConfig` Configuration Block section below.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.DocumentClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.DocumentClassifierInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param outputDataConfig Configuration for the output results of training.
     * See the `outputDataConfig` Configuration Block section below.
     * @return builder
     */
    def outputDataConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.DocumentClassifierOutputDataConfigArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.DocumentClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.DocumentClassifierOutputDataConfigArgs.builder
      builder.outputDataConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration parameters for VPC to contain Document Classifier resources.
     * See the `vpcConfig` Configuration Block section below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.DocumentClassifierVpcConfigArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.DocumentClassifierState.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.DocumentClassifierVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder)
    /**
     * @param annotations Specifies location of the document annotation data.
     * See the `annotations` Configuration Block section below.
     * One of `annotations` or `entityList` is required.
     * @return builder
     */
    def annotations(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigAnnotationsArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigAnnotationsArgs.builder
      builder.annotations(args(argsBuilder).build)

    /**
     * @param augmentedManifests List of training datasets produced by Amazon SageMaker AI Ground Truth.
     * Used if `dataFormat` is `AUGMENTED_MANIFEST`.
     * See the `augmentedManifests` Configuration Block section below.
     * @return builder
     */
    def augmentedManifests(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigAugmentedManifestArgs.Builder]*):
        com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigAugmentedManifestArgs.builder
      builder.augmentedManifests(args.map(_(argsBuilder).build)*)

    /**
     * @param documents Specifies a collection of training documents.
     * Used if `dataFormat` is `COMPREHEND_CSV`.
     * See the `documents` Configuration Block section below.
     * @return builder
     */
    def documents(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigDocumentsArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigDocumentsArgs.builder
      builder.documents(args(argsBuilder).build)

    /**
     * @param entityList Specifies location of the entity list data.
     * See the `entityList` Configuration Block section below.
     * One of `entityList` or `annotations` is required.
     * @return builder
     */
    def entityList(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigEntityListArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigEntityListArgs.builder
      builder.entityList(args(argsBuilder).build)

    /**
     * @param entityTypes Set of entity types to be recognized.
     * Has a maximum of 25 items.
     * See the `entityTypes` Configuration Block section below.
     * @return builder
     */
    def entityTypes(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigEntityTypeArgs.Builder]*):
        com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigEntityTypeArgs.builder
      builder.entityTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.comprehend.inputs.EntityRecognizerState.Builder)
    /**
     * @param inputDataConfig Configuration for the training and testing data.
     * See the `inputDataConfig` Configuration Block section below.
     * @return builder
     */
    def inputDataConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.EntityRecognizerState.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs.builder
      builder.inputDataConfig(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration parameters for VPC to contain Entity Recognizer resources.
     * See the `vpcConfig` Configuration Block section below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.comprehend.inputs.EntityRecognizerVpcConfigArgs.Builder]):
        com.pulumi.aws.comprehend.inputs.EntityRecognizerState.Builder =
      val argsBuilder = com.pulumi.aws.comprehend.inputs.EntityRecognizerVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)
