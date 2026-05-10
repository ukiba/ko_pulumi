package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object servicefabric:
  extension (builder: com.pulumi.azure.servicefabric.ManagedClusterArgs.Builder)
    /**
     * @param authentication Controls how connections to the cluster are authenticated. A `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs.Builder]):
        com.pulumi.azure.servicefabric.ManagedClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param customFabricSettings One or more `customFabricSetting` blocks as defined below.
     * @return builder
     */
    def customFabricSettings(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterCustomFabricSettingArgs.Builder]*):
        com.pulumi.azure.servicefabric.ManagedClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterCustomFabricSettingArgs.builder
      builder.customFabricSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param lbRules One or more `lbRule` blocks as defined below.
     * @return builder
     */
    def lbRules(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterLbRuleArgs.Builder]*):
        com.pulumi.azure.servicefabric.ManagedClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterLbRuleArgs.builder
      builder.lbRules(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypes One or more `nodeType` blocks as defined below.
     * @return builder
     */
    def nodeTypes(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeArgs.Builder]*):
        com.pulumi.azure.servicefabric.ManagedClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeArgs.builder
      builder.nodeTypes(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.servicefabric.ManagedClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Resource Group. */
  def ManagedCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicefabric.ManagedClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicefabric.ManagedClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.servicefabric.ManagedCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Service Fabric Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.servicefabric.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.servicefabric.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.servicefabric.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.servicefabric.ClusterArgs.Builder)
    /**
     * @param azureActiveDirectory An `azureActiveDirectory` block as defined below.
     * @return builder
     */
    def azureActiveDirectory(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterAzureActiveDirectoryArgs.Builder]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterAzureActiveDirectoryArgs.builder
      builder.azureActiveDirectory(args(argsBuilder).build)

    /**
     * @param certificate A `certificate` block as defined below. Conflicts with `certificateCommonNames`.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterCertificateArgs.Builder]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificateCommonNames A `certificateCommonNames` block as defined below. Conflicts with `certificate`.
     * @return builder
     */
    def certificateCommonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesArgs.Builder]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesArgs.builder
      builder.certificateCommonNames(args(argsBuilder).build)

    /**
     * @param clientCertificateCommonNames A `clientCertificateCommonName` block as defined below.
     * 
     *  &gt; **Note:** If Client Certificates are enabled then at a Certificate must be configured on the cluster.
     * @return builder
     */
    def clientCertificateCommonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateCommonNameArgs.Builder]*):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateCommonNameArgs.builder
      builder.clientCertificateCommonNames(args.map(_(argsBuilder).build)*)

    /**
     * @param clientCertificateThumbprints One or more `clientCertificateThumbprint` blocks as defined below.
     * @return builder
     */
    def clientCertificateThumbprints(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateThumbprintArgs.Builder]*):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateThumbprintArgs.builder
      builder.clientCertificateThumbprints(args.map(_(argsBuilder).build)*)

    /**
     * @param diagnosticsConfig A `diagnosticsConfig` block as defined below.
     * @return builder
     */
    def diagnosticsConfig(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterDiagnosticsConfigArgs.Builder]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterDiagnosticsConfigArgs.builder
      builder.diagnosticsConfig(args(argsBuilder).build)

    /**
     * @param fabricSettings One or more `fabricSettings` blocks as defined below.
     * @return builder
     */
    def fabricSettings(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterFabricSettingArgs.Builder]*):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterFabricSettingArgs.builder
      builder.fabricSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypes One or more `nodeType` blocks as defined below.
     * @return builder
     */
    def nodeTypes(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs.Builder]*):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs.builder
      builder.nodeTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param reverseProxyCertificate A `reverseProxyCertificate` block as defined below. Conflicts with `reverseProxyCertificateCommonNames`.
     * @return builder
     */
    def reverseProxyCertificate(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateArgs.Builder]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateArgs.builder
      builder.reverseProxyCertificate(args(argsBuilder).build)

    /**
     * @param reverseProxyCertificateCommonNames A `reverseProxyCertificateCommonNames` block as defined below. Conflicts with `reverseProxyCertificate`.
     * @return builder
     */
    def reverseProxyCertificateCommonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesArgs.Builder]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesArgs.builder
      builder.reverseProxyCertificateCommonNames(args(argsBuilder).build)

    /**
     * @param upgradePolicy A `upgradePolicy` block as defined below.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs.Builder]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.servicefabric.ClusterArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.servicefabric.inputs.ClusterState.Builder)
    /**
     * @param azureActiveDirectory An `azureActiveDirectory` block as defined below.
     * @return builder
     */
    def azureActiveDirectory(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterAzureActiveDirectoryArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterAzureActiveDirectoryArgs.builder
      builder.azureActiveDirectory(args(argsBuilder).build)

    /**
     * @param certificate A `certificate` block as defined below. Conflicts with `certificateCommonNames`.
     * @return builder
     */
    def certificate(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterCertificateArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterCertificateArgs.builder
      builder.certificate(args(argsBuilder).build)

    /**
     * @param certificateCommonNames A `certificateCommonNames` block as defined below. Conflicts with `certificate`.
     * @return builder
     */
    def certificateCommonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesArgs.builder
      builder.certificateCommonNames(args(argsBuilder).build)

    /**
     * @param clientCertificateCommonNames A `clientCertificateCommonName` block as defined below.
     * 
     *  &gt; **Note:** If Client Certificates are enabled then at a Certificate must be configured on the cluster.
     * @return builder
     */
    def clientCertificateCommonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateCommonNameArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateCommonNameArgs.builder
      builder.clientCertificateCommonNames(args.map(_(argsBuilder).build)*)

    /**
     * @param clientCertificateThumbprints One or more `clientCertificateThumbprint` blocks as defined below.
     * @return builder
     */
    def clientCertificateThumbprints(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateThumbprintArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterClientCertificateThumbprintArgs.builder
      builder.clientCertificateThumbprints(args.map(_(argsBuilder).build)*)

    /**
     * @param diagnosticsConfig A `diagnosticsConfig` block as defined below.
     * @return builder
     */
    def diagnosticsConfig(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterDiagnosticsConfigArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterDiagnosticsConfigArgs.builder
      builder.diagnosticsConfig(args(argsBuilder).build)

    /**
     * @param fabricSettings One or more `fabricSettings` blocks as defined below.
     * @return builder
     */
    def fabricSettings(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterFabricSettingArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterFabricSettingArgs.builder
      builder.fabricSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypes One or more `nodeType` blocks as defined below.
     * @return builder
     */
    def nodeTypes(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs.builder
      builder.nodeTypes(args.map(_(argsBuilder).build)*)

    /**
     * @param reverseProxyCertificate A `reverseProxyCertificate` block as defined below. Conflicts with `reverseProxyCertificateCommonNames`.
     * @return builder
     */
    def reverseProxyCertificate(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateArgs.builder
      builder.reverseProxyCertificate(args(argsBuilder).build)

    /**
     * @param reverseProxyCertificateCommonNames A `reverseProxyCertificateCommonNames` block as defined below. Conflicts with `reverseProxyCertificate`.
     * @return builder
     */
    def reverseProxyCertificateCommonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesArgs.builder
      builder.reverseProxyCertificateCommonNames(args(argsBuilder).build)

    /**
     * @param upgradePolicy A `upgradePolicy` block as defined below.
     * @return builder
     */
    def upgradePolicy(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs.builder
      builder.upgradePolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.servicefabric.inputs.ClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined above.
     * @return builder
     */
    def activeDirectory(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationActiveDirectoryArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param certificates One or more `certificate` blocks as defined below.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationCertificateArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.servicefabric.inputs.ManagedClusterState.Builder)
    /**
     * @param authentication Controls how connections to the cluster are authenticated. A `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterState.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    /**
     * @param customFabricSettings One or more `customFabricSetting` blocks as defined below.
     * @return builder
     */
    def customFabricSettings(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterCustomFabricSettingArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterState.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterCustomFabricSettingArgs.builder
      builder.customFabricSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param lbRules One or more `lbRule` blocks as defined below.
     * @return builder
     */
    def lbRules(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterLbRuleArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterState.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterLbRuleArgs.builder
      builder.lbRules(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeTypes One or more `nodeType` blocks as defined below.
     * @return builder
     */
    def nodeTypes(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterState.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeArgs.builder
      builder.nodeTypes(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesArgs.Builder)
    /**
     * @param commonNames A `commonNames` block as defined below.
     * @return builder
     */
    def commonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesCommonNameArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterCertificateCommonNamesCommonNameArgs.builder
      builder.commonNames(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeVmSecretArgs.Builder)
    /**
     * @param certificates One or more `certificates` blocks as defined above.
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeVmSecretCertificateArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeVmSecretArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeVmSecretCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeArgs.Builder)
    /**
     * @param vmSecrets One or more `vmSecrets` blocks as defined below.
     * @return builder
     */
    def vmSecrets(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeVmSecretArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ManagedClusterNodeTypeVmSecretArgs.builder
      builder.vmSecrets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs.Builder)
    /**
     * @param applicationPorts A `applicationPorts` block as defined below.
     * @return builder
     */
    def applicationPorts(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeApplicationPortsArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeApplicationPortsArgs.builder
      builder.applicationPorts(args(argsBuilder).build)

    /**
     * @param ephemeralPorts A `ephemeralPorts` block as defined below.
     * @return builder
     */
    def ephemeralPorts(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeEphemeralPortsArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterNodeTypeEphemeralPortsArgs.builder
      builder.ephemeralPorts(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs.Builder)
    /**
     * @param deltaHealthPolicy A `deltaHealthPolicy` block as defined below
     * @return builder
     */
    def deltaHealthPolicy(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyDeltaHealthPolicyArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyDeltaHealthPolicyArgs.builder
      builder.deltaHealthPolicy(args(argsBuilder).build)

    /**
     * @param healthPolicy A `healthPolicy` block as defined below
     * @return builder
     */
    def healthPolicy(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyHealthPolicyArgs.Builder]):
        com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterUpgradePolicyHealthPolicyArgs.builder
      builder.healthPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesArgs.Builder)
    /**
     * @param commonNames A `commonNames` block as defined below.
     * @return builder
     */
    def commonNames(args: Endofunction[com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesCommonNameArgs.Builder]*):
        com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesArgs.Builder =
      def argsBuilder = com.pulumi.azure.servicefabric.inputs.ClusterReverseProxyCertificateCommonNamesCommonNameArgs.builder
      builder.commonNames(args.map(_(argsBuilder).build)*)
