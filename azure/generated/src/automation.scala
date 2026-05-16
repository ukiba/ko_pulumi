package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object automation:
  object AutomationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Automation Account. */
    inline def getAccount(args: Endofunction[com.pulumi.azure.automation.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetAccountArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getAccount(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Account. */
    inline def getAccountPlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getAccountPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Bool Variable. */
    inline def getBoolVariable(args: Endofunction[com.pulumi.azure.automation.inputs.GetBoolVariableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetBoolVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetBoolVariableArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getBoolVariable(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Bool Variable. */
    inline def getBoolVariablePlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetBoolVariablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetBoolVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetBoolVariablePlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getBoolVariablePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Datetime Variable. */
    inline def getDateTimeVariable(args: Endofunction[com.pulumi.azure.automation.inputs.GetDateTimeVariableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetDateTimeVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetDateTimeVariableArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getDateTimeVariable(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Datetime Variable. */
    inline def getDateTimeVariablePlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetDateTimeVariablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetDateTimeVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetDateTimeVariablePlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getDateTimeVariablePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Int Variable. */
    inline def getIntVariable(args: Endofunction[com.pulumi.azure.automation.inputs.GetIntVariableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetIntVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetIntVariableArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getIntVariable(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Int Variable. */
    inline def getIntVariablePlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetIntVariablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetIntVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetIntVariablePlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getIntVariablePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Runbook. */
    inline def getRunbook(args: Endofunction[com.pulumi.azure.automation.inputs.GetRunbookArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetRunbookResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetRunbookArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getRunbook(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Runbook. */
    inline def getRunbookPlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetRunbookPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetRunbookResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetRunbookPlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getRunbookPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation String Variable. */
    inline def getStringVariable(args: Endofunction[com.pulumi.azure.automation.inputs.GetStringVariableArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetStringVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetStringVariableArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getStringVariable(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation String Variable. */
    inline def getStringVariablePlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetStringVariablePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetStringVariableResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetStringVariablePlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getStringVariablePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Object Variable. */
    inline def getVariableObject(args: Endofunction[com.pulumi.azure.automation.inputs.GetVariableObjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetVariableObjectResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetVariableObjectArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getVariableObject(args(argsBuilder).build)

    /** Use this data source to access information about an existing Automation Object Variable. */
    inline def getVariableObjectPlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetVariableObjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetVariableObjectResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetVariableObjectPlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getVariableObjectPlain(args(argsBuilder).build)

    /** Use this data source to get all variables in an Automation Account. */
    inline def getVariables(args: Endofunction[com.pulumi.azure.automation.inputs.GetVariablesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.automation.outputs.GetVariablesResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetVariablesArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getVariables(args(argsBuilder).build)

    /** Use this data source to get all variables in an Automation Account. */
    inline def getVariablesPlain(args: Endofunction[com.pulumi.azure.automation.inputs.GetVariablesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.automation.outputs.GetVariablesResult] =
      val argsBuilder = com.pulumi.azure.automation.inputs.GetVariablesPlainArgs.builder
      com.pulumi.azure.automation.AutomationFunctions.getVariablesPlain(args(argsBuilder).build)

  /** Manages a Automation DSC Configuration. */
  def DscConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.DscConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.DscConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automation.DscConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Automation Hybrid Runbook Worker. */
  def HybridRunbookWorker(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.HybridRunbookWorkerArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.automation.HybridRunbookWorkerArgs.builder
    com.pulumi.azure.automation.HybridRunbookWorker(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.automation.ScheduleArgs.Builder)
    /**
     * @param monthlyOccurrence One `monthlyOccurrence` blocks as defined below to specifies occurrences of days within a month. Only valid when frequency is `Month`. The `monthlyOccurrence` block supports fields documented below.
     * @return builder
     */
    def monthlyOccurrence(args: Endofunction[com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.Builder]):
        com.pulumi.azure.automation.ScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.builder
      builder.monthlyOccurrence(args(argsBuilder).build)

  /** Manages a Automation Hybrid Runbook Worker Group. */
  def HybridRunbookWorkerGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.HybridRunbookWorkerGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.HybridRunbookWorkerGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.HybridRunbookWorkerGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Automation Runbook. */
  def RunBook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.RunBookArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.RunBookArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automation.RunBook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Automation DSC Node Configuration. */
  def DscNodeConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.DscNodeConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.DscNodeConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.DscNodeConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.automation.Powershell72ModuleArgs.Builder)
    /**
     * @param moduleLink A `moduleLink` block as defined below.
     * @return builder
     */
    def moduleLink(args: Endofunction[com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.Builder]):
        com.pulumi.azure.automation.Powershell72ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.builder
      builder.moduleLink(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automation.Powershell72ModuleArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.automation.ConnectionTypeArgs.Builder)
    /**
     * @param fields One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.Builder]*):
        com.pulumi.azure.automation.ConnectionTypeArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  /** Manages an Automation Runtime Environment. */
  def RuntimeEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.RuntimeEnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.RuntimeEnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automation.RuntimeEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Automation Module. */
  def Module(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.ModuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.ModuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.Module(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Automation Schedule. */
  def Schedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.ScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.ScheduleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.Schedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Links an Automation Runbook and Schedule.
   * 
   *  &gt; **Note:** AzureRM provides this stand-alone azure.automation.JobSchedule and an inlined `jobSchedule` property in azurermRunbook to manage the job schedules. You can only make use of one of these methods to manage a job schedule.
   */
  def JobSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.JobScheduleArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.automation.JobScheduleArgs.builder
    com.pulumi.azure.automation.JobSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automation.AccountArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages a Automation Python3 Package. */
  def Python3Package(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.Python3PackageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.Python3PackageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automation.Python3Package(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages anAutomation Connection Type. */
  def ConnectionType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.ConnectionTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.ConnectionTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.ConnectionType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a DateTime variable in Azure Automation */
  def DateTimeVariable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.DateTimeVariableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.DateTimeVariableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.DateTimeVariable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Automation Certificate. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.CertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Automation Connection with type `AzureServicePrincipal`. */
  def ConnectionServicePrincipal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.ConnectionServicePrincipalArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.ConnectionServicePrincipalArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.ConnectionServicePrincipal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Automation Account. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.AccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.AccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automation.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a string variable in Azure Automation */
  def StringVariable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.StringVariableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.StringVariableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.StringVariable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a integer variable in Azure Automation */
  def IntVariable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.IntVariableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.IntVariableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.IntVariable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
     *  &gt; **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `jobSchedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automation.RunBookArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /** Manages an Automation Wacher. */
  def Watcher(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.WatcherArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.WatcherArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automation.Watcher(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Package within an Automation Runtime Environment. */
  def RuntimeEnvironmentPackage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.RuntimeEnvironmentPackageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.RuntimeEnvironmentPackageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.RuntimeEnvironmentPackage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an object variable in Azure Automation */
  def VariableObject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.VariableObjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.VariableObjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.VariableObject(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.automation.SourceControlArgs.Builder)
    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.Builder]):
        com.pulumi.azure.automation.SourceControlArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.builder
      builder.security(args(argsBuilder).build)

  /** Manages an Automation Connection with type `AzureClassicCertificate`. */
  def ConnectionClassicCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.ConnectionClassicCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.ConnectionClassicCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.ConnectionClassicCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Automation Connection with type `Azure`. */
  def ConnectionCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.ConnectionCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.ConnectionCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.ConnectionCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Automation Credential. */
  def Credential(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.CredentialArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.CredentialArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.Credential(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.automation.ModuleArgs.Builder)
    /**
     * @param moduleLink A `moduleLink` block as defined below.
     * @return builder
     */
    def moduleLink(args: Endofunction[com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder]):
        com.pulumi.azure.automation.ModuleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.builder
      builder.moduleLink(args(argsBuilder).build)

  /** Manages an Automation Connection. */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.ConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.ConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Automation Source Control. */
  def SourceControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.SourceControlArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.SourceControlArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.SourceControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an Automation Runbook&#39;s Webhook. */
  def Webhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.WebhookArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.WebhookArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.Webhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Automation Software Update Configuration.
   * 
   *  !&gt; **Note:** The `azure.automation.SoftwareUpdateConfiguration` resource has been deprecated because the Azure Automation Update Management was retired on 2024-08-31 and has been shutdown on 2025-02-28. This resource will be removed in v5.0 of the AzureRM Provider. Please migrate to Azure Update Manager, and use the `azure.maintenance.Configuration` resource combined with the appropriate assignment resources instead. See https://techcommunity.microsoft.com/blog/azuregovernanceandmanagementblog/log-analytics-agent-based-azure-management-services-shut-down-starting-28-februa/4381853 for more information.
   */
  def SoftwareUpdateConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.SoftwareUpdateConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
     *  &gt; **Note:** One of `linux` or `windows` must be specified.
     * @return builder
     */
    def windows(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.Builder]):
        com.pulumi.azure.automation.SoftwareUpdateConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.builder
      builder.windows(args(argsBuilder).build)

  /** Manages a Automation Powershell 7.2 Module. */
  def Powershell72Module(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.Powershell72ModuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.Powershell72ModuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.automation.Powershell72Module(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs.Builder)
    /**
     * @param tags A mapping of tags used for query filter. One or more `tags` block as defined below.
     * @return builder
     */
    def tags(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryTagArgs.Builder]*):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryArgs.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationTargetAzureQueryTagArgs.builder
      builder.tags(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.Builder)
    /**
     * @param monthlyOccurrence List of `monthlyOccurrence` blocks as defined below to specifies occurrences of days within a month. Only valid when frequency is `Month`. The `monthlyOccurrence` block supports fields as defined below.
     * @return builder
     */
    def monthlyOccurrence(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleMonthlyOccurrenceArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationScheduleMonthlyOccurrenceArgs.builder
      builder.monthlyOccurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.SourceControlState.Builder)
    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.Builder]):
        com.pulumi.azure.automation.inputs.SourceControlState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SourceControlSecurityArgs.builder
      builder.security(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookPublishContentLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.RunBookPublishContentLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookPublishContentLinkHashArgs.builder
      builder.hash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.ConnectionTypeState.Builder)
    /**
     * @param fields One or more `field` blocks as defined below. Changing this forces a new Automation to be created.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.Builder]*):
        com.pulumi.azure.automation.inputs.ConnectionTypeState.Builder =
      def argsBuilder = com.pulumi.azure.automation.inputs.ConnectionTypeFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

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
     *  &gt; **Note:** One of `linux` or `windows` must be specified.
     * @return builder
     */
    def windows(args: Endofunction[com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.Builder]):
        com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.SoftwareUpdateConfigurationWindowsArgs.builder
      builder.windows(args(argsBuilder).build)

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

  extension (builder: com.pulumi.azure.automation.inputs.ModuleState.Builder)
    /**
     * @param moduleLink A `moduleLink` block as defined below.
     * @return builder
     */
    def moduleLink(args: Endofunction[com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder]):
        com.pulumi.azure.automation.inputs.ModuleState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.builder
      builder.moduleLink(args(argsBuilder).build)

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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automation.inputs.AccountState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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
     *  &gt; **Note:** AzureRM provides a stand-alone azure.automation.JobSchedule and this inlined `jobSchedule` property to manage the job schedules. At this time you should choose one of them to manage the job schedule resources.
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automation.inputs.RunBookState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.automation.inputs.RunBookDraftContentLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.RunBookDraftContentLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.RunBookDraftContentLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.RunBookDraftContentLinkHashArgs.builder
      builder.hash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.ScheduleState.Builder)
    /**
     * @param monthlyOccurrence One `monthlyOccurrence` blocks as defined below to specifies occurrences of days within a month. Only valid when frequency is `Month`. The `monthlyOccurrence` block supports fields documented below.
     * @return builder
     */
    def monthlyOccurrence(args: Endofunction[com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.Builder]):
        com.pulumi.azure.automation.inputs.ScheduleState.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ScheduleMonthlyOccurrenceArgs.builder
      builder.monthlyOccurrence(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.Powershell72ModuleModuleLinkHashArgs.builder
      builder.hash(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder)
    /**
     * @param hash A `hash` block as defined below.
     * @return builder
     */
    def hash(args: Endofunction[com.pulumi.azure.automation.inputs.ModuleModuleLinkHashArgs.Builder]):
        com.pulumi.azure.automation.inputs.ModuleModuleLinkArgs.Builder =
      val argsBuilder = com.pulumi.azure.automation.inputs.ModuleModuleLinkHashArgs.builder
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

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.automation.inputs.Powershell72ModuleState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

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

  /** Manages a boolean variable in Azure Automation */
  def BoolVariable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.automation.BoolVariableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.automation.BoolVariableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.automation.BoolVariable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
