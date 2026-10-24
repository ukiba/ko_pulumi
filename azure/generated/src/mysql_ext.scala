package jp.ukiba.ko_pulumi
package azure

object mysql_ext:
  extension (builder: com.pulumi.azure.mysql.FlexibleServerArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * 
     * &gt; **Note:** `identity` is required when `customerManagedKey` is specified.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    inline def highAvailability(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    inline def storage(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.Builder]):
        com.pulumi.azure.mysql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * 
     * &gt; **Note:** `identity` is required when `customerManagedKey` is specified.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    inline def highAvailability(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    inline def maintenanceWindow(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    inline def storage(args: Endofunction[com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.Builder]):
        com.pulumi.azure.mysql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.mysql.inputs.FlexibleServerStorageArgs.builder
      builder.storage(args(argsBuilder).build)
