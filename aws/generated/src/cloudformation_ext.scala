package jp.ukiba.ko_pulumi
package aws

object cloudformation_ext:
  extension (builder: com.pulumi.aws.cloudformation.CloudFormationTypeArgs.Builder)
    /**
     * @param loggingConfig Configuration block containing logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.Builder]):
        com.pulumi.aws.cloudformation.CloudFormationTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.cloudformation.inputs.CloudFormationTypeState.Builder)
    /**
     * @param loggingConfig Configuration block containing logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.Builder]):
        com.pulumi.aws.cloudformation.inputs.CloudFormationTypeState.Builder =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.CloudFormationTypeLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

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
