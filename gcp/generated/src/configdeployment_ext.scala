package jp.ukiba.ko_pulumi
package gcp

object configdeployment_ext:
  extension (builder: com.pulumi.gcp.configdeployment.DeploymentArgs.Builder)
    /**
     * @param terraformBlueprint A bundle of HCL files in a GCS bucket or Git repo.
     * Structure is documented below.
     * @return builder
     */
    inline def terraformBlueprint(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder]):
        com.pulumi.gcp.configdeployment.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.builder
      builder.terraformBlueprint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.configdeployment.inputs.DeploymentState.Builder)
    /**
     * @param terraformBlueprint A bundle of HCL files in a GCS bucket or Git repo.
     * Structure is documented below.
     * @return builder
     */
    inline def terraformBlueprint(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder]):
        com.pulumi.gcp.configdeployment.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.builder
      builder.terraformBlueprint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder)
    /**
     * @param gitSource Public Git repository containing the blueprint.
     * Structure is documented below.
     * @return builder
     */
    inline def gitSource(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintGitSourceArgs.Builder]):
        com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder =
      val argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintGitSourceArgs.builder
      builder.gitSource(args(argsBuilder).build)

    /**
     * @param inputValues Input variables for the Terraform blueprint.
     * Structure is documented below.
     * @return builder
     */
    inline def inputValues(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintInputValueArgs.Builder]*):
        com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder =
      def argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintInputValueArgs.builder
      builder.inputValues(args.map(_(argsBuilder).build)*)
