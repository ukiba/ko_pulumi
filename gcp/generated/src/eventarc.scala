package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object eventarc:
  /**
   * The Eventarc Pipeline resource
   * 
   *  To get more information about Pipeline, see:
   * 
   *  * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.pipelines)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/receive-events/create-enrollment)
   */
  def Pipeline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.PipelineArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.eventarc.PipelineArgs.builder
    com.pulumi.gcp.eventarc.Pipeline(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Eventarc MessageBus resource
   * 
   *  To get more information about MessageBus, see:
   * 
   *  * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.messageBuses)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/publish-events/create-bus)
   */
  def MessageBus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.MessageBusArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.eventarc.MessageBusArgs.builder
    com.pulumi.gcp.eventarc.MessageBus(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.eventarc.GoogleApiSourceArgs.Builder)
    /**
     * @param loggingConfig The configuration for Platform Telemetry logging for Eventarc Advanced
     *  resources.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.GoogleApiSourceLoggingConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.GoogleApiSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.GoogleApiSourceLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  /**
   * The Eventarc GoogleApiSource resource
   * 
   *  To get more information about GoogleApiSource, see:
   * 
   *  * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.googleApiSources)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/publish-events/publish-events-google-sources)
   */
  def GoogleApiSource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.GoogleApiSourceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.eventarc.GoogleApiSourceArgs.builder
    com.pulumi.gcp.eventarc.GoogleApiSource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.eventarc.MessageBusArgs.Builder)
    /**
     * @param loggingConfig The configuration for Platform Telemetry logging for Eventarc Advanced
     *  resources.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.MessageBusLoggingConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.MessageBusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.MessageBusLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  /**
   * The Eventarc Channel resource
   * 
   *  To get more information about Channel, see:
   * 
   *  * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.channels)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/eventarc/standard/docs/third-parties/create-channels)
   */
  def Channel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.ChannelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.eventarc.ChannelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.eventarc.Channel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.eventarc.TriggerArgs.Builder)
    /**
     * @param destination Required. Destination specifies where the events should be sent to.
     *  Structure is documented below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.Builder]):
        com.pulumi.gcp.eventarc.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param matchingCriterias Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     *  Structure is documented below.
     * @return builder
     */
    def matchingCriterias(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs.Builder]*):
        com.pulumi.gcp.eventarc.TriggerArgs.Builder =
      def argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs.builder
      builder.matchingCriterias(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy The retry policy configuration for the Trigger.
     *  Can only be set with Cloud Run destinations.
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerRetryPolicyArgs.Builder]):
        com.pulumi.gcp.eventarc.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param transport Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     *  Structure is documented below.
     * @return builder
     */
    def transport(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs.Builder]):
        com.pulumi.gcp.eventarc.TriggerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs.builder
      builder.transport(args(argsBuilder).build)

  /**
   * The Eventarc GoogleChannelConfig resource
   * 
   *  To get more information about GoogleChannelConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/eventarc/docs/use-cmek#enable-cmek-google-channel)
   */
  def GoogleChannelConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.GoogleChannelConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.eventarc.GoogleChannelConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.eventarc.GoogleChannelConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Eventarc Trigger resource
   * 
   *  To get more information about Trigger, see:
   * 
   *  * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.triggers)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/eventarc/standard/docs/overview#eventarc-triggers)
   */
  def Trigger(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.TriggerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.eventarc.TriggerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.eventarc.Trigger(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Eventarc Enrollment resource
   * 
   *  To get more information about Enrollment, see:
   * 
   *  * [API documentation](https://cloud.google.com/eventarc/docs/reference/rest/v1/projects.locations.enrollments)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/eventarc/advanced/docs/receive-events/create-enrollment)
   */
  def Enrollment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.eventarc.EnrollmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.eventarc.EnrollmentArgs.builder
    com.pulumi.gcp.eventarc.Enrollment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.eventarc.PipelineArgs.Builder)
    /**
     * @param destinations List of destinations to which messages will be forwarded. Currently,
     *  exactly one destination is supported per Pipeline.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.Builder]*):
        com.pulumi.gcp.eventarc.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param inputPayloadFormat Represents the format of message data.
     *  Structure is documented below.
     * @return builder
     */
    def inputPayloadFormat(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.Builder]):
        com.pulumi.gcp.eventarc.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.builder
      builder.inputPayloadFormat(args(argsBuilder).build)

    /**
     * @param loggingConfig The configuration for Platform Telemetry logging for Eventarc Advanced
     *  resources.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineLoggingConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param mediations List of mediation operations to be performed on the message. Currently,
     *  only one Transformation operation is allowed in each Pipeline.
     *  Structure is documented below.
     * @return builder
     */
    def mediations(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineMediationArgs.Builder]*):
        com.pulumi.gcp.eventarc.PipelineArgs.Builder =
      def argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineMediationArgs.builder
      builder.mediations(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy The retry policy configuration for the Pipeline. The pipeline
     *  exponentially backs off in case the destination is non responsive or
     *  returns a retryable error code. The default semantics are as follows:
     *  The backoff starts with a 5 second delay and doubles the
     *  delay after each failed attempt (10 seconds, 20 seconds, 40 seconds, etc.).
     *  The delay is capped at 60 seconds by default.
     *  Please note that if you set the minRetryDelay and maxRetryDelay fields
     *  to the same value this will make the duration between retries constant.
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineRetryPolicyArgs.Builder]):
        com.pulumi.gcp.eventarc.PipelineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.Builder)
    /**
     * @param cloudRunService Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
     *  Structure is documented below.
     * @return builder
     */
    def cloudRunService(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerDestinationCloudRunServiceArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerDestinationCloudRunServiceArgs.builder
      builder.cloudRunService(args(argsBuilder).build)

    /**
     * @param gke A GKE service capable of receiving events. The service should be running in the same project as the trigger.
     *  Structure is documented below.
     * @return builder
     */
    def gke(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerDestinationGkeArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerDestinationGkeArgs.builder
      builder.gke(args(argsBuilder).build)

    /**
     * @param httpEndpoint An HTTP endpoint destination described by an URI.
     *  Structure is documented below.
     * @return builder
     */
    def httpEndpoint(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerDestinationHttpEndpointArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerDestinationHttpEndpointArgs.builder
      builder.httpEndpoint(args(argsBuilder).build)

    /**
     * @param networkConfig Optional. Network config is used to configure how Eventarc resolves and connect to a destination. This should only be used with HttpEndpoint destination type.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerDestinationNetworkConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerDestinationNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.PipelineMediationArgs.Builder)
    /**
     * @param transformation Transformation defines the way to transform an incoming message.
     *  Structure is documented below.
     * @return builder
     */
    def transformation(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineMediationTransformationArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineMediationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineMediationTransformationArgs.builder
      builder.transformation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatArgs.Builder)
    /**
     * @param avro The format of an AVRO message payload.
     *  Structure is documented below.
     * @return builder
     */
    def avro(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatAvroArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatAvroArgs.builder
      builder.avro(args(argsBuilder).build)

    /**
     * @param json The format of a JSON message payload.
     * @return builder
     */
    def json(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatJsonArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatJsonArgs.builder
      builder.json(args(argsBuilder).build)

    /**
     * @param protobuf The format of a Protobuf message payload.
     *  Structure is documented below.
     * @return builder
     */
    def protobuf(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatProtobufArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatProtobufArgs.builder
      builder.protobuf(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs.Builder)
    /**
     * @param pubsub The Pub/Sub topic and subscription used by Eventarc as delivery intermediary.
     *  Structure is documented below.
     * @return builder
     */
    def pubsub(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerTransportPubsubArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerTransportPubsubArgs.builder
      builder.pubsub(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.TriggerState.Builder)
    /**
     * @param destination Required. Destination specifies where the events should be sent to.
     *  Structure is documented below.
     * @return builder
     */
    def destination(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerDestinationArgs.builder
      builder.destination(args(argsBuilder).build)

    /**
     * @param matchingCriterias Required. null The list of filters that applies to event attributes. Only events that match all the provided filters will be sent to the destination.
     *  Structure is documented below.
     * @return builder
     */
    def matchingCriterias(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs.Builder]*):
        com.pulumi.gcp.eventarc.inputs.TriggerState.Builder =
      def argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerMatchingCriteriaArgs.builder
      builder.matchingCriterias(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy The retry policy configuration for the Trigger.
     *  Can only be set with Cloud Run destinations.
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerRetryPolicyArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    /**
     * @param transport Optional. In order to deliver messages, Eventarc may use other GCP products as transport intermediary. This field contains a reference to that transport intermediary. This information can be used for debugging purposes.
     *  Structure is documented below.
     * @return builder
     */
    def transport(args: Endofunction[com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.TriggerState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.TriggerTransportArgs.builder
      builder.transport(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.Builder)
    /**
     * @param avro The format of an AVRO message payload.
     *  Structure is documented below.
     * @return builder
     */
    def avro(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatAvroArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatAvroArgs.builder
      builder.avro(args(argsBuilder).build)

    /**
     * @param json The format of a JSON message payload.
     * @return builder
     */
    def json(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatJsonArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatJsonArgs.builder
      builder.json(args(argsBuilder).build)

    /**
     * @param protobuf The format of a Protobuf message payload.
     *  Structure is documented below.
     * @return builder
     */
    def protobuf(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatProtobufArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatProtobufArgs.builder
      builder.protobuf(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.GoogleApiSourceState.Builder)
    /**
     * @param loggingConfig The configuration for Platform Telemetry logging for Eventarc Advanced
     *  resources.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.GoogleApiSourceLoggingConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.GoogleApiSourceState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.GoogleApiSourceLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.PipelineState.Builder)
    /**
     * @param destinations List of destinations to which messages will be forwarded. Currently,
     *  exactly one destination is supported per Pipeline.
     *  Structure is documented below.
     * @return builder
     */
    def destinations(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.Builder]*):
        com.pulumi.gcp.eventarc.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.builder
      builder.destinations(args.map(_(argsBuilder).build)*)

    /**
     * @param inputPayloadFormat Represents the format of message data.
     *  Structure is documented below.
     * @return builder
     */
    def inputPayloadFormat(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineInputPayloadFormatArgs.builder
      builder.inputPayloadFormat(args(argsBuilder).build)

    /**
     * @param loggingConfig The configuration for Platform Telemetry logging for Eventarc Advanced
     *  resources.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineLoggingConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param mediations List of mediation operations to be performed on the message. Currently,
     *  only one Transformation operation is allowed in each Pipeline.
     *  Structure is documented below.
     * @return builder
     */
    def mediations(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineMediationArgs.Builder]*):
        com.pulumi.gcp.eventarc.inputs.PipelineState.Builder =
      def argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineMediationArgs.builder
      builder.mediations(args.map(_(argsBuilder).build)*)

    /**
     * @param retryPolicy The retry policy configuration for the Pipeline. The pipeline
     *  exponentially backs off in case the destination is non responsive or
     *  returns a retryable error code. The default semantics are as follows:
     *  The backoff starts with a 5 second delay and doubles the
     *  delay after each failed attempt (10 seconds, 20 seconds, 40 seconds, etc.).
     *  The delay is capped at 60 seconds by default.
     *  Please note that if you set the minRetryDelay and maxRetryDelay fields
     *  to the same value this will make the duration between retries constant.
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineRetryPolicyArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigArgs.Builder)
    /**
     * @param googleOidc Represents a config used to authenticate with a Google OIDC token using
     *  a GCP service account. Use this authentication method to invoke your
     *  Cloud Run and Cloud Functions destinations or HTTP endpoints that
     *  support Google OIDC.
     *  Structure is documented below.
     * @return builder
     */
    def googleOidc(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigGoogleOidcArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigGoogleOidcArgs.builder
      builder.googleOidc(args(argsBuilder).build)

    /**
     * @param oauthToken Contains information needed for generating an
     *  [OAuth token](https://developers.google.com/identity/protocols/OAuth2).
     *  This type of authorization should generally only be used when calling
     *  Google APIs hosted on *.googleapis.com.
     *  Structure is documented below.
     * @return builder
     */
    def oauthToken(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigOauthTokenArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigOauthTokenArgs.builder
      builder.oauthToken(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.Builder)
    /**
     * @param authenticationConfig Represents a config used to authenticate message requests.
     *  Structure is documented below.
     * @return builder
     */
    def authenticationConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationAuthenticationConfigArgs.builder
      builder.authenticationConfig(args(argsBuilder).build)

    /**
     * @param httpEndpoint Represents a HTTP endpoint destination.
     *  Structure is documented below.
     * @return builder
     */
    def httpEndpoint(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationHttpEndpointArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationHttpEndpointArgs.builder
      builder.httpEndpoint(args(argsBuilder).build)

    /**
     * @param networkConfig Represents a network config to be used for destination resolution and
     *  connectivity.
     *  Structure is documented below.
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationNetworkConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param outputPayloadFormat Represents the format of message data.
     *  Structure is documented below.
     * @return builder
     */
    def outputPayloadFormat(args: Endofunction[com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.PipelineDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.PipelineDestinationOutputPayloadFormatArgs.builder
      builder.outputPayloadFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.eventarc.inputs.MessageBusState.Builder)
    /**
     * @param loggingConfig The configuration for Platform Telemetry logging for Eventarc Advanced
     *  resources.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.eventarc.inputs.MessageBusLoggingConfigArgs.Builder]):
        com.pulumi.gcp.eventarc.inputs.MessageBusState.Builder =
      val argsBuilder = com.pulumi.gcp.eventarc.inputs.MessageBusLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)
