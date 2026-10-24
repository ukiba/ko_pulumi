package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object inspector2:
  /** Resource for managing an Amazon Inspector Delegated Admin Account. */
  inline def DelegatedAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.DelegatedAdminAccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.inspector2.DelegatedAdminAccountArgs.builder
    com.pulumi.aws.inspector2.DelegatedAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for enabling Amazon Inspector resource scans.
   * 
   * This resource must be created in the Organization&#39;s Administrator Account.
   */
  inline def Enabler(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.EnablerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.inspector2.EnablerArgs.builder
    com.pulumi.aws.inspector2.Enabler(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Inspector Filter. */
  inline def Filter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.FilterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector2.FilterArgs.builder
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
    com.pulumi.aws.inspector2.Filter(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for associating accounts to existing Inspector instances. */
  inline def MemberAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.MemberAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.inspector2.MemberAssociationArgs.builder
    com.pulumi.aws.inspector2.MemberAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an Amazon Inspector Organization Configuration.
   * 
   * &gt; **NOTE:** In order for this resource to work, the account you use must be an Inspector Delegated Admin Account.
   * 
   * &gt; **NOTE:** When this resource is deleted, EC2, ECR, Lambda, and Lambda code scans will no longer be automatically enabled for new members of your Amazon Inspector organization.
   */
  inline def OrganizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.OrganizationConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.inspector2.OrganizationConfigurationArgs.builder
    com.pulumi.aws.inspector2.OrganizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
