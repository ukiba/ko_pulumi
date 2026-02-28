package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudformation:
  extension (builder: com.pulumi.aws.cloudformation.StackSetArgs.Builder)
    /**
     * @param autoDeployment Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     * @return builder
     */
    def autoDeployment(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetAutoDeploymentArgs.Builder]):
        com.pulumi.aws.cloudformation.StackSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetAutoDeploymentArgs.builder
      builder.autoDeployment(args(argsBuilder).build)

    /**
     * @param managedExecution Configuration block to allow StackSets to perform non-conflicting operations concurrently and queues conflicting operations.
     * @return builder
     */
    def managedExecution(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetManagedExecutionArgs.Builder]):
        com.pulumi.aws.cloudformation.StackSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetManagedExecutionArgs.builder
      builder.managedExecution(args(argsBuilder).build)

    /**
     * @param operationPreferences Preferences for how AWS CloudFormation performs a stack set update.
     * @return builder
     */
    def operationPreferences(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetOperationPreferencesArgs.Builder]):
        com.pulumi.aws.cloudformation.StackSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetOperationPreferencesArgs.builder
      builder.operationPreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudformation.StackInstancesArgs.Builder)
    /**
     * @param deploymentTargets AWS Organizations accounts for which to create stack instances in the `regions`. stack sets doesn&#39;t deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for most of this argument. See deploymentTargets below.
     * @return builder
     */
    def deploymentTargets(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackInstancesDeploymentTargetsArgs.Builder]):
        com.pulumi.aws.cloudformation.StackInstancesArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackInstancesDeploymentTargetsArgs.builder
      builder.deploymentTargets(args(argsBuilder).build)

    /**
     * @param operationPreferences Preferences for how AWS CloudFormation performs a stack set operation. See operationPreferences below.
     * @return builder
     */
    def operationPreferences(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackInstancesOperationPreferencesArgs.Builder]):
        com.pulumi.aws.cloudformation.StackInstancesArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackInstancesOperationPreferencesArgs.builder
      builder.operationPreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudformation.CloudFormationTypeArgs.Builder)
    /**
     * @param loggingConfig Configuration block containing logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.Builder]):
        com.pulumi.aws.cloudformation.CloudFormationTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  /**
   * Manages CloudFormation stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region. Additional information about stacks can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html).
   *  
   *  &gt; **NOTE:** This resource will manage all stack instances for the specified `stackSetName`. If you create stack instances outside of Terraform or import existing infrastructure, ensure that your configuration includes all accounts and regions where stack instances exist for the stack set. Failing to include all accounts and regions will cause Terraform to continuously report differences between your configuration and the actual infrastructure.
   *  
   *  &gt; **NOTE:** All target accounts must have an IAM Role created that matches the name of the execution role configured in the stack (the `executionRoleName` argument in the `aws.cloudformation.StackSet` resource) in a trust relationship with the administrative account or administration IAM Role. The execution role must have appropriate permissions to manage resources defined in the template along with those required for stacks to operate. See the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html) for more details.
   *  
   *  &gt; **NOTE:** To retain the Stack during Terraform resource destroy, ensure `retainStacks = true` has been successfully applied into the Terraform state first. This must be completed _before_ an apply that would destroy the resource.
   */
  def StackInstances(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackInstancesArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudformation.StackInstancesArgs.builder
    
    com.pulumi.aws.cloudformation.StackInstances(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a CloudFormation StackSet Instance. Instances are managed in the account and region of the StackSet after the target account permissions have been configured. Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
   *  
   *  &gt; **NOTE:** All target accounts must have an IAM Role created that matches the name of the execution role configured in the StackSet (the `executionRoleName` argument in the `aws.cloudformation.StackSet` resource) in a trust relationship with the administrative account or administration IAM Role. The execution role must have appropriate permissions to manage resources defined in the template along with those required for StackSets to operate. See the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html) for more details.
   *  
   *  &gt; **NOTE:** To retain the Stack during resource destroy, ensure `retainStack` has been set to `true` in the state first. This must be completed _before_ a deployment that would destroy the resource.
   */
  def StackSetInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackSetInstanceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudformation.StackSetInstanceArgs.builder
    
    com.pulumi.aws.cloudformation.StackSetInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type CloudformationFunctions = com.pulumi.aws.cloudformation.CloudformationFunctions
  object CloudformationFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cloudformation.CloudformationFunctions.*
  extension (self: CloudformationFunctions.type)
    /** Provides details about a CloudFormation Type. */
    def getCloudFormationType(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypeArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypeArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getCloudFormationType(args(argsBuilder).build)

    /** Provides details about a CloudFormation Type. */
    def getCloudFormationTypePlain(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypePlainArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getCloudFormationTypePlain(args(argsBuilder).build)

    /**
     * The CloudFormation Export data source allows access to stack
     *  exports specified in the [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html) section of the Cloudformation Template using the optional Export Property.
     *  
     *   &gt; Note: If you are trying to use a value from a Cloudformation Stack in the same deployment please use normal interpolation or Cloudformation Outputs.
     */
    def getExport(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetExportArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudformation.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetExportArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getExport(args(argsBuilder).build)

    /**
     * The CloudFormation Export data source allows access to stack
     *  exports specified in the [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html) section of the Cloudformation Template using the optional Export Property.
     *  
     *   &gt; Note: If you are trying to use a value from a Cloudformation Stack in the same deployment please use normal interpolation or Cloudformation Outputs.
     */
    def getExportPlain(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetExportPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudformation.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetExportPlainArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getExportPlain(args(argsBuilder).build)

    /**
     * The CloudFormation Stack data source allows access to stack
     *  outputs and other useful data including the template body.
     */
    def getStack(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetStackArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudformation.outputs.GetStackResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetStackArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getStack(args(argsBuilder).build)

    /**
     * The CloudFormation Stack data source allows access to stack
     *  outputs and other useful data including the template body.
     */
    def getStackPlain(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetStackPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudformation.outputs.GetStackResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetStackPlainArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getStackPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudformation.StackSetInstanceArgs.Builder)
    /**
     * @param deploymentTargets AWS Organizations accounts to which StackSets deploys. StackSets doesn&#39;t deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
     * @return builder
     */
    def deploymentTargets(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetInstanceDeploymentTargetsArgs.Builder]):
        com.pulumi.aws.cloudformation.StackSetInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetInstanceDeploymentTargetsArgs.builder
      builder.deploymentTargets(args(argsBuilder).build)

    /**
     * @param operationPreferences Preferences for how AWS CloudFormation performs a stack set operation.
     * @return builder
     */
    def operationPreferences(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetInstanceOperationPreferencesArgs.Builder]):
        com.pulumi.aws.cloudformation.StackSetInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetInstanceOperationPreferencesArgs.builder
      builder.operationPreferences(args(argsBuilder).build)

  /**
   * Manages a version of a CloudFormation Type.
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import `aws.cloudformation.CloudFormationType` using the type version Amazon Resource Name (ARN). For example:
   *  
   *  ```sh
   *  $ pulumi import aws:cloudformation/cloudFormationType:CloudFormationType example arn:aws:cloudformation:us-east-1:123456789012:type/resource/ExampleCompany-ExampleService-ExampleType/1
   *  ```
   */
  def CloudFormationType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.CloudFormationTypeArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudformation.CloudFormationTypeArgs.builder
    
    com.pulumi.aws.cloudformation.CloudFormationType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudformation.inputs.CloudFormationTypeState.Builder)
    /**
     * @param loggingConfig Configuration block containing logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.CloudFormationTypeState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudformation.inputs.StackSetState.Builder)
    /**
     * @param autoDeployment Configuration block containing the auto-deployment model for your StackSet. This can only be defined when using the `SERVICE_MANAGED` permission model.
     * @return builder
     */
    def autoDeployment(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetAutoDeploymentArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.StackSetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetAutoDeploymentArgs.builder
      builder.autoDeployment(args(argsBuilder).build)

    /**
     * @param managedExecution Configuration block to allow StackSets to perform non-conflicting operations concurrently and queues conflicting operations.
     * @return builder
     */
    def managedExecution(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetManagedExecutionArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.StackSetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetManagedExecutionArgs.builder
      builder.managedExecution(args(argsBuilder).build)

    /**
     * @param operationPreferences Preferences for how AWS CloudFormation performs a stack set update.
     * @return builder
     */
    def operationPreferences(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetOperationPreferencesArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.StackSetState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetOperationPreferencesArgs.builder
      builder.operationPreferences(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.cloudformation.inputs.StackInstancesState.Builder)
    /**
     * @param deploymentTargets AWS Organizations accounts for which to create stack instances in the `regions`. stack sets doesn&#39;t deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for most of this argument. See deploymentTargets below.
     * @return builder
     */
    def deploymentTargets(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackInstancesDeploymentTargetsArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.StackInstancesState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackInstancesDeploymentTargetsArgs.builder
      builder.deploymentTargets(args(argsBuilder).build)

    /**
     * @param operationPreferences Preferences for how AWS CloudFormation performs a stack set operation. See operationPreferences below.
     * @return builder
     */
    def operationPreferences(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackInstancesOperationPreferencesArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.StackInstancesState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackInstancesOperationPreferencesArgs.builder
      builder.operationPreferences(args(argsBuilder).build)

    /**
     * @param stackInstanceSummaries List of stack instances created from an organizational unit deployment target. This may not always be set depending on whether CloudFormation returns summaries for your configuration. See `stackInstanceSummaries`.
     * @return builder
     */
    def stackInstanceSummaries(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackInstancesStackInstanceSummaryArgs.Builder]*):
        com.pulumi.aws.cloudformation.inputs.StackInstancesState.Builder =
      def argsBuilder = com.pulumi.aws.cloudformation.inputs.StackInstancesStackInstanceSummaryArgs.builder
      builder.stackInstanceSummaries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudformation.inputs.StackSetInstanceState.Builder)
    /**
     * @param deploymentTargets AWS Organizations accounts to which StackSets deploys. StackSets doesn&#39;t deploy stack instances to the organization management account, even if the organization management account is in your organization or in an OU in your organization. Drift detection is not possible for this argument. See deploymentTargets below.
     * @return builder
     */
    def deploymentTargets(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetInstanceDeploymentTargetsArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.StackSetInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetInstanceDeploymentTargetsArgs.builder
      builder.deploymentTargets(args(argsBuilder).build)

    /**
     * @param operationPreferences Preferences for how AWS CloudFormation performs a stack set operation.
     * @return builder
     */
    def operationPreferences(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetInstanceOperationPreferencesArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.StackSetInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetInstanceOperationPreferencesArgs.builder
      builder.operationPreferences(args(argsBuilder).build)

    /**
     * @param stackInstanceSummaries List of stack instances created from an organizational unit deployment target. This will only be populated when `deploymentTargets` is set. See `stackInstanceSummaries`.
     * @return builder
     */
    def stackInstanceSummaries(args: Endofunction[com.pulumi.aws.cloudformation.inputs.StackSetInstanceStackInstanceSummaryArgs.Builder]*):
        com.pulumi.aws.cloudformation.inputs.StackSetInstanceState.Builder =
      def argsBuilder = com.pulumi.aws.cloudformation.inputs.StackSetInstanceStackInstanceSummaryArgs.builder
      builder.stackInstanceSummaries(args.map(_(argsBuilder).build)*)

  /** Provides a CloudFormation Stack resource. */
  def Stack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudformation.StackArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudformation.Stack(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a CloudFormation StackSet. StackSets allow CloudFormation templates to be easily deployed across multiple accounts and regions via StackSet Instances (`aws.cloudformation.StackSetInstance` resource). Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
   *  
   *  &gt; **NOTE:** All template parameters, including those with a `Default`, must be configured or ignored with the `lifecycle` configuration block `ignoreChanges` argument.
   *  
   *  &gt; **NOTE:** All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
   *  
   *  &gt; **NOTE:** When using a delegated administrator account, ensure that your IAM User or Role has the `organizations:ListDelegatedAdministrators` permission. Otherwise, you may get an error like `ValidationError: Account used is not a delegated administrator`.
   */
  def StackSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudformation.StackSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudformation.StackSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
