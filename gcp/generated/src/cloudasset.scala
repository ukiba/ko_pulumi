package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudasset:
  object CloudassetFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Retrieve all the resources within a given accessible CRM scope (project/folder/organization). See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1p1beta1/resources/searchAll)
     * for more details.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getResourcesSearchAll(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudasset.outputs.GetResourcesSearchAllInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getResourcesSearchAll(args(argsBuilder).build)

    /**
     * Retrieve all the resources within a given accessible CRM scope (project/folder/organization). See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1p1beta1/resources/searchAll)
     * for more details.
     * 
     * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getResourcesSearchAllPlain(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudasset.outputs.GetResourcesSearchAllInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetResourcesSearchAllPlainArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getResourcesSearchAllPlain(args(argsBuilder).build)

    /**
     * Searches all Google Cloud resources within the specified scope, such as a project, folder, or organization. See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources)
     * for more details.
     */
    inline def getSearchAllResources(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudasset.outputs.GetSearchAllResourcesInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getSearchAllResources(args(argsBuilder).build)

    /**
     * Searches all Google Cloud resources within the specified scope, such as a project, folder, or organization. See the
     * [REST API](https://cloud.google.com/asset-inventory/docs/reference/rest/v1/TopLevel/searchAllResources)
     * for more details.
     */
    inline def getSearchAllResourcesPlain(args: Endofunction[com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudasset.outputs.GetSearchAllResourcesInvokeResult] =
      val argsBuilder = com.pulumi.gcp.cloudasset.inputs.GetSearchAllResourcesPlainArgs.builder
      com.pulumi.gcp.cloudasset.CloudassetFunctions.getSearchAllResourcesPlain(args(argsBuilder).build)

  /**
   * Describes a Cloud Asset Inventory feed used to to listen to asset updates.
   * 
   * To get more information about FolderFeed, see:
   * 
   * * [API documentation](https://cloud.google.com/asset-inventory/docs/reference/rest/)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/asset-inventory/docs)
   */
  def FolderFeed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudasset.FolderFeedArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def OrganizationFeed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudasset.OrganizationFeedArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
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
  def ProjectFeed(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudasset.ProjectFeedArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudasset.ProjectFeedArgs.builder
    com.pulumi.gcp.cloudasset.ProjectFeed(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
