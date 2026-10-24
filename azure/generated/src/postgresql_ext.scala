package jp.ukiba.ko_pulumi
package azure

object postgresql_ext:
  extension (builder: com.pulumi.azure.postgresql.FlexibleServerArgs.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cluster A `cluster` block as defined below.
     * @return builder
     */
    def cluster(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.builder
      builder.cluster(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    def highAvailability(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.postgresql.FlexibleServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.postgresql.ServerArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.postgresql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder)
    /**
     * @param authentication An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param cluster A `cluster` block as defined below.
     * @return builder
     */
    def cluster(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerClusterArgs.builder
      builder.cluster(args(argsBuilder).build)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param highAvailability A `highAvailability` block as defined below.
     * @return builder
     */
    def highAvailability(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerHighAvailabilityArgs.builder
      builder.highAvailability(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param maintenanceWindow A `maintenanceWindow` block as defined below.
     * @return builder
     */
    def maintenanceWindow(args: Endofunction[com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.FlexibleServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.FlexibleServerMaintenanceWindowArgs.builder
      builder.maintenanceWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.postgresql.inputs.ServerState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration, known in the API as Server Security Alerts Policy. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.postgresql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.postgresql.inputs.ServerThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)
