package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object appservice:
  /**
   * Promotes an App Service Slot to Production within an App Service.
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.WebAppActiveSlot` resource instead.
   * 
   * &gt; **Note:** When using Slots - the `appSettings`, `connectionString` and `siteConfig` blocks on the `azure.appservice.AppService` resource will be overwritten when promoting a Slot using the `azure.appservice.ActiveSlot` resource.
   */
  def ActiveSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.ActiveSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.ActiveSlotArgs.builder
    com.pulumi.azure.appservice.ActiveSlot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a service connector for function app. */
  def AppConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.AppConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.AppConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appservice.AppConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Function App Running on a Flex Consumption Plan. */
  def AppFlexConsumption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.AppFlexConsumptionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.AppFlexConsumptionArgs.builder
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
    com.pulumi.azure.appservice.AppFlexConsumption(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service (within an App Service Plan).
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.LinuxWebApp` and `azure.appservice.WindowsWebApp` resources instead.
   * 
   * &gt; **Note:** When using Slots - the `appSettings`, `connectionString` and `siteConfig` blocks on the `azure.appservice.AppService` resource will be overwritten when promoting a Slot using the `azure.appservice.ActiveSlot` resource.
   */
  def AppService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.AppServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.AppServiceArgs.builder
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
    com.pulumi.azure.appservice.AppService(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object AppserviceFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to access information about an existing App Service.
     * 
     * &gt; **Note:** This data source has been deprecated and will be removed in version 6.0 of the provider. Please use the `azure.appservice.LinuxWebApp` and `azure.appservice.WindowsWebApp` data sources instead.
     */
    inline def getAppService(args: Endofunction[com.pulumi.azure.appservice.inputs.GetAppServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetAppServiceResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetAppServiceArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getAppService(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing App Service.
     * 
     * &gt; **Note:** This data source has been deprecated and will be removed in version 6.0 of the provider. Please use the `azure.appservice.LinuxWebApp` and `azure.appservice.WindowsWebApp` data sources instead.
     */
    inline def getAppServicePlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetAppServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetAppServiceResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetAppServicePlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getAppServicePlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing App Service Plan (formerly known as a `Server Farm`).
     * 
     * &gt; **Note:** This data source has been deprecated and will be removed in version 6.0 of the provider. Please use the `azure.appservice.ServicePlan` data source instead.
     */
    inline def getAppServicePlan(args: Endofunction[com.pulumi.azure.appservice.inputs.GetAppServicePlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetAppServicePlanResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetAppServicePlanArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getAppServicePlan(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing App Service Plan (formerly known as a `Server Farm`).
     * 
     * &gt; **Note:** This data source has been deprecated and will be removed in version 6.0 of the provider. Please use the `azure.appservice.ServicePlan` data source instead.
     */
    inline def getAppServicePlanPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetAppServicePlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetAppServicePlanResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetAppServicePlanPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getAppServicePlanPlain(args(argsBuilder).build)

    /** Use this data source to access information about an App Service Certificate. */
    inline def getCertificate(args: Endofunction[com.pulumi.azure.appservice.inputs.GetCertificateArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetCertificateArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getCertificate(args(argsBuilder).build)

    /** Use this data source to access information about an App Service Certificate. */
    inline def getCertificatePlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetCertificatePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetCertificateResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetCertificatePlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getCertificatePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing App Service Certificate Order. */
    inline def getCertificateOrder(args: Endofunction[com.pulumi.azure.appservice.inputs.GetCertificateOrderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetCertificateOrderResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetCertificateOrderArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getCertificateOrder(args(argsBuilder).build)

    /** Use this data source to access information about an existing App Service Certificate Order. */
    inline def getCertificateOrderPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetCertificateOrderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetCertificateOrderResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetCertificateOrderPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getCertificateOrderPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing 3rd Generation (v3) App Service Environment. */
    inline def getEnvironmentV3(args: Endofunction[com.pulumi.azure.appservice.inputs.GetEnvironmentV3Args.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetEnvironmentV3Result] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetEnvironmentV3Args.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getEnvironmentV3(args(argsBuilder).build)

    /** Use this data source to access information about an existing 3rd Generation (v3) App Service Environment. */
    inline def getEnvironmentV3Plain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetEnvironmentV3PlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetEnvironmentV3Result] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetEnvironmentV3PlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getEnvironmentV3Plain(args(argsBuilder).build)

    /**
     * Use this data source to access information about a Function App.
     * 
     * &gt; **Note:** This data source has been deprecated and will be removed in version 6.0 of the provider. Please use the `azure.appservice.LinuxFunctionApp` and `azure.appservice.WindowsFunctionApp` data sources instead.
     */
    inline def getFunctionApp(args: Endofunction[com.pulumi.azure.appservice.inputs.GetFunctionAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetFunctionAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetFunctionAppArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getFunctionApp(args(argsBuilder).build)

    /**
     * Use this data source to access information about a Function App.
     * 
     * &gt; **Note:** This data source has been deprecated and will be removed in version 6.0 of the provider. Please use the `azure.appservice.LinuxFunctionApp` and `azure.appservice.WindowsFunctionApp` data sources instead.
     */
    inline def getFunctionAppPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetFunctionAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetFunctionAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetFunctionAppPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getFunctionAppPlain(args(argsBuilder).build)

    /** Use this data source to fetch the Host Keys of an existing Function App */
    inline def getFunctionAppHostKeys(args: Endofunction[com.pulumi.azure.appservice.inputs.GetFunctionAppHostKeysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetFunctionAppHostKeysResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetFunctionAppHostKeysArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getFunctionAppHostKeys(args(argsBuilder).build)

    /** Use this data source to fetch the Host Keys of an existing Function App */
    inline def getFunctionAppHostKeysPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetFunctionAppHostKeysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetFunctionAppHostKeysResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetFunctionAppHostKeysPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getFunctionAppHostKeysPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Linux Function App. */
    inline def getLinuxFunctionApp(args: Endofunction[com.pulumi.azure.appservice.inputs.GetLinuxFunctionAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetLinuxFunctionAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetLinuxFunctionAppArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getLinuxFunctionApp(args(argsBuilder).build)

    /** Use this data source to access information about an existing Linux Function App. */
    inline def getLinuxFunctionAppPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetLinuxFunctionAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetLinuxFunctionAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetLinuxFunctionAppPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getLinuxFunctionAppPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Linux Web App. */
    inline def getLinuxWebApp(args: Endofunction[com.pulumi.azure.appservice.inputs.GetLinuxWebAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetLinuxWebAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetLinuxWebAppArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getLinuxWebApp(args(argsBuilder).build)

    /** Use this data source to access information about an existing Linux Web App. */
    inline def getLinuxWebAppPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetLinuxWebAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetLinuxWebAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetLinuxWebAppPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getLinuxWebAppPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Plan. */
    inline def getServicePlan(args: Endofunction[com.pulumi.azure.appservice.inputs.GetServicePlanArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetServicePlanResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetServicePlanArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getServicePlan(args(argsBuilder).build)

    /** Use this data source to access information about an existing Service Plan. */
    inline def getServicePlanPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetServicePlanPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetServicePlanResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetServicePlanPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getServicePlanPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing App Service Source Control Token.
     * 
     * &gt; **Note:** This value can only be queried for the user or service principal that is executing Terraform. It is not possible to retrieve for another user.
     */
    inline def getSourceControlToken(args: Endofunction[com.pulumi.azure.appservice.inputs.GetSourceControlTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetSourceControlTokenResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetSourceControlTokenArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getSourceControlToken(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing App Service Source Control Token.
     * 
     * &gt; **Note:** This value can only be queried for the user or service principal that is executing Terraform. It is not possible to retrieve for another user.
     */
    inline def getSourceControlTokenPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetSourceControlTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetSourceControlTokenResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetSourceControlTokenPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getSourceControlTokenPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Static Web App. */
    inline def getStaticWebApp(args: Endofunction[com.pulumi.azure.appservice.inputs.GetStaticWebAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetStaticWebAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetStaticWebAppArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getStaticWebApp(args(argsBuilder).build)

    /** Use this data source to access information about an existing Static Web App. */
    inline def getStaticWebAppPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetStaticWebAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetStaticWebAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetStaticWebAppPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getStaticWebAppPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Windows Function App. */
    inline def getWindowsFunctionApp(args: Endofunction[com.pulumi.azure.appservice.inputs.GetWindowsFunctionAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetWindowsFunctionAppArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getWindowsFunctionApp(args(argsBuilder).build)

    /** Use this data source to access information about an existing Windows Function App. */
    inline def getWindowsFunctionAppPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetWindowsFunctionAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetWindowsFunctionAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetWindowsFunctionAppPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getWindowsFunctionAppPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Windows Web App. */
    inline def getWindowsWebApp(args: Endofunction[com.pulumi.azure.appservice.inputs.GetWindowsWebAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appservice.outputs.GetWindowsWebAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetWindowsWebAppArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getWindowsWebApp(args(argsBuilder).build)

    /** Use this data source to access information about an existing Windows Web App. */
    inline def getWindowsWebAppPlain(args: Endofunction[com.pulumi.azure.appservice.inputs.GetWindowsWebAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appservice.outputs.GetWindowsWebAppResult] =
      val argsBuilder = com.pulumi.azure.appservice.inputs.GetWindowsWebAppPlainArgs.builder
      com.pulumi.azure.appservice.AppserviceFunctions.getWindowsWebAppPlain(args(argsBuilder).build)

  /** Manages an App Service certificate. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.CertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.CertificateArgs.builder
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
    com.pulumi.azure.appservice.Certificate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service Certificate Binding. */
  def CertificateBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.CertificateBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.CertificateBindingArgs.builder
    com.pulumi.azure.appservice.CertificateBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service Certificate Order. */
  def CertificateOrder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.CertificateOrderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.CertificateOrderArgs.builder
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
    com.pulumi.azure.appservice.CertificateOrder(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a service connector for app service. */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.ConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.ConnectionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appservice.Connection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Hostname Binding within an App Service (or Function App). */
  def CustomHostnameBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.CustomHostnameBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.CustomHostnameBindingArgs.builder
    com.pulumi.azure.appservice.CustomHostnameBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a 3rd Generation (v3) App Service Environment. */
  def EnvironmentV3(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.EnvironmentV3Args.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.EnvironmentV3Args.builder
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
    com.pulumi.azure.appservice.EnvironmentV3(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Function App.
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.LinuxFunctionApp` and `azure.appservice.WindowsFunctionApp` resources instead.
   * 
   * &gt; **Note:** To connect an Azure Function App and a subnet within the same region `azure.appservice.VirtualNetworkSwiftConnection` can be used.
   * For an example, check the `azure.appservice.VirtualNetworkSwiftConnection` documentation.
   */
  def FunctionApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.FunctionAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.FunctionAppArgs.builder
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
    com.pulumi.azure.appservice.FunctionApp(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Function App Active Slot. */
  def FunctionAppActiveSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.FunctionAppActiveSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.FunctionAppActiveSlotArgs.builder
    com.pulumi.azure.appservice.FunctionAppActiveSlot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Function App Function. */
  def FunctionAppFunction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.FunctionAppFunctionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.FunctionAppFunctionArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appservice.FunctionAppFunction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Function App Hybrid Connection. */
  def FunctionAppHybridConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.FunctionAppHybridConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.FunctionAppHybridConnectionArgs.builder
    com.pulumi.azure.appservice.FunctionAppHybridConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Function App deployment Slot.
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.LinuxFunctionAppSlot` and `azure.appservice.WindowsFunctionAppSlot` resources instead.
   */
  def FunctionAppSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.FunctionAppSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.FunctionAppSlotArgs.builder
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
    com.pulumi.azure.appservice.FunctionAppSlot(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service Hybrid Connection for an existing App Service, Relay and Service Bus.
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.FunctionAppHybridConnection` and `azure.appservice.WebAppHybridConnection` resources instead.
   */
  def HybridConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.HybridConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.HybridConnectionArgs.builder
    com.pulumi.azure.appservice.HybridConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Linux Function App.
   * 
   * &gt; **Note:** This Terraform resource is specifically designed to provision the infrastructure for a Function App, which can host one or more individual functions. To package and deploy application code to the Function App, tools like [Azure Functions Core Tools](https://learn.microsoft.com/azure/azure-functions/functions-run-local) or Azure CLI can be utilized, however application code deployment must typically be performed individually for each Function App.
   */
  def LinuxFunctionApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.LinuxFunctionAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.LinuxFunctionAppArgs.builder
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
    com.pulumi.azure.appservice.LinuxFunctionApp(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linux Function App Slot. */
  def LinuxFunctionAppSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.LinuxFunctionAppSlotArgs.builder
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
    com.pulumi.azure.appservice.LinuxFunctionAppSlot(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linux Web App. */
  def LinuxWebApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.LinuxWebAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.LinuxWebAppArgs.builder
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
    com.pulumi.azure.appservice.LinuxWebApp(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Linux Web App Slot. */
  def LinuxWebAppSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.LinuxWebAppSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.LinuxWebAppSlotArgs.builder
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
    com.pulumi.azure.appservice.LinuxWebAppSlot(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * This certificate can be used to secure custom domains on App Services (Windows and Linux) hosted on an App Service Plan of Basic and above (free and shared tiers are not supported).
   * 
   * &gt; **Note:** A certificate is valid for six months, and about a month before the certificate\u2019s expiration date, App Services renews/rotates the certificate. This is managed by Azure and doesn&#39;t require this resource to be changed or reprovisioned. It will change the `thumbprint` computed attribute the next time the resource is refreshed after rotation occurs, so keep that in mind if you have any dependencies on this attribute directly.
   */
  def ManagedCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.ManagedCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.ManagedCertificateArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.azure.appservice.ManagedCertificate(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service Plan component.
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.ServicePlan` resource instead.
   */
  def Plan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.PlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.PlanArgs.builder
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
    com.pulumi.azure.appservice.Plan(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service Public Certificate. */
  def PublicCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.PublicCertificateArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.PublicCertificateArgs.builder
    com.pulumi.azure.appservice.PublicCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service: Service Plan. */
  def ServicePlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.ServicePlanArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.ServicePlanArgs.builder
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
    com.pulumi.azure.appservice.ServicePlan(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service Slot (within an App Service).
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.LinuxWebAppSlot` and `azure.appservice.WindowsWebAppSlot` resources instead.
   * 
   * &gt; **Note:** When using Slots - the `appSettings`, `connectionString` and `siteConfig` blocks on the `azure.appservice.AppService` resource will be overwritten when promoting a Slot using the `azure.appservice.ActiveSlot` resource.
   */
  def Slot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.SlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.SlotArgs.builder
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
    com.pulumi.azure.appservice.Slot(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Hostname Binding within an App Service Slot. */
  def SlotCustomHostnameBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.SlotCustomHostnameBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.SlotCustomHostnameBindingArgs.builder
    com.pulumi.azure.appservice.SlotCustomHostnameBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service Slot&#39;s Virtual Network Association (this is for the [Regional VNet Integration](https://docs.microsoft.com/azure/app-service/web-sites-integrate-with-vnet#regional-vnet-integration) which is still in preview). */
  def SlotVirtualNetworkSwiftConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.SlotVirtualNetworkSwiftConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.SlotVirtualNetworkSwiftConnectionArgs.builder
    com.pulumi.azure.appservice.SlotVirtualNetworkSwiftConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service source control token.
   * 
   * &gt; **NOTE:** This resource has been deprecated and will be removed in version 6.0 of the provider. Please use `azure.appservice.ServicePlan` resource instead.
   * 
   * &gt; **NOTE:** Source Control Tokens are configured at the subscription level, not on each App Service - as such this can only be configured Subscription-wide
   */
  def SourceCodeToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.SourceCodeTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.SourceCodeTokenArgs.builder
    com.pulumi.azure.appservice.SourceCodeToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service Web App or Function App Source Control Configuration. */
  def SourceControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.SourceControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.SourceControlArgs.builder
    com.pulumi.azure.appservice.SourceControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service Source Control Slot. */
  def SourceControlSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.SourceControlSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.SourceControlSlotArgs.builder
    com.pulumi.azure.appservice.SourceControlSlot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service Source Control Token.
   * 
   * &gt; **Note:** This resource can only manage the token for the user currently running Terraform. Managing tokens for another user is not supported by the service.
   */
  def SourceControlToken(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.SourceControlTokenArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.SourceControlTokenArgs.builder
    com.pulumi.azure.appservice.SourceControlToken(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service Static Site.
   * 
   * &gt; **Note:** This resource has been superseded by `azure.appservice.StaticWebApp` and will be removed in version 5.0 of the AzureRM provider.
   * 
   * &gt; **Note:** After the Static Site is provisioned, you&#39;ll need to associate your target repository, which contains your web app, to the Static Site, by following the [Azure Static Site document](https://docs.microsoft.com/azure/static-web-apps/github-actions-workflow).
   */
  def StaticSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.StaticSiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.StaticSiteArgs.builder
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
    com.pulumi.azure.appservice.StaticSite(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Static Site Custom Domain.
   * 
   * &gt; **Note:** This resource has been superseded by `azure.appservice.StaticWebAppCustomDomain` and will be removed in version 5.0 of the AzureRM provider.
   * 
   * &gt; **Note:** DNS validation polling is only done for CNAME records, terraform will not validate TXT validation records are complete.
   */
  def StaticSiteCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.StaticSiteCustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.StaticSiteCustomDomainArgs.builder
    com.pulumi.azure.appservice.StaticSiteCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages an App Service Static Web App. */
  def StaticWebApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.StaticWebAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.StaticWebAppArgs.builder
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
    com.pulumi.azure.appservice.StaticWebApp(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Static Web App Custom Domain.
   * 
   * &gt; **Note:** DNS validation polling is only done for CNAME records, terraform will not validate TXT validation records are complete.
   */
  def StaticWebAppCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.StaticWebAppCustomDomainArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.StaticWebAppCustomDomainArgs.builder
    com.pulumi.azure.appservice.StaticWebAppCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service Static Web App Function App Registration.
   * 
   * &gt; **Note:** This resource registers the specified Function App to the `Production` build of the Static Web App.
   */
  def StaticWebAppFunctionAppRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.StaticWebAppFunctionAppRegistrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.StaticWebAppFunctionAppRegistrationArgs.builder
    com.pulumi.azure.appservice.StaticWebAppFunctionAppRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages an App Service Virtual Network Association for [Regional VNet Integration](https://docs.microsoft.com/azure/app-service/web-sites-integrate-with-vnet#regional-vnet-integration).
   * 
   * This resource can be used for both App Services and Function Apps.
   * 
   * &gt; **Note:** The following resources support associating the vNet for Regional vNet Integration directly on the resource and via the `azure.appservice.VirtualNetworkSwiftConnection` resource. You can&#39;t use both simultaneously.
   * 
   * - azure.appservice.LinuxFunctionApp
   * - azure.appservice.LinuxFunctionAppSlot
   * - azure.appservice.LinuxWebApp
   * - azure.appservice.LinuxWebAppSlot
   * - azure.logicapps.Standard
   * - azure.appservice.WindowsFunctionApp
   * - azure.appservice.WindowsFunctionAppSlot
   * - azure.appservice.WindowsWebApp
   * - azure.appservice.WindowsWebAppSlot
   * 
   * This resource requires the `Microsoft.Network/virtualNetworks/subnets/write` permission scope on the subnet.
   * 
   * The resource specific vNet integration requires the `Microsoft.Network/virtualNetworks/subnets/join/action` permission scope.
   * 
   * There is a hard limit of [one VNet integration per App Service Plan](https://docs.microsoft.com/azure/app-service/web-sites-integrate-with-vnet#regional-vnet-integration).
   * Multiple apps in the same App Service plan can use the same VNet.
   */
  def VirtualNetworkSwiftConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.VirtualNetworkSwiftConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.VirtualNetworkSwiftConnectionArgs.builder
    com.pulumi.azure.appservice.VirtualNetworkSwiftConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Web App Active Slot. */
  def WebAppActiveSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.WebAppActiveSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.WebAppActiveSlotArgs.builder
    com.pulumi.azure.appservice.WebAppActiveSlot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Web App Hybrid Connection. */
  def WebAppHybridConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.WebAppHybridConnectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.azure.appservice.WebAppHybridConnectionArgs.builder
    com.pulumi.azure.appservice.WebAppHybridConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Windows Function App. */
  def WindowsFunctionApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.WindowsFunctionAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.WindowsFunctionAppArgs.builder
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
    com.pulumi.azure.appservice.WindowsFunctionApp(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Windows Function App Slot. */
  def WindowsFunctionAppSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.WindowsFunctionAppSlotArgs.builder
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
    com.pulumi.azure.appservice.WindowsFunctionAppSlot(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Windows Web App. */
  def WindowsWebApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.WindowsWebAppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.WindowsWebAppArgs.builder
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
    com.pulumi.azure.appservice.WindowsWebApp(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Manages a Windows Web App Slot. */
  def WindowsWebAppSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appservice.WindowsWebAppSlotArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appservice.WindowsWebAppSlotArgs.builder
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
    com.pulumi.azure.appservice.WindowsWebAppSlot(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
