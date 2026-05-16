package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object desktopvirtualization:
  /** Manages a Virtual Desktop Application. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.ApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.desktopvirtualization.ApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.desktopvirtualization.Application(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Virtual Desktop Scaling Plan.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** Scaling Plans are currently in preview and are only supported in a limited number of regions. Both the Scaling Plan and any referenced Host Pools must be deployed in a supported region. [Autoscale (preview) for Azure Virtual Desktop host pools](https://docs.microsoft.com/azure/virtual-desktop/autoscale-scaling-plan).
   * 
   *  &gt; **Note:** Scaling Plans require specific permissions to be granted to the Windows Virtual Desktop application before a &#39;host_pool&#39; can be configured. [Required Permissions for Scaling Plans](https://docs.microsoft.com/azure/virtual-desktop/autoscale-scaling-plan#create-a-custom-rbac-role).
   * 
   *  ## Import
   * 
   *  Virtual Desktop Scaling Plans can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:desktopvirtualization/scalingPlan:ScalingPlan example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DesktopVirtualization/scalingPlans/plan1
   *  ```
   */
  def ScalingPlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.desktopvirtualization.ScalingPlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder)
    /**
     * @param hostPools One or more `hostPool` blocks as defined below.
     * @return builder
     */
    def hostPools(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.builder
      builder.hostPools(args.map(_(argsBuilder).build)*)

    /**
     * @param schedules One or more `schedule` blocks as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.desktopvirtualization.ScalingPlanArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Virtual Desktop Scaling Plan Host Pool Association.
   * 
   *  ## Import
   * 
   *  Associations between Virtual Desktop Scaling Plans and Virtual Desktop Host Pools can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:desktopvirtualization/scalingPlanHostPoolAssociation:ScalingPlanHostPoolAssociation example &#34;/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.DesktopVirtualization/scalingPlans/plan1|/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup1/providers/Microsoft.DesktopVirtualization/hostPools/myhostpool&#34;
   *  ```
   * 
   *  &gt; **Note:** This ID is specific to Terraform - and is of the format `{virtualDesktopScalingPlanID}|{virtualDesktopHostPoolID}`.
   */
  def ScalingPlanHostPoolAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.ScalingPlanHostPoolAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.desktopvirtualization.ScalingPlanHostPoolAssociationArgs.builder
    com.pulumi.azure.desktopvirtualization.ScalingPlanHostPoolAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Desktop Application Group. */
  def ApplicationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.ApplicationGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.desktopvirtualization.ApplicationGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.desktopvirtualization.ApplicationGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object DesktopvirtualizationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Application Group. */
    inline def getApplicationGroup(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.GetApplicationGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.desktopvirtualization.outputs.GetApplicationGroupResult] =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.GetApplicationGroupArgs.builder
      com.pulumi.azure.desktopvirtualization.DesktopvirtualizationFunctions.getApplicationGroup(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Group. */
    inline def getApplicationGroupPlain(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.GetApplicationGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.desktopvirtualization.outputs.GetApplicationGroupResult] =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.GetApplicationGroupPlainArgs.builder
      com.pulumi.azure.desktopvirtualization.DesktopvirtualizationFunctions.getApplicationGroupPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Desktop Host Pool. */
    inline def getHostPool(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.GetHostPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.desktopvirtualization.outputs.GetHostPoolResult] =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.GetHostPoolArgs.builder
      com.pulumi.azure.desktopvirtualization.DesktopvirtualizationFunctions.getHostPool(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Desktop Host Pool. */
    inline def getHostPoolPlain(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.GetHostPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.desktopvirtualization.outputs.GetHostPoolResult] =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.GetHostPoolPlainArgs.builder
      com.pulumi.azure.desktopvirtualization.DesktopvirtualizationFunctions.getHostPoolPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Desktop Workspace. */
    inline def getWorkspace(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.GetWorkspaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.desktopvirtualization.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.GetWorkspaceArgs.builder
      com.pulumi.azure.desktopvirtualization.DesktopvirtualizationFunctions.getWorkspace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Virtual Desktop Workspace. */
    inline def getWorkspacePlain(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.GetWorkspacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.desktopvirtualization.outputs.GetWorkspaceResult] =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.GetWorkspacePlainArgs.builder
      com.pulumi.azure.desktopvirtualization.DesktopvirtualizationFunctions.getWorkspacePlain(args(argsBuilder).build)

  /** Manages a Virtual Desktop Workspace Application Group Association. */
  def WorkspaceApplicationGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.WorkspaceApplicationGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.desktopvirtualization.WorkspaceApplicationGroupAssociationArgs.builder
    com.pulumi.azure.desktopvirtualization.WorkspaceApplicationGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Desktop Host Pool. */
  def HostPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.HostPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.desktopvirtualization.HostPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.desktopvirtualization.HostPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages the Registration Info for a Virtual Desktop Host Pool. */
  def GetHostPoolRegistrationInfo(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.GetHostPoolRegistrationInfoArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.desktopvirtualization.GetHostPoolRegistrationInfoArgs.builder
    com.pulumi.azure.desktopvirtualization.GetHostPoolRegistrationInfo(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.desktopvirtualization.HostPoolArgs.Builder)
    /**
     * @param scheduledAgentUpdates A `scheduledAgentUpdates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * @return builder
     */
    def scheduledAgentUpdates(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder]):
        com.pulumi.azure.desktopvirtualization.HostPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.builder
      builder.scheduledAgentUpdates(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.desktopvirtualization.HostPoolArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Virtual Desktop Workspace. */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.desktopvirtualization.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.desktopvirtualization.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.desktopvirtualization.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanState.Builder)
    /**
     * @param hostPools One or more `hostPool` blocks as defined below.
     * @return builder
     */
    def hostPools(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanState.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanHostPoolArgs.builder
      builder.hostPools(args.map(_(argsBuilder).build)*)

    /**
     * @param schedules One or more `schedule` blocks as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanState.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.desktopvirtualization.inputs.ScalingPlanState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder)
    /**
     * @param schedules A `schedule` block as defined below. A maximum of two blocks can be added.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesScheduleArgs.Builder]*):
        com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder =
      def argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.desktopvirtualization.inputs.HostPoolState.Builder)
    /**
     * @param scheduledAgentUpdates A `scheduledAgentUpdates` block as defined below. This enables control of when Agent Updates will be applied to Session Hosts.
     * @return builder
     */
    def scheduledAgentUpdates(args: Endofunction[com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.Builder]):
        com.pulumi.azure.desktopvirtualization.inputs.HostPoolState.Builder =
      val argsBuilder = com.pulumi.azure.desktopvirtualization.inputs.HostPoolScheduledAgentUpdatesArgs.builder
      builder.scheduledAgentUpdates(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.desktopvirtualization.inputs.HostPoolState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
