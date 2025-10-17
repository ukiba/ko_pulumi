package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codestarnotifications:
  /** Provides a CodeStar Notifications Rule. */
  def NotificationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.codestarnotifications.NotificationRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codestarnotifications.NotificationRuleArgs.builder
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
    com.pulumi.aws.codestarnotifications.NotificationRule(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.codestarnotifications.NotificationRuleArgs.Builder)
    /**
     * @param targets Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.Builder]*):
        com.pulumi.aws.codestarnotifications.NotificationRuleArgs.Builder =
      def argsBuilder = com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codestarnotifications.inputs.NotificationRuleState.Builder)
    /**
     * @param targets Configuration blocks containing notification target information. Can be specified multiple times. At least one target must be specified on creation.
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.Builder]*):
        com.pulumi.aws.codestarnotifications.inputs.NotificationRuleState.Builder =
      def argsBuilder = com.pulumi.aws.codestarnotifications.inputs.NotificationRuleTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)
