package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object bigtable:
  extension (builder: com.pulumi.gcp.bigtable.TableArgs.Builder)
    /**
     * @param automatedBackupPolicy Defines an automated backup policy for a table, specified by Retention Period and Frequency. To _create_ a table with automated backup disabled, either omit the automatedBackupPolicy argument, or set both Retention Period and Frequency properties to &#34;0&#34;. To disable automated backup on an _existing_ table that has automated backup enabled, set _both_ Retention Period and Frequency properties to &#34;0&#34;. When updating an existing table, to modify the Retention Period or Frequency properties of the resource&#39;s automated backup policy, set the respective property to a non-zero value. If the automatedBackupPolicy argument is not provided in the configuration on update, the resource&#39;s automated backup policy will _not_ be modified.
     * 
     *  ***
     * @return builder
     */
    def automatedBackupPolicy(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.Builder]):
        com.pulumi.gcp.bigtable.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.builder
      builder.automatedBackupPolicy(args(argsBuilder).build)

    /**
     * @param columnFamilies A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     * @return builder
     */
    def columnFamilies(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.Builder]*):
        com.pulumi.gcp.bigtable.TableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.builder
      builder.columnFamilies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.AppProfileArgs.Builder)
    /**
     * @param dataBoostIsolationReadOnly Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     *  Structure is documented below.
     * @return builder
     */
    def dataBoostIsolationReadOnly(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.Builder]):
        com.pulumi.gcp.bigtable.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.builder
      builder.dataBoostIsolationReadOnly(args(argsBuilder).build)

    /**
     * @param singleClusterRouting Use a single-cluster routing policy.
     *  Structure is documented below.
     * @return builder
     */
    def singleClusterRouting(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.Builder]):
        com.pulumi.gcp.bigtable.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.builder
      builder.singleClusterRouting(args(argsBuilder).build)

    /**
     * @param standardIsolation The standard options used for isolating this app profile&#39;s traffic from other use cases.
     *  Structure is documented below.
     * @return builder
     */
    def standardIsolation(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.Builder]):
        com.pulumi.gcp.bigtable.AppProfileArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.builder
      builder.standardIsolation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.InstanceIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.InstanceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.AuthorizedViewArgs.Builder)
    /**
     * @param subsetView An AuthorizedView permitting access to an explicit subset of a Table. Structure is documented below.
     * 
     *  ***
     * @return builder
     */
    def subsetView(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder]):
        com.pulumi.gcp.bigtable.AuthorizedViewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.builder
      builder.subsetView(args(argsBuilder).build)

  /**
   * Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
   *  * `gcp.bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
   *  * `gcp.bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
   * 
   *  &gt; **Note:** `gcp.bigtable.TableIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.TableIamBinding` and `gcp.bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `gcp.bigtable.TableIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.bigtable.TableIamBinding` resources **can be** used in conjunction with `gcp.bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigtable.TableIamPolicy
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
   *  import com.pulumi.gcp.bigtable.TableIamPolicy;
   *  import com.pulumi.gcp.bigtable.TableIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new TableIamPolicy("editor", TableIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instanceName("your-bigtable-instance")
   *              .table("your-bigtable-table")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamBinding;
   *  import com.pulumi.gcp.bigtable.TableIamBindingArgs;
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
   *          var editor = new TableIamBinding("editor", TableIamBindingArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamMember;
   *  import com.pulumi.gcp.bigtable.TableIamMemberArgs;
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
   *          var editor = new TableIamMember("editor", TableIamMemberArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamPolicy
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
   *  import com.pulumi.gcp.bigtable.TableIamPolicy;
   *  import com.pulumi.gcp.bigtable.TableIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new TableIamPolicy("editor", TableIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instanceName("your-bigtable-instance")
   *              .table("your-bigtable-table")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamBinding;
   *  import com.pulumi.gcp.bigtable.TableIamBindingArgs;
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
   *          var editor = new TableIamBinding("editor", TableIamBindingArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamMember;
   *  import com.pulumi.gcp.bigtable.TableIamMemberArgs;
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
   *          var editor = new TableIamMember("editor", TableIamMemberArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TableIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.TableIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.TableIamPolicyArgs.builder
    com.pulumi.gcp.bigtable.TableIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigtable.InstanceArgs.Builder)
    /**
     * @param clusters A block of cluster configuration options. This can be specified at least once, and up
     *  to as many as possible within 8 cloud regions. Removing the field entirely from the config will cause the provider
     *  to default to the backend value. See structure below.
     * 
     *  ***
     * @return builder
     */
    def clusters(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder]*):
        com.pulumi.gcp.bigtable.InstanceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.builder
      builder.clusters(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.bigtable.InstanceArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
   *  * `gcp.bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
   *  * `gcp.bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
   * 
   *  &gt; **Note:** `gcp.bigtable.TableIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.TableIamBinding` and `gcp.bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `gcp.bigtable.TableIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.bigtable.TableIamBinding` resources **can be** used in conjunction with `gcp.bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigtable.TableIamPolicy
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
   *  import com.pulumi.gcp.bigtable.TableIamPolicy;
   *  import com.pulumi.gcp.bigtable.TableIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new TableIamPolicy("editor", TableIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instanceName("your-bigtable-instance")
   *              .table("your-bigtable-table")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamBinding;
   *  import com.pulumi.gcp.bigtable.TableIamBindingArgs;
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
   *          var editor = new TableIamBinding("editor", TableIamBindingArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamMember;
   *  import com.pulumi.gcp.bigtable.TableIamMemberArgs;
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
   *          var editor = new TableIamMember("editor", TableIamMemberArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamPolicy
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
   *  import com.pulumi.gcp.bigtable.TableIamPolicy;
   *  import com.pulumi.gcp.bigtable.TableIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new TableIamPolicy("editor", TableIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instanceName("your-bigtable-instance")
   *              .table("your-bigtable-table")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamBinding;
   *  import com.pulumi.gcp.bigtable.TableIamBindingArgs;
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
   *          var editor = new TableIamBinding("editor", TableIamBindingArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamMember;
   *  import com.pulumi.gcp.bigtable.TableIamMemberArgs;
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
   *          var editor = new TableIamMember("editor", TableIamMemberArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TableIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.TableIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.TableIamBindingArgs.builder
    com.pulumi.gcp.bigtable.TableIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a Google Cloud Bigtable table inside an instance. For more information see
   *  [the official documentation](https://cloud.google.com/bigtable/) and
   *  [API](https://cloud.google.com/bigtable/docs/go/reference).
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.bigtable.TableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.bigtable.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object BigtableFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Retrieves the current IAM policy data for a Bigtable instance.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.bigtable.BigtableFunctions;
     *  import com.pulumi.gcp.bigtable.inputs.GetInstanceIamPolicyArgs;
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
     *          final var policy = BigtableFunctions.getInstanceIamPolicy(GetInstanceIamPolicyArgs.builder()
     *              .instance(instance.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getInstanceIamPolicy(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GetInstanceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigtable.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GetInstanceIamPolicyArgs.builder
      com.pulumi.gcp.bigtable.BigtableFunctions.getInstanceIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Bigtable instance.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.bigtable.BigtableFunctions;
     *  import com.pulumi.gcp.bigtable.inputs.GetInstanceIamPolicyArgs;
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
     *          final var policy = BigtableFunctions.getInstanceIamPolicy(GetInstanceIamPolicyArgs.builder()
     *              .instance(instance.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getInstanceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GetInstanceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigtable.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GetInstanceIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigtable.BigtableFunctions.getInstanceIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Bigtable Table.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.bigtable.BigtableFunctions;
     *  import com.pulumi.gcp.bigtable.inputs.GetTableIamPolicyArgs;
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
     *          final var policy = BigtableFunctions.getTableIamPolicy(GetTableIamPolicyArgs.builder()
     *              .instanceName(instance.name())
     *              .table(table.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getTableIamPolicy(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GetTableIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigtable.outputs.GetTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GetTableIamPolicyArgs.builder
      com.pulumi.gcp.bigtable.BigtableFunctions.getTableIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Bigtable Table.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.bigtable.BigtableFunctions;
     *  import com.pulumi.gcp.bigtable.inputs.GetTableIamPolicyArgs;
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
     *          final var policy = BigtableFunctions.getTableIamPolicy(GetTableIamPolicyArgs.builder()
     *              .instanceName(instance.name())
     *              .table(table.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getTableIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GetTableIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigtable.outputs.GetTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GetTableIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigtable.BigtableFunctions.getTableIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage IAM policies on bigtable tables. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigtable.TableIamPolicy`: Authoritative. Sets the IAM policy for the tables and replaces any existing policy already attached.
   *  * `gcp.bigtable.TableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved.
   *  * `gcp.bigtable.TableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved.
   * 
   *  &gt; **Note:** `gcp.bigtable.TableIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.TableIamBinding` and `gcp.bigtable.TableIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the table as `gcp.bigtable.TableIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.bigtable.TableIamBinding` resources **can be** used in conjunction with `gcp.bigtable.TableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigtable.TableIamPolicy
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
   *  import com.pulumi.gcp.bigtable.TableIamPolicy;
   *  import com.pulumi.gcp.bigtable.TableIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new TableIamPolicy("editor", TableIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instanceName("your-bigtable-instance")
   *              .table("your-bigtable-table")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamBinding;
   *  import com.pulumi.gcp.bigtable.TableIamBindingArgs;
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
   *          var editor = new TableIamBinding("editor", TableIamBindingArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamMember;
   *  import com.pulumi.gcp.bigtable.TableIamMemberArgs;
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
   *          var editor = new TableIamMember("editor", TableIamMemberArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamPolicy
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
   *  import com.pulumi.gcp.bigtable.TableIamPolicy;
   *  import com.pulumi.gcp.bigtable.TableIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new TableIamPolicy("editor", TableIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instanceName("your-bigtable-instance")
   *              .table("your-bigtable-table")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamBinding;
   *  import com.pulumi.gcp.bigtable.TableIamBindingArgs;
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
   *          var editor = new TableIamBinding("editor", TableIamBindingArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.TableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.TableIamMember;
   *  import com.pulumi.gcp.bigtable.TableIamMemberArgs;
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
   *          var editor = new TableIamMember("editor", TableIamMemberArgs.builder()
   *              .table("your-bigtable-table")
   *              .instanceName("your-bigtable-instance")
   *              .role("roles/bigtable.user")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TableIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.TableIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.TableIamMemberArgs.builder
    com.pulumi.gcp.bigtable.TableIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigtable.TableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.TableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * App profile is a configuration object describing how Cloud Bigtable should treat traffic from a particular end user application.
   * 
   *  To get more information about AppProfile, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.appProfiles)
   */
  def AppProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.AppProfileArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.AppProfileArgs.builder
    com.pulumi.gcp.bigtable.AppProfile(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a Google Cloud Bigtable authorized view inside a table. For more information see
   *  [the official documentation](https://cloud.google.com/bigtable/) and
   *  [API](https://cloud.google.com/bigtable/docs/go/reference).
   * 
   *  &gt; **Note:** It is strongly recommended to set `lifecycle { preventDestroy = true }`
   *  on authorized views in order to prevent accidental data loss. See
   *  Terraform docs
   *  for more information on lifecycle parameters.
   */
  def AuthorizedView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.AuthorizedViewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.bigtable.AuthorizedViewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.bigtable.AuthorizedView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigtable.GCPolicyArgs.Builder)
    /**
     * @param maxAge GC policy that applies to all cells older than the given age.
     * @return builder
     */
    def maxAge(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.Builder]):
        com.pulumi.gcp.bigtable.GCPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.builder
      builder.maxAge(args(argsBuilder).build)

    /**
     * @param maxVersions GC policy that applies to all versions of a cell except for the most recent.
     * @return builder
     */
    def maxVersions(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.Builder]*):
        com.pulumi.gcp.bigtable.GCPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.builder
      builder.maxVersions(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage IAM policies on bigtable instances. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigtable.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.bigtable.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.bigtable.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.bigtable.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.InstanceIamBinding` and `gcp.bigtable.InstanceIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the instance as `gcp.bigtable.InstanceIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.bigtable.InstanceIamBinding` resources **can be** used in conjunction with `gcp.bigtable.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigtable.InstanceIamPolicy
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
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicy;
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new InstanceIamPolicy("editor", InstanceIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instance("your-bigtable-instance")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamBinding;
   *  import com.pulumi.gcp.bigtable.InstanceIamBindingArgs;
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
   *          var editor = new InstanceIamBinding("editor", InstanceIamBindingArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamMember;
   *  import com.pulumi.gcp.bigtable.InstanceIamMemberArgs;
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
   *          var editor = new InstanceIamMember("editor", InstanceIamMemberArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamPolicy
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
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicy;
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new InstanceIamPolicy("editor", InstanceIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instance("your-bigtable-instance")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamBinding;
   *  import com.pulumi.gcp.bigtable.InstanceIamBindingArgs;
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
   *          var editor = new InstanceIamBinding("editor", InstanceIamBindingArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamMember;
   *  import com.pulumi.gcp.bigtable.InstanceIamMemberArgs;
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
   *          var editor = new InstanceIamMember("editor", InstanceIamMemberArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def InstanceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.InstanceIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.InstanceIamPolicyArgs.builder
    com.pulumi.gcp.bigtable.InstanceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A logical view object that can be referenced in SQL queries.
   * 
   *  To get more information about LogicalView, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.logicalViews)
   */
  def LogicalView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.LogicalViewArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.LogicalViewArgs.builder
    com.pulumi.gcp.bigtable.LogicalView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a Google Bigtable instance. For more information see:
   * 
   *  * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.clusters)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/bigtable/docs)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.bigtable.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.bigtable.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigtable.InstanceIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.InstanceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage IAM policies on bigtable instances. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigtable.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.bigtable.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.bigtable.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.bigtable.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.InstanceIamBinding` and `gcp.bigtable.InstanceIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the instance as `gcp.bigtable.InstanceIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.bigtable.InstanceIamBinding` resources **can be** used in conjunction with `gcp.bigtable.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigtable.InstanceIamPolicy
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
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicy;
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new InstanceIamPolicy("editor", InstanceIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instance("your-bigtable-instance")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamBinding;
   *  import com.pulumi.gcp.bigtable.InstanceIamBindingArgs;
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
   *          var editor = new InstanceIamBinding("editor", InstanceIamBindingArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamMember;
   *  import com.pulumi.gcp.bigtable.InstanceIamMemberArgs;
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
   *          var editor = new InstanceIamMember("editor", InstanceIamMemberArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamPolicy
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
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicy;
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new InstanceIamPolicy("editor", InstanceIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instance("your-bigtable-instance")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamBinding;
   *  import com.pulumi.gcp.bigtable.InstanceIamBindingArgs;
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
   *          var editor = new InstanceIamBinding("editor", InstanceIamBindingArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamMember;
   *  import com.pulumi.gcp.bigtable.InstanceIamMemberArgs;
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
   *          var editor = new InstanceIamMember("editor", InstanceIamMemberArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def InstanceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.InstanceIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.InstanceIamBindingArgs.builder
    com.pulumi.gcp.bigtable.InstanceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A schema bundle object that can be referenced in SQL queries.
   * 
   *  To get more information about SchemaBundle, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.tables.schemaBundles)
   */
  def SchemaBundle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.SchemaBundleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.SchemaBundleArgs.builder
    com.pulumi.gcp.bigtable.SchemaBundle(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigtable.TableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.TableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Creates a Google Cloud Bigtable GC Policy inside a family. For more information see
   *  [the official documentation](https://cloud.google.com/bigtable/) and
   *  [API](https://cloud.google.com/bigtable/docs/go/reference).
   * 
   *  &gt; **Warning**: We don&#39;t recommend having multiple GC policies for the same column
   *  family as it may result in unexpected behavior.
   * 
   *  &gt; **Note**: GC policies associated with a replicated table cannot be destroyed directly.
   *  Destroying a GC policy is translated into never perform garbage collection, this is
   *  considered relaxing from pure age-based or version-based GC policy, hence not allowed.
   *  The workaround is unreplicating the instance first by updating the instance to have one
   *  cluster.
   */
  def GCPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.GCPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.GCPolicyArgs.builder
    com.pulumi.gcp.bigtable.GCPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A materialized view object that can be referenced in SQL queries.
   * 
   *  To get more information about MaterializedView, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.materializedViews)
   */
  def MaterializedView(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.MaterializedViewArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.MaterializedViewArgs.builder
    com.pulumi.gcp.bigtable.MaterializedView(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage IAM policies on bigtable instances. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigtable.InstanceIamPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   *  * `gcp.bigtable.InstanceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.bigtable.InstanceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.bigtable.InstanceIamPolicy` **cannot** be used in conjunction with `gcp.bigtable.InstanceIamBinding` and `gcp.bigtable.InstanceIamMember` or they will fight over what your policy should be. In addition, be careful not to accidentally unset ownership of the instance as `gcp.bigtable.InstanceIamPolicy` replaces the entire policy.
   * 
   *  &gt; **Note:** `gcp.bigtable.InstanceIamBinding` resources **can be** used in conjunction with `gcp.bigtable.InstanceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigtable.InstanceIamPolicy
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
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicy;
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new InstanceIamPolicy("editor", InstanceIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instance("your-bigtable-instance")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamBinding;
   *  import com.pulumi.gcp.bigtable.InstanceIamBindingArgs;
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
   *          var editor = new InstanceIamBinding("editor", InstanceIamBindingArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamMember;
   *  import com.pulumi.gcp.bigtable.InstanceIamMemberArgs;
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
   *          var editor = new InstanceIamMember("editor", InstanceIamMemberArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamPolicy
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
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicy;
   *  import com.pulumi.gcp.bigtable.InstanceIamPolicyArgs;
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
   *                  .role("roles/bigtable.user")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new InstanceIamPolicy("editor", InstanceIamPolicyArgs.builder()
   *              .project("your-project")
   *              .instance("your-bigtable-instance")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamBinding;
   *  import com.pulumi.gcp.bigtable.InstanceIamBindingArgs;
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
   *          var editor = new InstanceIamBinding("editor", InstanceIamBindingArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigtable.InstanceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigtable.InstanceIamMember;
   *  import com.pulumi.gcp.bigtable.InstanceIamMemberArgs;
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
   *          var editor = new InstanceIamMember("editor", InstanceIamMemberArgs.builder()
   *              .instance("your-bigtable-instance")
   *              .role("roles/bigtable.user")
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
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def InstanceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigtable.InstanceIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigtable.InstanceIamMemberArgs.builder
    com.pulumi.gcp.bigtable.InstanceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.SchemaBundleState.Builder)
    /**
     * @param protoSchema File descriptor set, generated by protoc.
     *  To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     *  $ protoc --include_imports --include_source_info test.proto -o out.pb
     *  Structure is documented below.
     * @return builder
     */
    def protoSchema(args: Endofunction[com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.SchemaBundleState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.builder
      builder.protoSchema(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder)
    /**
     * @param dataBoostIsolationReadOnly Specifies that this app profile is intended for read-only usage via the Data Boost feature.
     *  Structure is documented below.
     * @return builder
     */
    def dataBoostIsolationReadOnly(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileDataBoostIsolationReadOnlyArgs.builder
      builder.dataBoostIsolationReadOnly(args(argsBuilder).build)

    /**
     * @param singleClusterRouting Use a single-cluster routing policy.
     *  Structure is documented below.
     * @return builder
     */
    def singleClusterRouting(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileSingleClusterRoutingArgs.builder
      builder.singleClusterRouting(args(argsBuilder).build)

    /**
     * @param standardIsolation The standard options used for isolating this app profile&#39;s traffic from other use cases.
     *  Structure is documented below.
     * @return builder
     */
    def standardIsolation(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AppProfileState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AppProfileStandardIsolationArgs.builder
      builder.standardIsolation(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.TableState.Builder)
    /**
     * @param automatedBackupPolicy Defines an automated backup policy for a table, specified by Retention Period and Frequency. To _create_ a table with automated backup disabled, either omit the automatedBackupPolicy argument, or set both Retention Period and Frequency properties to &#34;0&#34;. To disable automated backup on an _existing_ table that has automated backup enabled, set _both_ Retention Period and Frequency properties to &#34;0&#34;. When updating an existing table, to modify the Retention Period or Frequency properties of the resource&#39;s automated backup policy, set the respective property to a non-zero value. If the automatedBackupPolicy argument is not provided in the configuration on update, the resource&#39;s automated backup policy will _not_ be modified.
     * 
     *  ***
     * @return builder
     */
    def automatedBackupPolicy(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableAutomatedBackupPolicyArgs.builder
      builder.automatedBackupPolicy(args(argsBuilder).build)

    /**
     * @param columnFamilies A group of columns within a table which share a common configuration. This can be specified multiple times. Structure is documented below.
     * @return builder
     */
    def columnFamilies(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.TableState.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.TableColumnFamilyArgs.builder
      builder.columnFamilies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.inputs.AuthorizedViewState.Builder)
    /**
     * @param subsetView An AuthorizedView permitting access to an explicit subset of a Table. Structure is documented below.
     * 
     *  ***
     * @return builder
     */
    def subsetView(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.AuthorizedViewState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.builder
      builder.subsetView(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.GCPolicyState.Builder)
    /**
     * @param maxAge GC policy that applies to all cells older than the given age.
     * @return builder
     */
    def maxAge(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.GCPolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeArgs.builder
      builder.maxAge(args(argsBuilder).build)

    /**
     * @param maxVersions GC policy that applies to all versions of a cell except for the most recent.
     * @return builder
     */
    def maxVersions(args: Endofunction[com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.GCPolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionArgs.builder
      builder.maxVersions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.inputs.TableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.TableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder)
    /**
     * @param autoscalingConfig [Autoscaling](https://cloud.google.com/bigtable/docs/autoscaling#parameters) config for the cluster, contains the following arguments:
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceClusterAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceClusterAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.InstanceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder)
    /**
     * @param familySubsets A group of column family subsets to be included in the authorized view. This can be specified multiple times. Structure is documented below.
     * 
     *  ***
     * @return builder
     */
    def familySubsets(args: Endofunction[com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewFamilySubsetArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.AuthorizedViewSubsetViewFamilySubsetArgs.builder
      builder.familySubsets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigtable.inputs.TableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.TableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.TableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigtable.inputs.InstanceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigtable.inputs.InstanceState.Builder)
    /**
     * @param clusters A block of cluster configuration options. This can be specified at least once, and up
     *  to as many as possible within 8 cloud regions. Removing the field entirely from the config will cause the provider
     *  to default to the backend value. See structure below.
     * 
     *  ***
     * @return builder
     */
    def clusters(args: Endofunction[com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.Builder]*):
        com.pulumi.gcp.bigtable.inputs.InstanceState.Builder =
      def argsBuilder = com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs.builder
      builder.clusters(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.bigtable.inputs.InstanceState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.bigtable.SchemaBundleArgs.Builder)
    /**
     * @param protoSchema File descriptor set, generated by protoc.
     *  To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     *  $ protoc --include_imports --include_source_info test.proto -o out.pb
     *  Structure is documented below.
     * @return builder
     */
    def protoSchema(args: Endofunction[com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.Builder]):
        com.pulumi.gcp.bigtable.SchemaBundleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigtable.inputs.SchemaBundleProtoSchemaArgs.builder
      builder.protoSchema(args(argsBuilder).build)
