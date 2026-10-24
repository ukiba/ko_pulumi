package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object backup:
  object BackupFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing File Share Backup Policy. */
    inline def getPolicyFileshare(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyFileshareArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.backup.outputs.GetPolicyFileshareResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyFileshareArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyFileshare(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing File Share Backup Policy. */
    inline def getPolicyFilesharePlain(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyFilesharePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.backup.outputs.GetPolicyFileshareResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyFilesharePlainArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyFilesharePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access information about an existing VM Backup Policy. */
    inline def getPolicyVM(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyVMArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.backup.outputs.GetPolicyVMResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyVMArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyVM(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing VM Backup Policy. */
    inline def getPolicyVMPlain(args: Endofunction[com.pulumi.azure.backup.inputs.GetPolicyVMPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.backup.outputs.GetPolicyVMResult] =
      val argsBuilder = com.pulumi.azure.backup.inputs.GetPolicyVMPlainArgs.builder
      com.pulumi.azure.backup.BackupFunctions.getPolicyVMPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Manages registration of a storage account with Azure Backup. Storage accounts must be registered with an Azure Recovery Vault in order to backup file shares within the storage account. Registering a storage account with a vault creates what is known as a protection container within Azure Recovery Services. Once the container is created, Azure file shares within the storage account can be backed up using the `azure.backup.ProtectedFileShare` resource. */
  def ContainerStorageAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.backup.ContainerStorageAccountArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.backup.ContainerStorageAccountArgs.builder
    com.pulumi.azure.backup.ContainerStorageAccount(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure File Share Backup Policy within a Recovery Services vault. */
  def PolicyFileShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.backup.PolicyFileShareArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.backup.PolicyFileShareArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.backup.PolicyFileShare(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Backup VM Backup Policy. */
  def PolicyVM(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.backup.PolicyVMArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.backup.PolicyVMArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.backup.PolicyVM(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure VM Workload Backup Policy within a Recovery Services vault. */
  def PolicyVMWorkload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.backup.PolicyVMWorkloadArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.backup.PolicyVMWorkloadArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.backup.PolicyVMWorkload(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Backup Protected File Share to enable backups for file shares within an Azure Storage Account */
  def ProtectedFileShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.backup.ProtectedFileShareArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.backup.ProtectedFileShareArgs.builder
    com.pulumi.azure.backup.ProtectedFileShare(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages an Azure Backup Protected Virtual Machine. */
  def ProtectedVM(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.backup.ProtectedVMArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.backup.ProtectedVMArgs.builder
    com.pulumi.azure.backup.ProtectedVM(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
