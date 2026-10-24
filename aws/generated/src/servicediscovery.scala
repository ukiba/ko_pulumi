package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object servicediscovery:
  def HttpNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.HttpNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.HttpNamespaceArgs.builder
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
    com.pulumi.aws.servicediscovery.HttpNamespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Service Discovery Instance resource. */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.InstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.servicediscovery.InstanceArgs.builder
    com.pulumi.aws.servicediscovery.Instance(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Service Discovery Private DNS Namespace resource. */
  def PrivateDnsNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.PrivateDnsNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.PrivateDnsNamespaceArgs.builder
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
    com.pulumi.aws.servicediscovery.PrivateDnsNamespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Service Discovery Public DNS Namespace resource. */
  def PublicDnsNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.PublicDnsNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.PublicDnsNamespaceArgs.builder
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
    com.pulumi.aws.servicediscovery.PublicDnsNamespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Service Discovery Service resource. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicediscovery.ServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicediscovery.ServiceArgs.builder
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
    com.pulumi.aws.servicediscovery.Service(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ServicediscoveryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves information about a Service Discovery private or public DNS namespace. */
    inline def getDnsNamespace(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetDnsNamespaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicediscovery.outputs.GetDnsNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetDnsNamespaceArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getDnsNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves information about a Service Discovery private or public DNS namespace. */
    inline def getDnsNamespacePlain(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetDnsNamespacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicediscovery.outputs.GetDnsNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetDnsNamespacePlainArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getDnsNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    inline def getHttpNamespace(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetHttpNamespaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicediscovery.outputs.GetHttpNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetHttpNamespaceArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getHttpNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    inline def getHttpNamespacePlain(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetHttpNamespacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicediscovery.outputs.GetHttpNamespaceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetHttpNamespacePlainArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getHttpNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves information about a Service Discovery Service. */
    inline def getService(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicediscovery.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetServiceArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves information about a Service Discovery Service. */
    inline def getServicePlain(args: Endofunction[com.pulumi.aws.servicediscovery.inputs.GetServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicediscovery.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicediscovery.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.servicediscovery.ServicediscoveryFunctions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
