package jp.ukiba.ko_pulumi
package gcp

object cloudidentity_ext:
  extension (builder: com.pulumi.gcp.cloudidentity.GroupArgs.Builder)
    /**
     * @param groupKey EntityKey of the Group.
     * Structure is documented below.
     * @return builder
     */
    inline def groupKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.GroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.builder
      builder.groupKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder)
    /**
     * @param memberKey (Optional, Beta)
     * EntityKey of the member.
     * Structure is documented below.
     * @return builder
     */
    inline def memberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.builder
      builder.memberKey(args(argsBuilder).build)

    /**
     * @param preferredMemberKey EntityKey of the member.
     * Structure is documented below.
     * @return builder
     */
    inline def preferredMemberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.builder
      builder.preferredMemberKey(args(argsBuilder).build)

    /**
     * @param roles The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * @return builder
     */
    inline def roles(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder]*):
        com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudidentity.PolicyArgs.Builder)
    /**
     * @param policyQuery The PolicyQuery the Setting applies to.
     * Structure is documented below.
     * @return builder
     */
    inline def policyQuery(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.Builder]):
        com.pulumi.gcp.cloudidentity.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.builder
      builder.policyQuery(args(argsBuilder).build)

    /**
     * @param setting The Setting configured by this Policy.
     * Structure is documented below.
     * @return builder
     */
    inline def setting(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.Builder]):
        com.pulumi.gcp.cloudidentity.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.builder
      builder.setting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.Builder)
    /**
     * @param groupKey The EntityKey of the Group to lookup. A unique identifier for an entity in the Cloud Identity Groups API.
     * An entity can represent either a group with an optional namespace or a user without a namespace.
     * The combination of id and namespace must be unique; however, the same id can be used with different namespaces. Structure is documented below.
     * @return builder
     */
    inline def groupKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupGroupKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupGroupKeyArgs.builder
      builder.groupKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupPlainArgs.Builder)
    /**
     * @param groupKey The EntityKey of the Group to lookup. A unique identifier for an entity in the Cloud Identity Groups API.
     * An entity can represent either a group with an optional namespace or a user without a namespace.
     * The combination of id and namespace must be unique; however, the same id can be used with different namespaces. Structure is documented below.
     * @return builder
     */
    inline def groupKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupGroupKey.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupPlainArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupGroupKey.builder
      builder.groupKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder)
    /**
     * @param expiryDetail The MembershipRole expiry details, only supported for MEMBER role.
     * Other roles cannot be accompanied with MEMBER role having expiry.
     * Structure is documented below.
     * @return builder
     */
    inline def expiryDetail(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleExpiryDetailArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleExpiryDetailArgs.builder
      builder.expiryDetail(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder)
    /**
     * @param memberKey (Optional, Beta)
     * EntityKey of the member.
     * Structure is documented below.
     * @return builder
     */
    inline def memberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.builder
      builder.memberKey(args(argsBuilder).build)

    /**
     * @param preferredMemberKey EntityKey of the member.
     * Structure is documented below.
     * @return builder
     */
    inline def preferredMemberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.builder
      builder.preferredMemberKey(args(argsBuilder).build)

    /**
     * @param roles The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * @return builder
     */
    inline def roles(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder]*):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GroupState.Builder)
    /**
     * @param additionalGroupKeys Additional group keys associated with the Group
     * Structure is documented below.
     * @return builder
     */
    inline def additionalGroupKeys(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupAdditionalGroupKeyArgs.Builder]*):
        com.pulumi.gcp.cloudidentity.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupAdditionalGroupKeyArgs.builder
      builder.additionalGroupKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param groupKey EntityKey of the Group.
     * Structure is documented below.
     * @return builder
     */
    inline def groupKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.builder
      builder.groupKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.PolicyState.Builder)
    /**
     * @param policyQuery The PolicyQuery the Setting applies to.
     * Structure is documented below.
     * @return builder
     */
    inline def policyQuery(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.builder
      builder.policyQuery(args(argsBuilder).build)

    /**
     * @param setting The Setting configured by this Policy.
     * Structure is documented below.
     * @return builder
     */
    inline def setting(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.builder
      builder.setting(args(argsBuilder).build)
