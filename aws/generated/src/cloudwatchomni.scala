package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudwatchomni:
  /**
   * Manages an Amazon CloudWatch Omni domain.
   * 
   * A domain is the top-level container for CloudWatch Omni. It configures how users sign in and contains the spaces that hold telemetry. An account can have one domain.
   * 
   * &gt; **NOTE:** A domain cannot be deleted while it contains spaces.
   */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.DomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.DomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatchomni.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.DomainArgs.Builder)
    /**
     * @param identityProviderConfiguration Identity provider configuration. Required when `identityProviders` includes `IDC`. See below.
     * @return builder
     */
    def identityProviderConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.builder
      builder.identityProviderConfiguration(args(argsBuilder).build)

  /**
   * Manages a CloudWatch Omni Space. A space is the container that holds your observability data within a CloudWatch Omni domain.
   * 
   * &gt; **NOTE:** CloudWatch Omni allows only **one space per AWS account per region**. Creating a second space in the same region returns `ConflictException`. A space in a different region is permitted, and a space does not have to be in the same region as its domain.
   * 
   * &gt; **NOTE:** CloudWatch Omni is not available in every region. In unsupported regions the API returns `AccessDeniedException`.
   */
  def Space(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudwatchomni.SpaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudwatchomni.SpaceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.cloudwatchomni.Space(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.SpaceArgs.Builder)
    /**
     * @param encryptionConfiguration Encryption of the space&#39;s data at rest. Omit for AWS owned encryption. See below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.SpaceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder)
    /**
     * @param identityCenterConfiguration IAM Identity Center configuration. See below.
     * @return builder
     */
    def identityCenterConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationIdentityCenterConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationIdentityCenterConfigurationArgs.builder
      builder.identityCenterConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.DomainState.Builder)
    /**
     * @param identityProviderConfiguration Identity provider configuration. Required when `identityProviders` includes `IDC`. See below.
     * @return builder
     */
    def identityProviderConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.DomainIdentityProviderConfigurationArgs.builder
      builder.identityProviderConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudwatchomni.inputs.SpaceState.Builder)
    /**
     * @param encryptionConfiguration Encryption of the space&#39;s data at rest. Omit for AWS owned encryption. See below.
     * @return builder
     */
    def encryptionConfiguration(args: Endofunction[com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.Builder]):
        com.pulumi.aws.cloudwatchomni.inputs.SpaceState.Builder =
      val argsBuilder = com.pulumi.aws.cloudwatchomni.inputs.SpaceEncryptionConfigurationArgs.builder
      builder.encryptionConfiguration(args(argsBuilder).build)
