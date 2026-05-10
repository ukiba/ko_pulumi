package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object redhatopenshift:
  /**
   * Manages a fully managed Azure Red Hat OpenShift Cluster (also known as ARO).
   * 
   *  &gt; **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   * 
   *  ## Import
   * 
   *  Red Hat OpenShift Clusters can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:redhatopenshift/cluster:Cluster cluster1 /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.RedHatOpenShift/openShiftClusters/cluster1
   *  ```
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redhatopenshift.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redhatopenshift.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.redhatopenshift.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.redhatopenshift.ClusterArgs.Builder)
    /**
     * @param apiServerProfile An `apiServerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def apiServerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.builder
      builder.apiServerProfile(args(argsBuilder).build)

    /**
     * @param clusterProfile A `clusterProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def clusterProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.builder
      builder.clusterProfile(args(argsBuilder).build)

    /**
     * @param ingressProfile An `ingressProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ingressProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.builder
      builder.ingressProfile(args(argsBuilder).build)

    /**
     * @param mainProfile A `mainProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def mainProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.builder
      builder.mainProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    /**
     * @param servicePrincipal A `servicePrincipal` block as defined below.
     * @return builder
     */
    def servicePrincipal(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

    /**
     * @param workerProfile A `workerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def workerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.builder
      builder.workerProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.redhatopenshift.ClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder)
    /**
     * @param apiServerProfile An `apiServerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def apiServerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterApiServerProfileArgs.builder
      builder.apiServerProfile(args(argsBuilder).build)

    /**
     * @param clusterProfile A `clusterProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def clusterProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterClusterProfileArgs.builder
      builder.clusterProfile(args(argsBuilder).build)

    /**
     * @param ingressProfile An `ingressProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def ingressProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterIngressProfileArgs.builder
      builder.ingressProfile(args(argsBuilder).build)

    /**
     * @param mainProfile A `mainProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def mainProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterMainProfileArgs.builder
      builder.mainProfile(args(argsBuilder).build)

    /**
     * @param networkProfile A `networkProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def networkProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterNetworkProfileArgs.builder
      builder.networkProfile(args(argsBuilder).build)

    /**
     * @param servicePrincipal A `servicePrincipal` block as defined below.
     * @return builder
     */
    def servicePrincipal(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterServicePrincipalArgs.builder
      builder.servicePrincipal(args(argsBuilder).build)

    /**
     * @param workerProfile A `workerProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def workerProfile(args: Endofunction[com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.Builder]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.redhatopenshift.inputs.ClusterWorkerProfileArgs.builder
      builder.workerProfile(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.redhatopenshift.inputs.ClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
