package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object azure:
  /**
   * The provider type for the azurerm package. By default, resources use package-wide configuration
   * settings, however an explicit `Provider` instance may be created and passed during resource
   * construction to achieve fine-grained programmatic control over provider settings. See the
   * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
   */
  def Provider(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.ProviderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.ProviderArgs.builder
    com.pulumi.azure.Provider(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
