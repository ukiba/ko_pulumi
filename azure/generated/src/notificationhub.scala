package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object notificationhub:
  object NotificationhubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace. */
    inline def getHub(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetHubArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.notificationhub.outputs.GetHubResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetHubArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getHub(args(argsBuilder).build)

    /** Use this data source to access information about an existing Notification Hub within a Notification Hub Namespace. */
    inline def getHubPlain(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetHubPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.notificationhub.outputs.GetHubResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetHubPlainArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getHubPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Notification Hub Namespace. */
    inline def getNamespace(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetNamespaceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.notificationhub.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetNamespaceArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getNamespace(args(argsBuilder).build)

    /** Use this data source to access information about an existing Notification Hub Namespace. */
    inline def getNamespacePlain(args: Endofunction[com.pulumi.azure.notificationhub.inputs.GetNamespacePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.notificationhub.outputs.GetNamespaceResult] =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.GetNamespacePlainArgs.builder
      com.pulumi.azure.notificationhub.NotificationhubFunctions.getNamespacePlain(args(argsBuilder).build)

  /** Manages a Notification Hub within a Notification Hub Namespace. */
  def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.notificationhub.HubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.notificationhub.HubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.notificationhub.Hub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Notification Hub Namespace. */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.notificationhub.NamespaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.notificationhub.NamespaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.notificationhub.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.notificationhub.HubArgs.Builder)
    /**
     * @param apnsCredential A `apnsCredential` block as defined below.
     * 
     *  &gt; **Note:** Removing the `apnsCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    def apnsCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.builder
      builder.apnsCredential(args(argsBuilder).build)

    /**
     * @param browserCredential A `browserCredential` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def browserCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.builder
      builder.browserCredential(args(argsBuilder).build)

    /**
     * @param gcmCredential A `gcmCredential` block as defined below.
     * 
     *  &gt; **Note:** Removing the `gcmCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    def gcmCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.builder
      builder.gcmCredential(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.notificationhub.HubArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Authorization Rule associated with a Notification Hub within a Notification Hub Namespace. */
  def AuthorizationRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.notificationhub.AuthorizationRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.notificationhub.AuthorizationRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.notificationhub.AuthorizationRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.notificationhub.inputs.HubState.Builder)
    /**
     * @param apnsCredential A `apnsCredential` block as defined below.
     * 
     *  &gt; **Note:** Removing the `apnsCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    def apnsCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.builder
      builder.apnsCredential(args(argsBuilder).build)

    /**
     * @param browserCredential A `browserCredential` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def browserCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.builder
      builder.browserCredential(args(argsBuilder).build)

    /**
     * @param gcmCredential A `gcmCredential` block as defined below.
     * 
     *  &gt; **Note:** Removing the `gcmCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    def gcmCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.builder
      builder.gcmCredential(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.notificationhub.inputs.HubState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
