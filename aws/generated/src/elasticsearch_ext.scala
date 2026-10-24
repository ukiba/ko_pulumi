package jp.ukiba.ko_pulumi
package aws

object elasticsearch_ext:
  extension (builder: com.pulumi.aws.elasticsearch.DomainArgs.Builder)
    /**
     * @param accessPolicies IAM policy document specifying the access policies for the domain.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.builder
      builder.accessPolicies(args(argsBuilder).build)

    /**
     * @param advancedSecurityOptions Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
     * @return builder
     */
    inline def advancedSecurityOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsArgs.builder
      builder.advancedSecurityOptions(args(argsBuilder).build)

    /**
     * @param autoTuneOptions Configuration block for the Auto-Tune options of the domain. Detailed below.
     * @return builder
     */
    inline def autoTuneOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsArgs.builder
      builder.autoTuneOptions(args(argsBuilder).build)

    /**
     * @param clusterConfig Configuration block for the cluster of the domain. Detailed below.
     * @return builder
     */
    inline def clusterConfig(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

    /**
     * @param cognitoOptions Configuration block for authenticating Kibana with Cognito. Detailed below.
     * @return builder
     */
    inline def cognitoOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainCognitoOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainCognitoOptionsArgs.builder
      builder.cognitoOptions(args(argsBuilder).build)

    /**
     * @param domainEndpointOptions Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * @return builder
     */
    inline def domainEndpointOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainDomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainDomainEndpointOptionsArgs.builder
      builder.domainEndpointOptions(args(argsBuilder).build)

    /**
     * @param ebsOptions Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * @return builder
     */
    inline def ebsOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainEbsOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainEbsOptionsArgs.builder
      builder.ebsOptions(args(argsBuilder).build)

    /**
     * @param encryptAtRest Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
     * @return builder
     */
    inline def encryptAtRest(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainEncryptAtRestArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainEncryptAtRestArgs.builder
      builder.encryptAtRest(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * @return builder
     */
    inline def logPublishingOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainLogPublishingOptionArgs.Builder]*):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainLogPublishingOptionArgs.builder
      builder.logPublishingOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeToNodeEncryption Configuration block for node-to-node encryption options. Detailed below.
     * @return builder
     */
    inline def nodeToNodeEncryption(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainNodeToNodeEncryptionArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainNodeToNodeEncryptionArgs.builder
      builder.nodeToNodeEncryption(args(argsBuilder).build)

    /**
     * @param snapshotOptions Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * @return builder
     */
    inline def snapshotOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainSnapshotOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainSnapshotOptionsArgs.builder
      builder.snapshotOptions(args(argsBuilder).build)

    /**
     * @param vpcOptions Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.DomainPolicyArgs.Builder)
    /**
     * @param accessPolicies IAM policy document specifying the access policies for the domain
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.builder
      builder.accessPolicies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.DomainSamlOptionsArgs.Builder)
    /**
     * @param samlOptions The SAML authentication options for an AWS Elasticsearch Domain.
     * @return builder
     */
    inline def samlOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.DomainSamlOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsArgs.builder
      builder.samlOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.VpcEndpointArgs.Builder)
    /**
     * @param vpcOptions Options to specify the subnets and security groups for the endpoint.
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.VpcEndpointVpcOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.VpcEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.VpcEndpointVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder)
    /**
     * @param masterUserOptions Configuration block for the main user. Detailed below.
     * @return builder
     */
    inline def masterUserOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsMasterUserOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsMasterUserOptionsArgs.builder
      builder.masterUserOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsArgs.Builder)
    /**
     * @param maintenanceSchedules Configuration block for Auto-Tune maintenance windows. Can be specified multiple times for each maintenance window. Detailed below.
     * @return builder
     */
    inline def maintenanceSchedules(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.Builder]*):
        com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.builder
      builder.maintenanceSchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.Builder)
    /**
     * @param duration Configuration block for the duration of the Auto-Tune maintenance window. Detailed below.
     * @return builder
     */
    inline def duration(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleDurationArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleDurationArgs.builder
      builder.duration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs.Builder)
    /**
     * @param coldStorageOptions Configuration block containing cold storage configuration. Detailed below.
     * @return builder
     */
    inline def coldStorageOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigColdStorageOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigColdStorageOptionsArgs.builder
      builder.coldStorageOptions(args(argsBuilder).build)

    /**
     * @param zoneAwarenessConfig Configuration block containing zone awareness settings. Detailed below.
     * @return builder
     */
    inline def zoneAwarenessConfig(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigZoneAwarenessConfigArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigZoneAwarenessConfigArgs.builder
      builder.zoneAwarenessConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainPolicyState.Builder)
    /**
     * @param accessPolicies IAM policy document specifying the access policies for the domain
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.builder
      builder.accessPolicies(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder)
    /**
     * @param idp Information from your identity provider.
     * @return builder
     */
    inline def idp(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsIdpArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsIdpArgs.builder
      builder.idp(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsState.Builder)
    /**
     * @param samlOptions The SAML authentication options for an AWS Elasticsearch Domain.
     * @return builder
     */
    inline def samlOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainSamlOptionsSamlOptionsArgs.builder
      builder.samlOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.DomainState.Builder)
    /**
     * @param accessPolicies IAM policy document specifying the access policies for the domain.
     * @return builder
     */
    inline def accessPolicies(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.builder
      builder.accessPolicies(args(argsBuilder).build)

    /**
     * @param advancedSecurityOptions Configuration block for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). Detailed below.
     * @return builder
     */
    inline def advancedSecurityOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainAdvancedSecurityOptionsArgs.builder
      builder.advancedSecurityOptions(args(argsBuilder).build)

    /**
     * @param autoTuneOptions Configuration block for the Auto-Tune options of the domain. Detailed below.
     * @return builder
     */
    inline def autoTuneOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsArgs.builder
      builder.autoTuneOptions(args(argsBuilder).build)

    /**
     * @param clusterConfig Configuration block for the cluster of the domain. Detailed below.
     * @return builder
     */
    inline def clusterConfig(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainClusterConfigArgs.builder
      builder.clusterConfig(args(argsBuilder).build)

    /**
     * @param cognitoOptions Configuration block for authenticating Kibana with Cognito. Detailed below.
     * @return builder
     */
    inline def cognitoOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainCognitoOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainCognitoOptionsArgs.builder
      builder.cognitoOptions(args(argsBuilder).build)

    /**
     * @param domainEndpointOptions Configuration block for domain endpoint HTTP(S) related options. Detailed below.
     * @return builder
     */
    inline def domainEndpointOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainDomainEndpointOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainDomainEndpointOptionsArgs.builder
      builder.domainEndpointOptions(args(argsBuilder).build)

    /**
     * @param ebsOptions Configuration block for EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). Detailed below.
     * @return builder
     */
    inline def ebsOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainEbsOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainEbsOptionsArgs.builder
      builder.ebsOptions(args(argsBuilder).build)

    /**
     * @param encryptAtRest Configuration block for encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). Detailed below.
     * @return builder
     */
    inline def encryptAtRest(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainEncryptAtRestArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainEncryptAtRestArgs.builder
      builder.encryptAtRest(args(argsBuilder).build)

    /**
     * @param logPublishingOptions Configuration block for publishing slow and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource. Detailed below.
     * @return builder
     */
    inline def logPublishingOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainLogPublishingOptionArgs.Builder]*):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      def argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainLogPublishingOptionArgs.builder
      builder.logPublishingOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param nodeToNodeEncryption Configuration block for node-to-node encryption options. Detailed below.
     * @return builder
     */
    inline def nodeToNodeEncryption(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainNodeToNodeEncryptionArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainNodeToNodeEncryptionArgs.builder
      builder.nodeToNodeEncryption(args(argsBuilder).build)

    /**
     * @param snapshotOptions Configuration block for snapshot related options. Detailed below. DEPRECATED. For domains running Elasticsearch 5.3 and later, Amazon ES takes hourly automated snapshots, making this setting irrelevant. For domains running earlier versions of Elasticsearch, Amazon ES takes daily automated snapshots.
     * @return builder
     */
    inline def snapshotOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainSnapshotOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainSnapshotOptionsArgs.builder
      builder.snapshotOptions(args(argsBuilder).build)

    /**
     * @param vpcOptions Configuration block for VPC related options. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)). Detailed below.
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.DomainState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.DomainVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.Builder)
    inline def Statement(args: Endofunction[com.pulumi.aws.iam.inputs.PolicyStatementArgs.Builder]*):
        com.pulumi.aws.elasticsearch.inputs.PolicyDocumentArgs.Builder =
      def argsBuilder = com.pulumi.aws.iam.inputs.PolicyStatementArgs.builder
      builder.Statement(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.elasticsearch.inputs.VpcEndpointState.Builder)
    /**
     * @param vpcOptions Options to specify the subnets and security groups for the endpoint.
     * @return builder
     */
    inline def vpcOptions(args: Endofunction[com.pulumi.aws.elasticsearch.inputs.VpcEndpointVpcOptionsArgs.Builder]):
        com.pulumi.aws.elasticsearch.inputs.VpcEndpointState.Builder =
      val argsBuilder = com.pulumi.aws.elasticsearch.inputs.VpcEndpointVpcOptionsArgs.builder
      builder.vpcOptions(args(argsBuilder).build)
