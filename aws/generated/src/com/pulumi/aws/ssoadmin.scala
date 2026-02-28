package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object ssoadmin:
  extension (builder: com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.Builder)
    /**
     * @param trustedTokenIssuerConfiguration A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
     * @return builder
     */
    def trustedTokenIssuerConfiguration(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder]):
        com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.builder
      builder.trustedTokenIssuerConfiguration(args(argsBuilder).build)

  /** Provides a Single Sign-On (SSO) ABAC Resource: https://docs.aws.amazon.com/singlesignon/latest/userguide/abac.html */
  def InstanceAccessControlAttributes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.builder
    
    com.pulumi.aws.ssoadmin.InstanceAccessControlAttributes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches a permissions boundary policy to a Single Sign-On (SSO) Permission Set resource.
   *  
   *  &gt; **NOTE:** A permission set can have at most one permissions boundary attached; using more than one `aws.ssoadmin.PermissionsBoundaryAttachment` references the same permission set will show a permanent difference.
   */
  def PermissionsBoundaryAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.builder
    
    com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS SSO Admin Application.
   *  
   *  &gt; The `CreateApplication` API only supports custom OAuth 2.0 applications.
   *  Creation of 3rd party SAML or OAuth 2.0 applications require setup to be done through the associated app service or AWS console.
   *  See this issue for additional context.
   */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssoadmin.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssoadmin.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder)
    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
     * @return builder
     */
    def customerManagedPolicyReference(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.Builder]):
        com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReference(args(argsBuilder).build)

  type SsoadminFunctions = com.pulumi.aws.ssoadmin.SsoadminFunctions
  object SsoadminFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ssoadmin.SsoadminFunctions.*
  extension (self: SsoadminFunctions.type)
    /** Data source for managing an AWS SSO Admin Application. */
    def getApplication(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplication(args(argsBuilder).build)

    /** Data source for managing an AWS SSO Admin Application. */
    def getApplicationPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationPlain(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Assignments. */
    def getApplicationAssignments(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationAssignments(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Assignments. */
    def getApplicationAssignmentsPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationAssignmentsPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationAssignmentsPlain(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Providers. */
    def getApplicationProviders(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetApplicationProvidersResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationProviders(args(argsBuilder).build)

    /** Data source for managing AWS SSO Admin Application Providers. */
    def getApplicationProvidersPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetApplicationProvidersResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetApplicationProvidersPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getApplicationProvidersPlain(args(argsBuilder).build)

    /** Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances. */
    def getInstances(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetInstancesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetInstancesArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getInstances(args(argsBuilder).build)

    /** Use this data source to get ARNs and Identity Store IDs of Single Sign-On (SSO) Instances. */
    def getInstancesPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetInstancesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetInstancesPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getInstancesPlain(args(argsBuilder).build)

    /** Use this data source to get a Single Sign-On (SSO) Permission Set. */
    def getPermissionSet(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSet(args(argsBuilder).build)

    /** Use this data source to get a Single Sign-On (SSO) Permission Set. */
    def getPermissionSetPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSetPlain(args(argsBuilder).build)

    /** Data source returning the ARN of all AWS SSO Admin Permission Sets. */
    def getPermissionSets(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSets(args(argsBuilder).build)

    /** Data source returning the ARN of all AWS SSO Admin Permission Sets. */
    def getPermissionSetsPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetPermissionSetsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPermissionSetsPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPermissionSetsPlain(args(argsBuilder).build)

    /** Data source for viewing AWS SSO Admin Principal Application Assignments. */
    def getPrincipalApplicationAssignments(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssoadmin.outputs.GetPrincipalApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPrincipalApplicationAssignments(args(argsBuilder).build)

    /** Data source for viewing AWS SSO Admin Principal Application Assignments. */
    def getPrincipalApplicationAssignmentsPlain(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssoadmin.outputs.GetPrincipalApplicationAssignmentsResult] =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsPlainArgs.builder
      com.pulumi.aws.ssoadmin.SsoadminFunctions.getPrincipalApplicationAssignmentsPlain(args(argsBuilder).build)

  /**
   * Provides a customer managed policy attachment for a Single Sign-On (SSO) Permission Set resource
   *  
   *  &gt; **NOTE:** Creating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
   */
  def CustomerManagedPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.builder
    
    com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS SSO Admin Application Assignment. */
  def ApplicationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ApplicationAssignmentArgs.builder
    
    com.pulumi.aws.ssoadmin.ApplicationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS SSO Admin Trusted Token Issuer. */
  def TrustedTokenIssuer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssoadmin.TrustedTokenIssuerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssoadmin.TrustedTokenIssuer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS SSO Admin Application Access Scope. */
  def ApplicationAccessScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationAccessScopeArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ApplicationAccessScopeArgs.builder
    
    com.pulumi.aws.ssoadmin.ApplicationAccessScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM managed policy for a Single Sign-On (SSO) Permission Set resource
   *  
   *  &gt; **NOTE:** Creating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
   */
  def ManagedPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentArgs.builder
    
    com.pulumi.aws.ssoadmin.ManagedPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder)
    /**
     * @param permissionsBoundary The permissions boundary policy. See below.
     * @return builder
     */
    def permissionsBoundary(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder]):
        com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.builder
      builder.permissionsBoundary(args(argsBuilder).build)

  /**
   * 
   */
  def PermissionSetInlinePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.PermissionSetInlinePolicyArgs.builder
    
    com.pulumi.aws.ssoadmin.PermissionSetInlinePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Single Sign-On (SSO) Permission Set resource
   *  
   *  &gt; **NOTE:** Updating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
   */
  def PermissionSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.PermissionSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssoadmin.PermissionSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ssoadmin.PermissionSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS SSO Admin Application Assignment Configuration.
   *  
   *  By default, applications will require users to have an explicit assignment in order to access an application.
   *  This resource can be used to adjust this default behavior if necessary.
   *  
   *  &gt; Deleting this resource will return the assignment configuration for the application to the default AWS behavior (ie. `assignmentRequired = true`).
   */
  def ApplicationAssignmentConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.ApplicationAssignmentConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.ApplicationAssignmentConfigurationArgs.builder
    
    com.pulumi.aws.ssoadmin.ApplicationAssignmentConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Single Sign-On (SSO) Account Assignment resource */
  def AccountAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssoadmin.AccountAssignmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ssoadmin.AccountAssignmentArgs.builder
    
    com.pulumi.aws.ssoadmin.AccountAssignment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder)
    /**
     * @param attributes See AccessControlAttribute for more details.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.Builder]*):
        com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssoadmin.ApplicationArgs.Builder)
    /**
     * @param portalOptions Options for the portal associated with an application. See `portalOptions` below.
     * @return builder
     */
    def portalOptions(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder]):
        com.pulumi.aws.ssoadmin.ApplicationArgs.Builder =
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

  extension (builder: com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder)
    /**
     * @param oidcJwtConfiguration A block that describes the settings for a trusted token issuer that works with OpenID Connect (OIDC) by using JSON Web Tokens (JWT). See Documented below below.
     * @return builder
     */
    def oidcJwtConfiguration(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationOidcJwtConfigurationArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationOidcJwtConfigurationArgs.builder
      builder.oidcJwtConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder)
    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
     * @return builder
     */
    def customerManagedPolicyReference(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReferenceArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReference(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.ssoadmin.inputs.ApplicationState.Builder)
    /**
     * @param portalOptions Options for the portal associated with an application. See `portalOptions` below.
     * @return builder
     */
    def portalOptions(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.ApplicationState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.builder
      builder.portalOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentState.Builder)
    /**
     * @param permissionsBoundary The permissions boundary policy. See below.
     * @return builder
     */
    def permissionsBoundary(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.builder
      builder.permissionsBoundary(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.Builder)
    /**
     * @param applicationAssignments List of principals assigned to the application. See the `applicationAssignments` attribute reference below.
     * @return builder
     */
    def applicationAssignments(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsApplicationAssignmentArgs.Builder]*):
        com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsApplicationAssignmentArgs.builder
      builder.applicationAssignments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder)
    /**
     * @param signInOptions Sign-in options for the access portal. See `signInOptions` below.
     * @return builder
     */
    def signInOptions(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsSignInOptionsArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsSignInOptionsArgs.builder
      builder.signInOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerState.Builder)
    /**
     * @param trustedTokenIssuerConfiguration A block that specifies settings that apply to the trusted token issuer, these change depending on the type you specify in `trustedTokenIssuerType`. Documented below.
     * @return builder
     */
    def trustedTokenIssuerConfiguration(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.TrustedTokenIssuerTrustedTokenIssuerConfigurationArgs.builder
      builder.trustedTokenIssuerConfiguration(args(argsBuilder).build)
