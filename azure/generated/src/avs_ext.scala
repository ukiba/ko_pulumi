package jp.ukiba.ko_pulumi
package azure

object avs_ext:
  extension (builder: com.pulumi.azure.avs.PrivateCloudArgs.Builder)
    /**
     * @param managementCluster A `managementCluster` block as defined below.
     * &gt; **Note:** `internetConnectionEnabled` and `management_cluster[0].size` cannot be updated at the same time.
     * @return builder
     */
    inline def managementCluster(args: Endofunction[com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.azure.avs.PrivateCloudArgs.Builder =
      val argsBuilder = com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.avs.inputs.PrivateCloudState.Builder)
    /**
     * @param circuits A `circuit` block as defined below.
     * @return builder
     */
    inline def circuits(args: Endofunction[com.pulumi.azure.avs.inputs.PrivateCloudCircuitArgs.Builder]*):
        com.pulumi.azure.avs.inputs.PrivateCloudState.Builder =
      def argsBuilder = com.pulumi.azure.avs.inputs.PrivateCloudCircuitArgs.builder
      builder.circuits(args.map(_(argsBuilder).build)*)

    /**
     * @param managementCluster A `managementCluster` block as defined below.
     * &gt; **Note:** `internetConnectionEnabled` and `management_cluster[0].size` cannot be updated at the same time.
     * @return builder
     */
    inline def managementCluster(args: Endofunction[com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.Builder]):
        com.pulumi.azure.avs.inputs.PrivateCloudState.Builder =
      val argsBuilder = com.pulumi.azure.avs.inputs.PrivateCloudManagementClusterArgs.builder
      builder.managementCluster(args(argsBuilder).build)
