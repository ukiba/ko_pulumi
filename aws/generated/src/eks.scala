package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object eks:
  /** Access Entry Configurations for an EKS Cluster. */
  def AccessEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.AccessEntryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.AccessEntryArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.AccessEntry(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Access Entry Policy Association for an EKS Cluster. */
  def AccessPolicyAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.AccessPolicyAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.eks.AccessPolicyAssociationArgs.builder
    com.pulumi.aws.eks.AccessPolicyAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EKS add-on. */
  def Addon(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.AddonArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.AddonArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.Addon(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EKS Capability for an EKS cluster. */
  def Capability(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.CapabilityArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.CapabilityArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.Capability(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EKS Cluster. */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.ClusterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.ClusterArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.Cluster(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object EksFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Access Entry Configurations for an EKS Cluster. */
    inline def getAccessEntry(args: Endofunction[com.pulumi.aws.eks.inputs.GetAccessEntryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetAccessEntryResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAccessEntryArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAccessEntry(args(argsBuilder).build)

    /** Access Entry Configurations for an EKS Cluster. */
    inline def getAccessEntryPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetAccessEntryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetAccessEntryResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAccessEntryPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAccessEntryPlain(args(argsBuilder).build)

    /** Data source for managing AWS EKS (Elastic Kubernetes) Access Policies. */
    inline def getAccessPolicies(args: Endofunction[com.pulumi.aws.eks.inputs.GetAccessPoliciesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetAccessPoliciesResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAccessPoliciesArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAccessPolicies(args(argsBuilder).build)

    /** Data source for managing AWS EKS (Elastic Kubernetes) Access Policies. */
    inline def getAccessPoliciesPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetAccessPoliciesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetAccessPoliciesResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAccessPoliciesPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAccessPoliciesPlain(args(argsBuilder).build)

    /** Retrieve information about an EKS add-on. */
    inline def getAddon(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetAddonResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddon(args(argsBuilder).build)

    /** Retrieve information about an EKS add-on. */
    inline def getAddonPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetAddonResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddonPlain(args(argsBuilder).build)

    /** Retrieve information about a specific EKS add-on version compatible with an EKS cluster version. */
    inline def getAddonVersion(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetAddonVersionResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonVersionArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddonVersion(args(argsBuilder).build)

    /** Retrieve information about a specific EKS add-on version compatible with an EKS cluster version. */
    inline def getAddonVersionPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetAddonVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetAddonVersionResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetAddonVersionPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getAddonVersionPlain(args(argsBuilder).build)

    /** Retrieve information about an EKS Cluster. */
    inline def getCluster(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterArgs.builder
      com.pulumi.aws.eks.EksFunctions.getCluster(args(argsBuilder).build)

    /** Retrieve information about an EKS Cluster. */
    inline def getClusterPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterPlain(args(argsBuilder).build)

    /**
     * Get an authentication token to communicate with an EKS cluster.
     * 
     * Uses IAM credentials from the AWS provider to generate a temporary token that is compatible with
     * [AWS IAM Authenticator](https://github.com/kubernetes-sigs/aws-iam-authenticator) authentication.
     * This can be used to authenticate to an EKS cluster or to a cluster that has the AWS IAM Authenticator
     * server configured.
     */
    inline def getClusterAuth(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterAuthArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClusterAuthResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterAuthArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterAuth(args(argsBuilder).build)

    /**
     * Get an authentication token to communicate with an EKS cluster.
     * 
     * Uses IAM credentials from the AWS provider to generate a temporary token that is compatible with
     * [AWS IAM Authenticator](https://github.com/kubernetes-sigs/aws-iam-authenticator) authentication.
     * This can be used to authenticate to an EKS cluster or to a cluster that has the AWS IAM Authenticator
     * server configured.
     */
    inline def getClusterAuthPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterAuthPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClusterAuthResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterAuthPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterAuthPlain(args(argsBuilder).build)

    /** Data source for managing AWS EKS (Elastic Kubernetes) Cluster Versions. */
    inline def getClusterVersions(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClusterVersionsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterVersionsArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterVersions(args(argsBuilder).build)

    /** Data source for managing AWS EKS (Elastic Kubernetes) Cluster Versions. */
    inline def getClusterVersionsPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClusterVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClusterVersionsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClusterVersionsPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusterVersionsPlain(args(argsBuilder).build)

    /** Retrieve EKS Clusters list */
    inline def getClusters(args: Endofunction[com.pulumi.aws.eks.inputs.GetClustersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClustersArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClusters(args(argsBuilder).build)

    /** Retrieve EKS Clusters list */
    inline def getClustersPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetClustersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetClustersResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetClustersPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getClustersPlain(args(argsBuilder).build)

    /** Retrieve information about an EKS Node Group. */
    inline def getNodeGroup(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetNodeGroupResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroup(args(argsBuilder).build)

    /** Retrieve information about an EKS Node Group. */
    inline def getNodeGroupPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetNodeGroupResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroupPlain(args(argsBuilder).build)

    /** Retrieve the EKS Node Groups associated with a named EKS cluster. This will allow you to pass a list of Node Group names to other resources. */
    inline def getNodeGroups(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.eks.outputs.GetNodeGroupsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupsArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroups(args(argsBuilder).build)

    /** Retrieve the EKS Node Groups associated with a named EKS cluster. This will allow you to pass a list of Node Group names to other resources. */
    inline def getNodeGroupsPlain(args: Endofunction[com.pulumi.aws.eks.inputs.GetNodeGroupsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.eks.outputs.GetNodeGroupsResult] =
      val argsBuilder = com.pulumi.aws.eks.inputs.GetNodeGroupsPlainArgs.builder
      com.pulumi.aws.eks.EksFunctions.getNodeGroupsPlain(args(argsBuilder).build)

  /** Manages an EKS Fargate Profile. */
  def FargateProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.FargateProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.FargateProfileArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.FargateProfile(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EKS Identity Provider Configuration. */
  def IdentityProviderConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.IdentityProviderConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.IdentityProviderConfigArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.IdentityProviderConfig(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an EKS Node Group, which can provision and optionally update an Auto Scaling group of Kubernetes worker nodes compatible with EKS. Additional documentation about this functionality can be found in the [EKS User Guide](https://docs.aws.amazon.com/eks/latest/userguide/managed-node-groups.html). */
  def NodeGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.NodeGroupArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.NodeGroupArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.NodeGroup(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Resource for managing an AWS EKS (Elastic Kubernetes) Pod Identity Association.
   * 
   * Creates an EKS Pod Identity association between a service account in an Amazon EKS cluster and an IAM role with EKS Pod Identity. Use EKS Pod Identity to give temporary IAM credentials to pods and the credentials are rotated automatically.
   * 
   * Amazon EKS Pod Identity associations provide the ability to manage credentials for your applications, similar to the way that EC2 instance profiles provide credentials to Amazon EC2 instances.
   * 
   * If a pod uses a service account that has an association, Amazon EKS sets environment variables in the containers of the pod. The environment variables configure the Amazon Web Services SDKs, including the Command Line Interface, to use the EKS Pod Identity credentials.
   * 
   * Pod Identity is a simpler method than IAM roles for service accounts, as this method doesn\u2019t use OIDC identity providers. Additionally, you can configure a role for Pod Identity once, and reuse it across clusters.
   */
  def PodIdentityAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.eks.PodIdentityAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.eks.PodIdentityAssociationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.eks.PodIdentityAssociation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
