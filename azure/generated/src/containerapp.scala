package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object containerapp:
  /** Manages a Container App Environment Certificate. */
  def EnvironmentCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerapp.EnvironmentCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerapp.EnvironmentDaprComponentArgs.Builder)
    /**
     * @param metadatas One or more `metadata` blocks as detailed below.
     * @return builder
     */
    def metadatas(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentMetadataArgs.Builder]*):
        com.pulumi.azure.containerapp.EnvironmentDaprComponentArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets A `secret` block as detailed below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentSecretArgs.Builder]*):
        com.pulumi.azure.containerapp.EnvironmentDaprComponentArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  /** Manages a Container App Custom Domain. */
  def CustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.CustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.CustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerapp.CustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container App Environment. */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerapp.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container App Environment Custom Domain Suffix. */
  def EnvironmentCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentCustomDomainArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.containerapp.EnvironmentCustomDomainArgs.builder
    com.pulumi.azure.containerapp.EnvironmentCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Container App Job. */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.JobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.JobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerapp.Job(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerapp.JobArgs.Builder)
    /**
     * @param eventTriggerConfig A `eventTriggerConfig` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def eventTriggerConfig(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigArgs.Builder]):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigArgs.builder
      builder.eventTriggerConfig(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobIdentityArgs.Builder]):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param manualTriggerConfig A `manualTriggerConfig` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def manualTriggerConfig(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobManualTriggerConfigArgs.Builder]):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobManualTriggerConfigArgs.builder
      builder.manualTriggerConfig(args(argsBuilder).build)

    /**
     * @param registries One or more `registry` blocks as defined below.
     * @return builder
     */
    def registries(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobRegistryArgs.Builder]*):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobRegistryArgs.builder
      builder.registries(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduleTriggerConfig A `scheduleTriggerConfig` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
     * @return builder
     */
    def scheduleTriggerConfig(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobScheduleTriggerConfigArgs.Builder]):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobScheduleTriggerConfigArgs.builder
      builder.scheduleTriggerConfig(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobSecretArgs.Builder]*):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param template A `template` block as defined below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateArgs.Builder]):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.JobArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerapp.AppArgs.Builder)
    /**
     * @param dapr A `dapr` block as detailed below.
     * @return builder
     */
    def dapr(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppDaprArgs.Builder]):
        com.pulumi.azure.containerapp.AppArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppDaprArgs.builder
      builder.dapr(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIdentityArgs.Builder]):
        com.pulumi.azure.containerapp.AppArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingress An `ingress` block as detailed below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIngressArgs.Builder]):
        com.pulumi.azure.containerapp.AppArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppIngressArgs.builder
      builder.ingress(args(argsBuilder).build)

    /**
     * @param registries A `registry` block as detailed below.
     * @return builder
     */
    def registries(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppRegistryArgs.Builder]*):
        com.pulumi.azure.containerapp.AppArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppRegistryArgs.builder
      builder.registries(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets One or more `secret` block as detailed below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppSecretArgs.Builder]*):
        com.pulumi.azure.containerapp.AppArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param template A `template` block as detailed below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder]):
        com.pulumi.azure.containerapp.AppArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.AppArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type ContainerappFunctions = com.pulumi.azure.containerapp.ContainerappFunctions
  object ContainerappFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.containerapp.ContainerappFunctions.*
  extension (self: ContainerappFunctions.type)
    /** Use this data source to access information about an existing Container App. */
    def getApp(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetAppResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetAppArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getApp(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App. */
    def getAppPlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetAppResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetAppPlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getAppPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment. */
    def getEnvironment(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironment(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment. */
    def getEnvironmentPlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetEnvironmentResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentPlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Certificate. */
    def getEnvironmentCertificate(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetEnvironmentCertificateResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificateArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentCertificate(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Certificate. */
    def getEnvironmentCertificatePlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetEnvironmentCertificateResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentCertificatePlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentCertificatePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Storage. */
    def getEnvironmentStorage(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentStorageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.containerapp.outputs.GetEnvironmentStorageResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentStorageArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentStorage(args(argsBuilder).build)

    /** Use this data source to access information about an existing Container App Environment Storage. */
    def getEnvironmentStoragePlain(args: Endofunction[com.pulumi.azure.containerapp.inputs.GetEnvironmentStoragePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.containerapp.outputs.GetEnvironmentStorageResult] =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.GetEnvironmentStoragePlainArgs.builder
      com.pulumi.azure.containerapp.ContainerappFunctions.getEnvironmentStoragePlain(args(argsBuilder).build)

  /** Manages a Container App Environment Storage. */
  def EnvironmentStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerapp.EnvironmentStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerapp.EnvironmentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentIdentityArgs.Builder]):
        com.pulumi.azure.containerapp.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param workloadProfiles One or more `workloadProfile` blocks as defined below.
     * @return builder
     */
    def workloadProfiles(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentWorkloadProfileArgs.Builder]*):
        com.pulumi.azure.containerapp.EnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentWorkloadProfileArgs.builder
      builder.workloadProfiles(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.EnvironmentArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Container App. */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.AppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.AppArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerapp.App(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerapp.EnvironmentCertificateArgs.Builder)
    /**
     * @param certificateKeyVault A `certificateKeyVault` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** one of `certificateBlobBase64` and `certificateKeyVault` must be set.
     * @return builder
     */
    def certificateKeyVault(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentCertificateCertificateKeyVaultArgs.Builder]):
        com.pulumi.azure.containerapp.EnvironmentCertificateArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentCertificateCertificateKeyVaultArgs.builder
      builder.certificateKeyVault(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.EnvironmentCertificateArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Dapr Component for a Container App Environment. */
  def EnvironmentDaprComponent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentDaprComponentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentDaprComponentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.containerapp.EnvironmentDaprComponent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobTemplateContainerReadinessProbeArgs.Builder)
    /**
     * @param headers A `header` block as detailed below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerReadinessProbeHeaderArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerReadinessProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerReadinessProbeHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleArgs.Builder)
    /**
     * @param rules A `rules` block as defined below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleRuleArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateCustomScaleRuleArgs.Builder)
    /**
     * @param authentications Zero or more `authentication` blocks as defined below.
     * 
     *  * `ìdentity_id`- (Optional) Resource ID for the System or User Assigned Managed identity to use when executing the scale rule.
     * @return builder
     */
    def authentications(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateCustomScaleRuleAuthenticationArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateCustomScaleRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateCustomScaleRuleAuthenticationArgs.builder
      builder.authentications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerArgs.Builder)
    /**
     * @param envs One or more `env` blocks as detailed below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerEnvArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param volumeMounts A `volumeMounts` block as detailed below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerVolumeMountArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateContainerReadinessProbeArgs.Builder)
    /**
     * @param headers A `header` block as detailed below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerReadinessProbeHeaderArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerReadinessProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerReadinessProbeHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobTemplateArgs.Builder)
    /**
     * @param containers A `container` block as defined below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param initContainers A `initContainer` block as defined below.
     * @return builder
     */
    def initContainers(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateInitContainerArgs.builder
      builder.initContainers(args.map(_(argsBuilder).build)*)

    /**
     * @param volumes A `volume` block as defined below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateVolumeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.EnvironmentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentIdentityArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param workloadProfiles One or more `workloadProfile` blocks as defined below.
     * @return builder
     */
    def workloadProfiles(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentWorkloadProfileArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.EnvironmentState.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentWorkloadProfileArgs.builder
      builder.workloadProfiles(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.inputs.EnvironmentState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateContainerLivenessProbeArgs.Builder)
    /**
     * @param headers A `header` block as detailed below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerLivenessProbeHeaderArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerLivenessProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerLivenessProbeHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateHttpScaleRuleArgs.Builder)
    /**
     * @param authentications Zero or more `authentication` blocks as defined below.
     * @return builder
     */
    def authentications(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateHttpScaleRuleAuthenticationArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateHttpScaleRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateHttpScaleRuleAuthenticationArgs.builder
      builder.authentications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder)
    /**
     * @param azureQueueScaleRules One or more `azureQueueScaleRule` blocks as defined below.
     * @return builder
     */
    def azureQueueScaleRules(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateAzureQueueScaleRuleArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateAzureQueueScaleRuleArgs.builder
      builder.azureQueueScaleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param containers One or more `container` blocks as detailed below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param customScaleRules One or more `customScaleRule` blocks as defined below.
     * @return builder
     */
    def customScaleRules(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateCustomScaleRuleArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateCustomScaleRuleArgs.builder
      builder.customScaleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param httpScaleRules One or more `httpScaleRule` blocks as defined below.
     * @return builder
     */
    def httpScaleRules(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateHttpScaleRuleArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateHttpScaleRuleArgs.builder
      builder.httpScaleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param initContainers The definition of an init container that is part of the group as documented in the `initContainer` block below.
     * @return builder
     */
    def initContainers(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerArgs.builder
      builder.initContainers(args.map(_(argsBuilder).build)*)

    /**
     * @param tcpScaleRules One or more `tcpScaleRule` blocks as defined below.
     * @return builder
     */
    def tcpScaleRules(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateTcpScaleRuleArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateTcpScaleRuleArgs.builder
      builder.tcpScaleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param volumes A `volume` block as detailed below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateVolumeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleRuleArgs.Builder)
    /**
     * @param authentications A `authentication` block as defined below.
     * @return builder
     */
    def authentications(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleRuleAuthenticationArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleRuleAuthenticationArgs.builder
      builder.authentications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.Builder)
    /**
     * @param envs One or more `env` blocks as detailed below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerEnvArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param livenessProbes A `livenessProbe` block as detailed below.
     * @return builder
     */
    def livenessProbes(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerLivenessProbeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerLivenessProbeArgs.builder
      builder.livenessProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessProbes A `readinessProbe` block as detailed below.
     * @return builder
     */
    def readinessProbes(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerReadinessProbeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerReadinessProbeArgs.builder
      builder.readinessProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param startupProbes A `startupProbe` block as detailed below.
     * @return builder
     */
    def startupProbes(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerStartupProbeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerStartupProbeArgs.builder
      builder.startupProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param volumeMounts A `volumeMounts` block as detailed below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerVolumeMountArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateTcpScaleRuleArgs.Builder)
    /**
     * @param authentications Zero or more `authentication` blocks as defined below.
     * @return builder
     */
    def authentications(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateTcpScaleRuleAuthenticationArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateTcpScaleRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateTcpScaleRuleAuthenticationArgs.builder
      builder.authentications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.Builder)
    /**
     * @param envs One or more `env` blocks as detailed below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerEnvArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param livenessProbes A `livenessProbe` block as detailed below.
     * @return builder
     */
    def livenessProbes(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerLivenessProbeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerLivenessProbeArgs.builder
      builder.livenessProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param readinessProbes A `readinessProbe` block as detailed below.
     * @return builder
     */
    def readinessProbes(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerReadinessProbeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerReadinessProbeArgs.builder
      builder.readinessProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param startupProbes A `startupProbe` block as detailed below.
     * @return builder
     */
    def startupProbes(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerStartupProbeArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerStartupProbeArgs.builder
      builder.startupProbes(args.map(_(argsBuilder).build)*)

    /**
     * @param volumeMounts A `volumeMounts` block as detailed below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerVolumeMountArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentState.Builder)
    /**
     * @param metadatas One or more `metadata` blocks as detailed below.
     * @return builder
     */
    def metadatas(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentMetadataArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentState.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentMetadataArgs.builder
      builder.metadatas(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets A `secret` block as detailed below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentSecretArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentState.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentDaprComponentSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerArgs.Builder)
    /**
     * @param envs One or more `env` blocks as detailed below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerEnvArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param volumeMounts A `volumeMounts` block as detailed below.
     * @return builder
     */
    def volumeMounts(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerVolumeMountArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateInitContainerVolumeMountArgs.builder
      builder.volumeMounts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobTemplateContainerStartupProbeArgs.Builder)
    /**
     * @param headers A `header` block as detailed below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerStartupProbeHeaderArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerStartupProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerStartupProbeHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppIngressArgs.Builder)
    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIngressCorsArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.AppIngressArgs.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppIngressCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param customDomains One or more `customDomain` block as detailed below.
     * @return builder
     */
    def customDomains(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIngressCustomDomainArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppIngressArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppIngressCustomDomainArgs.builder
      builder.customDomains(args.map(_(argsBuilder).build)*)

    /**
     * @param ipSecurityRestrictions One or more `ipSecurityRestriction` blocks for IP-filtering rules as defined below.
     * @return builder
     */
    def ipSecurityRestrictions(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIngressIpSecurityRestrictionArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppIngressArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppIngressIpSecurityRestrictionArgs.builder
      builder.ipSecurityRestrictions(args.map(_(argsBuilder).build)*)

    /**
     * @param trafficWeights One or more `trafficWeight` blocks as detailed below.
     * @return builder
     */
    def trafficWeights(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIngressTrafficWeightArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppIngressArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppIngressTrafficWeightArgs.builder
      builder.trafficWeights(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.JobTemplateContainerLivenessProbeArgs.Builder)
    /**
     * @param headers A `header` block as detailed below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateContainerLivenessProbeHeaderArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobTemplateContainerLivenessProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateContainerLivenessProbeHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.EnvironmentCertificateState.Builder)
    /**
     * @param certificateKeyVault A `certificateKeyVault` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** one of `certificateBlobBase64` and `certificateKeyVault` must be set.
     * @return builder
     */
    def certificateKeyVault(args: Endofunction[com.pulumi.azure.containerapp.inputs.EnvironmentCertificateCertificateKeyVaultArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.EnvironmentCertificateState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.EnvironmentCertificateCertificateKeyVaultArgs.builder
      builder.certificateKeyVault(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.inputs.EnvironmentCertificateState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerapp.inputs.JobState.Builder)
    /**
     * @param eventTriggerConfig A `eventTriggerConfig` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def eventTriggerConfig(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigArgs.builder
      builder.eventTriggerConfig(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobIdentityArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param manualTriggerConfig A `manualTriggerConfig` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def manualTriggerConfig(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobManualTriggerConfigArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobManualTriggerConfigArgs.builder
      builder.manualTriggerConfig(args(argsBuilder).build)

    /**
     * @param registries One or more `registry` blocks as defined below.
     * @return builder
     */
    def registries(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobRegistryArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobRegistryArgs.builder
      builder.registries(args.map(_(argsBuilder).build)*)

    /**
     * @param scheduleTriggerConfig A `scheduleTriggerConfig` block as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** Only one of `manualTriggerConfig`, `eventTriggerConfig` or `scheduleTriggerConfig` can be specified.
     * @return builder
     */
    def scheduleTriggerConfig(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobScheduleTriggerConfigArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobScheduleTriggerConfigArgs.builder
      builder.scheduleTriggerConfig(args(argsBuilder).build)

    /**
     * @param secrets One or more `secret` blocks as defined below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobSecretArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param template A `template` block as defined below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobTemplateArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.JobTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.inputs.JobState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateAzureQueueScaleRuleArgs.Builder)
    /**
     * @param authentications One or more `authentication` blocks as defined below.
     * @return builder
     */
    def authentications(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateAzureQueueScaleRuleAuthenticationArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateAzureQueueScaleRuleArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateAzureQueueScaleRuleAuthenticationArgs.builder
      builder.authentications(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppState.Builder)
    /**
     * @param dapr A `dapr` block as detailed below.
     * @return builder
     */
    def dapr(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppDaprArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppDaprArgs.builder
      builder.dapr(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIdentityArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingress An `ingress` block as detailed below.
     * @return builder
     */
    def ingress(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppIngressArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppIngressArgs.builder
      builder.ingress(args(argsBuilder).build)

    /**
     * @param registries A `registry` block as detailed below.
     * @return builder
     */
    def registries(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppRegistryArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppState.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppRegistryArgs.builder
      builder.registries(args.map(_(argsBuilder).build)*)

    /**
     * @param secrets One or more `secret` block as detailed below.
     * @return builder
     */
    def secrets(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppSecretArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppState.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppSecretArgs.builder
      builder.secrets(args.map(_(argsBuilder).build)*)

    /**
     * @param template A `template` block as detailed below.
     * @return builder
     */
    def template(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateArgs.Builder]):
        com.pulumi.azure.containerapp.inputs.AppState.Builder =
      val argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateArgs.builder
      builder.template(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.containerapp.inputs.AppState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigArgs.Builder)
    /**
     * @param scales A `scale` block as defined below.
     * @return builder
     */
    def scales(args: Endofunction[com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.JobEventTriggerConfigScaleArgs.builder
      builder.scales(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.containerapp.inputs.AppTemplateContainerStartupProbeArgs.Builder)
    /**
     * @param headers A `header` block as detailed below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.containerapp.inputs.AppTemplateContainerStartupProbeHeaderArgs.Builder]*):
        com.pulumi.azure.containerapp.inputs.AppTemplateContainerStartupProbeArgs.Builder =
      def argsBuilder = com.pulumi.azure.containerapp.inputs.AppTemplateContainerStartupProbeHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  /** Manages a Container App Environment Managed Certificate. */
  def EnvironmentManagedCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.containerapp.EnvironmentManagedCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.containerapp.EnvironmentManagedCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.containerapp.EnvironmentManagedCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
