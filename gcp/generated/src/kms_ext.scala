package jp.ukiba.ko_pulumi
package gcp

object kms_ext:
  extension (builder: com.pulumi.gcp.kms.CryptoKeyArgs.Builder)
    /**
     * @param keyAccessJustificationsPolicy (Optional, Beta)
     * The policy used for Key Access Justifications Policy Enforcement. If this
     * field is present and this key is enrolled in Key Access Justifications
     * Policy Enforcement, the policy will be evaluated in encrypt, decrypt, and
     * sign operations, and the operation will fail if rejected by the policy. The
     * policy is defined by specifying zero or more allowed justification codes.
     * https://cloud.google.com/assured-workloads/key-access-justifications/docs/justification-codes
     * By default, this field is absent, and all justification codes are allowed.
     * This field is currently in beta and is subject to change.
     * Structure is documented below.
     * @return builder
     */
    inline def keyAccessJustificationsPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.builder
      builder.keyAccessJustificationsPolicy(args(argsBuilder).build)

    /**
     * @param versionTemplate A template describing settings for new crypto key versions.
     * Structure is documented below.
     * @return builder
     */
    inline def versionTemplate(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.builder
      builder.versionTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.CryptoKeyVersionArgs.Builder)
    /**
     * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * Structure is documented below.
     * @return builder
     */
    inline def externalProtectionLevelOptions(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.builder
      builder.externalProtectionLevelOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.EkmConnectionArgs.Builder)
    /**
     * @param serviceResolvers A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported
     * Structure is documented below.
     * @return builder
     */
    inline def serviceResolvers(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder]*):
        com.pulumi.gcp.kms.EkmConnectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.builder
      builder.serviceResolvers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.kms.EkmConnectionIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.EkmConnectionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.EkmConnectionIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.EkmConnectionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.FolderKajPolicyConfigArgs.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     * created in this folder. This is only used when a Key Access Justifications
     * policy is not provided in the CreateCryptoKeyRequest.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.FolderKajPolicyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.KeyRingIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.KeyRingIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.KeyRingIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.KeyRingIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.OrganizationKajPolicyConfigArgs.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     * created in this organization. This is only used when a Key Access Justifications
     * policy is not provided in the CreateCryptoKeyRequest.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.OrganizationKajPolicyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.ProjectKajPolicyConfigArgs.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     * created in this project. This is only used when a Key Access Justifications
     * policy is not provided in the CreateCryptoKeyRequest.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.ProjectKajPolicyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder)
    /**
     * @param keyAccessJustificationsPolicy (Optional, Beta)
     * The policy used for Key Access Justifications Policy Enforcement. If this
     * field is present and this key is enrolled in Key Access Justifications
     * Policy Enforcement, the policy will be evaluated in encrypt, decrypt, and
     * sign operations, and the operation will fail if rejected by the policy. The
     * policy is defined by specifying zero or more allowed justification codes.
     * https://cloud.google.com/assured-workloads/key-access-justifications/docs/justification-codes
     * By default, this field is absent, and all justification codes are allowed.
     * This field is currently in beta and is subject to change.
     * Structure is documented below.
     * @return builder
     */
    inline def keyAccessJustificationsPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.builder
      builder.keyAccessJustificationsPolicy(args(argsBuilder).build)

    /**
     * @param primaries A copy of the primary CryptoKeyVersion that will be used by cryptoKeys.encrypt when this CryptoKey is given in EncryptRequest.name.
     * Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be unset.
     * Structure is documented below.
     * @return builder
     */
    inline def primaries(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyPrimaryArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyPrimaryArgs.builder
      builder.primaries(args.map(_(argsBuilder).build)*)

    /**
     * @param versionTemplate A template describing settings for new crypto key versions.
     * Structure is documented below.
     * @return builder
     */
    inline def versionTemplate(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.builder
      builder.versionTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder)
    /**
     * @param certChains The certificate chains needed to validate the attestation
     * Structure is documented below.
     * @return builder
     */
    inline def certChains(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationCertChainsArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationCertChainsArgs.builder
      builder.certChains(args(argsBuilder).build)

    /**
     * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * Structure is documented below.
     * @return builder
     * @deprecated `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead.
     */
    @deprecated("`externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead.") inline def externalProtectionLevelOptions(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs.builder
      builder.externalProtectionLevelOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyVersionState.Builder)
    /**
     * @param attestations Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google.
     * Only provided for key versions with protectionLevel HSM.
     * Structure is documented below.
     * @return builder
     */
    inline def attestations(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.builder
      builder.attestations(args.map(_(argsBuilder).build)*)

    /**
     * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * Structure is documented below.
     * @return builder
     */
    inline def externalProtectionLevelOptions(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.builder
      builder.externalProtectionLevelOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder)
    /**
     * @param serverCertificates Required. A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica. Currently, a maximum of 10 Certificate is supported.
     * Structure is documented below.
     * @return builder
     */
    inline def serverCertificates(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverServerCertificateArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverServerCertificateArgs.builder
      builder.serverCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionState.Builder)
    /**
     * @param serviceResolvers A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported
     * Structure is documented below.
     * @return builder
     */
    inline def serviceResolvers(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.EkmConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.builder
      builder.serviceResolvers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigState.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     * created in this folder. This is only used when a Key Access Justifications
     * policy is not provided in the CreateCryptoKeyRequest.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.KeyRingIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.KeyRingIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.KeyRingIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.KeyRingIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.KeyRingImportJobState.Builder)
    /**
     * @param attestations Statement that was generated and signed by the key creator (for example, an HSM) at key creation time.
     * Use this statement to verify attributes of the key as stored on the HSM, independently of Google.
     * Only present if the chosen ImportMethod is one with a protection level of HSM.
     * Structure is documented below.
     * @return builder
     */
    inline def attestations(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingImportJobAttestationArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.KeyRingImportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingImportJobAttestationArgs.builder
      builder.attestations(args.map(_(argsBuilder).build)*)

    /**
     * @param publicKeys The public key with which to wrap key material prior to import. Only returned if state is `ACTIVE`.
     * Structure is documented below.
     * @return builder
     */
    inline def publicKeys(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingImportJobPublicKeyArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.KeyRingImportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingImportJobPublicKeyArgs.builder
      builder.publicKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigState.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     * created in this organization. This is only used when a Key Access Justifications
     * policy is not provided in the CreateCryptoKeyRequest.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigState.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     * created in this project. This is only used when a Key Access Justifications
     * policy is not provided in the CreateCryptoKeyRequest.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)
