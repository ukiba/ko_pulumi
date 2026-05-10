package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object transcoder:
  /**
   * Transcoding Job Resource
   * 
   *  To get more information about Job, see:
   * 
   *  * [API documentation](https://cloud.google.com/transcoder/docs/reference/rest/v1/projects.locations.jobs)
   *  * How-to Guides
   *      * [Transcoder](https://cloud.google.com/transcoder/docs/)
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.transcoder.JobArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.transcoder.JobArgs.builder
    com.pulumi.gcp.transcoder.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.transcoder.JobArgs.Builder)
    /**
     * @param config The configuration for this template.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder]):
        com.pulumi.gcp.transcoder.JobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.JobTemplateArgs.Builder)
    /**
     * @param config The configuration for this template.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder]):
        com.pulumi.gcp.transcoder.JobTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.builder
      builder.config(args(argsBuilder).build)

  /**
   * Transcoding Job Template Resource
   * 
   *  To get more information about JobTemplate, see:
   * 
   *  * [API documentation](https://cloud.google.com/transcoder/docs/reference/rest/v1/projects.locations.jobTemplates)
   *  * How-to Guides
   *      * [Transcoder](https://cloud.google.com/transcoder/docs/)
   */
  def JobTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.transcoder.JobTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.transcoder.JobTemplateArgs.builder
    com.pulumi.gcp.transcoder.JobTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder)
    /**
     * @param adBreaks Ad break.
     *  Structure is documented below.
     * @return builder
     */
    def adBreaks(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigAdBreakArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigAdBreakArgs.builder
      builder.adBreaks(args.map(_(argsBuilder).build)*)

    /**
     * @param editLists List of input assets stored in Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def editLists(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEditListArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEditListArgs.builder
      builder.editLists(args.map(_(argsBuilder).build)*)

    /**
     * @param elementaryStreams List of input assets stored in Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def elementaryStreams(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamArgs.builder
      builder.elementaryStreams(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptions List of encryption configurations for the content.
     *  Structure is documented below.
     * @return builder
     */
    def encryptions(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.builder
      builder.encryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param inputs List of input assets stored in Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigInputArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigInputArgs.builder
      builder.inputs(args.map(_(argsBuilder).build)*)

    /**
     * @param manifests Manifest configuration.
     *  Structure is documented below.
     * @return builder
     */
    def manifests(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigManifestArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigManifestArgs.builder
      builder.manifests(args.map(_(argsBuilder).build)*)

    /**
     * @param muxStreams Multiplexing settings for output stream.
     *  Structure is documented below.
     * @return builder
     */
    def muxStreams(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigMuxStreamArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigMuxStreamArgs.builder
      builder.muxStreams(args.map(_(argsBuilder).build)*)

    /**
     * @param output Location of output file(s) in a Cloud Storage bucket.
     *  Structure is documented below.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOutputArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOutputArgs.builder
      builder.output(args(argsBuilder).build)

    /**
     * @param overlays List of overlays on the output video, in descending Z-order.
     *  Structure is documented below.
     * @return builder
     */
    def overlays(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayArgs.builder
      builder.overlays(args.map(_(argsBuilder).build)*)

    /**
     * @param pubsubDestination Pub/Sub destination.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubDestination(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigPubsubDestinationArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigPubsubDestinationArgs.builder
      builder.pubsubDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder)
    /**
     * @param adBreaks Ad break.
     *  Structure is documented below.
     * @return builder
     */
    def adBreaks(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigAdBreakArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigAdBreakArgs.builder
      builder.adBreaks(args.map(_(argsBuilder).build)*)

    /**
     * @param editLists List of input assets stored in Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def editLists(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEditListArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEditListArgs.builder
      builder.editLists(args.map(_(argsBuilder).build)*)

    /**
     * @param elementaryStreams List of input assets stored in Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def elementaryStreams(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamArgs.builder
      builder.elementaryStreams(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptions List of encryption configurations for the content.
     *  Structure is documented below.
     * @return builder
     */
    def encryptions(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.builder
      builder.encryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param inputs List of input assets stored in Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def inputs(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigInputArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigInputArgs.builder
      builder.inputs(args.map(_(argsBuilder).build)*)

    /**
     * @param manifests Manifest configuration.
     *  Structure is documented below.
     * @return builder
     */
    def manifests(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigManifestArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigManifestArgs.builder
      builder.manifests(args.map(_(argsBuilder).build)*)

    /**
     * @param muxStreams Multiplexing settings for output stream.
     *  Structure is documented below.
     * @return builder
     */
    def muxStreams(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigMuxStreamArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigMuxStreamArgs.builder
      builder.muxStreams(args.map(_(argsBuilder).build)*)

    /**
     * @param output Location of output file(s) in a Cloud Storage bucket.
     *  Structure is documented below.
     * @return builder
     */
    def output(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigOutputArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigOutputArgs.builder
      builder.output(args(argsBuilder).build)

    /**
     * @param overlays List of overlays on the output video, in descending Z-order.
     *  Structure is documented below.
     * @return builder
     */
    def overlays(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigOverlayArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigOverlayArgs.builder
      builder.overlays(args.map(_(argsBuilder).build)*)

    /**
     * @param pubsubDestination Pub/Sub destination.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubDestination(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigPubsubDestinationArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigPubsubDestinationArgs.builder
      builder.pubsubDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationArgs.Builder)
    /**
     * @param animationFade Display overlay object with fade animation.
     *  Structure is documented below.
     * @return builder
     */
    def animationFade(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationAnimationFadeArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationAnimationFadeArgs.builder
      builder.animationFade(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayArgs.Builder)
    /**
     * @param animations List of animations. The list should be chronological, without any time overlap.
     *  Structure is documented below.
     * @return builder
     */
    def animations(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationArgs.builder
      builder.animations(args.map(_(argsBuilder).build)*)

    /**
     * @param image Image overlay.
     *  Structure is documented below.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayImageArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayImageArgs.builder
      builder.image(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigMuxStreamArgs.Builder)
    /**
     * @param segmentSettings Segment settings for ts, fmp4 and vtt.
     *  Structure is documented below.
     * @return builder
     */
    def segmentSettings(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigMuxStreamSegmentSettingsArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigMuxStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigMuxStreamSegmentSettingsArgs.builder
      builder.segmentSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamArgs.Builder)
    /**
     * @param h264 H264 codec settings
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedConfigElementaryStreamsVideoStreamH264&#34;&gt;&lt;/a&gt;The `h264` block supports:
     * @return builder
     */
    def h264(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264Args.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264Args.builder
      builder.h264(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264Args.Builder)
    /**
     * @param hlg HLG color format setting for H264.
     * @return builder
     */
    def hlg(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264HlgArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264Args.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264HlgArgs.builder
      builder.hlg(args(argsBuilder).build)

    /**
     * @param sdr SDR color format setting for H264.
     * @return builder
     */
    def sdr(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264SdrArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264Args.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264SdrArgs.builder
      builder.sdr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationArgs.Builder)
    /**
     * @param animationFade Display overlay object with fade animation.
     *  Structure is documented below.
     * @return builder
     */
    def animationFade(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationAnimationFadeArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationAnimationFadeArgs.builder
      builder.animationFade(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.Builder)
    /**
     * @param aes128 Configuration for AES-128 encryption.
     * @return builder
     */
    def aes128(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionAes128Args.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionAes128Args.builder
      builder.aes128(args(argsBuilder).build)

    /**
     * @param drmSystems DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
     *  Structure is documented below.
     * @return builder
     */
    def drmSystems(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs.builder
      builder.drmSystems(args(argsBuilder).build)

    /**
     * @param mpegCenc Configuration for MPEG Common Encryption (MPEG-CENC).
     *  Structure is documented below.
     * @return builder
     */
    def mpegCenc(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionMpegCencArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionMpegCencArgs.builder
      builder.mpegCenc(args(argsBuilder).build)

    /**
     * @param sampleAes Configuration for SAMPLE-AES encryption.
     * @return builder
     */
    def sampleAes(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionSampleAesArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionSampleAesArgs.builder
      builder.sampleAes(args(argsBuilder).build)

    /**
     * @param secretManagerKeySource Configuration for secrets stored in Google Secret Manager.
     *  Structure is documented below.
     * @return builder
     */
    def secretManagerKeySource(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionSecretManagerKeySourceArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionSecretManagerKeySourceArgs.builder
      builder.secretManagerKeySource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsArgs.Builder)
    /**
     * @param clearkey Clearkey configuration.
     * @return builder
     */
    def clearkey(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsClearkeyArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsClearkeyArgs.builder
      builder.clearkey(args(argsBuilder).build)

    /**
     * @param fairplay Fairplay configuration.
     * @return builder
     */
    def fairplay(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsFairplayArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsFairplayArgs.builder
      builder.fairplay(args(argsBuilder).build)

    /**
     * @param playready Playready configuration.
     * @return builder
     */
    def playready(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsPlayreadyArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsPlayreadyArgs.builder
      builder.playready(args(argsBuilder).build)

    /**
     * @param widevine Widevine configuration.
     * @return builder
     */
    def widevine(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsWidevineArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsWidevineArgs.builder
      builder.widevine(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.Builder)
    /**
     * @param aes128 Configuration for AES-128 encryption.
     * @return builder
     */
    def aes128(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionAes128Args.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionAes128Args.builder
      builder.aes128(args(argsBuilder).build)

    /**
     * @param drmSystems DRM system(s) to use; at least one must be specified. If a DRM system is omitted, it is considered disabled.
     *  Structure is documented below.
     * @return builder
     */
    def drmSystems(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionDrmSystemsArgs.builder
      builder.drmSystems(args(argsBuilder).build)

    /**
     * @param mpegCenc Configuration for MPEG Common Encryption (MPEG-CENC).
     *  Structure is documented below.
     * @return builder
     */
    def mpegCenc(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionMpegCencArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionMpegCencArgs.builder
      builder.mpegCenc(args(argsBuilder).build)

    /**
     * @param sampleAes Configuration for SAMPLE-AES encryption.
     * @return builder
     */
    def sampleAes(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionSampleAesArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionSampleAesArgs.builder
      builder.sampleAes(args(argsBuilder).build)

    /**
     * @param secretManagerKeySource Configuration for secrets stored in Google Secret Manager.
     *  Structure is documented below.
     * @return builder
     */
    def secretManagerKeySource(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionSecretManagerKeySourceArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigEncryptionSecretManagerKeySourceArgs.builder
      builder.secretManagerKeySource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamArgs.Builder)
    /**
     * @param audioStream Encoding of an audio stream.
     *  Structure is documented below.
     * @return builder
     */
    def audioStream(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamAudioStreamArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamAudioStreamArgs.builder
      builder.audioStream(args(argsBuilder).build)

    /**
     * @param videoStream Encoding of a video stream.
     *  Structure is documented below.
     * @return builder
     */
    def videoStream(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamArgs.builder
      builder.videoStream(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamArgs.Builder)
    /**
     * @param h264 H264 codec settings
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedConfigElementaryStreamsVideoStreamH264&#34;&gt;&lt;/a&gt;The `h264` block supports:
     * @return builder
     */
    def h264(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264Args.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamH264Args.builder
      builder.h264(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateState.Builder)
    /**
     * @param config The configuration for this template.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigOverlayArgs.Builder)
    /**
     * @param animations List of animations. The list should be chronological, without any time overlap.
     *  Structure is documented below.
     * @return builder
     */
    def animations(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationArgs.Builder]*):
        com.pulumi.gcp.transcoder.inputs.JobConfigOverlayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationArgs.builder
      builder.animations(args.map(_(argsBuilder).build)*)

    /**
     * @param image Image overlay.
     *  Structure is documented below.
     * @return builder
     */
    def image(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigOverlayImageArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigOverlayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigOverlayImageArgs.builder
      builder.image(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationAnimationFadeArgs.Builder)
    /**
     * @param xy Normalized coordinates based on output video resolution.
     *  Structure is documented below.
     * @return builder
     */
    def xy(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationAnimationFadeXyArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationAnimationFadeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigOverlayAnimationAnimationFadeXyArgs.builder
      builder.xy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264Args.Builder)
    /**
     * @param hlg HLG color format setting for H264.
     * @return builder
     */
    def hlg(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264HlgArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264Args.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264HlgArgs.builder
      builder.hlg(args(argsBuilder).build)

    /**
     * @param sdr SDR color format setting for H264.
     * @return builder
     */
    def sdr(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264SdrArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264Args.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigElementaryStreamVideoStreamH264SdrArgs.builder
      builder.sdr(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamArgs.Builder)
    /**
     * @param audioStream Encoding of an audio stream.
     *  Structure is documented below.
     * @return builder
     */
    def audioStream(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamAudioStreamArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamAudioStreamArgs.builder
      builder.audioStream(args(argsBuilder).build)

    /**
     * @param videoStream Encoding of a video stream.
     *  Structure is documented below.
     * @return builder
     */
    def videoStream(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigElementaryStreamVideoStreamArgs.builder
      builder.videoStream(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationAnimationFadeArgs.Builder)
    /**
     * @param xy Normalized coordinates based on output video resolution.
     *  Structure is documented below.
     * @return builder
     */
    def xy(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationAnimationFadeXyArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationAnimationFadeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigOverlayAnimationAnimationFadeXyArgs.builder
      builder.xy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs.Builder)
    /**
     * @param clearkey Clearkey configuration.
     * @return builder
     */
    def clearkey(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsClearkeyArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsClearkeyArgs.builder
      builder.clearkey(args(argsBuilder).build)

    /**
     * @param fairplay Fairplay configuration.
     * @return builder
     */
    def fairplay(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsFairplayArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsFairplayArgs.builder
      builder.fairplay(args(argsBuilder).build)

    /**
     * @param playready Playready configuration.
     * @return builder
     */
    def playready(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsPlayreadyArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsPlayreadyArgs.builder
      builder.playready(args(argsBuilder).build)

    /**
     * @param widevine Widevine configuration.
     * @return builder
     */
    def widevine(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsWidevineArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobTemplateConfigEncryptionDrmSystemsWidevineArgs.builder
      builder.widevine(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobState.Builder)
    /**
     * @param config The configuration for this template.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.transcoder.inputs.JobConfigMuxStreamArgs.Builder)
    /**
     * @param segmentSettings Segment settings for ts, fmp4 and vtt.
     *  Structure is documented below.
     * @return builder
     */
    def segmentSettings(args: Endofunction[com.pulumi.gcp.transcoder.inputs.JobConfigMuxStreamSegmentSettingsArgs.Builder]):
        com.pulumi.gcp.transcoder.inputs.JobConfigMuxStreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.transcoder.inputs.JobConfigMuxStreamSegmentSettingsArgs.builder
      builder.segmentSettings(args(argsBuilder).build)
