package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object beyondcorp:
  /**
   * A BeyondCorp AppConnector resource represents an application facing component deployed proximal to
   *  and with direct access to the application instances. It is used to establish connectivity between the
   *  remote enterprise environment and GCP. It initiates connections to the applications and can proxy the
   *  data from users over the connection.
   * 
   *  To get more information about AppConnector, see:
   * 
   *  * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnectors)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)
   */
  def AppConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.AppConnectorArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.beyondcorp.AppConnectorArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.beyondcorp.AppConnector(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.AppConnectionArgs.Builder)
    /**
     * @param applicationEndpoint Address of the remote application endpoint for the BeyondCorp AppConnection.
     *  Structure is documented below.
     * @return builder
     */
    def applicationEndpoint(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppConnectionApplicationEndpointArgs.Builder]):
        com.pulumi.gcp.beyondcorp.AppConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppConnectionApplicationEndpointArgs.builder
      builder.applicationEndpoint(args(argsBuilder).build)

    /**
     * @param gateway Gateway used by the AppConnection.
     *  Structure is documented below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppConnectionGatewayArgs.Builder]):
        com.pulumi.gcp.beyondcorp.AppConnectionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppConnectionGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder)
    /**
     * @param endpointMatchers Required. Endpoint matchers associated with an application.
     *  A combination of hostname and ports as endpoint matcher is used to match
     *  the application.
     *  Match conditions for OR logic.
     *  An array of match conditions to allow for multiple matching criteria.
     *  The rule is considered a match if one the conditions are met.
     *  The conditions can be one of the following combination
     *  (Hostname), (Hostname &amp; Ports)
     *  EXAMPLES:
     *  Hostname - (&#34;*.abc.com&#34;), (&#34;xyz.abc.com&#34;)
     *  Hostname and Ports - (&#34;abc.com&#34; and &#34;22&#34;), (&#34;abc.com&#34; and &#34;22,33&#34;) etc
     *  Structure is documented below.
     * @return builder
     */
    def endpointMatchers(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.builder
      builder.endpointMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param upstreams Optional. List of which upstream resource(s) to forward traffic to.
     *  Structure is documented below.
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.builder
      builder.upstreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.AppConnectorArgs.Builder)
    /**
     * @param principalInfo Principal information about the Identity of the AppConnector.
     *  Structure is documented below.
     * @return builder
     */
    def principalInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.AppConnectorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs.builder
      builder.principalInfo(args(argsBuilder).build)

  /**
   * A BeyondCorp AppConnection resource represents a BeyondCorp protected AppConnection to a remote application.
   *  It creates all the necessary GCP components needed for creating a BeyondCorp protected AppConnection.
   *  Multiple connectors can be authorised for a single AppConnection.
   * 
   *  To get more information about AppConnection, see:
   * 
   *  * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appconnections)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)
   */
  def AppConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.AppConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.beyondcorp.AppConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.beyondcorp.AppConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  # IAM policy for BeyondCorp SecurityGatewayApplication
   * 
   *  Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  * projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   *  * {{project}}/{{security_gateway_id}}/{{application_id}}
   *  * {{security_gateway_id}}/{{application_id}}
   *  * {{application_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BeyondCorp securitygatewayapplication IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_application_iam_member.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_application_iam_binding.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:beyondcorp/securityGatewayApplicationIamBinding:SecurityGatewayApplicationIamBinding editor projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecurityGatewayApplicationIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygateway are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  # IAM policy for BeyondCorp SecurityGateway
   * 
   *  Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygateway are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  * projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   *  * {{project}}/{{location}}/{{security_gateway_id}}
   *  * {{location}}/{{security_gateway_id}}
   *  * {{security_gateway_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BeyondCorp securitygateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:beyondcorp/securityGatewayIamMember:SecurityGatewayIamMember editor projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecurityGatewayIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Deployment of Security Gateway. */
  def SecurityGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygateway are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  # IAM policy for BeyondCorp SecurityGateway
   * 
   *  Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygateway are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  * projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   *  * {{project}}/{{location}}/{{security_gateway_id}}
   *  * {{location}}/{{security_gateway_id}}
   *  * {{security_gateway_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BeyondCorp securitygateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:beyondcorp/securityGatewayIamBinding:SecurityGatewayIamBinding editor projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecurityGatewayIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  # IAM policy for BeyondCorp SecurityGatewayApplication
   * 
   *  Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  * projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   *  * {{project}}/{{security_gateway_id}}/{{application_id}}
   *  * {{security_gateway_id}}/{{application_id}}
   *  * {{application_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BeyondCorp securitygatewayapplication IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_application_iam_member.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_application_iam_binding.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:beyondcorp/securityGatewayApplicationIamPolicy:SecurityGatewayApplicationIamPolicy editor projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecurityGatewayApplicationIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Specifies application endpoint(s) to protect behind a Security Gateway. */
  def SecurityGatewayApplication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A BeyondCorp AppGateway resource represents a BeyondCorp protected AppGateway to a remote application. It creates
   *  all the necessary GCP components needed for creating a BeyondCorp protected AppGateway. Multiple connectors can be
   *  authorised for a single AppGateway.
   * 
   *  To get more information about AppGateway, see:
   * 
   *  * [API documentation](https://cloud.google.com/beyondcorp/docs/reference/rest#rest-resource:-v1.projects.locations.appgateways)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/beyondcorp-enterprise/docs/enable-app-connector)
   */
  def AppGateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.AppGatewayArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.beyondcorp.AppGatewayArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.beyondcorp.AppGateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygateway are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  # IAM policy for BeyondCorp SecurityGateway
   * 
   *  Three different resources help you manage your IAM policy for BeyondCorp SecurityGateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Authoritative. Sets the IAM policy for the securitygateway and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygateway are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayIamPolicy`: Retrieves the IAM policy for the securitygateway
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayIamBinding` and `gcp.beyondcorp.SecurityGatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayIamPolicy("policy", SecurityGatewayIamPolicyArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayIamBinding("binding", SecurityGatewayIamBindingArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayIamMember("member", SecurityGatewayIamMemberArgs.builder()
   *              .project(example.project())
   *              .location(example.location())
   *              .securityGatewayId(example.securityGatewayId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  * projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   *  * {{project}}/{{location}}/{{security_gateway_id}}
   *  * {{location}}/{{security_gateway_id}}
   *  * {{security_gateway_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BeyondCorp securitygateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}} roles/beyondcorp.securityGatewayUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:beyondcorp/securityGatewayIamPolicy:SecurityGatewayIamPolicy editor projects/{{project}}/locations/{{location}}/securityGateways/{{security_gateway_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecurityGatewayIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicyArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder)
    /**
     * @param hubs Optional. Map of Hubs that represents regional data path deployment with GCP region
     *  as a key.
     *  Structure is documented below.
     * @return builder
     */
    def hubs(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.builder
      builder.hubs(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Settings related to Cloud Logging.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param proxyProtocolConfig Shared proxy configuration for all apps.
     *  Structure is documented below.
     * @return builder
     */
    def proxyProtocolConfig(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.builder
      builder.proxyProtocolConfig(args(argsBuilder).build)

    /**
     * @param serviceDiscovery Settings related to the Service Discovery.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDiscovery(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder]):
        com.pulumi.gcp.beyondcorp.SecurityGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.builder
      builder.serviceDiscovery(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  # IAM policy for BeyondCorp SecurityGatewayApplication
   * 
   *  Three different resources help you manage your IAM policy for BeyondCorp SecurityGatewayApplication. Each of these resources serves a different use case:
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Authoritative. Sets the IAM policy for the securitygatewayapplication and replaces any existing policy already attached.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the securitygatewayapplication are preserved.
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the securitygatewayapplication are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy`: Retrieves the IAM policy for the securitygatewayapplication
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamPolicy` **cannot** be used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` and `gcp.beyondcorp.SecurityGatewayApplicationIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.beyondcorp.SecurityGatewayApplicationIamBinding` resources **can be** used in conjunction with `gcp.beyondcorp.SecurityGatewayApplicationIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamPolicy
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
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
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicy;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamPolicyArgs;
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
   *                  .role("roles/beyondcorp.securityGatewayUser")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new SecurityGatewayApplicationIamPolicy("policy", SecurityGatewayApplicationIamPolicyArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBinding;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamBindingArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs;
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
   *          var binding = new SecurityGatewayApplicationIamBinding("binding", SecurityGatewayApplicationIamBindingArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamBindingConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.beyondcorp.SecurityGatewayApplicationIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  With IAM Conditions:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember;
   *  import com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs;
   *  import com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs;
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
   *          var member = new SecurityGatewayApplicationIamMember("member", SecurityGatewayApplicationIamMemberArgs.builder()
   *              .project(example.project())
   *              .securityGatewayId(example.securityGatewayId())
   *              .applicationId(example.applicationId())
   *              .role("roles/beyondcorp.securityGatewayUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(SecurityGatewayApplicationIamMemberConditionArgs.builder()
   *                  .title("expires_after_2019_12_31")
   *                  .description("Expiring at midnight of 2019-12-31")
   *                  .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                  .build())
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
   *  * projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   *  * {{project}}/{{security_gateway_id}}/{{application_id}}
   *  * {{security_gateway_id}}/{{application_id}}
   *  * {{application_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BeyondCorp securitygatewayapplication IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_application_iam_member.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_beyondcorp_security_gateway_application_iam_binding.editor &#34;projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}} roles/beyondcorp.securityGatewayUser&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:beyondcorp/securityGatewayApplicationIamMember:SecurityGatewayApplicationIamMember editor projects/{{project}}/locations/global/securityGateways/{{security_gateway_id}}/applications/{{application_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SecurityGatewayApplicationIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMemberArgs.builder
    com.pulumi.gcp.beyondcorp.SecurityGatewayApplicationIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object BeyondcorpFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get information about a Google BeyondCorp App Connection. */
    inline def getAppConnection(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetAppConnectionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetAppConnectionResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetAppConnectionArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getAppConnection(args(argsBuilder).build)

    /** Get information about a Google BeyondCorp App Connection. */
    inline def getAppConnectionPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetAppConnectionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetAppConnectionResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetAppConnectionPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getAppConnectionPlain(args(argsBuilder).build)

    /** Get information about a Google BeyondCorp App Connector. */
    inline def getAppConnector(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetAppConnectorArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetAppConnectorResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetAppConnectorArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getAppConnector(args(argsBuilder).build)

    /** Get information about a Google BeyondCorp App Connector. */
    inline def getAppConnectorPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetAppConnectorPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetAppConnectorResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetAppConnectorPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getAppConnectorPlain(args(argsBuilder).build)

    /** Get information about a Google BeyondCorp App Gateway. */
    inline def getAppGateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetAppGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetAppGatewayResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetAppGatewayArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getAppGateway(args(argsBuilder).build)

    /** Get information about a Google BeyondCorp App Gateway. */
    inline def getAppGatewayPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetAppGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetAppGatewayResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetAppGatewayPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getAppGatewayPlain(args(argsBuilder).build)

    /** Get information about a Google BeyondCorp Security Gateway. */
    inline def getSecurityGateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGateway(args(argsBuilder).build)

    /** Get information about a Google BeyondCorp Security Gateway. */
    inline def getSecurityGatewayPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for securitygatewayapplication */
    inline def getSecurityGatewayApplicationIamPolicy(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayApplicationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayApplicationIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for securitygatewayapplication */
    inline def getSecurityGatewayApplicationIamPolicyPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayApplicationIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayApplicationIamPolicyPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayApplicationIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for securitygateway */
    inline def getSecurityGatewayIamPolicy(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for securitygateway */
    inline def getSecurityGatewayIamPolicyPlain(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.beyondcorp.outputs.GetSecurityGatewayIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.GetSecurityGatewayIamPolicyPlainArgs.builder
      com.pulumi.gcp.beyondcorp.BeyondcorpFunctions.getSecurityGatewayIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.AppConnectorState.Builder)
    /**
     * @param principalInfo Principal information about the Identity of the AppConnector.
     *  Structure is documented below.
     * @return builder
     */
    def principalInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.AppConnectorState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs.builder
      builder.principalInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.Builder)
    /**
     * @param endpoints List of the endpoints to forward traffic to.
     *  Structure is documented below.
     * @return builder
     */
    def endpoints(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalEndpointArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder)
    /**
     * @param internetGateway Internet Gateway configuration.
     *  Structure is documented below.
     * @return builder
     */
    def internetGateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubInternetGatewayArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubInternetGatewayArgs.builder
      builder.internetGateway(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder)
    /**
     * @param deviceInfo Device info configuration.
     *  Structure is documented below.
     * @return builder
     */
    def deviceInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersDeviceInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersDeviceInfoArgs.builder
      builder.deviceInfo(args(argsBuilder).build)

    /**
     * @param groupInfo Group info configuration.
     *  Structure is documented below.
     * @return builder
     */
    def groupInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersGroupInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersGroupInfoArgs.builder
      builder.groupInfo(args(argsBuilder).build)

    /**
     * @param userInfo User info configuration.
     *  Structure is documented below.
     * @return builder
     */
    def userInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersUserInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersUserInfoArgs.builder
      builder.userInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder)
    /**
     * @param egressPolicy Optional. Routing policy information.
     *  Structure is documented below.
     * @return builder
     */
    def egressPolicy(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamEgressPolicyArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamEgressPolicyArgs.builder
      builder.egressPolicy(args(argsBuilder).build)

    /**
     * @param external List of the external endpoints to forward traffic to.
     *  Structure is documented below.
     * @return builder
     */
    def external(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamExternalArgs.builder
      builder.external(args(argsBuilder).build)

    /**
     * @param network Network to forward traffic to.
     *  Structure is documented below.
     * @return builder
     */
    def network(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamNetworkArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamNetworkArgs.builder
      builder.network(args(argsBuilder).build)

    /**
     * @param proxyProtocol Shared proxy configuration for all apps.
     *  Structure is documented below.
     * @return builder
     */
    def proxyProtocol(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.builder
      builder.proxyProtocol(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationState.Builder)
    /**
     * @param endpointMatchers Required. Endpoint matchers associated with an application.
     *  A combination of hostname and ports as endpoint matcher is used to match
     *  the application.
     *  Match conditions for OR logic.
     *  An array of match conditions to allow for multiple matching criteria.
     *  The rule is considered a match if one the conditions are met.
     *  The conditions can be one of the following combination
     *  (Hostname), (Hostname &amp; Ports)
     *  EXAMPLES:
     *  Hostname - (&#34;*.abc.com&#34;), (&#34;xyz.abc.com&#34;)
     *  Hostname and Ports - (&#34;abc.com&#34; and &#34;22&#34;), (&#34;abc.com&#34; and &#34;22,33&#34;) etc
     *  Structure is documented below.
     * @return builder
     */
    def endpointMatchers(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationEndpointMatcherArgs.builder
      builder.endpointMatchers(args.map(_(argsBuilder).build)*)

    /**
     * @param upstreams Optional. List of which upstream resource(s) to forward traffic to.
     *  Structure is documented below.
     * @return builder
     */
    def upstreams(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationState.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamArgs.builder
      builder.upstreams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.Builder)
    /**
     * @param resourceOverride Enables fetching resource model updates to alter service behavior per Chrome profile.
     *  Structure is documented below.
     * @return builder
     */
    def resourceOverride(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayResourceOverrideArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayResourceOverrideArgs.builder
      builder.resourceOverride(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder)
    /**
     * @param apiGateway External API configuration.
     *  Structure is documented below.
     * @return builder
     */
    def apiGateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryApiGatewayArgs.builder
      builder.apiGateway(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder)
    /**
     * @param hubs Optional. Map of Hubs that represents regional data path deployment with GCP region
     *  as a key.
     *  Structure is documented below.
     * @return builder
     */
    def hubs(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayHubArgs.builder
      builder.hubs(args.map(_(argsBuilder).build)*)

    /**
     * @param logging Settings related to Cloud Logging.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param proxyProtocolConfig Shared proxy configuration for all apps.
     *  Structure is documented below.
     * @return builder
     */
    def proxyProtocolConfig(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.builder
      builder.proxyProtocolConfig(args(argsBuilder).build)

    /**
     * @param serviceDiscovery Settings related to the Service Discovery.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDiscovery(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayServiceDiscoveryArgs.builder
      builder.serviceDiscovery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.AppConnectionState.Builder)
    /**
     * @param applicationEndpoint Address of the remote application endpoint for the BeyondCorp AppConnection.
     *  Structure is documented below.
     * @return builder
     */
    def applicationEndpoint(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppConnectionApplicationEndpointArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.AppConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppConnectionApplicationEndpointArgs.builder
      builder.applicationEndpoint(args(argsBuilder).build)

    /**
     * @param gateway Gateway used by the AppConnection.
     *  Structure is documented below.
     * @return builder
     */
    def gateway(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppConnectionGatewayArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.AppConnectionState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppConnectionGatewayArgs.builder
      builder.gateway(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.Builder)
    /**
     * @param contextualHeaders Configuration for the contextual headers.
     *  Structure is documented below.
     * @return builder
     */
    def contextualHeaders(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.builder
      builder.contextualHeaders(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs.Builder)
    /**
     * @param serviceAccount ServiceAccount represents a GCP service account.
     *  Structure is documented below.
     * @return builder
     */
    def serviceAccount(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoServiceAccountArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppConnectorPrincipalInfoServiceAccountArgs.builder
      builder.serviceAccount(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.AppGatewayState.Builder)
    /**
     * @param allocatedConnections A list of connections allocated for the Gateway.
     *  Structure is documented below.
     * @return builder
     */
    def allocatedConnections(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.AppGatewayAllocatedConnectionArgs.Builder]*):
        com.pulumi.gcp.beyondcorp.inputs.AppGatewayState.Builder =
      def argsBuilder = com.pulumi.gcp.beyondcorp.inputs.AppGatewayAllocatedConnectionArgs.builder
      builder.allocatedConnections(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder)
    /**
     * @param deviceInfo Device info configuration.
     *  Structure is documented below.
     * @return builder
     */
    def deviceInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersDeviceInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersDeviceInfoArgs.builder
      builder.deviceInfo(args(argsBuilder).build)

    /**
     * @param groupInfo Group info configuration.
     *  Structure is documented below.
     * @return builder
     */
    def groupInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersGroupInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersGroupInfoArgs.builder
      builder.groupInfo(args(argsBuilder).build)

    /**
     * @param userInfo User info configuration.
     *  Structure is documented below.
     * @return builder
     */
    def userInfo(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersUserInfoArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationUpstreamProxyProtocolContextualHeadersUserInfoArgs.builder
      builder.userInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder)
    /**
     * @param contextualHeaders Configuration for the contextual headers.
     *  Structure is documented below.
     * @return builder
     */
    def contextualHeaders(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayProxyProtocolConfigContextualHeadersArgs.builder
      builder.contextualHeaders(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.beyondcorp.inputs.SecurityGatewayApplicationIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
