package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object certificateauthority:
  /**
   * A CertificateAuthority represents an individual Certificate Authority. A
   * CertificateAuthority can be used to create Certificates.
   * 
   * To get more information about CertificateAuthority, see:
   * 
   * * [API documentation](https://cloud.google.com/certificate-authority-service/docs/reference/rest)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/certificate-authority-service)
   * 
   * &gt; **Warning:** On newer versions of the provider, you must explicitly set `deletion_protection=false`
   * (and run `pulumi up` to write the field to state) in order to destroy a CertificateAuthority.
   * It is recommended to not set this field (or set it to true) until you&#39;re ready to destroy.
   */
  def Authority(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.AuthorityArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.certificateauthority.AuthorityArgs.builder
    com.pulumi.gcp.certificateauthority.Authority(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A CaPool represents a group of CertificateAuthorities that form a trust anchor. A CaPool can be used to manage
   * issuance policies for one or more CertificateAuthority resources and to rotate CA certificates in and out of the
   * trust anchor.
   * 
   * To get more information about CaPool, see:
   * 
   * * [API documentation](https://cloud.google.com/certificate-authority-service/docs/reference/rest/v1/projects.locations.caPools)
   * * How-to Guides
   *     * [Certificate Authority Service Overview](https://cloud.google.com/certificate-authority-service/docs/overview)
   */
  def CaPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CaPoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificateauthority.CaPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificateauthority.CaPool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Certificate Authority Service CaPool. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Authoritative. Sets the IAM policy for the capool and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CaPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the capool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CaPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the capool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Retrieves the IAM policy for the capool
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CaPoolIamBinding` and `gcp.certificateauthority.CaPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CaPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CaPoolIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * # IAM policy for Certificate Authority Service CaPool
   * 
   * Three different resources help you manage your IAM policy for Certificate Authority Service CaPool. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Authoritative. Sets the IAM policy for the capool and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CaPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the capool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CaPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the capool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Retrieves the IAM policy for the capool
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CaPoolIamBinding` and `gcp.certificateauthority.CaPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CaPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CaPoolIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * * projects/{{project}}/locations/{{location}}/caPools/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Certificate Authority Service capool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_privateca_ca_pool_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_privateca_ca_pool_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:certificateauthority/caPoolIamBinding:CaPoolIamBinding editor projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def CaPoolIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs.builder
    com.pulumi.gcp.certificateauthority.CaPoolIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Certificate Authority Service CaPool. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Authoritative. Sets the IAM policy for the capool and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CaPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the capool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CaPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the capool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Retrieves the IAM policy for the capool
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CaPoolIamBinding` and `gcp.certificateauthority.CaPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CaPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CaPoolIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * # IAM policy for Certificate Authority Service CaPool
   * 
   * Three different resources help you manage your IAM policy for Certificate Authority Service CaPool. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Authoritative. Sets the IAM policy for the capool and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CaPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the capool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CaPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the capool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Retrieves the IAM policy for the capool
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CaPoolIamBinding` and `gcp.certificateauthority.CaPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CaPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CaPoolIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * * projects/{{project}}/locations/{{location}}/caPools/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Certificate Authority Service capool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_privateca_ca_pool_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_privateca_ca_pool_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:certificateauthority/caPoolIamMember:CaPoolIamMember editor projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def CaPoolIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs.builder
    com.pulumi.gcp.certificateauthority.CaPoolIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Certificate Authority Service CaPool. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Authoritative. Sets the IAM policy for the capool and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CaPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the capool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CaPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the capool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Retrieves the IAM policy for the capool
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CaPoolIamBinding` and `gcp.certificateauthority.CaPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CaPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CaPoolIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * # IAM policy for Certificate Authority Service CaPool
   * 
   * Three different resources help you manage your IAM policy for Certificate Authority Service CaPool. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Authoritative. Sets the IAM policy for the capool and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CaPoolIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the capool are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CaPoolIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the capool are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CaPoolIamPolicy`: Retrieves the IAM policy for the capool
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CaPoolIamBinding` and `gcp.certificateauthority.CaPoolIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CaPoolIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CaPoolIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CaPoolIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs;
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
   *                 .role("roles/privateca.certificateManager")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CaPoolIamPolicy("policy", CaPoolIamPolicyArgs.builder()
   *             .caPool(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBinding;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
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
   *         var binding = new CaPoolIamBinding("binding", CaPoolIamBindingArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CaPoolIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMember;
   * import com.pulumi.gcp.certificateauthority.CaPoolIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CaPoolIamMemberConditionArgs;
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
   *         var member = new CaPoolIamMember("member", CaPoolIamMemberArgs.builder()
   *             .caPool(default_.get("id"))
   *             .role("roles/privateca.certificateManager")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CaPoolIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * * projects/{{project}}/locations/{{location}}/caPools/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Certificate Authority Service capool IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_privateca_ca_pool_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_privateca_ca_pool_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}} roles/privateca.certificateManager&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:certificateauthority/caPoolIamPolicy:CaPoolIamPolicy editor projects/{{project}}/locations/{{location}}/caPools/{{ca_pool}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def CaPoolIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.certificateauthority.CaPoolIamPolicyArgs.builder
    com.pulumi.gcp.certificateauthority.CaPoolIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Certificate corresponds to a signed X.509 certificate issued by a Certificate.
   * 
   * &gt; **Note:** The Certificate Authority that is referenced by this resource **must** be
   * `tier = &#34;ENTERPRISE&#34;`
   */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificateauthority.CertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificateauthority.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Certificate Authority Service provides reusable and parameterized templates that you can use for common certificate issuance scenarios. A certificate template represents a relatively static and well-defined certificate issuance schema within an organization. A certificate template can essentially become a full-fledged vertical certificate issuance framework.
   * 
   * To get more information about CertificateTemplate, see:
   * 
   * * [API documentation](https://cloud.google.com/certificate-authority-service/docs/reference/rest)
   * * How-to Guides
   *     * [Common configurations and Certificate Profiles](https://cloud.google.com/certificate-authority-service/docs/certificate-profile)
   *     * [Official Documentation](https://cloud.google.com/certificate-authority-service)
   *     * [Understanding Certificate Templates](https://cloud.google.com/certificate-authority-service/docs/certificate-template)
   */
  def CertificateTemplate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CertificateTemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.certificateauthority.CertificateTemplateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.certificateauthority.CertificateTemplate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the certificatetemplate are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the certificatetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CertificateTemplateIamBinding` and `gcp.certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CertificateTemplateIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * # IAM policy for Certificate Authority Service CertificateTemplate
   * 
   * Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the certificatetemplate are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the certificatetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CertificateTemplateIamBinding` and `gcp.certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CertificateTemplateIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * * projects/{{project}}/locations/{{location}}/certificateTemplates/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Certificate Authority Service certificatetemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_privateca_certificate_template_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_privateca_certificate_template_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:certificateauthority/certificateTemplateIamBinding:CertificateTemplateIamBinding editor projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def CertificateTemplateIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs.builder
    com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the certificatetemplate are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the certificatetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CertificateTemplateIamBinding` and `gcp.certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CertificateTemplateIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * # IAM policy for Certificate Authority Service CertificateTemplate
   * 
   * Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the certificatetemplate are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the certificatetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CertificateTemplateIamBinding` and `gcp.certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CertificateTemplateIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * * projects/{{project}}/locations/{{location}}/certificateTemplates/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Certificate Authority Service certificatetemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_privateca_certificate_template_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_privateca_certificate_template_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:certificateauthority/certificateTemplateIamMember:CertificateTemplateIamMember editor projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def CertificateTemplateIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs.builder
    com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the certificatetemplate are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the certificatetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CertificateTemplateIamBinding` and `gcp.certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CertificateTemplateIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * # IAM policy for Certificate Authority Service CertificateTemplate
   * 
   * Three different resources help you manage your IAM policy for Certificate Authority Service CertificateTemplate. Each of these resources serves a different use case:
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Authoritative. Sets the IAM policy for the certificatetemplate and replaces any existing policy already attached.
   * * `gcp.certificateauthority.CertificateTemplateIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the certificatetemplate are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.certificateauthority.CertificateTemplateIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the certificatetemplate are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.certificateauthority.CertificateTemplateIamPolicy`: Retrieves the IAM policy for the certificatetemplate
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamPolicy` **cannot** be used in conjunction with `gcp.certificateauthority.CertificateTemplateIamBinding` and `gcp.certificateauthority.CertificateTemplateIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.certificateauthority.CertificateTemplateIamBinding` resources **can be** used in conjunction with `gcp.certificateauthority.CertificateTemplateIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.certificateauthority.CertificateTemplateIamPolicy
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
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
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
   * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyBindingConditionArgs;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs;
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
   *                 .role("roles/privateca.templateUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new CertificateTemplateIamPolicy("policy", CertificateTemplateIamPolicyArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBinding;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamBindingArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamBindingConditionArgs;
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
   *         var binding = new CertificateTemplateIamBinding("binding", CertificateTemplateIamBindingArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamBindingConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.certificateauthority.CertificateTemplateIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * With IAM Conditions:
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMember;
   * import com.pulumi.gcp.certificateauthority.CertificateTemplateIamMemberArgs;
   * import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIamMemberConditionArgs;
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
   *         var member = new CertificateTemplateIamMember("member", CertificateTemplateIamMemberArgs.builder()
   *             .certificateTemplate(default_.get("id"))
   *             .role("roles/privateca.templateUser")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(CertificateTemplateIamMemberConditionArgs.builder()
   *                 .title("expires_after_2019_12_31")
   *                 .description("Expiring at midnight of 2019-12-31")
   *                 .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                 .build())
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
   * * projects/{{project}}/locations/{{location}}/certificateTemplates/{{name}}
   * * {{project}}/{{location}}/{{name}}
   * * {{location}}/{{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Certificate Authority Service certificatetemplate IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_privateca_certificate_template_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_privateca_certificate_template_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}} roles/privateca.templateUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:certificateauthority/certificateTemplateIamPolicy:CertificateTemplateIamPolicy editor projects/{{project}}/locations/{{location}}/certificateTemplates/{{certificate_template}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def CertificateTemplateIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicyArgs.builder
    com.pulumi.gcp.certificateauthority.CertificateTemplateIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object CertificateauthorityFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Get info about a Google CAS Certificate Authority. */
    inline def getAuthority(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificateauthority.outputs.GetAuthorityResult] =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.GetAuthorityArgs.builder
      com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions.getAuthority(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get info about a Google CAS Certificate Authority. */
    inline def getAuthorityPlain(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.GetAuthorityPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificateauthority.outputs.GetAuthorityResult] =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.GetAuthorityPlainArgs.builder
      com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions.getAuthorityPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for capool */
    inline def getCaPoolIamPolicy(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.GetCaPoolIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificateauthority.outputs.GetCaPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.GetCaPoolIamPolicyArgs.builder
      com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions.getCaPoolIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for capool */
    inline def getCaPoolIamPolicyPlain(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.GetCaPoolIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificateauthority.outputs.GetCaPoolIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.GetCaPoolIamPolicyPlainArgs.builder
      com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions.getCaPoolIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for certificatetemplate */
    inline def getCertificateTemplateIamPolicy(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.GetCertificateTemplateIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.certificateauthority.outputs.GetCertificateTemplateIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.GetCertificateTemplateIamPolicyArgs.builder
      com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions.getCertificateTemplateIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for certificatetemplate */
    inline def getCertificateTemplateIamPolicyPlain(args: Endofunction[com.pulumi.gcp.certificateauthority.inputs.GetCertificateTemplateIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.certificateauthority.outputs.GetCertificateTemplateIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.certificateauthority.inputs.GetCertificateTemplateIamPolicyPlainArgs.builder
      com.pulumi.gcp.certificateauthority.CertificateauthorityFunctions.getCertificateTemplateIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
