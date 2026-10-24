package jp.ukiba.ko_pulumi
package gcp

object binaryauthorization_ext:
  extension (builder: com.pulumi.gcp.binaryauthorization.AttestorArgs.Builder)
    /**
     * @param attestationAuthorityNote A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     * Structure is documented below.
     * @return builder
     */
    inline def attestationAuthorityNote(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.AttestorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.builder
      builder.attestationAuthorityNote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.AttestorIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.AttestorIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder)
    /**
     * @param admissionWhitelistPatterns A whitelist of image patterns to exclude from admission rules. If an
     * image&#39;s name matches a whitelist pattern, the image&#39;s admission
     * requests will always be permitted regardless of your admission rules.
     * Structure is documented below.
     * @return builder
     */
    inline def admissionWhitelistPatterns(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.builder
      builder.admissionWhitelistPatterns(args.map(_(argsBuilder).build)*)

    /**
     * @param clusterAdmissionRules Per-cluster admission rules. An admission rule specifies either that
     * all container images used in a pod creation request must be attested
     * to by one or more attestors, that all pod creations will be allowed,
     * or that all pod creations will be denied. There can be at most one
     * admission rule per cluster spec.
     * Identifier format: `{{location}}.{{clusterId}}`.
     * A location is either a compute zone (e.g. `us-central1-a`) or a region
     * (e.g. `us-central1`).
     * Structure is documented below.
     * @return builder
     */
    inline def clusterAdmissionRules(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.builder
      builder.clusterAdmissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultAdmissionRule Default admission rule for a cluster without a per-cluster admission
     * rule.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultAdmissionRule(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.builder
      builder.defaultAdmissionRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder)
    /**
     * @param publicKeys Public keys that verify attestations signed by this attestor. This
     * field may be updated.
     * If this field is non-empty, one of the specified public keys must
     * verify that an attestation was signed by this attestor for the
     * image specified in the admission request.
     * If this field is empty, this attestor always returns that no valid
     * attestations exist.
     * Structure is documented below.
     * @return builder
     */
    inline def publicKeys(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.builder
      builder.publicKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.Builder)
    /**
     * @param pkixPublicKey A raw PKIX SubjectPublicKeyInfo format public key.
     * NOTE: id may be explicitly provided by the caller when using this
     * type of public key, but it MUST be a valid RFC3986 URI. If id is left
     * blank, a default one will be computed based on the digest of the DER
     * encoding of the public key.
     * Structure is documented below.
     * @return builder
     */
    inline def pkixPublicKey(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNotePublicKeyPkixPublicKeyArgs.builder
      builder.pkixPublicKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.AttestorState.Builder)
    /**
     * @param attestationAuthorityNote A Container Analysis ATTESTATION_AUTHORITY Note, created by the user.
     * Structure is documented below.
     * @return builder
     */
    inline def attestationAuthorityNote(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.AttestorState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.AttestorAttestationAuthorityNoteArgs.builder
      builder.attestationAuthorityNote(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder)
    /**
     * @param admissionWhitelistPatterns A whitelist of image patterns to exclude from admission rules. If an
     * image&#39;s name matches a whitelist pattern, the image&#39;s admission
     * requests will always be permitted regardless of your admission rules.
     * Structure is documented below.
     * @return builder
     */
    inline def admissionWhitelistPatterns(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyAdmissionWhitelistPatternArgs.builder
      builder.admissionWhitelistPatterns(args.map(_(argsBuilder).build)*)

    /**
     * @param clusterAdmissionRules Per-cluster admission rules. An admission rule specifies either that
     * all container images used in a pod creation request must be attested
     * to by one or more attestors, that all pod creations will be allowed,
     * or that all pod creations will be denied. There can be at most one
     * admission rule per cluster spec.
     * Identifier format: `{{location}}.{{clusterId}}`.
     * A location is either a compute zone (e.g. `us-central1-a`) or a region
     * (e.g. `us-central1`).
     * Structure is documented below.
     * @return builder
     */
    inline def clusterAdmissionRules(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.Builder]*):
        com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyClusterAdmissionRuleArgs.builder
      builder.clusterAdmissionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultAdmissionRule Default admission rule for a cluster without a per-cluster admission
     * rule.
     * Structure is documented below.
     * @return builder
     */
    inline def defaultAdmissionRule(args: Endofunction[com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.Builder]):
        com.pulumi.gcp.binaryauthorization.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.binaryauthorization.inputs.PolicyDefaultAdmissionRuleArgs.builder
      builder.defaultAdmissionRule(args(argsBuilder).build)
