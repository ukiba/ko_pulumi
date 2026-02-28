package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object elastictranscoder:
  /**
   * Provides an Elastic Transcoder pipeline resource.
   *  
   *  &gt; **Warning:** This resource is deprecated. Use [AWS Elemental MediaConvert](https://aws.amazon.com/blogs/media/migrating-workflows-from-amazon-elastic-transcoder-to-aws-elemental-mediaconvert/) instead. AWS will [discontinue support for Amazon Elastic Transcoder](https://aws.amazon.com/blogs/media/support-for-amazon-elastic-transcoder-ending-soon/), effective November 13, 2025.
   */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elastictranscoder.PipelineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elastictranscoder.PipelineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.elastictranscoder.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an Elastic Transcoder preset resource.
   *  
   *  &gt; **Warning:** This resource is deprecated. Use [AWS Elemental MediaConvert](https://aws.amazon.com/blogs/media/migrating-workflows-from-amazon-elastic-transcoder-to-aws-elemental-mediaconvert/) instead. AWS will [discontinue support for Amazon Elastic Transcoder](https://aws.amazon.com/blogs/media/support-for-amazon-elastic-transcoder-ending-soon/), effective November 13, 2025.
   */
  def Preset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.elastictranscoder.PresetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.elastictranscoder.PresetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.elastictranscoder.Preset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.elastictranscoder.PresetArgs.Builder)
    /**
     * @param audio Audio parameters object (documented below).
     * @return builder
     */
    def audio(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetAudioArgs.Builder]):
        com.pulumi.aws.elastictranscoder.PresetArgs.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetAudioArgs.builder
      builder.audio(args(argsBuilder).build)

    /**
     * @param audioCodecOptions Codec options for the audio parameters (documented below)
     * @return builder
     */
    def audioCodecOptions(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsArgs.Builder]):
        com.pulumi.aws.elastictranscoder.PresetArgs.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsArgs.builder
      builder.audioCodecOptions(args(argsBuilder).build)

    /**
     * @param thumbnails Thumbnail parameters object (documented below)
     * @return builder
     */
    def thumbnails(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsArgs.Builder]):
        com.pulumi.aws.elastictranscoder.PresetArgs.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsArgs.builder
      builder.thumbnails(args(argsBuilder).build)

    /**
     * @param video Video parameters object (documented below)
     * @return builder
     */
    def video(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetVideoArgs.Builder]):
        com.pulumi.aws.elastictranscoder.PresetArgs.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetVideoArgs.builder
      builder.video(args(argsBuilder).build)

    /**
     * @param videoWatermarks Watermark parameters for the video parameters (documented below)
     * @return builder
     */
    def videoWatermarks(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkArgs.Builder]*):
        com.pulumi.aws.elastictranscoder.PresetArgs.Builder =
      def argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkArgs.builder
      builder.videoWatermarks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elastictranscoder.PipelineArgs.Builder)
    /**
     * @param contentConfig The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
     * @return builder
     */
    def contentConfig(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigArgs.Builder]):
        com.pulumi.aws.elastictranscoder.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigArgs.builder
      builder.contentConfig(args(argsBuilder).build)

    /**
     * @param contentConfigPermissions The permissions for the `contentConfig` object. (documented below)
     * @return builder
     */
    def contentConfigPermissions(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigPermissionArgs.Builder]*):
        com.pulumi.aws.elastictranscoder.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigPermissionArgs.builder
      builder.contentConfigPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineNotificationsArgs.Builder]):
        com.pulumi.aws.elastictranscoder.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineNotificationsArgs.builder
      builder.notifications(args(argsBuilder).build)

    /**
     * @param thumbnailConfig The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
     * @return builder
     */
    def thumbnailConfig(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigArgs.Builder]):
        com.pulumi.aws.elastictranscoder.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigArgs.builder
      builder.thumbnailConfig(args(argsBuilder).build)

    /**
     * @param thumbnailConfigPermissions The permissions for the `thumbnailConfig` object. (documented below)
     *  
     *  See [&#34;Create Pipeline&#34;](http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/create-pipeline.html) in the AWS docs for reference.
     *  
     *  The `contentConfig` object specifies information about the Amazon S3 bucket in
     *  which you want Elastic Transcoder to save transcoded files and playlists: which
     *  bucket to use, and the storage class that you want to assign to the files. If
     *  you specify values for `contentConfig`, you must also specify values for
     *  `thumbnailConfig`. If you specify values for `contentConfig` and
     *  `thumbnailConfig`, omit the `outputBucket` object.
     * @return builder
     */
    def thumbnailConfigPermissions(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigPermissionArgs.Builder]*):
        com.pulumi.aws.elastictranscoder.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigPermissionArgs.builder
      builder.thumbnailConfigPermissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elastictranscoder.inputs.PresetState.Builder)
    /**
     * @param audio Audio parameters object (documented below).
     * @return builder
     */
    def audio(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetAudioArgs.Builder]):
        com.pulumi.aws.elastictranscoder.inputs.PresetState.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetAudioArgs.builder
      builder.audio(args(argsBuilder).build)

    /**
     * @param audioCodecOptions Codec options for the audio parameters (documented below)
     * @return builder
     */
    def audioCodecOptions(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsArgs.Builder]):
        com.pulumi.aws.elastictranscoder.inputs.PresetState.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsArgs.builder
      builder.audioCodecOptions(args(argsBuilder).build)

    /**
     * @param thumbnails Thumbnail parameters object (documented below)
     * @return builder
     */
    def thumbnails(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsArgs.Builder]):
        com.pulumi.aws.elastictranscoder.inputs.PresetState.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsArgs.builder
      builder.thumbnails(args(argsBuilder).build)

    /**
     * @param video Video parameters object (documented below)
     * @return builder
     */
    def video(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetVideoArgs.Builder]):
        com.pulumi.aws.elastictranscoder.inputs.PresetState.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetVideoArgs.builder
      builder.video(args(argsBuilder).build)

    /**
     * @param videoWatermarks Watermark parameters for the video parameters (documented below)
     * @return builder
     */
    def videoWatermarks(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkArgs.Builder]*):
        com.pulumi.aws.elastictranscoder.inputs.PresetState.Builder =
      def argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkArgs.builder
      builder.videoWatermarks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elastictranscoder.inputs.PipelineState.Builder)
    /**
     * @param contentConfig The ContentConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists. (documented below)
     * @return builder
     */
    def contentConfig(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigArgs.Builder]):
        com.pulumi.aws.elastictranscoder.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigArgs.builder
      builder.contentConfig(args(argsBuilder).build)

    /**
     * @param contentConfigPermissions The permissions for the `contentConfig` object. (documented below)
     * @return builder
     */
    def contentConfigPermissions(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigPermissionArgs.Builder]*):
        com.pulumi.aws.elastictranscoder.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineContentConfigPermissionArgs.builder
      builder.contentConfigPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param notifications The Amazon Simple Notification Service (Amazon SNS) topic that you want to notify to report job status. (documented below)
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineNotificationsArgs.Builder]):
        com.pulumi.aws.elastictranscoder.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineNotificationsArgs.builder
      builder.notifications(args(argsBuilder).build)

    /**
     * @param thumbnailConfig The ThumbnailConfig object specifies information about the Amazon S3 bucket in which you want Elastic Transcoder to save thumbnail files. (documented below)
     * @return builder
     */
    def thumbnailConfig(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigArgs.Builder]):
        com.pulumi.aws.elastictranscoder.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigArgs.builder
      builder.thumbnailConfig(args(argsBuilder).build)

    /**
     * @param thumbnailConfigPermissions The permissions for the `thumbnailConfig` object. (documented below)
     *  
     *  See [&#34;Create Pipeline&#34;](http://docs.aws.amazon.com/elastictranscoder/latest/developerguide/create-pipeline.html) in the AWS docs for reference.
     *  
     *  The `contentConfig` object specifies information about the Amazon S3 bucket in
     *  which you want Elastic Transcoder to save transcoded files and playlists: which
     *  bucket to use, and the storage class that you want to assign to the files. If
     *  you specify values for `contentConfig`, you must also specify values for
     *  `thumbnailConfig`. If you specify values for `contentConfig` and
     *  `thumbnailConfig`, omit the `outputBucket` object.
     * @return builder
     */
    def thumbnailConfigPermissions(args: Endofunction[com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigPermissionArgs.Builder]*):
        com.pulumi.aws.elastictranscoder.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.aws.elastictranscoder.inputs.PipelineThumbnailConfigPermissionArgs.builder
      builder.thumbnailConfigPermissions(args.map(_(argsBuilder).build)*)
