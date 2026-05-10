package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object datacatalog:
  extension (builder: com.pulumi.gcp.datacatalog.TagTemplateArgs.Builder)
    /**
     * @param fields Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields. The change of fieldId will be resulting in re-creating of field. The change of primitiveType will be resulting in re-creating of field, however if the field is a required, you cannot update it.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.TagTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage your IAM policy for Data Catalog Taxonomy. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Authoritative. Sets the IAM policy for the taxonomy and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TaxonomyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the taxonomy are preserved.
   *  * `gcp.datacatalog.TaxonomyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the taxonomy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Retrieves the IAM policy for the taxonomy
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TaxonomyIamBinding` and `gcp.datacatalog.TaxonomyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TaxonomyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TaxonomyIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TaxonomyIamPolicy("policy", TaxonomyIamPolicyArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBinding;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TaxonomyIamBinding("binding", TaxonomyIamBindingArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMember;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TaxonomyIamMember("member", TaxonomyIamMemberArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
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
   *  # IAM policy for Data Catalog Taxonomy
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog Taxonomy. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Authoritative. Sets the IAM policy for the taxonomy and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TaxonomyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the taxonomy are preserved.
   *  * `gcp.datacatalog.TaxonomyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the taxonomy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Retrieves the IAM policy for the taxonomy
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TaxonomyIamBinding` and `gcp.datacatalog.TaxonomyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TaxonomyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TaxonomyIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TaxonomyIamPolicy("policy", TaxonomyIamPolicyArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBinding;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TaxonomyIamBinding("binding", TaxonomyIamBindingArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMember;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TaxonomyIamMember("member", TaxonomyIamMemberArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
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
   *  * projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}}
   *  * {{project}}/{{region}}/{{taxonomy}}
   *  * {{region}}/{{taxonomy}}
   *  * {{taxonomy}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog taxonomy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_taxonomy_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_taxonomy_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/taxonomyIamBinding:TaxonomyIamBinding editor projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaxonomyIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs.builder
    com.pulumi.gcp.datacatalog.TaxonomyIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Data Catalog Taxonomy. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Authoritative. Sets the IAM policy for the taxonomy and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TaxonomyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the taxonomy are preserved.
   *  * `gcp.datacatalog.TaxonomyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the taxonomy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Retrieves the IAM policy for the taxonomy
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TaxonomyIamBinding` and `gcp.datacatalog.TaxonomyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TaxonomyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TaxonomyIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TaxonomyIamPolicy("policy", TaxonomyIamPolicyArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBinding;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TaxonomyIamBinding("binding", TaxonomyIamBindingArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMember;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TaxonomyIamMember("member", TaxonomyIamMemberArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
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
   *  # IAM policy for Data Catalog Taxonomy
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog Taxonomy. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Authoritative. Sets the IAM policy for the taxonomy and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TaxonomyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the taxonomy are preserved.
   *  * `gcp.datacatalog.TaxonomyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the taxonomy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Retrieves the IAM policy for the taxonomy
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TaxonomyIamBinding` and `gcp.datacatalog.TaxonomyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TaxonomyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TaxonomyIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TaxonomyIamPolicy("policy", TaxonomyIamPolicyArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBinding;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TaxonomyIamBinding("binding", TaxonomyIamBindingArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMember;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TaxonomyIamMember("member", TaxonomyIamMemberArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
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
   *  * projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}}
   *  * {{project}}/{{region}}/{{taxonomy}}
   *  * {{region}}/{{taxonomy}}
   *  * {{taxonomy}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog taxonomy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_taxonomy_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_taxonomy_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/taxonomyIamMember:TaxonomyIamMember editor projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaxonomyIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs.builder
    com.pulumi.gcp.datacatalog.TaxonomyIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Data Catalog PolicyTag. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Authoritative. Sets the IAM policy for the policytag and replaces any existing policy already attached.
   *  * `gcp.datacatalog.PolicyTagIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the policytag are preserved.
   *  * `gcp.datacatalog.PolicyTagIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the policytag are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Retrieves the IAM policy for the policytag
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.PolicyTagIamBinding` and `gcp.datacatalog.PolicyTagIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.PolicyTagIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.PolicyTagIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicy;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new PolicyTagIamPolicy("policy", PolicyTagIamPolicyArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBinding;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new PolicyTagIamBinding("binding", PolicyTagIamBindingArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMember;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new PolicyTagIamMember("member", PolicyTagIamMemberArgs.builder()
   *              .policyTag(basicPolicyTag.name())
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
   *  # IAM policy for Data Catalog PolicyTag
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog PolicyTag. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Authoritative. Sets the IAM policy for the policytag and replaces any existing policy already attached.
   *  * `gcp.datacatalog.PolicyTagIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the policytag are preserved.
   *  * `gcp.datacatalog.PolicyTagIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the policytag are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Retrieves the IAM policy for the policytag
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.PolicyTagIamBinding` and `gcp.datacatalog.PolicyTagIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.PolicyTagIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.PolicyTagIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicy;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new PolicyTagIamPolicy("policy", PolicyTagIamPolicyArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBinding;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new PolicyTagIamBinding("binding", PolicyTagIamBindingArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMember;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new PolicyTagIamMember("member", PolicyTagIamMemberArgs.builder()
   *              .policyTag(basicPolicyTag.name())
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
   *  * {{policy_tag}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog policytag IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_policy_tag_iam_member.editor &#34;{{policy_tag}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_policy_tag_iam_binding.editor &#34;{{policy_tag}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/policyTagIamPolicy:PolicyTagIamPolicy editor {{policy_tag}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def PolicyTagIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs.builder
    com.pulumi.gcp.datacatalog.PolicyTagIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** `gcp.datacatalog.Tag` is deprecated and will be removed in a future major release. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Tags are used to attach custom metadata to Data Catalog resources. Tags conform to the specifications within their tag template.
   * 
   *  See [Data Catalog IAM](https://cloud.google.com/data-catalog/docs/concepts/iam) for information on the permissions needed to create or view tags.
   * 
   *  To get more information about Tag, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.tags)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-catalog/docs)
   */
  def Tag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TagArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TagArgs.builder
    com.pulumi.gcp.datacatalog.Tag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Data Catalog Taxonomy. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Authoritative. Sets the IAM policy for the taxonomy and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TaxonomyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the taxonomy are preserved.
   *  * `gcp.datacatalog.TaxonomyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the taxonomy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Retrieves the IAM policy for the taxonomy
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TaxonomyIamBinding` and `gcp.datacatalog.TaxonomyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TaxonomyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TaxonomyIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TaxonomyIamPolicy("policy", TaxonomyIamPolicyArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBinding;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TaxonomyIamBinding("binding", TaxonomyIamBindingArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMember;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TaxonomyIamMember("member", TaxonomyIamMemberArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
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
   *  # IAM policy for Data Catalog Taxonomy
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog Taxonomy. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Authoritative. Sets the IAM policy for the taxonomy and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TaxonomyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the taxonomy are preserved.
   *  * `gcp.datacatalog.TaxonomyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the taxonomy are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TaxonomyIamPolicy`: Retrieves the IAM policy for the taxonomy
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TaxonomyIamBinding` and `gcp.datacatalog.TaxonomyIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TaxonomyIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TaxonomyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TaxonomyIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TaxonomyIamPolicy("policy", TaxonomyIamPolicyArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBinding;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TaxonomyIamBinding("binding", TaxonomyIamBindingArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TaxonomyIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMember;
   *  import com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TaxonomyIamMember("member", TaxonomyIamMemberArgs.builder()
   *              .taxonomy(basicTaxonomy.name())
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
   *  * projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}}
   *  * {{project}}/{{region}}/{{taxonomy}}
   *  * {{region}}/{{taxonomy}}
   *  * {{taxonomy}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog taxonomy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_taxonomy_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_taxonomy_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/taxonomyIamPolicy:TaxonomyIamPolicy editor projects/{{project}}/locations/{{region}}/taxonomies/{{taxonomy}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TaxonomyIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TaxonomyIamPolicyArgs.builder
    com.pulumi.gcp.datacatalog.TaxonomyIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TagArgs.Builder)
    /**
     * @param fields This maps the ID of a tag field to the value of and additional information about that field.
     *  Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.TagArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
   *  * `gcp.datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TagTemplateIamBinding` and `gcp.datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TagTemplateIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TagTemplateIamPolicy("policy", TagTemplateIamPolicyArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBinding;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TagTemplateIamBinding("binding", TagTemplateIamBindingArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMember;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TagTemplateIamMember("member", TagTemplateIamMemberArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
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
   *  # IAM policy for Data Catalog TagTemplate
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
   *  * `gcp.datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TagTemplateIamBinding` and `gcp.datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TagTemplateIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TagTemplateIamPolicy("policy", TagTemplateIamPolicyArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBinding;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TagTemplateIamBinding("binding", TagTemplateIamBindingArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMember;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TagTemplateIamMember("member", TagTemplateIamMemberArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
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
   *  * projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
   *  * {{project}}/{{region}}/{{tag_template}}
   *  * {{region}}/{{tag_template}}
   *  * {{tag_template}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog tagtemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_tag_template_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_tag_template_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/tagTemplateIamBinding:TagTemplateIamBinding editor projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TagTemplateIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs.builder
    com.pulumi.gcp.datacatalog.TagTemplateIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.EntryArgs.Builder)
    /**
     * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     *  Structure is documented below.
     * @return builder
     */
    def gcsFilesetSpec(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder]):
        com.pulumi.gcp.datacatalog.EntryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.builder
      builder.gcsFilesetSpec(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Data Catalog PolicyTag. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Authoritative. Sets the IAM policy for the policytag and replaces any existing policy already attached.
   *  * `gcp.datacatalog.PolicyTagIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the policytag are preserved.
   *  * `gcp.datacatalog.PolicyTagIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the policytag are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Retrieves the IAM policy for the policytag
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.PolicyTagIamBinding` and `gcp.datacatalog.PolicyTagIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.PolicyTagIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.PolicyTagIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicy;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new PolicyTagIamPolicy("policy", PolicyTagIamPolicyArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBinding;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new PolicyTagIamBinding("binding", PolicyTagIamBindingArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMember;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new PolicyTagIamMember("member", PolicyTagIamMemberArgs.builder()
   *              .policyTag(basicPolicyTag.name())
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
   *  # IAM policy for Data Catalog PolicyTag
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog PolicyTag. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Authoritative. Sets the IAM policy for the policytag and replaces any existing policy already attached.
   *  * `gcp.datacatalog.PolicyTagIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the policytag are preserved.
   *  * `gcp.datacatalog.PolicyTagIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the policytag are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Retrieves the IAM policy for the policytag
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.PolicyTagIamBinding` and `gcp.datacatalog.PolicyTagIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.PolicyTagIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.PolicyTagIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicy;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new PolicyTagIamPolicy("policy", PolicyTagIamPolicyArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBinding;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new PolicyTagIamBinding("binding", PolicyTagIamBindingArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMember;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new PolicyTagIamMember("member", PolicyTagIamMemberArgs.builder()
   *              .policyTag(basicPolicyTag.name())
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
   *  * {{policy_tag}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog policytag IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_policy_tag_iam_member.editor &#34;{{policy_tag}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_policy_tag_iam_binding.editor &#34;{{policy_tag}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/policyTagIamMember:PolicyTagIamMember editor {{policy_tag}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def PolicyTagIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs.builder
    com.pulumi.gcp.datacatalog.PolicyTagIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Data Catalog PolicyTag. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Authoritative. Sets the IAM policy for the policytag and replaces any existing policy already attached.
   *  * `gcp.datacatalog.PolicyTagIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the policytag are preserved.
   *  * `gcp.datacatalog.PolicyTagIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the policytag are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Retrieves the IAM policy for the policytag
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.PolicyTagIamBinding` and `gcp.datacatalog.PolicyTagIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.PolicyTagIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.PolicyTagIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicy;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new PolicyTagIamPolicy("policy", PolicyTagIamPolicyArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBinding;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new PolicyTagIamBinding("binding", PolicyTagIamBindingArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMember;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new PolicyTagIamMember("member", PolicyTagIamMemberArgs.builder()
   *              .policyTag(basicPolicyTag.name())
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
   *  # IAM policy for Data Catalog PolicyTag
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog PolicyTag. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Authoritative. Sets the IAM policy for the policytag and replaces any existing policy already attached.
   *  * `gcp.datacatalog.PolicyTagIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the policytag are preserved.
   *  * `gcp.datacatalog.PolicyTagIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the policytag are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.PolicyTagIamPolicy`: Retrieves the IAM policy for the policytag
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.PolicyTagIamBinding` and `gcp.datacatalog.PolicyTagIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.PolicyTagIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.PolicyTagIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.PolicyTagIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicy;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new PolicyTagIamPolicy("policy", PolicyTagIamPolicyArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBinding;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new PolicyTagIamBinding("binding", PolicyTagIamBindingArgs.builder()
   *              .policyTag(basicPolicyTag.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.PolicyTagIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMember;
   *  import com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new PolicyTagIamMember("member", PolicyTagIamMemberArgs.builder()
   *              .policyTag(basicPolicyTag.name())
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
   *  * {{policy_tag}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog policytag IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_policy_tag_iam_member.editor &#34;{{policy_tag}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_policy_tag_iam_binding.editor &#34;{{policy_tag}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/policyTagIamBinding:PolicyTagIamBinding editor {{policy_tag}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def PolicyTagIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs.builder
    com.pulumi.gcp.datacatalog.PolicyTagIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  An EntryGroup resource represents a logical grouping of zero or more Data Catalog Entry resources.
   * 
   *  To get more information about EntryGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-catalog/docs)
   */
  def EntryGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.EntryGroupArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.EntryGroupArgs.builder
    com.pulumi.gcp.datacatalog.EntryGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A collection of policy tags that classify data along a common axis.
   * 
   *  To get more information about Taxonomy, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.taxonomies)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-catalog/docs)
   */
  def Taxonomy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TaxonomyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TaxonomyArgs.builder
    com.pulumi.gcp.datacatalog.Taxonomy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.datacatalog.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.datacatalog.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.EntryGroupIamBinding` and `gcp.datacatalog.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBinding;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMember;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
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
   *  # IAM policy for Data Catalog EntryGroup
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.datacatalog.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.datacatalog.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.EntryGroupIamBinding` and `gcp.datacatalog.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBinding;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMember;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
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
   *  * projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}}
   *  * {{project}}/{{region}}/{{entry_group}}
   *  * {{region}}/{{entry_group}}
   *  * {{entry_group}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/entryGroupIamBinding:EntryGroupIamBinding editor projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs.builder
    com.pulumi.gcp.datacatalog.EntryGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
   *  * `gcp.datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TagTemplateIamBinding` and `gcp.datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TagTemplateIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TagTemplateIamPolicy("policy", TagTemplateIamPolicyArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBinding;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TagTemplateIamBinding("binding", TagTemplateIamBindingArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMember;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TagTemplateIamMember("member", TagTemplateIamMemberArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
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
   *  # IAM policy for Data Catalog TagTemplate
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
   *  * `gcp.datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TagTemplateIamBinding` and `gcp.datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TagTemplateIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TagTemplateIamPolicy("policy", TagTemplateIamPolicyArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBinding;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TagTemplateIamBinding("binding", TagTemplateIamBindingArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMember;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TagTemplateIamMember("member", TagTemplateIamMemberArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
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
   *  * projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
   *  * {{project}}/{{region}}/{{tag_template}}
   *  * {{region}}/{{tag_template}}
   *  * {{tag_template}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog tagtemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_tag_template_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_tag_template_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy editor projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TagTemplateIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs.builder
    com.pulumi.gcp.datacatalog.TagTemplateIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.datacatalog.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.datacatalog.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.EntryGroupIamBinding` and `gcp.datacatalog.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBinding;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMember;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
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
   *  # IAM policy for Data Catalog EntryGroup
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.datacatalog.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.datacatalog.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.EntryGroupIamBinding` and `gcp.datacatalog.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBinding;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMember;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
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
   *  * projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}}
   *  * {{project}}/{{region}}/{{entry_group}}
   *  * {{region}}/{{entry_group}}
   *  * {{entry_group}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/entryGroupIamPolicy:EntryGroupIamPolicy editor projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs.builder
    com.pulumi.gcp.datacatalog.EntryGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type DatacatalogFunctions = com.pulumi.gcp.datacatalog.DatacatalogFunctions
  object DatacatalogFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.datacatalog.DatacatalogFunctions.*
  extension (self: DatacatalogFunctions.type)
    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
     * 
     *  Retrieves the current IAM policy data for entrygroup
     */
    def getEntryGroupIamPolicy(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetEntryGroupIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datacatalog.outputs.GetEntryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetEntryGroupIamPolicyArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getEntryGroupIamPolicy(args(argsBuilder).build)

    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
     * 
     *  Retrieves the current IAM policy data for entrygroup
     */
    def getEntryGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetEntryGroupIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datacatalog.outputs.GetEntryGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetEntryGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getEntryGroupIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for policytag */
    def getPolicyTagIamPolicy(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetPolicyTagIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datacatalog.outputs.GetPolicyTagIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetPolicyTagIamPolicyArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getPolicyTagIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for policytag */
    def getPolicyTagIamPolicyPlain(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetPolicyTagIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datacatalog.outputs.GetPolicyTagIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetPolicyTagIamPolicyPlainArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getPolicyTagIamPolicyPlain(args(argsBuilder).build)

    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
     * 
     *  Retrieves the current IAM policy data for tagtemplate
     */
    def getTagTemplateIamPolicy(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetTagTemplateIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datacatalog.outputs.GetTagTemplateIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetTagTemplateIamPolicyArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getTagTemplateIamPolicy(args(argsBuilder).build)

    /**
     * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
     * 
     *  Retrieves the current IAM policy data for tagtemplate
     */
    def getTagTemplateIamPolicyPlain(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetTagTemplateIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datacatalog.outputs.GetTagTemplateIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetTagTemplateIamPolicyPlainArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getTagTemplateIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for taxonomy */
    def getTaxonomyIamPolicy(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetTaxonomyIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.datacatalog.outputs.GetTaxonomyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetTaxonomyIamPolicyArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getTaxonomyIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for taxonomy */
    def getTaxonomyIamPolicyPlain(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.GetTaxonomyIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.datacatalog.outputs.GetTaxonomyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.GetTaxonomyIamPolicyPlainArgs.builder
      com.pulumi.gcp.datacatalog.DatacatalogFunctions.getTaxonomyIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Denotes one policy tag in a taxonomy.
   * 
   *  To get more information about PolicyTag, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.taxonomies.policyTags)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-catalog/docs)
   */
  def PolicyTag(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.PolicyTagArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.PolicyTagArgs.builder
    com.pulumi.gcp.datacatalog.PolicyTag(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  A tag template defines a tag, which can have one or more typed fields.
   *  The template is used to create and attach the tag to GCP resources.
   * 
   *  To get more information about TagTemplate, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.tagTemplates)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-catalog/docs)
   */
  def TagTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TagTemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TagTemplateArgs.builder
    com.pulumi.gcp.datacatalog.TagTemplate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.datacatalog.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.datacatalog.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.EntryGroupIamBinding` and `gcp.datacatalog.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBinding;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMember;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
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
   *  # IAM policy for Data Catalog EntryGroup
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.EntryGroup` is deprecated and will be removed in a future major release. Use `gcp.dataplex.EntryGroup` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog EntryGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Authoritative. Sets the IAM policy for the entrygroup and replaces any existing policy already attached.
   *  * `gcp.datacatalog.EntryGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the entrygroup are preserved.
   *  * `gcp.datacatalog.EntryGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the entrygroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.EntryGroupIamPolicy`: Retrieves the IAM policy for the entrygroup
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.EntryGroupIamBinding` and `gcp.datacatalog.EntryGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.EntryGroupIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.EntryGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.EntryGroupIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicy;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EntryGroupIamPolicy("policy", EntryGroupIamPolicyArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBinding;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EntryGroupIamBinding("binding", EntryGroupIamBindingArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.EntryGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMember;
   *  import com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EntryGroupIamMember("member", EntryGroupIamMemberArgs.builder()
   *              .entryGroup(basicEntryGroup.name())
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
   *  * projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}}
   *  * {{project}}/{{region}}/{{entry_group}}
   *  * {{region}}/{{entry_group}}
   *  * {{entry_group}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog entrygroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_entry_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_entry_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/entryGroupIamMember:EntryGroupIamMember editor projects/{{project}}/locations/{{region}}/entryGroups/{{entry_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EntryGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs.builder
    com.pulumi.gcp.datacatalog.EntryGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
   *  * `gcp.datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TagTemplateIamBinding` and `gcp.datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TagTemplateIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TagTemplateIamPolicy("policy", TagTemplateIamPolicyArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBinding;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TagTemplateIamBinding("binding", TagTemplateIamBindingArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMember;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TagTemplateIamMember("member", TagTemplateIamMemberArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
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
   *  # IAM policy for Data Catalog TagTemplate
   *  &gt; **Warning:** The parent resource has been deprecated: `gcp.datacatalog.TagTemplate` is deprecated and will be removed in a future major release. Use `gcp.dataplex.AspectType` instead. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Three different resources help you manage your IAM policy for Data Catalog TagTemplate. Each of these resources serves a different use case:
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Authoritative. Sets the IAM policy for the tagtemplate and replaces any existing policy already attached.
   *  * `gcp.datacatalog.TagTemplateIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the tagtemplate are preserved.
   *  * `gcp.datacatalog.TagTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the tagtemplate are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.datacatalog.TagTemplateIamPolicy`: Retrieves the IAM policy for the tagtemplate
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamPolicy` **cannot** be used in conjunction with `gcp.datacatalog.TagTemplateIamBinding` and `gcp.datacatalog.TagTemplateIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.datacatalog.TagTemplateIamBinding` resources **can be** used in conjunction with `gcp.datacatalog.TagTemplateIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.datacatalog.TagTemplateIamPolicy
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
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicy;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new TagTemplateIamPolicy("policy", TagTemplateIamPolicyArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBinding;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TagTemplateIamBinding("binding", TagTemplateIamBindingArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.datacatalog.TagTemplateIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMember;
   *  import com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TagTemplateIamMember("member", TagTemplateIamMemberArgs.builder()
   *              .tagTemplate(basicTagTemplate.name())
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
   *  * projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
   *  * {{project}}/{{region}}/{{tag_template}}
   *  * {{region}}/{{tag_template}}
   *  * {{tag_template}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Data Catalog tagtemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_tag_template_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_data_catalog_tag_template_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:datacatalog/tagTemplateIamMember:TagTemplateIamMember editor projects/{{project}}/locations/{{region}}/tagTemplates/{{tag_template}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TagTemplateIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs.builder
    com.pulumi.gcp.datacatalog.TagTemplateIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** `gcp.datacatalog.Entry` is deprecated and will be removed in a future major release. Data Catalog is deprecated and will be discontinued on January 30, 2026. For steps to transition your Data Catalog users, workloads, and content to Dataplex Catalog, see https://cloud.google.com/dataplex/docs/transition-to-dataplex-catalog.
   * 
   *  Entry Metadata. A Data Catalog Entry resource represents another resource in Google Cloud Platform
   *  (such as a BigQuery dataset or a Pub/Sub topic) or outside of Google Cloud Platform. Clients can use
   *  the linkedResource field in the Entry resource to refer to the original resource ID of the source system.
   * 
   *  An Entry resource contains resource details, such as its schema. An Entry can also be used to attach
   *  flexible metadata, such as a Tag.
   * 
   *  To get more information about Entry, see:
   * 
   *  * [API documentation](https://cloud.google.com/data-catalog/docs/reference/rest/v1/projects.locations.entryGroups.entries)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/data-catalog/docs)
   */
  def Entry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.datacatalog.EntryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.datacatalog.EntryArgs.builder
    com.pulumi.gcp.datacatalog.Entry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder)
    /**
     * @param type The type of value this tag field can contain.
     *  Structure is documented below.
     * @return builder
     */
    def `type`(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.builder
      builder.`type`(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder)
    /**
     * @param tableSpecs (Output)
     *  Spec of a BigQuery table. This field should only be populated if tableSourceType is BIGQUERY_TABLE.
     *  Structure is documented below.
     * @return builder
     */
    def tableSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecTableSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecTableSpecArgs.builder
      builder.tableSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param viewSpecs (Output)
     *  Table view specification. This field should only be populated if tableSourceType is BIGQUERY_VIEW.
     *  Structure is documented below.
     * @return builder
     */
    def viewSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecViewSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecViewSpecArgs.builder
      builder.viewSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagState.Builder)
    /**
     * @param fields This maps the ID of a tag field to the value of and additional information about that field.
     *  Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.TagState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryState.Builder)
    /**
     * @param bigqueryDateShardedSpecs Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD.
     *  Context: https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDateShardedSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryDateShardedSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryDateShardedSpecArgs.builder
      builder.bigqueryDateShardedSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param bigqueryTableSpecs Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryTableSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.builder
      builder.bigqueryTableSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     *  Structure is documented below.
     * @return builder
     */
    def gcsFilesetSpec(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.EntryState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.builder
      builder.gcsFilesetSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.Builder)
    /**
     * @param allowedValues The set of allowed values for this enum. The display names of the
     *  values must be case-insensitively unique within this set. Currently,
     *  enum values can only be added to the list of allowed values. Deletion
     *  and renaming of enum values are not supported.
     *  Can have up to 500 allowed values.
     *  Structure is documented below.
     * @return builder
     */
    def allowedValues(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeAllowedValueArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder
      builder.allowedValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder)
    /**
     * @param sampleGcsFileSpecs (Output)
     *  Sample files contained in this fileset, not all files contained in this fileset are represented here.
     *  Structure is documented below.
     * 
     *  &lt;a name=&#34;nestedGcsFilesetSpecSampleGcsFileSpecs&#34;&gt;&lt;/a&gt;The `sampleGcsFileSpecs` block contains:
     * @return builder
     */
    def sampleGcsFileSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecSampleGcsFileSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecSampleGcsFileSpecArgs.builder
      builder.sampleGcsFileSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateState.Builder)
    /**
     * @param fields Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields. The change of fieldId will be resulting in re-creating of field. The change of primitiveType will be resulting in re-creating of field, however if the field is a required, you cannot update it.
     *  Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.Builder)
    /**
     * @param enumType Represents an enum type.
     *  Exactly one of `primitiveType` or `enumType` must be set
     *  Structure is documented below.
     * @return builder
     */
    def enumType(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.builder
      builder.enumType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
