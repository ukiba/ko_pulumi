package jp.ukiba.ko_pulumi
package azure

object maintenance_ext:
  extension (builder: com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder]):
        com.pulumi.azure.maintenance.AssignmentDynamicScopeArgs.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.maintenance.ConfigurationArgs.Builder)
    /**
     * @param installPatches An `installPatches` block as defined below.
     * 
     * &gt; **Note:** `installPatches` must be specified when `scope` is `InGuestPatch`.
     * @return builder
     */
    def installPatches(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder]):
        com.pulumi.azure.maintenance.ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.builder
      builder.installPatches(args(argsBuilder).build)

    /**
     * @param window A `window` block as defined below.
     * @return builder
     */
    def window(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.Builder]):
        com.pulumi.azure.maintenance.ConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.builder
      builder.window(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder)
    /**
     * @param tags One or more `tags` blocks as defined below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterTagArgs.Builder]*):
        com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeState.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.Builder]):
        com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeState.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.AssignmentDynamicScopeFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder)
    /**
     * @param linuxes A `linux` block as defined above. This property only applies when `scope` is set to `InGuestPatch`
     * @return builder
     */
    def linuxes(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesLinuxArgs.Builder]*):
        com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder =
      def argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesLinuxArgs.builder
      builder.linuxes(args.map(_(argsBuilder).build)*)

    /**
     * @param windows A `windows` block as defined above. This property only applies when `scope` is set to `InGuestPatch`
     * @return builder
     */
    def windows(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesWindowArgs.Builder]*):
        com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder =
      def argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesWindowArgs.builder
      builder.windows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.maintenance.inputs.ConfigurationState.Builder)
    /**
     * @param installPatches An `installPatches` block as defined below.
     * 
     * &gt; **Note:** `installPatches` must be specified when `scope` is `InGuestPatch`.
     * @return builder
     */
    def installPatches(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.Builder]):
        com.pulumi.azure.maintenance.inputs.ConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationInstallPatchesArgs.builder
      builder.installPatches(args(argsBuilder).build)

    /**
     * @param window A `window` block as defined below.
     * @return builder
     */
    def window(args: Endofunction[com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.Builder]):
        com.pulumi.azure.maintenance.inputs.ConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.maintenance.inputs.ConfigurationWindowArgs.builder
      builder.window(args(argsBuilder).build)
