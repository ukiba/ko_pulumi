package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudidentity:
  extension (builder: com.pulumi.gcp.cloudidentity.GroupArgs.Builder)
    /**
     * @param groupKey EntityKey of the Group.
     *  Structure is documented below.
     * @return builder
     */
    def groupKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.GroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.builder
      builder.groupKey(args(argsBuilder).build)

  /**
   * A Cloud Identity resource representing a Group.
   * 
   *  To get more information about Group, see:
   * 
   *  * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/identity/docs/how-to/setup)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the Cloud Identity API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudidentity.GroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudidentity.GroupArgs.builder
    com.pulumi.gcp.cloudidentity.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CloudidentityFunctions = com.pulumi.gcp.cloudidentity.CloudidentityFunctions
  object CloudidentityFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.cloudidentity.CloudidentityFunctions.*
  extension (self: CloudidentityFunctions.type)
    /**
     * Use this data source to look up the resource name of a Cloud Identity Group by its [EntityKey](https://cloud.google.com/identity/docs/reference/rest/v1/EntityKey), i.e. the group&#39;s email.
     * 
     *  https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    def getGroupLookup(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupLookupResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupLookup(args(argsBuilder).build)

    /**
     * Use this data source to look up the resource name of a Cloud Identity Group by its [EntityKey](https://cloud.google.com/identity/docs/reference/rest/v1/EntityKey), i.e. the group&#39;s email.
     * 
     *  https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    def getGroupLookupPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupLookupResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupLookupPlain(args(argsBuilder).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group.
     * 
     *  https://cloud.google.com/identity/docs/concepts/overview#memberships
     * 
     *  To get more information about GroupMembership, see:
     * 
     *  * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    def getGroupMemberships(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupMemberships(args(argsBuilder).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group.
     * 
     *  https://cloud.google.com/identity/docs/concepts/overview#memberships
     * 
     *  To get more information about GroupMembership, see:
     * 
     *  * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    def getGroupMembershipsPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupMembershipsPlain(args(argsBuilder).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group. Whereas `gcp.cloudidentity.getGroupMemberships` returns details of only direct members of the group, `gcp.cloudidentity.getGroupTransitiveMemberships` will return details about both direct and indirect members. For example, a user is an indirect member of Group A if the user is a direct member of Group B and Group B is a direct member of Group A.
     * 
     *  To get more information about TransitiveGroupMembership, see:
     * 
     *  * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships/searchTransitiveMemberships)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    def getGroupTransitiveMemberships(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupTransitiveMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupTransitiveMemberships(args(argsBuilder).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group. Whereas `gcp.cloudidentity.getGroupMemberships` returns details of only direct members of the group, `gcp.cloudidentity.getGroupTransitiveMemberships` will return details about both direct and indirect members. For example, a user is an indirect member of Group A if the user is a direct member of Group B and Group B is a direct member of Group A.
     * 
     *  To get more information about TransitiveGroupMembership, see:
     * 
     *  * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships/searchTransitiveMemberships)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    def getGroupTransitiveMembershipsPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupTransitiveMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupTransitiveMembershipsPlain(args(argsBuilder).build)

    /**
     * Use this data source to get list of the Cloud Identity Groups under a customer or namespace.
     * 
     *  https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    def getGroups(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupsArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroups(args(argsBuilder).build)

    /**
     * Use this data source to get list of the Cloud Identity Groups under a customer or namespace.
     * 
     *  https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    def getGroupsPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupsPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupsPlain(args(argsBuilder).build)

    /** Use this data source to list Cloud Identity policies. */
    def getPolicies(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPoliciesArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPolicies(args(argsBuilder).build)

    /** Use this data source to list Cloud Identity policies. */
    def getPoliciesPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPoliciesPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPoliciesPlain(args(argsBuilder).build)

    /** Use this data source to retrieve a Cloud Identity policy. */
    def getPolicy(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPolicyArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPolicy(args(argsBuilder).build)

    /** Use this data source to retrieve a Cloud Identity policy. */
    def getPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPolicyPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder)
    /**
     * @param memberKey (Optional, Beta)
     *  EntityKey of the member.
     *  Structure is documented below.
     * @return builder
     */
    def memberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.builder
      builder.memberKey(args(argsBuilder).build)

    /**
     * @param preferredMemberKey EntityKey of the member.
     *  Structure is documented below.
     * @return builder
     */
    def preferredMemberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.builder
      builder.preferredMemberKey(args(argsBuilder).build)

    /**
     * @param roles The MembershipRoles that apply to the Membership.
     *  Must not contain duplicate MembershipRoles with the same name.
     *  Structure is documented below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder]*):
        com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

  /**
   * A Membership defines a relationship between a Group and an entity belonging to that Group, referred to as a &#34;member&#34;.
   * 
   *  To get more information about GroupMembership, see:
   * 
   *  * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the Cloud Identity API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudidentity.GroupMembershipArgs.builder
    com.pulumi.gcp.cloudidentity.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.PolicyArgs.Builder)
    /**
     * @param policyQuery The PolicyQuery the Setting applies to.
     *  Structure is documented below.
     * @return builder
     */
    def policyQuery(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.Builder]):
        com.pulumi.gcp.cloudidentity.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.builder
      builder.policyQuery(args(argsBuilder).build)

    /**
     * @param setting The Setting configured by this Policy.
     *  Structure is documented below.
     * @return builder
     */
    def setting(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.Builder]):
        com.pulumi.gcp.cloudidentity.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.builder
      builder.setting(args(argsBuilder).build)

  /**
   * A Cloud Identity Policy binds a Setting to a PolicyQuery for a Google Workspace / Cloud Identity customer.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Policy, see:
   * 
   *  * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1beta1/policies)
   *  * How-to Guides
   *      * [Policy API overview](https://docs.cloud.google.com/identity/docs/concepts/overview-policies)
   * 
   *  &gt; **Note:** This is available only in beta
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudidentity.PolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudidentity.PolicyArgs.builder
    com.pulumi.gcp.cloudidentity.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GroupState.Builder)
    /**
     * @param additionalGroupKeys Additional group keys associated with the Group
     *  Structure is documented below.
     * @return builder
     */
    def additionalGroupKeys(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupAdditionalGroupKeyArgs.Builder]*):
        com.pulumi.gcp.cloudidentity.inputs.GroupState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupAdditionalGroupKeyArgs.builder
      builder.additionalGroupKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param groupKey EntityKey of the Group.
     *  Structure is documented below.
     * @return builder
     */
    def groupKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupGroupKeyArgs.builder
      builder.groupKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.Builder)
    /**
     * @param groupKey The EntityKey of the Group to lookup. A unique identifier for an entity in the Cloud Identity Groups API.
     *  An entity can represent either a group with an optional namespace or a user without a namespace.
     *  The combination of id and namespace must be unique; however, the same id can be used with different namespaces. Structure is documented below.
     * @return builder
     */
    def groupKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupGroupKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupGroupKeyArgs.builder
      builder.groupKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.PolicyState.Builder)
    /**
     * @param policyQuery The PolicyQuery the Setting applies to.
     *  Structure is documented below.
     * @return builder
     */
    def policyQuery(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicyPolicyQueryArgs.builder
      builder.policyQuery(args(argsBuilder).build)

    /**
     * @param setting The Setting configured by this Policy.
     *  Structure is documented below.
     * @return builder
     */
    def setting(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.PolicySettingArgs.builder
      builder.setting(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder)
    /**
     * @param expiryDetail The MembershipRole expiry details, only supported for MEMBER role.
     *  Other roles cannot be accompanied with MEMBER role having expiry.
     *  Structure is documented below.
     * @return builder
     */
    def expiryDetail(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleExpiryDetailArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleExpiryDetailArgs.builder
      builder.expiryDetail(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder)
    /**
     * @param memberKey (Optional, Beta)
     *  EntityKey of the member.
     *  Structure is documented below.
     * @return builder
     */
    def memberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs.builder
      builder.memberKey(args(argsBuilder).build)

    /**
     * @param preferredMemberKey EntityKey of the member.
     *  Structure is documented below.
     * @return builder
     */
    def preferredMemberKey(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.Builder]):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs.builder
      builder.preferredMemberKey(args(argsBuilder).build)

    /**
     * @param roles The MembershipRoles that apply to the Membership.
     *  Must not contain duplicate MembershipRoles with the same name.
     *  Structure is documented below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.Builder]*):
        com.pulumi.gcp.cloudidentity.inputs.GroupMembershipState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)
