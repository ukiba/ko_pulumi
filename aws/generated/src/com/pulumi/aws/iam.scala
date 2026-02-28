package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object iam:
  /**
   * Provides an IAM Signing Certificate resource to upload Signing Certificates.
   *  
   *  &gt; **Note:** All arguments including the certificate body will be stored in the raw state as plain-text.
   */
  def SigningCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.SigningCertificateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.SigningCertificateArgs.builder
    
    com.pulumi.aws.iam.SigningCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM instance profile.
   *  
   *  &gt; **NOTE:** When managing instance profiles, remember that the `name` attribute must always be unique. This means that even if you have different `role` or `path` values, duplicating an existing instance profile `name` will lead to an `EntityAlreadyExists` error.
   */
  def InstanceProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.InstanceProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.InstanceProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.InstanceProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a resource for adding an IAM User to IAM Groups. This
   *  resource can be used multiple times with the same user for non-overlapping
   *  groups.
   *  
   *  To exclusively manage the users in a group, see the
   *  `aws.iam.GroupMembership` resource.
   */
  def UserGroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.UserGroupMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.UserGroupMembershipArgs.builder
    
    com.pulumi.aws.iam.UserGroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an IAM Service Specific Credential. */
  def ServiceSpecificCredential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.ServiceSpecificCredentialArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.ServiceSpecificCredentialArgs.builder
    
    com.pulumi.aws.iam.ServiceSpecificCredential(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an IAM SAML provider. */
  def SamlProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.SamlProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.SamlProviderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.SamlProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM role inline policy.
   *  
   *  &gt; **NOTE:** For a given role, this resource is incompatible with using the `aws.iam.Role` resource `inlinePolicy` argument. When using that argument and this resource, both will attempt to manage the role&#39;s inline policies and the provider will show a permanent difference.
   *  
   *  &gt; **NOTE:** We suggest using explicit JSON encoding or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate configuration to JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def RolePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.RolePolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.RolePolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.iam.RolePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM group.
   *  
   *  &gt; **NOTE on user management:** Using `aws.iam.GroupMembership` or `aws.iam.UserGroupMembership` resources in addition to manually managing user/group membership using the console may lead to configuration drift or conflicts. For this reason, it&#39;s recommended to either manage membership entirely with the provider or entirely within the AWS console.
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.iam.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an IAM User Login Profile with limited support for password creation during this provider resource creation. Uses PGP to encrypt the password for safe transport to the user. PGP keys can be obtained from Keybase.
   *  
   *  &gt; To reset an IAM User login password via this provider, you can use delete and recreate this resource or change any of the arguments.
   */
  def UserLoginProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.UserLoginProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.UserLoginProfileArgs.builder
    
    com.pulumi.aws.iam.UserLoginProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM policy attached to a user.
   *  
   *  &gt; **NOTE:** We suggest using explicit JSON encoding or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate configuration to JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def UserPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.UserPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.UserPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.iam.UserPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM Server Certificate resource to upload Server Certificates.
   *  Certs uploaded to IAM can easily work with other AWS services such as:
   *  
   *  - AWS Elastic Beanstalk
   *  - Elastic Load Balancing
   *  - CloudFront
   *  - AWS OpsWorks
   *  
   *  For information about server certificates in IAM, see [Managing Server
   *  Certificates][2] in AWS Documentation.
   */
  def ServerCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.ServerCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.ServerCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.ServerCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches a Managed IAM Policy to user(s), role(s), and/or group(s)
   *  
   *  !&gt; **WARNING:** The aws.iam.PolicyAttachment resource creates **exclusive** attachments of IAM policies. Across the entire AWS account, all of the users/roles/groups to which a single policy is attached must be declared by a single aws.iam.PolicyAttachment resource. This means that even any users/roles/groups that have the attached policy via any other mechanism (including other resources managed by this provider) will have that attached policy revoked by this resource. Consider `aws.iam.RolePolicyAttachment`, `aws.iam.UserPolicyAttachment`, or `aws.iam.GroupPolicyAttachment` instead. These resources do not enforce exclusive attachment of an IAM policy.
   *  
   *  &gt; **NOTE:** The usage of this resource conflicts with the `aws.iam.GroupPolicyAttachment`, `aws.iam.RolePolicyAttachment`, and `aws.iam.UserPolicyAttachment` resources and will permanently show a difference if both are defined.
   *  
   *  &gt; **NOTE:** For a given role, this resource is incompatible with using the `aws.iam.Role` resource `managedPolicyArns` argument. When using that argument and this resource, both will attempt to manage the role&#39;s managed policy attachments and the provider will show a permanent difference.
   *  
   *  &gt; **NOTE:** To ensure Pulumi correctly manages dependencies during updates, use a reference to the IAM resource when defining the `policyArn` for `aws.iam.PolicyAttachment`, rather than constructing the ARN directly. For example, use `policyArn = aws_iam_policy.example.arn` instead of `policyArn = &#34;arn:aws:iam::${data.aws_caller_identity.current.account_id}:policy/Example&#34;`. Failing to do so may lead to errors like `DeleteConflict: Cannot delete a policy attached to entities` or `NoSuchEntity`.
   */
  def PolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.PolicyAttachmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.PolicyAttachmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.iam.PolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches a Managed IAM Policy to an IAM role
   *  
   *  &gt; **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
   *  
   *  &gt; **NOTE:** For a given role, this resource is incompatible with using the `aws.iam.Role` resource `managedPolicyArns` argument. When using that argument and this resource, both will attempt to manage the role&#39;s managed policy attachments and Pulumi will show a permanent difference.
   */
  def RolePolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.RolePolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.RolePolicyAttachmentArgs.builder
    
    com.pulumi.aws.iam.RolePolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM user.
   *  
   *  &gt; *NOTE:* If policies are attached to the user via the `aws.iam.PolicyAttachment` resource and you are modifying the user `name` or `path`, the `forceDestroy` argument must be set to `true` and applied before attempting the operation otherwise you will encounter a `DeleteConflict` error. The `aws.iam.UserPolicyAttachment` resource (recommended) does not have this requirement.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.UserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.UserArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for maintaining exclusive management of managed IAM policies assigned to an AWS IAM (Identity &amp; Access Management) group.
   *  
   *  !&gt; This resource takes exclusive ownership over managed IAM policies attached to a group. This includes removal of managed IAM policies which are not explicitly configured. To prevent persistent drift, ensure any `aws.iam.GroupPolicyAttachment` resources managed alongside this resource are included in the `policyArns` argument.
   *  
   *  &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured policy attachments. It **will not** detach the configured policies from the group.
   */
  def GroupPolicyAttachmentsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.GroupPolicyAttachmentsExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.GroupPolicyAttachmentsExclusiveArgs.builder
    
    com.pulumi.aws.iam.GroupPolicyAttachmentsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Uploads an SSH public key and associates it with the specified IAM user. */
  def SshKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.SshKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.SshKeyArgs.builder
    
    com.pulumi.aws.iam.SshKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches a Managed IAM Policy to an IAM group
   *  
   *  &gt; **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
   */
  def GroupPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.GroupPolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.GroupPolicyAttachmentArgs.builder
    
    com.pulumi.aws.iam.GroupPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages centralized root access features across AWS member accounts managed using AWS Organizations. More information about managing root access in IAM can be found in the [Centralize root access for member accounts](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_root-enable-root-access.html).
   *  
   *  &gt; **NOTE:** The AWS account utilizing this resource must be an Organizations management account. Also, you must enable trusted access for AWS Identity and Access Management in AWS Organizations.
   */
  def OrganizationsFeatures(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.OrganizationsFeaturesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.OrganizationsFeaturesArgs.builder
    
    com.pulumi.aws.iam.OrganizationsFeatures(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an IAM access key. This is a set of credentials that allow API requests to be made as an IAM user. */
  def AccessKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.AccessKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.AccessKeyArgs.builder
    
    com.pulumi.aws.iam.AccessKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for maintaining exclusive management of inline policies assigned to an AWS IAM (Identity &amp; Access Management) user.
   *  
   *  !&gt; This resource takes exclusive ownership over inline policies assigned to a user. This includes removal of inline policies which are not explicitly configured. To prevent persistent drift, ensure any `aws.iam.UserPolicy` resources managed alongside this resource are included in the `policyNames` argument.
   *  
   *  &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured inline policy assignments. It __will not__ delete the configured policies from the user.
   */
  def UserPoliciesExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.UserPoliciesExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.UserPoliciesExclusiveArgs.builder
    
    com.pulumi.aws.iam.UserPoliciesExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** There is only a single account alias per AWS account.
   *  
   *  Manages the account alias for the AWS Account.
   */
  def AccountAlias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.AccountAliasArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.AccountAliasArgs.builder
    
    com.pulumi.aws.iam.AccountAlias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iam.UserPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.UserPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.GroupPolicyArgs.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.GroupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  /**
   * &gt; **Note:** There is only a single policy allowed per AWS account. An existing policy will be lost when using this resource as an effect of this limitation.
   *  
   *  Manages Password Policy for the AWS Account.
   *  See more about [Account Password Policy](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_passwords_account-policy.html)
   *  in the official AWS docs.
   */
  def AccountPasswordPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.AccountPasswordPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.AccountPasswordPolicyArgs.builder
    
    com.pulumi.aws.iam.AccountPasswordPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an IAM Security Token Service Preferences resource. */
  def SecurityTokenServicePreferences(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.SecurityTokenServicePreferencesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.SecurityTokenServicePreferencesArgs.builder
    
    com.pulumi.aws.iam.SecurityTokenServicePreferences(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iam.RoleArgs.Builder)
    /**
     * @param assumeRolePolicy Policy that grants an entity permission to assume the role.
     *  
     *  &gt; **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `aws.iam.Policy` resource.  However, it _can_ use an `aws.iam.getPolicyDocument` data source. See the example above of how this works.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def assumeRolePolicy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.RoleArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.assumeRolePolicy(args(argsBuilder).build)

    /**
     * @param inlinePolicies Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, Pulumi will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause Pulumi to remove _all_ inline policies added out of band on `apply`.
     * @return builder
     */
    def inlinePolicies(args: Endofunction[com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.Builder]*):
        com.pulumi.aws.iam.RoleArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.builder
      builder.inlinePolicies(args.map(_(argsBuilder).build)*)

  /**
   * Resource for maintaining exclusive management of managed IAM policies assigned to an AWS IAM (Identity &amp; Access Management) user.
   *  
   *  !&gt; This resource takes exclusive ownership over managed IAM policies attached to a user. This includes removal of managed IAM policies which are not explicitly configured. To prevent persistent drift, ensure any `aws.iam.UserPolicyAttachment` resources managed alongside this resource are included in the `policyArns` argument.
   *  
   *  &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured policy attachments. It **will not** detach the configured policies from the user.
   */
  def UserPolicyAttachmentsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.UserPolicyAttachmentsExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.UserPolicyAttachmentsExclusiveArgs.builder
    
    com.pulumi.aws.iam.UserPolicyAttachmentsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Attaches a Managed IAM Policy to an IAM user
   *  
   *  &gt; **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
   */
  def UserPolicyAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.UserPolicyAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.UserPolicyAttachmentArgs.builder
    
    com.pulumi.aws.iam.UserPolicyAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for maintaining exclusive management of inline policies assigned to an AWS IAM (Identity &amp; Access Management) group.
   *  
   *  !&gt; This resource takes exclusive ownership over inline policies assigned to a group. This includes removal of inline policies which are not explicitly configured. To prevent persistent drift, ensure any `aws.iam.GroupPolicy` resources managed alongside this resource are included in the `policyNames` argument.
   *  
   *  &gt; Destruction of this resource means Terraform will no longer manage reconciliation of the configured inline policy assignments. It __will not__ delete the configured policies from the group.
   */
  def GroupPoliciesExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.GroupPoliciesExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.GroupPoliciesExclusiveArgs.builder
    
    com.pulumi.aws.iam.GroupPoliciesExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **NOTE:**: To reliably detect drift between customer managed inline policies listed in this resource and actual policies attached to the role in the cloud, you currently need to run Pulumi with `pulumi up --refresh`. See [#4766](https://github.com/pulumi/pulumi-aws/issues/4766) for tracking making this work with regular `pulumi up` invocations.
   *  
   *  Resource for maintaining exclusive management of inline policies assigned to an AWS IAM (Identity &amp; Access Management) role.
   *  
   *  !&gt; This resource takes exclusive ownership over inline policies assigned to a role. This includes removal of inline policies which are not explicitly configured. To prevent persistent drift, ensure any `aws.iam.RolePolicy` resources managed alongside this resource are included in the `policyNames` argument.
   *  
   *  &gt; Destruction of this resource means Pulumi will no longer manage reconciliation of the configured inline policy assignments. It __will not__ delete the configured policies from the role.
   */
  def RolePoliciesExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.RolePoliciesExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.RolePoliciesExclusiveArgs.builder
    
    com.pulumi.aws.iam.RolePoliciesExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type IamFunctions = com.pulumi.aws.iam.IamFunctions
  object IamFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.iam.IamFunctions.*
  extension (self: IamFunctions.type)
    /**
     * This data source can be used to fetch information about IAM access keys of a
     *  specific IAM user.
     */
    def getAccessKeys(args: Endofunction[com.pulumi.aws.iam.inputs.GetAccessKeysArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetAccessKeysResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetAccessKeysArgs.builder
      com.pulumi.aws.iam.IamFunctions.getAccessKeys(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about IAM access keys of a
     *  specific IAM user.
     */
    def getAccessKeysPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetAccessKeysPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetAccessKeysResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetAccessKeysPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getAccessKeysPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM group. By using this data source, you can reference IAM group
     *  properties without having to hard code ARNs as input.
     */
    def getGroup(args: Endofunction[com.pulumi.aws.iam.inputs.GetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetGroupArgs.builder
      com.pulumi.aws.iam.IamFunctions.getGroup(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM group. By using this data source, you can reference IAM group
     *  properties without having to hard code ARNs as input.
     */
    def getGroupPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetGroupResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetGroupPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getGroupPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM instance profile. By using this data source, you can reference IAM
     *  instance profile properties without having to hard code ARNs as input.
     */
    def getInstanceProfile(args: Endofunction[com.pulumi.aws.iam.inputs.GetInstanceProfileArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetInstanceProfileResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetInstanceProfileArgs.builder
      com.pulumi.aws.iam.IamFunctions.getInstanceProfile(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM instance profile. By using this data source, you can reference IAM
     *  instance profile properties without having to hard code ARNs as input.
     */
    def getInstanceProfilePlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetInstanceProfilePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetInstanceProfileResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetInstanceProfilePlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getInstanceProfilePlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about all
     *  IAM instance profiles under a role. By using this data source, you can reference IAM
     *  instance profile properties without having to hard code ARNs as input.
     */
    def getInstanceProfiles(args: Endofunction[com.pulumi.aws.iam.inputs.GetInstanceProfilesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetInstanceProfilesResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetInstanceProfilesArgs.builder
      com.pulumi.aws.iam.IamFunctions.getInstanceProfiles(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about all
     *  IAM instance profiles under a role. By using this data source, you can reference IAM
     *  instance profile properties without having to hard code ARNs as input.
     */
    def getInstanceProfilesPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetInstanceProfilesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetInstanceProfilesResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetInstanceProfilesPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getInstanceProfilesPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM OpenID Connect provider. By using this data source, you can retrieve the
     *  the resource information by either its `arn` or `url`.
     */
    def getOpenIdConnectProvider(args: Endofunction[com.pulumi.aws.iam.inputs.GetOpenIdConnectProviderArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetOpenIdConnectProviderResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetOpenIdConnectProviderArgs.builder
      com.pulumi.aws.iam.IamFunctions.getOpenIdConnectProvider(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM OpenID Connect provider. By using this data source, you can retrieve the
     *  the resource information by either its `arn` or `url`.
     */
    def getOpenIdConnectProviderPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetOpenIdConnectProviderPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetOpenIdConnectProviderResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetOpenIdConnectProviderPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getOpenIdConnectProviderPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM policy.
     */
    def getPolicy(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyArgs.builder
      com.pulumi.aws.iam.IamFunctions.getPolicy(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM policy.
     */
    def getPolicyPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetPolicyResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getPolicyPlain(args(argsBuilder).build)

    /**
     * Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `aws.iam.Policy`.
     *  
     *  Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
     */
    def getPolicyDocument(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs.builder
      com.pulumi.aws.iam.IamFunctions.getPolicyDocument(args(argsBuilder).build)

    /**
     * Generates an IAM policy document in JSON format for use with resources that expect policy documents such as `aws.iam.Policy`.
     *  
     *  Using this data source to generate policy documents is *optional*. It is also valid to use literal JSON strings in your configuration or to use the `file` interpolation function to read a raw JSON policy document from a file.
     */
    def getPolicyDocumentPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetPolicyDocumentResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getPolicyDocumentPlain(args(argsBuilder).build)

    /**
     * Runs a simulation of the IAM policies of a particular principal against a given hypothetical request.
     *  
     *  You can use this data source in conjunction with
     *  Preconditions and Postconditions so that your configuration can test either whether it should have sufficient access to do its own work, or whether policies your configuration declares itself are sufficient for their intended use elsewhere.
     *  
     *  &gt; **Note:** Correctly using this data source requires familiarity with various details of AWS Identity and Access Management, and how various AWS services integrate with it. For general information on the AWS IAM policy simulator, see [Testing IAM policies with the IAM policy simulator](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html). This data source wraps the `iam:SimulatePrincipalPolicy` API action described on that page.
     */
    def getPrincipalPolicySimulation(args: Endofunction[com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetPrincipalPolicySimulationInvokeResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationArgs.builder
      com.pulumi.aws.iam.IamFunctions.getPrincipalPolicySimulation(args(argsBuilder).build)

    /**
     * Runs a simulation of the IAM policies of a particular principal against a given hypothetical request.
     *  
     *  You can use this data source in conjunction with
     *  Preconditions and Postconditions so that your configuration can test either whether it should have sufficient access to do its own work, or whether policies your configuration declares itself are sufficient for their intended use elsewhere.
     *  
     *  &gt; **Note:** Correctly using this data source requires familiarity with various details of AWS Identity and Access Management, and how various AWS services integrate with it. For general information on the AWS IAM policy simulator, see [Testing IAM policies with the IAM policy simulator](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_testing-policies.html). This data source wraps the `iam:SimulatePrincipalPolicy` API action described on that page.
     */
    def getPrincipalPolicySimulationPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetPrincipalPolicySimulationInvokeResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getPrincipalPolicySimulationPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM role. By using this data source, you can reference IAM role
     *  properties without having to hard code ARNs as input.
     */
    def getRole(args: Endofunction[com.pulumi.aws.iam.inputs.GetRoleArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetRoleResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetRoleArgs.builder
      com.pulumi.aws.iam.IamFunctions.getRole(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM role. By using this data source, you can reference IAM role
     *  properties without having to hard code ARNs as input.
     */
    def getRolePlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetRolePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetRoleResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetRolePlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getRolePlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and Names of IAM Roles. */
    def getRoles(args: Endofunction[com.pulumi.aws.iam.inputs.GetRolesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetRolesResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetRolesArgs.builder
      com.pulumi.aws.iam.IamFunctions.getRoles(args(argsBuilder).build)

    /** Use this data source to get the ARNs and Names of IAM Roles. */
    def getRolesPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetRolesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetRolesResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetRolesPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getRolesPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM SAML provider. This will allow you to easily retrieve the metadata
     *  document of an existing SAML provider.
     */
    def getSamlProvider(args: Endofunction[com.pulumi.aws.iam.inputs.GetSamlProviderArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetSamlProviderResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetSamlProviderArgs.builder
      com.pulumi.aws.iam.IamFunctions.getSamlProvider(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM SAML provider. This will allow you to easily retrieve the metadata
     *  document of an existing SAML provider.
     */
    def getSamlProviderPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetSamlProviderPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetSamlProviderResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetSamlProviderPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getSamlProviderPlain(args(argsBuilder).build)

    /** Use this data source to lookup information about IAM Server Certificates. */
    def getServerCertificate(args: Endofunction[com.pulumi.aws.iam.inputs.GetServerCertificateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetServerCertificateResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetServerCertificateArgs.builder
      com.pulumi.aws.iam.IamFunctions.getServerCertificate(args(argsBuilder).build)

    /** Use this data source to lookup information about IAM Server Certificates. */
    def getServerCertificatePlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetServerCertificatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetServerCertificateResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetServerCertificatePlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getServerCertificatePlain(args(argsBuilder).build)

    /**
     * This data source provides information on the IAM source role of an STS assumed role. For non-role ARNs, this data source simply passes the ARN through in `issuerArn`.
     *  
     *  For some AWS resources, multiple types of principals are allowed in the same argument (e.g., IAM users and IAM roles). However, these arguments often do not allow assumed-role (i.e., STS, temporary credential) principals. Given an STS ARN, this data source provides the ARN for the source IAM role.
     */
    def getSessionContext(args: Endofunction[com.pulumi.aws.iam.inputs.GetSessionContextArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetSessionContextResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetSessionContextArgs.builder
      com.pulumi.aws.iam.IamFunctions.getSessionContext(args(argsBuilder).build)

    /**
     * This data source provides information on the IAM source role of an STS assumed role. For non-role ARNs, this data source simply passes the ARN through in `issuerArn`.
     *  
     *  For some AWS resources, multiple types of principals are allowed in the same argument (e.g., IAM users and IAM roles). However, these arguments often do not allow assumed-role (i.e., STS, temporary credential) principals. Given an STS ARN, this data source provides the ARN for the source IAM role.
     */
    def getSessionContextPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetSessionContextPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetSessionContextResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetSessionContextPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getSessionContextPlain(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM user. By using this data source, you can reference IAM user
     *  properties without having to hard code ARNs or unique IDs as input.
     */
    def getUser(args: Endofunction[com.pulumi.aws.iam.inputs.GetUserArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetUserArgs.builder
      com.pulumi.aws.iam.IamFunctions.getUser(args(argsBuilder).build)

    /**
     * This data source can be used to fetch information about a specific
     *  IAM user. By using this data source, you can reference IAM user
     *  properties without having to hard code ARNs or unique IDs as input.
     */
    def getUserPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetUserPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetUserResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetUserPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getUserPlain(args(argsBuilder).build)

    /** Use this data source to get information about a SSH public key associated with the specified IAM user. */
    def getUserSshKey(args: Endofunction[com.pulumi.aws.iam.inputs.GetUserSshKeyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetUserSshKeyResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetUserSshKeyArgs.builder
      com.pulumi.aws.iam.IamFunctions.getUserSshKey(args(argsBuilder).build)

    /** Use this data source to get information about a SSH public key associated with the specified IAM user. */
    def getUserSshKeyPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetUserSshKeyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetUserSshKeyResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetUserSshKeyPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getUserSshKeyPlain(args(argsBuilder).build)

    /** Use this data source to get the ARNs and Names of IAM Users. */
    def getUsers(args: Endofunction[com.pulumi.aws.iam.inputs.GetUsersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.iam.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetUsersArgs.builder
      com.pulumi.aws.iam.IamFunctions.getUsers(args(argsBuilder).build)

    /** Use this data source to get the ARNs and Names of IAM Users. */
    def getUsersPlain(args: Endofunction[com.pulumi.aws.iam.inputs.GetUsersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.iam.outputs.GetUsersResult] =
      val argsBuilder = com.pulumi.aws.iam.inputs.GetUsersPlainArgs.builder
      com.pulumi.aws.iam.IamFunctions.getUsersPlain(args(argsBuilder).build)

  /**
   * &gt; **WARNING:** Multiple aws.iam.GroupMembership resources with the same group name will produce inconsistent behavior!
   *  
   *  Provides a top level resource to manage IAM Group membership for IAM Users. For
   *  more information on managing IAM Groups or IAM Users, see IAM Groups or
   *  IAM Users
   *  
   *  &gt; **Note:** `aws.iam.GroupMembership` will conflict with itself if used more than once with the same group. To non-exclusively manage the users in a group, see the
   *  `aws.iam.UserGroupMembership` resource.
   */
  def GroupMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.GroupMembershipArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.GroupMembershipArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.iam.GroupMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM role.
   *  
   *  &gt; **NOTE:** If policies are attached to the role via the `aws.iam.PolicyAttachment` resource and you are modifying the role `name` or `path`, the `forceDetachPolicies` argument must be set to `true` and applied before attempting the operation otherwise you will encounter a `DeleteConflict` error. The `aws.iam.RolePolicyAttachment` resource (recommended) does not have this requirement.
   *  
   *  &gt; **NOTE:** If you use this resource&#39;s `managedPolicyArns` argument or `inlinePolicy` configuration blocks, this resource will take over exclusive management of the role&#39;s respective policy types (e.g., both policy types if both arguments are used). These arguments are incompatible with other ways of managing a role&#39;s policies, such as `aws.iam.PolicyAttachment`, `aws.iam.RolePolicyAttachment`, and `aws.iam.RolePolicy`. If you attempt to manage a role&#39;s policies by multiple means, you will get resource cycling and/or errors.
   *  
   *  &gt; **NOTE:** We suggest using explicit JSON encoding or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate configuration to JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def Role(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.RoleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.RoleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.Role(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an IAM OpenID Connect provider. */
  def OpenIdConnectProvider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.OpenIdConnectProviderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.OpenIdConnectProviderArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.OpenIdConnectProvider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM Virtual MFA Device.
   *  
   *  &gt; **Note:** All attributes will be stored in the raw state as plain-text.
   *  **Note:** A virtual MFA device cannot be directly associated with an IAM User from the provider.
   *    To associate the virtual MFA device with a user and enable it, use the code returned in either `base32StringSeed` or `qrCodePng` to generate TOTP authentication codes.
   *    The authentication codes can then be used with the AWS CLI command [`aws iam enable-mfa-device`](https://docs.aws.amazon.com/cli/latest/reference/iam/enable-mfa-device.html) or the AWS API call [`EnableMFADevice`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_EnableMFADevice.html).
   */
  def VirtualMfaDevice(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.VirtualMfaDeviceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.VirtualMfaDeviceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.VirtualMfaDevice(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iam.PolicyArgs.Builder)
    /**
     * @param policy Policy document. This is a JSON formatted string. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  /**
   * &gt; **NOTE:**: To reliably detect drift between customer managed policies listed in this resource and actual policies attached to the role in the cloud, you currently need to run Pulumi with `pulumi up --refresh`. See [#4766](https://github.com/pulumi/pulumi-aws/issues/4766) for tracking making this work with regular `pulumi up`
   *  
   *  Resource for maintaining exclusive management of managed IAM policies assigned to an AWS IAM (Identity &amp; Access Management) role.
   *  
   *  !&gt; This resource takes exclusive ownership over managed IAM policies attached to a role. This includes removal of managed IAM policies which are not explicitly configured. To prevent persistent drift, ensure any `aws.iam.RolePolicyAttachment` resources managed alongside this resource are included in the `policyArns` argument.
   *  
   *  &gt; Destruction of this resource means Pulumi will no longer manage reconciliation of the configured policy attachments. It **will not** detach the configured policies from the role.
   */
  def RolePolicyAttachmentsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.RolePolicyAttachmentsExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.RolePolicyAttachmentsExclusiveArgs.builder
    
    com.pulumi.aws.iam.RolePolicyAttachmentsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an [IAM service-linked role](https://docs.aws.amazon.com/IAM/latest/UserGuide/using-service-linked-roles.html). */
  def ServiceLinkedRole(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.ServiceLinkedRoleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.ServiceLinkedRoleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.ServiceLinkedRole(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iam.RolePolicyArgs.Builder)
    /**
     * @param policy The inline policy document.
     *  This is a JSON formatted string.
     *  For more information about building IAM policy documents with Pulumi, see the AWS IAM Policy Document Guide
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.RolePolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  /**
   * Provides an IAM policy.
   *  
   *  &gt; **NOTE:** We suggest using explicit JSON encoding or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate configuration to JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.iam.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationArgs.Builder)
    /**
     * @param contexts Each `context` block defines an entry in the table of additional context keys in the simulated request.
     *  
     *  IAM uses context keys for both custom conditions and for interpolating dynamic request-specific values into policy values. If you use policies that include those features then you will need to provide suitable example values for those keys to achieve a realistic simulation.
     * @return builder
     */
    def contexts(args: Endofunction[com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationContextArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPrincipalPolicySimulationContextArgs.builder
      builder.contexts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder)
    /**
     * @param conditions Configuration block for a condition. Detailed below.
     * @return builder
     */
    def conditions(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementConditionArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementConditionArgs.builder
      builder.conditions(args.map(_(argsBuilder).build)*)

    /**
     * @param notPrincipals Like `principals` except these are principals that the statement does *not* apply to.
     * @return builder
     */
    def notPrincipals(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementNotPrincipalArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementNotPrincipalArgs.builder
      builder.notPrincipals(args.map(_(argsBuilder).build)*)

    /**
     * @param principals Configuration block for principals. Detailed below.
     * @return builder
     */
    def principals(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementPrincipalArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementPrincipalArgs.builder
      builder.principals(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.UserPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.UserPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.inputs.PolicyState.Builder)
    /**
     * @param policy Policy document. This is a JSON formatted string. For more information about building AWS IAM policy documents, see the AWS IAM Policy Document Guide
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.inputs.RolePolicyState.Builder)
    /**
     * @param policy The inline policy document.
     *  This is a JSON formatted string.
     *  For more information about building IAM policy documents with Pulumi, see the AWS IAM Policy Document Guide
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.RolePolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs.Builder)
    /**
     * @param statements Configuration block for a policy statement. Detailed below.
     * @return builder
     */
    def statements(args: Endofunction[com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.Builder]*):
        com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.GetPolicyDocumentStatementArgs.builder
      builder.statements(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.RoleState.Builder)
    /**
     * @param assumeRolePolicy Policy that grants an entity permission to assume the role.
     *  
     *  &gt; **NOTE:** The `assumeRolePolicy` is very similar to but slightly different than a standard IAM policy and cannot use an `aws.iam.Policy` resource.  However, it _can_ use an `aws.iam.getPolicyDocument` data source. See the example above of how this works.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def assumeRolePolicy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.RoleState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.assumeRolePolicy(args(argsBuilder).build)

    /**
     * @param inlinePolicies Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, Pulumi will not manage any inline policies in this resource. Configuring one empty block (i.e., `inlinePolicy {}`) will cause Pulumi to remove _all_ inline policies added out of band on `apply`.
     * @return builder
     */
    def inlinePolicies(args: Endofunction[com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.Builder]*):
        com.pulumi.aws.iam.inputs.RoleState.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.RoleInlinePolicyArgs.builder
      builder.inlinePolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder)
    def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.iam.inputs.GroupPolicyState.Builder)
    /**
     * @param policy The policy document. This is a JSON formatted string.
     * @return builder
     */
    def policy(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.iam.inputs.GroupPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.iam.inputs.PolicyDocumentArgs.builder
      builder.policy(args(argsBuilder).build)

  /**
   * Manages an AWS IAM (Identity &amp; Access Management) Outbound Web Identity Federation.
   *  
   *  &gt; **NOTE:** Creating this Terraform resource enables IAM Outbound Web Identity Federation and deleting this Terraform resource disables IAM Outbound Web Identity Federation.
   */
  def OutboundWebIdentityFederation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.OutboundWebIdentityFederationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.iam.OutboundWebIdentityFederationArgs.builder
    
    com.pulumi.aws.iam.OutboundWebIdentityFederation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an IAM policy attached to a group.
   *  
   *  &gt; **NOTE:** We suggest using explicit JSON encoding or `aws.iam.getPolicyDocument` when assigning a value to `policy`. They seamlessly translate configuration to JSON, enabling you to maintain consistency within your configuration without the need for context switches. Also, you can sidestep potential complications arising from formatting discrepancies, whitespace inconsistencies, and other nuances inherent to JSON.
   */
  def GroupPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.iam.GroupPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.iam.GroupPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.iam.GroupPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
