package jp.ukiba.ko_pulumi
package gcp

object deploymentmanager_ext:
  extension (builder: com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder)
    /**
     * @param labels Key-value pairs to apply to this labels.
     * Structure is documented below.
     * @return builder
     */
    inline def labels(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.Builder]*):
        com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param target Parameters that define your deployment, including the deployment
     * configuration and relevant templates.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder]):
        com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.deploymentmanager.inputs.DeploymentState.Builder)
    /**
     * @param labels Key-value pairs to apply to this labels.
     * Structure is documented below.
     * @return builder
     */
    inline def labels(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.Builder]*):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentState.Builder =
      def argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentLabelArgs.builder
      builder.labels(args.map(_(argsBuilder).build)*)

    /**
     * @param target Parameters that define your deployment, including the deployment
     * configuration and relevant templates.
     * Structure is documented below.
     * @return builder
     */
    inline def target(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder]):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder)
    /**
     * @param config The root configuration file to use for this deployment.
     * Structure is documented below.
     * @return builder
     */
    inline def config(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetConfigArgs.Builder]):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param imports Specifies import files for this configuration. This can be
     * used to import templates or other files. For example, you might
     * import a text file in order to use the file in a template.
     * Structure is documented below.
     * @return builder
     */
    inline def imports(args: Endofunction[com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetImportArgs.Builder]*):
        com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.deploymentmanager.inputs.DeploymentTargetImportArgs.builder
      builder.imports(args.map(_(argsBuilder).build)*)
