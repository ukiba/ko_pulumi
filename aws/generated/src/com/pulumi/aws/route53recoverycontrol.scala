package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object route53recoverycontrol:
  extension (builder: com.pulumi.aws.route53recoverycontrol.SafetyRuleArgs.Builder)
    /**
     * @param ruleConfig Configuration block for safety rule criteria. See below.
     * @return builder
     */
    def ruleConfig(args: Endofunction[com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.Builder]):
        com.pulumi.aws.route53recoverycontrol.SafetyRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.builder
      builder.ruleConfig(args(argsBuilder).build)

  /** Provides an AWS Route 53 Recovery Control Config Safety Rule */
  def SafetyRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoverycontrol.SafetyRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoverycontrol.SafetyRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53recoverycontrol.SafetyRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Route 53 Recovery Control Config Control Panel. */
  def ControlPanel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoverycontrol.ControlPanelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoverycontrol.ControlPanelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53recoverycontrol.ControlPanel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Route 53 Recovery Control Config Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoverycontrol.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoverycontrol.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.route53recoverycontrol.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an AWS Route 53 Recovery Control Config Routing Control. */
  def RoutingControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.route53recoverycontrol.RoutingControlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.route53recoverycontrol.RoutingControlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.route53recoverycontrol.RoutingControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.route53recoverycontrol.inputs.ClusterState.Builder)
    /**
     * @param clusterEndpoints List of 5 endpoints in 5 regions that can be used to talk to the cluster. See below.
     * @return builder
     */
    def clusterEndpoints(args: Endofunction[com.pulumi.aws.route53recoverycontrol.inputs.ClusterClusterEndpointArgs.Builder]*):
        com.pulumi.aws.route53recoverycontrol.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.aws.route53recoverycontrol.inputs.ClusterClusterEndpointArgs.builder
      builder.clusterEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleState.Builder)
    /**
     * @param ruleConfig Configuration block for safety rule criteria. See below.
     * @return builder
     */
    def ruleConfig(args: Endofunction[com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.Builder]):
        com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleState.Builder =
      val argsBuilder = com.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs.builder
      builder.ruleConfig(args(argsBuilder).build)
