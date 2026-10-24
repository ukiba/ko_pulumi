package jp.ukiba.ko_pulumi
package aws

object aws_ext:
  extension (builder: com.pulumi.aws.ProviderArgs.Builder)
    inline def assumeRoleWithWebIdentity(args: Endofunction[com.pulumi.aws.inputs.ProviderAssumeRoleWithWebIdentityArgs.Builder]):
        com.pulumi.aws.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.inputs.ProviderAssumeRoleWithWebIdentityArgs.builder
      builder.assumeRoleWithWebIdentity(args(argsBuilder).build)

    inline def assumeRoles(args: Endofunction[com.pulumi.aws.inputs.ProviderAssumeRoleArgs.Builder]*):
        com.pulumi.aws.ProviderArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.ProviderAssumeRoleArgs.builder
      builder.assumeRoles(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultTags Configuration block with settings to default resource tags across all resources.
     * @return builder
     */
    inline def defaultTags(args: Endofunction[com.pulumi.aws.inputs.ProviderDefaultTagsArgs.Builder]):
        com.pulumi.aws.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.inputs.ProviderDefaultTagsArgs.builder
      builder.defaultTags(args(argsBuilder).build)

    inline def endpoints(args: Endofunction[com.pulumi.aws.inputs.ProviderEndpointArgs.Builder]*):
        com.pulumi.aws.ProviderArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.ProviderEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param ignoreTags Configuration block with settings to ignore resource tags across all resources.
     * @return builder
     */
    inline def ignoreTags(args: Endofunction[com.pulumi.aws.inputs.ProviderIgnoreTagsArgs.Builder]):
        com.pulumi.aws.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.inputs.ProviderIgnoreTagsArgs.builder
      builder.ignoreTags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.inputs.GetAvailabilityZoneArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZoneFilterArgs.Builder]*):
        com.pulumi.aws.inputs.GetAvailabilityZoneArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZoneFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inputs.GetAvailabilityZonePlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZoneFilter.Builder]*):
        com.pulumi.aws.inputs.GetAvailabilityZonePlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZoneFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inputs.GetAvailabilityZonesArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZonesFilterArgs.Builder]*):
        com.pulumi.aws.inputs.GetAvailabilityZonesArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZonesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inputs.GetAvailabilityZonesPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZonesFilter.Builder]*):
        com.pulumi.aws.inputs.GetAvailabilityZonesPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZonesFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inputs.GetRegionsArgs.Builder)
    /**
     * @param filters Configuration block(s) to use as filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.inputs.GetRegionsFilterArgs.Builder]*):
        com.pulumi.aws.inputs.GetRegionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetRegionsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inputs.GetRegionsPlainArgs.Builder)
    /**
     * @param filters Configuration block(s) to use as filters. Detailed below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.inputs.GetRegionsFilter.Builder]*):
        com.pulumi.aws.inputs.GetRegionsPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetRegionsFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)
