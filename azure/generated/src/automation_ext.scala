package jp.ukiba.ko_pulumi
package azure

object automation_ext:
  extension (builder: com.pulumi.azure.automation.AccountArgs.Builder)
    /**
     * @param encryptions An `encryption` block as defined below.
     * @return builder
     */
    def encryptions(args: Endofunction[com.pulumi.azure.automation.inputs.AccountEncryptionArgs.Builder]*):
        com.pulumi.azure.automation.AccountArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.AccountEncryptionArgs.builder
      builder.encryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.automation.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.automation.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.ConnectionTypeArgs.Builder)
    /**
     * @param fields One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.Builder]*):
        com.pulumi.azure.automation.ConnectionTypeArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.automation.ModuleArgs.Builder)
    /**
     * @param moduleLink A `moduleLink` block as defined below.
     * @return builder
     */
    def moduleLink(args: Endofunction[com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder]):
        com.pulumi.azure.automation.ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.builder
      builder.moduleLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.Powershell72ModuleArgs.Builder)
    /**
     * @param moduleLink A `moduleLink` block as defined below.
     * @return builder
     */
    def moduleLink(args: Endofunction[com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.Builder]):
        com.pulumi.azure.automation.Powershell72ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.builder
      builder.moduleLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.RunBookArgs.Builder)
    /**
     * @param draft A `draft` block as defined below.
     * @return builder
     */
    def draft(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookDraftArgs.Builder]):
        com.pulumi.azure.automation.RunBookArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookDraftArgs.builder
      builder.draft(args(argsBuilder).build)

    /**
     * @param jobSchedules One or more `jobSchedule` block as defined below.
     * 
     * &gt; **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `jobSchedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
     * @return builder
     */
    def jobSchedules(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookJobScheduleArgs.Builder]*):
        com.pulumi.azure.automation.RunBookArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.RunBookJobScheduleArgs.builder
      builder.jobSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param publishContentLink One `publishContentLink` block as defined below.
     * @return builder
     */
    def publishContentLink(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.Builder]):
        com.pulumi.azure.automation.RunBookArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.builder
      builder.publishContentLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.ScheduleArgs.Builder)
    /**
     * @param monthlyOccurrence One `monthlyOccurrence` blocks as defined below to specifies occurrences of days within a month. Only valid when frequency is `Month`. The `monthlyOccurrence` block supports fields documented below.
     * @return builder
     */
    def monthlyOccurrence(args: Endofunction[com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.Builder]):
        com.pulumi.azure.automation.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.builder
      builder.monthlyOccurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder)
    /**
     * @param linux A `linux` block as defined below.
     * @return builder
     */
    def linux(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationLinuxArgs.Builder]):
        com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationLinuxArgs.builder
      builder.linux(args(argsBuilder).build)

    /**
     * @param postTask A `postTask` blocks as defined below.
     * @return builder
     */
    def postTask(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPostTaskArgs.Builder]):
        com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPostTaskArgs.builder
      builder.postTask(args(argsBuilder).build)

    /**
     * @param preTask A `preTask` blocks as defined below.
     * @return builder
     */
    def preTask(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPreTaskArgs.Builder]):
        com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPreTaskArgs.builder
      builder.preTask(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` blocks as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.Builder]):
        com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param target A `target` blocks as defined below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetArgs.Builder]):
        com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetArgs.builder
      builder.target(args(argsBuilder).build)

    /**
     * @param windows A `windows` block as defined below.
     * 
     * &gt; **Note:** One of `linux` or `windows` must be specified.
     * @return builder
     */
    def windows(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.Builder]):
        com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.builder
      builder.windows(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.SourceControlArgs.Builder)
    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.Builder]):
        com.pulumi.azure.automation.SourceControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.builder
      builder.security(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.AccountState.Builder)
    /**
     * @param encryptions An `encryption` block as defined below.
     * @return builder
     */
    def encryptions(args: Endofunction[com.pulumi.azure.automation.inputs.AccountEncryptionArgs.Builder]*):
        com.pulumi.azure.automation.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.AccountEncryptionArgs.builder
      builder.encryptions(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.automation.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.automation.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def privateEndpointConnections(args: Endofunction[com.pulumi.azure.automation.inputs.AccountPrivateEndpointConnectionArgs.Builder]*):
        com.pulumi.azure.automation.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.AccountPrivateEndpointConnectionArgs.builder
      builder.privateEndpointConnections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.automation.inputs.ConnectionTypeState.Builder)
    /**
     * @param fields One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.Builder]*):
        com.pulumi.azure.automation.inputs.ConnectionTypeState.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.ModuleModuleLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ModuleModuleLinkHashArgs.builder
      builder.hash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.ModuleState.Builder)
    /**
     * @param moduleLink A `moduleLink` block as defined below.
     * @return builder
     */
    def moduleLink(args: Endofunction[com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder]):
        com.pulumi.azure.automation.inputs.ModuleState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.builder
      builder.moduleLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkHashArgs.builder
      builder.hash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.Powershell72ModuleState.Builder)
    /**
     * @param moduleLink A `moduleLink` block as defined below.
     * @return builder
     */
    def moduleLink(args: Endofunction[com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.Builder]):
        com.pulumi.azure.automation.inputs.Powershell72ModuleState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.builder
      builder.moduleLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.RunBookDraftArgs.Builder)
    /**
     * @param contentLink A `publishContentLink` block as defined above.
     * @return builder
     */
    def contentLink(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookDraftContentLinkArgs.Builder]):
        com.pulumi.azure.automation.inputs.RunBookDraftArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookDraftContentLinkArgs.builder
      builder.contentLink(args(argsBuilder).build)

    /**
     * @param parameters A list of `parameters` block as defined below.
     * @return builder
     */
    def parameters(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookDraftParameterArgs.Builder]*):
        com.pulumi.azure.automation.inputs.RunBookDraftArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.RunBookDraftParameterArgs.builder
      builder.parameters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.automation.inputs.RunBookDraftContentLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookDraftContentLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.RunBookDraftContentLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookDraftContentLinkHashArgs.builder
      builder.hash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookPublishContentLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookPublishContentLinkHashArgs.builder
      builder.hash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.RunBookState.Builder)
    /**
     * @param draft A `draft` block as defined below.
     * @return builder
     */
    def draft(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookDraftArgs.Builder]):
        com.pulumi.azure.automation.inputs.RunBookState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookDraftArgs.builder
      builder.draft(args(argsBuilder).build)

    /**
     * @param jobSchedules One or more `jobSchedule` block as defined below.
     * 
     * &gt; **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `jobSchedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
     * @return builder
     */
    def jobSchedules(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookJobScheduleArgs.Builder]*):
        com.pulumi.azure.automation.inputs.RunBookState.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.RunBookJobScheduleArgs.builder
      builder.jobSchedules(args.map(_(argsBuilder).build)*)

    /**
     * @param publishContentLink One `publishContentLink` block as defined below.
     * @return builder
     */
    def publishContentLink(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.Builder]):
        com.pulumi.azure.automation.inputs.RunBookState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.builder
      builder.publishContentLink(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.ScheduleState.Builder)
    /**
     * @param monthlyOccurrence One `monthlyOccurrence` blocks as defined below to specifies occurrences of days within a month. Only valid when frequency is `Month`. The `monthlyOccurrence` block supports fields documented below.
     * @return builder
     */
    def monthlyOccurrence(args: Endofunction[com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.Builder]):
        com.pulumi.azure.automation.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.builder
      builder.monthlyOccurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.Builder)
    /**
     * @param monthlyOccurrence List of `monthlyOccurrence` blocks as defined below to specifies occurrences of days within a month. Only valid when frequency is `Month`. The `monthlyOccurrence` block supports fields as defined below.
     * @return builder
     */
    def monthlyOccurrence(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleMonthlyOccurrenceArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleMonthlyOccurrenceArgs.builder
      builder.monthlyOccurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder)
    /**
     * @param linux A `linux` block as defined below.
     * @return builder
     */
    def linux(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationLinuxArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationLinuxArgs.builder
      builder.linux(args(argsBuilder).build)

    /**
     * @param postTask A `postTask` blocks as defined below.
     * @return builder
     */
    def postTask(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPostTaskArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPostTaskArgs.builder
      builder.postTask(args(argsBuilder).build)

    /**
     * @param preTask A `preTask` blocks as defined below.
     * @return builder
     */
    def preTask(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPreTaskArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationPreTaskArgs.builder
      builder.preTask(args(argsBuilder).build)

    /**
     * @param schedule A `schedule` blocks as defined below.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param target A `target` blocks as defined below.
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetArgs.builder
      builder.target(args(argsBuilder).build)

    /**
     * @param windows A `windows` block as defined below.
     * 
     * &gt; **Note:** One of `linux` or `windows` must be specified.
     * @return builder
     */
    def windows(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.builder
      builder.windows(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetArgs.Builder)
    /**
     * @param azureQueries One or more `azureQuery` blocks as defined above.
     * @return builder
     */
    def azureQueries(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs.Builder]*):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs.builder
      builder.azureQueries(args.map(_(argsBuilder).build)*)

    /**
     * @param nonAzureQueries One or more `nonAzureQuery` blocks as defined above.
     * @return builder
     */
    def nonAzureQueries(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetNonAzureQueryArgs.Builder]*):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetNonAzureQueryArgs.builder
      builder.nonAzureQueries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs.Builder)
    /**
     * @param tags A mapping of tags used for query filter. One or more `tags` block as defined below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryTagArgs.Builder]*):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.automation.inputs.SourceControlState.Builder)
    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.Builder]):
        com.pulumi.azure.automation.inputs.SourceControlState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.builder
      builder.security(args(argsBuilder).build)
