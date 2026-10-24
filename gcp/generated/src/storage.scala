package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object storage:
  /**
   * The Google Cloud Storage (GCS) Anywhere Cache feature allows users to
   * create SSD backed zonal read cache for their buckets. These zonal
   * caches are co-located with the customers compute engines to provide
   * cost efficiency.
   */
  def AnywhereCache(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.AnywhereCacheArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.AnywhereCacheArgs.builder
    com.pulumi.gcp.storage.AnywhereCache(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Storage Batch Operations (SBO) is a Cloud Storage management feature that offers a
   * seamless experience to perform single batch operations on millions of GCS objects in a
   * serverless manner.
   */
  def BatchOperationsJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BatchOperationsJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.BatchOperationsJobArgs.builder
    com.pulumi.gcp.storage.BatchOperationsJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a new bucket in Google cloud storage service (GCS).
   * Once a bucket has been created, its location can&#39;t be changed.
   * 
   * For more information see
   * [the official documentation](https://cloud.google.com/storage/docs/overview)
   * and
   * [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
   * 
   * **Note**: If the project id is not set on the resource or in the provider block it will be dynamically
   * determined which will require enabling the compute api.
   */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.BucketArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.Bucket(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Authoritatively manages a bucket&#39;s ACLs in Google cloud storage service (GCS). For more information see
   * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
   * and
   * [API](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls).
   * 
   * Bucket ACLs can be managed non authoritatively using the `storageBucketAccessControl` resource. Do not use these two resources in conjunction to manage the same bucket.
   * 
   * Permissions can be granted either by ACLs or Cloud IAM policies. In general, permissions granted by Cloud IAM policies do not appear in ACLs, and permissions granted by ACLs do not appear in Cloud IAM policies. The only exception is for ACLs applied directly on a bucket and certain bucket-level Cloud IAM policies, as described in [Cloud IAM relation to ACLs](https://cloud.google.com/storage/docs/access-control/iam#acls).
   * 
   * **NOTE** This resource will not remove the `project-owners-&lt;project_id&gt;` entity from the `OWNER` role.
   */
  def BucketACL(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketACLArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.BucketACLArgs.builder
    com.pulumi.gcp.storage.BucketACL(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Bucket ACLs can be managed authoritatively using the
   * `storageBucketAcl` resource. Do not use these two resources in conjunction to manage the same bucket.
   * 
   * The BucketAccessControls resource manages the Access Control List
   * (ACLs) for a single entity/role pairing on a bucket. ACLs let you specify who
   * has access to your data and to what extent.
   * 
   * There are three roles that can be assigned to an entity:
   * 
   * READERs can get the bucket, though no acl property will be returned, and
   * list the bucket&#39;s objects.  WRITERs are READERs, and they can insert
   * objects into the bucket and delete the bucket&#39;s objects.  OWNERs are
   * WRITERs, and they can get the acl property of a bucket, update a bucket,
   * and call all BucketAccessControls methods on the bucket.  For more
   * information, see Access Control, with the caveat that this API uses
   * READER, WRITER, and OWNER instead of READ, WRITE, and FULL_CONTROL.
   * 
   * To get more information about BucketAccessControl, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/access-control/lists)
   */
  def BucketAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketAccessControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.BucketAccessControlArgs.builder
    com.pulumi.gcp.storage.BucketAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   * * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   * * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.BucketIAMPolicy
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.BucketIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMBindingConditionArgs.builder()
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
   * ## gcp.storage.BucketIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMMemberConditionArgs.builder()
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
   * # IAM policy for Cloud Storage Bucket
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   * * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   * * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.BucketIAMPolicy
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.BucketIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMBindingConditionArgs.builder()
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
   * ## gcp.storage.BucketIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMMemberConditionArgs.builder()
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
   */
  def BucketIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketIAMBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.BucketIAMBindingArgs.builder
    com.pulumi.gcp.storage.BucketIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   * * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   * * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.BucketIAMPolicy
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.BucketIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMBindingConditionArgs.builder()
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
   * ## gcp.storage.BucketIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMMemberConditionArgs.builder()
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
   * # IAM policy for Cloud Storage Bucket
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   * * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   * * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.BucketIAMPolicy
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.BucketIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMBindingConditionArgs.builder()
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
   * ## gcp.storage.BucketIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMMemberConditionArgs.builder()
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
   */
  def BucketIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketIAMMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.BucketIAMMemberArgs.builder
    com.pulumi.gcp.storage.BucketIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   * * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   * * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.BucketIAMPolicy
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.BucketIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMBindingConditionArgs.builder()
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
   * ## gcp.storage.BucketIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMMemberConditionArgs.builder()
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
   * # IAM policy for Cloud Storage Bucket
   * Three different resources help you manage your IAM policy for Cloud Storage Bucket. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.BucketIAMPolicy`: Authoritative. Sets the IAM policy for the bucket and replaces any existing policy already attached.
   * * `gcp.storage.BucketIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the bucket are preserved.
   * * `gcp.storage.BucketIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the bucket are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.BucketIAMPolicy`: Retrieves the IAM policy for the bucket
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMPolicy` **cannot** be used in conjunction with `gcp.storage.BucketIAMBinding` and `gcp.storage.BucketIAMMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.BucketIAMBinding` resources **can be** used in conjunction with `gcp.storage.BucketIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.BucketIAMPolicy
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
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
   * import com.pulumi.gcp.storage.BucketIAMPolicy;
   * import com.pulumi.gcp.storage.BucketIAMPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new BucketIAMPolicy("policy", BucketIAMPolicyArgs.builder()
   *             .bucket(default_.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.BucketIAMBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMBinding;
   * import com.pulumi.gcp.storage.BucketIAMBindingArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new BucketIAMBinding("binding", BucketIAMBindingArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMBindingConditionArgs.builder()
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
   * ## gcp.storage.BucketIAMMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.BucketIAMMember;
   * import com.pulumi.gcp.storage.BucketIAMMemberArgs;
   * import com.pulumi.gcp.storage.inputs.BucketIAMMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new BucketIAMMember("member", BucketIAMMemberArgs.builder()
   *             .bucket(default_.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(BucketIAMMemberConditionArgs.builder()
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
   */
  def BucketIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketIAMPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.BucketIAMPolicyArgs.builder
    com.pulumi.gcp.storage.BucketIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a new object inside an existing bucket in Google cloud storage service (GCS).
   * [ACLs](https://cloud.google.com/storage/docs/access-control/lists) can be applied using the `gcp.storage.ObjectACL` resource.
   *  For more information see
   * [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
   * and
   * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
   * 
   * A datasource can be used to retrieve the data of the stored object:
   * 
   * * `gcp.storage.getBucketObjectContent`: Retrieves the content within a specified bucket object in Google Cloud Storage Service (GCS)
   */
  def BucketObject(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.BucketObjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.BucketObjectArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.BucketObject(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Folder Storage Intelligence resource represents GCS Storage Intelligence operating on individual GCP Folder. Storage Intelligence is a singleton resource and individual instance exists on each GCP Folder.
   * 
   * Storage Intelligence is for Storage Admins to manage GCP storage assets at scale for performance, cost, security &amp; compliance.
   * 
   * &gt; **Warning:** Storage Intelligence Config is a singleton resource which cannot be created or deleted. A single instance of Storage Intelligence Config exist for each GCP Folder. Terraform does not create or destroy this resource.
   * Terraform resource creation for this resource is simply an update operation on existing resource with specified properties, absense of any optional field in the create operation will result in clearance of that field. Terraform deletion won&#39;t have any effect on this resource rather it will only remove it from the state file.
   */
  def ControlFolderIntelligenceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ControlFolderIntelligenceConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ControlFolderIntelligenceConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Organization Storage Intelligence Config resource represents GCS Storage Intelligence operating on individual GCP organization. Storage Intelligence Config is a singleton resource and individual instance exists on each GCP organization.
   * 
   * Storage Intelligence is for Storage Admins to manage GCP storage assets at scale for performance, cost, security &amp; compliance.
   * 
   * &gt; **Warning:** Storage Intelligence is a singleton resource which cannot be created or deleted. A single instance of Storage Intelligence exist for each GCP Organization. Terraform does not create or destroy this resource.
   * Terraform resource creation for this resource is simply an update operation on existing resource with specified properties, absence of any optional field in the create operation will result in clearance of that field. Terraform deletion won&#39;t have any effect on this resource rather it will only remove it from the state file.
   */
  def ControlOrganizationIntelligenceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ControlOrganizationIntelligenceConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The Project Storage Intelligence Config resource represents GCS Storage Intelligence operating on individual GCP project. Storage Intelligence Config is a singleton resource and individual instance exists on each GCP project.
   * 
   * Storage Intelligence is for Storage Admins to manage GCP storage assets at scale for performance, cost, security &amp; compliance.
   * 
   * &gt; **Warning:** Storage Intelligence Config is a singleton resource which cannot be created or deleted. A single instance of Storage Intelligence Config exist for each GCP Project. Terraform does not create or destroy this resource.
   * Terraform resource creation for this resource is simply an update operation on existing resource with specified properties, absence of any optional field in the create operation will result in clearance of that field. Terraform deletion won&#39;t have any effect on this resource rather it will only remove it from the state file.
   */
  def ControlProjectIntelligenceConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ControlProjectIntelligenceConfigArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ControlProjectIntelligenceConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Authoritatively manages the default object ACLs for a Google Cloud Storage bucket
   * without managing the bucket itself.
   * 
   * &gt; Note that for each object, its creator will have the `&#34;OWNER&#34;` role in addition
   * to the default ACL that has been defined.
   * 
   * For more information see
   * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
   * and
   * [API](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls).
   * 
   * &gt; Want fine-grained control over default object ACLs? Use `gcp.storage.DefaultObjectAccessControl`
   * to control individual role entity pairs.
   */
  def DefaultObjectACL(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.DefaultObjectACLArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.DefaultObjectACLArgs.builder
    com.pulumi.gcp.storage.DefaultObjectACL(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The DefaultObjectAccessControls resources represent the Access Control
   * Lists (ACLs) applied to a new object within a Google Cloud Storage bucket
   * when no ACL was provided for that object. ACLs let you specify who has
   * access to your bucket contents and to what extent.
   * 
   * There are two roles that can be assigned to an entity:
   * 
   * READERs can get an object, though the acl property will not be revealed.
   * OWNERs are READERs, and they can get the acl property, update an object,
   * and call all objectAccessControls methods on the object. The owner of an
   * object is always an OWNER.
   * For more information, see Access Control, with the caveat that this API
   * uses READER and OWNER instead of READ and FULL_CONTROL.
   * 
   * To get more information about DefaultObjectAccessControl, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/defaultObjectAccessControls)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)
   */
  def DefaultObjectAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.DefaultObjectAccessControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.DefaultObjectAccessControlArgs.builder
    com.pulumi.gcp.storage.DefaultObjectAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Google Cloud Storage Folder.
   * 
   * The Folder resource represents a folder in a Cloud Storage bucket with hierarchical namespace enabled
   * 
   * To get more information about Folder, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/folders)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/folders-overview)
   */
  def Folder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.FolderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.FolderArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.Folder(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** An SFTP Server resource supporting internal and external connectivity configurations. */
  def FtpServer(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.FtpServerArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.FtpServerArgs.builder
    com.pulumi.gcp.storage.FtpServer(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** A Storage FTP User resource supporting directory mappings and user credentials for an SFTP Server. */
  def FtpUser(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.FtpUserArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.FtpUserArgs.builder
    com.pulumi.gcp.storage.FtpUser(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The hmacKeys resource represents an HMAC key within Cloud Storage. The resource
   * consists of a secret and HMAC key metadata. HMAC keys can be used as credentials
   * for service accounts.
   * 
   * To get more information about HmacKey, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/projects/hmacKeys)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/authentication/managing-hmackeys)
   * 
   * On import, the `secret` value will not be retrieved.
   */
  def HmacKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.HmacKeyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.HmacKeyArgs.builder
    com.pulumi.gcp.storage.HmacKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a Storage Insights DatasetConfig.
   * 
   * To get more information about DatasetConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/insights/reference/rest/v1/projects.locations.datasetConfigs)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/insights/datasets)
   */
  def InsightsDatasetConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.InsightsDatasetConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.InsightsDatasetConfigArgs.builder
    com.pulumi.gcp.storage.InsightsDatasetConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents an inventory report configuration.
   * 
   * To get more information about ReportConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/reportConfig)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/insights/using-storage-insights)
   */
  def InsightsReportConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.InsightsReportConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.InsightsReportConfigArgs.builder
    com.pulumi.gcp.storage.InsightsReportConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Google Cloud Storage Managed Folder.
   * 
   * You can apply Identity and Access Management (IAM) policies to
   * managed folders to grant principals access only to the objects
   * within the managed folder, which lets you more finely control access
   * for specific data sets and tables within a bucket. You can nest
   * managed folders up to 15 levels deep, including the parent managed
   * folder.
   * 
   * Managed folders can only be created in buckets that have uniform
   * bucket-level access enabled.
   * 
   * To get more information about ManagedFolder, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/managedFolder)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/managed-folders)
   */
  def ManagedFolder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.ManagedFolderArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.ManagedFolder(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   * * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   * * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.ManagedFolderIamPolicy
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.ManagedFolderIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   * ## gcp.storage.ManagedFolderIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud Storage ManagedFolder
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   * * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   * * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.ManagedFolderIamPolicy
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.ManagedFolderIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   * ## gcp.storage.ManagedFolderIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   * * b/{{bucket}}/managedFolders/{{managed_folder}}
   * * {{bucket}}/{{managed_folder}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Storage managedfolder IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_storage_managed_folder_iam_member.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_storage_managed_folder_iam_binding.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:storage/managedFolderIamBinding:ManagedFolderIamBinding editor b/{{bucket}}/managedFolders/{{managed_folder}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ManagedFolderIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.ManagedFolderIamBindingArgs.builder
    com.pulumi.gcp.storage.ManagedFolderIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   * * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   * * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.ManagedFolderIamPolicy
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.ManagedFolderIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   * ## gcp.storage.ManagedFolderIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud Storage ManagedFolder
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   * * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   * * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.ManagedFolderIamPolicy
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.ManagedFolderIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   * ## gcp.storage.ManagedFolderIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   * * b/{{bucket}}/managedFolders/{{managed_folder}}
   * * {{bucket}}/{{managed_folder}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Storage managedfolder IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_storage_managed_folder_iam_member.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_storage_managed_folder_iam_binding.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:storage/managedFolderIamMember:ManagedFolderIamMember editor b/{{bucket}}/managedFolders/{{managed_folder}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ManagedFolderIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.ManagedFolderIamMemberArgs.builder
    com.pulumi.gcp.storage.ManagedFolderIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   * * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   * * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.ManagedFolderIamPolicy
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.ManagedFolderIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   * ## gcp.storage.ManagedFolderIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   * ## &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   * 
   * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   * ---
   * 
   * # IAM policy for Cloud Storage ManagedFolder
   * Three different resources help you manage your IAM policy for Cloud Storage ManagedFolder. Each of these resources serves a different use case:
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Authoritative. Sets the IAM policy for the managedfolder and replaces any existing policy already attached.
   * * `gcp.storage.ManagedFolderIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the managedfolder are preserved.
   * * `gcp.storage.ManagedFolderIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the managedfolder are preserved.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.storage.ManagedFolderIamPolicy`: Retrieves the IAM policy for the managedfolder
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamPolicy` **cannot** be used in conjunction with `gcp.storage.ManagedFolderIamBinding` and `gcp.storage.ManagedFolderIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.storage.ManagedFolderIamBinding` resources **can be** used in conjunction with `gcp.storage.ManagedFolderIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Note:**  This resource supports IAM Conditions but they have some known limitations which can be found [here](https://cloud.google.com/iam/docs/conditions-overview#limitations). Please review this article if you are having issues with IAM Conditions.
   * 
   * ## gcp.storage.ManagedFolderIamPolicy
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
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
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicy;
   * import com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/storage.admin")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .condition(GetIAMPolicyBindingConditionArgs.builder()
   *                     .title("expires_after_2019_12_31")
   *                     .description("Expiring at midnight of 2019-12-31")
   *                     .expression("request.time < timestamp(\"2020-01-01T00:00:00Z\")")
   *                     .build())
   *                 .build())
   *             .build());
   * 
   *         var policy = new ManagedFolderIamPolicy("policy", ManagedFolderIamPolicyArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * ## gcp.storage.ManagedFolderIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamBinding;
   * import com.pulumi.gcp.storage.ManagedFolderIamBindingArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamBindingConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new ManagedFolderIamBinding("binding", ManagedFolderIamBindingArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamBindingConditionArgs.builder()
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
   * ## gcp.storage.ManagedFolderIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
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
   * import com.pulumi.gcp.storage.ManagedFolderIamMember;
   * import com.pulumi.gcp.storage.ManagedFolderIamMemberArgs;
   * import com.pulumi.gcp.storage.inputs.ManagedFolderIamMemberConditionArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new ManagedFolderIamMember("member", ManagedFolderIamMemberArgs.builder()
   *             .bucket(folder.get("bucket"))
   *             .managedFolder(folder.get("name"))
   *             .role("roles/storage.admin")
   *             .member("user:jane}{@literal @}{@code example.com")
   *             .condition(ManagedFolderIamMemberConditionArgs.builder()
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
   * * b/{{bucket}}/managedFolders/{{managed_folder}}
   * * {{bucket}}/{{managed_folder}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Cloud Storage managedfolder IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_storage_managed_folder_iam_member.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_storage_managed_folder_iam_binding.editor &#34;b/{{bucket}}/managedFolders/{{managed_folder}} roles/storage.objectViewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:storage/managedFolderIamPolicy:ManagedFolderIamPolicy editor b/{{bucket}}/managedFolders/{{managed_folder}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ManagedFolderIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.ManagedFolderIamPolicyArgs.builder
    com.pulumi.gcp.storage.ManagedFolderIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a new notification configuration on a specified bucket, establishing a flow of event notifications from GCS to a Cloud Pub/Sub topic.
   *  For more information see
   * [the official documentation](https://cloud.google.com/storage/docs/pubsub-notifications)
   * and
   * [API](https://cloud.google.com/storage/docs/json_api/v1/notifications).
   * 
   * In order to enable notifications, a special Google Cloud Storage service account unique to the project
   * must exist and have the IAM permission &#34;projects.topics.publish&#34; for a Cloud Pub/Sub topic in the project.
   * This service account is not created automatically when a project is created.
   * To ensure the service account exists and obtain its email address for use in granting the correct IAM permission, use the
   * [`gcp.storage.getProjectServiceAccount`](https://www.terraform.io/docs/providers/google/d/storage_project_service_account.html)
   * datasource&#39;s `emailAddress` value, and see below for an example of enabling notifications by granting the correct IAM permission.
   * See [the notifications documentation](https://cloud.google.com/storage/docs/gsutil/commands/notification) for more details.
   * 
   * &gt; **NOTE**: This resource can affect your storage IAM policy. If you are using this in the same config as your storage IAM policy resources, consider
   * making this resource dependent on those IAM resources via `dependsOn`. This will safeguard against errors due to IAM race conditions.
   */
  def Notification(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.NotificationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.NotificationArgs.builder
    com.pulumi.gcp.storage.Notification(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Authoritatively manages the access control list (ACL) for an object in a Google
   * Cloud Storage (GCS) bucket. Removing a `gcp.storage.ObjectACL` sets the
   * acl to the `private` [predefined ACL](https://cloud.google.com/storage/docs/access-control#predefined-acl).
   * 
   * For more information see
   * [the official documentation](https://cloud.google.com/storage/docs/access-control/lists)
   * and
   * [API](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls).
   * 
   * &gt; Want fine-grained control over object ACLs? Use `gcp.storage.ObjectAccessControl` to control individual
   * role entity pairs.
   */
  def ObjectACL(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ObjectACLArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.ObjectACLArgs.builder
    com.pulumi.gcp.storage.ObjectACL(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * The ObjectAccessControls resources represent the Access Control Lists
   * (ACLs) for objects within Google Cloud Storage. ACLs let you specify
   * who has access to your data and to what extent.
   * 
   * There are two roles that can be assigned to an entity:
   * 
   * READERs can get an object, though the acl property will not be revealed.
   * OWNERs are READERs, and they can get the acl property, update an object,
   * and call all objectAccessControls methods on the object. The owner of an
   * object is always an OWNER.
   * For more information, see Access Control, with the caveat that this API
   * uses READER and OWNER instead of READ and FULL_CONTROL.
   * 
   * To get more information about ObjectAccessControl, see:
   * 
   * * [API documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage/docs/access-control/create-manage-lists)
   */
  def ObjectAccessControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.ObjectAccessControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.storage.ObjectAccessControlArgs.builder
    com.pulumi.gcp.storage.ObjectAccessControl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object StorageFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Gets an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#buckets)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
     */
    inline def getBucket(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucket(args(argsBuilder).build)

    /**
     * Gets an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#buckets)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/buckets).
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
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     */
    inline def getBucketObject(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObject(args(argsBuilder).build)

    /**
     * Gets an existing object inside an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     */
    inline def getBucketObjectPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectPlain(args(argsBuilder).build)

    /**
     * Gets an existing object content inside an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     * &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     */
    inline def getBucketObjectContent(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectContentResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContent(args(argsBuilder).build)

    /**
     * Gets an existing object content inside an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     * &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     */
    inline def getBucketObjectContentPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectContentResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContentPlain(args(argsBuilder).build)

    /**
     * Gets existing object contents inside an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     * &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     * 
     * &gt; **Warning:** This data source loads all object contents into memory. Limit the results with `matchGlob` or `prefix`.
     */
    inline def getBucketObjectContents(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectContentsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContents(args(argsBuilder).build)

    /**
     * Gets existing object contents inside an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and
     * [API](https://cloud.google.com/storage/docs/json_api/v1/objects).
     * 
     * &gt; **Warning:** The object content will be saved in the state, and visible to everyone who has access to the state file.
     * 
     * &gt; **Warning:** This data source loads all object contents into memory. Limit the results with `matchGlob` or `prefix`.
     */
    inline def getBucketObjectContentsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectContentsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectContentsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectContentsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectContentsPlain(args(argsBuilder).build)

    /**
     * Gets existing objects inside an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and [API](https://cloud.google.com/storage/docs/json_api/v1/objects/list).
     */
    inline def getBucketObjects(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjects(args(argsBuilder).build)

    /**
     * Gets existing objects inside an existing bucket in Google Cloud Storage service (GCS).
     * See [the official documentation](https://cloud.google.com/storage/docs/key-terms#objects)
     * and [API](https://cloud.google.com/storage/docs/json_api/v1/objects/list).
     */
    inline def getBucketObjectsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketObjectsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketObjectsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketObjectsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketObjectsPlain(args(argsBuilder).build)

    /**
     * Gets a list of existing GCS buckets.
     * See [the official documentation](https://cloud.google.com/storage/docs/introduction)
     * and [API](https://cloud.google.com/storage/docs/json_api/v1/buckets/list).
     */
    inline def getBuckets(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetBucketsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBuckets(args(argsBuilder).build)

    /**
     * Gets a list of existing GCS buckets.
     * See [the official documentation](https://cloud.google.com/storage/docs/introduction)
     * and [API](https://cloud.google.com/storage/docs/json_api/v1/buckets/list).
     */
    inline def getBucketsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetBucketsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetBucketsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetBucketsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getBucketsPlain(args(argsBuilder).build)

    /** Get information about a Cloud Storage Control FolderIntelligenceConfig. */
    inline def getControlFolderIntelligenceConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlFolderIntelligenceConfig(args(argsBuilder).build)

    /** Get information about a Cloud Storage Control FolderIntelligenceConfig. */
    inline def getControlFolderIntelligenceConfigPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceConfigPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlFolderIntelligenceConfigPlain(args(argsBuilder).build)

    /** Summarizes Cloud Storage intelligence findings in a specified folder and location. */
    inline def getControlFolderIntelligenceFindingsSummary(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceFindingsSummaryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceFindingsSummaryResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceFindingsSummaryArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlFolderIntelligenceFindingsSummary(args(argsBuilder).build)

    /** Summarizes Cloud Storage intelligence findings in a specified folder and location. */
    inline def getControlFolderIntelligenceFindingsSummaryPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceFindingsSummaryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlFolderIntelligenceFindingsSummaryResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlFolderIntelligenceFindingsSummaryPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlFolderIntelligenceFindingsSummaryPlain(args(argsBuilder).build)

    /** Get information about a Cloud Storage Control OrganizationIntelligenceConfig. */
    inline def getControlOrganizationIntelligenceConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlOrganizationIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlOrganizationIntelligenceConfig(args(argsBuilder).build)

    /** Get information about a Cloud Storage Control OrganizationIntelligenceConfig. */
    inline def getControlOrganizationIntelligenceConfigPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlOrganizationIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceConfigPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlOrganizationIntelligenceConfigPlain(args(argsBuilder).build)

    /** Summarizes Cloud Storage intelligence findings in a specified organization and location. */
    inline def getControlOrganizationIntelligenceFindingsSummary(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceFindingsSummaryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlOrganizationIntelligenceFindingsSummaryResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceFindingsSummaryArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlOrganizationIntelligenceFindingsSummary(args(argsBuilder).build)

    /** Summarizes Cloud Storage intelligence findings in a specified organization and location. */
    inline def getControlOrganizationIntelligenceFindingsSummaryPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceFindingsSummaryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlOrganizationIntelligenceFindingsSummaryResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlOrganizationIntelligenceFindingsSummaryPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlOrganizationIntelligenceFindingsSummaryPlain(args(argsBuilder).build)

    /** Get information about a Cloud Storage Control ProjectIntelligenceConfig. */
    inline def getControlProjectIntelligenceConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceConfig(args(argsBuilder).build)

    /** Get information about a Cloud Storage Control ProjectIntelligenceConfig. */
    inline def getControlProjectIntelligenceConfigPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceConfigPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceConfigPlain(args(argsBuilder).build)

    /** Retrieves information about a specific Cloud Storage intelligence finding in a project and location. */
    inline def getControlProjectIntelligenceFinding(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFinding(args(argsBuilder).build)

    /** Retrieves information about a specific Cloud Storage intelligence finding in a project and location. */
    inline def getControlProjectIntelligenceFindingPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingPlain(args(argsBuilder).build)

    /** Retrieves information about a specific Cloud Storage intelligence finding revision in a project and location. */
    inline def getControlProjectIntelligenceFindingRevision(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingRevisionResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingRevision(args(argsBuilder).build)

    /** Retrieves information about a specific Cloud Storage intelligence finding revision in a project and location. */
    inline def getControlProjectIntelligenceFindingRevisionPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingRevisionResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingRevisionPlain(args(argsBuilder).build)

    /** Retrieves a list of Cloud Storage intelligence finding revisions in a specified project and location. */
    inline def getControlProjectIntelligenceFindingRevisions(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingRevisionsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingRevisions(args(argsBuilder).build)

    /** Retrieves a list of Cloud Storage intelligence finding revisions in a specified project and location. */
    inline def getControlProjectIntelligenceFindingRevisionsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingRevisionsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingRevisionsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingRevisionsPlain(args(argsBuilder).build)

    /** Retrieves a list of Cloud Storage intelligence findings in a specified project and location. */
    inline def getControlProjectIntelligenceFindings(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindings(args(argsBuilder).build)

    /** Retrieves a list of Cloud Storage intelligence findings in a specified project and location. */
    inline def getControlProjectIntelligenceFindingsPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingsResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingsPlain(args(argsBuilder).build)

    /** Summarizes Cloud Storage intelligence findings in a specified project and location. */
    inline def getControlProjectIntelligenceFindingsSummary(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsSummaryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingsSummaryResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsSummaryArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingsSummary(args(argsBuilder).build)

    /** Summarizes Cloud Storage intelligence findings in a specified project and location. */
    inline def getControlProjectIntelligenceFindingsSummaryPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsSummaryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetControlProjectIntelligenceFindingsSummaryResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetControlProjectIntelligenceFindingsSummaryPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getControlProjectIntelligenceFindingsSummaryPlain(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Storage Insights Dataset Config resource.
     * See [the official documentation](https://cloud.google.com/storage/docs/insights/datasets)
     * and
     * [API](https://cloud.google.com/storage/docs/insights/reference/rest/v1/projects.locations.datasetConfigs).
     */
    inline def getInsightsDatasetConfig(args: Endofunction[com.pulumi.gcp.storage.inputs.GetInsightsDatasetConfigArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetInsightsDatasetConfigResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetInsightsDatasetConfigArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getInsightsDatasetConfig(args(argsBuilder).build)

    /**
     * Use this data source to get information about a Storage Insights Dataset Config resource.
     * See [the official documentation](https://cloud.google.com/storage/docs/insights/datasets)
     * and
     * [API](https://cloud.google.com/storage/docs/insights/reference/rest/v1/projects.locations.datasetConfigs).
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
     * For more info about signed URL&#39;s is available [here](https://cloud.google.com/storage/docs/access-control/signed-urls).
     */
    inline def getObjectSignedUrl(args: Endofunction[com.pulumi.gcp.storage.inputs.GetObjectSignedUrlArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetObjectSignedUrlResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetObjectSignedUrlArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getObjectSignedUrl(args(argsBuilder).build)

    /**
     * The Google Cloud storage signed URL data source generates a signed URL for a given storage object. Signed URLs provide a way to give time-limited read or write access to anyone in possession of the URL, regardless of whether they have a Google account.
     * 
     * For more info about signed URL&#39;s is available [here](https://cloud.google.com/storage/docs/access-control/signed-urls).
     */
    inline def getObjectSignedUrlPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetObjectSignedUrlPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetObjectSignedUrlResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetObjectSignedUrlPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getObjectSignedUrlPlain(args(argsBuilder).build)

    /**
     * Get the email address of a project&#39;s unique [automatic Google Cloud Storage service account](https://cloud.google.com/storage/docs/projects#service-accounts).
     * 
     * For each Google Cloud project, Google maintains a unique service account which
     * is used as the identity for various Google Cloud Storage operations, including
     * operations involving
     * [customer-managed encryption keys](https://cloud.google.com/storage/docs/encryption/customer-managed-keys)
     * and those involving
     * [storage notifications to pub/sub](https://cloud.google.com/storage/docs/gsutil/commands/notification).
     * This automatic Google service account requires access to the relevant Cloud KMS keys or pub/sub topics, respectively, in order for Cloud Storage to use
     * these customer-managed resources.
     * 
     * The service account has a well-known, documented naming format which is parameterised on the numeric Google project ID.
     * However, as noted in [the docs](https://cloud.google.com/storage/docs/projects#service-accounts), it is only created when certain relevant actions occur which
     * presuppose its existence.
     * These actions include calling a [Cloud Storage API endpoint](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount/get) to yield the
     * service account&#39;s identity, or performing some operations in the UI which must use the service account&#39;s identity, such as attempting to list Cloud KMS keys
     * on the bucket creation page.
     * 
     * Use of this data source calls the relevant API endpoint to obtain the service account&#39;s identity and thus ensures it exists prior to any API operations
     * which demand its existence, such as specifying it in Cloud IAM policy.
     * Always prefer to use this data source over interpolating the project ID into the well-known format for this service account, as the latter approach may cause
     * Pulumi update errors in cases where the service account does not yet exist.
     * 
     * &gt;  When you write Pulumi code which uses features depending on this service account *and* your Pulumi code adds the service account in IAM policy on other resources,
     *    you must take care for race conditions between the establishment of the IAM policy and creation of the relevant Cloud Storage resource.
     *    Cloud Storage APIs will require permissions on resources such as pub/sub topics or Cloud KMS keys to exist *before* the attempt to utilise them in a
     *    bucket configuration, otherwise the API calls will fail.
     *    You may need to use `dependsOn` to create an explicit dependency between the IAM policy resource and the Cloud Storage resource which depends on it.
     *    See the examples here and in the `gcp.storage.Notification` resource.
     * 
     * For more information see
     * [the API reference](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount).
     */
    inline def getProjectServiceAccount(args: Endofunction[com.pulumi.gcp.storage.inputs.GetProjectServiceAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetProjectServiceAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetProjectServiceAccountArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getProjectServiceAccount(args(argsBuilder).build)

    /**
     * Get the email address of a project&#39;s unique [automatic Google Cloud Storage service account](https://cloud.google.com/storage/docs/projects#service-accounts).
     * 
     * For each Google Cloud project, Google maintains a unique service account which
     * is used as the identity for various Google Cloud Storage operations, including
     * operations involving
     * [customer-managed encryption keys](https://cloud.google.com/storage/docs/encryption/customer-managed-keys)
     * and those involving
     * [storage notifications to pub/sub](https://cloud.google.com/storage/docs/gsutil/commands/notification).
     * This automatic Google service account requires access to the relevant Cloud KMS keys or pub/sub topics, respectively, in order for Cloud Storage to use
     * these customer-managed resources.
     * 
     * The service account has a well-known, documented naming format which is parameterised on the numeric Google project ID.
     * However, as noted in [the docs](https://cloud.google.com/storage/docs/projects#service-accounts), it is only created when certain relevant actions occur which
     * presuppose its existence.
     * These actions include calling a [Cloud Storage API endpoint](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount/get) to yield the
     * service account&#39;s identity, or performing some operations in the UI which must use the service account&#39;s identity, such as attempting to list Cloud KMS keys
     * on the bucket creation page.
     * 
     * Use of this data source calls the relevant API endpoint to obtain the service account&#39;s identity and thus ensures it exists prior to any API operations
     * which demand its existence, such as specifying it in Cloud IAM policy.
     * Always prefer to use this data source over interpolating the project ID into the well-known format for this service account, as the latter approach may cause
     * Pulumi update errors in cases where the service account does not yet exist.
     * 
     * &gt;  When you write Pulumi code which uses features depending on this service account *and* your Pulumi code adds the service account in IAM policy on other resources,
     *    you must take care for race conditions between the establishment of the IAM policy and creation of the relevant Cloud Storage resource.
     *    Cloud Storage APIs will require permissions on resources such as pub/sub topics or Cloud KMS keys to exist *before* the attempt to utilise them in a
     *    bucket configuration, otherwise the API calls will fail.
     *    You may need to use `dependsOn` to create an explicit dependency between the IAM policy resource and the Cloud Storage resource which depends on it.
     *    See the examples here and in the `gcp.storage.Notification` resource.
     * 
     * For more information see
     * [the API reference](https://cloud.google.com/storage/docs/json_api/v1/projects/serviceAccount).
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
    @deprecated("gcp.storage.getTransferProjectServieAccount has been deprecated in favor of gcp.storage.getTransferProjectServiceAccount") inline def getTransferProjectServieAccount(args: Endofunction[com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.storage.outputs.GetTransferProjectServieAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getTransferProjectServieAccount(args(argsBuilder).build)

    /** Use this data source to retrieve Storage Transfer service account for this project */
    @deprecated("gcp.storage.getTransferProjectServieAccount has been deprecated in favor of gcp.storage.getTransferProjectServiceAccount") inline def getTransferProjectServieAccountPlain(args: Endofunction[com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.storage.outputs.GetTransferProjectServieAccountResult] =
      val argsBuilder = com.pulumi.gcp.storage.inputs.GetTransferProjectServieAccountPlainArgs.builder
      com.pulumi.gcp.storage.StorageFunctions.getTransferProjectServieAccountPlain(args(argsBuilder).build)

  /**
   * Represents an On-Premises Agent pool.
   * 
   * To get more information about AgentPool, see:
   * 
   * * [API documentation](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/projects.agentPools)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/storage-transfer/docs/on-prem-agent-pools)
   */
  def TransferAgentPool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.TransferAgentPoolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.TransferAgentPoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.TransferAgentPool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Creates a new Transfer Job in Google Cloud Storage Transfer.
   * 
   * To get more information about Google Cloud Storage Transfer, see:
   * 
   * * [Overview](https://cloud.google.com/storage-transfer/docs/overview)
   * * [API documentation](https://cloud.google.com/storage-transfer/docs/reference/rest/v1/transferJobs)
   * * How-to Guides
   *     * [Configuring Access to Data Sources and Sinks](https://cloud.google.com/storage-transfer/docs/configure-access)
   */
  def TransferJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.storage.TransferJobArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.storage.TransferJobArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.storage.TransferJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
