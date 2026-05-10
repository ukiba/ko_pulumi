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

  type VpcaccessFunctions = com.pulumi.gcp.vpcaccess.VpcaccessFunctions
  object VpcaccessFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.vpcaccess.VpcaccessFunctions.*
  extension (self: VpcaccessFunctions.type)
    /**
     * Get a Serverless VPC Access connector.
     * 
     *  To get more information about Connector, see:
     * 
     *  * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
     *  * How-to Guides
     *      * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
     */
    def getConnector(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.GetConnectorArgs.Builder] = scala.Predef.identity):
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
    def getConnectorPlain(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.GetConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vpcaccess.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.GetConnectorPlainArgs.builder
      com.pulumi.gcp.vpcaccess.VpcaccessFunctions.getConnectorPlain(args(argsBuilder).build)
