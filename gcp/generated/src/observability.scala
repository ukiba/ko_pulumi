package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object observability:
  /** Bucket configuration for storing observability data. */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.observability.BucketArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.BucketArgs.builder
    com.pulumi.gcp.observability.Bucket(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Cloud Observability settings for a folder. */
  def FolderSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.observability.FolderSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.FolderSettingsArgs.builder
    com.pulumi.gcp.observability.FolderSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Link configuration for exposing observability dataset data. */
  def Link(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.observability.LinkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.LinkArgs.builder
    com.pulumi.gcp.observability.Link(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
    inline def getFolderSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetFolderSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetFolderSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getFolderSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a folder.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getFolderSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetFolderSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetFolderSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetFolderSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getFolderSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with an organization.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getOrganizationSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetOrganizationSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetOrganizationSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getOrganizationSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Describes the Google Cloud Observability Settings associated with an organization.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getOrganizationSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetOrganizationSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetOrganizationSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetOrganizationSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getOrganizationSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a project.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getProjectSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.GetProjectSettingsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.observability.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetProjectSettingsArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getProjectSettings(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Describes the Google Cloud Observability Settings associated with a project.
     * 
     * To get more information about Observability Settings, see:
     * 
     * * [API documentation](https://docs.cloud.google.com/stackdriver/docs/reference/observability/api/rest)
     * * How-to Guides
     *     * [Official Documentation](https://docs.cloud.google.com/stackdriver/docs/observability/set-defaults-for-observability-buckets)
     */
    inline def getProjectSettingsPlain(args: Endofunction[com.pulumi.gcp.observability.inputs.GetProjectSettingsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.observability.outputs.GetProjectSettingsResult] =
      val argsBuilder = com.pulumi.gcp.observability.inputs.GetProjectSettingsPlainArgs.builder
      com.pulumi.gcp.observability.ObservabilityFunctions.getProjectSettingsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages Cloud Observability settings for an organization. */
  def OrganizationSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.observability.OrganizationSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.OrganizationSettingsArgs.builder
    com.pulumi.gcp.observability.OrganizationSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Cloud Observability settings for a project. */
  def ProjectSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.observability.ProjectSettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.ProjectSettingsArgs.builder
    com.pulumi.gcp.observability.ProjectSettings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A trace scope is a collection of resources whose traces are queried together */
  def TraceScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.observability.TraceScopeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.observability.TraceScopeArgs.builder
    com.pulumi.gcp.observability.TraceScope(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
