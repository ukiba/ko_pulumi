package jp.ukiba.ko_pulumi
package aws

object devopsguru_ext:
  extension (builder: com.pulumi.aws.devopsguru.EventSourcesConfigArgs.Builder)
    /**
     * @param eventSources Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS Service. See `eventSources` below.
     * @return builder
     */
    inline def eventSources(args: Endofunction[com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder]*):
        com.pulumi.aws.devopsguru.EventSourcesConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.builder
      builder.eventSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder)
    /**
     * @param filters Filter configurations for the Amazon SNS notification topic. See the `filters` argument reference below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.Builder]):
        com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param sns SNS noficiation channel configurations. See the `sns` argument reference below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def sns(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.Builder]):
        com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.builder
      builder.sns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder)
    /**
     * @param cloudformation A collection of AWS CloudFormation stacks. See `cloudformation` below for additional details.
     * @return builder
     */
    inline def cloudformation(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.Builder]):
        com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.builder
      builder.cloudformation(args(argsBuilder).build)

    /**
     * @param tags AWS tags used to filter the resources in the resource collection. See `tags` below for additional details.
     * @return builder
     */
    inline def tags(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.Builder]):
        com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder)
    /**
     * @param kmsServerSideEncryption Information about whether DevOps Guru is configured to encrypt server-side data using KMS. See `kmsServerSideEncryption` below.
     * @return builder
     */
    inline def kmsServerSideEncryption(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.builder
      builder.kmsServerSideEncryption(args(argsBuilder).build)

    /**
     * @param logsAnomalyDetection Information about whether DevOps Guru is configured to perform log anomaly detection on Amazon CloudWatch log groups. See `logsAnomalyDetection` below.
     * @return builder
     */
    inline def logsAnomalyDetection(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.Builder]):
        com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.builder
      builder.logsAnomalyDetection(args(argsBuilder).build)

    /**
     * @param opsCenter Information about whether DevOps Guru is configured to create an OpsItem in AWS Systems Manager OpsCenter for each created insight. See `opsCenter` below.
     * @return builder
     */
    inline def opsCenter(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.Builder]):
        com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.builder
      builder.opsCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder)
    /**
     * @param amazonCodeGuruProfilers Stores whether DevOps Guru is configured to consume recommendations which are generated from AWS CodeGuru Profiler. See `amazonCodeGuruProfiler` below.
     * @return builder
     */
    inline def amazonCodeGuruProfilers(args: Endofunction[com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceAmazonCodeGuruProfilerArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceAmazonCodeGuruProfilerArgs.builder
      builder.amazonCodeGuruProfilers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.inputs.EventSourcesConfigState.Builder)
    /**
     * @param eventSources Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS Service. See `eventSources` below.
     * @return builder
     */
    inline def eventSources(args: Endofunction[com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.EventSourcesConfigState.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.builder
      builder.eventSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder)
    /**
     * @param filters Filter configurations for the Amazon SNS notification topic. See the `filters` attribute reference below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelFilterArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param sns SNS noficiation channel configurations. See the `sns` attribute reference below.
     * @return builder
     */
    inline def sns(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelSnArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelSnArgs.builder
      builder.sns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.inputs.GetNotificationChannelPlainArgs.Builder)
    /**
     * @param filters Filter configurations for the Amazon SNS notification topic. See the `filters` attribute reference below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelFilter.Builder]*):
        com.pulumi.aws.devopsguru.inputs.GetNotificationChannelPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelFilter.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param sns SNS noficiation channel configurations. See the `sns` attribute reference below.
     * @return builder
     */
    inline def sns(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelSn.Builder]*):
        com.pulumi.aws.devopsguru.inputs.GetNotificationChannelPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelSn.builder
      builder.sns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.inputs.NotificationChannelState.Builder)
    /**
     * @param filters Filter configurations for the Amazon SNS notification topic. See the `filters` argument reference below.
     * @return builder
     */
    inline def filters(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.NotificationChannelState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param sns SNS noficiation channel configurations. See the `sns` argument reference below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    inline def sns(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.NotificationChannelState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.builder
      builder.sns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.inputs.ResourceCollectionState.Builder)
    /**
     * @param cloudformation A collection of AWS CloudFormation stacks. See `cloudformation` below for additional details.
     * @return builder
     */
    inline def cloudformation(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ResourceCollectionState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.builder
      builder.cloudformation(args(argsBuilder).build)

    /**
     * @param tags AWS tags used to filter the resources in the resource collection. See `tags` below for additional details.
     * @return builder
     */
    inline def tags(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ResourceCollectionState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder)
    /**
     * @param kmsServerSideEncryption Information about whether DevOps Guru is configured to encrypt server-side data using KMS. See `kmsServerSideEncryption` below.
     * @return builder
     */
    inline def kmsServerSideEncryption(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.builder
      builder.kmsServerSideEncryption(args(argsBuilder).build)

    /**
     * @param logsAnomalyDetection Information about whether DevOps Guru is configured to perform log anomaly detection on Amazon CloudWatch log groups. See `logsAnomalyDetection` below.
     * @return builder
     */
    inline def logsAnomalyDetection(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.builder
      builder.logsAnomalyDetection(args(argsBuilder).build)

    /**
     * @param opsCenter Information about whether DevOps Guru is configured to create an OpsItem in AWS Systems Manager OpsCenter for each created insight. See `opsCenter` below.
     * @return builder
     */
    inline def opsCenter(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.builder
      builder.opsCenter(args(argsBuilder).build)
