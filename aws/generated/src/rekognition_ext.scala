package jp.ukiba.ko_pulumi
package aws

object rekognition_ext:
  extension (builder: com.pulumi.aws.rekognition.CollectionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rekognition.inputs.CollectionTimeoutsArgs.Builder]):
        com.pulumi.aws.rekognition.CollectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.CollectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.ProjectArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rekognition.inputs.ProjectTimeoutsArgs.Builder]):
        com.pulumi.aws.rekognition.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.ProjectTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.StreamProcessorArgs.Builder)
    /**
     * @param dataSharingPreference See `dataSharingPreference`.
     * @return builder
     */
    def dataSharingPreference(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorDataSharingPreferenceArgs.Builder]):
        com.pulumi.aws.rekognition.StreamProcessorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorDataSharingPreferenceArgs.builder
      builder.dataSharingPreference(args(argsBuilder).build)

    /**
     * @param input Input video stream. See `input`.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorInputArgs.Builder]):
        com.pulumi.aws.rekognition.StreamProcessorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param notificationChannel Amazon Simple Notification Service topic to which Amazon Rekognition publishes the completion status. See `notificationChannel`.
     * @return builder
     */
    def notificationChannel(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorNotificationChannelArgs.Builder]):
        com.pulumi.aws.rekognition.StreamProcessorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorNotificationChannelArgs.builder
      builder.notificationChannel(args(argsBuilder).build)

    /**
     * @param output Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the analysis results. See `output`.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorOutputArgs.Builder]):
        com.pulumi.aws.rekognition.StreamProcessorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorOutputArgs.builder
      builder.output(args(argsBuilder).build)

    /**
     * @param regionsOfInterests Locations in the frames where Amazon Rekognition checks for objects or people. See `regionsOfInterest`.
     * @return builder
     */
    def regionsOfInterests(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestArgs.Builder]*):
        com.pulumi.aws.rekognition.StreamProcessorArgs.Builder =
      def argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestArgs.builder
      builder.regionsOfInterests(args.map(_(argsBuilder).build)*)

    /**
     * @param settings Input parameters used in a streaming video analyzed by a stream processor. See `settings`.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsArgs.Builder]):
        com.pulumi.aws.rekognition.StreamProcessorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorTimeoutsArgs.Builder]):
        com.pulumi.aws.rekognition.StreamProcessorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.inputs.CollectionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rekognition.inputs.CollectionTimeoutsArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.CollectionState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.CollectionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.inputs.ProjectState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.rekognition.inputs.ProjectTimeoutsArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.ProjectTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.inputs.StreamProcessorInputArgs.Builder)
    /**
     * @param kinesisVideoStream Kinesis input stream. See `kinesisVideoStream`.
     * @return builder
     */
    def kinesisVideoStream(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorInputKinesisVideoStreamArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorInputArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorInputKinesisVideoStreamArgs.builder
      builder.kinesisVideoStream(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.inputs.StreamProcessorOutputArgs.Builder)
    /**
     * @param kinesisDataStream Amazon Kinesis Data Streams stream to which the Amazon Rekognition stream processor streams the analysis results. See `kinesisDataStream`.
     * @return builder
     */
    def kinesisDataStream(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorOutputKinesisDataStreamArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorOutputKinesisDataStreamArgs.builder
      builder.kinesisDataStream(args(argsBuilder).build)

    /**
     * @param s3Destination Amazon S3 bucket location to which Amazon Rekognition publishes the detailed inference results of a video analysis operation. See `s3Destination`.
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorOutputS3DestinationArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorOutputArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorOutputS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestArgs.Builder)
    /**
     * @param boundingBox Box representing a region of interest on screen. Only 1 per region is allowed. See `boundingBox`.
     * @return builder
     */
    def boundingBox(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestBoundingBoxArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestBoundingBoxArgs.builder
      builder.boundingBox(args(argsBuilder).build)

    /**
     * @param polygons Shape made up of up to 10 Point objects to define a region of interest. See `polygon`.
     * @return builder
     */
    def polygons(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestPolygonArgs.Builder]*):
        com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestArgs.Builder =
      def argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestPolygonArgs.builder
      builder.polygons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsArgs.Builder)
    /**
     * @param connectedHome Label detection settings to use on a streaming video. See `connectedHome`.
     * @return builder
     */
    def connectedHome(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsConnectedHomeArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsConnectedHomeArgs.builder
      builder.connectedHome(args(argsBuilder).build)

    /**
     * @param faceSearch Input face recognition parameters for an Amazon Rekognition stream processor. See `faceSearch`.
     * @return builder
     */
    def faceSearch(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsFaceSearchArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsFaceSearchArgs.builder
      builder.faceSearch(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder)
    /**
     * @param dataSharingPreference See `dataSharingPreference`.
     * @return builder
     */
    def dataSharingPreference(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorDataSharingPreferenceArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorDataSharingPreferenceArgs.builder
      builder.dataSharingPreference(args(argsBuilder).build)

    /**
     * @param input Input video stream. See `input`.
     * @return builder
     */
    def input(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorInputArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorInputArgs.builder
      builder.input(args(argsBuilder).build)

    /**
     * @param notificationChannel Amazon Simple Notification Service topic to which Amazon Rekognition publishes the completion status. See `notificationChannel`.
     * @return builder
     */
    def notificationChannel(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorNotificationChannelArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorNotificationChannelArgs.builder
      builder.notificationChannel(args(argsBuilder).build)

    /**
     * @param output Kinesis data stream stream or Amazon S3 bucket location to which Amazon Rekognition Video puts the analysis results. See `output`.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorOutputArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorOutputArgs.builder
      builder.output(args(argsBuilder).build)

    /**
     * @param regionsOfInterests Locations in the frames where Amazon Rekognition checks for objects or people. See `regionsOfInterest`.
     * @return builder
     */
    def regionsOfInterests(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestArgs.Builder]*):
        com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder =
      def argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorRegionsOfInterestArgs.builder
      builder.regionsOfInterests(args.map(_(argsBuilder).build)*)

    /**
     * @param settings Input parameters used in a streaming video analyzed by a stream processor. See `settings`.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.rekognition.inputs.StreamProcessorTimeoutsArgs.Builder]):
        com.pulumi.aws.rekognition.inputs.StreamProcessorState.Builder =
      val argsBuilder = com.pulumi.aws.rekognition.inputs.StreamProcessorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
