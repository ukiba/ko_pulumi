package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object logicapps:
  /** Manages a Custom Action within a Logic App Workflow */
  def ActionCustom(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.ActionCustomArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.ActionCustomArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.ActionCustom(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an HTTP Action within a Logic App Workflow */
  def ActionHttp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.ActionHttpArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.ActionHttpArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.ActionHttp(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account. */
  def IntegrationAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountArgs.builder
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
    com.pulumi.azure.logicapps.IntegrationAccount(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Agreement. */
  def IntegrationAccountAgreement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountAgreementArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountAgreement(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Assembly. */
  def IntegrationAccountAssembly(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountAssemblyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountAssemblyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountAssembly(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Batch Configuration. */
  def IntegrationAccountBatchConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountBatchConfigurationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountBatchConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Certificate. */
  def IntegrationAccountCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Map. */
  def IntegrationAccountMap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountMapArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountMapArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountMap(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Partner. */
  def IntegrationAccountPartner(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountPartnerArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountPartner(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Schema. */
  def IntegrationAccountSchema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountSchemaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountSchemaArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountSchema(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Integration Account Session. */
  def IntegrationAccountSession(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.IntegrationAccountSessionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.IntegrationAccountSessionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.IntegrationAccountSession(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object LogicappsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Logic App Integration Account. */
    inline def getIntegrationAccount(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetIntegrationAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.logicapps.outputs.GetIntegrationAccountResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetIntegrationAccountArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getIntegrationAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Integration Account. */
    inline def getIntegrationAccountPlain(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetIntegrationAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.logicapps.outputs.GetIntegrationAccountResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetIntegrationAccountPlainArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getIntegrationAccountPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Standard instance. */
    inline def getStandard(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetStandardArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.logicapps.outputs.GetStandardResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetStandardArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getStandard(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Standard instance. */
    inline def getStandardPlain(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetStandardPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.logicapps.outputs.GetStandardResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetStandardPlainArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getStandardPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Workflow. */
    inline def getWorkflow(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetWorkflowArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.logicapps.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetWorkflowArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getWorkflow(args(argsBuilder).build)

    /** Use this data source to access information about an existing Logic App Workflow. */
    inline def getWorkflowPlain(args: Endofunction[com.pulumi.azure.logicapps.inputs.GetWorkflowPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.logicapps.outputs.GetWorkflowResult] =
      val argsBuilder = com.pulumi.azure.logicapps.inputs.GetWorkflowPlainArgs.builder
      com.pulumi.azure.logicapps.LogicappsFunctions.getWorkflowPlain(args(argsBuilder).build)

  /** Manages a Logic App (Standard / Single Tenant) */
  def Standard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.StandardArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.StandardArgs.builder
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
    com.pulumi.azure.logicapps.Standard(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Custom Trigger within a Logic App Workflow */
  def TriggerCustom(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.TriggerCustomArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.TriggerCustomArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.TriggerCustom(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a HTTP Request Trigger within a Logic App Workflow */
  def TriggerHttpRequest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.TriggerHttpRequestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.TriggerHttpRequestArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.TriggerHttpRequest(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Recurrence Trigger within a Logic App Workflow */
  def TriggerRecurrence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.TriggerRecurrenceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.TriggerRecurrenceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.logicapps.TriggerRecurrence(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Logic App Workflow. */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.logicapps.WorkflowArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.logicapps.WorkflowArgs.builder
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
    com.pulumi.azure.logicapps.Workflow(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
