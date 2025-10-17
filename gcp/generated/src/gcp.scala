package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object gcp:
  /**
   * The provider type for the google-beta package. By default, resources use package-wide configuration
   * settings, however an explicit `Provider` instance may be created and passed during resource
   * construction to achieve fine-grained programmatic control over provider settings. See the
   * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
   */
  def Provider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ProviderArgs.builder
    com.pulumi.gcp.Provider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.ProviderArgs.Builder)
    def batching(args: Endofunction[com.pulumi.gcp.inputs.ProviderBatchingArgs.Builder]):
        com.pulumi.gcp.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.inputs.ProviderBatchingArgs.builder
      builder.batching(args(argsBuilder).build)

    def externalCredentials(args: Endofunction[com.pulumi.gcp.inputs.ProviderExternalCredentialsArgs.Builder]):
        com.pulumi.gcp.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.gcp.inputs.ProviderExternalCredentialsArgs.builder
      builder.externalCredentials(args(argsBuilder).build)
