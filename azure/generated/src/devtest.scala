package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object devtest:
  extension (builder: com.pulumi.azure.devtest.ScheduleArgs.Builder)
    /**
     * @param dailyRecurrence The properties of a daily schedule. If the schedule occurs once each day of the week, specify the daily recurrence. A `dailyRecurrence` block as defined below.
     * @return builder
     */
    def dailyRecurrence(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleDailyRecurrenceArgs.Builder]):
        com.pulumi.azure.devtest.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleDailyRecurrenceArgs.builder
      builder.dailyRecurrence(args(argsBuilder).build)

    /**
     * @param hourlyRecurrence The properties of an hourly schedule. If the schedule occurs multiple times a day, specify the hourly recurrence. A `hourlyRecurrence` block as defined below.
     * @return builder
     */
    def hourlyRecurrence(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleHourlyRecurrenceArgs.Builder]):
        com.pulumi.azure.devtest.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleHourlyRecurrenceArgs.builder
      builder.hourlyRecurrence(args(argsBuilder).build)

    /**
     * @param notificationSettings The notification setting of a schedule. A `notificationSettings` block as defined below.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleNotificationSettingsArgs.Builder]):
        com.pulumi.azure.devtest.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

    /**
     * @param weeklyRecurrence The properties of a weekly schedule. If the schedule occurs only some days of the week, specify the weekly recurrence. A `weeklyRecurrence` block as defined below.
     * @return builder
     */
    def weeklyRecurrence(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleWeeklyRecurrenceArgs.Builder]):
        com.pulumi.azure.devtest.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleWeeklyRecurrenceArgs.builder
      builder.weeklyRecurrence(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.ScheduleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devtest.WindowsVirtualMachineArgs.Builder)
    /**
     * @param galleryImageReference A `galleryImageReference` block as defined below.
     * @return builder
     */
    def galleryImageReference(args: Endofunction[com.pulumi.azure.devtest.inputs.WindowsVirtualMachineGalleryImageReferenceArgs.Builder]):
        com.pulumi.azure.devtest.WindowsVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.WindowsVirtualMachineGalleryImageReferenceArgs.builder
      builder.galleryImageReference(args(argsBuilder).build)

    /**
     * @param inboundNatRules One or more `inboundNatRule` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.WindowsVirtualMachineArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.Builder)
    /**
     * @param notificationSettings The notification setting of a schedule. A `notificationSettings` block as defined below.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.Builder]):
        com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages automated startup and shutdown schedules for Azure Dev Test Lab. */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.ScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.ScheduleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devtest.Schedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Windows Virtual Machine within a Dev Test Lab. */
  def WindowsVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.WindowsVirtualMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.WindowsVirtualMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devtest.WindowsVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Virtual Network within a DevTest Lab. */
  def VirtualNetwork(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.VirtualNetworkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.VirtualNetworkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devtest.VirtualNetwork(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devtest.VirtualNetworkArgs.Builder)
    /**
     * @param subnet A `subnet` block as defined below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.Builder]):
        com.pulumi.azure.devtest.VirtualNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.VirtualNetworkArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  type DevtestFunctions = com.pulumi.azure.devtest.DevtestFunctions
  object DevtestFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.devtest.DevtestFunctions.*
  extension (self: DevtestFunctions.type)
    /** Use this data source to access information about an existing Dev Test Lab. */
    def getLab(args: Endofunction[com.pulumi.azure.devtest.inputs.GetLabArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devtest.outputs.GetLabResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetLabArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getLab(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Test Lab. */
    def getLabPlain(args: Endofunction[com.pulumi.azure.devtest.inputs.GetLabPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devtest.outputs.GetLabResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetLabPlainArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getLabPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Test Lab Virtual Network. */
    def getVirtualNetwork(args: Endofunction[com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.devtest.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetVirtualNetworkArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getVirtualNetwork(args(argsBuilder).build)

    /** Use this data source to access information about an existing Dev Test Lab Virtual Network. */
    def getVirtualNetworkPlain(args: Endofunction[com.pulumi.azure.devtest.inputs.GetVirtualNetworkPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.devtest.outputs.GetVirtualNetworkResult] =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GetVirtualNetworkPlainArgs.builder
      com.pulumi.azure.devtest.DevtestFunctions.getVirtualNetworkPlain(args(argsBuilder).build)

  /** Manages a Linux Virtual Machine within a Dev Test Lab. */
  def LinuxVirtualMachine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.LinuxVirtualMachineArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.LinuxVirtualMachineArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devtest.LinuxVirtualMachine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages automated shutdown schedules for Azure VMs that are not within an Azure DevTest Lab. While this is part of the DevTest Labs service in Azure,
   *  this resource applies only to standard VMs, not DevTest Lab VMs. To manage automated shutdown schedules for DevTest Lab VMs, reference the
   *  `azure.devtest.Schedule` resource
   */
  def GlobalVMShutdownSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devtest.GlobalVMShutdownSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devtest.LinuxVirtualMachineArgs.Builder)
    /**
     * @param galleryImageReference A `galleryImageReference` block as defined below.
     * @return builder
     */
    def galleryImageReference(args: Endofunction[com.pulumi.azure.devtest.inputs.LinuxVirtualMachineGalleryImageReferenceArgs.Builder]):
        com.pulumi.azure.devtest.LinuxVirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.LinuxVirtualMachineGalleryImageReferenceArgs.builder
      builder.galleryImageReference(args(argsBuilder).build)

    /**
     * @param inboundNatRules One or more `inboundNatRule` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.LinuxVirtualMachineArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Dev Test Lab. */
  def Lab(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.LabArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.LabArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devtest.Lab(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Policy within a Dev Test Policy Set. */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.devtest.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.devtest.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.devtest.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.Builder)
    /**
     * @param sharedPublicIpAddress A `sharedPublicIpAddress` block as defined below.
     * @return builder
     */
    def sharedPublicIpAddress(args: Endofunction[com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetSharedPublicIpAddressArgs.Builder]):
        com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetSharedPublicIpAddressArgs.builder
      builder.sharedPublicIpAddress(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetSharedPublicIpAddressArgs.Builder)
    /**
     * @param allowedPorts A list of `allowedPorts` blocks as defined below.
     * @return builder
     */
    def allowedPorts(args: Endofunction[com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs.Builder]*):
        com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetSharedPublicIpAddressArgs.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetSharedPublicIpAddressAllowedPortArgs.builder
      builder.allowedPorts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devtest.inputs.ScheduleState.Builder)
    /**
     * @param dailyRecurrence The properties of a daily schedule. If the schedule occurs once each day of the week, specify the daily recurrence. A `dailyRecurrence` block as defined below.
     * @return builder
     */
    def dailyRecurrence(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleDailyRecurrenceArgs.Builder]):
        com.pulumi.azure.devtest.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleDailyRecurrenceArgs.builder
      builder.dailyRecurrence(args(argsBuilder).build)

    /**
     * @param hourlyRecurrence The properties of an hourly schedule. If the schedule occurs multiple times a day, specify the hourly recurrence. A `hourlyRecurrence` block as defined below.
     * @return builder
     */
    def hourlyRecurrence(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleHourlyRecurrenceArgs.Builder]):
        com.pulumi.azure.devtest.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleHourlyRecurrenceArgs.builder
      builder.hourlyRecurrence(args(argsBuilder).build)

    /**
     * @param notificationSettings The notification setting of a schedule. A `notificationSettings` block as defined below.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleNotificationSettingsArgs.Builder]):
        com.pulumi.azure.devtest.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

    /**
     * @param weeklyRecurrence The properties of a weekly schedule. If the schedule occurs only some days of the week, specify the weekly recurrence. A `weeklyRecurrence` block as defined below.
     * @return builder
     */
    def weeklyRecurrence(args: Endofunction[com.pulumi.azure.devtest.inputs.ScheduleWeeklyRecurrenceArgs.Builder]):
        com.pulumi.azure.devtest.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.ScheduleWeeklyRecurrenceArgs.builder
      builder.weeklyRecurrence(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.inputs.ScheduleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devtest.inputs.WindowsVirtualMachineState.Builder)
    /**
     * @param galleryImageReference A `galleryImageReference` block as defined below.
     * @return builder
     */
    def galleryImageReference(args: Endofunction[com.pulumi.azure.devtest.inputs.WindowsVirtualMachineGalleryImageReferenceArgs.Builder]):
        com.pulumi.azure.devtest.inputs.WindowsVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.WindowsVirtualMachineGalleryImageReferenceArgs.builder
      builder.galleryImageReference(args(argsBuilder).build)

    /**
     * @param inboundNatRules One or more `inboundNatRule` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.inputs.WindowsVirtualMachineState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleState.Builder)
    /**
     * @param notificationSettings The notification setting of a schedule. A `notificationSettings` block as defined below.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.Builder]):
        com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devtest.inputs.VirtualNetworkState.Builder)
    /**
     * @param subnet A `subnet` block as defined below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.Builder]):
        com.pulumi.azure.devtest.inputs.VirtualNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.inputs.VirtualNetworkState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.devtest.inputs.LinuxVirtualMachineState.Builder)
    /**
     * @param galleryImageReference A `galleryImageReference` block as defined below.
     * @return builder
     */
    def galleryImageReference(args: Endofunction[com.pulumi.azure.devtest.inputs.LinuxVirtualMachineGalleryImageReferenceArgs.Builder]):
        com.pulumi.azure.devtest.inputs.LinuxVirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.LinuxVirtualMachineGalleryImageReferenceArgs.builder
      builder.galleryImageReference(args(argsBuilder).build)

    /**
     * @param inboundNatRules One or more `inboundNatRule` blocks as defined below. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.devtest.inputs.LinuxVirtualMachineState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
