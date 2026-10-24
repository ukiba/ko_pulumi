package jp.ukiba.ko_pulumi
package gcp

object containeranalysis_ext:
  extension (builder: com.pulumi.gcp.containeranalysis.NoteArgs.Builder)
    /**
     * @param attestationAuthority Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
     * For example, an organization might have one AttestationAuthority for
     * &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
     * grouping mechanism for the attached Occurrences (Attestations). This
     * grouping mechanism also provides a security boundary, since IAM ACLs
     * gate the ability for a principle to attach an Occurrence to a given
     * Note. It also provides a single point of lookup to find all attached
     * Attestation Occurrences, even if they don&#39;t all live in the same
     * project.
     * Structure is documented below.
     * @return builder
     */
    def attestationAuthority(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder]):
        com.pulumi.gcp.containeranalysis.NoteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.builder
      builder.attestationAuthority(args(argsBuilder).build)

    /**
     * @param relatedUrls URLs associated with this note and related metadata.
     * Structure is documented below.
     * @return builder
     */
    def relatedUrls(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.Builder]*):
        com.pulumi.gcp.containeranalysis.NoteArgs.Builder =
      def argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.builder
      builder.relatedUrls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.NoteIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.NoteIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.OccurenceArgs.Builder)
    /**
     * @param attestation Occurrence that represents a single &#34;attestation&#34;. The authenticity
     * of an attestation can be verified using the attached signature.
     * If the verifier trusts the public key of the signer, then verifying
     * the signature is sufficient to establish trust. In this circumstance,
     * the authority to which this attestation is attached is primarily
     * useful for lookup (how to find this attestation if you already
     * know the authority and artifact to be verified) and intent (for
     * which authority this attestation was intended to sign.
     * Structure is documented below.
     * @return builder
     */
    def attestation(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder]):
        com.pulumi.gcp.containeranalysis.OccurenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.builder
      builder.attestation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder)
    /**
     * @param hint This submessage provides human-readable hints about the purpose of
     * the AttestationAuthority. Because the name of a Note acts as its
     * resource reference, it is important to disambiguate the canonical
     * name of the Note (which might be a UUID for security purposes)
     * from &#34;readable&#34; names more suitable for debug output. Note that
     * these hints should NOT be used to look up AttestationAuthorities
     * in security sensitive contexts, such as when looking up
     * Attestations to verify.
     * Structure is documented below.
     * @return builder
     */
    def hint(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityHintArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityHintArgs.builder
      builder.hint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.NoteState.Builder)
    /**
     * @param attestationAuthority Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;.
     * For example, an organization might have one AttestationAuthority for
     * &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a
     * grouping mechanism for the attached Occurrences (Attestations). This
     * grouping mechanism also provides a security boundary, since IAM ACLs
     * gate the ability for a principle to attach an Occurrence to a given
     * Note. It also provides a single point of lookup to find all attached
     * Attestation Occurrences, even if they don&#39;t all live in the same
     * project.
     * Structure is documented below.
     * @return builder
     */
    def attestationAuthority(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.NoteState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteAttestationAuthorityArgs.builder
      builder.attestationAuthority(args(argsBuilder).build)

    /**
     * @param relatedUrls URLs associated with this note and related metadata.
     * Structure is documented below.
     * @return builder
     */
    def relatedUrls(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.Builder]*):
        com.pulumi.gcp.containeranalysis.inputs.NoteState.Builder =
      def argsBuilder = com.pulumi.gcp.containeranalysis.inputs.NoteRelatedUrlArgs.builder
      builder.relatedUrls(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder)
    /**
     * @param signatures One or more signatures over serializedPayload.
     * Verifier implementations should consider this attestation
     * message verified if at least one signature verifies
     * serializedPayload. See Signature in common.proto for more
     * details on signature structure and verification.
     * Structure is documented below.
     * @return builder
     */
    def signatures(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureArgs.Builder]*):
        com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationSignatureArgs.builder
      builder.signatures(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.containeranalysis.inputs.OccurenceState.Builder)
    /**
     * @param attestation Occurrence that represents a single &#34;attestation&#34;. The authenticity
     * of an attestation can be verified using the attached signature.
     * If the verifier trusts the public key of the signer, then verifying
     * the signature is sufficient to establish trust. In this circumstance,
     * the authority to which this attestation is attached is primarily
     * useful for lookup (how to find this attestation if you already
     * know the authority and artifact to be verified) and intent (for
     * which authority this attestation was intended to sign.
     * Structure is documented below.
     * @return builder
     */
    def attestation(args: Endofunction[com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.Builder]):
        com.pulumi.gcp.containeranalysis.inputs.OccurenceState.Builder =
      val argsBuilder = com.pulumi.gcp.containeranalysis.inputs.OccurenceAttestationArgs.builder
      builder.attestation(args(argsBuilder).build)
