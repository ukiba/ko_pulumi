package jp.ukiba.ko_pulumi
package aws

object synthetics_ext:
  extension (builder: com.pulumi.aws.synthetics.CanaryArgs.Builder)
    /**
     * @param artifactConfig configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * @return builder
     */
    inline def artifactConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.builder
      builder.artifactConfig(args(argsBuilder).build)

    /**
     * @param runConfig Configuration block for individual canary runs. Detailed below.
     * @return builder
     */
    inline def runConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.builder
      builder.runConfig(args(argsBuilder).build)

    /**
     * @param schedule Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param vpcConfig Configuration block. Detailed below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.Builder]):
        com.pulumi.aws.synthetics.CanaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder)
    /**
     * @param s3Encryption Configuration of the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See S3 Encryption.
     * @return builder
     */
    inline def s3Encryption(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigS3EncryptionArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigS3EncryptionArgs.builder
      builder.s3Encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder)
    /**
     * @param retryConfig Configuration block for canary retries. Detailed below.
     * @return builder
     */
    inline def retryConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryScheduleRetryConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryScheduleRetryConfigArgs.builder
      builder.retryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.synthetics.inputs.CanaryState.Builder)
    /**
     * @param artifactConfig configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * @return builder
     */
    inline def artifactConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryArtifactConfigArgs.builder
      builder.artifactConfig(args(argsBuilder).build)

    /**
     * @param runConfig Configuration block for individual canary runs. Detailed below.
     * @return builder
     */
    inline def runConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryRunConfigArgs.builder
      builder.runConfig(args(argsBuilder).build)

    /**
     * @param schedule Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def schedule(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param timelines Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * @return builder
     */
    inline def timelines(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryTimelineArgs.Builder]*):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      def argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryTimelineArgs.builder
      builder.timelines(args.map(_(argsBuilder).build)*)

    /**
     * @param vpcConfig Configuration block. Detailed below.
     * @return builder
     */
    inline def vpcConfig(args: Endofunction[com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.Builder]):
        com.pulumi.aws.synthetics.inputs.CanaryState.Builder =
      val argsBuilder = com.pulumi.aws.synthetics.inputs.CanaryVpcConfigArgs.builder
      builder.vpcConfig(args(argsBuilder).build)
