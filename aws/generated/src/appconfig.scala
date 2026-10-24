package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object appconfig:
  object AppconfigFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an AWS AppConfig Application. */
    inline def getApplication(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetApplicationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetApplicationArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getApplication(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about an AWS AppConfig Application. */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetApplicationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetApplicationPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getApplicationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides access to an AppConfig Configuration Profile. */
    inline def getConfigurationProfile(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetConfigurationProfileResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfileArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides access to an AppConfig Configuration Profile. */
    inline def getConfigurationProfilePlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetConfigurationProfileResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfilePlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     * Profile IDs to another resource.
     */
    inline def getConfigurationProfiles(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetConfigurationProfilesResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfiles(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to all Configuration Properties for an AppConfig Application. This will allow you to pass Configuration
     * Profile IDs to another resource.
     */
    inline def getConfigurationProfilesPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetConfigurationProfilesResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetConfigurationProfilesPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getConfigurationProfilesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides access to an AppConfig Environment. */
    inline def getEnvironment(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides access to an AppConfig Environment. */
    inline def getEnvironmentPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironmentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     * resource.
     */
    inline def getEnvironments(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.appconfig.outputs.GetEnvironmentsResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentsArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironments(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to all Environments for an AppConfig Application. This will allow you to pass Environment IDs to another
     * resource.
     */
    inline def getEnvironmentsPlain(args: Endofunction[com.pulumi.aws.appconfig.inputs.GetEnvironmentsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.appconfig.outputs.GetEnvironmentsResult] =
      val argsBuilder = com.pulumi.aws.appconfig.inputs.GetEnvironmentsPlainArgs.builder
      com.pulumi.aws.appconfig.AppconfigFunctions.getEnvironmentsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Provides an AppConfig Application resource. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.ApplicationArgs.builder
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
    com.pulumi.aws.appconfig.Application(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AppConfig Configuration Profile resource. */
  def ConfigurationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ConfigurationProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.ConfigurationProfileArgs.builder
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
    com.pulumi.aws.appconfig.ConfigurationProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AppConfig Deployment resource for an `aws.appconfig.Application` resource. */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.DeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.DeploymentArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.appconfig.Deployment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AppConfig Deployment Strategy resource. */
  def DeploymentStrategy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.DeploymentStrategyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.DeploymentStrategyArgs.builder
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
    com.pulumi.aws.appconfig.DeploymentStrategy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AppConfig Environment resource for an `aws.appconfig.Application` resource. One or more environments can be defined for an application. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.EnvironmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.EnvironmentArgs.builder
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
    com.pulumi.aws.appconfig.Environment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an Amazon AppIntegrations Event Integration resource. */
  def EventIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.EventIntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.EventIntegrationArgs.builder
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
    com.pulumi.aws.appconfig.EventIntegration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AppConfig Extension resource. */
  def Extension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ExtensionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.appconfig.ExtensionArgs.builder
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
    com.pulumi.aws.appconfig.Extension(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates an AppConfig Extension with a Resource. */
  def ExtensionAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.ExtensionAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.appconfig.ExtensionAssociationArgs.builder
    com.pulumi.aws.appconfig.ExtensionAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an AppConfig Hosted Configuration Version resource. */
  def HostedConfigurationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.appconfig.HostedConfigurationVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.appconfig.HostedConfigurationVersionArgs.builder
    com.pulumi.aws.appconfig.HostedConfigurationVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
