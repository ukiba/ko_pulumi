package jp.ukiba.ko_pulumi
package gcp

object datalineage_ext:
  extension (builder: com.pulumi.gcp.datalineage.ConfigArgs.Builder)
    /**
     * @param ingestion Defines how Lineage should be ingested for this resource.
     * Structure is documented below.
     * @return builder
     */
    inline def ingestion(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder]):
        com.pulumi.gcp.datalineage.ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.builder
      builder.ingestion(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder)
    /**
     * @param rules List of ingestion rules for Data Lineage ingestion.
     * Structure is documented below.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder]*):
        com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder)
    /**
     * @param integrationSelector Selects which integration this rule applies to.
     * Structure is documented below.
     * @return builder
     */
    inline def integrationSelector(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleIntegrationSelectorArgs.Builder]):
        com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleIntegrationSelectorArgs.builder
      builder.integrationSelector(args(argsBuilder).build)

    /**
     * @param lineageEnablement Configures lineage ingestion enablement for this scope.
     * Structure is documented below.
     * @return builder
     */
    inline def lineageEnablement(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleLineageEnablementArgs.Builder]):
        com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionRuleLineageEnablementArgs.builder
      builder.lineageEnablement(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datalineage.inputs.ConfigState.Builder)
    /**
     * @param ingestion Defines how Lineage should be ingested for this resource.
     * Structure is documented below.
     * @return builder
     */
    inline def ingestion(args: Endofunction[com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.Builder]):
        com.pulumi.gcp.datalineage.inputs.ConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.ConfigIngestionArgs.builder
      builder.ingestion(args(argsBuilder).build)
