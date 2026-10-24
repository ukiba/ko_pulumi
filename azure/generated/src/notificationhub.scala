package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object notificationhub:
  /** Manages an Authorization Rule associated with a Notification Hub within a Notification Hub Namespace. */
  def AuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.notificationhub.AuthorizationRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.notificationhub.AuthorizationRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.notificationhub.AuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Notification Hub within a Notification Hub Namespace. */
  def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.notificationhub.HubArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.notificationhub.HubArgs.builder
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
    com.pulumi.azure.notificationhub.Hub(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Notification Hub Namespace. */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.notificationhub.NamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.notificationhub.NamespaceArgs.builder
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
    com.pulumi.azure.notificationhub.Namespace(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NotificationhubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace. */
    inline def getHub(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetHubArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.notificationhub.outputs.GetHubResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetHubArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getHub(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace. */
    inline def getHubPlain(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetHubPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.notificationhub.outputs.GetHubResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetHubPlainArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getHubPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Notification Hub Namespace. */
    inline def getNamespace(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetNamespaceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.notificationhub.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetNamespaceArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getNamespace(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Notification Hub Namespace. */
    inline def getNamespacePlain(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetNamespacePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.notificationhub.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetNamespacePlainArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getNamespacePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
