package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object vpcaccess:
  /**
   * Serverless VPC Access connector resource.
   * 
   *  To get more information about Connector, see:
   * 
   *  * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
   *  * How-to Guides
   *      * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
   */
  def Connector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vpcaccess.ConnectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vpcaccess.ConnectorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vpcaccess.Connector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vpcaccess.ConnectorArgs.Builder)
    /**
     * @param subnet The subnet in which to house the connector
     *  Structure is documented below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.Builder]):
        com.pulumi.gcp.vpcaccess.ConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vpcaccess.inputs.ConnectorState.Builder)
    /**
     * @param subnet The subnet in which to house the connector
     *  Structure is documented below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.Builder]):
        com.pulumi.gcp.vpcaccess.inputs.ConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.ConnectorSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

  object VpcaccessFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get a Serverless VPC Access connector.
     * 
     *  To get more information about Connector, see:
     * 
     *  * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
     *  * How-to Guides
     *      * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
     */
    inline def getConnector(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.GetConnectorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vpcaccess.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.GetConnectorArgs.builder
      com.pulumi.gcp.vpcaccess.VpcaccessFunctions.getConnector(args(argsBuilder).build)

    /**
     * Get a Serverless VPC Access connector.
     * 
     *  To get more information about Connector, see:
     * 
     *  * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
     *  * How-to Guides
     *      * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
     */
    inline def getConnectorPlain(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.GetConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vpcaccess.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.GetConnectorPlainArgs.builder
      com.pulumi.gcp.vpcaccess.VpcaccessFunctions.getConnectorPlain(args(argsBuilder).build)
