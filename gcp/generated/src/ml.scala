package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object ml:
  /**
   * &gt; **Warning:** This resource is deprecated at the API level and will be removed in a future version of Terraform.
   * 
   *  Represents a machine learning solution.
   * 
   *  A model can have multiple versions, each of which is a deployed, trained model
   *  ready to receive prediction requests. The model itself is just a container.
   * 
   *  To get more information about Model, see:
   * 
   *  * [API documentation](https://cloud.google.com/ai-platform/prediction/docs/reference/rest/v1/projects.models)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/ai-platform/prediction/docs/deploying-models)
   */
  def EngineModel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ml.EngineModelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.ml.EngineModelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.ml.EngineModel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.ml.EngineModelArgs.Builder)
    /**
     * @param defaultVersion The default version of the model. This version will be used to handle
     *  prediction requests that do not specify a version.
     *  Structure is documented below.
     * @return builder
     */
    def defaultVersion(args: Endofunction[com.pulumi.gcp.ml.inputs.EngineModelDefaultVersionArgs.Builder]):
        com.pulumi.gcp.ml.EngineModelArgs.Builder =
      val argsBuilder = com.pulumi.gcp.ml.inputs.EngineModelDefaultVersionArgs.builder
      builder.defaultVersion(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.ml.inputs.EngineModelState.Builder)
    /**
     * @param defaultVersion The default version of the model. This version will be used to handle
     *  prediction requests that do not specify a version.
     *  Structure is documented below.
     * @return builder
     */
    def defaultVersion(args: Endofunction[com.pulumi.gcp.ml.inputs.EngineModelDefaultVersionArgs.Builder]):
        com.pulumi.gcp.ml.inputs.EngineModelState.Builder =
      val argsBuilder = com.pulumi.gcp.ml.inputs.EngineModelDefaultVersionArgs.builder
      builder.defaultVersion(args(argsBuilder).build)
