package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object devtest:
  object DevtestFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Dev Test Lab. */
    inline def getLab(args: Endofunction[com.pulumi.azure.devtest.inputs.GetLabArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devtest.outputs.GetLabResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetLabArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getLab(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Test Lab. */
    inline def getLabPlain(args: Endofunction[com.pulumi.azure.devtest.inputs.GetLabPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devtest.outputs.GetLabResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetLabPlainArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getLabPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Test Lab Virtual Network. */
    inline def getVirtualNetwork(args: Endofunction[com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devtest.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getVirtualNetwork(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Test Lab Virtual Network. */
    inline def getVirtualNetworkPlain(args: Endofunction[com.pulumi.azure.devtest.inputs.GetVirtualNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devtest.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetVirtualNetworkPlainArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getVirtualNetworkPlain(args(argsBuilder).build)

  /**
   * Manages automated shutdown schedules for Azure VMs that are not within an Azure DevTest Lab. While this is part of the DevTest Labs service in Azure,
   * this resource applies only to standard VMs, not DevTest Lab VMs. To manage automated shutdown schedules for DevTest Lab VMs, reference the
   * `azure.devtest.Schedule` resource
   */
  def GlobalVMShutdownSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.devtest.GlobalVMShutdownSchedule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Dev Test Lab. */
  def Lab(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.LabArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.LabArgs.builder
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
    com.pulumi.azure.devtest.Lab(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Linux Virtual Machine within a Dev Test Lab. */
  def LinuxVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.LinuxVirtualMachineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.LinuxVirtualMachineArgs.builder
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
    com.pulumi.azure.devtest.LinuxVirtualMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Policy within a Dev Test Policy Set. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.PolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.PolicyArgs.builder
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
    com.pulumi.azure.devtest.Policy(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages automated startup and shutdown schedules for Azure Dev Test Lab. */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.ScheduleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.ScheduleArgs.builder
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
    com.pulumi.azure.devtest.Schedule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Virtual Network within a DevTest Lab. */
  def VirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.VirtualNetworkArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.VirtualNetworkArgs.builder
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
    com.pulumi.azure.devtest.VirtualNetwork(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Windows Virtual Machine within a Dev Test Lab. */
  def WindowsVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.WindowsVirtualMachineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.WindowsVirtualMachineArgs.builder
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
    com.pulumi.azure.devtest.WindowsVirtualMachine(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
