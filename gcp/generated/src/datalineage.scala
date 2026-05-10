package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object datalineage:
  /**
   * Configuration for Data Lineage.
   * 
   *  Defines configuration options for Lineage customers to control behavior of
   *  lineage systems.
   * 
   *  To get more information about Config, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/dataplex/docs/reference/data-lineage/rest/v1/folders.locations.config)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
   */
  def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datalineage.ConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datalineage.ConfigArgs.builder
    com.pulumi.gcp.datalineage.Config(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type DatalineageFunctions = com.pulumi.gcp.datalineage.DatalineageFunctions
  object DatalineageFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.datalineage.DatalineageFunctions.*
  extension (self: DatalineageFunctions.type)
    /**
     * Get a configuration for Data Lineage.
     * 
     *  To get more information about Config, see [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
     */
    def getConfig(args: Endofunction[com.pulumi.gcp.datalineage.inputs.GetConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datalineage.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.GetConfigArgs.builder
      com.pulumi.gcp.datalineage.DatalineageFunctions.getConfig(args(argsBuilder).build)

    /**
     * Get a configuration for Data Lineage.
     * 
     *  To get more information about Config, see [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
     */
    def getConfigPlain(args: Endofunction[com.pulumi.gcp.datalineage.inputs.GetConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datalineage.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.GetConfigPlainArgs.builder
      com.pulumi.gcp.datalineage.DatalineageFunctions.getConfigPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datalineage.ConfigArgs.Builder)
    /**
     * @param ingestion Defines how Lineage should be ingested for this resource.
     *  Structure is documented below.
     * @return builder
     */
    def ingestion(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder]):
        com.pulumi.gcp.datalineage.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.builder
      builder.ingestion(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder)
    /**
     * @param integrationSelector Selects which integration this rule applies to.
     *  Structure is documented below.
     * @return builder
     */
    def integrationSelector(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleIntegrationSelectorArgs.Builder]):
        com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleIntegrationSelectorArgs.builder
      builder.integrationSelector(args(argsBuilder).build)

    /**
     * @param lineageEnablement Configures lineage ingestion enablement for this scope.
     *  Structure is documented below.
     * @return builder
     */
    def lineageEnablement(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleLineageEnablementArgs.Builder]):
        com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleLineageEnablementArgs.builder
      builder.lineageEnablement(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder)
    /**
     * @param rules List of ingestion rules for Data Lineage ingestion.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder]*):
        com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datalineage.inputs.ConfigState.Builder)
    /**
     * @param ingestion Defines how Lineage should be ingested for this resource.
     *  Structure is documented below.
     * @return builder
     */
    def ingestion(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder]):
        com.pulumi.gcp.datalineage.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.builder
      builder.ingestion(args(argsBuilder).build)
