package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudidentity:
  object CloudidentityFunctions:
    /**
     * Use this data source to look up the resource name of a Cloud Identity Group by its [EntityKey](https://cloud.google.com/identity/docs/reference/rest/v1/EntityKey), i.e. the group&#39;s email.
     * 
     * https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    inline def getGroupLookup(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupLookupResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupLookup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to look up the resource name of a Cloud Identity Group by its [EntityKey](https://cloud.google.com/identity/docs/reference/rest/v1/EntityKey), i.e. the group&#39;s email.
     * 
     * https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    inline def getGroupLookupPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupLookupResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupLookupPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupLookupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group.
     * 
     * https://cloud.google.com/identity/docs/concepts/overview#memberships
     * 
     * To get more information about GroupMembership, see:
     * 
     * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    inline def getGroupMemberships(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupMemberships(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group.
     * 
     * https://cloud.google.com/identity/docs/concepts/overview#memberships
     * 
     * To get more information about GroupMembership, see:
     * 
     * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    inline def getGroupMembershipsPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupMembershipsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group. Whereas `gcp.cloudidentity.getGroupMemberships` returns details of only direct members of the group, `gcp.cloudidentity.getGroupTransitiveMemberships` will return details about both direct and indirect members. For example, a user is an indirect member of Group A if the user is a direct member of Group B and Group B is a direct member of Group A.
     * 
     * To get more information about TransitiveGroupMembership, see:
     * 
     * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships/searchTransitiveMemberships)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    inline def getGroupTransitiveMemberships(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupTransitiveMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupTransitiveMemberships(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get list of the Cloud Identity Group Memberships within a given Group. Whereas `gcp.cloudidentity.getGroupMemberships` returns details of only direct members of the group, `gcp.cloudidentity.getGroupTransitiveMemberships` will return details about both direct and indirect members. For example, a user is an indirect member of Group A if the user is a direct member of Group B and Group B is a direct member of Group A.
     * 
     * To get more information about TransitiveGroupMembership, see:
     * 
     * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships/searchTransitiveMemberships)
     * * How-to Guides
     *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
     */
    inline def getGroupTransitiveMembershipsPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupTransitiveMembershipsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupTransitiveMembershipsPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupTransitiveMembershipsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get list of the Cloud Identity Groups under a customer or namespace.
     * 
     * https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    inline def getGroups(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupsArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroups(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get list of the Cloud Identity Groups under a customer or namespace.
     * 
     * https://cloud.google.com/identity/docs/concepts/overview#groups
     */
    inline def getGroupsPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetGroupsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetGroupsResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetGroupsPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getGroupsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to list Cloud Identity policies. */
    inline def getPolicies(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPoliciesArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to list Cloud Identity policies. */
    inline def getPoliciesPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPoliciesPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to retrieve a Cloud Identity policy. */
    inline def getPolicy(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudidentity.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPolicyArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to retrieve a Cloud Identity policy. */
    inline def getPolicyPlain(args: Endofunction[com.pulumi.gcp.cloudidentity.inputs.GetPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudidentity.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.gcp.cloudidentity.inputs.GetPolicyPlainArgs.builder
      com.pulumi.gcp.cloudidentity.CloudidentityFunctions.getPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * A Cloud Identity resource representing a Group.
   * 
   * To get more information about Group, see:
   * 
   * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1beta1/groups)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/setup)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the Cloud Identity API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudidentity.GroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudidentity.GroupArgs.builder
    com.pulumi.gcp.cloudidentity.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Membership defines a relationship between a Group and an entity belonging to that Group, referred to as a &#34;member&#34;.
   * 
   * To get more information about GroupMembership, see:
   * 
   * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1/groups.memberships)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/identity/docs/how-to/memberships-google-groups)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the Cloud Identity API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudidentity.GroupMembershipArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudidentity.GroupMembershipArgs.builder
    com.pulumi.gcp.cloudidentity.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Cloud Identity Policy binds a Setting to a PolicyQuery for a Google Workspace / Cloud Identity customer.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Policy, see:
   * 
   * * [API documentation](https://cloud.google.com/identity/docs/reference/rest/v1beta1/policies)
   * * How-to Guides
   *     * [Policy API overview](https://docs.cloud.google.com/identity/docs/concepts/overview-policies)
   * 
   * &gt; **Note:** This is available only in beta
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudidentity.PolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudidentity.PolicyArgs.builder
    com.pulumi.gcp.cloudidentity.Policy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
