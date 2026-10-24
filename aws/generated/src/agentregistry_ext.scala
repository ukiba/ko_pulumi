package jp.ukiba.ko_pulumi
package aws

object agentregistry_ext:
  extension (builder: com.pulumi.aws.agentregistry.RegistryArgs.Builder)
    /**
     * @param approvalConfiguration Approval configuration for registry records. See below.
     * @return builder
     */
    inline def approvalConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryApprovalConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryApprovalConfigurationArgs.builder
      builder.approvalConfiguration(args(argsBuilder).build)

    /**
     * @param autoDetectionConfiguration Auto-detection configuration for the registry. When provided, the registry is automatically populated with resources discovered according to the configuration. See below.
     * @return builder
     */
    inline def autoDetectionConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryAutoDetectionConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryAutoDetectionConfigurationArgs.builder
      builder.autoDetectionConfiguration(args(argsBuilder).build)

    /**
     * @param discoveryConfiguration Discovery configuration for the registry. See below.
     * @return builder
     */
    inline def discoveryConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationArgs.builder
      builder.discoveryConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Server-side encryption configuration for the registry. See below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryTimeoutsArgs.Builder]):
        com.pulumi.aws.agentregistry.RegistryArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationArgs.Builder)
    /**
     * @param authorizerConfiguration Authorizer configuration for the registry. Required when `authorizerType` is `CUSTOM_JWT`. See below.
     * @return builder
     */
    inline def authorizerConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationArgs.builder
      builder.authorizerConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationArgs.Builder)
    /**
     * @param customJwtAuthorizer Configuration for a custom JWT authorizer.
     * @return builder
     */
    inline def customJwtAuthorizer(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerArgs.builder
      builder.customJwtAuthorizer(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder)
    /**
     * @param customClaims Custom claims for additional JWT validation beyond standard OIDC claims. See below.
     * @return builder
     */
    inline def customClaims(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder]*):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder =
      def argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.builder
      builder.customClaims(args.map(_(argsBuilder).build)*)

    /**
     * @param privateEndpoint Private endpoint used to reach the identity provider&#39;s discovery URL over a private network path. See below.
     * @return builder
     */
    inline def privateEndpoint(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointArgs.builder
      builder.privateEndpoint(args(argsBuilder).build)

    /**
     * @param privateEndpointOverrides Per-domain private endpoint overrides that route specific identity provider domains through distinct private endpoints. See below.
     * @return builder
     */
    inline def privateEndpointOverrides(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverrideArgs.Builder]*):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerArgs.Builder =
      def argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverrideArgs.builder
      builder.privateEndpointOverrides(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder)
    /**
     * @param authorizingClaimMatchValue Claim match criteria. See below.
     * @return builder
     */
    inline def authorizingClaimMatchValue(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.builder
      builder.authorizingClaimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder)
    /**
     * @param claimMatchValue Value to match against. See below.
     * @return builder
     */
    inline def claimMatchValue(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerCustomClaimAuthorizingClaimMatchValueClaimMatchValueArgs.builder
      builder.claimMatchValue(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointArgs.Builder)
    /**
     * @param managedVpcResource Private endpoint backed by a service-managed VPC resource. See below.
     * @return builder
     */
    inline def managedVpcResource(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointManagedVpcResourceArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointManagedVpcResourceArgs.builder
      builder.managedVpcResource(args(argsBuilder).build)

    /**
     * @param selfManagedLatticeResource Private endpoint backed by a self-managed VPC Lattice resource configuration. See below.
     * @return builder
     */
    inline def selfManagedLatticeResource(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointSelfManagedLatticeResourceArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointSelfManagedLatticeResourceArgs.builder
      builder.selfManagedLatticeResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverrideArgs.Builder)
    /**
     * @param privateEndpoint Private endpoint used to reach the specified domain. See above.
     * @return builder
     */
    inline def privateEndpoint(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverrideArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointArgs.builder
      builder.privateEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointArgs.Builder)
    /**
     * @param managedVpcResource Private endpoint backed by a service-managed VPC resource. See below.
     * @return builder
     */
    inline def managedVpcResource(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointManagedVpcResourceArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointManagedVpcResourceArgs.builder
      builder.managedVpcResource(args(argsBuilder).build)

    /**
     * @param selfManagedLatticeResource Private endpoint backed by a self-managed VPC Lattice resource configuration. See below.
     * @return builder
     */
    inline def selfManagedLatticeResource(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointSelfManagedLatticeResourceArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationAuthorizerConfigurationCustomJwtAuthorizerPrivateEndpointOverridePrivateEndpointSelfManagedLatticeResourceArgs.builder
      builder.selfManagedLatticeResource(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.agentregistry.inputs.RegistryState.Builder)
    /**
     * @param approvalConfiguration Approval configuration for registry records. See below.
     * @return builder
     */
    inline def approvalConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryApprovalConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryApprovalConfigurationArgs.builder
      builder.approvalConfiguration(args(argsBuilder).build)

    /**
     * @param autoDetectionConfiguration Auto-detection configuration for the registry. When provided, the registry is automatically populated with resources discovered according to the configuration. See below.
     * @return builder
     */
    inline def autoDetectionConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryAutoDetectionConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryAutoDetectionConfigurationArgs.builder
      builder.autoDetectionConfiguration(args(argsBuilder).build)

    /**
     * @param discoveryConfiguration Discovery configuration for the registry. See below.
     * @return builder
     */
    inline def discoveryConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryDiscoveryConfigurationArgs.builder
      builder.discoveryConfiguration(args(argsBuilder).build)

    /**
     * @param encryptionConfiguration Server-side encryption configuration for the registry. See below.
     * @return builder
     */
    inline def encryptionConfiguration(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

    inline def timeouts(args: Endofunction[com.pulumi.aws.agentregistry.inputs.RegistryTimeoutsArgs.Builder]):
        com.pulumi.aws.agentregistry.inputs.RegistryState.Builder =
      val argsBuilder = com.pulumi.aws.agentregistry.inputs.RegistryTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
