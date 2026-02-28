package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object organizations:
  /** Provides a resource to create an organizational unit. */
  def OrganizationalUnit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.OrganizationalUnitArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.OrganizationalUnitArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.organizations.OrganizationalUnit(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an individual Organizations resource tag. This resource should only be used in cases where Organizations resources are created outside Terraform (e.g., Organizations Accounts implicitly created by AWS Control Tower).
   *  
   *  &gt; **NOTE:** This tagging resource should not be combined with the Terraform resource for managing the parent resource. For example, using `aws.organizations.Account` and `aws.organizations.Tag` to manage tags of the same Organizations account will cause a perpetual difference where the `aws.organizations.Account` resource will try to remove the tag being added by the `aws.organizations.Tag` resource. However, if the parent resource is created in the same configuration (i.e., if you have no other choice), you should add `ignoreChanges = [tags]` in the parent resource&#39;s lifecycle block. This ensures that Terraform ignores differences in tags managed via the separate tagging resource, avoiding the perpetual difference mentioned above.
   *  
   *  &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.TagArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.organizations.TagArgs.builder
    
    com.pulumi.aws.organizations.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create an organization.
   *  
   *  !&gt; **WARNING:** When migrating from a `featureSet` of `CONSOLIDATED_BILLING` to `ALL`, the Organization account owner will received an email stating the following: &#34;You started the process to enable all features for your AWS organization. As part of that process, all member accounts that joined your organization by invitation must approve the change. You don\u2019t need approval from member accounts that you directly created from within your AWS organization.&#34; After all member accounts have accepted the invitation, the Organization account owner must then finalize the changes via the [AWS Console](https://console.aws.amazon.com/organizations/home#/organization/settings/migration-progress). Until these steps are performed, the provider will perpetually show a difference, and the `DescribeOrganization` API will continue to show the `FeatureSet` as `CONSOLIDATED_BILLING`. See the [AWS Organizations documentation](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html) for more information.
   *  
   *  !&gt; **WARNING:** [Warning from the AWS Docs](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html): &#34;We recommend that you enable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the service is aware that it can create the resources that are required for the integration. How the service creates those resources in the organization&#39;s accounts depends on that service. For more information, see the documentation for the other AWS service.&#34;
   */
  def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.OrganizationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.organizations.OrganizationArgs.builder
    
    com.pulumi.aws.organizations.Organization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to attach an AWS Organizations policy to an organization account, root, or unit. */
  def PolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.PolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.organizations.PolicyAttachmentArgs.builder
    
    com.pulumi.aws.organizations.PolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [AWS Organizations Delegated Administrator](https://docs.aws.amazon.com/organizations/latest/APIReference/API_RegisterDelegatedAdministrator.html). */
  def DelegatedAdministrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.DelegatedAdministratorArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.organizations.DelegatedAdministratorArgs.builder
    
    com.pulumi.aws.organizations.DelegatedAdministrator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage a resource-based delegation policy that can be used to delegate policy management for AWS Organizations to specified member accounts to perform policy actions that are by default available only to the management account. See the [_AWS Organizations User Guide_](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_delegate_policies.html) for more information. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.ResourcePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.ResourcePolicyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.organizations.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource to create a member account in the current organization.
   *  
   *  &gt; **Note:** Account management must be done from the organization&#39;s root account.
   *  
   *  &gt; **Note:** By default, deleting this resource will only remove an AWS account from an organization. You must set the `closeOnDeletion` flag to true to close the account. It is worth noting that quotas are enforced when using the `closeOnDeletion` argument, which can produce a [CLOSE_ACCOUNT_QUOTA_EXCEEDED](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CloseAccount.html) error, and require you to close the account manually.
   */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.AccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.AccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.organizations.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type OrganizationsFunctions = com.pulumi.aws.organizations.OrganizationsFunctions
  object OrganizationsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.organizations.OrganizationsFunctions.*
  extension (self: OrganizationsFunctions.type)
    /** Get information about an account in an organization. */
    def getAccount(args: Endofunction[com.pulumi.aws.organizations.inputs.GetAccountArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetAccountArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getAccount(args(argsBuilder).build)

    /** Get information about an account in an organization. */
    def getAccountPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetAccountPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetAccountPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getAccountPlain(args(argsBuilder).build)

    /** Get a list of AWS accounts that are designated as delegated administrators in this organization */
    def getDelegatedAdministrators(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedAdministrators(args(argsBuilder).build)

    /** Get a list of AWS accounts that are designated as delegated administrators in this organization */
    def getDelegatedAdministratorsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedAdministratorsPlain(args(argsBuilder).build)

    /** Get a list the AWS services for which the specified account is a delegated administrator */
    def getDelegatedServices(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetDelegatedServicesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedServices(args(argsBuilder).build)

    /** Get a list the AWS services for which the specified account is a delegated administrator */
    def getDelegatedServicesPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedServicesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetDelegatedServicesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedServicesPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedServicesPlain(args(argsBuilder).build)

    /** Get the [entity path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_last-accessed-viewing-orgs-entity-path) for an entity. An entity&#39;s path is the text representation of the structure of that AWS Organizations entity. */
    def getEntityPath(args: Endofunction[com.pulumi.aws.organizations.inputs.GetEntityPathArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetEntityPathResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetEntityPathArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getEntityPath(args(argsBuilder).build)

    /** Get the [entity path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_last-accessed-viewing-orgs-entity-path) for an entity. An entity&#39;s path is the text representation of the structure of that AWS Organizations entity. */
    def getEntityPathPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetEntityPathPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetEntityPathResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetEntityPathPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getEntityPathPlain(args(argsBuilder).build)

    /** Get information about the organization that the users account belongs to. */
    def getOrganization(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganization(args(argsBuilder).build)

    /** Get information about the organization that the users account belongs to. */
    def getOrganizationPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationPlain(args(argsBuilder).build)

    /** Data source for getting an AWS Organizations Organizational Unit. */
    def getOrganizationalUnit(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnit(args(argsBuilder).build)

    /** Data source for getting an AWS Organizations Organizational Unit. */
    def getOrganizationalUnitPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitPlain(args(argsBuilder).build)

    /** Get all direct child accounts under a parent organizational unit. This only provides immediate children, not all children. */
    def getOrganizationalUnitChildAccounts(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitChildAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitChildAccounts(args(argsBuilder).build)

    /** Get all direct child accounts under a parent organizational unit. This only provides immediate children, not all children. */
    def getOrganizationalUnitChildAccountsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitChildAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitChildAccountsPlain(args(argsBuilder).build)

    /** Get all direct child accounts under a parent organizational unit. This provides all children. */
    def getOrganizationalUnitDescendantAccounts(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantAccounts(args(argsBuilder).build)

    /** Get all direct child accounts under a parent organizational unit. This provides all children. */
    def getOrganizationalUnitDescendantAccountsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantAccountsPlain(args(argsBuilder).build)

    /** Get all direct child organizational units under a parent organizational unit. This provides all children. */
    def getOrganizationalUnitDescendantOrganizationalUnits(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantOrganizationalUnits(args(argsBuilder).build)

    /** Get all direct child organizational units under a parent organizational unit. This provides all children. */
    def getOrganizationalUnitDescendantOrganizationalUnitsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantOrganizationalUnitsPlain(args(argsBuilder).build)

    /** Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children. */
    def getOrganizationalUnits(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnits(args(argsBuilder).build)

    /** Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children. */
    def getOrganizationalUnitsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitsPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Organizations Policies. */
    def getPolicies(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPolicies(args(argsBuilder).build)

    /** Data source for managing an AWS Organizations Policies. */
    def getPoliciesPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPoliciesPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Organizations Policies For Target. */
    def getPoliciesForTarget(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesForTargetArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetPoliciesForTargetResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesForTargetArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPoliciesForTarget(args(argsBuilder).build)

    /** Data source for managing an AWS Organizations Policies For Target. */
    def getPoliciesForTargetPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesForTargetPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetPoliciesForTargetResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesForTargetPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPoliciesForTargetPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Organizations Policy. */
    def getPolicy(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPolicyArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPolicy(args(argsBuilder).build)

    /** Data source for managing an AWS Organizations Policy. */
    def getPolicyPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPolicyPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPolicyPlain(args(argsBuilder).build)

    /** Get tags attached to the specified AWS Organizations resource. */
    def getResourceTags(args: Endofunction[com.pulumi.aws.organizations.inputs.GetResourceTagsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetResourceTagsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetResourceTagsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getResourceTags(args(argsBuilder).build)

    /** Get tags attached to the specified AWS Organizations resource. */
    def getResourceTagsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetResourceTagsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetResourceTagsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetResourceTagsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getResourceTagsPlain(args(argsBuilder).build)

  /** Provides a resource to manage an [AWS Organizations policy](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html). */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.organizations.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.organizations.inputs.OrganizationalUnitState.Builder)
    /**
     * @param accounts List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
     * @return builder
     */
    def accounts(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationalUnitAccountArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationalUnitState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationalUnitAccountArgs.builder
      builder.accounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.organizations.inputs.OrganizationState.Builder)
    /**
     * @param accounts List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
     * @return builder
     */
    def accounts(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationAccountArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationAccountArgs.builder
      builder.accounts(args.map(_(argsBuilder).build)*)

    /**
     * @param nonMasterAccounts List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * @return builder
     */
    def nonMasterAccounts(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationNonMasterAccountArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationNonMasterAccountArgs.builder
      builder.nonMasterAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param roots List of organization roots. All elements have these attributes:
     * @return builder
     */
    def roots(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationRootArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationRootArgs.builder
      builder.roots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.organizations.inputs.OrganizationRootArgs.Builder)
    /**
     * @param policyTypes List of policy types enabled for this root. All elements have these attributes:
     * @return builder
     */
    def policyTypes(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationRootPolicyTypeArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationRootArgs.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationRootPolicyTypeArgs.builder
      builder.policyTypes(args.map(_(argsBuilder).build)*)
