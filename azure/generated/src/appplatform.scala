package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object appplatform:
  /**
   * &gt; **Note:** This resource is only applicable for Spring Cloud Service enterprise tier
   * 
   *  Manages a Spring Cloud Application Performance Monitoring resource for Elastic.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudElasticApplicationPerformanceMonitoring` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudElasticApplicationPerformanceMonitoring(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudElasticApplicationPerformanceMonitoringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudElasticApplicationPerformanceMonitoringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudElasticApplicationPerformanceMonitoring(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource is only applicable for Spring Cloud Service enterprise tier
   * 
   *  Manages a Spring Cloud Application Performance Monitoring resource for App Dynamics.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudAppDynamicsApplicationPerformanceMonitoring` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudAppDynamicsApplicationPerformanceMonitoring(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudAppDynamicsApplicationPerformanceMonitoringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudAppDynamicsApplicationPerformanceMonitoringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudAppDynamicsApplicationPerformanceMonitoring(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudConnectionArgs.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    def secretStore(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudConnectionArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  /**
   * Manages an Azure Spring Cloud Deployment with a Java runtime.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with basic and standard tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudJavaDeployment` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudJavaDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudJavaDeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudJavaDeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudJavaDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Azure Spring Cloud Certificate.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudCertificate` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   * 
   *  ## Import
   * 
   *  Spring Cloud Certificate can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:appplatform/springCloudCertificate:SpringCloudCertificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourcegroup1/providers/Microsoft.AppPlatform/spring/spring1/certificates/cert1
   *  ```
   */
  def SpringCloudCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud Gateway Custom Domain.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudGatewayCustomDomain` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudGatewayCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudGatewayCustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudGatewayCustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudGatewayCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  Manages a Spring Cloud Dev Tool Portal.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudDevToolPortal` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudDevToolPortal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudDevToolPortal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudCustomizedAcceleratorArgs.Builder)
    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    def gitRepository(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudCustomizedAcceleratorArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

  /**
   * Associates a Spring Cloud Application with a MySQL Database.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudAppMysqlAssociation` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudAppMysqlAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudAppMysqlAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudAppMysqlAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudAppMysqlAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud Container Deployment.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudContainerDeployment` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudContainerDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudContainerDeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudContainerDeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudContainerDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Active Azure Spring Cloud Deployment.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudActiveDeployment` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudActiveDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudActiveDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.appplatform.SpringCloudActiveDeploymentArgs.builder
    com.pulumi.azure.appplatform.SpringCloudActiveDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud API Portal Domain.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApiPortalCustomDomain` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudApiPortalCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudApiPortalCustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudApiPortalCustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudApiPortalCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud Gateway Route Config.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudGatewayRouteConfig` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudGatewayRouteConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud API Portal.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApiPortal` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudApiPortal(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudApiPortalArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudApiPortalArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudApiPortal(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  Manages a Spring Cloud Application Live View.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApplicationLiveView` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudApplicationLiveView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudApplicationLiveViewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudApplicationLiveViewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudApplicationLiveView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object AppplatformFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to access information about an existing Spring Cloud Application.
     * 
     *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApp` data source is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
     */
    inline def getSpringCloudApp(args: Endofunction[com.pulumi.azure.appplatform.inputs.GetSpringCloudAppArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appplatform.outputs.GetSpringCloudAppResult] =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.GetSpringCloudAppArgs.builder
      com.pulumi.azure.appplatform.AppplatformFunctions.getSpringCloudApp(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Spring Cloud Application.
     * 
     *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApp` data source is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
     */
    inline def getSpringCloudAppPlain(args: Endofunction[com.pulumi.azure.appplatform.inputs.GetSpringCloudAppPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appplatform.outputs.GetSpringCloudAppResult] =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.GetSpringCloudAppPlainArgs.builder
      com.pulumi.azure.appplatform.AppplatformFunctions.getSpringCloudAppPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Spring Cloud Service.
     * 
     *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudService` data source is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
     */
    inline def getSpringCloudService(args: Endofunction[com.pulumi.azure.appplatform.inputs.GetSpringCloudServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.appplatform.outputs.GetSpringCloudServiceResult] =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.GetSpringCloudServiceArgs.builder
      com.pulumi.azure.appplatform.AppplatformFunctions.getSpringCloudService(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing Spring Cloud Service.
     * 
     *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudService` data source is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
     */
    inline def getSpringCloudServicePlain(args: Endofunction[com.pulumi.azure.appplatform.inputs.GetSpringCloudServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.appplatform.outputs.GetSpringCloudServiceResult] =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.GetSpringCloudServicePlainArgs.builder
      com.pulumi.azure.appplatform.AppplatformFunctions.getSpringCloudServicePlain(args(argsBuilder).build)

  /**
   * Associates a Spring Cloud Application with a CosmosDB Account.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudAppCosmosDBAssociation` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudAppCosmosDBAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudAppCosmosDBAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudAppCosmosDBAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudAppCosmosDBAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudBuilderArgs.Builder)
    /**
     * @param buildPackGroups One or more `buildPackGroup` blocks as defined below.
     * @return builder
     */
    def buildPackGroups(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudBuilderArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.builder
      builder.buildPackGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param stack A `stack` block as defined below.
     * @return builder
     */
    def stack(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudBuilderArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.builder
      builder.stack(args(argsBuilder).build)

  /**
   * Manages a Spring Cloud Build Pack Binding.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudBuildPackBinding` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudBuildPackBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudBuildPackBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudBuildPackBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudBuildPackBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource is only applicable for Spring Cloud Service enterprise tier
   * 
   *  Manages a Spring Cloud Application Performance Monitoring resource for Dynatrace.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudDynatraceApplicationPerformanceMonitoring` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudDynatraceApplicationPerformanceMonitoring(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudDynatraceApplicationPerformanceMonitoringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudDynatraceApplicationPerformanceMonitoringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudDynatraceApplicationPerformanceMonitoring(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudDevToolPortalArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  /**
   * Manage an Azure Spring Cloud Application.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApp` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudAppArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs.Builder)
    /**
     * @param repositories One or more `repository` blocks as defined below.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  /**
   * Manages an Azure Spring Cloud Service.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudService` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.appplatform.SpringCloudService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder)
    /**
     * @param customPersistentDisks A `customPersistentDisk` block as defined below.
     * @return builder
     */
    def customPersistentDisks(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.builder
      builder.customPersistentDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingressSettings An `ingressSettings` block as defined below.
     * @return builder
     */
    def ingressSettings(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.builder
      builder.ingressSettings(args(argsBuilder).build)

    /**
     * @param persistentDisk An `persistentDisk` block as defined below.
     * @return builder
     */
    def persistentDisk(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudAppArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.builder
      builder.persistentDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder)
    /**
     * @param configServerGitSetting A `configServerGitSetting` block as defined below. This field is applicable only for Spring Cloud Service with basic and standard tier.
     * @return builder
     */
    def configServerGitSetting(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.builder
      builder.configServerGitSetting(args(argsBuilder).build)

    /**
     * @param containerRegistries One or more `containerRegistry` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    def containerRegistries(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.builder
      builder.containerRegistries(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBuildService A `defaultBuildService` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    def defaultBuildService(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.builder
      builder.defaultBuildService(args(argsBuilder).build)

    /**
     * @param marketplace A `marketplace` block as defined below. Can only be specified when `sku` is set to `E0`.
     * @return builder
     */
    def marketplace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.builder
      builder.marketplace(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param trace A `trace` block as defined below.
     * @return builder
     */
    def trace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.builder
      builder.trace(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.appplatform.SpringCloudServiceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.appplatform.SpringCloudApiPortalArgs.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudApiPortalArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudBuildPackBindingArgs.Builder)
    /**
     * @param launch A `launch` block as defined below.
     * @return builder
     */
    def launch(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudBuildPackBindingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.builder
      builder.launch(args(argsBuilder).build)

  /**
   * Manages a Spring Cloud Customized Accelerator.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudCustomizedAccelerator` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudCustomizedAccelerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudCustomizedAcceleratorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudCustomizedAcceleratorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudCustomizedAccelerator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder)
    /**
     * @param apiMetadata A `apiMetadata` block as defined below.
     * @return builder
     */
    def apiMetadata(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.builder
      builder.apiMetadata(args(argsBuilder).build)

    /**
     * @param clientAuthorization A `clientAuthorization` block as defined below.
     * @return builder
     */
    def clientAuthorization(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.builder
      builder.clientAuthorization(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param localResponseCachePerInstance A `localResponseCachePerInstance` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    def localResponseCachePerInstance(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.builder
      builder.localResponseCachePerInstance(args(argsBuilder).build)

    /**
     * @param localResponseCachePerRoute A `localResponseCachePerRoute` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    def localResponseCachePerRoute(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.builder
      builder.localResponseCachePerRoute(args(argsBuilder).build)

    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudBuildDeploymentArgs.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudBuildDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  /**
   * &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  Manages a Spring Cloud Gateway.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudGateway` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud Configuration Service.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudConfigurationService` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudConfigurationService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudConfigurationServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudConfigurationService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudContainerDeploymentArgs.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudContainerDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudJavaDeploymentArgs.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudJavaDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.Builder)
    /**
     * @param openApi One or more `openApi` blocks as defined below.
     * @return builder
     */
    def openApi(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.Builder]):
        com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.builder
      builder.openApi(args(argsBuilder).build)

    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.Builder]*):
        com.pulumi.azure.appplatform.SpringCloudGatewayRouteConfigArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  /**
   * Associates a Spring Cloud Application with a Redis Cache.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudAppRedisAssociation` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudAppRedisAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudAppRedisAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudAppRedisAssociationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudAppRedisAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an Azure Spring Cloud Custom Domain.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudCustomDomain` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudCustomDomain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudCustomDomainArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudCustomDomainArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudCustomDomain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource is only applicable for Spring Cloud Service enterprise tier
   * 
   *  Manages a Spring Cloud Application Performance Monitoring resource for Application Insights.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoring` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudApplicationInsightsApplicationPerformanceMonitoring(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudApplicationInsightsApplicationPerformanceMonitoring(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource is only applicable for Spring Cloud Service enterprise tier
   * 
   *  Manages a Spring Cloud Application Performance Monitoring resource for New Relic.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoring` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudNewRelicApplicationPerformanceMonitoring(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoringArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoringArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudNewRelicApplicationPerformanceMonitoring(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud Storage.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudStorage` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudStorageArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  Manages a Spring Cloud Accelerator.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudAccelerator` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudAccelerator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudAcceleratorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudAcceleratorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudAccelerator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud Builder.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudBuilder` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudBuilder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudBuilderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudBuilderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudBuilder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a service connector for spring cloud app.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudConnection` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Spring Cloud Build Deployment.
   * 
   *  &gt; **Note:** This resource is applicable only for Spring Cloud Service with enterprise tier.
   * 
   *  !&gt; **Note:** Azure Spring Apps is now deprecated and will be retired on 2028-05-31 - as such the `azure.appplatform.SpringCloudBuildDeployment` resource is deprecated and will be removed in a future major version of the AzureRM Provider. See https://aka.ms/asaretirement for more information.
   */
  def SpringCloudBuildDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.appplatform.SpringCloudBuildDeploymentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.appplatform.SpringCloudBuildDeploymentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.appplatform.SpringCloudBuildDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder)
    /**
     * @param customPersistentDisks A `customPersistentDisk` block as defined below.
     * @return builder
     */
    def customPersistentDisks(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppCustomPersistentDiskArgs.builder
      builder.customPersistentDisks(args.map(_(argsBuilder).build)*)

    /**
     * @param identity An `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param ingressSettings An `ingressSettings` block as defined below.
     * @return builder
     */
    def ingressSettings(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppIngressSettingsArgs.builder
      builder.ingressSettings(args(argsBuilder).build)

    /**
     * @param persistentDisk An `persistentDisk` block as defined below.
     * @return builder
     */
    def persistentDisk(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudAppState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudAppPersistentDiskArgs.builder
      builder.persistentDisk(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingState.Builder)
    /**
     * @param launch A `launch` block as defined below.
     * @return builder
     */
    def launch(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildPackBindingLaunchArgs.builder
      builder.launch(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudConnectionState.Builder)
    /**
     * @param authentication The authentication info. An `authentication` block as defined below.
     * @return builder
     */
    def authentication(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionAuthenticationArgs.builder
      builder.authentication(args(argsBuilder).build)

    def secretStore(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudConnectionState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConnectionSecretStoreArgs.builder
      builder.secretStore(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudBuilderState.Builder)
    /**
     * @param buildPackGroups One or more `buildPackGroup` blocks as defined below.
     * @return builder
     */
    def buildPackGroups(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuilderState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderBuildPackGroupArgs.builder
      builder.buildPackGroups(args.map(_(argsBuilder).build)*)

    /**
     * @param stack A `stack` block as defined below.
     * @return builder
     */
    def stack(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuilderState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuilderStackArgs.builder
      builder.stack(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder)
    /**
     * @param configServerGitSetting A `configServerGitSetting` block as defined below. This field is applicable only for Spring Cloud Service with basic and standard tier.
     * @return builder
     */
    def configServerGitSetting(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.builder
      builder.configServerGitSetting(args(argsBuilder).build)

    /**
     * @param containerRegistries One or more `containerRegistry` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    def containerRegistries(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceContainerRegistryArgs.builder
      builder.containerRegistries(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultBuildService A `defaultBuildService` block as defined below. This field is applicable only for Spring Cloud Service with enterprise tier.
     * @return builder
     */
    def defaultBuildService(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceDefaultBuildServiceArgs.builder
      builder.defaultBuildService(args(argsBuilder).build)

    /**
     * @param marketplace A `marketplace` block as defined below. Can only be specified when `sku` is set to `E0`.
     * @return builder
     */
    def marketplace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceMarketplaceArgs.builder
      builder.marketplace(args(argsBuilder).build)

    /**
     * @param network A `network` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param requiredNetworkTrafficRules A list of `requiredNetworkTrafficRules` blocks as defined below.
     * @return builder
     */
    def requiredNetworkTrafficRules(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceRequiredNetworkTrafficRuleArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceRequiredNetworkTrafficRuleArgs.builder
      builder.requiredNetworkTrafficRules(args.map(_(argsBuilder).build)*)

    /**
     * @param trace A `trace` block as defined below.
     * @return builder
     */
    def trace(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceTraceArgs.builder
      builder.trace(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder)
    /**
     * @param basicAuth A `basicAuth` block as defined below. Conflicts with `git_repository[0].ssh_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * @return builder
     */
    def basicAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryBasicAuthArgs.builder
      builder.basicAuth(args(argsBuilder).build)

    /**
     * @param sshAuth A `sshAuth` block as defined below. Conflicts with `git_repository[0].basic_auth`. Changing this forces a new Spring Cloud Customized Accelerator to be created.
     * @return builder
     */
    def sshAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositorySshAuthArgs.builder
      builder.sshAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentState.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudBuildDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentState.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudJavaDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder)
    /**
     * @param httpBasicAuth A `httpBasicAuth` block as defined below.
     * @return builder
     */
    def httpBasicAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryHttpBasicAuthArgs.builder
      builder.httpBasicAuth(args(argsBuilder).build)

    /**
     * @param sshAuth A `sshAuth` block as defined below.
     * @return builder
     */
    def sshAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositorySshAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositorySshAuthArgs.builder
      builder.sshAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigState.Builder)
    /**
     * @param openApi One or more `openApi` blocks as defined below.
     * @return builder
     */
    def openApi(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigOpenApiArgs.builder
      builder.openApi(args(argsBuilder).build)

    /**
     * @param routes One or more `route` blocks as defined below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayRouteConfigRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder)
    /**
     * @param httpBasicAuth A `httpBasicAuth` block as defined below.
     * @return builder
     */
    def httpBasicAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingHttpBasicAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingHttpBasicAuthArgs.builder
      builder.httpBasicAuth(args(argsBuilder).build)

    /**
     * @param repositories One or more `repository` blocks as defined below.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

    /**
     * @param sshAuth A `sshAuth` block as defined below.
     * @return builder
     */
    def sshAuth(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingSshAuthArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingArgs.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudServiceConfigServerGitSettingSshAuthArgs.builder
      builder.sshAuth(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorState.Builder)
    /**
     * @param gitRepository A `gitRepository` block as defined below.
     * @return builder
     */
    def gitRepository(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudCustomizedAcceleratorGitRepositoryArgs.builder
      builder.gitRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalState.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudDevToolPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalState.Builder)
    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudApiPortalSsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder)
    /**
     * @param apiMetadata A `apiMetadata` block as defined below.
     * @return builder
     */
    def apiMetadata(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayApiMetadataArgs.builder
      builder.apiMetadata(args(argsBuilder).build)

    /**
     * @param clientAuthorization A `clientAuthorization` block as defined below.
     * @return builder
     */
    def clientAuthorization(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayClientAuthorizationArgs.builder
      builder.clientAuthorization(args(argsBuilder).build)

    /**
     * @param cors A `cors` block as defined below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayCorsArgs.builder
      builder.cors(args(argsBuilder).build)

    /**
     * @param localResponseCachePerInstance A `localResponseCachePerInstance` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    def localResponseCachePerInstance(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerInstanceArgs.builder
      builder.localResponseCachePerInstance(args(argsBuilder).build)

    /**
     * @param localResponseCachePerRoute A `localResponseCachePerRoute` block as defined below. Only one of `localResponseCachePerInstance` or `localResponseCachePerRoute` can be specified.
     * @return builder
     */
    def localResponseCachePerRoute(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayLocalResponseCachePerRouteArgs.builder
      builder.localResponseCachePerRoute(args(argsBuilder).build)

    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewayQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

    /**
     * @param sso A `sso` block as defined below.
     * @return builder
     */
    def sso(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudGatewayState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudGatewaySsoArgs.builder
      builder.sso(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentState.Builder)
    /**
     * @param quota A `quota` block as defined below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.Builder]):
        com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentState.Builder =
      val argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudContainerDeploymentQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceState.Builder)
    /**
     * @param repositories One or more `repository` blocks as defined below.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.Builder]*):
        com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceState.Builder =
      def argsBuilder = com.pulumi.azure.appplatform.inputs.SpringCloudConfigurationServiceRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)
