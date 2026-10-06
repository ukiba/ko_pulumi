package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object observability:
  /** Bucket configuration for storing observability data. */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.BucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.BucketArgs.builder
    com.pulumi.gcp.observability.Bucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.observability.BucketArgs.Builder)
    /**
     * @param cmekSettings Settings for configuring CMEK for a bucket.
     * Structure is documented below.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.Builder]):
        com.pulumi.gcp.observability.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

  /** Manages Cloud Observability settings for a folder. */
  def FolderSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.FolderSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.FolderSettingsArgs.builder
    com.pulumi.gcp.observability.FolderSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Link configuration for exposing observability dataset data. */
  def Link(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.LinkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.LinkArgs.builder
    com.pulumi.gcp.observability.Link(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object ObservabilityFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Describes the Google Cloud Observability Settings associated with a folder.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getFolderSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetFolderSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetFolderSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getFolderSettings(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a folder.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getFolderSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetFolderSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetFolderSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getFolderSettingsPlain(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with an organization.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getOrganizationSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetOrganizationSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetOrganizationSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getOrganizationSettings(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with an organization.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getOrganizationSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetOrganizationSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetOrganizationSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getOrganizationSettingsPlain(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a project.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getProjectSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetProjectSettingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetProjectSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getProjectSettings(args(argsBuilder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a project.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getProjectSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetProjectSettingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetProjectSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getProjectSettingsPlain(args(argsBuilder).build)

  /** Manages Cloud Observability settings for an organization. */
  def OrganizationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.OrganizationSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.OrganizationSettingsArgs.builder
    com.pulumi.gcp.observability.OrganizationSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages Cloud Observability settings for a project. */
  def ProjectSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.ProjectSettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.ProjectSettingsArgs.builder
    com.pulumi.gcp.observability.ProjectSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A trace scope is a collection of resources whose traces are queried together */
  def TraceScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.observability.TraceScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.TraceScopeArgs.builder
    com.pulumi.gcp.observability.TraceScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.observability.inputs.BucketState.Builder)
    /**
     * @param cmekSettings Settings for configuring CMEK for a bucket.
     * Structure is documented below.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.Builder]):
        com.pulumi.gcp.observability.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)
