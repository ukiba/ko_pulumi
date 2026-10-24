package jp.ukiba.ko_pulumi
package azure

object consumption_ext:
  extension (builder: com.pulumi.azure.consumption.BudgetManagementGroupArgs.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterArgs.Builder]):
        com.pulumi.azure.consumption.BudgetManagementGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupNotificationArgs.Builder]*):
        com.pulumi.azure.consumption.BudgetManagementGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param timePeriod A `timePeriod` block as defined below.
     * @return builder
     */
    def timePeriod(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupTimePeriodArgs.Builder]):
        com.pulumi.azure.consumption.BudgetManagementGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupTimePeriodArgs.builder
      builder.timePeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.consumption.BudgetResourceGroupArgs.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterArgs.Builder]):
        com.pulumi.azure.consumption.BudgetResourceGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupNotificationArgs.Builder]*):
        com.pulumi.azure.consumption.BudgetResourceGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param timePeriod A `timePeriod` block as defined below.
     * @return builder
     */
    def timePeriod(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupTimePeriodArgs.Builder]):
        com.pulumi.azure.consumption.BudgetResourceGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupTimePeriodArgs.builder
      builder.timePeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.consumption.BudgetSubscriptionArgs.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterArgs.Builder]):
        com.pulumi.azure.consumption.BudgetSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionNotificationArgs.Builder]*):
        com.pulumi.azure.consumption.BudgetSubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param timePeriod A `timePeriod` block as defined below.
     * @return builder
     */
    def timePeriod(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionTimePeriodArgs.Builder]):
        com.pulumi.azure.consumption.BudgetSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionTimePeriodArgs.builder
      builder.timePeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterArgs.Builder)
    /**
     * @param dimensions One or more `dimension` blocks as defined below to filter the budget on.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterDimensionArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param tags One or more `tag` blocks as defined below to filter the budget on.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterTagArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.consumption.inputs.BudgetManagementGroupState.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterArgs.Builder]):
        com.pulumi.azure.consumption.inputs.BudgetManagementGroupState.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupNotificationArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetManagementGroupState.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param timePeriod A `timePeriod` block as defined below.
     * @return builder
     */
    def timePeriod(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetManagementGroupTimePeriodArgs.Builder]):
        com.pulumi.azure.consumption.inputs.BudgetManagementGroupState.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetManagementGroupTimePeriodArgs.builder
      builder.timePeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterArgs.Builder)
    /**
     * @param dimensions One or more `dimension` blocks as defined below to filter the budget on.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterDimensionArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param tags One or more `tag` blocks as defined below to filter the budget on.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterTagArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.consumption.inputs.BudgetResourceGroupState.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterArgs.Builder]):
        com.pulumi.azure.consumption.inputs.BudgetResourceGroupState.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupNotificationArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetResourceGroupState.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param timePeriod A `timePeriod` block as defined below.
     * @return builder
     */
    def timePeriod(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetResourceGroupTimePeriodArgs.Builder]):
        com.pulumi.azure.consumption.inputs.BudgetResourceGroupState.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetResourceGroupTimePeriodArgs.builder
      builder.timePeriod(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterArgs.Builder)
    /**
     * @param dimensions One or more `dimension` blocks as defined below to filter the budget on.
     * @return builder
     */
    def dimensions(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterDimensionArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterDimensionArgs.builder
      builder.dimensions(args.map(_(argsBuilder).build)*)

    /**
     * @param tags One or more `tag` blocks as defined below to filter the budget on.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterTagArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterArgs.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.consumption.inputs.BudgetSubscriptionState.Builder)
    /**
     * @param filter A `filter` block as defined below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterArgs.Builder]):
        com.pulumi.azure.consumption.inputs.BudgetSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param notifications One or more `notification` blocks as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionNotificationArgs.Builder]*):
        com.pulumi.azure.consumption.inputs.BudgetSubscriptionState.Builder =
      def argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionNotificationArgs.builder
      builder.notifications(args.map(_(argsBuilder).build)*)

    /**
     * @param timePeriod A `timePeriod` block as defined below.
     * @return builder
     */
    def timePeriod(args: Endofunction[com.pulumi.azure.consumption.inputs.BudgetSubscriptionTimePeriodArgs.Builder]):
        com.pulumi.azure.consumption.inputs.BudgetSubscriptionState.Builder =
      val argsBuilder = com.pulumi.azure.consumption.inputs.BudgetSubscriptionTimePeriodArgs.builder
      builder.timePeriod(args(argsBuilder).build)
