package jp.ukiba.ko_pulumi
package gcp

object cloudquota_ext:
  extension (builder: com.pulumi.gcp.cloudquota.SQuotaPreferenceArgs.Builder)
    /**
     * @param quotaConfig The preferred quota configuration.
     * Structure is documented below.
     * @return builder
     */
    def quotaConfig(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.Builder]):
        com.pulumi.gcp.cloudquota.SQuotaPreferenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.builder
      builder.quotaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceState.Builder)
    /**
     * @param quotaConfig The preferred quota configuration.
     * Structure is documented below.
     * @return builder
     */
    def quotaConfig(args: Endofunction[com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.Builder]):
        com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudquota.inputs.SQuotaPreferenceQuotaConfigArgs.builder
      builder.quotaConfig(args(argsBuilder).build)
