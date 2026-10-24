package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object privatelink:
  /** Manages an association between Private Endpoint and Application Security Group. */
  def ApplicationSecurityGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatelink.ApplicationSecurityGroupAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.privatelink.ApplicationSecurityGroupAssociationArgs.builder
    com.pulumi.azure.privatelink.ApplicationSecurityGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Private Endpoint.
   * 
   * Azure Private Endpoint is a network interface that connects you privately and securely to a service powered by Azure Private Link. Private Endpoint uses a private IP address from your VNet, effectively bringing the service into your VNet. The service could be an Azure service such as Azure Storage, SQL, etc. or your own Private Link Service.
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.privatelink.EndpointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.privatelink.EndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.privatelink.Endpoint(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object PrivatelinkFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access the connection status information about an existing Private Endpoint Connection. */
    inline def getEndpointConnection(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetEndpointConnectionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatelink.outputs.GetEndpointConnectionResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetEndpointConnectionArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getEndpointConnection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access the connection status information about an existing Private Endpoint Connection. */
    inline def getEndpointConnectionPlain(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetEndpointConnectionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatelink.outputs.GetEndpointConnectionResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetEndpointConnectionPlainArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getEndpointConnectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Private Link Service. */
    inline def getService(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServiceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatelink.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServiceArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Private Link Service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatelink.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access endpoint connection information about an existing Private Link Service. */
    inline def getServiceEndpointConnections(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.privatelink.outputs.GetServiceEndpointConnectionsResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getServiceEndpointConnections(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access endpoint connection information about an existing Private Link Service. */
    inline def getServiceEndpointConnectionsPlain(args: Endofunction[com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.privatelink.outputs.GetServiceEndpointConnectionsResult] =
      val argsBuilder = com.pulumi.azure.privatelink.inputs.GetServiceEndpointConnectionsPlainArgs.builder
      com.pulumi.azure.privatelink.PrivatelinkFunctions.getServiceEndpointConnectionsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
