package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object healthcare:
  extension (builder: com.pulumi.gcp.healthcare.DatasetIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DatasetIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A Healthcare `Dataset` is a toplevel logical grouping of `dicomStores`, `fhirStores` and `hl7V2Stores`.
   * 
   *  To get more information about Dataset, see:
   * 
   *  * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets)
   *  * How-to Guides
   *      * [Creating a dataset](https://cloud.google.com/healthcare/docs/how-tos/datasets)
   */
  def Dataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DatasetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.healthcare.DatasetArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.healthcare.Dataset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder)
    /**
     * @param notificationConfig (Optional, Deprecated)
     *  A nested object resource.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a
     *  message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     *  is sent as part of the notification. Supplied by the client.
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.Builder]*):
        com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param parserConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def parserConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.builder
      builder.parserConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
   *  * `gcp.healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
   *  * `gcp.healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DicomStoreIamBinding` and `gcp.healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.DicomStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.DicomStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var dicomStore = new DicomStoreIamPolicy("dicomStore", DicomStoreIamPolicyArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamBinding("dicomStore", DicomStoreIamBindingArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMember;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamMember("dicomStore", DicomStoreIamMemberArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamBinding("dicomStore", DicomStoreIamBindingArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMember;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamMember("dicomStore", DicomStoreIamMemberArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
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
  def DicomStoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs.builder
    com.pulumi.gcp.healthcare.DicomStoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Consent Management API is a tool for tracking user consents and the documentation associated with the consents.
   * 
   *  To get more information about ConsentStore, see:
   * 
   *  * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.consentStores)
   *  * How-to Guides
   *      * [Creating a Consent store](https://cloud.google.com/healthcare/docs/how-tos/consent)
   */
  def ConsentStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.ConsentStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.healthcare.ConsentStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.healthcare.ConsentStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
   *  * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
   *  * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.ConsentStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConsentStoreIamPolicy("policy", ConsentStoreIamPolicyArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConsentStoreIamBinding("binding", ConsentStoreIamBindingArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMember;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConsentStoreIamMember("member", ConsentStoreIamMemberArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
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
   *  # IAM policy for Cloud Healthcare ConsentStore
   * 
   *  Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
   *  * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
   *  * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.ConsentStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConsentStoreIamPolicy("policy", ConsentStoreIamPolicyArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConsentStoreIamBinding("binding", ConsentStoreIamBindingArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMember;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConsentStoreIamMember("member", ConsentStoreIamMemberArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
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
   *  * {{dataset}}/consentStores/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Healthcare consentstore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_healthcare_consent_store_iam_member.editor &#34;{{dataset}}/consentStores/{{consent_store}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_healthcare_consent_store_iam_binding.editor &#34;{{dataset}}/consentStores/{{consent_store}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:healthcare/consentStoreIamMember:ConsentStoreIamMember editor {{dataset}}/consentStores/{{consent_store}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConsentStoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs.builder
    com.pulumi.gcp.healthcare.ConsentStoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare dataset. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
   *  * `gcp.healthcare.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
   *  * `gcp.healthcare.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DatasetIamBinding` and `gcp.healthcare.DatasetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.DatasetIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.DatasetIamPolicy
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
   *  import com.pulumi.gcp.healthcare.DatasetIamPolicy;
   *  import com.pulumi.gcp.healthcare.DatasetIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamBinding;
   *  import com.pulumi.gcp.healthcare.DatasetIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamBinding("dataset", DatasetIamBindingArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamMember;
   *  import com.pulumi.gcp.healthcare.DatasetIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamMember("dataset", DatasetIamMemberArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamBinding;
   *  import com.pulumi.gcp.healthcare.DatasetIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamBinding("dataset", DatasetIamBindingArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamMember;
   *  import com.pulumi.gcp.healthcare.DatasetIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamMember("dataset", DatasetIamMemberArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
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
  def DatasetIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DatasetIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.DatasetIamBindingArgs.builder
    com.pulumi.gcp.healthcare.DatasetIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare dataset. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
   *  * `gcp.healthcare.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
   *  * `gcp.healthcare.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DatasetIamBinding` and `gcp.healthcare.DatasetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.DatasetIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.DatasetIamPolicy
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
   *  import com.pulumi.gcp.healthcare.DatasetIamPolicy;
   *  import com.pulumi.gcp.healthcare.DatasetIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamBinding;
   *  import com.pulumi.gcp.healthcare.DatasetIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamBinding("dataset", DatasetIamBindingArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamMember;
   *  import com.pulumi.gcp.healthcare.DatasetIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamMember("dataset", DatasetIamMemberArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamBinding;
   *  import com.pulumi.gcp.healthcare.DatasetIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamBinding("dataset", DatasetIamBindingArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamMember;
   *  import com.pulumi.gcp.healthcare.DatasetIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamMember("dataset", DatasetIamMemberArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
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
  def DatasetIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DatasetIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.DatasetIamPolicyArgs.builder
    com.pulumi.gcp.healthcare.DatasetIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
   *  * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
   *  * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.ConsentStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConsentStoreIamPolicy("policy", ConsentStoreIamPolicyArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConsentStoreIamBinding("binding", ConsentStoreIamBindingArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMember;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConsentStoreIamMember("member", ConsentStoreIamMemberArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
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
   *  # IAM policy for Cloud Healthcare ConsentStore
   * 
   *  Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
   *  * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
   *  * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.ConsentStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConsentStoreIamPolicy("policy", ConsentStoreIamPolicyArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConsentStoreIamBinding("binding", ConsentStoreIamBindingArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMember;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConsentStoreIamMember("member", ConsentStoreIamMemberArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
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
   *  * {{dataset}}/consentStores/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Healthcare consentstore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_healthcare_consent_store_iam_member.editor &#34;{{dataset}}/consentStores/{{consent_store}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_healthcare_consent_store_iam_binding.editor &#34;{{dataset}}/consentStores/{{consent_store}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:healthcare/consentStoreIamBinding:ConsentStoreIamBinding editor {{dataset}}/consentStores/{{consent_store}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConsentStoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs.builder
    com.pulumi.gcp.healthcare.ConsentStoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.healthcare.WorkspaceArgs.Builder)
    /**
     * @param settings Settings associated with this workspace.
     *  Structure is documented below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.Builder]):
        com.pulumi.gcp.healthcare.WorkspaceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.PipelineJobArgs.Builder)
    /**
     * @param backfillPipelineJob Specifies the backfill configuration.
     *  Structure is documented below.
     * @return builder
     */
    def backfillPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.PipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.builder
      builder.backfillPipelineJob(args(argsBuilder).build)

    /**
     * @param mappingPipelineJob Specifies mapping configuration.
     *  Structure is documented below.
     * @return builder
     */
    def mappingPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.PipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.builder
      builder.mappingPipelineJob(args(argsBuilder).build)

    /**
     * @param reconciliationPipelineJob Specifies reconciliation configuration.
     *  Structure is documented below.
     * @return builder
     */
    def reconciliationPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.PipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.builder
      builder.reconciliationPipelineJob(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
   *  * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
   *  * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.ConsentStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConsentStoreIamPolicy("policy", ConsentStoreIamPolicyArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConsentStoreIamBinding("binding", ConsentStoreIamBindingArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMember;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConsentStoreIamMember("member", ConsentStoreIamMemberArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
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
   *  # IAM policy for Cloud Healthcare ConsentStore
   * 
   *  Three different resources help you manage your IAM policy for Cloud Healthcare ConsentStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Authoritative. Sets the IAM policy for the consentstore and replaces any existing policy already attached.
   *  * `gcp.healthcare.ConsentStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the consentstore are preserved.
   *  * `gcp.healthcare.ConsentStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the consentstore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.healthcare.ConsentStoreIamPolicy`: Retrieves the IAM policy for the consentstore
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.ConsentStoreIamBinding` and `gcp.healthcare.ConsentStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.ConsentStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.ConsentStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.ConsentStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var policy = new ConsentStoreIamPolicy("policy", ConsentStoreIamPolicyArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new ConsentStoreIamBinding("binding", ConsentStoreIamBindingArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.ConsentStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMember;
   *  import com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new ConsentStoreIamMember("member", ConsentStoreIamMemberArgs.builder()
   *              .dataset(my_consent.dataset())
   *              .consentStoreId(my_consent.name())
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
   *  * {{dataset}}/consentStores/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Healthcare consentstore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_healthcare_consent_store_iam_member.editor &#34;{{dataset}}/consentStores/{{consent_store}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_healthcare_consent_store_iam_binding.editor &#34;{{dataset}}/consentStores/{{consent_store}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:healthcare/consentStoreIamPolicy:ConsentStoreIamPolicy editor {{dataset}}/consentStores/{{consent_store}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConsentStoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.ConsentStoreIamPolicyArgs.builder
    com.pulumi.gcp.healthcare.ConsentStoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Hl7V2Store is a datastore inside a Healthcare dataset that conforms to the FHIR (https://www.hl7.org/hl7V2/STU3/)
   *  standard for Healthcare information exchange
   * 
   *  To get more information about Hl7V2Store, see:
   * 
   *  * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.hl7V2Stores)
   *  * How-to Guides
   *      * [Creating a HL7v2 Store](https://cloud.google.com/healthcare/docs/how-tos/hl7v2)
   */
  def Hl7Store(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.Hl7StoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.healthcare.Hl7StoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.healthcare.Hl7Store(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare dataset. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
   *  * `gcp.healthcare.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
   *  * `gcp.healthcare.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DatasetIamBinding` and `gcp.healthcare.DatasetIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.DatasetIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.DatasetIamPolicy
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
   *  import com.pulumi.gcp.healthcare.DatasetIamPolicy;
   *  import com.pulumi.gcp.healthcare.DatasetIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamBinding;
   *  import com.pulumi.gcp.healthcare.DatasetIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamBinding("dataset", DatasetIamBindingArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamMember;
   *  import com.pulumi.gcp.healthcare.DatasetIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamMember("dataset", DatasetIamMemberArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamBinding;
   *  import com.pulumi.gcp.healthcare.DatasetIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamBinding("dataset", DatasetIamBindingArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DatasetIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DatasetIamMember;
   *  import com.pulumi.gcp.healthcare.DatasetIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dataset = new DatasetIamMember("dataset", DatasetIamMemberArgs.builder()
   *              .datasetId("your-dataset-id")
   *              .role("roles/editor")
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
  def DatasetIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DatasetIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.DatasetIamMemberArgs.builder
    com.pulumi.gcp.healthcare.DatasetIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.healthcare.DatasetArgs.Builder)
    /**
     * @param encryptionSpec A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.healthcare.DatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.FhirStoreArgs.Builder)
    /**
     * @param consentConfig (Optional, Beta)
     *  Specifies whether this store has consent enforcement. Not available for DSTU2 FHIR version due to absence of Consent resources. Not supported for R5 FHIR version.
     *  Structure is documented below.
     * @return builder
     */
    def consentConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.builder
      builder.consentConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig (Optional, Deprecated)
     *  A nested object resource.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notifcation configs that configure the notification for every resource mutation in this FHIR store.
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param streamConfigs A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     *  this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     *  resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     *  from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     *  bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
     *  the order of dozens of seconds) is expected before the results show up in the streaming destination.
     *  Structure is documented below.
     * @return builder
     */
    def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param validationConfig Configuration for how to validate incoming FHIR resources against configured profiles.
     *  Structure is documented below.
     * @return builder
     */
    def validationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.FhirStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.builder
      builder.validationConfig(args(argsBuilder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare FHIR store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.FhirStoreIamPolicy`: Authoritative. Sets the IAM policy for the FHIR store and replaces any existing policy already attached.
   *  * `gcp.healthcare.FhirStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the FHIR store are preserved.
   *  * `gcp.healthcare.FhirStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the FHIR store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.FhirStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.FhirStoreIamBinding` and `gcp.healthcare.FhirStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.FhirStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.FhirStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.FhirStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.FhirStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var fhirStore = new FhirStoreIamPolicy("fhirStore", FhirStoreIamPolicyArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamBinding("fhirStore", FhirStoreIamBindingArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMember;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamMember("fhirStore", FhirStoreIamMemberArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamBinding("fhirStore", FhirStoreIamBindingArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMember;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamMember("fhirStore", FhirStoreIamMemberArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
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
  def FhirStoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs.builder
    com.pulumi.gcp.healthcare.FhirStoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A DicomStore is a datastore inside a Healthcare dataset that conforms to the DICOM
   *  (https://www.dicomstandard.org/about/) standard for Healthcare information exchange
   * 
   *  To get more information about DicomStore, see:
   * 
   *  * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.dicomStores)
   *  * How-to Guides
   *      * [Creating a DICOM store](https://cloud.google.com/healthcare/docs/how-tos/dicom)
   */
  def DicomStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DicomStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.healthcare.DicomStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.healthcare.DicomStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.healthcare.DicomStoreArgs.Builder)
    /**
     * @param notificationConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.DicomStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param streamConfigs (Optional, Beta)
     *  To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     *  streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     *  Structure is documented below.
     * @return builder
     */
    def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.DicomStoreArgs.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
   *  * `gcp.healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
   *  * `gcp.healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DicomStoreIamBinding` and `gcp.healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.DicomStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.DicomStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var dicomStore = new DicomStoreIamPolicy("dicomStore", DicomStoreIamPolicyArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamBinding("dicomStore", DicomStoreIamBindingArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMember;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamMember("dicomStore", DicomStoreIamMemberArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamBinding("dicomStore", DicomStoreIamBindingArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMember;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamMember("dicomStore", DicomStoreIamMemberArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
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
  def DicomStoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DicomStoreIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.DicomStoreIamPolicyArgs.builder
    com.pulumi.gcp.healthcare.DicomStoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare HL7v2 store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.Hl7StoreIamPolicy`: Authoritative. Sets the IAM policy for the HL7v2 store and replaces any existing policy already attached.
   *  * `gcp.healthcare.Hl7StoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the HL7v2 store are preserved.
   *  * `gcp.healthcare.Hl7StoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the HL7v2 store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.Hl7StoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.Hl7StoreIamBinding` and `gcp.healthcare.Hl7StoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.Hl7StoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.Hl7StoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.Hl7StoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var hl7V2Store = new Hl7StoreIamPolicy("hl7V2Store", Hl7StoreIamPolicyArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBinding;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamBinding("hl7V2Store", Hl7StoreIamBindingArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMember;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamMember("hl7V2Store", Hl7StoreIamMemberArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBinding;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamBinding("hl7V2Store", Hl7StoreIamBindingArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMember;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamMember("hl7V2Store", Hl7StoreIamMemberArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
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
  def Hl7StoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs.builder
    com.pulumi.gcp.healthcare.Hl7StoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type HealthcareFunctions = com.pulumi.gcp.healthcare.HealthcareFunctions
  object HealthcareFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.healthcare.HealthcareFunctions.*
  extension (self: HealthcareFunctions.type)
    /** Retrieves the current IAM policy data for consentstore */
    def getConsentStoreIamPolicy(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetConsentStoreIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.healthcare.outputs.GetConsentStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetConsentStoreIamPolicyArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getConsentStoreIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for consentstore */
    def getConsentStoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetConsentStoreIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.healthcare.outputs.GetConsentStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetConsentStoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getConsentStoreIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare dataset.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetDatasetIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getDatasetIamPolicy(GetDatasetIamPolicyArgs.builder()
     *              .datasetId(dataset.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDatasetIamPolicy(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetDatasetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.healthcare.outputs.GetDatasetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetDatasetIamPolicyArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getDatasetIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare dataset.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetDatasetIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getDatasetIamPolicy(GetDatasetIamPolicyArgs.builder()
     *              .datasetId(dataset.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDatasetIamPolicyPlain(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetDatasetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.healthcare.outputs.GetDatasetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetDatasetIamPolicyPlainArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getDatasetIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare DICOM store.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetDicomStoreIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getDicomStoreIamPolicy(GetDicomStoreIamPolicyArgs.builder()
     *              .dicomStoreId(dicomStore.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDicomStoreIamPolicy(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetDicomStoreIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.healthcare.outputs.GetDicomStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetDicomStoreIamPolicyArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getDicomStoreIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare DICOM store.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetDicomStoreIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getDicomStoreIamPolicy(GetDicomStoreIamPolicyArgs.builder()
     *              .dicomStoreId(dicomStore.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getDicomStoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetDicomStoreIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.healthcare.outputs.GetDicomStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetDicomStoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getDicomStoreIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare FHIR store.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetFhirStoreIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getFhirStoreIamPolicy(GetFhirStoreIamPolicyArgs.builder()
     *              .fhirStoreId(fhirStore.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getFhirStoreIamPolicy(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetFhirStoreIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.healthcare.outputs.GetFhirStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetFhirStoreIamPolicyArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getFhirStoreIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare FHIR store.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetFhirStoreIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getFhirStoreIamPolicy(GetFhirStoreIamPolicyArgs.builder()
     *              .fhirStoreId(fhirStore.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getFhirStoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetFhirStoreIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.healthcare.outputs.GetFhirStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetFhirStoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getFhirStoreIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare HL7v2 store.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetHl7V2StoreIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getHl7V2StoreIamPolicy(GetHl7V2StoreIamPolicyArgs.builder()
     *              .hl7V2StoreId(hl7V2Store.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getHl7V2StoreIamPolicy(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetHl7V2StoreIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.healthcare.outputs.GetHl7V2StoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetHl7V2StoreIamPolicyArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getHl7V2StoreIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Google Cloud Healthcare HL7v2 store.
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
     *  import com.pulumi.gcp.healthcare.HealthcareFunctions;
     *  import com.pulumi.gcp.healthcare.inputs.GetHl7V2StoreIamPolicyArgs;
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
     *          final var foo = HealthcareFunctions.getHl7V2StoreIamPolicy(GetHl7V2StoreIamPolicyArgs.builder()
     *              .hl7V2StoreId(hl7V2Store.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getHl7V2StoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.healthcare.inputs.GetHl7V2StoreIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.healthcare.outputs.GetHl7V2StoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.GetHl7V2StoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.healthcare.HealthcareFunctions.getHl7V2StoreIamPolicyPlain(args(argsBuilder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare FHIR store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.FhirStoreIamPolicy`: Authoritative. Sets the IAM policy for the FHIR store and replaces any existing policy already attached.
   *  * `gcp.healthcare.FhirStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the FHIR store are preserved.
   *  * `gcp.healthcare.FhirStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the FHIR store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.FhirStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.FhirStoreIamBinding` and `gcp.healthcare.FhirStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.FhirStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.FhirStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.FhirStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.FhirStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var fhirStore = new FhirStoreIamPolicy("fhirStore", FhirStoreIamPolicyArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamBinding("fhirStore", FhirStoreIamBindingArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMember;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamMember("fhirStore", FhirStoreIamMemberArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamBinding("fhirStore", FhirStoreIamBindingArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMember;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamMember("fhirStore", FhirStoreIamMemberArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
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
  def FhirStoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs.builder
    com.pulumi.gcp.healthcare.FhirStoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare HL7v2 store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.Hl7StoreIamPolicy`: Authoritative. Sets the IAM policy for the HL7v2 store and replaces any existing policy already attached.
   *  * `gcp.healthcare.Hl7StoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the HL7v2 store are preserved.
   *  * `gcp.healthcare.Hl7StoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the HL7v2 store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.Hl7StoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.Hl7StoreIamBinding` and `gcp.healthcare.Hl7StoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.Hl7StoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.Hl7StoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.Hl7StoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var hl7V2Store = new Hl7StoreIamPolicy("hl7V2Store", Hl7StoreIamPolicyArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBinding;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamBinding("hl7V2Store", Hl7StoreIamBindingArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMember;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamMember("hl7V2Store", Hl7StoreIamMemberArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBinding;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamBinding("hl7V2Store", Hl7StoreIamBindingArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMember;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamMember("hl7V2Store", Hl7StoreIamMemberArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
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
  def Hl7StoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.Hl7StoreIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.Hl7StoreIamPolicyArgs.builder
    com.pulumi.gcp.healthcare.Hl7StoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.ConsentStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
   *  * `gcp.healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
   *  * `gcp.healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DicomStoreIamBinding` and `gcp.healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.DicomStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.DicomStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var dicomStore = new DicomStoreIamPolicy("dicomStore", DicomStoreIamPolicyArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamBinding("dicomStore", DicomStoreIamBindingArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMember;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamMember("dicomStore", DicomStoreIamMemberArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamBinding("dicomStore", DicomStoreIamBindingArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.DicomStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMember;
   *  import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var dicomStore = new DicomStoreIamMember("dicomStore", DicomStoreIamMemberArgs.builder()
   *              .dicomStoreId("your-dicom-store-id")
   *              .role("roles/editor")
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
  def DicomStoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs.builder
    com.pulumi.gcp.healthcare.DicomStoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Data Mapper workspace is used to configure Data Mapper access, permissions and data sources for mapping clinical patient data to the FHIR standard.
   * 
   *  To get more information about Workspace, see:
   * 
   *  * [API documentation](https://cloud.google.com/healthcare-api/healthcare-data-engine/docs/reference/rest/v1/projects.locations.datasets.dataMapperWorkspaces)
   *  * How-to Guides
   *      * [Create and manage Data Mapper workspaces ](https://cloud.google.com/healthcare-api/healthcare-data-engine/docs/manage-workspaces)
   */
  def Workspace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.WorkspaceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.healthcare.WorkspaceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.healthcare.Workspace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * PipelineJobs are Long Running Operations on Healthcare API to Map or Reconcile
   *  incoming data into FHIR format
   * 
   *  To get more information about PipelineJob, see:
   * 
   *  * [API documentation](https://cloud.google.com/healthcare-api/healthcare-data-engine/docs/reference/rest/v1/projects.locations.datasets.pipelineJobs)
   *  * How-to Guides
   *      * [Creating a PipelineJob](https://cloud.google.com/healthcare-api/private/healthcare-data-engine/docs/reference/rest/v1/projects.locations.datasets.pipelineJobs#PipelineJob)
   */
  def PipelineJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.PipelineJobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.healthcare.PipelineJobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.healthcare.PipelineJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare HL7v2 store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.Hl7StoreIamPolicy`: Authoritative. Sets the IAM policy for the HL7v2 store and replaces any existing policy already attached.
   *  * `gcp.healthcare.Hl7StoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the HL7v2 store are preserved.
   *  * `gcp.healthcare.Hl7StoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the HL7v2 store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.Hl7StoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.Hl7StoreIamBinding` and `gcp.healthcare.Hl7StoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.Hl7StoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.Hl7StoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.Hl7StoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var hl7V2Store = new Hl7StoreIamPolicy("hl7V2Store", Hl7StoreIamPolicyArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBinding;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamBinding("hl7V2Store", Hl7StoreIamBindingArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMember;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamMember("hl7V2Store", Hl7StoreIamMemberArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBinding;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamBinding("hl7V2Store", Hl7StoreIamBindingArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.Hl7StoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMember;
   *  import com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var hl7V2Store = new Hl7StoreIamMember("hl7V2Store", Hl7StoreIamMemberArgs.builder()
   *              .hl7V2StoreId("your-hl7-v2-store-id")
   *              .role("roles/editor")
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
  def Hl7StoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs.builder
    com.pulumi.gcp.healthcare.Hl7StoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** These resources are in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  Three different resources help you manage your IAM policy for Healthcare FHIR store. Each of these resources serves a different use case:
   * 
   *  * `gcp.healthcare.FhirStoreIamPolicy`: Authoritative. Sets the IAM policy for the FHIR store and replaces any existing policy already attached.
   *  * `gcp.healthcare.FhirStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the FHIR store are preserved.
   *  * `gcp.healthcare.FhirStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the FHIR store are preserved.
   * 
   *  &gt; **Note:** `gcp.healthcare.FhirStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.FhirStoreIamBinding` and `gcp.healthcare.FhirStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.healthcare.FhirStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.FhirStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.healthcare.FhirStoreIamPolicy
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
   *  import com.pulumi.gcp.healthcare.FhirStoreIamPolicy;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *          var fhirStore = new FhirStoreIamPolicy("fhirStore", FhirStoreIamPolicyArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamBinding("fhirStore", FhirStoreIamBindingArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMember;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamMember("fhirStore", FhirStoreIamMemberArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBinding;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamBinding("fhirStore", FhirStoreIamBindingArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.healthcare.FhirStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMember;
   *  import com.pulumi.gcp.healthcare.FhirStoreIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var fhirStore = new FhirStoreIamMember("fhirStore", FhirStoreIamMemberArgs.builder()
   *              .fhirStoreId("your-fhir-store-id")
   *              .role("roles/editor")
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
  def FhirStoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.healthcare.FhirStoreIamPolicyArgs.builder
    com.pulumi.gcp.healthcare.FhirStoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.ConsentStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A FhirStore is a datastore inside a Healthcare dataset that conforms to the FHIR (https://www.hl7.org/fhir/STU3/)
   *  standard for Healthcare information exchange
   * 
   *  To get more information about FhirStore, see:
   * 
   *  * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets.fhirStores)
   *  * How-to Guides
   *      * [Creating a FHIR store](https://cloud.google.com/healthcare/docs/how-tos/fhir)
   */
  def FhirStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.healthcare.FhirStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.healthcare.FhirStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.healthcare.FhirStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.Builder)
    /**
     * @param whistleConfigSource Specifies the path to the mapping configuration for harmonization pipeline.
     *  Structure is documented below.
     * @return builder
     */
    def whistleConfigSource(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigWhistleConfigSourceArgs.builder
      builder.whistleConfigSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DatasetState.Builder)
    /**
     * @param encryptionSpec A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DatasetState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder)
    /**
     * @param bigqueryDestination BigQueryDestination to include a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDestination(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigBigqueryDestinationArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigBigqueryDestinationArgs.builder
      builder.bigqueryDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.WorkspaceState.Builder)
    /**
     * @param settings Settings associated with this workspace.
     *  Structure is documented below.
     * @return builder
     */
    def settings(args: Endofunction[com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.WorkspaceState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.WorkspaceSettingsArgs.builder
      builder.settings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder)
    /**
     * @param accessDeterminationLogConfig Specifies how the server logs the consent-aware requests. If not specified, the AccessDeterminationLogConfig.LogLevel.MINIMUM option is used.
     *  Structure is documented below.
     * @return builder
     */
    def accessDeterminationLogConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigAccessDeterminationLogConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigAccessDeterminationLogConfigArgs.builder
      builder.accessDeterminationLogConfig(args(argsBuilder).build)

    /**
     * @param consentHeaderHandling Different options to configure the behaviour of the server when handling the X-Consent-Scope header.
     *  Structure is documented below.
     * @return builder
     */
    def consentHeaderHandling(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigConsentHeaderHandlingArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigConsentHeaderHandlingArgs.builder
      builder.consentHeaderHandling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder)
    /**
     * @param notificationConfig (Optional, Deprecated)
     *  A nested object resource.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notification configs. Each configuration uses a filter to determine whether to publish a
     *  message (both Ingest &amp; Create) on the corresponding notification destination. Only the message name
     *  is sent as part of the notification. Supplied by the client.
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param parserConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def parserConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs.builder
      builder.parserConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.Builder)
    /**
     * @param lastUpdatedPartitionConfig The configuration for exported BigQuery tables to be partitioned by FHIR resource&#39;s last updated time column.
     *  Structure is documented below.
     * @return builder
     */
    def lastUpdatedPartitionConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigLastUpdatedPartitionConfigArgs.builder
      builder.lastUpdatedPartitionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.ConsentStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder)
    /**
     * @param consentConfig (Optional, Beta)
     *  Specifies whether this store has consent enforcement. Not available for DSTU2 FHIR version due to absence of Consent resources. Not supported for R5 FHIR version.
     *  Structure is documented below.
     * @return builder
     */
    def consentConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreConsentConfigArgs.builder
      builder.consentConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig (Optional, Deprecated)
     *  A nested object resource.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     * @return builder
     * @deprecated `notificationConfig` is deprecated and will be removed in a future major release. Use `notificationConfigs` instead.
     */
    @deprecated def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param notificationConfigs A list of notifcation configs that configure the notification for every resource mutation in this FHIR store.
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreNotificationConfigArgs.builder
      builder.notificationConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param streamConfigs A list of streaming configs that configure the destinations of streaming export for every resource mutation in
     *  this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next
     *  resource mutation is streamed to the new location in addition to the existing ones. When a location is removed
     *  from the list, the server stops streaming to that location. Before adding a new config, you must add the required
     *  bigquery.dataEditor role to your project&#39;s Cloud Healthcare Service Agent service account. Some lag (typically on
     *  the order of dozens of seconds) is expected before the results show up in the streaming destination.
     *  Structure is documented below.
     * @return builder
     */
    def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param validationConfig Configuration for how to validate incoming FHIR resources against configured profiles.
     *  Structure is documented below.
     * @return builder
     */
    def validationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreValidationConfigArgs.builder
      builder.validationConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder)
    /**
     * @param backfillPipelineJob Specifies the backfill configuration.
     *  Structure is documented below.
     * @return builder
     */
    def backfillPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobBackfillPipelineJobArgs.builder
      builder.backfillPipelineJob(args(argsBuilder).build)

    /**
     * @param mappingPipelineJob Specifies mapping configuration.
     *  Structure is documented below.
     * @return builder
     */
    def mappingPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.builder
      builder.mappingPipelineJob(args(argsBuilder).build)

    /**
     * @param reconciliationPipelineJob Specifies reconciliation configuration.
     *  Structure is documented below.
     * @return builder
     */
    def reconciliationPipelineJob(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.builder
      builder.reconciliationPipelineJob(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.Builder)
    /**
     * @param schemaConfig The configuration for the exported BigQuery schema.
     *  Structure is documented below.
     * @return builder
     */
    def schemaConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfigArgs.builder
      builder.schemaConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.Builder)
    /**
     * @param whistleConfigSource Specifies the path to the mapping configuration for harmonization pipeline.
     *  Structure is documented below.
     * @return builder
     */
    def whistleConfigSource(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigWhistleConfigSourceArgs.builder
      builder.whistleConfigSource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DatasetIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DatasetIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder)
    /**
     * @param fhirStreamingSource A streaming FHIR data source.
     *  Structure is documented below.
     * @return builder
     */
    def fhirStreamingSource(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobFhirStreamingSourceArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobFhirStreamingSourceArgs.builder
      builder.fhirStreamingSource(args(argsBuilder).build)

    /**
     * @param mappingConfig The location of the mapping configuration.
     *  Structure is documented below.
     * @return builder
     */
    def mappingConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobMappingPipelineJobMappingConfigArgs.builder
      builder.mappingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DatasetIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DatasetIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.DicomStoreState.Builder)
    /**
     * @param notificationConfig A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.DicomStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param streamConfigs (Optional, Beta)
     *  To enable streaming to BigQuery, configure the streamConfigs object in your DICOM store.
     *  streamConfigs is an array, so you can specify multiple BigQuery destinations. You can stream metadata from a single DICOM store to up to five BigQuery tables in a BigQuery dataset.
     *  Structure is documented below.
     * @return builder
     */
    def streamConfigs(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.Builder]*):
        com.pulumi.gcp.healthcare.inputs.DicomStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigArgs.builder
      builder.streamConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder)
    /**
     * @param mergeConfig Specifies the location of the reconciliation configuration.
     *  Structure is documented below.
     * @return builder
     */
    def mergeConfig(args: Endofunction[com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.PipelineJobReconciliationPipelineJobMergeConfigArgs.builder
      builder.mergeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder)
    /**
     * @param bigqueryDestination The destination BigQuery structure that contains both the dataset location and corresponding schema config.
     *  The output is organized in one table per resource type. The server reuses the existing tables (if any) that
     *  are named after the resource types, e.g. &#34;Patient&#34;, &#34;Observation&#34;. When there is no existing table for a given
     *  resource type, the server attempts to create one.
     *  See the [streaming config reference](https://cloud.google.com/healthcare/docs/reference/rest/v1beta1/projects.locations.datasets.fhirStores#streamconfig) for more details.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDestination(args: Endofunction[com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.Builder]):
        com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.FhirStoreStreamConfigBigqueryDestinationArgs.builder
      builder.bigqueryDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.healthcare.DatasetIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.healthcare.DatasetIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
