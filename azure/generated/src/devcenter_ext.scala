package jp.ukiba.ko_pulumi
package azure

object devcenter_ext:
  extension (builder: com.pulumi.azure.devcenter.CatalogArgs.Builder)
    /**
     * @param catalogAdogit A `catalogAdogit` block as defined below.
     * @return builder
     */
    inline def catalogAdogit(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.Builder]):
        com.pulumi.azure.devcenter.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.builder
      builder.catalogAdogit(args(argsBuilder).build)

    /**
     * @param catalogGithub A `catalogGithub` block as defined below.
     * @return builder
     */
    inline def catalogGithub(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.Builder]):
        com.pulumi.azure.devcenter.CatalogArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.builder
      builder.catalogGithub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.DevCenterArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.DevCenterArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder)
    /**
     * @param azureDevopsOrganization An `azureDevopsOrganization` block as defined below.
     * @return builder
     */
    inline def azureDevopsOrganization(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.builder
      builder.azureDevopsOrganization(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param statefulAgent A `statefulAgent` block as defined below.
     * @return builder
     */
    inline def statefulAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.builder
      builder.statefulAgent(args(argsBuilder).build)

    /**
     * @param statelessAgent A `statelessAgent` block as defined below.
     * 
     * &gt; **Note:** Exactly one of `statefulAgent` or `statelessAgent` must be specified.
     * @return builder
     */
    inline def statelessAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.builder
      builder.statelessAgent(args(argsBuilder).build)

    /**
     * @param virtualMachineScaleSetFabric A `virtualMachineScaleSetFabric` block as defined below.
     * @return builder
     */
    inline def virtualMachineScaleSetFabric(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder]):
        com.pulumi.azure.devcenter.ManagedDevOpsPoolArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.builder
      builder.virtualMachineScaleSetFabric(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.ProjectArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param userRoleAssignments A `userRoleAssignment` block as defined below.
     * @return builder
     */
    inline def userRoleAssignments(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.Builder]*):
        com.pulumi.azure.devcenter.ProjectEnvironmentTypeArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.builder
      builder.userRoleAssignments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devcenter.inputs.CatalogState.Builder)
    /**
     * @param catalogAdogit A `catalogAdogit` block as defined below.
     * @return builder
     */
    inline def catalogAdogit(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogAdogitArgs.builder
      builder.catalogAdogit(args(argsBuilder).build)

    /**
     * @param catalogGithub A `catalogGithub` block as defined below.
     * @return builder
     */
    inline def catalogGithub(args: Endofunction[com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.CatalogState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.CatalogCatalogGithubArgs.builder
      builder.catalogGithub(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.DevCenterState.Builder)
    /**
     * @param identity An `identity` block as defined below. Specifies the Managed Identity which should be assigned to this Dev Center.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.DevCenterState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.DevCenterIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder)
    /**
     * @param organizations One or more `organization` blocks as defined below.
     * @return builder
     */
    inline def organizations(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationOrganizationArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationOrganizationArgs.builder
      builder.organizations(args.map(_(argsBuilder).build)*)

    /**
     * @param permission A `permission` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def permission(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.builder
      builder.permission(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.Builder)
    /**
     * @param administratorAccount An `administratorAccount` block as defined below. This block is only valid when `kind` is set to `SpecificAccounts`. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def administratorAccount(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionAdministratorAccountArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationPermissionAdministratorAccountArgs.builder
      builder.administratorAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder)
    /**
     * @param azureDevopsOrganization An `azureDevopsOrganization` block as defined below.
     * @return builder
     */
    inline def azureDevopsOrganization(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolAzureDevopsOrganizationArgs.builder
      builder.azureDevopsOrganization(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param statefulAgent A `statefulAgent` block as defined below.
     * @return builder
     */
    inline def statefulAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.builder
      builder.statefulAgent(args(argsBuilder).build)

    /**
     * @param statelessAgent A `statelessAgent` block as defined below.
     * 
     * &gt; **Note:** Exactly one of `statefulAgent` or `statelessAgent` must be specified.
     * @return builder
     */
    inline def statelessAgent(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.builder
      builder.statelessAgent(args(argsBuilder).build)

    /**
     * @param virtualMachineScaleSetFabric A `virtualMachineScaleSetFabric` block as defined below.
     * @return builder
     */
    inline def virtualMachineScaleSetFabric(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.builder
      builder.virtualMachineScaleSetFabric(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder)
    /**
     * @param automaticResourcePrediction An `automaticResourcePrediction` block as defined below.
     * @return builder
     */
    inline def automaticResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentAutomaticResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentAutomaticResourcePredictionArgs.builder
      builder.automaticResourcePrediction(args(argsBuilder).build)

    /**
     * @param manualResourcePrediction A `manualResourcePrediction` block as defined below.
     * @return builder
     */
    inline def manualResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.builder
      builder.manualResourcePrediction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder)
    /**
     * @param fridaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def fridaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionFridayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionFridayScheduleArgs.builder
      builder.fridaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param mondaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def mondaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionMondayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionMondayScheduleArgs.builder
      builder.mondaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param saturdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def saturdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSaturdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSaturdayScheduleArgs.builder
      builder.saturdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param sundaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def sundaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSundayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionSundayScheduleArgs.builder
      builder.sundaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param thursdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def thursdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionThursdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionThursdayScheduleArgs.builder
      builder.thursdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param tuesdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def tuesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionTuesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionTuesdayScheduleArgs.builder
      builder.tuesdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param wednesdaySchedules One or more `dailySchedule` blocks as defined below.
     * 
     * &gt; **Note:** Exactly one of `allWeekSchedule` or at least one individual daily schedule block must be specified.
     * 
     * &gt; **Note:** Please refer to [Microsoft documentation](https://learn.microsoft.com/azure/devops/managed-devops-pools/configure-scaling?view=azure-devops&amp;tabs=azure-cli#manual) for more information about the manual predictions setup.
     * @return builder
     */
    inline def wednesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionWednesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatefulAgentManualResourcePredictionWednesdayScheduleArgs.builder
      builder.wednesdaySchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder)
    /**
     * @param automaticResourcePrediction An `automaticResourcePrediction` block as defined below.
     * @return builder
     */
    inline def automaticResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentAutomaticResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentAutomaticResourcePredictionArgs.builder
      builder.automaticResourcePrediction(args(argsBuilder).build)

    /**
     * @param manualResourcePrediction A `manualResourcePrediction` block as defined below.
     * 
     * &gt; **Note:** Exactly one of `manualResourcePrediction` or `automaticResourcePrediction` may be specified.
     * @return builder
     */
    inline def manualResourcePrediction(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.builder
      builder.manualResourcePrediction(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder)
    /**
     * @param fridaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def fridaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionFridayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionFridayScheduleArgs.builder
      builder.fridaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param mondaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def mondaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionMondayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionMondayScheduleArgs.builder
      builder.mondaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param saturdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def saturdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSaturdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSaturdayScheduleArgs.builder
      builder.saturdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param sundaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def sundaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSundayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionSundayScheduleArgs.builder
      builder.sundaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param thursdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def thursdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionThursdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionThursdayScheduleArgs.builder
      builder.thursdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param tuesdaySchedules One or more `dailySchedule` blocks as defined below.
     * @return builder
     */
    inline def tuesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionTuesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionTuesdayScheduleArgs.builder
      builder.tuesdaySchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param wednesdaySchedules One or more `dailySchedule` blocks as defined below.
     * 
     * &gt; **Note:** Exactly one of `allWeekSchedule` or at least one individual daily schedule block must be specified.
     * 
     * &gt; **Note:** Please refer to [Microsoft documentation](https://learn.microsoft.com/azure/devops/managed-devops-pools/configure-scaling?view=azure-devops&amp;tabs=azure-cli#manual) for more information about the manual predictions setup.
     * @return builder
     */
    inline def wednesdaySchedules(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionWednesdayScheduleArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolStatelessAgentManualResourcePredictionWednesdayScheduleArgs.builder
      builder.wednesdaySchedules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder)
    /**
     * @param images One or more `image` blocks as defined below.
     * @return builder
     */
    inline def images(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricImageArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricImageArgs.builder
      builder.images(args.map(_(argsBuilder).build)*)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    inline def security(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.builder
      builder.security(args(argsBuilder).build)

    /**
     * @param storage A `storage` block as defined below.
     * @return builder
     */
    inline def storage(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricStorageArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricStorageArgs.builder
      builder.storage(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.Builder)
    /**
     * @param keyVaultManagement A `keyVaultManagement` block as defined below.
     * @return builder
     */
    inline def keyVaultManagement(args: Endofunction[com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityKeyVaultManagementArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityArgs.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ManagedDevOpsPoolVirtualMachineScaleSetFabricSecurityKeyVaultManagementArgs.builder
      builder.keyVaultManagement(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param userRoleAssignments A `userRoleAssignment` block as defined below.
     * @return builder
     */
    inline def userRoleAssignments(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.Builder]*):
        com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeState.Builder =
      def argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectEnvironmentTypeUserRoleAssignmentArgs.builder
      builder.userRoleAssignments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.devcenter.inputs.ProjectState.Builder)
    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.devcenter.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.azure.devcenter.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
