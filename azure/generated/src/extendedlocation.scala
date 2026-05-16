package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object extendedlocation:
  extension (builder: com.pulumi.azure.extendedlocation.CustomLocationArgs.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.Builder]):
        com.pulumi.azure.extendedlocation.CustomLocationArgs.Builder =
      val argsBuilder = com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

  /**
   * Manages a Custom Location within an Extended Location.
   * 
   *  &gt; **Note:** Installing and configuring the Azure Arc Agent on your Kubernetes Cluster to establish connectivity is outside the scope of this document. For more details refer to [Deploy agents to your cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/conceptual-agent-overview#deploy-agents-to-your-cluster) and [Connect an existing Kubernetes Cluster](https://learn.microsoft.com/en-us/azure/azure-arc/kubernetes/quickstart-connect-cluster?tabs=azure-cli#connect-an-existing-kubernetes-cluster). If you encounter issues connecting your Kubernetes Cluster to Azure Arc, we&#39;d recommend opening a ticket with Microsoft Support.
   * 
   *  ## Import
   * 
   *  Custom Locations can be imported using the resource id, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:extendedlocation/customLocation:CustomLocation example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example-resources/providers/Microsoft.ExtendedLocation/customLocations/example-custom-location
   *  ```
   */
  def CustomLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.extendedlocation.CustomLocationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.extendedlocation.CustomLocationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.extendedlocation.CustomLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ExtendedlocationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Custom Location within an Extended Location. */
    inline def getCustomLocation(args: Endofunction[com.pulumi.azure.extendedlocation.inputs.GetCustomLocationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.extendedlocation.outputs.GetCustomLocationResult] =
      val argsBuilder = com.pulumi.azure.extendedlocation.inputs.GetCustomLocationArgs.builder
      com.pulumi.azure.extendedlocation.ExtendedlocationFunctions.getCustomLocation(args(argsBuilder).build)

    /** Use this data source to access information about an existing Custom Location within an Extended Location. */
    inline def getCustomLocationPlain(args: Endofunction[com.pulumi.azure.extendedlocation.inputs.GetCustomLocationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.extendedlocation.outputs.GetCustomLocationResult] =
      val argsBuilder = com.pulumi.azure.extendedlocation.inputs.GetCustomLocationPlainArgs.builder
      com.pulumi.azure.extendedlocation.ExtendedlocationFunctions.getCustomLocationPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.extendedlocation.inputs.CustomLocationState.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.Builder]):
        com.pulumi.azure.extendedlocation.inputs.CustomLocationState.Builder =
      val argsBuilder = com.pulumi.azure.extendedlocation.inputs.CustomLocationAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)
