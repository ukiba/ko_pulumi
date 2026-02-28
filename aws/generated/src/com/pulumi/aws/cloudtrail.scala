package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object cloudtrail:
  extension (builder: com.pulumi.aws.cloudtrail.EventDataStoreArgs.Builder)
    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * @return builder
     */
    def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.EventDataStoreArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  type CloudtrailFunctions = com.pulumi.aws.cloudtrail.CloudtrailFunctions
  object CloudtrailFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.cloudtrail.CloudtrailFunctions.*
  extension (self: CloudtrailFunctions.type)
    /**
     * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
     *  in a given region for the purpose of allowing CloudTrail to store trail data in S3.
     *  
     *  &gt; **Warning:** This data source is deprecated. The AWS documentation [states that](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create-s3-bucket-policy-for-cloudtrail.html#troubleshooting-s3-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
     */
    def getServiceAccount(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.GetServiceAccountArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudtrail.outputs.GetServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.cloudtrail.inputs.GetServiceAccountArgs.builder
      com.pulumi.aws.cloudtrail.CloudtrailFunctions.getServiceAccount(args(argsBuilder).build)

    /**
     * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
     *  in a given region for the purpose of allowing CloudTrail to store trail data in S3.
     *  
     *  &gt; **Warning:** This data source is deprecated. The AWS documentation [states that](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create-s3-bucket-policy-for-cloudtrail.html#troubleshooting-s3-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
     */
    def getServiceAccountPlain(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.GetServiceAccountPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudtrail.outputs.GetServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.cloudtrail.inputs.GetServiceAccountPlainArgs.builder
      com.pulumi.aws.cloudtrail.CloudtrailFunctions.getServiceAccountPlain(args(argsBuilder).build)

  /**
   * Provides a CloudTrail resource.
   *  
   *  &gt; **Tip:** For a multi-region trail, this resource must be in the home region of the trail.
   *  
   *  &gt; **Tip:** For an organization trail, this resource must be in the master account of the organization.
   */
  def Trail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudtrail.TrailArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudtrail.TrailArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudtrail.Trail(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudtrail.TrailArgs.Builder)
    /**
     * @param advancedEventSelectors Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `eventSelector`.
     * @return builder
     */
    def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.TrailArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param eventSelectors Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advancedEventSelector`.
     * @return builder
     */
    def eventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.TrailArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.builder
      builder.eventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param insightSelectors Configuration block for identifying unusual operational activity. See details below.
     * @return builder
     */
    def insightSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.TrailArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.builder
      builder.insightSelectors(args.map(_(argsBuilder).build)*)

  /** Provides a resource to manage an AWS CloudTrail Delegated Administrator. */
  def OrganizationDelegatedAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudtrail.OrganizationDelegatedAdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.cloudtrail.OrganizationDelegatedAdminAccountArgs.builder
    
    com.pulumi.aws.cloudtrail.OrganizationDelegatedAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.EventDataStoreState.Builder)
    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * @return builder
     */
    def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.EventDataStoreState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors Specifies the selector statements in an advanced event selector. Fields documented below.
     * @return builder
     */
    def fieldSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors Specifies the selector statements in an advanced event selector. Fields documented below.
     * @return builder
     */
    def fieldSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder)
    /**
     * @param dataResources Configuration block for data events. See details below.
     * @return builder
     */
    def dataResources(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorDataResourceArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorDataResourceArgs.builder
      builder.dataResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.TrailState.Builder)
    /**
     * @param advancedEventSelectors Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `eventSelector`.
     * @return builder
     */
    def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param eventSelectors Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advancedEventSelector`.
     * @return builder
     */
    def eventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.builder
      builder.eventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param insightSelectors Configuration block for identifying unusual operational activity. See details below.
     * @return builder
     */
    def insightSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.builder
      builder.insightSelectors(args.map(_(argsBuilder).build)*)

  /**
   * Provides a CloudTrail Event Data Store.
   *  
   *  More information about event data stores can be found in the [Event Data Store User Guide](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html).
   *  
   *  &gt; **Tip:** For an organization event data store you must create this resource in the management account.
   */
  def EventDataStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.cloudtrail.EventDataStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudtrail.EventDataStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.cloudtrail.EventDataStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
