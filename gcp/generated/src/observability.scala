package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object observability:
  object ObservabilityFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Describes the Google Cloud Observability Settings associated with a folder.
     * 
     *  To get more information about Observability Settings, see:
     * 
     *  * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     *  * How-to Guides
     *      * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     * 
     *  &gt; **Warning:** This data source is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getFolderSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetFolderSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetFolderSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getFolderSettings(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a folder.
     * 
     *  To get more information about Observability Settings, see:
     * 
     *  * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     *  * How-to Guides
     *      * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     * 
     *  &gt; **Warning:** This data source is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getFolderSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetFolderSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetFolderSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getFolderSettingsPlain(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with an organization.
     * 
     *  To get more information about Observability Settings, see:
     * 
     *  * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     *  * How-to Guides
     *      * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     * 
     *  &gt; **Warning:** This data source is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getOrganizationSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetOrganizationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetOrganizationSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getOrganizationSettings(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with an organization.
     * 
     *  To get more information about Observability Settings, see:
     * 
     *  * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     *  * How-to Guides
     *      * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     * 
     *  &gt; **Warning:** This data source is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getOrganizationSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetOrganizationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetOrganizationSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getOrganizationSettingsPlain(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a project.
     * 
     *  To get more information about Observability Settings, see:
     * 
     *  * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     *  * How-to Guides
     *      * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     * 
     *  &gt; **Warning:** This data source is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getProjectSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetProjectSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetProjectSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getProjectSettings(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a project.
     * 
     *  To get more information about Observability Settings, see:
     * 
     *  * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     *  * How-to Guides
     *      * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     * 
     *  &gt; **Warning:** This data source is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    inline def getProjectSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetProjectSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetProjectSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getProjectSettingsPlain(args(argsBuilder).build)

  /**
   * Manages Cloud Observability settings for an organization.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def OrganizationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.OrganizationSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.observability.OrganizationSettingsArgs.builder
    com.pulumi.gcp.observability.OrganizationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** A trace scope is a collection of resources whose traces are queried together */
  def TraceScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.TraceScopeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.observability.TraceScopeArgs.builder
    com.pulumi.gcp.observability.TraceScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Cloud Observability settings for a folder.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def FolderSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.FolderSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.observability.FolderSettingsArgs.builder
    com.pulumi.gcp.observability.FolderSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Cloud Observability settings for a project.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   */
  def ProjectSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.ProjectSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.observability.ProjectSettingsArgs.builder
    com.pulumi.gcp.observability.ProjectSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
