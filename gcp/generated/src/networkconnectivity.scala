package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object networkconnectivity:
  extension (builder: com.pulumi.gcp.networkconnectivity.GroupArgs.Builder)
    /**
     * @param autoAccept Optional. The auto-accept setting for this group.
     *  Structure is documented below.
     * @return builder
     */
    def autoAccept(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.GroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.builder
      builder.autoAccept(args(argsBuilder).build)

  object NetworkconnectivityFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for hub */
    inline def getHubIamPolicy(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.networkconnectivity.outputs.GetHubIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyArgs.builder
      com.pulumi.gcp.networkconnectivity.NetworkconnectivityFunctions.getHubIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for hub */
    inline def getHubIamPolicyPlain(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networkconnectivity.outputs.GetHubIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyPlainArgs.builder
      com.pulumi.gcp.networkconnectivity.NetworkconnectivityFunctions.getHubIamPolicyPlain(args(argsBuilder).build)

  /**
   * The NetworkConnectivity Spoke resource
   * 
   *  To get more information about Spoke, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.spokes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/overview)
   */
  def Spoke(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.SpokeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Spoke(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The internal range resource for IPAM operations within a VPC network. Used to represent a private address range along with behavioral characterstics of that range (its usage and peering behavior). Networking resources can link to this range if they are created as belonging to it.
   * 
   *  To get more information about InternalRange, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.internalRanges)
   *  * How-to Guides
   *      * [Use internal ranges](https://cloud.google.com/vpc/docs/create-use-internal-ranges)
   */
  def InternalRange(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.InternalRangeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.InternalRange(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Policy-based Routes are more powerful routes that route L4 network traffic based on not just destination IP, but also source IP, protocol and more. A Policy-based Route always take precedence when it conflicts with other types of routes.
   * 
   *  To get more information about PolicyBasedRoute, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.global.policyBasedRoutes)
   *  * How-to Guides
   *      * [Use policy-based routes](https://cloud.google.com/vpc/docs/use-policy-based-routes#api)
   */
  def PolicyBasedRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.PolicyBasedRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The NetworkConnectivity Group resource
   * 
   *  To get more information about Group, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1beta/projects.locations.global.hubs.groups)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/overview)
   */
  def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.GroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.GroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Group(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The NetworkConnectivity Hub resource
   * 
   *  To get more information about Hub, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1beta/projects.locations.global.hubs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/overview)
   */
  def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.HubArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Hub(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.Builder)
    /**
     * @param services Maps services to their current or planned states. Service names are keys,
     *  and the associated values describe the state of the service.
     *  Structure is documented below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.Builder)
    /**
     * @param pscConfig Configuration used for Private Service Connect connections. Used when Infrastructure is PSC.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

  /**
   * The Transport resource is a top-level resource used by customers to control Partner Cross-Cloud Interconnect (CCI) connections.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Transport, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1beta/projects.locations.transport)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/beta/network-connectivity/transports)
   */
  def Transport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.TransportArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.TransportArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Transport(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &#39;Manage Multicloud Data Transfer Destinations&#39;
   * 
   *  To get more information about Destination, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.multicloudDataTransferConfigs.destinations)
   *  * How-to Guides
   *      * [QUICKSTART_TITLE](https://docs.cloud.google.com/data-transfer-essentials/docs/create-resources)
   */
  def Destination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.DestinationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.DestinationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Destination(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.DestinationArgs.Builder)
    /**
     * @param endpoints The list of DestinationEndpoint resources configured for the IP prefix.
     *  Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.DestinationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder)
    /**
     * @param filter The filter to match L4 traffic.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param interconnectAttachment The interconnect attachments that this policy-based route applies to.
     *  Structure is documented below.
     * @return builder
     */
    def interconnectAttachment(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.builder
      builder.interconnectAttachment(args(argsBuilder).build)

    /**
     * @param virtualMachine VM instances to which this policy-based route applies to.
     *  Structure is documented below.
     * @return builder
     */
    def virtualMachine(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.builder
      builder.virtualMachine(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   *  * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved.
   *  * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networkconnectivity.HubIamPolicy
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
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
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
   *                  .role("roles/networkconnectivity.hubViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
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
   *          var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMember;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
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
   *          var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Network Connectivity Hub
   * 
   *  Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   *  * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved.
   *  * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networkconnectivity.HubIamPolicy
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
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
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
   *                  .role("roles/networkconnectivity.hubViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
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
   *          var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMember;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
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
   *          var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
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
   *  * projects/{{project}}/locations/global/hubs/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Network Connectivity hub IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_network_connectivity_hub_iam_member.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_network_connectivity_hub_iam_binding.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:networkconnectivity/hubIamPolicy:HubIamPolicy editor projects/{{project}}/locations/global/hubs/{{hub}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HubIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs.builder
    com.pulumi.gcp.networkconnectivity.HubIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &#39;Manage Multicloud Data Transfer Configs&#39;
   * 
   *  To get more information about MulticloudDataTransferConfig, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.multicloudDataTransferConfigs)
   *  * How-to Guides
   *      * [QUICKSTART_TITLE](https://docs.cloud.google.com/data-transfer-essentials/docs/create-resources)
   */
  def MulticloudDataTransferConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Regional Private Service Connect (PSC) endpoint resource.
   * 
   *  To get more information about RegionalEndpoint, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.regionalEndpoints)
   *  * How-to Guides
   *      * [Access regional Google APIs through endpoints](https://cloud.google.com/vpc/docs/access-regional-google-apis-endpoints)
   */
  def RegionalEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.RegionalEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.RegionalEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.RegionalEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder)
    /**
     * @param gateway (Optional, Beta)
     *  This is a gateway that can apply specialized processing to traffic going through it.
     *  Structure is documented below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param linkedInterconnectAttachments A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     *  Structure is documented below.
     * @return builder
     */
    def linkedInterconnectAttachments(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.builder
      builder.linkedInterconnectAttachments(args(argsBuilder).build)

    /**
     * @param linkedProducerVpcNetwork Producer VPC network that is associated with the spoke.
     *  Structure is documented below.
     * @return builder
     */
    def linkedProducerVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.builder
      builder.linkedProducerVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
     *  Structure is documented below.
     * @return builder
     */
    def linkedRouterApplianceInstances(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.builder
      builder.linkedRouterApplianceInstances(args(argsBuilder).build)

    /**
     * @param linkedVpcNetwork VPC network that is associated with the spoke.
     *  Structure is documented below.
     * @return builder
     */
    def linkedVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.builder
      builder.linkedVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
     *  Structure is documented below.
     * @return builder
     */
    def linkedVpnTunnels(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.builder
      builder.linkedVpnTunnels(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A gateway advertised route is a route that a gateway spoke advertises somewhere.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about GatewayAdvertisedRoute, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1beta/projects.locations.spokes.gatewayAdvertisedRoutes)
   *  * How-to Guides
   *      * [QUICKSTART_TITLE](https://docs.cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/ncc-gateway-overview)
   */
  def GatewayAdvertisedRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.GatewayAdvertisedRouteArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.GatewayAdvertisedRouteArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.GatewayAdvertisedRoute(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder)
    /**
     * @param allocationOptions Options for automatically allocating a free range with a size given by prefixLength.
     *  Structure is documented below.
     * @return builder
     */
    def allocationOptions(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.builder
      builder.allocationOptions(args(argsBuilder).build)

    /**
     * @param migration Specification for migration with source and target resource names.
     *  Structure is documented below.
     * @return builder
     */
    def migration(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.builder
      builder.migration(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   *  * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved.
   *  * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networkconnectivity.HubIamPolicy
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
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
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
   *                  .role("roles/networkconnectivity.hubViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
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
   *          var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMember;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
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
   *          var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Network Connectivity Hub
   * 
   *  Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   *  * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved.
   *  * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networkconnectivity.HubIamPolicy
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
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
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
   *                  .role("roles/networkconnectivity.hubViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
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
   *          var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMember;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
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
   *          var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
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
   *  * projects/{{project}}/locations/global/hubs/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Network Connectivity hub IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_network_connectivity_hub_iam_member.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_network_connectivity_hub_iam_binding.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:networkconnectivity/hubIamMember:HubIamMember editor projects/{{project}}/locations/global/hubs/{{hub}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HubIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.builder
    com.pulumi.gcp.networkconnectivity.HubIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manage Service Connection Policies.
   * 
   *  To get more information about ServiceConnectionPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.serviceConnectionPolicies)
   *  * How-to Guides
   *      * [About Service Connection Policies](https://cloud.google.com/vpc/docs/about-service-connection-policies#service-policies)
   *      * [About Service Connectivity Automation](https://cloud.google.com/vpc/docs/about-service-connectivity-automation)
   */
  def ServiceConnectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   *  * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved.
   *  * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networkconnectivity.HubIamPolicy
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
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
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
   *                  .role("roles/networkconnectivity.hubViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
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
   *          var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMember;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
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
   *          var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Network Connectivity Hub
   * 
   *  Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   *  * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved.
   *  * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.networkconnectivity.HubIamPolicy
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
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   *  import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
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
   *                  .role("roles/networkconnectivity.hubViewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   *  import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
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
   *          var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.networkconnectivity.HubIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMember;
   *  import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
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
   *          var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *              .project(primary.project())
   *              .hub(primary.name())
   *              .role("roles/networkconnectivity.hubViewer")
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
   *  * projects/{{project}}/locations/global/hubs/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Network Connectivity hub IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_network_connectivity_hub_iam_member.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_network_connectivity_hub_iam_binding.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:networkconnectivity/hubIamBinding:HubIamBinding editor projects/{{project}}/locations/global/hubs/{{hub}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HubIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.builder
    com.pulumi.gcp.networkconnectivity.HubIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigState.Builder)
    /**
     * @param services Maps services to their current or planned states. Service names are keys,
     *  and the associated values describe the state of the service.
     *  Structure is documented below.
     * @return builder
     */
    def services(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.builder
      builder.services(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.GroupState.Builder)
    /**
     * @param autoAccept Optional. The auto-accept setting for this group.
     *  Structure is documented below.
     * @return builder
     */
    def autoAccept(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.GroupState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GroupAutoAcceptArgs.builder
      builder.autoAccept(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder)
    /**
     * @param ipRangeReservations A list of IP ranges that are reserved for this gateway&#39;s internal infrastructure.
     *  Structure is documented below.
     * @return builder
     */
    def ipRangeReservations(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayIpRangeReservationArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayIpRangeReservationArgs.builder
      builder.ipRangeReservations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.InternalRangeState.Builder)
    /**
     * @param allocationOptions Options for automatically allocating a free range with a size given by prefixLength.
     *  Structure is documented below.
     * @return builder
     */
    def allocationOptions(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.InternalRangeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeAllocationOptionsArgs.builder
      builder.allocationOptions(args(argsBuilder).build)

    /**
     * @param migration Specification for migration with source and target resource names.
     *  Structure is documented below.
     * @return builder
     */
    def migration(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.InternalRangeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.InternalRangeMigrationArgs.builder
      builder.migration(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyState.Builder)
    /**
     * @param pscConfig Configuration used for Private Service Connect connections. Used when Infrastructure is PSC.
     *  Structure is documented below.
     * @return builder
     */
    def pscConfig(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConfigArgs.builder
      builder.pscConfig(args(argsBuilder).build)

    /**
     * @param pscConnections Information about each Private Service Connect connection.
     *  Structure is documented below.
     * @return builder
     */
    def pscConnections(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.builder
      builder.pscConnections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder)
    /**
     * @param states (Output)
     *  The state and activation time details for the service.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedServicesStates&#34;&gt;&lt;/a&gt;The `states` block contains:
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceStateArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.MulticloudDataTransferConfigServiceStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder)
    /**
     * @param gateway (Optional, Beta)
     *  This is a gateway that can apply specialized processing to traffic going through it.
     *  Structure is documented below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

    /**
     * @param linkedInterconnectAttachments A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
     *  Structure is documented below.
     * @return builder
     */
    def linkedInterconnectAttachments(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedInterconnectAttachmentsArgs.builder
      builder.linkedInterconnectAttachments(args(argsBuilder).build)

    /**
     * @param linkedProducerVpcNetwork Producer VPC network that is associated with the spoke.
     *  Structure is documented below.
     * @return builder
     */
    def linkedProducerVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedProducerVpcNetworkArgs.builder
      builder.linkedProducerVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedRouterApplianceInstances The URIs of linked Router appliance resources
     *  Structure is documented below.
     * @return builder
     */
    def linkedRouterApplianceInstances(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.builder
      builder.linkedRouterApplianceInstances(args(argsBuilder).build)

    /**
     * @param linkedVpcNetwork VPC network that is associated with the spoke.
     *  Structure is documented below.
     * @return builder
     */
    def linkedVpcNetwork(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpcNetworkArgs.builder
      builder.linkedVpcNetwork(args(argsBuilder).build)

    /**
     * @param linkedVpnTunnels The URIs of linked VPN tunnel resources
     *  Structure is documented below.
     * @return builder
     */
    def linkedVpnTunnels(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedVpnTunnelsArgs.builder
      builder.linkedVpnTunnels(args(argsBuilder).build)

    /**
     * @param reasons The reasons for the current state in the lifecycle
     *  Structure is documented below.
     * @return builder
     */
    def reasons(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeReasonArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeReasonArgs.builder
      builder.reasons(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder)
    /**
     * @param instances The list of router appliance instances
     *  Structure is documented below.
     * @return builder
     */
    def instances(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesInstanceArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.SpokeLinkedRouterApplianceInstancesInstanceArgs.builder
      builder.instances(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder)
    /**
     * @param filter The filter to match L4 traffic.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param interconnectAttachment The interconnect attachments that this policy-based route applies to.
     *  Structure is documented below.
     * @return builder
     */
    def interconnectAttachment(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteInterconnectAttachmentArgs.builder
      builder.interconnectAttachment(args(argsBuilder).build)

    /**
     * @param virtualMachine VM instances to which this policy-based route applies to.
     *  Structure is documented below.
     * @return builder
     */
    def virtualMachine(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteVirtualMachineArgs.builder
      builder.virtualMachine(args(argsBuilder).build)

    /**
     * @param warnings If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     *  Structure is documented below.
     * @return builder
     */
    def warnings(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteWarningArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.PolicyBasedRouteWarningArgs.builder
      builder.warnings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder)
    /**
     * @param error The most recent error during operating this connection.
     *  Structure is documented below.
     * @return builder
     */
    def error(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorArgs.builder
      builder.error(args(argsBuilder).build)

    /**
     * @param errorInfo The error info for the latest error during operating this connection.
     *  Structure is documented below.
     * @return builder
     */
    def errorInfo(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorInfoArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.ServiceConnectionPolicyPscConnectionErrorInfoArgs.builder
      builder.errorInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.DestinationState.Builder)
    /**
     * @param endpoints The list of DestinationEndpoint resources configured for the IP prefix.
     *  Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.DestinationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param stateTimelines The timeline of the expected `Destination` states or the current rest
     *  state. If a state change is expected, the value is `ADDING`,
     *  `DELETING` or `SUSPENDING`, depending on the action specified.
     *  Structure is documented below.
     * @return builder
     */
    def stateTimelines(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.DestinationState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.builder
      builder.stateTimelines(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.HubState.Builder)
    /**
     * @param routingVpcs The VPC network associated with this hub&#39;s spokes. All of the VPN tunnels, VLAN attachments, and router appliance instances referenced by this hub&#39;s spokes must belong to this VPC network. This field is read-only. Network Connectivity Center automatically populates it based on the set of spokes attached to the hub.
     *  Structure is documented below.
     * @return builder
     */
    def routingVpcs(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubRoutingVpcArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.HubState.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubRoutingVpcArgs.builder
      builder.routingVpcs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.Builder)
    /**
     * @param states (Output)
     *  The state and activation time details of the resource state.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineStateArgs.Builder]*):
        com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineArgs.Builder =
      def argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.DestinationStateTimelineStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.HubIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
