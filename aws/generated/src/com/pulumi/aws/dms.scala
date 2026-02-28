package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object dms:
  /** Provides a DMS (Data Migration Service) event subscription resource. */
  def EventSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.EventSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.EventSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.EventSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a DMS (Data Migration Service) certificate resource. DMS certificates can be created, deleted, and imported. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.CertificateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a DMS (Data Migration Service) replication task resource. DMS replication tasks can be created, updated, deleted, and imported.
   *  
   *  &gt; **NOTE:** Changing most arguments will stop the task if it is running. You can set `startReplicationTask` to resume the task afterwards.
   */
  def ReplicationTask(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.ReplicationTaskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.ReplicationTaskArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.ReplicationTask(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a DMS (Data Migration Service) S3 endpoint resource. DMS S3 endpoints can be created, updated, deleted, and imported.
   *  
   *  &gt; **Note:** AWS is deprecating `extraConnectionAttributes`, such as used with `aws.dms.Endpoint`. This resource is an alternative to `aws.dms.Endpoint` and does not use `extraConnectionAttributes`. (AWS currently includes `extraConnectionAttributes` in the raw responses to the AWS Provider requests and so they may be visible in the logs.)
   *  
   *  &gt; **Note:** Some of this resource&#39;s arguments have default values that come from the AWS Provider. Other default values are provided by AWS and subject to change without notice. When relying on AWS defaults, the provider state will often have a zero value. For example, the AWS Provider does not provide a default for `cdcMaxBatchInterval` but the AWS default is `60` (seconds). However, the provider state will show `0` since this is the value return by AWS when no value is present. Below, we aim to flag the defaults that come from AWS (_e.g._, &#34;AWS default...&#34;).
   */
  def S3Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.S3EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.S3EndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.S3Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dms.ReplicationConfigArgs.Builder)
    /**
     * @param computeConfig Configuration block for provisioning an DMS Serverless replication.
     * @return builder
     */
    def computeConfig(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.Builder]):
        com.pulumi.aws.dms.ReplicationConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.builder
      builder.computeConfig(args(argsBuilder).build)

  type DmsFunctions = com.pulumi.aws.dms.DmsFunctions
  object DmsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.dms.DmsFunctions.*
  extension (self: DmsFunctions.type)
    /** Data source for managing an AWS DMS (Database Migration) Certificate. */
    def getCertificate(args: Endofunction[com.pulumi.aws.dms.inputs.GetCertificateArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dms.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetCertificateArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getCertificate(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Certificate. */
    def getCertificatePlain(args: Endofunction[com.pulumi.aws.dms.inputs.GetCertificatePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dms.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetCertificatePlainArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getCertificatePlain(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Endpoint. */
    def getEndpoint(args: Endofunction[com.pulumi.aws.dms.inputs.GetEndpointArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dms.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetEndpointArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getEndpoint(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Endpoint. */
    def getEndpointPlain(args: Endofunction[com.pulumi.aws.dms.inputs.GetEndpointPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dms.outputs.GetEndpointResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetEndpointPlainArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getEndpointPlain(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Replication Instance. */
    def getReplicationInstance(args: Endofunction[com.pulumi.aws.dms.inputs.GetReplicationInstanceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dms.outputs.GetReplicationInstanceResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetReplicationInstanceArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getReplicationInstance(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Replication Instance. */
    def getReplicationInstancePlain(args: Endofunction[com.pulumi.aws.dms.inputs.GetReplicationInstancePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dms.outputs.GetReplicationInstanceResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetReplicationInstancePlainArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getReplicationInstancePlain(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Replication Subnet Group. */
    def getReplicationSubnetGroup(args: Endofunction[com.pulumi.aws.dms.inputs.GetReplicationSubnetGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dms.outputs.GetReplicationSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetReplicationSubnetGroupArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getReplicationSubnetGroup(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Replication Subnet Group. */
    def getReplicationSubnetGroupPlain(args: Endofunction[com.pulumi.aws.dms.inputs.GetReplicationSubnetGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dms.outputs.GetReplicationSubnetGroupResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetReplicationSubnetGroupPlainArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getReplicationSubnetGroupPlain(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Replication Task. */
    def getReplicationTask(args: Endofunction[com.pulumi.aws.dms.inputs.GetReplicationTaskArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.dms.outputs.GetReplicationTaskResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetReplicationTaskArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getReplicationTask(args(argsBuilder).build)

    /** Data source for managing an AWS DMS (Database Migration) Replication Task. */
    def getReplicationTaskPlain(args: Endofunction[com.pulumi.aws.dms.inputs.GetReplicationTaskPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.dms.outputs.GetReplicationTaskResult] =
      val argsBuilder = com.pulumi.aws.dms.inputs.GetReplicationTaskPlainArgs.builder
      com.pulumi.aws.dms.DmsFunctions.getReplicationTaskPlain(args(argsBuilder).build)

  /**
   * Provides a DMS Serverless replication config resource.
   *  
   *  &gt; **NOTE:** Changing most arguments will stop the replication if it is running. You can set `startReplication` to resume the replication afterwards.
   */
  def ReplicationConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.ReplicationConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.ReplicationConfigArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.ReplicationConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a DMS (Data Migration Service) endpoint resource. DMS endpoints can be created, updated, deleted, and imported.
   *  
   *  &gt; **Note:** All arguments including the password will be stored in the raw state as plain-text. ## Example Usage
   *  
   *  <pre>
   *  {@code
   *  package generated_program;
   *  
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.aws.dms.Endpoint;
   *  import com.pulumi.aws.dms.EndpointArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   *  
   *  public class App {
   *      public static void main(String[] args) {
   *          Pulumi.run(App::stack);
   *      }
   *  
   *      public static void stack(Context ctx) {
   *          var test = new Endpoint("test", EndpointArgs.builder()
   *              .certificateArn("arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012")
   *              .databaseName("test")
   *              .endpointId("test-dms-endpoint-tf")
   *              .endpointType("source")
   *              .engineName("aurora")
   *              .extraConnectionAttributes("")
   *              .kmsKeyArn("arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012")
   *              .password("test")
   *              .port(3306)
   *              .serverName("test")
   *              .sslMode("none")
   *              .tags(Map.of("Name", "test"))
   *              .username("test")
   *              .build());
   *  
   *      }
   *  }
   *  }
   *  </pre>
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import endpoints using the `endpoint_id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:dms/endpoint:Endpoint test test-dms-endpoint-tf
   *  ```
   */
  def Endpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.EndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.EndpointArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.Endpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dms.ReplicationInstanceArgs.Builder)
    /**
     * @param kerberosAuthenticationSettings Configuration block for settings required for Kerberos authentication. See below.
     * @return builder
     */
    def kerberosAuthenticationSettings(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.Builder]):
        com.pulumi.aws.dms.ReplicationInstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.builder
      builder.kerberosAuthenticationSettings(args(argsBuilder).build)

  /** Provides a DMS (Data Migration Service) replication instance resource. DMS replication instances can be created, updated, deleted, and imported. */
  def ReplicationInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.ReplicationInstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.ReplicationInstanceArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.ReplicationInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides a DMS (Data Migration Service) replication subnet group resource. DMS replication subnet groups can be created, updated, deleted, and imported.
   *  
   *  &gt; **Note:** AWS requires a special IAM role called `dms-vpc-role` when using this resource. See the example below to create it as part of your configuration.
   */
  def ReplicationSubnetGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.dms.ReplicationSubnetGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.dms.ReplicationSubnetGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.dms.ReplicationSubnetGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.dms.EndpointArgs.Builder)
    /**
     * @param elasticsearchSettings Configuration block for OpenSearch settings. See below.
     * @return builder
     */
    def elasticsearchSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.builder
      builder.elasticsearchSettings(args(argsBuilder).build)

    /**
     * @param kafkaSettings Configuration block for Kafka settings. See below.
     * @return builder
     */
    def kafkaSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.builder
      builder.kafkaSettings(args(argsBuilder).build)

    /**
     * @param kinesisSettings Configuration block for Kinesis settings. See below.
     * @return builder
     */
    def kinesisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.builder
      builder.kinesisSettings(args(argsBuilder).build)

    /**
     * @param mongodbSettings Configuration block for MongoDB settings. See below.
     * @return builder
     */
    def mongodbSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.builder
      builder.mongodbSettings(args(argsBuilder).build)

    /**
     * @param mysqlSettings Configuration block for MySQL settings. See below.
     * @return builder
     */
    def mysqlSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.builder
      builder.mysqlSettings(args(argsBuilder).build)

    /**
     * @param oracleSettings Configuration block for Oracle settings. See below.
     * @return builder
     */
    def oracleSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.builder
      builder.oracleSettings(args(argsBuilder).build)

    /**
     * @param postgresSettings Configuration block for Postgres settings. See below.
     * @return builder
     */
    def postgresSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.builder
      builder.postgresSettings(args(argsBuilder).build)

    def redisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.builder
      builder.redisSettings(args(argsBuilder).build)

    /**
     * @param redshiftSettings Configuration block for Redshift settings. See below.
     * @return builder
     */
    def redshiftSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.Builder]):
        com.pulumi.aws.dms.EndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.builder
      builder.redshiftSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.ReplicationConfigState.Builder)
    /**
     * @param computeConfig Configuration block for provisioning an DMS Serverless replication.
     * @return builder
     */
    def computeConfig(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.Builder]):
        com.pulumi.aws.dms.inputs.ReplicationConfigState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationConfigComputeConfigArgs.builder
      builder.computeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.EndpointState.Builder)
    /**
     * @param elasticsearchSettings Configuration block for OpenSearch settings. See below.
     * @return builder
     */
    def elasticsearchSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs.builder
      builder.elasticsearchSettings(args(argsBuilder).build)

    /**
     * @param kafkaSettings Configuration block for Kafka settings. See below.
     * @return builder
     */
    def kafkaSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs.builder
      builder.kafkaSettings(args(argsBuilder).build)

    /**
     * @param kinesisSettings Configuration block for Kinesis settings. See below.
     * @return builder
     */
    def kinesisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs.builder
      builder.kinesisSettings(args(argsBuilder).build)

    /**
     * @param mongodbSettings Configuration block for MongoDB settings. See below.
     * @return builder
     */
    def mongodbSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs.builder
      builder.mongodbSettings(args(argsBuilder).build)

    /**
     * @param mysqlSettings Configuration block for MySQL settings. See below.
     * @return builder
     */
    def mysqlSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointMysqlSettingsArgs.builder
      builder.mysqlSettings(args(argsBuilder).build)

    /**
     * @param oracleSettings Configuration block for Oracle settings. See below.
     * @return builder
     */
    def oracleSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointOracleSettingsArgs.builder
      builder.oracleSettings(args(argsBuilder).build)

    /**
     * @param postgresSettings Configuration block for Postgres settings. See below.
     * @return builder
     */
    def postgresSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointPostgresSettingsArgs.builder
      builder.postgresSettings(args(argsBuilder).build)

    def redisSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedisSettingsArgs.builder
      builder.redisSettings(args(argsBuilder).build)

    /**
     * @param redshiftSettings Configuration block for Redshift settings. See below.
     * @return builder
     */
    def redshiftSettings(args: Endofunction[com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.EndpointState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.EndpointRedshiftSettingsArgs.builder
      builder.redshiftSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.dms.inputs.ReplicationInstanceState.Builder)
    /**
     * @param kerberosAuthenticationSettings Configuration block for settings required for Kerberos authentication. See below.
     * @return builder
     */
    def kerberosAuthenticationSettings(args: Endofunction[com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.Builder]):
        com.pulumi.aws.dms.inputs.ReplicationInstanceState.Builder =
      val argsBuilder = com.pulumi.aws.dms.inputs.ReplicationInstanceKerberosAuthenticationSettingsArgs.builder
      builder.kerberosAuthenticationSettings(args(argsBuilder).build)
