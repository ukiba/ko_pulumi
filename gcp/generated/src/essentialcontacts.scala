package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object essentialcontacts:
  /**
   * A contact that will receive notifications from Google Cloud.
   * 
   * To get more information about Contact, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/resource-manager/docs/reference/essentialcontacts/rest/v1/projects.contacts)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/resource-manager/docs/managing-notification-contacts)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the Essential Contacts API will return a 403 error.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  def Contact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.ContactArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.ContactArgs.builder
    com.pulumi.gcp.essentialcontacts.Contact(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The first-class citizen for Document AI. Each processor defines how to extract structural information from a document.
   * 
   * To get more information about Processor, see:
   * 
   * * [API documentation](https://cloud.google.com/document-ai/docs/reference/rest/v1/projects.locations.processors)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/document-ai/docs/overview)
   */
  def DocumentAiProcessor(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiProcessorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiProcessorArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiProcessor(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** The default version for the processor. Deleting this resource is a no-op, and does not unset the default version. */
  def DocumentAiProcessorDefaultVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiProcessorDefaultVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiProcessorDefaultVersionArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiProcessorDefaultVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A document schema is used to define document structure.
   * 
   * To get more information about DocumentSchema, see:
   * 
   * * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations.documentSchemas)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/document-warehouse/docs/manage-document-schemas)
   */
  def DocumentAiWarehouseDocumentSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchemaArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseDocumentSchema(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A location is used to initialize a project.
   * 
   * To get more information about Location, see:
   * 
   * * [API documentation](https://cloud.google.com/document-warehouse/docs/reference/rest/v1/projects.locations)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/document-warehouse/docs/overview)
   */
  def DocumentAiWarehouseLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseLocationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseLocationArgs.builder
    com.pulumi.gcp.essentialcontacts.DocumentAiWarehouseLocation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
