package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object workmail:
  extension (builder: com.pulumi.aws.workmail.OrganizationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.workmail.OrganizationArgs.Builder =
      val argsBuilder = com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.workmail.OrganizationArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an AWS WorkMail Group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workmail.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workmail.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.workmail.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an AWS WorkMail Organization. */
  def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workmail.OrganizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workmail.OrganizationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.aws.workmail.Organization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages the default mail domain for an AWS WorkMail organization.
   * 
   *  &gt; **NOTE:** This does not register a domain for workmail. This resource requires a verified domain name to be used as default domain for workmail organization.
   */
  def DefaultDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workmail.DefaultDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workmail.DefaultDomainArgs.builder
    com.pulumi.aws.workmail.DefaultDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS WorkMail User.
   * 
   *  This resource registers the user with WorkMail on create so the mailbox is enabled and ready for use. This results in the accumulation of costs, for more details, see [pricing](https://aws.amazon.com/workmail/pricing/).
   *  On destroy, it deregisters the user before deletion.
   */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workmail.UserArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.workmail.UserArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.workmail.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.workmail.inputs.DomainState.Builder)
    /**
     * @param records List of DNS records required for domain verification. See `records` below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.aws.workmail.inputs.DomainRecordArgs.Builder]*):
        com.pulumi.aws.workmail.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.workmail.inputs.DomainRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.workmail.inputs.OrganizationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.Builder]):
        com.pulumi.aws.workmail.inputs.OrganizationState.Builder =
      val argsBuilder = com.pulumi.aws.workmail.inputs.OrganizationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.aws.workmail.inputs.OrganizationState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a mail domain registered to an AWS WorkMail organization. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.workmail.DomainArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.workmail.DomainArgs.builder
    com.pulumi.aws.workmail.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
