package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object deploymentmanager:
  extension (builder: com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder)
    /**
     * @param labels Key-value pairs to apply to this labels.
     *  Structure is documented below.
     * @return builder
     */
    def labels(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.Builder]*):
        com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param target Parameters that define your deployment, including the deployment
     *  configuration and relevant templates.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder]):
        com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /**
   * A collection of resources that are deployed and managed together using
   *  a configuration file
   * 
   *  &gt; **Warning:** This resource is intended only to manage a Deployment resource,
   *  and attempts to manage the Deployment&#39;s resources in the provider as well
   *  will likely result in errors or unexpected behavior as the two tools
   *  fight over ownership. We strongly discourage doing so unless you are an
   *  experienced user of both tools.
   * 
   *  In addition, due to limitations of the API, the provider will treat
   *  deployments in preview as recreate-only for any update operation other
   *  than actually deploying an in-preview deployment (i.e. `preview=true` to
   *  `preview=false`).
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.deploymentmanager.DeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.deploymentmanager.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder)
    /**
     * @param config The root configuration file to use for this deployment.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetConfigArgs.Builder]):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param imports Specifies import files for this configuration. This can be
     *  used to import templates or other files. For example, you might
     *  import a text file in order to use the file in a template.
     *  Structure is documented below.
     * @return builder
     */
    def imports(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetImportArgs.Builder]*):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetImportArgs.builder
      builder.imports(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.deploymentmanager.inputs.DeploymentState.Builder)
    /**
     * @param labels Key-value pairs to apply to this labels.
     *  Structure is documented below.
     * @return builder
     */
    def labels(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.Builder]*):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentState.Builder =
      def argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param target Parameters that define your deployment, including the deployment
     *  configuration and relevant templates.
     *  Structure is documented below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder]):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.builder
      builder.target(args(argsBuilder).build)
