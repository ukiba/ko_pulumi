package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object apigateway:
  /** Provides an API Gateway Client Certificate. */
  def ClientCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.ClientCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.ClientCertificateArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.ClientCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Connects a custom domain name registered via `aws.apigateway.DomainName`
   *  with a deployed API so that its methods can be called via the
   *  custom domain name.
   *  
   *  ## Import
   *  
   *  For a non-root `basePath`:
   *  
   *  For a non-root `basePath` and a private custom domain name:
   *  
   *  Using `pulumi import`, import `aws.apigateway.BasePathMapping` using the domain name and base path or domain name, base path and domain name ID (for private custom domain names). For example:
   *  
   *  For an empty `basePath` or, in other words, a root path (`/`):
   *  
   *  ```sh
   *  $ pulumi import aws:apigateway/basePathMapping:BasePathMapping example example.com/
   *  ```
   *  
   *  For a non-root `basePath`:
   *  
   *  ```sh
   *  $ pulumi import aws:apigateway/basePathMapping:BasePathMapping example example.com/base-path
   *  ```
   *  
   *  For a non-root `basePath` and a private custom domain name:
   *  
   *  ```sh
   *  $ pulumi import aws:apigateway/basePathMapping:BasePathMapping example api.internal.example.com/base-path/abcde12345
   *  ```
   */
  def BasePathMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.BasePathMappingArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.BasePathMappingArgs.builder
    
    com.pulumi.aws.apigateway.BasePathMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages API Gateway Stage Method Settings. For example, CloudWatch logging and metrics.
   *  
   *  &gt; **NOTE:** We recommend using this resource in conjunction with the `aws.apigateway.Stage` resource instead of a stage managed by the `aws.apigateway.Deployment` resource optional `stageName` argument. Stages managed by the `aws.apigateway.Deployment` resource are recreated on redeployment and this resource will require a second apply to recreate the method settings.
   */
  def MethodSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.MethodSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.MethodSettingsArgs.builder
    
    com.pulumi.aws.apigateway.MethodSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ApigatewayFunctions = com.pulumi.aws.apigateway.ApigatewayFunctions
  object ApigatewayFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.apigateway.ApigatewayFunctions.*
  extension (self: ApigatewayFunctions.type)
    /** Data source for managing AWS API Gateway API Keys. */
    def getApiKeys(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetApiKeysArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetApiKeysResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetApiKeysArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getApiKeys(args(argsBuilder).build)

    /** Data source for managing AWS API Gateway API Keys. */
    def getApiKeysPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetApiKeysPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetApiKeysResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetApiKeysPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getApiKeysPlain(args(argsBuilder).build)

    /** Provides details about a specific API Gateway Authorizer. */
    def getAuthorizer(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetAuthorizerArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetAuthorizerResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetAuthorizerArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getAuthorizer(args(argsBuilder).build)

    /** Provides details about a specific API Gateway Authorizer. */
    def getAuthorizerPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetAuthorizerPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetAuthorizerResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetAuthorizerPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getAuthorizerPlain(args(argsBuilder).build)

    /** Provides details about multiple API Gateway Authorizers. */
    def getAuthorizers(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetAuthorizersArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetAuthorizersResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetAuthorizersArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getAuthorizers(args(argsBuilder).build)

    /** Provides details about multiple API Gateway Authorizers. */
    def getAuthorizersPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetAuthorizersPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetAuthorizersResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetAuthorizersPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getAuthorizersPlain(args(argsBuilder).build)

    /** Use this data source to get the custom domain name for use with AWS API Gateway. */
    def getDomainName(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetDomainNameArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetDomainNameResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetDomainNameArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getDomainName(args(argsBuilder).build)

    /** Use this data source to get the custom domain name for use with AWS API Gateway. */
    def getDomainNamePlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetDomainNamePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetDomainNameResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetDomainNamePlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getDomainNamePlain(args(argsBuilder).build)

    /**
     * 
     */
    def getExport(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetExportArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetExportArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getExport(args(argsBuilder).build)

    /**
     * 
     */
    def getExportPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetExportPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetExportResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetExportPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getExportPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the name and value of a pre-existing API Key, for
     *  example to supply credentials for a dependency microservice.
     */
    def getKey(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetKeyArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetKeyArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getKey(args(argsBuilder).build)

    /**
     * Use this data source to get the name and value of a pre-existing API Key, for
     *  example to supply credentials for a dependency microservice.
     */
    def getKeyPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetKeyPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetKeyResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetKeyPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getKeyPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the id of a Resource in API Gateway.
     *  To fetch the Resource, you must provide the REST API id as well as the full path.
     */
    def getResource(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetResourceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetResourceArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getResource(args(argsBuilder).build)

    /**
     * Use this data source to get the id of a Resource in API Gateway.
     *  To fetch the Resource, you must provide the REST API id as well as the full path.
     */
    def getResourcePlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetResourcePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetResourceResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetResourcePlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getResourcePlain(args(argsBuilder).build)

    /**
     * Use this data source to get the id and rootResourceId of a REST API in
     *  API Gateway. To fetch the REST API you must provide a name to match against.
     *  As there is no unique name constraint on REST APIs this data source will
     *  error if there is more than one match.
     */
    def getRestApi(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetRestApiArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetRestApiResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetRestApiArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getRestApi(args(argsBuilder).build)

    /**
     * Use this data source to get the id and rootResourceId of a REST API in
     *  API Gateway. To fetch the REST API you must provide a name to match against.
     *  As there is no unique name constraint on REST APIs this data source will
     *  error if there is more than one match.
     */
    def getRestApiPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetRestApiPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetRestApiResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetRestApiPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getRestApiPlain(args(argsBuilder).build)

    /**
     * 
     */
    def getSdk(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetSdkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetSdkResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetSdkArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getSdk(args(argsBuilder).build)

    /**
     * 
     */
    def getSdkPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetSdkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetSdkResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetSdkPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getSdkPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the id of a VPC Link in
     *  API Gateway. To fetch the VPC Link you must provide a name to match against.
     *  As there is no unique name constraint on API Gateway VPC Links this data source will
     *  error if there is more than one match.
     */
    def getVpcLink(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetVpcLinkArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.apigateway.outputs.GetVpcLinkResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetVpcLinkArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getVpcLink(args(argsBuilder).build)

    /**
     * Use this data source to get the id of a VPC Link in
     *  API Gateway. To fetch the VPC Link you must provide a name to match against.
     *  As there is no unique name constraint on API Gateway VPC Links this data source will
     *  error if there is more than one match.
     */
    def getVpcLinkPlain(args: Endofunction[com.pulumi.aws.apigateway.inputs.GetVpcLinkPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.apigateway.outputs.GetVpcLinkResult] =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.GetVpcLinkPlainArgs.builder
      com.pulumi.aws.apigateway.ApigatewayFunctions.getVpcLinkPlain(args(argsBuilder).build)

  /**
   * Manages an API Gateway Stage. A stage is a named reference to a deployment, which can be done via the `aws.apigateway.Deployment` resource. Stages can be optionally managed further with the `aws.apigateway.BasePathMapping` resource, `aws.apigateway.DomainName` resource, and `awsApiMethodSettings` resource. For more information, see the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-stages.html).
   *  
   *  ### Managing the API Logging CloudWatch Log Group
   *  
   *  API Gateway provides the ability to [enable CloudWatch API logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html). To manage the CloudWatch Log Group when this feature is enabled, the `aws.cloudwatch.LogGroup` resource can be used where the name matches the API Gateway naming convention. If the CloudWatch Log Group previously exists, import the `aws.cloudwatch.LogGroup` resource into Pulumi as a one time operation. You can recreate the environment without import.
   *  
   *  <pre>
   *  {@code
   *  package generated_program;
   *  
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.aws.apigateway.RestApi;
   *  import com.pulumi.aws.cloudwatch.LogGroup;
   *  import com.pulumi.aws.cloudwatch.LogGroupArgs;
   *  import com.pulumi.aws.apigateway.Stage;
   *  import com.pulumi.aws.apigateway.StageArgs;
   *  import com.pulumi.resources.CustomResourceOptions;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   *  
   *  public class App {
   *      public static void main(String[] args) {
   *          Pulumi.run(App::stack);
   *      }
   *  
   *      public static void stack(Context ctx) {
   *          final var config = ctx.config();
   *          final var stageName = config.get("stageName").orElse("example");
   *          var example = new RestApi("example");
   *  
   *          var exampleLogGroup = new LogGroup("exampleLogGroup", LogGroupArgs.builder()
   *              .name(example.id().applyValue(_id -> String.format("API-Gateway-Execution-Logs_%s/%s", _id,stageName)))
   *              .retentionInDays(7)
   *              .build());
   *  
   *          var exampleStage = new Stage("exampleStage", StageArgs.builder()
   *              .stageName(stageName)
   *              .build(), CustomResourceOptions.builder()
   *                  .dependsOn(exampleLogGroup)
   *                  .build());
   *  
   *      }
   *  }
   *  }
   *  </pre>
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import `aws.apigateway.Stage` using `REST-API-ID/STAGE-NAME`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:apigateway/stage:Stage example 12345abcde/example
   *  ```
   */
  def Stage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.StageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.StageArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.Stage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigateway.DomainNameArgs.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint information including type. See below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name. See below.
     * @return builder
     */
    def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigateway.DomainNameArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  /** Provides a HTTP Method for an API Gateway Resource. */
  def Method(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.MethodArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.MethodArgs.builder
    
    com.pulumi.aws.apigateway.Method(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an HTTP Method Integration for an API Gateway Integration. */
  def Integration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.IntegrationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.IntegrationArgs.builder
    
    com.pulumi.aws.apigateway.Integration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an API Gateway Gateway Response for a REST API Gateway. */
  def Response(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.ResponseArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.ResponseArgs.builder
    
    com.pulumi.aws.apigateway.Response(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigateway.RestApiPutArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.Builder]):
        com.pulumi.aws.apigateway.RestApiPutArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a settings of an API Gateway Documentation Part. */
  def DocumentationPart(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.DocumentationPartArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.DocumentationPartArgs.builder
    
    com.pulumi.aws.apigateway.DocumentationPart(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Registers a custom domain name for use with AWS API Gateway. Additional information about this functionality
   *  can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
   *  
   *  This resource just establishes ownership of and the TLS settings for
   *  a particular domain name. An API can be attached to a particular path
   *  under the registered domain name using
   *  the `aws.apigateway.BasePathMapping` resource.
   *  
   *  API Gateway domains can be defined as either &#39;edge-optimized&#39; or &#39;regional&#39;.  In an edge-optimized configuration,
   *  API Gateway internally creates and manages a CloudFront distribution to route requests on the given hostname. In
   *  addition to this resource it&#39;s necessary to create a DNS record corresponding to the given domain name which is an alias
   *  (either Route53 alias or traditional CNAME) to the Cloudfront domain name exported in the `cloudfrontDomainName`
   *  attribute.
   *  
   *  In a regional configuration, API Gateway does not create a CloudFront distribution to route requests to the API, though
   *  a distribution can be created if needed. In either case, it is necessary to create a DNS record corresponding to the
   *  given domain name which is an alias (either Route53 alias or traditional CNAME) to the regional domain name exported in
   *  the `regionalDomainName` attribute.
   *  
   *  &gt; **Note:** API Gateway requires the use of AWS Certificate Manager (ACM) certificates instead of Identity and Access Management (IAM) certificates in regions that support ACM. Regions that support ACM can be found in the [Regions and Endpoints Documentation](https://docs.aws.amazon.com/general/latest/gr/rande.html#acm_region). To import an existing private key and certificate into ACM or request an ACM certificate, see the `aws.acm.Certificate` resource.
   *  
   *  &gt; **Note:** The `aws.apigateway.DomainName` resource expects dependency on the `aws.acm.CertificateValidation` as
   *  only verified certificates can be used. This can be made either explicitly by adding the
   *  `dependsOn = [aws_acm_certificate_validation.cert]` attribute. Or implicitly by referring certificate ARN
   *  from the validation resource where it will be available after the resource creation:
   *  `regionalCertificateArn = aws_acm_certificate_validation.cert.certificate_arn`.
   */
  def DomainName(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.DomainNameArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.DomainNameArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.DomainName(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an API Gateway Resource. */
  def Resource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.ResourceArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.ResourceArgs.builder
    
    com.pulumi.aws.apigateway.Resource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an API Gateway Usage Plan.
   *  
   *  ## Import
   *  
   *  Using `pulumi import`, import AWS API Gateway Usage Plan using the `id`. For example:
   *  
   *  ```sh
   *  $ pulumi import aws:apigateway/usagePlan:UsagePlan myusageplan &lt;usage_plan_id&gt;
   *  ```
   */
  def UsagePlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.UsagePlanArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.UsagePlanArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.UsagePlan(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an API Gateway Usage Plan Key. */
  def UsagePlanKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.UsagePlanKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.UsagePlanKeyArgs.builder
    
    com.pulumi.aws.apigateway.UsagePlanKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for updating an AWS API Gateway REST API with a new API description.
   *  
   *  &gt; **NOTE:** When importing an OpenAPI specification using the `body` argument, the `info.title` field updates the `name` of the `aws.apigateway.RestApi`. If the imported `title` differs from the configured `name`, Terraform will report the difference.
   */
  def RestApiPut(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.RestApiPutArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.RestApiPutArgs.builder
    
    com.pulumi.aws.apigateway.RestApiPut(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an API Gateway Authorizer. */
  def Authorizer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.AuthorizerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.AuthorizerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.apigateway.Authorizer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a settings of an API Gateway Account. Settings is applied region-wide per `provider` block. */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.AccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.AccountArgs.builder
    
    com.pulumi.aws.apigateway.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigateway.DocumentationPartArgs.Builder)
    /**
     * @param location Location of the targeted API entity of the to-be-created documentation part. See below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.Builder]):
        com.pulumi.aws.apigateway.DocumentationPartArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.builder
      builder.location(args(argsBuilder).build)

  /**
   * Provides an API Gateway API Key.
   *  
   *  &gt; **NOTE:** Since the API Gateway usage plans feature was launched on August 11, 2016, usage plans are now **required** to associate an API key with an API stage.
   */
  def ApiKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.ApiKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.ApiKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.ApiKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigateway.RestApiArgs.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint configuration including endpoint type. Defined below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.RestApiArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.MethodSettingsArgs.Builder)
    /**
     * @param settings Settings block, see below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.MethodSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  /**
   * Provides an API Gateway VPC Link.
   *  
   *  &gt; **Note:** Amazon API Gateway Version 1 VPC Links enable private integrations that connect REST APIs to private resources in a VPC.
   *  To enable private integration for HTTP APIs, use the Amazon API Gateway Version 2 VPC Link resource.
   */
  def VpcLink(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.VpcLinkArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.VpcLinkArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.VpcLink(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an HTTP Method Integration Response for an API Gateway Resource.
   *  
   *  &gt; **Note:** Depends on having `aws.apigateway.Integration` inside your rest api. To ensure this
   *  you might need to add an explicit `dependsOn` for clean runs.
   */
  def IntegrationResponse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.IntegrationResponseArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.IntegrationResponseArgs.builder
    
    com.pulumi.aws.apigateway.IntegrationResponse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigateway.StageArgs.Builder)
    /**
     * @param accessLogSettings Enables access logs for the API stage. See Access Log Settings below.
     * @return builder
     */
    def accessLogSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param canarySettings Configuration settings of a canary deployment. See Canary Settings below.
     * @return builder
     */
    def canarySettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.Builder]):
        com.pulumi.aws.apigateway.StageArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.builder
      builder.canarySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.IntegrationArgs.Builder)
    /**
     * @param tlsConfig TLS configuration. See below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigateway.IntegrationArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  /** Manages an API Gateway Request Validator. */
  def RequestValidator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.RequestValidatorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.RequestValidatorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.apigateway.RequestValidator(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an API Gateway REST Deployment. A deployment is a snapshot of the REST API configuration. The deployment can then be published to callable endpoints via the `aws.apigateway.Stage` resource and optionally managed further with the `aws.apigateway.BasePathMapping` resource, `aws.apigateway.DomainName` resource, and `awsApiMethodSettings` resource. For more information, see the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html).
   *  
   *  To properly capture all REST API configuration in a deployment, this resource must have dependencies on all prior resources that manage resources/paths, methods, integrations, etc.
   *  
   *  * For REST APIs that are configured via OpenAPI specification (`aws.apigateway.RestApi` resource `body` argument), no special dependency setup is needed beyond referencing the  `id` attribute of that resource unless additional resources have further customized the REST API.
   *  * When the REST API configuration involves other resources (`aws.apigateway.Integration` resource), the dependency setup can be done with implicit resource references in the `triggers` argument or explicit resource references using the [resource `dependsOn` custom option](https://www.pulumi.com/docs/intro/concepts/resources/#dependson). The `triggers` argument should be preferred over `dependsOn`, since `dependsOn` can only capture dependency ordering and will not cause the resource to recreate (redeploy the REST API) with upstream configuration changes.
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.DeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.DeploymentArgs.builder
    
    com.pulumi.aws.apigateway.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an API Gateway REST API. The REST API can be configured via [importing an OpenAPI specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html) in the `body` argument (with other arguments serving as overrides) or via other provider resources to manage the resources (`aws.apigateway.Resource` resource), methods (`aws.apigateway.Method` resource), integrations (`aws.apigateway.Integration` resource), etc. of the REST API. Once the REST API is configured, the `aws.apigateway.Deployment` resource can be used along with the `aws.apigateway.Stage` resource to publish the REST API.
   *  
   *  &gt; **Note:** Amazon API Gateway Version 1 resources are used for creating and deploying REST APIs. To create and deploy WebSocket and HTTP APIs, use Amazon API Gateway Version 2 resources.
   *  
   *  !&gt; **WARN:** When importing Open API Specifications with the `body` argument, by default the API Gateway REST API will be replaced with the Open API Specification thus removing any existing methods, resources, integrations, or endpoints. Endpoint mutations are asynchronous operations, and race conditions with DNS are possible. To overcome this limitation, use the `putRestApiMode` attribute and set it to `merge`.
   */
  def RestApi(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.RestApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.RestApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.RestApi(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a resource to manage an API Gateway Documentation Version. */
  def DocumentationVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.DocumentationVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.DocumentationVersionArgs.builder
    
    com.pulumi.aws.apigateway.DocumentationVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Creates a domain name access association resource between an access association source and a private custom domain name. */
  def DomainNameAccessAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.DomainNameAccessAssociationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.DomainNameAccessAssociationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.apigateway.DomainNameAccessAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Model for a REST API Gateway. */
  def Model(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.ModelArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.apigateway.ModelArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.apigateway.Model(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Provides an API Gateway REST API Policy.
   *  
   *  &gt; **Note:** Amazon API Gateway Version 1 resources are used for creating and deploying REST APIs. To create and deploy WebSocket and HTTP APIs, use Amazon API Gateway Version 2 resources.
   */
  def RestApiPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.RestApiPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.RestApiPolicyArgs.builder
    
    com.pulumi.aws.apigateway.RestApiPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides an HTTP Method Response for an API Gateway Resource. More information about API Gateway method responses can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-settings-method-response.html). */
  def MethodResponse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.apigateway.MethodResponseArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.apigateway.MethodResponseArgs.builder
    
    com.pulumi.aws.apigateway.MethodResponse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder)
    /**
     * @param apiStages Associated API stages of the usage plan.
     * @return builder
     */
    def apiStages(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder]*):
        com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.builder
      builder.apiStages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaSettings The quota settings of the usage plan.
     * @return builder
     */
    def quotaSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.builder
      builder.quotaSettings(args(argsBuilder).build)

    /**
     * @param throttleSettings The throttling limits of the usage plan.
     * @return builder
     */
    def throttleSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.UsagePlanState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.builder
      builder.throttleSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.RestApiState.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint configuration including endpoint type. Defined below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.RestApiState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.IntegrationState.Builder)
    /**
     * @param tlsConfig TLS configuration. See below.
     * @return builder
     */
    def tlsConfig(args: Endofunction[com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.IntegrationState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.IntegrationTlsConfigArgs.builder
      builder.tlsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.AccountState.Builder)
    /**
     * @param throttleSettings Account-Level throttle settings. See exported fields below.
     * @return builder
     */
    def throttleSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.AccountThrottleSettingArgs.Builder]*):
        com.pulumi.aws.apigateway.inputs.AccountState.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.AccountThrottleSettingArgs.builder
      builder.throttleSettings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigateway.inputs.MethodSettingsState.Builder)
    /**
     * @param settings Settings block, see below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.MethodSettingsState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.MethodSettingsSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.StageState.Builder)
    /**
     * @param accessLogSettings Enables access logs for the API stage. See Access Log Settings below.
     * @return builder
     */
    def accessLogSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageAccessLogSettingsArgs.builder
      builder.accessLogSettings(args(argsBuilder).build)

    /**
     * @param canarySettings Configuration settings of a canary deployment. See Canary Settings below.
     * @return builder
     */
    def canarySettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.StageState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.StageCanarySettingsArgs.builder
      builder.canarySettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.DomainNameState.Builder)
    /**
     * @param endpointConfiguration Configuration block defining API endpoint information including type. See below.
     * @return builder
     */
    def endpointConfiguration(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs.builder
      builder.endpointConfiguration(args(argsBuilder).build)

    /**
     * @param mutualTlsAuthentication Mutual TLS authentication configuration for the domain name. See below.
     * @return builder
     */
    def mutualTlsAuthentication(args: Endofunction[com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.DomainNameState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs.builder
      builder.mutualTlsAuthentication(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.RestApiPutState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.RestApiPutState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.RestApiPutTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder)
    /**
     * @param throttles The throttling limits of the usage plan.
     * @return builder
     */
    def throttles(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanApiStageThrottleArgs.Builder]*):
        com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanApiStageThrottleArgs.builder
      builder.throttles(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.apigateway.inputs.DocumentationPartState.Builder)
    /**
     * @param location Location of the targeted API entity of the to-be-created documentation part. See below.
     * @return builder
     */
    def location(args: Endofunction[com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.Builder]):
        com.pulumi.aws.apigateway.inputs.DocumentationPartState.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.DocumentationPartLocationArgs.builder
      builder.location(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.apigateway.UsagePlanArgs.Builder)
    /**
     * @param apiStages Associated API stages of the usage plan.
     * @return builder
     */
    def apiStages(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.Builder]*):
        com.pulumi.aws.apigateway.UsagePlanArgs.Builder =
      def argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanApiStageArgs.builder
      builder.apiStages(args.map(_(argsBuilder).build)*)

    /**
     * @param quotaSettings The quota settings of the usage plan.
     * @return builder
     */
    def quotaSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.UsagePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanQuotaSettingsArgs.builder
      builder.quotaSettings(args(argsBuilder).build)

    /**
     * @param throttleSettings The throttling limits of the usage plan.
     * @return builder
     */
    def throttleSettings(args: Endofunction[com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.Builder]):
        com.pulumi.aws.apigateway.UsagePlanArgs.Builder =
      val argsBuilder = com.pulumi.aws.apigateway.inputs.UsagePlanThrottleSettingsArgs.builder
      builder.throttleSettings(args(argsBuilder).build)
