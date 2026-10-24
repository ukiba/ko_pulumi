package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object sesv2:
  /** Manages AWS SESv2 (Simple Email V2) account-level suppression attributes. */
  inline def AccountSuppressionAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.AccountSuppressionAttributesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.AccountSuppressionAttributesArgs.builder
    com.pulumi.aws.sesv2.AccountSuppressionAttributes(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Account VDM Attributes. */
  inline def AccountVdmAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.AccountVdmAttributesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.AccountVdmAttributesArgs.builder
    com.pulumi.aws.sesv2.AccountVdmAttributes(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set. */
  inline def ConfigurationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.ConfigurationSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.ConfigurationSetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sesv2.ConfigurationSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set Event Destination. */
  inline def ConfigurationSetEventDestination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.ConfigurationSetEventDestinationArgs.builder
    com.pulumi.aws.sesv2.ConfigurationSetEventDestination(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Contact List. */
  inline def ContactList(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.ContactListArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.ContactListArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sesv2.ContactList(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Assignment.
   * 
   * This resource is used with &#34;Standard&#34; dedicated IP addresses. This includes addresses [requested and relinquished manually](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-case.html) via an AWS support case, or [Bring Your Own IP](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-byo.html) addresses. Once no longer assigned, this resource returns the IP to the [`ses-default-dedicated-pool`](https://docs.aws.amazon.com/ses/latest/dg/managing-ip-pools.html), managed by AWS.
   */
  inline def DedicatedIpAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.DedicatedIpAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.DedicatedIpAssignmentArgs.builder
    com.pulumi.aws.sesv2.DedicatedIpAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool. */
  inline def DedicatedIpPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.DedicatedIpPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.DedicatedIpPoolArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sesv2.DedicatedIpPool(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity. */
  inline def EmailIdentity(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.EmailIdentityArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sesv2.EmailIdentity(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity Feedback Attributes. */
  inline def EmailIdentityFeedbackAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityFeedbackAttributesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.EmailIdentityFeedbackAttributesArgs.builder
    com.pulumi.aws.sesv2.EmailIdentityFeedbackAttributes(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes. */
  inline def EmailIdentityMailFromAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityMailFromAttributesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.EmailIdentityMailFromAttributesArgs.builder
    com.pulumi.aws.sesv2.EmailIdentityMailFromAttributes(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SESv2 (Simple Email V2) Email Identity Policy. */
  inline def EmailIdentityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.EmailIdentityPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.EmailIdentityPolicyArgs.builder
    com.pulumi.aws.sesv2.EmailIdentityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS SESv2 (Simple Email V2) Multi Region Endpoint (global endpoint). Traffic is split equally between the primary region (where the resource is created) and the secondary region specified in the `details` block. */
  inline def MultiRegionEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.MultiRegionEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.MultiRegionEndpointArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sesv2.MultiRegionEndpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object Sesv2Functions:
    /** Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set. */
    inline def getConfigurationSet(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetConfigurationSetResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetConfigurationSetArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getConfigurationSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Configuration Set. */
    inline def getConfigurationSetPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetConfigurationSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetConfigurationSetResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetConfigurationSetPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getConfigurationSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool. */
    inline def getDedicatedIpPool(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetDedicatedIpPoolResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getDedicatedIpPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool. */
    inline def getDedicatedIpPoolPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetDedicatedIpPoolResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetDedicatedIpPoolPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getDedicatedIpPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity. */
    inline def getEmailIdentity(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetEmailIdentityResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentity(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity. */
    inline def getEmailIdentityPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetEmailIdentityResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentityPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes. */
    inline def getEmailIdentityMailFromAttributes(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.sesv2.outputs.GetEmailIdentityMailFromAttributesResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentityMailFromAttributes(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS SESv2 (Simple Email V2) Email Identity Mail From Attributes. */
    inline def getEmailIdentityMailFromAttributesPlain(args: Endofunction[com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.sesv2.outputs.GetEmailIdentityMailFromAttributesResult] =
      val argsBuilder = com.pulumi.aws.sesv2.inputs.GetEmailIdentityMailFromAttributesPlainArgs.builder
      com.pulumi.aws.sesv2.Sesv2Functions.getEmailIdentityMailFromAttributesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages an AWS SESv2 (Simple Email V2) Tenant. */
  inline def Tenant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.TenantArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.sesv2.TenantArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.sesv2.Tenant(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS SESv2 (Simple Email V2) Tenant Resource Association. */
  inline def TenantResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.sesv2.TenantResourceAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.sesv2.TenantResourceAssociationArgs.builder
    com.pulumi.aws.sesv2.TenantResourceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
