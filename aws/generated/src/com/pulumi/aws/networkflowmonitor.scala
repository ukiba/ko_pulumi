package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object networkflowmonitor:
  extension (builder: com.pulumi.aws.networkflowmonitor.MonitorArgs.Builder)
    /**
     * @param localResources The local resources to monitor. A local resource in a workload is the location of the hosts where the Network Flow Monitor agent is installed.
     * @return builder
     */
    def localResources(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.MonitorLocalResourceArgs.Builder]*):
        com.pulumi.aws.networkflowmonitor.MonitorArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.MonitorLocalResourceArgs.builder
      builder.localResources(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteResources The remote resources to monitor. A remote resource is the other endpoint specified for the network flow of a workload, with a local resource.
     * @return builder
     */
    def remoteResources(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.MonitorRemoteResourceArgs.Builder]*):
        com.pulumi.aws.networkflowmonitor.MonitorArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.MonitorRemoteResourceArgs.builder
      builder.remoteResources(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.MonitorTimeoutsArgs.Builder]):
        com.pulumi.aws.networkflowmonitor.MonitorArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.MonitorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkflowmonitor.ScopeArgs.Builder)
    /**
     * @param targets The targets to define the scope to be monitored. A target is an array of target resources, which are currently Region-account pairs.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetArgs.Builder]*):
        com.pulumi.aws.networkflowmonitor.ScopeArgs.Builder =
      def argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.ScopeTimeoutsArgs.Builder]):
        com.pulumi.aws.networkflowmonitor.ScopeArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.ScopeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Manages a Network Flow Monitor Scope. */
  def Scope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkflowmonitor.ScopeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkflowmonitor.ScopeArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkflowmonitor.Scope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Network Flow Monitor Monitor. */
  def Monitor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.networkflowmonitor.MonitorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.networkflowmonitor.MonitorArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.networkflowmonitor.Monitor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetTargetIdentifierArgs.Builder)
    /**
     * @param targetId The identifier for a target, which is currently always an account ID.
     * @return builder
     */
    def targetId(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetTargetIdentifierTargetIdArgs.Builder]):
        com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetTargetIdentifierArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetTargetIdentifierTargetIdArgs.builder
      builder.targetId(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkflowmonitor.inputs.ScopeState.Builder)
    /**
     * @param targets The targets to define the scope to be monitored. A target is an array of target resources, which are currently Region-account pairs.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def targets(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetArgs.Builder]*):
        com.pulumi.aws.networkflowmonitor.inputs.ScopeState.Builder =
      def argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetArgs.builder
      builder.targets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.ScopeTimeoutsArgs.Builder]):
        com.pulumi.aws.networkflowmonitor.inputs.ScopeState.Builder =
      val argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.ScopeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetArgs.Builder)
    /**
     * @param targetIdentifier A target identifier is a pair of identifying information for a scope.
     * @return builder
     */
    def targetIdentifier(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetTargetIdentifierArgs.Builder]):
        com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetArgs.Builder =
      val argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.ScopeTargetTargetIdentifierArgs.builder
      builder.targetIdentifier(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.networkflowmonitor.inputs.MonitorState.Builder)
    /**
     * @param localResources The local resources to monitor. A local resource in a workload is the location of the hosts where the Network Flow Monitor agent is installed.
     * @return builder
     */
    def localResources(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.MonitorLocalResourceArgs.Builder]*):
        com.pulumi.aws.networkflowmonitor.inputs.MonitorState.Builder =
      def argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.MonitorLocalResourceArgs.builder
      builder.localResources(args.map(_(argsBuilder).build)*)

    /**
     * @param remoteResources The remote resources to monitor. A remote resource is the other endpoint specified for the network flow of a workload, with a local resource.
     * @return builder
     */
    def remoteResources(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.MonitorRemoteResourceArgs.Builder]*):
        com.pulumi.aws.networkflowmonitor.inputs.MonitorState.Builder =
      def argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.MonitorRemoteResourceArgs.builder
      builder.remoteResources(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.networkflowmonitor.inputs.MonitorTimeoutsArgs.Builder]):
        com.pulumi.aws.networkflowmonitor.inputs.MonitorState.Builder =
      val argsBuilder = com.pulumi.aws.networkflowmonitor.inputs.MonitorTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
