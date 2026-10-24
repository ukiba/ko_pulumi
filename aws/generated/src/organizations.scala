package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object organizations:
  /**
   * Provides a resource to create a member account in the current organization.
   * 
   * &gt; **Note:** Account management must be done from the organization&#39;s root account.
   * 
   * &gt; **Note:** By default, deleting this resource will only remove an AWS account from an organization. You must set the `closeOnDeletion` flag to true to close the account. It is worth noting that quotas are enforced when using the `closeOnDeletion` argument, which can produce a [CLOSE_ACCOUNT_QUOTA_EXCEEDED](https://docs.aws.amazon.com/organizations/latest/APIReference/API_CloseAccount.html) error, and require you to close the account manually.
   */
  inline def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.AccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.AccountArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.organizations.Account(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages trusted access between an AWS service and AWS Organizations.
   * 
   * &gt; **Note:** AWS recommends enabling and disabling trusted access for a service through the service&#39;s own console or its AWS CLI commands or API operation equivalents, rather than using this resource directly. Using the service-specific tooling ensures that the service can perform the required steps when enabling trusted access (e.g. creating any required resources) and any required clean up operations when disabling trusted access. See the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html) for more details. The complete list of AWS services that support trusted access with AWS Organizations is available in the [Services that work with Organizations](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services_list.html) page.
   * 
   * &gt; **Note:** This resource requires the Organizations management account.
   * 
   * &gt; **NOTE:** Terraform provides both this standalone AWS service access resource and exclusive service access defined in-line in the `aws.organizations.Organization` resource via the `awsServiceAccessPrincipals` argument. At this time, you cannot use the service access in conjunction with this resource otherwise it will cause a perpetual difference in plan output. You can optionally use the generic Terraform resource lifecycle configuration block with `ignoreChanges` in the `aws.organizations.Organization` resource to manage additional service access via this resource.
   */
  inline def AwsServiceAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.AwsServiceAccessArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.organizations.AwsServiceAccessArgs.builder
    com.pulumi.aws.organizations.AwsServiceAccess(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage an [AWS Organizations Delegated Administrator](https://docs.aws.amazon.com/organizations/latest/APIReference/API_RegisterDelegatedAdministrator.html). */
  inline def DelegatedAdministrator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.DelegatedAdministratorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.organizations.DelegatedAdministratorArgs.builder
    com.pulumi.aws.organizations.DelegatedAdministrator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to create an organization.
   * 
   * &gt; **WARNING:** When migrating from a `featureSet` of `CONSOLIDATED_BILLING` to `ALL`, the Organization account owner will received an email stating the following: &#34;You started the process to enable all features for your AWS organization. As part of that process, all member accounts that joined your organization by invitation must approve the change. You don\u2019t need approval from member accounts that you directly created from within your AWS organization.&#34; After all member accounts have accepted the invitation, the Organization account owner must then finalize the changes via the [AWS Console](https://console.aws.amazon.com/organizations/home#/organization/settings/migration-progress). Until these steps are performed, the provider will perpetually show a difference, and the `DescribeOrganization` API will continue to show the `FeatureSet` as `CONSOLIDATED_BILLING`. See the [AWS Organizations documentation](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html) for more information.
   * 
   * &gt; **WARNING:** [Warning from the AWS Docs](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnableAWSServiceAccess.html): &#34;We recommend that you enable integration between AWS Organizations and the specified AWS service by using the console or commands that are provided by the specified service. Doing so ensures that the service is aware that it can create the resources that are required for the integration. How the service creates those resources in the organization&#39;s accounts depends on that service. For more information, see the documentation for the other AWS service.&#34;
   */
  inline def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.OrganizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.organizations.OrganizationArgs.builder
    com.pulumi.aws.organizations.Organization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to create an organizational unit. */
  inline def OrganizationalUnit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.OrganizationalUnitArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.OrganizationalUnitArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.organizations.OrganizationalUnit(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object OrganizationsFunctions:
    /** Get information about an account in an organization. */
    inline def getAccount(args: Endofunction[com.pulumi.aws.organizations.inputs.GetAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetAccountArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about an account in an organization. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetAccountPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get a list of AWS accounts that are designated as delegated administrators in this organization */
    inline def getDelegatedAdministrators(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedAdministrators(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get a list of AWS accounts that are designated as delegated administrators in this organization */
    inline def getDelegatedAdministratorsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetDelegatedAdministratorsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedAdministratorsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedAdministratorsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get a list the AWS services for which the specified account is a delegated administrator */
    inline def getDelegatedServices(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetDelegatedServicesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedServicesArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedServices(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get a list the AWS services for which the specified account is a delegated administrator */
    inline def getDelegatedServicesPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetDelegatedServicesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetDelegatedServicesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetDelegatedServicesPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getDelegatedServicesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get the [entity path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_last-accessed-viewing-orgs-entity-path) for an entity. An entity&#39;s path is the text representation of the structure of that AWS Organizations entity. */
    inline def getEntityPath(args: Endofunction[com.pulumi.aws.organizations.inputs.GetEntityPathArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetEntityPathResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetEntityPathArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getEntityPath(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get the [entity path](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_last-accessed-view-data-orgs.html#access_policies_last-accessed-viewing-orgs-entity-path) for an entity. An entity&#39;s path is the text representation of the structure of that AWS Organizations entity. */
    inline def getEntityPathPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetEntityPathPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetEntityPathResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetEntityPathPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getEntityPathPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get information about the organization that the users account belongs to. */
    inline def getOrganization(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganization(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about the organization that the users account belongs to. */
    inline def getOrganizationPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for getting an AWS Organizations Organizational Unit. */
    inline def getOrganizationalUnit(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnit(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for getting an AWS Organizations Organizational Unit. */
    inline def getOrganizationalUnitPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get all direct child accounts under a parent organizational unit. This only provides immediate children, not all children. */
    inline def getOrganizationalUnitChildAccounts(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitChildAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitChildAccounts(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get all direct child accounts under a parent organizational unit. This only provides immediate children, not all children. */
    inline def getOrganizationalUnitChildAccountsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitChildAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitChildAccountsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitChildAccountsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get all direct child accounts under a parent organizational unit. This provides all children. */
    inline def getOrganizationalUnitDescendantAccounts(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantAccounts(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get all direct child accounts under a parent organizational unit. This provides all children. */
    inline def getOrganizationalUnitDescendantAccountsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantAccountsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantAccountsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantAccountsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get all direct child organizational units under a parent organizational unit. This provides all children. */
    inline def getOrganizationalUnitDescendantOrganizationalUnits(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantOrganizationalUnits(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get all direct child organizational units under a parent organizational unit. This provides all children. */
    inline def getOrganizationalUnitDescendantOrganizationalUnitsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitDescendantOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitDescendantOrganizationalUnitsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitDescendantOrganizationalUnitsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children. */
    inline def getOrganizationalUnits(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnits(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get all direct child organizational units under a parent organizational unit. This only provides immediate children, not all children. */
    inline def getOrganizationalUnitsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetOrganizationalUnitsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetOrganizationalUnitsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getOrganizationalUnitsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Organizations Policies. */
    inline def getPolicies(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPolicies(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Organizations Policies. */
    inline def getPoliciesPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetPoliciesResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPoliciesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Organizations Policies For Target. */
    inline def getPoliciesForTarget(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesForTargetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetPoliciesForTargetResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesForTargetArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPoliciesForTarget(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Organizations Policies For Target. */
    inline def getPoliciesForTargetPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPoliciesForTargetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetPoliciesForTargetResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPoliciesForTargetPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPoliciesForTargetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Organizations Policy. */
    inline def getPolicy(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPolicyArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Organizations Policy. */
    inline def getPolicyPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetPolicyPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get tags attached to the specified AWS Organizations resource. */
    inline def getResourceTags(args: Endofunction[com.pulumi.aws.organizations.inputs.GetResourceTagsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.organizations.outputs.GetResourceTagsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetResourceTagsArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getResourceTags(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get tags attached to the specified AWS Organizations resource. */
    inline def getResourceTagsPlain(args: Endofunction[com.pulumi.aws.organizations.inputs.GetResourceTagsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.organizations.outputs.GetResourceTagsResult] =
      val argsBuilder = com.pulumi.aws.organizations.inputs.GetResourceTagsPlainArgs.builder
      com.pulumi.aws.organizations.OrganizationsFunctions.getResourceTagsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides a resource to manage an [AWS Organizations policy](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html). */
  inline def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.PolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.PolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.organizations.Policy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to attach an AWS Organizations policy to an organization account, root, or unit. */
  inline def PolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.PolicyAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.organizations.PolicyAttachmentArgs.builder
    com.pulumi.aws.organizations.PolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage a resource-based delegation policy that can be used to delegate policy management for AWS Organizations to specified member accounts to perform policy actions that are by default available only to the management account. See the [_AWS Organizations User Guide_](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_delegate_policies.html) for more information. */
  inline def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.ResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.organizations.ResourcePolicyArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.organizations.ResourcePolicy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an individual Organizations resource tag. This resource should only be used in cases where Organizations resources are created outside Terraform (e.g., Organizations Accounts implicitly created by AWS Control Tower).
   * 
   * &gt; **NOTE:** This tagging resource should not be combined with the Terraform resource for managing the parent resource. For example, using `aws.organizations.Account` and `aws.organizations.Tag` to manage tags of the same Organizations account will cause a perpetual difference where the `aws.organizations.Account` resource will try to remove the tag being added by the `aws.organizations.Tag` resource. However, if the parent resource is created in the same configuration (i.e., if you have no other choice), you should add `ignoreChanges = [tags]` in the parent resource&#39;s lifecycle block. This ensures that Terraform ignores differences in tags managed via the separate tagging resource, avoiding the perpetual difference mentioned above.
   * 
   * &gt; **NOTE:** This tagging resource does not use the provider `ignoreTags` configuration.
   */
  inline def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.organizations.TagArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.organizations.TagArgs.builder
    com.pulumi.aws.organizations.Tag(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
