package jp.ukiba.ko_pulumi
package azure

object appconfiguration_ext:
  extension (builder: com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder)
    /**
     * @param customFilters A `customFilter` block as defined below.
     * @return builder
     */
    inline def customFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.builder
      builder.customFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param targetingFilters A `targetingFilter` block as defined below.
     * @return builder
     */
    inline def targetingFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.builder
      builder.targetingFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param timewindowFilters A `timewindowFilter` block as defined below.
     * @return builder
     */
    inline def timewindowFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.builder
      builder.timewindowFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.Builder]):
        com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.Builder]):
        com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param replicas One or more `replica` blocks as defined below.
     * @return builder
     */
    inline def replicas(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder)
    /**
     * @param customFilters A `customFilter` block as defined below.
     * @return builder
     */
    inline def customFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.builder
      builder.customFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param targetingFilters A `targetingFilter` block as defined below.
     * @return builder
     */
    inline def targetingFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.builder
      builder.targetingFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param timewindowFilters A `timewindowFilter` block as defined below.
     * @return builder
     */
    inline def timewindowFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.builder
      builder.timewindowFilters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder)
    /**
     * @param groups One or more `groups` blocks as defined below.
     * @return builder
     */
    inline def groups(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterGroupArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterGroupArgs.builder
      builder.groups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * @return builder
     */
    inline def encryption(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.Builder]):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.Builder]):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param primaryReadKeys A `primaryReadKey` block as defined below containing the primary read access key.
     * @return builder
     */
    inline def primaryReadKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryReadKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryReadKeyArgs.builder
      builder.primaryReadKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryWriteKeys A `primaryWriteKey` block as defined below containing the primary write access key.
     * @return builder
     */
    inline def primaryWriteKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryWriteKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryWriteKeyArgs.builder
      builder.primaryWriteKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param replicas One or more `replica` blocks as defined below.
     * @return builder
     */
    inline def replicas(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

    /**
     * @param secondaryReadKeys A `secondaryReadKey` block as defined below containing the secondary read access key.
     * @return builder
     */
    inline def secondaryReadKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryReadKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryReadKeyArgs.builder
      builder.secondaryReadKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param secondaryWriteKeys A `secondaryWriteKey` block as defined below containing the secondary write access key.
     * @return builder
     */
    inline def secondaryWriteKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryWriteKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryWriteKeyArgs.builder
      builder.secondaryWriteKeys(args.map(_(argsBuilder).build)*)
