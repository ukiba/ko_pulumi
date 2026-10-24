package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object container:
  /**
   * An Anthos cluster running on customer owned infrastructure.
   * 
   * To get more information about Cluster, see:
   * 
   * * [API documentation](https://cloud.google.com/anthos/clusters/docs/multi-cloud/reference/rest)
   * * How-to Guides
   *     * [API reference](https://cloud.google.com/anthos/clusters/docs/multi-cloud/reference/rest/v1/projects.locations.attachedClusters)
   *     * [Multicloud overview](https://cloud.google.com/anthos/clusters/docs/multi-cloud)
   */
  def AttachedCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AttachedClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AttachedClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AttachedCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An Anthos cluster running on AWS.
   * 
   * For more information, see:
   * * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AwsCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AwsClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AwsClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AwsCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An Anthos node pool running on AWS.
   * 
   * For more information, see:
   * * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AwsNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AwsNodePoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AwsNodePoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AwsNodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * AzureClient resources hold client authentication information needed by the Anthos Multi-Cloud API to manage Azure resources on your Azure subscription.When an AzureCluster is created, an AzureClient resource needs to be provided and all operations on Azure resources associated to that cluster will authenticate to Azure services using the given client.AzureClient resources are immutable and cannot be modified upon creation.Each AzureClient resource is bound to a single Azure Active Directory Application and tenant.
   * 
   * For more information, see:
   * * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AzureClient(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AzureClientArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AzureClientArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AzureClient(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An Anthos cluster running on Azure.
   * 
   * For more information, see:
   * * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AzureCluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AzureClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AzureClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AzureCluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * An Anthos node pool running on Azure.
   * 
   * For more information, see:
   * * [Multicloud overview](https://cloud.google.com/kubernetes-engine/multi-cloud/docs)
   */
  def AzureNodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.AzureNodePoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.AzureNodePoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.AzureNodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Google Kubernetes Engine (GKE) cluster.
   * 
   * To get more information about GKE clusters, see:
   *   * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters)
   *   * How-to guides
   *     * [GKE overview](https://cloud.google.com/kubernetes-engine/docs/concepts/kubernetes-engine-overview)
   *     * [About cluster configuration choices](https://cloud.google.com/kubernetes-engine/docs/concepts/types-of-clusters)
   * 
   * &gt; On version 5.0.0+ of the provider, you must explicitly set `deletionProtection = false`
   * and run `pulumi up` to write the field to state in order to destroy a cluster.
   * 
   * &gt; All arguments and attributes (including certificate outputs) will be stored in the raw state as
   * plaintext. Read more about sensitive data in state.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object ContainerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides access to available platform versions in a location for a given project. */
    inline def getAttachedInstallManifest(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedInstallManifestArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAttachedInstallManifestResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedInstallManifestArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedInstallManifest(args(argsBuilder).build)

    /** Provides access to available platform versions in a location for a given project. */
    inline def getAttachedInstallManifestPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedInstallManifestPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAttachedInstallManifestResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedInstallManifestPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedInstallManifestPlain(args(argsBuilder).build)

    /** Provides access to available platform versions in a location for a given project. */
    inline def getAttachedVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAttachedVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedVersions(args(argsBuilder).build)

    /** Provides access to available platform versions in a location for a given project. */
    inline def getAttachedVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAttachedVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAttachedVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAttachedVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAttachedVersionsPlain(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    inline def getAwsVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetAwsVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAwsVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAwsVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAwsVersions(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    inline def getAwsVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAwsVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAwsVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAwsVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAwsVersionsPlain(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    inline def getAzureVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetAzureVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetAzureVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAzureVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAzureVersions(args(argsBuilder).build)

    /** Provides access to available Kubernetes versions in a location for a given project. */
    inline def getAzureVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetAzureVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetAzureVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetAzureVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getAzureVersionsPlain(args(argsBuilder).build)

    /** Get info about a GKE cluster from its name and location. */
    inline def getCluster(args: Endofunction[com.pulumi.gcp.container.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetClusterArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getCluster(args(argsBuilder).build)

    /** Get info about a GKE cluster from its name and location. */
    inline def getClusterPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetClusterPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getClusterPlain(args(argsBuilder).build)

    /**
     * Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
     * 
     * To get more information about GKE versions, see:
     *   * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
     * 
     * &gt; If you are using the `gcp.container.getEngineVersions` datasource with a
     * regional cluster, ensure that you have provided a region as the `location` to
     * the datasource. A region can have a different set of supported versions than
     * its component zones, and not all zones in a region are guaranteed to
     * support the same version.
     */
    inline def getEngineVersions(args: Endofunction[com.pulumi.gcp.container.inputs.GetEngineVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetEngineVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetEngineVersionsArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getEngineVersions(args(argsBuilder).build)

    /**
     * Provides access to available Google Kubernetes Engine versions in a zone or region for a given project.
     * 
     * To get more information about GKE versions, see:
     *   * [The API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations/getServerConfig)
     * 
     * &gt; If you are using the `gcp.container.getEngineVersions` datasource with a
     * regional cluster, ensure that you have provided a region as the `location` to
     * the datasource. A region can have a different set of supported versions than
     * its component zones, and not all zones in a region are guaranteed to
     * support the same version.
     */
    inline def getEngineVersionsPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetEngineVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetEngineVersionsResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetEngineVersionsPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getEngineVersionsPlain(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     * This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     * The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    inline def getRegistryImage(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetRegistryImageResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryImageArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryImage(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     * This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     * The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    inline def getRegistryImagePlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetRegistryImageResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryImagePlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryImagePlain(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     * This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     * The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    inline def getRegistryRepository(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryRepositoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.container.outputs.GetRegistryRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryRepositoryArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryRepository(args(argsBuilder).build)

    /**
     * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
     * 
     * This data source fetches the project name, and provides the appropriate URLs to use for container registry for this project.
     * 
     * The URLs are computed entirely offline - as long as the project exists, they will be valid, but this data source does not contact Google Container Registry (GCR) at any point.
     */
    inline def getRegistryRepositoryPlain(args: Endofunction[com.pulumi.gcp.container.inputs.GetRegistryRepositoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.container.outputs.GetRegistryRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.container.inputs.GetRegistryRepositoryPlainArgs.builder
      com.pulumi.gcp.container.ContainerFunctions.getRegistryRepositoryPlain(args(argsBuilder).build)

  /**
   * Manages a node pool in a Google Kubernetes Engine (GKE) cluster separately from
   * the cluster control plane. For more information see [the official documentation](https://cloud.google.com/container-engine/docs/node-pools)
   * and [the API reference](https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1beta1/projects.locations.clusters.nodePools).
   */
  def NodePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.NodePoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.container.NodePoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.container.NodePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * &gt; **Warning**: Container Registry is deprecated. Effective March 18, 2025, Container Registry is shut down and writing images to Container Registry is unavailable. Resource will be removed in future major release.
   * 
   * Ensures that the Google Cloud Storage bucket that backs Google Container Registry exists. Creating this resource will create the backing bucket if it does not exist, or do nothing if the bucket already exists. Destroying this resource does *NOT* destroy the backing bucket. For more information see [the official documentation](https://cloud.google.com/container-registry/docs/overview)
   * 
   * This resource can be used to ensure that the GCS bucket exists prior to assigning permissions. For more information see the [access control page](https://cloud.google.com/container-registry/docs/access-control) for GCR.
   */
  def Registry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.container.RegistryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.container.RegistryArgs.builder
    com.pulumi.gcp.container.Registry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
