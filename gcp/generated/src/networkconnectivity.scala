package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object networkconnectivity:
  /**
   * &#39;Manage Multicloud Data Transfer Destinations&#39;
   * 
   * To get more information about Destination, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.multicloudDataTransferConfigs.destinations)
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://docs.cloud.google.com/data-transfer-essentials/docs/create-resources)
   */
  inline def Destination(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.DestinationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.DestinationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Destination(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A gateway advertised route is a route that a gateway spoke advertises somewhere.
   * 
   * To get more information about GatewayAdvertisedRoute, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.spokes.gatewayAdvertisedRoutes)
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://docs.cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/ncc-gateway-overview)
   */
  inline def GatewayAdvertisedRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.GatewayAdvertisedRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.GatewayAdvertisedRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.GatewayAdvertisedRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The NetworkConnectivity Group resource
   * 
   * To get more information about Group, see:
   * 
   * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1beta/projects.locations.global.hubs.groups)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/overview)
   */
  inline def Group(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.GroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.GroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Group(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The NetworkConnectivity Hub resource
   * 
   * To get more information about Hub, see:
   * 
   * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1beta/projects.locations.global.hubs)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/overview)
   */
  inline def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.HubArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Hub(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   * * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networkconnectivity.HubIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/networkconnectivity.hubViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   * import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamMember;
   * import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for Network Connectivity Hub
   * 
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   * * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networkconnectivity.HubIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/networkconnectivity.hubViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   * import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamMember;
   * import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/hubs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Network Connectivity hub IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_network_connectivity_hub_iam_member.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_network_connectivity_hub_iam_binding.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:networkconnectivity/hubIamBinding:HubIamBinding editor projects/{{project}}/locations/global/hubs/{{hub}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HubIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkconnectivity.HubIamBindingArgs.builder
    com.pulumi.gcp.networkconnectivity.HubIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   * * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networkconnectivity.HubIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/networkconnectivity.hubViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   * import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamMember;
   * import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for Network Connectivity Hub
   * 
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   * * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networkconnectivity.HubIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/networkconnectivity.hubViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   * import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamMember;
   * import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/hubs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Network Connectivity hub IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_network_connectivity_hub_iam_member.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_network_connectivity_hub_iam_binding.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:networkconnectivity/hubIamMember:HubIamMember editor projects/{{project}}/locations/global/hubs/{{hub}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HubIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkconnectivity.HubIamMemberArgs.builder
    com.pulumi.gcp.networkconnectivity.HubIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   * * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networkconnectivity.HubIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/networkconnectivity.hubViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   * import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamMember;
   * import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## This resource supports User Project Overrides.
   * 
   * -
   * 
   * # IAM policy for Network Connectivity Hub
   * 
   * Three different resources help you manage your IAM policy for Network Connectivity Hub. Each of these resources serves a different use case:
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Authoritative. Sets the IAM policy for the hub and replaces any existing policy already attached.
   * * `gcp.networkconnectivity.HubIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hub are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.networkconnectivity.HubIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hub are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.networkconnectivity.HubIamPolicy`: Retrieves the IAM policy for the hub
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamPolicy` **cannot** be used in conjunction with `gcp.networkconnectivity.HubIamBinding` and `gcp.networkconnectivity.HubIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.networkconnectivity.HubIamBinding` resources **can be** used in conjunction with `gcp.networkconnectivity.HubIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.networkconnectivity.HubIamPolicy
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.organizations.OrganizationsFunctions;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingArgs;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicy;
   * import com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/networkconnectivity.hubViewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HubIamPolicy("policy", HubIamPolicyArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamBinding;
   * import com.pulumi.gcp.networkconnectivity.HubIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new HubIamBinding("binding", HubIamBindingArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.networkconnectivity.HubIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.networkconnectivity.HubIamMember;
   * import com.pulumi.gcp.networkconnectivity.HubIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new HubIamMember("member", HubIamMemberArgs.builder()
   *             .project(primary.get("project"))
   *             .hub(primary.get("name"))
   *             .role("roles/networkconnectivity.hubViewer")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## Import
   * 
   * For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   * * projects/{{project}}/locations/global/hubs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Network Connectivity hub IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_network_connectivity_hub_iam_member.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_network_connectivity_hub_iam_binding.editor &#34;projects/{{project}}/locations/global/hubs/{{hub}} roles/networkconnectivity.hubViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:networkconnectivity/hubIamPolicy:HubIamPolicy editor projects/{{project}}/locations/global/hubs/{{hub}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HubIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.networkconnectivity.HubIamPolicyArgs.builder
    com.pulumi.gcp.networkconnectivity.HubIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The internal range resource for IPAM operations within a VPC network. Used to represent a private address range along with behavioral characterstics of that range (its usage and peering behavior). Networking resources can link to this range if they are created as belonging to it.
   * 
   * To get more information about InternalRange, see:
   * 
   * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.internalRanges)
   * * How-to Guides
   *     * [Use internal ranges](https://cloud.google.com/vpc/docs/create-use-internal-ranges)
   */
  inline def InternalRange(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.InternalRangeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.InternalRangeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.InternalRange(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &#39;Manage Multicloud Data Transfer Configs&#39;
   * 
   * To get more information about MulticloudDataTransferConfig, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.multicloudDataTransferConfigs)
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://docs.cloud.google.com/data-transfer-essentials/docs/create-resources)
   */
  inline def MulticloudDataTransferConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.MulticloudDataTransferConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object NetworkconnectivityFunctions:
    /** Retrieves the current IAM policy data for hub */
    inline def getHubIamPolicy(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.networkconnectivity.outputs.GetHubIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyArgs.builder
      com.pulumi.gcp.networkconnectivity.NetworkconnectivityFunctions.getHubIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for hub */
    inline def getHubIamPolicyPlain(args: Endofunction[com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.networkconnectivity.outputs.GetHubIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.networkconnectivity.inputs.GetHubIamPolicyPlainArgs.builder
      com.pulumi.gcp.networkconnectivity.NetworkconnectivityFunctions.getHubIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Policy-based Routes are more powerful routes that route L4 network traffic based on not just destination IP, but also source IP, protocol and more. A Policy-based Route always take precedence when it conflicts with other types of routes.
   * 
   * To get more information about PolicyBasedRoute, see:
   * 
   * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.global.policyBasedRoutes)
   * * How-to Guides
   *     * [Use policy-based routes](https://cloud.google.com/vpc/docs/use-policy-based-routes#api)
   */
  inline def PolicyBasedRoute(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.PolicyBasedRouteArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.PolicyBasedRoute(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Regional Private Service Connect (PSC) endpoint resource.
   * 
   * To get more information about RegionalEndpoint, see:
   * 
   * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.regionalEndpoints)
   * * How-to Guides
   *     * [Access regional Google APIs through endpoints](https://cloud.google.com/vpc/docs/access-regional-google-apis-endpoints)
   */
  inline def RegionalEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.RegionalEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.RegionalEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.RegionalEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manage Service Connection Policies.
   * 
   * To get more information about ServiceConnectionPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.serviceConnectionPolicies)
   * * How-to Guides
   *     * [About Service Connection Policies](https://cloud.google.com/vpc/docs/about-service-connection-policies#service-policies)
   *     * [About Service Connectivity Automation](https://cloud.google.com/vpc/docs/about-service-connectivity-automation)
   */
  inline def ServiceConnectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.ServiceConnectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The NetworkConnectivity Spoke resource
   * 
   * To get more information about Spoke, see:
   * 
   * * [API documentation](https://cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.spokes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/network-connectivity/docs/network-connectivity-center/concepts/overview)
   */
  inline def Spoke(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.SpokeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.SpokeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Spoke(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Transport resource is a top-level resource used by customers to control Partner Cross-Cloud Interconnect (CCI) connections.
   * 
   * To get more information about Transport, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/network-connectivity/docs/reference/networkconnectivity/rest/v1/projects.locations.transports)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/network-connectivity/transports)
   */
  inline def Transport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.networkconnectivity.TransportArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.networkconnectivity.TransportArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.networkconnectivity.Transport(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
