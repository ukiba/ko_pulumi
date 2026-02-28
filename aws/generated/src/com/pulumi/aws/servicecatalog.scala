package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object servicecatalog:
  type ServicecatalogFunctions = com.pulumi.aws.servicecatalog.ServicecatalogFunctions
  object ServicecatalogFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.servicecatalog.ServicecatalogFunctions.*
  extension (self: ServicecatalogFunctions.type)
    /** Data source for managing an AWS Service Catalog AppRegistry Application. */
    def getAppregistryApplication(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetAppregistryApplicationArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetAppregistryApplicationResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetAppregistryApplicationArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getAppregistryApplication(args(argsBuilder).build)

    /** Data source for managing an AWS Service Catalog AppRegistry Application. */
    def getAppregistryApplicationPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetAppregistryApplicationPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetAppregistryApplicationResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetAppregistryApplicationPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getAppregistryApplicationPlain(args(argsBuilder).build)

    /** Data source for managing an AWS Service Catalog AppRegistry Attribute Group. */
    def getAppregistryAttributeGroup(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetAppregistryAttributeGroupResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getAppregistryAttributeGroup(args(argsBuilder).build)

    /** Data source for managing an AWS Service Catalog AppRegistry Attribute Group. */
    def getAppregistryAttributeGroupPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetAppregistryAttributeGroupResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getAppregistryAttributeGroupPlain(args(argsBuilder).build)

    /** Data source for managing AWS Service Catalog AppRegistry Attribute Group Associations. */
    def getAppregistryAttributeGroupAssociations(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupAssociationsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetAppregistryAttributeGroupAssociationsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupAssociationsArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getAppregistryAttributeGroupAssociations(args(argsBuilder).build)

    /** Data source for managing AWS Service Catalog AppRegistry Attribute Group Associations. */
    def getAppregistryAttributeGroupAssociationsPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupAssociationsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetAppregistryAttributeGroupAssociationsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetAppregistryAttributeGroupAssociationsPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getAppregistryAttributeGroupAssociationsPlain(args(argsBuilder).build)

    /** Provides information on a Service Catalog Constraint. */
    def getConstraint(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetConstraintArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetConstraintResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetConstraintArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getConstraint(args(argsBuilder).build)

    /** Provides information on a Service Catalog Constraint. */
    def getConstraintPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetConstraintPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetConstraintResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetConstraintPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getConstraintPlain(args(argsBuilder).build)

    /** Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product. */
    def getLaunchPaths(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetLaunchPathsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getLaunchPaths(args(argsBuilder).build)

    /** Lists the paths to the specified product. A path is how the user has access to a specified product, and is necessary when provisioning a product. A path also determines the constraints put on the product. */
    def getLaunchPathsPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetLaunchPathsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getLaunchPathsPlain(args(argsBuilder).build)

    /** Provides information for a Service Catalog Portfolio. */
    def getPortfolio(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetPortfolioArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetPortfolioResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetPortfolioArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getPortfolio(args(argsBuilder).build)

    /** Provides information for a Service Catalog Portfolio. */
    def getPortfolioPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetPortfolioPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetPortfolioResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetPortfolioPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getPortfolioPlain(args(argsBuilder).build)

    /** Provides information on Service Catalog Portfolio Constraints. */
    def getPortfolioConstraints(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetPortfolioConstraintsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getPortfolioConstraints(args(argsBuilder).build)

    /** Provides information on Service Catalog Portfolio Constraints. */
    def getPortfolioConstraintsPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetPortfolioConstraintsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetPortfolioConstraintsPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getPortfolioConstraintsPlain(args(argsBuilder).build)

    /**
     * Use this data source to retrieve information about a Service Catalog product.
     *  
     *  &gt; **NOTE:** A &#34;provisioning artifact&#34; is also known as a &#34;version,&#34; and a &#34;distributor&#34; is also known as a &#34;vendor.&#34;
     */
    def getProduct(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetProductArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetProductArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getProduct(args(argsBuilder).build)

    /**
     * Use this data source to retrieve information about a Service Catalog product.
     *  
     *  &gt; **NOTE:** A &#34;provisioning artifact&#34; is also known as a &#34;version,&#34; and a &#34;distributor&#34; is also known as a &#34;vendor.&#34;
     */
    def getProductPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetProductPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetProductResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetProductPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getProductPlain(args(argsBuilder).build)

    /** Lists the provisioning artifacts for the specified product. */
    def getProvisioningArtifacts(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicecatalog.outputs.GetProvisioningArtifactsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getProvisioningArtifacts(args(argsBuilder).build)

    /** Lists the provisioning artifacts for the specified product. */
    def getProvisioningArtifactsPlain(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicecatalog.outputs.GetProvisioningArtifactsResult] =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.GetProvisioningArtifactsPlainArgs.builder
      com.pulumi.aws.servicecatalog.ServicecatalogFunctions.getProvisioningArtifactsPlain(args(argsBuilder).build)

  /**
   * Manages a Service Catalog Portfolio Share. Shares the specified portfolio with the specified account or organization node. You can share portfolios to an organization, an organizational unit, or a specific account.
   *  
   *  If the portfolio share with the specified account or organization node already exists, using this resource to re-create the share will have no effect and will not return an error. You can then use this resource to update the share.
   *  
   *  &gt; **NOTE:** Shares to an organization node can only be created by the management account of an organization or by a delegated administrator. If a delegated admin is de-registered, they can no longer create portfolio shares.
   *  
   *  &gt; **NOTE:** AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
   *  
   *  &gt; **NOTE:** You can&#39;t share a shared resource, including portfolios that contain a shared product.
   */
  def PortfolioShare(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.PortfolioShareArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.PortfolioShareArgs.builder
    
    com.pulumi.aws.servicecatalog.PortfolioShare(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Service Catalog AppRegistry Attribute Group. */
  def AppregistryAttributeGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.AppregistryAttributeGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicecatalog.AppregistryAttributeGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.servicecatalog.AppregistryAttributeGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Service Catalog Principal Portfolio Association. */
  def PrincipalPortfolioAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.PrincipalPortfolioAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.PrincipalPortfolioAssociationArgs.builder
    
    com.pulumi.aws.servicecatalog.PrincipalPortfolioAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Service Catalog Product.
   *  
   *  &gt; **NOTE:** The user or role that uses this resources must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `templatePhysicalId` argument.
   *  
   *  &gt; A &#34;provisioning artifact&#34; is also referred to as a &#34;version.&#34; A &#34;distributor&#34; is also referred to as a &#34;vendor.&#34;
   */
  def Product(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.ProductArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicecatalog.ProductArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.servicecatalog.Product(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Service Catalog Product Portfolio Association. */
  def ProductPortfolioAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.ProductPortfolioAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.ProductPortfolioAssociationArgs.builder
    
    com.pulumi.aws.servicecatalog.ProductPortfolioAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Service Catalog Tag Option. */
  def TagOption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.TagOptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.TagOptionArgs.builder
    
    com.pulumi.aws.servicecatalog.TagOption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.servicecatalog.ProvisionedProductArgs.Builder)
    /**
     * @param provisioningParameters Configuration block with parameters specified by the administrator that are required for provisioning the product. See `provisioningParameters` Block for details.
     * @return builder
     */
    def provisioningParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.Builder]*):
        com.pulumi.aws.servicecatalog.ProvisionedProductArgs.Builder =
      def argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.builder
      builder.provisioningParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stackSetProvisioningPreferences Configuration block with information about the provisioning preferences for a stack set. See `stackSetProvisioningPreferences` Block for details.
     * @return builder
     */
    def stackSetProvisioningPreferences(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.Builder]):
        com.pulumi.aws.servicecatalog.ProvisionedProductArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.builder
      builder.stackSetProvisioningPreferences(args(argsBuilder).build)

  /**
   * This resource provisions and manages a Service Catalog provisioned product.
   *  
   *  A provisioned product is a resourced instance of a product. For example, provisioning a product based on a CloudFormation template launches a CloudFormation stack and its underlying resources.
   *  
   *  Like this resource, the `awsServicecatalogRecord` data source also provides information about a provisioned product. Although a Service Catalog record provides some overlapping information with this resource, a record is tied to a provisioned product event, such as provisioning, termination, and updating.
   *  
   *  &gt; **Tip:** If you include conflicted keys as tags, AWS will report an error, &#34;Parameter validation failed: Missing required parameter in Tags[N]:Value&#34;.
   *  
   *  &gt; **Tip:** A &#34;provisioning artifact&#34; is also referred to as a &#34;version.&#34; A &#34;distributor&#34; is also referred to as a &#34;vendor.&#34;
   */
  def ProvisionedProduct(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.ProvisionedProductArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicecatalog.ProvisionedProductArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.servicecatalog.ProvisionedProduct(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.servicecatalog.ProductArgs.Builder)
    /**
     * @param provisioningArtifactParameters Configuration block for provisioning artifact (i.e., version) parameters. See `provisioningArtifactParameters` Block for details.
     * @return builder
     */
    def provisioningArtifactParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.Builder]):
        com.pulumi.aws.servicecatalog.ProductArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.builder
      builder.provisioningArtifactParameters(args(argsBuilder).build)

  /**
   * Manages a Service Catalog Tag Option Resource Association.
   *  
   *  &gt; **Tip:** A &#34;resource&#34; is either a Service Catalog portfolio or product.
   */
  def TagOptionResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.TagOptionResourceAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.TagOptionResourceAssociationArgs.builder
    
    com.pulumi.aws.servicecatalog.TagOptionResourceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Service Catalog Provisioning Artifact for a specified product.
   *  
   *  &gt; A &#34;provisioning artifact&#34; is also referred to as a &#34;version.&#34;
   *  
   *  &gt; **NOTE:** You cannot create a provisioning artifact for a product that was shared with you.
   *  
   *  &gt; **NOTE:** The user or role that use this resource must have the `cloudformation:GetTemplate` IAM policy permission. This policy permission is required when using the `templatePhysicalId` argument.
   */
  def ProvisioningArtifact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.ProvisioningArtifactArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicecatalog.ProvisioningArtifactArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.servicecatalog.ProvisioningArtifact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Service Catalog self-service action. */
  def ServiceAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.ServiceActionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicecatalog.ServiceActionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.servicecatalog.ServiceAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Service Catalog AppRegistry Attribute Group Association. */
  def AppregistryAttributeGroupAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.AppregistryAttributeGroupAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.AppregistryAttributeGroupAssociationArgs.builder
    
    com.pulumi.aws.servicecatalog.AppregistryAttributeGroupAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Service Catalog Budget Resource Association.
   *  
   *  &gt; **Tip:** A &#34;resource&#34; is either a Service Catalog portfolio or product.
   */
  def BudgetResourceAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.BudgetResourceAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.BudgetResourceAssociationArgs.builder
    
    com.pulumi.aws.servicecatalog.BudgetResourceAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages Service Catalog AWS Organizations Access, a portfolio sharing feature through AWS Organizations. This allows Service Catalog to receive updates on your organization in order to sync your shares with the current structure. This resource will prompt AWS to set `organizations:EnableAWSServiceAccess` on your behalf so that your shares can be in sync with any changes in your AWS Organizations structure.
   *  
   *  &gt; **NOTE:** This resource can only be used by the management account in the organization. In other words, a delegated administrator is not authorized to use the resource.
   */
  def OrganizationsAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.OrganizationsAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.OrganizationsAccessArgs.builder
    
    com.pulumi.aws.servicecatalog.OrganizationsAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Service Catalog Constraint.
   *  
   *  &gt; **NOTE:** This resource does not associate a Service Catalog product and portfolio. However, the product and portfolio must be associated (see the `aws.servicecatalog.ProductPortfolioAssociation` resource) prior to creating a constraint or you will receive an error.
   */
  def Constraint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.ConstraintArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicecatalog.ConstraintArgs.builder
    
    com.pulumi.aws.servicecatalog.Constraint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS Service Catalog AppRegistry Application.
   *  
   *  &gt; An AWS Service Catalog AppRegistry Application is displayed in the AWS Console under &#34;MyApplications&#34;.
   */
  def AppregistryApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.AppregistryApplicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicecatalog.AppregistryApplicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.servicecatalog.AppregistryApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.servicecatalog.ServiceActionArgs.Builder)
    /**
     * @param definition Self-service action definition configuration block. Detailed below.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.Builder]):
        com.pulumi.aws.servicecatalog.ServiceActionArgs.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.inputs.ProductState.Builder)
    /**
     * @param provisioningArtifactParameters Configuration block for provisioning artifact (i.e., version) parameters. See `provisioningArtifactParameters` Block for details.
     * @return builder
     */
    def provisioningArtifactParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.Builder]):
        com.pulumi.aws.servicecatalog.inputs.ProductState.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProductProvisioningArtifactParametersArgs.builder
      builder.provisioningArtifactParameters(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.inputs.ServiceActionState.Builder)
    /**
     * @param definition Self-service action definition configuration block. Detailed below.
     * @return builder
     */
    def definition(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.Builder]):
        com.pulumi.aws.servicecatalog.inputs.ServiceActionState.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ServiceActionDefinitionArgs.builder
      builder.definition(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder)
    /**
     * @param outputs The set of outputs for the product created.
     * @return builder
     */
    def outputs(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductOutputArgs.Builder]*):
        com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder =
      def argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductOutputArgs.builder
      builder.outputs(args.map(_(argsBuilder).build)*)

    /**
     * @param provisioningParameters Configuration block with parameters specified by the administrator that are required for provisioning the product. See `provisioningParameters` Block for details.
     * @return builder
     */
    def provisioningParameters(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.Builder]*):
        com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder =
      def argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs.builder
      builder.provisioningParameters(args.map(_(argsBuilder).build)*)

    /**
     * @param stackSetProvisioningPreferences Configuration block with information about the provisioning preferences for a stack set. See `stackSetProvisioningPreferences` Block for details.
     * @return builder
     */
    def stackSetProvisioningPreferences(args: Endofunction[com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.Builder]):
        com.pulumi.aws.servicecatalog.inputs.ProvisionedProductState.Builder =
      val argsBuilder = com.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs.builder
      builder.stackSetProvisioningPreferences(args(argsBuilder).build)

  /** Provides a resource to create a Service Catalog Portfolio. */
  def Portfolio(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicecatalog.PortfolioArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.servicecatalog.PortfolioArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.servicecatalog.Portfolio(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
