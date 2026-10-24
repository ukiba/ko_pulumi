package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object biglake:
  object BiglakeFunctions:
    /** Retrieves the current IAM policy data for hivecatalog */
    inline def getHiveCatalogIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetHiveCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveCatalogIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for hivecatalog */
    inline def getHiveCatalogIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetHiveCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveCatalogIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for hivedatabase */
    inline def getHiveDatabaseIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetHiveDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveDatabaseIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for hivedatabase */
    inline def getHiveDatabaseIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetHiveDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveDatabaseIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for hivetable */
    inline def getHiveTableIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetHiveTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveTableIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for hivetable */
    inline def getHiveTableIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetHiveTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveTableIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for icebergcatalog */
    inline def getIcebergCatalogIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetIcebergCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergCatalogIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for icebergcatalog */
    inline def getIcebergCatalogIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetIcebergCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergCatalogIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for icebergnamespace */
    inline def getIcebergNamespaceIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetIcebergNamespaceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergNamespaceIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for icebergnamespace */
    inline def getIcebergNamespaceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetIcebergNamespaceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergNamespaceIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for icebergtable */
    inline def getIcebergTableIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetIcebergTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergTableIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for icebergtable */
    inline def getIcebergTableIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetIcebergTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergTableIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Catalogs are top-level containers for Databases and Tables.
   * 
   * To get more information about Catalog, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs)
   * * How-to Guides
   *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_catalogs)
   */
  inline def Catalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.CatalogArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.CatalogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Catalog(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Databases are containers of tables.
   * 
   * To get more information about Database, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases)
   * * How-to Guides
   *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_databases)
   */
  inline def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.DatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.DatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Database(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Hive Catalogs in Biglake Metastore
   * 
   * To get more information about HiveCatalog, see:
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://docs.cloud.google.com/lakehouse/docs/about-spark-hive-metastore)
   */
  inline def HiveCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalog(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Authoritative. Sets the IAM policy for the hivecatalog and replaces any existing policy already attached.
   * * `gcp.biglake.HiveCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivecatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivecatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Retrieves the IAM policy for the hivecatalog
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveCatalogIamBinding` and `gcp.biglake.HiveCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveCatalogIamPolicy("policy", HiveCatalogIamPolicyArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBinding;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs;
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
   *         var binding = new HiveCatalogIamBinding("binding", HiveCatalogIamBindingArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMember;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs;
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
   *         var member = new HiveCatalogIamMember("member", HiveCatalogIamMemberArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveCatalog
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Authoritative. Sets the IAM policy for the hivecatalog and replaces any existing policy already attached.
   * * `gcp.biglake.HiveCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivecatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivecatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Retrieves the IAM policy for the hivecatalog
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveCatalogIamBinding` and `gcp.biglake.HiveCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveCatalogIamPolicy("policy", HiveCatalogIamPolicyArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBinding;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs;
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
   *         var binding = new HiveCatalogIamBinding("binding", HiveCatalogIamBindingArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMember;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs;
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
   *         var member = new HiveCatalogIamMember("member", HiveCatalogIamMemberArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivecatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveCatalogIamBinding:HiveCatalogIamBinding editor projects/{{project}}/catalogs/{{hive_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveCatalogIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalogIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Authoritative. Sets the IAM policy for the hivecatalog and replaces any existing policy already attached.
   * * `gcp.biglake.HiveCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivecatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivecatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Retrieves the IAM policy for the hivecatalog
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveCatalogIamBinding` and `gcp.biglake.HiveCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveCatalogIamPolicy("policy", HiveCatalogIamPolicyArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBinding;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs;
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
   *         var binding = new HiveCatalogIamBinding("binding", HiveCatalogIamBindingArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMember;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs;
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
   *         var member = new HiveCatalogIamMember("member", HiveCatalogIamMemberArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveCatalog
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Authoritative. Sets the IAM policy for the hivecatalog and replaces any existing policy already attached.
   * * `gcp.biglake.HiveCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivecatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivecatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Retrieves the IAM policy for the hivecatalog
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveCatalogIamBinding` and `gcp.biglake.HiveCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveCatalogIamPolicy("policy", HiveCatalogIamPolicyArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBinding;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs;
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
   *         var binding = new HiveCatalogIamBinding("binding", HiveCatalogIamBindingArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMember;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs;
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
   *         var member = new HiveCatalogIamMember("member", HiveCatalogIamMemberArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivecatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveCatalogIamMember:HiveCatalogIamMember editor projects/{{project}}/catalogs/{{hive_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveCatalogIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalogIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Authoritative. Sets the IAM policy for the hivecatalog and replaces any existing policy already attached.
   * * `gcp.biglake.HiveCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivecatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivecatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Retrieves the IAM policy for the hivecatalog
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveCatalogIamBinding` and `gcp.biglake.HiveCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveCatalogIamPolicy("policy", HiveCatalogIamPolicyArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBinding;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs;
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
   *         var binding = new HiveCatalogIamBinding("binding", HiveCatalogIamBindingArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMember;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs;
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
   *         var member = new HiveCatalogIamMember("member", HiveCatalogIamMemberArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveCatalog
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Authoritative. Sets the IAM policy for the hivecatalog and replaces any existing policy already attached.
   * * `gcp.biglake.HiveCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivecatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivecatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveCatalogIamPolicy`: Retrieves the IAM policy for the hivecatalog
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveCatalogIamBinding` and `gcp.biglake.HiveCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveCatalogIamPolicy("policy", HiveCatalogIamPolicyArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBinding;
   * import com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs;
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
   *         var binding = new HiveCatalogIamBinding("binding", HiveCatalogIamBindingArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMember;
   * import com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs;
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
   *         var member = new HiveCatalogIamMember("member", HiveCatalogIamMemberArgs.builder()
   *             .project(myHiveCatalog.get("project"))
   *             .name(myHiveCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivecatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveCatalogIamPolicy:HiveCatalogIamPolicy editor projects/{{project}}/catalogs/{{hive_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveCatalogIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalogIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Hive Databases in Biglake Metastore. Hive Databases exist within a Hive Catalog.
   * 
   * To get more information about HiveDatabase, see:
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://docs.cloud.google.com/lakehouse/docs/about-spark-hive-metastore)
   */
  inline def HiveDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabase(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveDatabase. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the hivedatabase and replaces any existing policy already attached.
   * * `gcp.biglake.HiveDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivedatabase are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivedatabase are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Retrieves the IAM policy for the hivedatabase
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveDatabaseIamBinding` and `gcp.biglake.HiveDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveDatabaseIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicy;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveDatabaseIamPolicy("policy", HiveDatabaseIamPolicyArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBinding;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs;
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
   *         var binding = new HiveDatabaseIamBinding("binding", HiveDatabaseIamBindingArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMember;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs;
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
   *         var member = new HiveDatabaseIamMember("member", HiveDatabaseIamMemberArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveDatabase
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveDatabase. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the hivedatabase and replaces any existing policy already attached.
   * * `gcp.biglake.HiveDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivedatabase are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivedatabase are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Retrieves the IAM policy for the hivedatabase
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveDatabaseIamBinding` and `gcp.biglake.HiveDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveDatabaseIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicy;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveDatabaseIamPolicy("policy", HiveDatabaseIamPolicyArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBinding;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs;
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
   *         var binding = new HiveDatabaseIamBinding("binding", HiveDatabaseIamBindingArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMember;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs;
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
   *         var member = new HiveDatabaseIamMember("member", HiveDatabaseIamMemberArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{name}}
   * * {{project}}/{{catalog}}/{{name}}
   * * {{catalog}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivedatabase IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_database_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_database_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveDatabaseIamBinding:HiveDatabaseIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveDatabaseIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabaseIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveDatabase. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the hivedatabase and replaces any existing policy already attached.
   * * `gcp.biglake.HiveDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivedatabase are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivedatabase are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Retrieves the IAM policy for the hivedatabase
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveDatabaseIamBinding` and `gcp.biglake.HiveDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveDatabaseIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicy;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveDatabaseIamPolicy("policy", HiveDatabaseIamPolicyArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBinding;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs;
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
   *         var binding = new HiveDatabaseIamBinding("binding", HiveDatabaseIamBindingArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMember;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs;
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
   *         var member = new HiveDatabaseIamMember("member", HiveDatabaseIamMemberArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveDatabase
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveDatabase. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the hivedatabase and replaces any existing policy already attached.
   * * `gcp.biglake.HiveDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivedatabase are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivedatabase are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Retrieves the IAM policy for the hivedatabase
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveDatabaseIamBinding` and `gcp.biglake.HiveDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveDatabaseIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicy;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveDatabaseIamPolicy("policy", HiveDatabaseIamPolicyArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBinding;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs;
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
   *         var binding = new HiveDatabaseIamBinding("binding", HiveDatabaseIamBindingArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMember;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs;
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
   *         var member = new HiveDatabaseIamMember("member", HiveDatabaseIamMemberArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{name}}
   * * {{project}}/{{catalog}}/{{name}}
   * * {{catalog}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivedatabase IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_database_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_database_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveDatabaseIamMember:HiveDatabaseIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveDatabaseIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabaseIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveDatabase. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the hivedatabase and replaces any existing policy already attached.
   * * `gcp.biglake.HiveDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivedatabase are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivedatabase are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Retrieves the IAM policy for the hivedatabase
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveDatabaseIamBinding` and `gcp.biglake.HiveDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveDatabaseIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicy;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveDatabaseIamPolicy("policy", HiveDatabaseIamPolicyArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBinding;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs;
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
   *         var binding = new HiveDatabaseIamBinding("binding", HiveDatabaseIamBindingArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMember;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs;
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
   *         var member = new HiveDatabaseIamMember("member", HiveDatabaseIamMemberArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveDatabase
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveDatabase. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Authoritative. Sets the IAM policy for the hivedatabase and replaces any existing policy already attached.
   * * `gcp.biglake.HiveDatabaseIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivedatabase are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveDatabaseIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivedatabase are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveDatabaseIamPolicy`: Retrieves the IAM policy for the hivedatabase
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveDatabaseIamBinding` and `gcp.biglake.HiveDatabaseIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveDatabaseIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveDatabaseIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveDatabaseIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicy;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveDatabaseIamPolicy("policy", HiveDatabaseIamPolicyArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBinding;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs;
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
   *         var binding = new HiveDatabaseIamBinding("binding", HiveDatabaseIamBindingArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveDatabaseIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMember;
   * import com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs;
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
   *         var member = new HiveDatabaseIamMember("member", HiveDatabaseIamMemberArgs.builder()
   *             .project(myHiveDatabase.get("project"))
   *             .catalog(myHiveDatabase.get("catalog"))
   *             .name(myHiveDatabase.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{name}}
   * * {{project}}/{{catalog}}/{{name}}
   * * {{catalog}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivedatabase IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_database_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_database_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveDatabaseIamPolicy:HiveDatabaseIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveDatabaseIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabaseIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Hive Tables in BigLake Metastore that exist within a Hive Catalog and Database. */
  inline def HiveTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTable(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Authoritative. Sets the IAM policy for the hivetable and replaces any existing policy already attached.
   * * `gcp.biglake.HiveTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivetable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivetable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Retrieves the IAM policy for the hivetable
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveTableIamBinding` and `gcp.biglake.HiveTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveTableIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveTableIamPolicy;
   * import com.pulumi.gcp.biglake.HiveTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveTableIamPolicy("policy", HiveTableIamPolicyArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamBinding;
   * import com.pulumi.gcp.biglake.HiveTableIamBindingArgs;
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
   *         var binding = new HiveTableIamBinding("binding", HiveTableIamBindingArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamMember;
   * import com.pulumi.gcp.biglake.HiveTableIamMemberArgs;
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
   *         var member = new HiveTableIamMember("member", HiveTableIamMemberArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveTable
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Authoritative. Sets the IAM policy for the hivetable and replaces any existing policy already attached.
   * * `gcp.biglake.HiveTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivetable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivetable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Retrieves the IAM policy for the hivetable
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveTableIamBinding` and `gcp.biglake.HiveTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveTableIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveTableIamPolicy;
   * import com.pulumi.gcp.biglake.HiveTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveTableIamPolicy("policy", HiveTableIamPolicyArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamBinding;
   * import com.pulumi.gcp.biglake.HiveTableIamBindingArgs;
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
   *         var binding = new HiveTableIamBinding("binding", HiveTableIamBindingArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamMember;
   * import com.pulumi.gcp.biglake.HiveTableIamMemberArgs;
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
   *         var member = new HiveTableIamMember("member", HiveTableIamMemberArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{name}}
   * * {{project}}/{{catalog}}/{{database}}/{{name}}
   * * {{catalog}}/{{database}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivetable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveTableIamBinding:HiveTableIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveTableIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTableIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Authoritative. Sets the IAM policy for the hivetable and replaces any existing policy already attached.
   * * `gcp.biglake.HiveTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivetable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivetable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Retrieves the IAM policy for the hivetable
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveTableIamBinding` and `gcp.biglake.HiveTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveTableIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveTableIamPolicy;
   * import com.pulumi.gcp.biglake.HiveTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveTableIamPolicy("policy", HiveTableIamPolicyArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamBinding;
   * import com.pulumi.gcp.biglake.HiveTableIamBindingArgs;
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
   *         var binding = new HiveTableIamBinding("binding", HiveTableIamBindingArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamMember;
   * import com.pulumi.gcp.biglake.HiveTableIamMemberArgs;
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
   *         var member = new HiveTableIamMember("member", HiveTableIamMemberArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveTable
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Authoritative. Sets the IAM policy for the hivetable and replaces any existing policy already attached.
   * * `gcp.biglake.HiveTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivetable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivetable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Retrieves the IAM policy for the hivetable
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveTableIamBinding` and `gcp.biglake.HiveTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveTableIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveTableIamPolicy;
   * import com.pulumi.gcp.biglake.HiveTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveTableIamPolicy("policy", HiveTableIamPolicyArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamBinding;
   * import com.pulumi.gcp.biglake.HiveTableIamBindingArgs;
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
   *         var binding = new HiveTableIamBinding("binding", HiveTableIamBindingArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamMember;
   * import com.pulumi.gcp.biglake.HiveTableIamMemberArgs;
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
   *         var member = new HiveTableIamMember("member", HiveTableIamMemberArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{name}}
   * * {{project}}/{{catalog}}/{{database}}/{{name}}
   * * {{catalog}}/{{database}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivetable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveTableIamMember:HiveTableIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveTableIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTableIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Authoritative. Sets the IAM policy for the hivetable and replaces any existing policy already attached.
   * * `gcp.biglake.HiveTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivetable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivetable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Retrieves the IAM policy for the hivetable
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveTableIamBinding` and `gcp.biglake.HiveTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveTableIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveTableIamPolicy;
   * import com.pulumi.gcp.biglake.HiveTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveTableIamPolicy("policy", HiveTableIamPolicyArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamBinding;
   * import com.pulumi.gcp.biglake.HiveTableIamBindingArgs;
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
   *         var binding = new HiveTableIamBinding("binding", HiveTableIamBindingArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamMember;
   * import com.pulumi.gcp.biglake.HiveTableIamMemberArgs;
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
   *         var member = new HiveTableIamMember("member", HiveTableIamMemberArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for BigLake Hive Metastore HiveTable
   * 
   * Three different resources help you manage your IAM policy for BigLake Hive Metastore HiveTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Authoritative. Sets the IAM policy for the hivetable and replaces any existing policy already attached.
   * * `gcp.biglake.HiveTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the hivetable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.HiveTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the hivetable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.HiveTableIamPolicy`: Retrieves the IAM policy for the hivetable
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.HiveTableIamBinding` and `gcp.biglake.HiveTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.HiveTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.HiveTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.HiveTableIamPolicy
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
   * import com.pulumi.gcp.biglake.HiveTableIamPolicy;
   * import com.pulumi.gcp.biglake.HiveTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new HiveTableIamPolicy("policy", HiveTableIamPolicyArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamBinding;
   * import com.pulumi.gcp.biglake.HiveTableIamBindingArgs;
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
   *         var binding = new HiveTableIamBinding("binding", HiveTableIamBindingArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.HiveTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.HiveTableIamMember;
   * import com.pulumi.gcp.biglake.HiveTableIamMemberArgs;
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
   *         var member = new HiveTableIamMember("member", HiveTableIamMemberArgs.builder()
   *             .project(myHiveTable.get("project"))
   *             .catalog(myHiveTable.get("catalog"))
   *             .database(myHiveTable.get("database"))
   *             .name(myHiveTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{name}}
   * * {{project}}/{{catalog}}/{{database}}/{{name}}
   * * {{catalog}}/{{database}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigLake Hive Metastore hivetable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_hive_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/hiveTableIamPolicy:HiveTableIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def HiveTableIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTableIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * IcebergCatalogs are top-level containers for Apache Iceberg REST Catalog served Namespaces and Tables.
   * 
   * To get more information about IcebergCatalog, see:
   * * How-to Guides
   *     * [Use the BigLake metastore Iceberg REST catalog](https://docs.cloud.google.com/biglake/docs/blms-rest-catalog)
   * 
   * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource&#39;s IAM,
   * you must specify a `billingProject` and set `userProjectOverride` to true
   * in the provider configuration. Otherwise the IAM API will return 403s.
   * Your account must have the `serviceusage.services.use` permission on the
   * `billingProject` you defined.
   */
  inline def IcebergCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalog(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
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
   *         var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
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
   *         var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergCatalog
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
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
   *         var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
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
   *         var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergcatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergCatalogIamBinding:IcebergCatalogIamBinding editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergCatalogIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
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
   *         var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
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
   *         var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergCatalog
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
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
   *         var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
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
   *         var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergcatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergCatalogIamMember:IcebergCatalogIamMember editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergCatalogIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
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
   *         var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
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
   *         var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergCatalog
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergCatalogIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
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
   *         var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergCatalogIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   * import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
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
   *         var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *             .project(myIcebergCatalog.get("project"))
   *             .name(myIcebergCatalog.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{name}}
   * * {{project}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergcatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergCatalogIamPolicy:IcebergCatalogIamPolicy editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergCatalogIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** IcebergNamespaces are containers for Apache Iceberg Tables within an IcebergCatalog. */
  inline def IcebergNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespace(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergNamespaceIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
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
   *         var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
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
   *         var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergNamespace
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergNamespaceIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
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
   *         var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
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
   *         var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * * {{project}}/{{catalog}}/{{namespace_id}}
   * * {{catalog}}/{{namespace_id}}
   * * {{namespace_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergnamespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergNamespaceIamBinding:IcebergNamespaceIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergNamespaceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergNamespaceIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
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
   *         var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
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
   *         var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergNamespace
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergNamespaceIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
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
   *         var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
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
   *         var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * * {{project}}/{{catalog}}/{{namespace_id}}
   * * {{catalog}}/{{namespace_id}}
   * * {{namespace_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergnamespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergNamespaceIamMember:IcebergNamespaceIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergNamespaceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergNamespaceIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
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
   *         var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
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
   *         var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergNamespace
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergNamespaceIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
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
   *         var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergNamespaceIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   * import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
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
   *         var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *             .project(myIcebergNamespace.get("project"))
   *             .catalog(myIcebergNamespace.get("catalog"))
   *             .namespaceId(myIcebergNamespace.get("id"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * * {{project}}/{{catalog}}/{{namespace_id}}
   * * {{catalog}}/{{namespace_id}}
   * * {{namespace_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergnamespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergNamespaceIamPolicy:IcebergNamespaceIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergNamespaceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** IcebergTables are the primary objects in an IcebergCatalog. */
  inline def IcebergTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTable(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergTableIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   * import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
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
   *         var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamMember;
   * import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
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
   *         var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergTable
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergTableIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   * import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
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
   *         var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamMember;
   * import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
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
   *         var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{name}}
   * * {{project}}/{{catalog}}/{{namespace}}/{{name}}
   * * {{catalog}}/{{namespace}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergtable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergTableIamBinding:IcebergTableIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergTableIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergTableIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   * import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
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
   *         var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamMember;
   * import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
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
   *         var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergTable
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergTableIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   * import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
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
   *         var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamMember;
   * import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
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
   *         var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{name}}
   * * {{project}}/{{catalog}}/{{namespace}}/{{name}}
   * * {{catalog}}/{{namespace}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergtable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergTableIamMember:IcebergTableIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergTableIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergTableIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   * import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
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
   *         var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamMember;
   * import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
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
   *         var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Biglake IcebergTable
   * 
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   * * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.biglake.IcebergTableIamPolicy
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
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   * import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
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
   *                 .role("roles/biglake.editor")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   * import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
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
   *         var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.biglake.IcebergTableIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.biglake.IcebergTableIamMember;
   * import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
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
   *         var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *             .project(myIcebergTable.get("project"))
   *             .catalog(myIcebergTable.get("catalog"))
   *             .namespace(myIcebergTable.get("namespace"))
   *             .name(myIcebergTable.get("name"))
   *             .role("roles/biglake.editor")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{name}}
   * * {{project}}/{{catalog}}/{{namespace}}/{{name}}
   * * {{catalog}}/{{namespace}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Biglake icebergtable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:biglake/icebergTableIamPolicy:IcebergTableIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  inline def IcebergTableIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a table.
   * 
   * To get more information about Table, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases.tables)
   * * How-to Guides
   *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_tables)
   */
  inline def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.biglake.TableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.TableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Table(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
