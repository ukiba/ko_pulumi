package jp.ukiba.ko_pulumi
package gcp

object observability_ext:
  extension (builder: com.pulumi.gcp.observability.BucketArgs.Builder)
    /**
     * @param cmekSettings Settings for configuring CMEK for a bucket.
     * Structure is documented below.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.Builder]):
        com.pulumi.gcp.observability.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.observability.inputs.BucketState.Builder)
    /**
     * @param cmekSettings Settings for configuring CMEK for a bucket.
     * Structure is documented below.
     * @return builder
     */
    def cmekSettings(args: Endofunction[com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.Builder]):
        com.pulumi.gcp.observability.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.observability.inputs.BucketCmekSettingsArgs.builder
      builder.cmekSettings(args(argsBuilder).build)
