package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object migrationcenter:
  /** AssetsExportJob represents a batch job that exports Migration Center assets to external destinations such as Cloud Storage. */
  def AssetsExportJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.builder
    com.pulumi.gcp.migrationcenter.AssetsExportJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** DiscoveryClient represents an on-premise discovery agent that scans infrastructure and uploads discovery data to Migration Center. */
  def DiscoveryClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.DiscoveryClientArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.DiscoveryClientArgs.builder
    com.pulumi.gcp.migrationcenter.DiscoveryClient(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A resource that represents an asset group. The purpose of an asset group is to bundle a set of assets that have something in common, while allowing users to add annotations to the group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.GroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.GroupArgs.builder
    com.pulumi.gcp.migrationcenter.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** ImportDataFile represents a user-uploaded data payload file containing infrastructure discovery data. */
  def ImportDataFile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ImportDataFileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ImportDataFileArgs.builder
    com.pulumi.gcp.migrationcenter.ImportDataFile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** ImportJob represents a batch data import task that processes uploaded data files and populates Migration Center assets. */
  def ImportJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ImportJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ImportJobArgs.builder
    com.pulumi.gcp.migrationcenter.ImportJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages the PreferenceSet resource.
   * 
   * To get more information about PreferenceSet, see:
   * 
   * * [API documentation](https://cloud.google.com/migration-center/docs/reference/rest/v1)
   * * How-to Guides
   *     * [Managing Migration Preferences](https://cloud.google.com/migration-center/docs/migration-preferences)
   */
  def PreferenceSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.PreferenceSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.PreferenceSetArgs.builder
    com.pulumi.gcp.migrationcenter.PreferenceSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Report represents an analytical assessment report summarizing infrastructure size, costs, and target suggestions. */
  def Report(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ReportArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ReportArgs.builder
    com.pulumi.gcp.migrationcenter.Report(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** ReportConfig defines the configuration and criteria used to generate Migration Center reports. */
  def ReportConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ReportConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ReportConfigArgs.builder
    com.pulumi.gcp.migrationcenter.ReportConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Settings represents the global or regional settings configuration for a Migration Center project. */
  def Settings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.SettingsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.SettingsArgs.builder
    com.pulumi.gcp.migrationcenter.Settings(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Source represents a data source from which asset discovery data is ingested into Migration Center. */
  def Source(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.SourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.SourceArgs.builder
    com.pulumi.gcp.migrationcenter.Source(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
