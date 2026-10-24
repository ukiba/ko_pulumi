package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object redhatopenshift:
  /**
   * Manages a fully managed Azure Red Hat OpenShift Cluster (also known as ARO).
   * 
   * &gt; **Note:** All arguments including the client secret will be stored in the raw state as plain-text. [Read more about sensitive data in state](https://www.terraform.io/docs/state/sensitive-data.html).
   * 
   * ## Import
   * 
   * Red Hat OpenShift Clusters can be imported using the `resource id`, e.g.
   * 
   * ```sh
   * \$ pulumi import azure:redhatopenshift/cluster:Cluster cluster1 /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/group1/providers/Microsoft.RedHatOpenShift/openShiftClusters/cluster1
   * ```
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.redhatopenshift.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.redhatopenshift.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.redhatopenshift.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
