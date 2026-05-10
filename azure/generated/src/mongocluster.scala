package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object mongocluster:
  /** Manages a Mongo Cluster Firewall Rule. */
  def FirewallRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mongocluster.FirewallRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mongocluster.FirewallRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.mongocluster.FirewallRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a MongoDB Cluster using vCore Architecture. */
  def MongoCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mongocluster.MongoClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.mongocluster.MongoClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.mongocluster.MongoCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mongocluster.UserArgs.Builder)
    /**
     * @param roles One or more `role` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.mongocluster.inputs.UserRoleArgs.Builder]*):
        com.pulumi.azure.mongocluster.UserArgs.Builder =
      def argsBuilder = com.pulumi.azure.mongocluster.inputs.UserRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mongocluster.MongoClusterArgs.Builder)
    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mongocluster.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * 
     *  &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.mongocluster.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.mongocluster.MongoClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mongocluster.MongoClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Mongo Cluster User. */
  def User(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.mongocluster.UserArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.mongocluster.UserArgs.builder
    com.pulumi.azure.mongocluster.User(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.mongocluster.inputs.UserState.Builder)
    /**
     * @param roles One or more `role` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.mongocluster.inputs.UserRoleArgs.Builder]*):
        com.pulumi.azure.mongocluster.inputs.UserState.Builder =
      def argsBuilder = com.pulumi.azure.mongocluster.inputs.UserRoleArgs.builder
      builder.roles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder)
    /**
     * @param connectionStrings One or more `connectionStrings` blocks as defined below.
     * @return builder
     */
    def connectionStrings(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterConnectionStringArgs.Builder]*):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      def argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterConnectionStringArgs.builder
      builder.connectionStrings(args.map(_(argsBuilder).build)*)

    /**
     * @param customerManagedKey A `customerManagedKey` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def customerManagedKey(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.Builder]):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterCustomerManagedKeyArgs.builder
      builder.customerManagedKey(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as detailed below.
     * 
     *  &gt; **Note:** When adding or removing `identity`, a resource recreation will be triggered.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.Builder]):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param restore A `restore` block as defined below. Required when `createMode` is set to `PointInTimeRestore`. Changing this forces a new resource to be created.
     * 
     *  &gt; **Note:** When `PointInTimeRestore` is enabled, service API will also assign a value to `sourceServerId`. The user has to explicitly set this property in the Terraform configuration or handle it using `ignoreChanges`.
     * @return builder
     */
    def restore(args: Endofunction[com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.Builder]):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      val argsBuilder = com.pulumi.azure.mongocluster.inputs.MongoClusterRestoreArgs.builder
      builder.restore(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.mongocluster.inputs.MongoClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
