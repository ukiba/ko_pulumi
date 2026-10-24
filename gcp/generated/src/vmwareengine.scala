package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object vmwareengine:
  /**
   * A cluster in a private cloud.
   * 
   * To get more information about Cluster, see:
   * 
   * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.clusters)
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Cluster(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A datastore resource that can be mounted on a VMware Engine cluster.
   * 
   * &gt; **Note:** To mount a datastore on a VMware Engine cluster, configure the
   * `datastoreMountConfig` block within the `gcp.vmwareengine.Cluster` resource.
   * A datastore cannot be mounted directly using the `gcp.vmwareengine.Datastore` resource.
   * 
   * If you are mounting a datastore that was already created outside of Terraform (or in a
   * separate Terraform configuration), reference it directly by its full resource URI in the
   * `datastore_mount_config.datastore` field inside the cluster resource:
   * ### Vmware Engine Datastore Thirdparty
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.compute.ComputeFunctions;
   * import com.pulumi.gcp.compute.inputs.GetNetworkArgs;
   * import com.pulumi.gcp.vmwareengine.Datastore;
   * import com.pulumi.gcp.vmwareengine.DatastoreArgs;
   * import com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs;
   * import com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreThirdPartyFileServiceArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App {
   *     public static void main(String[] args) {
   *         Pulumi.run(App::stack);
   *     }
   * 
   *     public static void stack(Context ctx) {
   *         // use existing network with connectivity to the thirdparty datastore
   *         final var default = ComputeFunctions.getNetwork(GetNetworkArgs.builder()
   *             .name("default")
   *             .build());
   * 
   *         // Create a thirdparty datastore.
   *         // Note: To mount this datastore on a vSphere cluster, configure the `datastore_mount_config`
   *         // block within the `google_vmwareengine_cluster` resource. For example:
   *         //
   *         //  datastore_mount_config {
   *         //    datastore        = google_vmwareengine_datastore.example_thirdparty.id
   *         //    datastore_network {
   *         //      subnet           = google_vmwareengine_subnet.example_subnet.id
   *         //      connection_count = 4
   *         //      mtu              = 1500
   *         //    }
   *         //  }
   *         var exampleThirdparty = new Datastore("exampleThirdparty", DatastoreArgs.builder()
   *             .name("thirdparty-datastore")
   *             .location("us-west1-a")
   *             .description("example thirdparty datastore.")
   *             .nfsDatastore(DatastoreNfsDatastoreArgs.builder()
   *                 .thirdPartyFileService(DatastoreNfsDatastoreThirdPartyFileServiceArgs.builder()
   *                     .fileShare("/share1")
   *                     .network(default_.id())
   *                     .servers("10.0.0.4")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *     }
   * }
   * }
   * </pre>
   * ### Vmware Engine Datastore Filestore
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.filestore.FilestoreFunctions;
   * import com.pulumi.gcp.filestore.inputs.GetInstanceArgs;
   * import com.pulumi.gcp.vmwareengine.Datastore;
   * import com.pulumi.gcp.vmwareengine.DatastoreArgs;
   * import com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs;
   * import com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreGoogleFileServiceArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App {
   *     public static void main(String[] args) {
   *         Pulumi.run(App::stack);
   *     }
   * 
   *     public static void stack(Context ctx) {
   *         // Use existing filestore instance
   *         final var testInstance = FilestoreFunctions.getInstance(GetInstanceArgs.builder()
   *             .name("fs-instance")
   *             .location("")
   *             .build());
   * 
   *         // Create a VmwareEngine Datastore, referencing the filestore instance.
   *         // Note: To mount this datastore on a vSphere cluster, configure the `datastore_mount_config`
   *         // block within the `google_vmwareengine_cluster` resource. For example:
   *         //
   *         //  datastore_mount_config {
   *         //    datastore        = google_vmwareengine_datastore.example_filestore.id
   *         //    datastore_network {
   *         //      subnet           = google_vmwareengine_subnet.example_subnet.id
   *         //      connection_count = 4
   *         //      mtu              = 1500
   *         //    }
   *         //  }
   *         var exampleFilestore = new Datastore("exampleFilestore", DatastoreArgs.builder()
   *             .name("filestore-datastore")
   *             .location("")
   *             .description("example google_file_service.filestore datastore.")
   *             .nfsDatastore(DatastoreNfsDatastoreArgs.builder()
   *                 .googleFileService(DatastoreNfsDatastoreGoogleFileServiceArgs.builder()
   *                     .filestoreInstance(testInstanceGoogleFilestoreInstance.get("id"))
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *     }
   * }
   * }
   * </pre>
   * ### Vmware Engine Datastore Netapp
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.netapp.Volume;
   * import com.pulumi.gcp.netapp.VolumeArgs;
   * import com.pulumi.gcp.vmwareengine.Datastore;
   * import com.pulumi.gcp.vmwareengine.DatastoreArgs;
   * import com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreArgs;
   * import com.pulumi.gcp.vmwareengine.inputs.DatastoreNfsDatastoreGoogleFileServiceArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App {
   *     public static void main(String[] args) {
   *         Pulumi.run(App::stack);
   *     }
   * 
   *     public static void stack(Context ctx) {
   *         // Use existing netapp volume
   *         var testVolume = new Volume("testVolume", VolumeArgs.builder()
   *             .name("netapp-volume")
   *             .location("us-west1")
   *             .build());
   * 
   *         // Create a VmwareEngine Datastore, referencing the netapp volume.
   *         // Note: To mount this datastore on a vSphere cluster, configure the `datastore_mount_config`
   *         // block within the `google_vmwareengine_cluster` resource. For example:
   *         //
   *         //  datastore_mount_config {
   *         //    datastore        = google_vmwareengine_datastore.example_netapp.id
   *         //    datastore_network {
   *         //      subnet           = google_vmwareengine_subnet.example_subnet.id
   *         //      connection_count = 4
   *         //      mtu              = 1500
   *         //    }
   *         //  }
   *         var exampleNetapp = new Datastore("exampleNetapp", DatastoreArgs.builder()
   *             .name("netapp-datastore")
   *             .location("us-west1")
   *             .description("example google_file_service.netapp datastore.")
   *             .nfsDatastore(DatastoreNfsDatastoreArgs.builder()
   *                 .googleFileService(DatastoreNfsDatastoreGoogleFileServiceArgs.builder()
   *                     .netappVolume(testVolume.id())
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *     }
   * }
   * }
   * </pre>
   * 
   * ## Import
   * 
   * Datastore can be imported using any of these accepted formats:
   * 
   * * `projects/{{project}}/locations/{{location}}/datastores/{{name}}`
   * * `{{project}}/{{location}}/{{name}}`
   * * `{{location}}/{{name}}`
   * 
   * When using the `pulumi import` command, Datastore can be imported using one of the formats above. For example:
   * 
   * ```sh
   * \$ pulumi import gcp:vmwareengine/datastore:Datastore default projects/{{project}}/locations/{{location}}/datastores/{{name}}
   * \$ pulumi import gcp:vmwareengine/datastore:Datastore default {{project}}/{{location}}/{{name}}
   * \$ pulumi import gcp:vmwareengine/datastore:Datastore default {{location}}/{{name}}
   * ```
   */
  def Datastore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.DatastoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.DatastoreArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Datastore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * External access firewall rules for filtering incoming traffic destined to `ExternalAddress` resources.
   * 
   * To get more information about ExternalAccessRule, see:
   * 
   * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies.externalAccessRules)
   */
  def ExternalAccessRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.ExternalAccessRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.ExternalAccessRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An allocated external IP address and its corresponding internal IP address in a private cloud.
   * 
   * To get more information about ExternalAddress, see:
   * 
   * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
   */
  def ExternalAddress(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.ExternalAddressArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.ExternalAddressArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.ExternalAddress(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides connectivity for VMware Engine private clouds.
   * 
   * To get more information about Network, see:
   * 
   * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.vmwareEngineNetworks)
   */
  def Network(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.NetworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.NetworkArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Network(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a network peering resource. Network peerings are global resources.
   * 
   * To get more information about NetworkPeering, see:
   * 
   * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/networks/addPeering)
   */
  def NetworkPeering(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.NetworkPeeringArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.NetworkPeeringArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.NetworkPeering(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a network policy resource. Network policies are regional resources.
   * 
   * To get more information about NetworkPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)
   */
  def NetworkPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.NetworkPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.NetworkPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a private cloud resource. Private clouds are zonal resources.
   * 
   * To get more information about PrivateCloud, see:
   * 
   * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds)
   */
  def PrivateCloud(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.PrivateCloudArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.PrivateCloudArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.PrivateCloud(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Subnet in a private cloud. A Private Cloud contains two types of subnets: `management` subnets (such as vMotion) that
   * are read-only,and `userDefined`, which can also be updated. This resource should be used to read and update `userDefined`
   * subnets. To read `management` subnets, please utilize the subnet data source.
   * 
   * To get more information about Subnet, see:
   * 
   * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)
   */
  def Subnet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vmwareengine.SubnetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vmwareengine.SubnetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vmwareengine.Subnet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object VmwareengineFunctions:
    /** Use this data source to list announcements in a region. */
    inline def getAnnouncements(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetAnnouncementsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getAnnouncements(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to list announcements in a region. */
    inline def getAnnouncementsPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetAnnouncementsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetAnnouncementsPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getAnnouncementsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a cluster resource.
     * 
     * To get more information about private cloud cluster, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.clusters)
     */
    inline def getCluster(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetClusterArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a cluster resource.
     * 
     * To get more information about private cloud cluster, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.clusters)
     */
    inline def getClusterPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetClusterPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get information about a Cloud VMware Engine Datastore. */
    inline def getDatastore(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetDatastoreArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetDatastoreResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetDatastoreArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getDatastore(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get information about a Cloud VMware Engine Datastore. */
    inline def getDatastorePlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetDatastorePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetDatastoreResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetDatastorePlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getDatastorePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a external access rule resource.
     * 
     * To get more information about external address, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies.externalAccessRules)
     */
    inline def getExternalAccessRule(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRuleArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetExternalAccessRuleResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRuleArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAccessRule(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a external access rule resource.
     * 
     * To get more information about external address, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies.externalAccessRules)
     */
    inline def getExternalAccessRulePlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRulePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetExternalAccessRuleResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAccessRulePlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAccessRulePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a external address resource.
     * 
     * To get more information about external address, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
     */
    inline def getExternalAddress(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetExternalAddressResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAddress(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a external address resource.
     * 
     * To get more information about external address, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.externalAddresses)
     */
    inline def getExternalAddressPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetExternalAddressResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetExternalAddressPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getExternalAddressPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a VMwareEngine network resource.
     * 
     * To get more information about VMwareEngine Network, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.vmwareEngineNetworks)
     */
    inline def getNetwork(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetwork(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a VMwareEngine network resource.
     * 
     * To get more information about VMwareEngine Network, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.vmwareEngineNetworks)
     */
    inline def getNetworkPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNetworkResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a network peering resource.
     * 
     * To get more information about network peering, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPeerings)
     */
    inline def getNetworkPeering(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPeeringResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPeering(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a network peering resource.
     * 
     * To get more information about network peering, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPeerings)
     */
    inline def getNetworkPeeringPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPeeringResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPeeringPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPeeringPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a network policy resource.
     * 
     * To get more information about network policy, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)
     */
    inline def getNetworkPolicy(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a network policy resource.
     * 
     * To get more information about network policy, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.networkPolicies)
     */
    inline def getNetworkPolicyPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNetworkPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNetworkPolicyPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNetworkPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get NSX credentials for a Private Cloud.
     * 
     * To get more information about private cloud NSX credentials, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showNsxCredentials)
     */
    inline def getNsxCredentials(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetNsxCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNsxCredentials(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get NSX credentials for a Private Cloud.
     * 
     * To get more information about private cloud NSX credentials, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showNsxCredentials)
     */
    inline def getNsxCredentialsPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetNsxCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetNsxCredentialsPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getNsxCredentialsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a private cloud resource.
     * 
     * To get more information about private cloud, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds)
     */
    inline def getPrivateCloud(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getPrivateCloud(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a private cloud resource.
     * 
     * To get more information about private cloud, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds)
     */
    inline def getPrivateCloudPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetPrivateCloudResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetPrivateCloudPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getPrivateCloudPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get details about a subnet. Management subnets support only read operations and should be configured through this data source. User defined subnets can be configured using the resource as well as the datasource.
     * 
     * To get more information about private cloud subnet, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)
     */
    inline def getSubnet(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetSubnetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetSubnetArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getSubnet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get details about a subnet. Management subnets support only read operations and should be configured through this data source. User defined subnets can be configured using the resource as well as the datasource.
     * 
     * To get more information about private cloud subnet, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds.subnets)
     */
    inline def getSubnetPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetSubnetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetSubnetResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetSubnetPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getSubnetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to list upgrades for a Private Cloud. */
    inline def getUpgrades(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetUpgradesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetUpgradesResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetUpgradesArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getUpgrades(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to list upgrades for a Private Cloud. */
    inline def getUpgradesPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetUpgradesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetUpgradesResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetUpgradesPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getUpgradesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Use this data source to get Vcenter credentials for a Private Cloud.
     * 
     * To get more information about private cloud Vcenter credentials, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showVcenterCredentials)
     */
    inline def getVcenterCredentials(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vmwareengine.outputs.GetVcenterCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getVcenterCredentials(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get Vcenter credentials for a Private Cloud.
     * 
     * To get more information about private cloud Vcenter credentials, see:
     * * [API documentation](https://cloud.google.com/vmware-engine/docs/reference/rest/v1/projects.locations.privateClouds/showVcenterCredentials)
     */
    inline def getVcenterCredentialsPlain(args: Endofunction[com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vmwareengine.outputs.GetVcenterCredentialsResult] =
      val argsBuilder = com.pulumi.gcp.vmwareengine.inputs.GetVcenterCredentialsPlainArgs.builder
      com.pulumi.gcp.vmwareengine.VmwareengineFunctions.getVcenterCredentialsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
