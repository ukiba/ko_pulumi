package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object rolesanywhere:
  /** Resource for managing a Roles Anywhere Profile. */
  def Profile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.rolesanywhere.ProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rolesanywhere.ProfileArgs.builder
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
    com.pulumi.aws.rolesanywhere.Profile(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing a Roles Anywhere Trust Anchor. */
  def TrustAnchor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.rolesanywhere.TrustAnchorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.rolesanywhere.TrustAnchorArgs.builder
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
    com.pulumi.aws.rolesanywhere.TrustAnchor(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.rolesanywhere.TrustAnchorArgs.Builder)
    def notificationSettings(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.Builder]*):
        com.pulumi.aws.rolesanywhere.TrustAnchorArgs.Builder =
      def argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.builder
      builder.notificationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param source The source of trust, documented below
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder]):
        com.pulumi.aws.rolesanywhere.TrustAnchorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder)
    /**
     * @param sourceData The data denoting the source of trust, documented below
     * @return builder
     */
    def sourceData(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceSourceDataArgs.Builder]):
        com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceSourceDataArgs.builder
      builder.sourceData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rolesanywhere.inputs.TrustAnchorState.Builder)
    def notificationSettings(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.Builder]*):
        com.pulumi.aws.rolesanywhere.inputs.TrustAnchorState.Builder =
      def argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.builder
      builder.notificationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param source The source of trust, documented below
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder]):
        com.pulumi.aws.rolesanywhere.inputs.TrustAnchorState.Builder =
      val argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.builder
      builder.source(args(argsBuilder).build)
