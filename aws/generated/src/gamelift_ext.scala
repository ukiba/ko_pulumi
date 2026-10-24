package jp.ukiba.ko_pulumi
package aws

object gamelift_ext:
  extension (builder: com.pulumi.aws.gamelift.AliasArgs.Builder)
    /**
     * @param routingStrategy Fleet and/or routing type to use for the alias.
     * @return builder
     */
    inline def routingStrategy(args: Endofunction[com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.Builder]):
        com.pulumi.aws.gamelift.AliasArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.builder
      builder.routingStrategy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.BuildArgs.Builder)
    /**
     * @param storageLocation Information indicating where your game build files are stored. See below.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.BuildArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.FleetArgs.Builder)
    /**
     * @param certificateConfiguration Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
     * @return builder
     */
    inline def certificateConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.builder
      builder.certificateConfiguration(args(argsBuilder).build)

    /**
     * @param ec2InboundPermissions Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     * @return builder
     */
    inline def ec2InboundPermissions(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.Builder]*):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.builder
      builder.ec2InboundPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceCreationLimitPolicy Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     * @return builder
     */
    inline def resourceCreationLimitPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.builder
      builder.resourceCreationLimitPolicy(args(argsBuilder).build)

    /**
     * @param runtimeConfiguration Instructions for launching server processes on each instance in the fleet. See below.
     * @return builder
     */
    inline def runtimeConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.FleetArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.builder
      builder.runtimeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.GameServerGroupArgs.Builder)
    inline def autoScalingPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.GameServerGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.builder
      builder.autoScalingPolicy(args(argsBuilder).build)

    inline def instanceDefinitions(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.Builder]*):
        com.pulumi.aws.gamelift.GameServerGroupArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.builder
      builder.instanceDefinitions(args.map(_(argsBuilder).build)*)

    inline def launchTemplate(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.gamelift.GameServerGroupArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.GameSessionQueueArgs.Builder)
    /**
     * @param playerLatencyPolicies One or more policies used to choose fleet based on player latency. See below.
     * @return builder
     */
    inline def playerLatencyPolicies(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.Builder]*):
        com.pulumi.aws.gamelift.GameSessionQueueArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.builder
      builder.playerLatencyPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.gamelift.ScriptArgs.Builder)
    /**
     * @param storageLocation Information indicating where your game script files are stored. See below.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.ScriptArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.AliasState.Builder)
    /**
     * @param routingStrategy Fleet and/or routing type to use for the alias.
     * @return builder
     */
    inline def routingStrategy(args: Endofunction[com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.AliasState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.AliasRoutingStrategyArgs.builder
      builder.routingStrategy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.BuildState.Builder)
    /**
     * @param storageLocation Information indicating where your game build files are stored. See below.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.BuildState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.BuildStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder)
    /**
     * @param serverProcesses Collection of server process configurations that describe which server processes to run on each instance in a fleet. See below.
     * @return builder
     */
    inline def serverProcesses(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationServerProcessArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationServerProcessArgs.builder
      builder.serverProcesses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.gamelift.inputs.FleetState.Builder)
    /**
     * @param certificateConfiguration Prompts GameLift to generate a TLS/SSL certificate for the fleet. See certificate_configuration.
     * @return builder
     */
    inline def certificateConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetCertificateConfigurationArgs.builder
      builder.certificateConfiguration(args(argsBuilder).build)

    /**
     * @param ec2InboundPermissions Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. See below.
     * @return builder
     */
    inline def ec2InboundPermissions(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.FleetEc2InboundPermissionArgs.builder
      builder.ec2InboundPermissions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceCreationLimitPolicy Policy that limits the number of game sessions an individual player can create over a span of time for this fleet. See below.
     * @return builder
     */
    inline def resourceCreationLimitPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetResourceCreationLimitPolicyArgs.builder
      builder.resourceCreationLimitPolicy(args(argsBuilder).build)

    /**
     * @param runtimeConfiguration Instructions for launching server processes on each instance in the fleet. See below.
     * @return builder
     */
    inline def runtimeConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.FleetRuntimeConfigurationArgs.builder
      builder.runtimeConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder)
    inline def targetTrackingConfiguration(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyTargetTrackingConfigurationArgs.builder
      builder.targetTrackingConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder)
    inline def autoScalingPolicy(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupAutoScalingPolicyArgs.builder
      builder.autoScalingPolicy(args(argsBuilder).build)

    inline def instanceDefinitions(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupInstanceDefinitionArgs.builder
      builder.instanceDefinitions(args.map(_(argsBuilder).build)*)

    inline def launchTemplate(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.GameServerGroupState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.GameServerGroupLaunchTemplateArgs.builder
      builder.launchTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.gamelift.inputs.GameSessionQueueState.Builder)
    /**
     * @param playerLatencyPolicies One or more policies used to choose fleet based on player latency. See below.
     * @return builder
     */
    inline def playerLatencyPolicies(args: Endofunction[com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.Builder]*):
        com.pulumi.aws.gamelift.inputs.GameSessionQueueState.Builder =
      def argsBuilder = com.pulumi.aws.gamelift.inputs.GameSessionQueuePlayerLatencyPolicyArgs.builder
      builder.playerLatencyPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.gamelift.inputs.ScriptState.Builder)
    /**
     * @param storageLocation Information indicating where your game script files are stored. See below.
     * @return builder
     */
    inline def storageLocation(args: Endofunction[com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.Builder]):
        com.pulumi.aws.gamelift.inputs.ScriptState.Builder =
      val argsBuilder = com.pulumi.aws.gamelift.inputs.ScriptStorageLocationArgs.builder
      builder.storageLocation(args(argsBuilder).build)
