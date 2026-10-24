package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object webpubsub:
  /** Manages an Azure Web PubSub Custom Certificate. */
  def CustomCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.CustomCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.CustomCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.CustomCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Web PubSub Custom Domain. */
  def CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.CustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.CustomDomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages the hub settings for a Web Pubsub. */
  def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.HubArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.HubArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.Hub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages the Network ACL for a Web Pubsub. */
  def NetworkAcl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.NetworkAclArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.webpubsub.NetworkAclArgs.builder
    com.pulumi.azure.webpubsub.NetworkAcl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Web PubSub Service. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.ServiceArgs.builder
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
    com.pulumi.azure.webpubsub.Service(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages the Shared Private Link Resource for a Web Pubsub service. */
  def SharedPrivateLinkResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.SharedPrivateLinkResourceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.SharedPrivateLinkResourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.webpubsub.SharedPrivateLinkResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Web PubSub Service for Socket.IO. */
  def Socketio(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.webpubsub.SocketioArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.webpubsub.SocketioArgs.builder
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
    com.pulumi.azure.webpubsub.Socketio(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object WebpubsubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about the Private Link Resource supported by the Web Pubsub Resource. */
    inline def getPrivateLinkResource(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.webpubsub.outputs.GetPrivateLinkResourceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourceArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getPrivateLinkResource(args(argsBuilder).build)

    /** Use this data source to access information about the Private Link Resource supported by the Web Pubsub Resource. */
    inline def getPrivateLinkResourcePlain(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourcePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.webpubsub.outputs.GetPrivateLinkResourceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetPrivateLinkResourcePlainArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getPrivateLinkResourcePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Web Pubsub service. */
    inline def getService(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.webpubsub.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetServiceArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getService(args(argsBuilder).build)

    /** Use this data source to access information about an existing Azure Web Pubsub service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.azure.webpubsub.inputs.GetServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.webpubsub.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.azure.webpubsub.inputs.GetServicePlainArgs.builder
      com.pulumi.azure.webpubsub.WebpubsubFunctions.getServicePlain(args(argsBuilder).build)
