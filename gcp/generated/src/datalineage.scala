package jp.ukiba.ko_pulumi
package gcp

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
  def Config(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datalineage.ConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.datalineage.ConfigArgs.builder
    com.pulumi.gcp.datalineage.Config(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DatalineageFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get a configuration for Data Lineage.
     * 
     * To get more information about Config, see [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
     */
    inline def getConfig(args: Endofunction[com.pulumi.gcp.datalineage.inputs.GetConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datalineage.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.GetConfigArgs.builder
      com.pulumi.gcp.datalineage.DatalineageFunctions.getConfig(args(argsBuilder).build)

    /**
     * Get a configuration for Data Lineage.
     * 
     * To get more information about Config, see [Official Documentation](https://docs.cloud.google.com/dataplex/docs/about-data-lineage#control-lineage-ingestion)
     */
    inline def getConfigPlain(args: Endofunction[com.pulumi.gcp.datalineage.inputs.GetConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datalineage.outputs.GetConfigResult] =
      val argsBuilder = com.pulumi.gcp.datalineage.inputs.GetConfigPlainArgs.builder
      com.pulumi.gcp.datalineage.DatalineageFunctions.getConfigPlain(args(argsBuilder).build)
