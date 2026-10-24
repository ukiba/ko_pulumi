package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudasset:
  object CloudassetFunctions:
    /**
     * Retrieve all the resources within a given accessible CRM scope (project/folder/organization). See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1p1beta1/resources/searchAll)
     * for more details.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getResourcesSearchAll(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudasset.outputs.GetResourcesSearchAllInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getResourcesSearchAll(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieve all the resources within a given accessible CRM scope (project/folder/organization). See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1p1beta1/resources/searchAll)
     * for more details.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getResourcesSearchAllPlain(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudasset.outputs.GetResourcesSearchAllInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllPlainArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getResourcesSearchAllPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Searches all Google Cloud resources within the specified scope, such as a project, folder, or organization. See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources)
     * for more details.
     */
    inline def getSearchAllResources(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudasset.outputs.GetSearchAllResourcesInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getSearchAllResources(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Searches all Google Cloud resources within the specified scope, such as a project, folder, or organization. See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources)
     * for more details.
     */
    inline def getSearchAllResourcesPlain(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudasset.outputs.GetSearchAllResourcesInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesPlainArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getSearchAllResourcesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Describes a Cloud Asset Inventory feed used to to listen to asset updates.
   * 
   * To get more information about FolderFeed, see:
   * 
   * * [API documentation](https://cloud.google.com/asset-inventory/docs/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/asset-inventory/docs)
   */
  inline def FolderFeed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudasset.FolderFeedArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudasset.FolderFeedArgs.builder
    com.pulumi.gcp.cloudasset.FolderFeed(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Describes a Cloud Asset Inventory feed used to to listen to asset updates.
   * 
   * To get more information about OrganizationFeed, see:
   * 
   * * [API documentation](https://cloud.google.com/asset-inventory/docs/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/asset-inventory/docs)
   */
  inline def OrganizationFeed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudasset.OrganizationFeedArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudasset.OrganizationFeedArgs.builder
    com.pulumi.gcp.cloudasset.OrganizationFeed(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Describes a Cloud Asset Inventory feed used to to listen to asset updates.
   * 
   * To get more information about ProjectFeed, see:
   * 
   * * [API documentation](https://cloud.google.com/asset-inventory/docs/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/asset-inventory/docs)
   */
  inline def ProjectFeed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudasset.ProjectFeedArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudasset.ProjectFeedArgs.builder
    com.pulumi.gcp.cloudasset.ProjectFeed(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
