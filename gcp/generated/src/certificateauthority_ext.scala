package jp.ukiba.ko_pulumi
package gcp

object certificateauthority_ext:
  extension (builder: com.pulumi.gcp.certificateauthority.AuthorityArgs.Builder)
    /**
     * @param config The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.AuthorityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param keySpec Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority
     * is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA
     * certificate. Otherwise, it is used to sign a CSR.
     * Structure is documented below.
     * @return builder
     */
    inline def keySpec(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityKeySpecArgs.Builder]):
        com.pulumi.gcp.certificateauthority.AuthorityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityKeySpecArgs.builder
      builder.keySpec(args(argsBuilder).build)

    /**
     * @param subordinateConfig If this is a subordinate CertificateAuthority, this field will be set
     * with the subordinate configuration, which describes its issuers.
     * Structure is documented below.
     * @return builder
     */
    inline def subordinateConfig(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.AuthorityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigArgs.builder
      builder.subordinateConfig(args(argsBuilder).build)

    /**
     * @param userDefinedAccessUrls Custom URLs for accessing content published by this CA, such as the CA certificate and CRLs,
     * that can be specified by users.
     * Structure is documented below.
     * @return builder
     */
    inline def userDefinedAccessUrls(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityUserDefinedAccessUrlsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.AuthorityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityUserDefinedAccessUrlsArgs.builder
      builder.userDefinedAccessUrls(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.CaPoolArgs.Builder)
    /**
     * @param encryptionSpec Used when customer would like to encrypt data at rest. The customer-provided key will be used
     * to encrypt the Subject, SubjectAltNames and PEM-encoded certificate fields. When unspecified,
     * customer data will remain unencrypted.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionSpec(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CaPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param issuancePolicy The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * Structure is documented below.
     * @return builder
     */
    inline def issuancePolicy(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CaPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.builder
      builder.issuancePolicy(args(argsBuilder).build)

    /**
     * @param publishingOptions The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * Structure is documented below.
     * @return builder
     */
    inline def publishingOptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolPublishingOptionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CaPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolPublishingOptionsArgs.builder
      builder.publishingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.CertificateArgs.Builder)
    /**
     * @param config The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CertificateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.CertificateTemplateArgs.Builder)
    /**
     * @param identityConstraints Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate&#39;s identity.
     * Structure is documented below.
     * @return builder
     */
    inline def identityConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CertificateTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsArgs.builder
      builder.identityConstraints(args(argsBuilder).build)

    /**
     * @param passthroughExtensions Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don&#39;t appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool&#39;s IssuancePolicy defines baselineValues that don&#39;t appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate&#39;s X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate&#39;s predefined_values.
     * Structure is documented below.
     * @return builder
     */
    inline def passthroughExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CertificateTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsArgs.builder
      builder.passthroughExtensions(args(argsBuilder).build)

    /**
     * @param predefinedValues Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool&#39;s IssuancePolicy defines conflicting baselineValues for the same properties, the certificate issuance request will fail.
     * Structure is documented below.
     * @return builder
     */
    inline def predefinedValues(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CertificateTemplateArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.builder
      builder.predefinedValues(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.Builder)
    /**
     * @param subjectConfig Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectConfig(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigArgs.builder
      builder.subjectConfig(args(argsBuilder).build)

    /**
     * @param subjectKeyId When specified this provides a custom SKI to be used in the certificate. This should only be used to maintain a SKI of an existing CA originally created outside CA service, which was not generated using method (1) described in RFC 5280 section 4.2.1.2..
     * Structure is documented below.
     * @return builder
     */
    inline def subjectKeyId(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectKeyIdArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectKeyIdArgs.builder
      builder.subjectKeyId(args(argsBuilder).build)

    /**
     * @param x509Config Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * @return builder
     */
    inline def x509Config(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.builder
      builder.x509Config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigArgs.Builder)
    /**
     * @param subject Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * @return builder
     */
    inline def subject(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigSubjectArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

    /**
     * @param subjectAltName The subject alternative name fields.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectAltName(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigSubjectAltNameArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigSubjectAltNameArgs.builder
      builder.subjectAltName(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionArgs.Builder)
    /**
     * @param objectId Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def objectId(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs.builder
      builder.objectId(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.Builder)
    /**
     * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * @return builder
     */
    inline def additionalExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionArgs.builder
      builder.additionalExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param caOptions Describes values that are relevant in a CA certificate.
     * @return builder
     */
    inline def caOptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigCaOptionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigCaOptionsArgs.builder
      builder.caOptions(args(argsBuilder).build)

    /**
     * @param keyUsage Indicates the intended use for keys that correspond to a certificate.
     * @return builder
     */
    inline def keyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs.builder
      builder.keyUsage(args(argsBuilder).build)

    /**
     * @param nameConstraints Describes the X.509 name constraints extension.
     * @return builder
     */
    inline def nameConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigNameConstraintsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigNameConstraintsArgs.builder
      builder.nameConstraints(args(argsBuilder).build)

    /**
     * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * @return builder
     */
    inline def policyIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigPolicyIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigPolicyIdArgs.builder
      builder.policyIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs.Builder)
    /**
     * @param baseKeyUsage Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def baseKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageBaseKeyUsageArgs.builder
      builder.baseKeyUsage(args(argsBuilder).build)

    /**
     * @param extendedKeyUsage Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def extendedKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageExtendedKeyUsageArgs.builder
      builder.extendedKeyUsage(args(argsBuilder).build)

    /**
     * @param unknownExtendedKeyUsages An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * @return builder
     */
    inline def unknownExtendedKeyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs.builder
      builder.unknownExtendedKeyUsages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.AuthorityState.Builder)
    /**
     * @param accessUrls URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * Structure is documented below.
     * @return builder
     */
    inline def accessUrls(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityAccessUrlArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityState.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityAccessUrlArgs.builder
      builder.accessUrls(args.map(_(argsBuilder).build)*)

    /**
     * @param config The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param keySpec Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority
     * is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA
     * certificate. Otherwise, it is used to sign a CSR.
     * Structure is documented below.
     * @return builder
     */
    inline def keySpec(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityKeySpecArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityKeySpecArgs.builder
      builder.keySpec(args(argsBuilder).build)

    /**
     * @param subordinateConfig If this is a subordinate CertificateAuthority, this field will be set
     * with the subordinate configuration, which describes its issuers.
     * Structure is documented below.
     * @return builder
     */
    inline def subordinateConfig(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigArgs.builder
      builder.subordinateConfig(args(argsBuilder).build)

    /**
     * @param userDefinedAccessUrls Custom URLs for accessing content published by this CA, such as the CA certificate and CRLs,
     * that can be specified by users.
     * Structure is documented below.
     * @return builder
     */
    inline def userDefinedAccessUrls(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthorityUserDefinedAccessUrlsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthorityState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthorityUserDefinedAccessUrlsArgs.builder
      builder.userDefinedAccessUrls(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigArgs.Builder)
    /**
     * @param pemIssuerChain Contains the PEM certificate chain for the issuers of this CertificateAuthority,
     * but not pem certificate for this CA itself.
     * Structure is documented below.
     * @return builder
     */
    inline def pemIssuerChain(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigPemIssuerChainArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.AuthoritySubordinateConfigPemIssuerChainArgs.builder
      builder.pemIssuerChain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeArgs.Builder)
    /**
     * @param ellipticCurve Represents an allowed Elliptic Curve key type.
     * Structure is documented below.
     * @return builder
     */
    inline def ellipticCurve(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs.builder
      builder.ellipticCurve(args(argsBuilder).build)

    /**
     * @param rsa Describes an RSA key that may be used in a Certificate issued from a CaPool.
     * Structure is documented below.
     * @return builder
     */
    inline def rsa(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeRsaArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeRsaArgs.builder
      builder.rsa(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.Builder)
    /**
     * @param allowedIssuanceModes IssuanceModes specifies the allowed ways in which Certificates may be requested from this CaPool.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedIssuanceModes(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedIssuanceModesArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedIssuanceModesArgs.builder
      builder.allowedIssuanceModes(args(argsBuilder).build)

    /**
     * @param allowedKeyTypes If any AllowedKeyType is specified, then the certificate request&#39;s public key must match one of the key types listed here.
     * Otherwise, any key may be used. You can specify only one key type of those listed here.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedKeyTypes(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyAllowedKeyTypeArgs.builder
      builder.allowedKeyTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param baselineValues A set of X.509 values that will be applied to all certificates issued through this CaPool. If a certificate request
     * includes conflicting values for the same properties, they will be overwritten by the values defined here. If a certificate
     * request uses a CertificateTemplate that defines conflicting predefinedValues for the same properties, the certificate
     * issuance request will fail.
     * Structure is documented below.
     * @return builder
     */
    inline def baselineValues(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.builder
      builder.baselineValues(args(argsBuilder).build)

    /**
     * @param identityConstraints Describes constraints on identities that may appear in Certificates issued through this CaPool.
     * If this is omitted, then this CaPool will not add restrictions on a certificate&#39;s identity.
     * Structure is documented below.
     * @return builder
     */
    inline def identityConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsArgs.builder
      builder.identityConstraints(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs.Builder)
    /**
     * @param objectId Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def objectId(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionObjectIdArgs.builder
      builder.objectId(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.Builder)
    /**
     * @param additionalExtensions Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesAdditionalExtensionArgs.builder
      builder.additionalExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param caOptions Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def caOptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesCaOptionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesCaOptionsArgs.builder
      builder.caOptions(args(argsBuilder).build)

    /**
     * @param keyUsage Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def keyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs.builder
      builder.keyUsage(args(argsBuilder).build)

    /**
     * @param nameConstraints Describes the X.509 name constraints extension.
     * Structure is documented below.
     * @return builder
     */
    inline def nameConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesNameConstraintsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesNameConstraintsArgs.builder
      builder.nameConstraints(args(argsBuilder).build)

    /**
     * @param policyIds Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * @return builder
     */
    inline def policyIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesPolicyIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesPolicyIdArgs.builder
      builder.policyIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs.Builder)
    /**
     * @param baseKeyUsage Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def baseKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsageArgs.builder
      builder.baseKeyUsage(args(argsBuilder).build)

    /**
     * @param extendedKeyUsage Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def extendedKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageExtendedKeyUsageArgs.builder
      builder.extendedKeyUsage(args(argsBuilder).build)

    /**
     * @param unknownExtendedKeyUsages An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * @return builder
     */
    inline def unknownExtendedKeyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyBaselineValuesKeyUsageUnknownExtendedKeyUsageArgs.builder
      builder.unknownExtendedKeyUsages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsArgs.Builder)
    /**
     * @param celExpression A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a
     * certificate is signed. To see the full allowed syntax and some examples,
     * see https://cloud.google.com/certificate-authority-service/docs/cel-guide
     * Structure is documented below.
     * @return builder
     */
    inline def celExpression(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsCelExpressionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyIdentityConstraintsCelExpressionArgs.builder
      builder.celExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CaPoolState.Builder)
    /**
     * @param encryptionSpec Used when customer would like to encrypt data at rest. The customer-provided key will be used
     * to encrypt the Subject, SubjectAltNames and PEM-encoded certificate fields. When unspecified,
     * customer data will remain unencrypted.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionSpec(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param issuancePolicy The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * Structure is documented below.
     * @return builder
     */
    inline def issuancePolicy(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs.builder
      builder.issuancePolicy(args(argsBuilder).build)

    /**
     * @param publishingOptions The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * Structure is documented below.
     * @return builder
     */
    inline def publishingOptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CaPoolPublishingOptionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CaPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CaPoolPublishingOptionsArgs.builder
      builder.publishingOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder)
    /**
     * @param authorityKeyIds (Output)
     * Identifies the subjectKeyId of the parent certificate, per https://tools.ietf.org/html/rfc5280#section-4.2.1.1
     * Structure is documented below.
     * @return builder
     */
    inline def authorityKeyIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionAuthorityKeyIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionAuthorityKeyIdArgs.builder
      builder.authorityKeyIds(args.map(_(argsBuilder).build)*)

    /**
     * @param certFingerprints (Output)
     * The hash of the x.509 certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def certFingerprints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionCertFingerprintArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionCertFingerprintArgs.builder
      builder.certFingerprints(args.map(_(argsBuilder).build)*)

    /**
     * @param publicKeys (Output)
     * A PublicKey describes a public key.
     * Structure is documented below.
     * @return builder
     */
    inline def publicKeys(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionPublicKeyArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionPublicKeyArgs.builder
      builder.publicKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param subjectDescriptions (Output)
     * Describes some of the values in a certificate that are related to the subject and lifetime.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectDescriptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionArgs.builder
      builder.subjectDescriptions(args.map(_(argsBuilder).build)*)

    /**
     * @param subjectKeyIds (Output)
     * Provides a means of identifiying certificates that contain a particular public key, per https://tools.ietf.org/html/rfc5280#section-4.2.1.2.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectKeyIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectKeyIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectKeyIdArgs.builder
      builder.subjectKeyIds(args.map(_(argsBuilder).build)*)

    /**
     * @param x509Descriptions (Output)
     * A structured description of the issued X.509 certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def x509Descriptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.builder
      builder.x509Descriptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionArgs.Builder)
    /**
     * @param subjectAltNames (Output)
     * The subject alternative name fields.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectAltNames(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs.builder
      builder.subjectAltNames(args.map(_(argsBuilder).build)*)

    /**
     * @param subjects (Output)
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * @return builder
     */
    inline def subjects(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectArgs.builder
      builder.subjects(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs.Builder)
    /**
     * @param customSans (Output)
     * Contains additional subject alternative name values.
     * Structure is documented below.
     * @return builder
     */
    inline def customSans(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs.builder
      builder.customSans(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs.Builder)
    /**
     * @param obectIds (Output)
     * Describes how some of the technical fields in a certificate should be populated.
     * Structure is documented below.
     * @return builder
     */
    inline def obectIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdArgs.builder
      builder.obectIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs.Builder)
    /**
     * @param objectIds Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def objectIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtensionObjectIdArgs.builder
      builder.objectIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.Builder)
    /**
     * @param additionalExtensions (Output)
     * Describes custom X.509 extensions.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionAdditionalExtensionArgs.builder
      builder.additionalExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param caOptions (Output)
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def caOptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionCaOptionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionCaOptionArgs.builder
      builder.caOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param keyUsages (Output)
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def keyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageArgs.builder
      builder.keyUsages(args.map(_(argsBuilder).build)*)

    /**
     * @param nameConstraints (Output)
     * Describes the X.509 name constraints extension.
     * Structure is documented below.
     * @return builder
     */
    inline def nameConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionNameConstraintArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionNameConstraintArgs.builder
      builder.nameConstraints(args.map(_(argsBuilder).build)*)

    /**
     * @param policyIds (Output)
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * @return builder
     */
    inline def policyIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionPolicyIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionPolicyIdArgs.builder
      builder.policyIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageArgs.Builder)
    /**
     * @param baseKeyUsages Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def baseKeyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageBaseKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageBaseKeyUsageArgs.builder
      builder.baseKeyUsages(args.map(_(argsBuilder).build)*)

    /**
     * @param extendedKeyUsages Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def extendedKeyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageExtendedKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageExtendedKeyUsageArgs.builder
      builder.extendedKeyUsages(args.map(_(argsBuilder).build)*)

    /**
     * @param unknownExtendedKeyUsages An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * @return builder
     */
    inline def unknownExtendedKeyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageUnknownExtendedKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionX509DescriptionKeyUsageUnknownExtendedKeyUsageArgs.builder
      builder.unknownExtendedKeyUsages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.Builder)
    /**
     * @param publicKey A PublicKey describes a public key.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedConfigX509Config&#34;&gt;&lt;/a&gt;The `x509Config` block supports:
     * @return builder
     */
    inline def publicKey(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigPublicKeyArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigPublicKeyArgs.builder
      builder.publicKey(args(argsBuilder).build)

    /**
     * @param subjectConfig Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectConfig(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigArgs.builder
      builder.subjectConfig(args(argsBuilder).build)

    /**
     * @param subjectKeyId When specified this provides a custom SKI to be used in the certificate. This should only be used to maintain a SKI of an existing CA originally created outside CA service, which was not generated using method (1) described in RFC 5280 section 4.2.1.2..
     * Structure is documented below.
     * @return builder
     */
    inline def subjectKeyId(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectKeyIdArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectKeyIdArgs.builder
      builder.subjectKeyId(args(argsBuilder).build)

    /**
     * @param x509Config Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * @return builder
     */
    inline def x509Config(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.builder
      builder.x509Config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigArgs.Builder)
    /**
     * @param subject Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * @return builder
     */
    inline def subject(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

    /**
     * @param subjectAltName The subject alternative name fields.
     * Structure is documented below.
     * @return builder
     */
    inline def subjectAltName(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectAltNameArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigSubjectConfigSubjectAltNameArgs.builder
      builder.subjectAltName(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionArgs.Builder)
    /**
     * @param objectId Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def objectId(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs.builder
      builder.objectId(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.Builder)
    /**
     * @param additionalExtensions (Output)
     * Describes custom X.509 extensions.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigAdditionalExtensionArgs.builder
      builder.additionalExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param caOptions (Output)
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def caOptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigCaOptionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigCaOptionsArgs.builder
      builder.caOptions(args(argsBuilder).build)

    /**
     * @param keyUsage (Output)
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def keyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs.builder
      builder.keyUsage(args(argsBuilder).build)

    /**
     * @param nameConstraints (Output)
     * Describes the X.509 name constraints extension.
     * Structure is documented below.
     * @return builder
     */
    inline def nameConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigNameConstraintsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigNameConstraintsArgs.builder
      builder.nameConstraints(args(argsBuilder).build)

    /**
     * @param policyIds (Output)
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * @return builder
     */
    inline def policyIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigPolicyIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigPolicyIdArgs.builder
      builder.policyIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs.Builder)
    /**
     * @param baseKeyUsage Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def baseKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageBaseKeyUsageArgs.builder
      builder.baseKeyUsage(args(argsBuilder).build)

    /**
     * @param extendedKeyUsage Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def extendedKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageExtendedKeyUsageArgs.builder
      builder.extendedKeyUsage(args(argsBuilder).build)

    /**
     * @param unknownExtendedKeyUsages An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * @return builder
     */
    inline def unknownExtendedKeyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs.builder
      builder.unknownExtendedKeyUsages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateState.Builder)
    /**
     * @param certificateDescriptions Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
     * Structure is documented below.
     * @return builder
     */
    inline def certificateDescriptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionArgs.builder
      builder.certificateDescriptions(args.map(_(argsBuilder).build)*)

    /**
     * @param config The config used to create a self-signed X.509 certificate or CSR.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param revocationDetails Output only. Details regarding the revocation of this Certificate. This Certificate is
     * considered revoked if and only if this field is present.
     * Structure is documented below.
     * @return builder
     */
    inline def revocationDetails(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateRevocationDetailArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateRevocationDetailArgs.builder
      builder.revocationDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    inline def condition(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsArgs.Builder)
    /**
     * @param celExpression Optional. A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a certificate is signed. To see the full allowed syntax and some examples, see https://cloud.google.com/certificate-authority-service/docs/using-cel
     * Structure is documented below.
     * @return builder
     */
    inline def celExpression(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsCelExpressionArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsCelExpressionArgs.builder
      builder.celExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsArgs.Builder)
    /**
     * @param additionalExtensions Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with knownExtensions to determine the full set of X.509 extensions.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsAdditionalExtensionArgs.builder
      builder.additionalExtensions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs.Builder)
    /**
     * @param objectId Required. The OID for this X.509 extension.
     * Structure is documented below.
     * @return builder
     */
    inline def objectId(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs.builder
      builder.objectId(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder)
    /**
     * @param additionalExtensions Optional. Describes custom X.509 extensions.
     * Structure is documented below.
     * @return builder
     */
    inline def additionalExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionArgs.builder
      builder.additionalExtensions(args.map(_(argsBuilder).build)*)

    /**
     * @param caOptions Optional. Describes options in this X509Parameters that are relevant in a CA certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def caOptions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesCaOptionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesCaOptionsArgs.builder
      builder.caOptions(args(argsBuilder).build)

    /**
     * @param keyUsage Optional. Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * @return builder
     */
    inline def keyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageArgs.builder
      builder.keyUsage(args(argsBuilder).build)

    /**
     * @param nameConstraints Describes the X.509 name constraints extension.
     * Structure is documented below.
     * @return builder
     */
    inline def nameConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesNameConstraintsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesNameConstraintsArgs.builder
      builder.nameConstraints(args(argsBuilder).build)

    /**
     * @param policyIds Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * @return builder
     */
    inline def policyIds(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesPolicyIdArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesPolicyIdArgs.builder
      builder.policyIds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageArgs.Builder)
    /**
     * @param baseKeyUsage Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def baseKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsageArgs.builder
      builder.baseKeyUsage(args(argsBuilder).build)

    /**
     * @param extendedKeyUsage Detailed scenarios in which a key may be used.
     * Structure is documented below.
     * @return builder
     */
    inline def extendedKeyUsage(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsageArgs.builder
      builder.extendedKeyUsage(args(argsBuilder).build)

    /**
     * @param unknownExtendedKeyUsages Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * Structure is documented below.
     * @return builder
     */
    inline def unknownExtendedKeyUsages(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs.Builder]*):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageArgs.Builder =
      def argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsageArgs.builder
      builder.unknownExtendedKeyUsages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateState.Builder)
    /**
     * @param identityConstraints Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate&#39;s identity.
     * Structure is documented below.
     * @return builder
     */
    inline def identityConstraints(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsArgs.builder
      builder.identityConstraints(args(argsBuilder).build)

    /**
     * @param passthroughExtensions Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don&#39;t appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool&#39;s IssuancePolicy defines baselineValues that don&#39;t appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate&#39;s X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate&#39;s predefined_values.
     * Structure is documented below.
     * @return builder
     */
    inline def passthroughExtensions(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsArgs.builder
      builder.passthroughExtensions(args(argsBuilder).build)

    /**
     * @param predefinedValues Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool&#39;s IssuancePolicy defines conflicting baselineValues for the same properties, the certificate issuance request will fail.
     * Structure is documented below.
     * @return builder
     */
    inline def predefinedValues(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.Builder]):
        com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateState.Builder =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs.builder
      builder.predefinedValues(args(argsBuilder).build)
