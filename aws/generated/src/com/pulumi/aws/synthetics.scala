package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object synthetics:
  type SyntheticsFunctions = com.pulumi.aws.synthetics.SyntheticsFunctions
  object SyntheticsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.synthetics.SyntheticsFunctions.*
  extension (self: SyntheticsFunctions.type)
    /** Data source for managing an AWS CloudWatch Synthetics Runtime Version. */
    def getRuntimeVersion(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersion(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Synthetics Runtime Version. */
    def getRuntimeVersionPlain(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionPlainArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersionPlain(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Synthetics Runtime Versions. */
    def getRuntimeVersions(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionsResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersions(args(argsBuilder).build)

    /** Data source for managing an AWS CloudWatch Synthetics Runtime Versions. */
    def getRuntimeVersionsPlain(args: Endofunction[com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.synthetics.outputs.GetRuntimeVersionsResult] =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.GetRuntimeVersionsPlainArgs.builder
      com.pulumi.aws.synthetics.SyntheticsFunctions.getRuntimeVersionsPlain(args(argsBuilder).build)

  /** Provides a Synthetics Group resource. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.synthetics.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.synthetics.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.synthetics.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Synthetics Canary resource.
   *  
   *  &gt; **NOTE:** When you create a canary, AWS creates supporting implicit resources. See the Amazon CloudWatch Synthetics documentation on [DeleteCanary](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DeleteCanary.html) for a full list. Neither AWS nor this provider deletes these implicit resources automatically when the canary is deleted. Before deleting a canary, ensure you have all the information about the canary that you need to delete the implicit resources using the AWS Console, or AWS CLI.
   */
  def Canary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.synthetics.CanaryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.synthetics.CanaryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.synthetics.Canary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Synthetics Group Association resource. */
  def GroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.synthetics.GroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.synthetics.GroupAssociationArgs.builder
    
    com.pulumi.aws.synthetics.GroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.synthetics.CanaryArgs.Builder)
    /**
     * @param artifactConfig configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * @return builder
     */
    def artifactConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.builder
      builder.artifactConfig(args(argsBuilder).build)

    /**
     * @param runConfig Configuration block for individual canary runs. Detailed below.
     * @return builder
     */
    def runConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.builder
      builder.runConfig(args(argsBuilder).build)

    /**
     * @param schedule Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block. Detailed below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.synthetics.inputs.CanaryState.Builder)
    /**
     * @param artifactConfig configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * @return builder
     */
    def artifactConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.builder
      builder.artifactConfig(args(argsBuilder).build)

    /**
     * @param runConfig Configuration block for individual canary runs. Detailed below.
     * @return builder
     */
    def runConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.builder
      builder.runConfig(args(argsBuilder).build)

    /**
     * @param schedule Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param timelines Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * @return builder
     */
    def timelines(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryTimelineArgs.Builder]*):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      def argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryTimelineArgs.builder
      builder.timelines(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcConfig Configuration block. Detailed below.
     * @return builder
     */
    def vpcConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder)
    /**
     * @param retryConfig Configuration block for canary retries. Detailed below.
     * @return builder
     */
    def retryConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryScheduleRetryConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryScheduleRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder)
    /**
     * @param s3Encryption Configuration of the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See S3 Encryption.
     * @return builder
     */
    def s3Encryption(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigS3EncryptionArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigS3EncryptionArgs.builder
      builder.s3Encryption(args(argsBuilder).build)
