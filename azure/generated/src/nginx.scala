package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object nginx:
  /** Manages the Dataplane API Key for an Nginx Deployment. */
  inline def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.nginx.ApiKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.nginx.ApiKeyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.nginx.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Certificate for an NGINX Deployment. */
  inline def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.nginx.CertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.nginx.CertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.nginx.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages the configuration for a Nginx Deployment. */
  inline def Configuration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.nginx.ConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.nginx.ConfigurationArgs.builder
    com.pulumi.azure.nginx.Configuration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an NGINX Deployment. */
  inline def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.nginx.DeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.nginx.DeploymentArgs.builder
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
    com.pulumi.azure.nginx.Deployment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NginxFunctions:
    /** Use this data source to access information about an existing NGINX Dataplane API Key. */
    inline def getApiKey(args: Endofunction[com.pulumi.azure.nginx.inputs.GetApiKeyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetApiKeyResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetApiKeyArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getApiKey(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing NGINX Dataplane API Key. */
    inline def getApiKeyPlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetApiKeyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetApiKeyResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetApiKeyPlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getApiKeyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing NGINX Certificate. */
    inline def getCertificate(args: Endofunction[com.pulumi.azure.nginx.inputs.GetCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetCertificateArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing NGINX Certificate. */
    inline def getCertificatePlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetCertificatePlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Nginx Configuration. */
    inline def getConfiguration(args: Endofunction[com.pulumi.azure.nginx.inputs.GetConfigurationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetConfigurationArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getConfiguration(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Nginx Configuration. */
    inline def getConfigurationPlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetConfigurationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetConfigurationResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetConfigurationPlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getConfigurationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing NGINX Deployment. */
    inline def getDeployment(args: Endofunction[com.pulumi.azure.nginx.inputs.GetDeploymentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.nginx.outputs.GetDeploymentResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetDeploymentArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getDeployment(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing NGINX Deployment. */
    inline def getDeploymentPlain(args: Endofunction[com.pulumi.azure.nginx.inputs.GetDeploymentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.nginx.outputs.GetDeploymentResult] =
      val argsBuilder = com.pulumi.azure.nginx.inputs.GetDeploymentPlainArgs.builder
      com.pulumi.azure.nginx.NginxFunctions.getDeploymentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
