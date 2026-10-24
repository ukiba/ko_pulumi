package jp.ukiba.ko_pulumi
package azure

object redhatopenshift_ext:
  extension (builder: com.pulumi.azure.redhatopenshift.ClusterArgs.Builder)
    /**
     * @param apiServerProfile An `apiServerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def apiServerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.builder
      builder.apiServerProfile(args(argsBuilder).build)

    /**
     * @param clusterProfile A `clusterProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def clusterProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.builder
      builder.clusterProfile(args(argsBuilder).build)

    /**
     * @param ingressProfile An `ingressProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ingressProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.builder
      builder.ingressProfile(args(argsBuilder).build)

    /**
     * @param mainProfile A `mainProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def mainProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.builder
      builder.mainProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def networkProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    /**
     * @param servicePrincipal A `servicePrincipal` block as defined below.
     * @return builder
     */
    inline def servicePrincipal(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

    /**
     * @param workerProfile A `workerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def workerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.builder
      builder.workerProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder)
    /**
     * @param apiServerProfile An `apiServerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def apiServerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.builder
      builder.apiServerProfile(args(argsBuilder).build)

    /**
     * @param clusterProfile A `clusterProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def clusterProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.builder
      builder.clusterProfile(args(argsBuilder).build)

    /**
     * @param ingressProfile An `ingressProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def ingressProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.builder
      builder.ingressProfile(args(argsBuilder).build)

    /**
     * @param mainProfile A `mainProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def mainProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.builder
      builder.mainProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def networkProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    /**
     * @param servicePrincipal A `servicePrincipal` block as defined below.
     * @return builder
     */
    inline def servicePrincipal(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

    /**
     * @param workerProfile A `workerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def workerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.builder
      builder.workerProfile(args(argsBuilder).build)
