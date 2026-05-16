package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object bigquerydatapolicy:
  object BigquerydatapolicyFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for datapolicy */
    inline def getIamPolicy(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.GetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquerydatapolicy.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.GetIamPolicyArgs.builder
      com.pulumi.gcp.bigquerydatapolicy.BigquerydatapolicyFunctions.getIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for datapolicy */
    inline def getIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.GetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquerydatapolicy.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.GetIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigquerydatapolicy.BigquerydatapolicyFunctions.getIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicy;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs;
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
   *          var policy = new DataPolicyIamPolicy("policy", DataPolicyIamPolicyArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBinding;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs;
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
   *          var binding = new DataPolicyIamBinding("binding", DataPolicyIamBindingArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMember;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs;
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
   *          var member = new DataPolicyIamMember("member", DataPolicyIamMemberArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
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
   *  # IAM policy for BigQuery Data Policy DataPolicy
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicy;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs;
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
   *          var policy = new DataPolicyIamPolicy("policy", DataPolicyIamPolicyArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBinding;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs;
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
   *          var binding = new DataPolicyIamBinding("binding", DataPolicyIamBindingArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMember;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs;
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
   *          var member = new DataPolicyIamMember("member", DataPolicyIamMemberArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
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
   *  * projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   *  * {{project}}/{{location}}/{{data_policy_id}}
   *  * {{location}}/{{data_policy_id}}
   *  * {{data_policy_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Data Policy datapolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_datapolicy_data_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_datapolicy_data_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigquerydatapolicy/dataPolicyIamPolicy:DataPolicyIamPolicy editor projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataPolicyIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs.builder
    com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A BigQuery Data Policy
   * 
   *  To get more information about DataPolicy, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/bigquerydatapolicy/rest/v1beta1/projects.locations.dataPolicies/create)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/bigquery/docs/column-data-masking-intro)
   */
  def DataPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.DataPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.DataPolicyArgs.builder
    com.pulumi.gcp.bigquerydatapolicy.DataPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicy;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs;
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
   *          var policy = new DataPolicyIamPolicy("policy", DataPolicyIamPolicyArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBinding;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs;
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
   *          var binding = new DataPolicyIamBinding("binding", DataPolicyIamBindingArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMember;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs;
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
   *          var member = new DataPolicyIamMember("member", DataPolicyIamMemberArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
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
   *  # IAM policy for BigQuery Data Policy DataPolicy
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicy;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs;
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
   *          var policy = new DataPolicyIamPolicy("policy", DataPolicyIamPolicyArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBinding;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs;
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
   *          var binding = new DataPolicyIamBinding("binding", DataPolicyIamBindingArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMember;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs;
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
   *          var member = new DataPolicyIamMember("member", DataPolicyIamMemberArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
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
   *  * projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   *  * {{project}}/{{location}}/{{data_policy_id}}
   *  * {{location}}/{{data_policy_id}}
   *  * {{data_policy_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Data Policy datapolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_datapolicy_data_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_datapolicy_data_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigquerydatapolicy/dataPolicyIamMember:DataPolicyIamMember editor projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataPolicyIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs.builder
    com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.DataPolicyArgs.Builder)
    /**
     * @param dataMaskingPolicy The data masking policy that specifies the data masking rule to use.
     *  Structure is documented below.
     * @return builder
     */
    def dataMaskingPolicy(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.DataPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.builder
      builder.dataMaskingPolicy(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicy;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs;
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
   *          var policy = new DataPolicyIamPolicy("policy", DataPolicyIamPolicyArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBinding;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs;
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
   *          var binding = new DataPolicyIamBinding("binding", DataPolicyIamBindingArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMember;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs;
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
   *          var member = new DataPolicyIamMember("member", DataPolicyIamMemberArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
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
   *  # IAM policy for BigQuery Data Policy DataPolicy
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Data Policy DataPolicy. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved.
   *  * `gcp.bigquerydatapolicy.DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigquerydatapolicy.DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamBinding` and `gcp.bigquerydatapolicy.DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigquerydatapolicy.DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquerydatapolicy.DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamPolicy
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
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicy;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamPolicyArgs;
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
   *          var policy = new DataPolicyIamPolicy("policy", DataPolicyIamPolicyArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBinding;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs;
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
   *          var binding = new DataPolicyIamBinding("binding", DataPolicyIamBindingArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigquerydatapolicy.DataPolicyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMember;
   *  import com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamMemberArgs;
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
   *          var member = new DataPolicyIamMember("member", DataPolicyIamMemberArgs.builder()
   *              .project(dataPolicy.project())
   *              .location(dataPolicy.location())
   *              .dataPolicyId(dataPolicy.dataPolicyId())
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
   *  * projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   *  * {{project}}/{{location}}/{{data_policy_id}}
   *  * {{location}}/{{data_policy_id}}
   *  * {{data_policy_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Data Policy datapolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_datapolicy_data_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_datapolicy_data_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigquerydatapolicy/dataPolicyIamBinding:DataPolicyIamBinding editor projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataPolicyIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBindingArgs.builder
    com.pulumi.gcp.bigquerydatapolicy.DataPolicyIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyState.Builder)
    /**
     * @param dataMaskingPolicy The data masking policy that specifies the data masking rule to use.
     *  Structure is documented below.
     * @return builder
     */
    def dataMaskingPolicy(args: Endofunction[com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.Builder]):
        com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.bigquerydatapolicy.inputs.DataPolicyDataMaskingPolicyArgs.builder
      builder.dataMaskingPolicy(args(argsBuilder).build)
