package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object dns:
  object DnsFunctions:
    /**
     * Get the DNSKEY and DS records of DNSSEC-signed managed zones.
     * 
     * For more information see the
     * [official documentation](https://cloud.google.com/dns/docs/dnskeys/)
     * and [API](https://cloud.google.com/dns/docs/reference/v1/dnsKeys).
     * 
     * &gt; A gcp.dns.ManagedZone resource must have DNSSEC enabled in order
     * to contain any DNSKEYs. Queries to managed zones without this setting
     * enabled will result in a 404 error as the collection of DNSKEYs does
     * not exist in the DNS API.
     */
    inline def getKeys(args: Endofunction[com.pulumi.gcp.dns.inputs.GetKeysArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetKeysResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetKeysArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getKeys(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get the DNSKEY and DS records of DNSSEC-signed managed zones.
     * 
     * For more information see the
     * [official documentation](https://cloud.google.com/dns/docs/dnskeys/)
     * and [API](https://cloud.google.com/dns/docs/reference/v1/dnsKeys).
     * 
     * &gt; A gcp.dns.ManagedZone resource must have DNSSEC enabled in order
     * to contain any DNSKEYs. Queries to managed zones without this setting
     * enabled will result in a 404 error as the collection of DNSKEYs does
     * not exist in the DNS API.
     */
    inline def getKeysPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetKeysPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetKeysResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetKeysPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getKeysPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides access to a zone&#39;s attributes within Google Cloud DNS.
     * For more information see
     * [the official documentation](https://cloud.google.com/dns/zones/)
     * and
     * [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.dns.DnsFunctions;
     * import com.pulumi.gcp.dns.inputs.GetManagedZoneArgs;
     * import com.pulumi.gcp.dns.RecordSet;
     * import com.pulumi.gcp.dns.RecordSetArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var envDnsZone = DnsFunctions.getManagedZone(GetManagedZoneArgs.builder()
     *             .name("qa-zone")
     *             .build());
     * 
     *         var dns = new RecordSet("dns", RecordSetArgs.builder()
     *             .name(String.format("my-address.%s", envDnsZone.dnsName()))
     *             .type("TXT")
     *             .ttl(300)
     *             .managedZone(envDnsZone.name())
     *             .rrdatas("test")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getManagedZone(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZoneArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetManagedZoneResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZoneArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZone(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to a zone&#39;s attributes within Google Cloud DNS.
     * For more information see
     * [the official documentation](https://cloud.google.com/dns/zones/)
     * and
     * [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.dns.DnsFunctions;
     * import com.pulumi.gcp.dns.inputs.GetManagedZoneArgs;
     * import com.pulumi.gcp.dns.RecordSet;
     * import com.pulumi.gcp.dns.RecordSetArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var envDnsZone = DnsFunctions.getManagedZone(GetManagedZoneArgs.builder()
     *             .name("qa-zone")
     *             .build());
     * 
     *         var dns = new RecordSet("dns", RecordSetArgs.builder()
     *             .name(String.format("my-address.%s", envDnsZone.dnsName()))
     *             .type("TXT")
     *             .ttl(300)
     *             .managedZone(envDnsZone.name())
     *             .rrdatas("test")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getManagedZonePlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZonePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetManagedZoneResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZonePlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZonePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for managedzone */
    inline def getManagedZoneIamPolicy(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetManagedZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZoneIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for managedzone */
    inline def getManagedZoneIamPolicyPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetManagedZoneIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZoneIamPolicyPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZoneIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Provides access to a list of zones within Google Cloud DNS.
     * For more information see
     * [the official documentation](https://cloud.google.com/dns/zones/)
     * and
     * [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.dns.DnsFunctions;
     * import com.pulumi.gcp.dns.inputs.GetManagedZonesArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var zones = DnsFunctions.getManagedZones(GetManagedZonesArgs.builder()
     *             .project("my-project-id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getManagedZones(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZonesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetManagedZonesResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZonesArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZones(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Provides access to a list of zones within Google Cloud DNS.
     * For more information see
     * [the official documentation](https://cloud.google.com/dns/zones/)
     * and
     * [API](https://cloud.google.com/dns/api/v1/managedZones).
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.dns.DnsFunctions;
     * import com.pulumi.gcp.dns.inputs.GetManagedZonesArgs;
     * import java.util.ArrayList;
     * import java.util.Arrays;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var zones = DnsFunctions.getManagedZones(GetManagedZonesArgs.builder()
     *             .project("my-project-id")
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getManagedZonesPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetManagedZonesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetManagedZonesResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetManagedZonesPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getManagedZonesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get a DNS record set within Google Cloud DNS
     * For more information see
     * [the official documentation](https://cloud.google.com/dns/docs/records)
     * and
     * [API](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets)
     */
    inline def getRecordSet(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetRecordSetResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a DNS record set within Google Cloud DNS
     * For more information see
     * [the official documentation](https://cloud.google.com/dns/docs/records)
     * and
     * [API](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets)
     */
    inline def getRecordSetPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetRecordSetResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get a list of DNS record sets within a Google Cloud DNS managed zone. This data source allows you to list all record sets or filter them by name and type.
     * 
     * To get more information about Cloud DNS Record Sets, see:
     * 
     * * [API documentation](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets/list)
     * * [How-to Guides](https://cloud.google.com/dns/docs/records)
     * 
     * &gt; **Note:** Filtering by `type` when `name` is not set is performed client-side.
     */
    inline def getRecordSets(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.dns.outputs.GetRecordSetsResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetsArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a list of DNS record sets within a Google Cloud DNS managed zone. This data source allows you to list all record sets or filter them by name and type.
     * 
     * To get more information about Cloud DNS Record Sets, see:
     * 
     * * [API documentation](https://cloud.google.com/dns/docs/reference/v1/resourceRecordSets/list)
     * * [How-to Guides](https://cloud.google.com/dns/docs/records)
     * 
     * &gt; **Note:** Filtering by `type` when `name` is not set is performed client-side.
     */
    inline def getRecordSetsPlain(args: Endofunction[com.pulumi.gcp.dns.inputs.GetRecordSetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.dns.outputs.GetRecordSetsResult] =
      val argsBuilder = com.pulumi.gcp.dns.inputs.GetRecordSetsPlainArgs.builder
      com.pulumi.gcp.dns.DnsFunctions.getRecordSetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   * * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the managedzone are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the managedzone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.dns.DnsManagedZoneIamPolicy
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.dns.DnsManagedZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   * ## gcp.dns.DnsManagedZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   * # IAM policy for Cloud DNS ManagedZone
   * 
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   * * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the managedzone are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the managedzone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.dns.DnsManagedZoneIamPolicy
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.dns.DnsManagedZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   * ## gcp.dns.DnsManagedZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   * * projects/{{project}}/managedZones/{{managed_zone}}
   * * {{project}}/{{managed_zone}}
   * * {{managed_zone}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud DNS managedzone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dns_managed_zone_iam_member.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dns_managed_zone_iam_binding.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dns/dnsManagedZoneIamBinding:DnsManagedZoneIamBinding editor projects/{{project}}/managedZones/{{managed_zone}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DnsManagedZoneIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs.builder
    com.pulumi.gcp.dns.DnsManagedZoneIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   * * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the managedzone are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the managedzone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.dns.DnsManagedZoneIamPolicy
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.dns.DnsManagedZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   * ## gcp.dns.DnsManagedZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   * # IAM policy for Cloud DNS ManagedZone
   * 
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   * * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the managedzone are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the managedzone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.dns.DnsManagedZoneIamPolicy
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.dns.DnsManagedZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   * ## gcp.dns.DnsManagedZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   * * projects/{{project}}/managedZones/{{managed_zone}}
   * * {{project}}/{{managed_zone}}
   * * {{managed_zone}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud DNS managedzone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dns_managed_zone_iam_member.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dns_managed_zone_iam_binding.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dns/dnsManagedZoneIamMember:DnsManagedZoneIamMember editor projects/{{project}}/managedZones/{{managed_zone}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DnsManagedZoneIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs.builder
    com.pulumi.gcp.dns.DnsManagedZoneIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   * * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the managedzone are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the managedzone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.dns.DnsManagedZoneIamPolicy
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.dns.DnsManagedZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   * ## gcp.dns.DnsManagedZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   * # IAM policy for Cloud DNS ManagedZone
   * 
   * Three different resources help you manage your IAM policy for Cloud DNS ManagedZone. Each of these resources serves a different use case:
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Authoritative. Sets the IAM policy for the managedzone and replaces any existing policy already attached.
   * * `gcp.dns.DnsManagedZoneIamBinding`: Authoritative for a given role and condition combination (the condition can be omitted). Updates the IAM policy to grant a role to a list of members. Other role and condition combinations within the IAM policy for the managedzone are preserved. Members added outside of Terraform for the same role and condition combination will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.dns.DnsManagedZoneIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the same role and condition combination for the managedzone are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.dns.DnsManagedZoneIamPolicy`: Retrieves the IAM policy for the managedzone
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamPolicy` **cannot** be used in conjunction with `gcp.dns.DnsManagedZoneIamBinding` and `gcp.dns.DnsManagedZoneIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.dns.DnsManagedZoneIamBinding` resources **can be** used in conjunction with `gcp.dns.DnsManagedZoneIamMember` resources **only if** they do not grant privilege to the same role and condition combination.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.dns.DnsManagedZoneIamPolicy
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicy;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs;
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
   *                 .role("roles/dns.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new DnsManagedZoneIamPolicy("policy", DnsManagedZoneIamPolicyArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.dns.DnsManagedZoneIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBinding;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamBindingArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamBindingConditionArgs;
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
   *         var binding = new DnsManagedZoneIamBinding("binding", DnsManagedZoneIamBindingArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamBindingConditionArgs.builder()
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
   * ## gcp.dns.DnsManagedZoneIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
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
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMember;
   * import com.pulumi.gcp.dns.DnsManagedZoneIamMemberArgs;
   * import com.pulumi.gcp.dns.inputs.DnsManagedZoneIamMemberConditionArgs;
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
   *         var member = new DnsManagedZoneIamMember("member", DnsManagedZoneIamMemberArgs.builder()
   *             .project(default_.get("project"))
   *             .managedZone(default_.get("name"))
   *             .role("roles/dns.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DnsManagedZoneIamMemberConditionArgs.builder()
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
   * * projects/{{project}}/managedZones/{{managed_zone}}
   * * {{project}}/{{managed_zone}}
   * * {{managed_zone}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud DNS managedzone IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_dns_managed_zone_iam_member.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_dns_managed_zone_iam_binding.editor &#34;projects/{{project}}/managedZones/{{managed_zone}} roles/dns.admin&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:dns/dnsManagedZoneIamPolicy:DnsManagedZoneIamPolicy editor projects/{{project}}/managedZones/{{managed_zone}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DnsManagedZoneIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dns.DnsManagedZoneIamPolicyArgs.builder
    com.pulumi.gcp.dns.DnsManagedZoneIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A zone is a subtree of the DNS namespace under one administrative
   * responsibility. A ManagedZone is a resource that represents a DNS zone
   * hosted by the Cloud DNS service.
   * 
   * To get more information about ManagedZone, see:
   * 
   * * [API documentation](https://cloud.google.com/dns/api/v1/managedZones)
   * * How-to Guides
   *     * [Managing Zones](https://cloud.google.com/dns/zones/)
   */
  def ManagedZone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.ManagedZoneArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dns.ManagedZoneArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dns.ManagedZone(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A policy is a collection of DNS rules applied to one or more Virtual
   * Private Cloud resources.
   * 
   * To get more information about Policy, see:
   * 
   * * [API documentation](https://cloud.google.com/dns/docs/reference/v1beta2/policies)
   * * How-to Guides
   *     * [Using DNS server policies](https://cloud.google.com/dns/zones/#using-dns-server-policies)
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.PolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dns.PolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dns.Policy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a set of DNS records within Google Cloud DNS. For more information see [the official documentation](https://cloud.google.com/dns/docs/records/) and
   * [API](https://cloud.google.com/dns/api/v1/resourceRecordSets).
   * 
   * &gt; **Note:** The provider treats this resource as an authoritative record set. This means existing records (including the default records) for the given type will be overwritten when you create this resource in Terraform. In addition, the Google Cloud DNS API requires NS and SOA records to be present at all times, so Terraform will not actually remove NS or SOA records on the root of the zone during destroy but will report that it did.
   */
  def RecordSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.RecordSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.dns.RecordSetArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.dns.RecordSet(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Response Policy is a collection of selectors that apply to queries
   * made against one or more Virtual Private Cloud networks.
   */
  def ResponsePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.ResponsePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dns.ResponsePolicyArgs.builder
    com.pulumi.gcp.dns.ResponsePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Response Policy Rule is a selector that applies its behavior to queries that match the selector.
   * Selectors are DNS names, which may be wildcards or exact matches.
   * Each DNS query subject to a Response Policy matches at most one ResponsePolicyRule,
   * as identified by the dnsName field with the longest matching suffix.
   */
  def ResponsePolicyRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.dns.ResponsePolicyRuleArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.dns.ResponsePolicyRuleArgs.builder
    com.pulumi.gcp.dns.ResponsePolicyRule(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
