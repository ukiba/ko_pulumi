package jp.ukiba.ko_pulumi
package gcp

object datafusion_ext:
  extension (builder: com.pulumi.gcp.datafusion.InstanceArgs.Builder)
    /**
     * @param accelerators List of accelerators enabled for this CDF instance.
     * If accelerators are enabled it is possible a permadiff will be created with the Options field.
     * Users will need to either manually update their state file to include these diffed options, or include the field in a lifecycle ignore changes block.
     * Structure is documented below.
     * @return builder
     */
    inline def accelerators(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.Builder]*):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     * Structure is documented below.
     * @return builder
     */
    inline def cryptoKeyConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.builder
      builder.cryptoKeyConfig(args(argsBuilder).build)

    /**
     * @param eventPublishConfig Option to enable and pass metadata for event publishing.
     * Structure is documented below.
     * @return builder
     */
    inline def eventPublishConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.builder
      builder.eventPublishConfig(args(argsBuilder).build)

    /**
     * @param maintenancePolicy Configure the maintenance policy for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyArgs.Builder)
    /**
     * @param maintenanceWindow The maintenance window of the instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowArgs.Builder)
    /**
     * @param recurringTimeWindow The recurring time window of the maintenance window.
     * Structure is documented below.
     * @return builder
     */
    inline def recurringTimeWindow(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowRecurringTimeWindowArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowRecurringTimeWindowArgs.builder
      builder.recurringTimeWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowRecurringTimeWindowArgs.Builder)
    /**
     * @param window The window representing the start and end time of recurrences. This field ignores the date components of the provided timestamps. Only the time of day and duration between start and end time are relevant.
     * Structure is documented below.
     * @return builder
     */
    inline def window(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowRecurringTimeWindowWindowArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowRecurringTimeWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyMaintenanceWindowRecurringTimeWindowWindowArgs.builder
      builder.window(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder)
    /**
     * @param privateServiceConnectConfig Optional. Configuration for Private Service Connect.
     * This is required only when using connection type PRIVATE_SERVICE_CONNECT_INTERFACES.
     * Structure is documented below.
     * @return builder
     */
    inline def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datafusion.inputs.InstanceState.Builder)
    /**
     * @param accelerators List of accelerators enabled for this CDF instance.
     * If accelerators are enabled it is possible a permadiff will be created with the Options field.
     * Users will need to either manually update their state file to include these diffed options, or include the field in a lifecycle ignore changes block.
     * Structure is documented below.
     * @return builder
     */
    inline def accelerators(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.Builder]*):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceAcceleratorArgs.builder
      builder.accelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param cryptoKeyConfig The crypto key configuration. This field is used by the Customer-Managed Encryption Keys (CMEK) feature.
     * Structure is documented below.
     * @return builder
     */
    inline def cryptoKeyConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceCryptoKeyConfigArgs.builder
      builder.cryptoKeyConfig(args(argsBuilder).build)

    /**
     * @param eventPublishConfig Option to enable and pass metadata for event publishing.
     * Structure is documented below.
     * @return builder
     */
    inline def eventPublishConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceEventPublishConfigArgs.builder
      builder.eventPublishConfig(args(argsBuilder).build)

    /**
     * @param maintenanceEvents The maintenance events for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenanceEvents(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceMaintenanceEventArgs.Builder]*):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceMaintenanceEventArgs.builder
      builder.maintenanceEvents(args.map(_(argsBuilder).build)*)

    /**
     * @param maintenancePolicy Configure the maintenance policy for this instance.
     * Structure is documented below.
     * @return builder
     */
    inline def maintenancePolicy(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param networkConfig Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * @return builder
     */
    inline def networkConfig(args: Endofunction[com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.Builder]):
        com.pulumi.gcp.datafusion.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)
