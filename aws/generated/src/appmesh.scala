package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object appmesh:
  object AppmeshFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** The App Mesh Gateway Route data source allows details of an App Mesh Gateway Route to be retrieved by its name, mesh_name, virtual_gateway_name, and optionally the mesh_owner. */
    inline def getGatewayRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetGatewayRouteArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetGatewayRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetGatewayRouteArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getGatewayRoute(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The App Mesh Gateway Route data source allows details of an App Mesh Gateway Route to be retrieved by its name, mesh_name, virtual_gateway_name, and optionally the mesh_owner. */
    inline def getGatewayRoutePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetGatewayRoutePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetGatewayRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetGatewayRoutePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getGatewayRoutePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The App Mesh Mesh data source allows details of an App Mesh Mesh to be retrieved by its name and optionally the mesh_owner. */
    inline def getMesh(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetMeshArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetMeshResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetMeshArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getMesh(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The App Mesh Mesh data source allows details of an App Mesh Mesh to be retrieved by its name and optionally the mesh_owner. */
    inline def getMeshPlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetMeshPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetMeshResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetMeshPlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getMeshPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The App Mesh Route data source allows details of an App Mesh Route to be retrieved by its name, mesh_name, virtual_router_name, and optionally the mesh_owner. */
    inline def getRoute(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetRouteArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetRouteArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getRoute(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The App Mesh Route data source allows details of an App Mesh Route to be retrieved by its name, mesh_name, virtual_router_name, and optionally the mesh_owner. */
    inline def getRoutePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetRoutePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetRouteResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetRoutePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getRoutePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS App Mesh Virtual Gateway. */
    inline def getVirtualGateway(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualGatewayArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualGatewayResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualGatewayArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualGateway(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS App Mesh Virtual Gateway. */
    inline def getVirtualGatewayPlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualGatewayPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualGatewayResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualGatewayPlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualGatewayPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS App Mesh Virtual Node. */
    inline def getVirtualNode(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualNodeArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualNodeResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualNodeArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualNode(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS App Mesh Virtual Node. */
    inline def getVirtualNodePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualNodePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualNodeResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualNodePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualNodePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The App Mesh Virtual Router data source allows details of an App Mesh Virtual Service to be retrieved by its name and mesh_name. */
    inline def getVirtualRouter(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualRouterArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualRouterResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualRouterArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualRouter(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The App Mesh Virtual Router data source allows details of an App Mesh Virtual Service to be retrieved by its name and mesh_name. */
    inline def getVirtualRouterPlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualRouterPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualRouterResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualRouterPlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualRouterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner. */
    inline def getVirtualService(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualServiceArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.appmesh.outputs.GetVirtualServiceResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualServiceArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** The App Mesh Virtual Service data source allows details of an App Mesh Virtual Service to be retrieved by its name, mesh_name, and optionally the mesh_owner. */
    inline def getVirtualServicePlain(args: Endofunction[com.pulumi.aws.appmesh.inputs.GetVirtualServicePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appmesh.outputs.GetVirtualServiceResult] =
      val argsBuilder = com.pulumi.aws.appmesh.inputs.GetVirtualServicePlainArgs.builder
      com.pulumi.aws.appmesh.AppmeshFunctions.getVirtualServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an AWS App Mesh gateway route resource. */
  def GatewayRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appmesh.GatewayRouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.GatewayRouteArgs.builder
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
    com.pulumi.aws.appmesh.GatewayRoute(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS App Mesh service mesh resource. */
  def Mesh(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appmesh.MeshArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.MeshArgs.builder
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
    com.pulumi.aws.appmesh.Mesh(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS App Mesh route resource. */
  def Route(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appmesh.RouteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.RouteArgs.builder
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
    com.pulumi.aws.appmesh.Route(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS App Mesh virtual gateway resource. */
  def VirtualGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualGatewayArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualGatewayArgs.builder
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
    com.pulumi.aws.appmesh.VirtualGateway(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an AWS App Mesh virtual node resource.
   * 
   * &gt; **Note:** Because of backward incompatible API changes ([see issue](https://github.com/awslabs/aws-app-mesh-examples/issues/92)), resource definitions created with provider versions earlier than v2.3.0 must be modified: rename the `serviceName` attribute of the `dns` object to `hostname`; replace the `backends` attribute of the `spec` object with one or more `backend` configuration blocks, setting `virtualServiceName` to the name of the service. Existing Pulumi state is automatically migrated.
   */
  def VirtualNode(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualNodeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualNodeArgs.builder
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
    com.pulumi.aws.appmesh.VirtualNode(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an AWS App Mesh virtual router resource.
   * 
   * &gt; **Note:** Because of backward incompatible API changes ([see issue](https://github.com/awslabs/aws-app-mesh-examples/issues/92), [and here](https://github.com/awslabs/aws-app-mesh-examples/issues/94)), resource definitions created with provider versions earlier than v2.3.0 must be modified: remove `serviceNames` from the `spec` argument (AWS created `aws.appmesh.VirtualService` resources for each \u2014 import them with `pulumi import`); add a `listener` configuration block to the `spec` argument. Existing Pulumi state is automatically migrated.
   */
  def VirtualRouter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualRouterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualRouterArgs.builder
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
    com.pulumi.aws.appmesh.VirtualRouter(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AWS App Mesh virtual service resource. */
  def VirtualService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.appmesh.VirtualServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appmesh.VirtualServiceArgs.builder
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
    com.pulumi.aws.appmesh.VirtualService(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
