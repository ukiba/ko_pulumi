package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object appconfiguration:
  /**
   * Manages an Azure App Configuration.
   * 
   *  ## Disclaimers
   * 
   *  &gt; **Note:** Version 3.27.0 and later of the Azure Provider include a Feature Toggle which will purge an App Configuration resource on destroy, rather than the default soft-delete. The Provider will automatically recover a soft-deleted App Configuration during creation if one is found. See the Features block documentation for more information on Feature Toggles within Terraform.
   * 
   *  &gt; **Note:** Reading and purging soft-deleted App Configurations requires the `Microsoft.AppConfiguration/locations/deletedConfigurationStores/read` and `Microsoft.AppConfiguration/locations/deletedConfigurationStores/purge/action` permission on Subscription scope. Recovering a soft-deleted App Configuration requires the `Microsoft.AppConfiguration/configurationStores/write` permission on Subscription or Resource Group scope. [More information can be found in the Azure Documentation for App Configuration](https://learn.microsoft.com/en-us/azure/azure-app-configuration/concept-soft-delete#permissions-to-recover-a-deleted-store). See the following links for more information on assigning [Azure custom roles](https://learn.microsoft.com/en-us/azure/role-based-access-control/custom-roles) or using the `azure.authorization.Assignment` resource to assign a custom role.
   */
  def ConfigurationStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appconfiguration.ConfigurationStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder)
    /**
     * @param customFilters A `customFilter` block as defined below.
     * @return builder
     */
    def customFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.builder
      builder.customFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param targetingFilters A `targetingFilter` block as defined below.
     * @return builder
     */
    def targetingFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.builder
      builder.targetingFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param timewindowFilters A `timewindowFilter` block as defined below.
     * @return builder
     */
    def timewindowFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.builder
      builder.timewindowFilters(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.Builder]):
        com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.Builder]):
        com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param replicas One or more `replica` blocks as defined below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.Builder]*):
        com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.appconfiguration.ConfigurationStoreArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages an Azure App Configuration Feature.
   * 
   *  &gt; **Note:** App Configuration Features are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration). This is similar to providing App Configuration Keys.
   */
  def ConfigurationFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appconfiguration.ConfigurationFeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appconfiguration.ConfigurationFeature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Application Gateway for Containers Frontend. */
  def LicationLoadBalancerFrontend(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appconfiguration.LicationLoadBalancerFrontendArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appconfiguration.LicationLoadBalancerFrontendArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appconfiguration.LicationLoadBalancerFrontend(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Application Gateway for Containers (ALB). */
  def LicationLoadBalancer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appconfiguration.LicationLoadBalancerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appconfiguration.LicationLoadBalancerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appconfiguration.LicationLoadBalancer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Application Load Balancer Security Policy. */
  def LicationLoadBalancerSecurityPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appconfiguration.LicationLoadBalancerSecurityPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appconfiguration.LicationLoadBalancerSecurityPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appconfiguration.LicationLoadBalancerSecurityPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Azure App Configuration Key.
   * 
   *  &gt; **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
   */
  def ConfigurationKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appconfiguration.ConfigurationKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appconfiguration.ConfigurationKeyArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appconfiguration.ConfigurationKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an association between an Application Gateway for Containers and a Subnet. */
  def LicationLoadBalancerSubnetAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appconfiguration.LicationLoadBalancerSubnetAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appconfiguration.LicationLoadBalancerSubnetAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appconfiguration.LicationLoadBalancerSubnetAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object AppconfigurationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to access information about an existing Azure App Configuration Key.
     * 
     *  &gt; **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
     */
    inline def getConfigurationKey(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appconfiguration.outputs.GetConfigurationKeyResult] =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeyArgs.builder
      com.pulumi.azure.appconfiguration.AppconfigurationFunctions.getConfigurationKey(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Azure App Configuration Key.
     * 
     *  &gt; **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
     */
    inline def getConfigurationKeyPlain(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appconfiguration.outputs.GetConfigurationKeyResult] =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeyPlainArgs.builder
      com.pulumi.azure.appconfiguration.AppconfigurationFunctions.getConfigurationKeyPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about existing Azure App Configuration Keys.
     * 
     *  &gt; **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
     */
    inline def getConfigurationKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appconfiguration.outputs.GetConfigurationKeysResult] =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeysArgs.builder
      com.pulumi.azure.appconfiguration.AppconfigurationFunctions.getConfigurationKeys(args(argsBuilder).build)

    /**
     * Use this data source to access information about existing Azure App Configuration Keys.
     * 
     *  &gt; **Note:** App Configuration Keys are provisioned using a Data Plane API which requires the role `App Configuration Data Owner` on either the App Configuration or a parent scope (such as the Resource Group/Subscription). [More information can be found in the Azure Documentation for App Configuration](https://docs.microsoft.com/azure/azure-app-configuration/concept-enable-rbac#azure-built-in-roles-for-azure-app-configuration).
     */
    inline def getConfigurationKeysPlain(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appconfiguration.outputs.GetConfigurationKeysResult] =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.GetConfigurationKeysPlainArgs.builder
      com.pulumi.azure.appconfiguration.AppconfigurationFunctions.getConfigurationKeysPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing App Configuration. */
    inline def getConfigurationStore(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.GetConfigurationStoreArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appconfiguration.outputs.GetConfigurationStoreResult] =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.GetConfigurationStoreArgs.builder
      com.pulumi.azure.appconfiguration.AppconfigurationFunctions.getConfigurationStore(args(argsBuilder).build)

    /** Use this data source to access information about an existing App Configuration. */
    inline def getConfigurationStorePlain(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.GetConfigurationStorePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appconfiguration.outputs.GetConfigurationStoreResult] =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.GetConfigurationStorePlainArgs.builder
      com.pulumi.azure.appconfiguration.AppconfigurationFunctions.getConfigurationStorePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder)
    /**
     * @param groups One or more `groups` blocks as defined below.
     * @return builder
     */
    def groups(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterGroupArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterGroupArgs.builder
      builder.groups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder)
    /**
     * @param customFilters A `customFilter` block as defined below.
     * @return builder
     */
    def customFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureCustomFilterArgs.builder
      builder.customFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param targetingFilters A `targetingFilter` block as defined below.
     * @return builder
     */
    def targetingFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs.builder
      builder.targetingFilters(args.map(_(argsBuilder).build)*)

    /**
     * @param timewindowFilters A `timewindowFilter` block as defined below.
     * @return builder
     */
    def timewindowFilters(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs.builder
      builder.timewindowFilters(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder)
    /**
     * @param encryption An `encryption` block as defined below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.Builder]):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.Builder]):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      val argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param primaryReadKeys A `primaryReadKey` block as defined below containing the primary read access key.
     * @return builder
     */
    def primaryReadKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryReadKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryReadKeyArgs.builder
      builder.primaryReadKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryWriteKeys A `primaryWriteKey` block as defined below containing the primary write access key.
     * @return builder
     */
    def primaryWriteKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryWriteKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStorePrimaryWriteKeyArgs.builder
      builder.primaryWriteKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param replicas One or more `replica` blocks as defined below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

    /**
     * @param secondaryReadKeys A `secondaryReadKey` block as defined below containing the secondary read access key.
     * @return builder
     */
    def secondaryReadKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryReadKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryReadKeyArgs.builder
      builder.secondaryReadKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param secondaryWriteKeys A `secondaryWriteKey` block as defined below containing the secondary write access key.
     * @return builder
     */
    def secondaryWriteKeys(args: Endofunction[com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryWriteKeyArgs.Builder]*):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      def argsBuilder = com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreSecondaryWriteKeyArgs.builder
      builder.secondaryWriteKeys(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.appconfiguration.inputs.ConfigurationStoreState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
