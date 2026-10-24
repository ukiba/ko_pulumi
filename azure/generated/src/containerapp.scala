package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object containerapp:
  /** Manages a Container App. */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.AppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.AppArgs.builder
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
    com.pulumi.azure.containerapp.App(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ContainerappFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Container App. */
    inline def getApp(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetAppResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetAppArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getApp(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App. */
    inline def getAppPlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetAppResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetAppPlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getAppPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment. */
    inline def getEnvironment(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment. */
    inline def getEnvironmentPlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentPlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Certificate. */
    inline def getEnvironmentCertificate(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetEnvironmentCertificateResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificateArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentCertificate(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Certificate. */
    inline def getEnvironmentCertificatePlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetEnvironmentCertificateResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificatePlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentCertificatePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Storage. */
    inline def getEnvironmentStorage(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentStorageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetEnvironmentStorageResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentStorageArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentStorage(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Storage. */
    inline def getEnvironmentStoragePlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentStoragePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetEnvironmentStorageResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentStoragePlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentStoragePlain(args(argsBuilder).build)

  /** Manages a Container App Custom Domain. */
  def CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.CustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.CustomDomainArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerapp.CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container App Environment. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentArgs.builder
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
    com.pulumi.azure.containerapp.Environment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container App Environment Certificate. */
  def EnvironmentCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentCertificateArgs.builder
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
    com.pulumi.azure.containerapp.EnvironmentCertificate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container App Environment Custom Domain Suffix. */
  def EnvironmentCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentCustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.containerapp.EnvironmentCustomDomainArgs.builder
    com.pulumi.azure.containerapp.EnvironmentCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dapr Component for a Container App Environment. */
  def EnvironmentDaprComponent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentDaprComponentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentDaprComponentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerapp.EnvironmentDaprComponent(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container App Environment Managed Certificate. */
  def EnvironmentManagedCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentManagedCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentManagedCertificateArgs.builder
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
    com.pulumi.azure.containerapp.EnvironmentManagedCertificate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container App Environment Storage. */
  def EnvironmentStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentStorageArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentStorageArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerapp.EnvironmentStorage(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Container App Job. */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.JobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.JobArgs.builder
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
    com.pulumi.azure.containerapp.Job(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
