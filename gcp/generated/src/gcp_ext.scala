package jp.ukiba.ko_pulumi
package gcp

object gcp_ext:
  extension (builder: com.pulumi.gcp.ProviderArgs.Builder)
    inline def batching(args: Endofunction[com.pulumi.gcp.inputs.ProviderBatchingArgs.Builder]):
        com.pulumi.gcp.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.inputs.ProviderBatchingArgs.builder
      builder.batching(args(argsBuilder).build)

    inline def externalCredentials(args: Endofunction[com.pulumi.gcp.inputs.ProviderExternalCredentialsArgs.Builder]):
        com.pulumi.gcp.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.inputs.ProviderExternalCredentialsArgs.builder
      builder.externalCredentials(args(argsBuilder).build)
