package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object gamelift:
  /** Provides an GameLift Build resource. */
  def Build(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.gamelift.BuildArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.gamelift.BuildArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.gamelift.Build(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a GameLift Fleet resource. */
  def Fleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.gamelift.FleetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.gamelift.FleetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.gamelift.Fleet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.gamelift.GameSessionQueueArgs.Builder)
    /**
     * @param playerLatencyPolicies One or more policies used to choose fleet based on player latency. See below.
     * @return builder
     */
    def playerLatencyPolicies(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.Builder]*):
        com.pulumi.aws.gamelift.GameSessionQueueArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.builder
      builder.playerLatencyPolicies(args.map(_(argsBuilder).build)*)

  /** Provides a GameLift Alias resource. */
  def Alias(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.gamelift.AliasArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.gamelift.AliasArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.gamelift.Alias(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.gamelift.ScriptArgs.Builder)
    /**
     * @param storageLocation Information indicating where your game script files are stored. See below.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.ScriptArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  /** Provides an GameLift Game Session Queue resource. */
  def GameSessionQueue(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.gamelift.GameSessionQueueArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.gamelift.GameSessionQueueArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.gamelift.GameSessionQueue(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an GameLift Game Server Group resource. */
  def GameServerGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.gamelift.GameServerGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.gamelift.GameServerGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.gamelift.GameServerGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.gamelift.GameServerGroupArgs.Builder)
    def autoScalingPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.GameServerGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.builder
      builder.autoScalingPolicy(args(argsBuilder).build)

    def instanceDefinitions(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.Builder]*):
        com.pulumi.aws.gamelift.GameServerGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.builder
      builder.instanceDefinitions(args.map(_(argsBuilder).build)*)

    def launchTemplate(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.gamelift.GameServerGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.BuildArgs.Builder)
    /**
     * @param storageLocation Information indicating where your game build files are stored. See below.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.BuildArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.AliasArgs.Builder)
    /**
     * @param routingStrategy Specifies the fleet and/or routing type to use for the alias.
     * @return builder
     */
    def routingStrategy(args: Endofunction[com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.Builder]):
        com.pulumi.aws.gamelift.AliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.builder
      builder.routingStrategy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.FleetArgs.Builder)
    /**
     * @param certificateConfiguration Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
     * @return builder
     */
    def certificateConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.builder
      builder.certificateConfiguration(args(argsBuilder).build)

    /**
     * @param ec2InboundPermissions Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     * @return builder
     */
    def ec2InboundPermissions(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.Builder]*):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.builder
      builder.ec2InboundPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceCreationLimitPolicy Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     * @return builder
     */
    def resourceCreationLimitPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.builder
      builder.resourceCreationLimitPolicy(args(argsBuilder).build)

    /**
     * @param runtimeConfiguration Instructions for launching server processes on each instance in the fleet. See below.
     * @return builder
     */
    def runtimeConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.builder
      builder.runtimeConfiguration(args(argsBuilder).build)

  /** Provides an GameLift Script resource. */
  def Script(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.gamelift.ScriptArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.gamelift.ScriptArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.gamelift.Script(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder)
    /**
     * @param serverProcesses Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
     * @return builder
     */
    def serverProcesses(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationServerProcessArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationServerProcessArgs.builder
      builder.serverProcesses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.gamelift.inputs.AliasState.Builder)
    /**
     * @param routingStrategy Specifies the fleet and/or routing type to use for the alias.
     * @return builder
     */
    def routingStrategy(args: Endofunction[com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.AliasState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.builder
      builder.routingStrategy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.GameSessionQueueState.Builder)
    /**
     * @param playerLatencyPolicies One or more policies used to choose fleet based on player latency. See below.
     * @return builder
     */
    def playerLatencyPolicies(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.GameSessionQueueState.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.builder
      builder.playerLatencyPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.gamelift.inputs.ScriptState.Builder)
    /**
     * @param storageLocation Information indicating where your game script files are stored. See below.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.ScriptState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder)
    def targetTrackingConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs.builder
      builder.targetTrackingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.BuildState.Builder)
    /**
     * @param storageLocation Information indicating where your game build files are stored. See below.
     * @return builder
     */
    def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.BuildState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.FleetState.Builder)
    /**
     * @param certificateConfiguration Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
     * @return builder
     */
    def certificateConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.builder
      builder.certificateConfiguration(args(argsBuilder).build)

    /**
     * @param ec2InboundPermissions Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     * @return builder
     */
    def ec2InboundPermissions(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.builder
      builder.ec2InboundPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceCreationLimitPolicy Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     * @return builder
     */
    def resourceCreationLimitPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.builder
      builder.resourceCreationLimitPolicy(args(argsBuilder).build)

    /**
     * @param runtimeConfiguration Instructions for launching server processes on each instance in the fleet. See below.
     * @return builder
     */
    def runtimeConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.builder
      builder.runtimeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder)
    def autoScalingPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.builder
      builder.autoScalingPolicy(args(argsBuilder).build)

    def instanceDefinitions(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.builder
      builder.instanceDefinitions(args.map(_(argsBuilder).build)*)

    def launchTemplate(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)
