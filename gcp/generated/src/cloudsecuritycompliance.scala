package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudsecuritycompliance:
  /**
   * Framework deployments represent the assignment of a framework to a target resource. Supported target resources are organizations, folders, and projects.
   * 
   *  To get more information about FrameworkDeployment, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/security-command-center/docs/reference/cloudsecuritycompliance/rest/v1/organizations.locations.frameworkDeployments)
   */
  def FrameworkDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.builder
    com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Cloud controls are the building blocks that make up frameworks. Each cloud control is a unit encapsulating various platform-specific logic for prevention, detection, and audit.
   * 
   *  To get more information about CloudControl, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/security-command-center/docs/reference/cloudsecuritycompliance/rest/v1/organizations.locations.cloudControls)
   */
  def CloudControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.CloudControlArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.CloudControlArgs.builder
    com.pulumi.gcp.cloudsecuritycompliance.CloudControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.Builder)
    /**
     * @param cloudControlMetadatas Deployment mode and parameters for each of the Cloud Controls in
     *  the framework. Every Cloud Control in the framework must have a
     *  CloudControlMetadata.
     *  Structure is documented below.
     * @return builder
     */
    def cloudControlMetadatas(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataArgs.builder
      builder.cloudControlMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param framework FrameworkReference contains the reference of a framework.
     *  Structure is documented below.
     * @return builder
     */
    def framework(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentFrameworkArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentFrameworkArgs.builder
      builder.framework(args(argsBuilder).build)

    /**
     * @param targetResourceConfig TargetResourceConfig contains either the name of the targetResource or
     *  contains the config to create a new target_resource.
     *  Structure is documented below.
     * @return builder
     */
    def targetResourceConfig(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigArgs.builder
      builder.targetResourceConfig(args(argsBuilder).build)

  /**
   * Frameworks allow you to monitor and enforce compliance and security requirements. Manage compliance by assigning built-in or custom frameworks to resources.
   * 
   *  To get more information about Framework, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/security-command-center/docs/reference/cloudsecuritycompliance/rest/v1/organizations.locations.frameworks)
   */
  def Framework(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.FrameworkArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.FrameworkArgs.builder
    com.pulumi.gcp.cloudsecuritycompliance.Framework(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.CloudControlArgs.Builder)
    /**
     * @param parameterSpecs The parameter spec of the cloud control.
     *  Structure is documented below.
     * @return builder
     */
    def parameterSpecs(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.CloudControlArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.builder
      builder.parameterSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param rules The Policy to be enforced to prevent/detect resource non-compliance.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.CloudControlArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.FrameworkArgs.Builder)
    /**
     * @param cloudControlDetails The details of the cloud controls directly added without any grouping in
     *  the framework.
     *  Structure is documented below.
     * @return builder
     */
    def cloudControlDetails(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.FrameworkArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailArgs.builder
      builder.cloudControlDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesArgs.Builder)
    /**
     * @param values List of allowed values for the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigArgs.Builder)
    /**
     * @param folderCreationConfig FolderCreationConfig contains the config to create a new folder to be used
     *  as the targetResource of a deployment.
     *  Structure is documented below.
     * @return builder
     */
    def folderCreationConfig(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigFolderCreationConfigArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigFolderCreationConfigArgs.builder
      builder.folderCreationConfig(args(argsBuilder).build)

    /**
     * @param projectCreationConfig ProjectCreationConfig contains the config to create a new project to be used
     *  as the targetResource of a deployment.
     *  Structure is documented below.
     * @return builder
     */
    def projectCreationConfig(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigProjectCreationConfigArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigProjectCreationConfigArgs.builder
      builder.projectCreationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationArgs.Builder)
    /**
     * @param allowedValues Allowed set of values for the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def allowedValues(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesArgs.builder
      builder.allowedValues(args(argsBuilder).build)

    /**
     * @param intRange Number range for number parameters.
     *  Structure is documented below.
     * @return builder
     */
    def intRange(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationIntRangeArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationIntRangeArgs.builder
      builder.intRange(args(argsBuilder).build)

    /**
     * @param regexpPattern Regular Expression Validator for parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def regexpPattern(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationRegexpPatternArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationRegexpPatternArgs.builder
      builder.regexpPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueArgs.Builder)
    /**
     * @param oneofValue Sub-parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def oneofValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueArgs.builder
      builder.oneofValue(args(argsBuilder).build)

    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueParameterValueArgs.Builder)
    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRuleArgs.Builder)
    /**
     * @param attributeSubstitutionRule Attribute at the given path is substituted entirely.
     *  Structure is documented below.
     * @return builder
     */
    def attributeSubstitutionRule(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRuleAttributeSubstitutionRuleArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRuleAttributeSubstitutionRuleArgs.builder
      builder.attributeSubstitutionRule(args(argsBuilder).build)

    /**
     * @param placeholderSubstitutionRule Placeholder is substituted in the rendered string.
     *  Structure is documented below.
     * @return builder
     */
    def placeholderSubstitutionRule(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRulePlaceholderSubstitutionRuleArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRulePlaceholderSubstitutionRuleArgs.builder
      builder.placeholderSubstitutionRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueArgs.Builder)
    /**
     * @param parameterValue The value of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationArgs.Builder)
    /**
     * @param allowedValues Allowed set of values for the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def allowedValues(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesArgs.builder
      builder.allowedValues(args(argsBuilder).build)

    /**
     * @param intRange Number range for number parameters.
     *  Structure is documented below.
     * @return builder
     */
    def intRange(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationIntRangeArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationIntRangeArgs.builder
      builder.intRange(args(argsBuilder).build)

    /**
     * @param regexpPattern Regular Expression Validator for parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def regexpPattern(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationRegexpPatternArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationRegexpPatternArgs.builder
      builder.regexpPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueParameterValueArgs.Builder)
    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesArgs.Builder)
    /**
     * @param values List of allowed values for the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def values(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueArgs.builder
      builder.values(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueArgs.Builder)
    /**
     * @param parameterValue The value of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueArgs.Builder)
    /**
     * @param parameterValue The value of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigArgs.Builder)
    /**
     * @param targetResourceCreationConfig TargetResourceCreationConfig contains the config to create a new resource to
     *  be used as the targetResource of a deployment.
     *  Structure is documented below.
     * @return builder
     */
    def targetResourceCreationConfig(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigTargetResourceCreationConfigArgs.builder
      builder.targetResourceCreationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleArgs.Builder)
    /**
     * @param celExpression A [CEL
     *  expression](https://cloud.google.com/certificate-authority-service/docs/using-cel).
     *  Structure is documented below.
     * @return builder
     */
    def celExpression(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleCelExpressionArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleCelExpressionArgs.builder
      builder.celExpression(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueArgs.Builder)
    /**
     * @param parameterValue The value of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueArgs.Builder)
    /**
     * @param oneofValue Sub-parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def oneofValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueArgs.builder
      builder.oneofValue(args(argsBuilder).build)

    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsArgs.Builder)
    /**
     * @param parameters Parameters is a key-value pair that is required by the CloudControl. The
     *  specification of these parameters will be present in cloudcontrol.Eg: {
     *  &#34;name&#34;: &#34;location&#34;,&#34;value&#34;: &#34;us-west-1&#34;}.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterArgs.Builder)
    /**
     * @param defaultValue Possible parameter value types.
     *  Structure is documented below.
     * @return builder
     */
    def defaultValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueArgs.builder
      builder.defaultValue(args(argsBuilder).build)

    /**
     * @param substitutionRules List of parameter substitutions.
     *  Structure is documented below.
     * @return builder
     */
    def substitutionRules(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRuleArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterSubstitutionRuleArgs.builder
      builder.substitutionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param validation Validation of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterArgs.Builder)
    /**
     * @param parameterValue Possible parameter value types.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRuleArgs.Builder)
    /**
     * @param attributeSubstitutionRule Attribute at the given path is substituted entirely.
     *  Structure is documented below.
     * @return builder
     */
    def attributeSubstitutionRule(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRuleAttributeSubstitutionRuleArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRuleAttributeSubstitutionRuleArgs.builder
      builder.attributeSubstitutionRule(args(argsBuilder).build)

    /**
     * @param placeholderSubstitutionRule Placeholder is substituted in the rendered string.
     *  Structure is documented below.
     * @return builder
     */
    def placeholderSubstitutionRule(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRulePlaceholderSubstitutionRuleArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRulePlaceholderSubstitutionRuleArgs.builder
      builder.placeholderSubstitutionRule(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkState.Builder)
    /**
     * @param cloudControlDetails The details of the cloud controls directly added without any grouping in
     *  the framework.
     *  Structure is documented below.
     * @return builder
     */
    def cloudControlDetails(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailArgs.builder
      builder.cloudControlDetails(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataArgs.Builder)
    /**
     * @param cloudControlDetails CloudControlDetails contains the details of a CloudControl.
     *  Structure is documented below.
     * @return builder
     */
    def cloudControlDetails(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsArgs.builder
      builder.cloudControlDetails(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueParameterValueArgs.Builder)
    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueArgs.Builder)
    /**
     * @param parameterValue The value of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.Builder)
    /**
     * @param defaultValue Possible parameter value types.
     *  Structure is documented below.
     * @return builder
     */
    def defaultValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueArgs.builder
      builder.defaultValue(args(argsBuilder).build)

    /**
     * @param subParameters The parameter spec of the cloud control.
     *  Structure is documented below.
     * @return builder
     */
    def subParameters(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterArgs.builder
      builder.subParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param substitutionRules List of parameter substitutions.
     *  Structure is documented below.
     * @return builder
     */
    def substitutionRules(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRuleArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubstitutionRuleArgs.builder
      builder.substitutionRules(args.map(_(argsBuilder).build)*)

    /**
     * @param validation Validation of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def validation(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationArgs.builder
      builder.validation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueArgs.Builder)
    /**
     * @param oneofValue Sub-parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def oneofValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueOneofValueArgs.builder
      builder.oneofValue(args(argsBuilder).build)

    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecDefaultValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueArgs.Builder)
    /**
     * @param oneofValue Sub-parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def oneofValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueArgs.builder
      builder.oneofValue(args(argsBuilder).build)

    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailArgs.Builder)
    /**
     * @param parameters Parameters is a key-value pair that is required by the CloudControl. The
     *  specification of these parameters will be present in cloudcontrol.Eg: {
     *  &#34;name&#34;: &#34;location&#34;,&#34;value&#34;: &#34;us-west-1&#34;}.
     *  Structure is documented below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailArgs.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleCelExpressionArgs.Builder)
    /**
     * @param resourceTypesValues A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def resourceTypesValues(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleCelExpressionResourceTypesValuesArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleCelExpressionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleCelExpressionResourceTypesValuesArgs.builder
      builder.resourceTypesValues(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueParameterValueArgs.Builder)
    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlState.Builder)
    /**
     * @param parameterSpecs The parameter spec of the cloud control.
     *  Structure is documented below.
     * @return builder
     */
    def parameterSpecs(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecArgs.builder
      builder.parameterSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param rules The Policy to be enforced to prevent/detect resource non-compliance.
     *  Structure is documented below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueArgs.Builder)
    /**
     * @param parameterValue The value of the parameter.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecValidationAllowedValuesValueOneofValueParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterArgs.Builder)
    /**
     * @param parameterValue Possible parameter value types.
     *  Structure is documented below.
     * @return builder
     */
    def parameterValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueArgs.builder
      builder.parameterValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueParameterValueArgs.Builder)
    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataCloudControlDetailsParameterParameterValueOneofValueParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentState.Builder)
    /**
     * @param cloudControlDeploymentReferences The references to the cloud control deployments. It has all the
     *  CloudControlDeployments which are either directly added in the framework or
     *  through a CloudControlGroup.
     *  Example: If a framework deployment deploys two
     *  cloud controls, cc-deployment-1 and cc-deployment-2, then the
     *  cloudControlDeploymentReferences will be:
     *  {
     *  cloud_control_deployment_reference: {
     *  cloud_control_deployment:
     *  &#34;organizations/{organization}/locations/{location}/cloudControlDeployments/cc-deployment-1&#34;
     *  },
     *  cloud_control_deployment_reference: {
     *  cloud_control_deployment:
     *  &#34;organizations/{organization}/locations/{location}/cloudControlDeployments/cc-deployment-2&#34;
     *  }
     *  Structure is documented below.
     * @return builder
     */
    def cloudControlDeploymentReferences(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlDeploymentReferenceArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlDeploymentReferenceArgs.builder
      builder.cloudControlDeploymentReferences(args.map(_(argsBuilder).build)*)

    /**
     * @param cloudControlMetadatas Deployment mode and parameters for each of the Cloud Controls in
     *  the framework. Every Cloud Control in the framework must have a
     *  CloudControlMetadata.
     *  Structure is documented below.
     * @return builder
     */
    def cloudControlMetadatas(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataArgs.Builder]*):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentState.Builder =
      def argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentCloudControlMetadataArgs.builder
      builder.cloudControlMetadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param framework FrameworkReference contains the reference of a framework.
     *  Structure is documented below.
     * @return builder
     */
    def framework(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentFrameworkArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentFrameworkArgs.builder
      builder.framework(args(argsBuilder).build)

    /**
     * @param targetResourceConfig TargetResourceConfig contains either the name of the targetResource or
     *  contains the config to create a new target_resource.
     *  Structure is documented below.
     * @return builder
     */
    def targetResourceConfig(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkDeploymentTargetResourceConfigArgs.builder
      builder.targetResourceConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueArgs.Builder)
    /**
     * @param oneofValue Sub-parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def oneofValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueOneofValueArgs.builder
      builder.oneofValue(args(argsBuilder).build)

    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.FrameworkCloudControlDetailParameterParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueArgs.Builder)
    /**
     * @param oneofValue Sub-parameter values.
     *  Structure is documented below.
     * @return builder
     */
    def oneofValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueOneofValueArgs.builder
      builder.oneofValue(args(argsBuilder).build)

    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterValidationAllowedValuesValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueParameterValueArgs.Builder)
    /**
     * @param stringListValue A list of strings.
     *  Structure is documented below.
     * @return builder
     */
    def stringListValue(args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueParameterValueStringListValueArgs.Builder]):
        com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueParameterValueArgs.Builder =
      val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.inputs.CloudControlParameterSpecSubParameterDefaultValueOneofValueParameterValueStringListValueArgs.builder
      builder.stringListValue(args(argsBuilder).build)
