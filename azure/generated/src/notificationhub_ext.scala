package jp.ukiba.ko_pulumi
package azure

object notificationhub_ext:
  extension (builder: com.pulumi.azure.notificationhub.HubArgs.Builder)
    /**
     * @param apnsCredential A `apnsCredential` block as defined below.
     * 
     * &gt; **Note:** Removing the `apnsCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    inline def apnsCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.builder
      builder.apnsCredential(args(argsBuilder).build)

    /**
     * @param browserCredential A `browserCredential` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def browserCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.builder
      builder.browserCredential(args(argsBuilder).build)

    /**
     * @param gcmCredential A `gcmCredential` block as defined below.
     * 
     * &gt; **Note:** Removing the `gcmCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    inline def gcmCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.builder
      builder.gcmCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.notificationhub.inputs.HubState.Builder)
    /**
     * @param apnsCredential A `apnsCredential` block as defined below.
     * 
     * &gt; **Note:** Removing the `apnsCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    inline def apnsCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubApnsCredentialArgs.builder
      builder.apnsCredential(args(argsBuilder).build)

    /**
     * @param browserCredential A `browserCredential` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def browserCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubBrowserCredentialArgs.builder
      builder.browserCredential(args(argsBuilder).build)

    /**
     * @param gcmCredential A `gcmCredential` block as defined below.
     * 
     * &gt; **Note:** Removing the `gcmCredential` block will currently force a recreation of this resource [due to this bug in the Azure SDK for Go](https://github.com/Azure/azure-sdk-for-go/issues/2246) - we&#39;ll remove this limitation when the SDK bug is fixed.
     * @return builder
     */
    inline def gcmCredential(args: Endofunction[com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.Builder]):
        com.pulumi.azure.notificationhub.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.notificationhub.inputs.HubGcmCredentialArgs.builder
      builder.gcmCredential(args(argsBuilder).build)
