package jp.ukiba.ko_pulumi
package aws

object cloudtrail_ext:
  extension (builder: com.pulumi.aws.cloudtrail.EventDataStoreArgs.Builder)
    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * @return builder
     */
    inline def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.EventDataStoreArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.TrailArgs.Builder)
    /**
     * @param advancedEventSelectors Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `eventSelector`.
     * @return builder
     */
    inline def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.TrailArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param eventSelectors Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advancedEventSelector`.
     * @return builder
     */
    inline def eventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.TrailArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.builder
      builder.eventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param insightSelectors Configuration block for identifying unusual operational activity. See details below.
     * @return builder
     */
    inline def insightSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.TrailArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.builder
      builder.insightSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors Specifies the selector statements in an advanced event selector. Fields documented below.
     * @return builder
     */
    inline def fieldSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.EventDataStoreState.Builder)
    /**
     * @param advancedEventSelectors The advanced event selectors to use to select the events for the data store. For more information about how to use advanced event selectors, see [Log events by using advanced event selectors](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-data-events-with-cloudtrail.html#creating-data-event-selectors-advanced) in the CloudTrail User Guide.
     * @return builder
     */
    inline def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.EventDataStoreState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.EventDataStoreAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder)
    /**
     * @param fieldSelectors Specifies the selector statements in an advanced event selector. Fields documented below.
     * @return builder
     */
    inline def fieldSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorFieldSelectorArgs.builder
      builder.fieldSelectors(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder)
    /**
     * @param dataResources Configuration block for data events. See details below.
     * @return builder
     */
    inline def dataResources(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorDataResourceArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorDataResourceArgs.builder
      builder.dataResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.cloudtrail.inputs.TrailState.Builder)
    /**
     * @param advancedEventSelectors Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `eventSelector`.
     * @return builder
     */
    inline def advancedEventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs.builder
      builder.advancedEventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param eventSelectors Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advancedEventSelector`.
     * @return builder
     */
    inline def eventSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs.builder
      builder.eventSelectors(args.map(_(argsBuilder).build)*)

    /**
     * @param insightSelectors Configuration block for identifying unusual operational activity. See details below.
     * @return builder
     */
    inline def insightSelectors(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.Builder]*):
        com.pulumi.aws.cloudtrail.inputs.TrailState.Builder =
      def argsBuilder = com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs.builder
      builder.insightSelectors(args.map(_(argsBuilder).build)*)
