package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object hdinsight:
  extension (builder: com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * 
     *  &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param restProxy A `restProxy` block as defined below.
     * @return builder
     */
    def restProxy(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRestProxyArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRestProxyArgs.builder
      builder.restProxy(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a HDInsight HBase Cluster. */
  def HBaseCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hdinsight.HBaseClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hdinsight.HBaseClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.hdinsight.HBaseCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.hdinsight.SparkClusterArgs.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.SparkClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a HDInsight Spark Cluster. */
  def SparkCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hdinsight.SparkClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hdinsight.SparkClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.hdinsight.SparkCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type HdinsightFunctions = com.pulumi.azure.hdinsight.HdinsightFunctions
  object HdinsightFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.hdinsight.HdinsightFunctions.*
  extension (self: HdinsightFunctions.type)
    /** Use this data source to access information about an existing HDInsight Cluster. */
    def getCluster(args: Endofunction[com.pulumi.azure.hdinsight.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.hdinsight.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.GetClusterArgs.builder
      com.pulumi.azure.hdinsight.HdinsightFunctions.getCluster(args(argsBuilder).build)

    /** Use this data source to access information about an existing HDInsight Cluster. */
    def getClusterPlain(args: Endofunction[com.pulumi.azure.hdinsight.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.hdinsight.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.GetClusterPlainArgs.builder
      com.pulumi.azure.hdinsight.HdinsightFunctions.getClusterPlain(args(argsBuilder).build)

  /** Manages a HDInsight Kafka Cluster. */
  def KafkaCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hdinsight.KafkaClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hdinsight.KafkaClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.hdinsight.KafkaCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a HDInsight Interactive Query Cluster. */
  def InteractiveQueryCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.hdinsight.InteractiveQueryCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions A `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.InteractiveQueryClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a HDInsight Hadoop Cluster. */
  def HadoopCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.hdinsight.HadoopClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.hdinsight.HadoopClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.hdinsight.HadoopCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.Builder)
    /**
     * @param ambari An `ambari` block as defined below.
     * @return builder
     */
    def ambari(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresAmbariArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresAmbariArgs.builder
      builder.ambari(args(argsBuilder).build)

    /**
     * @param hive A `hive` block as defined below.
     * @return builder
     */
    def hive(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresHiveArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresHiveArgs.builder
      builder.hive(args(argsBuilder).build)

    /**
     * @param oozie An `oozie` block as defined below.
     * @return builder
     */
    def oozie(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresOozieArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresOozieArgs.builder
      builder.oozie(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.Builder)
    /**
     * @param ambari An `ambari` block as defined below.
     * @return builder
     */
    def ambari(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresAmbariArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresAmbariArgs.builder
      builder.ambari(args(argsBuilder).build)

    /**
     * @param hive A `hive` block as defined below.
     * @return builder
     */
    def hive(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresHiveArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresHiveArgs.builder
      builder.hive(args(argsBuilder).build)

    /**
     * @param oozie An `oozie` block as defined below.
     * @return builder
     */
    def oozie(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresOozieArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresOozieArgs.builder
      builder.oozie(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeArgs.Builder)
    /**
     * @param autoscale A `autoscale` block as defined below.
     * @return builder
     */
    def autoscale(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleArgs.builder
      builder.autoscale(args(argsBuilder).build)

    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesZookeeperNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesZookeeperNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesZookeeperNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesZookeeperNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.Builder)
    /**
     * @param ambari An `ambari` block as defined below.
     * @return builder
     */
    def ambari(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresAmbariArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresAmbariArgs.builder
      builder.ambari(args(argsBuilder).build)

    /**
     * @param hive A `hive` block as defined below.
     * @return builder
     */
    def hive(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresHiveArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresHiveArgs.builder
      builder.hive(args(argsBuilder).build)

    /**
     * @param oozie An `oozie` block as defined below.
     * @return builder
     */
    def oozie(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresOozieArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresOozieArgs.builder
      builder.oozie(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder)
    /**
     * @param schedules A list of `schedule` blocks as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesZookeeperNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesZookeeperNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesZookeeperNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesZookeeperNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesWorkerNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesWorkerNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesWorkerNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesWorkerNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.Builder)
    /**
     * @param headNode A `headNode` block as defined above.
     * @return builder
     */
    def headNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesHeadNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesHeadNodeArgs.builder
      builder.headNode(args(argsBuilder).build)

    /**
     * @param workerNode A `workerNode` block as defined below.
     * @return builder
     */
    def workerNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeArgs.builder
      builder.workerNode(args(argsBuilder).build)

    /**
     * @param zookeeperNode A `zookeeperNode` block as defined below.
     * @return builder
     */
    def zookeeperNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesZookeeperNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesZookeeperNodeArgs.builder
      builder.zookeeperNode(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeArgs.Builder)
    /**
     * @param autoscale A `autoscale` block as defined below.
     * @return builder
     */
    def autoscale(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleArgs.builder
      builder.autoscale(args(argsBuilder).build)

    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.Builder)
    /**
     * @param ambari An `ambari` block as defined below.
     * @return builder
     */
    def ambari(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresAmbariArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresAmbariArgs.builder
      builder.ambari(args(argsBuilder).build)

    /**
     * @param hive A `hive` block as defined below.
     * @return builder
     */
    def hive(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresHiveArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresHiveArgs.builder
      builder.hive(args(argsBuilder).build)

    /**
     * @param oozie An `oozie` block as defined below.
     * @return builder
     */
    def oozie(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresOozieArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresOozieArgs.builder
      builder.oozie(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterRolesHeadNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesHeadNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesHeadNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesHeadNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesZookeeperNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesZookeeperNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesZookeeperNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesZookeeperNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder)
    /**
     * @param schedules A list of `schedule` blocks as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesZookeeperNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesZookeeperNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesZookeeperNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesZookeeperNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeArgs.Builder)
    /**
     * @param autoscale A `autoscale` block as defined below.
     * @return builder
     */
    def autoscale(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleArgs.builder
      builder.autoscale(args(argsBuilder).build)

    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.Builder)
    /**
     * @param headNode A `headNode` block as defined above.
     * @return builder
     */
    def headNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesHeadNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesHeadNodeArgs.builder
      builder.headNode(args(argsBuilder).build)

    /**
     * @param workerNode A `workerNode` block as defined below.
     * @return builder
     */
    def workerNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeArgs.builder
      builder.workerNode(args(argsBuilder).build)

    /**
     * @param zookeeperNode A `zookeeperNode` block as defined below.
     * @return builder
     */
    def zookeeperNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesZookeeperNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesZookeeperNodeArgs.builder
      builder.zookeeperNode(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.Builder)
    /**
     * @param headNode A `headNode` block as defined above.
     * @return builder
     */
    def headNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesHeadNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesHeadNodeArgs.builder
      builder.headNode(args(argsBuilder).build)

    /**
     * @param kafkaManagementNode A `kafkaManagementNode` block as defined below.
     * 
     *  &gt; **Note:** This property has been deprecated and will be removed in version 4.0.
     * @return builder
     */
    def kafkaManagementNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesKafkaManagementNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesKafkaManagementNodeArgs.builder
      builder.kafkaManagementNode(args(argsBuilder).build)

    /**
     * @param workerNode A `workerNode` block as defined below.
     * @return builder
     */
    def workerNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesWorkerNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesWorkerNodeArgs.builder
      builder.workerNode(args(argsBuilder).build)

    /**
     * @param zookeeperNode A `zookeeperNode` block as defined below.
     * @return builder
     */
    def zookeeperNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesZookeeperNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesZookeeperNodeArgs.builder
      builder.zookeeperNode(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationArgs.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationIpConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationArgs.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationIpConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterPrivateLinkConfigurationIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions A `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleArgs.Builder)
    /**
     * @param capacity A `capacity` block as defined below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleCapacityArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param recurrence A `recurrence` block as defined below.
     * 
     *  &gt; **Note:** Either a `capacity` or `recurrence` block must be specified - but not both.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesWorkerNodeAutoscaleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationArgs.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationIpConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterPrivateLinkConfigurationIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder)
    /**
     * @param schedules A list of `schedule` blocks as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleArgs.Builder)
    /**
     * @param capacity A `capacity` block as defined below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleCapacityArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

    /**
     * @param recurrence A `recurrence` block as defined below.
     * 
     *  &gt; **Note:** Either a `capacity` or `recurrence` block must be specified - but not both.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeAutoscaleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.Builder)
    /**
     * @param edgeNode A `edgeNode` block as defined below.
     * @return builder
     */
    def edgeNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeArgs.builder
      builder.edgeNode(args(argsBuilder).build)

    /**
     * @param headNode A `headNode` block as defined above.
     * @return builder
     */
    def headNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesHeadNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesHeadNodeArgs.builder
      builder.headNode(args(argsBuilder).build)

    /**
     * @param workerNode A `workerNode` block as defined below.
     * @return builder
     */
    def workerNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesWorkerNodeArgs.builder
      builder.workerNode(args(argsBuilder).build)

    /**
     * @param zookeeperNode A `zookeeperNode` block as defined below.
     * @return builder
     */
    def zookeeperNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesZookeeperNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesZookeeperNodeArgs.builder
      builder.zookeeperNode(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationArgs.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationIpConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as defined below.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder)
    /**
     * @param schedules A list of `schedule` blocks as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationArgs.Builder)
    /**
     * @param ipConfiguration An `ipConfiguration` block as defined below.
     * @return builder
     */
    def ipConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationIpConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationIpConfigurationArgs.builder
      builder.ipConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesKafkaManagementNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesKafkaManagementNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesKafkaManagementNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesKafkaManagementNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesHeadNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesHeadNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesHeadNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesHeadNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterRolesZookeeperNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterRolesZookeeperNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.SparkClusterRolesZookeeperNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterRolesZookeeperNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesHeadNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesHeadNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesHeadNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesHeadNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder)
    /**
     * @param componentVersion A `componentVersion` block as defined below.
     * @return builder
     */
    def componentVersion(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterComponentVersionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterComponentVersionArgs.builder
      builder.componentVersion(args(argsBuilder).build)

    /**
     * @param computeIsolation A `computeIsolation` block as defined below.
     * @return builder
     */
    def computeIsolation(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterComputeIsolationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterComputeIsolationArgs.builder
      builder.computeIsolation(args(argsBuilder).build)

    /**
     * @param diskEncryptions One or more `diskEncryption` block as defined below.
     * 
     *  &gt; **Note:** Starting on June 30, 2020, Azure HDInsight will enforce TLS 1.2 or later versions for all HTTPS connections. For more information, see [Azure HDInsight TLS 1.2 Enforcement](https://azure.microsoft.com/en-us/updates/azure-hdinsight-tls-12-enforcement/).
     * @return builder
     */
    def diskEncryptions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterDiskEncryptionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterDiskEncryptionArgs.builder
      builder.diskEncryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param extension An `extension` block as defined below.
     * @return builder
     */
    def extension(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterExtensionArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterExtensionArgs.builder
      builder.extension(args(argsBuilder).build)

    /**
     * @param gateway A `gateway` block as defined below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterGatewayArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param metastores A `metastores` block as defined below.
     * @return builder
     */
    def metastores(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterMetastoresArgs.builder
      builder.metastores(args(argsBuilder).build)

    /**
     * @param monitor A `monitor` block as defined below.
     * @return builder
     */
    def monitor(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterMonitorArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterMonitorArgs.builder
      builder.monitor(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterNetworkArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param privateLinkConfiguration A `privateLinkConfiguration` block as defined below.
     * @return builder
     */
    def privateLinkConfiguration(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterPrivateLinkConfigurationArgs.builder
      builder.privateLinkConfiguration(args(argsBuilder).build)

    /**
     * @param restProxy A `restProxy` block as defined below.
     * @return builder
     */
    def restProxy(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRestProxyArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRestProxyArgs.builder
      builder.restProxy(args(argsBuilder).build)

    /**
     * @param roles A `roles` block as defined below.
     * @return builder
     */
    def roles(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterRolesArgs.builder
      builder.roles(args(argsBuilder).build)

    /**
     * @param securityProfile A `securityProfile` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def securityProfile(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterSecurityProfileArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterSecurityProfileArgs.builder
      builder.securityProfile(args(argsBuilder).build)

    /**
     * @param storageAccountGen2 A `storageAccountGen2` block as defined below.
     * @return builder
     */
    def storageAccountGen2(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountGen2Args.Builder]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountGen2Args.builder
      builder.storageAccountGen2(args(argsBuilder).build)

    /**
     * @param storageAccounts One or more `storageAccount` block as defined below.
     * @return builder
     */
    def storageAccounts(args: Endofunction[com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.KafkaClusterStorageAccountArgs.builder
      builder.storageAccounts(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.hdinsight.inputs.KafkaClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeArgs.Builder)
    /**
     * @param autoscale A `autoscale` block as defined below.
     * @return builder
     */
    def autoscale(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleArgs.builder
      builder.autoscale(args(argsBuilder).build)

    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined above. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeArgs.Builder)
    /**
     * @param httpsEndpoints The HTTPS Connectivity Endpoint for this HDInsight Hadoop Cluster. One or more `httpsEndpoints` blocks as defined below.
     * @return builder
     */
    def httpsEndpoints(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeHttpsEndpointArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeHttpsEndpointArgs.builder
      builder.httpsEndpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param installScriptActions A `installScriptAction` block as defined below.
     * @return builder
     */
    def installScriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeInstallScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeInstallScriptActionArgs.builder
      builder.installScriptActions(args.map(_(argsBuilder).build)*)

    /**
     * @param uninstallScriptActions A `uninstallScriptActions` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def uninstallScriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeUninstallScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesEdgeNodeUninstallScriptActionArgs.builder
      builder.uninstallScriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleArgs.Builder)
    /**
     * @param recurrence A `recurrence` block as defined below.
     * 
     *  &gt; **Note:** Either a `capacity` or `recurrence` block must be specified - but not both.
     * @return builder
     */
    def recurrence(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrenceArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.HBaseClusterRolesWorkerNodeAutoscaleRecurrenceArgs.builder
      builder.recurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesHeadNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesHeadNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesHeadNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesHeadNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.Builder)
    /**
     * @param headNode A `headNode` block as defined above.
     * @return builder
     */
    def headNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesHeadNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesHeadNodeArgs.builder
      builder.headNode(args(argsBuilder).build)

    /**
     * @param workerNode A `workerNode` block as defined below.
     * @return builder
     */
    def workerNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesWorkerNodeArgs.builder
      builder.workerNode(args(argsBuilder).build)

    /**
     * @param zookeeperNode A `zookeeperNode` block as defined below.
     * @return builder
     */
    def zookeeperNode(args: Endofunction[com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesZookeeperNodeArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.InteractiveQueryClusterRolesZookeeperNodeArgs.builder
      builder.zookeeperNode(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.Builder)
    /**
     * @param ambari An `ambari` block as defined below.
     * @return builder
     */
    def ambari(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresAmbariArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresAmbariArgs.builder
      builder.ambari(args(argsBuilder).build)

    /**
     * @param hive A `hive` block as defined below.
     * @return builder
     */
    def hive(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresHiveArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresHiveArgs.builder
      builder.hive(args(argsBuilder).build)

    /**
     * @param oozie An `oozie` block as defined below.
     * @return builder
     */
    def oozie(args: Endofunction[com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresOozieArgs.Builder]):
        com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresArgs.Builder =
      val argsBuilder = com.pulumi.azure.hdinsight.inputs.SparkClusterMetastoresOozieArgs.builder
      builder.oozie(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesHeadNodeArgs.Builder)
    /**
     * @param scriptActions The script action which will run on the cluster. One or more `scriptActions` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def scriptActions(args: Endofunction[com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesHeadNodeScriptActionArgs.Builder]*):
        com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesHeadNodeArgs.Builder =
      def argsBuilder = com.pulumi.azure.hdinsight.inputs.HadoopClusterRolesHeadNodeScriptActionArgs.builder
      builder.scriptActions(args.map(_(argsBuilder).build)*)
