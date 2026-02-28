package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object ram:
  /**
   * Manages Resource Access Manager (RAM) Resource Sharing with AWS Organizations. If you enable sharing with your organization, you can share resources without using invitations. Refer to the [AWS RAM user guide](https://docs.aws.amazon.com/ram/latest/userguide/getting-started-sharing.html#getting-started-sharing-orgs) for more details.
   *  
   *  &gt; **NOTE:** Use this resource to manage resource sharing within your organization, **not** the `aws.organizations.Organization` resource with `ram.amazonaws.com` configured in `awsServiceAccessPrincipals`.
   */
  def SharingWithOrganization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ram.SharingWithOrganizationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ram.SharingWithOrganizationArgs.builder
    
    com.pulumi.aws.ram.SharingWithOrganization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Resource Access Manager (RAM) Resource Share. To associate principals with the share, see the `aws.ram.PrincipalAssociation` resource. To associate resources with the share, see the `aws.ram.ResourceAssociation` resource. */
  def ResourceShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ram.ResourceShareArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ram.ResourceShareArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ram.ResourceShare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS RAM (Resource Access Manager) Permission. */
  def Permission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ram.PermissionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ram.PermissionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.ram.Permission(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a Resource Access Manager (RAM) principal association. Depending if [RAM Sharing with AWS Organizations is enabled](https://docs.aws.amazon.com/ram/latest/userguide/getting-started-sharing.html#getting-started-sharing-orgs), the RAM behavior with different principal types changes.
   *  
   *  When RAM Sharing with AWS Organizations is enabled:
   *  
   *  - For AWS Account ID, Organization, and Organizational Unit principals within the same AWS Organization, no resource share invitation is sent and resources become available automatically after creating the association.
   *  - For AWS Account ID principals outside the AWS Organization, a resource share invitation is sent and must be accepted before resources become available. See the `aws.ram.ResourceShareAccepter` resource to accept these invitations.
   *  
   *  When RAM Sharing with AWS Organizations is not enabled:
   *  
   *  - Organization and Organizational Unit principals cannot be used.
   *  - For AWS Account ID principals, a resource share invitation is sent and must be accepted before resources become available. See the `aws.ram.ResourceShareAccepter` resource to accept these invitations.
   */
  def PrincipalAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ram.PrincipalAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ram.PrincipalAssociationArgs.builder
    
    com.pulumi.aws.ram.PrincipalAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for maintaining exclusive management of principal and resource associations for an AWS RAM (Resource Access Manager) Resource Share.
   *  
   *  !&gt; This resource takes exclusive ownership over principal and resource associations for a resource share. This includes removal of principals and resources which are not explicitly configured.
   *  
   *  &gt; Destruction of this resource will disassociate all configured principals and resources from the resource share.
   *  
   *  &gt; **NOTE:** This resource cannot be used in conjunction with `aws.ram.PrincipalAssociation` or `aws.ram.ResourceAssociation` for the same resource share. Using them together will cause persistent drift and conflicts.
   */
  def ResourceShareAssociationsExclusive(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ram.ResourceShareAssociationsExclusiveArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ram.ResourceShareAssociationsExclusiveArgs.builder
    
    com.pulumi.aws.ram.ResourceShareAssociationsExclusive(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Resource Access Manager (RAM) Resource Association.
   *  
   *  &gt; *NOTE:* Certain AWS resources (e.g., EC2 Subnets) can only be shared in an AWS account that is a member of an AWS Organizations organization with organization-wide Resource Access Manager functionality enabled. See the [Resource Access Manager User Guide](https://docs.aws.amazon.com/ram/latest/userguide/what-is.html) and AWS service specific documentation for additional information.
   */
  def ResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ram.ResourceAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ram.ResourceAssociationArgs.builder
    
    com.pulumi.aws.ram.ResourceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ram.PermissionArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ram.PermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type RamFunctions = com.pulumi.aws.ram.RamFunctions
  object RamFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.ram.RamFunctions.*
  extension (self: RamFunctions.type)
    /** `aws.ram.ResourceShare` Retrieve information about a RAM Resource Share. */
    def getResourceShare(args: Endofunction[com.pulumi.aws.ram.inputs.GetResourceShareArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ram.outputs.GetResourceShareResult] =
      val argsBuilder = com.pulumi.aws.ram.inputs.GetResourceShareArgs.builder
      com.pulumi.aws.ram.RamFunctions.getResourceShare(args(argsBuilder).build)

    /** `aws.ram.ResourceShare` Retrieve information about a RAM Resource Share. */
    def getResourceSharePlain(args: Endofunction[com.pulumi.aws.ram.inputs.GetResourceSharePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ram.outputs.GetResourceShareResult] =
      val argsBuilder = com.pulumi.aws.ram.inputs.GetResourceSharePlainArgs.builder
      com.pulumi.aws.ram.RamFunctions.getResourceSharePlain(args(argsBuilder).build)

  /**
   * Manage accepting a Resource Access Manager (RAM) Resource Share invitation. From a _receiver_ AWS account, accept an invitation to share resources that were shared by a _sender_ AWS account. To create a resource share in the _sender_, see the `aws.ram.ResourceShare` resource.
   *  
   *  &gt; **Note:** If both AWS accounts are in the same Organization and [RAM Sharing with AWS Organizations is enabled](https://docs.aws.amazon.com/ram/latest/userguide/getting-started-sharing.html#getting-started-sharing-orgs), this resource is not necessary as RAM Resource Share invitations are not used.
   */
  def ResourceShareAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ram.ResourceShareAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.ram.ResourceShareAccepterArgs.builder
    
    com.pulumi.aws.ram.ResourceShareAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.ram.inputs.PermissionState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ram.inputs.PermissionState.Builder =
      val argsBuilder = com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ram.inputs.GetResourceShareArgs.Builder)
    /**
     * @param filters Filter used to scope the list of owned shares e.g., by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.ram.inputs.GetResourceShareFilterArgs.Builder]*):
        com.pulumi.aws.ram.inputs.GetResourceShareArgs.Builder =
      def argsBuilder = com.pulumi.aws.ram.inputs.GetResourceShareFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)
