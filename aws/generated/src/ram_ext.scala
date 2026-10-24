package jp.ukiba.ko_pulumi
package aws

object ram_ext:
  extension (builder: com.pulumi.aws.ram.PermissionArgs.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ram.PermissionArgs.Builder =
      val argsBuilder = com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ram.ResourceShareArgs.Builder)
    /**
     * @param resourceShareConfiguration Configuration block for the resource share. See `resourceShareConfiguration` Block for details.
     * @return builder
     */
    inline def resourceShareConfiguration(args: Endofunction[com.pulumi.aws.ram.inputs.ResourceShareResourceShareConfigurationArgs.Builder]):
        com.pulumi.aws.ram.ResourceShareArgs.Builder =
      val argsBuilder = com.pulumi.aws.ram.inputs.ResourceShareResourceShareConfigurationArgs.builder
      builder.resourceShareConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ram.inputs.GetResourceShareArgs.Builder)
    /**
     * @param filters Filter used to scope the list e.g., by tags. See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ram.inputs.GetResourceShareFilterArgs.Builder]*):
        com.pulumi.aws.ram.inputs.GetResourceShareArgs.Builder =
      def argsBuilder = com.pulumi.aws.ram.inputs.GetResourceShareFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ram.inputs.GetResourceSharePlainArgs.Builder)
    /**
     * @param filters Filter used to scope the list e.g., by tags. See `filter` Block below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.ram.inputs.GetResourceShareFilter.Builder]*):
        com.pulumi.aws.ram.inputs.GetResourceSharePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.ram.inputs.GetResourceShareFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.ram.inputs.PermissionState.Builder)
    inline def timeouts(args: Endofunction[com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.Builder]):
        com.pulumi.aws.ram.inputs.PermissionState.Builder =
      val argsBuilder = com.pulumi.aws.ram.inputs.PermissionTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ram.inputs.ResourceShareState.Builder)
    /**
     * @param resourceShareConfiguration Configuration block for the resource share. See `resourceShareConfiguration` Block for details.
     * @return builder
     */
    inline def resourceShareConfiguration(args: Endofunction[com.pulumi.aws.ram.inputs.ResourceShareResourceShareConfigurationArgs.Builder]):
        com.pulumi.aws.ram.inputs.ResourceShareState.Builder =
      val argsBuilder = com.pulumi.aws.ram.inputs.ResourceShareResourceShareConfigurationArgs.builder
      builder.resourceShareConfiguration(args(argsBuilder).build)
