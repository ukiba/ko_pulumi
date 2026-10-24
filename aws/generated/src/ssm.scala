package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object ssm:
  /** Registers an on-premises server or virtual machine with Amazon EC2 so that it can be managed using Run Command. */
  inline def Activation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ActivationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ActivationArgs.builder
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
    com.pulumi.aws.ssm.Activation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Associates an SSM Document to an instance or EC2 tag. */
  inline def Association(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.AssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.AssociationArgs.builder
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
    com.pulumi.aws.ssm.Association(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Terraform resource for managing a Contacts Rotation in AWS Systems Manager Incident Manager.
   * 
   * &gt; **NOTE:** A rotation implicitly depends on a replication set. If you configured your replication set in Terraform, we recommend you add it to the `dependsOn` argument for the Terraform Contact Resource.
   */
  inline def ContactsRotation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ContactsRotationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ContactsRotationArgs.builder
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
    com.pulumi.aws.ssm.ContactsRotation(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for registering an AWS Systems Manager Default Patch Baseline. */
  inline def DefaultPatchBaseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.DefaultPatchBaselineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssm.DefaultPatchBaselineArgs.builder
    com.pulumi.aws.ssm.DefaultPatchBaseline(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an SSM Document resource
   * 
   * &gt; **NOTE on updating SSM documents:** Only documents with a schema version of 2.0
   * or greater can update their content once created, see [SSM Schema Features](http://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-ssm-docs.html#document-schemas-features). To update a document with an older schema version you must recreate the resource. Not all document types support a schema version of 2.0 or greater. Refer to [SSM document schema features and examples](https://docs.aws.amazon.com/systems-manager/latest/userguide/document-schemas-features.html) for information about which schema versions are supported for the respective `documentType`.
   */
  inline def Document(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.DocumentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.DocumentArgs.builder
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
    com.pulumi.aws.ssm.Document(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an SSM Maintenance Window resource */
  inline def MaintenanceWindow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.MaintenanceWindowArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.MaintenanceWindowArgs.builder
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
    com.pulumi.aws.ssm.MaintenanceWindow(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an SSM Maintenance Window Target resource */
  inline def MaintenanceWindowTarget(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.MaintenanceWindowTargetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.ssm.MaintenanceWindowTarget(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an SSM Maintenance Window Task resource */
  inline def MaintenanceWindowTask(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.MaintenanceWindowTaskArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.ssm.MaintenanceWindowTask(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an SSM Parameter resource.
   * 
   * &gt; **Note:** The `overwrite` argument makes it possible to overwrite an existing SSM Parameter created outside of IAC.
   */
  inline def Parameter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ParameterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ParameterArgs.builder
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
    com.pulumi.aws.ssm.Parameter(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides an SSM Patch Baseline resource.
   * 
   * &gt; **NOTE on Patch Baselines:** The `approvedPatches` and `approvalRule` are
   * both marked as optional fields, but the Patch Baseline requires that at least one
   * of them is specified.
   */
  inline def PatchBaseline(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.PatchBaselineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.PatchBaselineArgs.builder
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
    com.pulumi.aws.ssm.PatchBaseline(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides an SSM Patch Group resource */
  inline def PatchGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.PatchGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssm.PatchGroupArgs.builder
    com.pulumi.aws.ssm.PatchGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS SSM Quick Setup Configuration Manager. */
  inline def QuicksetupConfigurationManager(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.QuicksetupConfigurationManagerArgs.builder
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
    com.pulumi.aws.ssm.QuicksetupConfigurationManager(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a SSM resource data sync. */
  inline def ResourceDataSync(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ResourceDataSyncArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssm.ResourceDataSyncArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.ssm.ResourceDataSync(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** This setting defines how a user interacts with or uses a service or a feature of a service. */
  inline def ServiceSetting(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssm.ServiceSettingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.ssm.ServiceSettingArgs.builder
    com.pulumi.aws.ssm.ServiceSetting(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SsmFunctions:
    /** Provides a Terraform data source for managing a Contacts Rotation in AWS Systems Manager Incident Manager */
    inline def getContactsRotation(args: Endofunction[com.pulumi.aws.ssm.inputs.GetContactsRotationArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetContactsRotationResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetContactsRotationArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getContactsRotation(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides a Terraform data source for managing a Contacts Rotation in AWS Systems Manager Incident Manager */
    inline def getContactsRotationPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetContactsRotationPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetContactsRotationResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetContactsRotationPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getContactsRotationPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Gets the contents of the specified Systems Manager document. */
    inline def getDocument(args: Endofunction[com.pulumi.aws.ssm.inputs.GetDocumentArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetDocumentArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getDocument(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Gets the contents of the specified Systems Manager document. */
    inline def getDocumentPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetDocumentPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetDocumentResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetDocumentPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getDocumentPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get the instance IDs of SSM managed instances. */
    inline def getInstances(args: Endofunction[com.pulumi.aws.ssm.inputs.GetInstancesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetInstancesArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getInstances(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get the instance IDs of SSM managed instances. */
    inline def getInstancesPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetInstancesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetInstancesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetInstancesPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getInstancesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get the window IDs of SSM maintenance windows. */
    inline def getMaintenanceWindows(args: Endofunction[com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetMaintenanceWindowsResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getMaintenanceWindows(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get the window IDs of SSM maintenance windows. */
    inline def getMaintenanceWindowsPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetMaintenanceWindowsResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetMaintenanceWindowsPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getMaintenanceWindowsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides an SSM Parameter data source. */
    inline def getParameter(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParameterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetParameterResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParameterArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParameter(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides an SSM Parameter data source. */
    inline def getParameterPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParameterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetParameterResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParameterPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParameterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to get information about one or more System Manager parameters in a specific hierarchy. */
    inline def getParametersByPath(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParametersByPathArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetParametersByPathResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParametersByPathArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParametersByPath(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to get information about one or more System Manager parameters in a specific hierarchy. */
    inline def getParametersByPathPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetParametersByPathPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetParametersByPathResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetParametersByPathPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getParametersByPathPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided. */
    inline def getPatchBaseline(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselineArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetPatchBaselineResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselineArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaseline(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides an SSM Patch Baseline data source. Useful if you wish to reuse the default baselines provided. */
    inline def getPatchBaselinePlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetPatchBaselineResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinePlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaselinePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for retrieving AWS SSM (Systems Manager) Patch Baselines. */
    inline def getPatchBaselines(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssm.outputs.GetPatchBaselinesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinesArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaselines(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for retrieving AWS SSM (Systems Manager) Patch Baselines. */
    inline def getPatchBaselinesPlain(args: Endofunction[com.pulumi.aws.ssm.inputs.GetPatchBaselinesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssm.outputs.GetPatchBaselinesResult] =
      val argsBuilder = com.pulumi.aws.ssm.inputs.GetPatchBaselinesPlainArgs.builder
      com.pulumi.aws.ssm.SsmFunctions.getPatchBaselinesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
