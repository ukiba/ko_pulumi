package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object sesv2:
  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity Feedback Attributes. */
  def EmailIdentityFeedbackAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityFeedbackAttributesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sesv2.EmailIdentityFeedbackAttributesArgs.builder
    
    com.pulumi.aws.sesv2.EmailIdentityFeedbackAttributes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sesv2.EmailIdentityArgs.Builder)
    /**
     * @param dkimSigningAttributes The configuration of the DKIM authentication settings for an email domain identity.
     * @return builder
     */
    def dkimSigningAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.EmailIdentityArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.builder
      builder.dkimSigningAttributes(args(argsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool. */
  def DedicatedIpPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.DedicatedIpPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.DedicatedIpPoolArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sesv2.DedicatedIpPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.Builder)
    /**
     * @param eventDestination A name that identifies the event destination within the configuration set.
     * @return builder
     */
    def eventDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.builder
      builder.eventDestination(args(argsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity. */
  def EmailIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.EmailIdentityArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sesv2.EmailIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Assignment.
   *  
   *  This resource is used with &#34;Standard&#34; dedicated IP addresses. This includes addresses [requested and relinquished manually](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-case.html) via an AWS support case, or [Bring Your Own IP](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-byo.html) addresses. Once no longer assigned, this resource returns the IP to the [`ses-default-dedicated-pool`](https://docs.aws.amazon.com/ses/latest/dg/managing-ip-pools.html), managed by AWS.
   */
  def DedicatedIpAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.DedicatedIpAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sesv2.DedicatedIpAssignmentArgs.builder
    
    com.pulumi.aws.sesv2.DedicatedIpAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sesv2.ContactListArgs.Builder)
    /**
     * @param topics Configuration block(s) with topic for the contact list. Detailed below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.aws.sesv2.inputs.ContactListTopicArgs.Builder]*):
        com.pulumi.aws.sesv2.ContactListArgs.Builder =
      def argsBuilder = com.pulumi.aws.sesv2.inputs.ContactListTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  /** Manages AWS SESv2 (Simple Email V2) account-level suppression attributes. */
  def AccountSuppressionAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.AccountSuppressionAttributesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sesv2.AccountSuppressionAttributesArgs.builder
    
    com.pulumi.aws.sesv2.AccountSuppressionAttributes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set Event Destination. */
  def ConfigurationSetEventDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.builder
    
    com.pulumi.aws.sesv2.ConfigurationSetEventDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes. */
  def EmailIdentityMailFromAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityMailFromAttributesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sesv2.EmailIdentityMailFromAttributesArgs.builder
    
    com.pulumi.aws.sesv2.EmailIdentityMailFromAttributes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder)
    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set. See `deliveryOptions` Block for details.
     * @return builder
     */
    def deliveryOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set. See `reputationOptions` Block for details.
     * @return builder
     */
    def reputationOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.builder
      builder.reputationOptions(args(argsBuilder).build)

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that you send using the configuration set. See `sendingOptions` Block for details.
     * @return builder
     */
    def sendingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.builder
      builder.sendingOptions(args(argsBuilder).build)

    /**
     * @param suppressionOptions An object that contains information about the suppression list preferences for your account. See `suppressionOptions` Block for details.
     * @return builder
     */
    def suppressionOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.builder
      builder.suppressionOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails that you send using the configuration set. See `trackingOptions` Block for details.
     * @return builder
     */
    def trackingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)

    /**
     * @param vdmOptions An object that defines the VDM settings that apply to emails that you send using the configuration set. See `vdmOptions` Block for details.
     * @return builder
     */
    def vdmOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.builder
      builder.vdmOptions(args(argsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Contact List. */
  def ContactList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.ContactListArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.ContactListArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sesv2.ContactList(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type Sesv2Functions = com.pulumi.aws.sesv2.Sesv2Functions
  object Sesv2Functions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.sesv2.Sesv2Functions.*
  extension (self: Sesv2Functions.type)
    /** Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set. */
    def getConfigurationSet(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetConfigurationSetResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getConfigurationSet(args(argsBuilder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set. */
    def getConfigurationSetPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetConfigurationSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetConfigurationSetResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetConfigurationSetPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getConfigurationSetPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool. */
    def getDedicatedIpPool(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetDedicatedIpPoolResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getDedicatedIpPool(args(argsBuilder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool. */
    def getDedicatedIpPoolPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetDedicatedIpPoolResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getDedicatedIpPoolPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity. */
    def getEmailIdentity(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetEmailIdentityResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentity(args(argsBuilder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity. */
    def getEmailIdentityPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetEmailIdentityResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentityPlain(args(argsBuilder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes. */
    def getEmailIdentityMailFromAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetEmailIdentityMailFromAttributesResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentityMailFromAttributes(args(argsBuilder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes. */
    def getEmailIdentityMailFromAttributesPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetEmailIdentityMailFromAttributesResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentityMailFromAttributesPlain(args(argsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set. */
  def ConfigurationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.ConfigurationSetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.sesv2.ConfigurationSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity Policy. */
  def EmailIdentityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sesv2.EmailIdentityPolicyArgs.builder
    
    com.pulumi.aws.sesv2.EmailIdentityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder)
    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * @return builder
     */
    def dashboardAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.builder
      builder.dashboardAttributes(args(argsBuilder).build)

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * @return builder
     */
    def guardianAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.builder
      builder.guardianAttributes(args(argsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Account VDM Attributes. */
  def AccountVdmAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.sesv2.AccountVdmAttributesArgs.builder
    
    com.pulumi.aws.sesv2.AccountVdmAttributes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.Builder)
    /**
     * @param dimensionConfigurations An array of objects that define the dimensions to use when you send email events to Amazon CloudWatch. See `dimensionConfiguration` Block for details.
     * @return builder
     */
    def dimensionConfigurations(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs.Builder]*):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs.builder
      builder.dimensionConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.sesv2.inputs.EmailIdentityState.Builder)
    /**
     * @param dkimSigningAttributes The configuration of the DKIM authentication settings for an email domain identity.
     * @return builder
     */
    def dkimSigningAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.EmailIdentityState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.EmailIdentityDkimSigningAttributesArgs.builder
      builder.dkimSigningAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationState.Builder)
    /**
     * @param eventDestination A name that identifies the event destination within the configuration set.
     * @return builder
     */
    def eventDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.builder
      builder.eventDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder)
    /**
     * @param cloudWatchDestination An object that defines an Amazon CloudWatch destination for email events. See `cloudWatchDestination` Block for details.
     * @return builder
     */
    def cloudWatchDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs.builder
      builder.cloudWatchDestination(args(argsBuilder).build)

    /**
     * @param eventBridgeDestination An object that defines an Amazon EventBridge destination for email events. You can use Amazon EventBridge to send notifications when certain email events occur. See `eventBridgeDestination` Block for details.
     * @return builder
     */
    def eventBridgeDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationEventBridgeDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationEventBridgeDestinationArgs.builder
      builder.eventBridgeDestination(args(argsBuilder).build)

    /**
     * @param kinesisFirehoseDestination An object that defines an Amazon Kinesis Data Firehose destination for email events. See `kinesisFirehoseDestination` Block for details.
     * @return builder
     */
    def kinesisFirehoseDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs.builder
      builder.kinesisFirehoseDestination(args(argsBuilder).build)

    /**
     * @param pinpointDestination An object that defines an Amazon Pinpoint project destination for email events. See `pinpointDestination` Block for details.
     * @return builder
     */
    def pinpointDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs.builder
      builder.pinpointDestination(args(argsBuilder).build)

    /**
     * @param snsDestination An object that defines an Amazon SNS destination for email events. See `snsDestination` Block for details.
     * @return builder
     */
    def snsDestination(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder)
    /**
     * @param deliveryOptions An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set. See `deliveryOptions` Block for details.
     * @return builder
     */
    def deliveryOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param reputationOptions An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set. See `reputationOptions` Block for details.
     * @return builder
     */
    def reputationOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetReputationOptionsArgs.builder
      builder.reputationOptions(args(argsBuilder).build)

    /**
     * @param sendingOptions An object that defines whether or not Amazon SES can send email that you send using the configuration set. See `sendingOptions` Block for details.
     * @return builder
     */
    def sendingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSendingOptionsArgs.builder
      builder.sendingOptions(args(argsBuilder).build)

    /**
     * @param suppressionOptions An object that contains information about the suppression list preferences for your account. See `suppressionOptions` Block for details.
     * @return builder
     */
    def suppressionOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetSuppressionOptionsArgs.builder
      builder.suppressionOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions An object that defines the open and click tracking options for emails that you send using the configuration set. See `trackingOptions` Block for details.
     * @return builder
     */
    def trackingOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)

    /**
     * @param vdmOptions An object that defines the VDM settings that apply to emails that you send using the configuration set. See `vdmOptions` Block for details.
     * @return builder
     */
    def vdmOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.builder
      builder.vdmOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.AccountVdmAttributesState.Builder)
    /**
     * @param dashboardAttributes Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * @return builder
     */
    def dashboardAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.AccountVdmAttributesState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesDashboardAttributesArgs.builder
      builder.dashboardAttributes(args(argsBuilder).build)

    /**
     * @param guardianAttributes Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * @return builder
     */
    def guardianAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.AccountVdmAttributesState.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.AccountVdmAttributesGuardianAttributesArgs.builder
      builder.guardianAttributes(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder)
    /**
     * @param dashboardOptions Specifies additional settings for your VDM configuration as applicable to the Dashboard. See `dashboardOptions` Block for details.
     * @return builder
     */
    def dashboardOptions(args: Endofunction[com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsDashboardOptionsArgs.Builder]):
        com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.ConfigurationSetVdmOptionsDashboardOptionsArgs.builder
      builder.dashboardOptions(args(argsBuilder).build)

    /**
     * @param guardianOptions Specifies additional settings for your VDM configuration as applicable to the Guardian. See `guardianOptions` Block for details.
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
