package jp.ukiba.ko_pulumi
package postgresql

import com.pulumi.resources.CustomResourceOptions

object postgresql:
  /**
   * The ``postgresql.Extension`` resource creates and manages an extension on a PostgreSQL
   *  server.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Extension;
   *  import com.pulumi.postgresql.ExtensionArgs;
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
   *          var myExtension = new Extension("myExtension", ExtensionArgs.builder()
   *              .name("pg_trgm")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  PostgreSQL Extensions can be imported using the database name and the extension&#39;s resource name, e.g.
   * 
   *  `terraform import postgresql_extension.uuid_ossp example-database.uuid-ossp`
   */
  def Extension(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.ExtensionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.ExtensionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.Extension(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.SecurityLabel`` resource creates and manages security labels.
   * 
   *  See [PostgreSQL documentation](https://www.postgresql.org/docs/current/sql-security-label.html)
   * 
   *  &gt; **Note:** This resource needs Postgresql version 11 or above.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Role;
   *  import com.pulumi.postgresql.RoleArgs;
   *  import com.pulumi.postgresql.SecurityLabel;
   *  import com.pulumi.postgresql.SecurityLabelArgs;
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
   *          var myRole = new Role("myRole", RoleArgs.builder()
   *              .name("my_role")
   *              .login(true)
   *              .build());
   * 
   *          var workload = new SecurityLabel("workload", SecurityLabelArgs.builder()
   *              .objectType("role")
   *              .objectName(myRole.name())
   *              .labelProvider("pgaadauth")
   *              .label("aadauth,oid=00000000-0000-0000-0000-000000000000,type=service")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  Security label is an attribute that can be added multiple times, so no import is needed, simply apply again.
   */
  def SecurityLabel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.SecurityLabelArgs.Builder]) =
    val argsBuilder = com.pulumi.postgresql.SecurityLabelArgs.builder
    com.pulumi.postgresql.SecurityLabel(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The `postgresql.Publication` resource creates and manages a publication on a PostgreSQL
   *  server.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Publication;
   *  import com.pulumi.postgresql.PublicationArgs;
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
   *          var publication = new Publication("publication", PublicationArgs.builder()
   *              .name("publication")
   *              .tables(
   *                  "public.test",
   *                  "another_schema.test")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import Example
   * 
   *  Publication can be imported using this format:
   */
  def Publication(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.PublicationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.PublicationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.Publication(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.postgresql.SchemaArgs.Builder)
    /**
     * @param policies Can be specified multiple times for each policy.  Each
     *  policy block supports fields documented below.
     * @return builder
     * @deprecated Use postgresql.Grant resource instead (with object_type=&#34;schema&#34;)
     */
    @deprecated def policies(args: Endofunction[com.pulumi.postgresql.inputs.SchemaPolicyArgs.Builder]*):
        com.pulumi.postgresql.SchemaArgs.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.SchemaPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  /**
   * The ``postgresql.Schema`` resource creates and manages [schema
   *  objects](https://www.postgresql.org/docs/current/static/ddl-schemas.html) within
   *  a PostgreSQL database.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Role;
   *  import com.pulumi.postgresql.RoleArgs;
   *  import com.pulumi.postgresql.Schema;
   *  import com.pulumi.postgresql.SchemaArgs;
   *  import com.pulumi.postgresql.inputs.SchemaPolicyArgs;
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
   *          var appWww = new Role("appWww", RoleArgs.builder()
   *              .name("app_www")
   *              .build());
   * 
   *          var appDba = new Role("appDba", RoleArgs.builder()
   *              .name("app_dba")
   *              .build());
   * 
   *          var appReleng = new Role("appReleng", RoleArgs.builder()
   *              .name("app_releng")
   *              .build());
   * 
   *          var mySchema = new Schema("mySchema", SchemaArgs.builder()
   *              .name("my_schema")
   *              .owner("postgres")
   *              .policies(
   *                  SchemaPolicyArgs.builder()
   *                      .usage(true)
   *                      .role(appWww.name())
   *                      .build(),
   *                  SchemaPolicyArgs.builder()
   *                      .create(true)
   *                      .usage(true)
   *                      .role(appReleng.name())
   *                      .build(),
   *                  SchemaPolicyArgs.builder()
   *                      .createWithGrant(true)
   *                      .usageWithGrant(true)
   *                      .role(appDba.name())
   *                      .build())
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import Example
   * 
   *  `postgresql.Schema` supports importing resources.  Supposing the following
   *  Terraform:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Schema;
   *  import com.pulumi.postgresql.SchemaArgs;
   *  import com.pulumi.postgresql.inputs.SchemaPolicyArgs;
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
   *          var public_ = new Schema("public", SchemaArgs.builder()
   *              .name("public")
   *              .build());
   * 
   *          var schemaFoo = new Schema("schemaFoo", SchemaArgs.builder()
   *              .name("my_schema")
   *              .owner("postgres")
   *              .policies(SchemaPolicyArgs.builder()
   *                  .usage(true)
   *                  .build())
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  It is possible to import a `postgresql.Schema` resource with the following
   *  command:
   * 
   *  Where `myDatabase` is the name of the database containing the schema,
   *  `mySchema` is the name of the schema in the PostgreSQL database and
   *  `postgresql_schema.schema_foo` is the name of the resource whose state will be
   *  populated as a result of the command.
   */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.SchemaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.SchemaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.Database`` resource creates and manages [database
   *  objects](https://www.postgresql.org/docs/current/static/managing-databases.html)
   *  within a PostgreSQL server instance.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Database;
   *  import com.pulumi.postgresql.DatabaseArgs;
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
   *          var myDb = new Database("myDb", DatabaseArgs.builder()
   *              .name("my_db")
   *              .owner("my_role")
   *              .template("template0")
   *              .lcCollate("C")
   *              .connectionLimit(-1)
   *              .allowConnections(true)
   *              .alterObjectOwnership(true)
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import Example
   * 
   *  `postgresql.Database` supports importing resources.  Supposing the following
   *  Terraform:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Database;
   *  import com.pulumi.postgresql.DatabaseArgs;
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
   *          var db1 = new Database("db1", DatabaseArgs.builder()
   *              .name("testdb1")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  It is possible to import a `postgresql.Database` resource with the following
   *  command:
   * 
   *  Where `testdb1` is the name of the database to import and
   *  `postgresql_database.db1` is the name of the resource whose state will be
   *  populated as a result of the command.
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.DatabaseArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.Grant`` resource creates and manages privileges given to a user for a database schema.
   * 
   *  See [PostgreSQL documentation](https://www.postgresql.org/docs/current/sql-grant.html)
   * 
   *  &gt; **Note:** This resource needs Postgresql version 9 or above.
   *  **Note:** Using column &amp; table grants on the _same_ table with the _same_ privileges can lead to unexpected behaviours.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Grant;
   *  import com.pulumi.postgresql.GrantArgs;
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
   *          // Grant SELECT privileges on 2 tables
   *          var readonlyTables = new Grant("readonlyTables", GrantArgs.builder()
   *              .database("test_db")
   *              .role("test_role")
   *              .schema("public")
   *              .objectType("table")
   *              .objects(
   *                  "table1",
   *                  "table2")
   *              .privileges("SELECT")
   *              .build());
   * 
   *          // Grant SELECT & INSERT privileges on 2 columns in 1 table
   *          var readInsertColumn = new Grant("readInsertColumn", GrantArgs.builder()
   *              .database("test_db")
   *              .role("test_role")
   *              .schema("public")
   *              .objectType("column")
   *              .objects("table1")
   *              .columns(
   *                  "col1",
   *                  "col2")
   *              .privileges(
   *                  "UPDATE",
   *                  "INSERT")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Examples
   * 
   *  Revoke default accesses for public schema:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Grant;
   *  import com.pulumi.postgresql.GrantArgs;
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
   *          var revokePublic = new Grant("revokePublic", GrantArgs.builder()
   *              .database("test_db")
   *              .role("public")
   *              .schema("public")
   *              .objectType("schema")
   *              .privileges()
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   */
  def Grant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.GrantArgs.Builder]) =
    val argsBuilder = com.pulumi.postgresql.GrantArgs.builder
    com.pulumi.postgresql.Grant(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.postgresql.FunctionArgs.Builder)
    /**
     * @param args List of arguments for the function.
     * @return builder
     */
    def args(args: Endofunction[com.pulumi.postgresql.inputs.FunctionArgArgs.Builder]*):
        com.pulumi.postgresql.FunctionArgs.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.FunctionArgArgs.builder
      builder.args(args.map(_(argsBuilder).build)*)

  /**
   * The ``postgresql.ReplicationSlot`` resource creates and manages a replication slot on a PostgreSQL
   *  server.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.ReplicationSlot;
   *  import com.pulumi.postgresql.ReplicationSlotArgs;
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
   *          var mySlot = new ReplicationSlot("mySlot", ReplicationSlotArgs.builder()
   *              .name("my_slot")
   *              .plugin("test_decoding")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   */
  def ReplicationSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.ReplicationSlotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.ReplicationSlotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.ReplicationSlot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.postgresql.ProviderArgs.Builder)
    /**
     * @param clientcert SSL client certificate if required by the database.
     * @return builder
     */
    def clientcert(args: Endofunction[com.pulumi.postgresql.inputs.ProviderClientcertArgs.Builder]):
        com.pulumi.postgresql.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.postgresql.inputs.ProviderClientcertArgs.builder
      builder.clientcert(args(argsBuilder).build)

  /**
   * The ``postgresql.DefaultPrivileges`` resource creates and manages default privileges given to a user for a database schema.
   * 
   *  &gt; **Note:** This resource needs Postgresql version 9 or above.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.DefaultPrivileges;
   *  import com.pulumi.postgresql.DefaultPrivilegesArgs;
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
   *          var readOnlyTables = new DefaultPrivileges("readOnlyTables", DefaultPrivilegesArgs.builder()
   *              .role("test_role")
   *              .database("test_db")
   *              .schema("public")
   *              .owner("db_owner")
   *              .objectType("table")
   *              .privileges("SELECT")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Examples
   * 
   *  ### Grant default privileges for tables to &#34;currentRole&#34; role:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.DefaultPrivileges;
   *  import com.pulumi.postgresql.DefaultPrivilegesArgs;
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
   *          var grantTablePrivileges = new DefaultPrivileges("grantTablePrivileges", DefaultPrivilegesArgs.builder()
   *              .database(exampleDb.name())
   *              .role("current_role")
   *              .owner("owner_role")
   *              .schema("public")
   *              .objectType("table")
   *              .privileges(
   *                  "SELECT",
   *                  "INSERT",
   *                  "UPDATE")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   *  Whenever the `ownerRole` creates a new table in the `public` schema, the `currentRole` is automatically granted SELECT, INSERT, and UPDATE privileges on that table.
   * 
   *  ### Revoke default privileges for functions for &#34;public&#34; role:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.DefaultPrivileges;
   *  import com.pulumi.postgresql.DefaultPrivilegesArgs;
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
   *          var revokePublic = new DefaultPrivileges("revokePublic", DefaultPrivilegesArgs.builder()
   *              .database(exampleDb.name())
   *              .role("public")
   *              .owner("object_owner")
   *              .objectType("function")
   *              .privileges()
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   */
  def DefaultPrivileges(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.DefaultPrivilegesArgs.Builder]) =
    val argsBuilder = com.pulumi.postgresql.DefaultPrivilegesArgs.builder
    com.pulumi.postgresql.DefaultPrivileges(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type PostgresqlFunctions = com.pulumi.postgresql.PostgresqlFunctions
  object PostgresqlFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.postgresql.PostgresqlFunctions.*
  extension (self: PostgresqlFunctions.type)
    /**
     * The ``postgresql.getSchemas`` data source retrieves a list of schema names from a specified PostgreSQL database.
     * 
     *  ## Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.postgresql.PostgresqlFunctions;
     *  import com.pulumi.postgresql.inputs.GetSchemasArgs;
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
     *          final var mySchemas = PostgresqlFunctions.getSchemas(GetSchemasArgs.builder()
     *              .database("my_database")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getSchemas(args: Endofunction[com.pulumi.postgresql.inputs.GetSchemasArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.postgresql.outputs.GetSchemasResult] =
      val argsBuilder = com.pulumi.postgresql.inputs.GetSchemasArgs.builder
      com.pulumi.postgresql.PostgresqlFunctions.getSchemas(args(argsBuilder).build)

    /**
     * The ``postgresql.getSchemas`` data source retrieves a list of schema names from a specified PostgreSQL database.
     * 
     *  ## Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.postgresql.PostgresqlFunctions;
     *  import com.pulumi.postgresql.inputs.GetSchemasArgs;
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
     *          final var mySchemas = PostgresqlFunctions.getSchemas(GetSchemasArgs.builder()
     *              .database("my_database")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getSchemasPlain(args: Endofunction[com.pulumi.postgresql.inputs.GetSchemasPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.postgresql.outputs.GetSchemasResult] =
      val argsBuilder = com.pulumi.postgresql.inputs.GetSchemasPlainArgs.builder
      com.pulumi.postgresql.PostgresqlFunctions.getSchemasPlain(args(argsBuilder).build)

    /**
     * The ``postgresql.getSequences`` data source retrieves a list of sequence names from a specified PostgreSQL database.
     * 
     *  ## Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.postgresql.PostgresqlFunctions;
     *  import com.pulumi.postgresql.inputs.GetSequencesArgs;
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
     *          final var mySequences = PostgresqlFunctions.getSequences(GetSequencesArgs.builder()
     *              .database("my_database")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getSequences(args: Endofunction[com.pulumi.postgresql.inputs.GetSequencesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.postgresql.outputs.GetSequencesResult] =
      val argsBuilder = com.pulumi.postgresql.inputs.GetSequencesArgs.builder
      com.pulumi.postgresql.PostgresqlFunctions.getSequences(args(argsBuilder).build)

    /**
     * The ``postgresql.getSequences`` data source retrieves a list of sequence names from a specified PostgreSQL database.
     * 
     *  ## Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.postgresql.PostgresqlFunctions;
     *  import com.pulumi.postgresql.inputs.GetSequencesArgs;
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
     *          final var mySequences = PostgresqlFunctions.getSequences(GetSequencesArgs.builder()
     *              .database("my_database")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getSequencesPlain(args: Endofunction[com.pulumi.postgresql.inputs.GetSequencesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.postgresql.outputs.GetSequencesResult] =
      val argsBuilder = com.pulumi.postgresql.inputs.GetSequencesPlainArgs.builder
      com.pulumi.postgresql.PostgresqlFunctions.getSequencesPlain(args(argsBuilder).build)

    /**
     * The ``postgresql.getTables`` data source retrieves a list of table names from a specified PostgreSQL database.
     * 
     *  ## Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.postgresql.PostgresqlFunctions;
     *  import com.pulumi.postgresql.inputs.GetTablesArgs;
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
     *          final var myTables = PostgresqlFunctions.getTables(GetTablesArgs.builder()
     *              .database("my_database")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getTables(args: Endofunction[com.pulumi.postgresql.inputs.GetTablesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.postgresql.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.postgresql.inputs.GetTablesArgs.builder
      com.pulumi.postgresql.PostgresqlFunctions.getTables(args(argsBuilder).build)

    /**
     * The ``postgresql.getTables`` data source retrieves a list of table names from a specified PostgreSQL database.
     * 
     *  ## Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.postgresql.PostgresqlFunctions;
     *  import com.pulumi.postgresql.inputs.GetTablesArgs;
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
     *          final var myTables = PostgresqlFunctions.getTables(GetTablesArgs.builder()
     *              .database("my_database")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getTablesPlain(args: Endofunction[com.pulumi.postgresql.inputs.GetTablesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.postgresql.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.postgresql.inputs.GetTablesPlainArgs.builder
      com.pulumi.postgresql.PostgresqlFunctions.getTablesPlain(args(argsBuilder).build)

  /**
   * The ``postgresql.Role`` resource creates and manages a role on a PostgreSQL
   *  server.
   * 
   *  When a ``postgresql.Role`` resource is removed, the PostgreSQL ROLE will
   *  automatically run a [`REASSIGN
   *  OWNED`](https://www.postgresql.org/docs/current/static/sql-reassign-owned.html)
   *  and [`DROP
   *  OWNED`](https://www.postgresql.org/docs/current/static/sql-drop-owned.html) to
   *  the `CURRENT_USER` (normally the connected user for the provider).  If the
   *  specified PostgreSQL ROLE owns objects in multiple PostgreSQL databases in the
   *  same PostgreSQL Cluster, one PostgreSQL provider per database must be created
   *  and all but the final ``postgresql.Role`` must specify a `skipDropRole`.
   * 
   *  &gt; **Note:** All arguments including role name and password will be stored in the raw state as plain-text.
   *  Read more about sensitive data in state.
   * 
   *  &gt; **Note:** For enhanced security, consider using the `passwordWo` and `passwordWoVersion` attributes
   *  instead of `password`. The write-only password attributes prevent the password from being stored in
   *  the Terraform state file while still allowing password management through version-controlled updates.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Role;
   *  import com.pulumi.postgresql.RoleArgs;
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
   *          var myRole = new Role("myRole", RoleArgs.builder()
   *              .name("my_role")
   *              .login(true)
   *              .password("mypass")
   *              .build());
   * 
   *          var myReplicationRole = new Role("myReplicationRole", RoleArgs.builder()
   *              .name("replication_role")
   *              .replication(true)
   *              .login(true)
   *              .connectionLimit(5)
   *              .password("md5c98cbfeb6a347a47eb8e96cfb4c4b890")
   *              .build());
   * 
   *          // Example using write-only password (password not stored in state)
   *          var secureRole = new Role("secureRole", RoleArgs.builder()
   *              .name("secure_role")
   *              .login(true)
   *              .passwordWo("secure_password_123")
   *              .passwordWoVersion("1")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Write-Only Password Management
   * 
   *  The `passwordWo` and `passwordWoVersion` attributes provide a secure way to manage role passwords
   *  without storing them in the Terraform state file:
   * 
   *  * **Security**: The password value is never stored in the state file, reducing the risk of exposure
   *  * **Version Control**: Password updates are controlled through the `passwordWoVersion` attribute
   *  * **Idempotency**: Terraform only updates the password when the version changes, not on every apply
   * 
   *  To change a password when using write-only attributes:
   * 
   *  1. Update the `passwordWo` value with the new password
   *  2. Increment or change the `passwordWoVersion` value
   *  3. Apply the configuration
   * 
   *  **Example of password rotation:**
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Role;
   *  import com.pulumi.postgresql.RoleArgs;
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
   *          // Initial password setup
   *          var appUser = new Role("appUser", RoleArgs.builder()
   *              .name("app_user")
   *              .login(true)
   *              .passwordWo("initial_password_123")
   *              .passwordWoVersion("1")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import Example
   * 
   *  `postgresql.Role` supports importing resources.  Supposing the following
   *  Terraform:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Role;
   *  import com.pulumi.postgresql.RoleArgs;
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
   *          var replicationRole = new Role("replicationRole", RoleArgs.builder()
   *              .name("replication_name")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  It is possible to import a `postgresql.Role` resource with the following
   *  command:
   * 
   *  Where `replicationName` is the name of the role to import and
   *  `postgresql_role.replication_role` is the name of the resource whose state will
   *  be populated as a result of the command.
   */
  def Role(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.RoleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.RoleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.Role(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.Server`` resource creates and manages a foreign server on a PostgreSQL server.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Extension;
   *  import com.pulumi.postgresql.ExtensionArgs;
   *  import com.pulumi.postgresql.Server;
   *  import com.pulumi.postgresql.ServerArgs;
   *  import com.pulumi.resources.CustomResourceOptions;
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
   *          var extPostgresFdw = new Extension("extPostgresFdw", ExtensionArgs.builder()
   *              .name("postgres_fdw")
   *              .build());
   * 
   *          var myserverPostgres = new Server("myserverPostgres", ServerArgs.builder()
   *              .serverName("myserver_postgres")
   *              .fdwName("postgres_fdw")
   *              .options(Map.ofEntries(
   *                  Map.entry("host", "foo"),
   *                  Map.entry("dbname", "foodb"),
   *                  Map.entry("port", "5432")
   *              ))
   *              .build(), CustomResourceOptions.builder()
   *                  .dependsOn(extPostgresFdw)
   *                  .build());
   * 
   *      }
   *  }
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
   *  import com.pulumi.postgresql.Extension;
   *  import com.pulumi.postgresql.ExtensionArgs;
   *  import com.pulumi.postgresql.Server;
   *  import com.pulumi.postgresql.ServerArgs;
   *  import com.pulumi.resources.CustomResourceOptions;
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
   *          var extFileFdw = new Extension("extFileFdw", ExtensionArgs.builder()
   *              .name("file_fdw")
   *              .build());
   * 
   *          var myserverFile = new Server("myserverFile", ServerArgs.builder()
   *              .serverName("myserver_file")
   *              .fdwName("file_fdw")
   *              .build(), CustomResourceOptions.builder()
   *                  .dependsOn(extFileFdw)
   *                  .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   */
  def Server(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.ServerArgs.Builder]) =
    val argsBuilder = com.pulumi.postgresql.ServerArgs.builder
    com.pulumi.postgresql.Server(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.GrantRole`` resource creates and manages membership in a role to one or more other roles in a non-authoritative way.
   * 
   *  When using ``postgresql.GrantRole`` resource it is likely because the PostgreSQL role you are modifying was created outside of this provider.
   * 
   *  &gt; **Note:** This resource needs PostgreSQL version 9 or above.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.GrantRole;
   *  import com.pulumi.postgresql.GrantRoleArgs;
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
   *          var grantRoot = new GrantRole("grantRoot", GrantRoleArgs.builder()
   *              .role("root")
   *              .grantRole("application")
   *              .withAdminOption(true)
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  &gt; **Note:** If you use `postgresql.GrantRole` for a role that you also manage with a `postgresql.Role` resource, you need to ignore the changes of the `roles` attribute in the `postgresql.Role` resource or they will fight over what your role grants should be. e.g.:
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Role;
   *  import com.pulumi.postgresql.RoleArgs;
   *  import com.pulumi.postgresql.GrantRole;
   *  import com.pulumi.postgresql.GrantRoleArgs;
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
   *          var bob = new Role("bob", RoleArgs.builder()
   *              .name("bob")
   *              .build());
   * 
   *          var bobAdmin = new GrantRole("bobAdmin", GrantRoleArgs.builder()
   *              .role("bob")
   *              .grantRole("admin")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   */
  def GrantRole(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.GrantRoleArgs.Builder]) =
    val argsBuilder = com.pulumi.postgresql.GrantRoleArgs.builder
    com.pulumi.postgresql.GrantRole(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.DefaultPrivileges`` resource creates and manages default privileges given to a user for a database schema.
   * 
   *  &gt; **Note:** This resource needs Postgresql version 9 or above.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.DefaultPrivileges;
   *  import com.pulumi.postgresql.DefaultPrivilegesArgs;
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
   *          var readOnlyTables = new DefaultPrivileges("readOnlyTables", DefaultPrivilegesArgs.builder()
   *              .role("test_role")
   *              .database("test_db")
   *              .schema("public")
   *              .owner("db_owner")
   *              .objectType("table")
   *              .privileges("SELECT")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Examples
   * 
   *  ### Grant default privileges for tables to &#34;currentRole&#34; role:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.DefaultPrivileges;
   *  import com.pulumi.postgresql.DefaultPrivilegesArgs;
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
   *          var grantTablePrivileges = new DefaultPrivileges("grantTablePrivileges", DefaultPrivilegesArgs.builder()
   *              .database(exampleDb.name())
   *              .role("current_role")
   *              .owner("owner_role")
   *              .schema("public")
   *              .objectType("table")
   *              .privileges(
   *                  "SELECT",
   *                  "INSERT",
   *                  "UPDATE")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   *  Whenever the `ownerRole` creates a new table in the `public` schema, the `currentRole` is automatically granted SELECT, INSERT, and UPDATE privileges on that table.
   * 
   *  ### Revoke default privileges for functions for &#34;public&#34; role:
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.DefaultPrivileges;
   *  import com.pulumi.postgresql.DefaultPrivilegesArgs;
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
   *          var revokePublic = new DefaultPrivileges("revokePublic", DefaultPrivilegesArgs.builder()
   *              .database(exampleDb.name())
   *              .role("public")
   *              .owner("object_owner")
   *              .objectType("function")
   *              .privileges()
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * @deprecated postgresql.DefaultPrivileg has been deprecated in favor of postgresql.DefaultPrivileges
   */
  @deprecated() def DefaultPrivileg(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.DefaultPrivilegArgs.Builder]) =
    val argsBuilder = com.pulumi.postgresql.DefaultPrivilegArgs.builder
    com.pulumi.postgresql.DefaultPrivileg(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The `postgresql.Subscription` resource creates and manages a publication on a PostgreSQL
   *  server.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Subscription;
   *  import com.pulumi.postgresql.SubscriptionArgs;
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
   *          var subscription = new Subscription("subscription", SubscriptionArgs.builder()
   *              .name("subscription")
   *              .conninfo("host=localhost port=5432 dbname=mydb user=postgres password=postgres")
   *              .publications("publication")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Postgres documentation
   * 
   *  - https://www.postgresql.org/docs/current/sql-createsubscription.html
   */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.SubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.SubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.Function`` resource creates and manages a function on a PostgreSQL
   *  server.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Function;
   *  import com.pulumi.postgresql.FunctionArgs;
   *  import com.pulumi.postgresql.inputs.FunctionArgArgs;
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
   *          var increment = new Function("increment", FunctionArgs.builder()
   *              .name("increment")
   *              .args(FunctionArgArgs.builder()
   *                  .name("i")
   *                  .type("integer")
   *                  .build())
   *              .returns("integer")
   *              .language("plpgsql")
   *              .body("""
   *  BEGIN
   *      RETURN i + 1;
   *  END;
   *              """)
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  It is possible to import a `postgresql.Function` resource with the following
   *  command:
   * 
   *  ```sh
   *  $ pulumi import postgresql:index/function:Function function_foo &#34;my_database.my_schema.my_function_name(arguments)&#34;
   *  ```
   * 
   *  Where `myDatabase` is the name of the database containing the schema,
   *  `mySchema` is the name of the schema in the PostgreSQL database, `myFunctionName` is the function name to be imported, `arguments` is the argument signature of the function including all non OUT types and
   *  `postgresql_schema.function_foo` is the name of the resource whose state will be
   *  populated as a result of the command.
   */
  def Function(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.FunctionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.FunctionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.Function(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.postgresql.inputs.SchemaState.Builder)
    /**
     * @param policies Can be specified multiple times for each policy.  Each
     *  policy block supports fields documented below.
     * @return builder
     * @deprecated Use postgresql.Grant resource instead (with object_type=&#34;schema&#34;)
     */
    @deprecated def policies(args: Endofunction[com.pulumi.postgresql.inputs.SchemaPolicyArgs.Builder]*):
        com.pulumi.postgresql.inputs.SchemaState.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.SchemaPolicyArgs.builder
      builder.policies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.postgresql.inputs.FunctionState.Builder)
    /**
     * @param args List of arguments for the function.
     * @return builder
     */
    def args(args: Endofunction[com.pulumi.postgresql.inputs.FunctionArgArgs.Builder]*):
        com.pulumi.postgresql.inputs.FunctionState.Builder =
      def argsBuilder = com.pulumi.postgresql.inputs.FunctionArgArgs.builder
      builder.args(args.map(_(argsBuilder).build)*)

  /**
   * The ``postgresql.UserMapping`` resource creates and manages a user mapping on a PostgreSQL server.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.Extension;
   *  import com.pulumi.postgresql.ExtensionArgs;
   *  import com.pulumi.postgresql.Server;
   *  import com.pulumi.postgresql.ServerArgs;
   *  import com.pulumi.postgresql.Role;
   *  import com.pulumi.postgresql.RoleArgs;
   *  import com.pulumi.postgresql.UserMapping;
   *  import com.pulumi.postgresql.UserMappingArgs;
   *  import com.pulumi.resources.CustomResourceOptions;
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
   *          var extPostgresFdw = new Extension("extPostgresFdw", ExtensionArgs.builder()
   *              .name("postgres_fdw")
   *              .build());
   * 
   *          var myserverPostgres = new Server("myserverPostgres", ServerArgs.builder()
   *              .serverName("myserver_postgres")
   *              .fdwName("postgres_fdw")
   *              .options(Map.ofEntries(
   *                  Map.entry("host", "foo"),
   *                  Map.entry("dbname", "foodb"),
   *                  Map.entry("port", "5432")
   *              ))
   *              .build(), CustomResourceOptions.builder()
   *                  .dependsOn(extPostgresFdw)
   *                  .build());
   * 
   *          var remote = new Role("remote", RoleArgs.builder()
   *              .name("remote")
   *              .build());
   * 
   *          var remoteUserMapping = new UserMapping("remoteUserMapping", UserMappingArgs.builder()
   *              .serverName(myserverPostgres.serverName())
   *              .userName(remote.name())
   *              .options(Map.ofEntries(
   *                  Map.entry("user", "admin"),
   *                  Map.entry("password", "pass")
   *              ))
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   */
  def UserMapping(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.UserMappingArgs.Builder]) =
    val argsBuilder = com.pulumi.postgresql.UserMappingArgs.builder
    com.pulumi.postgresql.UserMapping(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ``postgresql.PhysicalReplicationSlot`` resource creates and manages a physical replication slot on a PostgreSQL
   *  server. This is useful to setup a cross datacenter replication, with Patroni for example, or permit
   *  any stand-by cluster to replicate physically data.
   * 
   *  ## Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.postgresql.PhysicalReplicationSlot;
   *  import com.pulumi.postgresql.PhysicalReplicationSlotArgs;
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
   *          var mySlot = new PhysicalReplicationSlot("mySlot", PhysicalReplicationSlotArgs.builder()
   *              .name("my_slot")
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   */
  def PhysicalReplicationSlot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.postgresql.PhysicalReplicationSlotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.postgresql.PhysicalReplicationSlotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.postgresql.PhysicalReplicationSlot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
