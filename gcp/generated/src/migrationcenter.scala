package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object migrationcenter:
  /** AssetsExportJob represents a batch job that exports Migration Center assets to external destinations such as Cloud Storage. */
  def AssetsExportJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.builder
    com.pulumi.gcp.migrationcenter.AssetsExportJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.Builder)
    /**
     * @param condition Conditions for selecting assets to export.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobConditionArgs.Builder]):
        com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param performanceData Configuration for performance data exports.
     * Structure is documented below.
     * @return builder
     */
    def performanceData(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobPerformanceDataArgs.Builder]):
        com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobPerformanceDataArgs.builder
      builder.performanceData(args(argsBuilder).build)

    /**
     * @param signedUriDestination Signed URI destination configuration.
     * Structure is documented below.
     * @return builder
     */
    def signedUriDestination(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobSignedUriDestinationArgs.Builder]):
        com.pulumi.gcp.migrationcenter.AssetsExportJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobSignedUriDestinationArgs.builder
      builder.signedUriDestination(args(argsBuilder).build)

  /** DiscoveryClient represents an on-premise discovery agent that scans infrastructure and uploads discovery data to Migration Center. */
  def DiscoveryClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.DiscoveryClientArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.DiscoveryClientArgs.builder
    com.pulumi.gcp.migrationcenter.DiscoveryClient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A resource that represents an asset group. The purpose of an asset group is to bundle a set of assets that have something in common, while allowing users to add annotations to the group. */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.GroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.GroupArgs.builder
    com.pulumi.gcp.migrationcenter.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** ImportDataFile represents a user-uploaded data payload file containing infrastructure discovery data. */
  def ImportDataFile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ImportDataFileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ImportDataFileArgs.builder
    com.pulumi.gcp.migrationcenter.ImportDataFile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** ImportJob represents a batch data import task that processes uploaded data files and populates Migration Center assets. */
  def ImportJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ImportJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ImportJobArgs.builder
    com.pulumi.gcp.migrationcenter.ImportJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages the PreferenceSet resource.
   * 
   * To get more information about PreferenceSet, see:
   * 
   * * [API documentation](https://cloud.google.com/migration-center/docs/reference/rest/v1)
   * * How-to Guides
   *     * [Managing Migration Preferences](https://cloud.google.com/migration-center/docs/migration-preferences)
   */
  def PreferenceSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.PreferenceSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.PreferenceSetArgs.builder
    com.pulumi.gcp.migrationcenter.PreferenceSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.migrationcenter.PreferenceSetArgs.Builder)
    /**
     * @param virtualMachinePreferences VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     * Structure is documented below.
     * @return builder
     */
    def virtualMachinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.PreferenceSetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.builder
      builder.virtualMachinePreferences(args(argsBuilder).build)

  /** Report represents an analytical assessment report summarizing infrastructure size, costs, and target suggestions. */
  def Report(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ReportArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ReportArgs.builder
    com.pulumi.gcp.migrationcenter.Report(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** ReportConfig defines the configuration and criteria used to generate Migration Center reports. */
  def ReportConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.ReportConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.ReportConfigArgs.builder
    com.pulumi.gcp.migrationcenter.ReportConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.migrationcenter.ReportConfigArgs.Builder)
    /**
     * @param groupPreferencesetAssignments Collection of combinations of groups and preference sets.
     * Structure is documented below.
     * @return builder
     */
    def groupPreferencesetAssignments(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportConfigGroupPreferencesetAssignmentArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.ReportConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportConfigGroupPreferencesetAssignmentArgs.builder
      builder.groupPreferencesetAssignments(args.map(_(argsBuilder).build)*)

  /** Settings represents the global or regional settings configuration for a Migration Center project. */
  def Settings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.SettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.SettingsArgs.builder
    com.pulumi.gcp.migrationcenter.Settings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Source represents a data source from which asset discovery data is ingested into Migration Center. */
  def Source(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.migrationcenter.SourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.migrationcenter.SourceArgs.builder
    com.pulumi.gcp.migrationcenter.Source(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionArgs.Builder)
    /**
     * @param results (Output)
     * Contains the result of the assets export.
     * Structure is documented below.
     * @return builder
     */
    def results(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultArgs.builder
      builder.results(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultArgs.Builder)
    /**
     * @param errors (Output)
     * The `Status` type defines a logical error model that is suitable for
     * different programming environments, including REST APIs and RPC APIs. It is
     * used by [gRPC](https://github.com/grpc). Each `Status` message contains
     * three pieces of data: error code, error message, and error details.
     * You can find out more about this error model and how to work with it in the
     * [API Design Guide](https://cloud.google.com/apis/design/errors).
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param outputFiles (Output)
     * Contains a list of output files.
     * Structure is documented below.
     * @return builder
     */
    def outputFiles(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileArgs.builder
      builder.outputFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param signedUris (Output)
     * List of signed URIs.
     * Structure is documented below.
     * @return builder
     */
    def signedUris(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultSignedUriArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultSignedUriArgs.builder
      builder.signedUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultErrorArgs.Builder)
    /**
     * @param details (Output)
     * A list of messages that carry the error details.  There is a common set of
     * message types for APIs to use.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultErrorDetailArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileArgs.Builder)
    /**
     * @param entries (Output)
     * List of output files.
     * Structure is documented below.
     * @return builder
     */
    def entries(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryArgs.builder
      builder.entries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryArgs.Builder)
    /**
     * @param csvOutputFiles (Output)
     * Contains a single output file of type CSV.
     * Structure is documented below.
     * @return builder
     */
    def csvOutputFiles(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryCsvOutputFileArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryCsvOutputFileArgs.builder
      builder.csvOutputFiles(args.map(_(argsBuilder).build)*)

    /**
     * @param xlsxOutputFiles (Output)
     * Contains a single output file of type XLSX.
     * Structure is documented below.
     * @return builder
     */
    def xlsxOutputFiles(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryXlsxOutputFileArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryXlsxOutputFileArgs.builder
      builder.xlsxOutputFiles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryCsvOutputFileArgs.Builder)
    /**
     * @param signedUris (Output)
     * Contains a signed URI.
     * Structure is documented below.
     * @return builder
     */
    def signedUris(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryCsvOutputFileSignedUriArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryCsvOutputFileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryCsvOutputFileSignedUriArgs.builder
      builder.signedUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryXlsxOutputFileArgs.Builder)
    /**
     * @param signedUris (Output)
     * Contains a signed URI.
     * Structure is documented below.
     * @return builder
     */
    def signedUris(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryXlsxOutputFileSignedUriArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryXlsxOutputFileArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultOutputFileEntryXlsxOutputFileSignedUriArgs.builder
      builder.signedUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultSignedUriArgs.Builder)
    /**
     * @param signedUris (Output)
     * List of signed URIs.
     * Structure is documented below.
     * @return builder
     */
    def signedUris(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultSignedUriSignedUriArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultSignedUriArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionResultSignedUriSignedUriArgs.builder
      builder.signedUris(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobState.Builder)
    /**
     * @param condition Conditions for selecting assets to export.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobConditionArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobState.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param inventories Configuration for asset inventory details exports.
     * @return builder
     */
    def inventories(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobInventoryArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobInventoryArgs.builder
      builder.inventories(args.map(_(argsBuilder).build)*)

    /**
     * @param networkDependencies Configuration for network dependencies exports.
     * @return builder
     */
    def networkDependencies(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobNetworkDependencyArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobNetworkDependencyArgs.builder
      builder.networkDependencies(args.map(_(argsBuilder).build)*)

    /**
     * @param performanceData Configuration for performance data exports.
     * Structure is documented below.
     * @return builder
     */
    def performanceData(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobPerformanceDataArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobState.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobPerformanceDataArgs.builder
      builder.performanceData(args(argsBuilder).build)

    /**
     * @param recentExecutions Recent non expired executions of the job.
     * Structure is documented below.
     * @return builder
     */
    def recentExecutions(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobRecentExecutionArgs.builder
      builder.recentExecutions(args.map(_(argsBuilder).build)*)

    /**
     * @param signedUriDestination Signed URI destination configuration.
     * Structure is documented below.
     * @return builder
     */
    def signedUriDestination(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobSignedUriDestinationArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobState.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.AssetsExportJobSignedUriDestinationArgs.builder
      builder.signedUriDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientErrorArgs.Builder)
    /**
     * @param details (Output)
     * A list of messages that carry the error details.  There is a common set of
     * message types for APIs to use.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientErrorDetailArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientErrorDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientState.Builder)
    /**
     * @param errors Errors affecting client functionality.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.DiscoveryClientErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportDataFileState.Builder)
    /**
     * @param uploadFileInfos A resource that contains a URI to which a data file can be uploaded.
     * Structure is documented below.
     * @return builder
     */
    def uploadFileInfos(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportDataFileUploadFileInfoArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportDataFileState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportDataFileUploadFileInfoArgs.builder
      builder.uploadFileInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportArgs.Builder)
    /**
     * @param executionErrors (Output)
     * A resource that aggregates errors across import job files.
     * Structure is documented below.
     * @return builder
     */
    def executionErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorArgs.builder
      builder.executionErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorArgs.Builder)
    /**
     * @param fileValidations (Output)
     * List of errors found in files.
     * Structure is documented below.
     * @return builder
     */
    def fileValidations(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationArgs.builder
      builder.fileValidations(args.map(_(argsBuilder).build)*)

    /**
     * @param jobErrors (Output)
     * List of job level errors.
     * Structure is documented below.
     * @return builder
     */
    def jobErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorJobErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorJobErrorArgs.builder
      builder.jobErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationArgs.Builder)
    /**
     * @param fileErrors (Output)
     * List of file level errors.
     * Structure is documented below.
     * @return builder
     */
    def fileErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationFileErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationFileErrorArgs.builder
      builder.fileErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param rowErrors (Output)
     * Partial list of rows that encountered validation error.
     * Structure is documented below.
     * @return builder
     */
    def rowErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArgs.builder
      builder.rowErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArchiveErrorArgs.Builder)
    /**
     * @param csvErrors (Output)
     * Error details for a CSV file.
     * Structure is documented below.
     * @return builder
     */
    def csvErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArchiveErrorCsvErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArchiveErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArchiveErrorCsvErrorArgs.builder
      builder.csvErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArgs.Builder)
    /**
     * @param archiveErrors (Output)
     * Error details for an archive file.
     * Structure is documented below.
     * @return builder
     */
    def archiveErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArchiveErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArchiveErrorArgs.builder
      builder.archiveErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param csvErrors (Output)
     * Error details for a CSV file.
     * Structure is documented below.
     * @return builder
     */
    def csvErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorCsvErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorCsvErrorArgs.builder
      builder.csvErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param errors (Output)
     * The list of errors detected in the row.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param xlsxErrors (Output)
     * Error details for an XLSX file.
     * Structure is documented below.
     * @return builder
     */
    def xlsxErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorXlsxErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportExecutionErrorFileValidationRowErrorXlsxErrorArgs.builder
      builder.xlsxErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobState.Builder)
    /**
     * @param executionReports A resource that reports result of the import job execution.
     * Structure is documented below.
     * @return builder
     */
    def executionReports(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobExecutionReportArgs.builder
      builder.executionReports(args.map(_(argsBuilder).build)*)

    /**
     * @param validationReports A resource that aggregates errors across import job files.
     * Structure is documented below.
     * @return builder
     */
    def validationReports(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportArgs.builder
      builder.validationReports(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportArgs.Builder)
    /**
     * @param fileValidations (Output)
     * List of errors found in files.
     * Structure is documented below.
     * @return builder
     */
    def fileValidations(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationArgs.builder
      builder.fileValidations(args.map(_(argsBuilder).build)*)

    /**
     * @param jobErrors (Output)
     * List of job level errors.
     * Structure is documented below.
     * @return builder
     */
    def jobErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportJobErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportJobErrorArgs.builder
      builder.jobErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationArgs.Builder)
    /**
     * @param fileErrors (Output)
     * List of file level errors.
     * Structure is documented below.
     * @return builder
     */
    def fileErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationFileErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationFileErrorArgs.builder
      builder.fileErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param rowErrors (Output)
     * Partial list of rows that encountered validation error.
     * Structure is documented below.
     * @return builder
     */
    def rowErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArgs.builder
      builder.rowErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArchiveErrorArgs.Builder)
    /**
     * @param csvErrors (Output)
     * Error details for a CSV file.
     * Structure is documented below.
     * @return builder
     */
    def csvErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArchiveErrorCsvErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArchiveErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArchiveErrorCsvErrorArgs.builder
      builder.csvErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArgs.Builder)
    /**
     * @param archiveErrors (Output)
     * Error details for an archive file.
     * Structure is documented below.
     * @return builder
     */
    def archiveErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArchiveErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArchiveErrorArgs.builder
      builder.archiveErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param csvErrors (Output)
     * Error details for a CSV file.
     * Structure is documented below.
     * @return builder
     */
    def csvErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorCsvErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorCsvErrorArgs.builder
      builder.csvErrors(args.map(_(argsBuilder).build)*)

    /**
     * @param errors (Output)
     * The list of errors detected in the row.
     * Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param xlsxErrors (Output)
     * Error details for an XLSX file.
     * Structure is documented below.
     * @return builder
     */
    def xlsxErrors(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorXlsxErrorArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ImportJobValidationReportFileValidationRowErrorXlsxErrorArgs.builder
      builder.xlsxErrors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetState.Builder)
    /**
     * @param virtualMachinePreferences VirtualMachinePreferences enables you to create sets of assumptions, for example, a geographical location and pricing track, for your migrated virtual machines. The set of preferences influence recommendations for migrating virtual machine assets.
     * Structure is documented below.
     * @return builder
     */
    def virtualMachinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetState.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.builder
      builder.virtualMachinePreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder)
    /**
     * @param computeEnginePreferences The user preferences relating to Compute Engine target platform.
     * Structure is documented below.
     * @return builder
     */
    def computeEnginePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.builder
      builder.computeEnginePreferences(args(argsBuilder).build)

    /**
     * @param regionPreferences The user preferences relating to target regions.
     * Structure is documented below.
     * @return builder
     */
    def regionPreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesRegionPreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesRegionPreferencesArgs.builder
      builder.regionPreferences(args(argsBuilder).build)

    /**
     * @param soleTenancyPreferences Preferences concerning Sole Tenancy nodes and VMs.
     * Structure is documented below.
     * @return builder
     */
    def soleTenancyPreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.builder
      builder.soleTenancyPreferences(args(argsBuilder).build)

    /**
     * @param vmwareEnginePreferences The user preferences relating to Google Cloud VMware Engine target platform.
     * Structure is documented below.
     * @return builder
     */
    def vmwareEnginePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesVmwareEnginePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesVmwareEnginePreferencesArgs.builder
      builder.vmwareEnginePreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.Builder)
    /**
     * @param machinePreferences The type of machines to consider when calculating virtual machine migration insights and recommendations. Not all machine types are available in all zones and regions.
     * Structure is documented below.
     * @return builder
     */
    def machinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.Builder]):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.builder
      builder.machinePreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.Builder)
    /**
     * @param allowedMachineSeries Compute Engine machine series to consider for insights and recommendations. If empty, no restriction is applied on the machine series.
     * Structure is documented below.
     * @return builder
     */
    def allowedMachineSeries(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesAllowedMachineSeriesArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesComputeEnginePreferencesMachinePreferencesAllowedMachineSeriesArgs.builder
      builder.allowedMachineSeries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.Builder)
    /**
     * @param nodeTypes A list of sole tenant node types. An empty list means that all possible node types will be considered.
     * Structure is documented below.
     * @return builder
     */
    def nodeTypes(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.PreferenceSetVirtualMachinePreferencesSoleTenancyPreferencesNodeTypeArgs.builder
      builder.nodeTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportConfigState.Builder)
    /**
     * @param groupPreferencesetAssignments Collection of combinations of groups and preference sets.
     * Structure is documented below.
     * @return builder
     */
    def groupPreferencesetAssignments(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportConfigGroupPreferencesetAssignmentArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportConfigGroupPreferencesetAssignmentArgs.builder
      builder.groupPreferencesetAssignments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportState.Builder)
    /**
     * @param summaries Describes the Summary view of a Report, which contains aggregated values
     * for all the groups and preference sets included in this Report.
     * Structure is documented below.
     * @return builder
     */
    def summaries(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportState.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryArgs.builder
      builder.summaries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder)
    /**
     * @param coreCountHistograms (Output)
     * A Histogram Chart shows a distribution of values into buckets, showing
     * a count of values which fall into a bucket.
     * Structure is documented below.
     * @return builder
     */
    def coreCountHistograms(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatCoreCountHistogramArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatCoreCountHistogramArgs.builder
      builder.coreCountHistograms(args.map(_(argsBuilder).build)*)

    /**
     * @param memoryBytesHistograms (Output)
     * A Histogram Chart shows a distribution of values into buckets, showing
     * a count of values which fall into a bucket.
     * Structure is documented below.
     * @return builder
     */
    def memoryBytesHistograms(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryBytesHistogramArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryBytesHistogramArgs.builder
      builder.memoryBytesHistograms(args.map(_(argsBuilder).build)*)

    /**
     * @param memoryUtilizationCharts (Output)
     * Utilization Chart is a specific type of visualization which displays
     * a metric classified into &#34;Used&#34; and &#34;Free&#34; buckets.
     * Structure is documented below.
     * @return builder
     */
    def memoryUtilizationCharts(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryUtilizationChartArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryUtilizationChartArgs.builder
      builder.memoryUtilizationCharts(args.map(_(argsBuilder).build)*)

    /**
     * @param operatingSystems (Output)
     * Describes a collection of data points rendered as a Chart.
     * Structure is documented below.
     * @return builder
     */
    def operatingSystems(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatOperatingSystemArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatOperatingSystemArgs.builder
      builder.operatingSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param softwareInstances (Output)
     * Describes a collection of data points rendered as a Chart.
     * Structure is documented below.
     * @return builder
     */
    def softwareInstances(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatSoftwareInstanceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatSoftwareInstanceArgs.builder
      builder.softwareInstances(args.map(_(argsBuilder).build)*)

    /**
     * @param storageBytesHistograms (Output)
     * A Histogram Chart shows a distribution of values into buckets, showing
     * a count of values which fall into a bucket.
     * Structure is documented below.
     * @return builder
     */
    def storageBytesHistograms(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageBytesHistogramArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageBytesHistogramArgs.builder
      builder.storageBytesHistograms(args.map(_(argsBuilder).build)*)

    /**
     * @param storageUtilizationCharts (Output)
     * Utilization Chart is a specific type of visualization which displays
     * a metric classified into &#34;Used&#34; and &#34;Free&#34; buckets.
     * Structure is documented below.
     * @return builder
     */
    def storageUtilizationCharts(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageUtilizationChartArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageUtilizationChartArgs.builder
      builder.storageUtilizationCharts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatCoreCountHistogramArgs.Builder)
    /**
     * @param buckets (Output)
     * Buckets in the histogram.
     * There will be `n+1` buckets matching `n` lower bounds in the request.
     * The first bucket will be from -infinity to the first bound.
     * Subsequent buckets will be between one bound and the next.
     * The final bucket will be from the final bound to infinity.
     * Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatCoreCountHistogramBucketArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatCoreCountHistogramArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatCoreCountHistogramBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryBytesHistogramArgs.Builder)
    /**
     * @param buckets (Output)
     * Buckets in the histogram.
     * There will be `n+1` buckets matching `n` lower bounds in the request.
     * The first bucket will be from -infinity to the first bound.
     * Subsequent buckets will be between one bound and the next.
     * The final bucket will be from the final bound to infinity.
     * Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryBytesHistogramBucketArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryBytesHistogramArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatMemoryBytesHistogramBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatOperatingSystemArgs.Builder)
    /**
     * @param dataPoints (Output)
     * Each data point in the chart is represented as a name-value pair
     * with the name being the x-axis label, and the value being the y-axis
     * value.
     * Structure is documented below.
     * @return builder
     */
    def dataPoints(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatOperatingSystemDataPointArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatOperatingSystemArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatOperatingSystemDataPointArgs.builder
      builder.dataPoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatSoftwareInstanceArgs.Builder)
    /**
     * @param dataPoints (Output)
     * Each data point in the chart is represented as a name-value pair
     * with the name being the x-axis label, and the value being the y-axis
     * value.
     * Structure is documented below.
     * @return builder
     */
    def dataPoints(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatSoftwareInstanceDataPointArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatSoftwareInstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatSoftwareInstanceDataPointArgs.builder
      builder.dataPoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageBytesHistogramArgs.Builder)
    /**
     * @param buckets (Output)
     * Buckets in the histogram.
     * There will be `n+1` buckets matching `n` lower bounds in the request.
     * The first bucket will be from -infinity to the first bound.
     * Subsequent buckets will be between one bound and the next.
     * The final bucket will be from the final bound to infinity.
     * Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageBytesHistogramBucketArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageBytesHistogramArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatStorageBytesHistogramBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryArgs.Builder)
    /**
     * @param allAssetsStats (Output)
     * Aggregate statistics for a collection of assets.
     * Structure is documented below.
     * @return builder
     */
    def allAssetsStats(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryAllAssetsStatArgs.builder
      builder.allAssetsStats(args.map(_(argsBuilder).build)*)

    /**
     * @param groupFindings (Output)
     * Findings for each Group included in this report.
     * Structure is documented below.
     * @return builder
     */
    def groupFindings(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingArgs.builder
      builder.groupFindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingArgs.Builder)
    /**
     * @param assetAggregateStats (Output)
     * Aggregate statistics for a collection of assets.
     * Structure is documented below.
     * @return builder
     */
    def assetAggregateStats(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.builder
      builder.assetAggregateStats(args.map(_(argsBuilder).build)*)

    /**
     * @param preferenceSetFindings (Output)
     * Findings for each of the PreferenceSets for this group.
     * Structure is documented below.
     * @return builder
     */
    def preferenceSetFindings(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.builder
      builder.preferenceSetFindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder)
    /**
     * @param coreCountHistograms (Output)
     * A Histogram Chart shows a distribution of values into buckets, showing
     * a count of values which fall into a bucket.
     * Structure is documented below.
     * @return builder
     */
    def coreCountHistograms(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatCoreCountHistogramArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatCoreCountHistogramArgs.builder
      builder.coreCountHistograms(args.map(_(argsBuilder).build)*)

    /**
     * @param memoryBytesHistograms (Output)
     * A Histogram Chart shows a distribution of values into buckets, showing
     * a count of values which fall into a bucket.
     * Structure is documented below.
     * @return builder
     */
    def memoryBytesHistograms(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryBytesHistogramArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryBytesHistogramArgs.builder
      builder.memoryBytesHistograms(args.map(_(argsBuilder).build)*)

    /**
     * @param memoryUtilizationCharts (Output)
     * Utilization Chart is a specific type of visualization which displays
     * a metric classified into &#34;Used&#34; and &#34;Free&#34; buckets.
     * Structure is documented below.
     * @return builder
     */
    def memoryUtilizationCharts(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryUtilizationChartArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryUtilizationChartArgs.builder
      builder.memoryUtilizationCharts(args.map(_(argsBuilder).build)*)

    /**
     * @param operatingSystems (Output)
     * Describes a collection of data points rendered as a Chart.
     * Structure is documented below.
     * @return builder
     */
    def operatingSystems(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatOperatingSystemArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatOperatingSystemArgs.builder
      builder.operatingSystems(args.map(_(argsBuilder).build)*)

    /**
     * @param softwareInstances (Output)
     * Describes a collection of data points rendered as a Chart.
     * Structure is documented below.
     * @return builder
     */
    def softwareInstances(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatSoftwareInstanceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatSoftwareInstanceArgs.builder
      builder.softwareInstances(args.map(_(argsBuilder).build)*)

    /**
     * @param storageBytesHistograms (Output)
     * A Histogram Chart shows a distribution of values into buckets, showing
     * a count of values which fall into a bucket.
     * Structure is documented below.
     * @return builder
     */
    def storageBytesHistograms(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageBytesHistogramArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageBytesHistogramArgs.builder
      builder.storageBytesHistograms(args.map(_(argsBuilder).build)*)

    /**
     * @param storageUtilizationCharts (Output)
     * Utilization Chart is a specific type of visualization which displays
     * a metric classified into &#34;Used&#34; and &#34;Free&#34; buckets.
     * Structure is documented below.
     * @return builder
     */
    def storageUtilizationCharts(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageUtilizationChartArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageUtilizationChartArgs.builder
      builder.storageUtilizationCharts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatCoreCountHistogramArgs.Builder)
    /**
     * @param buckets (Output)
     * Buckets in the histogram.
     * There will be `n+1` buckets matching `n` lower bounds in the request.
     * The first bucket will be from -infinity to the first bound.
     * Subsequent buckets will be between one bound and the next.
     * The final bucket will be from the final bound to infinity.
     * Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatCoreCountHistogramBucketArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatCoreCountHistogramArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatCoreCountHistogramBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryBytesHistogramArgs.Builder)
    /**
     * @param buckets (Output)
     * Buckets in the histogram.
     * There will be `n+1` buckets matching `n` lower bounds in the request.
     * The first bucket will be from -infinity to the first bound.
     * Subsequent buckets will be between one bound and the next.
     * The final bucket will be from the final bound to infinity.
     * Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryBytesHistogramBucketArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryBytesHistogramArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatMemoryBytesHistogramBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatOperatingSystemArgs.Builder)
    /**
     * @param dataPoints (Output)
     * Each data point in the chart is represented as a name-value pair
     * with the name being the x-axis label, and the value being the y-axis
     * value.
     * Structure is documented below.
     * @return builder
     */
    def dataPoints(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatOperatingSystemDataPointArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatOperatingSystemArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatOperatingSystemDataPointArgs.builder
      builder.dataPoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatSoftwareInstanceArgs.Builder)
    /**
     * @param dataPoints (Output)
     * Each data point in the chart is represented as a name-value pair
     * with the name being the x-axis label, and the value being the y-axis
     * value.
     * Structure is documented below.
     * @return builder
     */
    def dataPoints(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatSoftwareInstanceDataPointArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatSoftwareInstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatSoftwareInstanceDataPointArgs.builder
      builder.dataPoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageBytesHistogramArgs.Builder)
    /**
     * @param buckets (Output)
     * Buckets in the histogram.
     * There will be `n+1` buckets matching `n` lower bounds in the request.
     * The first bucket will be from -infinity to the first bound.
     * Subsequent buckets will be between one bound and the next.
     * The final bucket will be from the final bound to infinity.
     * Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageBytesHistogramBucketArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageBytesHistogramArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingAssetAggregateStatStorageBytesHistogramBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder)
    /**
     * @param computeEngineFindings (Output)
     * A set of findings that applies to assets destined for Compute Engine.
     * Structure is documented below.
     * @return builder
     */
    def computeEngineFindings(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingArgs.builder
      builder.computeEngineFindings(args.map(_(argsBuilder).build)*)

    /**
     * @param machinePreferences (Output)
     * The type of machines to consider when calculating virtual machine migration
     * insights and recommendations.
     * Not all machine types are available in all zones and regions.
     * Structure is documented below.
     * @return builder
     */
    def machinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceArgs.builder
      builder.machinePreferences(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlyCostComputes (Output)
     * Represents an amount of money with its currency type.
     * Structure is documented below.
     * @return builder
     */
    def monthlyCostComputes(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostComputeArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostComputeArgs.builder
      builder.monthlyCostComputes(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlyCostNetworkEgresses (Output)
     * Represents an amount of money with its currency type.
     * Structure is documented below.
     * @return builder
     */
    def monthlyCostNetworkEgresses(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostNetworkEgressArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostNetworkEgressArgs.builder
      builder.monthlyCostNetworkEgresses(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlyCostOsLicenses (Output)
     * Represents an amount of money with its currency type.
     * Structure is documented below.
     * @return builder
     */
    def monthlyCostOsLicenses(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostOsLicenseArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostOsLicenseArgs.builder
      builder.monthlyCostOsLicenses(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlyCostOthers (Output)
     * Represents an amount of money with its currency type.
     * Structure is documented below.
     * @return builder
     */
    def monthlyCostOthers(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostOtherArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostOtherArgs.builder
      builder.monthlyCostOthers(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlyCostStorages (Output)
     * Represents an amount of money with its currency type.
     * Structure is documented below.
     * @return builder
     */
    def monthlyCostStorages(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostStorageArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostStorageArgs.builder
      builder.monthlyCostStorages(args.map(_(argsBuilder).build)*)

    /**
     * @param monthlyCostTotals (Output)
     * Represents an amount of money with its currency type.
     * Structure is documented below.
     * @return builder
     */
    def monthlyCostTotals(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostTotalArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMonthlyCostTotalArgs.builder
      builder.monthlyCostTotals(args.map(_(argsBuilder).build)*)

    /**
     * @param soleTenantFindings (Output)
     * A set of findings that applies to assets destined for Sole-Tenant nodes.
     * Structure is documented below.
     * @return builder
     */
    def soleTenantFindings(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingArgs.builder
      builder.soleTenantFindings(args.map(_(argsBuilder).build)*)

    /**
     * @param vmwareEngineFindings (Output)
     * A set of findings that applies to assets destined for VMWare Engine.
     * Structure is documented below.
     * @return builder
     */
    def vmwareEngineFindings(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingArgs.builder
      builder.vmwareEngineFindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingArgs.Builder)
    /**
     * @param machineSeriesAllocations (Output)
     * Distribution of assets based on the Machine Series.
     * Structure is documented below.
     * @return builder
     */
    def machineSeriesAllocations(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingMachineSeriesAllocationArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingMachineSeriesAllocationArgs.builder
      builder.machineSeriesAllocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingMachineSeriesAllocationArgs.Builder)
    /**
     * @param machineSeries (Output)
     * A machine series, for a target product
     * (e.g. Compute Engine, Google Cloud VMware Engine).
     * Structure is documented below.
     * @return builder
     */
    def machineSeries(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingMachineSeriesAllocationMachineSeriesArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingMachineSeriesAllocationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingComputeEngineFindingMachineSeriesAllocationMachineSeriesArgs.builder
      builder.machineSeries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceArgs.Builder)
    /**
     * @param computeEnginePreferences (Output)
     * The user preferences relating to Compute Engine target platform.
     * Structure is documented below.
     * @return builder
     */
    def computeEnginePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceArgs.builder
      builder.computeEnginePreferences(args.map(_(argsBuilder).build)*)

    /**
     * @param regionPreferences (Output)
     * The user preferences relating to target regions.
     * Structure is documented below.
     * @return builder
     */
    def regionPreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceRegionPreferenceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceRegionPreferenceArgs.builder
      builder.regionPreferences(args.map(_(argsBuilder).build)*)

    /**
     * @param soleTenancyPreferences (Output)
     * Preferences concerning Sole Tenancy nodes and VMs.
     * Structure is documented below.
     * @return builder
     */
    def soleTenancyPreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceSoleTenancyPreferenceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceSoleTenancyPreferenceArgs.builder
      builder.soleTenancyPreferences(args.map(_(argsBuilder).build)*)

    /**
     * @param vmwareEnginePreferences (Output)
     * The user preferences relating to Google Cloud VMware Engine target platform.
     * Structure is documented below.
     * @return builder
     */
    def vmwareEnginePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceVmwareEnginePreferenceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceVmwareEnginePreferenceArgs.builder
      builder.vmwareEnginePreferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceArgs.Builder)
    /**
     * @param machinePreferences (Output)
     * The type of machines to consider when calculating virtual machine migration
     * insights and recommendations.
     * Not all machine types are available in all zones and regions.
     * Structure is documented below.
     * @return builder
     */
    def machinePreferences(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceMachinePreferenceArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceMachinePreferenceArgs.builder
      builder.machinePreferences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceMachinePreferenceArgs.Builder)
    /**
     * @param allowedMachineSeries (Output)
     * Compute Engine machine series to consider for insights and recommendations.
     * If empty, no restriction is applied on the machine series.
     * Structure is documented below.
     * @return builder
     */
    def allowedMachineSeries(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceMachinePreferenceAllowedMachineSeriesArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceMachinePreferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceComputeEnginePreferenceMachinePreferenceAllowedMachineSeriesArgs.builder
      builder.allowedMachineSeries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceSoleTenancyPreferenceArgs.Builder)
    /**
     * @param nodeTypes (Output)
     * A list of sole tenant node types.
     * An empty list means that all possible node types will be considered.
     * Structure is documented below.
     * @return builder
     */
    def nodeTypes(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceSoleTenancyPreferenceNodeTypeArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceSoleTenancyPreferenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingMachinePreferenceSoleTenancyPreferenceNodeTypeArgs.builder
      builder.nodeTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingArgs.Builder)
    /**
     * @param nodeAllocations (Output)
     * Set of per-nodetype allocation records
     * Structure is documented below.
     * @return builder
     */
    def nodeAllocations(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingNodeAllocationArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingNodeAllocationArgs.builder
      builder.nodeAllocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingNodeAllocationArgs.Builder)
    /**
     * @param nodes (Output)
     * A Sole Tenant node type.
     * Structure is documented below.
     * @return builder
     */
    def nodes(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingNodeAllocationNodeArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingNodeAllocationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingSoleTenantFindingNodeAllocationNodeArgs.builder
      builder.nodes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingArgs.Builder)
    /**
     * @param nodeAllocations (Output)
     * Set of per-nodetype allocation records
     * Structure is documented below.
     * @return builder
     */
    def nodeAllocations(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingNodeAllocationArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingNodeAllocationArgs.builder
      builder.nodeAllocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingNodeAllocationArgs.Builder)
    /**
     * @param vmwareNodes (Output)
     * A VMWare Engine Node
     * Structure is documented below.
     * @return builder
     */
    def vmwareNodes(args: Endofunction[com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingNodeAllocationVmwareNodeArgs.Builder]*):
        com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingNodeAllocationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.migrationcenter.inputs.ReportSummaryGroupFindingPreferenceSetFindingVmwareEngineFindingNodeAllocationVmwareNodeArgs.builder
      builder.vmwareNodes(args.map(_(argsBuilder).build)*)
