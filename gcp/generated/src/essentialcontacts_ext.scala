package jp.ukiba.ko_pulumi
package gcp

object essentialcontacts_ext:
  extension (builder: com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.Builder)
    /**
     * @param propertyDefinitions Defines the metadata for a schema property.
     * Structure is documented below.
     * @return builder
     */
    inline def propertyDefinitions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.builder
      builder.propertyDefinitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder)
    /**
     * @param dateTimeTypeOptions Date time property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    inline def dateTimeTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptionsArgs.builder
      builder.dateTimeTypeOptions(args(argsBuilder).build)

    /**
     * @param enumTypeOptions Enum/categorical property.
     * Structure is documented below.
     * @return builder
     */
    inline def enumTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs.builder
      builder.enumTypeOptions(args(argsBuilder).build)

    /**
     * @param floatTypeOptions Float property.
     * @return builder
     */
    inline def floatTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptionsArgs.builder
      builder.floatTypeOptions(args(argsBuilder).build)

    /**
     * @param integerTypeOptions Integer property.
     * @return builder
     */
    inline def integerTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptionsArgs.builder
      builder.integerTypeOptions(args(argsBuilder).build)

    /**
     * @param mapTypeOptions Map property.
     * @return builder
     */
    inline def mapTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptionsArgs.builder
      builder.mapTypeOptions(args(argsBuilder).build)

    /**
     * @param propertyTypeOptions Nested structured data property.
     * Structure is documented below.
     * @return builder
     */
    inline def propertyTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.builder
      builder.propertyTypeOptions(args(argsBuilder).build)

    /**
     * @param schemaSources The schema source information.
     * Structure is documented below.
     * @return builder
     */
    inline def schemaSources(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs.builder
      builder.schemaSources(args.map(_(argsBuilder).build)*)

    /**
     * @param textTypeOptions Text property.
     * @return builder
     */
    inline def textTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptionsArgs.builder
      builder.textTypeOptions(args(argsBuilder).build)

    /**
     * @param timestampTypeOptions Timestamp property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    inline def timestampTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptionsArgs.builder
      builder.timestampTypeOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.Builder)
    /**
     * @param propertyDefinitions Defines the metadata for a schema property.
     * Structure is documented below.
     * @return builder
     */
    inline def propertyDefinitions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.builder
      builder.propertyDefinitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder)
    /**
     * @param dateTimeTypeOptions Date time property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    inline def dateTimeTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptionsArgs.builder
      builder.dateTimeTypeOptions(args(argsBuilder).build)

    /**
     * @param enumTypeOptions Enum/categorical property.
     * Structure is documented below.
     * @return builder
     */
    inline def enumTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptionsArgs.builder
      builder.enumTypeOptions(args(argsBuilder).build)

    /**
     * @param floatTypeOptions Float property.
     * @return builder
     */
    inline def floatTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptionsArgs.builder
      builder.floatTypeOptions(args(argsBuilder).build)

    /**
     * @param integerTypeOptions Integer property.
     * @return builder
     */
    inline def integerTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptionsArgs.builder
      builder.integerTypeOptions(args(argsBuilder).build)

    /**
     * @param mapTypeOptions Map property.
     * @return builder
     */
    inline def mapTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptionsArgs.builder
      builder.mapTypeOptions(args(argsBuilder).build)

    /**
     * @param schemaSources The schema source information.
     * Structure is documented below.
     * @return builder
     */
    inline def schemaSources(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArgs.builder
      builder.schemaSources(args.map(_(argsBuilder).build)*)

    /**
     * @param textTypeOptions Text property.
     * @return builder
     */
    inline def textTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptionsArgs.builder
      builder.textTypeOptions(args(argsBuilder).build)

    /**
     * @param timestampTypeOptions Timestamp property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    inline def timestampTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptionsArgs.builder
      builder.timestampTypeOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaState.Builder)
    /**
     * @param propertyDefinitions Defines the metadata for a schema property.
     * Structure is documented below.
     * @return builder
     */
    inline def propertyDefinitions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaState.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.builder
      builder.propertyDefinitions(args.map(_(argsBuilder).build)*)
