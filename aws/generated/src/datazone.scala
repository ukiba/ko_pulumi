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
        resourceOptions(conf.customResourceOptionsBuilder).build)

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
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone Environment. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.EnvironmentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.Environment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone Environment Blueprint Configuration. */
  def EnvironmentBlueprintConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentBlueprintConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datazone.EnvironmentBlueprintConfigurationArgs.builder
    com.pulumi.aws.datazone.EnvironmentBlueprintConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone Environment Profile. */
  def EnvironmentProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.EnvironmentProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.EnvironmentProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.EnvironmentProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone Form Type. */
  def FormType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.FormTypeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.FormTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.FormType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone Glossary. */
  def Glossary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.GlossaryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.GlossaryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.Glossary(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone Glossary Term. */
  def GlossaryTerm(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.GlossaryTermArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.GlossaryTermArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.GlossaryTerm(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an AWS DataZone Policy Grant. */
  def PolicyGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.PolicyGrantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datazone.PolicyGrantArgs.builder
    com.pulumi.aws.datazone.PolicyGrant(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone Project. */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.ProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datazone.ProjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.datazone.Project(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DataZone User Profile. */
  def UserProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.datazone.UserProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.datazone.UserProfileArgs.builder
    com.pulumi.aws.datazone.UserProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
