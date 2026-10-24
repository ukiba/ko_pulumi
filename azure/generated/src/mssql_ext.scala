package jp.ukiba.ko_pulumi
package azure

object mssql_ext:
  extension (builder: com.pulumi.azure.mssql.DatabaseArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below. Mutually exclusive with `createMode`.
     * @return builder
     */
    def import_(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseImportArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param shortTermRetentionPolicy A `shortTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def shortTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.builder
      builder.shortTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.Builder)
    /**
     * @param baselineResults A `baselineResult` block as documented below. Multiple blocks can be defined.
     * @return builder
     */
    def baselineResults(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.Builder]*):
        com.pulumi.azure.mssql.DatabaseVulnerabilityAssessmentRuleBaselineArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.builder
      builder.baselineResults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.ElasticPoolArgs.Builder)
    /**
     * @param perDatabaseSettings A `perDatabaseSettings` block as defined below.
     * @return builder
     */
    def perDatabaseSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.Builder]):
        com.pulumi.azure.mssql.ElasticPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.builder
      builder.perDatabaseSettings(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.Builder]):
        com.pulumi.azure.mssql.ElasticPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.FailoverGroupArgs.Builder)
    /**
     * @param partnerServers A `partnerServer` block as defined below.
     * @return builder
     */
    def partnerServers(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.Builder]*):
        com.pulumi.azure.mssql.FailoverGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.builder
      builder.partnerServers(args.map(_(argsBuilder).build)*)

    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.FailoverGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.JobAgentArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.Builder]):
        com.pulumi.azure.mssql.JobAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.JobStepArgs.Builder)
    /**
     * @param outputTarget An `outputTarget` block as defined below.
     * @return builder
     */
    def outputTarget(args: Endofunction[com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.Builder]):
        com.pulumi.azure.mssql.JobStepArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.builder
      builder.outputTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.JobTargetGroupArgs.Builder)
    /**
     * @param jobTargets One or more `jobTarget` blocks as defined below.
     * @return builder
     */
    def jobTargets(args: Endofunction[com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.Builder]*):
        com.pulumi.azure.mssql.JobTargetGroupArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.builder
      builder.jobTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder)
    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param pointInTimeRestore A `pointInTimeRestore` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def pointInTimeRestore(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.Builder]):
        com.pulumi.azure.mssql.ManagedDatabaseArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.builder
      builder.pointInTimeRestore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceArgs.Builder)
    /**
     * @param azureActiveDirectoryAdministrator An `azureActiveDirectoryAdministrator` block as defined below.
     * @return builder
     */
    def azureActiveDirectoryAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.builder
      builder.azureActiveDirectoryAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.Builder)
    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceFailoverGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.Builder)
    /**
     * @param schedules A `schedule` block as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.Builder]*):
        com.pulumi.azure.mssql.ManagedInstanceStartStopScheduleArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.ManagedInstanceVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.ServerArgs.Builder)
    /**
     * @param azureadAdministrator An `azureadAdministrator` block as defined below.
     * @return builder
     */
    def azureadAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.builder
      builder.azureadAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.mssql.ServerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.Builder)
    /**
     * @param recurringScans A `recurringScans` block as defined below.
     * 
     * &gt; **Note:** To reset the `recurringScans` code block to it&#39;s default values you must explicitly define an empty `recurringScans` code block (e.g., `recurringScans {}`) in your configuration file.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.ServerVulnerabilityAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.VirtualMachineArgs.Builder)
    /**
     * @param assessment An `assessment` block as defined below.
     * @return builder
     */
    def assessment(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.builder
      builder.assessment(args(argsBuilder).build)

    /**
     * @param autoBackup An `autoBackup` block as defined below. This block can be added to an existing resource, but removing this block forces a new resource to be created.
     * @return builder
     */
    def autoBackup(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.builder
      builder.autoBackup(args(argsBuilder).build)

    /**
     * @param autoPatching An `autoPatching` block as defined below.
     * @return builder
     */
    def autoPatching(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.builder
      builder.autoPatching(args(argsBuilder).build)

    /**
     * @param keyVaultCredential An `keyVaultCredential` block as defined below.
     * @return builder
     */
    def keyVaultCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.builder
      builder.keyVaultCredential(args(argsBuilder).build)

    /**
     * @param sqlInstance A `sqlInstance` block as defined below.
     * @return builder
     */
    def sqlInstance(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.builder
      builder.sqlInstance(args(argsBuilder).build)

    /**
     * @param storageConfiguration An `storageConfiguration` block as defined below.
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    /**
     * @param wsfcDomainCredential A `wsfcDomainCredential` block as defined below
     * @return builder
     */
    def wsfcDomainCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.builder
      builder.wsfcDomainCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder)
    /**
     * @param loadBalancerConfiguration A `loadBalancerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Either one of `loadBalancerConfiguration` or `multiSubnetIpConfiguration` must be specified.
     * @return builder
     */
    def loadBalancerConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.builder
      builder.loadBalancerConfiguration(args(argsBuilder).build)

    /**
     * @param multiSubnetIpConfigurations One or more `multiSubnetIpConfiguration` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def multiSubnetIpConfigurations(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.Builder]*):
        com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.builder
      builder.multiSubnetIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param replicas One or more `replica` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.Builder]*):
        com.pulumi.azure.mssql.VirtualMachineAvailabilityGroupListenerArgs.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.VirtualMachineGroupArgs.Builder)
    /**
     * @param wsfcDomainProfile A `wsfcDomainProfile` block as defined below.
     * @return builder
     */
    def wsfcDomainProfile(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.Builder]):
        com.pulumi.azure.mssql.VirtualMachineGroupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.builder
      builder.wsfcDomainProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.DatabaseState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param import_ A `import` block as documented below. Mutually exclusive with `createMode`.
     * @return builder
     */
    def import_(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseImportArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseImportArgs.builder
      builder.import_(args(argsBuilder).build)

    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param shortTermRetentionPolicy A `shortTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def shortTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseShortTermRetentionPolicyArgs.builder
      builder.shortTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param threatDetectionPolicy Threat detection policy configuration. The `threatDetectionPolicy` block supports fields documented below.
     * @return builder
     */
    def threatDetectionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseThreatDetectionPolicyArgs.builder
      builder.threatDetectionPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineState.Builder)
    /**
     * @param baselineResults A `baselineResult` block as documented below. Multiple blocks can be defined.
     * @return builder
     */
    def baselineResults(args: Endofunction[com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.DatabaseVulnerabilityAssessmentRuleBaselineBaselineResultArgs.builder
      builder.baselineResults(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.ElasticPoolState.Builder)
    /**
     * @param perDatabaseSettings A `perDatabaseSettings` block as defined below.
     * @return builder
     */
    def perDatabaseSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ElasticPoolState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolPerDatabaseSettingsArgs.builder
      builder.perDatabaseSettings(args(argsBuilder).build)

    /**
     * @param sku A `sku` block as defined below.
     * @return builder
     */
    def sku(args: Endofunction[com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ElasticPoolState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ElasticPoolSkuArgs.builder
      builder.sku(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.FailoverGroupState.Builder)
    /**
     * @param partnerServers A `partnerServer` block as defined below.
     * @return builder
     */
    def partnerServers(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.FailoverGroupState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupPartnerServerArgs.builder
      builder.partnerServers(args.map(_(argsBuilder).build)*)

    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.FailoverGroupState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.FailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.JobAgentState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.JobAgentState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobAgentIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.JobStepState.Builder)
    /**
     * @param outputTarget An `outputTarget` block as defined below.
     * @return builder
     */
    def outputTarget(args: Endofunction[com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.Builder]):
        com.pulumi.azure.mssql.inputs.JobStepState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.JobStepOutputTargetArgs.builder
      builder.outputTarget(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.JobTargetGroupState.Builder)
    /**
     * @param jobTargets One or more `jobTarget` blocks as defined below.
     * @return builder
     */
    def jobTargets(args: Endofunction[com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.JobTargetGroupState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.JobTargetGroupJobTargetArgs.builder
      builder.jobTargets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedDatabaseState.Builder)
    /**
     * @param longTermRetentionPolicy A `longTermRetentionPolicy` block as defined below.
     * @return builder
     */
    def longTermRetentionPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabaseLongTermRetentionPolicyArgs.builder
      builder.longTermRetentionPolicy(args(argsBuilder).build)

    /**
     * @param pointInTimeRestore A `pointInTimeRestore` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def pointInTimeRestore(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedDatabaseState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedDatabasePointInTimeRestoreArgs.builder
      builder.pointInTimeRestore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupState.Builder)
    /**
     * @param partnerRegions A `partnerRegion` block as defined below.
     * @return builder
     */
    def partnerRegions(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupPartnerRegionArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupPartnerRegionArgs.builder
      builder.partnerRegions(args.map(_(argsBuilder).build)*)

    /**
     * @param readWriteEndpointFailoverPolicy A `readWriteEndpointFailoverPolicy` block as defined below.
     * @return builder
     */
    def readWriteEndpointFailoverPolicy(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceFailoverGroupReadWriteEndpointFailoverPolicyArgs.builder
      builder.readWriteEndpointFailoverPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleState.Builder)
    /**
     * @param schedules A `schedule` block as defined below.
     * @return builder
     */
    def schedules(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceStartStopScheduleScheduleArgs.builder
      builder.schedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceState.Builder)
    /**
     * @param azureActiveDirectoryAdministrator An `azureActiveDirectoryAdministrator` block as defined below.
     * @return builder
     */
    def azureActiveDirectoryAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceAzureActiveDirectoryAdministratorArgs.builder
      builder.azureActiveDirectoryAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans The recurring scans settings. The `recurringScans` block supports fields documented below.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ManagedInstanceVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ServerState.Builder)
    /**
     * @param azureadAdministrator An `azureadAdministrator` block as defined below.
     * @return builder
     */
    def azureadAdministrator(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerAzureadAdministratorArgs.builder
      builder.azureadAdministrator(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerIdentityArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ServerState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentState.Builder)
    /**
     * @param recurringScans A `recurringScans` block as defined below.
     * 
     * &gt; **Note:** To reset the `recurringScans` code block to it&#39;s default values you must explicitly define an empty `recurringScans` code block (e.g., `recurringScans {}`) in your configuration file.
     * @return builder
     */
    def recurringScans(args: Endofunction[com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.Builder]):
        com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.ServerVulnerabilityAssessmentRecurringScansArgs.builder
      builder.recurringScans(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder)
    /**
     * @param schedule An `schedule` block as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentScheduleArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder)
    /**
     * @param manualSchedule A `manualSchedule` block as documented below. When this block is present, the schedule type is set to `Manual`. Without this block, the schedule type is set to `Automated`.
     * @return builder
     */
    def manualSchedule(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupManualScheduleArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupManualScheduleArgs.builder
      builder.manualSchedule(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder)
    /**
     * @param loadBalancerConfiguration A `loadBalancerConfiguration` block as defined below. Changing this forces a new resource to be created.
     * 
     * &gt; **Note:** Either one of `loadBalancerConfiguration` or `multiSubnetIpConfiguration` must be specified.
     * @return builder
     */
    def loadBalancerConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerLoadBalancerConfigurationArgs.builder
      builder.loadBalancerConfiguration(args(argsBuilder).build)

    /**
     * @param multiSubnetIpConfigurations One or more `multiSubnetIpConfiguration` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def multiSubnetIpConfigurations(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerMultiSubnetIpConfigurationArgs.builder
      builder.multiSubnetIpConfigurations(args.map(_(argsBuilder).build)*)

    /**
     * @param replicas One or more `replica` blocks as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.Builder]*):
        com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerState.Builder =
      def argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAvailabilityGroupListenerReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineGroupState.Builder)
    /**
     * @param wsfcDomainProfile A `wsfcDomainProfile` block as defined below.
     * @return builder
     */
    def wsfcDomainProfile(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineGroupState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineGroupWsfcDomainProfileArgs.builder
      builder.wsfcDomainProfile(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder)
    /**
     * @param assessment An `assessment` block as defined below.
     * @return builder
     */
    def assessment(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAssessmentArgs.builder
      builder.assessment(args(argsBuilder).build)

    /**
     * @param autoBackup An `autoBackup` block as defined below. This block can be added to an existing resource, but removing this block forces a new resource to be created.
     * @return builder
     */
    def autoBackup(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoBackupArgs.builder
      builder.autoBackup(args(argsBuilder).build)

    /**
     * @param autoPatching An `autoPatching` block as defined below.
     * @return builder
     */
    def autoPatching(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineAutoPatchingArgs.builder
      builder.autoPatching(args(argsBuilder).build)

    /**
     * @param keyVaultCredential An `keyVaultCredential` block as defined below.
     * @return builder
     */
    def keyVaultCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineKeyVaultCredentialArgs.builder
      builder.keyVaultCredential(args(argsBuilder).build)

    /**
     * @param sqlInstance A `sqlInstance` block as defined below.
     * @return builder
     */
    def sqlInstance(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineSqlInstanceArgs.builder
      builder.sqlInstance(args(argsBuilder).build)

    /**
     * @param storageConfiguration An `storageConfiguration` block as defined below.
     * @return builder
     */
    def storageConfiguration(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.builder
      builder.storageConfiguration(args(argsBuilder).build)

    /**
     * @param wsfcDomainCredential A `wsfcDomainCredential` block as defined below
     * @return builder
     */
    def wsfcDomainCredential(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineState.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineWsfcDomainCredentialArgs.builder
      builder.wsfcDomainCredential(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder)
    /**
     * @param dataSettings A `storageSettings` block as defined below.
     * @return builder
     */
    def dataSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationDataSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationDataSettingsArgs.builder
      builder.dataSettings(args(argsBuilder).build)

    /**
     * @param logSettings A `storageSettings` block as defined below.
     * @return builder
     */
    def logSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationLogSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationLogSettingsArgs.builder
      builder.logSettings(args(argsBuilder).build)

    /**
     * @param tempDbSettings An `tempDbSettings` block as defined below.
     * @return builder
     */
    def tempDbSettings(args: Endofunction[com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationTempDbSettingsArgs.Builder]):
        com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.mssql.inputs.VirtualMachineStorageConfigurationTempDbSettingsArgs.builder
      builder.tempDbSettings(args(argsBuilder).build)
