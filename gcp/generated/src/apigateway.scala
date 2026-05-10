package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object apigateway:
  extension (builder: com.pulumi.gcp.apigateway.ApiIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type ApigatewayFunctions = com.pulumi.gcp.apigateway.ApigatewayFunctions
  object ApigatewayFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.apigateway.ApigatewayFunctions.*
  extension (self: ApigatewayFunctions.type)
    /**
     * Retrieves the current IAM policy data for apiconfig
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getApiConfigIamPolicy(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apigateway.outputs.GetApiConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyArgs.builder
      com.pulumi.gcp.apigateway.ApigatewayFunctions.getApiConfigIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for apiconfig
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getApiConfigIamPolicyPlain(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apigateway.outputs.GetApiConfigIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GetApiConfigIamPolicyPlainArgs.builder
      com.pulumi.gcp.apigateway.ApigatewayFunctions.getApiConfigIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for api
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getApiIamPolicy(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apigateway.outputs.GetApiIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyArgs.builder
      com.pulumi.gcp.apigateway.ApigatewayFunctions.getApiIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for api
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getApiIamPolicyPlain(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apigateway.outputs.GetApiIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GetApiIamPolicyPlainArgs.builder
      com.pulumi.gcp.apigateway.ApigatewayFunctions.getApiIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for gateway
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getGatewayIamPolicy(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apigateway.outputs.GetGatewayIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyArgs.builder
      com.pulumi.gcp.apigateway.ApigatewayFunctions.getGatewayIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for gateway
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getGatewayIamPolicyPlain(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apigateway.outputs.GetGatewayIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GetGatewayIamPolicyPlainArgs.builder
      com.pulumi.gcp.apigateway.ApigatewayFunctions.getGatewayIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway Gateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Authoritative. Sets the IAM policy for the gateway and replaces any existing policy already attached.
   *  * `gcp.apigateway.GatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the gateway are preserved.
   *  * `gcp.apigateway.GatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the gateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Retrieves the IAM policy for the gateway
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.GatewayIamBinding` and `gcp.apigateway.GatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamBinding` resources **can be** used in conjunction with `gcp.apigateway.GatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.GatewayIamPolicy
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
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicy;
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new GatewayIamPolicy("policy", GatewayIamPolicyArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamBinding;
   *  import com.pulumi.gcp.apigateway.GatewayIamBindingArgs;
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
   *          var binding = new GatewayIamBinding("binding", GatewayIamBindingArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamMember;
   *  import com.pulumi.gcp.apigateway.GatewayIamMemberArgs;
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
   *          var member = new GatewayIamMember("member", GatewayIamMemberArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway Gateway
   * 
   *  Three different resources help you manage your IAM policy for API Gateway Gateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Authoritative. Sets the IAM policy for the gateway and replaces any existing policy already attached.
   *  * `gcp.apigateway.GatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the gateway are preserved.
   *  * `gcp.apigateway.GatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the gateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Retrieves the IAM policy for the gateway
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.GatewayIamBinding` and `gcp.apigateway.GatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamBinding` resources **can be** used in conjunction with `gcp.apigateway.GatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.GatewayIamPolicy
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
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicy;
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new GatewayIamPolicy("policy", GatewayIamPolicyArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamBinding;
   *  import com.pulumi.gcp.apigateway.GatewayIamBindingArgs;
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
   *          var binding = new GatewayIamBinding("binding", GatewayIamBindingArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamMember;
   *  import com.pulumi.gcp.apigateway.GatewayIamMemberArgs;
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
   *          var member = new GatewayIamMember("member", GatewayIamMemberArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/{{region}}/gateways/{{gateway}}
   *  * {{project}}/{{region}}/{{gateway}}
   *  * {{region}}/{{gateway}}
   *  * {{gateway}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway gateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/gateways/{{gateway}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/gateways/{{gateway}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/gatewayIamBinding:GatewayIamBinding editor projects/{{project}}/locations/{{region}}/gateways/{{gateway}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GatewayIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.GatewayIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.GatewayIamBindingArgs.builder
    com.pulumi.gcp.apigateway.GatewayIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway Api. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Authoritative. Sets the IAM policy for the api and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the api are preserved.
   *  * `gcp.apigateway.ApiIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the api are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Retrieves the IAM policy for the api
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiIamBinding` and `gcp.apigateway.ApiIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiIamPolicy("policy", ApiIamPolicyArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiIamBindingArgs;
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
   *          var binding = new ApiIamBinding("binding", ApiIamBindingArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamMember;
   *  import com.pulumi.gcp.apigateway.ApiIamMemberArgs;
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
   *          var member = new ApiIamMember("member", ApiIamMemberArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway Api
   * 
   *  Three different resources help you manage your IAM policy for API Gateway Api. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Authoritative. Sets the IAM policy for the api and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the api are preserved.
   *  * `gcp.apigateway.ApiIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the api are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Retrieves the IAM policy for the api
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiIamBinding` and `gcp.apigateway.ApiIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiIamPolicy("policy", ApiIamPolicyArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiIamBindingArgs;
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
   *          var binding = new ApiIamBinding("binding", ApiIamBindingArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamMember;
   *  import com.pulumi.gcp.apigateway.ApiIamMemberArgs;
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
   *          var member = new ApiIamMember("member", ApiIamMemberArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/global/apis/{{api}}
   *  * {{project}}/{{api}}
   *  * {{api}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway api IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_iam_member.editor &#34;projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_iam_binding.editor &#34;projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/apiIamPolicy:ApiIamPolicy editor projects/{{project}}/locations/global/apis/{{api}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ApiIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiIamPolicyArgs.builder
    com.pulumi.gcp.apigateway.ApiIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A consumable API that can be used by multiple Gateways.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Gateway, see:
   * 
   *  * [API documentation](https://cloud.google.com/api-gateway/docs/reference/rest/v1beta/projects.locations.apis)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/api-gateway/docs/quickstart)
   */
  def Gateway(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.GatewayArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.GatewayArgs.builder
    com.pulumi.gcp.apigateway.Gateway(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway Api. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Authoritative. Sets the IAM policy for the api and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the api are preserved.
   *  * `gcp.apigateway.ApiIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the api are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Retrieves the IAM policy for the api
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiIamBinding` and `gcp.apigateway.ApiIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiIamPolicy("policy", ApiIamPolicyArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiIamBindingArgs;
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
   *          var binding = new ApiIamBinding("binding", ApiIamBindingArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamMember;
   *  import com.pulumi.gcp.apigateway.ApiIamMemberArgs;
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
   *          var member = new ApiIamMember("member", ApiIamMemberArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway Api
   * 
   *  Three different resources help you manage your IAM policy for API Gateway Api. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Authoritative. Sets the IAM policy for the api and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the api are preserved.
   *  * `gcp.apigateway.ApiIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the api are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Retrieves the IAM policy for the api
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiIamBinding` and `gcp.apigateway.ApiIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiIamPolicy("policy", ApiIamPolicyArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiIamBindingArgs;
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
   *          var binding = new ApiIamBinding("binding", ApiIamBindingArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamMember;
   *  import com.pulumi.gcp.apigateway.ApiIamMemberArgs;
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
   *          var member = new ApiIamMember("member", ApiIamMemberArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/global/apis/{{api}}
   *  * {{project}}/{{api}}
   *  * {{api}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway api IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_iam_member.editor &#34;projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_iam_binding.editor &#34;projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/apiIamMember:ApiIamMember editor projects/{{project}}/locations/global/apis/{{api}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ApiIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiIamMemberArgs.builder
    com.pulumi.gcp.apigateway.ApiIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigateway.GatewayIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.GatewayIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway Gateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Authoritative. Sets the IAM policy for the gateway and replaces any existing policy already attached.
   *  * `gcp.apigateway.GatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the gateway are preserved.
   *  * `gcp.apigateway.GatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the gateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Retrieves the IAM policy for the gateway
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.GatewayIamBinding` and `gcp.apigateway.GatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamBinding` resources **can be** used in conjunction with `gcp.apigateway.GatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.GatewayIamPolicy
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
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicy;
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new GatewayIamPolicy("policy", GatewayIamPolicyArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamBinding;
   *  import com.pulumi.gcp.apigateway.GatewayIamBindingArgs;
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
   *          var binding = new GatewayIamBinding("binding", GatewayIamBindingArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamMember;
   *  import com.pulumi.gcp.apigateway.GatewayIamMemberArgs;
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
   *          var member = new GatewayIamMember("member", GatewayIamMemberArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway Gateway
   * 
   *  Three different resources help you manage your IAM policy for API Gateway Gateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Authoritative. Sets the IAM policy for the gateway and replaces any existing policy already attached.
   *  * `gcp.apigateway.GatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the gateway are preserved.
   *  * `gcp.apigateway.GatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the gateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Retrieves the IAM policy for the gateway
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.GatewayIamBinding` and `gcp.apigateway.GatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamBinding` resources **can be** used in conjunction with `gcp.apigateway.GatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.GatewayIamPolicy
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
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicy;
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new GatewayIamPolicy("policy", GatewayIamPolicyArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamBinding;
   *  import com.pulumi.gcp.apigateway.GatewayIamBindingArgs;
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
   *          var binding = new GatewayIamBinding("binding", GatewayIamBindingArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamMember;
   *  import com.pulumi.gcp.apigateway.GatewayIamMemberArgs;
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
   *          var member = new GatewayIamMember("member", GatewayIamMemberArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/{{region}}/gateways/{{gateway}}
   *  * {{project}}/{{region}}/{{gateway}}
   *  * {{region}}/{{gateway}}
   *  * {{gateway}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway gateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/gateways/{{gateway}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/gateways/{{gateway}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/gatewayIamPolicy:GatewayIamPolicy editor projects/{{project}}/locations/{{region}}/gateways/{{gateway}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GatewayIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.GatewayIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.GatewayIamPolicyArgs.builder
    com.pulumi.gcp.apigateway.GatewayIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigateway.GatewayIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.GatewayIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.ApiConfigArgs.Builder)
    /**
     * @param gatewayConfig Immutable. Gateway specific configuration.
     *  If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     *  Structure is documented below.
     * @return builder
     */
    def gatewayConfig(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.builder
      builder.gatewayConfig(args(argsBuilder).build)

    /**
     * @param grpcServices gRPC service definition files. If specified, openapiDocuments must not be included.
     *  Structure is documented below.
     * @return builder
     */
    def grpcServices(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder]*):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.builder
      builder.grpcServices(args.map(_(argsBuilder).build)*)

    /**
     * @param managedServiceConfigs Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents.
     *  If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     *  Structure is documented below.
     * @return builder
     */
    def managedServiceConfigs(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.Builder]*):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.builder
      builder.managedServiceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param openapiDocuments OpenAPI specification documents. If specified, grpcServices and managedServiceConfigs must not be included.
     *  Structure is documented below.
     * @return builder
     */
    def openapiDocuments(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder]*):
        com.pulumi.gcp.apigateway.ApiConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.builder
      builder.openapiDocuments(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
   *  * `gcp.apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiConfigIamBinding` and `gcp.apigateway.ApiConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiConfigIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiConfigIamPolicy("policy", ApiConfigIamPolicyArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs;
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
   *          var binding = new ApiConfigIamBinding("binding", ApiConfigIamBindingArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMember;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs;
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
   *          var member = new ApiConfigIamMember("member", ApiConfigIamMemberArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway ApiConfig
   * 
   *  Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
   *  * `gcp.apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiConfigIamBinding` and `gcp.apigateway.ApiConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiConfigIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiConfigIamPolicy("policy", ApiConfigIamPolicyArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs;
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
   *          var binding = new ApiConfigIamBinding("binding", ApiConfigIamBindingArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMember;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs;
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
   *          var member = new ApiConfigIamMember("member", ApiConfigIamMemberArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
   *  * {{project}}/{{api}}/{{api_config}}
   *  * {{api}}/{{api_config}}
   *  * {{api_config}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway apiconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_config_iam_member.editor &#34;projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_config_iam_binding.editor &#34;projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/apiConfigIamMember:ApiConfigIamMember editor projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ApiConfigIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs.builder
    com.pulumi.gcp.apigateway.ApiConfigIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An API Configuration is an association of an API Controller Config and a Gateway Config
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about ApiConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/api-gateway/docs/reference/rest/v1beta/projects.locations.apis.configs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/api-gateway/docs/creating-api-config)
   */
  def ApiConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiConfigArgs.builder
    com.pulumi.gcp.apigateway.ApiConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A consumable API that can be used by multiple Gateways.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about Api, see:
   * 
   *  * [API documentation](https://cloud.google.com/api-gateway/docs/reference/rest/v1beta/projects.locations.apis)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/api-gateway/docs/quickstart)
   */
  def Api(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiArgs.builder
    com.pulumi.gcp.apigateway.Api(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
   *  * `gcp.apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiConfigIamBinding` and `gcp.apigateway.ApiConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiConfigIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiConfigIamPolicy("policy", ApiConfigIamPolicyArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs;
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
   *          var binding = new ApiConfigIamBinding("binding", ApiConfigIamBindingArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMember;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs;
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
   *          var member = new ApiConfigIamMember("member", ApiConfigIamMemberArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway ApiConfig
   * 
   *  Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
   *  * `gcp.apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiConfigIamBinding` and `gcp.apigateway.ApiConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiConfigIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiConfigIamPolicy("policy", ApiConfigIamPolicyArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs;
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
   *          var binding = new ApiConfigIamBinding("binding", ApiConfigIamBindingArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMember;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs;
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
   *          var member = new ApiConfigIamMember("member", ApiConfigIamMemberArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
   *  * {{project}}/{{api}}/{{api_config}}
   *  * {{api}}/{{api_config}}
   *  * {{api_config}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway apiconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_config_iam_member.editor &#34;projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_config_iam_binding.editor &#34;projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/apiConfigIamBinding:ApiConfigIamBinding editor projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ApiConfigIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs.builder
    com.pulumi.gcp.apigateway.ApiConfigIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway Gateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Authoritative. Sets the IAM policy for the gateway and replaces any existing policy already attached.
   *  * `gcp.apigateway.GatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the gateway are preserved.
   *  * `gcp.apigateway.GatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the gateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Retrieves the IAM policy for the gateway
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.GatewayIamBinding` and `gcp.apigateway.GatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamBinding` resources **can be** used in conjunction with `gcp.apigateway.GatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.GatewayIamPolicy
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
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicy;
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new GatewayIamPolicy("policy", GatewayIamPolicyArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamBinding;
   *  import com.pulumi.gcp.apigateway.GatewayIamBindingArgs;
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
   *          var binding = new GatewayIamBinding("binding", GatewayIamBindingArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamMember;
   *  import com.pulumi.gcp.apigateway.GatewayIamMemberArgs;
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
   *          var member = new GatewayIamMember("member", GatewayIamMemberArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway Gateway
   * 
   *  Three different resources help you manage your IAM policy for API Gateway Gateway. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Authoritative. Sets the IAM policy for the gateway and replaces any existing policy already attached.
   *  * `gcp.apigateway.GatewayIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the gateway are preserved.
   *  * `gcp.apigateway.GatewayIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the gateway are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.GatewayIamPolicy`: Retrieves the IAM policy for the gateway
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.GatewayIamBinding` and `gcp.apigateway.GatewayIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.GatewayIamBinding` resources **can be** used in conjunction with `gcp.apigateway.GatewayIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.GatewayIamPolicy
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
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicy;
   *  import com.pulumi.gcp.apigateway.GatewayIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new GatewayIamPolicy("policy", GatewayIamPolicyArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamBinding;
   *  import com.pulumi.gcp.apigateway.GatewayIamBindingArgs;
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
   *          var binding = new GatewayIamBinding("binding", GatewayIamBindingArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.GatewayIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.GatewayIamMember;
   *  import com.pulumi.gcp.apigateway.GatewayIamMemberArgs;
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
   *          var member = new GatewayIamMember("member", GatewayIamMemberArgs.builder()
   *              .project(apiGw.project())
   *              .region(apiGw.region())
   *              .gateway(apiGw.gatewayId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/{{region}}/gateways/{{gateway}}
   *  * {{project}}/{{region}}/{{gateway}}
   *  * {{region}}/{{gateway}}
   *  * {{gateway}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway gateway IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_gateway_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/gateways/{{gateway}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_gateway_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/gateways/{{gateway}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/gatewayIamMember:GatewayIamMember editor projects/{{project}}/locations/{{region}}/gateways/{{gateway}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def GatewayIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.GatewayIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.GatewayIamMemberArgs.builder
    com.pulumi.gcp.apigateway.GatewayIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway Api. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Authoritative. Sets the IAM policy for the api and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the api are preserved.
   *  * `gcp.apigateway.ApiIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the api are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Retrieves the IAM policy for the api
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiIamBinding` and `gcp.apigateway.ApiIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiIamPolicy("policy", ApiIamPolicyArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiIamBindingArgs;
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
   *          var binding = new ApiIamBinding("binding", ApiIamBindingArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamMember;
   *  import com.pulumi.gcp.apigateway.ApiIamMemberArgs;
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
   *          var member = new ApiIamMember("member", ApiIamMemberArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway Api
   * 
   *  Three different resources help you manage your IAM policy for API Gateway Api. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Authoritative. Sets the IAM policy for the api and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the api are preserved.
   *  * `gcp.apigateway.ApiIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the api are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiIamPolicy`: Retrieves the IAM policy for the api
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiIamBinding` and `gcp.apigateway.ApiIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiIamPolicy("policy", ApiIamPolicyArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiIamBindingArgs;
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
   *          var binding = new ApiIamBinding("binding", ApiIamBindingArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiIamMember;
   *  import com.pulumi.gcp.apigateway.ApiIamMemberArgs;
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
   *          var member = new ApiIamMember("member", ApiIamMemberArgs.builder()
   *              .project(api.project())
   *              .api(api.apiId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/global/apis/{{api}}
   *  * {{project}}/{{api}}
   *  * {{api}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway api IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_iam_member.editor &#34;projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_iam_binding.editor &#34;projects/{{project}}/locations/global/apis/{{api}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/apiIamBinding:ApiIamBinding editor projects/{{project}}/locations/global/apis/{{api}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ApiIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiIamBindingArgs.builder
    com.pulumi.gcp.apigateway.ApiIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
   *  * `gcp.apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiConfigIamBinding` and `gcp.apigateway.ApiConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiConfigIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiConfigIamPolicy("policy", ApiConfigIamPolicyArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs;
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
   *          var binding = new ApiConfigIamBinding("binding", ApiConfigIamBindingArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMember;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs;
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
   *          var member = new ApiConfigIamMember("member", ApiConfigIamMemberArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
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
   *  # IAM policy for API Gateway ApiConfig
   * 
   *  Three different resources help you manage your IAM policy for API Gateway ApiConfig. Each of these resources serves a different use case:
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Authoritative. Sets the IAM policy for the apiconfig and replaces any existing policy already attached.
   *  * `gcp.apigateway.ApiConfigIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the apiconfig are preserved.
   *  * `gcp.apigateway.ApiConfigIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the apiconfig are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.apigateway.ApiConfigIamPolicy`: Retrieves the IAM policy for the apiconfig
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamPolicy` **cannot** be used in conjunction with `gcp.apigateway.ApiConfigIamBinding` and `gcp.apigateway.ApiConfigIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.apigateway.ApiConfigIamBinding` resources **can be** used in conjunction with `gcp.apigateway.ApiConfigIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.apigateway.ApiConfigIamPolicy
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
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicy;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs;
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
   *                  .role("roles/apigateway.viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ApiConfigIamPolicy("policy", ApiConfigIamPolicyArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBinding;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs;
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
   *          var binding = new ApiConfigIamBinding("binding", ApiConfigIamBindingArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.apigateway.ApiConfigIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMember;
   *  import com.pulumi.gcp.apigateway.ApiConfigIamMemberArgs;
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
   *          var member = new ApiConfigIamMember("member", ApiConfigIamMemberArgs.builder()
   *              .api(apiCfg.api())
   *              .apiConfig(apiCfg.apiConfigId())
   *              .role("roles/apigateway.viewer")
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
   *  * projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
   *  * {{project}}/{{api}}/{{api_config}}
   *  * {{api}}/{{api_config}}
   *  * {{api_config}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  API Gateway apiconfig IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_config_iam_member.editor &#34;projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_api_gateway_api_config_iam_binding.editor &#34;projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}} roles/apigateway.viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:apigateway/apiConfigIamPolicy:ApiConfigIamPolicy editor projects/{{project}}/locations/global/apis/{{api}}/configs/{{api_config}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ApiConfigIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.apigateway.ApiConfigIamPolicyArgs.builder
    com.pulumi.gcp.apigateway.ApiConfigIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.apigateway.ApiIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.ApiConfigIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.GatewayIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.GatewayIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.GatewayIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.GatewayIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.GatewayIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder)
    /**
     * @param document The OpenAPI Specification document file.
     *  Structure is documented below.
     * @return builder
     */
    def document(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentDocumentArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentDocumentArgs.builder
      builder.document(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder)
    /**
     * @param fileDescriptorSet Input only. File descriptor set, generated by protoc.
     *  To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     *  $ protoc --include_imports --include_source_info test.proto -o out.pb
     *  Structure is documented below.
     * @return builder
     */
    def fileDescriptorSet(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceFileDescriptorSetArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceFileDescriptorSetArgs.builder
      builder.fileDescriptorSet(args(argsBuilder).build)

    /**
     * @param sources Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate fileDescriptorSet.
     *  Structure is documented below.
     * @return builder
     */
    def sources(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceSourceArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceSourceArgs.builder
      builder.sources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder)
    /**
     * @param backendConfig Backend settings that are applied to all backends of the Gateway.
     *  Structure is documented below.
     * @return builder
     */
    def backendConfig(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigBackendConfigArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigBackendConfigArgs.builder
      builder.backendConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder)
    /**
     * @param gatewayConfig Immutable. Gateway specific configuration.
     *  If not specified, backend authentication will be set to use OIDC authentication using the default compute service account
     *  Structure is documented below.
     * @return builder
     */
    def gatewayConfig(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGatewayConfigArgs.builder
      builder.gatewayConfig(args(argsBuilder).build)

    /**
     * @param grpcServices gRPC service definition files. If specified, openapiDocuments must not be included.
     *  Structure is documented below.
     * @return builder
     */
    def grpcServices(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigGrpcServiceArgs.builder
      builder.grpcServices(args.map(_(argsBuilder).build)*)

    /**
     * @param managedServiceConfigs Optional. Service Configuration files. At least one must be included when using gRPC service definitions. See https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview for the expected file contents.
     *  If multiple files are specified, the files are merged with the following rules: * All singular scalar fields are merged using &#34;last one wins&#34; semantics in the order of the files uploaded. * Repeated fields are concatenated. * Singular embedded messages are merged using these rules for nested fields.
     *  Structure is documented below.
     * @return builder
     */
    def managedServiceConfigs(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigManagedServiceConfigArgs.builder
      builder.managedServiceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param openapiDocuments OpenAPI specification documents. If specified, grpcServices and managedServiceConfigs must not be included.
     *  Structure is documented below.
     * @return builder
     */
    def openapiDocuments(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.Builder]*):
        com.pulumi.gcp.apigateway.inputs.ApiConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiConfigOpenapiDocumentArgs.builder
      builder.openapiDocuments(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.apigateway.inputs.ApiIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.apigateway.inputs.ApiIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.apigateway.inputs.ApiIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
