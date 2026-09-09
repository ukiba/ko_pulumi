package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object datazone:
  /** Resource for managing an AWS DataZone Asset Type. */
  def AssetType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.AssetTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.AssetTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.AssetType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  object DatazoneFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS DataZone Domain. */
    inline def getDomain(args: Endofunction[com.pulumi.aws.datazone.inputs.GetDomainArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.datazone.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetDomainArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getDomain(args(argsBuilder).build)

    /** Data source for managing an AWS DataZone Domain. */
    inline def getDomainPlain(args: Endofunction[com.pulumi.aws.datazone.inputs.GetDomainPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datazone.outputs.GetDomainResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetDomainPlainArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getDomainPlain(args(argsBuilder).build)

    /** Data source for managing an AWS DataZone Environment Blueprint. */
    inline def getEnvironmentBlueprint(args: Endofunction[com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.datazone.outputs.GetEnvironmentBlueprintResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getEnvironmentBlueprint(args(argsBuilder).build)

    /** Data source for managing an AWS DataZone Environment Blueprint. */
    inline def getEnvironmentBlueprintPlain(args: Endofunction[com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.datazone.outputs.GetEnvironmentBlueprintResult] =
      val argsBuilder = com.pulumi.aws.datazone.inputs.GetEnvironmentBlueprintPlainArgs.builder
      com.pulumi.aws.datazone.DatazoneFunctions.getEnvironmentBlueprintPlain(args(argsBuilder).build)

  /** Resource for managing an AWS DataZone Domain. */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.DomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.DomainArgs.builder
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
    com.pulumi.aws.datazone.Domain(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS DataZone Environment. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.EnvironmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.datazone.EnvironmentArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

    /**
     * @param userParameters The user parameters that are used in the environment.
     * See User Parameters for more information.
     * Changing these values recreates the resource.
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.EnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS DataZone Environment Blueprint Configuration. */
  def EnvironmentBlueprintConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentBlueprintConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datazone.EnvironmentBlueprintConfigurationArgs.builder
    com.pulumi.aws.datazone.EnvironmentBlueprintConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS DataZone Environment Profile. */
  def EnvironmentProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.EnvironmentProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.EnvironmentProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.datazone.EnvironmentProfileArgs.Builder)
    /**
     * @param userParameters Array of user parameters of the environment profile with the following attributes:
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.EnvironmentProfileArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS DataZone Form Type. */
  def FormType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.FormTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.FormTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.FormType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Resource for managing an AWS DataZone Glossary. */
  def Glossary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.GlossaryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.GlossaryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.Glossary(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Resource for managing an AWS DataZone Glossary Term. */
  def GlossaryTerm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.GlossaryTermArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.GlossaryTermArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.GlossaryTerm(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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

  /** Manages an AWS DataZone Policy Grant. */
  def PolicyGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.PolicyGrantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datazone.PolicyGrantArgs.builder
    com.pulumi.aws.datazone.PolicyGrant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.datazone.PolicyGrantArgs.Builder)
    /**
     * @param detail Policy grant detail. Exactly one sub-block must be specified. See `detail` Block below.
     * @return builder
     */
    def detail(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder]):
        com.pulumi.aws.datazone.PolicyGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.builder
      builder.detail(args(argsBuilder).build)

    /**
     * @param principal Principal to which the policy grant applies. Exactly one sub-block must be specified. See `principal` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.Builder]):
        com.pulumi.aws.datazone.PolicyGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

  /** Resource for managing an AWS DataZone Project. */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.ProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.ProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.datazone.ProjectArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.ProjectTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.ProjectTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Resource for managing an AWS DataZone User Profile. */
  def UserProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.UserProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datazone.UserProfileArgs.builder
    com.pulumi.aws.datazone.UserProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.datazone.UserProfileArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileTimeoutsArgs.Builder]):
        com.pulumi.aws.datazone.UserProfileArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileTimeoutsArgs.builder
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

  extension (builder: com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentArgs.Builder)
    def failureReasons(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentFailureReasonArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentLastDeploymentFailureReasonArgs.builder
      builder.failureReasons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.datazone.inputs.EnvironmentProfileState.Builder)
    /**
     * @param userParameters Array of user parameters of the environment profile with the following attributes:
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentProfileState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentProfileUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

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
     * See User Parameters for more information.
     * Changing these values recreates the resource.
     * @return builder
     */
    def userParameters(args: Endofunction[com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.EnvironmentUserParameterArgs.builder
      builder.userParameters(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder)
    /**
     * @param addToProjectMemberPool Configuration for the `ADD_TO_PROJECT_MEMBER_POOL` policy type. See `addToProjectMemberPool` Block below.
     * @return builder
     */
    def addToProjectMemberPool(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailAddToProjectMemberPoolArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailAddToProjectMemberPoolArgs.builder
      builder.addToProjectMemberPool(args(argsBuilder).build)

    /**
     * @param createAssetType Configuration for the `CREATE_ASSET_TYPE` policy type. See `createAssetType` Block below.
     * @return builder
     */
    def createAssetType(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateAssetTypeArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateAssetTypeArgs.builder
      builder.createAssetType(args(argsBuilder).build)

    /**
     * @param createDomainUnit Configuration for the `CREATE_DOMAIN_UNIT` policy type. See `createDomainUnit` Block below.
     * @return builder
     */
    def createDomainUnit(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateDomainUnitArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateDomainUnitArgs.builder
      builder.createDomainUnit(args(argsBuilder).build)

    /**
     * @param createEnvironment Configuration for the `CREATE_ENVIRONMENT` policy type. Empty block.
     * @return builder
     */
    def createEnvironment(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateEnvironmentArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateEnvironmentArgs.builder
      builder.createEnvironment(args(argsBuilder).build)

    /**
     * @param createEnvironmentFromBlueprint Configuration for the `CREATE_ENVIRONMENT_FROM_BLUEPRINT` policy type. Empty block.
     * @return builder
     */
    def createEnvironmentFromBlueprint(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateEnvironmentFromBlueprintArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateEnvironmentFromBlueprintArgs.builder
      builder.createEnvironmentFromBlueprint(args(argsBuilder).build)

    /**
     * @param createEnvironmentProfile Configuration for the `CREATE_ENVIRONMENT_PROFILE` policy type. See `createEnvironmentProfile` Block below.
     * @return builder
     */
    def createEnvironmentProfile(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateEnvironmentProfileArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateEnvironmentProfileArgs.builder
      builder.createEnvironmentProfile(args(argsBuilder).build)

    /**
     * @param createFormType Configuration for the `CREATE_FORM_TYPE` policy type. See `createFormType` Block below.
     * @return builder
     */
    def createFormType(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateFormTypeArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateFormTypeArgs.builder
      builder.createFormType(args(argsBuilder).build)

    /**
     * @param createGlossary Configuration for the `CREATE_GLOSSARY` policy type. See `createGlossary` Block below.
     * @return builder
     */
    def createGlossary(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateGlossaryArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateGlossaryArgs.builder
      builder.createGlossary(args(argsBuilder).build)

    /**
     * @param createProject Configuration for the `CREATE_PROJECT` policy type. See `createProject` Block below.
     * @return builder
     */
    def createProject(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateProjectArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateProjectArgs.builder
      builder.createProject(args(argsBuilder).build)

    /**
     * @param createProjectFromProjectProfile Configuration for the `CREATE_PROJECT_FROM_PROJECT_PROFILE` policy type. See `createProjectFromProjectProfile` Block below.
     * @return builder
     */
    def createProjectFromProjectProfile(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateProjectFromProjectProfileArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailCreateProjectFromProjectProfileArgs.builder
      builder.createProjectFromProjectProfile(args(argsBuilder).build)

    /**
     * @param delegateCreateEnvironmentProfile Configuration for the `DELEGATE_CREATE_ENVIRONMENT_PROFILE` policy type. Empty block.
     * @return builder
     */
    def delegateCreateEnvironmentProfile(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailDelegateCreateEnvironmentProfileArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailDelegateCreateEnvironmentProfileArgs.builder
      builder.delegateCreateEnvironmentProfile(args(argsBuilder).build)

    /**
     * @param overrideDomainUnitOwners Configuration for the `OVERRIDE_DOMAIN_UNIT_OWNERS` policy type. See `overrideDomainUnitOwners` Block below.
     * @return builder
     */
    def overrideDomainUnitOwners(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailOverrideDomainUnitOwnersArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailOverrideDomainUnitOwnersArgs.builder
      builder.overrideDomainUnitOwners(args(argsBuilder).build)

    /**
     * @param overrideProjectOwners Configuration for the `OVERRIDE_PROJECT_OWNERS` policy type. See `overrideProjectOwners` Block below.
     * @return builder
     */
    def overrideProjectOwners(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailOverrideProjectOwnersArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailOverrideProjectOwnersArgs.builder
      builder.overrideProjectOwners(args(argsBuilder).build)

    /**
     * @param useAssetType Configuration for the `USE_ASSET_TYPE` policy type. See `useAssetType` Block below.
     * @return builder
     */
    def useAssetType(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailUseAssetTypeArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailUseAssetTypeArgs.builder
      builder.useAssetType(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.Builder)
    /**
     * @param domainUnit Domain unit principal. See `domainUnit` Block below.
     * @return builder
     */
    def domainUnit(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalDomainUnitArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalDomainUnitArgs.builder
      builder.domainUnit(args(argsBuilder).build)

    /**
     * @param group Group principal. See `group` Block below.
     * @return builder
     */
    def group(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalGroupArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalGroupArgs.builder
      builder.group(args(argsBuilder).build)

    /**
     * @param project Project principal. See `project` Block below.
     * @return builder
     */
    def project(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalProjectArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalProjectArgs.builder
      builder.project(args(argsBuilder).build)

    /**
     * @param user User principal. See `user` Block below.
     * @return builder
     */
    def user(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalUserArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalUserArgs.builder
      builder.user(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalDomainUnitArgs.Builder)
    /**
     * @param allDomainUnitsGrantFilter Filter to grant access to all domain units. Empty block.
     * @return builder
     */
    def allDomainUnitsGrantFilter(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalDomainUnitAllDomainUnitsGrantFilterArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalDomainUnitArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalDomainUnitAllDomainUnitsGrantFilterArgs.builder
      builder.allDomainUnitsGrantFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalProjectArgs.Builder)
    /**
     * @param domainUnitFilter Filter for domain unit scoping. See `domainUnitFilter` Block below.
     * @return builder
     */
    def domainUnitFilter(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalProjectDomainUnitFilterArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalProjectArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalProjectDomainUnitFilterArgs.builder
      builder.domainUnitFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalUserArgs.Builder)
    /**
     * @param allUsersGrantFilter Filter to grant access to all users. Empty block.
     * @return builder
     */
    def allUsersGrantFilter(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalUserAllUsersGrantFilterArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalUserArgs.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalUserAllUsersGrantFilterArgs.builder
      builder.allUsersGrantFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datazone.inputs.PolicyGrantState.Builder)
    /**
     * @param detail Policy grant detail. Exactly one sub-block must be specified. See `detail` Block below.
     * @return builder
     */
    def detail(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantDetailArgs.builder
      builder.detail(args(argsBuilder).build)

    /**
     * @param principal Principal to which the policy grant applies. Exactly one sub-block must be specified. See `principal` Block below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def principal(args: Endofunction[com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.Builder]):
        com.pulumi.aws.datazone.inputs.PolicyGrantState.Builder =
      val argsBuilder = com.pulumi.aws.datazone.inputs.PolicyGrantPrincipalArgs.builder
      builder.principal(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.Builder)
    def iams(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileDetailIamArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileDetailIamArgs.builder
      builder.iams(args.map(_(argsBuilder).build)*)

    def ssos(args: Endofunction[com.pulumi.aws.datazone.inputs.UserProfileDetailSsoArgs.Builder]*):
        com.pulumi.aws.datazone.inputs.UserProfileDetailArgs.Builder =
      def argsBuilder = com.pulumi.aws.datazone.inputs.UserProfileDetailSsoArgs.builder
      builder.ssos(args.map(_(argsBuilder).build)*)

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
