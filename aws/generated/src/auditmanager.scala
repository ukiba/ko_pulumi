package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object auditmanager:
  /** Resource for managing AWS Audit Manager Account Registration. */
  inline def AccountRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AccountRegistrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.auditmanager.AccountRegistrationArgs.builder
    com.pulumi.aws.auditmanager.AccountRegistration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Audit Manager Assessment. */
  inline def Assessment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AssessmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.AssessmentArgs.builder
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
    com.pulumi.aws.auditmanager.Assessment(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Audit Manager Assessment Delegation. */
  inline def AssessmentDelegation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AssessmentDelegationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.auditmanager.AssessmentDelegationArgs.builder
    com.pulumi.aws.auditmanager.AssessmentDelegation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Audit Manager Assessment Report. */
  inline def AssessmentReport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.AssessmentReportArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.AssessmentReportArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.auditmanager.AssessmentReport(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object AuditmanagerFunctions:
    /** Data source for managing an AWS Audit Manager Control. */
    inline def getControl(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetControlArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.auditmanager.outputs.GetControlResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetControlArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getControl(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Audit Manager Control. */
    inline def getControlPlain(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetControlPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.auditmanager.outputs.GetControlResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetControlPlainArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getControlPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS Audit Manager Framework. */
    inline def getFramework(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.auditmanager.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetFrameworkArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getFramework(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS Audit Manager Framework. */
    inline def getFrameworkPlain(args: Endofunction[com.pulumi.aws.auditmanager.inputs.GetFrameworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.auditmanager.outputs.GetFrameworkResult] =
      val argsBuilder = com.pulumi.aws.auditmanager.inputs.GetFrameworkPlainArgs.builder
      com.pulumi.aws.auditmanager.AuditmanagerFunctions.getFrameworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Resource for managing an AWS Audit Manager Control. */
  inline def Control(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.ControlArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.ControlArgs.builder
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
    com.pulumi.aws.auditmanager.Control(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Audit Manager Framework. */
  inline def Framework(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.FrameworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.auditmanager.FrameworkArgs.builder
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
    com.pulumi.aws.auditmanager.Framework(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Audit Manager Framework Share. */
  inline def FrameworkShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.FrameworkShareArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.auditmanager.FrameworkShareArgs.builder
    com.pulumi.aws.auditmanager.FrameworkShare(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing AWS Audit Manager Organization Admin Account Registration. */
  inline def OrganizationAdminAccountRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistrationArgs.builder
    com.pulumi.aws.auditmanager.OrganizationAdminAccountRegistration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
