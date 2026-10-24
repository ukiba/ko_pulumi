package jp.ukiba.ko_pulumi
package aws

object ssoadmin_ext:
  extension (builder: com.pulumi.aws.ssoadmin.ApplicationArgs.Builder)
    /**
     * @param portalOptions Options for the portal associated with an application. See `portalOptions` below.
     * @return builder
     */
    def portalOptions(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.Builder]):
        com.pulumi.aws.ssoadmin.ApplicationArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ApplicationPortalOptionsArgs.builder
      builder.portalOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder)
    /**
     * @param customerManagedPolicyReference Specifies the name and path of a customer managed policy. See below.
     * @return builder
     */
    def customerManagedPolicyReference(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.Builder]):
        com.pulumi.aws.ssoadmin.CustomerManagedPolicyAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.CustomerManagedPolicyAttachmentCustomerManagedPolicyReferenceArgs.builder
      builder.customerManagedPolicyReference(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder)
    /**
     * @param attributes See AccessControlAttribute for more details.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.Builder]*):
        com.pulumi.aws.ssoadmin.InstanceAccessControlAttributesArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.InstanceAccessControlAttributesAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentsExclusiveArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveTimeoutsArgs.Builder]):
        com.pulumi.aws.ssoadmin.ManagedPolicyAttachmentsExclusiveArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.ManagedPolicyAttachmentsExclusiveTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder)
    /**
     * @param permissionsBoundary The permissions boundary policy. See below.
     * @return builder
     */
    def permissionsBoundary(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.Builder]):
        com.pulumi.aws.ssoadmin.PermissionsBoundaryAttachmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.PermissionsBoundaryAttachmentPermissionsBoundaryArgs.builder
      builder.permissionsBoundary(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ssoadmin.RegionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.RegionTimeoutsArgs.Builder]):
        com.pulumi.aws.ssoadmin.RegionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.RegionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsPlainArgs.Builder)
    /**
     * @param applicationAssignments List of principals assigned to the application. See the `applicationAssignments` attribute reference below.
     * @return builder
     */
    def applicationAssignments(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsApplicationAssignment.Builder]*):
        com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ssoadmin.inputs.GetPrincipalApplicationAssignmentsApplicationAssignment.builder
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

  extension (builder: com.pulumi.aws.ssoadmin.inputs.RegionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ssoadmin.inputs.RegionTimeoutsArgs.Builder]):
        com.pulumi.aws.ssoadmin.inputs.RegionState.Builder =
      val argsBuilder = com.pulumi.aws.ssoadmin.inputs.RegionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

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
