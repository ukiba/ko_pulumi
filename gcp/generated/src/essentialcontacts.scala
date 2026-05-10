package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object essentialcontacts:
  /** The default version for the processor. Deleting this resource is a no-op, and does not unset the default version. */
  def DocumentAiProcessorDefaultVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiProcessorDefaultVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiProcessorDefaultVersionArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiProcessorDefaultVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A contact that will receive notifications from Google Cloud.
   * 
   *  To get more information about Contact, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/resource-manager/docs/reference/essentialcontacts/rest/v1/projects.contacts)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/resource-manager/docs/managing-notification-contacts)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the Essential Contacts API will return a 403 error.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def Contact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.ContactArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.ContactArgs.builder
    com.pulumi.gcp.essentialcontacts.Contact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A location is used to initialize a project.
   * 
   *  To get more information about Location, see:
   * 
   *  * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/document-warehouse/docs/overview)
   */
  def DocumentAiWarehouseLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseLocationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseLocationArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A document schema is used to define document structure.
   * 
   *  To get more information about DocumentSchema, see:
   * 
   *  * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations.documentSchemas)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/document-warehouse/docs/manage-document-schemas)
   */
  def DocumentAiWarehouseDocumentSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The first-class citizen for Document AI. Each processor defines how to extract structural information from a document.
   * 
   *  To get more information about Processor, see:
   * 
   *  * [API documentation](https://cloud.google.com/document-ai/docs/reference/rest/v1/projects.locations.processors)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/document-ai/docs/overview)
   */
  def DocumentAiProcessor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiProcessorArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiProcessorArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiProcessor(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.Builder)
    /**
     * @param propertyDefinitions Defines the metadata for a schema property.
     *  Structure is documented below.
     * @return builder
     */
    def propertyDefinitions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.builder
      builder.propertyDefinitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaState.Builder)
    /**
     * @param propertyDefinitions Defines the metadata for a schema property.
     *  Structure is documented below.
     * @return builder
     */
    def propertyDefinitions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaState.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.builder
      builder.propertyDefinitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder)
    /**
     * @param dateTimeTypeOptions Date time property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    def dateTimeTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionDateTimeTypeOptionsArgs.builder
      builder.dateTimeTypeOptions(args(argsBuilder).build)

    /**
     * @param enumTypeOptions Enum/categorical property.
     *  Structure is documented below.
     * @return builder
     */
    def enumTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionEnumTypeOptionsArgs.builder
      builder.enumTypeOptions(args(argsBuilder).build)

    /**
     * @param floatTypeOptions Float property.
     * @return builder
     */
    def floatTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionFloatTypeOptionsArgs.builder
      builder.floatTypeOptions(args(argsBuilder).build)

    /**
     * @param integerTypeOptions Integer property.
     * @return builder
     */
    def integerTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionIntegerTypeOptionsArgs.builder
      builder.integerTypeOptions(args(argsBuilder).build)

    /**
     * @param mapTypeOptions Map property.
     * @return builder
     */
    def mapTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionMapTypeOptionsArgs.builder
      builder.mapTypeOptions(args(argsBuilder).build)

    /**
     * @param propertyTypeOptions Nested structured data property.
     *  Structure is documented below.
     * @return builder
     */
    def propertyTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.builder
      builder.propertyTypeOptions(args(argsBuilder).build)

    /**
     * @param schemaSources The schema source information.
     *  Structure is documented below.
     * @return builder
     */
    def schemaSources(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSourceArgs.builder
      builder.schemaSources(args.map(_(argsBuilder).build)*)

    /**
     * @param textTypeOptions Text property.
     * @return builder
     */
    def textTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTextTypeOptionsArgs.builder
      builder.textTypeOptions(args(argsBuilder).build)

    /**
     * @param timestampTypeOptions Timestamp property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    def timestampTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionTimestampTypeOptionsArgs.builder
      builder.timestampTypeOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder)
    /**
     * @param dateTimeTypeOptions Date time property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    def dateTimeTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionDateTimeTypeOptionsArgs.builder
      builder.dateTimeTypeOptions(args(argsBuilder).build)

    /**
     * @param enumTypeOptions Enum/categorical property.
     *  Structure is documented below.
     * @return builder
     */
    def enumTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionEnumTypeOptionsArgs.builder
      builder.enumTypeOptions(args(argsBuilder).build)

    /**
     * @param floatTypeOptions Float property.
     * @return builder
     */
    def floatTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionFloatTypeOptionsArgs.builder
      builder.floatTypeOptions(args(argsBuilder).build)

    /**
     * @param integerTypeOptions Integer property.
     * @return builder
     */
    def integerTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionIntegerTypeOptionsArgs.builder
      builder.integerTypeOptions(args(argsBuilder).build)

    /**
     * @param mapTypeOptions Map property.
     * @return builder
     */
    def mapTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionMapTypeOptionsArgs.builder
      builder.mapTypeOptions(args(argsBuilder).build)

    /**
     * @param schemaSources The schema source information.
     *  Structure is documented below.
     * @return builder
     */
    def schemaSources(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionSchemaSourceArgs.builder
      builder.schemaSources(args.map(_(argsBuilder).build)*)

    /**
     * @param textTypeOptions Text property.
     * @return builder
     */
    def textTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTextTypeOptionsArgs.builder
      builder.textTypeOptions(args(argsBuilder).build)

    /**
     * @param timestampTypeOptions Timestamp property. Not supported by CMEK compliant deployment.
     * @return builder
     */
    def timestampTypeOptions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptionsArgs.Builder]):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionTimestampTypeOptionsArgs.builder
      builder.timestampTypeOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.Builder)
    /**
     * @param propertyDefinitions Defines the metadata for a schema property.
     *  Structure is documented below.
     * @return builder
     */
    def propertyDefinitions(args: Endofunction[com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.Builder]*):
        com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.essentialcontacts.inputs.DocumentAiWarehouseDocumentSchemaPropertyDefinitionPropertyTypeOptionsPropertyDefinitionArgs.builder
      builder.propertyDefinitions(args.map(_(argsBuilder).build)*)
