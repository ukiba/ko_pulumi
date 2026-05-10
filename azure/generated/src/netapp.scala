package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object netapp:
  extension (builder: com.pulumi.azure.netapp.VolumeArgs.Builder)
    /**
     * @param coolAccess A `coolAccess` block as defined below.
     * @return builder
     */
    def coolAccess(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.builder
      builder.coolAccess(args(argsBuilder).build)

    /**
     * @param dataProtectionAdvancedRansomware A `dataProtectionAdvancedRansomware` block as defined below.
     * @return builder
     */
    def dataProtectionAdvancedRansomware(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.builder
      builder.dataProtectionAdvancedRansomware(args(argsBuilder).build)

    /**
     * @param dataProtectionBackupPolicy A `dataProtectionBackupPolicy` block as defined below.
     * @return builder
     */
    def dataProtectionBackupPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.builder
      builder.dataProtectionBackupPolicy(args(argsBuilder).build)

    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` block defined below.
     * @return builder
     */
    def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.VolumeArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.netapp.VolumeGroupSapHanaArgs.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.VolumeGroupSapHanaArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Application Volume Group for Oracle application.
   * 
   *  &gt; **Note:** This feature is intended to be used for Oracle workloads only, with several requirements, please refer to [Understand Azure NetApp Files application volume group for Oracle](https://learn.microsoft.com/en-us/azure/azure-netapp-files/application-volume-oracle-introduction) document as the starting point to understand this feature before using it with Terraform.
   */
  def VolumeGroupOracle(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.VolumeGroupOracleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.VolumeGroupOracleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.netapp.VolumeGroupOracle(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type NetappFunctions = com.pulumi.azure.netapp.NetappFunctions
  object NetappFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.azure.netapp.NetappFunctions.*
  extension (self: NetappFunctions.type)
    /**
     * Uses this data source to access information about an existing NetApp Account.
     * 
     *  ## NetApp Account Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetAccountArgs;
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
     *          final var example = NetappFunctions.getAccount(GetAccountArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .name("acctestnetappaccount")
     *              .build());
     * 
     *          ctx.export("netappAccountId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getAccount(args: Endofunction[com.pulumi.azure.netapp.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetAccountArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getAccount(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Account.
     * 
     *  ## NetApp Account Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetAccountArgs;
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
     *          final var example = NetappFunctions.getAccount(GetAccountArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .name("acctestnetappaccount")
     *              .build());
     * 
     *          ctx.export("netappAccountId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getAccountPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetAccountPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getAccountPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing NetApp Account Encryption Resource. */
    def getAccountEncryption(args: Endofunction[com.pulumi.azure.netapp.inputs.GetAccountEncryptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetAccountEncryptionResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetAccountEncryptionArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getAccountEncryption(args(argsBuilder).build)

    /** Use this data source to access information about an existing NetApp Account Encryption Resource. */
    def getAccountEncryptionPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetAccountEncryptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetAccountEncryptionResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetAccountEncryptionPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getAccountEncryptionPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing NetApp Backup Vault.
     * 
     *  ## NetApp Backup Policy Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetBackupPolicyArgs;
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
     *          final var example = NetappFunctions.getBackupPolicy(GetBackupPolicyArgs.builder()
     *              .resourceGroupName("example-resource-group")
     *              .accountName("example-netappaccount")
     *              .name("example-backuppolicy")
     *              .build());
     * 
     *          ctx.export("backupPolicyId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getBackupPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.GetBackupPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetBackupPolicyResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetBackupPolicyArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getBackupPolicy(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing NetApp Backup Vault.
     * 
     *  ## NetApp Backup Policy Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetBackupPolicyArgs;
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
     *          final var example = NetappFunctions.getBackupPolicy(GetBackupPolicyArgs.builder()
     *              .resourceGroupName("example-resource-group")
     *              .accountName("example-netappaccount")
     *              .name("example-backuppolicy")
     *              .build());
     * 
     *          ctx.export("backupPolicyId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getBackupPolicyPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetBackupPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetBackupPolicyResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetBackupPolicyPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getBackupPolicyPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing NetApp Backup Vault.
     * 
     *  ## NetApp Backup Vault Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetBackupVaultArgs;
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
     *          final var example = NetappFunctions.getBackupVault(GetBackupVaultArgs.builder()
     *              .resourceGroupName("example-resource-group")
     *              .accountName("example-netappaccount")
     *              .name("example-backupvault")
     *              .build());
     * 
     *          ctx.export("backupVaultId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getBackupVault(args: Endofunction[com.pulumi.azure.netapp.inputs.GetBackupVaultArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetBackupVaultArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getBackupVault(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing NetApp Backup Vault.
     * 
     *  ## NetApp Backup Vault Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetBackupVaultArgs;
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
     *          final var example = NetappFunctions.getBackupVault(GetBackupVaultArgs.builder()
     *              .resourceGroupName("example-resource-group")
     *              .accountName("example-netappaccount")
     *              .name("example-backupvault")
     *              .build());
     * 
     *          ctx.export("backupVaultId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getBackupVaultPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetBackupVaultPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetBackupVaultResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetBackupVaultPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getBackupVaultPlain(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Pool.
     * 
     *  ## NetApp Pool Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetPoolArgs;
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
     *          final var example = NetappFunctions.getPool(GetPoolArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .accountName("acctestnetappaccount")
     *              .name("acctestnetapppool")
     *              .build());
     * 
     *          ctx.export("netappPoolId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getPool(args: Endofunction[com.pulumi.azure.netapp.inputs.GetPoolArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetPoolResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetPoolArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getPool(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Pool.
     * 
     *  ## NetApp Pool Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetPoolArgs;
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
     *          final var example = NetappFunctions.getPool(GetPoolArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .accountName("acctestnetappaccount")
     *              .name("acctestnetapppool")
     *              .build());
     * 
     *          ctx.export("netappPoolId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getPoolPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetPoolPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetPoolResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetPoolPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getPoolPlain(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Snapshot.
     * 
     *  ## NetApp Snapshot Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetSnapshotArgs;
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
     *          final var test = NetappFunctions.getSnapshot(GetSnapshotArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .name("acctestnetappsnapshot")
     *              .accountName("acctestnetappaccount")
     *              .poolName("acctestnetapppool")
     *              .volumeName("acctestnetappvolume")
     *              .build());
     * 
     *          ctx.export("netappSnapshotId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getSnapshot(args: Endofunction[com.pulumi.azure.netapp.inputs.GetSnapshotArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetSnapshotArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getSnapshot(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Snapshot.
     * 
     *  ## NetApp Snapshot Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetSnapshotArgs;
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
     *          final var test = NetappFunctions.getSnapshot(GetSnapshotArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .name("acctestnetappsnapshot")
     *              .accountName("acctestnetappaccount")
     *              .poolName("acctestnetapppool")
     *              .volumeName("acctestnetappvolume")
     *              .build());
     * 
     *          ctx.export("netappSnapshotId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getSnapshotPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetSnapshotPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetSnapshotResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetSnapshotPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getSnapshotPlain(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Snapshot Policy.
     * 
     *  ## NetApp Snapshot Policy Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetSnapshotPolicyArgs;
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
     *          final var example = NetappFunctions.getSnapshotPolicy(GetSnapshotPolicyArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .accountName("acctestnetappaccount")
     *              .name("example-snapshot-policy")
     *              .build());
     * 
     *          ctx.export("id", example.id());
     *          ctx.export("name", example.name());
     *          ctx.export("enabled", example.enabled());
     *          ctx.export("hourlySchedule", example.hourlySchedules());
     *          ctx.export("dailySchedule", example.dailySchedules());
     *          ctx.export("weeklySchedule", example.weeklySchedules());
     *          ctx.export("monthlySchedule", example.monthlySchedules());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.GetSnapshotPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetSnapshotPolicyResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetSnapshotPolicyArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getSnapshotPolicy(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Snapshot Policy.
     * 
     *  ## NetApp Snapshot Policy Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetSnapshotPolicyArgs;
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
     *          final var example = NetappFunctions.getSnapshotPolicy(GetSnapshotPolicyArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .accountName("acctestnetappaccount")
     *              .name("example-snapshot-policy")
     *              .build());
     * 
     *          ctx.export("id", example.id());
     *          ctx.export("name", example.name());
     *          ctx.export("enabled", example.enabled());
     *          ctx.export("hourlySchedule", example.hourlySchedules());
     *          ctx.export("dailySchedule", example.dailySchedules());
     *          ctx.export("weeklySchedule", example.weeklySchedules());
     *          ctx.export("monthlySchedule", example.monthlySchedules());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getSnapshotPolicyPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetSnapshotPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetSnapshotPolicyResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetSnapshotPolicyPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getSnapshotPolicyPlain(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Volume.
     * 
     *  ## NetApp Volume Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetVolumeArgs;
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
     *          final var example = NetappFunctions.getVolume(GetVolumeArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .accountName("acctestnetappaccount")
     *              .poolName("acctestnetapppool")
     *              .name("example-volume")
     *              .build());
     * 
     *          ctx.export("netappVolumeId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getVolume(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumeArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetVolumeResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumeArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolume(args(argsBuilder).build)

    /**
     * Uses this data source to access information about an existing NetApp Volume.
     * 
     *  ## NetApp Volume Usage
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.azure.netapp.NetappFunctions;
     *  import com.pulumi.azure.netapp.inputs.GetVolumeArgs;
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
     *          final var example = NetappFunctions.getVolume(GetVolumeArgs.builder()
     *              .resourceGroupName("acctestRG")
     *              .accountName("acctestnetappaccount")
     *              .poolName("acctestnetapppool")
     *              .name("example-volume")
     *              .build());
     * 
     *          ctx.export("netappVolumeId", example.id());
     *      }
     *  }
     *  }
     *  </pre>
     * 
     *  ## API Providers
     * 
     *  &lt;!-- This section is generated, changes will be overwritten --&gt;
     *  This data source uses the following Azure API Providers:
     * 
     *  * `Microsoft.NetApp` - 2025-12-01
     */
    def getVolumePlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetVolumeResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumePlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolumePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Volume Group for Oracle application. */
    def getVolumeGroupOracle(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumeGroupOracleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetVolumeGroupOracleResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumeGroupOracleArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolumeGroupOracle(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Volume Group for Oracle application. */
    def getVolumeGroupOraclePlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumeGroupOraclePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetVolumeGroupOracleResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumeGroupOraclePlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolumeGroupOraclePlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Volume Group for SAP HANA application. */
    def getVolumeGroupSapHana(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumeGroupSapHanaArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetVolumeGroupSapHanaResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumeGroupSapHanaArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolumeGroupSapHana(args(argsBuilder).build)

    /** Use this data source to access information about an existing Application Volume Group for SAP HANA application. */
    def getVolumeGroupSapHanaPlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumeGroupSapHanaPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetVolumeGroupSapHanaResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumeGroupSapHanaPlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolumeGroupSapHanaPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing Volume Quota Rule. */
    def getVolumeQuotaRule(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumeQuotaRuleArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.netapp.outputs.GetVolumeQuotaRuleResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumeQuotaRuleArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolumeQuotaRule(args(argsBuilder).build)

    /** Use this data source to access information about an existing Volume Quota Rule. */
    def getVolumeQuotaRulePlain(args: Endofunction[com.pulumi.azure.netapp.inputs.GetVolumeQuotaRulePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.netapp.outputs.GetVolumeQuotaRuleResult] =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetVolumeQuotaRulePlainArgs.builder
      com.pulumi.azure.netapp.NetappFunctions.getVolumeQuotaRulePlain(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.AccountArgs.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below.
     * @return builder
     */
    def activeDirectory(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.Builder]):
        com.pulumi.azure.netapp.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param identity The `identity` block where it is used when customer managed keys based encryption will be enabled as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.netapp.AccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.AccountArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a NetApp Account Encryption Resource.
   * 
   *  For more information about Azure NetApp Files Customer-Managed Keys feature, please refer to [Configure customer-managed keys for Azure NetApp Files volume encryption](https://learn.microsoft.com/en-us/azure/azure-netapp-files/configure-customer-managed-keys)
   */
  def AccountEncryption(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.AccountEncryptionArgs.Builder]) =
    val argsBuilder = com.pulumi.azure.netapp.AccountEncryptionArgs.builder
    com.pulumi.azure.netapp.AccountEncryption(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Pool within a NetApp Account.
   * 
   *  ## NetApp Pool Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.azure.core.ResourceGroup;
   *  import com.pulumi.azure.core.ResourceGroupArgs;
   *  import com.pulumi.azure.netapp.Account;
   *  import com.pulumi.azure.netapp.AccountArgs;
   *  import com.pulumi.azure.netapp.Pool;
   *  import com.pulumi.azure.netapp.PoolArgs;
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
   *          var example = new ResourceGroup("example", ResourceGroupArgs.builder()
   *              .name("example-resources")
   *              .location("West Europe")
   *              .build());
   * 
   *          var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
   *              .name("example-netappaccount")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var examplePool = new Pool("examplePool", PoolArgs.builder()
   *              .name("example-netapppool")
   *              .accountName(exampleAccount.name())
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .serviceLevel("Premium")
   *              .sizeInTb(4)
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## NetApp Pool with Flexible Service Level Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.azure.core.ResourceGroup;
   *  import com.pulumi.azure.core.ResourceGroupArgs;
   *  import com.pulumi.azure.netapp.Account;
   *  import com.pulumi.azure.netapp.AccountArgs;
   *  import com.pulumi.azure.netapp.Pool;
   *  import com.pulumi.azure.netapp.PoolArgs;
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
   *          var example = new ResourceGroup("example", ResourceGroupArgs.builder()
   *              .name("example-resources")
   *              .location("West Europe")
   *              .build());
   * 
   *          var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
   *              .name("example-netappaccount")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var examplePool = new Pool("examplePool", PoolArgs.builder()
   *              .name("example-netapppool")
   *              .accountName(exampleAccount.name())
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .serviceLevel("Flexible")
   *              .sizeInTb(4)
   *              .qosType("Manual")
   *              .customThroughputMibps(256)
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## API Providers
   * 
   *  &lt;!-- This section is generated, changes will be overwritten --&gt;
   *  This resource uses the following Azure API Providers:
   * 
   *  * `Microsoft.NetApp` - 2025-12-01
   * 
   *  ## Import
   * 
   *  NetApp Pool can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:netapp/pool:Pool example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1
   *  ```
   */
  def Pool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.PoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.PoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.netapp.Pool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a NetApp Account.
   * 
   *  &gt; **Note:** Azure allows only one active directory can be joined to a single subscription at a time for NetApp Account.
   * 
   *  ## NetApp Account Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.azure.core.ResourceGroup;
   *  import com.pulumi.azure.core.ResourceGroupArgs;
   *  import com.pulumi.azure.core.CoreFunctions;
   *  import com.pulumi.azure.authorization.UserAssignedIdentity;
   *  import com.pulumi.azure.authorization.UserAssignedIdentityArgs;
   *  import com.pulumi.azure.netapp.Account;
   *  import com.pulumi.azure.netapp.AccountArgs;
   *  import com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs;
   *  import com.pulumi.azure.netapp.inputs.AccountIdentityArgs;
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
   *          var example = new ResourceGroup("example", ResourceGroupArgs.builder()
   *              .name("example-resources")
   *              .location("West Europe")
   *              .build());
   * 
   *          final var current = CoreFunctions.getClientConfig(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
   * 
   *          var exampleUserAssignedIdentity = new UserAssignedIdentity("exampleUserAssignedIdentity", UserAssignedIdentityArgs.builder()
   *              .name("anf-user-assigned-identity")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
   *              .name("netappaccount")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .activeDirectory(AccountActiveDirectoryArgs.builder()
   *                  .username("aduser")
   *                  .password("aduserpwd")
   *                  .smbServerName("SMBSERVER")
   *                  .dnsServers("1.2.3.4")
   *                  .domain("westcentralus.com")
   *                  .organizationalUnit("OU=FirstLevel")
   *                  .build())
   *              .identity(AccountIdentityArgs.builder()
   *                  .type("UserAssigned")
   *                  .identityIds(exampleUserAssignedIdentity.id())
   *                  .build())
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## API Providers
   * 
   *  &lt;!-- This section is generated, changes will be overwritten --&gt;
   *  This resource uses the following Azure API Providers:
   * 
   *  * `Microsoft.NetApp` - 2025-12-01
   * 
   *  ## Import
   * 
   *  NetApp Accounts can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:netapp/account:Account example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1
   *  ```
   * 
   *  &gt; **Note:** When importing a NetApp account, the `active_directory.password` and `active_directory.server_root_ca_certificate` values *cannot* be retrieved from the Azure API and will need to be redeclared within the resource.
   */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.AccountArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.AccountArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.netapp.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a NetApp Snapshot.
   * 
   *  ## NetApp Snapshot Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.azure.core.ResourceGroup;
   *  import com.pulumi.azure.core.ResourceGroupArgs;
   *  import com.pulumi.azure.network.VirtualNetwork;
   *  import com.pulumi.azure.network.VirtualNetworkArgs;
   *  import com.pulumi.azure.network.Subnet;
   *  import com.pulumi.azure.network.SubnetArgs;
   *  import com.pulumi.azure.network.inputs.SubnetDelegationArgs;
   *  import com.pulumi.azure.network.inputs.SubnetDelegationServiceDelegationArgs;
   *  import com.pulumi.azure.netapp.Account;
   *  import com.pulumi.azure.netapp.AccountArgs;
   *  import com.pulumi.azure.netapp.Pool;
   *  import com.pulumi.azure.netapp.PoolArgs;
   *  import com.pulumi.azure.netapp.Volume;
   *  import com.pulumi.azure.netapp.VolumeArgs;
   *  import com.pulumi.azure.netapp.Snapshot;
   *  import com.pulumi.azure.netapp.SnapshotArgs;
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
   *          var example = new ResourceGroup("example", ResourceGroupArgs.builder()
   *              .name("example-resources")
   *              .location("West Europe")
   *              .build());
   * 
   *          var exampleVirtualNetwork = new VirtualNetwork("exampleVirtualNetwork", VirtualNetworkArgs.builder()
   *              .name("example-virtualnetwork")
   *              .addressSpaces("10.0.0.0/16")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var exampleSubnet = new Subnet("exampleSubnet", SubnetArgs.builder()
   *              .name("example-subnet")
   *              .resourceGroupName(example.name())
   *              .virtualNetworkName(exampleVirtualNetwork.name())
   *              .addressPrefixes("10.0.2.0/24")
   *              .delegations(SubnetDelegationArgs.builder()
   *                  .name("netapp")
   *                  .serviceDelegation(SubnetDelegationServiceDelegationArgs.builder()
   *                      .name("Microsoft.Netapp/volumes")
   *                      .actions(
   *                          "Microsoft.Network/networkinterfaces&#47;&#42;",
   *                          "Microsoft.Network/virtualNetworks/subnets/join/action")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
   *              .name("example-netappaccount")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var examplePool = new Pool("examplePool", PoolArgs.builder()
   *              .name("example-netapppool")
   *              .accountName(exampleAccount.name())
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .serviceLevel("Premium")
   *              .sizeInTb(4)
   *              .build());
   * 
   *          var exampleVolume = new Volume("exampleVolume", VolumeArgs.builder()
   *              .name("example-netappvolume")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .accountName(exampleAccount.name())
   *              .poolName(examplePool.name())
   *              .volumePath("my-unique-file-path")
   *              .serviceLevel("Premium")
   *              .subnetId(exampleSubnet.id())
   *              .storageQuotaInGb(100)
   *              .build());
   * 
   *          var exampleSnapshot = new Snapshot("exampleSnapshot", SnapshotArgs.builder()
   *              .name("example-netappsnapshot")
   *              .accountName(exampleAccount.name())
   *              .poolName(examplePool.name())
   *              .volumeName(exampleVolume.name())
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## API Providers
   * 
   *  &lt;!-- This section is generated, changes will be overwritten --&gt;
   *  This resource uses the following Azure API Providers:
   * 
   *  * `Microsoft.NetApp` - 2025-12-01
   * 
   *  ## Import
   * 
   *  NetApp Snapshot can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:netapp/snapshot:Snapshot example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1/volumes/volume1/snapshots/snapshot1
   *  ```
   */
  def Snapshot(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.SnapshotArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.SnapshotArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.netapp.Snapshot(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a NetApp Snapshot Policy.
   * 
   *  ## NetApp Snapshot Policy Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.azure.core.ResourceGroup;
   *  import com.pulumi.azure.core.ResourceGroupArgs;
   *  import com.pulumi.azure.netapp.Account;
   *  import com.pulumi.azure.netapp.AccountArgs;
   *  import com.pulumi.azure.netapp.SnapshotPolicy;
   *  import com.pulumi.azure.netapp.SnapshotPolicyArgs;
   *  import com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs;
   *  import com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs;
   *  import com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs;
   *  import com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs;
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
   *          var example = new ResourceGroup("example", ResourceGroupArgs.builder()
   *              .name("resource-group-01")
   *              .location("East US")
   *              .build());
   * 
   *          var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
   *              .name("netappaccount-01")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var exampleSnapshotPolicy = new SnapshotPolicy("exampleSnapshotPolicy", SnapshotPolicyArgs.builder()
   *              .name("snapshotpolicy-01")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .accountName(exampleAccount.name())
   *              .enabled(true)
   *              .hourlySchedule(SnapshotPolicyHourlyScheduleArgs.builder()
   *                  .snapshotsToKeep(4)
   *                  .minute(15)
   *                  .build())
   *              .dailySchedule(SnapshotPolicyDailyScheduleArgs.builder()
   *                  .snapshotsToKeep(2)
   *                  .hour(20)
   *                  .minute(15)
   *                  .build())
   *              .weeklySchedule(SnapshotPolicyWeeklyScheduleArgs.builder()
   *                  .snapshotsToKeep(1)
   *                  .daysOfWeeks(
   *                      "Monday",
   *                      "Friday")
   *                  .hour(23)
   *                  .minute(0)
   *                  .build())
   *              .monthlySchedule(SnapshotPolicyMonthlyScheduleArgs.builder()
   *                  .snapshotsToKeep(1)
   *                  .daysOfMonths(
   *                      1,
   *                      15,
   *                      20,
   *                      30)
   *                  .hour(5)
   *                  .minute(45)
   *                  .build())
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## API Providers
   * 
   *  &lt;!-- This section is generated, changes will be overwritten --&gt;
   *  This resource uses the following Azure API Providers:
   * 
   *  * `Microsoft.NetApp` - 2025-12-01
   * 
   *  ## Import
   * 
   *  NetApp Snapshot Policy can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:netapp/snapshotPolicy:SnapshotPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/snapshotPolicies/snapshotpolicy1
   *  ```
   */
  def SnapshotPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.SnapshotPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.netapp.SnapshotPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a NetApp Backup Policy.
   * 
   *  ## NetApp Backup Policy Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.azure.core.ResourceGroup;
   *  import com.pulumi.azure.core.ResourceGroupArgs;
   *  import com.pulumi.azure.netapp.Account;
   *  import com.pulumi.azure.netapp.AccountArgs;
   *  import com.pulumi.azure.netapp.BackupPolicy;
   *  import com.pulumi.azure.netapp.BackupPolicyArgs;
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
   *          var example = new ResourceGroup("example", ResourceGroupArgs.builder()
   *              .name("example-resources")
   *              .location("West Europe")
   *              .build());
   * 
   *          var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
   *              .name("example-netappaccount")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var exampleBackupPolicy = new BackupPolicy("exampleBackupPolicy", BackupPolicyArgs.builder()
   *              .name("example-netappbackuppolicy")
   *              .resourceGroupName(example.name())
   *              .location(example.location())
   *              .accountName(exampleAccount.name())
   *              .enabled(true)
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## API Providers
   * 
   *  &lt;!-- This section is generated, changes will be overwritten --&gt;
   *  This resource uses the following Azure API Providers:
   * 
   *  * `Microsoft.NetApp` - 2025-12-01
   * 
   *  ## Import
   * 
   *  NetApp Backup Policies can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:netapp/backupPolicy:BackupPolicy example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/backupPolicies/backuppolicy1
   *  ```
   */
  def BackupPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.BackupPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.BackupPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.netapp.BackupPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder)
    /**
     * @param dailySchedule Sets a daily snapshot schedule. A `dailySchedule` block as defined below.
     * @return builder
     */
    def dailySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.builder
      builder.dailySchedule(args(argsBuilder).build)

    /**
     * @param hourlySchedule Sets an hourly snapshot schedule. A `hourlySchedule` block as defined below.
     * @return builder
     */
    def hourlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.builder
      builder.hourlySchedule(args(argsBuilder).build)

    /**
     * @param monthlySchedule Sets a monthly snapshot schedule. A `monthlySchedule` block as defined below.
     * @return builder
     */
    def monthlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.builder
      builder.monthlySchedule(args(argsBuilder).build)

    /**
     * @param weeklySchedule Sets a weekly snapshot schedule. A `weeklySchedule` block as defined below.
     * @return builder
     */
    def weeklySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.SnapshotPolicyArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Manages a Application Volume Group for SAP HANA application.
   * 
   *  &gt; **Note:** This feature is intended to be used for SAP-HANA workloads only, with several requirements, please refer to [Understand Azure NetApp Files application volume group for SAP HANA](https://learn.microsoft.com/en-us/azure/azure-netapp-files/application-volume-group-introduction) document as the starting point to understand this feature before using it with Terraform.
   */
  def VolumeGroupSapHana(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.VolumeGroupSapHanaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.VolumeGroupSapHanaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.netapp.VolumeGroupSapHana(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.netapp.VolumeGroupOracleArgs.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.VolumeGroupOracleArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  /**
   * Manages a NetApp Volume.
   * 
   *  !&gt; **Note:** This resource uses a feature to prevent deletion called `preventVolumeDestruction`, defaulting to `true`. It is intentionally set to `true` to prevent the possibility of accidental data loss. The example in this page shows all possible protection options you can apply, it is using same values as the defaults.
   * 
   *  ## Import
   * 
   *  NetApp Volumes can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:netapp/volume:Volume example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/capacityPools/pool1/volumes/volume1
   *  ```
   */
  def Volume(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.VolumeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.VolumeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.netapp.Volume(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Volume Quota Rule. */
  def VolumeQuotaRule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.VolumeQuotaRuleArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.VolumeQuotaRuleArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.netapp.VolumeQuotaRule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder)
    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new Application Volume Group to be created and data will be lost.
     * @return builder
     */
    def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` blocks as defined below.
     * @return builder
     */
    def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.netapp.inputs.GetAccountArgs.Builder)
    def identity(args: Endofunction[com.pulumi.azure.netapp.inputs.GetAccountIdentityArgs.Builder]):
        com.pulumi.azure.netapp.inputs.GetAccountArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.GetAccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder)
    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new Application Volume Group to be created and data will be lost.
     * @return builder
     */
    def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` blocks as defined below.
     * @return builder
     */
    def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.netapp.inputs.AccountState.Builder)
    /**
     * @param activeDirectory A `activeDirectory` block as defined below.
     * @return builder
     */
    def activeDirectory(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.Builder]):
        com.pulumi.azure.netapp.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountActiveDirectoryArgs.builder
      builder.activeDirectory(args(argsBuilder).build)

    /**
     * @param identity The `identity` block where it is used when customer managed keys based encryption will be enabled as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.netapp.inputs.AccountIdentityArgs.Builder]):
        com.pulumi.azure.netapp.inputs.AccountState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.AccountIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.inputs.AccountState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeState.Builder)
    /**
     * @param coolAccess A `coolAccess` block as defined below.
     * @return builder
     */
    def coolAccess(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeCoolAccessArgs.builder
      builder.coolAccess(args(argsBuilder).build)

    /**
     * @param dataProtectionAdvancedRansomware A `dataProtectionAdvancedRansomware` block as defined below.
     * @return builder
     */
    def dataProtectionAdvancedRansomware(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionAdvancedRansomwareArgs.builder
      builder.dataProtectionAdvancedRansomware(args(argsBuilder).build)

    /**
     * @param dataProtectionBackupPolicy A `dataProtectionBackupPolicy` block as defined below.
     * @return builder
     */
    def dataProtectionBackupPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionBackupPolicyArgs.builder
      builder.dataProtectionBackupPolicy(args(argsBuilder).build)

    /**
     * @param dataProtectionReplication A `dataProtectionReplication` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def dataProtectionReplication(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionReplicationArgs.builder
      builder.dataProtectionReplication(args(argsBuilder).build)

    /**
     * @param dataProtectionSnapshotPolicy A `dataProtectionSnapshotPolicy` block as defined below.
     * @return builder
     */
    def dataProtectionSnapshotPolicy(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.Builder]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.VolumeDataProtectionSnapshotPolicyArgs.builder
      builder.dataProtectionSnapshotPolicy(args(argsBuilder).build)

    /**
     * @param exportPolicyRules One or more `exportPolicyRule` block defined below.
     * @return builder
     */
    def exportPolicyRules(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeExportPolicyRuleArgs.builder
      builder.exportPolicyRules(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.inputs.VolumeState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaState.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaState.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupSapHanaVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder)
    /**
     * @param dailySchedule Sets a daily snapshot schedule. A `dailySchedule` block as defined below.
     * @return builder
     */
    def dailySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyDailyScheduleArgs.builder
      builder.dailySchedule(args(argsBuilder).build)

    /**
     * @param hourlySchedule Sets an hourly snapshot schedule. A `hourlySchedule` block as defined below.
     * @return builder
     */
    def hourlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyHourlyScheduleArgs.builder
      builder.hourlySchedule(args(argsBuilder).build)

    /**
     * @param monthlySchedule Sets a monthly snapshot schedule. A `monthlySchedule` block as defined below.
     * @return builder
     */
    def monthlySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyMonthlyScheduleArgs.builder
      builder.monthlySchedule(args(argsBuilder).build)

    /**
     * @param weeklySchedule Sets a weekly snapshot schedule. A `weeklySchedule` block as defined below.
     * @return builder
     */
    def weeklySchedule(args: Endofunction[com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.Builder]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      val argsBuilder = com.pulumi.azure.netapp.inputs.SnapshotPolicyWeeklyScheduleArgs.builder
      builder.weeklySchedule(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.netapp.inputs.SnapshotPolicyState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.netapp.inputs.VolumeGroupOracleState.Builder)
    /**
     * @param volumes One or more `volume` blocks as defined below.
     * @return builder
     */
    def volumes(args: Endofunction[com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.Builder]*):
        com.pulumi.azure.netapp.inputs.VolumeGroupOracleState.Builder =
      def argsBuilder = com.pulumi.azure.netapp.inputs.VolumeGroupOracleVolumeArgs.builder
      builder.volumes(args.map(_(argsBuilder).build)*)

  /**
   * Manages a NetApp Backup Vault.
   * 
   *  ## NetApp Backup Vault Usage
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.azure.core.ResourceGroup;
   *  import com.pulumi.azure.core.ResourceGroupArgs;
   *  import com.pulumi.azure.netapp.Account;
   *  import com.pulumi.azure.netapp.AccountArgs;
   *  import com.pulumi.azure.netapp.BackupVault;
   *  import com.pulumi.azure.netapp.BackupVaultArgs;
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
   *          var example = new ResourceGroup("example", ResourceGroupArgs.builder()
   *              .name("example-resources")
   *              .location("West Europe")
   *              .build());
   * 
   *          var exampleAccount = new Account("exampleAccount", AccountArgs.builder()
   *              .name("example-netappaccount")
   *              .location(example.location())
   *              .resourceGroupName(example.name())
   *              .build());
   * 
   *          var exampleBackupVault = new BackupVault("exampleBackupVault", BackupVaultArgs.builder()
   *              .name("example-netappbackupvault")
   *              .resourceGroupName(example.name())
   *              .location(example.location())
   *              .accountName(exampleAccount.name())
   *              .build());
   * 
   *      }
   *  }
   *  }
   *  </pre>
   * 
   *  ## API Providers
   * 
   *  &lt;!-- This section is generated, changes will be overwritten --&gt;
   *  This resource uses the following Azure API Providers:
   * 
   *  * `Microsoft.NetApp` - 2025-12-01
   * 
   *  ## Import
   * 
   *  NetApp Backup Vault can be imported using the `resource id`, e.g.
   * 
   *  ```sh
   *  $ pulumi import azure:netapp/backupVault:BackupVault example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.NetApp/netAppAccounts/account1/backupVaults/backupVault1
   *  ```
   */
  def BackupVault(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.netapp.BackupVaultArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.netapp.BackupVaultArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.netapp.BackupVault(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
