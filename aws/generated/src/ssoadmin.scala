package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ssoadmin:
  /** Provides a Single Sign-On (SSO) Account Assignment resource */
  def AccountAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.AccountAssignmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.AccountAssignmentArgs.builder
    com.pulumi.aws.ssoadmin.AccountAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS SSO Admin Application.
   * 
   * &gt; The `CreateApplication` API only supports custom OAuth 2.0 applications.
   * Creation of 3rd party SAML or OAuth 2.0 applications require setup to be done through the associated app service or AWS console.
   * See this issue for additional context.
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssoadmin.ApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ssoadmin.Application(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS SSO Admin Application Access Scope. */
  def ApplicationAccessScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationAccessScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ApplicationAccessScopeArgs.builder
    com.pulumi.aws.ssoadmin.ApplicationAccessScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.ssoadmin.ApplicationArgs.Builder)
    /**
     * @param portalOptions Options for the portal associated with an application. See `portalOptions` below.
     * @return builder
     */
    def portalOptions(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder]):
        com.pulumi.aws.ssoadmin.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.builder
      builder.portalOptions(args(argsBuilder).build)

  /** Resource for managing an AWS SSO Admin Application Assignment. */
  def ApplicationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationAssignmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ApplicationAssignmentArgs.builder
    com.pulumi.aws.ssoadmin.ApplicationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS SSO Admin Application Assignment Configuration.
   * 
   * By default, applications will require users to have an explicit assignment in order to access an application.
   * This resource can be used to adjust this default behavior if necessary.
   * 
   * &gt; Deleting this resource will return the assignment configuration for the application to the default AWS behavior (ie. `assignmentRequired = true`).
   */
  def ApplicationAssignmentConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationAssignmentConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ApplicationAssignmentConfigurationArgs.builder
    com.pulumi.aws.ssoadmin.ApplicationAssignmentConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a customer managed policy attachment for a Single Sign-On (SSO) Permission Set resource
   * 
   * &gt; **WARNING:** Do not use this resource together with the `aws.ssoadmin.CustomerManagedPolicyAttachmentsExclusive` resource for the same permission set. Doing so will cause a conflict and will lead to customer managed policies being removed.
   * 
   * &gt; **NOTE:** Creating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
   */
  def CustomerManagedPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.builder
    com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder)
    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
     * @return builder
     */
    def customerManagedPolicyReference(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.Builder]):
        com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReference(args(argsBuilder).build)

  /**
   * Resource for managing exclusive AWS SSO Admin Customer Managed Policy Attachments.
   * 
   * This resource is designed to manage all customer managed policy attachments for an SSO permission set. Using this resource, Terraform will remove any customer managed policies attached to the permission set that are not defined in the configuration.
   * 
   * &gt; **WARNING:** Do not use this resource together with the `aws.ssoadmin.CustomerManagedPolicyAttachment` resource for the same permission set. Doing so will cause a conflict and will lead to customer managed policies being removed.
   * 
   * &gt; Destruction of this resource means Terraform will no longer manage the customer managed policy attachments, **but will not detach any policies**. The permission set will retain all customer managed policies that were attached at the time of destruction.
   */
  def CustomerManagedPolicyAttachmentsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentsExclusiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentsExclusiveArgs.builder
    com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentsExclusiveArgs.Builder)
    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed policies to attach. See Customer Managed Policy Reference below.
     * @return builder
     */
    def customerManagedPolicyReferences(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveCustomerManagedPolicyReferenceArgs.Builder]*):
        com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentsExclusiveArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReferences(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentsExclusiveArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a Single Sign-On (SSO) ABAC Resource: https://docs.aws.amazon.com/singlesignon/latest/userguide/abac.html */
  def InstanceAccessControlAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.builder
    com.pulumi.aws.ssoadmin.InstanceAccessControlAttributes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder)
    /**
     * @param attributes See AccessControlAttribute for more details.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.Builder]*):
        com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  /**
   * Provides an IAM managed policy for a Single Sign-On (SSO) Permission Set resource
   * 
   * &gt; **NOTE:** Creating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
   * 
   * &gt; **WARNING:** Do not use this resource together with the `aws.ssoadmin.ManagedPolicyAttachmentsExclusive` resource for the same permission set. Doing so will cause a conflict and will lead to managed policies being removed.
   */
  def ManagedPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentArgs.builder
    com.pulumi.aws.ssoadmin.ManagedPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing exclusive AWS SSO Admin Managed Policy Attachments.
   * 
   * This resource is designed to manage all managed policy attachments for an SSO permission set. Using this resource, Terraform will remove any managed policies attached to the permission set that are not defined in the configuration.
   * 
   * &gt; **WARNING:** Do not use this resource together with the `aws.ssoadmin.ManagedPolicyAttachment` resource for the same permission set. Doing so will cause a conflict and will lead to managed policies being removed.
   * 
   * &gt; Destruction of this resource means Terraform will no longer manage the managed policy attachments, **but will not detach any policies**. The permission set will retain all managed policies that were attached at the time of destruction.
   */
  def ManagedPolicyAttachmentsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentsExclusiveArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentsExclusiveArgs.builder
    com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentsExclusiveArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentsExclusiveArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Provides a Single Sign-On (SSO) Permission Set resource
   * 
   * &gt; **NOTE:** Updating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
   */
  def PermissionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.PermissionSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssoadmin.PermissionSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ssoadmin.PermissionSet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides an IAM inline policy for a Single Sign-On (SSO) Permission Set resource
   * 
   * &gt; **NOTE:** AWS Single Sign-On (SSO) only supports one IAM inline policy per `aws.ssoadmin.PermissionSet` resource.
   * Creating or updating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
   * 
   * &gt; **NOTE:** We suggest using `jsonencode()` or `aws.iam.getPolicyDocument` when assigning a value to `inlinePolicy`. They seamlessly translate Terraform language into JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def PermissionSetInlinePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs.builder
    com.pulumi.aws.ssoadmin.PermissionSetInlinePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Attaches a permissions boundary policy to a Single Sign-On (SSO) Permission Set resource.
   * 
   * &gt; **NOTE:** A permission set can have at most one permissions boundary attached; using more than one `aws.ssoadmin.PermissionsBoundaryAttachment` references the same permission set will show a permanent difference.
   */
  def PermissionsBoundaryAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.builder
    com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder)
    /**
     * @param permissionsBoundary The permissions boundary policy. See below.
     * @return builder
     */
    def permissionsBoundary(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder]):
        com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.builder
      builder.permissionsBoundary(args(argsBuilder).build)

  object SsoadminFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS SSO Admin Application. */
    inline def getApplication(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplication(args(argsBuilder).build)

    /** Data source for managing an AWS SSO Admin Application. */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationPlain(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Assignments. */
    inline def getApplicationAssignments(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationAssignments(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Assignments. */
    inline def getApplicationAssignmentsPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationAssignmentsPlain(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Providers. */
    inline def getApplicationProviders(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetApplicationProvidersResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationProviders(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Providers. */
    inline def getApplicationProvidersPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetApplicationProvidersResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationProvidersPlain(args(argsBuilder).build)

    /** Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances. */
    inline def getInstances(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetInstancesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetInstancesArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getInstances(args(argsBuilder).build)

    /** Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances. */
    inline def getInstancesPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetInstancesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetInstancesPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getInstancesPlain(args(argsBuilder).build)

    /** Use this data source to get a Single Sign-On (SSO) Permission Set. */
    inline def getPermissionSet(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSet(args(argsBuilder).build)

    /** Use this data source to get a Single Sign-On (SSO) Permission Set. */
    inline def getPermissionSetPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSetPlain(args(argsBuilder).build)

    /** Data source returning the ARN of all AWS SSO Admin Permission Sets. */
    inline def getPermissionSets(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSets(args(argsBuilder).build)

    /** Data source returning the ARN of all AWS SSO Admin Permission Sets. */
    inline def getPermissionSetsPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSetsPlain(args(argsBuilder).build)

    /** Data source for viewing AWS SSO Admin Principal Application Assignments. */
    inline def getPrincipalApplicationAssignments(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetPrincipalApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPrincipalApplicationAssignments(args(argsBuilder).build)

    /** Data source for viewing AWS SSO Admin Principal Application Assignments. */
    inline def getPrincipalApplicationAssignmentsPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetPrincipalApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPrincipalApplicationAssignmentsPlain(args(argsBuilder).build)

  /** Resource for managing an AWS SSO Admin Trusted Token Issuer. */
  def TrustedTokenIssuer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ssoadmin.TrustedTokenIssuer(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.Builder)
    /**
     * @param trustedTokenIssuerConfiguration A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
     * @return builder
     */
    def trustedTokenIssuerConfiguration(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder]):
        com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.builder
      builder.trustedTokenIssuerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder)
    /**
     * @param signInOptions Sign-in options for the access portal. See `signInOptions` below.
     * @return builder
     */
    def signInOptions(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsSignInOptionsArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsSignInOptionsArgs.builder
      builder.signInOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.ApplicationState.Builder)
    /**
     * @param portalOptions Options for the portal associated with an application. See `portalOptions` below.
     * @return builder
     */
    def portalOptions(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.builder
      builder.portalOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentState.Builder)
    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
     * @return builder
     */
    def customerManagedPolicyReference(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReference(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveState.Builder)
    /**
     * @param customerManagedPolicyReferences Specifies the names and paths of the customer managed policies to attach. See Customer Managed Policy Reference below.
     * @return builder
     */
    def customerManagedPolicyReferences(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveCustomerManagedPolicyReferenceArgs.Builder]*):
        com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveState.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReferences(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentsExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.Builder)
    /**
     * @param applicationAssignments List of principals assigned to the application. See the `applicationAssignments` attribute reference below.
     * @return builder
     */
    def applicationAssignments(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsApplicationAssignmentArgs.Builder]*):
        com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsApplicationAssignmentArgs.builder
      builder.applicationAssignments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.Builder)
    /**
     * @param values The value used for mapping a specified attribute to an identity source. See AccessControlAttributeValue
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeValueArgs.Builder]*):
        com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesState.Builder)
    /**
     * @param attributes See AccessControlAttribute for more details.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.Builder]*):
        com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesState.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder)
    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
     * @return builder
     */
    def customerManagedPolicyReference(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReferenceArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReference(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentState.Builder)
    /**
     * @param permissionsBoundary The permissions boundary policy. See below.
     * @return builder
     */
    def permissionsBoundary(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.builder
      builder.permissionsBoundary(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerState.Builder)
    /**
     * @param trustedTokenIssuerConfiguration A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
     * @return builder
     */
    def trustedTokenIssuerConfiguration(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.builder
      builder.trustedTokenIssuerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder)
    /**
     * @param oidcJwtConfiguration A block that describes the settings for a trusted token issuer that works with OpenID Connect (OIDC) by using JSON Web Tokens (JWT). See Documented below below.
     * @return builder
     */
    def oidcJwtConfiguration(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationOidcJwtConfigurationArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationOidcJwtConfigurationArgs.builder
      builder.oidcJwtConfiguration(args(argsBuilder).build)
