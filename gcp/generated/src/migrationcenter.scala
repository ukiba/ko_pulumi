package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object migrationcenter:
  /** A resource that represents an asset group. The purpose of an asset group is to bundle a set of assets that have something in common, while allowing users to add annotations to the group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.GroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.GroupArgs.builder
    com.pulumi.gcp.migrationcenter.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.PreferenceSetArgs.Builder)
    /**
     * @param virtualMachinePreferences VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     *  Structure is documented below.
     * @return builder
     */
    def virtualMachinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.PreferenceSetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.builder
      builder.virtualMachinePreferences(args(argsBuilder).build)

  /**
   * Manages the PreferenceSet resource.
   * 
   *  To get more information about PreferenceSet, see:
   * 
   *  * [API documentation](https://cloud.google.com/migration-center/docs/reference/rest/v1)
   *  * How-to Guides
   *      * [Managing Migration Preferences](https://cloud.google.com/migration-center/docs/migration-preferences)
   */
  def PreferenceSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.PreferenceSetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.PreferenceSetArgs.builder
    com.pulumi.gcp.migrationcenter.PreferenceSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.Builder)
    /**
     * @param nodeTypes A list of sole tenant node types. An empty list means that all possible node types will be considered.
     *  Structure is documented below.
     * @return builder
     */
    def nodeTypes(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs.builder
      builder.nodeTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder)
    /**
     * @param computeEnginePreferences The user preferences relating to Compute Engine target platform.
     *  Structure is documented below.
     * @return builder
     */
    def computeEnginePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.builder
      builder.computeEnginePreferences(args(argsBuilder).build)

    /**
     * @param regionPreferences The user preferences relating to target regions.
     *  Structure is documented below.
     * @return builder
     */
    def regionPreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesRegionPreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesRegionPreferencesArgs.builder
      builder.regionPreferences(args(argsBuilder).build)

    /**
     * @param soleTenancyPreferences Preferences concerning Sole Tenancy nodes and VMs.
     *  Structure is documented below.
     * @return builder
     */
    def soleTenancyPreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.builder
      builder.soleTenancyPreferences(args(argsBuilder).build)

    /**
     * @param vmwareEnginePreferences The user preferences relating to Google Cloud VMware Engine target platform.
     *  Structure is documented below.
     * @return builder
     */
    def vmwareEnginePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesVmwareEnginePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesVmwareEnginePreferencesArgs.builder
      builder.vmwareEnginePreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetState.Builder)
    /**
     * @param virtualMachinePreferences VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     *  Structure is documented below.
     * @return builder
     */
    def virtualMachinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetState.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.builder
      builder.virtualMachinePreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.Builder)
    /**
     * @param allowedMachineSeries Compute Engine machine series to consider for insights and recommendations. If empty, no restriction is applied on the machine series.
     *  Structure is documented below.
     * @return builder
     */
    def allowedMachineSeries(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesAllowedMachineSeriesArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesAllowedMachineSeriesArgs.builder
      builder.allowedMachineSeries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.Builder)
    /**
     * @param machinePreferences The type of machines to consider when calculating virtual machine migration insights and recommendations. Not all machine types are available in all zones and regions.
     *  Structure is documented below.
     * @return builder
     */
    def machinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.builder
      builder.machinePreferences(args(argsBuilder).build)
