package jp.ukiba.ko_pulumi
package azure

object mongocluster_ext:
  extension (builder: com.pulumi.azure.mongocluster.MongoClusterArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mongocluster.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * 
     * &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.mongocluster.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    inline def restore(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.mongocluster.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mongocluster.UserArgs.Builder)
    /**
     * @param roles One or more `role` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def roles(args: Endofunction[com.pulumi.azure.mongocluster.inputs.UserRoleArgs.Builder]*):
        com.pulumi.azure.mongocluster.UserArgs.Builder =
      def argsBuilder = com.pulumi.azure.mongocluster.inputs.UserRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder)
    /**
     * @param connectionStrings One or more `connectionStrings` blocks as defined below.
     * @return builder
     */
    inline def connectionStrings(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterConnectionStringArgs.Builder]*):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      def argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def customerManagedKey(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * 
     * &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    inline def restore(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mongocluster.inputs.UserState.Builder)
    /**
     * @param roles One or more `role` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def roles(args: Endofunction[com.pulumi.azure.mongocluster.inputs.UserRoleArgs.Builder]*):
        com.pulumi.azure.mongocluster.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.azure.mongocluster.inputs.UserRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)
