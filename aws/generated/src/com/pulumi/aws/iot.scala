package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object iot:
  /** Provides an IoT role alias. */
  def RoleAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.RoleAliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.RoleAliasArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.RoleAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Adds an IoT Thing to an IoT Thing Group. */
  def ThingGroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.ThingGroupMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.ThingGroupMembershipArgs.builder
    
    com.pulumi.aws.iot.ThingGroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS IoT Thing Group. */
  def ThingGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.ThingGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.ThingGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.ThingGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iot.BillingGroupArgs.Builder)
    /**
     * @param properties The Billing Group properties. Defined below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.iot.inputs.BillingGroupPropertiesArgs.Builder]):
        com.pulumi.aws.iot.BillingGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.BillingGroupPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /** Creates and manages an AWS IoT domain configuration. */
  def DomainConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.DomainConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.DomainConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.DomainConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates and manages an AWS IoT Thing Type. */
  def ThingType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.ThingTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.ThingTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.ThingType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iot.TopicRuleDestinationArgs.Builder)
    /**
     * @param vpcConfiguration Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleDestinationVpcConfigurationArgs.Builder]):
        com.pulumi.aws.iot.TopicRuleDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleDestinationVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  /**
   * Manages IoT event configurations.
   *  
   *  &gt; **NOTE:** Deleting this resource does not disable the event configurations, the resource in simply removed from state instead.
   */
  def EventConfigurations(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.EventConfigurationsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.EventConfigurationsArgs.builder
    
    com.pulumi.aws.iot.EventConfigurations(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type IotFunctions = com.pulumi.aws.iot.IotFunctions
  object IotFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.iot.IotFunctions.*
  extension (self: IotFunctions.type)
    /** Returns a unique endpoint specific to the AWS account making the call. */
    def getEndpoint(args: Endofunction[com.pulumi.aws.iot.inputs.GetEndpointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iot.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.iot.inputs.GetEndpointArgs.builder
      com.pulumi.aws.iot.IotFunctions.getEndpoint(args(argsBuilder).build)

    /** Returns a unique endpoint specific to the AWS account making the call. */
    def getEndpointPlain(args: Endofunction[com.pulumi.aws.iot.inputs.GetEndpointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iot.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.iot.inputs.GetEndpointPlainArgs.builder
      com.pulumi.aws.iot.IotFunctions.getEndpointPlain(args(argsBuilder).build)

    /** Gets a registration code used to register a CA certificate with AWS IoT. */
    def getRegistrationCode(args: Endofunction[com.pulumi.aws.iot.inputs.GetRegistrationCodeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iot.outputs.GetRegistrationCodeResult] =
      val argsBuilder = com.pulumi.aws.iot.inputs.GetRegistrationCodeArgs.builder
      com.pulumi.aws.iot.IotFunctions.getRegistrationCode(args(argsBuilder).build)

    /** Gets a registration code used to register a CA certificate with AWS IoT. */
    def getRegistrationCodePlain(args: Endofunction[com.pulumi.aws.iot.inputs.GetRegistrationCodePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iot.outputs.GetRegistrationCodeResult] =
      val argsBuilder = com.pulumi.aws.iot.inputs.GetRegistrationCodePlainArgs.builder
      com.pulumi.aws.iot.IotFunctions.getRegistrationCodePlain(args(argsBuilder).build)

  /** Provides an IoT policy attachment. */
  def PolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.PolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.PolicyAttachmentArgs.builder
    
    com.pulumi.aws.iot.PolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates and manages an AWS IoT CA Certificate. */
  def CaCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.CaCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.CaCertificateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.CaCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS IoT Billing Group. */
  def BillingGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.BillingGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.BillingGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.BillingGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates and manages an AWS IoT Thing. */
  def Thing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.ThingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.ThingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.iot.Thing(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates and manages an AWS IoT certificate. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.CertificateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.CertificateArgs.builder
    
    com.pulumi.aws.iot.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * 
   */
  def TopicRuleDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.TopicRuleDestinationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.TopicRuleDestinationArgs.builder
    
    com.pulumi.aws.iot.TopicRuleDestination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates and manages an AWS IoT Authorizer. */
  def Authorizer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.AuthorizerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.AuthorizerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.Authorizer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iot.TopicRuleArgs.Builder)
    def cloudwatchAlarms(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleCloudwatchAlarmArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleCloudwatchAlarmArgs.builder
      builder.cloudwatchAlarms(args.map(_(argsBuilder).build)*)

    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleCloudwatchLogArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleCloudwatchLogArgs.builder
      builder.cloudwatchLogs(args.map(_(argsBuilder).build)*)

    def cloudwatchMetrics(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleCloudwatchMetricArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleCloudwatchMetricArgs.builder
      builder.cloudwatchMetrics(args.map(_(argsBuilder).build)*)

    def dynamodbs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleDynamodbArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleDynamodbArgs.builder
      builder.dynamodbs(args.map(_(argsBuilder).build)*)

    def dynamodbv2s(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args.builder
      builder.dynamodbv2s(args.map(_(argsBuilder).build)*)

    def elasticsearch(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleElasticsearchArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleElasticsearchArgs.builder
      builder.elasticsearch(args.map(_(argsBuilder).build)*)

    /**
     * @param errorAction Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchLogs`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `http`, `iotAnalytics`, `iotEvents`, `kafka`, `kinesis`, `lambda`, `republish`, `s3`, `sns`, `sqs`, `stepFunctions`, `timestream` configuration blocks for further configuration details.
     * @return builder
     */
    def errorAction(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder]):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.builder
      builder.errorAction(args(argsBuilder).build)

    def firehoses(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleFirehoseArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleFirehoseArgs.builder
      builder.firehoses(args.map(_(argsBuilder).build)*)

    def https(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleHttpArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleHttpArgs.builder
      builder.https(args.map(_(argsBuilder).build)*)

    def iotAnalytics(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleIotAnalyticArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleIotAnalyticArgs.builder
      builder.iotAnalytics(args.map(_(argsBuilder).build)*)

    def iotEvents(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleIotEventArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleIotEventArgs.builder
      builder.iotEvents(args.map(_(argsBuilder).build)*)

    def kafkas(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleKafkaArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleKafkaArgs.builder
      builder.kafkas(args.map(_(argsBuilder).build)*)

    def kineses(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleKinesisArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleKinesisArgs.builder
      builder.kineses(args.map(_(argsBuilder).build)*)

    def lambdas(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleLambdaArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleLambdaArgs.builder
      builder.lambdas(args.map(_(argsBuilder).build)*)

    def republishes(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleRepublishArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleRepublishArgs.builder
      builder.republishes(args.map(_(argsBuilder).build)*)

    def s3(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleS3Args.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleS3Args.builder
      builder.s3(args.map(_(argsBuilder).build)*)

    def sns(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleSnsArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleSnsArgs.builder
      builder.sns(args.map(_(argsBuilder).build)*)

    def sqs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleSqsArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleSqsArgs.builder
      builder.sqs(args.map(_(argsBuilder).build)*)

    def stepFunctions(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleStepFunctionArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleStepFunctionArgs.builder
      builder.stepFunctions(args.map(_(argsBuilder).build)*)

    def timestreams(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleTimestreamArgs.Builder]*):
        com.pulumi.aws.iot.TopicRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleTimestreamArgs.builder
      builder.timestreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.ThingTypeArgs.Builder)
    /**
     * @param properties , Configuration block that can contain the following properties of the thing type:
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.iot.inputs.ThingTypePropertiesArgs.Builder]):
        com.pulumi.aws.iot.ThingTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.ThingTypePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.ThingGroupArgs.Builder)
    /**
     * @param properties The Thing Group properties. Defined below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.iot.inputs.ThingGroupPropertiesArgs.Builder]):
        com.pulumi.aws.iot.ThingGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.ThingGroupPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /** Provides a resource to manage [default logging options](https://docs.aws.amazon.com/iot/latest/developerguide/configure-logging.html#configure-logging-console). */
  def LoggingOptions(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.LoggingOptionsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.LoggingOptionsArgs.builder
    
    com.pulumi.aws.iot.LoggingOptions(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an IoT fleet provisioning template. For more info, see the AWS documentation on [fleet provisioning](https://docs.aws.amazon.com/iot/latest/developerguide/provision-wo-cert.html). */
  def ProvisioningTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.ProvisioningTemplateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.ProvisioningTemplateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.ProvisioningTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Attaches Principal to AWS IoT Thing. */
  def ThingPrincipalAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.ThingPrincipalAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.ThingPrincipalAttachmentArgs.builder
    
    com.pulumi.aws.iot.ThingPrincipalAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iot.CaCertificateArgs.Builder)
    /**
     * @param registrationConfig Information about the registration configuration. See below.
     * @return builder
     */
    def registrationConfig(args: Endofunction[com.pulumi.aws.iot.inputs.CaCertificateRegistrationConfigArgs.Builder]):
        com.pulumi.aws.iot.CaCertificateArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.CaCertificateRegistrationConfigArgs.builder
      builder.registrationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.IndexingConfigurationArgs.Builder)
    /**
     * @param thingGroupIndexingConfiguration Thing group indexing configuration. See below.
     * @return builder
     */
    def thingGroupIndexingConfiguration(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs.Builder]):
        com.pulumi.aws.iot.IndexingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs.builder
      builder.thingGroupIndexingConfiguration(args(argsBuilder).build)

    /**
     * @param thingIndexingConfiguration Thing indexing configuration. See below.
     * @return builder
     */
    def thingIndexingConfiguration(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.Builder]):
        com.pulumi.aws.iot.IndexingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.builder
      builder.thingIndexingConfiguration(args(argsBuilder).build)

  /** Managing [IoT Thing indexing](https://docs.aws.amazon.com/iot/latest/developerguide/managing-index.html). */
  def IndexingConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.IndexingConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iot.IndexingConfigurationArgs.builder
    
    com.pulumi.aws.iot.IndexingConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iot.ProvisioningTemplateArgs.Builder)
    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template. Details below.
     * @return builder
     */
    def preProvisioningHook(args: Endofunction[com.pulumi.aws.iot.inputs.ProvisioningTemplatePreProvisioningHookArgs.Builder]):
        com.pulumi.aws.iot.ProvisioningTemplateArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.ProvisioningTemplatePreProvisioningHookArgs.builder
      builder.preProvisioningHook(args(argsBuilder).build)

  /** Creates and manages an AWS IoT topic rule. */
  def TopicRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.TopicRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.TopicRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.TopicRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IoT policy.
   *  
   *  &gt; **NOTE on policy versions:** Updating this resource creates a new, default policy version. If updating the resource would exceed the maximum number of versions (5), the oldest non-default version of the policy is deleted before the new policy version is created.
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iot.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iot.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iot.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iot.inputs.ThingTypeState.Builder)
    /**
     * @param properties , Configuration block that can contain the following properties of the thing type:
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.iot.inputs.ThingTypePropertiesArgs.Builder]):
        com.pulumi.aws.iot.inputs.ThingTypeState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.ThingTypePropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.IndexingConfigurationState.Builder)
    /**
     * @param thingGroupIndexingConfiguration Thing group indexing configuration. See below.
     * @return builder
     */
    def thingGroupIndexingConfiguration(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs.Builder]):
        com.pulumi.aws.iot.inputs.IndexingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs.builder
      builder.thingGroupIndexingConfiguration(args(argsBuilder).build)

    /**
     * @param thingIndexingConfiguration Thing indexing configuration. See below.
     * @return builder
     */
    def thingIndexingConfiguration(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.Builder]):
        com.pulumi.aws.iot.inputs.IndexingConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.builder
      builder.thingIndexingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamArgs.Builder)
    /**
     * @param dimensions Configuration blocks with metadata attributes of the time series that are written in each measure record. Nested arguments below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamDimensionArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param timestamp Configuration block specifying an application-defined value to replace the default value assigned to the Timestream record&#39;s timestamp in the time column. Nested arguments below.
     * @return builder
     */
    def timestamp(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamTimestampArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamTimestampArgs.builder
      builder.timestamp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleState.Builder)
    def cloudwatchAlarms(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleCloudwatchAlarmArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleCloudwatchAlarmArgs.builder
      builder.cloudwatchAlarms(args.map(_(argsBuilder).build)*)

    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleCloudwatchLogArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleCloudwatchLogArgs.builder
      builder.cloudwatchLogs(args.map(_(argsBuilder).build)*)

    def cloudwatchMetrics(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleCloudwatchMetricArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleCloudwatchMetricArgs.builder
      builder.cloudwatchMetrics(args.map(_(argsBuilder).build)*)

    def dynamodbs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleDynamodbArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleDynamodbArgs.builder
      builder.dynamodbs(args.map(_(argsBuilder).build)*)

    def dynamodbv2s(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args.builder
      builder.dynamodbv2s(args.map(_(argsBuilder).build)*)

    def elasticsearch(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleElasticsearchArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleElasticsearchArgs.builder
      builder.elasticsearch(args.map(_(argsBuilder).build)*)

    /**
     * @param errorAction Configuration block with error action to be associated with the rule. See the documentation for `cloudwatchAlarm`, `cloudwatchLogs`, `cloudwatchMetric`, `dynamodb`, `dynamodbv2`, `elasticsearch`, `firehose`, `http`, `iotAnalytics`, `iotEvents`, `kafka`, `kinesis`, `lambda`, `republish`, `s3`, `sns`, `sqs`, `stepFunctions`, `timestream` configuration blocks for further configuration details.
     * @return builder
     */
    def errorAction(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.builder
      builder.errorAction(args(argsBuilder).build)

    def firehoses(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleFirehoseArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleFirehoseArgs.builder
      builder.firehoses(args.map(_(argsBuilder).build)*)

    def https(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleHttpArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleHttpArgs.builder
      builder.https(args.map(_(argsBuilder).build)*)

    def iotAnalytics(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleIotAnalyticArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleIotAnalyticArgs.builder
      builder.iotAnalytics(args.map(_(argsBuilder).build)*)

    def iotEvents(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleIotEventArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleIotEventArgs.builder
      builder.iotEvents(args.map(_(argsBuilder).build)*)

    def kafkas(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleKafkaArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleKafkaArgs.builder
      builder.kafkas(args.map(_(argsBuilder).build)*)

    def kineses(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleKinesisArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleKinesisArgs.builder
      builder.kineses(args.map(_(argsBuilder).build)*)

    def lambdas(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleLambdaArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleLambdaArgs.builder
      builder.lambdas(args.map(_(argsBuilder).build)*)

    def republishes(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleRepublishArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleRepublishArgs.builder
      builder.republishes(args.map(_(argsBuilder).build)*)

    def s3(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleS3Args.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleS3Args.builder
      builder.s3(args.map(_(argsBuilder).build)*)

    def sns(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleSnsArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleSnsArgs.builder
      builder.sns(args.map(_(argsBuilder).build)*)

    def sqs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleSqsArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleSqsArgs.builder
      builder.sqs(args.map(_(argsBuilder).build)*)

    def stepFunctions(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleStepFunctionArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleStepFunctionArgs.builder
      builder.stepFunctions(args.map(_(argsBuilder).build)*)

    def timestreams(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleTimestreamArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleTimestreamArgs.builder
      builder.timestreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.DomainConfigurationState.Builder)
    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain. See the `authorizerConfig` Block below for details.
     * @return builder
     */
    def authorizerConfig(args: Endofunction[com.pulumi.aws.iot.inputs.DomainConfigurationAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.iot.inputs.DomainConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.DomainConfigurationAuthorizerConfigArgs.builder
      builder.authorizerConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain. See the `tlsConfig` Block below for details.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.iot.inputs.DomainConfigurationTlsConfigArgs.Builder]):
        com.pulumi.aws.iot.inputs.DomainConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.DomainConfigurationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.ThingGroupPropertiesArgs.Builder)
    /**
     * @param attributePayload The Thing Group attributes. Defined below.
     * @return builder
     */
    def attributePayload(args: Endofunction[com.pulumi.aws.iot.inputs.ThingGroupPropertiesAttributePayloadArgs.Builder]):
        com.pulumi.aws.iot.inputs.ThingGroupPropertiesArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.ThingGroupPropertiesAttributePayloadArgs.builder
      builder.attributePayload(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.BillingGroupState.Builder)
    def metadatas(args: Endofunction[com.pulumi.aws.iot.inputs.BillingGroupMetadataArgs.Builder]*):
        com.pulumi.aws.iot.inputs.BillingGroupState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.BillingGroupMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param properties The Billing Group properties. Defined below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.iot.inputs.BillingGroupPropertiesArgs.Builder]):
        com.pulumi.aws.iot.inputs.BillingGroupState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.BillingGroupPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs.Builder)
    /**
     * @param customFields A list of thing group fields to index. This list cannot contain any managed fields. See below.
     * @return builder
     */
    def customFields(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationCustomFieldArgs.Builder]*):
        com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationCustomFieldArgs.builder
      builder.customFields(args.map(_(argsBuilder).build)*)

    /**
     * @param managedFields Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
     * @return builder
     */
    def managedFields(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationManagedFieldArgs.Builder]*):
        com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingGroupIndexingConfigurationManagedFieldArgs.builder
      builder.managedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleTimestreamArgs.Builder)
    /**
     * @param dimensions Configuration blocks with metadata attributes of the time series that are written in each measure record. Nested arguments below.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleTimestreamDimensionArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleTimestreamArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleTimestreamDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param timestamp Configuration block specifying an application-defined value to replace the default value assigned to the Timestream record&#39;s timestamp in the time column. Nested arguments below.
     * @return builder
     */
    def timestamp(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleTimestreamTimestampArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleTimestreamArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleTimestreamTimestampArgs.builder
      builder.timestamp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.Builder)
    /**
     * @param customFields Contains custom field names and their data type. See below.
     * @return builder
     */
    def customFields(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs.Builder]*):
        com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs.builder
      builder.customFields(args.map(_(argsBuilder).build)*)

    /**
     * @param filter Required if `namedShadowIndexingMode` is `ON`. Enables to add named shadows filtered by `filter` to fleet indexing configuration.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationFilterArgs.Builder]):
        com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param managedFields Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
     * @return builder
     */
    def managedFields(args: Endofunction[com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationManagedFieldArgs.Builder]*):
        com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationManagedFieldArgs.builder
      builder.managedFields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleErrorActionKafkaArgs.Builder)
    /**
     * @param headers The list of Kafka headers that you specify. Nested arguments below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionKafkaHeaderArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionKafkaArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionKafkaHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.ThingGroupMetadataArgs.Builder)
    def rootToParentGroups(args: Endofunction[com.pulumi.aws.iot.inputs.ThingGroupMetadataRootToParentGroupArgs.Builder]*):
        com.pulumi.aws.iot.inputs.ThingGroupMetadataArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.ThingGroupMetadataRootToParentGroupArgs.builder
      builder.rootToParentGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleHttpArgs.Builder)
    /**
     * @param httpHeaders Custom HTTP header IoT Core should send. It is possible to define more than one custom header.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleHttpHttpHeaderArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleHttpArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleHttpHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder)
    def cloudwatchAlarm(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchAlarmArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchAlarmArgs.builder
      builder.cloudwatchAlarm(args(argsBuilder).build)

    def cloudwatchLogs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchLogsArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchLogsArgs.builder
      builder.cloudwatchLogs(args(argsBuilder).build)

    def cloudwatchMetric(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchMetricArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionCloudwatchMetricArgs.builder
      builder.cloudwatchMetric(args(argsBuilder).build)

    def dynamodb(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbArgs.builder
      builder.dynamodb(args(argsBuilder).build)

    def dynamodbv2(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2Args.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2Args.builder
      builder.dynamodbv2(args(argsBuilder).build)

    def elasticsearch(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionElasticsearchArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionElasticsearchArgs.builder
      builder.elasticsearch(args(argsBuilder).build)

    def firehose(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionFirehoseArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionFirehoseArgs.builder
      builder.firehose(args(argsBuilder).build)

    def http(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionHttpArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionHttpArgs.builder
      builder.http(args(argsBuilder).build)

    def iotAnalytics(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionIotAnalyticsArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionIotAnalyticsArgs.builder
      builder.iotAnalytics(args(argsBuilder).build)

    def iotEvents(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionIotEventsArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionIotEventsArgs.builder
      builder.iotEvents(args(argsBuilder).build)

    def kafka(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionKafkaArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionKafkaArgs.builder
      builder.kafka(args(argsBuilder).build)

    def kinesis(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionKinesisArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionKinesisArgs.builder
      builder.kinesis(args(argsBuilder).build)

    def lambda(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionLambdaArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionLambdaArgs.builder
      builder.lambda(args(argsBuilder).build)

    def republish(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionRepublishArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionRepublishArgs.builder
      builder.republish(args(argsBuilder).build)

    def s3(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionS3Args.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionS3Args.builder
      builder.s3(args(argsBuilder).build)

    def sns(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionSnsArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionSnsArgs.builder
      builder.sns(args(argsBuilder).build)

    def sqs(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionSqsArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionSqsArgs.builder
      builder.sqs(args(argsBuilder).build)

    def stepFunctions(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionStepFunctionsArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionStepFunctionsArgs.builder
      builder.stepFunctions(args(argsBuilder).build)

    def timestream(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionTimestreamArgs.builder
      builder.timestream(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleDestinationState.Builder)
    /**
     * @param vpcConfiguration Configuration of the virtual private cloud (VPC) connection. For more info, see the [AWS documentation](https://docs.aws.amazon.com/iot/latest/developerguide/vpc-rule-action.html).
     * @return builder
     */
    def vpcConfiguration(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleDestinationVpcConfigurationArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleDestinationState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleDestinationVpcConfigurationArgs.builder
      builder.vpcConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args.Builder)
    /**
     * @param putItem Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * @return builder
     */
    def putItem(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2PutItemArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2Args.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleDynamodbv2PutItemArgs.builder
      builder.putItem(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleErrorActionHttpArgs.Builder)
    /**
     * @param httpHeaders Custom HTTP header IoT Core should send. It is possible to define more than one custom header.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionHttpHttpHeaderArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionHttpArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionHttpHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.ProvisioningTemplateState.Builder)
    /**
     * @param preProvisioningHook Creates a pre-provisioning hook template. Details below.
     * @return builder
     */
    def preProvisioningHook(args: Endofunction[com.pulumi.aws.iot.inputs.ProvisioningTemplatePreProvisioningHookArgs.Builder]):
        com.pulumi.aws.iot.inputs.ProvisioningTemplateState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.ProvisioningTemplatePreProvisioningHookArgs.builder
      builder.preProvisioningHook(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.ThingGroupState.Builder)
    def metadatas(args: Endofunction[com.pulumi.aws.iot.inputs.ThingGroupMetadataArgs.Builder]*):
        com.pulumi.aws.iot.inputs.ThingGroupState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.ThingGroupMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param properties The Thing Group properties. Defined below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.aws.iot.inputs.ThingGroupPropertiesArgs.Builder]):
        com.pulumi.aws.iot.inputs.ThingGroupState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.ThingGroupPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2Args.Builder)
    /**
     * @param putItem Configuration block with DynamoDB Table to which the message will be written. Nested arguments below.
     * @return builder
     */
    def putItem(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2PutItemArgs.Builder]):
        com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2Args.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleErrorActionDynamodbv2PutItemArgs.builder
      builder.putItem(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iot.inputs.CaCertificateState.Builder)
    /**
     * @param registrationConfig Information about the registration configuration. See below.
     * @return builder
     */
    def registrationConfig(args: Endofunction[com.pulumi.aws.iot.inputs.CaCertificateRegistrationConfigArgs.Builder]):
        com.pulumi.aws.iot.inputs.CaCertificateState.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.CaCertificateRegistrationConfigArgs.builder
      builder.registrationConfig(args(argsBuilder).build)

    /**
     * @param validities When the CA certificate is valid.
     * @return builder
     */
    def validities(args: Endofunction[com.pulumi.aws.iot.inputs.CaCertificateValidityArgs.Builder]*):
        com.pulumi.aws.iot.inputs.CaCertificateState.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.CaCertificateValidityArgs.builder
      builder.validities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.inputs.TopicRuleKafkaArgs.Builder)
    /**
     * @param headers The list of Kafka headers that you specify. Nested arguments below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.aws.iot.inputs.TopicRuleKafkaHeaderArgs.Builder]*):
        com.pulumi.aws.iot.inputs.TopicRuleKafkaArgs.Builder =
      def argsBuilder = com.pulumi.aws.iot.inputs.TopicRuleKafkaHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iot.DomainConfigurationArgs.Builder)
    /**
     * @param authorizerConfig An object that specifies the authorization service for a domain. See the `authorizerConfig` Block below for details.
     * @return builder
     */
    def authorizerConfig(args: Endofunction[com.pulumi.aws.iot.inputs.DomainConfigurationAuthorizerConfigArgs.Builder]):
        com.pulumi.aws.iot.DomainConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.DomainConfigurationAuthorizerConfigArgs.builder
      builder.authorizerConfig(args(argsBuilder).build)

    /**
     * @param tlsConfig An object that specifies the TLS configuration for a domain. See the `tlsConfig` Block below for details.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.iot.inputs.DomainConfigurationTlsConfigArgs.Builder]):
        com.pulumi.aws.iot.DomainConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.iot.inputs.DomainConfigurationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)
