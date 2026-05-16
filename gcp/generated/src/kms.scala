package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object kms:
  /**
   * Three different resources help you manage your IAM policy for KMS key ring. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.KeyRingIAMPolicy`: Authoritative. Sets the IAM policy for the key ring and replaces any existing policy already attached.
   *  * `gcp.kms.KeyRingIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the key ring are preserved.
   *  * `gcp.kms.KeyRingIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the key ring are preserved.
   * 
   *  &gt; **Note:** `gcp.kms.KeyRingIAMPolicy` **cannot** be used in conjunction with `gcp.kms.KeyRingIAMBinding` and `gcp.kms.KeyRingIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.KeyRingIAMBinding` resources **can be** used in conjunction with `gcp.kms.KeyRingIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.kms.KeyRingIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicy;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var keyRing = new KeyRingIAMPolicy("keyRing", KeyRingIAMPolicyArgs.builder()
   *              .keyRingId(keyring.id())
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
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicy;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var keyRing = new KeyRingIAMPolicy("keyRing", KeyRingIAMPolicyArgs.builder()
   *              .keyRingId(keyring.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.kms.KeyRingIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMBindingConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMMemberConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMBindingConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMMemberConditionArgs.builder()
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
   */
  def KeyRingIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.KeyRingIAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.KeyRingIAMMemberArgs.builder
    com.pulumi.gcp.kms.KeyRingIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.CryptoKeyVersionArgs.Builder)
    /**
     * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     *  Structure is documented below.
     * @return builder
     */
    def externalProtectionLevelOptions(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyVersionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.builder
      builder.externalProtectionLevelOptions(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
   *  * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
   *  * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.kms.EkmConnectionIamPolicy
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.kms.EkmConnectionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamBindingConditionArgs.builder()
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
   *  ## gcp.kms.EkmConnectionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud Key Management Service EkmConnection
   * 
   *  Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
   *  * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
   *  * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.kms.EkmConnectionIamPolicy
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.kms.EkmConnectionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamBindingConditionArgs.builder()
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
   *  ## gcp.kms.EkmConnectionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamMemberConditionArgs.builder()
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
   *  * projects/{{project}}/locations/{{location}}/ekmConnections/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Key Management Service ekmconnection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_kms_ekm_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_kms_ekm_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:kms/ekmConnectionIamMember:EkmConnectionIamMember editor projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EkmConnectionIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.EkmConnectionIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.kms.EkmConnectionIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.kms.EkmConnectionIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A `KeyRingImportJob` can be used to create `CryptoKeys` and `CryptoKeyVersions` using pre-existing
   *  key material, generated outside of Cloud KMS. A `KeyRingImportJob` expires 3 days after it is created.
   *  Once expired, Cloud KMS will no longer be able to import or unwrap any key material that
   *  was wrapped with the `KeyRingImportJob`&#39;s public key.
   * 
   *  &gt; **Note:** KeyRingImportJobs cannot be deleted from Google Cloud Platform.
   *  Destroying a provider-managed KeyRingImportJob will remove it from state but
   *  *will not delete the resource from the project.*
   * 
   *  To get more information about KeyRingImportJob, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.importJobs)
   *  * How-to Guides
   *      * [Importing a key](https://cloud.google.com/kms/docs/importing-a-key)
   */
  def KeyRingImportJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.KeyRingImportJobArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.KeyRingImportJobArgs.builder
    com.pulumi.gcp.kms.KeyRingImportJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A `KeyHandle` is a resource used to auto-provision CryptoKeys for CMEK.
   * 
   *  &gt; **Note:** KeyHandles cannot be deleted from Google Cloud Platform.
   *  Destroying a Terraform-managed KeyHandle will remove it from state but
   *  *will not delete the resource from the project.*
   * 
   *  To get more information about KeyHandle, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles)
   *  * How-to Guides
   *      * [Cloud KMS with Autokey](https://cloud.google.com/kms/docs/kms-with-autokey)
   */
  def KeyHandle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.KeyHandleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.kms.KeyHandleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.kms.KeyHandle(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * `FolderKajPolicyConfigs` is a folder-level singleton resource
   *  used to configure the default KAJ policy of newly created key.
   * 
   *  &gt; **Note:** FolderKajPolicyConfigs cannot be deleted from Google Cloud Platform.
   *  Destroying a Terraform-managed FolderKajPolicyConfigs will remove it from state but
   *  *will not delete the resource from Google Cloud Platform.*
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about FolderKajPolicyConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/KeyAccessJustificationsPolicyConfig)
   *  * How-to Guides
   *      * [Set default Key Access Justifications policy](https://cloud.google.com/assured-workloads/key-access-justifications/docs/set-default-policy)
   */
  def FolderKajPolicyConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.FolderKajPolicyConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.FolderKajPolicyConfigArgs.builder
    com.pulumi.gcp.kms.FolderKajPolicyConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.KeyRingIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.KeyRingIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * `AutokeyConfig` is a singleton resource used to configure the auto-provisioning
   *  flow of CryptoKeys for CMEK.
   * 
   *  &gt; **Note:** AutokeyConfigs cannot be deleted from Google Cloud Platform.
   *  Destroying a Terraform-managed AutokeyConfig will remove it from state but
   *  *will not delete the resource from the project.*
   * 
   *  To get more information about AutokeyConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/AutokeyConfig)
   *  * How-to Guides
   *      * [Cloud KMS with Autokey](https://cloud.google.com/kms/docs/kms-with-autokey)
   */
  def AutokeyConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.AutokeyConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.AutokeyConfigArgs.builder
    com.pulumi.gcp.kms.AutokeyConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * `ProjectKajPolicyConfig` is a project-level singleton resource
   *  used to configure the default KAJ policy of newly created key.
   * 
   *  &gt; **Note:**  ProjectKajPolicyConfig cannot be deleted from Google Cloud Platform.
   *  Destroying a Terraform-managed  ProjectKajPolicyConfig will remove it from state but
   *  *will not delete the resource from Google Cloud Platform.*
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about ProjectKajPolicyConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/KeyAccessJustificationsPolicyConfig)
   *  * How-to Guides
   *      * [Set default Key Access Justifications policy](https://cloud.google.com/assured-workloads/key-access-justifications/docs/set-default-policy)
   */
  def ProjectKajPolicyConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.ProjectKajPolicyConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.ProjectKajPolicyConfigArgs.builder
    com.pulumi.gcp.kms.ProjectKajPolicyConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for KMS key ring. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.KeyRingIAMPolicy`: Authoritative. Sets the IAM policy for the key ring and replaces any existing policy already attached.
   *  * `gcp.kms.KeyRingIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the key ring are preserved.
   *  * `gcp.kms.KeyRingIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the key ring are preserved.
   * 
   *  &gt; **Note:** `gcp.kms.KeyRingIAMPolicy` **cannot** be used in conjunction with `gcp.kms.KeyRingIAMBinding` and `gcp.kms.KeyRingIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.KeyRingIAMBinding` resources **can be** used in conjunction with `gcp.kms.KeyRingIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.kms.KeyRingIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicy;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var keyRing = new KeyRingIAMPolicy("keyRing", KeyRingIAMPolicyArgs.builder()
   *              .keyRingId(keyring.id())
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
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicy;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var keyRing = new KeyRingIAMPolicy("keyRing", KeyRingIAMPolicyArgs.builder()
   *              .keyRingId(keyring.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.kms.KeyRingIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMBindingConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMMemberConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMBindingConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMMemberConditionArgs.builder()
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
   */
  def KeyRingIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.KeyRingIAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.KeyRingIAMPolicyArgs.builder
    com.pulumi.gcp.kms.KeyRingIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.EkmConnectionIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.EkmConnectionIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
   *  * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
   *  * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.kms.EkmConnectionIamPolicy
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.kms.EkmConnectionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamBindingConditionArgs.builder()
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
   *  ## gcp.kms.EkmConnectionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud Key Management Service EkmConnection
   * 
   *  Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
   *  * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
   *  * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.kms.EkmConnectionIamPolicy
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.kms.EkmConnectionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamBindingConditionArgs.builder()
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
   *  ## gcp.kms.EkmConnectionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamMemberConditionArgs.builder()
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
   *  * projects/{{project}}/locations/{{location}}/ekmConnections/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Key Management Service ekmconnection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_kms_ekm_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_kms_ekm_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:kms/ekmConnectionIamBinding:EkmConnectionIamBinding editor projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EkmConnectionIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.EkmConnectionIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.kms.EkmConnectionIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.kms.EkmConnectionIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A `CryptoKeyVersion` represents an individual cryptographic key, and the associated key material.
   * 
   *  Destroying a cryptoKeyVersion will not delete the resource from the project.
   * 
   *  To get more information about CryptoKeyVersion, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions)
   *  * How-to Guides
   *      * [Creating a key Version](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions/create)
   */
  def CryptoKeyVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.CryptoKeyVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.CryptoKeyVersionArgs.builder
    com.pulumi.gcp.kms.CryptoKeyVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
   *  * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
   *  * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.kms.EkmConnectionIamPolicy
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.kms.EkmConnectionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamBindingConditionArgs.builder()
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
   *  ## gcp.kms.EkmConnectionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud Key Management Service EkmConnection
   * 
   *  Three different resources help you manage your IAM policy for Cloud Key Management Service EkmConnection. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Authoritative. Sets the IAM policy for the ekmconnection and replaces any existing policy already attached.
   *  * `gcp.kms.EkmConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the ekmconnection are preserved.
   *  * `gcp.kms.EkmConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the ekmconnection are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.kms.EkmConnectionIamPolicy`: Retrieves the IAM policy for the ekmconnection
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamPolicy` **cannot** be used in conjunction with `gcp.kms.EkmConnectionIamBinding` and `gcp.kms.EkmConnectionIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.EkmConnectionIamBinding` resources **can be** used in conjunction with `gcp.kms.EkmConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.kms.EkmConnectionIamPolicy
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicy;
   *  import com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new EkmConnectionIamPolicy("policy", EkmConnectionIamPolicyArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.kms.EkmConnectionIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamBinding;
   *  import com.pulumi.gcp.kms.EkmConnectionIamBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new EkmConnectionIamBinding("binding", EkmConnectionIamBindingArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamBindingConditionArgs.builder()
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
   *  ## gcp.kms.EkmConnectionIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
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
   *  import com.pulumi.gcp.kms.EkmConnectionIamMember;
   *  import com.pulumi.gcp.kms.EkmConnectionIamMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new EkmConnectionIamMember("member", EkmConnectionIamMemberArgs.builder()
   *              .project(example_ekmconnection.project())
   *              .location(example_ekmconnection.location())
   *              .name(example_ekmconnection.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(EkmConnectionIamMemberConditionArgs.builder()
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
   *  * projects/{{project}}/locations/{{location}}/ekmConnections/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Key Management Service ekmconnection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_kms_ekm_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_kms_ekm_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:kms/ekmConnectionIamPolicy:EkmConnectionIamPolicy editor projects/{{project}}/locations/{{location}}/ekmConnections/{{ekm_connection}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def EkmConnectionIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.kms.EkmConnectionIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.kms.EkmConnectionIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.KeyRingIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.KeyRingIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.CryptoKeyArgs.Builder)
    /**
     * @param keyAccessJustificationsPolicy (Optional, Beta)
     *  The policy used for Key Access Justifications Policy Enforcement. If this
     *  field is present and this key is enrolled in Key Access Justifications
     *  Policy Enforcement, the policy will be evaluated in encrypt, decrypt, and
     *  sign operations, and the operation will fail if rejected by the policy. The
     *  policy is defined by specifying zero or more allowed justification codes.
     *  https://cloud.google.com/assured-workloads/key-access-justifications/docs/justification-codes
     *  By default, this field is absent, and all justification codes are allowed.
     *  This field is currently in beta and is subject to change.
     *  Structure is documented below.
     * @return builder
     */
    def keyAccessJustificationsPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.builder
      builder.keyAccessJustificationsPolicy(args(argsBuilder).build)

    /**
     * @param versionTemplate A template describing settings for new crypto key versions.
     *  Structure is documented below.
     * @return builder
     */
    def versionTemplate(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.builder
      builder.versionTemplate(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for KMS crypto key. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.CryptoKeyIAMPolicy`: Authoritative. Sets the IAM policy for the crypto key and replaces any existing policy already attached.
   *  * `gcp.kms.CryptoKeyIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the crypto key are preserved.
   *  * `gcp.kms.CryptoKeyIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the crypto key are preserved.
   * 
   *  &gt; **Note:** `gcp.kms.CryptoKeyIAMPolicy` **cannot** be used in conjunction with `gcp.kms.CryptoKeyIAMBinding` and `gcp.kms.CryptoKeyIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.CryptoKeyIAMBinding` resources **can be** used in conjunction with `gcp.kms.CryptoKeyIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.kms.CryptoKey;
   *  import com.pulumi.gcp.kms.CryptoKeyArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMPolicy;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          var key = new CryptoKey("key", CryptoKeyArgs.builder()
   *              .name("crypto-key-example")
   *              .keyRing(keyring.id())
   *              .rotationPeriod("7776000s")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/cloudkms.cryptoKeyEncrypter")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var cryptoKey = new CryptoKeyIAMPolicy("cryptoKey", CryptoKeyIAMPolicyArgs.builder()
   *              .cryptoKeyId(key.id())
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
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/cloudkms.cryptoKeyEncrypter")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBinding;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMBinding("cryptoKey", CryptoKeyIAMBindingArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
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
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBinding;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMBinding("cryptoKey", CryptoKeyIAMBindingArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(CryptoKeyIAMBindingConditionArgs.builder()
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
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMember;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMMember("cryptoKey", CryptoKeyIAMMemberArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
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
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMember;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMMember("cryptoKey", CryptoKeyIAMMemberArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(CryptoKeyIAMMemberConditionArgs.builder()
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
   */
  def CryptoKeyIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs.builder
    com.pulumi.gcp.kms.CryptoKeyIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A `CryptoKey` represents a logical key that can be used for cryptographic operations.
   * 
   *  &gt; **Note:** CryptoKeys cannot be deleted from Google Cloud Platform.
   *  Destroying a provider-managed CryptoKey will remove it from state
   *  and delete all CryptoKeyVersions, rendering the key unusable, but *will
   *  not delete the resource from the project.* When the provider destroys these keys,
   *  any data previously encrypted with these keys will be irrecoverable.
   *  For this reason, it is strongly recommended that you use Pulumi&#39;s [protect resource option](https://www.pulumi.com/docs/concepts/options/protect/).
   * 
   *  To get more information about CryptoKey, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys)
   *  * How-to Guides
   *      * [Creating a key](https://cloud.google.com/kms/docs/creating-keys#create_a_key)
   */
  def CryptoKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.CryptoKeyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.kms.CryptoKeyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.kms.CryptoKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.ProjectKajPolicyConfigArgs.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     *  created in this project. This is only used when a Key Access Justifications
     *  policy is not provided in the CreateCryptoKeyRequest.
     *  Structure is documented below.
     * @return builder
     */
    def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.ProjectKajPolicyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for KMS crypto key. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.CryptoKeyIAMPolicy`: Authoritative. Sets the IAM policy for the crypto key and replaces any existing policy already attached.
   *  * `gcp.kms.CryptoKeyIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the crypto key are preserved.
   *  * `gcp.kms.CryptoKeyIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the crypto key are preserved.
   * 
   *  &gt; **Note:** `gcp.kms.CryptoKeyIAMPolicy` **cannot** be used in conjunction with `gcp.kms.CryptoKeyIAMBinding` and `gcp.kms.CryptoKeyIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.CryptoKeyIAMBinding` resources **can be** used in conjunction with `gcp.kms.CryptoKeyIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.kms.CryptoKey;
   *  import com.pulumi.gcp.kms.CryptoKeyArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMPolicy;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          var key = new CryptoKey("key", CryptoKeyArgs.builder()
   *              .name("crypto-key-example")
   *              .keyRing(keyring.id())
   *              .rotationPeriod("7776000s")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/cloudkms.cryptoKeyEncrypter")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var cryptoKey = new CryptoKeyIAMPolicy("cryptoKey", CryptoKeyIAMPolicyArgs.builder()
   *              .cryptoKeyId(key.id())
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
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/cloudkms.cryptoKeyEncrypter")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBinding;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMBinding("cryptoKey", CryptoKeyIAMBindingArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
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
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBinding;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMBinding("cryptoKey", CryptoKeyIAMBindingArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(CryptoKeyIAMBindingConditionArgs.builder()
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
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMember;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMMember("cryptoKey", CryptoKeyIAMMemberArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
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
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMember;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMMember("cryptoKey", CryptoKeyIAMMemberArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(CryptoKeyIAMMemberConditionArgs.builder()
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
   */
  def CryptoKeyIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs.builder
    com.pulumi.gcp.kms.CryptoKeyIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object KmsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Provides access to Google Cloud Platform KMS AutokeyConfig. A AutokeyConfig is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/reference/rest/v1/folders)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles).
     */
    inline def getAutokeyConfig(args: Endofunction[com.pulumi.gcp.kms.inputs.GetAutokeyConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetAutokeyConfigResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetAutokeyConfigArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getAutokeyConfig(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS AutokeyConfig. A AutokeyConfig is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/reference/rest/v1/folders)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles).
     */
    inline def getAutokeyConfigPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetAutokeyConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetAutokeyConfigResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetAutokeyConfigPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getAutokeyConfigPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud KMS crypto key.
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
     *  import com.pulumi.gcp.kms.KmsFunctions;
     *  import com.pulumi.gcp.kms.inputs.GetCryptoKeyIamPolicyArgs;
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
     *          final var foo = KmsFunctions.getCryptoKeyIamPolicy(GetCryptoKeyIamPolicyArgs.builder()
     *              .cryptoKeyId(cryptoKey.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getCryptoKeyIamPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeyIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetCryptoKeyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeyIamPolicyArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeyIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud KMS crypto key.
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
     *  import com.pulumi.gcp.kms.KmsFunctions;
     *  import com.pulumi.gcp.kms.inputs.GetCryptoKeyIamPolicyArgs;
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
     *          final var foo = KmsFunctions.getCryptoKeyIamPolicy(GetCryptoKeyIamPolicyArgs.builder()
     *              .cryptoKeyId(cryptoKey.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getCryptoKeyIamPolicyPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeyIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetCryptoKeyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeyIamPolicyPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeyIamPolicyPlain(args(argsBuilder).build)

    /**
     * Provides access to the latest Google Cloud Platform KMS CryptoKeyVersion in a CryptoKey. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_version)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions).
     */
    inline def getCryptoKeyLatestVersion(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeyLatestVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetCryptoKeyLatestVersionResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeyLatestVersionArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeyLatestVersion(args(argsBuilder).build)

    /**
     * Provides access to the latest Google Cloud Platform KMS CryptoKeyVersion in a CryptoKey. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_version)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions).
     */
    inline def getCryptoKeyLatestVersionPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeyLatestVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetCryptoKeyLatestVersionResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeyLatestVersionPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeyLatestVersionPlain(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS CryptoKeyVersions. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_version)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions).
     */
    inline def getCryptoKeyVersions(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeyVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetCryptoKeyVersionsResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeyVersionsArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeyVersions(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS CryptoKeyVersions. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_version)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions).
     */
    inline def getCryptoKeyVersionsPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeyVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetCryptoKeyVersionsResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeyVersionsPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeyVersionsPlain(args(argsBuilder).build)

    /**
     * Provides access to all Google Cloud Platform KMS CryptoKeys in a given KeyRing. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).
     * 
     *  A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
     *  Google Cloud KMS KeyRing.
     */
    inline def getCryptoKeys(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeysArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetCryptoKeysResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeysArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeys(args(argsBuilder).build)

    /**
     * Provides access to all Google Cloud Platform KMS CryptoKeys in a given KeyRing. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).
     * 
     *  A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
     *  Google Cloud KMS KeyRing.
     */
    inline def getCryptoKeysPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetCryptoKeysPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetCryptoKeysResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetCryptoKeysPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getCryptoKeysPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for ekmconnection */
    inline def getEkmConnectionIamPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.GetEkmConnectionIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetEkmConnectionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetEkmConnectionIamPolicyArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getEkmConnectionIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for ekmconnection */
    inline def getEkmConnectionIamPolicyPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetEkmConnectionIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetEkmConnectionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetEkmConnectionIamPolicyPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getEkmConnectionIamPolicyPlain(args(argsBuilder).build)

    /**
     * Provides access to a Google Cloud Platform KMS CryptoKey. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).
     * 
     *  A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
     *  Google Cloud KMS KeyRing.
     */
    inline def getKMSCryptoKey(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKMSCryptoKeyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSCryptoKey(args(argsBuilder).build)

    /**
     * Provides access to a Google Cloud Platform KMS CryptoKey. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys).
     * 
     *  A CryptoKey is an interface to key material which can be used to encrypt and decrypt data. A CryptoKey belongs to a
     *  Google Cloud KMS KeyRing.
     */
    inline def getKMSCryptoKeyPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKMSCryptoKeyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSCryptoKeyPlain(args(argsBuilder).build)

    /**
     * Provides access to a Google Cloud Platform KMS CryptoKeyVersion. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_version)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions).
     * 
     *  A CryptoKeyVersion represents an individual cryptographic key, and the associated key material.
     */
    inline def getKMSCryptoKeyVersion(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKMSCryptoKeyVersionResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSCryptoKeyVersion(args(argsBuilder).build)

    /**
     * Provides access to a Google Cloud Platform KMS CryptoKeyVersion. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_version)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys.cryptoKeyVersions).
     * 
     *  A CryptoKeyVersion represents an individual cryptographic key, and the associated key material.
     */
    inline def getKMSCryptoKeyVersionPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKMSCryptoKeyVersionResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSCryptoKeyVersionPlain(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS KeyRing. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
     * 
     *  A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
     *  and resides in a specific location.
     */
    inline def getKMSKeyRing(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSKeyRingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKMSKeyRingResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSKeyRingArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSKeyRing(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS KeyRing. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/object-hierarchy#key_ring)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
     * 
     *  A KeyRing is a grouping of CryptoKeys for organizational purposes. A KeyRing belongs to a Google Cloud Platform Project
     *  and resides in a specific location.
     */
    inline def getKMSKeyRingPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSKeyRingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKMSKeyRingResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSKeyRingPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSKeyRingPlain(args(argsBuilder).build)

    /**
     * This data source allows you to use data encrypted with Google Cloud KMS
     *  within your resource definitions.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt).
     * 
     *  &gt; **NOTE:** Using this data provider will allow you to conceal secret data within your
     *  resource definitions, but it does not take care of protecting that data in the
     *  logging output, plan output, or state output.  Please take care to secure your secret
     *  data outside of resource definitions.
     */
    inline def getKMSSecret(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSSecretArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKMSSecretResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSSecretArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSSecret(args(argsBuilder).build)

    /**
     * This data source allows you to use data encrypted with Google Cloud KMS
     *  within your resource definitions.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt).
     * 
     *  &gt; **NOTE:** Using this data provider will allow you to conceal secret data within your
     *  resource definitions, but it does not take care of protecting that data in the
     *  logging output, plan output, or state output.  Please take care to secure your secret
     *  data outside of resource definitions.
     */
    inline def getKMSSecretPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSSecretPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKMSSecretResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSSecretPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSSecretPlain(args(argsBuilder).build)

    /**
     * This data source allows you to use data encrypted with a Google Cloud KMS asymmetric key
     *  within your resource definitions.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt-rsa).
     * 
     *  &gt; **NOTE:** Using this data provider will allow you to conceal secret data within your
     *  resource definitions, but it does not take care of protecting that data in the
     *  logging output, plan output, or state output.  Please take care to secure your secret
     *  data outside of resource definitions.
     */
    inline def getKMSSecretAsymmetric(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSSecretAsymmetricArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKMSSecretAsymmetricResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSSecretAsymmetricArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSSecretAsymmetric(args(argsBuilder).build)

    /**
     * This data source allows you to use data encrypted with a Google Cloud KMS asymmetric key
     *  within your resource definitions.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt-rsa).
     * 
     *  &gt; **NOTE:** Using this data provider will allow you to conceal secret data within your
     *  resource definitions, but it does not take care of protecting that data in the
     *  logging output, plan output, or state output.  Please take care to secure your secret
     *  data outside of resource definitions.
     */
    inline def getKMSSecretAsymmetricPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSSecretAsymmetricPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKMSSecretAsymmetricResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSSecretAsymmetricPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSSecretAsymmetricPlain(args(argsBuilder).build)

    /**
     * !&gt; **Warning:** This data source is deprecated. Use the `gcp.kms.SecretCiphertext` **resource** instead.
     * 
     *  This data source allows you to encrypt data with Google Cloud KMS and use the
     *  ciphertext within your resource definitions.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt).
     * 
     *  &gt; **NOTE:** Using this data source will allow you to conceal secret data within your
     *  resource definitions, but it does not take care of protecting that data in the
     *  logging output, plan output, or state output.  Please take care to secure your secret
     *  data outside of resource definitions.
     */
    inline def getKMSSecretCiphertext(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSSecretCiphertextArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKMSSecretCiphertextResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSSecretCiphertextArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSSecretCiphertext(args(argsBuilder).build)

    /**
     * !&gt; **Warning:** This data source is deprecated. Use the `gcp.kms.SecretCiphertext` **resource** instead.
     * 
     *  This data source allows you to encrypt data with Google Cloud KMS and use the
     *  ciphertext within your resource definitions.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/encrypt-decrypt).
     * 
     *  &gt; **NOTE:** Using this data source will allow you to conceal secret data within your
     *  resource definitions, but it does not take care of protecting that data in the
     *  logging output, plan output, or state output.  Please take care to secure your secret
     *  data outside of resource definitions.
     */
    inline def getKMSSecretCiphertextPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKMSSecretCiphertextPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKMSSecretCiphertextResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKMSSecretCiphertextPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKMSSecretCiphertextPlain(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS KeyHandle. A key handle is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_handles)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles).
     */
    inline def getKeyHandle(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyHandleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKeyHandleResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyHandleArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyHandle(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS KeyHandle. A key handle is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_handles)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles).
     */
    inline def getKeyHandlePlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyHandlePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKeyHandleResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyHandlePlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyHandlePlain(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS KeyHandle. A key handle is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_handles)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles/list).
     */
    inline def getKeyHandles(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyHandlesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKeyHandlesResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyHandlesArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyHandles(args(argsBuilder).build)

    /**
     * Provides access to Google Cloud Platform KMS KeyHandle. A key handle is a Cloud KMS resource that helps you safely span the separation of duties to create new Cloud KMS keys for CMEK using Autokey.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_handles)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyHandles/list).
     */
    inline def getKeyHandlesPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyHandlesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKeyHandlesResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyHandlesPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyHandlesPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud KMS key ring.
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
     *  import com.pulumi.gcp.kms.KmsFunctions;
     *  import com.pulumi.gcp.kms.inputs.GetKeyRingIamPolicyArgs;
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
     *          final var testKeyRingIamPolicy = KmsFunctions.getKeyRingIamPolicy(GetKeyRingIamPolicyArgs.builder()
     *              .keyRingId("{project_id}/{location_name}/{key_ring_name}")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getKeyRingIamPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyRingIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKeyRingIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyRingIamPolicyArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyRingIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud KMS key ring.
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
     *  import com.pulumi.gcp.kms.KmsFunctions;
     *  import com.pulumi.gcp.kms.inputs.GetKeyRingIamPolicyArgs;
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
     *          final var testKeyRingIamPolicy = KmsFunctions.getKeyRingIamPolicy(GetKeyRingIamPolicyArgs.builder()
     *              .keyRingId("{project_id}/{location_name}/{key_ring_name}")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getKeyRingIamPolicyPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyRingIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKeyRingIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyRingIamPolicyPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyRingIamPolicyPlain(args(argsBuilder).build)

    /**
     * Provides access to all Google Cloud Platform KMS CryptoKeyRings in a set location. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_rings)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
     * 
     *  A key ring organizes keys in a specific Google Cloud location and lets you manage access control on groups of keys. A key ring&#39;s name does not need to be unique across a Google Cloud project, but must be unique within a given location. After creation, a key ring cannot be deleted. Key rings don&#39;t incur any costs.
     */
    inline def getKeyRings(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyRingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.kms.outputs.GetKeyRingsResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyRingsArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyRings(args(argsBuilder).build)

    /**
     * Provides access to all Google Cloud Platform KMS CryptoKeyRings in a set location. For more information see
     *  [the official documentation](https://cloud.google.com/kms/docs/resource-hierarchy#key_rings)
     *  and
     *  [API](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings).
     * 
     *  A key ring organizes keys in a specific Google Cloud location and lets you manage access control on groups of keys. A key ring&#39;s name does not need to be unique across a Google Cloud project, but must be unique within a given location. After creation, a key ring cannot be deleted. Key rings don&#39;t incur any costs.
     */
    inline def getKeyRingsPlain(args: Endofunction[com.pulumi.gcp.kms.inputs.GetKeyRingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.kms.outputs.GetKeyRingsResult] =
      val argsBuilder = com.pulumi.gcp.kms.inputs.GetKeyRingsPlainArgs.builder
      com.pulumi.gcp.kms.KmsFunctions.getKeyRingsPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.EkmConnectionArgs.Builder)
    /**
     * @param serviceResolvers A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported
     *  Structure is documented below.
     * @return builder
     */
    def serviceResolvers(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder]*):
        com.pulumi.gcp.kms.EkmConnectionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.builder
      builder.serviceResolvers(args.map(_(argsBuilder).build)*)

  /**
   * `OrganizationKajPolicyConfig` is a organization-level singleton resource
   *  used to configure the default KAJ policy of newly created key.
   * 
   *  &gt; **Note:** OrganizationKajPolicyConfig cannot be deleted from Google Cloud Platform.
   *  Destroying a Terraform-managed OrganizationKajPolicyConfig will remove it from state but
   *  *will not delete the resource from Google Cloud Platform.*
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about OrganizationKajPolicyConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/KeyAccessJustificationsPolicyConfig)
   *  * How-to Guides
   *      * [Set default Key Access Justifications policy](https://cloud.google.com/assured-workloads/key-access-justifications/docs/set-default-policy)
   */
  def OrganizationKajPolicyConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.OrganizationKajPolicyConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.OrganizationKajPolicyConfigArgs.builder
    com.pulumi.gcp.kms.OrganizationKajPolicyConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A `KeyRing` is a toplevel logical grouping of `CryptoKeys`.
   * 
   *  &gt; **Note:** KeyRings cannot be deleted from Google Cloud Platform.
   *  Destroying a provider-managed KeyRing will remove it from state but
   *  *will not delete the resource from the project.*
   * 
   *  To get more information about KeyRing, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings)
   *  * How-to Guides
   *      * [Creating a key ring](https://cloud.google.com/kms/docs/creating-keys#create_a_key_ring)
   */
  def KeyRing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.KeyRingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.kms.KeyRingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.kms.KeyRing(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for KMS crypto key. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.CryptoKeyIAMPolicy`: Authoritative. Sets the IAM policy for the crypto key and replaces any existing policy already attached.
   *  * `gcp.kms.CryptoKeyIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the crypto key are preserved.
   *  * `gcp.kms.CryptoKeyIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the crypto key are preserved.
   * 
   *  &gt; **Note:** `gcp.kms.CryptoKeyIAMPolicy` **cannot** be used in conjunction with `gcp.kms.CryptoKeyIAMBinding` and `gcp.kms.CryptoKeyIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.CryptoKeyIAMBinding` resources **can be** used in conjunction with `gcp.kms.CryptoKeyIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.kms.CryptoKey;
   *  import com.pulumi.gcp.kms.CryptoKeyArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMPolicy;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          var key = new CryptoKey("key", CryptoKeyArgs.builder()
   *              .name("crypto-key-example")
   *              .keyRing(keyring.id())
   *              .rotationPeriod("7776000s")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/cloudkms.cryptoKeyEncrypter")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var cryptoKey = new CryptoKeyIAMPolicy("cryptoKey", CryptoKeyIAMPolicyArgs.builder()
   *              .cryptoKeyId(key.id())
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
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/cloudkms.cryptoKeyEncrypter")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBinding;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMBinding("cryptoKey", CryptoKeyIAMBindingArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
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
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBinding;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMBinding("cryptoKey", CryptoKeyIAMBindingArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(CryptoKeyIAMBindingConditionArgs.builder()
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
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMember;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMMember("cryptoKey", CryptoKeyIAMMemberArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
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
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMember;
   *  import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var cryptoKey = new CryptoKeyIAMMember("cryptoKey", CryptoKeyIAMMemberArgs.builder()
   *              .cryptoKeyId(key.id())
   *              .role("roles/cloudkms.cryptoKeyEncrypter")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(CryptoKeyIAMMemberConditionArgs.builder()
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
   */
  def CryptoKeyIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs.builder
    com.pulumi.gcp.kms.CryptoKeyIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for KMS key ring. Each of these resources serves a different use case:
   * 
   *  * `gcp.kms.KeyRingIAMPolicy`: Authoritative. Sets the IAM policy for the key ring and replaces any existing policy already attached.
   *  * `gcp.kms.KeyRingIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the key ring are preserved.
   *  * `gcp.kms.KeyRingIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the key ring are preserved.
   * 
   *  &gt; **Note:** `gcp.kms.KeyRingIAMPolicy` **cannot** be used in conjunction with `gcp.kms.KeyRingIAMBinding` and `gcp.kms.KeyRingIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.kms.KeyRingIAMBinding` resources **can be** used in conjunction with `gcp.kms.KeyRingIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.kms.KeyRingIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicy;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var keyRing = new KeyRingIAMPolicy("keyRing", KeyRingIAMPolicyArgs.builder()
   *              .keyRingId(keyring.id())
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
   *  import com.pulumi.gcp.kms.KeyRing;
   *  import com.pulumi.gcp.kms.KeyRingArgs;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicy;
   *  import com.pulumi.gcp.kms.KeyRingIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyring = new KeyRing("keyring", KeyRingArgs.builder()
   *              .name("keyring-example")
   *              .location("global")
   *              .build());
   * 
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var keyRing = new KeyRingIAMPolicy("keyRing", KeyRingIAMPolicyArgs.builder()
   *              .keyRingId(keyring.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.kms.KeyRingIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMBindingConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMMemberConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMBinding;
   *  import com.pulumi.gcp.kms.KeyRingIAMBindingArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMBinding("keyRing", KeyRingIAMBindingArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMBindingConditionArgs.builder()
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
   *  ## gcp.kms.KeyRingIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
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
   *  import com.pulumi.gcp.kms.KeyRingIAMMember;
   *  import com.pulumi.gcp.kms.KeyRingIAMMemberArgs;
   *  import com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var keyRing = new KeyRingIAMMember("keyRing", KeyRingIAMMemberArgs.builder()
   *              .keyRingId("your-key-ring-id")
   *              .role("roles/cloudkms.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(KeyRingIAMMemberConditionArgs.builder()
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
   */
  def KeyRingIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.KeyRingIAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.KeyRingIAMBindingArgs.builder
    com.pulumi.gcp.kms.KeyRingIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.FolderKajPolicyConfigArgs.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     *  created in this folder. This is only used when a Key Access Justifications
     *  policy is not provided in the CreateCryptoKeyRequest.
     *  Structure is documented below.
     * @return builder
     */
    def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.FolderKajPolicyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  /**
   * `ProjectAutokeyConfig` is a singleton resource used to configure the auto-provisioning
   *  flow of CryptoKeys for CMEK.
   * 
   *  &gt; **Note:** ProjectAutokeyConfigs cannot be deleted from Google Cloud Platform.
   *  Destroying a Terraform-managed ProjectAutokeyConfigs will remove it from state but
   *  *will not delete the resource from the project.*
   * 
   *  To get more information about ProjectAutokeyConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/AutokeyConfig)
   *  * How-to Guides
   *      * [Cloud KMS with Autokey](https://cloud.google.com/kms/docs/kms-with-autokey)
   */
  def ProjectAutokeyConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.ProjectAutokeyConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.ProjectAutokeyConfigArgs.builder
    com.pulumi.gcp.kms.ProjectAutokeyConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.EkmConnectionIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.EkmConnectionIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Encrypts secret data with Google Cloud KMS and provides access to the ciphertext.
   * 
   *  &gt; **NOTE:** Using this resource will allow you to conceal secret data within your
   *  resource definitions, but it does not take care of protecting that data in the
   *  logging output, plan output, or state output.  Please take care to secure your secret
   *  data outside of resource definitions.
   * 
   *  To get more information about SecretCiphertext, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys/encrypt)
   *  * How-to Guides
   *      * [Encrypting and decrypting data with a symmetric key](https://cloud.google.com/kms/docs/encrypt-decrypt)
   */
  def SecretCiphertext(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.SecretCiphertextArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.kms.SecretCiphertextArgs.builder
    com.pulumi.gcp.kms.SecretCiphertext(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * `Ekm Connections` are used to control the connection settings for an `EXTERNAL_VPC` CryptoKey.
   *  It is used to connect customer&#39;s external key manager to Google Cloud EKM.
   * 
   *  &gt; **Note:** Ekm Connections cannot be deleted from Google Cloud Platform.
   * 
   *  To get more information about EkmConnection, see:
   * 
   *  * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.ekmConnections)
   *  * How-to Guides
   *      * [Creating a Ekm Connection](https://cloud.google.com/kms/docs/create-ekm-connection)
   */
  def EkmConnection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.kms.EkmConnectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.kms.EkmConnectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.kms.EkmConnection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.kms.OrganizationKajPolicyConfigArgs.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     *  created in this organization. This is only used when a Key Access Justifications
     *  policy is not provided in the CreateCryptoKeyRequest.
     *  Structure is documented below.
     * @return builder
     */
    def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.OrganizationKajPolicyConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder)
    /**
     * @param keyAccessJustificationsPolicy (Optional, Beta)
     *  The policy used for Key Access Justifications Policy Enforcement. If this
     *  field is present and this key is enrolled in Key Access Justifications
     *  Policy Enforcement, the policy will be evaluated in encrypt, decrypt, and
     *  sign operations, and the operation will fail if rejected by the policy. The
     *  policy is defined by specifying zero or more allowed justification codes.
     *  https://cloud.google.com/assured-workloads/key-access-justifications/docs/justification-codes
     *  By default, this field is absent, and all justification codes are allowed.
     *  This field is currently in beta and is subject to change.
     *  Structure is documented below.
     * @return builder
     */
    def keyAccessJustificationsPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyKeyAccessJustificationsPolicyArgs.builder
      builder.keyAccessJustificationsPolicy(args(argsBuilder).build)

    /**
     * @param primaries A copy of the primary CryptoKeyVersion that will be used by cryptoKeys.encrypt when this CryptoKey is given in EncryptRequest.name.
     *  Keys with purpose ENCRYPT_DECRYPT may have a primary. For other keys, this field will be unset.
     *  Structure is documented below.
     * @return builder
     */
    def primaries(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyPrimaryArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyPrimaryArgs.builder
      builder.primaries(args.map(_(argsBuilder).build)*)

    /**
     * @param versionTemplate A template describing settings for new crypto key versions.
     *  Structure is documented below.
     * @return builder
     */
    def versionTemplate(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs.builder
      builder.versionTemplate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigState.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     *  created in this organization. This is only used when a Key Access Justifications
     *  policy is not provided in the CreateCryptoKeyRequest.
     *  Structure is documented below.
     * @return builder
     */
    def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.OrganizationKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder)
    /**
     * @param serverCertificates Required. A list of leaf server certificates used to authenticate HTTPS connections to the EKM replica. Currently, a maximum of 10 Certificate is supported.
     *  Structure is documented below.
     * @return builder
     */
    def serverCertificates(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverServerCertificateArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverServerCertificateArgs.builder
      builder.serverCertificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.kms.inputs.KeyRingIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.KeyRingIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigState.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     *  created in this folder. This is only used when a Key Access Justifications
     *  policy is not provided in the CreateCryptoKeyRequest.
     *  Structure is documented below.
     * @return builder
     */
    def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.FolderKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionState.Builder)
    /**
     * @param serviceResolvers A list of ServiceResolvers where the EKM can be reached. There should be one ServiceResolver per EKM replica. Currently, only a single ServiceResolver is supported
     *  Structure is documented below.
     * @return builder
     */
    def serviceResolvers(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.EkmConnectionState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionServiceResolverArgs.builder
      builder.serviceResolvers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyVersionState.Builder)
    /**
     * @param attestations Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google.
     *  Only provided for key versions with protectionLevel HSM.
     *  Structure is documented below.
     * @return builder
     */
    def attestations(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.builder
      builder.attestations(args.map(_(argsBuilder).build)*)

    /**
     * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     *  Structure is documented below.
     * @return builder
     */
    def externalProtectionLevelOptions(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionExternalProtectionLevelOptionsArgs.builder
      builder.externalProtectionLevelOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.KeyRingImportJobState.Builder)
    /**
     * @param attestations Statement that was generated and signed by the key creator (for example, an HSM) at key creation time.
     *  Use this statement to verify attributes of the key as stored on the HSM, independently of Google.
     *  Only present if the chosen ImportMethod is one with a protection level of HSM.
     *  Structure is documented below.
     * @return builder
     */
    def attestations(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingImportJobAttestationArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.KeyRingImportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingImportJobAttestationArgs.builder
      builder.attestations(args.map(_(argsBuilder).build)*)

    /**
     * @param publicKeys The public key with which to wrap key material prior to import. Only returned if state is `ACTIVE`.
     *  Structure is documented below.
     * @return builder
     */
    def publicKeys(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingImportJobPublicKeyArgs.Builder]*):
        com.pulumi.gcp.kms.inputs.KeyRingImportJobState.Builder =
      def argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingImportJobPublicKeyArgs.builder
      builder.publicKeys(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigState.Builder)
    /**
     * @param defaultKeyAccessJustificationPolicy The default key access justification policy used when a CryptoKey is
     *  created in this project. This is only used when a Key Access Justifications
     *  policy is not provided in the CreateCryptoKeyRequest.
     *  Structure is documented below.
     * @return builder
     */
    def defaultKeyAccessJustificationPolicy(args: Endofunction[com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.Builder]):
        com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.ProjectKajPolicyConfigDefaultKeyAccessJustificationPolicyArgs.builder
      builder.defaultKeyAccessJustificationPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder)
    /**
     * @param certChains The certificate chains needed to validate the attestation
     *  Structure is documented below.
     * @return builder
     */
    def certChains(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationCertChainsArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationCertChainsArgs.builder
      builder.certChains(args(argsBuilder).build)

    /**
     * @param externalProtectionLevelOptions ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     *  Structure is documented below.
     * @return builder
     * @deprecated `externalProtectionLevelOptions` is being un-nested from the `attestation` field. Please use the top level `externalProtectionLevelOptions` field instead.
     */
    @deprecated def externalProtectionLevelOptions(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs.builder
      builder.externalProtectionLevelOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.CryptoKeyIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.KeyRingIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.KeyRingIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.KeyRingIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.kms.inputs.EkmConnectionIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
