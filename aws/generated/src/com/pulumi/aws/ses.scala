package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ses:
  /** Provides an SES receipt rule set resource. */
  def ReceiptRuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.ReceiptRuleSetArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.ReceiptRuleSetArgs.builder
    
    com.pulumi.aws.ses.ReceiptRuleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ses.ReceiptRuleArgs.Builder)
    /**
     * @param addHeaderActions A list of Add Header Action blocks. Documented below.
     * @return builder
     */
    def addHeaderActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.builder
      builder.addHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param bounceActions A list of Bounce Action blocks. Documented below.
     * @return builder
     */
    def bounceActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.builder
      builder.bounceActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaActions A list of Lambda Action blocks. Documented below.
     * @return builder
     */
    def lambdaActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.builder
      builder.lambdaActions(args.map(_(argsBuilder).build)*)

    /**
     * @param s3Actions A list of S3 Action blocks. Documented below.
     * @return builder
     */
    def s3Actions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.builder
      builder.s3Actions(args.map(_(argsBuilder).build)*)

    /**
     * @param snsActions A list of SNS Action blocks. Documented below.
     * @return builder
     */
    def snsActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.builder
      builder.snsActions(args.map(_(argsBuilder).build)*)

    /**
     * @param stopActions A list of Stop Action blocks. Documented below.
     * @return builder
     */
    def stopActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.builder
      builder.stopActions(args.map(_(argsBuilder).build)*)

    /**
     * @param workmailActions A list of WorkMail Action blocks. Documented below.
     * @return builder
     */
    def workmailActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.Builder]*):
        com.pulumi.aws.ses.ReceiptRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.builder
      builder.workmailActions(args.map(_(argsBuilder).build)*)

  /** Provides an SES domain identity resource */
  def DomainIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.DomainIdentityArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.DomainIdentityArgs.builder
    
    com.pulumi.aws.ses.DomainIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SES receipt filter resource */
  def ReceiptFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.ReceiptFilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ses.ReceiptFilterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ses.ReceiptFilter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing SES Identity Notification Topics */
  def IdentityNotificationTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.IdentityNotificationTopicArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.IdentityNotificationTopicArgs.builder
    
    com.pulumi.aws.ses.IdentityNotificationTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ses.EventDestinationArgs.Builder)
    /**
     * @param cloudwatchDestinations CloudWatch destination for the events
     * @return builder
     */
    def cloudwatchDestinations(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.Builder]*):
        com.pulumi.aws.ses.EventDestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.builder
      builder.cloudwatchDestinations(args.map(_(argsBuilder).build)*)

    /**
     * @param kinesisDestination Send the events to a kinesis firehose destination
     * @return builder
     */
    def kinesisDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.Builder]):
        com.pulumi.aws.ses.EventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.builder
      builder.kinesisDestination(args(argsBuilder).build)

    /**
     * @param snsDestination Send the events to an SNS Topic destination
     *  
     *  &gt; **NOTE:** You can specify `&#34;cloudwatchDestination&#34;` or `&#34;kinesisDestination&#34;` but not both
     * @return builder
     */
    def snsDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.ses.EventDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  /**
   * Provides an SES domain MAIL FROM resource.
   *  
   *  &gt; **NOTE:** For the MAIL FROM domain to be fully usable, this resource should be paired with the aws.ses.DomainIdentity resource. To validate the MAIL FROM domain, a DNS MX record is required. To pass SPF checks, a DNS TXT record may also be required. See the [Amazon SES MAIL FROM documentation](https://docs.aws.amazon.com/ses/latest/dg/mail-from.html) for more information.
   */
  def MailFrom(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.MailFromArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.MailFromArgs.builder
    
    com.pulumi.aws.ses.MailFrom(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SES email identity resource */
  def EmailIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.EmailIdentityArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.EmailIdentityArgs.builder
    
    com.pulumi.aws.ses.EmailIdentity(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SesFunctions = com.pulumi.aws.ses.SesFunctions
  object SesFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ses.SesFunctions.*
  extension (self: SesFunctions.type)
    /** Retrieve the active SES receipt rule set */
    def getActiveReceiptRuleSet(args: Endofunction[com.pulumi.aws.ses.inputs.GetActiveReceiptRuleSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ses.outputs.GetActiveReceiptRuleSetResult] =
      val argsBuilder = com.pulumi.aws.ses.inputs.GetActiveReceiptRuleSetArgs.builder
      com.pulumi.aws.ses.SesFunctions.getActiveReceiptRuleSet(args(argsBuilder).build)

    /** Retrieve the active SES receipt rule set */
    def getActiveReceiptRuleSetPlain(args: Endofunction[com.pulumi.aws.ses.inputs.GetActiveReceiptRuleSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ses.outputs.GetActiveReceiptRuleSetResult] =
      val argsBuilder = com.pulumi.aws.ses.inputs.GetActiveReceiptRuleSetPlainArgs.builder
      com.pulumi.aws.ses.SesFunctions.getActiveReceiptRuleSetPlain(args(argsBuilder).build)

    /** Retrieve the SES domain identity */
    def getDomainIdentity(args: Endofunction[com.pulumi.aws.ses.inputs.GetDomainIdentityArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ses.outputs.GetDomainIdentityResult] =
      val argsBuilder = com.pulumi.aws.ses.inputs.GetDomainIdentityArgs.builder
      com.pulumi.aws.ses.SesFunctions.getDomainIdentity(args(argsBuilder).build)

    /** Retrieve the SES domain identity */
    def getDomainIdentityPlain(args: Endofunction[com.pulumi.aws.ses.inputs.GetDomainIdentityPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ses.outputs.GetDomainIdentityResult] =
      val argsBuilder = com.pulumi.aws.ses.inputs.GetDomainIdentityPlainArgs.builder
      com.pulumi.aws.ses.SesFunctions.getDomainIdentityPlain(args(argsBuilder).build)

    /** Retrieve the active SES email identity */
    def getEmailIdentity(args: Endofunction[com.pulumi.aws.ses.inputs.GetEmailIdentityArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ses.outputs.GetEmailIdentityResult] =
      val argsBuilder = com.pulumi.aws.ses.inputs.GetEmailIdentityArgs.builder
      com.pulumi.aws.ses.SesFunctions.getEmailIdentity(args(argsBuilder).build)

    /** Retrieve the active SES email identity */
    def getEmailIdentityPlain(args: Endofunction[com.pulumi.aws.ses.inputs.GetEmailIdentityPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ses.outputs.GetEmailIdentityResult] =
      val argsBuilder = com.pulumi.aws.ses.inputs.GetEmailIdentityPlainArgs.builder
      com.pulumi.aws.ses.SesFunctions.getEmailIdentityPlain(args(argsBuilder).build)

  /** Manages a SES Identity Policy. More information about SES Sending Authorization Policies can be found in the [SES Developer Guide](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html). */
  def IdentityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.IdentityPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ses.IdentityPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ses.IdentityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SES receipt rule resource */
  def ReceiptRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.ReceiptRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ses.ReceiptRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ses.ReceiptRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an SES domain DKIM generation resource.
   *  
   *  Domain ownership needs to be confirmed first using sesDomainIdentity Resource
   */
  def DomainDkim(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.DomainDkimArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.DomainDkimArgs.builder
    
    com.pulumi.aws.ses.DomainDkim(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an SES event destination */
  def EventDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.EventDestinationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ses.EventDestinationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ses.EventDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ses.ConfigurationSetArgs.Builder)
    /**
     * @param deliveryOptions Whether messages that use the configuration set are required to use TLS. See below.
     * @return builder
     */
    def deliveryOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.ses.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions Domain that is used to redirect email recipients to an Amazon SES-operated domain. See below. **NOTE:** This functionality is best effort.
     * @return builder
     */
    def trackingOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.ses.ConfigurationSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)

  /** Provides an SES configuration set resource. */
  def ConfigurationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.ConfigurationSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ses.ConfigurationSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ses.ConfigurationSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to create a SES template. */
  def Template(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.TemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ses.TemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.ses.Template(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to designate the active SES receipt rule set */
  def ActiveReceiptRuleSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.ActiveReceiptRuleSetArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.ActiveReceiptRuleSetArgs.builder
    
    com.pulumi.aws.ses.ActiveReceiptRuleSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a successful verification of an SES domain identity.
   *  
   *  Most commonly, this resource is used together with `aws.route53.Record` and
   *  `aws.ses.DomainIdentity` to request an SES domain identity,
   *  deploy the required DNS verification records, and wait for verification to complete.
   *  
   *  &gt; **WARNING:** This resource implements a part of the verification workflow. It does not represent a real-world entity in AWS, therefore changing or deleting this resource on its own has no immediate effect.
   */
  def DomainIdentityVerification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ses.DomainIdentityVerificationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ses.DomainIdentityVerificationArgs.builder
    
    com.pulumi.aws.ses.DomainIdentityVerification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ses.inputs.EventDestinationState.Builder)
    /**
     * @param cloudwatchDestinations CloudWatch destination for the events
     * @return builder
     */
    def cloudwatchDestinations(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.Builder]*):
        com.pulumi.aws.ses.inputs.EventDestinationState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs.builder
      builder.cloudwatchDestinations(args.map(_(argsBuilder).build)*)

    /**
     * @param kinesisDestination Send the events to a kinesis firehose destination
     * @return builder
     */
    def kinesisDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.Builder]):
        com.pulumi.aws.ses.inputs.EventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs.builder
      builder.kinesisDestination(args(argsBuilder).build)

    /**
     * @param snsDestination Send the events to an SNS Topic destination
     *  
     *  &gt; **NOTE:** You can specify `&#34;cloudwatchDestination&#34;` or `&#34;kinesisDestination&#34;` but not both
     * @return builder
     */
    def snsDestination(args: Endofunction[com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.Builder]):
        com.pulumi.aws.ses.inputs.EventDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs.builder
      builder.snsDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder)
    /**
     * @param addHeaderActions A list of Add Header Action blocks. Documented below.
     * @return builder
     */
    def addHeaderActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleAddHeaderActionArgs.builder
      builder.addHeaderActions(args.map(_(argsBuilder).build)*)

    /**
     * @param bounceActions A list of Bounce Action blocks. Documented below.
     * @return builder
     */
    def bounceActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleBounceActionArgs.builder
      builder.bounceActions(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaActions A list of Lambda Action blocks. Documented below.
     * @return builder
     */
    def lambdaActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleLambdaActionArgs.builder
      builder.lambdaActions(args.map(_(argsBuilder).build)*)

    /**
     * @param s3Actions A list of S3 Action blocks. Documented below.
     * @return builder
     */
    def s3Actions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleS3ActionArgs.builder
      builder.s3Actions(args.map(_(argsBuilder).build)*)

    /**
     * @param snsActions A list of SNS Action blocks. Documented below.
     * @return builder
     */
    def snsActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleSnsActionArgs.builder
      builder.snsActions(args.map(_(argsBuilder).build)*)

    /**
     * @param stopActions A list of Stop Action blocks. Documented below.
     * @return builder
     */
    def stopActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleStopActionArgs.builder
      builder.stopActions(args.map(_(argsBuilder).build)*)

    /**
     * @param workmailActions A list of WorkMail Action blocks. Documented below.
     * @return builder
     */
    def workmailActions(args: Endofunction[com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.Builder]*):
        com.pulumi.aws.ses.inputs.ReceiptRuleState.Builder =
      def argsBuilder = com.pulumi.aws.ses.inputs.ReceiptRuleWorkmailActionArgs.builder
      builder.workmailActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ses.inputs.ConfigurationSetState.Builder)
    /**
     * @param deliveryOptions Whether messages that use the configuration set are required to use TLS. See below.
     * @return builder
     */
    def deliveryOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.Builder]):
        com.pulumi.aws.ses.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs.builder
      builder.deliveryOptions(args(argsBuilder).build)

    /**
     * @param trackingOptions Domain that is used to redirect email recipients to an Amazon SES-operated domain. See below. **NOTE:** This functionality is best effort.
     * @return builder
     */
    def trackingOptions(args: Endofunction[com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.Builder]):
        com.pulumi.aws.ses.inputs.ConfigurationSetState.Builder =
      val argsBuilder = com.pulumi.aws.ses.inputs.ConfigurationSetTrackingOptionsArgs.builder
      builder.trackingOptions(args(argsBuilder).build)
