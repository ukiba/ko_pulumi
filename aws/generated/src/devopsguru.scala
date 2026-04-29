package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object devopsguru:
  type DevopsguruFunctions = com.pulumi.aws.devopsguru.DevopsguruFunctions
  object DevopsguruFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.devopsguru.DevopsguruFunctions.*
  extension (self: DevopsguruFunctions.type)
    /** Data source for managing an AWS DevOps Guru Notification Channel. */
    def getNotificationChannel(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.devopsguru.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getNotificationChannel(args(argsBuilder).build)

    /** Data source for managing an AWS DevOps Guru Notification Channel. */
    def getNotificationChannelPlain(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.devopsguru.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelPlainArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getNotificationChannelPlain(args(argsBuilder).build)

    /** Data source for managing an AWS DevOps Guru Resource Collection. */
    def getResourceCollection(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetResourceCollectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.devopsguru.outputs.GetResourceCollectionResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetResourceCollectionArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getResourceCollection(args(argsBuilder).build)

    /** Data source for managing an AWS DevOps Guru Resource Collection. */
    def getResourceCollectionPlain(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetResourceCollectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.devopsguru.outputs.GetResourceCollectionResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetResourceCollectionPlainArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getResourceCollectionPlain(args(argsBuilder).build)

  /**
   * Resource for managing an AWS DevOps Guru Service Integration.
   *  
   *  &gt; To prevent unintentional deletion of account wide settings, destruction of this resource will only remove it from the Terraform state. To disable any configured settings, explicitly set the opt-in value to `DISABLED` and apply again before destroying.
   */
  def ServiceIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.devopsguru.ServiceIntegrationArgs.builder
    
    com.pulumi.aws.devopsguru.ServiceIntegration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.devopsguru.EventSourcesConfigArgs.Builder)
    /**
     * @param eventSources Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS Service. See `eventSources` below.
     * @return builder
     */
    def eventSources(args: Endofunction[com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder]*):
        com.pulumi.aws.devopsguru.EventSourcesConfigArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.builder
      builder.eventSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder)
    /**
     * @param filters Filter configurations for the Amazon SNS notification topic. See the `filters` argument reference below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.Builder]):
        com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param sns SNS noficiation channel configurations. See the `sns` argument reference below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def sns(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.Builder]):
        com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.builder
      builder.sns(args(argsBuilder).build)

  /** Resource for managing an AWS DevOps Guru Notification Channel. */
  def NotificationChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.devopsguru.NotificationChannelArgs.builder
    
    com.pulumi.aws.devopsguru.NotificationChannel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS DevOps Guru Event Sources Config. Currently the only service that can be integrated with DevOps Guru is Amazon CodeGuru Profiler, which can produce proactive recommendations which can be stored and viewed in DevOps Guru.
   *  
   *  &gt; Destruction of this resource will set the CodeGuru profiler status to `DISABLED`. If you wish to preserve an `ENABLED` configuration while removing the Terraform resource, utilize a `removed` block (available in Terraform 1.7+).
   *  
   *  &gt; Event sources are configured at the account level. To avoid persistent differences, this resource should be defined only once.
   */
  def EventSourcesConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.EventSourcesConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.devopsguru.EventSourcesConfigArgs.builder
    
    com.pulumi.aws.devopsguru.EventSourcesConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS DevOps Guru Resource Collection.
   *  
   *  &gt; Only one type of resource collection (All Account Resources, CloudFormation, or Tags) can be enabled in an account at a time. To avoid persistent differences, this resource should be defined only once.
   */
  def ResourceCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.devopsguru.ResourceCollectionArgs.builder
    
    com.pulumi.aws.devopsguru.ResourceCollection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder)
    /**
     * @param cloudformation A collection of AWS CloudFormation stacks. See `cloudformation` below for additional details.
     * @return builder
     */
    def cloudformation(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.Builder]):
        com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.builder
      builder.cloudformation(args(argsBuilder).build)

    /**
     * @param tags AWS tags used to filter the resources in the resource collection. See `tags` below for additional details.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.Builder]):
        com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder)
    /**
     * @param kmsServerSideEncryption Information about whether DevOps Guru is configured to encrypt server-side data using KMS. See `kmsServerSideEncryption` below.
     * @return builder
     */
    def kmsServerSideEncryption(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.builder
      builder.kmsServerSideEncryption(args(argsBuilder).build)

    /**
     * @param logsAnomalyDetection Information about whether DevOps Guru is configured to perform log anomaly detection on Amazon CloudWatch log groups. See `logsAnomalyDetection` below.
     * @return builder
     */
    def logsAnomalyDetection(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.Builder]):
        com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.builder
      builder.logsAnomalyDetection(args(argsBuilder).build)

    /**
     * @param opsCenter Information about whether DevOps Guru is configured to create an OpsItem in AWS Systems Manager OpsCenter for each created insight. See `opsCenter` below.
     * @return builder
     */
    def opsCenter(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.Builder]):
        com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.builder
      builder.opsCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.inputs.ResourceCollectionState.Builder)
    /**
     * @param cloudformation A collection of AWS CloudFormation stacks. See `cloudformation` below for additional details.
     * @return builder
     */
    def cloudformation(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ResourceCollectionState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionCloudformationArgs.builder
      builder.cloudformation(args(argsBuilder).build)

    /**
     * @param tags AWS tags used to filter the resources in the resource collection. See `tags` below for additional details.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ResourceCollectionState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ResourceCollectionTagsArgs.builder
      builder.tags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder)
    /**
     * @param filters Filter configurations for the Amazon SNS notification topic. See the `filters` attribute reference below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelFilterArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

    /**
     * @param sns SNS noficiation channel configurations. See the `sns` attribute reference below.
     * @return builder
     */
    def sns(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelSnArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelSnArgs.builder
      builder.sns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder)
    /**
     * @param kmsServerSideEncryption Information about whether DevOps Guru is configured to encrypt server-side data using KMS. See `kmsServerSideEncryption` below.
     * @return builder
     */
    def kmsServerSideEncryption(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationKmsServerSideEncryptionArgs.builder
      builder.kmsServerSideEncryption(args(argsBuilder).build)

    /**
     * @param logsAnomalyDetection Information about whether DevOps Guru is configured to perform log anomaly detection on Amazon CloudWatch log groups. See `logsAnomalyDetection` below.
     * @return builder
     */
    def logsAnomalyDetection(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationLogsAnomalyDetectionArgs.builder
      builder.logsAnomalyDetection(args(argsBuilder).build)

    /**
     * @param opsCenter Information about whether DevOps Guru is configured to create an OpsItem in AWS Systems Manager OpsCenter for each created insight. See `opsCenter` below.
     * @return builder
     */
    def opsCenter(args: Endofunction[com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.ServiceIntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.ServiceIntegrationOpsCenterArgs.builder
      builder.opsCenter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder)
    /**
     * @param amazonCodeGuruProfilers Stores whether DevOps Guru is configured to consume recommendations which are generated from AWS CodeGuru Profiler. See `amazonCodeGuruProfiler` below.
     * @return builder
     */
    def amazonCodeGuruProfilers(args: Endofunction[com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceAmazonCodeGuruProfilerArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceAmazonCodeGuruProfilerArgs.builder
      builder.amazonCodeGuruProfilers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.devopsguru.inputs.NotificationChannelState.Builder)
    /**
     * @param filters Filter configurations for the Amazon SNS notification topic. See the `filters` argument reference below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.NotificationChannelState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelFiltersArgs.builder
      builder.filters(args(argsBuilder).build)

    /**
     * @param sns SNS noficiation channel configurations. See the `sns` argument reference below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def sns(args: Endofunction[com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.Builder]):
        com.pulumi.aws.devopsguru.inputs.NotificationChannelState.Builder =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.NotificationChannelSnsArgs.builder
      builder.sns(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.devopsguru.inputs.EventSourcesConfigState.Builder)
    /**
     * @param eventSources Configuration information about the integration of DevOps Guru as the Consumer via EventBridge with another AWS Service. See `eventSources` below.
     * @return builder
     */
    def eventSources(args: Endofunction[com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.Builder]*):
        com.pulumi.aws.devopsguru.inputs.EventSourcesConfigState.Builder =
      def argsBuilder = com.pulumi.aws.devopsguru.inputs.EventSourcesConfigEventSourceArgs.builder
      builder.eventSources(args.map(_(argsBuilder).build)*)
