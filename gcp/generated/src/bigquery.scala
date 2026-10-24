package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object bigquery:
  /**
   * App profile is a configuration object describing how Cloud Bigtable should treat traffic from a particular end user application.
   * 
   * To get more information about AppProfile, see:
   * 
   * * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.appProfiles)
   */
  @deprecated("gcp.bigquery.AppProfile has been deprecated in favor of gcp.bigtable.AppProfile") def AppProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.AppProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.AppProfileArgs.builder
    com.pulumi.gcp.bigquery.AppProfile(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a BI Reservation.
   * 
   * To get more information about BiReservation, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/BiReservation)
   * * How-to Guides
   *     * [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
   */
  def BiReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.BiReservationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.BiReservationArgs.builder
    com.pulumi.gcp.bigquery.BiReservation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object BigqueryFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for connection */
    inline def getConnectionIamPolicy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetConnectionIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetConnectionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetConnectionIamPolicyArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getConnectionIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for connection */
    inline def getConnectionIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetConnectionIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetConnectionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetConnectionIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getConnectionIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for datapolicy */
    inline def getDatapolicyv2DataPolicyIamPolicy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatapolicyv2DataPolicyIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetDatapolicyv2DataPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatapolicyv2DataPolicyIamPolicyArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDatapolicyv2DataPolicyIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for datapolicy */
    inline def getDatapolicyv2DataPolicyIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatapolicyv2DataPolicyIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetDatapolicyv2DataPolicyIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatapolicyv2DataPolicyIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDatapolicyv2DataPolicyIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get information about a BigQuery dataset. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets).
     */
    inline def getDataset(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatasetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetDatasetResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatasetArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDataset(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get information about a BigQuery dataset. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets).
     */
    inline def getDatasetPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatasetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetDatasetResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatasetPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDatasetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieves the current IAM policy data for a BigQuery dataset.
     * 
     * ## example
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.bigquery.BigqueryFunctions;
     * import com.pulumi.gcp.bigquery.inputs.GetDatasetIamPolicyArgs;
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
     *         final var policy = BigqueryFunctions.getDatasetIamPolicy(GetDatasetIamPolicyArgs.builder()
     *             .datasetId(dataset.get("datasetId"))
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getDatasetIamPolicy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatasetIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetDatasetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatasetIamPolicyArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDatasetIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieves the current IAM policy data for a BigQuery dataset.
     * 
     * ## example
     * 
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.bigquery.BigqueryFunctions;
     * import com.pulumi.gcp.bigquery.inputs.GetDatasetIamPolicyArgs;
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
     *         final var policy = BigqueryFunctions.getDatasetIamPolicy(GetDatasetIamPolicyArgs.builder()
     *             .datasetId(dataset.get("datasetId"))
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     */
    inline def getDatasetIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatasetIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetDatasetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatasetIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDatasetIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get a list of datasets in a GCP project. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/list).
     */
    inline def getDatasets(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatasetsArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetDatasetsResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatasetsArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDatasets(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a list of datasets in a GCP project. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets/list).
     */
    inline def getDatasetsPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDatasetsPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetDatasetsResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDatasetsPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDatasetsPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get the email address of a project&#39;s unique BigQuery service account.
     * 
     * Each Google Cloud project has a unique service account used by BigQuery. When using
     * BigQuery with [customer-managed encryption keys](https://cloud.google.com/bigquery/docs/customer-managed-encryption),
     * this account needs to be granted the
     * `cloudkms.cryptoKeyEncrypterDecrypter` IAM role on the customer-managed Cloud KMS key used to protect the data.
     * 
     * For more information see
     * [the API reference](https://cloud.google.com/bigquery/docs/reference/rest/v2/projects/getServiceAccount).
     */
    inline def getDefaultServiceAccount(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDefaultServiceAccountArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetDefaultServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDefaultServiceAccountArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDefaultServiceAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get the email address of a project&#39;s unique BigQuery service account.
     * 
     * Each Google Cloud project has a unique service account used by BigQuery. When using
     * BigQuery with [customer-managed encryption keys](https://cloud.google.com/bigquery/docs/customer-managed-encryption),
     * this account needs to be granted the
     * `cloudkms.cryptoKeyEncrypterDecrypter` IAM role on the customer-managed Cloud KMS key used to protect the data.
     * 
     * For more information see
     * [the API reference](https://cloud.google.com/bigquery/docs/reference/rest/v2/projects/getServiceAccount).
     */
    inline def getDefaultServiceAccountPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetDefaultServiceAccountPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetDefaultServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetDefaultServiceAccountPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getDefaultServiceAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for routine */
    inline def getRoutineIamPolicy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetRoutineIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetRoutineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetRoutineIamPolicyArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getRoutineIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for routine */
    inline def getRoutineIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetRoutineIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetRoutineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetRoutineIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getRoutineIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get a specific table in a BigQuery dataset. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables/get).
     */
    inline def getTable(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetTableArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetTableArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getTable(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a specific table in a BigQuery dataset. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables/get).
     */
    inline def getTablePlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetTablePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetTableResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetTablePlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getTablePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for table */
    inline def getTableIamPolicy(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetTableIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetTableIamPolicyArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getTableIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for table */
    inline def getTableIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetTableIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetTableIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetTableIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getTableIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Get a list of tables in a BigQuery dataset. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
     */
    inline def getTables(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetTablesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigquery.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetTablesArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getTables(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Get a list of tables in a BigQuery dataset. For more information see
     * the [official documentation](https://cloud.google.com/bigquery/docs)
     * and [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
     */
    inline def getTablesPlain(args: Endofunction[com.pulumi.gcp.bigquery.inputs.GetTablesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigquery.outputs.GetTablesResult] =
      val argsBuilder = com.pulumi.gcp.bigquery.inputs.GetTablesPlainArgs.builder
      com.pulumi.gcp.bigquery.BigqueryFunctions.getTablesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Capacity commitment is a way to purchase compute capacity for BigQuery jobs (in the form of slots) with some committed period of usage. Annual commitments renew by default. Commitments can be removed after their commitment end time passes.
   * 
   * In order to remove annual commitment, its plan needs to be changed to monthly or flex first.
   * 
   * To get more information about CapacityCommitment, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/projects.locations.capacityCommitments)
   * * How-to Guides
   *     * [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
   */
  def CapacityCommitment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.CapacityCommitmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.CapacityCommitmentArgs.builder
    com.pulumi.gcp.bigquery.CapacityCommitment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A connection allows BigQuery connections to external data sources..
   * 
   * To get more information about Connection, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/bigqueryconnection/rest/v1/projects.locations.connections/create)
   * * How-to Guides
   *     * [Cloud SQL federated queries](https://cloud.google.com/bigquery/docs/cloud-sql-federated-queries)
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `cloud_sql.credential.password_wo`.
   * Read more about Write-only Arguments.
   */
  def Connection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.ConnectionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.ConnectionArgs.builder
    com.pulumi.gcp.bigquery.Connection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Connection Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.bigquery.ConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.ConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.ConnectionIamBinding` and `gcp.bigquery.ConnectionIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamBinding` resources **can be** used in conjunction with `gcp.bigquery.ConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.ConnectionIamPolicy
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
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicy;
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIamPolicy("policy", ConnectionIamPolicyArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamBinding;
   * import com.pulumi.gcp.bigquery.ConnectionIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ConnectionIamBinding("binding", ConnectionIamBindingArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamMember;
   * import com.pulumi.gcp.bigquery.ConnectionIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ConnectionIamMember("member", ConnectionIamMemberArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
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
   * # IAM policy for BigQuery Connection Connection
   * 
   * Three different resources help you manage your IAM policy for BigQuery Connection Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.bigquery.ConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.ConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.ConnectionIamBinding` and `gcp.bigquery.ConnectionIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamBinding` resources **can be** used in conjunction with `gcp.bigquery.ConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.ConnectionIamPolicy
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
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicy;
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIamPolicy("policy", ConnectionIamPolicyArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamBinding;
   * import com.pulumi.gcp.bigquery.ConnectionIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ConnectionIamBinding("binding", ConnectionIamBindingArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamMember;
   * import com.pulumi.gcp.bigquery.ConnectionIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ConnectionIamMember("member", ConnectionIamMemberArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
   * * {{project}}/{{location}}/{{connection_id}}
   * * {{location}}/{{connection_id}}
   * * {{connection_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery Connection connection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/connectionIamBinding:ConnectionIamBinding editor projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConnectionIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.ConnectionIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.ConnectionIamBindingArgs.builder
    com.pulumi.gcp.bigquery.ConnectionIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Connection Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.bigquery.ConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.ConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.ConnectionIamBinding` and `gcp.bigquery.ConnectionIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamBinding` resources **can be** used in conjunction with `gcp.bigquery.ConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.ConnectionIamPolicy
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
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicy;
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIamPolicy("policy", ConnectionIamPolicyArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamBinding;
   * import com.pulumi.gcp.bigquery.ConnectionIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ConnectionIamBinding("binding", ConnectionIamBindingArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamMember;
   * import com.pulumi.gcp.bigquery.ConnectionIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ConnectionIamMember("member", ConnectionIamMemberArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
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
   * # IAM policy for BigQuery Connection Connection
   * 
   * Three different resources help you manage your IAM policy for BigQuery Connection Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.bigquery.ConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.ConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.ConnectionIamBinding` and `gcp.bigquery.ConnectionIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamBinding` resources **can be** used in conjunction with `gcp.bigquery.ConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.ConnectionIamPolicy
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
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicy;
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIamPolicy("policy", ConnectionIamPolicyArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamBinding;
   * import com.pulumi.gcp.bigquery.ConnectionIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ConnectionIamBinding("binding", ConnectionIamBindingArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamMember;
   * import com.pulumi.gcp.bigquery.ConnectionIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ConnectionIamMember("member", ConnectionIamMemberArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
   * * {{project}}/{{location}}/{{connection_id}}
   * * {{location}}/{{connection_id}}
   * * {{connection_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery Connection connection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/connectionIamMember:ConnectionIamMember editor projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConnectionIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.ConnectionIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.ConnectionIamMemberArgs.builder
    com.pulumi.gcp.bigquery.ConnectionIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Connection Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.bigquery.ConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.ConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.ConnectionIamBinding` and `gcp.bigquery.ConnectionIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamBinding` resources **can be** used in conjunction with `gcp.bigquery.ConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.ConnectionIamPolicy
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
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicy;
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIamPolicy("policy", ConnectionIamPolicyArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamBinding;
   * import com.pulumi.gcp.bigquery.ConnectionIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ConnectionIamBinding("binding", ConnectionIamBindingArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamMember;
   * import com.pulumi.gcp.bigquery.ConnectionIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ConnectionIamMember("member", ConnectionIamMemberArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
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
   * # IAM policy for BigQuery Connection Connection
   * 
   * Three different resources help you manage your IAM policy for BigQuery Connection Connection. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Authoritative. Sets the IAM policy for the connection and replaces any existing policy already attached.
   * * `gcp.bigquery.ConnectionIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the connection are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.ConnectionIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the connection are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.ConnectionIamPolicy`: Retrieves the IAM policy for the connection
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.ConnectionIamBinding` and `gcp.bigquery.ConnectionIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.ConnectionIamBinding` resources **can be** used in conjunction with `gcp.bigquery.ConnectionIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.ConnectionIamPolicy
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
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicy;
   * import com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ConnectionIamPolicy("policy", ConnectionIamPolicyArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamBinding;
   * import com.pulumi.gcp.bigquery.ConnectionIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ConnectionIamBinding("binding", ConnectionIamBindingArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.ConnectionIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.ConnectionIamMember;
   * import com.pulumi.gcp.bigquery.ConnectionIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ConnectionIamMember("member", ConnectionIamMemberArgs.builder()
   *             .project(connection.get("project"))
   *             .location(connection.get("location"))
   *             .connectionId(connection.get("connectionId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
   * * {{project}}/{{location}}/{{connection_id}}
   * * {{location}}/{{connection_id}}
   * * {{connection_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery Connection connection IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_connection_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_connection_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/connections/{{connection_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/connectionIamPolicy:ConnectionIamPolicy editor projects/{{project}}/locations/{{location}}/connections/{{connection_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ConnectionIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.ConnectionIamPolicyArgs.builder
    com.pulumi.gcp.bigquery.ConnectionIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a data transfer configuration. A transfer configuration
   * contains all metadata needed to perform a data transfer.
   * 
   * To get more information about Config, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/datatransfer/rest/v1/projects.locations.transferConfigs/create)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/bigquery/docs/reference/datatransfer/rest/)
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `sensitive_params.secret_access_key_wo`.
   * Read more about Write-only Arguments.
   */
  def DataTransferConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.DataTransferConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.DataTransferConfigArgs.builder
    com.pulumi.gcp.bigquery.DataTransferConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Enrolls a BigQuery Data Transfer Service data source in a project, making it available
   * for use by `gcp.bigquery.DataTransferConfig`. Some data sources, notably Google Cloud
   * Carbon Footprint exports, must be enrolled before a transfer config can be created against
   * them.
   * 
   * Enrollment is project-wide: a data source enrolled in a project is available in every
   * location that offers it.
   * 
   * Enrollment is eventually consistent, so a newly created or recreated enrollment may briefly
   * read as absent before it settles.
   * 
   * To get more information about DataSourceEnrollment, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/datatransfer/rest/v1/projects/enrollDataSources)
   * * How-to Guides
   *     * [Export your carbon footprint](https://cloud.google.com/carbon-footprint/docs/export)
   *     * [Working with transfers](https://cloud.google.com/bigquery/docs/working-with-transfers)
   */
  def DataTransferDataSourceEnrollment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.DataTransferDataSourceEnrollmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.DataTransferDataSourceEnrollmentArgs.builder
    com.pulumi.gcp.bigquery.DataTransferDataSourceEnrollment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * BigQuery Data Policy
   * 
   * To get more information about DataPolicy, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/bigquerydatapolicy/rest/v2/projects.locations.dataPolicies)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/bigquery/docs/column-data-masking-intro)
   */
  def Datapolicyv2DataPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyArgs.builder
    com.pulumi.gcp.bigquery.Datapolicyv2DataPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Data Policy V2 DataPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` and `gcp.bigquery.Datapolicyv2DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamPolicy
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
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicy;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new Datapolicyv2DataPolicyIamPolicy("policy", Datapolicyv2DataPolicyIamPolicyArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBinding;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new Datapolicyv2DataPolicyIamBinding("binding", Datapolicyv2DataPolicyIamBindingArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMember;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new Datapolicyv2DataPolicyIamMember("member", Datapolicyv2DataPolicyIamMemberArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
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
   * # IAM policy for BigQuery Data Policy V2 DataPolicy
   * 
   * Three different resources help you manage your IAM policy for BigQuery Data Policy V2 DataPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` and `gcp.bigquery.Datapolicyv2DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamPolicy
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
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicy;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new Datapolicyv2DataPolicyIamPolicy("policy", Datapolicyv2DataPolicyIamPolicyArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBinding;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new Datapolicyv2DataPolicyIamBinding("binding", Datapolicyv2DataPolicyIamBindingArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMember;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new Datapolicyv2DataPolicyIamMember("member", Datapolicyv2DataPolicyIamMemberArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   * * {{project}}/{{location}}/{{data_policy_id}}
   * * {{location}}/{{data_policy_id}}
   * * {{data_policy_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery Data Policy V2 datapolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_datapolicyv2_data_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_datapolicyv2_data_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/datapolicyv2DataPolicyIamBinding:Datapolicyv2DataPolicyIamBinding editor projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def Datapolicyv2DataPolicyIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs.builder
    com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Data Policy V2 DataPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` and `gcp.bigquery.Datapolicyv2DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamPolicy
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
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicy;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new Datapolicyv2DataPolicyIamPolicy("policy", Datapolicyv2DataPolicyIamPolicyArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBinding;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new Datapolicyv2DataPolicyIamBinding("binding", Datapolicyv2DataPolicyIamBindingArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMember;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new Datapolicyv2DataPolicyIamMember("member", Datapolicyv2DataPolicyIamMemberArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
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
   * # IAM policy for BigQuery Data Policy V2 DataPolicy
   * 
   * Three different resources help you manage your IAM policy for BigQuery Data Policy V2 DataPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` and `gcp.bigquery.Datapolicyv2DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamPolicy
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
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicy;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new Datapolicyv2DataPolicyIamPolicy("policy", Datapolicyv2DataPolicyIamPolicyArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBinding;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new Datapolicyv2DataPolicyIamBinding("binding", Datapolicyv2DataPolicyIamBindingArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMember;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new Datapolicyv2DataPolicyIamMember("member", Datapolicyv2DataPolicyIamMemberArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   * * {{project}}/{{location}}/{{data_policy_id}}
   * * {{location}}/{{data_policy_id}}
   * * {{data_policy_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery Data Policy V2 datapolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_datapolicyv2_data_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_datapolicyv2_data_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/datapolicyv2DataPolicyIamMember:Datapolicyv2DataPolicyIamMember editor projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def Datapolicyv2DataPolicyIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs.builder
    com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Data Policy V2 DataPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` and `gcp.bigquery.Datapolicyv2DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamPolicy
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
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicy;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new Datapolicyv2DataPolicyIamPolicy("policy", Datapolicyv2DataPolicyIamPolicyArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBinding;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new Datapolicyv2DataPolicyIamBinding("binding", Datapolicyv2DataPolicyIamBindingArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMember;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new Datapolicyv2DataPolicyIamMember("member", Datapolicyv2DataPolicyIamMemberArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
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
   * # IAM policy for BigQuery Data Policy V2 DataPolicy
   * 
   * Three different resources help you manage your IAM policy for BigQuery Data Policy V2 DataPolicy. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Authoritative. Sets the IAM policy for the datapolicy and replaces any existing policy already attached.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the datapolicy are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the datapolicy are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy`: Retrieves the IAM policy for the datapolicy
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` and `gcp.bigquery.Datapolicyv2DataPolicyIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.Datapolicyv2DataPolicyIamBinding` resources **can be** used in conjunction with `gcp.bigquery.Datapolicyv2DataPolicyIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamPolicy
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
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicy;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/viewer")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new Datapolicyv2DataPolicyIamPolicy("policy", Datapolicyv2DataPolicyIamPolicyArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBinding;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new Datapolicyv2DataPolicyIamBinding("binding", Datapolicyv2DataPolicyIamBindingArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.Datapolicyv2DataPolicyIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMember;
   * import com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new Datapolicyv2DataPolicyIamMember("member", Datapolicyv2DataPolicyIamMemberArgs.builder()
   *             .project(basicDataPolicy.get("project"))
   *             .location(basicDataPolicy.get("location"))
   *             .dataPolicyId(basicDataPolicy.get("dataPolicyId"))
   *             .role("roles/viewer")
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
   * * projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   * * {{project}}/{{location}}/{{data_policy_id}}
   * * {{location}}/{{data_policy_id}}
   * * {{data_policy_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery Data Policy V2 datapolicy IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_datapolicyv2_data_policy_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_datapolicyv2_data_policy_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/datapolicyv2DataPolicyIamPolicy:Datapolicyv2DataPolicyIamPolicy editor projects/{{project}}/locations/{{location}}/dataPolicies/{{data_policy_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def Datapolicyv2DataPolicyIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicyArgs.builder
    com.pulumi.gcp.bigquery.Datapolicyv2DataPolicyIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Datasets allow you to organize and control access to your tables.
   * 
   * To get more information about Dataset, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets)
   * * How-to Guides
   *     * [Datasets Intro](https://cloud.google.com/bigquery/docs/datasets-intro)
   * 
   * &gt; **Warning:** You must specify the role field using the legacy format `OWNER` instead of `roles/bigquery.dataOwner`.
   * The API does accept both formats but it will always return the legacy format which results in Terraform
   * showing permanent diff on each plan and apply operation.
   */
  def Dataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.DatasetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.DatasetArgs.builder
    com.pulumi.gcp.bigquery.Dataset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Gives dataset access for a single entity. This resource is intended to be used in cases where
   * it is not possible to compile a full list of access blocks to include in a
   * `gcp.bigquery.Dataset` resource, to enable them to be added separately.
   * 
   * &gt; **Note:** If this resource is used alongside a `gcp.bigquery.Dataset` resource, the
   * dataset resource must either have no defined `access` blocks or a `lifecycle` block with
   * `ignoreChanges = [access]` so they don&#39;t fight over which accesses should be on the dataset.
   * Additionally, both resource cannot be modified in the same apply.
   * 
   * To get more information about DatasetAccess, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/rest/v2/datasets)
   * * How-to Guides
   *     * [Controlling access to datasets](https://cloud.google.com/bigquery/docs/dataset-access-controls)
   * 
   * &gt; **Warning:** You must specify the role field using the legacy format `OWNER` instead of `roles/bigquery.dataOwner`.
   * The API does accept both formats but it will always return the legacy format which results in Terraform
   * showing permanent diff on each plan and apply operation.
   */
  def DatasetAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.DatasetAccessArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.DatasetAccessArgs.builder
    com.pulumi.gcp.bigquery.DatasetAccess(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery dataset. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
   * * `gcp.bigquery.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
   * * `gcp.bigquery.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
   * 
   * These resources are intended to convert the permissions system for BigQuery datasets to the standard IAM interface. For advanced usages, including [creating authorized views](https://cloud.google.com/bigquery/docs/share-access-views), please use either `gcp.bigquery.DatasetAccess` or the `access` field on `gcp.bigquery.Dataset`.
   * 
   * &gt; **Note:** These resources **cannot** be used with `gcp.bigquery.DatasetAccess` resources or the `access` field on `gcp.bigquery.Dataset` or they will fight over what the policy should be.
   * 
   * &gt; **Note:** Using any of these resources will remove any authorized view permissions from the dataset. To assign and preserve authorized view permissions use the `gcp.bigquery.DatasetAccess` instead.
   * 
   * &gt; **Note:** Legacy BigQuery roles `OWNER` `WRITER` and `READER` **cannot** be used with any of these IAM resources. Instead use the full role form of: `roles/bigquery.dataOwner` `roles/bigquery.dataEditor` and `roles/bigquery.dataViewer`.
   * 
   * &gt; **Note:** `gcp.bigquery.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.DatasetIamBinding` and `gcp.bigquery.DatasetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.DatasetIamBinding` resources **can be** used in conjunction with `gcp.bigquery.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.DatasetIamPolicy
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2029_12_31")
   *                     .description("Expiring at midnight of 2029-12-31")
   *                     .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamBindingConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamMemberConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamPolicy
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2029_12_31")
   *                     .description("Expiring at midnight of 2029-12-31")
   *                     .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamBindingConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamMemberConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatasetIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.DatasetIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.DatasetIamBindingArgs.builder
    com.pulumi.gcp.bigquery.DatasetIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery dataset. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
   * * `gcp.bigquery.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
   * * `gcp.bigquery.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
   * 
   * These resources are intended to convert the permissions system for BigQuery datasets to the standard IAM interface. For advanced usages, including [creating authorized views](https://cloud.google.com/bigquery/docs/share-access-views), please use either `gcp.bigquery.DatasetAccess` or the `access` field on `gcp.bigquery.Dataset`.
   * 
   * &gt; **Note:** These resources **cannot** be used with `gcp.bigquery.DatasetAccess` resources or the `access` field on `gcp.bigquery.Dataset` or they will fight over what the policy should be.
   * 
   * &gt; **Note:** Using any of these resources will remove any authorized view permissions from the dataset. To assign and preserve authorized view permissions use the `gcp.bigquery.DatasetAccess` instead.
   * 
   * &gt; **Note:** Legacy BigQuery roles `OWNER` `WRITER` and `READER` **cannot** be used with any of these IAM resources. Instead use the full role form of: `roles/bigquery.dataOwner` `roles/bigquery.dataEditor` and `roles/bigquery.dataViewer`.
   * 
   * &gt; **Note:** `gcp.bigquery.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.DatasetIamBinding` and `gcp.bigquery.DatasetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.DatasetIamBinding` resources **can be** used in conjunction with `gcp.bigquery.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.DatasetIamPolicy
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2029_12_31")
   *                     .description("Expiring at midnight of 2029-12-31")
   *                     .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamBindingConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamMemberConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamPolicy
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2029_12_31")
   *                     .description("Expiring at midnight of 2029-12-31")
   *                     .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamBindingConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamMemberConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatasetIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.DatasetIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.DatasetIamMemberArgs.builder
    com.pulumi.gcp.bigquery.DatasetIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery dataset. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
   * * `gcp.bigquery.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
   * * `gcp.bigquery.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
   * 
   * These resources are intended to convert the permissions system for BigQuery datasets to the standard IAM interface. For advanced usages, including [creating authorized views](https://cloud.google.com/bigquery/docs/share-access-views), please use either `gcp.bigquery.DatasetAccess` or the `access` field on `gcp.bigquery.Dataset`.
   * 
   * &gt; **Note:** These resources **cannot** be used with `gcp.bigquery.DatasetAccess` resources or the `access` field on `gcp.bigquery.Dataset` or they will fight over what the policy should be.
   * 
   * &gt; **Note:** Using any of these resources will remove any authorized view permissions from the dataset. To assign and preserve authorized view permissions use the `gcp.bigquery.DatasetAccess` instead.
   * 
   * &gt; **Note:** Legacy BigQuery roles `OWNER` `WRITER` and `READER` **cannot** be used with any of these IAM resources. Instead use the full role form of: `roles/bigquery.dataOwner` `roles/bigquery.dataEditor` and `roles/bigquery.dataViewer`.
   * 
   * &gt; **Note:** `gcp.bigquery.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.DatasetIamBinding` and `gcp.bigquery.DatasetIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.DatasetIamBinding` resources **can be** used in conjunction with `gcp.bigquery.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.DatasetIamPolicy
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2029_12_31")
   *                     .description("Expiring at midnight of 2029-12-31")
   *                     .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamBindingConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamMemberConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamPolicy
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
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
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicy;
   * import com.pulumi.gcp.bigquery.DatasetIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         final var owner = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *             .bindings(GetIAMPolicyBindingArgs.builder()
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2029_12_31")
   *                     .description("Expiring at midnight of 2029-12-31")
   *                     .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var datasetDataset = new Dataset("datasetDataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var dataset = new DatasetIamPolicy("dataset", DatasetIamPolicyArgs.builder()
   *             .datasetId(datasetDataset.datasetId())
   *             .policyData(owner.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamBinding;
   * import com.pulumi.gcp.bigquery.DatasetIamBindingArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var reader = new DatasetIamBinding("reader", DatasetIamBindingArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataViewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamBindingConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
   *                 .build())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.DatasetIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## With IAM condition
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.Dataset;
   * import com.pulumi.gcp.bigquery.DatasetArgs;
   * import com.pulumi.gcp.bigquery.DatasetIamMember;
   * import com.pulumi.gcp.bigquery.DatasetIamMemberArgs;
   * import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var dataset = new Dataset("dataset", DatasetArgs.builder()
   *             .datasetId("example_dataset")
   *             .build());
   * 
   *         var editor = new DatasetIamMember("editor", DatasetIamMemberArgs.builder()
   *             .datasetId(dataset.datasetId())
   *             .role("roles/bigquery.dataEditor")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(DatasetIamMemberConditionArgs.builder()
   *                 .title("expires_after_2029_12_31")
   *                 .description("Expiring at midnight of 2029-12-31")
   *                 .expression("request.time < timestamp(\"2030-01-01T00:00:00Z\")")
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
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DatasetIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.DatasetIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.DatasetIamPolicyArgs.builder
    com.pulumi.gcp.bigquery.DatasetIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.IamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.bigquery.IamPolicy` **cannot** be used in conjunction with `gcp.bigquery.IamBinding` and `gcp.bigquery.IamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.IamBinding` resources **can be** used in conjunction with `gcp.bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.IamPolicy
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
   * import com.pulumi.gcp.bigquery.IamPolicy;
   * import com.pulumi.gcp.bigquery.IamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamBinding;
   * import com.pulumi.gcp.bigquery.IamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new IamBinding("binding", IamBindingArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamMember;
   * import com.pulumi.gcp.bigquery.IamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new IamMember("member", IamMemberArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
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
   * # IAM policy for BigQuery Table
   * 
   * Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.IamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.bigquery.IamPolicy` **cannot** be used in conjunction with `gcp.bigquery.IamBinding` and `gcp.bigquery.IamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.IamBinding` resources **can be** used in conjunction with `gcp.bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.IamPolicy
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
   * import com.pulumi.gcp.bigquery.IamPolicy;
   * import com.pulumi.gcp.bigquery.IamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamBinding;
   * import com.pulumi.gcp.bigquery.IamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new IamBinding("binding", IamBindingArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamMember;
   * import com.pulumi.gcp.bigquery.IamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new IamMember("member", IamMemberArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
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
   * * projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
   * * {{project}}/{{dataset_id}}/{{table_id}}
   * * {{dataset_id}}/{{table_id}}
   * * {{table_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery table IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_table_iam_member.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_table_iam_binding.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/iamBinding:IamBinding editor projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.IamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.IamBindingArgs.builder
    com.pulumi.gcp.bigquery.IamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.IamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.bigquery.IamPolicy` **cannot** be used in conjunction with `gcp.bigquery.IamBinding` and `gcp.bigquery.IamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.IamBinding` resources **can be** used in conjunction with `gcp.bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.IamPolicy
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
   * import com.pulumi.gcp.bigquery.IamPolicy;
   * import com.pulumi.gcp.bigquery.IamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamBinding;
   * import com.pulumi.gcp.bigquery.IamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new IamBinding("binding", IamBindingArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamMember;
   * import com.pulumi.gcp.bigquery.IamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new IamMember("member", IamMemberArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
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
   * # IAM policy for BigQuery Table
   * 
   * Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.IamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.bigquery.IamPolicy` **cannot** be used in conjunction with `gcp.bigquery.IamBinding` and `gcp.bigquery.IamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.IamBinding` resources **can be** used in conjunction with `gcp.bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.IamPolicy
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
   * import com.pulumi.gcp.bigquery.IamPolicy;
   * import com.pulumi.gcp.bigquery.IamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamBinding;
   * import com.pulumi.gcp.bigquery.IamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new IamBinding("binding", IamBindingArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamMember;
   * import com.pulumi.gcp.bigquery.IamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new IamMember("member", IamMemberArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
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
   * * projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
   * * {{project}}/{{dataset_id}}/{{table_id}}
   * * {{dataset_id}}/{{table_id}}
   * * {{table_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery table IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_table_iam_member.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_table_iam_binding.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/iamMember:IamMember editor projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.IamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.IamMemberArgs.builder
    com.pulumi.gcp.bigquery.IamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.IamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.bigquery.IamPolicy` **cannot** be used in conjunction with `gcp.bigquery.IamBinding` and `gcp.bigquery.IamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.IamBinding` resources **can be** used in conjunction with `gcp.bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.IamPolicy
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
   * import com.pulumi.gcp.bigquery.IamPolicy;
   * import com.pulumi.gcp.bigquery.IamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamBinding;
   * import com.pulumi.gcp.bigquery.IamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new IamBinding("binding", IamBindingArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamMember;
   * import com.pulumi.gcp.bigquery.IamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new IamMember("member", IamMemberArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
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
   * # IAM policy for BigQuery Table
   * 
   * Three different resources help you manage your IAM policy for BigQuery Table. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.IamPolicy`: Authoritative. Sets the IAM policy for the table and replaces any existing policy already attached.
   * * `gcp.bigquery.IamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the table are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.IamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the table are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.IamPolicy`: Retrieves the IAM policy for the table
   * 
   * &gt; **Note:** `gcp.bigquery.IamPolicy` **cannot** be used in conjunction with `gcp.bigquery.IamBinding` and `gcp.bigquery.IamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.IamBinding` resources **can be** used in conjunction with `gcp.bigquery.IamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.IamPolicy
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
   * import com.pulumi.gcp.bigquery.IamPolicy;
   * import com.pulumi.gcp.bigquery.IamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new IamPolicy("policy", IamPolicyArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamBinding;
   * import com.pulumi.gcp.bigquery.IamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new IamBinding("binding", IamBindingArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.IamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.IamMember;
   * import com.pulumi.gcp.bigquery.IamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new IamMember("member", IamMemberArgs.builder()
   *             .project(test.get("project"))
   *             .datasetId(test.get("datasetId"))
   *             .tableId(test.get("tableId"))
   *             .role("roles/bigquery.dataOwner")
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
   * * projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
   * * {{project}}/{{dataset_id}}/{{table_id}}
   * * {{dataset_id}}/{{table_id}}
   * * {{table_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery table IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_table_iam_member.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_table_iam_binding.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}} roles/bigquery.dataOwner&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/iamPolicy:IamPolicy editor projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def IamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.IamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.IamPolicyArgs.builder
    com.pulumi.gcp.bigquery.IamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Jobs are actions that BigQuery runs on your behalf to load data, export data, query data, or copy data.
   * Once a BigQuery job is created, it cannot be changed or deleted.
   * 
   * To get more information about Job, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/rest/v2/jobs)
   * * How-to Guides
   *     * [BigQuery Jobs Intro](https://cloud.google.com/bigquery/docs/jobs-overview)
   */
  def Job(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.JobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.JobArgs.builder
    com.pulumi.gcp.bigquery.Job(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A reservation is a mechanism used to guarantee BigQuery slots to users.
   * 
   * To get more information about Reservation, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/projects.locations.reservations/create)
   * * How-to Guides
   *     * [Introduction to Reservations](https://cloud.google.com/bigquery/docs/reservations-intro)
   */
  def Reservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.ReservationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.bigquery.ReservationArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.bigquery.Reservation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The BigqueryReservation Assignment resource.
   * 
   * To get more information about ReservationAssignment, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/projects.locations.reservations.assignments)
   * * How-to Guides
   *     * [Work with reservation assignments](https://cloud.google.com/bigquery/docs/reservations-assignments)
   */
  def ReservationAssignment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.ReservationAssignmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.ReservationAssignmentArgs.builder
    com.pulumi.gcp.bigquery.ReservationAssignment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A reservation group is a container for reservations.
   * 
   * To get more information about ReservationGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/reservations/rest/v1/projects.locations.reservationGroups)
   */
  def ReservationGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.ReservationGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.bigquery.ReservationGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.bigquery.ReservationGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A user-defined function or a stored procedure that belongs to a Dataset
   * 
   * To get more information about Routine, see:
   * 
   * * [API documentation](https://cloud.google.com/bigquery/docs/reference/rest/v2/routines)
   * * How-to Guides
   *     * [Routines Intro](https://cloud.google.com/bigquery/docs/reference/rest/v2/routines)
   */
  def Routine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.RoutineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.RoutineArgs.builder
    com.pulumi.gcp.bigquery.Routine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Routine. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Authoritative. Sets the IAM policy for the routine and replaces any existing policy already attached.
   * * `gcp.bigquery.RoutineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the routine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.RoutineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the routine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Retrieves the IAM policy for the routine
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.RoutineIamBinding` and `gcp.bigquery.RoutineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamBinding` resources **can be** used in conjunction with `gcp.bigquery.RoutineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.RoutineIamPolicy
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
   * import com.pulumi.gcp.bigquery.RoutineIamPolicy;
   * import com.pulumi.gcp.bigquery.RoutineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RoutineIamPolicy("policy", RoutineIamPolicyArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamBinding;
   * import com.pulumi.gcp.bigquery.RoutineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RoutineIamBinding("binding", RoutineIamBindingArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamMember;
   * import com.pulumi.gcp.bigquery.RoutineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RoutineIamMember("member", RoutineIamMemberArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
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
   * # IAM policy for BigQuery Routine
   * 
   * Three different resources help you manage your IAM policy for BigQuery Routine. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Authoritative. Sets the IAM policy for the routine and replaces any existing policy already attached.
   * * `gcp.bigquery.RoutineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the routine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.RoutineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the routine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Retrieves the IAM policy for the routine
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.RoutineIamBinding` and `gcp.bigquery.RoutineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamBinding` resources **can be** used in conjunction with `gcp.bigquery.RoutineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.RoutineIamPolicy
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
   * import com.pulumi.gcp.bigquery.RoutineIamPolicy;
   * import com.pulumi.gcp.bigquery.RoutineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RoutineIamPolicy("policy", RoutineIamPolicyArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamBinding;
   * import com.pulumi.gcp.bigquery.RoutineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RoutineIamBinding("binding", RoutineIamBindingArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamMember;
   * import com.pulumi.gcp.bigquery.RoutineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RoutineIamMember("member", RoutineIamMemberArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
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
   * * projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
   * * {{project}}/{{dataset_id}}/{{routine_id}}
   * * {{dataset_id}}/{{routine_id}}
   * * {{routine_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery routine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_routine_iam_member.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}} roles/bigquery.dataOwner user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_routine_iam_binding.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}} roles/bigquery.dataOwner&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/routineIamBinding:RoutineIamBinding editor projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RoutineIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.RoutineIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.RoutineIamBindingArgs.builder
    com.pulumi.gcp.bigquery.RoutineIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Routine. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Authoritative. Sets the IAM policy for the routine and replaces any existing policy already attached.
   * * `gcp.bigquery.RoutineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the routine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.RoutineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the routine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Retrieves the IAM policy for the routine
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.RoutineIamBinding` and `gcp.bigquery.RoutineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamBinding` resources **can be** used in conjunction with `gcp.bigquery.RoutineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.RoutineIamPolicy
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
   * import com.pulumi.gcp.bigquery.RoutineIamPolicy;
   * import com.pulumi.gcp.bigquery.RoutineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RoutineIamPolicy("policy", RoutineIamPolicyArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamBinding;
   * import com.pulumi.gcp.bigquery.RoutineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RoutineIamBinding("binding", RoutineIamBindingArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamMember;
   * import com.pulumi.gcp.bigquery.RoutineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RoutineIamMember("member", RoutineIamMemberArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
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
   * # IAM policy for BigQuery Routine
   * 
   * Three different resources help you manage your IAM policy for BigQuery Routine. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Authoritative. Sets the IAM policy for the routine and replaces any existing policy already attached.
   * * `gcp.bigquery.RoutineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the routine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.RoutineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the routine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Retrieves the IAM policy for the routine
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.RoutineIamBinding` and `gcp.bigquery.RoutineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamBinding` resources **can be** used in conjunction with `gcp.bigquery.RoutineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.RoutineIamPolicy
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
   * import com.pulumi.gcp.bigquery.RoutineIamPolicy;
   * import com.pulumi.gcp.bigquery.RoutineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RoutineIamPolicy("policy", RoutineIamPolicyArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamBinding;
   * import com.pulumi.gcp.bigquery.RoutineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RoutineIamBinding("binding", RoutineIamBindingArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamMember;
   * import com.pulumi.gcp.bigquery.RoutineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RoutineIamMember("member", RoutineIamMemberArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
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
   * * projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
   * * {{project}}/{{dataset_id}}/{{routine_id}}
   * * {{dataset_id}}/{{routine_id}}
   * * {{routine_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery routine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_routine_iam_member.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}} roles/bigquery.dataOwner user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_routine_iam_binding.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}} roles/bigquery.dataOwner&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/routineIamMember:RoutineIamMember editor projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RoutineIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.RoutineIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.RoutineIamMemberArgs.builder
    com.pulumi.gcp.bigquery.RoutineIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Routine. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Authoritative. Sets the IAM policy for the routine and replaces any existing policy already attached.
   * * `gcp.bigquery.RoutineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the routine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.RoutineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the routine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Retrieves the IAM policy for the routine
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.RoutineIamBinding` and `gcp.bigquery.RoutineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamBinding` resources **can be** used in conjunction with `gcp.bigquery.RoutineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.RoutineIamPolicy
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
   * import com.pulumi.gcp.bigquery.RoutineIamPolicy;
   * import com.pulumi.gcp.bigquery.RoutineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RoutineIamPolicy("policy", RoutineIamPolicyArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamBinding;
   * import com.pulumi.gcp.bigquery.RoutineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RoutineIamBinding("binding", RoutineIamBindingArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamMember;
   * import com.pulumi.gcp.bigquery.RoutineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RoutineIamMember("member", RoutineIamMemberArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
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
   * # IAM policy for BigQuery Routine
   * 
   * Three different resources help you manage your IAM policy for BigQuery Routine. Each of these resources serves a different use case:
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Authoritative. Sets the IAM policy for the routine and replaces any existing policy already attached.
   * * `gcp.bigquery.RoutineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the routine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.bigquery.RoutineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the routine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.bigquery.RoutineIamPolicy`: Retrieves the IAM policy for the routine
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamPolicy` **cannot** be used in conjunction with `gcp.bigquery.RoutineIamBinding` and `gcp.bigquery.RoutineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.bigquery.RoutineIamBinding` resources **can be** used in conjunction with `gcp.bigquery.RoutineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.bigquery.RoutineIamPolicy
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
   * import com.pulumi.gcp.bigquery.RoutineIamPolicy;
   * import com.pulumi.gcp.bigquery.RoutineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/bigquery.dataOwner")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new RoutineIamPolicy("policy", RoutineIamPolicyArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamBinding;
   * import com.pulumi.gcp.bigquery.RoutineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new RoutineIamBinding("binding", RoutineIamBindingArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.bigquery.RoutineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.bigquery.RoutineIamMember;
   * import com.pulumi.gcp.bigquery.RoutineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new RoutineIamMember("member", RoutineIamMemberArgs.builder()
   *             .project(sproc.get("project"))
   *             .datasetId(sproc.get("datasetId"))
   *             .routineId(sproc.get("routineId"))
   *             .role("roles/bigquery.dataOwner")
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
   * * projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
   * * {{project}}/{{dataset_id}}/{{routine_id}}
   * * {{dataset_id}}/{{routine_id}}
   * * {{routine_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * BigQuery routine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_bigquery_routine_iam_member.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}} roles/bigquery.dataOwner user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_bigquery_routine_iam_binding.editor &#34;projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}} roles/bigquery.dataOwner&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:bigquery/routineIamPolicy:RoutineIamPolicy editor projects/{{project}}/datasets/{{dataset_id}}/routines/{{routine_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RoutineIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.RoutineIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.RoutineIamPolicyArgs.builder
    com.pulumi.gcp.bigquery.RoutineIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Represents access on a subset of rows on the specified table, defined by its filter predicate. Access to the subset of rows is controlled by its IAM policy. */
  def RowAccessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.RowAccessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.RowAccessPolicyArgs.builder
    com.pulumi.gcp.bigquery.RowAccessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a table resource in a dataset for Google BigQuery. For more information see
   * [the official documentation](https://cloud.google.com/bigquery/docs/) and
   * [API](https://cloud.google.com/bigquery/docs/reference/rest/v2/tables).
   * 
   * &gt; **Note**: On newer versions of the provider, you must explicitly set `deletion_protection=false`
   * (and run `pulumi update` to write the field to state) in order to destroy an instance.
   * It is recommended to not set this field (or set it to true) until you&#39;re ready to destroy.
   */
  def Table(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.bigquery.TableArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.bigquery.TableArgs.builder
    com.pulumi.gcp.bigquery.Table(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
