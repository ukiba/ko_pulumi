package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object biglake:
  object BiglakeFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Retrieves the current IAM policy data for hivecatalog
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHiveCatalogIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetHiveCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveCatalogIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for hivecatalog
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHiveCatalogIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetHiveCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveCatalogIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveCatalogIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for hivedatabase
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHiveDatabaseIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetHiveDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveDatabaseIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for hivedatabase
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHiveDatabaseIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetHiveDatabaseIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveDatabaseIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveDatabaseIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for hivetable
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHiveTableIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetHiveTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveTableIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for hivetable
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getHiveTableIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetHiveTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetHiveTableIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getHiveTableIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for icebergcatalog */
    inline def getIcebergCatalogIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetIcebergCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergCatalogIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for icebergcatalog */
    inline def getIcebergCatalogIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetIcebergCatalogIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergCatalogIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergCatalogIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for icebergnamespace */
    inline def getIcebergNamespaceIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetIcebergNamespaceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergNamespaceIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for icebergnamespace */
    inline def getIcebergNamespaceIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetIcebergNamespaceIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergNamespaceIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergNamespaceIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for icebergtable */
    inline def getIcebergTableIamPolicy(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.biglake.outputs.GetIcebergTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergTableIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for icebergtable */
    inline def getIcebergTableIamPolicyPlain(args: Endofunction[com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.biglake.outputs.GetIcebergTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.GetIcebergTableIamPolicyPlainArgs.builder
      com.pulumi.gcp.biglake.BiglakeFunctions.getIcebergTableIamPolicyPlain(args(argsBuilder).build)

  /**
   * Catalogs are top-level containers for Databases and Tables.
   * 
   * To get more information about Catalog, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs)
   * * How-to Guides
   *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_catalogs)
   */
  def Catalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.CatalogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.CatalogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Catalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Databases are containers of tables.
   * 
   * To get more information about Database, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases)
   * * How-to Guides
   *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_databases)
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.DatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.DatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.DatabaseArgs.Builder)
    /**
     * @param hiveOptions Options of a Hive database.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  /**
   * Hive Catalogs in Biglake Metastore
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about HiveCatalog, see:
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://docs.cloud.google.com/lakehouse/docs/about-spark-hive-metastore)
   */
  def HiveCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveCatalogIamBinding:HiveCatalogIamBinding editor projects/{{project}}/catalogs/{{hive_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveCatalogIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalogIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveCatalogIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveCatalogIamMember:HiveCatalogIamMember editor projects/{{project}}/catalogs/{{hive_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveCatalogIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalogIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveCatalogIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{hive_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveCatalogIamPolicy:HiveCatalogIamPolicy editor projects/{{project}}/catalogs/{{hive_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveCatalogIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveCatalogIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveCatalogIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Hive Databases in Biglake Metastore. Hive Databases exist within a Hive Catalog.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about HiveDatabase, see:
   * * How-to Guides
   *     * [QUICKSTART_TITLE](https://docs.cloud.google.com/lakehouse/docs/about-spark-hive-metastore)
   */
  def HiveDatabase(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabase(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_database_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_database_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveDatabaseIamBinding:HiveDatabaseIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveDatabaseIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabaseIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveDatabaseIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_database_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_database_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveDatabaseIamMember:HiveDatabaseIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveDatabaseIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabaseIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveDatabaseIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_database_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_database_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveDatabaseIamPolicy:HiveDatabaseIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{hive_database}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveDatabaseIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveDatabaseIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveDatabaseIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Hive Tables in BigLake Metastore that exist within a Hive Catalog and Database.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   */
  def HiveTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.HiveTableArgs.Builder)
    /**
     * @param partitionKeys Partition keys of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.Builder]*):
        com.pulumi.gcp.biglake.HiveTableArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Storage descriptor of the table.
     * Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.biglake.HiveTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveTableIamBinding:HiveTableIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveTableIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTableIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.HiveTableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveTableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveTableIamMember:HiveTableIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveTableIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTableIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.HiveTableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.HiveTableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
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
   * $ terraform import google_biglake_hive_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_hive_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/hiveTableIamPolicy:HiveTableIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{database}}/tables/{{hive_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def HiveTableIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.HiveTableIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.HiveTableIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.HiveTableIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
  def IcebergCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder)
    /**
     * @param federatedCatalogOptions Options for a CATALOG_TYPE_FEDERATED catalog. Required when catalogType
     * is CATALOG_TYPE_FEDERATED.
     * Structure is documented below.
     * @return builder
     */
    def federatedCatalogOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.builder
      builder.federatedCatalogOptions(args(argsBuilder).build)

    /**
     * @param restrictedLocationsConfig Configuration for the additional GCS locations that are permitted for use
     * by resources within this catalog.
     * Structure is documented below.
     * @return builder
     */
    def restrictedLocationsConfig(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.builder
      builder.restrictedLocationsConfig(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergCatalogIamBinding:IcebergCatalogIamBinding editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergCatalogIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergCatalogIamMember:IcebergCatalogIamMember editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergCatalogIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergCatalogIamPolicy:IcebergCatalogIamPolicy editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergCatalogIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** IcebergNamespaces are containers for Apache Iceberg Tables within an IcebergCatalog. */
  def IcebergNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
   * $ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergNamespaceIamBinding:IcebergNamespaceIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergNamespaceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergNamespaceIamMember:IcebergNamespaceIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergNamespaceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergNamespaceIamPolicy:IcebergNamespaceIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergNamespaceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** IcebergTables are the primary objects in an IcebergCatalog. */
  def IcebergTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableArgs.Builder)
    /**
     * @param partitionSpec The partition spec of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionSpec(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

    /**
     * @param schema The schema of the table.
     * Structure is documented below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    /**
     * @param sortOrder The sort order of the table.
     * Structure is documented below.
     * @return builder
     */
    def sortOrder(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.builder
      builder.sortOrder(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergTableIamBinding:IcebergTableIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergTableIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergTableIamMember:IcebergTableIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergTableIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

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
   * $ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * $ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * $ pulumi import gcp:biglake/icebergTableIamPolicy:IcebergTableIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergTableIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a table.
   * 
   * To get more information about Table, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases.tables)
   * * How-to Guides
   *     * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_tables)
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.TableArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.TableArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.gcp.biglake.TableArgs.Builder)
    /**
     * @param hiveOptions Options of a Hive table.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.DatabaseState.Builder)
    /**
     * @param hiveOptions Options of a Hive database.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveCatalogState.Builder)
    /**
     * @param replicas Output only. The replicas for the catalog metadata.
     * Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveCatalogReplicaArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveCatalogState.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveCatalogReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveDatabaseIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableState.Builder)
    /**
     * @param partitionKeys Partition keys of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionKeys(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableState.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTablePartitionKeyArgs.builder
      builder.partitionKeys(args.map(_(argsBuilder).build)*)

    /**
     * @param storageDescriptor Storage descriptor of the table.
     * Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder)
    /**
     * @param columns Specifies the columns of the table (the schema).
     * Structure is documented below.
     * @return builder
     */
    def columns(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorColumnArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorColumnArgs.builder
      builder.columns(args.map(_(argsBuilder).build)*)

    /**
     * @param serdeInfo Serialization and deserialization information.
     * Structure is documented below.
     * @return builder
     */
    def serdeInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSerdeInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSerdeInfoArgs.builder
      builder.serdeInfo(args(argsBuilder).build)

    /**
     * @param skewedInfo Table data skew information.
     * Structure is documented below.
     * @return builder
     */
    def skewedInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.builder
      builder.skewedInfo(args(argsBuilder).build)

    /**
     * @param sortCols Sort order of the data in each bucket.
     * Structure is documented below.
     * @return builder
     */
    def sortCols(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSortColArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSortColArgs.builder
      builder.sortCols(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder)
    /**
     * @param skewedColValues The skewed column values.
     * Structure is documented below.
     * @return builder
     */
    def skewedColValues(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedColValueArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedColValueArgs.builder
      builder.skewedColValues(args.map(_(argsBuilder).build)*)

    /**
     * @param skewedKeyValuesLocations The skewed key values locations.
     * Structure is documented below.
     * @return builder
     */
    def skewedKeyValuesLocations(args: Endofunction[com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedKeyValuesLocationArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.HiveTableStorageDescriptorSkewedInfoSkewedKeyValuesLocationArgs.builder
      builder.skewedKeyValuesLocations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder)
    /**
     * @param glueCatalogInfo Configuration for an AWS Glue remote catalog. Exactly one of
     * unityCatalogInfo or glueCatalogInfo must be specified.
     * Structure is documented below.
     * @return builder
     */
    def glueCatalogInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsGlueCatalogInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsGlueCatalogInfoArgs.builder
      builder.glueCatalogInfo(args(argsBuilder).build)

    /**
     * @param refreshOptions Configuration for metadata synchronization from the remote catalog.
     * Structure is documented below.
     * @return builder
     */
    def refreshOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.builder
      builder.refreshOptions(args(argsBuilder).build)

    /**
     * @param refreshStatuses (Output)
     * Output only. The status of the most recent metadata refresh.
     * Structure is documented below.
     * @return builder
     */
    def refreshStatuses(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.builder
      builder.refreshStatuses(args.map(_(argsBuilder).build)*)

    /**
     * @param unityCatalogInfo Configuration for a Databricks Unity Catalog remote catalog. Exactly
     * one of unityCatalogInfo or glueCatalogInfo must be specified.
     * Structure is documented below.
     * @return builder
     */
    def unityCatalogInfo(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsUnityCatalogInfoArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsUnityCatalogInfoArgs.builder
      builder.unityCatalogInfo(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder)
    /**
     * @param refreshSchedule Schedule for periodic metadata refresh.
     * Structure is documented below.
     * @return builder
     */
    def refreshSchedule(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScheduleArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScheduleArgs.builder
      builder.refreshSchedule(args(argsBuilder).build)

    /**
     * @param refreshScope Scope of metadata to synchronize from the remote catalog.
     * Structure is documented below.
     * @return builder
     */
    def refreshScope(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScopeArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshOptionsRefreshScopeArgs.builder
      builder.refreshScope(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.Builder)
    /**
     * @param statuses Output only. The error result of the last failed refresh, if any.
     * @return builder
     */
    def statuses(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusStatusArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsRefreshStatusStatusArgs.builder
      builder.statuses(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder)
    /**
     * @param federatedCatalogOptions Options for a CATALOG_TYPE_FEDERATED catalog. Required when catalogType
     * is CATALOG_TYPE_FEDERATED.
     * Structure is documented below.
     * @return builder
     */
    def federatedCatalogOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogFederatedCatalogOptionsArgs.builder
      builder.federatedCatalogOptions(args(argsBuilder).build)

    /**
     * @param replicas Output only. The replicas for the catalog metadata.
     * Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogReplicaArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

    /**
     * @param restrictedLocationsConfig Configuration for the additional GCS locations that are permitted for use
     * by resources within this catalog.
     * Structure is documented below.
     * @return builder
     */
    def restrictedLocationsConfig(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogRestrictedLocationsConfigArgs.builder
      builder.restrictedLocationsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder)
    /**
     * @param fields Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecFieldArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder)
    /**
     * @param fields Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaFieldArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder)
    /**
     * @param fields Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderFieldArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder)
    /**
     * @param partitionSpec The partition spec of the table.
     * Structure is documented below.
     * @return builder
     */
    def partitionSpec(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

    /**
     * @param schema The schema of the table.
     * Structure is documented below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

    /**
     * @param sortOrder The sort order of the table.
     * Structure is documented below.
     * @return builder
     */
    def sortOrder(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSortOrderArgs.builder
      builder.sortOrder(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder)
    /**
     * @param storageDescriptor Stores physical storage information on the data.
     * Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.TableState.Builder)
    /**
     * @param hiveOptions Options of a Hive table.
     * Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)
