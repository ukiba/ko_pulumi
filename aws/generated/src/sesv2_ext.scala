package jp.ukiba.ko_pulumi
package aws

object sesv2_ext:
  extension (builder: com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder)
    /**
     * @param dashboardAttributes Additional settings for your VDM configuration as applicable to the Dashboard.
     * @return builder
     */
    def dashboardAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.builder
      builder.dashboardAttributes(args(argsBuilder).build)

    /**
     * @param guardianAttributes Additional settings for your VDM configuration as applicable to the Guardian.
     * @return builder
     */
    def guardianAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.builder
      builder.guardianAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder)
    /**
     * @param deliveryOptions Object that defines the dedicated IP pool that is used to send emails that you send using the configuration set. See `deliveryOptions` Block for details.
     * @return builder
     */
    def deliveryOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param reputationOptions Object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set. See `reputationOptions` Block for details.
     * @return builder
     */
    def reputationOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.builder
      builder.reputationOptions(args(argsBuilder).build)

    /**
     * @param sendingOptions Object that defines whether or not Amazon SES can send email that you send using the configuration set. See `sendingOptions` Block for details.
     * @return builder
     */
    def sendingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.builder
      builder.sendingOptions(args(argsBuilder).build)

    /**
     * @param suppressionOptions Object that contains information about the suppression list preferences for your account. See `suppressionOptions` Block for details.
     * @return builder
     */
    def suppressionOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.builder
      builder.suppressionOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions Object that defines the open and click tracking options for emails that you send using the configuration set. See `trackingOptions` Block for details.
     * @return builder
     */
    def trackingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)

    /**
     * @param vdmOptions Object that defines the VDM settings that apply to emails that you send using the configuration set. See `vdmOptions` Block for details.
     * @return builder
     */
    def vdmOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.builder
      builder.vdmOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.Builder)
    /**
     * @param eventDestination Object that defines the event destination. See `eventDestination` Block for details.
     * @return builder
     */
    def eventDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.builder
      builder.eventDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.ContactListArgs.Builder)
    /**
     * @param topics Configuration block(s) with topic for the contact list. Detailed below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.aws.sesv2.inputs.ContactListTopicArgs.Builder]*):
        com.pulumi.aws.sesv2.ContactListArgs.Builder =
      def argsBuilder = com.pulumi.aws.sesv2.inputs.ContactListTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sesv2.EmailIdentityArgs.Builder)
    /**
     * @param dkimSigningAttributes Configuration block for the DKIM authentication settings for an email domain identity. See `dkimSigningAttributes` Block below.
     * @return builder
     */
    def dkimSigningAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.EmailIdentityArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.builder
      builder.dkimSigningAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.MultiRegionEndpointArgs.Builder)
    /**
     * @param details Configuration details for the endpoint. See `details` Block below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsArgs.Builder]):
        com.pulumi.aws.sesv2.MultiRegionEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsArgs.builder
      builder.details(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.sesv2.inputs.MultiRegionEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.sesv2.MultiRegionEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.MultiRegionEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.AccountVdmAttributesState.Builder)
    /**
     * @param dashboardAttributes Additional settings for your VDM configuration as applicable to the Dashboard.
     * @return builder
     */
    def dashboardAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.AccountVdmAttributesState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.builder
      builder.dashboardAttributes(args(argsBuilder).build)

    /**
     * @param guardianAttributes Additional settings for your VDM configuration as applicable to the Guardian.
     * @return builder
     */
    def guardianAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.AccountVdmAttributesState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.builder
      builder.guardianAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder)
    /**
     * @param cloudWatchDestination Object that defines an Amazon CloudWatch destination for email events. See `cloudWatchDestination` Block for details.
     * @return builder
     */
    def cloudWatchDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.builder
      builder.cloudWatchDestination(args(argsBuilder).build)

    /**
     * @param eventBridgeDestination Object that defines an Amazon EventBridge destination for email events. You can use Amazon EventBridge to send notifications when certain email events occur. See `eventBridgeDestination` Block for details.
     * @return builder
     */
    def eventBridgeDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationEventBridgeDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationEventBridgeDestinationArgs.builder
      builder.eventBridgeDestination(args(argsBuilder).build)

    /**
     * @param kinesisFirehoseDestination Object that defines an Amazon Kinesis Data Firehose destination for email events. See `kinesisFirehoseDestination` Block for details.
     * @return builder
     */
    def kinesisFirehoseDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs.builder
      builder.kinesisFirehoseDestination(args(argsBuilder).build)

    /**
     * @param pinpointDestination Object that defines an AWS End User Messaging project destination for email events. See `pinpointDestination` Block for details.
     * @return builder
     */
    def pinpointDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs.builder
      builder.pinpointDestination(args(argsBuilder).build)

    /**
     * @param snsDestination Object that defines an Amazon SNS destination for email events. See `snsDestination` Block for details.
     * @return builder
     */
    def snsDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.Builder)
    /**
     * @param dimensionConfigurations Array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See `dimensionConfiguration` Block for details.
     * @return builder
     */
    def dimensionConfigurations(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs.Builder]*):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs.builder
      builder.dimensionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationState.Builder)
    /**
     * @param eventDestination Object that defines the event destination. See `eventDestination` Block for details.
     * @return builder
     */
    def eventDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.builder
      builder.eventDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder)
    /**
     * @param deliveryOptions Object that defines the dedicated IP pool that is used to send emails that you send using the configuration set. See `deliveryOptions` Block for details.
     * @return builder
     */
    def deliveryOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param reputationOptions Object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set. See `reputationOptions` Block for details.
     * @return builder
     */
    def reputationOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.builder
      builder.reputationOptions(args(argsBuilder).build)

    /**
     * @param sendingOptions Object that defines whether or not Amazon SES can send email that you send using the configuration set. See `sendingOptions` Block for details.
     * @return builder
     */
    def sendingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.builder
      builder.sendingOptions(args(argsBuilder).build)

    /**
     * @param suppressionOptions Object that contains information about the suppression list preferences for your account. See `suppressionOptions` Block for details.
     * @return builder
     */
    def suppressionOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.builder
      builder.suppressionOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions Object that defines the open and click tracking options for emails that you send using the configuration set. See `trackingOptions` Block for details.
     * @return builder
     */
    def trackingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)

    /**
     * @param vdmOptions Object that defines the VDM settings that apply to emails that you send using the configuration set. See `vdmOptions` Block for details.
     * @return builder
     */
    def vdmOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.builder
      builder.vdmOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder)
    /**
     * @param dashboardOptions Additional settings for your VDM configuration as applicable to the Dashboard. See `dashboardOptions` Block for details.
     * @return builder
     */
    def dashboardOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsDashboardOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsDashboardOptionsArgs.builder
      builder.dashboardOptions(args(argsBuilder).build)

    /**
     * @param guardianOptions Additional settings for your VDM configuration as applicable to the Guardian. See `guardianOptions` Block for details.
     * @return builder
     */
    def guardianOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsGuardianOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsGuardianOptionsArgs.builder
      builder.guardianOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ContactListState.Builder)
    /**
     * @param topics Configuration block(s) with topic for the contact list. Detailed below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.aws.sesv2.inputs.ContactListTopicArgs.Builder]*):
        com.pulumi.aws.sesv2.inputs.ContactListState.Builder =
      def argsBuilder = com.pulumi.aws.sesv2.inputs.ContactListTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sesv2.inputs.EmailIdentityState.Builder)
    /**
     * @param dkimSigningAttributes Configuration block for the DKIM authentication settings for an email domain identity. See `dkimSigningAttributes` Block below.
     * @return builder
     */
    def dkimSigningAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.EmailIdentityState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.builder
      builder.dkimSigningAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsArgs.Builder)
    /**
     * @param routesDetails Secondary region route configuration. See `routesDetails` Block below.
     * @return builder
     */
    def routesDetails(args: Endofunction[com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsRoutesDetailsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsRoutesDetailsArgs.builder
      builder.routesDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.MultiRegionEndpointState.Builder)
    /**
     * @param details Configuration details for the endpoint. See `details` Block below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.MultiRegionEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.MultiRegionEndpointDetailsArgs.builder
      builder.details(args(argsBuilder).build)

    /**
     * @param routes List of active routes. See `routes` Block below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.sesv2.inputs.MultiRegionEndpointRouteArgs.Builder]*):
        com.pulumi.aws.sesv2.inputs.MultiRegionEndpointState.Builder =
      def argsBuilder = com.pulumi.aws.sesv2.inputs.MultiRegionEndpointRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.sesv2.inputs.MultiRegionEndpointTimeoutsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.MultiRegionEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.MultiRegionEndpointTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
