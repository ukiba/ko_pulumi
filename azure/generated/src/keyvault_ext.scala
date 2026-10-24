package jp.ukiba.ko_pulumi
package azure

object keyvault_ext:
  extension (builder: com.pulumi.azure.keyvault.CertifiateArgs.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    inline def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.CertifiateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     * &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    inline def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.CertifiateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.CertificateArgs.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    inline def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     * &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    inline def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.CertificateContactsArgs.Builder)
    /**
     * @param contacts One or more `contact` blocks as defined below.
     * @return builder
     */
    inline def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.Builder]*):
        com.pulumi.azure.keyvault.CertificateContactsArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.CertificateIssuerArgs.Builder)
    /**
     * @param admins One or more `admin` blocks as defined below.
     * @return builder
     */
    inline def admins(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.Builder]*):
        com.pulumi.azure.keyvault.CertificateIssuerArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.builder
      builder.admins(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.KeyArgs.Builder)
    /**
     * @param releasePolicy A `releasePolicy` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `releasePolicy` is set, the key is automatically set as exportable by the provider as this is an API requirement.
     * @return builder
     */
    inline def releasePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyReleasePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.KeyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyReleasePolicyArgs.builder
      builder.releasePolicy(args(argsBuilder).build)

    /**
     * @param rotationPolicy A `rotationPolicy` block as defined below.
     * @return builder
     */
    inline def rotationPolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder]):
        com.pulumi.azure.keyvault.KeyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.builder
      builder.rotationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.KeyVaultArgs.Builder)
    /**
     * @param accessPolicies A list of up to 1024 objects describing access policies, as described below.
     * 
     * &gt; **Note:** Since `accessPolicy` can be configured both inline and via the separate `azure.keyvault.AccessPolicy` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.Builder]*):
        com.pulumi.azure.keyvault.KeyVaultArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated As the `contact` property uses a data plane API, to better support private endpoints and key vaults with public network access disabled, new key vaults with the `contact` field defined in the configuration file will now be required to use the `azure.keyvault.CertificateContacts` resource instead of the exposed `contact` field in the key vault resource itself. This field will be removed in v5.0 of the provider.
     */
    @deprecated("As the `contact` property uses a data plane API, to better support private endpoints and key vaults with public network access disabled, new key vaults with the `contact` field defined in the configuration file will now be required to use the `azure.keyvault.CertificateContacts` resource instead of the exposed `contact` field in the key vault resource itself. This field will be removed in v5.0 of the provider.") inline def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.Builder]*):
        com.pulumi.azure.keyvault.KeyVaultArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.KeyVaultArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.Builder)
    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.Builder)
    /**
     * @param permissions One or more `permission` blocks as defined below.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.keyvault.ManagedHardwareSecurityModuleRoleDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder)
    /**
     * @param issuerParameters A `issuerParameters` block as defined below.
     * @return builder
     */
    inline def issuerParameters(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyIssuerParametersArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyIssuerParametersArgs.builder
      builder.issuerParameters(args(argsBuilder).build)

    /**
     * @param keyProperties A `keyProperties` block as defined below.
     * @return builder
     */
    inline def keyProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyKeyPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyKeyPropertiesArgs.builder
      builder.keyProperties(args(argsBuilder).build)

    /**
     * @param lifetimeActions A `lifetimeAction` block as defined below.
     * @return builder
     */
    inline def lifetimeActions(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.builder
      builder.lifetimeActions(args.map(_(argsBuilder).build)*)

    /**
     * @param secretProperties A `secretProperties` block as defined below.
     * @return builder
     */
    inline def secretProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicySecretPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicySecretPropertiesArgs.builder
      builder.secretProperties(args(argsBuilder).build)

    /**
     * @param x509CertificateProperties A `x509CertificateProperties` block as defined below. Required when `certificate` block is not specified.
     * @return builder
     */
    inline def x509CertificateProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.builder
      builder.x509CertificateProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder)
    /**
     * @param action A `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionActionArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionTriggerArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.Builder)
    /**
     * @param subjectAlternativeNames A `subjectAlternativeNames` block as defined below.
     * @return builder
     */
    inline def subjectAlternativeNames(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertifiateState.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    inline def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificateAttributes A `certificateAttribute` block as defined below.
     * @return builder
     */
    inline def certificateAttributes(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificateAttributeArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertifiateState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificateAttributeArgs.builder
      builder.certificateAttributes(args.map(_(argsBuilder).build)*)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     * &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    inline def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertifiateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder)
    /**
     * @param issuerParameters A `issuerParameters` block as defined below.
     * @return builder
     */
    inline def issuerParameters(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyIssuerParametersArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyIssuerParametersArgs.builder
      builder.issuerParameters(args(argsBuilder).build)

    /**
     * @param keyProperties A `keyProperties` block as defined below.
     * @return builder
     */
    inline def keyProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyKeyPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyKeyPropertiesArgs.builder
      builder.keyProperties(args(argsBuilder).build)

    /**
     * @param lifetimeActions A `lifetimeAction` block as defined below.
     * @return builder
     */
    inline def lifetimeActions(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.builder
      builder.lifetimeActions(args.map(_(argsBuilder).build)*)

    /**
     * @param secretProperties A `secretProperties` block as defined below.
     * @return builder
     */
    inline def secretProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicySecretPropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicySecretPropertiesArgs.builder
      builder.secretProperties(args(argsBuilder).build)

    /**
     * @param x509CertificateProperties A `x509CertificateProperties` block as defined below. Required when `certificate` block is not specified.
     * @return builder
     */
    inline def x509CertificateProperties(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.builder
      builder.x509CertificateProperties(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder)
    /**
     * @param action A `action` block as defined below.
     * @return builder
     */
    inline def action(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionActionArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param trigger A `trigger` block as defined below.
     * @return builder
     */
    inline def trigger(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionTriggerArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyLifetimeActionTriggerArgs.builder
      builder.trigger(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.Builder)
    /**
     * @param subjectAlternativeNames A `subjectAlternativeNames` block as defined below.
     * @return builder
     */
    inline def subjectAlternativeNames(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyX509CertificatePropertiesSubjectAlternativeNamesArgs.builder
      builder.subjectAlternativeNames(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateContactsState.Builder)
    /**
     * @param contacts One or more `contact` blocks as defined below.
     * @return builder
     */
    inline def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateContactsState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateContactsContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateIssuerState.Builder)
    /**
     * @param admins One or more `admin` blocks as defined below.
     * @return builder
     */
    inline def admins(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateIssuerState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateIssuerAdminArgs.builder
      builder.admins(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.inputs.CertificateState.Builder)
    /**
     * @param certificate A `certificate` block as defined below, used to Import an existing certificate. Changing this will create a new version of the Key Vault Certificate.
     * @return builder
     */
    inline def certificate(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificateAttributes A `certificateAttribute` block as defined below.
     * @return builder
     */
    inline def certificateAttributes(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificateAttributeArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificateAttributeArgs.builder
      builder.certificateAttributes(args.map(_(argsBuilder).build)*)

    /**
     * @param certificatePolicy A `certificatePolicy` block as defined below. Changing this (except the `lifetimeAction` field) will create a new version of the Key Vault Certificate.
     * 
     * &gt; **NOTE:** When creating a Key Vault Certificate, at least one of `certificate` or `certificatePolicy` is required. Provide `certificate` to import an existing certificate, `certificatePolicy` to generate a new certificate.
     * @return builder
     */
    inline def certificatePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.CertificateCertificatePolicyArgs.builder
      builder.certificatePolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder)
    /**
     * @param automatic An `automatic` block as defined below.
     * @return builder
     */
    inline def automatic(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyRotationPolicyAutomaticArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyRotationPolicyAutomaticArgs.builder
      builder.automatic(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.KeyState.Builder)
    /**
     * @param releasePolicy A `releasePolicy` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `releasePolicy` is set, the key is automatically set as exportable by the provider as this is an API requirement.
     * @return builder
     */
    inline def releasePolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyReleasePolicyArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.KeyState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyReleasePolicyArgs.builder
      builder.releasePolicy(args(argsBuilder).build)

    /**
     * @param rotationPolicy A `rotationPolicy` block as defined below.
     * @return builder
     */
    inline def rotationPolicy(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.KeyState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyRotationPolicyArgs.builder
      builder.rotationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder)
    /**
     * @param accessPolicies A list of up to 1024 objects describing access policies, as described below.
     * 
     * &gt; **Note:** Since `accessPolicy` can be configured both inline and via the separate `azure.keyvault.AccessPolicy` resource, we have to explicitly set it to empty slice (`[]`) to remove it.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultAccessPolicyArgs.builder
      builder.accessPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @return builder
     * @deprecated As the `contact` property uses a data plane API, to better support private endpoints and key vaults with public network access disabled, new key vaults with the `contact` field defined in the configuration file will now be required to use the `azure.keyvault.CertificateContacts` resource instead of the exposed `contact` field in the key vault resource itself. This field will be removed in v5.0 of the provider.
     */
    @deprecated("As the `contact` property uses a data plane API, to better support private endpoints and key vaults with public network access disabled, new key vaults with the `contact` field defined in the configuration file will now be required to use the `azure.keyvault.CertificateContacts` resource instead of the exposed `contact` field in the key vault resource itself. This field will be removed in v5.0 of the provider.") inline def contacts(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultContactArgs.builder
      builder.contacts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.KeyVaultState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.KeyVaultNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionState.Builder)
    /**
     * @param permissions One or more `permission` blocks as defined below.
     * @return builder
     */
    inline def permissions(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.Builder]*):
        com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionState.Builder =
      def argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleRoleDefinitionPermissionArgs.builder
      builder.permissions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleState.Builder)
    /**
     * @param networkAcls A `networkAcls` block as defined below.
     * @return builder
     */
    inline def networkAcls(args: Endofunction[com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.Builder]):
        com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleState.Builder =
      val argsBuilder = com.pulumi.azure.keyvault.inputs.ManagedHardwareSecurityModuleNetworkAclsArgs.builder
      builder.networkAcls(args(argsBuilder).build)
