package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object apigee:
  extension (builder: com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.Builder)
    /**
     * @param subject Subject details.
     *  Structure is documented below.
     * @return builder
     */
    def subject(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.Builder]):
        com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

    /**
     * @param subjectAlternativeDnsNames List of alternative host names. Maximum length is 255 characters for each value.
     *  Structure is documented below.
     * @return builder
     */
    def subjectAlternativeDnsNames(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.Builder]):
        com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.builder
      builder.subjectAlternativeDnsNames(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.OrganizationArgs.Builder)
    /**
     * @param properties Properties defined in the Apigee organization profile.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.OrganizationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /**
   * Apigee Dns Zone.
   * 
   *  To get more information about DnsZone, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.dnsZones/create)
   *  * How-to Guides
   *      * [Creating a DnsZone](https://cloud.google.com/apigee/docs/api-platform/get-started/create-dns)
   */
  def DnsZone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.DnsZoneArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.DnsZoneArgs.builder
    com.pulumi.gcp.apigee.DnsZone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.SecurityProfileV2Args.Builder)
    /**
     * @param profileAssessmentConfigs A map of the assessment name and the assessment config.
     *  Structure is documented below.
     * @return builder
     */
    def profileAssessmentConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.SecurityProfileV2Args.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.builder
      builder.profileAssessmentConfigs(args.map(_(argsBuilder).build)*)

  /**
   * Authorize the Runtime components to access directly with Apigee Control Plane.
   * 
   *  To get more information about ControlPlaneAccess, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations/updateControlPlaneAccess)
   *  * How-to Guides
   *      * [Enable ControlPlane access](https://cloud.google.com/apigee/docs/hybrid/v1.14/install-enable-control-plane-access)
   */
  def ControlPlaneAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.ControlPlaneAccessArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.ControlPlaneAccessArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.ControlPlaneAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An `Environment` in Apigee.
   * 
   *  To get more information about Environment, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   */
  def Environment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.EnvironmentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.Environment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a sharedflow attachment to a flowhook point.
   * 
   *  To get more information about Flowhook, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.flowhooks#FlowHook)
   *  * How-to Guides
   *      * [organizations.environments.flowhooks](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.flowhooks#FlowHook)
   * 
   *  ## Import
   * 
   *  Flowhook can be imported using any of these accepted formats:
   * 
   *  * `organizations/{{org_id}}/environments/{{environment}}/flowhooks/{{flow_hook_point}}`
   *  * `{{org_id}}/{{environment}}/{{flow_hook_point}}`
   * 
   *  When using the `pulumi import` command, Flowhook can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/flowhook:Flowhook default organizations/{{org_id}}/environments/{{environment}}/flowhooks/{{flow_hook_point}}
   *  $ pulumi import gcp:apigee/flowhook:Flowhook default {{org_id}}/{{environment}}/{{flow_hook_point}}
   *  ```
   */
  def Flowhook(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.FlowhookArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.FlowhookArgs.builder
    com.pulumi.gcp.apigee.Flowhook(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An `AppGroup` in Apigee.
   * 
   *  To get more information about AppGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.appgroups)
   *  * How-to Guides
   *      * [Organizing client app ownership](https://cloud.google.com/apigee/docs/api-platform/publish/organizing-client-app-ownership)
   */
  def AppGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.AppGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.AppGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.AppGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.TargetServerArgs.Builder)
    /**
     * @param sSlInfo Specifies TLS configuration info for this TargetServer. The JSON name is sSLInfo for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     *  Structure is documented below.
     * @return builder
     */
    def sSlInfo(args: Endofunction[com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder]):
        com.pulumi.gcp.apigee.TargetServerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.builder
      builder.sSlInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.EnvironmentIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.InstanceArgs.Builder)
    /**
     * @param accessLoggingConfig Access logging configuration enables the access logging feature at the instance.
     *  Apigee customers can enable access logging to ship the access logs to their own project&#39;s cloud logging.
     *  Structure is documented below.
     * @return builder
     */
    def accessLoggingConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.Builder]):
        com.pulumi.gcp.apigee.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.builder
      builder.accessLoggingConfig(args(argsBuilder).build)

  /**
   * You can combine policies and resources into a shared flow that you can consume from multiple API proxies, and even from other shared flows. Although it&#39;s like a proxy, a shared flow has no endpoint. It can be used only from an API proxy or shared flow that&#39;s in the same organization as the shared flow itself.
   * 
   *  To get more information about SharedFlow, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.sharedflows)
   *  * How-to Guides
   *      * [Sharedflows](https://cloud.google.com/apigee/docs/resources)
   */
  def Sharedflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SharedflowArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.SharedflowArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.Sharedflow(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Collection of key/value string pairs.
   * 
   *  To get more information about EnvironmentKeyvaluemaps, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keyvaluemaps/create)
   *  * How-to Guides
   *      * [Using key value maps](https://cloud.google.com/apigee/docs/api-platform/cache/key-value-maps)
   */
  def EnvironmentKeyvaluemaps(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentKeyvaluemapsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.EnvironmentKeyvaluemapsArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.EnvironmentKeyvaluemaps(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type ApigeeFunctions = com.pulumi.gcp.apigee.ApigeeFunctions
  object ApigeeFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.apigee.ApigeeFunctions.*
  extension (self: ApigeeFunctions.type)
    /** Retrieves the current IAM policy data for environment */
    def getEnvironmentIamPolicy(args: Endofunction[com.pulumi.gcp.apigee.inputs.GetEnvironmentIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apigee.outputs.GetEnvironmentIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.GetEnvironmentIamPolicyArgs.builder
      com.pulumi.gcp.apigee.ApigeeFunctions.getEnvironmentIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for environment */
    def getEnvironmentIamPolicyPlain(args: Endofunction[com.pulumi.gcp.apigee.inputs.GetEnvironmentIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apigee.outputs.GetEnvironmentIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.GetEnvironmentIamPolicyPlainArgs.builder
      com.pulumi.gcp.apigee.ApigeeFunctions.getEnvironmentIamPolicyPlain(args(argsBuilder).build)

  /**
   * An `Organization` is the top-level container in Apigee.
   * 
   *  To get more information about Organization, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations)
   *  * How-to Guides
   *      * [Creating an API organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org)
   *      * Setting a custom endpoint (required for data residency)
   */
  def Organization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.OrganizationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.OrganizationArgs.builder
    com.pulumi.gcp.apigee.Organization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.ApiProductArgs.Builder)
    /**
     * @param attributes Array of attributes that may be used to extend the default API product profile with customer-specific metadata. You can specify a maximum of 18 attributes.
     *  Use this property to specify the access level of the API product as either public, private, or internal.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param graphqlOperationGroup Configuration used to group Apigee proxies or remote services with graphQL operation name, graphQL operation type and quotas. This grouping allows us to precisely set quota for a particular combination of graphQL name and operation type for a particular proxy request. If graphQL name is not set, this would imply quota will be applied on all graphQL requests matching the operation type.
     *  Structure is documented below.
     * @return builder
     */
    def graphqlOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.builder
      builder.graphqlOperationGroup(args(argsBuilder).build)

    /**
     * @param grpcOperationGroup Optional. Configuration used to group Apigee proxies with gRPC services and method names. This grouping allows us to set quota for a particular proxy with the gRPC service name and method. If a method name is not set, this implies quota and authorization are applied to all gRPC methods implemented by that proxy for that particular gRPC service.
     *  Structure is documented below.
     * @return builder
     */
    def grpcOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.builder
      builder.grpcOperationGroup(args(argsBuilder).build)

    /**
     * @param operationGroup Configuration used to group Apigee proxies or remote services with resources, method types, and quotas. The resource refers to the resource URI (excluding the base path). With this grouping, the API product creator is able to fine-tune and give precise control over which REST methods have access to specific resources and how many calls can be made (using the quota setting).
     *  Note: The apiResources setting cannot be specified for both the API product and operation group; otherwise the call will fail.
     *  Structure is documented below.
     * @return builder
     */
    def operationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.ApiProductArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.builder
      builder.operationGroup(args(argsBuilder).build)

  /**
   * An `Environment KeyStore` in Apigee.
   * 
   *  To get more information about EnvKeystore, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   * 
   *  ## Import
   * 
   *  EnvKeystore can be imported using any of these accepted formats:
   * 
   *  * `{{env_id}}/keystores/{{name}}`
   *  * `{{env_id}}/{{name}}`
   * 
   *  When using the `pulumi import` command, EnvKeystore can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/envKeystore:EnvKeystore default {{env_id}}/keystores/{{name}}
   *  $ pulumi import gcp:apigee/envKeystore:EnvKeystore default {{env_id}}/{{name}}
   *  ```
   */
  def EnvKeystore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvKeystoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.EnvKeystoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.EnvKeystore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Apigee NAT (network address translation) address. A NAT address is a static external IP address used for Internet egress traffic. This is not avaible for Apigee hybrid.
   * 
   *  To get more information about NatAddress, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.natAddresses)
   *  * How-to Guides
   *      * [Provisioning NAT IPs](https://cloud.google.com/apigee/docs/api-platform/security/nat-provisioning)
   */
  def NatAddress(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.NatAddressArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.NatAddressArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.NatAddress(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A SecurityAction is rule that can be enforced at an environment level.
   *  The result is one of: - A denied API call - An explicitly allowed API call
   *  - A flagged API call (HTTP headers added before the target receives it)
   *    At least one condition is required to create a SecurityAction.
   * 
   *  To get more information about SecurityAction, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.securityActions/create)
   *  * How-to Guides
   *      * [Creating security actions](https://cloud.google.com/apigee/docs/api-security/security-actions-api#create-security-actions)
   */
  def SecurityAction(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SecurityActionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.SecurityActionArgs.builder
    com.pulumi.gcp.apigee.SecurityAction(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Apigee Endpoint Attachment.
   * 
   *  To get more information about EndpointAttachment, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.endpointAttachments/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   * 
   *  ## Import
   * 
   *  EndpointAttachment can be imported using any of these accepted formats:
   * 
   *  * `{{org_id}}/endpointAttachments/{{endpoint_attachment_id}}`
   *  * `{{org_id}}/{{endpoint_attachment_id}}`
   * 
   *  When using the `pulumi import` command, EndpointAttachment can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/endpointAttachment:EndpointAttachment default {{org_id}}/endpointAttachments/{{endpoint_attachment_id}}
   *  $ pulumi import gcp:apigee/endpointAttachment:EndpointAttachment default {{org_id}}/{{endpoint_attachment_id}}
   *  ```
   */
  def EndpointAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EndpointAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.EndpointAttachmentArgs.builder
    com.pulumi.gcp.apigee.EndpointAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.KeystoresAliasesKeyCertFileArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.Builder]):
        com.pulumi.gcp.apigee.KeystoresAliasesKeyCertFileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
   *  * `gcp.apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
   *  * `gcp.apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Retrieves the IAM policy for the environment
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `gcp.apigee.EnvironmentIamBinding` and `gcp.apigee.EnvironmentIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `gcp.apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.apigee.EnvironmentIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicy;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new EnvironmentIamPolicy("policy", EnvironmentIamPolicyArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBinding;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EnvironmentIamBinding("binding", EnvironmentIamBindingArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMember;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EnvironmentIamMember("member", EnvironmentIamMemberArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Apigee Environment
   * 
   *  Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
   *  * `gcp.apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
   *  * `gcp.apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Retrieves the IAM policy for the environment
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `gcp.apigee.EnvironmentIamBinding` and `gcp.apigee.EnvironmentIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `gcp.apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.apigee.EnvironmentIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicy;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new EnvironmentIamPolicy("policy", EnvironmentIamPolicyArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBinding;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EnvironmentIamBinding("binding", EnvironmentIamBindingArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMember;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EnvironmentIamMember("member", EnvironmentIamMemberArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * {{org_id}}/environments/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Apigee environment IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_apigee_environment_iam_member.editor &#34;{{org_id}}/environments/{{environment}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_apigee_environment_iam_binding.editor &#34;{{org_id}}/environments/{{environment}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigee/environmentIamBinding:EnvironmentIamBinding editor {{org_id}}/environments/{{environment}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EnvironmentIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.EnvironmentIamBindingArgs.builder
    com.pulumi.gcp.apigee.EnvironmentIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An alias from a key/certificate pair.
   * 
   *  To get more information about KeystoresAliasesKeyCertFile, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
   *  * How-to Guides
   *      * [Keystores Aliases](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
   * 
   *  ## Import
   * 
   *  KeystoresAliasesKeyCertFile can be imported using any of these accepted formats:
   * 
   *  * `organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}`
   *  * `{{org_id}}/{{environment}}/{{keystore}}/{{alias}}`
   * 
   *  When using the `pulumi import` command, KeystoresAliasesKeyCertFile can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/keystoresAliasesKeyCertFile:KeystoresAliasesKeyCertFile default organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}
   *  $ pulumi import gcp:apigee/keystoresAliasesKeyCertFile:KeystoresAliasesKeyCertFile default {{org_id}}/{{environment}}/{{keystore}}/{{alias}}
   *  ```
   */
  def KeystoresAliasesKeyCertFile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.KeystoresAliasesKeyCertFileArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.KeystoresAliasesKeyCertFileArgs.builder
    com.pulumi.gcp.apigee.KeystoresAliasesKeyCertFile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.SecurityMonitoringConditionArgs.Builder)
    /**
     * @param includeAllResources A nested object resource.
     * @return builder
     */
    def includeAllResources(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityMonitoringConditionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.builder
      builder.includeAllResources(args(argsBuilder).build)

  /**
   * An Environment Keystore Alias for Self Signed Certificate Format in Apigee
   * 
   *  To get more information about KeystoresAliasesSelfSignedCert, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   */
  def KeystoresAliasesSelfSignedCert(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCertArgs.builder
    com.pulumi.gcp.apigee.KeystoresAliasesSelfSignedCert(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An `Instance attachment` in Apigee.
   * 
   *  To get more information about InstanceAttachment, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances.attachments/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   */
  def InstanceAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.InstanceAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.InstanceAttachmentArgs.builder
    com.pulumi.gcp.apigee.InstanceAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.AppGroupArgs.Builder)
    /**
     * @param attributes A list of attributes
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.AppGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  /**
   * Enable/Disable add-ons for an Apigee environment.
   * 
   *  To get more information about EnvironmentAddonsConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.addonsConfig/setAddonEnablement)
   *  * How-to Guides
   *      * [Enable Analytics Add-On](https://cloud.google.com/apigee/docs/api-platform/reference/manage-analytics-add-on)
   */
  def EnvironmentAddonsConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentAddonsConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.EnvironmentAddonsConfigArgs.builder
    com.pulumi.gcp.apigee.EnvironmentAddonsConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.DeveloperAppArgs.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.DeveloperAppArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  /**
   * Security monitoring condition for risk assessment version 2 in Apigee.
   * 
   *  To get more information about SecurityMonitoringCondition, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.securityMonitoringConditions/create)
   *  * How-to Guides
   *      * [Creating a security monitoring condition](https://cloud.google.com/apigee/docs/api-security/security-scores#monitoring-conditions)
   */
  def SecurityMonitoringCondition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SecurityMonitoringConditionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.SecurityMonitoringConditionArgs.builder
    com.pulumi.gcp.apigee.SecurityMonitoringCondition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
   *  * `gcp.apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
   *  * `gcp.apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Retrieves the IAM policy for the environment
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `gcp.apigee.EnvironmentIamBinding` and `gcp.apigee.EnvironmentIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `gcp.apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.apigee.EnvironmentIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicy;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new EnvironmentIamPolicy("policy", EnvironmentIamPolicyArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBinding;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EnvironmentIamBinding("binding", EnvironmentIamBindingArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMember;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EnvironmentIamMember("member", EnvironmentIamMemberArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Apigee Environment
   * 
   *  Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
   *  * `gcp.apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
   *  * `gcp.apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Retrieves the IAM policy for the environment
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `gcp.apigee.EnvironmentIamBinding` and `gcp.apigee.EnvironmentIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `gcp.apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.apigee.EnvironmentIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicy;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new EnvironmentIamPolicy("policy", EnvironmentIamPolicyArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBinding;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EnvironmentIamBinding("binding", EnvironmentIamBindingArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMember;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EnvironmentIamMember("member", EnvironmentIamMemberArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * {{org_id}}/environments/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Apigee environment IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_apigee_environment_iam_member.editor &#34;{{org_id}}/environments/{{environment}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_apigee_environment_iam_binding.editor &#34;{{org_id}}/environments/{{environment}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigee/environmentIamMember:EnvironmentIamMember editor {{org_id}}/environments/{{environment}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EnvironmentIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.EnvironmentIamMemberArgs.builder
    com.pulumi.gcp.apigee.EnvironmentIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a deployment of an API proxy.
   * 
   *  To get more information about ApiDeployment, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.apis.revisions.deployments)
   *  * How-to Guides
   *      * [QUICKSTART_TITLE](https://cloud.google.com/apigee/docs/api-platform/deploy/ui-deploy-overview)
   */
  def ApiDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.ApiDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.ApiDeploymentArgs.builder
    com.pulumi.gcp.apigee.ApiDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.DeveloperArgs.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.DeveloperArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  /**
   * Creates an app associated with a developer.
   *  This API associates the developer app with the specified API product
   *  and auto-generates an API key for the app to use in calls to API proxies
   *  inside that API product.
   * 
   *  To get more information about DeveloperApp, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.developers.apps)
   *  * How-to Guides
   *      * [Creating a developer](https://cloud.google.com/apigee/docs/api-platform/publish/creating-apps-surface-your-api)
   */
  def DeveloperApp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.DeveloperAppArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.DeveloperAppArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.DeveloperApp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates key value entries in a key value map scoped to an environment.
   * 
   *  To get more information about EnvironmentKeyvaluemapsEntries, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.keyvaluemaps.entries/create)
   *  * How-to Guides
   *      * [Using key value maps](https://cloud.google.com/apigee/docs/api-platform/cache/key-value-maps)
   */
  def EnvironmentKeyvaluemapsEntries(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentKeyvaluemapsEntriesArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.EnvironmentKeyvaluemapsEntriesArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.EnvironmentKeyvaluemapsEntries(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An `Environment Group attachment` in Apigee.
   * 
   *  To get more information about EnvgroupAttachment, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.envgroups.attachments/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   */
  def EnvGroupAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvGroupAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.EnvGroupAttachmentArgs.builder
    com.pulumi.gcp.apigee.EnvGroupAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a feedback report from an Advanced API Security customer.
   *  Manages customer feedback about ML models.
   * 
   *  To get more information about SecurityFeedback, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.securityFeedback/create)
   *  * How-to Guides
   *      * [Create a SecurityFeedback](https://docs.cloud.google.com/apigee/docs/api-security/abuse-detection#exclude-traffic-from-abuse-detection)
   */
  def SecurityFeedback(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SecurityFeedbackArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.SecurityFeedbackArgs.builder
    com.pulumi.gcp.apigee.SecurityFeedback(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An `Instance` is the runtime dataplane in Apigee.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.instances/create)
   *  * How-to Guides
   *      * [Creating a runtime instance](https://cloud.google.com/apigee/docs/api-platform/get-started/create-instance)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Deploys a revision of a sharedflow.
   * 
   *  To get more information about SharedflowDeployment, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.sharedflows.revisions.deployments)
   *  * How-to Guides
   *      * [sharedflows.revisions.deployments](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.sharedflows.revisions.deployments)
   * 
   *  ## Import
   * 
   *  SharedflowDeployment can be imported using any of these accepted formats:
   * 
   *  * `organizations/{{org_id}}/environments/{{environment}}/sharedflows/{{sharedflow_id}}/revisions/{{revision}}/deployments/{{name}}`
   *  * `{{org_id}}/{{environment}}/{{sharedflow_id}}/{{revision}}/{{name}}`
   * 
   *  When using the `pulumi import` command, SharedflowDeployment can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/sharedflowDeployment:SharedflowDeployment default organizations/{{org_id}}/environments/{{environment}}/sharedflows/{{sharedflow_id}}/revisions/{{revision}}/deployments/{{name}}
   *  $ pulumi import gcp:apigee/sharedflowDeployment:SharedflowDeployment default {{org_id}}/{{environment}}/{{sharedflow_id}}/{{revision}}/{{name}}
   *  ```
   */
  def SharedflowDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SharedflowDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.SharedflowDeploymentArgs.builder
    com.pulumi.gcp.apigee.SharedflowDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Configures the add-ons for the Apigee organization. The existing add-on configuration will be fully replaced.
   * 
   *  To get more information about AddonsConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations#setaddons)
   *  * How-to Guides
   *      * [Creating an API organization](https://cloud.google.com/apigee/docs/api-platform/get-started/create-org)
   */
  def AddonsConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.AddonsConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.AddonsConfigArgs.builder
    com.pulumi.gcp.apigee.AddonsConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.EnvironmentArgs.Builder)
    /**
     * @param clientIpResolutionConfig The algorithm to resolve IP. This will affect Analytics, API Security, and other features that use the client ip. To remove a client ip resolution config, update the field to an empty value. Example: &#39;{ &#34;clientIpResolutionConfig&#34; = {} }&#39; For more information, see: https://cloud.google.com/apigee/docs/api-platform/system-administration/client-ip-resolution
     *  Structure is documented below.
     * @return builder
     */
    def clientIpResolutionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.builder
      builder.clientIpResolutionConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig NodeConfig for setting the min/max number of nodes associated with the environment.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param properties Key-value pairs that may be used for customizing the environment.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  /**
   * An `Environment group` in Apigee.
   * 
   *  To get more information about Envgroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.envgroups/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   */
  def EnvGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.EnvGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.EnvGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * TargetServer configuration. TargetServers are used to decouple a proxy TargetEndpoint HTTPTargetConnections from concrete URLs for backend services.
   * 
   *  To get more information about TargetServer, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.targetservers/create)
   *  * How-to Guides
   *      * [Load balancing across backend servers](https://cloud.google.com/apigee/docs/api-platform/deploy/load-balancing-across-backend-servers)
   */
  def TargetServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.TargetServerArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.TargetServerArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.TargetServer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Security profile for risk assessment version 2 in Apigee.
   * 
   *  To get more information about SecurityProfileV2, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.securityProfilesV2/create)
   *  * How-to Guides
   *      * [Creating a security profile](https://cloud.google.com/apigee/docs/api-security/security-scores#security-profiles-v2)
   */
  def SecurityProfileV2(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SecurityProfileV2Args.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.SecurityProfileV2Args.builder
    com.pulumi.gcp.apigee.SecurityProfileV2(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.AddonsConfigArgs.Builder)
    /**
     * @param addonsConfig Addon configurations of the Apigee organization.
     *  Structure is documented below.
     * @return builder
     */
    def addonsConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder]):
        com.pulumi.gcp.apigee.AddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.builder
      builder.addonsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.EnvironmentIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigee.EnvironmentIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.SecurityActionArgs.Builder)
    /**
     * @param allow Allow a request through if it matches this SecurityAction.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param conditionConfig A valid SecurityAction must contain at least one condition.
     *  Structure is documented below.
     * @return builder
     */
    def conditionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.builder
      builder.conditionConfig(args(argsBuilder).build)

    /**
     * @param deny Deny a request through if it matches this SecurityAction.
     *  Structure is documented below.
     * @return builder
     */
    def deny(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.builder
      builder.deny(args(argsBuilder).build)

    /**
     * @param flag Flag a request through if it matches this SecurityAction.
     *  Structure is documented below.
     * @return builder
     */
    def flag(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder]):
        com.pulumi.gcp.apigee.SecurityActionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.builder
      builder.flag(args(argsBuilder).build)

  /**
   * An `Environment Reference` in Apigee.
   * 
   *  To get more information about EnvReferences, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.references/create)
   *  * How-to Guides
   *      * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
   * 
   *  ## Import
   * 
   *  EnvReferences can be imported using any of these accepted formats:
   * 
   *  * `{{env_id}}/references/{{name}}`
   *  * `{{env_id}}/{{name}}`
   * 
   *  When using the `pulumi import` command, EnvReferences can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/envReferences:EnvReferences default {{env_id}}/references/{{name}}
   *  $ pulumi import gcp:apigee/envReferences:EnvReferences default {{env_id}}/{{name}}
   *  ```
   */
  def EnvReferences(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvReferencesArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.EnvReferencesArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.EnvReferences(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.SecurityFeedbackArgs.Builder)
    /**
     * @param feedbackContexts One or more attribute/value pairs for constraining the feedback.
     *  Structure is documented below.
     * @return builder
     */
    def feedbackContexts(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.Builder]*):
        com.pulumi.gcp.apigee.SecurityFeedbackArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.builder
      builder.feedbackContexts(args.map(_(argsBuilder).build)*)

  /**
   * To get more information about API proxies see, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.apis)
   *  * How-to Guides
   *    * [API proxies](https://cloud.google.com/apigee/docs/resources)
   * 
   *  ## Import
   * 
   *  An API proxy can be imported using any of these accepted formats:
   * 
   *  * `{{org_id}}/apis/{{name}}`
   *  * `{{org_id}}/{{name}}`
   * 
   *  When using the `pulumi import` command, API proxy can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/api:Api default {{org_id}}/apis/{{name}}
   *  $ pulumi import gcp:apigee/api:Api default {{org_id}}/{{name}}
   *  ```
   */
  def Api(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.ApiArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.ApiArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.Api(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An alias from a pkcs12 file.
   * 
   *  To get more information about KeystoresAliasesPkcs12, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
   *  * How-to Guides
   *      * [Keystores Aliases](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.keystores.aliases)
   * 
   *  ## Import
   * 
   *  KeystoresAliasesPkcs12 can be imported using any of these accepted formats:
   * 
   *  * `organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}`
   *  * `{{org_id}}/{{environment}}/{{keystore}}/{{alias}}`
   * 
   *  When using the `pulumi import` command, KeystoresAliasesPkcs12 can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12 default organizations/{{org_id}}/environments/{{environment}}/keystores/{{keystore}}/aliases/{{alias}}
   *  $ pulumi import gcp:apigee/keystoresAliasesPkcs12:KeystoresAliasesPkcs12 default {{org_id}}/{{environment}}/{{keystore}}/{{alias}}
   *  ```
   */
  def KeystoresAliasesPkcs12(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.KeystoresAliasesPkcs12Args.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.KeystoresAliasesPkcs12Args.builder
    com.pulumi.gcp.apigee.KeystoresAliasesPkcs12(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Authorize the Synchronizer to download environment data from the control plane.
   * 
   *  To get more information about SyncAuthorization, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations#getsyncauthorization)
   *  * How-to Guides
   *      * [Enable Synchronizer access](https://cloud.google.com/apigee/docs/hybrid/v1.8/synchronizer-access#enable-synchronizer-access)
   */
  def SyncAuthorization(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SyncAuthorizationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.SyncAuthorizationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.SyncAuthorization(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
   *  * `gcp.apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
   *  * `gcp.apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Retrieves the IAM policy for the environment
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `gcp.apigee.EnvironmentIamBinding` and `gcp.apigee.EnvironmentIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `gcp.apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.apigee.EnvironmentIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicy;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new EnvironmentIamPolicy("policy", EnvironmentIamPolicyArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBinding;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EnvironmentIamBinding("binding", EnvironmentIamBindingArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMember;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EnvironmentIamMember("member", EnvironmentIamMemberArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Apigee Environment
   * 
   *  Three different resources help you manage your IAM policy for Apigee Environment. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Authoritative. Sets the IAM policy for the environment and replaces any existing policy already attached.
   *  * `gcp.apigee.EnvironmentIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the environment are preserved.
   *  * `gcp.apigee.EnvironmentIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the environment are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigee.EnvironmentIamPolicy`: Retrieves the IAM policy for the environment
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamPolicy` **cannot** be used in conjunction with `gcp.apigee.EnvironmentIamBinding` and `gcp.apigee.EnvironmentIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigee.EnvironmentIamBinding` resources **can be** used in conjunction with `gcp.apigee.EnvironmentIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.apigee.EnvironmentIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicy;
   *  import com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new EnvironmentIamPolicy("policy", EnvironmentIamPolicyArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBinding;
   *  import com.pulumi.gcp.apigee.EnvironmentIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EnvironmentIamBinding("binding", EnvironmentIamBindingArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigee.EnvironmentIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMember;
   *  import com.pulumi.gcp.apigee.EnvironmentIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EnvironmentIamMember("member", EnvironmentIamMemberArgs.builder()
   *              .orgId(apigeeEnvironment.orgId())
   *              .envId(apigeeEnvironment.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * {{org_id}}/environments/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Apigee environment IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_apigee_environment_iam_member.editor &#34;{{org_id}}/environments/{{environment}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_apigee_environment_iam_binding.editor &#34;{{org_id}}/environments/{{environment}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigee/environmentIamPolicy:EnvironmentIamPolicy editor {{org_id}}/environments/{{environment}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EnvironmentIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.EnvironmentIamPolicyArgs.builder
    com.pulumi.gcp.apigee.EnvironmentIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A `Developer` is an API consumer that can have apps registered in Apigee.
   * 
   *  To get more information about Developer, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.developers)
   *  * How-to Guides
   *      * [Creating a developer](https://cloud.google.com/apigee/docs/api-platform/publish/adding-developers-your-api-product)
   */
  def Developer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.DeveloperArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.DeveloperArgs.builder
    com.pulumi.gcp.apigee.Developer(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Space in Apigee
   * 
   *  To get more information about Space, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.spaces)
   *  * How-to Guides
   *      * [Managing Spaces](https://cloud.google.com/apigee/docs/api-platform/system-administration/spaces/manage-spaces)
   */
  def Space(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.SpaceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.SpaceArgs.builder
    com.pulumi.gcp.apigee.Space(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.DnsZoneArgs.Builder)
    /**
     * @param peeringConfig Peering zone config
     *  Structure is documented below.
     * @return builder
     */
    def peeringConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.apigee.DnsZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

  /**
   * Deploys a specific Apigee API Proxy revision to a given Apigee environment.
   * 
   *  To get more information about EnvironmentApiRevisionDeployment, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.apis.revisions.deployments/deploy)
   *  * How-to Guides
   *      * [Deploying an API proxy](https://cloud.google.com/apigee/docs/api-platform/deploy/ui-deploy-new#apigee-api)
   */
  def EnvironmentApiRevisionDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.EnvironmentApiRevisionDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigee.EnvironmentApiRevisionDeploymentArgs.builder
    com.pulumi.gcp.apigee.EnvironmentApiRevisionDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.TargetServerState.Builder)
    /**
     * @param sSlInfo Specifies TLS configuration info for this TargetServer. The JSON name is sSLInfo for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     *  Structure is documented below.
     * @return builder
     */
    def sSlInfo(args: Endofunction[com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.TargetServerState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.builder
      builder.sSlInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder)
    /**
     * @param operationConfigs Required. List of operation configurations for either Apigee API proxies or other remote services that are associated with this API product.
     *  Structure is documented below.
     * @return builder
     */
    def operationConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.builder
      builder.operationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder)
    /**
     * @param commonName The TLS Common Name of the certificate.
     *  Structure is documented below.
     * @return builder
     */
    def commonName(args: Endofunction[com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoCommonNameArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.TargetServerSSlInfoCommonNameArgs.builder
      builder.commonName(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder)
    /**
     * @param attributes Custom attributes associated with the operation.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param operations Required. List of GraphQL name/operation type pairs for the proxy or remote service to which quota will be applied. If only operation types are specified, the quota will be applied to all GraphQL requests irrespective of the GraphQL name.
     *  Note: Currently, you can specify only a single GraphQLOperation. Specifying more than one will cause the operation to fail.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigOperationArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

    /**
     * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     *  Structure is documented below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigQuotaArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupOperationConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder)
    /**
     * @param advancedApiOpsConfig Configuration for the Advanced API Ops add-on.
     *  Structure is documented below.
     * @return builder
     */
    def advancedApiOpsConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigAdvancedApiOpsConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigAdvancedApiOpsConfigArgs.builder
      builder.advancedApiOpsConfig(args(argsBuilder).build)

    /**
     * @param apiSecurityConfig Configuration for the API Security add-on.
     *  Structure is documented below.
     * @return builder
     */
    def apiSecurityConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigApiSecurityConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigApiSecurityConfigArgs.builder
      builder.apiSecurityConfig(args(argsBuilder).build)

    /**
     * @param connectorsPlatformConfig Configuration for the Monetization add-on.
     *  Structure is documented below.
     * @return builder
     */
    def connectorsPlatformConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigConnectorsPlatformConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigConnectorsPlatformConfigArgs.builder
      builder.connectorsPlatformConfig(args(argsBuilder).build)

    /**
     * @param integrationConfig Configuration for the Integration add-on.
     *  Structure is documented below.
     * @return builder
     */
    def integrationConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigIntegrationConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigIntegrationConfigArgs.builder
      builder.integrationConfig(args(argsBuilder).build)

    /**
     * @param monetizationConfig Configuration for the Monetization add-on.
     *  Structure is documented below.
     * @return builder
     */
    def monetizationConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigMonetizationConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigMonetizationConfigArgs.builder
      builder.monetizationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.SharedflowState.Builder)
    /**
     * @param metaDatas Metadata describing the shared flow.
     *  Structure is documented below.
     * @return builder
     */
    def metaDatas(args: Endofunction[com.pulumi.gcp.apigee.inputs.SharedflowMetaDataArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SharedflowState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SharedflowMetaDataArgs.builder
      builder.metaDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder)
    /**
     * @param properties List of all properties in the object.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesPropertyArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder)
    /**
     * @param headerIndexAlgorithm Resolves the client ip based on a custom header.
     *  Structure is documented below.
     * @return builder
     */
    def headerIndexAlgorithm(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigHeaderIndexAlgorithmArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigHeaderIndexAlgorithmArgs.builder
      builder.headerIndexAlgorithm(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityProfileV2State.Builder)
    /**
     * @param profileAssessmentConfigs A map of the assessment name and the assessment config.
     *  Structure is documented below.
     * @return builder
     */
    def profileAssessmentConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SecurityProfileV2State.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityProfileV2ProfileAssessmentConfigArgs.builder
      builder.profileAssessmentConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder)
    /**
     * @param certsInfos Chain of certificates under this alias.
     *  Structure is documented below.
     * @return builder
     */
    def certsInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.builder
      builder.certsInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param subject Subject details.
     *  Structure is documented below.
     * @return builder
     */
    def subject(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectArgs.builder
      builder.subject(args(argsBuilder).build)

    /**
     * @param subjectAlternativeDnsNames List of alternative host names. Maximum length is 255 characters for each value.
     *  Structure is documented below.
     * @return builder
     */
    def subjectAlternativeDnsNames(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertSubjectAlternativeDnsNamesArgs.builder
      builder.subjectAlternativeDnsNames(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12State.Builder)
    /**
     * @param certsInfos Chain of certificates under this alias.
     *  Structure is documented below.
     * @return builder
     */
    def certsInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12State.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.builder
      builder.certsInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionState.Builder)
    /**
     * @param includeAllResources A nested object resource.
     * @return builder
     */
    def includeAllResources(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityMonitoringConditionIncludeAllResourcesArgs.builder
      builder.includeAllResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder)
    /**
     * @param headers A list of HTTP headers to be sent to the target in case of a FLAG SecurityAction.
     *  Limit 5 headers per SecurityAction.
     *  At least one is mandatory.
     *  Structure is documented below.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionFlagHeaderArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionFlagHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.OrganizationState.Builder)
    /**
     * @param properties Properties defined in the Apigee organization profile.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.OrganizationState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder)
    /**
     * @param clientIpResolutionConfig The algorithm to resolve IP. This will affect Analytics, API Security, and other features that use the client ip. To remove a client ip resolution config, update the field to an empty value. Example: &#39;{ &#34;clientIpResolutionConfig&#34; = {} }&#39; For more information, see: https://cloud.google.com/apigee/docs/api-platform/system-administration/client-ip-resolution
     *  Structure is documented below.
     * @return builder
     */
    def clientIpResolutionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentClientIpResolutionConfigArgs.builder
      builder.clientIpResolutionConfig(args(argsBuilder).build)

    /**
     * @param nodeConfig NodeConfig for setting the min/max number of nodes associated with the environment.
     *  Structure is documented below.
     * @return builder
     */
    def nodeConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentNodeConfigArgs.builder
      builder.nodeConfig(args(argsBuilder).build)

    /**
     * @param properties Key-value pairs that may be used for customizing the environment.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.EnvironmentState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.EnvironmentPropertiesArgs.builder
      builder.properties(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder)
    /**
     * @param operationConfigs List of graphQL operation configuration details associated with Apigee API proxies or remote services. Remote services are non-Apigee proxies, such as Istio-Envoy.
     *  Structure is documented below.
     * @return builder
     */
    def operationConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.builder
      builder.operationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder)
    /**
     * @param apiProducts List of API products associated with the developer app.
     * @return builder
     */
    def apiProducts(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialApiProductArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialApiProductArgs.builder
      builder.apiProducts(args.map(_(argsBuilder).build)*)

    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder)
    /**
     * @param attributes Custom attributes associated with the operation.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     *  Structure is documented below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigQuotaArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.Builder)
    /**
     * @param certInfos (Output)
     *  List of all properties in the object.
     *  Structure is documented below.
     * @return builder
     */
    def certInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoCertInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesPkcs12CertsInfoCertInfoArgs.builder
      builder.certInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.AddonsConfigState.Builder)
    /**
     * @param addonsConfig Addon configurations of the Apigee organization.
     *  Structure is documented below.
     * @return builder
     */
    def addonsConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.AddonsConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.AddonsConfigAddonsConfigArgs.builder
      builder.addonsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.DeveloperState.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder)
    /**
     * @param allow Allow a request through if it matches this SecurityAction.
     * @return builder
     */
    def allow(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionAllowArgs.builder
      builder.allow(args(argsBuilder).build)

    /**
     * @param conditionConfig A valid SecurityAction must contain at least one condition.
     *  Structure is documented below.
     * @return builder
     */
    def conditionConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionConditionConfigArgs.builder
      builder.conditionConfig(args(argsBuilder).build)

    /**
     * @param deny Deny a request through if it matches this SecurityAction.
     *  Structure is documented below.
     * @return builder
     */
    def deny(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionDenyArgs.builder
      builder.deny(args(argsBuilder).build)

    /**
     * @param flag Flag a request through if it matches this SecurityAction.
     *  Structure is documented below.
     * @return builder
     */
    def flag(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.SecurityActionState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityActionFlagArgs.builder
      builder.flag(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiState.Builder)
    /**
     * @param metaDatas Metadata describing the API proxy.
     *  Structure is documented below.
     * @return builder
     */
    def metaDatas(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiMetaDataArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiMetaDataArgs.builder
      builder.metaDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder)
    /**
     * @param attributes Custom attributes associated with the operation.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param operations Required. List of GraphQL name/operation type pairs for the proxy or remote service to which quota will be applied. If only operation types are specified, the quota will be applied to all GraphQL requests irrespective of the GraphQL name.
     *  Note: Currently, you can specify only a single GraphQLOperation. Specifying more than one will cause the operation to fail.
     *  Structure is documented below.
     * @return builder
     */
    def operations(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigOperationArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigOperationArgs.builder
      builder.operations(args.map(_(argsBuilder).build)*)

    /**
     * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     *  Structure is documented below.
     * @return builder
     */
    def quota(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigQuotaArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupOperationConfigQuotaArgs.builder
      builder.quota(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileState.Builder)
    /**
     * @param certsInfos Chain of certificates under this alias.
     *  Structure is documented below.
     * @return builder
     */
    def certsInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileCertsInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileCertsInfoArgs.builder
      builder.certsInfos(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesKeyCertFileTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.SecurityFeedbackState.Builder)
    /**
     * @param feedbackContexts One or more attribute/value pairs for constraining the feedback.
     *  Structure is documented below.
     * @return builder
     */
    def feedbackContexts(args: Endofunction[com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.SecurityFeedbackState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.SecurityFeedbackFeedbackContextArgs.builder
      builder.feedbackContexts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder)
    /**
     * @param properties List of all properties in the object.
     *  Structure is documented below.
     * @return builder
     */
    def properties(args: Endofunction[com.pulumi.gcp.apigee.inputs.OrganizationPropertiesPropertyArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.OrganizationPropertiesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.OrganizationPropertiesPropertyArgs.builder
      builder.properties(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.AppGroupState.Builder)
    /**
     * @param attributes A list of attributes
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.AppGroupState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.AppGroupAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.Builder)
    /**
     * @param certInfos (Output)
     *  List of all properties in the object.
     *  Structure is documented below.
     * @return builder
     */
    def certInfos(args: Endofunction[com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.KeystoresAliasesSelfSignedCertCertsInfoCertInfoArgs.builder
      builder.certInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductState.Builder)
    /**
     * @param attributes Array of attributes that may be used to extend the default API product profile with customer-specific metadata. You can specify a maximum of 18 attributes.
     *  Use this property to specify the access level of the API product as either public, private, or internal.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param graphqlOperationGroup Configuration used to group Apigee proxies or remote services with graphQL operation name, graphQL operation type and quotas. This grouping allows us to precisely set quota for a particular combination of graphQL name and operation type for a particular proxy request. If graphQL name is not set, this would imply quota will be applied on all graphQL requests matching the operation type.
     *  Structure is documented below.
     * @return builder
     */
    def graphqlOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGraphqlOperationGroupArgs.builder
      builder.graphqlOperationGroup(args(argsBuilder).build)

    /**
     * @param grpcOperationGroup Optional. Configuration used to group Apigee proxies with gRPC services and method names. This grouping allows us to set quota for a particular proxy with the gRPC service name and method. If a method name is not set, this implies quota and authorization are applied to all gRPC methods implemented by that proxy for that particular gRPC service.
     *  Structure is documented below.
     * @return builder
     */
    def grpcOperationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.builder
      builder.grpcOperationGroup(args(argsBuilder).build)

    /**
     * @param operationGroup Configuration used to group Apigee proxies or remote services with resources, method types, and quotas. The resource refers to the resource URI (excluding the base path). With this grouping, the API product creator is able to fine-tune and give precise control over which REST methods have access to specific resources and how many calls can be made (using the quota setting).
     *  Note: The apiResources setting cannot be specified for both the API product and operation group; otherwise the call will fail.
     *  Structure is documented below.
     * @return builder
     */
    def operationGroup(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.ApiProductState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductOperationGroupArgs.builder
      builder.operationGroup(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.DeveloperAppState.Builder)
    /**
     * @param attributes Developer attributes (name/value pairs). The custom attribute limit is 18.
     *  Structure is documented below.
     * @return builder
     */
    def attributes(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppAttributeArgs.builder
      builder.attributes(args.map(_(argsBuilder).build)*)

    /**
     * @param credentials Output only. Set of credentials for the developer app consisting of
     *  the consumer key/secret pairs associated with the API products.
     *  Structure is documented below.
     * @return builder
     */
    def credentials(args: Endofunction[com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.DeveloperAppState.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.DeveloperAppCredentialArgs.builder
      builder.credentials(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder)
    /**
     * @param operationConfigs Required. List of operation configurations for either Apigee API proxies that are associated with this API product.
     *  Structure is documented below.
     * @return builder
     */
    def operationConfigs(args: Endofunction[com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.Builder]*):
        com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigee.inputs.ApiProductGrpcOperationGroupOperationConfigArgs.builder
      builder.operationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigee.inputs.DnsZoneState.Builder)
    /**
     * @param peeringConfig Peering zone config
     *  Structure is documented below.
     * @return builder
     */
    def peeringConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.DnsZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.DnsZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigee.inputs.InstanceState.Builder)
    /**
     * @param accessLoggingConfig Access logging configuration enables the access logging feature at the instance.
     *  Apigee customers can enable access logging to ship the access logs to their own project&#39;s cloud logging.
     *  Structure is documented below.
     * @return builder
     */
    def accessLoggingConfig(args: Endofunction[com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.Builder]):
        com.pulumi.gcp.apigee.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.apigee.inputs.InstanceAccessLoggingConfigArgs.builder
      builder.accessLoggingConfig(args(argsBuilder).build)

  /**
   * An `ApiProduct` in Apigee.
   * 
   *  To get more information about ApiProduct, see:
   * 
   *  * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.apiproducts#ApiProduct)
   *  * How-to Guides
   *      * [Creating an API product](https://cloud.google.com/apigee/docs/api-platform/publish/what-api-product)
   */
  def ApiProduct(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigee.ApiProductArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.apigee.ApiProductArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.apigee.ApiProduct(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
