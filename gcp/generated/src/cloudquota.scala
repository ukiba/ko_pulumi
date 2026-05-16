package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudquota:
  object CloudquotaFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides information about a particular quota for a given project, folder or organization. */
    inline def getSQuotaInfo(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfoArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudquota.outputs.GetSQuotaInfoResult] =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfoArgs.builder
      com.pulumi.gcp.cloudquota.CloudquotaFunctions.getSQuotaInfo(args(argsBuilder).build)

    /** Provides information about a particular quota for a given project, folder or organization. */
    inline def getSQuotaInfoPlain(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfoPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudquota.outputs.GetSQuotaInfoResult] =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfoPlainArgs.builder
      com.pulumi.gcp.cloudquota.CloudquotaFunctions.getSQuotaInfoPlain(args(argsBuilder).build)

    /** Provides information about all quotas for a given project, folder or organization. */
    inline def getSQuotaInfos(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfosArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.cloudquota.outputs.GetSQuotaInfosResult] =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfosArgs.builder
      com.pulumi.gcp.cloudquota.CloudquotaFunctions.getSQuotaInfos(args(argsBuilder).build)

    /** Provides information about all quotas for a given project, folder or organization. */
    inline def getSQuotaInfosPlain(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfosPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.cloudquota.outputs.GetSQuotaInfosResult] =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.GetSQuotaInfosPlainArgs.builder
      com.pulumi.gcp.cloudquota.CloudquotaFunctions.getSQuotaInfosPlain(args(argsBuilder).build)

  /**
   * QuotaAdjusterSettings resource represents your quota adjuster settings for a particular project. When enabled, the quota adjuster monitors your usage for the specified resources and issues quota adjustment requests when resource usage approaches its quota value.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about QuotaAdjusterSettings, see:
   * 
   *  * [API documentation](https://cloud.google.com/docs/quotas/reference/rest/v1beta/projects.locations.quotaAdjusterSettings)
   *  * How-to Guides
   *      * [Cloud Quotas Overview](https://cloud.google.com/docs/quotas/overview)
   */
  def SQuotaAdjusterSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudquota.SQuotaAdjusterSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudquota.SQuotaAdjusterSettingsArgs.builder
    com.pulumi.gcp.cloudquota.SQuotaAdjusterSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudquota.SQuotaPreferenceArgs.Builder)
    /**
     * @param quotaConfig The preferred quota configuration.
     *  Structure is documented below.
     * @return builder
     */
    def quotaConfig(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.Builder]):
        com.pulumi.gcp.cloudquota.SQuotaPreferenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.builder
      builder.quotaConfig(args(argsBuilder).build)

  /**
   * QuotaPreference represents the preferred quota configuration specified for a project, folder or organization. There is only one QuotaPreference resource for a quota value targeting a unique set of dimensions.
   * 
   *  To get more information about QuotaPreference, see:
   * 
   *  * [API documentation](https://cloud.google.com/docs/quotas/reference/rest/v1/projects.locations.quotaPreferences)
   *  * How-to Guides
   *      * [Cloud Quotas Overview](https://cloud.google.com/docs/quotas/overview)
   */
  def SQuotaPreference(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudquota.SQuotaPreferenceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.cloudquota.SQuotaPreferenceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.cloudquota.SQuotaPreference(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceState.Builder)
    /**
     * @param quotaConfig The preferred quota configuration.
     *  Structure is documented below.
     * @return builder
     */
    def quotaConfig(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.Builder]):
        com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.builder
      builder.quotaConfig(args(argsBuilder).build)
