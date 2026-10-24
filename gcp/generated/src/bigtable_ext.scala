package jp.ukiba.ko_pulumi
package gcp

object bigtable_ext:
  extension (builder: com.pulumi.gcp.bigtable.AppProfileArgs.Builder)
    /**
     * @param dataBoostIsolationReadOnly Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     * Structure is documented below.
     * @return builder
     */
    def dataBoostIsolationReadOnly(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.Builder]):
        com.pulumi.gcp.bigtable.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.builder
      builder.dataBoostIsolationReadOnly(args(argsBuilder).build)

    /**
     * @param singleClusterRouting Use a single-cluster routing policy.
     * Structure is documented below.
     * @return builder
     */
    def singleClusterRouting(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.Builder]):
        com.pulumi.gcp.bigtable.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.builder
      builder.singleClusterRouting(args(argsBuilder).build)

    /**
     * @param standardIsolation The standard options used for isolating this app profile&#39;s traffic from other use cases.
     * Structure is documented below.
     * @return builder
     */
    def standardIsolation(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.Builder]):
        com.pulumi.gcp.bigtable.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.builder
      builder.standardIsolation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.AuthorizedViewArgs.Builder)
    /**
     * @param subsetView An AuthorizedView permitting access to an explicit subset of a Table. Structure is documented below.
     * @return builder
     */
    def subsetView(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder]):
        com.pulumi.gcp.bigtable.AuthorizedViewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.builder
      builder.subsetView(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.GCPolicyArgs.Builder)
    /**
     * @param maxAge GC policy that applies to all cells older than the given age.
     * @return builder
     */
    def maxAge(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.Builder]):
        com.pulumi.gcp.bigtable.GCPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.builder
      builder.maxAge(args(argsBuilder).build)

    /**
     * @param maxVersions GC policy that applies to all versions of a cell except for the most recent.
     * @return builder
     */
    def maxVersions(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.Builder]*):
        com.pulumi.gcp.bigtable.GCPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.builder
      builder.maxVersions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.InstanceArgs.Builder)
    /**
     * @param clusters A block of cluster configuration options. This can be specified at least once, and up
     * to as many as possible within 8 cloud regions. Removing the field entirely from the config will cause the provider
     * to default to the backend value. See structure below.
     * 
     * ***
     * @return builder
     */
    def clusters(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder]*):
        com.pulumi.gcp.bigtable.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.builder
      builder.clusters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.InstanceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.InstanceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.SchemaBundleArgs.Builder)
    /**
     * @param protoSchema File descriptor set, generated by protoc.
     * To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     * \$ protoc --include_imports --include_source_info test.proto -o out.pb
     * Structure is documented below.
     * @return builder
     */
    def protoSchema(args: Endofunction[com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.Builder]):
        com.pulumi.gcp.bigtable.SchemaBundleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.builder
      builder.protoSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.TableArgs.Builder)
    /**
     * @param automatedBackupPolicy Defines an automated backup policy for a table, specified by `retentionPeriod` and `frequency`. To create a table with automated backup disabled, either omit the `automatedBackupPolicy` argument or set both `retentionPeriod` and `frequency` to &#34;0&#34;. To disable automated backup on an existing table that has automated backup enabled, set both `retentionPeriod` and `frequency` to &#34;0&#34;. When updating an existing table, change the `retentionPeriod` or `frequency` by setting the respective property to a non-zero value. The policy also accepts an optional `locations` list to specify backup storage locations; if `locations` is omitted, the policy defaults to all clusters in the instance. If the `automatedBackupPolicy` argument is not provided on update, the resource&#39;s automated backup policy will not be modified.
     * @return builder
     */
    def automatedBackupPolicy(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.Builder]):
        com.pulumi.gcp.bigtable.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.builder
      builder.automatedBackupPolicy(args(argsBuilder).build)

    /**
     * @param columnFamilies A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     * @return builder
     */
    def columnFamilies(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.Builder]*):
        com.pulumi.gcp.bigtable.TableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.builder
      builder.columnFamilies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.TableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.TableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.TableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.TableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder)
    /**
     * @param dataBoostIsolationReadOnly Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     * Structure is documented below.
     * @return builder
     */
    def dataBoostIsolationReadOnly(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.builder
      builder.dataBoostIsolationReadOnly(args(argsBuilder).build)

    /**
     * @param singleClusterRouting Use a single-cluster routing policy.
     * Structure is documented below.
     * @return builder
     */
    def singleClusterRouting(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.builder
      builder.singleClusterRouting(args(argsBuilder).build)

    /**
     * @param standardIsolation The standard options used for isolating this app profile&#39;s traffic from other use cases.
     * Structure is documented below.
     * @return builder
     */
    def standardIsolation(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.builder
      builder.standardIsolation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.AuthorizedViewState.Builder)
    /**
     * @param subsetView An AuthorizedView permitting access to an explicit subset of a Table. Structure is documented below.
     * @return builder
     */
    def subsetView(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AuthorizedViewState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.builder
      builder.subsetView(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder)
    /**
     * @param familySubsets A group of column family subsets to be included in the authorized view. This can be specified multiple times. Structure is documented below.
     * 
     * ***
     * @return builder
     */
    def familySubsets(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewFamilySubsetArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewFamilySubsetArgs.builder
      builder.familySubsets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.inputs.GCPolicyState.Builder)
    /**
     * @param maxAge GC policy that applies to all cells older than the given age.
     * @return builder
     */
    def maxAge(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.GCPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.builder
      builder.maxAge(args(argsBuilder).build)

    /**
     * @param maxVersions GC policy that applies to all versions of a cell except for the most recent.
     * @return builder
     */
    def maxVersions(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.GCPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.builder
      builder.maxVersions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder)
    /**
     * @param autoscalingConfig [Autoscaling](https://cloud.google.com/bigtable/docs/autoscaling#parameters) config for the cluster, contains the following arguments:
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceClusterAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceClusterAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceState.Builder)
    /**
     * @param clusters A block of cluster configuration options. This can be specified at least once, and up
     * to as many as possible within 8 cloud regions. Removing the field entirely from the config will cause the provider
     * to default to the backend value. See structure below.
     * 
     * ***
     * @return builder
     */
    def clusters(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.builder
      builder.clusters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.inputs.SchemaBundleState.Builder)
    /**
     * @param protoSchema File descriptor set, generated by protoc.
     * To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     * \$ protoc --include_imports --include_source_info test.proto -o out.pb
     * Structure is documented below.
     * @return builder
     */
    def protoSchema(args: Endofunction[com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.SchemaBundleState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.builder
      builder.protoSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.TableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.TableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.TableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.TableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.TableState.Builder)
    /**
     * @param automatedBackupPolicy Defines an automated backup policy for a table, specified by `retentionPeriod` and `frequency`. To create a table with automated backup disabled, either omit the `automatedBackupPolicy` argument or set both `retentionPeriod` and `frequency` to &#34;0&#34;. To disable automated backup on an existing table that has automated backup enabled, set both `retentionPeriod` and `frequency` to &#34;0&#34;. When updating an existing table, change the `retentionPeriod` or `frequency` by setting the respective property to a non-zero value. The policy also accepts an optional `locations` list to specify backup storage locations; if `locations` is omitted, the policy defaults to all clusters in the instance. If the `automatedBackupPolicy` argument is not provided on update, the resource&#39;s automated backup policy will not be modified.
     * @return builder
     */
    def automatedBackupPolicy(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.builder
      builder.automatedBackupPolicy(args(argsBuilder).build)

    /**
     * @param columnFamilies A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     * @return builder
     */
    def columnFamilies(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.builder
      builder.columnFamilies(args.map(_(argsBuilder).build)*)
