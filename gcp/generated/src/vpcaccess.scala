package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object vpcaccess:
  /**
   * Serverless VPC Access connector resource.
   * 
   * To get more information about Connector, see:
   * 
   * * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
   * * How-to Guides
   *     * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
   */
  inline def Connector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vpcaccess.ConnectorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vpcaccess.ConnectorArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vpcaccess.Connector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object VpcaccessFunctions:
    /**
     * Get a Serverless VPC Access connector.
     * 
     * To get more information about Connector, see:
     * 
     * * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
     * * How-to Guides
     *     * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
     */
    inline def getConnector(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.GetConnectorArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vpcaccess.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.GetConnectorArgs.builder
      com.pulumi.gcp.vpcaccess.VpcaccessFunctions.getConnector(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a Serverless VPC Access connector.
     * 
     * To get more information about Connector, see:
     * 
     * * [API documentation](https://cloud.google.com/vpc/docs/reference/vpcaccess/rest/v1/projects.locations.connectors)
     * * How-to Guides
     *     * [Configuring Serverless VPC Access](https://cloud.google.com/vpc/docs/configure-serverless-vpc-access)
     */
    inline def getConnectorPlain(args: Endofunction[com.pulumi.gcp.vpcaccess.inputs.GetConnectorPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vpcaccess.outputs.GetConnectorResult] =
      val argsBuilder = com.pulumi.gcp.vpcaccess.inputs.GetConnectorPlainArgs.builder
      com.pulumi.gcp.vpcaccess.VpcaccessFunctions.getConnectorPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
