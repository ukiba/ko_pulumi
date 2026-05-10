package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object container:
  /**
   * An Anthos cluster running on Azure.
   * 
   *  For more information, see:
   *  * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AzureCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AzureClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AzureClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AzureCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An Anthos node pool running on AWS.
   * 
   *  For more information, see:
   *  * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AwsNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AwsNodePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AwsNodePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AwsNodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An Anthos node pool running on Azure.
   * 
   *  For more information, see:
   *  * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AzureNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AzureNodePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AzureNodePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AzureNodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.container.AzureClusterArgs.Builder)
    /**
     * @param authorization Configuration related to the cluster RBAC settings.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.AzureClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param azureServicesAuthentication Azure authentication configuration for management of Azure resources
     * @return builder
     */
    def azureServicesAuthentication(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterAzureServicesAuthenticationArgs.Builder]):
        com.pulumi.gcp.container.AzureClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterAzureServicesAuthenticationArgs.builder
      builder.azureServicesAuthentication(args(argsBuilder).build)

    /**
     * @param controlPlane Configuration related to the cluster control plane.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.container.AzureClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param fleet Fleet configuration.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.AzureClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.AzureClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param networking Cluster-wide networking configuration.
     * @return builder
     */
    def networking(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterNetworkingArgs.Builder]):
        com.pulumi.gcp.container.AzureClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterNetworkingArgs.builder
      builder.networking(args(argsBuilder).build)

  /**
   * AzureClient resources hold client authentication information needed by the Anthos Multi-Cloud API to manage Azure resources on your Azure subscription.When an AzureCluster is created, an AzureClient resource needs to be provided and all operations on Azure resources associated to that cluster will authenticate to Azure services using the given client.AzureClient resources are immutable and cannot be modified upon creation.Each AzureClient resource is bound to a single Azure Active Directory Application and tenant.
   * 
   *  For more information, see:
   *  * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AzureClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AzureClientArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AzureClientArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AzureClient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.container.AwsClusterArgs.Builder)
    /**
     * @param authorization Configuration related to the cluster RBAC settings.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.AwsClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param binaryAuthorization Configuration options for the Binary Authorization feature.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.AwsClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param controlPlane Configuration related to the cluster control plane.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.container.AwsClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param fleet Fleet configuration.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.AwsClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.AwsClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param networking Cluster-wide networking configuration.
     * @return builder
     */
    def networking(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterNetworkingArgs.Builder]):
        com.pulumi.gcp.container.AwsClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterNetworkingArgs.builder
      builder.networking(args(argsBuilder).build)

  /**
   * Manages a Google Kubernetes Engine (GKE) cluster.
   * 
   *  To get more information about GKE clusters, see:
   *    * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters)
   *    * How-to guides
   *      * [GKE overview](https://cloud.google.com/kubernetes-engine/docs/concepts/kubernetes-engine-overview)
   *      * [About cluster configuration choices](https://cloud.google.com/kubernetes-engine/docs/concepts/types-of-clusters)
   * 
   *  &gt; On version 5.0.0+ of the provider, you must explicitly set `deletionProtection = false`
   *  and run `pulumi up` to write the field to state in order to destroy a cluster.
   * 
   *  &gt; All arguments and attributes (including certificate outputs) will be stored in the raw state as
   *  plaintext. Read more about sensitive data in state.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.ClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.ClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.container.AttachedClusterArgs.Builder)
    /**
     * @param authorization Configuration related to the cluster RBAC settings.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param binaryAuthorization Binary Authorization configuration.
     *  Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param fleet Fleet configuration.
     *  Structure is documented below.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param monitoringConfig Monitoring configuration.
     *  Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

    /**
     * @param oidcConfig OIDC discovery information of the target cluster.
     *  Kubernetes Service Account (KSA) tokens are JWT tokens signed by the cluster
     *  API server. This fields indicates how GCP services
     *  validate KSA tokens in order to allow system workloads (such as GKE Connect
     *  and telemetry agents) to authenticate back to GCP.
     *  Both clusters with public and private issuer URLs are supported.
     *  Clusters with public issuers only need to specify the `issuerUrl` field
     *  while clusters with private issuers need to provide both
     *  `issuerUrl` and `jwks`.
     *  Structure is documented below.
     * @return builder
     */
    def oidcConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterOidcConfigArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterOidcConfigArgs.builder
      builder.oidcConfig(args(argsBuilder).build)

    /**
     * @param proxyConfig Support for proxy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def proxyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

    /**
     * @param securityPostureConfig (Optional, Deprecated)
     *  Enable/Disable Security Posture API features for the cluster.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `securityPostureConfig` is deprecated and will be removed in a future major release.
     * @return builder
     * @deprecated `securityPostureConfig` is deprecated and will be removed in a future major release.
     */
    @deprecated def securityPostureConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterSecurityPostureConfigArgs.Builder]):
        com.pulumi.gcp.container.AttachedClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterSecurityPostureConfigArgs.builder
      builder.securityPostureConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.ClusterArgs.Builder)
    /**
     * @param addonsConfig The configuration for addons supported by GKE.
     *  Structure is documented below.
     * @return builder
     */
    def addonsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.builder
      builder.addonsConfig(args(argsBuilder).build)

    /**
     * @param anonymousAuthenticationConfig Configuration for [anonymous authentication restrictions](https://cloud.google.com/kubernetes-engine/docs/how-to/hardening-your-cluster#restrict-anon-access). Structure is documented below.
     * @return builder
     */
    def anonymousAuthenticationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAnonymousAuthenticationConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAnonymousAuthenticationConfigArgs.builder
      builder.anonymousAuthenticationConfig(args(argsBuilder).build)

    /**
     * @param authenticatorGroupsConfig Configuration for the
     *  [Google Groups for GKE](https://cloud.google.com/kubernetes-engine/docs/how-to/role-based-access-control#groups-setup-gsuite) feature.
     *  Structure is documented below.
     * @return builder
     */
    def authenticatorGroupsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAuthenticatorGroupsConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAuthenticatorGroupsConfigArgs.builder
      builder.authenticatorGroupsConfig(args(argsBuilder).build)

    /**
     * @param autopilotClusterPolicyConfig Per-cluster configuration of Autopilot cluster policies in GKE clusters. This field can only be configured in non Autopilot clusters. Structure is documented below.
     * @return builder
     */
    def autopilotClusterPolicyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAutopilotClusterPolicyConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAutopilotClusterPolicyConfigArgs.builder
      builder.autopilotClusterPolicyConfig(args(argsBuilder).build)

    /**
     * @param binaryAuthorization Configuration options for the Binary
     *  Authorization feature. Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param clusterAutoscaling Per-cluster configuration of Node Auto-Provisioning with Cluster Autoscaler to
     *  automatically adjust the size of the cluster and create/delete node pools based
     *  on the current needs of the cluster&#39;s workload. See the
     *  [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
     *  for more details. Structure is documented below.
     * @return builder
     */
    def clusterAutoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingArgs.builder
      builder.clusterAutoscaling(args(argsBuilder).build)

    /**
     * @param clusterTelemetry ) Configuration for
     *  [ClusterTelemetry](https://cloud.google.com/monitoring/kubernetes-engine/installing#controlling_the_collection_of_application_logs) feature,
     *  Structure is documented below.
     * @return builder
     */
    def clusterTelemetry(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterTelemetryArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterTelemetryArgs.builder
      builder.clusterTelemetry(args(argsBuilder).build)

    /**
     * @param confidentialNodes Configuration for [Confidential Nodes](https://cloud.google.com/kubernetes-engine/docs/how-to/confidential-gke-nodes) feature. Structure is documented below documented below.
     * @return builder
     */
    def confidentialNodes(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterConfidentialNodesArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterConfidentialNodesArgs.builder
      builder.confidentialNodes(args(argsBuilder).build)

    /**
     * @param controlPlaneEndpointsConfig Configuration for all of the cluster&#39;s control plane endpoints.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneEndpointsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigArgs.builder
      builder.controlPlaneEndpointsConfig(args(argsBuilder).build)

    /**
     * @param costManagementConfig Configuration for the
     *  [Cost Allocation](https://cloud.google.com/kubernetes-engine/docs/how-to/cost-allocations) feature.
     *  Structure is documented below.
     * @return builder
     */
    def costManagementConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterCostManagementConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterCostManagementConfigArgs.builder
      builder.costManagementConfig(args(argsBuilder).build)

    /**
     * @param databaseEncryption Structure is documented below.
     * @return builder
     */
    def databaseEncryption(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterDatabaseEncryptionArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterDatabaseEncryptionArgs.builder
      builder.databaseEncryption(args(argsBuilder).build)

    /**
     * @param defaultSnatStatus [GKE SNAT](https://cloud.google.com/kubernetes-engine/docs/how-to/ip-masquerade-agent#how_ipmasq_works) DefaultSnatStatus contains the desired state of whether default sNAT should be disabled on the cluster, [API doc](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters#networkconfig). Structure is documented below
     * @return builder
     */
    def defaultSnatStatus(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterDefaultSnatStatusArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterDefaultSnatStatusArgs.builder
      builder.defaultSnatStatus(args(argsBuilder).build)

    /**
     * @param dnsConfig Configuration for [Using Cloud DNS for GKE](https://cloud.google.com/kubernetes-engine/docs/how-to/cloud-dns). Structure is documented below.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterDnsConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param enableK8sBetaApis Configuration for Kubernetes Beta APIs.
     *  Structure is documented below.
     * @return builder
     */
    def enableK8sBetaApis(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterEnableK8sBetaApisArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterEnableK8sBetaApisArgs.builder
      builder.enableK8sBetaApis(args(argsBuilder).build)

    /**
     * @param enterpriseConfig (DEPRECATED) Configuration for [Enterprise edition].(https://cloud.google.com/kubernetes-engine/enterprise/docs/concepts/gke-editions). Structure is documented below. Deprecated as GKE Enterprise features are now available without an Enterprise tier. See https://cloud.google.com/blog/products/containers-kubernetes/gke-gets-new-pricing-and-capabilities-on-10th-birthday for the announcement of this change.
     * @return builder
     * @deprecated GKE Enterprise features are now available without an Enterprise tier. This field is deprecated and will be removed in a future major release
     */
    @deprecated def enterpriseConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterEnterpriseConfigArgs.builder
      builder.enterpriseConfig(args(argsBuilder).build)

    /**
     * @param fleet Fleet configuration for the cluster. Structure is documented below.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param gatewayApiConfig Configuration for [GKE Gateway API controller](https://cloud.google.com/kubernetes-engine/docs/concepts/gateway-api). Structure is documented below.
     * @return builder
     */
    def gatewayApiConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterGatewayApiConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterGatewayApiConfigArgs.builder
      builder.gatewayApiConfig(args(argsBuilder).build)

    /**
     * @param gkeAutoUpgradeConfig Configuration options for the auto-upgrade patch type feature, which provide more control over the speed of automatic upgrades of your GKE clusters.
     *  Structure is documented below.
     * @return builder
     */
    def gkeAutoUpgradeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterGkeAutoUpgradeConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterGkeAutoUpgradeConfigArgs.builder
      builder.gkeAutoUpgradeConfig(args(argsBuilder).build)

    /**
     * @param identityServiceConfig . Structure is documented below.
     * @return builder
     */
    def identityServiceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIdentityServiceConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIdentityServiceConfigArgs.builder
      builder.identityServiceConfig(args(argsBuilder).build)

    /**
     * @param ipAllocationPolicy Configuration of cluster IP allocation for
     *  VPC-native clusters. If this block is unset during creation, it will be set by the GKE backend.
     *  Structure is documented below.
     * @return builder
     */
    def ipAllocationPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.builder
      builder.ipAllocationPolicy(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param maintenancePolicy The maintenance policy to use for the cluster. Structure is
     *  documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param managedMachineLearningDiagnosticsConfig ) Configuration for the [GKE Managed ML Diagnostics](https://docs.cloud.google.com/kubernetes-engine/docs/concepts/TODO) feature. Structure is documented below.
     * @return builder
     */
    def managedMachineLearningDiagnosticsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterManagedMachineLearningDiagnosticsConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterManagedMachineLearningDiagnosticsConfigArgs.builder
      builder.managedMachineLearningDiagnosticsConfig(args(argsBuilder).build)

    /**
     * @param managedOpentelemetryConfig ) Configuration for the [GKE Managed OpenTelemetry](https://docs.cloud.google.com/kubernetes-engine/docs/concepts/managed-otel-gke) feature. Structure is documented below.
     * @return builder
     */
    def managedOpentelemetryConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterManagedOpentelemetryConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterManagedOpentelemetryConfigArgs.builder
      builder.managedOpentelemetryConfig(args(argsBuilder).build)

    /**
     * @param masterAuth The authentication information for accessing the
     *  Kubernetes master. Some values in this block are only returned by the API if
     *  your service account has permission to get credentials for your GKE cluster. If
     *  you see an unexpected diff unsetting your client cert, ensure you have the
     *  `container.clusters.getCredentials` permission.
     *  Structure is documented below.
     * @return builder
     */
    def masterAuth(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMasterAuthArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMasterAuthArgs.builder
      builder.masterAuth(args(argsBuilder).build)

    /**
     * @param masterAuthorizedNetworksConfig The desired
     *  configuration options for master authorized networks. Omit the
     *  nested `cidrBlocks` attribute to disallow external access (except
     *  the cluster node IPs, which GKE automatically whitelists).
     *  Structure is documented below.
     * @return builder
     */
    def masterAuthorizedNetworksConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigArgs.builder
      builder.masterAuthorizedNetworksConfig(args(argsBuilder).build)

    /**
     * @param meshCertificates Structure is documented below.
     * @return builder
     */
    def meshCertificates(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMeshCertificatesArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMeshCertificatesArgs.builder
      builder.meshCertificates(args(argsBuilder).build)

    /**
     * @param monitoringConfig Monitoring configuration for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

    /**
     * @param networkPerformanceConfig Network bandwidth tier configuration.
     * @return builder
     */
    def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param networkPolicy Configuration options for the
     *  [NetworkPolicy](https://kubernetes.io/docs/concepts/services-networking/networkpolicies/)
     *  feature. Structure is documented below.
     * @return builder
     */
    def networkPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNetworkPolicyArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNetworkPolicyArgs.builder
      builder.networkPolicy(args(argsBuilder).build)

    /**
     * @param nodeConfig Parameters used in creating the default node pool.
     *  Generally, this field should not be used at the same time as a
     *  `gcp.container.NodePool` or a `nodePool` block; this configuration
     *  manages the default node pool, which isn&#39;t recommended to be used.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param nodePoolAutoConfig Node pool configs that apply to auto-provisioned node pools in
     *  [autopilot](https://cloud.google.com/kubernetes-engine/docs/concepts/autopilot-overview#comparison) clusters and
     *  [node auto-provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)-enabled clusters. Structure is documented below.
     * @return builder
     */
    def nodePoolAutoConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.builder
      builder.nodePoolAutoConfig(args(argsBuilder).build)

    /**
     * @param nodePoolDefaults Default NodePool settings for the entire cluster. These settings are overridden if specified on the specific NodePool object. Structure is documented below.
     * @return builder
     */
    def nodePoolDefaults(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsArgs.builder
      builder.nodePoolDefaults(args(argsBuilder).build)

    /**
     * @param nodePools List of node pools associated with this cluster.
     *  See gcp.container.NodePool for schema.
     *  **Warning:** node pools defined inside a cluster can&#39;t be changed (or added/removed) after
     *  cluster creation without deleting and recreating the entire cluster. Unless you absolutely need the ability
     *  to say &#34;these are the _only_ node pools associated with this cluster&#34;, use the
     *  gcp.container.NodePool resource instead of this property.
     * @return builder
     */
    def nodePools(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder]*):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.builder
      builder.nodePools(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfig Configuration for the [cluster upgrade notifications](https://cloud.google.com/kubernetes-engine/docs/how-to/cluster-upgrade-notifications) feature. Structure is documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNotificationConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param podAutoscaling Configuration for the
     *  Structure is documented below.
     * @return builder
     */
    def podAutoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterPodAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterPodAutoscalingArgs.builder
      builder.podAutoscaling(args(argsBuilder).build)

    /**
     * @param podSecurityPolicyConfig ) Configuration for the
     *  [PodSecurityPolicy](https://cloud.google.com/kubernetes-engine/docs/how-to/pod-security-policies) feature.
     *  Structure is documented below.
     * @return builder
     */
    def podSecurityPolicyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterPodSecurityPolicyConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterPodSecurityPolicyConfigArgs.builder
      builder.podSecurityPolicyConfig(args(argsBuilder).build)

    /**
     * @param privateClusterConfig Configuration for [private clusters](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters),
     *  clusters with private nodes. Structure is documented below.
     * @return builder
     */
    def privateClusterConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigArgs.builder
      builder.privateClusterConfig(args(argsBuilder).build)

    /**
     * @param protectConfig )
     *  Enable/Disable Protect API features for the cluster. Structure is documented below.
     * @return builder
     */
    def protectConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterProtectConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterProtectConfigArgs.builder
      builder.protectConfig(args(argsBuilder).build)

    /**
     * @param rbacBindingConfig RBACBindingConfig allows user to restrict ClusterRoleBindings an RoleBindings that can be created. Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedDefaultSnatStatus&#34;&gt;&lt;/a&gt;The `defaultSnatStatus` block supports
     * @return builder
     */
    def rbacBindingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterRbacBindingConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterRbacBindingConfigArgs.builder
      builder.rbacBindingConfig(args(argsBuilder).build)

    /**
     * @param releaseChannel Configuration options for the [Release channel](https://cloud.google.com/kubernetes-engine/docs/concepts/release-channels)
     *  feature, which provide more control over automatic upgrades of your GKE clusters.
     *  When updating this field, GKE imposes specific version requirements. See
     *  [Selecting a new release channel](https://cloud.google.com/kubernetes-engine/docs/concepts/release-channels#selecting_a_new_release_channel)
     *  for more details; the `gcp.container.getEngineVersions` datasource can provide
     *  the default version for a channel. Note that removing the `releaseChannel`
     *  field from your config will cause the provider to stop managing your cluster&#39;s
     *  release channel, but will not unenroll it. Instead, use the `&#34;UNSPECIFIED&#34;`
     *  channel. Structure is documented below.
     * @return builder
     */
    def releaseChannel(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterReleaseChannelArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterReleaseChannelArgs.builder
      builder.releaseChannel(args(argsBuilder).build)

    /**
     * @param resourceUsageExportConfig Configuration for the
     *  [ResourceUsageExportConfig](https://cloud.google.com/kubernetes-engine/docs/how-to/cluster-usage-metering) feature.
     *  Structure is documented below.
     * @return builder
     */
    def resourceUsageExportConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigArgs.builder
      builder.resourceUsageExportConfig(args(argsBuilder).build)

    /**
     * @param secretManagerConfig Configuration for the
     *  [SecretManagerConfig](https://cloud.google.com/secret-manager/docs/secret-manager-managed-csi-component) feature.
     *  Structure is documented below.
     * @return builder
     */
    def secretManagerConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigArgs.builder
      builder.secretManagerConfig(args(argsBuilder).build)

    /**
     * @param secretSyncConfig ) Configuration for the
     *  [SecretSyncConfig](https://cloud.google.com/secret-manager/docs/sync-k8-secrets) feature.
     *  Structure is documented below.
     * @return builder
     */
    def secretSyncConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigArgs.builder
      builder.secretSyncConfig(args(argsBuilder).build)

    /**
     * @param securityPostureConfig Enable/Disable Security Posture API features for the cluster. Structure is documented below.
     * @return builder
     */
    def securityPostureConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecurityPostureConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecurityPostureConfigArgs.builder
      builder.securityPostureConfig(args(argsBuilder).build)

    /**
     * @param serviceExternalIpsConfig Structure is documented below.
     * @return builder
     */
    def serviceExternalIpsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterServiceExternalIpsConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterServiceExternalIpsConfigArgs.builder
      builder.serviceExternalIpsConfig(args(argsBuilder).build)

    /**
     * @param tpuConfig TPU configuration for the cluster.
     * @return builder
     */
    def tpuConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterTpuConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterTpuConfigArgs.builder
      builder.tpuConfig(args(argsBuilder).build)

    /**
     * @param userManagedKeysConfig The custom keys configuration of the cluster Structure is documented below.
     * @return builder
     */
    def userManagedKeysConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterUserManagedKeysConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterUserManagedKeysConfigArgs.builder
      builder.userManagedKeysConfig(args(argsBuilder).build)

    /**
     * @param verticalPodAutoscaling Vertical Pod Autoscaling automatically adjusts the resources of pods controlled by it.
     *  Structure is documented below.
     * @return builder
     */
    def verticalPodAutoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterVerticalPodAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterVerticalPodAutoscalingArgs.builder
      builder.verticalPodAutoscaling(args(argsBuilder).build)

    /**
     * @param workloadAltsConfig )
     *  Configuration for [direct-path (via ALTS) with workload identity.](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters#workloadaltsconfig). Structure is documented below.
     * @return builder
     */
    def workloadAltsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterWorkloadAltsConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterWorkloadAltsConfigArgs.builder
      builder.workloadAltsConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity allows Kubernetes service accounts to act as a user-managed
     *  [Google IAM Service Account](https://cloud.google.com/iam/docs/service-accounts#user-managed_service_accounts).
     *  Structure is documented below.
     * @return builder
     */
    def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.container.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.AzureNodePoolArgs.Builder)
    /**
     * @param autoscaling Autoscaler configuration for this node pool.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.AzureNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param config The node configuration of the node pool.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.container.AzureNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param management The Management configuration for this node pool.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolManagementArgs.Builder]):
        com.pulumi.gcp.container.AzureNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * @return builder
     */
    def maxPodsConstraint(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolMaxPodsConstraintArgs.Builder]):
        com.pulumi.gcp.container.AzureNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolMaxPodsConstraintArgs.builder
      builder.maxPodsConstraint(args(argsBuilder).build)

  /**
   * An Anthos cluster running on AWS.
   * 
   *  For more information, see:
   *  * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AwsCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AwsClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AwsClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AwsCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a node pool in a Google Kubernetes Engine (GKE) cluster separately from
   *  the cluster control plane. For more information see [the official documentation](https://cloud.google.com/container-engine/docs/node-pools)
   *  and [the API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters.nodePools).
   */
  def NodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.NodePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.NodePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.NodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ContainerFunctions = com.pulumi.gcp.container.ContainerFunctions
  object ContainerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.container.ContainerFunctions.*
  extension (self: ContainerFunctions.type)
    /** Provides access to available platform versions in a location for a given project. */
    def getAttachedInstallManifest(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedInstallManifestArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAttachedInstallManifestResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedInstallManifestArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedInstallManifest(args(argsBuilder).build)

    /** Provides access to available platform versions in a location for a given project. */
    def getAttachedInstallManifestPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedInstallManifestPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAttachedInstallManifestResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedInstallManifestPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedInstallManifestPlain(args(argsBuilder).build)

    /** Provides access to available platform versions in a location for a given project. */
    def getAttachedVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAttachedVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedVersions(args(argsBuilder).build)

    /** Provides access to available platform versions in a location for a given project. */
    def getAttachedVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAttachedVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedVersionsPlain(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    def getAwsVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetAwsVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAwsVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAwsVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAwsVersions(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    def getAwsVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAwsVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAwsVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAwsVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAwsVersionsPlain(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    def getAzureVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetAzureVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAzureVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAzureVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAzureVersions(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    def getAzureVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAzureVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAzureVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAzureVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAzureVersionsPlain(args(argsBuilder).build)

    /** Get info about a GKE cluster from its name and location. */
    def getCluster(args: Endofunction[com.pulumi.gcp.container.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetClusterArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getCluster(args(argsBuilder).build)

    /** Get info about a GKE cluster from its name and location. */
    def getClusterPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetClusterPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getClusterPlain(args(argsBuilder).build)

    /**
     * Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
     * 
     *  To get more information about GKE versions, see:
     *    * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
     * 
     *  &gt; If you are using the `gcp.container.getEngineVersions` datasource with a
     *  regional cluster, ensure that you have provided a region as the `location` to
     *  the datasource. A region can have a different set of supported versions than
     *  its component zones, and not all zones in a region are guaranteed to
     *  support the same version.
     */
    def getEngineVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetEngineVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetEngineVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetEngineVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getEngineVersions(args(argsBuilder).build)

    /**
     * Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
     * 
     *  To get more information about GKE versions, see:
     *    * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
     * 
     *  &gt; If you are using the `gcp.container.getEngineVersions` datasource with a
     *  regional cluster, ensure that you have provided a region as the `location` to
     *  the datasource. A region can have a different set of supported versions than
     *  its component zones, and not all zones in a region are guaranteed to
     *  support the same version.
     */
    def getEngineVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetEngineVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetEngineVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetEngineVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getEngineVersionsPlain(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     *  This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     *  The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    def getRegistryImage(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetRegistryImageResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryImageArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryImage(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     *  This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     *  The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    def getRegistryImagePlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetRegistryImageResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryImagePlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryImagePlain(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     *  This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     *  The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    def getRegistryRepository(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryRepositoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetRegistryRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryRepositoryArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryRepository(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     *  This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     *  The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    def getRegistryRepositoryPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryRepositoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetRegistryRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryRepositoryPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryRepositoryPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.AwsNodePoolArgs.Builder)
    /**
     * @param autoscaling Autoscaler configuration for this node pool.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.AwsNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param config The configuration of the node pool.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.container.AwsNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param kubeletConfig The kubelet configuration for the node pool.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolKubeletConfigArgs.Builder]):
        com.pulumi.gcp.container.AwsNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param management The Management configuration for this node pool.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolManagementArgs.Builder]):
        com.pulumi.gcp.container.AwsNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * @return builder
     */
    def maxPodsConstraint(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolMaxPodsConstraintArgs.Builder]):
        com.pulumi.gcp.container.AwsNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolMaxPodsConstraintArgs.builder
      builder.maxPodsConstraint(args(argsBuilder).build)

    /**
     * @param updateSettings Optional. Update settings control the speed and disruption of the node pool update.
     * @return builder
     */
    def updateSettings(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsArgs.Builder]):
        com.pulumi.gcp.container.AwsNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsArgs.builder
      builder.updateSettings(args(argsBuilder).build)

  /**
   * An Anthos cluster running on customer owned infrastructure.
   * 
   *  To get more information about Cluster, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/clusters/docs/multi-cloud/reference/rest)
   *  * How-to Guides
   *      * [API reference](https://cloud.google.com/anthos/clusters/docs/multi-cloud/reference/rest/v1/projects.locations.attachedClusters)
   *      * [Multicloud overview](https://cloud.google.com/anthos/clusters/docs/multi-cloud)
   */
  def AttachedCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AttachedClusterArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AttachedClusterArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AttachedCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.container.NodePoolArgs.Builder)
    /**
     * @param autoscaling Configuration required by cluster autoscaler to adjust
     *  the size of the node pool to the current cluster usage. Structure is documented below.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param management Node management configuration, wherein auto-repair and
     *  auto-upgrade is configured. Structure is documented below.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolManagementArgs.Builder]):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param networkConfig The network configuration of the pool. Such as
     *  configuration for [Adding Pod IP address ranges](https://cloud.google.com/kubernetes-engine/docs/how-to/multi-pod-cidr)) to the node pool. Or enabling private nodes. Structure is
     *  documented below
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.Builder]):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Parameters used in creating the node pool. See
     *  gcp.container.Cluster for schema.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param nodeDrainConfigs The node drain configuration of the pool. Structure is documented below.
     * @return builder
     */
    def nodeDrainConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeDrainConfigArgs.Builder]*):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeDrainConfigArgs.builder
      builder.nodeDrainConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param placementPolicy Specifies a custom placement policy for the
     *  nodes.
     * @return builder
     */
    def placementPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolPlacementPolicyArgs.Builder]):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolPlacementPolicyArgs.builder
      builder.placementPolicy(args(argsBuilder).build)

    /**
     * @param queuedProvisioning Specifies node pool-level settings of queued provisioning.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedAutoscaling&#34;&gt;&lt;/a&gt;The `autoscaling` block supports (either total or per zone limits are required):
     * @return builder
     */
    def queuedProvisioning(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolQueuedProvisioningArgs.Builder]):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolQueuedProvisioningArgs.builder
      builder.queuedProvisioning(args(argsBuilder).build)

    /**
     * @param upgradeSettings Specify node upgrade settings to change how GKE upgrades nodes.
     *  The maximum number of nodes upgraded simultaneously is limited to 20. Structure is documented below.
     * @return builder
     */
    def upgradeSettings(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsArgs.Builder]):
        com.pulumi.gcp.container.NodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsArgs.builder
      builder.upgradeSettings(args(argsBuilder).build)

  /**
   * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
   * 
   *  Ensures that the Google Cloud Storage bucket that backs Google Container Registry exists. Creating this resource will create the backing bucket if it does not exist, or do nothing if the bucket already exists. Destroying this resource does *NOT* destroy the backing bucket. For more information see [the official documentation](https://cloud.google.com/container-registry/docs/overview)
   * 
   *  This resource can be used to ensure that the GCS bucket exists prior to assigning permissions. For more information see the [access control page](https://cloud.google.com/container-registry/docs/access-control) for GCR.
   */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.RegistryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.container.RegistryArgs.builder
    com.pulumi.gcp.container.Registry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterMasterAuthArgs.Builder)
    /**
     * @param clientCertificateConfig Whether client certificate authorization is enabled for this cluster.  For example:
     * @return builder
     */
    def clientCertificateConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMasterAuthClientCertificateConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMasterAuthArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMasterAuthClientCertificateConfigArgs.builder
      builder.clientCertificateConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsArgs.Builder)
    /**
     * @param management NodeManagement configuration for this NodePool. Structure is documented below.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param shieldedInstanceConfig Shielded Instance options. Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param upgradeSettings Specifies the upgrade settings for NAP created node pools
     * @return builder
     */
    def upgradeSettings(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs.builder
      builder.upgradeSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingArgs.Builder)
    /**
     * @param autoProvisioningDefaults Contains defaults for a node pool created by NAP. A subset of fields also apply to
     *  GKE Autopilot clusters.
     *  Structure is documented below.
     * @return builder
     */
    def autoProvisioningDefaults(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsArgs.builder
      builder.autoProvisioningDefaults(args(argsBuilder).build)

    /**
     * @param resourceLimits Global constraints for machine resources in the
     *  cluster. Configuring the `cpu` and `memory` types is required if node
     *  auto-provisioning is enabled. These limits will apply to node pool autoscaling
     *  in addition to node auto-provisioning. Limits can&#39;t be unset entirely, they can only be replaced. Structure is documented below.
     * @return builder
     */
    def resourceLimits(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingResourceLimitArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingResourceLimitArgs.builder
      builder.resourceLimits(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorArgs.Builder)
    /**
     * @param gpuDriverInstallationConfig Configuration for auto installation of GPU driver. Structure is documented below.
     * @return builder
     */
    def gpuDriverInstallationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorGpuDriverInstallationConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorGpuDriverInstallationConfigArgs.builder
      builder.gpuDriverInstallationConfig(args(argsBuilder).build)

    /**
     * @param gpuSharingConfig Configuration for GPU sharing. Structure is documented below.
     * @return builder
     */
    def gpuSharingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorGpuSharingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorGpuSharingConfigArgs.builder
      builder.gpuSharingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsArgs.Builder)
    /**
     * @param containerdConfig Parameters for containerd configuration.
     * @return builder
     */
    def containerdConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigArgs.builder
      builder.containerdConfig(args(argsBuilder).build)

    /**
     * @param gcfsConfig The default Google Container Filesystem (GCFS) configuration at the cluster level. e.g. enable [image streaming](https://cloud.google.com/kubernetes-engine/docs/how-to/image-streaming) across all the node pools within the cluster. Structure is documented below.
     * @return builder
     */
    def gcfsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsGcfsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsGcfsConfigArgs.builder
      builder.gcfsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.Builder)
    /**
     * @param linuxNodeConfig Linux system configuration for the cluster&#39;s automatically provisioned node pools. Only `cgroupMode` and `nodeKernelModuleLoading` fields are supported in `nodePoolAutoConfig`. Structure is documented below.
     * @return builder
     */
    def linuxNodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigLinuxNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigLinuxNodeConfigArgs.builder
      builder.linuxNodeConfig(args(argsBuilder).build)

    /**
     * @param networkTags The network tag config for the cluster&#39;s automatically provisioned node pools. Structure is documented below.
     * @return builder
     */
    def networkTags(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigNetworkTagsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigNetworkTagsArgs.builder
      builder.networkTags(args(argsBuilder).build)

    /**
     * @param nodeKubeletConfig Kubelet configuration for Autopilot clusters. Currently, only `insecureKubeletReadonlyPortEnabled` is supported here.
     *  Structure is documented below.
     * @return builder
     */
    def nodeKubeletConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigNodeKubeletConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigNodeKubeletConfigArgs.builder
      builder.nodeKubeletConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsArgs.Builder)
    /**
     * @param nodeConfigDefaults Subset of NodeConfig message that has defaults.
     * @return builder
     */
    def nodeConfigDefaults(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsArgs.builder
      builder.nodeConfigDefaults(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigArgs.Builder)
    /**
     * @param componentConfig Configuration of the logging components.
     * @return builder
     */
    def componentConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigComponentConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigComponentConfigArgs.builder
      builder.componentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.Builder)
    /**
     * @param proxyConfig Proxy configuration for outbound HTTP(S) traffic.
     * @return builder
     */
    def proxyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolConfigProxyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolConfigProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

    /**
     * @param rootVolume Optional. Configuration related to the root volume provisioned for each node pool machine. When unspecified, it defaults to a 32-GiB Azure Disk.
     * @return builder
     */
    def rootVolume(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolConfigRootVolumeArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolConfigRootVolumeArgs.builder
      builder.rootVolume(args(argsBuilder).build)

    /**
     * @param sshConfig SSH configuration for how to access the node pool machines.
     * @return builder
     */
    def sshConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolConfigSshConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolConfigSshConfigArgs.builder
      builder.sshConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder)
    /**
     * @param advancedMachineFeatures Specifies options for controlling
     *  advanced machine features. Structure is documented below.
     * @return builder
     */
    def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param bootDisk Configuration of the node pool boot disk. Structure is documented below
     * @return builder
     */
    def bootDisk(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigBootDiskArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialNodes Configuration for Confidential Nodes feature. Structure is documented below.
     * @return builder
     */
    def confidentialNodes(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigConfidentialNodesArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigConfidentialNodesArgs.builder
      builder.confidentialNodes(args(argsBuilder).build)

    /**
     * @param containerdConfig Parameters to customize containerd runtime. Structure is documented below.
     * @return builder
     */
    def containerdConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigArgs.builder
      builder.containerdConfig(args(argsBuilder).build)

    /**
     * @param effectiveTaints List of kubernetes taints applied to each node. Structure is documented above.
     * @return builder
     */
    def effectiveTaints(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigEffectiveTaintArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigEffectiveTaintArgs.builder
      builder.effectiveTaints(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralStorageConfig ) Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * @return builder
     */
    def ephemeralStorageConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigEphemeralStorageConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigEphemeralStorageConfigArgs.builder
      builder.ephemeralStorageConfig(args(argsBuilder).build)

    /**
     * @param ephemeralStorageLocalSsdConfig Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * @return builder
     */
    def ephemeralStorageLocalSsdConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigEphemeralStorageLocalSsdConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigEphemeralStorageLocalSsdConfigArgs.builder
      builder.ephemeralStorageLocalSsdConfig(args(argsBuilder).build)

    /**
     * @param fastSocket Parameters for the NCCL Fast Socket feature. If unspecified, NCCL Fast Socket will not be enabled on the node pool.
     *  Node Pool must enable gvnic.
     *  GKE version 1.25.2-gke.1700 or later.
     *  Structure is documented below.
     * @return builder
     */
    def fastSocket(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigFastSocketArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigFastSocketArgs.builder
      builder.fastSocket(args(argsBuilder).build)

    /**
     * @param gcfsConfig Parameters for the Google Container Filesystem (GCFS).
     *  If unspecified, GCFS will not be enabled on the node pool. When enabling this feature you must specify `imageType = &#34;COS_CONTAINERD&#34;` and `nodeVersion` from GKE versions 1.19 or later to use it.
     *  For GKE versions 1.19, 1.20, and 1.21, the recommended minimum `nodeVersion` would be 1.19.15-gke.1300, 1.20.11-gke.1300, and 1.21.5-gke.1300 respectively.
     *  A `machineType` that has more than 16 GiB of memory is also recommended.
     *  GCFS must be enabled in order to use [image streaming](https://cloud.google.com/kubernetes-engine/docs/how-to/image-streaming).
     *  Structure is documented below.
     * @return builder
     */
    def gcfsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigGcfsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigGcfsConfigArgs.builder
      builder.gcfsConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance.
     *  Structure documented below.
     * @return builder
     */
    def guestAccelerators(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param gvnic Google Virtual NIC (gVNIC) is a virtual network interface.
     *  Installing the gVNIC driver allows for more efficient traffic transmission across the Google network infrastructure.
     *  gVNIC is an alternative to the virtIO-based ethernet driver. GKE nodes must use a Container-Optimized OS node image.
     *  GKE node version 1.15.11-gke.15 or later
     *  Structure is documented below.
     * @return builder
     */
    def gvnic(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigGvnicArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigGvnicArgs.builder
      builder.gvnic(args(argsBuilder).build)

    /**
     * @param hostMaintenancePolicy The maintenance policy for the hosts on which the GKE VMs run on.
     * @return builder
     */
    def hostMaintenancePolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigHostMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigHostMaintenancePolicyArgs.builder
      builder.hostMaintenancePolicy(args(argsBuilder).build)

    /**
     * @param kubeletConfig Kubelet configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     *  Structure is documented below.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param linuxNodeConfig Parameters that can be configured on Linux nodes. Structure is documented below.
     * @return builder
     */
    def linuxNodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs.builder
      builder.linuxNodeConfig(args(argsBuilder).build)

    /**
     * @param localNvmeSsdBlockConfig Parameters for the local NVMe SSDs. Structure is documented below.
     * @return builder
     */
    def localNvmeSsdBlockConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLocalNvmeSsdBlockConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLocalNvmeSsdBlockConfigArgs.builder
      builder.localNvmeSsdBlockConfig(args(argsBuilder).build)

    /**
     * @param reservationAffinity The configuration of the desired reservation which instances could take capacity from. Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigReservationAffinityArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param sandboxConfig [GKE Sandbox](https://cloud.google.com/kubernetes-engine/docs/how-to/sandbox-pods) configuration. When enabling this feature you must specify `imageType = &#34;COS_CONTAINERD&#34;` and `nodeVersion = &#34;1.12.7-gke.17&#34;` or later to use it.
     *  Structure is documented below.
     * @return builder
     */
    def sandboxConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigSandboxConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigSandboxConfigArgs.builder
      builder.sandboxConfig(args(argsBuilder).build)

    /**
     * @param secondaryBootDisks Parameters for secondary boot disks to preload container images and data on new nodes. Structure is documented below. `gcfsConfig` must be `enabled=true` for this feature to work. `minMasterVersion` must also be set to use GKE 1.28.3-gke.106700 or later versions.
     * @return builder
     */
    def secondaryBootDisks(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigSecondaryBootDiskArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigSecondaryBootDiskArgs.builder
      builder.secondaryBootDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param shieldedInstanceConfig Shielded Instance options. Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param soleTenantConfig Allows specifying multiple [node affinities](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes#node_affinity_and_anti-affinity) useful for running workloads on [sole tenant nodes](https://cloud.google.com/kubernetes-engine/docs/how-to/sole-tenancy). Structure is documented below.
     * @return builder
     */
    def soleTenantConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigSoleTenantConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigSoleTenantConfigArgs.builder
      builder.soleTenantConfig(args(argsBuilder).build)

    /**
     * @param taints A list of
     *  [Kubernetes taints](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/)
     *  to apply to nodes. This field will only report drift on taint keys that are
     *  already managed with Pulumi, use `effectiveTaints` to view the list of
     *  GKE-managed taints on the node pool from all sources. Importing this resource
     *  will not record any taints as being Pulumi-managed, and will cause drift with
     *  any configured taints. Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigTaintArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsNodeConfig Windows node configuration, currently supporting OSVersion [attribute](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/NodeConfig#osversion). The value must be one of [OS_VERSION_UNSPECIFIED, OS_VERSION_LTSC2019, OS_VERSION_LTSC2022]. For example:
     * @return builder
     */
    def windowsNodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigWindowsNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigWindowsNodeConfigArgs.builder
      builder.windowsNodeConfig(args(argsBuilder).build)

    /**
     * @param workloadMetadataConfig Metadata configuration to expose to workloads on the node pool.
     *  Structure is documented below.
     * @return builder
     */
    def workloadMetadataConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigWorkloadMetadataConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigWorkloadMetadataConfigArgs.builder
      builder.workloadMetadataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSoleTenantConfigArgs.Builder)
    /**
     * @param nodeAffinities The node affinity settings for the sole tenant node pool. Structure is documented below.
     * @return builder
     */
    def nodeAffinities(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSoleTenantConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSoleTenantConfigNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsArgs.Builder)
    /**
     * @param surgeSettings Optional. Settings for surge update.
     * @return builder
     */
    def surgeSettings(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsSurgeSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsSurgeSettingsArgs.builder
      builder.surgeSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder)
    /**
     * @param cert Configures the client certificate.
     * @return builder
     */
    def cert(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientCertArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientCertArgs.builder
      builder.cert(args(argsBuilder).build)

    /**
     * @param key Configures the client private key.
     * @return builder
     */
    def key(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientKeyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientKeyArgs.builder
      builder.key(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigArgs.Builder)
    /**
     * @param dnsEndpointConfig DNS endpoint configuration.
     * @return builder
     */
    def dnsEndpointConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigDnsEndpointConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigDnsEndpointConfigArgs.builder
      builder.dnsEndpointConfig(args(argsBuilder).build)

    /**
     * @param ipEndpointsConfig IP endpoint configuration.
     * @return builder
     */
    def ipEndpointsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigIpEndpointsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigIpEndpointsConfigArgs.builder
      builder.ipEndpointsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigArgs.Builder)
    /**
     * @param privateRegistryAccessConfig Configuration for private container registries. There are two fields in this config:
     * @return builder
     */
    def privateRegistryAccessConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigArgs.builder
      builder.privateRegistryAccessConfig(args(argsBuilder).build)

    /**
     * @param registryHosts Defines containerd registry host configuration. Each `registryHosts` entry represents a `hosts.toml` file. See [customize containerd configuration in GKE nodes](https://docs.cloud.google.com/kubernetes-engine/docs/how-to/customize-containerd-configuration#registryHosts) for more detail. Example:
     * @return builder
     */
    def registryHosts(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostArgs.builder
      builder.registryHosts(args.map(_(argsBuilder).build)*)

    /**
     * @param writableCgroups Configuration for writable cgroups. This allows containers to have a writable `/sys/fs/cgroup` directory, which is required for some workloads to create their own sub-cgroups. The `writableCgroups` block supports:
     * @return builder
     */
    def writableCgroups(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigWritableCgroupsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigWritableCgroupsArgs.builder
      builder.writableCgroups(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder)
    /**
     * @param cloudrunConfig . Structure is documented below.
     * @return builder
     */
    def cloudrunConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigCloudrunConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigCloudrunConfigArgs.builder
      builder.cloudrunConfig(args(argsBuilder).build)

    /**
     * @param configConnectorConfig .
     *  The status of the ConfigConnector addon. It is disabled by default; Set `enabled = true` to enable.
     * @return builder
     */
    def configConnectorConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigConfigConnectorConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigConfigConnectorConfigArgs.builder
      builder.configConnectorConfig(args(argsBuilder).build)

    /**
     * @param dnsCacheConfig .
     *  The status of the NodeLocal DNSCache addon. It is disabled by default.
     *  Set `enabled = true` to enable.
     * 
     *  **Enabling/Disabling NodeLocal DNSCache in an existing cluster is a disruptive operation.
     *  All cluster nodes running GKE 1.15 and higher are recreated.**
     * @return builder
     */
    def dnsCacheConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigDnsCacheConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigDnsCacheConfigArgs.builder
      builder.dnsCacheConfig(args(argsBuilder).build)

    /**
     * @param gcePersistentDiskCsiDriverConfig .
     *  Whether this cluster should enable the Google Compute Engine Persistent Disk Container Storage Interface (CSI) Driver. Set `enabled = true` to enable.
     * 
     *  **Note:** The Compute Engine persistent disk CSI Driver is enabled by default on newly created clusters for the following versions: Linux clusters: GKE version 1.18.10-gke.2100 or later, or 1.19.3-gke.2100 or later.
     * @return builder
     */
    def gcePersistentDiskCsiDriverConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigGcePersistentDiskCsiDriverConfigArgs.builder
      builder.gcePersistentDiskCsiDriverConfig(args(argsBuilder).build)

    /**
     * @param gcpFilestoreCsiDriverConfig The status of the Filestore CSI driver addon,
     *  which allows the usage of filestore instance as volumes.
     *  It is disabled by default; set `enabled = true` to enable.
     * @return builder
     */
    def gcpFilestoreCsiDriverConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigGcpFilestoreCsiDriverConfigArgs.builder
      builder.gcpFilestoreCsiDriverConfig(args(argsBuilder).build)

    /**
     * @param gcsFuseCsiDriverConfig The status of the GCSFuse CSI driver addon,
     *  which allows the usage of a gcs bucket as volumes.
     *  It is disabled by default for Standard clusters; set `enabled = true` to enable.
     *  It is enabled by default for Autopilot clusters with version 1.24 or later; set `enabled = true` to enable it explicitly.
     *  See [Enable the Cloud Storage FUSE CSI driver](https://cloud.google.com/kubernetes-engine/docs/how-to/persistent-volumes/cloud-storage-fuse-csi-driver#enable) for more information.
     * @return builder
     */
    def gcsFuseCsiDriverConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigGcsFuseCsiDriverConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigGcsFuseCsiDriverConfigArgs.builder
      builder.gcsFuseCsiDriverConfig(args(argsBuilder).build)

    /**
     * @param gkeBackupAgentConfig .
     *  The status of the Backup for GKE agent addon. It is disabled by default; Set `enabled = true` to enable.
     * @return builder
     */
    def gkeBackupAgentConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigGkeBackupAgentConfigArgs.builder
      builder.gkeBackupAgentConfig(args(argsBuilder).build)

    /**
     * @param horizontalPodAutoscaling The status of the Horizontal Pod Autoscaling
     *  addon, which increases or decreases the number of replica pods a replication controller
     *  has based on the resource usage of the existing pods.
     *  It is enabled by default;
     *  set `disabled = true` to disable.
     * @return builder
     */
    def horizontalPodAutoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigHorizontalPodAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigHorizontalPodAutoscalingArgs.builder
      builder.horizontalPodAutoscaling(args(argsBuilder).build)

    /**
     * @param httpLoadBalancing The status of the HTTP (L7) load balancing
     *  controller addon, which makes it easy to set up HTTP load balancers for services in a
     *  cluster. It is enabled by default; set `disabled = true` to disable.
     * @return builder
     */
    def httpLoadBalancing(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigHttpLoadBalancingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigHttpLoadBalancingArgs.builder
      builder.httpLoadBalancing(args(argsBuilder).build)

    /**
     * @param istioConfig ).
     *  Structure is documented below.
     * @return builder
     */
    def istioConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigIstioConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigIstioConfigArgs.builder
      builder.istioConfig(args(argsBuilder).build)

    /**
     * @param kalmConfig ).
     *  Configuration for the KALM addon, which manages the lifecycle of k8s. It is disabled by default; Set `enabled = true` to enable.
     * @return builder
     */
    def kalmConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigKalmConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigKalmConfigArgs.builder
      builder.kalmConfig(args(argsBuilder).build)

    /**
     * @param lustreCsiDriverConfig The status of the Lustre CSI driver addon,
     *  which allows the usage of a Lustre instances as volumes.
     *  It is disabled by default for Standard clusters; set `enabled = true` to enable.
     *  It is disabled by default for Autopilot clusters; set `enabled = true` to enable.
     *  See [Enable Lustre CSI driver](https://cloud.google.com/kubernetes-engine/docs/how-to/persistent-volumes/lustre-csi-driver-new-volume) for more information.
     *  Lustre CSI Driver Config has optional subfields:
     * @return builder
     */
    def lustreCsiDriverConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigLustreCsiDriverConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigLustreCsiDriverConfigArgs.builder
      builder.lustreCsiDriverConfig(args(argsBuilder).build)

    /**
     * @param networkPolicyConfig Whether we should enable the network policy addon
     *  for the master.  This must be enabled in order to enable network policy for the nodes.
     *  To enable this, you must also define a `networkPolicy` block,
     *  otherwise nothing will happen.
     *  It can only be disabled if the nodes already do not have network policies enabled.
     *  Defaults to disabled; set `disabled = false` to enable.
     * @return builder
     */
    def networkPolicyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigNetworkPolicyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigNetworkPolicyConfigArgs.builder
      builder.networkPolicyConfig(args(argsBuilder).build)

    /**
     * @param parallelstoreCsiDriverConfig The status of the Parallelstore CSI driver addon,
     *  which allows the usage of a Parallelstore instances as volumes.
     *  It is disabled by default for Standard clusters; set `enabled = true` to enable.
     *  It is enabled by default for Autopilot clusters with version 1.29 or later; set `enabled = true` to enable it explicitly.
     *  See [Enable the Parallelstore CSI driver](https://cloud.google.com/kubernetes-engine/docs/how-to/persistent-volumes/parallelstore-csi-new-volume#enable) for more information.
     * @return builder
     */
    def parallelstoreCsiDriverConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigParallelstoreCsiDriverConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigParallelstoreCsiDriverConfigArgs.builder
      builder.parallelstoreCsiDriverConfig(args(argsBuilder).build)

    /**
     * @param podSnapshotConfig ) The status of the Pod Snapshot addon. It is disabled by default. Set `enabled = true` to enable.
     * 
     *  This example `addonsConfig` disables two addons:
     * @return builder
     */
    def podSnapshotConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigPodSnapshotConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigPodSnapshotConfigArgs.builder
      builder.podSnapshotConfig(args(argsBuilder).build)

    /**
     * @param rayOperatorConfigs . The status of the [Ray Operator
     *  addon](https://cloud.google.com/kubernetes-engine/docs/add-on/ray-on-gke/concepts/overview).
     *  It is disabled by default. Set `enabled = true` to enable. The minimum
     *  cluster version to enable Ray is 1.30.0-gke.1747000.
     * 
     *  Ray Operator config has optional subfields
     *  `ray_cluster_logging_config.enabled` and
     *  `ray_cluster_monitoring_config.enabled` which control Ray Cluster logging
     *  and monitoring respectively. See [Collect and view logs and metrics for Ray
     *  clusters on
     *  GKE](https://cloud.google.com/kubernetes-engine/docs/add-on/ray-on-gke/how-to/collect-view-logs-metrics)
     *  for more information.
     * @return builder
     */
    def rayOperatorConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigArgs.builder
      builder.rayOperatorConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param sliceControllerConfig .
     *  The status of the slice controller addon.
     *  It is disabled by default. Set `enabled = true` to enable.
     * @return builder
     */
    def sliceControllerConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigSliceControllerConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigSliceControllerConfigArgs.builder
      builder.sliceControllerConfig(args(argsBuilder).build)

    /**
     * @param statefulHaConfig .
     *  The status of the Stateful HA addon, which provides automatic configurable failover for stateful applications.
     *  It is disabled by default for Standard clusters. Set `enabled = true` to enable.
     * @return builder
     */
    def statefulHaConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigStatefulHaConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigStatefulHaConfigArgs.builder
      builder.statefulHaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigArgs.Builder)
    /**
     * @param privateRegistryAccessConfig Configuration for private container registries. There are two fields in this config:
     * @return builder
     */
    def privateRegistryAccessConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.builder
      builder.privateRegistryAccessConfig(args(argsBuilder).build)

    /**
     * @param registryHosts Defines containerd registry host configuration. Each `registryHosts` entry represents a `hosts.toml` file. See [customize containerd configuration in GKE nodes](https://docs.cloud.google.com/kubernetes-engine/docs/how-to/customize-containerd-configuration#registryHosts) for more detail. Example:
     * @return builder
     */
    def registryHosts(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostArgs.builder
      builder.registryHosts(args.map(_(argsBuilder).build)*)

    /**
     * @param writableCgroups Configuration for writable cgroups. This allows containers to have a writable `/sys/fs/cgroup` directory, which is required for some workloads to create their own sub-cgroups. The `writableCgroups` block supports:
     * @return builder
     */
    def writableCgroups(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigWritableCgroupsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigWritableCgroupsArgs.builder
      builder.writableCgroups(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterState.Builder)
    /**
     * @param addonsConfig The configuration for addons supported by GKE.
     *  Structure is documented below.
     * @return builder
     */
    def addonsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigArgs.builder
      builder.addonsConfig(args(argsBuilder).build)

    /**
     * @param anonymousAuthenticationConfig Configuration for [anonymous authentication restrictions](https://cloud.google.com/kubernetes-engine/docs/how-to/hardening-your-cluster#restrict-anon-access). Structure is documented below.
     * @return builder
     */
    def anonymousAuthenticationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAnonymousAuthenticationConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAnonymousAuthenticationConfigArgs.builder
      builder.anonymousAuthenticationConfig(args(argsBuilder).build)

    /**
     * @param authenticatorGroupsConfig Configuration for the
     *  [Google Groups for GKE](https://cloud.google.com/kubernetes-engine/docs/how-to/role-based-access-control#groups-setup-gsuite) feature.
     *  Structure is documented below.
     * @return builder
     */
    def authenticatorGroupsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAuthenticatorGroupsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAuthenticatorGroupsConfigArgs.builder
      builder.authenticatorGroupsConfig(args(argsBuilder).build)

    /**
     * @param autopilotClusterPolicyConfig Per-cluster configuration of Autopilot cluster policies in GKE clusters. This field can only be configured in non Autopilot clusters. Structure is documented below.
     * @return builder
     */
    def autopilotClusterPolicyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAutopilotClusterPolicyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAutopilotClusterPolicyConfigArgs.builder
      builder.autopilotClusterPolicyConfig(args(argsBuilder).build)

    /**
     * @param binaryAuthorization Configuration options for the Binary
     *  Authorization feature. Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param clusterAutoscaling Per-cluster configuration of Node Auto-Provisioning with Cluster Autoscaler to
     *  automatically adjust the size of the cluster and create/delete node pools based
     *  on the current needs of the cluster&#39;s workload. See the
     *  [guide to using Node Auto-Provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)
     *  for more details. Structure is documented below.
     * @return builder
     */
    def clusterAutoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingArgs.builder
      builder.clusterAutoscaling(args(argsBuilder).build)

    /**
     * @param clusterTelemetry ) Configuration for
     *  [ClusterTelemetry](https://cloud.google.com/monitoring/kubernetes-engine/installing#controlling_the_collection_of_application_logs) feature,
     *  Structure is documented below.
     * @return builder
     */
    def clusterTelemetry(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterTelemetryArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterTelemetryArgs.builder
      builder.clusterTelemetry(args(argsBuilder).build)

    /**
     * @param confidentialNodes Configuration for [Confidential Nodes](https://cloud.google.com/kubernetes-engine/docs/how-to/confidential-gke-nodes) feature. Structure is documented below documented below.
     * @return builder
     */
    def confidentialNodes(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterConfidentialNodesArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterConfidentialNodesArgs.builder
      builder.confidentialNodes(args(argsBuilder).build)

    /**
     * @param controlPlaneEndpointsConfig Configuration for all of the cluster&#39;s control plane endpoints.
     *  Structure is documented below.
     * @return builder
     */
    def controlPlaneEndpointsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterControlPlaneEndpointsConfigArgs.builder
      builder.controlPlaneEndpointsConfig(args(argsBuilder).build)

    /**
     * @param costManagementConfig Configuration for the
     *  [Cost Allocation](https://cloud.google.com/kubernetes-engine/docs/how-to/cost-allocations) feature.
     *  Structure is documented below.
     * @return builder
     */
    def costManagementConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterCostManagementConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterCostManagementConfigArgs.builder
      builder.costManagementConfig(args(argsBuilder).build)

    /**
     * @param databaseEncryption Structure is documented below.
     * @return builder
     */
    def databaseEncryption(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterDatabaseEncryptionArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterDatabaseEncryptionArgs.builder
      builder.databaseEncryption(args(argsBuilder).build)

    /**
     * @param defaultSnatStatus [GKE SNAT](https://cloud.google.com/kubernetes-engine/docs/how-to/ip-masquerade-agent#how_ipmasq_works) DefaultSnatStatus contains the desired state of whether default sNAT should be disabled on the cluster, [API doc](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters#networkconfig). Structure is documented below
     * @return builder
     */
    def defaultSnatStatus(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterDefaultSnatStatusArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterDefaultSnatStatusArgs.builder
      builder.defaultSnatStatus(args(argsBuilder).build)

    /**
     * @param dnsConfig Configuration for [Using Cloud DNS for GKE](https://cloud.google.com/kubernetes-engine/docs/how-to/cloud-dns). Structure is documented below.
     * @return builder
     */
    def dnsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterDnsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterDnsConfigArgs.builder
      builder.dnsConfig(args(argsBuilder).build)

    /**
     * @param enableK8sBetaApis Configuration for Kubernetes Beta APIs.
     *  Structure is documented below.
     * @return builder
     */
    def enableK8sBetaApis(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterEnableK8sBetaApisArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterEnableK8sBetaApisArgs.builder
      builder.enableK8sBetaApis(args(argsBuilder).build)

    /**
     * @param enterpriseConfig (DEPRECATED) Configuration for [Enterprise edition].(https://cloud.google.com/kubernetes-engine/enterprise/docs/concepts/gke-editions). Structure is documented below. Deprecated as GKE Enterprise features are now available without an Enterprise tier. See https://cloud.google.com/blog/products/containers-kubernetes/gke-gets-new-pricing-and-capabilities-on-10th-birthday for the announcement of this change.
     * @return builder
     * @deprecated GKE Enterprise features are now available without an Enterprise tier. This field is deprecated and will be removed in a future major release
     */
    @deprecated def enterpriseConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterEnterpriseConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterEnterpriseConfigArgs.builder
      builder.enterpriseConfig(args(argsBuilder).build)

    /**
     * @param fleet Fleet configuration for the cluster. Structure is documented below.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param gatewayApiConfig Configuration for [GKE Gateway API controller](https://cloud.google.com/kubernetes-engine/docs/concepts/gateway-api). Structure is documented below.
     * @return builder
     */
    def gatewayApiConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterGatewayApiConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterGatewayApiConfigArgs.builder
      builder.gatewayApiConfig(args(argsBuilder).build)

    /**
     * @param gkeAutoUpgradeConfig Configuration options for the auto-upgrade patch type feature, which provide more control over the speed of automatic upgrades of your GKE clusters.
     *  Structure is documented below.
     * @return builder
     */
    def gkeAutoUpgradeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterGkeAutoUpgradeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterGkeAutoUpgradeConfigArgs.builder
      builder.gkeAutoUpgradeConfig(args(argsBuilder).build)

    /**
     * @param identityServiceConfig . Structure is documented below.
     * @return builder
     */
    def identityServiceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIdentityServiceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIdentityServiceConfigArgs.builder
      builder.identityServiceConfig(args(argsBuilder).build)

    /**
     * @param ipAllocationPolicy Configuration of cluster IP allocation for
     *  VPC-native clusters. If this block is unset during creation, it will be set by the GKE backend.
     *  Structure is documented below.
     * @return builder
     */
    def ipAllocationPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.builder
      builder.ipAllocationPolicy(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param maintenancePolicy The maintenance policy to use for the cluster. Structure is
     *  documented below.
     * @return builder
     */
    def maintenancePolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.builder
      builder.maintenancePolicy(args(argsBuilder).build)

    /**
     * @param managedMachineLearningDiagnosticsConfig ) Configuration for the [GKE Managed ML Diagnostics](https://docs.cloud.google.com/kubernetes-engine/docs/concepts/TODO) feature. Structure is documented below.
     * @return builder
     */
    def managedMachineLearningDiagnosticsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterManagedMachineLearningDiagnosticsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterManagedMachineLearningDiagnosticsConfigArgs.builder
      builder.managedMachineLearningDiagnosticsConfig(args(argsBuilder).build)

    /**
     * @param managedOpentelemetryConfig ) Configuration for the [GKE Managed OpenTelemetry](https://docs.cloud.google.com/kubernetes-engine/docs/concepts/managed-otel-gke) feature. Structure is documented below.
     * @return builder
     */
    def managedOpentelemetryConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterManagedOpentelemetryConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterManagedOpentelemetryConfigArgs.builder
      builder.managedOpentelemetryConfig(args(argsBuilder).build)

    /**
     * @param masterAuth The authentication information for accessing the
     *  Kubernetes master. Some values in this block are only returned by the API if
     *  your service account has permission to get credentials for your GKE cluster. If
     *  you see an unexpected diff unsetting your client cert, ensure you have the
     *  `container.clusters.getCredentials` permission.
     *  Structure is documented below.
     * @return builder
     */
    def masterAuth(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMasterAuthArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMasterAuthArgs.builder
      builder.masterAuth(args(argsBuilder).build)

    /**
     * @param masterAuthorizedNetworksConfig The desired
     *  configuration options for master authorized networks. Omit the
     *  nested `cidrBlocks` attribute to disallow external access (except
     *  the cluster node IPs, which GKE automatically whitelists).
     *  Structure is documented below.
     * @return builder
     */
    def masterAuthorizedNetworksConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigArgs.builder
      builder.masterAuthorizedNetworksConfig(args(argsBuilder).build)

    /**
     * @param meshCertificates Structure is documented below.
     * @return builder
     */
    def meshCertificates(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMeshCertificatesArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMeshCertificatesArgs.builder
      builder.meshCertificates(args(argsBuilder).build)

    /**
     * @param monitoringConfig Monitoring configuration for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

    /**
     * @param networkPerformanceConfig Network bandwidth tier configuration.
     * @return builder
     */
    def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param networkPolicy Configuration options for the
     *  [NetworkPolicy](https://kubernetes.io/docs/concepts/services-networking/networkpolicies/)
     *  feature. Structure is documented below.
     * @return builder
     */
    def networkPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNetworkPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNetworkPolicyArgs.builder
      builder.networkPolicy(args(argsBuilder).build)

    /**
     * @param nodeConfig Parameters used in creating the default node pool.
     *  Generally, this field should not be used at the same time as a
     *  `gcp.container.NodePool` or a `nodePool` block; this configuration
     *  manages the default node pool, which isn&#39;t recommended to be used.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param nodePoolAutoConfig Node pool configs that apply to auto-provisioned node pools in
     *  [autopilot](https://cloud.google.com/kubernetes-engine/docs/concepts/autopilot-overview#comparison) clusters and
     *  [node auto-provisioning](https://cloud.google.com/kubernetes-engine/docs/how-to/node-auto-provisioning)-enabled clusters. Structure is documented below.
     * @return builder
     */
    def nodePoolAutoConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigArgs.builder
      builder.nodePoolAutoConfig(args(argsBuilder).build)

    /**
     * @param nodePoolDefaults Default NodePool settings for the entire cluster. These settings are overridden if specified on the specific NodePool object. Structure is documented below.
     * @return builder
     */
    def nodePoolDefaults(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsArgs.builder
      builder.nodePoolDefaults(args(argsBuilder).build)

    /**
     * @param nodePools List of node pools associated with this cluster.
     *  See gcp.container.NodePool for schema.
     *  **Warning:** node pools defined inside a cluster can&#39;t be changed (or added/removed) after
     *  cluster creation without deleting and recreating the entire cluster. Unless you absolutely need the ability
     *  to say &#34;these are the _only_ node pools associated with this cluster&#34;, use the
     *  gcp.container.NodePool resource instead of this property.
     * @return builder
     */
    def nodePools(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.builder
      builder.nodePools(args.map(_(argsBuilder).build)*)

    /**
     * @param notificationConfig Configuration for the [cluster upgrade notifications](https://cloud.google.com/kubernetes-engine/docs/how-to/cluster-upgrade-notifications) feature. Structure is documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNotificationConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param podAutoscaling Configuration for the
     *  Structure is documented below.
     * @return builder
     */
    def podAutoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterPodAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterPodAutoscalingArgs.builder
      builder.podAutoscaling(args(argsBuilder).build)

    /**
     * @param podSecurityPolicyConfig ) Configuration for the
     *  [PodSecurityPolicy](https://cloud.google.com/kubernetes-engine/docs/how-to/pod-security-policies) feature.
     *  Structure is documented below.
     * @return builder
     */
    def podSecurityPolicyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterPodSecurityPolicyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterPodSecurityPolicyConfigArgs.builder
      builder.podSecurityPolicyConfig(args(argsBuilder).build)

    /**
     * @param privateClusterConfig Configuration for [private clusters](https://cloud.google.com/kubernetes-engine/docs/how-to/private-clusters),
     *  clusters with private nodes. Structure is documented below.
     * @return builder
     */
    def privateClusterConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigArgs.builder
      builder.privateClusterConfig(args(argsBuilder).build)

    /**
     * @param protectConfig )
     *  Enable/Disable Protect API features for the cluster. Structure is documented below.
     * @return builder
     */
    def protectConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterProtectConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterProtectConfigArgs.builder
      builder.protectConfig(args(argsBuilder).build)

    /**
     * @param rbacBindingConfig RBACBindingConfig allows user to restrict ClusterRoleBindings an RoleBindings that can be created. Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedDefaultSnatStatus&#34;&gt;&lt;/a&gt;The `defaultSnatStatus` block supports
     * @return builder
     */
    def rbacBindingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterRbacBindingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterRbacBindingConfigArgs.builder
      builder.rbacBindingConfig(args(argsBuilder).build)

    /**
     * @param releaseChannel Configuration options for the [Release channel](https://cloud.google.com/kubernetes-engine/docs/concepts/release-channels)
     *  feature, which provide more control over automatic upgrades of your GKE clusters.
     *  When updating this field, GKE imposes specific version requirements. See
     *  [Selecting a new release channel](https://cloud.google.com/kubernetes-engine/docs/concepts/release-channels#selecting_a_new_release_channel)
     *  for more details; the `gcp.container.getEngineVersions` datasource can provide
     *  the default version for a channel. Note that removing the `releaseChannel`
     *  field from your config will cause the provider to stop managing your cluster&#39;s
     *  release channel, but will not unenroll it. Instead, use the `&#34;UNSPECIFIED&#34;`
     *  channel. Structure is documented below.
     * @return builder
     */
    def releaseChannel(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterReleaseChannelArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterReleaseChannelArgs.builder
      builder.releaseChannel(args(argsBuilder).build)

    /**
     * @param resourceUsageExportConfig Configuration for the
     *  [ResourceUsageExportConfig](https://cloud.google.com/kubernetes-engine/docs/how-to/cluster-usage-metering) feature.
     *  Structure is documented below.
     * @return builder
     */
    def resourceUsageExportConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigArgs.builder
      builder.resourceUsageExportConfig(args(argsBuilder).build)

    /**
     * @param secretManagerConfig Configuration for the
     *  [SecretManagerConfig](https://cloud.google.com/secret-manager/docs/secret-manager-managed-csi-component) feature.
     *  Structure is documented below.
     * @return builder
     */
    def secretManagerConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigArgs.builder
      builder.secretManagerConfig(args(argsBuilder).build)

    /**
     * @param secretSyncConfig ) Configuration for the
     *  [SecretSyncConfig](https://cloud.google.com/secret-manager/docs/sync-k8-secrets) feature.
     *  Structure is documented below.
     * @return builder
     */
    def secretSyncConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigArgs.builder
      builder.secretSyncConfig(args(argsBuilder).build)

    /**
     * @param securityPostureConfig Enable/Disable Security Posture API features for the cluster. Structure is documented below.
     * @return builder
     */
    def securityPostureConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecurityPostureConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecurityPostureConfigArgs.builder
      builder.securityPostureConfig(args(argsBuilder).build)

    /**
     * @param serviceExternalIpsConfig Structure is documented below.
     * @return builder
     */
    def serviceExternalIpsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterServiceExternalIpsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterServiceExternalIpsConfigArgs.builder
      builder.serviceExternalIpsConfig(args(argsBuilder).build)

    /**
     * @param tpuConfig TPU configuration for the cluster.
     * @return builder
     */
    def tpuConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterTpuConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterTpuConfigArgs.builder
      builder.tpuConfig(args(argsBuilder).build)

    /**
     * @param userManagedKeysConfig The custom keys configuration of the cluster Structure is documented below.
     * @return builder
     */
    def userManagedKeysConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterUserManagedKeysConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterUserManagedKeysConfigArgs.builder
      builder.userManagedKeysConfig(args(argsBuilder).build)

    /**
     * @param verticalPodAutoscaling Vertical Pod Autoscaling automatically adjusts the resources of pods controlled by it.
     *  Structure is documented below.
     * @return builder
     */
    def verticalPodAutoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterVerticalPodAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterVerticalPodAutoscalingArgs.builder
      builder.verticalPodAutoscaling(args(argsBuilder).build)

    /**
     * @param workloadAltsConfig )
     *  Configuration for [direct-path (via ALTS) with workload identity.](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters#workloadaltsconfig). Structure is documented below.
     * @return builder
     */
    def workloadAltsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterWorkloadAltsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterWorkloadAltsConfigArgs.builder
      builder.workloadAltsConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfig Workload Identity allows Kubernetes service accounts to act as a user-managed
     *  [Google IAM Service Account](https://cloud.google.com/iam/docs/service-accounts#user-managed_service_accounts).
     *  Structure is documented below.
     * @return builder
     */
    def workloadIdentityConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterWorkloadIdentityConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder)
    /**
     * @param gcpSecretManagerCertificateConfig Parameters for configuring a certificate hosted in GCP SecretManager.
     * @return builder
     */
    def gcpSecretManagerCertificateConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.builder
      builder.gcpSecretManagerCertificateConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigArgs.Builder)
    /**
     * @param certificateAuthorityDomainConfigs List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
     * @return builder
     */
    def certificateAuthorityDomainConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.builder
      builder.certificateAuthorityDomainConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostArgs.Builder)
    /**
     * @param cas Configures the registry host certificate.
     * @return builder
     */
    def cas(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostCaArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostCaArgs.builder
      builder.cas(args.map(_(argsBuilder).build)*)

    /**
     * @param clients Configures the registry host client certificate and key.
     * @return builder
     */
    def clients(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientArgs.builder
      builder.clients(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Configures the registry host headers.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostHeaderArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigArgs.Builder)
    /**
     * @param bigqueryDestination Parameters for using BigQuery as the destination of resource usage export.
     * 
     *  * `bigquery_destination.dataset_id` (Required) - The ID of a BigQuery Dataset. For Example:
     * @return builder
     */
    def bigqueryDestination(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigBigqueryDestinationArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterResourceUsageExportConfigBigqueryDestinationArgs.builder
      builder.bigqueryDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientArgs.Builder)
    /**
     * @param cert Configures the client certificate.
     * @return builder
     */
    def cert(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientCertArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientCertArgs.builder
      builder.cert(args(argsBuilder).build)

    /**
     * @param key Configures the client private key.
     * @return builder
     */
    def key(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientKeyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientKeyArgs.builder
      builder.key(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigArgs.Builder)
    /**
     * @param cidrBlocks External networks that can access the
     *  Kubernetes cluster master through HTTPS.
     * @return builder
     */
    def cidrBlocks(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigCidrBlockArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigCidrBlockArgs.builder
      builder.cidrBlocks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder)
    /**
     * @param cert Configures the client certificate.
     * @return builder
     */
    def cert(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientCertArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientCertArgs.builder
      builder.cert(args(argsBuilder).build)

    /**
     * @param key Configures the client private key.
     * @return builder
     */
    def key(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientKeyArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientKeyArgs.builder
      builder.key(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigArgs.Builder)
    /**
     * @param rotationConfig ) - config for secret sync auto rotation. Structure is docuemented below
     * @return builder
     */
    def rotationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigRotationConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecretSyncConfigRotationConfigArgs.builder
      builder.rotationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsArgs.Builder)
    /**
     * @param blueGreenSettings Settings for blue-green upgrade strategy. To be specified when strategy is set to BLUE_GREEN. Structure is documented below.
     * @return builder
     */
    def blueGreenSettings(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsArgs.builder
      builder.blueGreenSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigArgs.Builder)
    /**
     * @param privateRegistryAccessConfig Parameters for private container registries configuration.
     * @return builder
     */
    def privateRegistryAccessConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.builder
      builder.privateRegistryAccessConfig(args(argsBuilder).build)

    /**
     * @param registryHosts Configures containerd registry host configuration. Each registryHosts entry represents a hosts.toml file.
     * @return builder
     */
    def registryHosts(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostArgs.builder
      builder.registryHosts(args.map(_(argsBuilder).build)*)

    /**
     * @param writableCgroups Parameters for writable cgroups configuration.
     * @return builder
     */
    def writableCgroups(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigWritableCgroupsArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigWritableCgroupsArgs.builder
      builder.writableCgroups(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AwsClusterState.Builder)
    /**
     * @param authorization Configuration related to the cluster RBAC settings.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param binaryAuthorization Configuration options for the Binary Authorization feature.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param controlPlane Configuration related to the cluster control plane.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param fleet Fleet configuration.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param networking Cluster-wide networking configuration.
     * @return builder
     */
    def networking(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterNetworkingArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterNetworkingArgs.builder
      builder.networking(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfigs Output only. Workload Identity settings.
     * @return builder
     */
    def workloadIdentityConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterWorkloadIdentityConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AwsClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigArgs.Builder)
    /**
     * @param masterGlobalAccessConfig Controls cluster master global
     *  access settings. If unset, the provider will no longer manage this field and will
     *  not modify the previously-set value. Structure is documented below.
     * @return builder
     */
    def masterGlobalAccessConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterPrivateClusterConfigMasterGlobalAccessConfigArgs.builder
      builder.masterGlobalAccessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterMonitoringConfigManagedPrometheusArgs.Builder)
    /**
     * @param autoMonitoringConfig Configuration options for GKE Auto-Monitoring.
     * @return builder
     */
    def autoMonitoringConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMonitoringConfigManagedPrometheusArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMonitoringConfigManagedPrometheusAutoMonitoringConfigArgs.builder
      builder.autoMonitoringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.Builder)
    /**
     * @param dailyMaintenanceWindow Time window specified for daily maintenance operations.
     *  Specify `startTime` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format &#34;HH:MM\u201d,
     *  where HH : \[00-23\] and MM : \[00-59\] GMT. For example:
     * 
     *  Examples:
     * @return builder
     */
    def dailyMaintenanceWindow(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyDailyMaintenanceWindowArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyDailyMaintenanceWindowArgs.builder
      builder.dailyMaintenanceWindow(args(argsBuilder).build)

    /**
     * @param disruptionBudget structure documented below
     * 
     *  In beta, one or the other of `recurringWindow` and `dailyMaintenanceWindow` is required if a `maintenancePolicy` block is supplied.
     * @return builder
     */
    def disruptionBudget(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyDisruptionBudgetArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyDisruptionBudgetArgs.builder
      builder.disruptionBudget(args(argsBuilder).build)

    /**
     * @param maintenanceExclusions Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows. A cluster can have up to 20 maintenance exclusions at a time [Maintenance Window and Exclusions](https://cloud.google.com/kubernetes-engine/docs/concepts/maintenance-windows-and-exclusions)
     * @return builder
     */
    def maintenanceExclusions(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.builder
      builder.maintenanceExclusions(args.map(_(argsBuilder).build)*)

    /**
     * @param recurringWindow Time window for recurring maintenance operations.
     * 
     *  Specify `startTime` and `endTime` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) &#34;Zulu&#34; date format.  The start time&#39;s date is
     *  the initial date that the window starts, and the end time is used for calculating duration.  Specify `recurrence` in
     *  [RFC5545](https://tools.ietf.org/html/rfc5545#section-3.8.5.3) RRULE format, to specify when this recurs.
     *  Note that GKE may accept other formats, but will return values in UTC, causing a permanent diff.
     * 
     *  Examples:
     * @return builder
     */
    def recurringWindow(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyRecurringWindowArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyRecurringWindowArgs.builder
      builder.recurringWindow(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder)
    /**
     * @param certificateAuthorityDomainConfigs List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
     * @return builder
     */
    def certificateAuthorityDomainConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.builder
      builder.certificateAuthorityDomainConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.Builder)
    /**
     * @param additionalNodeNetworkConfigs We specify the additional node networks for this node pool using this list. Each node network corresponds to an additional interface.
     *  Structure is documented below
     * @return builder
     */
    def additionalNodeNetworkConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNetworkConfigAdditionalNodeNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNetworkConfigAdditionalNodeNetworkConfigArgs.builder
      builder.additionalNodeNetworkConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param additionalPodNetworkConfigs We specify the additional pod networks for this node pool using this list. Each pod network corresponds to an additional alias IP range for the node.
     *  Structure is documented below
     * @return builder
     */
    def additionalPodNetworkConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNetworkConfigAdditionalPodNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNetworkConfigAdditionalPodNetworkConfigArgs.builder
      builder.additionalPodNetworkConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Network bandwidth tier configuration. Structure is documented below.
     * @return builder
     */
    def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNetworkConfigNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNetworkConfigNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param podCidrOverprovisionConfig Configuration for node-pool level pod cidr overprovision. If not set, the cluster level setting will be inherited. Structure is documented below.
     * @return builder
     */
    def podCidrOverprovisionConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNetworkConfigPodCidrOverprovisionConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNetworkConfigPodCidrOverprovisionConfigArgs.builder
      builder.podCidrOverprovisionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.Builder)
    /**
     * @param evictionMinimumReclaim Defines a map of signal names to percentage that defines minimum reclaims. It describes the minimum amount of a given resource the kubelet will reclaim when performing a pod eviction.
     * @return builder
     */
    def evictionMinimumReclaim(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigEvictionMinimumReclaimArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigEvictionMinimumReclaimArgs.builder
      builder.evictionMinimumReclaim(args(argsBuilder).build)

    /**
     * @param evictionSoft Defines a map of signal names to quantities or percentage that defines soft eviction thresholds.
     * @return builder
     */
    def evictionSoft(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigEvictionSoftArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigEvictionSoftArgs.builder
      builder.evictionSoft(args(argsBuilder).build)

    /**
     * @param evictionSoftGracePeriod Defines a map of signal names to durations that defines grace periods for soft eviction thresholds. Each soft eviction threshold must have a corresponding grace period.
     * @return builder
     */
    def evictionSoftGracePeriod(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigEvictionSoftGracePeriodArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigEvictionSoftGracePeriodArgs.builder
      builder.evictionSoftGracePeriod(args(argsBuilder).build)

    /**
     * @param memoryManager Configuration for the Memory Manager on the node. The memory manager optimizes memory and hugepages allocation for pods, especially those in the Guaranteed QoS class, by influencing NUMA affinity.
     * @return builder
     */
    def memoryManager(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigMemoryManagerArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigMemoryManagerArgs.builder
      builder.memoryManager(args(argsBuilder).build)

    /**
     * @param topologyManager Configuration for the Topology Manager on the node. The Topology Manager aligns CPU, memory, and device resources on a node to optimize performance, especially for NUMA-aware workloads, by ensuring resource co-location.
     * @return builder
     */
    def topologyManager(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigTopologyManagerArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigTopologyManagerArgs.builder
      builder.topologyManager(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigArgs.Builder)
    /**
     * @param managedPrometheusConfig Enable Google Cloud Managed Service for Prometheus in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def managedPrometheusConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigManagedPrometheusConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigManagedPrometheusConfigArgs.builder
      builder.managedPrometheusConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterProtectConfigArgs.Builder)
    /**
     * @param workloadConfig ) WorkloadConfig defines which actions are enabled for a cluster&#39;s workload configurations. Structure is documented below
     * @return builder
     */
    def workloadConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterProtectConfigWorkloadConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterProtectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterProtectConfigWorkloadConfigArgs.builder
      builder.workloadConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder)
    /**
     * @param autoscaledRolloutPolicy Autoscaled rollout policy for blue-green upgrade.
     * @return builder
     */
    def autoscaledRolloutPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsAutoscaledRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsAutoscaledRolloutPolicyArgs.builder
      builder.autoscaledRolloutPolicy(args(argsBuilder).build)

    /**
     * @param standardRolloutPolicy Standard policy for the blue-green upgrade. To be specified when strategy is set to BLUE_GREEN. Structure is documented below.
     * @return builder
     */
    def standardRolloutPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicyArgs.builder
      builder.standardRolloutPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigLinuxNodeConfigArgs.Builder)
    /**
     * @param nodeKernelModuleLoading Settings for kernel module loading. Structure is documented below.
     * @return builder
     */
    def nodeKernelModuleLoading(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolAutoConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.builder
      builder.nodeKernelModuleLoading(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigArgs.Builder)
    /**
     * @param componentConfig Configuration of the logging components.
     * @return builder
     */
    def componentConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigComponentConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterLoggingConfigComponentConfigArgs.builder
      builder.componentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder)
    /**
     * @param advancedMachineFeatures Specifies options for controlling
     *  advanced machine features. Structure is documented below.
     * @return builder
     */
    def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param bootDisk Configuration of the node pool boot disk. Structure is documented below
     * @return builder
     */
    def bootDisk(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigBootDiskArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialNodes Configuration for Confidential Nodes feature. Structure is documented below.
     * @return builder
     */
    def confidentialNodes(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigConfidentialNodesArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigConfidentialNodesArgs.builder
      builder.confidentialNodes(args(argsBuilder).build)

    /**
     * @param containerdConfig Parameters to customize containerd runtime. Structure is documented below.
     * @return builder
     */
    def containerdConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigArgs.builder
      builder.containerdConfig(args(argsBuilder).build)

    /**
     * @param effectiveTaints List of kubernetes taints applied to each node. Structure is documented above.
     * @return builder
     */
    def effectiveTaints(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigEffectiveTaintArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigEffectiveTaintArgs.builder
      builder.effectiveTaints(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralStorageConfig ) Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * @return builder
     */
    def ephemeralStorageConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigEphemeralStorageConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigEphemeralStorageConfigArgs.builder
      builder.ephemeralStorageConfig(args(argsBuilder).build)

    /**
     * @param ephemeralStorageLocalSsdConfig Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * @return builder
     */
    def ephemeralStorageLocalSsdConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs.builder
      builder.ephemeralStorageLocalSsdConfig(args(argsBuilder).build)

    /**
     * @param fastSocket Parameters for the NCCL Fast Socket feature. If unspecified, NCCL Fast Socket will not be enabled on the node pool.
     *  Node Pool must enable gvnic.
     *  GKE version 1.25.2-gke.1700 or later.
     *  Structure is documented below.
     * @return builder
     */
    def fastSocket(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigFastSocketArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigFastSocketArgs.builder
      builder.fastSocket(args(argsBuilder).build)

    /**
     * @param gcfsConfig Parameters for the Google Container Filesystem (GCFS).
     *  If unspecified, GCFS will not be enabled on the node pool. When enabling this feature you must specify `imageType = &#34;COS_CONTAINERD&#34;` and `nodeVersion` from GKE versions 1.19 or later to use it.
     *  For GKE versions 1.19, 1.20, and 1.21, the recommended minimum `nodeVersion` would be 1.19.15-gke.1300, 1.20.11-gke.1300, and 1.21.5-gke.1300 respectively.
     *  A `machineType` that has more than 16 GiB of memory is also recommended.
     *  GCFS must be enabled in order to use [image streaming](https://cloud.google.com/kubernetes-engine/docs/how-to/image-streaming).
     *  Structure is documented below.
     * @return builder
     */
    def gcfsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGcfsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGcfsConfigArgs.builder
      builder.gcfsConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance.
     *  Structure documented below.
     * @return builder
     */
    def guestAccelerators(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param gvnic Google Virtual NIC (gVNIC) is a virtual network interface.
     *  Installing the gVNIC driver allows for more efficient traffic transmission across the Google network infrastructure.
     *  gVNIC is an alternative to the virtIO-based ethernet driver. GKE nodes must use a Container-Optimized OS node image.
     *  GKE node version 1.15.11-gke.15 or later
     *  Structure is documented below.
     * @return builder
     */
    def gvnic(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGvnicArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGvnicArgs.builder
      builder.gvnic(args(argsBuilder).build)

    /**
     * @param hostMaintenancePolicy The maintenance policy for the hosts on which the GKE VMs run on.
     * @return builder
     */
    def hostMaintenancePolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigHostMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigHostMaintenancePolicyArgs.builder
      builder.hostMaintenancePolicy(args(argsBuilder).build)

    /**
     * @param kubeletConfig Kubelet configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     *  Structure is documented below.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param linuxNodeConfig Parameters that can be configured on Linux nodes. Structure is documented below.
     * @return builder
     */
    def linuxNodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs.builder
      builder.linuxNodeConfig(args(argsBuilder).build)

    /**
     * @param localNvmeSsdBlockConfig Parameters for the local NVMe SSDs. Structure is documented below.
     * @return builder
     */
    def localNvmeSsdBlockConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs.builder
      builder.localNvmeSsdBlockConfig(args(argsBuilder).build)

    /**
     * @param reservationAffinity The configuration of the desired reservation which instances could take capacity from. Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigReservationAffinityArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param sandboxConfig [GKE Sandbox](https://cloud.google.com/kubernetes-engine/docs/how-to/sandbox-pods) configuration. When enabling this feature you must specify `imageType = &#34;COS_CONTAINERD&#34;` and `nodeVersion = &#34;1.12.7-gke.17&#34;` or later to use it.
     *  Structure is documented below.
     * @return builder
     */
    def sandboxConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSandboxConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSandboxConfigArgs.builder
      builder.sandboxConfig(args(argsBuilder).build)

    /**
     * @param secondaryBootDisks Parameters for secondary boot disks to preload container images and data on new nodes. Structure is documented below. `gcfsConfig` must be `enabled=true` for this feature to work. `minMasterVersion` must also be set to use GKE 1.28.3-gke.106700 or later versions.
     * @return builder
     */
    def secondaryBootDisks(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSecondaryBootDiskArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSecondaryBootDiskArgs.builder
      builder.secondaryBootDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param shieldedInstanceConfig Shielded Instance options. Structure is documented below.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param soleTenantConfig Allows specifying multiple [node affinities](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes#node_affinity_and_anti-affinity) useful for running workloads on [sole tenant nodes](https://cloud.google.com/kubernetes-engine/docs/how-to/sole-tenancy). Structure is documented below.
     * @return builder
     */
    def soleTenantConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSoleTenantConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSoleTenantConfigArgs.builder
      builder.soleTenantConfig(args(argsBuilder).build)

    /**
     * @param taints A list of
     *  [Kubernetes taints](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/)
     *  to apply to nodes. This field will only report drift on taint keys that are
     *  already managed with Pulumi, use `effectiveTaints` to view the list of
     *  GKE-managed taints on the node pool from all sources. Importing this resource
     *  will not record any taints as being Pulumi-managed, and will cause drift with
     *  any configured taints. Structure is documented below.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigTaintArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsNodeConfig Windows node configuration, currently supporting OSVersion [attribute](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/NodeConfig#osversion). The value must be one of [OS_VERSION_UNSPECIFIED, OS_VERSION_LTSC2019, OS_VERSION_LTSC2022]. For example:
     * @return builder
     */
    def windowsNodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigWindowsNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigWindowsNodeConfigArgs.builder
      builder.windowsNodeConfig(args(argsBuilder).build)

    /**
     * @param workloadMetadataConfig Metadata configuration to expose to workloads on the node pool.
     *  Structure is documented below.
     * @return builder
     */
    def workloadMetadataConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs.builder
      builder.workloadMetadataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterMonitoringConfigArgs.Builder)
    /**
     * @param advancedDatapathObservabilityConfig Configuration for Advanced Datapath Monitoring. Structure is documented below.
     * @return builder
     */
    def advancedDatapathObservabilityConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMonitoringConfigAdvancedDatapathObservabilityConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMonitoringConfigAdvancedDatapathObservabilityConfigArgs.builder
      builder.advancedDatapathObservabilityConfig(args(argsBuilder).build)

    /**
     * @param managedPrometheus Configuration for Managed Service for Prometheus. Structure is documented below.
     * @return builder
     */
    def managedPrometheus(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMonitoringConfigManagedPrometheusArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMonitoringConfigManagedPrometheusArgs.builder
      builder.managedPrometheus(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder)
    /**
     * @param cas Configures the registry host certificate.
     * @return builder
     */
    def cas(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostCaArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostCaArgs.builder
      builder.cas(args.map(_(argsBuilder).build)*)

    /**
     * @param clients Configures the registry host client certificate and key.
     * @return builder
     */
    def clients(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.builder
      builder.clients(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Configures the registry host headers.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostHeaderArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder)
    /**
     * @param certificateAuthorityDomainConfigs List of configuration objects for CA and domains. Each object identifies a certificate and its assigned domains. See [how to configure for private container registries](https://cloud.google.com/kubernetes-engine/docs/how-to/access-private-registries-private-certificates) for more detail. Example:
     * @return builder
     */
    def certificateAuthorityDomainConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.builder
      builder.certificateAuthorityDomainConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder)
    /**
     * @param databaseEncryption Optional. Configuration related to application-layer secrets encryption.
     * @return builder
     */
    def databaseEncryption(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneDatabaseEncryptionArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneDatabaseEncryptionArgs.builder
      builder.databaseEncryption(args(argsBuilder).build)

    /**
     * @param mainVolume Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. When unspecified, it defaults to a 8-GiB Azure Disk.
     * @return builder
     */
    def mainVolume(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneMainVolumeArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneMainVolumeArgs.builder
      builder.mainVolume(args(argsBuilder).build)

    /**
     * @param proxyConfig Proxy configuration for outbound HTTP(S) traffic.
     * @return builder
     */
    def proxyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneProxyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

    /**
     * @param replicaPlacements Configuration for where to place the control plane replicas. Up to three replica placement instances can be specified. If replicaPlacements is set, the replica placement instances will be applied to the three control plane replicas as evenly as possible.
     * @return builder
     */
    def replicaPlacements(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneReplicaPlacementArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneReplicaPlacementArgs.builder
      builder.replicaPlacements(args.map(_(argsBuilder).build)*)

    /**
     * @param rootVolume Optional. Configuration related to the root volume provisioned for each control plane replica. When unspecified, it defaults to 32-GiB Azure Disk.
     * @return builder
     */
    def rootVolume(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneRootVolumeArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneRootVolumeArgs.builder
      builder.rootVolume(args(argsBuilder).build)

    /**
     * @param sshConfig SSH configuration for how to access the underlying control plane machines.
     * @return builder
     */
    def sshConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneSshConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneSshConfigArgs.builder
      builder.sshConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs.Builder)
    /**
     * @param accurateTimeConfig Accurate time configuration for the node. Structure is documented below.
     * @return builder
     */
    def accurateTimeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigAccurateTimeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigAccurateTimeConfigArgs.builder
      builder.accurateTimeConfig(args(argsBuilder).build)

    /**
     * @param hugepagesConfig Amounts for 2M and 1G hugepages. Structure is documented below.
     * @return builder
     */
    def hugepagesConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs.builder
      builder.hugepagesConfig(args(argsBuilder).build)

    /**
     * @param nodeKernelModuleLoading Settings for kernel module loading. Structure is documented below.
     * @return builder
     */
    def nodeKernelModuleLoading(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.builder
      builder.nodeKernelModuleLoading(args(argsBuilder).build)

    /**
     * @param swapConfig Swap configuration for the node. Structure is documented below.
     * @return builder
     */
    def swapConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.builder
      builder.swapConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder)
    /**
     * @param gcpSecretManagerCertificateConfig Parameters for configuring a certificate hosted in GCP SecretManager.
     * @return builder
     */
    def gcpSecretManagerCertificateConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.builder
      builder.gcpSecretManagerCertificateConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AzureClusterState.Builder)
    /**
     * @param authorization Configuration related to the cluster RBAC settings.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param azureServicesAuthentication Azure authentication configuration for management of Azure resources
     * @return builder
     */
    def azureServicesAuthentication(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterAzureServicesAuthenticationArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterAzureServicesAuthenticationArgs.builder
      builder.azureServicesAuthentication(args(argsBuilder).build)

    /**
     * @param controlPlane Configuration related to the cluster control plane.
     * @return builder
     */
    def controlPlane(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterControlPlaneArgs.builder
      builder.controlPlane(args(argsBuilder).build)

    /**
     * @param fleet Fleet configuration.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param networking Cluster-wide networking configuration.
     * @return builder
     */
    def networking(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterNetworkingArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterNetworkingArgs.builder
      builder.networking(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfigs Output only. Workload Identity settings.
     * @return builder
     */
    def workloadIdentityConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterWorkloadIdentityConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AzureClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder)
    /**
     * @param autoscaling Configuration required by cluster autoscaler to adjust the size of the node pool to the current cluster usage.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param management Node management configuration, wherein auto-repair and auto-upgrade is configured.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolManagementArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param networkConfig Configuration for
     *  [Adding Pod IP address ranges](https://cloud.google.com/kubernetes-engine/docs/how-to/multi-pod-cidr)) to the node pool. Structure is documented below
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Parameters used in creating the default node pool.
     *  Generally, this field should not be used at the same time as a
     *  `gcp.container.NodePool` or a `nodePool` block; this configuration
     *  manages the default node pool, which isn&#39;t recommended to be used.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param nodeDrainConfigs Node drain configuration for this NodePool.
     * @return builder
     */
    def nodeDrainConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeDrainConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeDrainConfigArgs.builder
      builder.nodeDrainConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param placementPolicy Specifies the node placement policy
     * @return builder
     */
    def placementPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolPlacementPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolPlacementPolicyArgs.builder
      builder.placementPolicy(args(argsBuilder).build)

    /**
     * @param queuedProvisioning Specifies the configuration of queued provisioning
     * @return builder
     */
    def queuedProvisioning(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolQueuedProvisioningArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolQueuedProvisioningArgs.builder
      builder.queuedProvisioning(args(argsBuilder).build)

    /**
     * @param upgradeSettings Specify node upgrade settings to change how many nodes GKE attempts to upgrade at once. The number of nodes upgraded simultaneously is the sum of maxSurge and max_unavailable. The maximum number of nodes upgraded simultaneously is limited to 20.
     * @return builder
     */
    def upgradeSettings(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolUpgradeSettingsArgs.builder
      builder.upgradeSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostArgs.Builder)
    /**
     * @param hosts Configures a list of host-specific configurations for the server.
     * @return builder
     */
    def hosts(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorArgs.Builder)
    /**
     * @param gpuDriverInstallationConfig Configuration for auto installation of GPU driver.
     * @return builder
     */
    def gpuDriverInstallationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorGpuDriverInstallationConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorGpuDriverInstallationConfigArgs.builder
      builder.gpuDriverInstallationConfig(args(argsBuilder).build)

    /**
     * @param gpuSharingConfig Configuration for GPU sharing.
     * @return builder
     */
    def gpuSharingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorGpuSharingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorGpuSharingConfigArgs.builder
      builder.gpuSharingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.Builder)
    /**
     * @param evictionMinimumReclaim Defines a map of signal names to percentage that defines minimum reclaims. It describes the minimum amount of a given resource the kubelet will reclaim when performing a pod eviction. Structure is documented below.
     * @return builder
     */
    def evictionMinimumReclaim(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigEvictionMinimumReclaimArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigEvictionMinimumReclaimArgs.builder
      builder.evictionMinimumReclaim(args(argsBuilder).build)

    /**
     * @param evictionSoft Defines a map of signal names to quantities or percentage that defines soft eviction thresholds. Structure is documented below.
     * @return builder
     */
    def evictionSoft(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigEvictionSoftArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigEvictionSoftArgs.builder
      builder.evictionSoft(args(argsBuilder).build)

    /**
     * @param evictionSoftGracePeriod Defines a map of signal names to durations that defines grace periods for soft eviction thresholds. Each soft eviction threshold must have a corresponding grace period. Structure is documented below.
     * @return builder
     */
    def evictionSoftGracePeriod(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigEvictionSoftGracePeriodArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigEvictionSoftGracePeriodArgs.builder
      builder.evictionSoftGracePeriod(args(argsBuilder).build)

    /**
     * @param memoryManager Configuration for the [memory manager](https://kubernetes.io/docs/tasks/administer-cluster/memory-manager/) on the node.
     *  The memory manager optimizes memory and hugepages allocation for pods, especially
     *  those in the Guaranteed QoS class, by influencing NUMA affinity. Structure is documented below.
     * @return builder
     */
    def memoryManager(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigMemoryManagerArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigMemoryManagerArgs.builder
      builder.memoryManager(args(argsBuilder).build)

    /**
     * @param topologyManager These settings control the kubelet&#39;s [Topology Manager policy](https://kubernetes.io/docs/tasks/administer-cluster/topology-manager/#topology-manager-policies), which coordinates the set of components responsible for performance optimizations related to CPU isolation, memory, and device locality. Structure is documented below.
     * @return builder
     */
    def topologyManager(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigTopologyManagerArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigTopologyManagerArgs.builder
      builder.topologyManager(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostArgs.Builder)
    /**
     * @param hosts Configures a list of host-specific configurations for the server.
     * @return builder
     */
    def hosts(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigSoleTenantConfigArgs.Builder)
    /**
     * @param nodeAffinities .
     * @return builder
     */
    def nodeAffinities(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigSoleTenantConfigNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigSoleTenantConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigSoleTenantConfigNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostArgs.Builder)
    /**
     * @param cas Configures the registry host certificate.
     * @return builder
     */
    def cas(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostCaArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostCaArgs.builder
      builder.cas(args.map(_(argsBuilder).build)*)

    /**
     * @param clients Configures the registry host client certificate and key.
     * @return builder
     */
    def clients(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostClientArgs.builder
      builder.clients(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Configures the registry host headers.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostHeaderArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNotificationConfigArgs.Builder)
    /**
     * @param pubsub The pubsub config for the cluster&#39;s upgrade notifications.
     * @return builder
     */
    def pubsub(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNotificationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubArgs.builder
      builder.pubsub(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs.Builder)
    /**
     * @param adminGroups Groups of users that can perform operations as a cluster admin. A managed ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole to the groups. Up to ten admin groups can be provided. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * @return builder
     */
    def adminGroups(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterAuthorizationAdminGroupArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterAuthorizationAdminGroupArgs.builder
      builder.adminGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param adminUsers Users to perform operations as a cluster admin. A managed ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole to the users. Up to ten admin users can be provided. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * @return builder
     */
    def adminUsers(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterAuthorizationAdminUserArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AwsClusterAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterAuthorizationAdminUserArgs.builder
      builder.adminUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigArgs.Builder)
    /**
     * @param kubernetesSecret The Kubernetes Secret resource that contains the HTTP(S) proxy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def kubernetesSecret(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigKubernetesSecretArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigKubernetesSecretArgs.builder
      builder.kubernetesSecret(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder)
    /**
     * @param autoscaledRolloutPolicy ) Autoscaled rollout policy for blue-green upgrade.
     * @return builder
     */
    def autoscaledRolloutPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsAutoscaledRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsAutoscaledRolloutPolicyArgs.builder
      builder.autoscaledRolloutPolicy(args(argsBuilder).build)

    /**
     * @param standardRolloutPolicy Specifies the standard policy settings for blue-green upgrades.
     * @return builder
     */
    def standardRolloutPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsStandardRolloutPolicyArgs.builder
      builder.standardRolloutPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder)
    /**
     * @param additionalIpRangesConfigs The configuration for individual additional subnetworks attached to the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def additionalIpRangesConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyAdditionalIpRangesConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyAdditionalIpRangesConfigArgs.builder
      builder.additionalIpRangesConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param additionalPodRangesConfig The configuration for additional pod secondary ranges at
     *  the cluster level. Used for Autopilot clusters and Standard clusters with which control of the
     *  secondary Pod IP address assignment to node pools isn&#39;t needed. Structure is documented below.
     * @return builder
     */
    def additionalPodRangesConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyAdditionalPodRangesConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyAdditionalPodRangesConfigArgs.builder
      builder.additionalPodRangesConfig(args(argsBuilder).build)

    /**
     * @param autoIpamConfig All the information related to Auto IPAM. Structure is documented below
     * @return builder
     */
    def autoIpamConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyAutoIpamConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyAutoIpamConfigArgs.builder
      builder.autoIpamConfig(args(argsBuilder).build)

    /**
     * @param networkTierConfig Contains network tier information. Structure is documented below
     * 
     *  &lt;a name=&#34;nestedAutoIpamConfig&#34;&gt;&lt;/a&gt;The auto ipam config supports:
     * @return builder
     */
    def networkTierConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyNetworkTierConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyNetworkTierConfigArgs.builder
      builder.networkTierConfig(args(argsBuilder).build)

    /**
     * @param podCidrOverprovisionConfig Configuration for cluster level pod cidr overprovision. Default is disabled=false.
     * @return builder
     */
    def podCidrOverprovisionConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyPodCidrOverprovisionConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterIpAllocationPolicyPodCidrOverprovisionConfigArgs.builder
      builder.podCidrOverprovisionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorArgs.Builder)
    /**
     * @param gpuDriverInstallationConfig Configuration for auto installation of GPU driver. Structure is documented below.
     * @return builder
     */
    def gpuDriverInstallationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorGpuDriverInstallationConfigArgs.builder
      builder.gpuDriverInstallationConfig(args(argsBuilder).build)

    /**
     * @param gpuSharingConfig Configuration for GPU sharing. Structure is documented below.
     * @return builder
     */
    def gpuSharingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorGpuSharingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorGpuSharingConfigArgs.builder
      builder.gpuSharingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder)
    /**
     * @param certificateAuthorityDomainConfigs Parameters for configuring CA certificate and domains.
     * @return builder
     */
    def certificateAuthorityDomainConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.builder
      builder.certificateAuthorityDomainConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigSoleTenantConfigArgs.Builder)
    /**
     * @param nodeAffinities The node affinity settings for the sole tenant node pool. Structure is documented below.
     * @return builder
     */
    def nodeAffinities(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigSoleTenantConfigNodeAffinityArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigSoleTenantConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigSoleTenantConfigNodeAffinityArgs.builder
      builder.nodeAffinities(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigArgs.Builder)
    /**
     * @param rayClusterLoggingConfig The status of Ray Logging, which scrapes Ray cluster logs to Cloud Logging. Defaults to disabled; set enabled = true to enable.
     * @return builder
     */
    def rayClusterLoggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigRayClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigRayClusterLoggingConfigArgs.builder
      builder.rayClusterLoggingConfig(args(argsBuilder).build)

    /**
     * @param rayClusterMonitoringConfig The status of Ray Cluster monitoring, which shows Ray cluster metrics in Cloud Console. Defaults to disabled; set enabled = true to enable.
     * @return builder
     */
    def rayClusterMonitoringConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigRayClusterMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterAddonsConfigRayOperatorConfigRayClusterMonitoringConfigArgs.builder
      builder.rayClusterMonitoringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.Builder)
    /**
     * @param exclusionOptions MaintenanceExclusionOptions provides maintenance exclusion related options.
     * @return builder
     */
    def exclusionOptions(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs.builder
      builder.exclusionOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AwsNodePoolState.Builder)
    /**
     * @param autoscaling Autoscaler configuration for this node pool.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param config The configuration of the node pool.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param kubeletConfig The kubelet configuration for the node pool.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolKubeletConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param management The Management configuration for this node pool.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolManagementArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * @return builder
     */
    def maxPodsConstraint(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolMaxPodsConstraintArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolMaxPodsConstraintArgs.builder
      builder.maxPodsConstraint(args(argsBuilder).build)

    /**
     * @param updateSettings Optional. Update settings control the speed and disruption of the node pool update.
     * @return builder
     */
    def updateSettings(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolUpdateSettingsArgs.builder
      builder.updateSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder)
    /**
     * @param bootDiskProfile Swap on the node&#39;s boot disk.
     * @return builder
     */
    def bootDiskProfile(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigBootDiskProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigBootDiskProfileArgs.builder
      builder.bootDiskProfile(args(argsBuilder).build)

    /**
     * @param dedicatedLocalSsdProfile Provisions a new, separate local NVMe SSD exclusively for swap.
     * @return builder
     */
    def dedicatedLocalSsdProfile(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigDedicatedLocalSsdProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigDedicatedLocalSsdProfileArgs.builder
      builder.dedicatedLocalSsdProfile(args(argsBuilder).build)

    /**
     * @param encryptionConfig If omitted, swap space is encrypted by default.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param ephemeralLocalSsdProfile Swap on the local SSD shared with pod ephemeral storage.
     * @return builder
     */
    def ephemeralLocalSsdProfile(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigEphemeralLocalSsdProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigEphemeralLocalSsdProfileArgs.builder
      builder.ephemeralLocalSsdProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostArgs.Builder)
    /**
     * @param hosts Configures a list of host-specific configurations for the server.
     * @return builder
     */
    def hosts(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder)
    /**
     * @param advancedMachineFeatures Specifies options for controlling advanced machine features.
     * @return builder
     */
    def advancedMachineFeatures(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigAdvancedMachineFeaturesArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigAdvancedMachineFeaturesArgs.builder
      builder.advancedMachineFeatures(args(argsBuilder).build)

    /**
     * @param bootDisk Boot disk configuration for node pools nodes.
     * @return builder
     */
    def bootDisk(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigBootDiskArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param confidentialNodes Configuration for the confidential nodes feature, which makes nodes run on confidential VMs.
     * @return builder
     */
    def confidentialNodes(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigConfidentialNodesArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigConfidentialNodesArgs.builder
      builder.confidentialNodes(args(argsBuilder).build)

    /**
     * @param containerdConfig Parameters for containerd configuration.
     * @return builder
     */
    def containerdConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigArgs.builder
      builder.containerdConfig(args(argsBuilder).build)

    /**
     * @param effectiveTaints List of kubernetes taints applied to each node.
     * @return builder
     */
    def effectiveTaints(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigEffectiveTaintArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigEffectiveTaintArgs.builder
      builder.effectiveTaints(args.map(_(argsBuilder).build)*)

    /**
     * @param ephemeralStorageConfig Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk.
     * @return builder
     */
    def ephemeralStorageConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigEphemeralStorageConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigEphemeralStorageConfigArgs.builder
      builder.ephemeralStorageConfig(args(argsBuilder).build)

    /**
     * @param ephemeralStorageLocalSsdConfig Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk.
     * @return builder
     */
    def ephemeralStorageLocalSsdConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigEphemeralStorageLocalSsdConfigArgs.builder
      builder.ephemeralStorageLocalSsdConfig(args(argsBuilder).build)

    /**
     * @param fastSocket Enable or disable NCCL Fast Socket in the node pool.
     * @return builder
     */
    def fastSocket(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigFastSocketArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigFastSocketArgs.builder
      builder.fastSocket(args(argsBuilder).build)

    /**
     * @param gcfsConfig GCFS configuration for this node.
     * @return builder
     */
    def gcfsConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigGcfsConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigGcfsConfigArgs.builder
      builder.gcfsConfig(args(argsBuilder).build)

    /**
     * @param guestAccelerators List of the type and count of accelerator cards attached to the instance.
     * @return builder
     */
    def guestAccelerators(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigGuestAcceleratorArgs.builder
      builder.guestAccelerators(args.map(_(argsBuilder).build)*)

    /**
     * @param gvnic Enable or disable gvnic in the node pool.
     * @return builder
     */
    def gvnic(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigGvnicArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigGvnicArgs.builder
      builder.gvnic(args(argsBuilder).build)

    /**
     * @param hostMaintenancePolicy The maintenance policy for the hosts on which the GKE VMs run on.
     * @return builder
     */
    def hostMaintenancePolicy(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigHostMaintenancePolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigHostMaintenancePolicyArgs.builder
      builder.hostMaintenancePolicy(args(argsBuilder).build)

    /**
     * @param kubeletConfig Node kubelet configs.
     * @return builder
     */
    def kubeletConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigKubeletConfigArgs.builder
      builder.kubeletConfig(args(argsBuilder).build)

    /**
     * @param linuxNodeConfig Parameters that can be configured on Linux nodes.
     * @return builder
     */
    def linuxNodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs.builder
      builder.linuxNodeConfig(args(argsBuilder).build)

    /**
     * @param localNvmeSsdBlockConfig Parameters for raw-block local NVMe SSDs.
     * @return builder
     */
    def localNvmeSsdBlockConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLocalNvmeSsdBlockConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLocalNvmeSsdBlockConfigArgs.builder
      builder.localNvmeSsdBlockConfig(args(argsBuilder).build)

    /**
     * @param reservationAffinity The reservation affinity configuration for the node pool.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigReservationAffinityArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

    /**
     * @param sandboxConfig Sandbox configuration for this node.
     * @return builder
     */
    def sandboxConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigSandboxConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigSandboxConfigArgs.builder
      builder.sandboxConfig(args(argsBuilder).build)

    /**
     * @param secondaryBootDisks Secondary boot disks for preloading data or container images.
     * @return builder
     */
    def secondaryBootDisks(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigSecondaryBootDiskArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigSecondaryBootDiskArgs.builder
      builder.secondaryBootDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param shieldedInstanceConfig Shielded Instance options.
     * @return builder
     */
    def shieldedInstanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigShieldedInstanceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigShieldedInstanceConfigArgs.builder
      builder.shieldedInstanceConfig(args(argsBuilder).build)

    /**
     * @param soleTenantConfig Node affinity options for sole tenant node pools.
     * @return builder
     */
    def soleTenantConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigSoleTenantConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigSoleTenantConfigArgs.builder
      builder.soleTenantConfig(args(argsBuilder).build)

    /**
     * @param taints List of Kubernetes taints to be applied to each node.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigTaintArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

    /**
     * @param windowsNodeConfig Parameters that can be configured on Windows nodes.
     * @return builder
     */
    def windowsNodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigWindowsNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigWindowsNodeConfigArgs.builder
      builder.windowsNodeConfig(args(argsBuilder).build)

    /**
     * @param workloadMetadataConfig The workload metadata configuration for this node.
     * @return builder
     */
    def workloadMetadataConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigWorkloadMetadataConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigWorkloadMetadataConfigArgs.builder
      builder.workloadMetadataConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs.Builder)
    /**
     * @param accurateTimeConfig The settings for the accurate time configuration.
     * @return builder
     */
    def accurateTimeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigAccurateTimeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigAccurateTimeConfigArgs.builder
      builder.accurateTimeConfig(args(argsBuilder).build)

    /**
     * @param hugepagesConfig Amounts for 2M and 1G hugepages.
     * @return builder
     */
    def hugepagesConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigHugepagesConfigArgs.builder
      builder.hugepagesConfig(args(argsBuilder).build)

    /**
     * @param nodeKernelModuleLoading The settings for kernel module loading.
     * @return builder
     */
    def nodeKernelModuleLoading(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.builder
      builder.nodeKernelModuleLoading(args(argsBuilder).build)

    /**
     * @param swapConfig Swap configuration for the node.
     * @return builder
     */
    def swapConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.builder
      builder.swapConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigArgs.Builder)
    /**
     * @param privateRegistryAccessConfig Configuration for private container registries. There are two fields in this config:
     * @return builder
     */
    def privateRegistryAccessConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigArgs.builder
      builder.privateRegistryAccessConfig(args(argsBuilder).build)

    /**
     * @param registryHosts Defines containerd registry host configuration. Each `registryHosts` entry represents a `hosts.toml` file. See [customize containerd configuration in GKE nodes](https://docs.cloud.google.com/kubernetes-engine/docs/how-to/customize-containerd-configuration#registryHosts) for more detail. Example:
     * @return builder
     */
    def registryHosts(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigRegistryHostArgs.builder
      builder.registryHosts(args.map(_(argsBuilder).build)*)

    /**
     * @param writableCgroups Configuration for writable cgroups. This allows containers to have a writable `/sys/fs/cgroup` directory, which is required for some workloads to create their own sub-cgroups. The `writableCgroups` block supports:
     * @return builder
     */
    def writableCgroups(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigWritableCgroupsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigContainerdConfigWritableCgroupsArgs.builder
      builder.writableCgroups(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AzureNodePoolState.Builder)
    /**
     * @param autoscaling Autoscaler configuration for this node pool.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param config The node configuration of the node pool.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param management The Management configuration for this node pool.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolManagementArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param maxPodsConstraint The constraint on the maximum number of pods that can be run simultaneously on a node in the node pool.
     * @return builder
     */
    def maxPodsConstraint(args: Endofunction[com.pulumi.gcp.container.inputs.AzureNodePoolMaxPodsConstraintArgs.Builder]):
        com.pulumi.gcp.container.inputs.AzureNodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AzureNodePoolMaxPodsConstraintArgs.builder
      builder.maxPodsConstraint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolState.Builder)
    /**
     * @param autoscaling Configuration required by cluster autoscaler to adjust
     *  the size of the node pool to the current cluster usage. Structure is documented below.
     * @return builder
     */
    def autoscaling(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolAutoscalingArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolAutoscalingArgs.builder
      builder.autoscaling(args(argsBuilder).build)

    /**
     * @param management Node management configuration, wherein auto-repair and
     *  auto-upgrade is configured. Structure is documented below.
     * @return builder
     */
    def management(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolManagementArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolManagementArgs.builder
      builder.management(args(argsBuilder).build)

    /**
     * @param networkConfig The network configuration of the pool. Such as
     *  configuration for [Adding Pod IP address ranges](https://cloud.google.com/kubernetes-engine/docs/how-to/multi-pod-cidr)) to the node pool. Or enabling private nodes. Structure is
     *  documented below
     * @return builder
     */
    def networkConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs.builder
      builder.networkConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig Parameters used in creating the node pool. See
     *  gcp.container.Cluster for schema.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param nodeDrainConfigs The node drain configuration of the pool. Structure is documented below.
     * @return builder
     */
    def nodeDrainConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeDrainConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeDrainConfigArgs.builder
      builder.nodeDrainConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param placementPolicy Specifies a custom placement policy for the
     *  nodes.
     * @return builder
     */
    def placementPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolPlacementPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolPlacementPolicyArgs.builder
      builder.placementPolicy(args(argsBuilder).build)

    /**
     * @param queuedProvisioning Specifies node pool-level settings of queued provisioning.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedAutoscaling&#34;&gt;&lt;/a&gt;The `autoscaling` block supports (either total or per zone limits are required):
     * @return builder
     */
    def queuedProvisioning(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolQueuedProvisioningArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolQueuedProvisioningArgs.builder
      builder.queuedProvisioning(args(argsBuilder).build)

    /**
     * @param upgradeSettings Specify node upgrade settings to change how GKE upgrades nodes.
     *  The maximum number of nodes upgraded simultaneously is limited to 20. Structure is documented below.
     * @return builder
     */
    def upgradeSettings(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsArgs.builder
      builder.upgradeSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsBlueGreenSettingsArgs.Builder)
    /**
     * @param standardRolloutPolicy Standard policy for the blue-green upgrade. To be specified when strategy is set to BLUE_GREEN. Structure is documented below.
     * @return builder
     */
    def standardRolloutPolicy(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsBlueGreenSettingsStandardRolloutPolicyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsBlueGreenSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsBlueGreenSettingsStandardRolloutPolicyArgs.builder
      builder.standardRolloutPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigArgs.Builder)
    /**
     * @param rotationConfig config for secret manager auto rotation. Structure is docuemented below
     * @return builder
     */
    def rotationConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigRotationConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterSecretManagerConfigRotationConfigArgs.builder
      builder.rotationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs.Builder)
    /**
     * @param additionalNodeNetworkConfigs We specify the additional node networks for this node pool using this list. Each node network corresponds to an additional interface
     * @return builder
     */
    def additionalNodeNetworkConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigAdditionalNodeNetworkConfigArgs.builder
      builder.additionalNodeNetworkConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param additionalPodNetworkConfigs We specify the additional pod networks for this node pool using this list. Each pod network corresponds to an additional alias IP range for the node
     * @return builder
     */
    def additionalPodNetworkConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigAdditionalPodNetworkConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigAdditionalPodNetworkConfigArgs.builder
      builder.additionalPodNetworkConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param networkPerformanceConfig Network bandwidth tier configuration.
     * @return builder
     */
    def networkPerformanceConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigNetworkPerformanceConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigNetworkPerformanceConfigArgs.builder
      builder.networkPerformanceConfig(args(argsBuilder).build)

    /**
     * @param podCidrOverprovisionConfig Configuration for node-pool level pod cidr overprovision. If not set, the cluster level setting will be inherited
     * @return builder
     */
    def podCidrOverprovisionConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigPodCidrOverprovisionConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNetworkConfigPodCidrOverprovisionConfigArgs.builder
      builder.podCidrOverprovisionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AttachedClusterState.Builder)
    /**
     * @param authorization Configuration related to the cluster RBAC settings.
     *  Structure is documented below.
     * @return builder
     */
    def authorization(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterAuthorizationArgs.builder
      builder.authorization(args(argsBuilder).build)

    /**
     * @param binaryAuthorization Binary Authorization configuration.
     *  Structure is documented below.
     * @return builder
     */
    def binaryAuthorization(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterBinaryAuthorizationArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterBinaryAuthorizationArgs.builder
      builder.binaryAuthorization(args(argsBuilder).build)

    /**
     * @param errors A set of errors found in the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def errors(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterErrorArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterErrorArgs.builder
      builder.errors(args.map(_(argsBuilder).build)*)

    /**
     * @param fleet Fleet configuration.
     *  Structure is documented below.
     * @return builder
     */
    def fleet(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterFleetArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterFleetArgs.builder
      builder.fleet(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param monitoringConfig Monitoring configuration.
     *  Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

    /**
     * @param oidcConfig OIDC discovery information of the target cluster.
     *  Kubernetes Service Account (KSA) tokens are JWT tokens signed by the cluster
     *  API server. This fields indicates how GCP services
     *  validate KSA tokens in order to allow system workloads (such as GKE Connect
     *  and telemetry agents) to authenticate back to GCP.
     *  Both clusters with public and private issuer URLs are supported.
     *  Clusters with public issuers only need to specify the `issuerUrl` field
     *  while clusters with private issuers need to provide both
     *  `issuerUrl` and `jwks`.
     *  Structure is documented below.
     * @return builder
     */
    def oidcConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterOidcConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterOidcConfigArgs.builder
      builder.oidcConfig(args(argsBuilder).build)

    /**
     * @param proxyConfig Support for proxy configuration.
     *  Structure is documented below.
     * @return builder
     */
    def proxyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

    /**
     * @param securityPostureConfig (Optional, Deprecated)
     *  Enable/Disable Security Posture API features for the cluster.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `securityPostureConfig` is deprecated and will be removed in a future major release.
     * @return builder
     * @deprecated `securityPostureConfig` is deprecated and will be removed in a future major release.
     */
    @deprecated def securityPostureConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterSecurityPostureConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterSecurityPostureConfigArgs.builder
      builder.securityPostureConfig(args(argsBuilder).build)

    /**
     * @param workloadIdentityConfigs Workload Identity settings.
     *  Structure is documented below.
     * @return builder
     */
    def workloadIdentityConfigs(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterWorkloadIdentityConfigArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AttachedClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterWorkloadIdentityConfigArgs.builder
      builder.workloadIdentityConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubArgs.Builder)
    /**
     * @param filter Choose what type of notifications you want to receive. If no filters are applied, you&#39;ll receive all notification types. Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubFilterArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs.Builder)
    /**
     * @param upgradeOptions Specifies the [Auto Upgrade knobs](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/NodeManagement#AutoUpgradeOptions) for the node pool.
     * @return builder
     */
    def upgradeOptions(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsManagementUpgradeOptionArgs.builder
      builder.upgradeOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder)
    /**
     * @param gcpSecretManagerCertificateConfig Parameters for configuring a certificate hosted in GCP SecretManager.
     * @return builder
     */
    def gcpSecretManagerCertificateConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.builder
      builder.gcpSecretManagerCertificateConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.Builder)
    /**
     * @param evictionMinimumReclaim Defines a map of signal names to percentage that defines minimum reclaims. It describes the minimum amount of a given resource the kubelet will reclaim when performing a pod eviction. Structure is documented below.
     * @return builder
     */
    def evictionMinimumReclaim(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigEvictionMinimumReclaimArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigEvictionMinimumReclaimArgs.builder
      builder.evictionMinimumReclaim(args(argsBuilder).build)

    /**
     * @param evictionSoft Defines a map of signal names to quantities or percentage that defines soft eviction thresholds. Structure is documented below.
     * @return builder
     */
    def evictionSoft(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigEvictionSoftArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigEvictionSoftArgs.builder
      builder.evictionSoft(args(argsBuilder).build)

    /**
     * @param evictionSoftGracePeriod Defines a map of signal names to durations that defines grace periods for soft eviction thresholds. Each soft eviction threshold must have a corresponding grace period. Structure is documented below.
     * @return builder
     */
    def evictionSoftGracePeriod(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigEvictionSoftGracePeriodArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigEvictionSoftGracePeriodArgs.builder
      builder.evictionSoftGracePeriod(args(argsBuilder).build)

    /**
     * @param memoryManager Configuration for the [memory manager](https://kubernetes.io/docs/tasks/administer-cluster/memory-manager/) on the node.
     *  The memory manager optimizes memory and hugepages allocation for pods, especially
     *  those in the Guaranteed QoS class, by influencing NUMA affinity. Structure is documented below.
     * @return builder
     */
    def memoryManager(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigMemoryManagerArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigMemoryManagerArgs.builder
      builder.memoryManager(args(argsBuilder).build)

    /**
     * @param topologyManager These settings control the kubelet&#39;s [Topology Manager policy](https://kubernetes.io/docs/tasks/administer-cluster/topology-manager/#topology-manager-policies), which coordinates the set of components responsible for performance optimizations related to CPU isolation, memory, and device locality. Structure is documented below.
     * @return builder
     */
    def topologyManager(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigTopologyManagerArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigTopologyManagerArgs.builder
      builder.topologyManager(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder)
    /**
     * @param bootDiskProfile Swap on the node&#39;s boot disk. Structure is documented below.
     * @return builder
     */
    def bootDiskProfile(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigBootDiskProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigBootDiskProfileArgs.builder
      builder.bootDiskProfile(args(argsBuilder).build)

    /**
     * @param dedicatedLocalSsdProfile Provisions a new, separate local NVMe SSD exclusively for swap. Structure is documented below.
     * @return builder
     */
    def dedicatedLocalSsdProfile(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigDedicatedLocalSsdProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigDedicatedLocalSsdProfileArgs.builder
      builder.dedicatedLocalSsdProfile(args(argsBuilder).build)

    /**
     * @param encryptionConfig If omitted, swap space is encrypted by default. Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param ephemeralLocalSsdProfile Swap on the local SSD shared with pod ephemeral storage. Structure is documented below.
     * @return builder
     */
    def ephemeralLocalSsdProfile(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigEphemeralLocalSsdProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigSwapConfigEphemeralLocalSsdProfileArgs.builder
      builder.ephemeralLocalSsdProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs.Builder)
    /**
     * @param accurateTimeConfig Accurate time configuration for the node. Structure is documented below.
     * @return builder
     */
    def accurateTimeConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigAccurateTimeConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigAccurateTimeConfigArgs.builder
      builder.accurateTimeConfig(args(argsBuilder).build)

    /**
     * @param hugepagesConfig Amounts for 2M and 1G hugepages. Structure is documented below.
     * @return builder
     */
    def hugepagesConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigHugepagesConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigHugepagesConfigArgs.builder
      builder.hugepagesConfig(args(argsBuilder).build)

    /**
     * @param nodeKernelModuleLoading Settings for kernel module loading. Structure is documented below.
     * @return builder
     */
    def nodeKernelModuleLoading(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigNodeKernelModuleLoadingArgs.builder
      builder.nodeKernelModuleLoading(args(argsBuilder).build)

    /**
     * @param swapConfig Swap configuration for the node. Structure is documented below.
     * @return builder
     */
    def swapConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigArgs.builder
      builder.swapConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder)
    /**
     * @param cert Configures the client certificate.
     * @return builder
     */
    def cert(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientCertArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientCertArgs.builder
      builder.cert(args(argsBuilder).build)

    /**
     * @param key Configures the client private key.
     * @return builder
     */
    def key(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientKeyArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigContainerdConfigRegistryHostHostClientKeyArgs.builder
      builder.key(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder)
    /**
     * @param cas Configures the registry host certificate.
     * @return builder
     */
    def cas(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostCaArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostCaArgs.builder
      builder.cas(args.map(_(argsBuilder).build)*)

    /**
     * @param clients Configures the registry host client certificate and key.
     * @return builder
     */
    def clients(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostClientArgs.builder
      builder.clients(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Configures the registry host headers.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostHeaderArgs.Builder]*):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigRegistryHostHostHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigArgs.Builder)
    /**
     * @param bootDiskProfile Swap on the node&#39;s boot disk. Structure is documented below.
     * @return builder
     */
    def bootDiskProfile(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigBootDiskProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigBootDiskProfileArgs.builder
      builder.bootDiskProfile(args(argsBuilder).build)

    /**
     * @param dedicatedLocalSsdProfile Provisions a new, separate local NVMe SSD exclusively for swap. Structure is documented below.
     * @return builder
     */
    def dedicatedLocalSsdProfile(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigDedicatedLocalSsdProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigDedicatedLocalSsdProfileArgs.builder
      builder.dedicatedLocalSsdProfile(args(argsBuilder).build)

    /**
     * @param encryptionConfig If omitted, swap space is encrypted by default. Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param ephemeralLocalSsdProfile Swap on the local SSD shared with pod ephemeral storage. Structure is documented below.
     * @return builder
     */
    def ephemeralLocalSsdProfile(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigEphemeralLocalSsdProfileArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigSwapConfigEphemeralLocalSsdProfileArgs.builder
      builder.ephemeralLocalSsdProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder)
    /**
     * @param gcpSecretManagerCertificateConfig Parameters for configuring a certificate hosted in GCP SecretManager.
     * @return builder
     */
    def gcpSecretManagerCertificateConfig(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolNodeConfigContainerdConfigPrivateRegistryAccessConfigCertificateAuthorityDomainConfigGcpSecretManagerCertificateConfigArgs.builder
      builder.gcpSecretManagerCertificateConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs.Builder)
    /**
     * @param blueGreenSettings Settings for blue-green upgrade strategy. To be specified when strategy is set to BLUE_GREEN. Structure is documented below.
     * @return builder
     */
    def blueGreenSettings(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsBlueGreenSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsUpgradeSettingsBlueGreenSettingsArgs.builder
      builder.blueGreenSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostArgs.Builder)
    /**
     * @param hosts Configures a list of host-specific configurations for the server.
     * @return builder
     */
    def hosts(args: Endofunction[com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostArgs.Builder]*):
        com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.ClusterNodePoolDefaultsNodeConfigDefaultsContainerdConfigRegistryHostHostArgs.builder
      builder.hosts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigArgs.Builder)
    /**
     * @param componentConfig The configuration of the logging components
     *  Structure is documented below.
     * @return builder
     */
    def componentConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigComponentConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AttachedClusterLoggingConfigComponentConfigArgs.builder
      builder.componentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder)
    /**
     * @param autoscalingMetricsCollection Optional. Configuration related to CloudWatch metrics collection on the Auto Scaling group of the node pool. When unspecified, metrics collection is disabled.
     * @return builder
     */
    def autoscalingMetricsCollection(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigAutoscalingMetricsCollectionArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigAutoscalingMetricsCollectionArgs.builder
      builder.autoscalingMetricsCollection(args(argsBuilder).build)

    /**
     * @param configEncryption The ARN of the AWS KMS key used to encrypt node pool configuration.
     * @return builder
     */
    def configEncryption(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigConfigEncryptionArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigConfigEncryptionArgs.builder
      builder.configEncryption(args(argsBuilder).build)

    /**
     * @param instancePlacement Details of placement information for an instance.
     * @return builder
     */
    def instancePlacement(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigInstancePlacementArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigInstancePlacementArgs.builder
      builder.instancePlacement(args(argsBuilder).build)

    /**
     * @param proxyConfig Proxy configuration for outbound HTTP(S) traffic.
     * @return builder
     */
    def proxyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigProxyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

    /**
     * @param rootVolume Optional. Template for the root volume provisioned for node pool nodes. Volumes will be provisioned in the availability zone assigned to the node pool subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * @return builder
     */
    def rootVolume(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigRootVolumeArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigRootVolumeArgs.builder
      builder.rootVolume(args(argsBuilder).build)

    /**
     * @param spotConfig Optional. When specified, the node pool will provision Spot instances from the set of spot_config.instance_types. This field is mutually exclusive with `instanceType`
     * @return builder
     */
    def spotConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigSpotConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigSpotConfigArgs.builder
      builder.spotConfig(args(argsBuilder).build)

    /**
     * @param sshConfig Optional. The SSH configuration.
     * @return builder
     */
    def sshConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigSshConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigSshConfigArgs.builder
      builder.sshConfig(args(argsBuilder).build)

    /**
     * @param taints Optional. The initial taints assigned to nodes of this node pool.
     * @return builder
     */
    def taints(args: Endofunction[com.pulumi.gcp.container.inputs.AwsNodePoolConfigTaintArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AwsNodePoolConfigTaintArgs.builder
      builder.taints(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.container.inputs.AwsNodePoolConfigArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder)
    /**
     * @param awsServicesAuthentication Authentication configuration for management of AWS resources.
     * @return builder
     */
    def awsServicesAuthentication(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneAwsServicesAuthenticationArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneAwsServicesAuthenticationArgs.builder
      builder.awsServicesAuthentication(args(argsBuilder).build)

    /**
     * @param configEncryption The ARN of the AWS KMS key used to encrypt cluster configuration.
     * @return builder
     */
    def configEncryption(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneConfigEncryptionArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneConfigEncryptionArgs.builder
      builder.configEncryption(args(argsBuilder).build)

    /**
     * @param databaseEncryption The ARN of the AWS KMS key used to encrypt cluster secrets.
     * @return builder
     */
    def databaseEncryption(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneDatabaseEncryptionArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneDatabaseEncryptionArgs.builder
      builder.databaseEncryption(args(argsBuilder).build)

    /**
     * @param instancePlacement Details of placement information for an instance.
     * @return builder
     */
    def instancePlacement(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneInstancePlacementArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneInstancePlacementArgs.builder
      builder.instancePlacement(args(argsBuilder).build)

    /**
     * @param mainVolume Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * @return builder
     */
    def mainVolume(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneMainVolumeArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneMainVolumeArgs.builder
      builder.mainVolume(args(argsBuilder).build)

    /**
     * @param proxyConfig Proxy configuration for outbound HTTP(S) traffic.
     * @return builder
     */
    def proxyConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneProxyConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneProxyConfigArgs.builder
      builder.proxyConfig(args(argsBuilder).build)

    /**
     * @param rootVolume Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * @return builder
     */
    def rootVolume(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneRootVolumeArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneRootVolumeArgs.builder
      builder.rootVolume(args(argsBuilder).build)

    /**
     * @param sshConfig Optional. SSH configuration for how to access the underlying control plane machines.
     * @return builder
     */
    def sshConfig(args: Endofunction[com.pulumi.gcp.container.inputs.AwsClusterControlPlaneSshConfigArgs.Builder]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.AwsClusterControlPlaneSshConfigArgs.builder
      builder.sshConfig(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.container.inputs.AwsClusterControlPlaneArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs.Builder)
    /**
     * @param adminGroups Groups of users that can perform operations as a cluster admin. A managed ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole to the groups. Up to ten admin groups can be provided. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * @return builder
     */
    def adminGroups(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterAuthorizationAdminGroupArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterAuthorizationAdminGroupArgs.builder
      builder.adminGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param adminUsers Users that can perform operations as a cluster admin. A new ClusterRoleBinding will be created to grant the cluster-admin ClusterRole to the users. Up to ten admin users can be provided. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * @return builder
     */
    def adminUsers(args: Endofunction[com.pulumi.gcp.container.inputs.AzureClusterAuthorizationAdminUserArgs.Builder]*):
        com.pulumi.gcp.container.inputs.AzureClusterAuthorizationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.container.inputs.AzureClusterAuthorizationAdminUserArgs.builder
      builder.adminUsers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsArgs.Builder)
    /**
     * @param blueGreenSettings The settings to adjust [blue green upgrades](https://cloud.google.com/kubernetes-engine/docs/concepts/node-pool-upgrade-strategies#blue-green-upgrade-strategy).
     *  Structure is documented below
     * @return builder
     */
    def blueGreenSettings(args: Endofunction[com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsArgs.Builder]):
        com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsBlueGreenSettingsArgs.builder
      builder.blueGreenSettings(args(argsBuilder).build)
