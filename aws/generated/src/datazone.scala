package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object datazone:
  extension (builder: com.pulumi.aws.datazone.FormTypeArgs.Builder)
    /**
     * @param model Object of the model of the form type that contains the following attributes.
     * @return builder
     */
    def model(args: Endofunction[com.pulumi.aws.datazone.inputs.FormTypeModelArgs.Builder]):
        com.pulumi.aws.datazone.FormTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.FormTypeModelArgs.builder
      builder.model(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.FormTypeTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.FormTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.FormTypeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS DataZone Environment. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.datazone.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datazone.UserProfileArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.UserProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS DataZone Form Type. */
  def FormType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.FormTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.FormTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.datazone.FormType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS DataZone Asset Type. */
  def AssetType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.AssetTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.AssetTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.datazone.AssetType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datazone.ProjectArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.ProjectTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.ProjectTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type DatazoneFunctions = com.pulumi.aws.datazone.DatazoneFunctions
  object DatazoneFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.datazone.DatazoneFunctions.*
  extension (self: DatazoneFunctions.type)
    /** Data source for managing an AWS DataZone Domain. */
    def getDomain(args: Endofunction[com.pulumi.aws.datazone.inputs.GetDomainArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.datazone.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetDomainArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getDomain(args(argsBuilder).build)

    /** Data source for managing an AWS DataZone Domain. */
    def getDomainPlain(args: Endofunction[com.pulumi.aws.datazone.inputs.GetDomainPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datazone.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetDomainPlainArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getDomainPlain(args(argsBuilder).build)

    /** Data source for managing an AWS DataZone Environment Blueprint. */
    def getEnvironmentBlueprint(args: Endofunction[com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.datazone.outputs.GetEnvironmentBlueprintResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getEnvironmentBlueprint(args(argsBuilder).build)

    /** Data source for managing an AWS DataZone Environment Blueprint. */
    def getEnvironmentBlueprintPlain(args: Endofunction[com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datazone.outputs.GetEnvironmentBlueprintResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintPlainArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getEnvironmentBlueprintPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.DomainArgs.Builder)
    /**
     * @param singleSignOn Single sign on options, used to [enable AWS IAM Identity Center](https://docs.aws.amazon.com/datazone/latest/userguide/enable-IAM-identity-center-for-datazone.html) for DataZone.
     * @return builder
     */
    def singleSignOn(args: Endofunction[com.pulumi.aws.datazone.inputs.DomainSingleSignOnArgs.Builder]):
        com.pulumi.aws.datazone.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.DomainSingleSignOnArgs.builder
      builder.singleSignOn(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.DomainTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.DomainTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS DataZone User Profile. */
  def UserProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.UserProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.datazone.UserProfileArgs.builder
    
    com.pulumi.aws.datazone.UserProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS DataZone Glossary. */
  def Glossary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.GlossaryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.GlossaryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.datazone.Glossary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS DataZone Environment Blueprint Configuration. */
  def EnvironmentBlueprintConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentBlueprintConfigurationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.datazone.EnvironmentBlueprintConfigurationArgs.builder
    
    com.pulumi.aws.datazone.EnvironmentBlueprintConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datazone.AssetTypeArgs.Builder)
    /**
     * @param formsInputs The metadata forms that are to be attached to the custom asset type.
     * @return builder
     */
    def formsInputs(args: Endofunction[com.pulumi.aws.datazone.inputs.AssetTypeFormsInputArgs.Builder]*):
        com.pulumi.aws.datazone.AssetTypeArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.AssetTypeFormsInputArgs.builder
      builder.formsInputs(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.AssetTypeTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.AssetTypeArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.AssetTypeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.EnvironmentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param userParameters The user parameters that are used in the environment.
     *  See User Parameters for more information.
     *  Changing these values recreates the resource.
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.EnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS DataZone Environment Profile. */
  def EnvironmentProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentProfileArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.EnvironmentProfileArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.datazone.EnvironmentProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS DataZone Glossary Term. */
  def GlossaryTerm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.GlossaryTermArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.GlossaryTermArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.datazone.GlossaryTerm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS DataZone Project. */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.ProjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.ProjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.datazone.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datazone.EnvironmentProfileArgs.Builder)
    /**
     * @param userParameters Array of user parameters of the environment profile with the following attributes:
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.EnvironmentProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datazone.GlossaryTermArgs.Builder)
    /**
     * @param termRelations Object classifying the term relations through the following attributes:
     * @return builder
     */
    def termRelations(args: Endofunction[com.pulumi.aws.datazone.inputs.GlossaryTermTermRelationsArgs.Builder]):
        com.pulumi.aws.datazone.GlossaryTermArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GlossaryTermTermRelationsArgs.builder
      builder.termRelations(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.GlossaryTermTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.GlossaryTermArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GlossaryTermTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.DomainState.Builder)
    /**
     * @param singleSignOn Single sign on options, used to [enable AWS IAM Identity Center](https://docs.aws.amazon.com/datazone/latest/userguide/enable-IAM-identity-center-for-datazone.html) for DataZone.
     * @return builder
     */
    def singleSignOn(args: Endofunction[com.pulumi.aws.datazone.inputs.DomainSingleSignOnArgs.Builder]):
        com.pulumi.aws.datazone.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.DomainSingleSignOnArgs.builder
      builder.singleSignOn(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.DomainTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.DomainTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.AssetTypeState.Builder)
    /**
     * @param formsInputs The metadata forms that are to be attached to the custom asset type.
     * @return builder
     */
    def formsInputs(args: Endofunction[com.pulumi.aws.datazone.inputs.AssetTypeFormsInputArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.AssetTypeState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.AssetTypeFormsInputArgs.builder
      builder.formsInputs(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.AssetTypeTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.AssetTypeState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.AssetTypeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.ProjectState.Builder)
    /**
     * @param failureReasons List of error messages if operation cannot be completed.
     * @return builder
     */
    def failureReasons(args: Endofunction[com.pulumi.aws.datazone.inputs.ProjectFailureReasonArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.ProjectState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.ProjectFailureReasonArgs.builder
      builder.failureReasons(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.ProjectTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.ProjectTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.EnvironmentState.Builder)
    /**
     * @param lastDeployments The details of the last deployment of the environment.
     * @return builder
     */
    def lastDeployments(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentArgs.builder
      builder.lastDeployments(args.map(_(argsBuilder).build)*)

    def provisionedResources(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentProvisionedResourceArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentProvisionedResourceArgs.builder
      builder.provisionedResources(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param userParameters The user parameters that are used in the environment.
     *  See User Parameters for more information.
     *  Changing these values recreates the resource.
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datazone.inputs.UserProfileState.Builder)
    /**
     * @param details Details about the user profile.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.UserProfileState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.builder
      builder.details(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.UserProfileState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.EnvironmentProfileState.Builder)
    /**
     * @param userParameters Array of user parameters of the environment profile with the following attributes:
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentProfileState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.Builder)
    def iams(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileDetailIamArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileDetailIamArgs.builder
      builder.iams(args.map(_(argsBuilder).build)*)

    def ssos(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileDetailSsoArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileDetailSsoArgs.builder
      builder.ssos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentArgs.Builder)
    def failureReasons(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentFailureReasonArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentFailureReasonArgs.builder
      builder.failureReasons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datazone.inputs.FormTypeState.Builder)
    def imports(args: Endofunction[com.pulumi.aws.datazone.inputs.FormTypeImportArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.FormTypeState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.FormTypeImportArgs.builder
      builder.imports(args.map(_(argsBuilder).build)*)

    /**
     * @param model Object of the model of the form type that contains the following attributes.
     * @return builder
     */
    def model(args: Endofunction[com.pulumi.aws.datazone.inputs.FormTypeModelArgs.Builder]):
        com.pulumi.aws.datazone.inputs.FormTypeState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.FormTypeModelArgs.builder
      builder.model(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.FormTypeTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.FormTypeState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.FormTypeTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.GlossaryTermState.Builder)
    /**
     * @param termRelations Object classifying the term relations through the following attributes:
     * @return builder
     */
    def termRelations(args: Endofunction[com.pulumi.aws.datazone.inputs.GlossaryTermTermRelationsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.GlossaryTermState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GlossaryTermTermRelationsArgs.builder
      builder.termRelations(args(argsBuilder).build)

    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.GlossaryTermTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.inputs.GlossaryTermState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GlossaryTermTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS DataZone Domain. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datazone.DomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.DomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datazone.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
