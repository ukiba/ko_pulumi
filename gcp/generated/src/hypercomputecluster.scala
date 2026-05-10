package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object hypercomputecluster:
  /** A collection of virtual machines and connected resources forming a high-performance computing cluster capable of running large-scale, tightly coupled workloads. A cluster combines a set a compute resources that perform computations, storage resources that contain inputs and store outputs, an orchestrator that is responsible for assigning jobs to compute resources, and network resources that connect everything together. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.hypercomputecluster.ClusterArgs.builder
    com.pulumi.gcp.hypercomputecluster.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder)
    /**
     * @param computeResources Compute resources available to the cluster. Keys specify the ID of the
     *  compute resource by which it can be referenced elsewhere, and must conform
     *  to [RFC-1034](https://datatracker.ietf.org/doc/html/rfc1034) (lower-case,
     *  alphanumeric, and at most 63 characters).
     *  Structure is documented below.
     * @return builder
     */
    def computeResources(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceArgs.builder
      builder.computeResources(args.map(_(argsBuilder).build)*)

    /**
     * @param networkResources Network resources available to the cluster. Must contain at most one value.
     *  Keys specify the ID of the network resource by which it can be referenced
     *  elsewhere, and must conform to
     *  [RFC-1034](https://datatracker.ietf.org/doc/html/rfc1034) (lower-case,
     *  alphanumeric, and at most 63 characters).
     *  Structure is documented below.
     * @return builder
     */
    def networkResources(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceArgs.builder
      builder.networkResources(args.map(_(argsBuilder).build)*)

    /**
     * @param orchestrator The component responsible for scheduling and running workloads on the
     *  cluster as well as providing the user interface for interacting with the
     *  cluster at runtime.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrator(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorArgs.builder
      builder.orchestrator(args(argsBuilder).build)

    /**
     * @param storageResources Storage resources available to the cluster. Keys specify the ID of the
     *  storage resource by which it can be referenced elsewhere, and must conform
     *  to [RFC-1034](https://datatracker.ietf.org/doc/html/rfc1034) (lower-case,
     *  alphanumeric, and at most 63 characters).
     *  Structure is documented below.
     * @return builder
     */
    def storageResources(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.ClusterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.builder
      builder.storageResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetComputeInstanceArgs.Builder)
    /**
     * @param bootDisk A [Persistent disk](https://cloud.google.com/compute/docs/disks) used as the
     *  boot disk for a Compute Engine VM instance.
     *  Structure is documented below.
     * @return builder
     */
    def bootDisk(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetComputeInstanceBootDiskArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetComputeInstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetComputeInstanceBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.Builder)
    /**
     * @param buckets (Output)
     *  Name of the bucket.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceBucketArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceBucketArgs.builder
      builder.buckets(args.map(_(argsBuilder).build)*)

    /**
     * @param config Describes how a storage resource should be initialized. Each storage resource
     *  can either be imported from an existing Google Cloud resource or initialized
     *  when the cluster is created.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param filestores (Output)
     *  A reference to a [Filestore](https://cloud.google.com/filestore) instance.
     *  Structure is documented below.
     * @return builder
     */
    def filestores(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceFilestoreArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceFilestoreArgs.builder
      builder.filestores(args.map(_(argsBuilder).build)*)

    /**
     * @param lustres (Output)
     *  A reference to a [Managed
     *  Lustre](https://cloud.google.com/products/managed-lustre) instance.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedStorageResourcesBucket&#34;&gt;&lt;/a&gt;The `bucket` block contains:
     * @return builder
     */
    def lustres(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceLustreArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceLustreArgs.builder
      builder.lustres(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterState.Builder)
    /**
     * @param computeResources Compute resources available to the cluster. Keys specify the ID of the
     *  compute resource by which it can be referenced elsewhere, and must conform
     *  to [RFC-1034](https://datatracker.ietf.org/doc/html/rfc1034) (lower-case,
     *  alphanumeric, and at most 63 characters).
     *  Structure is documented below.
     * @return builder
     */
    def computeResources(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceArgs.builder
      builder.computeResources(args.map(_(argsBuilder).build)*)

    /**
     * @param networkResources Network resources available to the cluster. Must contain at most one value.
     *  Keys specify the ID of the network resource by which it can be referenced
     *  elsewhere, and must conform to
     *  [RFC-1034](https://datatracker.ietf.org/doc/html/rfc1034) (lower-case,
     *  alphanumeric, and at most 63 characters).
     *  Structure is documented below.
     * @return builder
     */
    def networkResources(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceArgs.builder
      builder.networkResources(args.map(_(argsBuilder).build)*)

    /**
     * @param orchestrator The component responsible for scheduling and running workloads on the
     *  cluster as well as providing the user interface for interacting with the
     *  cluster at runtime.
     *  Structure is documented below.
     * @return builder
     */
    def orchestrator(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorArgs.builder
      builder.orchestrator(args(argsBuilder).build)

    /**
     * @param storageResources Storage resources available to the cluster. Keys specify the ID of the
     *  storage resource by which it can be referenced elsewhere, and must conform
     *  to [RFC-1034](https://datatracker.ietf.org/doc/html/rfc1034) (lower-case,
     *  alphanumeric, and at most 63 characters).
     *  Structure is documented below.
     * @return builder
     */
    def storageResources(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterState.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceArgs.builder
      builder.storageResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesArgs.Builder)
    /**
     * @param bootDisk A [Persistent disk](https://cloud.google.com/compute/docs/disks) used as the
     *  boot disk for a Compute Engine VM instance.
     *  Structure is documented below.
     * @return builder
     */
    def bootDisk(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesBootDiskArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesBootDiskArgs.builder
      builder.bootDisk(args(argsBuilder).build)

    /**
     * @param instances (Output)
     *  Information about the login node instances that were created in Compute
     *  Engine.
     *  Structure is documented below.
     * @return builder
     */
    def instances(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesInstanceArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesInstanceArgs.builder
      builder.instances(args.map(_(argsBuilder).build)*)

    /**
     * @param storageConfigs How storage resources should be mounted on each login
     *  node.
     *  Structure is documented below.
     * @return builder
     */
    def storageConfigs(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesStorageConfigArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesStorageConfigArgs.builder
      builder.storageConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigArgs.Builder)
    /**
     * @param newFlexStartInstances When set in a ComputeResourceConfig, indicates that VM instances should
     *  be created using [Flex
     *  Start](https://cloud.google.com/compute/docs/instances/provisioning-models).
     *  Structure is documented below.
     * @return builder
     */
    def newFlexStartInstances(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewFlexStartInstancesArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewFlexStartInstancesArgs.builder
      builder.newFlexStartInstances(args(argsBuilder).build)

    /**
     * @param newOnDemandInstances When set in a ComputeResourceConfig, indicates that on-demand (i.e.,
     *  using the standard provisioning model) VM instances should be created.
     *  Structure is documented below.
     * @return builder
     */
    def newOnDemandInstances(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewOnDemandInstancesArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewOnDemandInstancesArgs.builder
      builder.newOnDemandInstances(args(argsBuilder).build)

    /**
     * @param newReservedInstances When set in a ComputeResourceConfig, indicates that VM instances should
     *  be created from a
     *  [reservation](https://cloud.google.com/compute/docs/instances/reservations-overview).
     *  Structure is documented below.
     * @return builder
     */
    def newReservedInstances(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewReservedInstancesArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewReservedInstancesArgs.builder
      builder.newReservedInstances(args(argsBuilder).build)

    /**
     * @param newSpotInstances When set in a ComputeResourceConfig, indicates that [spot
     *  VM](https://cloud.google.com/compute/docs/instances/spot) instances should be
     *  created.
     *  Structure is documented below.
     * @return builder
     */
    def newSpotInstances(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewSpotInstancesArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigNewSpotInstancesArgs.builder
      builder.newSpotInstances(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetArgs.Builder)
    /**
     * @param computeInstance When set in a SlurmNodeSet, indicates that the nodeset should be backed
     *  by Compute Engine VM instances.
     *  Structure is documented below.
     * @return builder
     */
    def computeInstance(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetComputeInstanceArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetComputeInstanceArgs.builder
      builder.computeInstance(args(argsBuilder).build)

    /**
     * @param storageConfigs How storage resources should be mounted on each compute
     *  node.
     *  Structure is documented below.
     * @return builder
     */
    def storageConfigs(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetStorageConfigArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetStorageConfigArgs.builder
      builder.storageConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder)
    /**
     * @param existingBucket When set in a StorageResourceConfig, indicates that an existing
     *  [Google Cloud Storage](https://cloud.google.com/storage) bucket should be
     *  imported.
     *  Structure is documented below.
     * @return builder
     */
    def existingBucket(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigExistingBucketArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigExistingBucketArgs.builder
      builder.existingBucket(args(argsBuilder).build)

    /**
     * @param existingFilestore When set in a StorageResourceConfig, indicates that an existing
     *  [Filestore](https://cloud.google.com/filestore) instance should be imported.
     *  Structure is documented below.
     * @return builder
     */
    def existingFilestore(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigExistingFilestoreArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigExistingFilestoreArgs.builder
      builder.existingFilestore(args(argsBuilder).build)

    /**
     * @param existingLustre When set in a StorageResourceConfig, indicates that an existing
     *  [Managed Lustre](https://cloud.google.com/products/managed-lustre) instance
     *  should be imported.
     *  Structure is documented below.
     * @return builder
     */
    def existingLustre(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigExistingLustreArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigExistingLustreArgs.builder
      builder.existingLustre(args(argsBuilder).build)

    /**
     * @param newBucket When set in a StorageResourceConfig, indicates that a new
     *  [Google Cloud Storage](https://cloud.google.com/storage) bucket should be
     *  created.
     *  Structure is documented below.
     * @return builder
     */
    def newBucket(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketArgs.builder
      builder.newBucket(args(argsBuilder).build)

    /**
     * @param newFilestore When set in a StorageResourceConfig, indicates that a new
     *  [Filestore](https://cloud.google.com/filestore) instance should be created.
     *  Structure is documented below.
     * @return builder
     */
    def newFilestore(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewFilestoreArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewFilestoreArgs.builder
      builder.newFilestore(args(argsBuilder).build)

    /**
     * @param newLustre When set in a StorageResourceConfig, indicates that a new
     *  [Managed Lustre](https://cloud.google.com/products/managed-lustre) instance
     *  should be created.
     *  Structure is documented below.
     * @return builder
     */
    def newLustre(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewLustreArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewLustreArgs.builder
      builder.newLustre(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketArgs.Builder)
    /**
     * @param autoclass Message describing Google Cloud Storage autoclass configuration
     *  Structure is documented below.
     * @return builder
     */
    def autoclass(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketAutoclassArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketAutoclassArgs.builder
      builder.autoclass(args(argsBuilder).build)

    /**
     * @param hierarchicalNamespace Message describing Google Cloud Storage hierarchical namespace configuration
     *  Structure is documented below.
     * @return builder
     */
    def hierarchicalNamespace(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketHierarchicalNamespaceArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewBucketHierarchicalNamespaceArgs.builder
      builder.hierarchicalNamespace(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceArgs.Builder)
    /**
     * @param config Describes how a network resource should be initialized. Each network resource
     *  can either be imported from an existing Google Cloud resource or initialized
     *  when the cluster is created.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigArgs.builder
      builder.config(args(argsBuilder).build)

    /**
     * @param networks (Output)
     *  A reference to a [VPC network](https://cloud.google.com/vpc/docs/vpc) in
     *  Google Compute Engine.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceNetworkArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorArgs.Builder)
    /**
     * @param slurm When set in Orchestrator, indicates that the cluster should use
     *  [Slurm](https://slurm.schedmd.com/) as the orchestrator.
     *  Structure is documented below.
     * @return builder
     */
    def slurm(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmArgs.builder
      builder.slurm(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewFilestoreArgs.Builder)
    /**
     * @param fileShares File system shares on the instance. Exactly one file share must be
     *  specified.
     *  Structure is documented below.
     * @return builder
     */
    def fileShares(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewFilestoreFileShareArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewFilestoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterStorageResourceConfigNewFilestoreFileShareArgs.builder
      builder.fileShares(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmArgs.Builder)
    /**
     * @param loginNodes Configuration for Slurm [login
     *  nodes](https://slurm.schedmd.com/quickstart_admin.html#login) in the cluster.
     *  Login nodes are Compute Engine VM instances that allow users to access the
     *  cluster over SSH.
     *  Structure is documented below.
     * @return builder
     */
    def loginNodes(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmLoginNodesArgs.builder
      builder.loginNodes(args(argsBuilder).build)

    /**
     * @param nodeSets Configuration of Slurm nodesets, which define groups of compute resources
     *  that can be used by Slurm. At least one compute node is required.
     *  Structure is documented below.
     * @return builder
     */
    def nodeSets(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmNodeSetArgs.builder
      builder.nodeSets(args.map(_(argsBuilder).build)*)

    /**
     * @param partitions Configuration of Slurm partitions, which group one or more nodesets. Acts
     *  as a queue against which jobs can be submitted. At least one partition is
     *  required.
     *  Structure is documented below.
     * @return builder
     */
    def partitions(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmPartitionArgs.Builder]*):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmArgs.Builder =
      def argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterOrchestratorSlurmPartitionArgs.builder
      builder.partitions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigArgs.Builder)
    /**
     * @param existingNetwork When set in a NetworkResourceConfig, indicates that an existing network
     *  should be imported.
     *  Structure is documented below.
     * @return builder
     */
    def existingNetwork(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigExistingNetworkArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigExistingNetworkArgs.builder
      builder.existingNetwork(args(argsBuilder).build)

    /**
     * @param newNetwork When set in a NetworkResourceConfig, indicates that a new network should
     *  be created.
     *  Structure is documented below.
     * @return builder
     */
    def newNetwork(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigNewNetworkArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterNetworkResourceConfigNewNetworkArgs.builder
      builder.newNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceArgs.Builder)
    /**
     * @param config Describes how a compute resource should be created at runtime.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigArgs.Builder]):
        com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.hypercomputecluster.inputs.ClusterComputeResourceConfigArgs.builder
      builder.config(args(argsBuilder).build)
