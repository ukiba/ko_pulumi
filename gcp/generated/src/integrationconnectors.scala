package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object integrationconnectors:
  /**
   * An Integration connectors Connection.
   * 
   * To get more information about Connection, see:
   * 
   * * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.connections)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/integration-connectors/docs/createconnection)
   */
  inline def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.integrationconnectors.ConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.integrationconnectors.ConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.integrationconnectors.Connection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An Integration connectors Endpoint Attachment.
   * 
   * To get more information about EndpointAttachment, see:
   * 
   * * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.endpointAttachments)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/integration-connectors/docs/create-endpoint-attachment)
   */
  inline def EndpointAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.integrationconnectors.EndpointAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.integrationconnectors.EndpointAttachmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.integrationconnectors.EndpointAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An Integration connectors Managed Zone.
   * 
   * To get more information about ManagedZone, see:
   * 
   * * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.global.managedZones)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/integration-connectors/docs)
   */
  inline def ManagedZone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.integrationconnectors.ManagedZoneArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.integrationconnectors.ManagedZoneArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.integrationconnectors.ManagedZone(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
