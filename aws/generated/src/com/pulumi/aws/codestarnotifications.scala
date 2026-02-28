package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object codestarnotifications:
  /** Provides a CodeStar Notifications Rule. */
  def NotificationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codestarnotifications.NotificationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codestarnotifications.NotificationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.codestarnotifications.NotificationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
