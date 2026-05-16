package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object storage:
  extension (builder: com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder)
    /**
     * @param excludeCloudStorageBuckets Defined the options for excluding cloud storage buckets for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.builder
      builder.excludeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludeCloudStorageLocations Defines the options for excluding cloud storage locations for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.builder
      builder.excludeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param identity Identity used by DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param includeCloudStorageBuckets Defines the options for including cloud storage buckets for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def includeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.builder
      builder.includeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includeCloudStorageLocations Defines the options for including cloud storage locations for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def includeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.builder
      builder.includeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param sourceFolders Defines the options for providing source folders for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def sourceFolders(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.builder
      builder.sourceFolders(args(argsBuilder).build)

    /**
     * @param sourceProjects Defines the options for providing source projects for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def sourceProjects(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.builder
      builder.sourceProjects(args(argsBuilder).build)

  /**
   * Authoritatively manages a bucket&#39;s ACLs in Google cloud storage service (GCS). For more information see
   *  [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
   *  and
   *  [API](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls).
   * 
   *  Bucket ACLs can be managed non authoritatively using the `storageBucketAccessControl` resource. Do not use these two resources in conjunction to manage the same bucket.
   * 
   *  Permissions can be granted either by ACLs or Cloud IAM policies. In general, permissions granted by Cloud IAM policies do not appear in ACLs, and permissions granted by ACLs do not appear in Cloud IAM policies. The only exception is for ACLs applied directly on a bucket and certain bucket-level Cloud IAM policies, as described in [Cloud IAM relation to ACLs](https://cloud.google.com/storage/docs/access-control/iam#acls).
   * 
   *  **NOTE** This resource will not remove the `project-owners-&lt;project_id&gt;` entity from the `OWNER` role.
   */
  def BucketACL(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketACLArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.BucketACLArgs.builder
    com.pulumi.gcp.storage.BucketACL(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.Builder)
    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  /**
   * Represents an inventory report configuration.
   * 
   *  To get more information about ReportConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/reportConfig)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/insights/using-storage-insights)
   */
  def InsightsReportConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.InsightsReportConfigArgs.builder
    com.pulumi.gcp.storage.InsightsReportConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Project Storage Intelligence Config resource represents GCS Storage Intelligence operating on individual GCP project. Storage Intelligence Config is a singleton resource and individual instance exists on each GCP project.
   * 
   *  Storage Intelligence is for Storage Admins to manage GCP storage assets at scale for performance, cost, security &amp; compliance.
   * 
   *  &gt; **Warning:** Storage Intelligence Config is a singleton resource which cannot be created or deleted. A single instance of Storage Intelligence Config exist for each GCP Project. Terraform does not create or destroy this resource.
   *  Terraform resource creation for this resource is simply an update operation on existing resource with specified properties, absence of any optional field in the create operation will result in clearance of that field. Terraform deletion won&#39;t have any effect on this resource rather it will only remove it from the state file.
   */
  def ControlProjectIntelligenceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ControlProjectIntelligenceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a new object inside an existing bucket in Google cloud storage service (GCS).
   *  [ACLs](https://cloud.google.com/storage/docs/access-control/lists) can be applied using the `gcp.storage.ObjectACL` resource.
   *   For more information see
   *  [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
   *  and
   *  [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
   * 
   *  A datasource can be used to retrieve the data of the stored object:
   * 
   *  * `gcp.storage.getBucketObjectContent`: Retrieves the content within a specified bucket object in Google Cloud Storage Service (GCS)
   */
  def BucketObject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketObjectArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.BucketObjectArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.BucketObject(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Bucket ACLs can be managed authoritatively using the
   *  `storageBucketAcl` resource. Do not use these two resources in conjunction to manage the same bucket.
   * 
   *  The BucketAccessControls resource manages the Access Control List
   *  (ACLs) for a single entity/role pairing on a bucket. ACLs let you specify who
   *  has access to your data and to what extent.
   * 
   *  There are three roles that can be assigned to an entity:
   * 
   *  READERs can get the bucket, though no acl property will be returned, and
   *  list the bucket&#39;s objects.  WRITERs are READERs, and they can insert
   *  objects into the bucket and delete the bucket&#39;s objects.  OWNERs are
   *  WRITERs, and they can get the acl property of a bucket, update a bucket,
   *  and call all BucketAccessControls methods on the bucket.  For more
   *  information, see Access Control, with the caveat that this API uses
   *  READER, WRITER, and OWNER instead of READ, WRITE, and FULL_CONTROL.
   * 
   *  To get more information about BucketAccessControl, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/access-control/lists)
   */
  def BucketAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketAccessControlArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.BucketAccessControlArgs.builder
    com.pulumi.gcp.storage.BucketAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Organization Storage Intelligence Config resource represents GCS Storage Intelligence operating on individual GCP organization. Storage Intelligence Config is a singleton resource and individual instance exists on each GCP organization.
   * 
   *  Storage Intelligence is for Storage Admins to manage GCP storage assets at scale for performance, cost, security &amp; compliance.
   * 
   *  &gt; **Warning:** Storage Intelligence is a singleton resource which cannot be created or deleted. A single instance of Storage Intelligence exist for each GCP Organization. Terraform does not create or destroy this resource.
   *  Terraform resource creation for this resource is simply an update operation on existing resource with specified properties, absence of any optional field in the create operation will result in clearance of that field. Terraform deletion won&#39;t have any effect on this resource rather it will only remove it from the state file.
   */
  def ControlOrganizationIntelligenceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.BucketIAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.BucketIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   *  * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   *  * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.ManagedFolderIamPolicy
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.ManagedFolderIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   *  ## gcp.storage.ManagedFolderIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud Storage ManagedFolder
   *  Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   *  * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   *  * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.ManagedFolderIamPolicy
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.ManagedFolderIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   *  ## gcp.storage.ManagedFolderIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   *  * b/{{bucket}}/managedFolders/{{managed_folder}}
   *  * {{bucket}}/{{managed_folder}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Storage managedfolder IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_storage_managed_folder_iam_member.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_storage_managed_folder_iam_binding.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:storage/managedFolderIamMember:ManagedFolderIamMember editor b/{{bucket}}/managedFolders/{{managed_folder}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ManagedFolderIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.builder
    com.pulumi.gcp.storage.ManagedFolderIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   *  * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   *  * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.ManagedFolderIamPolicy
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.ManagedFolderIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   *  ## gcp.storage.ManagedFolderIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud Storage ManagedFolder
   *  Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   *  * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   *  * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.ManagedFolderIamPolicy
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.ManagedFolderIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   *  ## gcp.storage.ManagedFolderIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   *  * b/{{bucket}}/managedFolders/{{managed_folder}}
   *  * {{bucket}}/{{managed_folder}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Storage managedfolder IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_storage_managed_folder_iam_member.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_storage_managed_folder_iam_binding.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:storage/managedFolderIamBinding:ManagedFolderIamBinding editor b/{{bucket}}/managedFolders/{{managed_folder}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ManagedFolderIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.builder
    com.pulumi.gcp.storage.ManagedFolderIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.Builder)
    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  /**
   * Storage Batch Operations (SBO) is a Cloud Storage management feature that offers a
   *  seamless experience to perform single batch operations on millions of GCS objects in a
   *  serverless manner.
   */
  def BatchOperationsJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.BatchOperationsJobArgs.builder
    com.pulumi.gcp.storage.BatchOperationsJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates a new notification configuration on a specified bucket, establishing a flow of event notifications from GCS to a Cloud Pub/Sub topic.
   *   For more information see
   *  [the official documentation](https://cloud.google.com/storage/docs/pubsub-notifications)
   *  and
   *  [API](https://cloud.google.com/storage/docs/json_api/v1/notifications).
   * 
   *  In order to enable notifications, a special Google Cloud Storage service account unique to the project
   *  must exist and have the IAM permission &#34;projects.topics.publish&#34; for a Cloud Pub/Sub topic in the project.
   *  This service account is not created automatically when a project is created.
   *  To ensure the service account exists and obtain its email address for use in granting the correct IAM permission, use the
   *  [`gcp.storage.getProjectServiceAccount`](https://www.terraform.io/docs/providers/google/d/storage_project_service_account.html)
   *  datasource&#39;s `emailAddress` value, and see below for an example of enabling notifications by granting the correct IAM permission.
   *  See [the notifications documentation](https://cloud.google.com/storage/docs/gsutil/commands/notification) for more details.
   * 
   *  &gt; **NOTE**: This resource can affect your storage IAM policy. If you are using this in the same config as your storage IAM policy resources, consider
   *  making this resource dependent on those IAM resources via `dependsOn`. This will safeguard against errors due to IAM race conditions.
   */
  def Notification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.NotificationArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.NotificationArgs.builder
    com.pulumi.gcp.storage.Notification(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.BucketIAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.BucketIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   *  * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   *  * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.BucketIAMPolicy
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.BucketIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMBindingConditionArgs.builder()
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
   *  ## gcp.storage.BucketIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud Storage Bucket
   *  Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   *  * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   *  * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.BucketIAMPolicy
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.BucketIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMBindingConditionArgs.builder()
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
   *  ## gcp.storage.BucketIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMMemberConditionArgs.builder()
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
   *  * b/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Storage bucket IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_storage_bucket_iam_member.editor &#34;b/{{bucket}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_storage_bucket_iam_binding.editor &#34;b/{{bucket}} roles/storage.objectViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:storage/bucketIAMBinding:BucketIAMBinding editor b/{{bucket}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BucketIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketIAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.BucketIAMBindingArgs.builder
    com.pulumi.gcp.storage.BucketIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object StorageFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Gets an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#buckets)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
     */
    inline def getBucket(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucket(args(argsBuilder).build)

    /**
     * Gets an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#buckets)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
     */
    inline def getBucketPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for bucket */
    inline def getBucketIamPolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketIamPolicyArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for bucket */
    inline def getBucketIamPolicyPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketIamPolicyPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketIamPolicyPlain(args(argsBuilder).build)

    /**
     * Gets an existing object inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     */
    inline def getBucketObject(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObject(args(argsBuilder).build)

    /**
     * Gets an existing object inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     */
    inline def getBucketObjectPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectPlain(args(argsBuilder).build)

    /**
     * Gets an existing object content inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     *  &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     */
    inline def getBucketObjectContent(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectContentResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContent(args(argsBuilder).build)

    /**
     * Gets an existing object content inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     *  &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     */
    inline def getBucketObjectContentPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectContentResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContentPlain(args(argsBuilder).build)

    /**
     * Gets existing object contents inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     *  &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     * 
     *  &gt; **Warning:** This data source loads all object contents into memory. Limit the results with `matchGlob` or `prefix`.
     */
    inline def getBucketObjectContents(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectContentsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContents(args(argsBuilder).build)

    /**
     * Gets existing object contents inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     *  &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     * 
     *  &gt; **Warning:** This data source loads all object contents into memory. Limit the results with `matchGlob` or `prefix`.
     */
    inline def getBucketObjectContentsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectContentsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContentsPlain(args(argsBuilder).build)

    /**
     * Gets existing objects inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and [API](https://cloud.google.com/storage/docs/json_api/v1/objects/list).
     */
    inline def getBucketObjects(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjects(args(argsBuilder).build)

    /**
     * Gets existing objects inside an existing bucket in Google Cloud Storage service (GCS).
     *  See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     *  and [API](https://cloud.google.com/storage/docs/json_api/v1/objects/list).
     */
    inline def getBucketObjectsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectsPlain(args(argsBuilder).build)

    /**
     * Gets a list of existing GCS buckets.
     *  See [the official documentation](https://cloud.google.com/storage/docs/introduction)
     *  and [API](https://cloud.google.com/storage/docs/json_api/v1/buckets/list).
     */
    inline def getBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBuckets(args(argsBuilder).build)

    /**
     * Gets a list of existing GCS buckets.
     *  See [the official documentation](https://cloud.google.com/storage/docs/introduction)
     *  and [API](https://cloud.google.com/storage/docs/json_api/v1/buckets/list).
     */
    inline def getBucketsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketsPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Folder Storage Intelligence config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/storage-intelligence/overview#resource)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/intelligenceConfig).
     */
    inline def getControlFolderIntelligenceConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlFolderIntelligenceConfig(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Folder Storage Intelligence config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/storage-intelligence/overview#resource)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/intelligenceConfig).
     */
    inline def getControlFolderIntelligenceConfigPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlFolderIntelligenceConfigPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Organization Storage Intelligence config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/storage-intelligence/overview#resource)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/intelligenceConfig).
     */
    inline def getControlOrganizationIntelligenceConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlOrganizationIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlOrganizationIntelligenceConfig(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Organization Storage Intelligence config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/storage-intelligence/overview#resource)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/intelligenceConfig).
     */
    inline def getControlOrganizationIntelligenceConfigPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlOrganizationIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlOrganizationIntelligenceConfigPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Project Storage Intelligence config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/storage-intelligence/overview#resource)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/intelligenceConfig).
     */
    inline def getControlProjectIntelligenceConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceConfig(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Project Storage Intelligence config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/storage-intelligence/overview#resource)
     *  and
     *  [API](https://cloud.google.com/storage/docs/json_api/v1/intelligenceConfig).
     */
    inline def getControlProjectIntelligenceConfigPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceConfigPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Storage Insights Dataset Config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/insights/datasets)
     *  and
     *  [API](https://cloud.google.com/storage/docs/insights/reference/rest/v1/projects.locations.datasetConfigs).
     */
    inline def getInsightsDatasetConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetInsightsDatasetConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetInsightsDatasetConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetInsightsDatasetConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getInsightsDatasetConfig(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Storage Insights Dataset Config resource.
     *  See [the official documentation](https://cloud.google.com/storage/docs/insights/datasets)
     *  and
     *  [API](https://cloud.google.com/storage/docs/insights/reference/rest/v1/projects.locations.datasetConfigs).
     */
    inline def getInsightsDatasetConfigPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetInsightsDatasetConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetInsightsDatasetConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetInsightsDatasetConfigPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getInsightsDatasetConfigPlain(args(argsBuilder).build)

    inline def getManagedFolderIamPolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.GetManagedFolderIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetManagedFolderIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetManagedFolderIamPolicyArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getManagedFolderIamPolicy(args(argsBuilder).build)

    inline def getManagedFolderIamPolicyPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetManagedFolderIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetManagedFolderIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetManagedFolderIamPolicyPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getManagedFolderIamPolicyPlain(args(argsBuilder).build)

    /**
     * The Google Cloud storage signed URL data source generates a signed URL for a given storage object. Signed URLs provide a way to give time-limited read or write access to anyone in possession of the URL, regardless of whether they have a Google account.
     * 
     *  For more info about signed URL&#39;s is available [here](https://cloud.google.com/storage/docs/access-control/signed-urls).
     */
    inline def getObjectSignedUrl(args: Endofunction[com.pulumi.gcp.storage.inputs.GetObjectSignedUrlArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetObjectSignedUrlResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetObjectSignedUrlArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getObjectSignedUrl(args(argsBuilder).build)

    /**
     * The Google Cloud storage signed URL data source generates a signed URL for a given storage object. Signed URLs provide a way to give time-limited read or write access to anyone in possession of the URL, regardless of whether they have a Google account.
     * 
     *  For more info about signed URL&#39;s is available [here](https://cloud.google.com/storage/docs/access-control/signed-urls).
     */
    inline def getObjectSignedUrlPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetObjectSignedUrlPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetObjectSignedUrlResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetObjectSignedUrlPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getObjectSignedUrlPlain(args(argsBuilder).build)

    /**
     * Get the email address of a project&#39;s unique [automatic Google Cloud Storage service account](https://cloud.google.com/storage/docs/projects#service-accounts).
     * 
     *  For each Google Cloud project, Google maintains a unique service account which
     *  is used as the identity for various Google Cloud Storage operations, including
     *  operations involving
     *  [customer-managed encryption keys](https://cloud.google.com/storage/docs/encryption/customer-managed-keys)
     *  and those involving
     *  [storage notifications to pub/sub](https://cloud.google.com/storage/docs/gsutil/commands/notification).
     *  This automatic Google service account requires access to the relevant Cloud KMS keys or pub/sub topics, respectively, in order for Cloud Storage to use
     *  these customer-managed resources.
     * 
     *  The service account has a well-known, documented naming format which is parameterised on the numeric Google project ID.
     *  However, as noted in [the docs](https://cloud.google.com/storage/docs/projects#service-accounts), it is only created when certain relevant actions occur which
     *  presuppose its existence.
     *  These actions include calling a [Cloud Storage API endpoint](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount/get) to yield the
     *  service account&#39;s identity, or performing some operations in the UI which must use the service account&#39;s identity, such as attempting to list Cloud KMS keys
     *  on the bucket creation page.
     * 
     *  Use of this data source calls the relevant API endpoint to obtain the service account&#39;s identity and thus ensures it exists prior to any API operations
     *  which demand its existence, such as specifying it in Cloud IAM policy.
     *  Always prefer to use this data source over interpolating the project ID into the well-known format for this service account, as the latter approach may cause
     *  Pulumi update errors in cases where the service account does not yet exist.
     * 
     *  &gt;  When you write Pulumi code which uses features depending on this service account *and* your Pulumi code adds the service account in IAM policy on other resources,
     *     you must take care for race conditions between the establishment of the IAM policy and creation of the relevant Cloud Storage resource.
     *     Cloud Storage APIs will require permissions on resources such as pub/sub topics or Cloud KMS keys to exist *before* the attempt to utilise them in a
     *     bucket configuration, otherwise the API calls will fail.
     *     You may need to use `dependsOn` to create an explicit dependency between the IAM policy resource and the Cloud Storage resource which depends on it.
     *     See the examples here and in the `gcp.storage.Notification` resource.
     * 
     *  For more information see
     *  [the API reference](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount).
     */
    inline def getProjectServiceAccount(args: Endofunction[com.pulumi.gcp.storage.inputs.GetProjectServiceAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetProjectServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetProjectServiceAccountArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getProjectServiceAccount(args(argsBuilder).build)

    /**
     * Get the email address of a project&#39;s unique [automatic Google Cloud Storage service account](https://cloud.google.com/storage/docs/projects#service-accounts).
     * 
     *  For each Google Cloud project, Google maintains a unique service account which
     *  is used as the identity for various Google Cloud Storage operations, including
     *  operations involving
     *  [customer-managed encryption keys](https://cloud.google.com/storage/docs/encryption/customer-managed-keys)
     *  and those involving
     *  [storage notifications to pub/sub](https://cloud.google.com/storage/docs/gsutil/commands/notification).
     *  This automatic Google service account requires access to the relevant Cloud KMS keys or pub/sub topics, respectively, in order for Cloud Storage to use
     *  these customer-managed resources.
     * 
     *  The service account has a well-known, documented naming format which is parameterised on the numeric Google project ID.
     *  However, as noted in [the docs](https://cloud.google.com/storage/docs/projects#service-accounts), it is only created when certain relevant actions occur which
     *  presuppose its existence.
     *  These actions include calling a [Cloud Storage API endpoint](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount/get) to yield the
     *  service account&#39;s identity, or performing some operations in the UI which must use the service account&#39;s identity, such as attempting to list Cloud KMS keys
     *  on the bucket creation page.
     * 
     *  Use of this data source calls the relevant API endpoint to obtain the service account&#39;s identity and thus ensures it exists prior to any API operations
     *  which demand its existence, such as specifying it in Cloud IAM policy.
     *  Always prefer to use this data source over interpolating the project ID into the well-known format for this service account, as the latter approach may cause
     *  Pulumi update errors in cases where the service account does not yet exist.
     * 
     *  &gt;  When you write Pulumi code which uses features depending on this service account *and* your Pulumi code adds the service account in IAM policy on other resources,
     *     you must take care for race conditions between the establishment of the IAM policy and creation of the relevant Cloud Storage resource.
     *     Cloud Storage APIs will require permissions on resources such as pub/sub topics or Cloud KMS keys to exist *before* the attempt to utilise them in a
     *     bucket configuration, otherwise the API calls will fail.
     *     You may need to use `dependsOn` to create an explicit dependency between the IAM policy resource and the Cloud Storage resource which depends on it.
     *     See the examples here and in the `gcp.storage.Notification` resource.
     * 
     *  For more information see
     *  [the API reference](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount).
     */
    inline def getProjectServiceAccountPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetProjectServiceAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetProjectServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetProjectServiceAccountPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getProjectServiceAccountPlain(args(argsBuilder).build)

    /** Use this data source to retrieve Storage Transfer service account for this project */
    inline def getTransferProjectServiceAccount(args: Endofunction[com.pulumi.gcp.storage.inputs.GetTransferProjectServiceAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetTransferProjectServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetTransferProjectServiceAccountArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getTransferProjectServiceAccount(args(argsBuilder).build)

    /** Use this data source to retrieve Storage Transfer service account for this project */
    inline def getTransferProjectServiceAccountPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetTransferProjectServiceAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetTransferProjectServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetTransferProjectServiceAccountPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getTransferProjectServiceAccountPlain(args(argsBuilder).build)

    /** Use this data source to retrieve Storage Transfer service account for this project */
    @deprecated inline def getTransferProjectServieAccount(args: Endofunction[com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetTransferProjectServieAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getTransferProjectServieAccount(args(argsBuilder).build)

    /** Use this data source to retrieve Storage Transfer service account for this project */
    @deprecated inline def getTransferProjectServieAccountPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetTransferProjectServieAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getTransferProjectServieAccountPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   *  * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   *  * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.ManagedFolderIamPolicy
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.ManagedFolderIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   *  ## gcp.storage.ManagedFolderIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   *  ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   *  ---
   * 
   *  # IAM policy for Cloud Storage ManagedFolder
   *  Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   *  * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   *  * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.ManagedFolderIamPolicy
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   *  import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.ManagedFolderIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   *  import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
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
   *          var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   *  ## gcp.storage.ManagedFolderIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.ManagedFolderIamMember;
   *  import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
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
   *          var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *              .bucket(folder.bucket())
   *              .managedFolder(folder.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   *  * b/{{bucket}}/managedFolders/{{managed_folder}}
   *  * {{bucket}}/{{managed_folder}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Storage managedfolder IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_storage_managed_folder_iam_member.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_storage_managed_folder_iam_binding.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:storage/managedFolderIamPolicy:ManagedFolderIamPolicy editor b/{{bucket}}/managedFolders/{{managed_folder}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ManagedFolderIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs.builder
    com.pulumi.gcp.storage.ManagedFolderIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.BucketArgs.Builder)
    /**
     * @param autoclass The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * @return builder
     */
    def autoclass(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.builder
      builder.autoclass(args(argsBuilder).build)

    /**
     * @param cors The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCorArgs.Builder]*):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketCorArgs.builder
      builder.cors(args.map(_(argsBuilder).build)*)

    /**
     * @param customPlacementConfig The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * @return builder
     */
    def customPlacementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.builder
      builder.customPlacementConfig(args(argsBuilder).build)

    /**
     * @param encryption The bucket&#39;s encryption configuration. Structure is documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param hierarchicalNamespace The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniformBucketLevelAccess` must be enabled on bucket.
     * @return builder
     */
    def hierarchicalNamespace(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.builder
      builder.hierarchicalNamespace(args(argsBuilder).build)

    /**
     * @param ipFilter The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * @return builder
     */
    def ipFilter(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.builder
      builder.ipFilter(args(argsBuilder).build)

    /**
     * @param lifecycleRules The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def lifecycleRules(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param retentionPolicy Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param softDeletePolicy The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot be permanently deleted. If the block is not provided, Server side value will be kept which means removal of block won&#39;t generate any terraform change. Structure is documented below.
     * @return builder
     */
    def softDeletePolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.builder
      builder.softDeletePolicy(args(argsBuilder).build)

    /**
     * @param versioning The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * @return builder
     */
    def versioning(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration if the bucket acts as a website. Structure is documented below.
     * @return builder
     */
    def website(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.gcp.storage.BucketArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  /**
   * The Folder Storage Intelligence resource represents GCS Storage Intelligence operating on individual GCP Folder. Storage Intelligence is a singleton resource and individual instance exists on each GCP Folder.
   * 
   *  Storage Intelligence is for Storage Admins to manage GCP storage assets at scale for performance, cost, security &amp; compliance.
   * 
   *  &gt; **Warning:** Storage Intelligence Config is a singleton resource which cannot be created or deleted. A single instance of Storage Intelligence Config exist for each GCP Folder. Terraform does not create or destroy this resource.
   *  Terraform resource creation for this resource is simply an update operation on existing resource with specified properties, absense of any optional field in the create operation will result in clearance of that field. Terraform deletion won&#39;t have any effect on this resource rather it will only remove it from the state file.
   */
  def ControlFolderIntelligenceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ControlFolderIntelligenceConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * The hmacKeys resource represents an HMAC key within Cloud Storage. The resource
   *  consists of a secret and HMAC key metadata. HMAC keys can be used as credentials
   *  for service accounts.
   * 
   *  To get more information about HmacKey, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/projects/hmacKeys)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/authentication/managing-hmackeys)
   * 
   *  On import, the `secret` value will not be retrieved.
   */
  def HmacKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.HmacKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.HmacKeyArgs.builder
    com.pulumi.gcp.storage.HmacKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The ObjectAccessControls resources represent the Access Control Lists
   *  (ACLs) for objects within Google Cloud Storage. ACLs let you specify
   *  who has access to your data and to what extent.
   * 
   *  There are two roles that can be assigned to an entity:
   * 
   *  READERs can get an object, though the acl property will not be revealed.
   *  OWNERs are READERs, and they can get the acl property, update an object,
   *  and call all objectAccessControls methods on the object. The owner of an
   *  object is always an OWNER.
   *  For more information, see Access Control, with the caveat that this API
   *  uses READER and OWNER instead of READ and FULL_CONTROL.
   * 
   *  To get more information about ObjectAccessControl, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)
   */
  def ObjectAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ObjectAccessControlArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.ObjectAccessControlArgs.builder
    com.pulumi.gcp.storage.ObjectAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents a Storage Insights DatasetConfig.
   * 
   *  To get more information about DatasetConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/insights/reference/rest/v1/projects.locations.datasetConfigs)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/insights/datasets)
   */
  def InsightsDatasetConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.InsightsDatasetConfigArgs.builder
    com.pulumi.gcp.storage.InsightsDatasetConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Represents an On-Premises Agent pool.
   * 
   *  To get more information about AgentPool, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/projects.agentPools)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage-transfer/docs/on-prem-agent-pools)
   */
  def TransferAgentPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.TransferAgentPoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.TransferAgentPoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.TransferAgentPool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.BucketObjectArgs.Builder)
    /**
     * @param contexts Contexts attached to an object, in key-value pairs. For more information about object contexts, see [Object contexts overview](https://cloud.google.com/storage/docs/object-contexts). Structure is documented below.
     * @return builder
     */
    def contexts(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder]):
        com.pulumi.gcp.storage.BucketObjectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.builder
      builder.contexts(args(argsBuilder).build)

    /**
     * @param customerEncryption Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     *  Structure is documented below.
     * @return builder
     */
    def customerEncryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.BucketObjectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.builder
      builder.customerEncryption(args(argsBuilder).build)

    /**
     * @param retention The [object retention](http://cloud.google.com/storage/docs/object-lock) settings for the object. The retention settings allow an object to be retained until a provided date. Structure is documented below.
     * @return builder
     */
    def retention(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.Builder]):
        com.pulumi.gcp.storage.BucketObjectArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.builder
      builder.retention(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.Builder)
    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder)
    /**
     * @param csvOptions Options for configuring the format of the inventory report CSV file.
     *  Structure is documented below.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param frequencyOptions Options for configuring how inventory reports are generated.
     *  Structure is documented below.
     * @return builder
     */
    def frequencyOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.builder
      builder.frequencyOptions(args(argsBuilder).build)

    /**
     * @param objectMetadataReportOptions Options for including metadata in an inventory report.
     *  Structure is documented below.
     * @return builder
     */
    def objectMetadataReportOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.builder
      builder.objectMetadataReportOptions(args(argsBuilder).build)

    /**
     * @param parquetOptions An option for outputting inventory reports as parquet files.
     * @return builder
     */
    def parquetOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.Builder]):
        com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.builder
      builder.parquetOptions(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   *  * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   *  * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.BucketIAMPolicy
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.BucketIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMBindingConditionArgs.builder()
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
   *  ## gcp.storage.BucketIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud Storage Bucket
   *  Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   *  * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   *  * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.BucketIAMPolicy
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.BucketIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMBindingConditionArgs.builder()
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
   *  ## gcp.storage.BucketIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMMemberConditionArgs.builder()
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
   *  * b/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Storage bucket IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_storage_bucket_iam_member.editor &#34;b/{{bucket}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_storage_bucket_iam_binding.editor &#34;b/{{bucket}} roles/storage.objectViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:storage/bucketIAMPolicy:BucketIAMPolicy editor b/{{bucket}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BucketIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketIAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.BucketIAMPolicyArgs.builder
    com.pulumi.gcp.storage.BucketIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.TransferJobArgs.Builder)
    /**
     * @param eventStream Specifies the Event-driven transfer options. Event-driven transfers listen to an event stream to transfer updated files. Structure documented below Either `eventStream` or `schedule` must be set.
     * @return builder
     */
    def eventStream(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.builder
      builder.eventStream(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration. Structure documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Notification configuration. This is not supported for transfers involving PosixFilesystem. Structure documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param replicationSpec Replication specification. Structure documented below. User should not configure `schedule`, `eventStream` with this argument. One of `transferSpec`, or `replicationSpec` must be specified.
     * 
     *  ***
     * @return builder
     */
    def replicationSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.builder
      builder.replicationSpec(args(argsBuilder).build)

    /**
     * @param schedule Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below. Either `schedule` or `eventStream` must be set.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param transferSpec Transfer specification. Structure documented below. One of `transferSpec`, or `replicationSpec` can be specified.
     * @return builder
     */
    def transferSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder]):
        com.pulumi.gcp.storage.TransferJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.builder
      builder.transferSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.TransferAgentPoolArgs.Builder)
    /**
     * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     *  Structure is documented below.
     * @return builder
     */
    def bandwidthLimit(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.Builder]):
        com.pulumi.gcp.storage.TransferAgentPoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.builder
      builder.bandwidthLimit(args(argsBuilder).build)

  /**
   * Creates a new Transfer Job in Google Cloud Storage Transfer.
   * 
   *  To get more information about Google Cloud Storage Transfer, see:
   * 
   *  * [Overview](https://cloud.google.com/storage-transfer/docs/overview)
   *  * [API documentation](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/transferJobs)
   *  * How-to Guides
   *      * [Configuring Access to Data Sources and Sinks](https://cloud.google.com/storage-transfer/docs/configure-access)
   */
  def TransferJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.TransferJobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.TransferJobArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.TransferJob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Authoritatively manages the access control list (ACL) for an object in a Google
   *  Cloud Storage (GCS) bucket. Removing a `gcp.storage.ObjectACL` sets the
   *  acl to the `private` [predefined ACL](https://cloud.google.com/storage/docs/access-control#predefined-acl).
   * 
   *  For more information see
   *  [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
   *  and
   *  [API](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls).
   * 
   *  &gt; Want fine-grained control over object ACLs? Use `gcp.storage.ObjectAccessControl` to control individual
   *  role entity pairs.
   */
  def ObjectACL(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ObjectACLArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.ObjectACLArgs.builder
    com.pulumi.gcp.storage.ObjectACL(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Storage Managed Folder.
   * 
   *  You can apply Identity and Access Management (IAM) policies to
   *  managed folders to grant principals access only to the objects
   *  within the managed folder, which lets you more finely control access
   *  for specific data sets and tables within a bucket. You can nest
   *  managed folders up to 15 levels deep, including the parent managed
   *  folder.
   * 
   *  Managed folders can only be created in buckets that have uniform
   *  bucket-level access enabled.
   * 
   *  To get more information about ManagedFolder, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/managedFolder)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/managed-folders)
   */
  def ManagedFolder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ManagedFolderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ManagedFolder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Google Cloud Storage Folder.
   * 
   *  The Folder resource represents a folder in a Cloud Storage bucket with hierarchical namespace enabled
   * 
   *  To get more information about Folder, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/folders)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/folders-overview)
   */
  def Folder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.FolderArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.FolderArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.Folder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The DefaultObjectAccessControls resources represent the Access Control
   *  Lists (ACLs) applied to a new object within a Google Cloud Storage bucket
   *  when no ACL was provided for that object. ACLs let you specify who has
   *  access to your bucket contents and to what extent.
   * 
   *  There are two roles that can be assigned to an entity:
   * 
   *  READERs can get an object, though the acl property will not be revealed.
   *  OWNERs are READERs, and they can get the acl property, update an object,
   *  and call all objectAccessControls methods on the object. The owner of an
   *  object is always an OWNER.
   *  For more information, see Access Control, with the caveat that this API
   *  uses READER and OWNER instead of READ and FULL_CONTROL.
   * 
   *  To get more information about DefaultObjectAccessControl, see:
   * 
   *  * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)
   */
  def DefaultObjectAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.DefaultObjectAccessControlArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.DefaultObjectAccessControlArgs.builder
    com.pulumi.gcp.storage.DefaultObjectAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder)
    /**
     * @param bucketList List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
     *  Structure is documented below.
     * @return builder
     */
    def bucketList(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.builder
      builder.bucketList(args(argsBuilder).build)

    /**
     * @param deleteObject allows batch operations to delete objects in bucket
     *  Structure is documented below.
     * @return builder
     */
    def deleteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.builder
      builder.deleteObject(args(argsBuilder).build)

    /**
     * @param putMetadata allows batch operations to update metadata for objects in bucket
     *  Structure is documented below.
     * @return builder
     */
    def putMetadata(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.builder
      builder.putMetadata(args(argsBuilder).build)

    /**
     * @param putObjectHold allows to update temporary hold or eventBased hold for objects in bucket.
     *  Structure is documented below.
     * @return builder
     */
    def putObjectHold(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.builder
      builder.putObjectHold(args(argsBuilder).build)

    /**
     * @param rewriteObject allows to update encryption key for objects in bucket.
     *  Structure is documented below.
     * @return builder
     */
    def rewriteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.Builder]):
        com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.builder
      builder.rewriteObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder)
    /**
     * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.builder
      builder.excludedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.builder
      builder.excludedCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def includedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.builder
      builder.includedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def includedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.builder
      builder.includedCloudStorageLocations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobState.Builder)
    /**
     * @param eventStream Specifies the Event-driven transfer options. Event-driven transfers listen to an event stream to transfer updated files. Structure documented below Either `eventStream` or `schedule` must be set.
     * @return builder
     */
    def eventStream(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobEventStreamArgs.builder
      builder.eventStream(args(argsBuilder).build)

    /**
     * @param loggingConfig Logging configuration. Structure documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)

    /**
     * @param notificationConfig Notification configuration. This is not supported for transfers involving PosixFilesystem. Structure documented below.
     * @return builder
     */
    def notificationConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobNotificationConfigArgs.builder
      builder.notificationConfig(args(argsBuilder).build)

    /**
     * @param replicationSpec Replication specification. Structure documented below. User should not configure `schedule`, `eventStream` with this argument. One of `transferSpec`, or `replicationSpec` must be specified.
     * 
     *  ***
     * @return builder
     */
    def replicationSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.builder
      builder.replicationSpec(args(argsBuilder).build)

    /**
     * @param schedule Schedule specification defining when the Transfer Job should be scheduled to start, end and what time to run. Structure documented below. Either `schedule` or `eventStream` must be set.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param transferSpec Transfer specification. Structure documented below. One of `transferSpec`, or `replicationSpec` can be specified.
     * @return builder
     */
    def transferSpec(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.builder
      builder.transferSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder)
    /**
     * @param cloudStorageBuckets The list of cloud storage buckets/bucket prefix regexes to exclude in the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsCloudStorageBucketArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsCloudStorageBucketArgs.builder
      builder.cloudStorageBuckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder)
    /**
     * @param action The Lifecycle Rule&#39;s action configuration. A single block of this type is supported. Structure is documented below.
     * @return builder
     */
    def action(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionArgs.builder
      builder.action(args(argsBuilder).build)

    /**
     * @param condition The Lifecycle Rule&#39;s condition configuration. A single block of this type is supported. Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder)
    /**
     * @param buckets List of buckets and their objects to be transformed.
     *  Structure is documented below.
     * @return builder
     */
    def buckets(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.builder
      builder.buckets(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder)
    /**
     * @param awsS3CompatibleDataSource An AWS S3 Compatible data source. Structure documented below.
     * @return builder
     */
    def awsS3CompatibleDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.builder
      builder.awsS3CompatibleDataSource(args(argsBuilder).build)

    /**
     * @param awsS3DataSource An AWS S3 data source. Structure documented below.
     * @return builder
     */
    def awsS3DataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.builder
      builder.awsS3DataSource(args(argsBuilder).build)

    /**
     * @param azureBlobStorageDataSource An Azure Blob Storage data source. Structure documented below.
     * @return builder
     */
    def azureBlobStorageDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.builder
      builder.azureBlobStorageDataSource(args(argsBuilder).build)

    /**
     * @param gcsDataSink A Google Cloud Storage data sink. Structure documented below.
     * @return builder
     */
    def gcsDataSink(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSinkArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSinkArgs.builder
      builder.gcsDataSink(args(argsBuilder).build)

    /**
     * @param gcsDataSource A Google Cloud Storage data source. Structure documented below.
     * @return builder
     */
    def gcsDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSourceArgs.builder
      builder.gcsDataSource(args(argsBuilder).build)

    /**
     * @param hdfsDataSource An HDFS data source. Structure documented below.
     * @return builder
     */
    def hdfsDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHdfsDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHdfsDataSourceArgs.builder
      builder.hdfsDataSource(args(argsBuilder).build)

    /**
     * @param httpDataSource A HTTP URL data source. Structure documented below.
     * @return builder
     */
    def httpDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHttpDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecHttpDataSourceArgs.builder
      builder.httpDataSource(args(argsBuilder).build)

    /**
     * @param objectConditions Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects&#39; `lastModificationTime` do not exclude objects in a data sink. Structure documented below.
     * @return builder
     */
    def objectConditions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecObjectConditionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecObjectConditionsArgs.builder
      builder.objectConditions(args(argsBuilder).build)

    /**
     * @param posixDataSink A POSIX data sink. Structure documented below.
     * @return builder
     */
    def posixDataSink(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSinkArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSinkArgs.builder
      builder.posixDataSink(args(argsBuilder).build)

    /**
     * @param posixDataSource A POSIX filesystem data source. Structure documented below.
     * @return builder
     */
    def posixDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecPosixDataSourceArgs.builder
      builder.posixDataSource(args(argsBuilder).build)

    /**
     * @param transferManifest Use a manifest file to limit which object are transferred. See [Storage Transfer Service manifest file format](https://cloud.google.com/storage-transfer/docs/manifest). Structure documented below.
     * @return builder
     */
    def transferManifest(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferManifestArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferManifestArgs.builder
      builder.transferManifest(args(argsBuilder).build)

    /**
     * @param transferOptions Characteristics of how to treat files from datasource and sink during job. If the option `deleteObjectsUniqueInSink` is true, object conditions based on objects&#39; `lastModificationTime` are ignored and do not exclude objects in a data source or a data sink. Structure documented below.
     * @return builder
     */
    def transferOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.builder
      builder.transferOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder)
    /**
     * @param effectiveIntelligenceConfigs The Intelligence config that is effective for the resource.
     *  Structure is documented below.
     * @return builder
     */
    def effectiveIntelligenceConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigEffectiveIntelligenceConfigArgs.builder
      builder.effectiveIntelligenceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param trialConfigs The trial configuration of the Storage Intelligence resource.
     *  Structure is documented below.
     * @return builder
     */
    def trialConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigTrialConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigTrialConfigArgs.builder
      builder.trialConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder)
    /**
     * @param scheduleEndDate The last day the recurring transfer will be run. If `scheduleEndDate` is the same as `scheduleStartDate`, the transfer will be executed only once. Structure documented below.
     * @return builder
     */
    def scheduleEndDate(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleEndDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleEndDateArgs.builder
      builder.scheduleEndDate(args(argsBuilder).build)

    /**
     * @param scheduleStartDate The first day the recurring transfer is scheduled to run. If `scheduleStartDate` is in the past, the transfer will run for the first time on the following day. Structure documented below.
     * @return builder
     */
    def scheduleStartDate(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleStartDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleScheduleStartDateArgs.builder
      builder.scheduleStartDate(args(argsBuilder).build)

    /**
     * @param startTimeOfDay The time in UTC at which the transfer will be scheduled to start in a day. Transfers may start later than this time. If not specified, recurring and one-time transfers that are scheduled to run today will run immediately; recurring transfers that are scheduled to run on a future date will start at approximately midnight UTC on that date. Note that when configuring a transfer with the Cloud Platform Console, the transfer&#39;s start time in a day is specified in your local timezone. Structure documented below.
     * @return builder
     */
    def startTimeOfDay(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobScheduleStartTimeOfDayArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobScheduleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobScheduleStartTimeOfDayArgs.builder
      builder.startTimeOfDay(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketObjectState.Builder)
    /**
     * @param contexts Contexts attached to an object, in key-value pairs. For more information about object contexts, see [Object contexts overview](https://cloud.google.com/storage/docs/object-contexts). Structure is documented below.
     * @return builder
     */
    def contexts(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketObjectState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.builder
      builder.contexts(args(argsBuilder).build)

    /**
     * @param customerEncryption Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     *  Structure is documented below.
     * @return builder
     */
    def customerEncryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketObjectState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs.builder
      builder.customerEncryption(args(argsBuilder).build)

    /**
     * @param retention The [object retention](http://cloud.google.com/storage/docs/object-lock) settings for the object. The retention settings allow an object to be retained until a provided date. Structure is documented below.
     * @return builder
     */
    def retention(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketObjectState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectRetentionArgs.builder
      builder.retention(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder)
    /**
     * @param azureCredentials ) Credentials used to authenticate API requests to Azure block.
     * @return builder
     */
    def azureCredentials(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs.builder
      builder.azureCredentials(args(argsBuilder).build)

    /**
     * @param federatedIdentityConfig Federated identity config of a user registered Azure application. Structure documented below.
     * @return builder
     */
    def federatedIdentityConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceFederatedIdentityConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceFederatedIdentityConfigArgs.builder
      builder.federatedIdentityConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder)
    /**
     * @param gcsDataSink A Google Cloud Storage data sink. Structure documented below.
     * @return builder
     */
    def gcsDataSink(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSinkArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSinkArgs.builder
      builder.gcsDataSink(args(argsBuilder).build)

    /**
     * @param gcsDataSource A Google Cloud Storage data source. Structure documented below.
     * @return builder
     */
    def gcsDataSource(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecGcsDataSourceArgs.builder
      builder.gcsDataSource(args(argsBuilder).build)

    /**
     * @param objectConditions Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects&#39; `lastModificationTime` do not exclude objects in a data sink. Structure documented below.
     * @return builder
     */
    def objectConditions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecObjectConditionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecObjectConditionsArgs.builder
      builder.objectConditions(args(argsBuilder).build)

    /**
     * @param transferOptions Characteristics of how to treat files from datasource and sink during job. If the option `deleteObjectsUniqueInSink` is true, object conditions based on objects&#39; `lastModificationTime` are ignored and do not exclude objects in a data source or a data sink. Structure documented below.
     * @return builder
     */
    def transferOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.builder
      builder.transferOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketIAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketState.Builder)
    /**
     * @param autoclass The bucket&#39;s [Autoclass](https://cloud.google.com/storage/docs/autoclass) configuration.  Structure is documented below.
     * @return builder
     */
    def autoclass(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketAutoclassArgs.builder
      builder.autoclass(args(argsBuilder).build)

    /**
     * @param cors The bucket&#39;s [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def cors(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCorArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketCorArgs.builder
      builder.cors(args.map(_(argsBuilder).build)*)

    /**
     * @param customPlacementConfig The bucket&#39;s custom location configuration, which specifies the individual regions that comprise a dual-region bucket. If the bucket is designated a single or multi-region, the parameters are empty. Structure is documented below.
     * @return builder
     */
    def customPlacementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketCustomPlacementConfigArgs.builder
      builder.customPlacementConfig(args(argsBuilder).build)

    /**
     * @param encryption The bucket&#39;s encryption configuration. Structure is documented below.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param hierarchicalNamespace The bucket&#39;s hierarchical namespace policy, which defines the bucket capability to handle folders in logical structure. Structure is documented below. To use this configuration, `uniformBucketLevelAccess` must be enabled on bucket.
     * @return builder
     */
    def hierarchicalNamespace(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketHierarchicalNamespaceArgs.builder
      builder.hierarchicalNamespace(args(argsBuilder).build)

    /**
     * @param ipFilter The bucket IP filtering configuration. Specifies the network sources that can access the bucket, as well as its underlying objects. Structure is documented below.
     * @return builder
     */
    def ipFilter(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.builder
      builder.ipFilter(args(argsBuilder).build)

    /**
     * @param lifecycleRules The bucket&#39;s [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * @return builder
     */
    def lifecycleRules(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs.builder
      builder.lifecycleRules(args.map(_(argsBuilder).build)*)

    /**
     * @param logging The bucket&#39;s [Access &amp; Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * @return builder
     */
    def logging(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketLoggingArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketLoggingArgs.builder
      builder.logging(args(argsBuilder).build)

    /**
     * @param retentionPolicy Configuration of the bucket&#39;s data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * @return builder
     */
    def retentionPolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs.builder
      builder.retentionPolicy(args(argsBuilder).build)

    /**
     * @param softDeletePolicy The bucket&#39;s soft delete policy, which defines the period of time that soft-deleted objects will be retained, and cannot be permanently deleted. If the block is not provided, Server side value will be kept which means removal of block won&#39;t generate any terraform change. Structure is documented below.
     * @return builder
     */
    def softDeletePolicy(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketSoftDeletePolicyArgs.builder
      builder.softDeletePolicy(args(argsBuilder).build)

    /**
     * @param versioning The bucket&#39;s [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * @return builder
     */
    def versioning(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketVersioningArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketVersioningArgs.builder
      builder.versioning(args(argsBuilder).build)

    /**
     * @param website Configuration if the bucket acts as a website. Structure is documented below.
     * @return builder
     */
    def website(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketWebsiteArgs.builder
      builder.website(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ObjectAccessControlState.Builder)
    /**
     * @param projectTeams The project team associated with the entity
     *  Structure is documented below.
     * @return builder
     */
    def projectTeams(args: Endofunction[com.pulumi.gcp.storage.inputs.ObjectAccessControlProjectTeamArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ObjectAccessControlState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ObjectAccessControlProjectTeamArgs.builder
      builder.projectTeams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder)
    /**
     * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.builder
      builder.excludedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.builder
      builder.excludedCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def includedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.builder
      builder.includedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def includedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.builder
      builder.includedCloudStorageLocations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder)
    /**
     * @param customerManagedEncryptionEnforcementConfig If omitted, then new objects with CMEK encryption-type is allowed. If set, then new objects created in this bucket must comply with enforcement config. Changing this has no effect on existing objects; it applies to new objects only, Structure is documented below documented below.
     * @return builder
     */
    def customerManagedEncryptionEnforcementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerManagedEncryptionEnforcementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerManagedEncryptionEnforcementConfigArgs.builder
      builder.customerManagedEncryptionEnforcementConfig(args(argsBuilder).build)

    /**
     * @param customerSuppliedEncryptionEnforcementConfig If omitted, then new objects with CSEK encryption-type is allowed. If set, then new objects created in this bucket must comply with enforcement config. Changing this has no effect on existing objects; it applies to new objects only, Structure is documented below documented below.
     * @return builder
     */
    def customerSuppliedEncryptionEnforcementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerSuppliedEncryptionEnforcementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionCustomerSuppliedEncryptionEnforcementConfigArgs.builder
      builder.customerSuppliedEncryptionEnforcementConfig(args(argsBuilder).build)

    /**
     * @param googleManagedEncryptionEnforcementConfig If omitted, then new objects with GMEK encryption-type is allowed. If set, then new objects created in this bucket must comply with enforcement config. Changing this has no effect on existing objects; it applies to new objects only, Structure is documented below documented below.
     * @return builder
     */
    def googleManagedEncryptionEnforcementConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketEncryptionGoogleManagedEncryptionEnforcementConfigArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketEncryptionGoogleManagedEncryptionEnforcementConfigArgs.builder
      builder.googleManagedEncryptionEnforcementConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder)
    /**
     * @param manifest contain the manifest source file that is a CSV file in a Google Cloud Storage bucket.
     *  Structure is documented below.
     * @return builder
     */
    def manifest(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsManifestArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsManifestArgs.builder
      builder.manifest(args(argsBuilder).build)

    /**
     * @param prefixList Specifies objects matching a prefix set.
     *  Structure is documented below.
     * @return builder
     */
    def prefixList(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsPrefixListArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListBucketsPrefixListArgs.builder
      builder.prefixList(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder)
    /**
     * @param endDate The date to stop generating inventory reports. For example, {&#34;day&#34;: 15, &#34;month&#34;: 9, &#34;year&#34;: 2022}.
     *  Structure is documented below.
     * @return builder
     */
    def endDate(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsEndDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsEndDateArgs.builder
      builder.endDate(args(argsBuilder).build)

    /**
     * @param startDate The date to start generating inventory reports. For example, {&#34;day&#34;: 15, &#34;month&#34;: 8, &#34;year&#34;: 2022}.
     *  Structure is documented below.
     * @return builder
     */
    def startDate(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsStartDateArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsStartDateArgs.builder
      builder.startDate(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlState.Builder)
    /**
     * @param projectTeams The project team associated with the entity
     *  Structure is documented below.
     * @return builder
     */
    def projectTeams(args: Endofunction[com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlProjectTeamArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.DefaultObjectAccessControlProjectTeamArgs.builder
      builder.projectTeams(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.Builder)
    /**
     * @param metadataOptions Specifies the metadata options for running a transfer. Structure documented below.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsMetadataOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobReplicationSpecTransferOptionsMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder)
    /**
     * @param publicNetworkSource The public network IP address ranges that can access the bucket and its data. Structure is documented below.
     * @return builder
     */
    def publicNetworkSource(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterPublicNetworkSourceArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterPublicNetworkSourceArgs.builder
      builder.publicNetworkSource(args(argsBuilder).build)

    /**
     * @param vpcNetworkSources The list of VPC networks that can access the bucket. Structure is documented below.
     * @return builder
     */
    def vpcNetworkSources(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIpFilterVpcNetworkSourceArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketIpFilterArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketIpFilterVpcNetworkSourceArgs.builder
      builder.vpcNetworkSources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder)
    /**
     * @param effectiveIntelligenceConfigs The Intelligence config that is effective for the resource.
     *  Structure is documented below.
     * @return builder
     */
    def effectiveIntelligenceConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigEffectiveIntelligenceConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigEffectiveIntelligenceConfigArgs.builder
      builder.effectiveIntelligenceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param trialConfigs The trial configuration of the Storage Intelligence resource.
     *  Structure is documented below.
     * @return builder
     */
    def trialConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigTrialConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlFolderIntelligenceConfigTrialConfigArgs.builder
      builder.trialConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.Builder)
    /**
     * @param metadataOptions Specifies the metadata options for running a transfer. Structure documented below.
     * @return builder
     */
    def metadataOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsMetadataOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsMetadataOptionsArgs.builder
      builder.metadataOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder)
    /**
     * @param effectiveIntelligenceConfigs The Intelligence config that is effective for the resource.
     *  Structure is documented below.
     * @return builder
     */
    def effectiveIntelligenceConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigEffectiveIntelligenceConfigArgs.builder
      builder.effectiveIntelligenceConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param filter Filter over location and bucket using include or exclude semantics. Resources that match the include or exclude filter are exclusively included or excluded from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigFilterArgs.builder
      builder.filter(args(argsBuilder).build)

    /**
     * @param trialConfigs The trial configuration of the Storage Intelligence resource.
     *  Structure is documented below.
     * @return builder
     */
    def trialConfigs(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigTrialConfigArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.ControlOrganizationIntelligenceConfigTrialConfigArgs.builder
      builder.trialConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder)
    /**
     * @param csvOptions Options for configuring the format of the inventory report CSV file.
     *  Structure is documented below.
     * @return builder
     */
    def csvOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigCsvOptionsArgs.builder
      builder.csvOptions(args(argsBuilder).build)

    /**
     * @param frequencyOptions Options for configuring how inventory reports are generated.
     *  Structure is documented below.
     * @return builder
     */
    def frequencyOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigFrequencyOptionsArgs.builder
      builder.frequencyOptions(args(argsBuilder).build)

    /**
     * @param objectMetadataReportOptions Options for including metadata in an inventory report.
     *  Structure is documented below.
     * @return builder
     */
    def objectMetadataReportOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.builder
      builder.objectMetadataReportOptions(args(argsBuilder).build)

    /**
     * @param parquetOptions An option for outputting inventory reports as parquet files.
     * @return builder
     */
    def parquetOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigParquetOptionsArgs.builder
      builder.parquetOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.Builder)
    /**
     * @param s3Metadata S3 compatible metadata.
     * @return builder
     */
    def s3Metadata(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceS3MetadataArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3CompatibleDataSourceS3MetadataArgs.builder
      builder.s3Metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder)
    /**
     * @param storageDestinationOptions Options for where the inventory reports are stored.
     *  Structure is documented below.
     * @return builder
     */
    def storageDestinationOptions(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageDestinationOptionsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageDestinationOptionsArgs.builder
      builder.storageDestinationOptions(args(argsBuilder).build)

    /**
     * @param storageFilters A nested object resource.
     *  Structure is documented below.
     * @return builder
     */
    def storageFilters(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageFiltersArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsReportConfigObjectMetadataReportOptionsStorageFiltersArgs.builder
      builder.storageFilters(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder)
    /**
     * @param customs A list of custom context key-value pairs.
     * @return builder
     */
    def customs(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketObjectContextsCustomArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.BucketObjectContextsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.BucketObjectContextsCustomArgs.builder
      builder.customs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferAgentPoolState.Builder)
    /**
     * @param bandwidthLimit Specifies the bandwidth limit details. If this field is unspecified, the default value is set as &#39;No Limit&#39;.
     *  Structure is documented below.
     * @return builder
     */
    def bandwidthLimit(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferAgentPoolState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferAgentPoolBandwidthLimitArgs.builder
      builder.bandwidthLimit(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder)
    /**
     * @param excludedCloudStorageBuckets Buckets to exclude from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageBucketsArgs.builder
      builder.excludedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludedCloudStorageLocations Locations to exclude from the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def excludedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterExcludedCloudStorageLocationsArgs.builder
      builder.excludedCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param includedCloudStorageBuckets Buckets to include in the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def includedCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageBucketsArgs.builder
      builder.includedCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includedCloudStorageLocations Locations to include in the Storage Intelligence plan.
     *  Structure is documented below.
     * @return builder
     */
    def includedCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.ControlProjectIntelligenceConfigFilterIncludedCloudStorageLocationsArgs.builder
      builder.includedCloudStorageLocations(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder)
    /**
     * @param bucketList List of buckets and their objects to be transformed. Currently, only one bucket configuration is supported. If multiple buckets are specified, an error will be returned
     *  Structure is documented below.
     * @return builder
     */
    def bucketList(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobBucketListArgs.builder
      builder.bucketList(args(argsBuilder).build)

    /**
     * @param deleteObject allows batch operations to delete objects in bucket
     *  Structure is documented below.
     * @return builder
     */
    def deleteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobDeleteObjectArgs.builder
      builder.deleteObject(args(argsBuilder).build)

    /**
     * @param putMetadata allows batch operations to update metadata for objects in bucket
     *  Structure is documented below.
     * @return builder
     */
    def putMetadata(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutMetadataArgs.builder
      builder.putMetadata(args(argsBuilder).build)

    /**
     * @param putObjectHold allows to update temporary hold or eventBased hold for objects in bucket.
     *  Structure is documented below.
     * @return builder
     */
    def putObjectHold(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobPutObjectHoldArgs.builder
      builder.putObjectHold(args(argsBuilder).build)

    /**
     * @param rewriteObject allows to update encryption key for objects in bucket.
     *  Structure is documented below.
     * @return builder
     */
    def rewriteObject(args: Endofunction[com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BatchOperationsJobState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BatchOperationsJobRewriteObjectArgs.builder
      builder.rewriteObject(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder)
    /**
     * @param cloudStorageBuckets The list of cloud storage buckets/bucket prefix regexes to include in the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsCloudStorageBucketArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsCloudStorageBucketArgs.builder
      builder.cloudStorageBuckets(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.Builder)
    /**
     * @param awsAccessKey AWS credentials block.
     * @return builder
     */
    def awsAccessKey(args: Endofunction[com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs.Builder]):
        com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs.builder
      builder.awsAccessKey(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.BucketIAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.storage.inputs.BucketIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder)
    /**
     * @param excludeCloudStorageBuckets Defined the options for excluding cloud storage buckets for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageBucketsArgs.builder
      builder.excludeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param excludeCloudStorageLocations Defines the options for excluding cloud storage locations for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def excludeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigExcludeCloudStorageLocationsArgs.builder
      builder.excludeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param identity Identity used by DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param includeCloudStorageBuckets Defines the options for including cloud storage buckets for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def includeCloudStorageBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageBucketsArgs.builder
      builder.includeCloudStorageBuckets(args(argsBuilder).build)

    /**
     * @param includeCloudStorageLocations Defines the options for including cloud storage locations for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def includeCloudStorageLocations(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigIncludeCloudStorageLocationsArgs.builder
      builder.includeCloudStorageLocations(args(argsBuilder).build)

    /**
     * @param links Details of the linked DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigLinkArgs.Builder]*):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      def argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

    /**
     * @param sourceFolders Defines the options for providing source folders for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def sourceFolders(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceFoldersArgs.builder
      builder.sourceFolders(args(argsBuilder).build)

    /**
     * @param sourceProjects Defines the options for providing source projects for the DatasetConfig.
     *  Structure is documented below.
     * @return builder
     */
    def sourceProjects(args: Endofunction[com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.Builder]):
        com.pulumi.gcp.storage.inputs.InsightsDatasetConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.storage.inputs.InsightsDatasetConfigSourceProjectsArgs.builder
      builder.sourceProjects(args(argsBuilder).build)

  /**
   * Creates a new bucket in Google cloud storage service (GCS).
   *  Once a bucket has been created, its location can&#39;t be changed.
   * 
   *  For more information see
   *  [the official documentation](https://cloud.google.com/storage/docs/overview)
   *  and
   *  [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
   * 
   *  **Note**: If the project id is not set on the resource or in the provider block it will be dynamically
   *  determined which will require enabling the compute api.
   */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.BucketArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.Bucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Authoritatively manages the default object ACLs for a Google Cloud Storage bucket
   *  without managing the bucket itself.
   * 
   *  &gt; Note that for each object, its creator will have the `&#34;OWNER&#34;` role in addition
   *  to the default ACL that has been defined.
   * 
   *  For more information see
   *  [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
   *  and
   *  [API](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls).
   * 
   *  &gt; Want fine-grained control over default object ACLs? Use `gcp.storage.DefaultObjectAccessControl`
   *  to control individual role entity pairs.
   */
  def DefaultObjectACL(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.DefaultObjectACLArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.DefaultObjectACLArgs.builder
    com.pulumi.gcp.storage.DefaultObjectACL(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   *  * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   *  * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.BucketIAMPolicy
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.BucketIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMBindingConditionArgs.builder()
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
   *  ## gcp.storage.BucketIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMMemberConditionArgs.builder()
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
   *  # IAM policy for Cloud Storage Bucket
   *  Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   *  * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   *  * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   *  ## gcp.storage.BucketIAMPolicy
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
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
   *  import com.pulumi.gcp.storage.BucketIAMPolicy;
   *  import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
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
   *                  .role("roles/storage.admin")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                      .title("expires_after_2019_12_31")
   *                      .description("Expiring at midnight of 2019-12-31")
   *                      .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                      .build())
   *                  .build())
   *              .build());
   * 
   *          var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *              .bucket(default_.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   *  ## gcp.storage.BucketIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMBinding;
   *  import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
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
   *          var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMBindingConditionArgs.builder()
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
   *  ## gcp.storage.BucketIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
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
   *  import com.pulumi.gcp.storage.BucketIAMMember;
   *  import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   *  import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
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
   *          var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *              .bucket(default_.name())
   *              .role("roles/storage.admin")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .condition(BucketIAMMemberConditionArgs.builder()
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
   *  * b/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Storage bucket IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_storage_bucket_iam_member.editor &#34;b/{{bucket}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_storage_bucket_iam_binding.editor &#34;b/{{bucket}} roles/storage.objectViewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:storage/bucketIAMMember:BucketIAMMember editor b/{{bucket}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def BucketIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketIAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.BucketIAMMemberArgs.builder
    com.pulumi.gcp.storage.BucketIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Google Cloud Storage (GCS) Anywhere Cache feature allows users to
   *  create SSD backed zonal read cache for their buckets. These zonal
   *  caches are co-located with the customers compute engines to provide
   *  cost efficiency.
   */
  def AnywhereCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.AnywhereCacheArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.storage.AnywhereCacheArgs.builder
    com.pulumi.gcp.storage.AnywhereCache(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
