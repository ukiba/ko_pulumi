package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object batch:
  /** Manages an Azure Batch account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.batch.AccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.batch.AccountArgs.builder
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
    com.pulumi.azure.batch.Account(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages Azure Batch Application instance. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.batch.ApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.batch.ApplicationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.batch.Application(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object BatchFunctions:
    /** Use this data source to access information about an existing Batch Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.batch.inputs.GetAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.batch.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetAccountArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Batch Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.batch.inputs.GetAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.batch.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Batch Application instance. */
    inline def getApplication(args: Endofunction[com.pulumi.azure.batch.inputs.GetApplicationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.batch.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetApplicationArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getApplication(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Batch Application instance. */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.azure.batch.inputs.GetApplicationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.batch.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetApplicationPlainArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getApplicationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to access information about an existing certificate in a Batch Account.
     * 
     * &gt; **Note:** The `azure.batch.Certificate` data source has been deprecated due to Azure retiring the Azure Batch Account Certificates Feature, and will be removed in v5.0 of the AzureRM provider.
     */
    inline def getCertificate(args: Endofunction[com.pulumi.azure.batch.inputs.GetCertificateArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.batch.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetCertificateArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getCertificate(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to access information about an existing certificate in a Batch Account.
     * 
     * &gt; **Note:** The `azure.batch.Certificate` data source has been deprecated due to Azure retiring the Azure Batch Account Certificates Feature, and will be removed in v5.0 of the AzureRM provider.
     */
    inline def getCertificatePlain(args: Endofunction[com.pulumi.azure.batch.inputs.GetCertificatePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.batch.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetCertificatePlainArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getCertificatePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing Batch pool */
    inline def getPool(args: Endofunction[com.pulumi.azure.batch.inputs.GetPoolArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.batch.outputs.GetPoolResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetPoolArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getPool(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Batch pool */
    inline def getPoolPlain(args: Endofunction[com.pulumi.azure.batch.inputs.GetPoolPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.batch.outputs.GetPoolResult] =
      val argsBuilder = com.pulumi.azure.batch.inputs.GetPoolPlainArgs.builder
      com.pulumi.azure.batch.BatchFunctions.getPoolPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Manages a certificate in an Azure Batch account.
   * 
   * &gt; **Note:** The `azure.batch.Certificate` resource has been deprecated due to Azure retiring the Azure Batch Account Certificates Feature, and will be removed in v5.0 of the AzureRM provider.
   */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.batch.CertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.batch.CertificateArgs.builder
    com.pulumi.azure.batch.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Batch Job. */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.batch.JobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.batch.JobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.batch.Job(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Batch pool. */
  def Pool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.batch.PoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.batch.PoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.batch.Pool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
