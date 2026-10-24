package jp.ukiba.ko_pulumi
package azure

object devtest_ext:
  extension (builder: com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.Builder)
    /**
     * @param notificationSettings The notification setting of a schedule. A `notificationSettings` block as defined below.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.Builder]):
        com.pulumi.azure.devtest.GlobalVMShutdownScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

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
     * &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.LinuxVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.azure.devtest.VirtualNetworkArgs.Builder)
    /**
     * @param subnet A `subnet` block as defined below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.Builder]):
        com.pulumi.azure.devtest.VirtualNetworkArgs.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

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
     * &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.WindowsVirtualMachineArgs.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleState.Builder)
    /**
     * @param notificationSettings The notification setting of a schedule. A `notificationSettings` block as defined below.
     * @return builder
     */
    def notificationSettings(args: Endofunction[com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.Builder]):
        com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.GlobalVMShutdownScheduleNotificationSettingsArgs.builder
      builder.notificationSettings(args(argsBuilder).build)

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
     * &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.inputs.LinuxVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.LinuxVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)

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

  extension (builder: com.pulumi.azure.devtest.inputs.VirtualNetworkState.Builder)
    /**
     * @param subnet A `subnet` block as defined below.
     * @return builder
     */
    def subnet(args: Endofunction[com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.Builder]):
        com.pulumi.azure.devtest.inputs.VirtualNetworkState.Builder =
      val argsBuilder = com.pulumi.azure.devtest.inputs.VirtualNetworkSubnetArgs.builder
      builder.subnet(args(argsBuilder).build)

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
     * &gt; **Note:** If any `inboundNatRule` blocks are specified then `disallowPublicIpAddress` must be set to `true`.
     * @return builder
     */
    def inboundNatRules(args: Endofunction[com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.Builder]*):
        com.pulumi.azure.devtest.inputs.WindowsVirtualMachineState.Builder =
      def argsBuilder = com.pulumi.azure.devtest.inputs.WindowsVirtualMachineInboundNatRuleArgs.builder
      builder.inboundNatRules(args.map(_(argsBuilder).build)*)
