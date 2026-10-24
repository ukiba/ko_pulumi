package jp.ukiba.ko_pulumi
package aws

object ivs_ext:
  extension (builder: com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder)
    /**
     * @param destinationConfiguration Object containing destination configuration for where recorded video will be stored.
     * @return builder
     */
    inline def destinationConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param thumbnailConfiguration Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
     * @return builder
     */
    inline def thumbnailConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.RecordingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.builder
      builder.thumbnailConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder)
    /**
     * @param s3 S3 destination configuration where recorded videos will be stored.
     * @return builder
     */
    inline def s3(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationS3Args.Builder]):
        com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationS3Args.builder
      builder.s3(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ivs.inputs.RecordingConfigurationState.Builder)
    /**
     * @param destinationConfiguration Object containing destination configuration for where recorded video will be stored.
     * @return builder
     */
    inline def destinationConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.inputs.RecordingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs.builder
      builder.destinationConfiguration(args(argsBuilder).build)

    /**
     * @param thumbnailConfiguration Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
     * @return builder
     */
    inline def thumbnailConfiguration(args: Endofunction[com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.Builder]):
        com.pulumi.aws.ivs.inputs.RecordingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs.builder
      builder.thumbnailConfiguration(args(argsBuilder).build)
