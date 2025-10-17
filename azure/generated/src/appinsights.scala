package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object appinsights:
  /** Manages an Application Insights Analytics Item component. */
  def AnalyticsItem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.AnalyticsItemArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.AnalyticsItemArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appinsights.AnalyticsItem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Application Insights API key. */
  def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.ApiKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.ApiKeyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appinsights.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object AppinsightsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Application Insights component. */
    inline def getInsights(args: Endofunction[com.pulumi.azure.appinsights.inputs.GetInsightsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appinsights.outputs.GetInsightsResult] =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.GetInsightsArgs.builder
      com.pulumi.azure.appinsights.AppinsightsFunctions.getInsights(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Insights component. */
    inline def getInsightsPlain(args: Endofunction[com.pulumi.azure.appinsights.inputs.GetInsightsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appinsights.outputs.GetInsightsResult] =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.GetInsightsPlainArgs.builder
      com.pulumi.azure.appinsights.AppinsightsFunctions.getInsightsPlain(args(argsBuilder).build)

  /** Manages an Application Insights component. */
  def Insights(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.InsightsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.InsightsArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.appinsights.Insights(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Application Insights Smart Detection Rule. */
  def SmartDetectionRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.SmartDetectionRuleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.SmartDetectionRuleArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appinsights.SmartDetectionRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Application Insights Standard WebTest. */
  def StandardWebTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.StandardWebTestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.StandardWebTestArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.appinsights.StandardWebTest(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.appinsights.StandardWebTestArgs.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    def request(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder]):
        com.pulumi.azure.appinsights.StandardWebTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param validationRules A `validationRules` block as defined below.
     * @return builder
     */
    def validationRules(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder]):
        com.pulumi.azure.appinsights.StandardWebTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.builder
      builder.validationRules(args(argsBuilder).build)

  /**
   * Manages an Application Insights WebTest.
   * 
   * &gt; **Note:** Despite the discrepancy in its name, this Terraform resource corresponds to the Azure resource &#39;Application Insights Classic Web Test&#39;. Azure changed the name, but we retained the original name in Terraform to avoid disruption and ensure backward compatibility.
   */
  def WebTest(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.WebTestArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.WebTestArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.appinsights.WebTest(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an Azure Workbook. */
  def Workbook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.WorkbookArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.WorkbookArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.appinsights.Workbook(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.appinsights.WorkbookArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Workbook to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.Builder]):
        com.pulumi.azure.appinsights.WorkbookArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  /** Manages an Application Insights Workbook Template. */
  def WorkbookTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appinsights.WorkbookTemplateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appinsights.WorkbookTemplateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.appinsights.WorkbookTemplate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.appinsights.WorkbookTemplateArgs.Builder)
    /**
     * @param galleries A `galleries` block as defined below.
     * @return builder
     */
    def galleries(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.Builder]*):
        com.pulumi.azure.appinsights.WorkbookTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.builder
      builder.galleries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder)
    /**
     * @param headers One or more `header` blocks as defined above.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestRequestHeaderArgs.Builder]*):
        com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestRequestHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appinsights.inputs.StandardWebTestState.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    def request(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.StandardWebTestState.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param validationRules A `validationRules` block as defined below.
     * @return builder
     */
    def validationRules(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.StandardWebTestState.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.builder
      builder.validationRules(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder)
    /**
     * @param content A `content` block as defined above.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesContentArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesContentArgs.builder
      builder.content(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.inputs.WorkbookState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Workbook to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.WorkbookState.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.inputs.WorkbookTemplateState.Builder)
    /**
     * @param galleries A `galleries` block as defined below.
     * @return builder
     */
    def galleries(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.Builder]*):
        com.pulumi.azure.appinsights.inputs.WorkbookTemplateState.Builder =
      def argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.builder
      builder.galleries(args.map(_(argsBuilder).build)*)
