package jp.ukiba.ko_pulumi
package gcp

object gkebackup_ext:
  extension (builder: com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder)
    /**
     * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
     * Structure is documented below.
     * @return builder
     */
    inline def backupConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.builder
      builder.backupConfig(args(argsBuilder).build)

    /**
     * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
     * Structure is documented below.
     * @return builder
     */
    inline def backupSchedule(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.builder
      builder.backupSchedule(args(argsBuilder).build)

    /**
     * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
     * Structure is documented below.
     * @return builder
     */
    inline def retentionPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.BackupPlanIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.RestorePlanArgs.Builder)
    /**
     * @param restoreConfig Defines the configuration of Restores created via this RestorePlan.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.RestorePlanArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.builder
      builder.restoreConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.RestorePlanIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.RestorePlanIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder)
    /**
     * @param encryptionKey This defines a customer managed encryption key that will be used to encrypt the &#34;config&#34;
     * portion (the Kubernetes resources) of Backups created via this plan.
     * Structure is documented below.
     * @return builder
     */
    inline def encryptionKey(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigEncryptionKeyArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigEncryptionKeyArgs.builder
      builder.encryptionKey(args(argsBuilder).build)

    /**
     * @param selectedApplications A list of namespaced Kubernetes Resources.
     * Structure is documented below.
     * @return builder
     */
    inline def selectedApplications(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.builder
      builder.selectedApplications(args(argsBuilder).build)

    /**
     * @param selectedNamespaceLabels If set, include just the resources in the listed namespace Labels.
     * Structure is documented below.
     * @return builder
     */
    inline def selectedNamespaceLabels(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.builder
      builder.selectedNamespaceLabels(args(argsBuilder).build)

    /**
     * @param selectedNamespaces If set, include just the resources in the listed namespaces.
     * Structure is documented below.
     * @return builder
     */
    inline def selectedNamespaces(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespacesArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespacesArgs.builder
      builder.selectedNamespaces(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.Builder)
    /**
     * @param namespacedNames A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * @return builder
     */
    inline def namespacedNames(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedApplicationsNamespacedNameArgs.builder
      builder.namespacedNames(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.Builder)
    /**
     * @param resourceLabels A list of Kubernetes Namespace labels.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceLabels(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsResourceLabelArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigSelectedNamespaceLabelsResourceLabelArgs.builder
      builder.resourceLabels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder)
    /**
     * @param rpoConfig Defines the RPO schedule configuration for this BackupPlan. This is mutually
     * exclusive with the cronSchedule field since at most one schedule can be defined
     * for a BackupPLan. If this is defined, then backupRetainDays must also be defined.
     * Structure is documented below.
     * @return builder
     */
    inline def rpoConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.builder
      builder.rpoConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.Builder)
    /**
     * @param exclusionWindows User specified time windows during which backup can NOT happen for this BackupPlan.
     * Backups should start and finish outside of any given exclusion window. Note: backup
     * jobs will be scheduled to start and finish outside the duration of the window as
     * much as possible, but running jobs will not get canceled when it runs into the window.
     * All the time and date values in exclusionWindows entry in the API are in UTC. We
     * only allow &lt;=1 recurrence (daily or weekly) exclusion window for a BackupPlan while no
     * restriction on number of single occurrence windows.
     * Structure is documented below.
     * @return builder
     */
    inline def exclusionWindows(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.builder
      builder.exclusionWindows(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder)
    /**
     * @param daysOfWeek The exclusion window occurs on these days of each week in UTC.
     * Only one of singleOccurrenceDate, daily and daysOfWeek may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def daysOfWeek(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeekArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowDaysOfWeekArgs.builder
      builder.daysOfWeek(args(argsBuilder).build)

    /**
     * @param singleOccurrenceDate No recurrence. The exclusion window occurs only once and on this date in UTC.
     * Only one of singleOccurrenceDate, daily and daysOfWeek may be set.
     * Structure is documented below.
     * @return builder
     */
    inline def singleOccurrenceDate(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowSingleOccurrenceDateArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowSingleOccurrenceDateArgs.builder
      builder.singleOccurrenceDate(args(argsBuilder).build)

    /**
     * @param startTime Specifies the start time of the window using time of the day in UTC.
     * Structure is documented below.
     * @return builder
     */
    inline def startTime(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowStartTimeArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleRpoConfigExclusionWindowStartTimeArgs.builder
      builder.startTime(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder)
    /**
     * @param backupConfig Defines the configuration of Backups created via this BackupPlan.
     * Structure is documented below.
     * @return builder
     */
    inline def backupConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupConfigArgs.builder
      builder.backupConfig(args(argsBuilder).build)

    /**
     * @param backupSchedule Defines a schedule for automatic Backup creation via this BackupPlan.
     * Structure is documented below.
     * @return builder
     */
    inline def backupSchedule(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanBackupScheduleArgs.builder
      builder.backupSchedule(args(argsBuilder).build)

    /**
     * @param retentionPolicy RetentionPolicy governs lifecycle of Backups created under this plan.
     * Structure is documented below.
     * @return builder
     */
    inline def retentionPolicy(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.BackupPlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.BackupPlanRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder)
    /**
     * @param clusterResourceRestoreScope Identifies the cluster-scoped resources to restore from the Backup.
     * Structure is documented below.
     * @return builder
     */
    inline def clusterResourceRestoreScope(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.builder
      builder.clusterResourceRestoreScope(args(argsBuilder).build)

    /**
     * @param excludedNamespaces A list of selected namespaces excluded from restoration.
     * All namespaces except those in this list will be restored.
     * Structure is documented below.
     * @return builder
     */
    inline def excludedNamespaces(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigExcludedNamespacesArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigExcludedNamespacesArgs.builder
      builder.excludedNamespaces(args(argsBuilder).build)

    /**
     * @param restoreOrder It contains custom ordering to use on a Restore.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreOrder(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.builder
      builder.restoreOrder(args(argsBuilder).build)

    /**
     * @param selectedApplications A list of selected ProtectedApplications to restore.
     * The listed ProtectedApplications and all the resources
     * to which they refer will be restored.
     * Structure is documented below.
     * @return builder
     */
    inline def selectedApplications(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.builder
      builder.selectedApplications(args(argsBuilder).build)

    /**
     * @param selectedNamespaces A list of selected namespaces to restore from the Backup.
     * The listed Namespaces and all resources contained in them will be restored.
     * Structure is documented below.
     * @return builder
     */
    inline def selectedNamespaces(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedNamespacesArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedNamespacesArgs.builder
      builder.selectedNamespaces(args(argsBuilder).build)

    /**
     * @param transformationRules A list of transformation rules to be applied against Kubernetes
     * resources as they are selected for restoration from a Backup.
     * Rules are executed in order defined - this order matters,
     * as changes made by a rule may impact the filtering logic of subsequent
     * rules. An empty list means no transformation will occur.
     * Structure is documented below.
     * @return builder
     */
    inline def transformationRules(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.builder
      builder.transformationRules(args.map(_(argsBuilder).build)*)

    /**
     * @param volumeDataRestorePolicyBindings A table that binds volumes by their scope to a restore policy. Bindings
     * must have a unique scope. Any volumes not scoped in the bindings are
     * subject to the policy defined in volume_data_restore_policy.
     * Structure is documented below.
     * @return builder
     */
    inline def volumeDataRestorePolicyBindings(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigVolumeDataRestorePolicyBindingArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigVolumeDataRestorePolicyBindingArgs.builder
      builder.volumeDataRestorePolicyBindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder)
    /**
     * @param excludedGroupKinds A list of cluster-scoped resource group kinds to NOT restore from the backup.
     * If specified, all valid cluster-scoped resources will be restored except
     * for those specified in the list.
     * Mutually exclusive to any other field in `clusterResourceRestoreScope`.
     * Structure is documented below.
     * @return builder
     */
    inline def excludedGroupKinds(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeExcludedGroupKindArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeExcludedGroupKindArgs.builder
      builder.excludedGroupKinds(args.map(_(argsBuilder).build)*)

    /**
     * @param selectedGroupKinds A list of cluster-scoped resource group kinds to restore from the backup.
     * If specified, only the selected resources will be restored.
     * Mutually exclusive to any other field in the `clusterResourceRestoreScope`.
     * Structure is documented below.
     * @return builder
     */
    inline def selectedGroupKinds(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeSelectedGroupKindArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigClusterResourceRestoreScopeSelectedGroupKindArgs.builder
      builder.selectedGroupKinds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.Builder)
    /**
     * @param groupKindDependencies A list of group kind dependency pairs
     * that is used by Backup for GKE to
     * generate a group kind restore order.
     * Structure is documented below.
     * @return builder
     */
    inline def groupKindDependencies(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.builder
      builder.groupKindDependencies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder)
    /**
     * @param requiring The requiring group kind requires that the satisfying
     * group kind be restored first.
     * Structure is documented below.
     * @return builder
     */
    inline def requiring(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiringArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyRequiringArgs.builder
      builder.requiring(args(argsBuilder).build)

    /**
     * @param satisfying The satisfying group kind must be restored first
     * in order to satisfy the dependency.
     * Structure is documented below.
     * @return builder
     */
    inline def satisfying(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigRestoreOrderGroupKindDependencySatisfyingArgs.builder
      builder.satisfying(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.Builder)
    /**
     * @param namespacedNames A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * @return builder
     */
    inline def namespacedNames(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs.builder
      builder.namespacedNames(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder)
    /**
     * @param fieldActions A list of transformation rule actions to take against candidate
     * resources. Actions are executed in order defined - this order
     * matters, as they could potentially interfere with each other and
     * the first operation could affect the outcome of the second operation.
     * Structure is documented below.
     * @return builder
     */
    inline def fieldActions(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleFieldActionArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleFieldActionArgs.builder
      builder.fieldActions(args.map(_(argsBuilder).build)*)

    /**
     * @param resourceFilter This field is used to specify a set of fields that should be used to
     * determine which resources in backup should be acted upon by the
     * supplied transformation rule actions, and this will ensure that only
     * specific resources are affected by transformation rule actions.
     * Structure is documented below.
     * @return builder
     */
    inline def resourceFilter(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.builder
      builder.resourceFilter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.Builder)
    /**
     * @param groupKinds (Filtering parameter) Any resource subject to transformation must
     * belong to one of the listed &#34;types&#34;. If this field is not provided,
     * no type filtering will be performed
     * (all resources of all types matching previous filtering parameters
     * will be candidates for transformation).
     * Structure is documented below.
     * @return builder
     */
    inline def groupKinds(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindArgs.Builder]*):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigTransformationRuleResourceFilterGroupKindArgs.builder
      builder.groupKinds(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkebackup.inputs.RestorePlanState.Builder)
    /**
     * @param restoreConfig Defines the configuration of Restores created via this RestorePlan.
     * Structure is documented below.
     * @return builder
     */
    inline def restoreConfig(args: Endofunction[com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.Builder]):
        com.pulumi.gcp.gkebackup.inputs.RestorePlanState.Builder =
      val argsBuilder = com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs.builder
      builder.restoreConfig(args(argsBuilder).build)
