package jp.ukiba.ko_pulumi
package azure

object managedredis_ext:
  extension (builder: com.pulumi.azure.managedredis.ManagedRedisArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.managedredis.ManagedRedisArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param defaultDatabase A `defaultDatabase` block as defined below.
     * 
     * &gt; **Note:** `defaultDatabase` is Required when creating a new Managed Redis.
     * 
     * &gt; **Note:** A `defaultDatabase` can be deleted or recreated in-place but most properties will trigger an entire cluster replacement if changed. Data will be lost and Managed Redis will be unavailable during recreation.
     * @return builder
     */
    def defaultDatabase(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder]):
        com.pulumi.azure.managedredis.ManagedRedisArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.builder
      builder.defaultDatabase(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.Builder]):
        com.pulumi.azure.managedredis.ManagedRedisArgs.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder)
    /**
     * @param modules A `module` block as defined below. Refer to [the modules documentation](https://learn.microsoft.com/azure/redis/redis-modules) to learn more.
     * @return builder
     */
    def modules(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseModuleArgs.Builder]*):
        com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder =
      def argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseModuleArgs.builder
      builder.modules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param defaultDatabase A `defaultDatabase` block as defined below.
     * 
     * &gt; **Note:** `defaultDatabase` is Required when creating a new Managed Redis.
     * 
     * &gt; **Note:** A `defaultDatabase` can be deleted or recreated in-place but most properties will trigger an entire cluster replacement if changed. Data will be lost and Managed Redis will be unavailable during recreation.
     * @return builder
     */
    def defaultDatabase(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.Builder]):
        com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisDefaultDatabaseArgs.builder
      builder.defaultDatabase(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.Builder]):
        com.pulumi.azure.managedredis.inputs.ManagedRedisState.Builder =
      val argsBuilder = com.pulumi.azure.managedredis.inputs.ManagedRedisIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
