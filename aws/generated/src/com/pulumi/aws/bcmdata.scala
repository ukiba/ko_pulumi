package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object bcmdata:
  extension (builder: com.pulumi.aws.bcmdata.ExportArgs.Builder)
    /**
     * @param export The details of the export, including data query, name, description, and destination configuration.  See the `export` argument reference below.
     * @return builder
     */
    def `export`(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportExportArgs.Builder]):
        com.pulumi.aws.bcmdata.ExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportExportArgs.builder
      builder.`export`(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportTimeoutsArgs.Builder]):
        com.pulumi.aws.bcmdata.ExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS BCM Data Exports Export. */
  def Export(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.bcmdata.ExportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.bcmdata.ExportArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.bcmdata.Export(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.bcmdata.inputs.ExportState.Builder)
    /**
     * @param export The details of the export, including data query, name, description, and destination configuration.  See the `export` argument reference below.
     * @return builder
     */
    def `export`(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportExportArgs.Builder]):
        com.pulumi.aws.bcmdata.inputs.ExportState.Builder =
      val argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportExportArgs.builder
      builder.`export`(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportTimeoutsArgs.Builder]):
        com.pulumi.aws.bcmdata.inputs.ExportState.Builder =
      val argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationS3DestinationArgs.Builder)
    /**
     * @param s3OutputConfigurations Output configuration for the data export. See the `s3OutputConfigurations` argument reference below.
     * @return builder
     */
    def s3OutputConfigurations(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationS3DestinationS3OutputConfigurationArgs.Builder]*):
        com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationS3DestinationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationS3DestinationS3OutputConfigurationArgs.builder
      builder.s3OutputConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bcmdata.inputs.ExportExportArgs.Builder)
    /**
     * @param dataQueries Data query for this specific data export. See the `dataQuery` argument reference below.
     * @return builder
     */
    def dataQueries(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportExportDataQueryArgs.Builder]*):
        com.pulumi.aws.bcmdata.inputs.ExportExportArgs.Builder =
      def argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportExportDataQueryArgs.builder
      builder.dataQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param destinationConfigurations Destination configuration for this specific data export. See the `destinationConfigurations` argument reference below.
     * @return builder
     */
    def destinationConfigurations(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationArgs.Builder]*):
        com.pulumi.aws.bcmdata.inputs.ExportExportArgs.Builder =
      def argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationArgs.builder
      builder.destinationConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param refreshCadences Cadence for Amazon Web Services to update the export in your S3 bucket. See the `refreshCadence` argument reference below.
     * @return builder
     */
    def refreshCadences(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportExportRefreshCadenceArgs.Builder]*):
        com.pulumi.aws.bcmdata.inputs.ExportExportArgs.Builder =
      def argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportExportRefreshCadenceArgs.builder
      builder.refreshCadences(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationArgs.Builder)
    /**
     * @param s3Destinations Object that describes the destination of the data exports file. See the `s3Destination` argument reference below.
     * @return builder
     */
    def s3Destinations(args: Endofunction[com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationS3DestinationArgs.Builder]*):
        com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.bcmdata.inputs.ExportExportDestinationConfigurationS3DestinationArgs.builder
      builder.s3Destinations(args.map(_(argsBuilder).build)*)
