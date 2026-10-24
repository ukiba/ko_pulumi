package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object redshift:
  /** Creates a Redshift authentication profile */
  def AuthenticationProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.AuthenticationProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.AuthenticationProfileArgs.builder
    com.pulumi.aws.redshift.AuthenticationProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Redshift Cluster Resource.
   * 
   * &gt; **NOTE:** A Redshift cluster&#39;s default IAM role can be managed both by this resource&#39;s `defaultIamRoleArn` argument and the `aws.redshift.ClusterIamRoles` resource&#39;s `defaultIamRoleArn` argument. Do not configure different values for both arguments. Doing so will cause a conflict of default IAM roles.
   * 
   * &gt; **Note:** Write-Only argument `masterPasswordWo` is available to use in place of `masterPassword`. Write-Only arguments are supported in HashiCorp Terraform 1.11.0 and later. Learn more.
   */
  def Cluster(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ClusterArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ClusterArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.Cluster(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a Redshift Cluster IAM Roles resource.
   * 
   * &gt; **NOTE:** A Redshift cluster&#39;s default IAM role can be managed both by this resource&#39;s `defaultIamRoleArn` argument and the `aws.redshift.Cluster` resource&#39;s `defaultIamRoleArn` argument. Do not configure different values for both arguments. Doing so will cause a conflict of default IAM roles.
   */
  def ClusterIamRoles(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ClusterIamRolesArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.ClusterIamRolesArgs.builder
    com.pulumi.aws.redshift.ClusterIamRoles(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a Redshift cluster snapshot */
  def ClusterSnapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ClusterSnapshotArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ClusterSnapshotArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.ClusterSnapshot(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Redshift Data Share Authorization. */
  def DataShareAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.DataShareAuthorizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.DataShareAuthorizationArgs.builder
    com.pulumi.aws.redshift.DataShareAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Redshift Data Share Consumer Association. */
  def DataShareConsumerAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.DataShareConsumerAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.DataShareConsumerAssociationArgs.builder
    com.pulumi.aws.redshift.DataShareConsumerAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift endpoint access. */
  def EndpointAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.EndpointAccessArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.EndpointAccessArgs.builder
    com.pulumi.aws.redshift.EndpointAccess(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift endpoint authorization. */
  def EndpointAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.EndpointAuthorizationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.EndpointAuthorizationArgs.builder
    com.pulumi.aws.redshift.EndpointAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Redshift event subscription resource. */
  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.EventSubscriptionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.EventSubscriptionArgs.builder
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
    com.pulumi.aws.redshift.EventSubscription(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates an HSM client certificate that an Amazon Redshift cluster will use to connect to the client&#39;s HSM in order to store and retrieve the keys used to encrypt the cluster databases. */
  def HsmClientCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.HsmClientCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.HsmClientCertificateArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.HsmClientCertificate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates an HSM configuration that contains the information required by an Amazon Redshift cluster to store and use database encryption keys in a Hardware Security Module (HSM). */
  def HsmConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.HsmConfigurationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.HsmConfigurationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.HsmConfiguration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift IDC application. */
  def IdcApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.IdcApplicationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.IdcApplicationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.IdcApplication(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing a DynamoDB zero-ETL integration or S3 event integration with Amazon Redshift. You can refer to the [User Guide](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/RedshiftforDynamoDB-zero-etl.html) for a DynamoDB zero-ETL integration or the [User Guide](https://docs.aws.amazon.com/redshift/latest/dg/loading-data-copy-job.html) for a S3 event integration. */
  def Integration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.IntegrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.IntegrationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.Integration(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Redshift Logging configuration. */
  def Logging(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.LoggingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.LoggingArgs.builder
    com.pulumi.aws.redshift.Logging(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an Amazon Redshift namespace registration to the AWS Glue Data Catalog. Use this resource to enable access to a Redshift data warehouse using the Apache Iceberg REST API.
   * 
   * &gt; **NOTE:** This resource has limited drift detection capabilities. AWS does not provide a reliable API to verify registration status after creation. The resource verifies that the underlying cluster or namespace exists and that an internal data share was created, but cannot detect if the registration was removed outside of Terraform.
   */
  def NamespaceRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.NamespaceRegistrationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.NamespaceRegistrationArgs.builder
    com.pulumi.aws.redshift.NamespaceRegistration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a Redshift Cluster parameter group resource. */
  def ParameterGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ParameterGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ParameterGroupArgs.builder
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
    com.pulumi.aws.redshift.ParameterGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift Partner Integration. */
  def Partner(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.PartnerArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.PartnerArgs.builder
    com.pulumi.aws.redshift.Partner(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object RedshiftFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about a specific redshift cluster. */
    inline def getCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific redshift cluster. */
    inline def getClusterPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides redshift cluster temporary credentials. */
    inline def getClusterCredentials(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterCredentialsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetClusterCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterCredentialsArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getClusterCredentials(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides redshift cluster temporary credentials. */
    inline def getClusterCredentialsPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetClusterCredentialsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetClusterCredentialsResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetClusterCredentialsPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getClusterCredentialsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing AWS Redshift Data Shares. */
    inline def getDataShares(args: Endofunction[com.pulumi.aws.redshift.inputs.GetDataSharesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetDataSharesArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getDataShares(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing AWS Redshift Data Shares. */
    inline def getDataSharesPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetDataSharesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetDataSharesPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getDataSharesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Information about Redshift Orderable Clusters and valid parameter combinations. */
    inline def getOrderableCluster(args: Endofunction[com.pulumi.aws.redshift.inputs.GetOrderableClusterArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetOrderableClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetOrderableClusterArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getOrderableCluster(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Information about Redshift Orderable Clusters and valid parameter combinations. */
    inline def getOrderableClusterPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetOrderableClusterPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetOrderableClusterResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetOrderableClusterPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getOrderableClusterPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing AWS Redshift Producer Data Shares. */
    inline def getProducerDataShares(args: Endofunction[com.pulumi.aws.redshift.inputs.GetProducerDataSharesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetProducerDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetProducerDataSharesArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getProducerDataShares(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing AWS Redshift Producer Data Shares. */
    inline def getProducerDataSharesPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetProducerDataSharesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetProducerDataSharesResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetProducerDataSharesPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getProducerDataSharesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides details about a specific redshift subnet group. */
    inline def getSubnetGroup(args: Endofunction[com.pulumi.aws.redshift.inputs.GetSubnetGroupArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.redshift.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetSubnetGroupArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getSubnetGroup(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides details about a specific redshift subnet group. */
    inline def getSubnetGroupPlain(args: Endofunction[com.pulumi.aws.redshift.inputs.GetSubnetGroupPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.redshift.outputs.GetSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.redshift.inputs.GetSubnetGroupPlainArgs.builder
      com.pulumi.aws.redshift.RedshiftFunctions.getSubnetGroupPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Creates a new Amazon Redshift Resource Policy. */
  def ResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ResourcePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.ResourcePolicyArgs.builder
    com.pulumi.aws.redshift.ResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def ScheduledAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.ScheduledActionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.ScheduledActionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.redshift.ScheduledAction(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS Redshift Snapshot Copy. */
  def SnapshotCopy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotCopyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.SnapshotCopyArgs.builder
    com.pulumi.aws.redshift.SnapshotCopy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a snapshot copy grant that allows AWS Redshift to encrypt copied snapshots with a customer master key from AWS KMS in a destination region.
   * 
   * Note that the grant must exist in the destination region, and not in the region of the cluster.
   */
  def SnapshotCopyGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotCopyGrantArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.SnapshotCopyGrantArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.SnapshotCopyGrant(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def SnapshotSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotScheduleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.SnapshotScheduleArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.SnapshotSchedule(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def SnapshotScheduleAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SnapshotScheduleAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.redshift.SnapshotScheduleAssociationArgs.builder
    com.pulumi.aws.redshift.SnapshotScheduleAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift subnet group. You must provide a list of one or more subnets in your existing VPC when creating Amazon Redshift subnet group. */
  def SubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.SubnetGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.SubnetGroupArgs.builder
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
    com.pulumi.aws.redshift.SubnetGroup(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a new Amazon Redshift Usage Limit. */
  def UsageLimit(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.redshift.UsageLimitArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.redshift.UsageLimitArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.redshift.UsageLimit(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
