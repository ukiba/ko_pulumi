package jp.ukiba.ko_pulumi
package azure

object loganalytics_ext:
  extension (builder: com.pulumi.azure.loganalytics.ClusterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.loganalytics.ClusterArgs.Builder =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.Builder)
    /**
     * @param columns One or more `column` blocks as defined below.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.WorkspaceTableCustomLogArgs.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.loganalytics.WorkspaceTableMicrosoftArgs.Builder)
    /**
     * @param columns One or more `column` blocks as defined below.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.WorkspaceTableMicrosoftArgs.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.loganalytics.inputs.ClusterState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Log Analytics Cluster to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.Builder]):
        com.pulumi.azure.loganalytics.inputs.ClusterState.Builder =
      val argsBuilder = com.pulumi.azure.loganalytics.inputs.ClusterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogState.Builder)
    /**
     * @param columns One or more `column` blocks as defined below.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogState.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param standardColumns One or more `standardColumn` blocks as defined below.
     * @return builder
     */
    inline def standardColumns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogStandardColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogState.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableCustomLogStandardColumnArgs.builder
      builder.standardColumns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftState.Builder)
    /**
     * @param columns One or more `column` blocks as defined below.
     * @return builder
     */
    inline def columns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftState.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param standardColumns A `standardColumn` block as defined below.
     * @return builder
     */
    inline def standardColumns(args: Endofunction[com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftStandardColumnArgs.Builder]*):
        com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftState.Builder =
      def argsBuilder = com.pulumi.azure.loganalytics.inputs.WorkspaceTableMicrosoftStandardColumnArgs.builder
      builder.standardColumns(args.map(_(argsBuilder).build)*)
