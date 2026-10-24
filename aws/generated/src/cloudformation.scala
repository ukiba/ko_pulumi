package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object cloudformation:
  /**
   * Manages a version of a CloudFormation Type.
   * 
   * ## Import
   * 
   * Using `pulumi import`, import `aws.cloudformation.CloudFormationType` using the type version ARN. For example:
   * 
   * ```sh
   * \$ pulumi import aws:cloudformation/cloudFormationType:CloudFormationType example arn:aws:cloudformation:us-east-1:123456789012:type/resource/ExampleCompany-ExampleService-ExampleType/1
   * ```
   */
  def CloudFormationType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.CloudFormationTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudformation.CloudFormationTypeArgs.builder
    com.pulumi.aws.cloudformation.CloudFormationType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object CloudformationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about a CloudFormation Type. */
    inline def getCloudFormationType(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypeArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getCloudFormationType(args(argsBuilder).build)

    /** Provides details about a CloudFormation Type. */
    inline def getCloudFormationTypePlain(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetCloudFormationTypePlainArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getCloudFormationTypePlain(args(argsBuilder).build)

    /**
     * The CloudFormation Export data source allows access to stack
     * exports specified in the [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html) section of the CloudFormation Template using the optional Export Property.
     * 
     *  &gt; Note: If you are trying to use a value from a CloudFormation Stack in the same Terraform run please use normal interpolation or CloudFormation Outputs.
     */
    inline def getExport(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetExportArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudformation.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetExportArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getExport(args(argsBuilder).build)

    /**
     * The CloudFormation Export data source allows access to stack
     * exports specified in the [Output](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/outputs-section-structure.html) section of the CloudFormation Template using the optional Export Property.
     * 
     *  &gt; Note: If you are trying to use a value from a CloudFormation Stack in the same Terraform run please use normal interpolation or CloudFormation Outputs.
     */
    inline def getExportPlain(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetExportPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudformation.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetExportPlainArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getExportPlain(args(argsBuilder).build)

    /**
     * The CloudFormation Stack data source allows access to stack
     * outputs and other useful data including the template body.
     */
    inline def getStack(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetStackArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudformation.outputs.GetStackResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetStackArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getStack(args(argsBuilder).build)

    /**
     * The CloudFormation Stack data source allows access to stack
     * outputs and other useful data including the template body.
     */
    inline def getStackPlain(args: Endofunction[com.pulumi.aws.cloudformation.inputs.GetStackPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudformation.outputs.GetStackResult] =
      val argsBuilder = com.pulumi.aws.cloudformation.inputs.GetStackPlainArgs.builder
      com.pulumi.aws.cloudformation.CloudformationFunctions.getStackPlain(args(argsBuilder).build)

  /** Provides a CloudFormation Stack resource. */
  def Stack(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudformation.StackArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudformation.Stack(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages CloudFormation stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region. Additional information about stacks can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacks.html).
   * 
   * &gt; **NOTE:** This resource will manage all stack instances for the specified `stackSetName`. If you create stack instances outside of Terraform or import existing infrastructure, ensure that your configuration includes all accounts and regions where stack instances exist for the stack set. Failing to include all accounts and regions will cause Terraform to continuously report differences between your configuration and the actual infrastructure.
   * 
   * &gt; **NOTE:** All target accounts must have an IAM Role created that matches the name of the execution role configured in the stack (the `executionRoleName` argument in the `aws.cloudformation.StackSet` resource) in a trust relationship with the administrative account or administration IAM Role. The execution role must have appropriate permissions to manage resources defined in the template along with those required for stacks to operate. See the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html) for more details.
   * 
   * &gt; **NOTE:** To retain the Stack during Terraform resource destroy, ensure `retainStacks = true` has been successfully applied into the Terraform state first. This must be completed _before_ an apply that would destroy the resource.
   */
  def StackInstances(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackInstancesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudformation.StackInstancesArgs.builder
    com.pulumi.aws.cloudformation.StackInstances(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a CloudFormation StackSet. StackSets allow CloudFormation templates to be easily deployed across multiple accounts and regions via StackSet Instances (`aws.cloudformation.StackSetInstance` resource). Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
   * 
   * &gt; **NOTE:** All template parameters, including those with a `Default`, must be configured or ignored with the `lifecycle` configuration block `ignoreChanges` argument.
   * 
   * &gt; **NOTE:** All `NoEcho` template parameters must be ignored with the `lifecycle` configuration block `ignoreChanges` argument.
   * 
   * &gt; **NOTE:** When using a delegated administrator account, ensure that your IAM User or Role has the `organizations:ListDelegatedAdministrators` permission. Otherwise, you may get an error like `ValidationError: Account used is not a delegated administrator`.
   */
  def StackSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackSetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudformation.StackSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.cloudformation.StackSet(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a CloudFormation StackSet Instance. Instances are managed in the account and region of the StackSet after the target account permissions have been configured. Additional information about StackSets can be found in the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/what-is-cfnstacksets.html).
   * 
   * &gt; **NOTE:** All target accounts must have an IAM Role created that matches the name of the execution role configured in the StackSet (the `executionRoleName` argument in the `aws.cloudformation.StackSet` resource) in a trust relationship with the administrative account or administration IAM Role. The execution role must have appropriate permissions to manage resources defined in the template along with those required for StackSets to operate. See the [AWS CloudFormation User Guide](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html) for more details.
   * 
   * &gt; **NOTE:** To retain the Stack during resource destroy, ensure `retainStack` has been set to `true` in the state first. This must be completed _before_ a deployment that would destroy the resource.
   */
  def StackSetInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudformation.StackSetInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudformation.StackSetInstanceArgs.builder
    com.pulumi.aws.cloudformation.StackSetInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
