package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object biglake:
  extension (builder: com.pulumi.gcp.biglake.TableArgs.Builder)
    /**
     * @param hiveOptions Options of a Hive table.
     *  Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.TableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved.
   *  * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergCatalogIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergCatalog
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved.
   *  * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergCatalogIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergcatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergCatalogIamMember:IcebergCatalogIamMember editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergCatalogIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableArgs.Builder)
    /**
     * @param partitionSpec The partition spec of the table.
     *  Structure is documented below.
     * @return builder
     */
    def partitionSpec(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

    /**
     * @param schema The schema of the table.
     *  Structure is documented below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  object BiglakeFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

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
   *  To get more information about Catalog, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs)
   *  * How-to Guides
   *      * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_catalogs)
   */
  def Catalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.CatalogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.CatalogArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Catalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved.
   *  * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergTableIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMember;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergTable
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved.
   *  * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergTableIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMember;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{name}}
   *  * {{project}}/{{catalog}}/{{namespace}}/{{name}}
   *  * {{catalog}}/{{namespace}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergtable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergTableIamPolicy:IcebergTableIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergTableIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved.
   *  * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergTableIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMember;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergTable
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved.
   *  * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergTableIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMember;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{name}}
   *  * {{project}}/{{catalog}}/{{namespace}}/{{name}}
   *  * {{catalog}}/{{namespace}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergtable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergTableIamBinding:IcebergTableIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergTableIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved.
   *  * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergCatalogIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergCatalog
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved.
   *  * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergCatalogIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergcatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergCatalogIamPolicy:IcebergCatalogIamPolicy editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergCatalogIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** IcebergNamespaces are containers for Apache Iceberg Tables within an IcebergCatalog. */
  def IcebergNamespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * IcebergCatalogs are top-level containers for Apache Iceberg REST Catalog served Namespaces and Tables.
   * 
   *  To get more information about IcebergCatalog, see:
   *  * How-to Guides
   *      * [Use the BigLake metastore Iceberg REST catalog](https://docs.cloud.google.com/biglake/docs/blms-rest-catalog)
   * 
   *  &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource&#39;s IAM,
   *  you must specify a `billingProject` and set `userProjectOverride` to true
   *  in the provider configuration. Otherwise the IAM API will return 403s.
   *  Your account must have the `serviceusage.services.use` permission on the
   *  `billingProject` you defined.
   */
  def IcebergCatalog(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalog(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a table.
   * 
   *  To get more information about Table, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases.tables)
   *  * How-to Guides
   *      * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_tables)
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.TableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.TableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Table(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Databases are containers of tables.
   * 
   *  To get more information about Database, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/biglake/rest/v1/projects.locations.catalogs.databases)
   *  * How-to Guides
   *      * [Manage open source metadata with BigLake Metastore](https://cloud.google.com/bigquery/docs/manage-open-source-metadata#create_databases)
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** IcebergTables are the primary objects in an IcebergCatalog. */
  def IcebergTable(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTable(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.DatabaseArgs.Builder)
    /**
     * @param hiveOptions Options of a Hive database.
     *  Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.DatabaseArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved.
   *  * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergTableIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMember;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergTable
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergTable. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Authoritative. Sets the IAM policy for the icebergtable and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergTableIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergtable are preserved.
   *  * `gcp.biglake.IcebergTableIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergtable are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergTableIamPolicy`: Retrieves the IAM policy for the icebergtable
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergTableIamBinding` and `gcp.biglake.IcebergTableIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergTableIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergTableIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergTableIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergTableIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergTableIamPolicy("policy", IcebergTableIamPolicyArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergTableIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergTableIamBinding("binding", IcebergTableIamBindingArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergTableIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMember;
   *  import com.pulumi.gcp.biglake.IcebergTableIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergTableIamMember("member", IcebergTableIamMemberArgs.builder()
   *              .project(myIcebergTable.project())
   *              .catalog(myIcebergTable.catalog())
   *              .namespace(myIcebergTable.namespace())
   *              .name(myIcebergTable.name())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{name}}
   *  * {{project}}/{{catalog}}/{{namespace}}/{{name}}
   *  * {{catalog}}/{{namespace}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergtable IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_table_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_table_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergTableIamMember:IcebergTableIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace}}/tables/{{iceberg_table}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergTableIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergTableIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved.
   *  * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergCatalogIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergCatalog
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergCatalog. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Authoritative. Sets the IAM policy for the icebergcatalog and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergCatalogIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergcatalog are preserved.
   *  * `gcp.biglake.IcebergCatalogIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergcatalog are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergCatalogIamPolicy`: Retrieves the IAM policy for the icebergcatalog
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergCatalogIamBinding` and `gcp.biglake.IcebergCatalogIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergCatalogIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergCatalogIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergCatalogIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergCatalogIamPolicy("policy", IcebergCatalogIamPolicyArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergCatalogIamBinding("binding", IcebergCatalogIamBindingArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergCatalogIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMember;
   *  import com.pulumi.gcp.biglake.IcebergCatalogIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergCatalogIamMember("member", IcebergCatalogIamMemberArgs.builder()
   *              .project(myIcebergCatalog.project())
   *              .name(myIcebergCatalog.name())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergcatalog IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_catalog_iam_member.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_catalog_iam_binding.editor &#34;projects/{{project}}/catalogs/{{iceberg_catalog}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergCatalogIamBinding:IcebergCatalogIamBinding editor projects/{{project}}/catalogs/{{iceberg_catalog}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergCatalogIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.biglake.IcebergCatalogIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved.
   *  * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergNamespaceIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergNamespace
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved.
   *  * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergNamespaceIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   *  * {{project}}/{{catalog}}/{{namespace_id}}
   *  * {{catalog}}/{{namespace_id}}
   *  * {{namespace_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergnamespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergNamespaceIamMember:IcebergNamespaceIamMember editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergNamespaceIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved.
   *  * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergNamespaceIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergNamespace
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved.
   *  * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergNamespaceIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   *  * {{project}}/{{catalog}}/{{namespace_id}}
   *  * {{catalog}}/{{namespace_id}}
   *  * {{namespace_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergnamespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergNamespaceIamBinding:IcebergNamespaceIamBinding editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergNamespaceIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved.
   *  * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergNamespaceIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
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
   *  # IAM policy for Biglake IcebergNamespace
   * 
   *  Three different resources help you manage your IAM policy for Biglake IcebergNamespace. Each of these resources serves a different use case:
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Authoritative. Sets the IAM policy for the icebergnamespace and replaces any existing policy already attached.
   *  * `gcp.biglake.IcebergNamespaceIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the icebergnamespace are preserved.
   *  * `gcp.biglake.IcebergNamespaceIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the icebergnamespace are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.biglake.IcebergNamespaceIamPolicy`: Retrieves the IAM policy for the icebergnamespace
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamPolicy` **cannot** be used in conjunction with `gcp.biglake.IcebergNamespaceIamBinding` and `gcp.biglake.IcebergNamespaceIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.biglake.IcebergNamespaceIamBinding` resources **can be** used in conjunction with `gcp.biglake.IcebergNamespaceIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.biglake.IcebergNamespaceIamPolicy
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
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/biglake.editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new IcebergNamespaceIamPolicy("policy", IcebergNamespaceIamPolicyArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBinding;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new IcebergNamespaceIamBinding("binding", IcebergNamespaceIamBindingArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.biglake.IcebergNamespaceIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMember;
   *  import com.pulumi.gcp.biglake.IcebergNamespaceIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new IcebergNamespaceIamMember("member", IcebergNamespaceIamMemberArgs.builder()
   *              .project(myIcebergNamespace.project())
   *              .catalog(myIcebergNamespace.catalog())
   *              .namespaceId(myIcebergNamespace.id())
   *              .role("roles/biglake.editor")
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
   *  * projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   *  * {{project}}/{{catalog}}/{{namespace_id}}
   *  * {{catalog}}/{{namespace_id}}
   *  * {{namespace_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Biglake icebergnamespace IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_namespace_iam_member.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_biglake_iceberg_namespace_iam_binding.editor &#34;projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}} roles/biglake.editor&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:biglake/icebergNamespaceIamPolicy:IcebergNamespaceIamPolicy editor projects/{{project}}/catalogs/{{catalog}}/namespaces/{{namespace_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IcebergNamespaceIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.biglake.IcebergNamespaceIamPolicyArgs.builder
    com.pulumi.gcp.biglake.IcebergNamespaceIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergCatalogIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder)
    /**
     * @param storageDescriptor Stores physical storage information on the data.
     *  Structure is documented below.
     * @return builder
     */
    def storageDescriptor(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsStorageDescriptorArgs.builder
      builder.storageDescriptor(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.DatabaseState.Builder)
    /**
     * @param hiveOptions Options of a Hive database.
     *  Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.DatabaseState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.DatabaseHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.TableState.Builder)
    /**
     * @param hiveOptions Options of a Hive table.
     *  Structure is documented below.
     * @return builder
     */
    def hiveOptions(args: Endofunction[com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.TableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.TableHiveOptionsArgs.builder
      builder.hiveOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder)
    /**
     * @param replicas Output only. The replicas for the catalog metadata.
     *  Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergCatalogReplicaArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergCatalogState.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergCatalogReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamMemberConditionArgs.builder
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

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergNamespaceIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder)
    /**
     * @param partitionSpec The partition spec of the table.
     *  Structure is documented below.
     * @return builder
     */
    def partitionSpec(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTablePartitionSpecArgs.builder
      builder.partitionSpec(args(argsBuilder).build)

    /**
     * @param schema The schema of the table.
     *  Structure is documented below.
     * @return builder
     */
    def schema(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder]):
        com.pulumi.gcp.biglake.inputs.IcebergTableState.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.builder
      builder.schema(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder)
    /**
     * @param fields Structure is documented below.
     * @return builder
     */
    def fields(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableSchemaFieldArgs.Builder]*):
        com.pulumi.gcp.biglake.inputs.IcebergTableSchemaArgs.Builder =
      def argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableSchemaFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.biglake.IcebergTableIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.biglake.inputs.IcebergTableIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
