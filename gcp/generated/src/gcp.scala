package jp.ukiba.ko_pulumi
package gcp


object gcp:
  extension (builder: com.pulumi.gcp.ProviderArgs.Builder)
    def batching(args: Endofunction[com.pulumi.gcp.inputs.ProviderBatchingArgs.Builder]):
        com.pulumi.gcp.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.inputs.ProviderBatchingArgs.builder
      builder.batching(args(argsBuilder).build)

    def externalCredentials(args: Endofunction[com.pulumi.gcp.inputs.ProviderExternalCredentialsArgs.Builder]):
        com.pulumi.gcp.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.inputs.ProviderExternalCredentialsArgs.builder
      builder.externalCredentials(args(argsBuilder).build)
