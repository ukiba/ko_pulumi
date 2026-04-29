package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object detective:
  /** Manages a Detective Organization Admin Account. The AWS account utilizing this resource must be an Organizations primary account. More information about Organizations support in Detective can be found in the [Detective User Guide](https://docs.aws.amazon.com/detective/latest/adminguide/accounts-orgs-transition.html). */
  def OrganizationAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.detective.OrganizationAdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.detective.OrganizationAdminAccountArgs.builder
    
    com.pulumi.aws.detective.OrganizationAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the Detective Organization Configuration in the current AWS Region. The AWS account utilizing this resource must have been assigned as a delegated Organization administrator account, e.g., via the `aws.detective.OrganizationAdminAccount` resource. More information about Organizations support in Detective can be found in the [Detective User Guide](https://docs.aws.amazon.com/detective/latest/adminguide/accounts-orgs-transition.html).
   *  
   *  &gt; **NOTE:** This is an advanced Terraform resource. Terraform will automatically assume management of the Detective Organization Configuration without import and perform no actions on removal from the Terraform configuration.
   */
  def OrganizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.detective.OrganizationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.detective.OrganizationConfigurationArgs.builder
    
    com.pulumi.aws.detective.OrganizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [AWS Detective Graph](https://docs.aws.amazon.com/detective/latest/APIReference/API_CreateGraph.html). As an AWS account may own only one Detective graph per region, provisioning multiple Detective graphs requires a separate provider configuration for each graph. */
  def Graph(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.detective.GraphArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.detective.GraphArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.detective.Graph(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [Amazon Detective Member](https://docs.aws.amazon.com/detective/latest/APIReference/API_CreateMembers.html). */
  def Member(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.detective.MemberArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.detective.MemberArgs.builder
    
    com.pulumi.aws.detective.Member(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an [Amazon Detective Invitation Accepter](https://docs.aws.amazon.com/detective/latest/APIReference/API_AcceptInvitation.html). Ensure that the accepter is configured to use the AWS account you wish to _accept_ the invitation from the primary graph owner account. */
  def InvitationAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.detective.InvitationAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.detective.InvitationAccepterArgs.builder
    
    com.pulumi.aws.detective.InvitationAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
