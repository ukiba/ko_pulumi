package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object inspector2:
  extension (builder: com.pulumi.aws.inspector2.OrganizationConfigurationArgs.Builder)
    /**
     * @param autoEnable Configuration block for auto enabling. See below.
     * @return builder
     */
    def autoEnable(args: Endofunction[com.pulumi.aws.inspector2.inputs.OrganizationConfigurationAutoEnableArgs.Builder]):
        com.pulumi.aws.inspector2.OrganizationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.OrganizationConfigurationAutoEnableArgs.builder
      builder.autoEnable(args(argsBuilder).build)

  /**
   * Resource for managing an Amazon Inspector Organization Configuration.
   *  
   *  &gt; **NOTE:** In order for this resource to work, the account you use must be an Inspector Delegated Admin Account.
   *  
   *  &gt; **NOTE:** When this resource is deleted, EC2, ECR, Lambda, and Lambda code scans will no longer be automatically enabled for new members of your Amazon Inspector organization.
   */
  def OrganizationConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.OrganizationConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.inspector2.OrganizationConfigurationArgs.builder
    
    com.pulumi.aws.inspector2.OrganizationConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.inspector2.FilterArgs.Builder)
    /**
     * @param filterCriterias Details on the filter criteria. Documented below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def filterCriterias(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder]*):
        com.pulumi.aws.inspector2.FilterArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.builder
      builder.filterCriterias(args.map(_(argsBuilder).build)*)

  /** Resource for associating accounts to existing Inspector instances. */
  def MemberAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.MemberAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.inspector2.MemberAssociationArgs.builder
    
    com.pulumi.aws.inspector2.MemberAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an Amazon Inspector Delegated Admin Account. */
  def DelegatedAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.DelegatedAdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.inspector2.DelegatedAdminAccountArgs.builder
    
    com.pulumi.aws.inspector2.DelegatedAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for enabling Amazon Inspector resource scans.
   *  
   *  This resource must be created in the Organization&#39;s Administrator Account.
   */
  def Enabler(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.EnablerArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.inspector2.EnablerArgs.builder
    
    com.pulumi.aws.inspector2.Enabler(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Inspector Filter. */
  def Filter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.inspector2.FilterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.inspector2.FilterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.inspector2.Filter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.inspector2.inputs.OrganizationConfigurationState.Builder)
    /**
     * @param autoEnable Configuration block for auto enabling. See below.
     * @return builder
     */
    def autoEnable(args: Endofunction[com.pulumi.aws.inspector2.inputs.OrganizationConfigurationAutoEnableArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.OrganizationConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.OrganizationConfigurationAutoEnableArgs.builder
      builder.autoEnable(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder)
    /**
     * @param awsAccountIds (Optional) The AWS account ID in which the finding was generated. Documented below.
     * @return builder
     */
    def awsAccountIds(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaAwsAccountIdArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaAwsAccountIdArgs.builder
      builder.awsAccountIds(args.map(_(argsBuilder).build)*)

    /**
     * @param codeRepositoryProjectNames (Optional) The project name in a code repository. Documented below.
     * @return builder
     */
    def codeRepositoryProjectNames(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeRepositoryProjectNameArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeRepositoryProjectNameArgs.builder
      builder.codeRepositoryProjectNames(args.map(_(argsBuilder).build)*)

    /**
     * @param codeRepositoryProviderTypes (Optional) The repository provider type (such as GitHub, GitLab, etc.) Documented below.
     * @return builder
     */
    def codeRepositoryProviderTypes(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeRepositoryProviderTypeArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeRepositoryProviderTypeArgs.builder
      builder.codeRepositoryProviderTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param codeVulnerabilityDetectorNames (Optional) The ID of the component. Documented below.
     * @return builder
     */
    def codeVulnerabilityDetectorNames(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeVulnerabilityDetectorNameArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeVulnerabilityDetectorNameArgs.builder
      builder.codeVulnerabilityDetectorNames(args.map(_(argsBuilder).build)*)

    /**
     * @param codeVulnerabilityDetectorTags (Optional) The ID of the component. Documented below.
     * @return builder
     */
    def codeVulnerabilityDetectorTags(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeVulnerabilityDetectorTagArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeVulnerabilityDetectorTagArgs.builder
      builder.codeVulnerabilityDetectorTags(args.map(_(argsBuilder).build)*)

    /**
     * @param codeVulnerabilityFilePaths (Optional) The ID of the component. Documented below.
     * @return builder
     */
    def codeVulnerabilityFilePaths(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeVulnerabilityFilePathArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaCodeVulnerabilityFilePathArgs.builder
      builder.codeVulnerabilityFilePaths(args.map(_(argsBuilder).build)*)

    /**
     * @param componentIds (Optional) The ID of the component. Documented below.
     * @return builder
     */
    def componentIds(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaComponentIdArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaComponentIdArgs.builder
      builder.componentIds(args.map(_(argsBuilder).build)*)

    /**
     * @param componentTypes (Optional) The type of the component. Documented below.
     * @return builder
     */
    def componentTypes(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaComponentTypeArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaComponentTypeArgs.builder
      builder.componentTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2InstanceImageIds (Optional) The ID of the Amazon Machine Image (AMI). Documented below.
     * @return builder
     */
    def ec2InstanceImageIds(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEc2InstanceImageIdArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEc2InstanceImageIdArgs.builder
      builder.ec2InstanceImageIds(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2InstanceSubnetIds (Optional) The ID of the subnet. Documented below.
     * @return builder
     */
    def ec2InstanceSubnetIds(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEc2InstanceSubnetIdArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEc2InstanceSubnetIdArgs.builder
      builder.ec2InstanceSubnetIds(args.map(_(argsBuilder).build)*)

    /**
     * @param ec2InstanceVpcIds (Optional) The ID of the VPC. Documented below.
     * @return builder
     */
    def ec2InstanceVpcIds(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEc2InstanceVpcIdArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEc2InstanceVpcIdArgs.builder
      builder.ec2InstanceVpcIds(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImageArchitectures (Optional) The architecture of the ECR image. Documented below.
     * @return builder
     */
    def ecrImageArchitectures(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageArchitectureArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageArchitectureArgs.builder
      builder.ecrImageArchitectures(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImageHashes (Optional) The SHA256 hash of the ECR image. Documented below.
     * @return builder
     */
    def ecrImageHashes(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageHashArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageHashArgs.builder
      builder.ecrImageHashes(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImageInUseCounts (Optional)  The number of the ECR images in use. Documented below.
     * @return builder
     */
    def ecrImageInUseCounts(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageInUseCountArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageInUseCountArgs.builder
      builder.ecrImageInUseCounts(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImageLastInUseAts (Optional) The date range when an ECR image was last used in an ECS cluster task or EKS cluster pod. Documented below.
     * @return builder
     */
    def ecrImageLastInUseAts(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageLastInUseAtArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageLastInUseAtArgs.builder
      builder.ecrImageLastInUseAts(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImagePushedAts (Optional) The date range when the image was pushed. Documented below.
     * @return builder
     */
    def ecrImagePushedAts(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImagePushedAtArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImagePushedAtArgs.builder
      builder.ecrImagePushedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImageRegistries (Optional) The registry of the ECR image. Documented below.
     * @return builder
     */
    def ecrImageRegistries(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageRegistryArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageRegistryArgs.builder
      builder.ecrImageRegistries(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImageRepositoryNames (Optional) The name of the ECR repository. Documented below.
     * @return builder
     */
    def ecrImageRepositoryNames(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageRepositoryNameArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageRepositoryNameArgs.builder
      builder.ecrImageRepositoryNames(args.map(_(argsBuilder).build)*)

    /**
     * @param ecrImageTags (Optional) The tags associated with the ECR image. Documented below.
     * @return builder
     */
    def ecrImageTags(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageTagArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEcrImageTagArgs.builder
      builder.ecrImageTags(args.map(_(argsBuilder).build)*)

    /**
     * @param epssScores (Optional) EPSS (Exploit Prediction Scoring System) Score of the finding. Documented below.
     * @return builder
     */
    def epssScores(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEpssScoreArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaEpssScoreArgs.builder
      builder.epssScores(args.map(_(argsBuilder).build)*)

    /**
     * @param exploitAvailables (Optional) Availability of exploits. Documented below.
     * @return builder
     */
    def exploitAvailables(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaExploitAvailableArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaExploitAvailableArgs.builder
      builder.exploitAvailables(args.map(_(argsBuilder).build)*)

    /**
     * @param findingArns (Optional) The ARN of the finding. Documented below.
     * @return builder
     */
    def findingArns(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFindingArnArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFindingArnArgs.builder
      builder.findingArns(args.map(_(argsBuilder).build)*)

    /**
     * @param findingStatuses (Optional) The status of the finding. Documented below.
     * @return builder
     */
    def findingStatuses(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFindingStatusArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFindingStatusArgs.builder
      builder.findingStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param findingTypes (Optional) The type of the finding. Documented below.
     * @return builder
     */
    def findingTypes(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFindingTypeArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFindingTypeArgs.builder
      builder.findingTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param firstObservedAts (Optional) When the finding was first observed. Documented below.
     * @return builder
     */
    def firstObservedAts(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFirstObservedAtArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFirstObservedAtArgs.builder
      builder.firstObservedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param fixAvailables (Optional) Availability of the fix. Documented below.
     * @return builder
     */
    def fixAvailables(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFixAvailableArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaFixAvailableArgs.builder
      builder.fixAvailables(args.map(_(argsBuilder).build)*)

    /**
     * @param inspectorScores (Optional) The Inspector score given to the finding. Documented below.
     * @return builder
     */
    def inspectorScores(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaInspectorScoreArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaInspectorScoreArgs.builder
      builder.inspectorScores(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaFunctionExecutionRoleArns (Optional) Lambda execution role ARN. Documented below.
     * @return builder
     */
    def lambdaFunctionExecutionRoleArns(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionExecutionRoleArnArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionExecutionRoleArnArgs.builder
      builder.lambdaFunctionExecutionRoleArns(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaFunctionLastModifiedAts (Optional) Last modified timestamp of the lambda function. Documented below.
     * @return builder
     */
    def lambdaFunctionLastModifiedAts(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionLastModifiedAtArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionLastModifiedAtArgs.builder
      builder.lambdaFunctionLastModifiedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaFunctionLayers (Optional) Lambda function layers. Documented below.
     * @return builder
     */
    def lambdaFunctionLayers(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionLayerArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionLayerArgs.builder
      builder.lambdaFunctionLayers(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaFunctionNames (Optional) Lambda function name. Documented below.
     * @return builder
     */
    def lambdaFunctionNames(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionNameArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionNameArgs.builder
      builder.lambdaFunctionNames(args.map(_(argsBuilder).build)*)

    /**
     * @param lambdaFunctionRuntimes (Optional) Lambda function runtime. Documented below.
     * @return builder
     */
    def lambdaFunctionRuntimes(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionRuntimeArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLambdaFunctionRuntimeArgs.builder
      builder.lambdaFunctionRuntimes(args.map(_(argsBuilder).build)*)

    /**
     * @param lastObservedAts (Optional) When the finding was last observed. Documented below.
     * @return builder
     */
    def lastObservedAts(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLastObservedAtArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaLastObservedAtArgs.builder
      builder.lastObservedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param networkProtocols (Optional) The network protocol of the finding. Documented below.
     * @return builder
     */
    def networkProtocols(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaNetworkProtocolArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaNetworkProtocolArgs.builder
      builder.networkProtocols(args.map(_(argsBuilder).build)*)

    /**
     * @param portRanges (Optional) The port range of the finding. Documented below.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaPortRangeArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

    /**
     * @param relatedVulnerabilities (Optional) Related vulnerabilities. Documented below.
     * @return builder
     */
    def relatedVulnerabilities(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaRelatedVulnerabilityArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaRelatedVulnerabilityArgs.builder
      builder.relatedVulnerabilities(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceIds (Optional) The ID of the resource. Documented below.
     * @return builder
     */
    def resourceIds(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaResourceIdArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaResourceIdArgs.builder
      builder.resourceIds(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTags (Optional) The tags of the resource. Documented below.
     * @return builder
     */
    def resourceTags(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaResourceTagArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaResourceTagArgs.builder
      builder.resourceTags(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceTypes (Optional) The type of the resource. Documented below.
     * @return builder
     */
    def resourceTypes(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaResourceTypeArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaResourceTypeArgs.builder
      builder.resourceTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param severities (Optional) The severity of the finding. Documented below.
     * @return builder
     */
    def severities(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaSeverityArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaSeverityArgs.builder
      builder.severities(args.map(_(argsBuilder).build)*)

    /**
     * @param titles (Optional) The title of the finding. Documented below.
     * @return builder
     */
    def titles(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaTitleArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaTitleArgs.builder
      builder.titles(args.map(_(argsBuilder).build)*)

    /**
     * @param updatedAts (Optional) When the finding was last updated. Documented below.
     * @return builder
     */
    def updatedAts(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaUpdatedAtArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaUpdatedAtArgs.builder
      builder.updatedAts(args.map(_(argsBuilder).build)*)

    /**
     * @param vendorSeverities (Optional) The severity as reported by the vendor. Documented below.
     * @return builder
     */
    def vendorSeverities(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVendorSeverityArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVendorSeverityArgs.builder
      builder.vendorSeverities(args.map(_(argsBuilder).build)*)

    /**
     * @param vulnerabilityIds (Optional) The ID of the vulnerability. Documented below.
     * @return builder
     */
    def vulnerabilityIds(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerabilityIdArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerabilityIdArgs.builder
      builder.vulnerabilityIds(args.map(_(argsBuilder).build)*)

    /**
     * @param vulnerabilitySources (Optional) The source of the vulnerability. Documented below.
     * @return builder
     */
    def vulnerabilitySources(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerabilitySourceArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerabilitySourceArgs.builder
      builder.vulnerabilitySources(args.map(_(argsBuilder).build)*)

    /**
     * @param vulnerablePackages (Optional) Details about vulnerable packages. Documented below.
     * @return builder
     */
    def vulnerablePackages(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.builder
      builder.vulnerablePackages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder)
    /**
     * @param architecture (Optional) The architecture of the package. Documented below.
     * @return builder
     */
    def architecture(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArchitectureArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArchitectureArgs.builder
      builder.architecture(args(argsBuilder).build)

    /**
     * @param epoches (Optional) The epoch of the package. Documented below.
     * @return builder
     */
    def epoches(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageEpochArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageEpochArgs.builder
      builder.epoches(args.map(_(argsBuilder).build)*)

    /**
     * @param filePath (Optional) The name of the package. Documented below.
     * @return builder
     */
    def filePath(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageFilePathArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageFilePathArgs.builder
      builder.filePath(args(argsBuilder).build)

    /**
     * @param name Name of the filter.
     * @return builder
     */
    def name(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageNameArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageNameArgs.builder
      builder.name(args(argsBuilder).build)

    /**
     * @param release (Optional) The release of the package. Documented below.
     * @return builder
     */
    def release(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageReleaseArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageReleaseArgs.builder
      builder.release(args(argsBuilder).build)

    /**
     * @param sourceLambdaLayerArn (Optional) The ARN of the package&#39;s source lambda layer. Documented below.
     * @return builder
     */
    def sourceLambdaLayerArn(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageSourceLambdaLayerArnArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageSourceLambdaLayerArnArgs.builder
      builder.sourceLambdaLayerArn(args(argsBuilder).build)

    /**
     * @param sourceLayerHash (Optional) The source layer hash of the package. Documented below.
     * @return builder
     */
    def sourceLayerHash(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageSourceLayerHashArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageSourceLayerHashArgs.builder
      builder.sourceLayerHash(args(argsBuilder).build)

    /**
     * @param version (Optional) The version of the package. Documented below.
     * @return builder
     */
    def version(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageVersionArgs.Builder]):
        com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageArgs.Builder =
      val argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaVulnerablePackageVersionArgs.builder
      builder.version(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.inspector2.inputs.FilterState.Builder)
    /**
     * @param filterCriterias Details on the filter criteria. Documented below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def filterCriterias(args: Endofunction[com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.Builder]*):
        com.pulumi.aws.inspector2.inputs.FilterState.Builder =
      def argsBuilder = com.pulumi.aws.inspector2.inputs.FilterFilterCriteriaArgs.builder
      builder.filterCriterias(args.map(_(argsBuilder).build)*)
