package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object configdeployment:
  /**
   * A group of Google Cloud resources described by a Terraform blueprint.
   * 
   * To get more information about Deployment, see:
   * 
   * * [API documentation](https://cloud.google.com/infrastructure-manager/docs/reference/rest/v1/projects.locations.deployments)
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.configdeployment.DeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.configdeployment.DeploymentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.configdeployment.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.configdeployment.DeploymentArgs.Builder)
    /**
     * @param terraformBlueprint A bundle of HCL files in a GCS bucket or Git repo.
     * Structure is documented below.
     * @return builder
     */
    def terraformBlueprint(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder]):
        com.pulumi.gcp.configdeployment.DeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.builder
      builder.terraformBlueprint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.configdeployment.inputs.DeploymentState.Builder)
    /**
     * @param terraformBlueprint A bundle of HCL files in a GCS bucket or Git repo.
     * Structure is documented below.
     * @return builder
     */
    def terraformBlueprint(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder]):
        com.pulumi.gcp.configdeployment.inputs.DeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.builder
      builder.terraformBlueprint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder)
    /**
     * @param gitSource Public Git repository containing the blueprint.
     * Structure is documented below.
     * @return builder
     */
    def gitSource(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintGitSourceArgs.Builder]):
        com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder =
      val argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintGitSourceArgs.builder
      builder.gitSource(args(argsBuilder).build)

    /**
     * @param inputValues Input variables for the Terraform blueprint.
     * Structure is documented below.
     * @return builder
     */
    def inputValues(args: Endofunction[com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintInputValueArgs.Builder]*):
        com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintArgs.Builder =
      def argsBuilder = com.pulumi.gcp.configdeployment.inputs.DeploymentTerraformBlueprintInputValueArgs.builder
      builder.inputValues(args.map(_(argsBuilder).build)*)
