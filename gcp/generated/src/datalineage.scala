package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object datalineage:
  /**
   * Configuration for Data Lineage.
   * 
   * Defines configuration options for Lineage customers to control behavior of
   * lineage systems.
   * 
   * To get more information about Config, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/dataplex/docs/reference/data-lineage/rest/v1/folders.locations.config)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
   */
  def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.datalineage.ConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.datalineage.ConfigArgs.builder
    com.pulumi.gcp.datalineage.Config(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DatalineageFunctions:
    /**
     * Get a configuration for Data Lineage.
     * 
     * To get more information about Config, see [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
     */
    inline def getConfig(args: Endofunction[com.pulumi.gcp.datalineage.inputs.GetConfigArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.datalineage.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.GetConfigArgs.builder
      com.pulumi.gcp.datalineage.DatalineageFunctions.getConfig(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a configuration for Data Lineage.
     * 
     * To get more information about Config, see [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
     */
    inline def getConfigPlain(args: Endofunction[com.pulumi.gcp.datalineage.inputs.GetConfigPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datalineage.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.GetConfigPlainArgs.builder
      com.pulumi.gcp.datalineage.DatalineageFunctions.getConfigPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
