package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object dns:
  /**
   * A zone is a subtree of the DNS namespace under one administrative
   *  responsibility. A ManagedZone is a resource that represents a DNS zone
   *  hosted by the Cloud DNS service.
   * 
   *  To get more information about ManagedZone, see:
   * 
   *  * [API documentation](https://cloud.google.com/dns/api/v1/managedZones)
   *  * How-to Guides
   *      * [Managing Zones](https://cloud.google.com/dns/zones/)
   */
  def ManagedZone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.ManagedZoneArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dns.ManagedZoneArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dns.ManagedZone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   *  * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
   *  * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.dns.DnsManagedZoneIamPolicy
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.dns.DnsManagedZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   *  ## gcp.dns.DnsManagedZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud DNS ManagedZone
   * 
   *  Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   *  * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
   *  * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.dns.DnsManagedZoneIamPolicy
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.dns.DnsManagedZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   *  ## gcp.dns.DnsManagedZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   *  * projects/{{project}}/managedZones/{{managed_zone}}
   *  * {{project}}/{{managed_zone}}
   *  * {{managed_zone}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud DNS managedzone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dns_managed_zone_iam_member.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dns_managed_zone_iam_binding.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dns/dnsManagedZoneIamBinding:DnsManagedZoneIamBinding editor projects/{{project}}/managedZones/{{managed_zone}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DnsManagedZoneIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.builder
    com.pulumi.gcp.dns.DnsManagedZoneIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a set of DNS records within Google Cloud DNS. For more information see [the official documentation](https://cloud.google.com/dns/docs/records/) and
   *  [API](https://cloud.google.com/dns/api/v1/resourceRecordSets).
   * 
   *  &gt; **Note:** The provider treats this resource as an authoritative record set. This means existing records (including the default records) for the given type will be overwritten when you create this resource in Terraform. In addition, the Google Cloud DNS API requires NS and SOA records to be present at all times, so Terraform will not actually remove NS or SOA records on the root of the zone during destroy but will report that it did.
   */
  def RecordSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.RecordSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dns.RecordSetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dns.RecordSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Response Policy Rule is a selector that applies its behavior to queries that match the selector.
   *  Selectors are DNS names, which may be wildcards or exact matches.
   *  Each DNS query subject to a Response Policy matches at most one ResponsePolicyRule,
   *  as identified by the dnsName field with the longest matching suffix.
   */
  def ResponsePolicyRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.ResponsePolicyRuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dns.ResponsePolicyRuleArgs.builder
    com.pulumi.gcp.dns.ResponsePolicyRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.ResponsePolicyArgs.Builder)
    /**
     * @param gkeClusters The list of Google Kubernetes Engine clusters that can see this zone.
     *  Structure is documented below.
     * @return builder
     */
    def gkeClusters(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.Builder]*):
        com.pulumi.gcp.dns.ResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.builder
      builder.gkeClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param networks The list of network names specifying networks to which this policy is applied.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.ResponsePolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.ManagedZoneArgs.Builder)
    /**
     * @param cloudLoggingConfig Cloud logging configuration
     *  Structure is documented below.
     * @return builder
     */
    def cloudLoggingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.builder
      builder.cloudLoggingConfig(args(argsBuilder).build)

    /**
     * @param dnssecConfig DNSSEC configuration
     *  Structure is documented below.
     * @return builder
     */
    def dnssecConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.builder
      builder.dnssecConfig(args(argsBuilder).build)

    /**
     * @param forwardingConfig The presence for this field indicates that outbound forwarding is enabled
     *  for this zone. The value of this field contains the set of destinations
     *  to forward to.
     *  Structure is documented below.
     * @return builder
     */
    def forwardingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.builder
      builder.forwardingConfig(args(argsBuilder).build)

    /**
     * @param peeringConfig The presence of this field indicates that DNS Peering is enabled for this
     *  zone. The value of this field contains the network to peer with.
     *  Structure is documented below.
     * @return builder
     */
    def peeringConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

    /**
     * @param privateVisibilityConfig For privately visible zones, the set of Virtual Private Cloud
     *  resources that the zone is visible from. At least one of `gkeClusters` or `networks` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def privateVisibilityConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.builder
      builder.privateVisibilityConfig(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig (Optional, Beta)
     *  The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.dns.ManagedZoneArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.ResponsePolicyRuleArgs.Builder)
    /**
     * @param localData Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name;
     *  in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     *  Structure is documented below.
     * @return builder
     */
    def localData(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder]):
        com.pulumi.gcp.dns.ResponsePolicyRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.builder
      builder.localData(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   *  * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
   *  * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.dns.DnsManagedZoneIamPolicy
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.dns.DnsManagedZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   *  ## gcp.dns.DnsManagedZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud DNS ManagedZone
   * 
   *  Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   *  * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
   *  * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.dns.DnsManagedZoneIamPolicy
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.dns.DnsManagedZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   *  ## gcp.dns.DnsManagedZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   *  * projects/{{project}}/managedZones/{{managed_zone}}
   *  * {{project}}/{{managed_zone}}
   *  * {{managed_zone}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud DNS managedzone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dns_managed_zone_iam_member.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dns_managed_zone_iam_binding.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dns/dnsManagedZoneIamMember:DnsManagedZoneIamMember editor projects/{{project}}/managedZones/{{managed_zone}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DnsManagedZoneIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.builder
    com.pulumi.gcp.dns.DnsManagedZoneIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dns.RecordSetArgs.Builder)
    /**
     * @param routingPolicy The configuration for steering traffic based on query.
     *  Now you can specify either Weighted Round Robin(WRR) type or Geolocation(GEO) type.
     *  Structure is documented below.
     * @return builder
     */
    def routingPolicy(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder]):
        com.pulumi.gcp.dns.RecordSetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.builder
      builder.routingPolicy(args(argsBuilder).build)

  /**
   * A Response Policy is a collection of selectors that apply to queries
   *  made against one or more Virtual Private Cloud networks.
   */
  def ResponsePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.ResponsePolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dns.ResponsePolicyArgs.builder
    com.pulumi.gcp.dns.ResponsePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dns.PolicyArgs.Builder)
    /**
     * @param alternativeNameServerConfig Sets an alternative name server for the associated networks.
     *  When specified, all DNS queries are forwarded to a name server that you choose.
     *  Names such as .internal are not available when an alternative name server is specified.
     *  Structure is documented below.
     * @return builder
     */
    def alternativeNameServerConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder]):
        com.pulumi.gcp.dns.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.builder
      builder.alternativeNameServerConfig(args(argsBuilder).build)

    /**
     * @param dns64Config Configurations related to DNS64 for this Policy.
     *  Structure is documented below.
     * @return builder
     */
    def dns64Config(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder]):
        com.pulumi.gcp.dns.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.builder
      builder.dns64Config(args(argsBuilder).build)

    /**
     * @param networks List of network names specifying networks to which this policy is applied.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.PolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  object DnsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get the DNSKEY and DS records of DNSSEC-signed managed zones.
     * 
     *  For more information see the
     *  [official documentation](https://cloud.google.com/dns/docs/dnskeys/)
     *  and [API](https://cloud.google.com/dns/docs/reference/v1/dnsKeys).
     * 
     *  &gt; A gcp.dns.ManagedZone resource must have DNSSEC enabled in order
     *  to contain any DNSKEYs. Queries to managed zones without this setting
     *  enabled will result in a 404 error as the collection of DNSKEYs does
     *  not exist in the DNS API.
     */
    inline def getKeys(args: Endofunction[com.pulumi.gcp.dns.inputs.GetKeysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetKeysResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetKeysArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getKeys(args(argsBuilder).build)

    /**
     * Get the DNSKEY and DS records of DNSSEC-signed managed zones.
     * 
     *  For more information see the
     *  [official documentation](https://cloud.google.com/dns/docs/dnskeys/)
     *  and [API](https://cloud.google.com/dns/docs/reference/v1/dnsKeys).
     * 
     *  &gt; A gcp.dns.ManagedZone resource must have DNSSEC enabled in order
     *  to contain any DNSKEYs. Queries to managed zones without this setting
     *  enabled will result in a 404 error as the collection of DNSKEYs does
     *  not exist in the DNS API.
     */
    inline def getKeysPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetKeysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetKeysResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetKeysPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getKeysPlain(args(argsBuilder).build)

    /**
     * Provides access to a zone&#39;s attributes within Google Cloud DNS.
     *  For more information see
     *  [the official documentation](https://cloud.google.com/dns/zones/)
     *  and
     *  [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.dns.DnsFunctions;
     *  import com.pulumi.gcp.dns.inputs.GetManagedZoneArgs;
     *  import com.pulumi.gcp.dns.RecordSet;
     *  import com.pulumi.gcp.dns.RecordSetArgs;
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
     *          final var envDnsZone = DnsFunctions.getManagedZone(GetManagedZoneArgs.builder()
     *              .name("qa-zone")
     *              .build());
     * 
     *          var dns = new RecordSet("dns", RecordSetArgs.builder()
     *              .name(String.format("my-address.%s", envDnsZone.dnsName()))
     *              .type("TXT")
     *              .ttl(300)
     *              .managedZone(envDnsZone.name())
     *              .rrdatas("test")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getManagedZone(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZoneArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetManagedZoneResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZoneArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZone(args(argsBuilder).build)

    /**
     * Provides access to a zone&#39;s attributes within Google Cloud DNS.
     *  For more information see
     *  [the official documentation](https://cloud.google.com/dns/zones/)
     *  and
     *  [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.dns.DnsFunctions;
     *  import com.pulumi.gcp.dns.inputs.GetManagedZoneArgs;
     *  import com.pulumi.gcp.dns.RecordSet;
     *  import com.pulumi.gcp.dns.RecordSetArgs;
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
     *          final var envDnsZone = DnsFunctions.getManagedZone(GetManagedZoneArgs.builder()
     *              .name("qa-zone")
     *              .build());
     * 
     *          var dns = new RecordSet("dns", RecordSetArgs.builder()
     *              .name(String.format("my-address.%s", envDnsZone.dnsName()))
     *              .type("TXT")
     *              .ttl(300)
     *              .managedZone(envDnsZone.name())
     *              .rrdatas("test")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getManagedZonePlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZonePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetManagedZoneResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZonePlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZonePlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for managedzone */
    inline def getManagedZoneIamPolicy(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetManagedZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZoneIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for managedzone */
    inline def getManagedZoneIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetManagedZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZoneIamPolicyPlain(args(argsBuilder).build)

    /**
     * Provides access to a list of zones within Google Cloud DNS.
     *  For more information see
     *  [the official documentation](https://cloud.google.com/dns/zones/)
     *  and
     *  [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.dns.DnsFunctions;
     *  import com.pulumi.gcp.dns.inputs.GetManagedZonesArgs;
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
     *          final var zones = DnsFunctions.getManagedZones(GetManagedZonesArgs.builder()
     *              .project("my-project-id")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getManagedZones(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZonesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetManagedZonesResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZonesArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZones(args(argsBuilder).build)

    /**
     * Provides access to a list of zones within Google Cloud DNS.
     *  For more information see
     *  [the official documentation](https://cloud.google.com/dns/zones/)
     *  and
     *  [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.dns.DnsFunctions;
     *  import com.pulumi.gcp.dns.inputs.GetManagedZonesArgs;
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
     *          final var zones = DnsFunctions.getManagedZones(GetManagedZonesArgs.builder()
     *              .project("my-project-id")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getManagedZonesPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZonesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetManagedZonesResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZonesPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZonesPlain(args(argsBuilder).build)

    /**
     * Get a DNS record set within Google Cloud DNS
     *  For more information see
     *  [the official documentation](https://cloud.google.com/dns/docs/records)
     *  and
     *  [API](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets)
     */
    inline def getRecordSet(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetRecordSetResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSet(args(argsBuilder).build)

    /**
     * Get a DNS record set within Google Cloud DNS
     *  For more information see
     *  [the official documentation](https://cloud.google.com/dns/docs/records)
     *  and
     *  [API](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets)
     */
    inline def getRecordSetPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetRecordSetResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSetPlain(args(argsBuilder).build)

    /**
     * Get a list of DNS record sets within a Google Cloud DNS managed zone. This data source allows you to list all record sets or filter them by name and type.
     * 
     *  To get more information about Cloud DNS Record Sets, see:
     * 
     *  * [API documentation](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets/list)
     *  * [How-to Guides](https://cloud.google.com/dns/docs/records)
     * 
     *  &gt; **Note:** Filtering by `type` when `name` is not set is performed client-side.
     */
    inline def getRecordSets(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetRecordSetsResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetsArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSets(args(argsBuilder).build)

    /**
     * Get a list of DNS record sets within a Google Cloud DNS managed zone. This data source allows you to list all record sets or filter them by name and type.
     * 
     *  To get more information about Cloud DNS Record Sets, see:
     * 
     *  * [API documentation](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets/list)
     *  * [How-to Guides](https://cloud.google.com/dns/docs/records)
     * 
     *  &gt; **Note:** Filtering by `type` when `name` is not set is performed client-side.
     */
    inline def getRecordSetsPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetRecordSetsResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetsPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSetsPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   *  * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
   *  * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.dns.DnsManagedZoneIamPolicy
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.dns.DnsManagedZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   *  ## gcp.dns.DnsManagedZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud DNS ManagedZone
   * 
   *  Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   *  * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedzone are preserved.
   *  * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedzone are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.dns.DnsManagedZoneIamPolicy
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/dns.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.dns.DnsManagedZoneIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   *  ## gcp.dns.DnsManagedZoneIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
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
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   *  import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   *  import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *              .project(default_.project())
   *              .managedZone(default_.name())
   *              .role("roles/dns.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   *  * projects/{{project}}/managedZones/{{managed_zone}}
   *  * {{project}}/{{managed_zone}}
   *  * {{managed_zone}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud DNS managedzone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_dns_managed_zone_iam_member.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_dns_managed_zone_iam_binding.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:dns/dnsManagedZoneIamPolicy:DnsManagedZoneIamPolicy editor projects/{{project}}/managedZones/{{managed_zone}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DnsManagedZoneIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs.builder
    com.pulumi.gcp.dns.DnsManagedZoneIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A policy is a collection of DNS rules applied to one or more Virtual
   *  Private Cloud resources.
   * 
   *  To get more information about Policy, see:
   * 
   *  * [API documentation](https://cloud.google.com/dns/docs/reference/v1beta2/policies)
   *  * How-to Guides
   *      * [Using DNS server policies](https://cloud.google.com/dns/zones/#using-dns-server-policies)
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.dns.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dns.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dns.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder)
    /**
     * @param gkeClusters The list of Google Kubernetes Engine clusters that can see this zone.
     *  Structure is documented below.
     * @return builder
     */
    def gkeClusters(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigGkeClusterArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigGkeClusterArgs.builder
      builder.gkeClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param networks The list of VPC networks that can see this zone. Until the provider updates to use the Terraform 0.12 SDK in a future release, you
     *  may experience issues with this resource while updating. If you&#39;ve defined a `networks` block and
     *  add another `networks` block while keeping the old block, Terraform will see an incorrect diff
     *  and apply an incorrect update to the resource. If you encounter this issue, remove all `networks`
     *  blocks in an update and then apply another update adding all of them back simultaneously.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder)
    /**
     * @param namespace The namespace associated with the zone.
     *  Structure is documented below.
     * @return builder
     */
    def namespace(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigNamespaceArgs.builder
      builder.namespace(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.Builder)
    /**
     * @param healthCheckedTargets The list of targets to be health checked. Note that if DNSSEC is enabled for this zone, only one of `rrdatas` or `healthCheckedTargets` can be set.
     *  Structure is documented below.
     * @return builder
     */
    def healthCheckedTargets(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.builder
      builder.healthCheckedTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder)
    /**
     * @param targetNetwork The network with which to peer.
     *  Structure is documented below.
     * @return builder
     */
    def targetNetwork(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigTargetNetworkArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigTargetNetworkArgs.builder
      builder.targetNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder)
    /**
     * @param targetNameServers Sets an alternative name server for the associated networks. When specified,
     *  all DNS queries are forwarded to a name server that you choose. Names such as .internal
     *  are not available when an alternative name server is specified.
     *  Structure is documented below.
     * @return builder
     */
    def targetNameServers(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigTargetNameServerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigTargetNameServerArgs.builder
      builder.targetNameServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     *  Structure is documented below.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrHealthCheckedTargetsInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetState.Builder)
    /**
     * @param routingPolicy The configuration for steering traffic based on query.
     *  Now you can specify either Weighted Round Robin(WRR) type or Geolocation(GEO) type.
     *  Structure is documented below.
     * @return builder
     */
    def routingPolicy(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.builder
      builder.routingPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     *  Structure is documented below.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.PolicyState.Builder)
    /**
     * @param alternativeNameServerConfig Sets an alternative name server for the associated networks.
     *  When specified, all DNS queries are forwarded to a name server that you choose.
     *  Names such as .internal are not available when an alternative name server is specified.
     *  Structure is documented below.
     * @return builder
     */
    def alternativeNameServerConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyAlternativeNameServerConfigArgs.builder
      builder.alternativeNameServerConfig(args(argsBuilder).build)

    /**
     * @param dns64Config Configurations related to DNS64 for this Policy.
     *  Structure is documented below.
     * @return builder
     */
    def dns64Config(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.builder
      builder.dns64Config(args(argsBuilder).build)

    /**
     * @param networks List of network names specifying networks to which this policy is applied.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.PolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.PolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder)
    /**
     * @param backupGeos The backup geo targets, which provide a regional failover policy for the otherwise global primary targets.
     *  Structure is document above.
     * @return builder
     */
    def backupGeos(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.builder
      builder.backupGeos(args.map(_(argsBuilder).build)*)

    /**
     * @param primary The list of global primary targets to be health checked.
     *  Structure is documented below.
     * @return builder
     */
    def primary(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupPrimaryArgs.builder
      builder.primary(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder)
    /**
     * @param geos The configuration for Geolocation based routing policy.
     *  Structure is documented below.
     * @return builder
     */
    def geos(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.builder
      builder.geos(args.map(_(argsBuilder).build)*)

    /**
     * @param primaryBackup The configuration for a failover policy with global to regional failover. Queries are responded to with the global primary targets, but if none of the primary targets are healthy, then we fallback to a regional failover policy.
     *  Structure is documented below.
     * @return builder
     */
    def primaryBackup(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupArgs.builder
      builder.primaryBackup(args(argsBuilder).build)

    /**
     * @param wrrs The configuration for Weighted Round Robin based routing policy.
     *  Structure is documented below.
     * @return builder
     */
    def wrrs(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyWrrArgs.builder
      builder.wrrs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.Builder)
    /**
     * @param healthCheckedTargets For A and AAAA types only. The list of targets to be health checked. These can be specified along with `rrdatas` within this item.
     * @return builder
     */
    def healthCheckedTargets(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.builder
      builder.healthCheckedTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.Builder)
    /**
     * @param internalLoadBalancers The list of internal load balancers to health check.
     *  Structure is documented below.
     * @return builder
     */
    def internalLoadBalancers(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsInternalLoadBalancerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyPrimaryBackupBackupGeoHealthCheckedTargetsInternalLoadBalancerArgs.builder
      builder.internalLoadBalancers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder)
    /**
     * @param defaultKeySpecs Specifies parameters that will be used for generating initial DnsKeys
     *  for this ManagedZone. If you provide a spec for keySigning or zoneSigning,
     *  you must also provide one for the other.
     *  defaultKeySpecs can only be updated when the state is `off`.
     *  Structure is documented below.
     * @return builder
     */
    def defaultKeySpecs(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigDefaultKeySpecArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigDefaultKeySpecArgs.builder
      builder.defaultKeySpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.Builder)
    /**
     * @param healthCheckedTargets For A and AAAA types only. The list of targets to be health checked. These can be specified along with `rrdatas` within this item.
     *  Structure is documented below.
     * @return builder
     */
    def healthCheckedTargets(args: Endofunction[com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.Builder]):
        com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.RecordSetRoutingPolicyGeoHealthCheckedTargetsArgs.builder
      builder.healthCheckedTargets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder)
    /**
     * @param localDatas All resource record sets for this selector, one per resource record type. The name must match the dns_name.
     *  Structure is documented below.
     * @return builder
     */
    def localDatas(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataLocalDataArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataLocalDataArgs.builder
      builder.localDatas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.ResponsePolicyRuleState.Builder)
    /**
     * @param localData Answer this query directly with DNS data. These ResourceRecordSets override any other DNS behavior for the matched name;
     *  in particular they override private zones, the public internet, and GCP internal DNS. No SOA nor NS types are allowed.
     *  Structure is documented below.
     * @return builder
     */
    def localData(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ResponsePolicyRuleState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyRuleLocalDataArgs.builder
      builder.localData(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder)
    /**
     * @param cloudLoggingConfig Cloud logging configuration
     *  Structure is documented below.
     * @return builder
     */
    def cloudLoggingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneCloudLoggingConfigArgs.builder
      builder.cloudLoggingConfig(args(argsBuilder).build)

    /**
     * @param dnssecConfig DNSSEC configuration
     *  Structure is documented below.
     * @return builder
     */
    def dnssecConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneDnssecConfigArgs.builder
      builder.dnssecConfig(args(argsBuilder).build)

    /**
     * @param forwardingConfig The presence for this field indicates that outbound forwarding is enabled
     *  for this zone. The value of this field contains the set of destinations
     *  to forward to.
     *  Structure is documented below.
     * @return builder
     */
    def forwardingConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.builder
      builder.forwardingConfig(args(argsBuilder).build)

    /**
     * @param peeringConfig The presence of this field indicates that DNS Peering is enabled for this
     *  zone. The value of this field contains the network to peer with.
     *  Structure is documented below.
     * @return builder
     */
    def peeringConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigArgs.builder
      builder.peeringConfig(args(argsBuilder).build)

    /**
     * @param privateVisibilityConfig For privately visible zones, the set of Virtual Private Cloud
     *  resources that the zone is visible from. At least one of `gkeClusters` or `networks` must be specified.
     *  Structure is documented below.
     * @return builder
     */
    def privateVisibilityConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZonePrivateVisibilityConfigArgs.builder
      builder.privateVisibilityConfig(args(argsBuilder).build)

    /**
     * @param serviceDirectoryConfig (Optional, Beta)
     *  The presence of this field indicates that this zone is backed by Service Directory. The value of this field contains information related to the namespace associated with the zone.
     *  Structure is documented below.
     * @return builder
     */
    def serviceDirectoryConfig(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.Builder]):
        com.pulumi.gcp.dns.inputs.ManagedZoneState.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneServiceDirectoryConfigArgs.builder
      builder.serviceDirectoryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder)
    /**
     * @param targetNameServers List of target name servers to forward to. Cloud DNS will
     *  select the best available name server if more than
     *  one target is given.
     *  Structure is documented below.
     * @return builder
     */
    def targetNameServers(args: Endofunction[com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigTargetNameServerArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigTargetNameServerArgs.builder
      builder.targetNameServers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder)
    /**
     * @param scope The scope to which DNS64 config will be applied to.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.gcp.dns.inputs.PolicyDns64ConfigScopeArgs.Builder]):
        com.pulumi.gcp.dns.inputs.PolicyDns64ConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.dns.inputs.PolicyDns64ConfigScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.dns.inputs.ResponsePolicyState.Builder)
    /**
     * @param gkeClusters The list of Google Kubernetes Engine clusters that can see this zone.
     *  Structure is documented below.
     * @return builder
     */
    def gkeClusters(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ResponsePolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyGkeClusterArgs.builder
      builder.gkeClusters(args.map(_(argsBuilder).build)*)

    /**
     * @param networks The list of network names specifying networks to which this policy is applied.
     *  Structure is documented below.
     * @return builder
     */
    def networks(args: Endofunction[com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.Builder]*):
        com.pulumi.gcp.dns.inputs.ResponsePolicyState.Builder =
      def argsBuilder = com.pulumi.gcp.dns.inputs.ResponsePolicyNetworkArgs.builder
      builder.networks(args.map(_(argsBuilder).build)*)
