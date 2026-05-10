package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object spanner:
  /**
   * A Cloud Spanner instance partition is a unit of Cloud Spanner database capacity
   *  that can be used to partition data and processing capacity within an instance.
   * 
   *  To get more information about InstancePartition, see:
   * 
   *  * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances.instancePartitions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/spanner/docs/geo-partitioning)
   */
  def InstancePartition(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.InstancePartitionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.spanner.InstancePartitionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.spanner.InstancePartition(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.InstanceIAMBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.InstanceIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
   *  * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.DatabaseIAMPolicy
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("My Role")
   *                      .description("Grant permissions on my_role")
   *                      .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMBindingConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMMemberConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
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
   *  # IAM policy for Spanner Databases
   * 
   *  Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
   *  * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.DatabaseIAMPolicy
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("My Role")
   *                      .description("Grant permissions on my_role")
   *                      .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMBindingConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMMemberConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
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
   *  &gt; **Custom Roles:** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * {{project}}/{{instance}}/{{database}}
   *  * {{instance}}/{{database}} (project is taken from provider project)
   */
  def DatabaseIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.DatabaseIAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.spanner.DatabaseIAMBindingArgs.builder
    com.pulumi.gcp.spanner.DatabaseIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.InstancePartitionArgs.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     *  Exactly one of either node_count, processing_units, or autoscalingConfig must be
     *  present. When autoscaling is enabled, nodeCount and processingUnits are treated as
     *  OUTPUT_ONLY fields and reflect the current compute capacity allocated to the
     *  instance partition.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.InstancePartitionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
   *  * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.DatabaseIAMPolicy
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("My Role")
   *                      .description("Grant permissions on my_role")
   *                      .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMBindingConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMMemberConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
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
   *  # IAM policy for Spanner Databases
   * 
   *  Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
   *  * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.DatabaseIAMPolicy
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("My Role")
   *                      .description("Grant permissions on my_role")
   *                      .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMBindingConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMMemberConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
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
   *  &gt; **Custom Roles:** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * {{project}}/{{instance}}/{{database}}
   *  * {{instance}}/{{database}} (project is taken from provider project)
   */
  def DatabaseIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs.builder
    com.pulumi.gcp.spanner.DatabaseIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type SpannerFunctions = com.pulumi.gcp.spanner.SpannerFunctions
  object SpannerFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.spanner.SpannerFunctions.*
  extension (self: SpannerFunctions.type)
    /** Get a spanner database from Google Cloud by its name and instance name. */
    def getDatabase(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetDatabaseArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.spanner.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetDatabaseArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getDatabase(args(argsBuilder).build)

    /** Get a spanner database from Google Cloud by its name and instance name. */
    def getDatabasePlain(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetDatabasePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.spanner.outputs.GetDatabaseResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetDatabasePlainArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getDatabasePlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Spanner database.
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
     *  import com.pulumi.gcp.spanner.SpannerFunctions;
     *  import com.pulumi.gcp.spanner.inputs.GetDatabaseIamPolicyArgs;
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
     *          final var foo = SpannerFunctions.getDatabaseIamPolicy(GetDatabaseIamPolicyArgs.builder()
     *              .project(database.project())
     *              .database(database.name())
     *              .instance(database.instance())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDatabaseIamPolicy(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetDatabaseIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.spanner.outputs.GetDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetDatabaseIamPolicyArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getDatabaseIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Spanner database.
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
     *  import com.pulumi.gcp.spanner.SpannerFunctions;
     *  import com.pulumi.gcp.spanner.inputs.GetDatabaseIamPolicyArgs;
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
     *          final var foo = SpannerFunctions.getDatabaseIamPolicy(GetDatabaseIamPolicyArgs.builder()
     *              .project(database.project())
     *              .database(database.name())
     *              .instance(database.instance())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDatabaseIamPolicyPlain(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetDatabaseIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.spanner.outputs.GetDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetDatabaseIamPolicyPlainArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getDatabaseIamPolicyPlain(args(argsBuilder).build)

    /** Get a spanner instance from Google Cloud by its name. */
    def getInstance(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetInstanceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.spanner.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetInstanceArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getInstance(args(argsBuilder).build)

    /** Get a spanner instance from Google Cloud by its name. */
    def getInstancePlain(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetInstancePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.spanner.outputs.GetInstanceResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetInstancePlainArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getInstancePlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Spanner instance.
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
     *  import com.pulumi.gcp.spanner.SpannerFunctions;
     *  import com.pulumi.gcp.spanner.inputs.GetInstanceIamPolicyArgs;
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
     *          final var foo = SpannerFunctions.getInstanceIamPolicy(GetInstanceIamPolicyArgs.builder()
     *              .project(instance.project())
     *              .instance(instance.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getInstanceIamPolicy(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetInstanceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.spanner.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetInstanceIamPolicyArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getInstanceIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Spanner instance.
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
     *  import com.pulumi.gcp.spanner.SpannerFunctions;
     *  import com.pulumi.gcp.spanner.inputs.GetInstanceIamPolicyArgs;
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
     *          final var foo = SpannerFunctions.getInstanceIamPolicy(GetInstanceIamPolicyArgs.builder()
     *              .project(instance.project())
     *              .instance(instance.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getInstanceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.spanner.inputs.GetInstanceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.spanner.outputs.GetInstanceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.GetInstanceIamPolicyPlainArgs.builder
      com.pulumi.gcp.spanner.SpannerFunctions.getInstanceIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.InstanceArgs.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     *  Exactly one of either num_nodes, processingUnits or autoscalingConfig must be
     *  present in terraform except when instanceType = FREE_INSTANCE.
     *  When autoscaling is enabled, numNodes and processingUnits are treated as,
     *  OUTPUT_ONLY fields and reflect the current compute capacity allocated to
     *  the instance.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  /**
   * A Cloud Spanner Database which is hosted on a Spanner instance.
   * 
   *  To get more information about Database, see:
   * 
   *  * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances.databases)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/spanner/)
   * 
   *  &gt; **Warning:** On newer versions of the provider, you must explicitly set `deletion_protection=false`
   *  (and run `pulumi up` to write the field to state) in order to destroy an instance.
   *  It is recommended to not set this field (or set it to true) until you&#39;re ready to destroy.
   *  On older versions, it is strongly recommended to set `lifecycle { preventDestroy = true }`
   *  on databases in order to prevent accidental data loss.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.spanner.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.spanner.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.DatabaseArgs.Builder)
    /**
     * @param encryptionConfig Encryption configuration for the database
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  /**
   * A backup schedule for a Cloud Spanner Database.
   *  This resource is owned by the database it is backing up, and is deleted along with the database.
   *  The actual backups are not though.
   * 
   *  To get more information about BackupSchedule, see:
   * 
   *  * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances.databases.backupSchedules)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/spanner/docs/backup)
   * 
   *  &gt; **Warning:** This resource creates a Spanner Backup Schedule on a project that already has
   *  a Spanner database.
   *  This resource is owned by the database it is backing up, and is deleted along
   *  with the database. The actual backups are not though.
   */
  def BackupSchedule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.BackupScheduleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.spanner.BackupScheduleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.spanner.BackupSchedule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
   *  * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.DatabaseIAMPolicy
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("My Role")
   *                      .description("Grant permissions on my_role")
   *                      .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMBindingConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMMemberConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
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
   *  # IAM policy for Spanner Databases
   * 
   *  Three different resources help you manage your IAM policy for a Spanner database. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.DatabaseIAMPolicy`: Authoritative. Sets the IAM policy for the database and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your database using `gcp.spanner.DatabaseIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.DatabaseIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the database are preserved.
   *  * `gcp.spanner.DatabaseIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the database are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.DatabaseIAMBinding` and `gcp.spanner.DatabaseIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.DatabaseIAMBinding` resources **can be** used in conjunction with `gcp.spanner.DatabaseIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.DatabaseIAMPolicy
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicy;
   *  import com.pulumi.gcp.spanner.DatabaseIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("My Role")
   *                      .description("Grant permissions on my_role")
   *                      .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var database = new DatabaseIAMPolicy("database", DatabaseIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMBinding;
   *  import com.pulumi.gcp.spanner.DatabaseIAMBindingArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs;
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
   *          var database = new DatabaseIAMBinding("database", DatabaseIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMBindingConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.DatabaseIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
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
   *  import com.pulumi.gcp.spanner.DatabaseIAMMember;
   *  import com.pulumi.gcp.spanner.DatabaseIAMMemberArgs;
   *  import com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs;
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
   *          var database = new DatabaseIAMMember("database", DatabaseIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .database("your-database-name")
   *              .role("roles/compute.networkUser")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DatabaseIAMMemberConditionArgs.builder()
   *                  .title("My Role")
   *                  .description("Grant permissions on my_role")
   *                  .expression("(resource.type == \"spanner.googleapis.com/DatabaseRole\" && (resource.name.endsWith(\"/myrole\")))")
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
   *  &gt; **Custom Roles:** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * {{project}}/{{instance}}/{{database}}
   *  * {{instance}}/{{database}} (project is taken from provider project)
   */
  def DatabaseIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.DatabaseIAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.spanner.DatabaseIAMMemberArgs.builder
    com.pulumi.gcp.spanner.DatabaseIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.DatabaseIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.DatabaseIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for a Spanner instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.InstanceIAMPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your instance using `gcp.spanner.InstanceIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.InstanceIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.spanner.InstanceIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.InstanceIAMBinding` and `gcp.spanner.InstanceIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMBinding` resources **can be** used in conjunction with `gcp.spanner.InstanceIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.InstanceIAMPolicy
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
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicy;
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var instance = new InstanceIAMPolicy("instance", InstanceIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMBinding;
   *  import com.pulumi.gcp.spanner.InstanceIAMBindingArgs;
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
   *          var instance = new InstanceIAMBinding("instance", InstanceIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMMember;
   *  import com.pulumi.gcp.spanner.InstanceIAMMemberArgs;
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
   *          var instance = new InstanceIAMMember("instance", InstanceIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
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
   *  # IAM policy for Spanner Instances
   * 
   *  Three different resources help you manage your IAM policy for a Spanner instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.InstanceIAMPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your instance using `gcp.spanner.InstanceIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.InstanceIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.spanner.InstanceIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.InstanceIAMBinding` and `gcp.spanner.InstanceIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMBinding` resources **can be** used in conjunction with `gcp.spanner.InstanceIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.InstanceIAMPolicy
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
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicy;
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var instance = new InstanceIAMPolicy("instance", InstanceIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMBinding;
   *  import com.pulumi.gcp.spanner.InstanceIAMBindingArgs;
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
   *          var instance = new InstanceIAMBinding("instance", InstanceIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMMember;
   *  import com.pulumi.gcp.spanner.InstanceIAMMemberArgs;
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
   *          var instance = new InstanceIAMMember("instance", InstanceIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
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
  def InstanceIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.InstanceIAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.spanner.InstanceIAMPolicyArgs.builder
    com.pulumi.gcp.spanner.InstanceIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * An isolated set of Cloud Spanner resources on which databases can be
   *  hosted.
   * 
   *  To get more information about Instance, see:
   * 
   *  * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instances)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/spanner/)
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.spanner.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.spanner.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.InstanceIAMMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.InstanceIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for a Spanner instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.InstanceIAMPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your instance using `gcp.spanner.InstanceIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.InstanceIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.spanner.InstanceIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.InstanceIAMBinding` and `gcp.spanner.InstanceIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMBinding` resources **can be** used in conjunction with `gcp.spanner.InstanceIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.InstanceIAMPolicy
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
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicy;
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var instance = new InstanceIAMPolicy("instance", InstanceIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMBinding;
   *  import com.pulumi.gcp.spanner.InstanceIAMBindingArgs;
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
   *          var instance = new InstanceIAMBinding("instance", InstanceIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMMember;
   *  import com.pulumi.gcp.spanner.InstanceIAMMemberArgs;
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
   *          var instance = new InstanceIAMMember("instance", InstanceIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
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
   *  # IAM policy for Spanner Instances
   * 
   *  Three different resources help you manage your IAM policy for a Spanner instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.InstanceIAMPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your instance using `gcp.spanner.InstanceIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.InstanceIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.spanner.InstanceIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.InstanceIAMBinding` and `gcp.spanner.InstanceIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMBinding` resources **can be** used in conjunction with `gcp.spanner.InstanceIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.InstanceIAMPolicy
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
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicy;
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var instance = new InstanceIAMPolicy("instance", InstanceIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMBinding;
   *  import com.pulumi.gcp.spanner.InstanceIAMBindingArgs;
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
   *          var instance = new InstanceIAMBinding("instance", InstanceIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMMember;
   *  import com.pulumi.gcp.spanner.InstanceIAMMemberArgs;
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
   *          var instance = new InstanceIAMMember("instance", InstanceIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
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
  def InstanceIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.InstanceIAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.spanner.InstanceIAMBindingArgs.builder
    com.pulumi.gcp.spanner.InstanceIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.InstanceConfigArgs.Builder)
    /**
     * @param replicas The geographic placement of nodes in this instance configuration and their replication properties.
     *  Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.Builder]*):
        com.pulumi.gcp.spanner.InstanceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  /**
   * A possible configuration for a Cloud Spanner instance. Configurations
   *  define the geographic placement of nodes and their replication.
   * 
   *  To get more information about InstanceConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/spanner/docs/reference/rest/v1/projects.instanceConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/spanner/)
   */
  def InstanceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.InstanceConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.spanner.InstanceConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.spanner.InstanceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.BackupScheduleArgs.Builder)
    /**
     * @param encryptionConfig Configuration for the encryption of the backup schedule.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param fullBackupSpec The schedule creates only full backups..
     * @return builder
     */
    def fullBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.builder
      builder.fullBackupSpec(args(argsBuilder).build)

    /**
     * @param incrementalBackupSpec The schedule creates incremental backup chains.
     * @return builder
     */
    def incrementalBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.builder
      builder.incrementalBackupSpec(args(argsBuilder).build)

    /**
     * @param spec Defines specifications of the backup schedule.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder]):
        com.pulumi.gcp.spanner.BackupScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for a Spanner instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.InstanceIAMPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your instance using `gcp.spanner.InstanceIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.InstanceIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.spanner.InstanceIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.InstanceIAMBinding` and `gcp.spanner.InstanceIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMBinding` resources **can be** used in conjunction with `gcp.spanner.InstanceIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.InstanceIAMPolicy
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
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicy;
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var instance = new InstanceIAMPolicy("instance", InstanceIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMBinding;
   *  import com.pulumi.gcp.spanner.InstanceIAMBindingArgs;
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
   *          var instance = new InstanceIAMBinding("instance", InstanceIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMMember;
   *  import com.pulumi.gcp.spanner.InstanceIAMMemberArgs;
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
   *          var instance = new InstanceIAMMember("instance", InstanceIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
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
   *  # IAM policy for Spanner Instances
   * 
   *  Three different resources help you manage your IAM policy for a Spanner instance. Each of these resources serves a different use case:
   * 
   *  * `gcp.spanner.InstanceIAMPolicy`: Authoritative. Sets the IAM policy for the instance and replaces any existing policy already attached.
   * 
   *  &gt; **Warning:** It&#39;s entirely possibly to lock yourself out of your instance using `gcp.spanner.InstanceIAMPolicy`. Any permissions granted by default will be removed unless you include them in your config.
   * 
   *  * `gcp.spanner.InstanceIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the instance are preserved.
   *  * `gcp.spanner.InstanceIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the instance are preserved.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMPolicy` **cannot** be used in conjunction with `gcp.spanner.InstanceIAMBinding` and `gcp.spanner.InstanceIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.spanner.InstanceIAMBinding` resources **can be** used in conjunction with `gcp.spanner.InstanceIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.spanner.InstanceIAMPolicy
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
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicy;
   *  import com.pulumi.gcp.spanner.InstanceIAMPolicyArgs;
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
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var instance = new InstanceIAMPolicy("instance", InstanceIAMPolicyArgs.builder()
   *              .instance("your-instance-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMBinding;
   *  import com.pulumi.gcp.spanner.InstanceIAMBindingArgs;
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
   *          var instance = new InstanceIAMBinding("instance", InstanceIAMBindingArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.spanner.InstanceIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.spanner.InstanceIAMMember;
   *  import com.pulumi.gcp.spanner.InstanceIAMMemberArgs;
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
   *          var instance = new InstanceIAMMember("instance", InstanceIAMMemberArgs.builder()
   *              .instance("your-instance-name")
   *              .role("roles/spanner.databaseAdmin")
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
  def InstanceIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.spanner.InstanceIAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.spanner.InstanceIAMMemberArgs.builder
    com.pulumi.gcp.spanner.InstanceIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.DatabaseState.Builder)
    /**
     * @param encryptionConfig Encryption configuration for the database
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstancePartitionState.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     *  Exactly one of either node_count, processing_units, or autoscalingConfig must be
     *  present. When autoscaling is enabled, nodeCount and processingUnits are treated as
     *  OUTPUT_ONLY fields and reflect the current compute capacity allocated to the
     *  instance partition.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstancePartitionState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder)
    /**
     * @param encryptionConfig Configuration for the encryption of the backup schedule.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleEncryptionConfigArgs.builder
      builder.encryptionConfig(args(argsBuilder).build)

    /**
     * @param fullBackupSpec The schedule creates only full backups..
     * @return builder
     */
    def fullBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleFullBackupSpecArgs.builder
      builder.fullBackupSpec(args(argsBuilder).build)

    /**
     * @param incrementalBackupSpec The schedule creates incremental backup chains.
     * @return builder
     */
    def incrementalBackupSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleIncrementalBackupSpecArgs.builder
      builder.incrementalBackupSpec(args(argsBuilder).build)

    /**
     * @param spec Defines specifications of the backup schedule.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder)
    /**
     * @param cronSpec Cron style schedule specification..
     *  Structure is documented below.
     * @return builder
     */
    def cronSpec(args: Endofunction[com.pulumi.gcp.spanner.inputs.BackupScheduleSpecCronSpecArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.BackupScheduleSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.BackupScheduleSpecCronSpecArgs.builder
      builder.cronSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceConfigState.Builder)
    /**
     * @param replicas The geographic placement of nodes in this instance configuration and their replication properties.
     *  Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.Builder]*):
        com.pulumi.gcp.spanner.inputs.InstanceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceConfigReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.Builder)
    /**
     * @param autoscalingLimits A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingLimits(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesAutoscalingLimitsArgs.builder
      builder.autoscalingLimits(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceIAMBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder)
    /**
     * @param overrides A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def overrides(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionOverridesArgs.builder
      builder.overrides(args(argsBuilder).build)

    /**
     * @param replicaSelection A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def replicaSelection(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionReplicaSelectionArgs.builder
      builder.replicaSelection(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder)
    /**
     * @param asymmetricAutoscalingOptions Asymmetric autoscaling options for specific replicas.
     *  Structure is documented below.
     * @return builder
     */
    def asymmetricAutoscalingOptions(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.Builder]*):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAsymmetricAutoscalingOptionArgs.builder
      builder.asymmetricAutoscalingOptions(args.map(_(argsBuilder).build)*)

    /**
     * @param autoscalingLimits Defines scale in controls to reduce the risk of response latency
     *  and outages due to abrupt scale-in events. Users can define the minimum and
     *  maximum compute capacity allocated to the instance, and the autoscaler will
     *  only scale within that range. Users can either use nodes or processing
     *  units to specify the limits, but should use the same unit to set both the
     *  minLimit and max_limit.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingLimits(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingLimitsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingLimitsArgs.builder
      builder.autoscalingLimits(args(argsBuilder).build)

    /**
     * @param autoscalingTargets Defines scale in controls to reduce the risk of response latency
     *  and outages due to abrupt scale-in events
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingTargets(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingTargetsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigAutoscalingTargetsArgs.builder
      builder.autoscalingTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder)
    /**
     * @param autoscalingLimits Defines scale in controls to reduce the risk of response latency
     *  and outages due to abrupt scale-in events. Users can define the minimum and
     *  maximum compute capacity allocated to the instance partition, and the autoscaler will
     *  only scale within that range. Users can either use nodes or processing
     *  units to specify the limits, but should use the same unit to set both the
     *  minLimit and max_limit.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingLimits(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingLimitsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingLimitsArgs.builder
      builder.autoscalingLimits(args(argsBuilder).build)

    /**
     * @param autoscalingTargets Defines scale in controls to reduce the risk of response latency
     *  and outages due to abrupt scale-in events
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingTargets(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingTargetsArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstancePartitionAutoscalingConfigAutoscalingTargetsArgs.builder
      builder.autoscalingTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceIAMMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.inputs.InstanceState.Builder)
    /**
     * @param autoscalingConfig The autoscaling configuration. Autoscaling is enabled if this field is set.
     *  Exactly one of either num_nodes, processingUnits or autoscalingConfig must be
     *  present in terraform except when instanceType = FREE_INSTANCE.
     *  When autoscaling is enabled, numNodes and processingUnits are treated as,
     *  OUTPUT_ONLY fields and reflect the current compute capacity allocated to
     *  the instance.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingConfig(args: Endofunction[com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.Builder]):
        com.pulumi.gcp.spanner.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.InstanceAutoscalingConfigArgs.builder
      builder.autoscalingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.spanner.DatabaseIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.spanner.DatabaseIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.spanner.inputs.DatabaseIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
