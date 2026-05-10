package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object vertex:
  extension (builder: com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder)
    /**
     * @param deployConfig The deploy config to use for the deployment.
     *  Structure is documented below.
     * @return builder
     */
    def deployConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.builder
      builder.deployConfig(args(argsBuilder).build)

    /**
     * @param endpointConfig The endpoint config to use for the deployment.
     *  Structure is documented below.
     * @return builder
     */
    def endpointConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.builder
      builder.endpointConfig(args(argsBuilder).build)

    /**
     * @param modelConfig The model config to use for the deployment.
     *  Structure is documented below.
     * @return builder
     */
    def modelConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.builder
      builder.modelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A collection of DataItems and Annotations on them.
   * 
   *  To get more information about Featurestore, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Feature Metadata information that describes an attribute of an entity type. For example, apple is an entity type, and color is a feature that describes apple.
   * 
   *  To get more information about FeaturestoreEntitytypeFeature, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes.features)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureStoreEntityTypeFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeFeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeFeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeFeature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * FeatureView is representation of values that the FeatureOnlineStore will serve based on its syncConfig.
   * 
   *  To get more information about FeatureOnlineStoreFeatureview, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores.featureViews)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureOnlineStoreFeatureview(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureview(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Tensorboard is a physical database that stores users&#39; training metrics. A default Tensorboard is provided in each region of a GCP project. If needed users can also create extra Tensorboards in their projects.
   * 
   *  To get more information about Tensorboard, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.tensorboards)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiTensorboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiTensorboardArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiTensorboardArgs.builder
    com.pulumi.gcp.vertex.AiTensorboard(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved.
   *  * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
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
   *          var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
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
   *          var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI Featurestore
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved.
   *  * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
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
   *          var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
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
   *          var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
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
   *  * projects/{{project}}/locations/{{region}}/featurestores/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featurestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureStoreIamBinding:AiFeatureStoreIamBinding editor projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A collection of DataItems and Annotations on them.
   * 
   *  To get more information about Dataset, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.datasets)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiDatasetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiDatasetArgs.builder
    com.pulumi.gcp.vertex.AiDataset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder)
    /**
     * @param bigtable Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
     *  Structure is documented below.
     * @return builder
     */
    def bigtable(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.builder
      builder.bigtable(args(argsBuilder).build)

    /**
     * @param dedicatedServingEndpoint The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only need to be set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedServingEndpoint(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.builder
      builder.dedicatedServingEndpoint(args(argsBuilder).build)

    /**
     * @param embeddingManagement (Optional, Beta, Deprecated)
     *  The settings for embedding management in FeatureOnlineStore. Embedding management can only be set for BigTable. It is enabled by default for optimized storagetype.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     * @return builder
     * @deprecated `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     */
    @deprecated def embeddingManagement(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.builder
      builder.embeddingManagement(args(argsBuilder).build)

    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param optimized Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore
     * @return builder
     */
    def optimized(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.builder
      builder.optimized(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureOnlineStore
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
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
   *  * projects/{{project}}/locations/{{region}}/featureOnlineStores/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featureonlinestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureOnlineStoreIamMember:AiFeatureOnlineStoreIamMember editor projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Vertex AI Feature Online Store provides a centralized repository for serving ML features and embedding indexes at low latency. The Feature Online Store is a top-level container.
   * 
   *  To get more information about FeatureOnlineStore, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureOnlineStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureOnlineStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
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
   *          var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
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
   *          var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
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
   *  # IAM policy for Vertex AI FeaturestoreEntitytype
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
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
   *          var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
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
   *          var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
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
   *  * {{featurestore}}/entityTypes/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_entitytype_iam_member.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_entitytype_iam_binding.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamMember:AiFeatureStoreEntityTypeIamMember editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreEntityTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def AiEndpointIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiEndpointIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.Builder)
    /**
     * @param monitoringConfig The default monitoring configuration for all Features under this EntityType.
     *  If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     *  Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

  /**
   * An endpoint indexes are deployed into. An index endpoint can have multiple deployed indexes.
   * 
   *  To get more information about IndexEndpoint, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints/)
   */
  def AiIndexEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiIndexEndpointArgs.builder
    com.pulumi.gcp.vertex.AiIndexEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an IndexEndpoint. If set, this IndexEndpoint and all sub-resources of this IndexEndpoint will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Optional. Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiMetadataStoreArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiMetadataStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  /**
   * An endpoint indexes are deployed into. An index endpoint can have multiple deployed indexes.
   * 
   *  To get more information about IndexEndpointDeployedIndex, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#DeployedIndex)
   */
  def AiIndexEndpointDeployedIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.builder
    com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type VertexFunctions = com.pulumi.gcp.vertex.VertexFunctions
  object VertexFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.vertex.VertexFunctions.*
  extension (self: VertexFunctions.type)
    /**
     * Retrieves the current IAM policy data for endpoint
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiEndpointIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiEndpointIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiEndpointIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for endpoint
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiEndpointIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiEndpointIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiEndpointIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featuregroup
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeatureGroupIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeatureGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureGroupIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featuregroup
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeatureGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeatureGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureGroupIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestorefeatureview
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeatureOnlineStoreFeatureviewIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreFeatureviewIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestorefeatureview
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeatureOnlineStoreFeatureviewIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreFeatureviewIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestore
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeatureOnlineStoreIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestore
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeatureOnlineStoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featurestoreentitytype
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeaturestoreEntitytypeIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreEntitytypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreEntitytypeIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featurestoreentitytype
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeaturestoreEntitytypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreEntitytypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreEntitytypeIamPolicyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featurestore
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeaturestoreIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for featurestore
     *  &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     *  See Provider Versions for more details on beta resources.
     */
    def getAiFeaturestoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreIamPolicyPlain(args(argsBuilder).build)

    /** A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search. */
    def getAiIndex(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiIndexArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiIndexResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiIndexArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiIndex(args(argsBuilder).build)

    /** A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search. */
    def getAiIndexPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiIndexPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiIndexResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiIndexPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiIndexPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for reasoningengine */
    def getAiReasoningEngineIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for reasoningengine */
    def getAiReasoningEngineIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineIamPolicyPlain(args(argsBuilder).build)

    /** Get the output of a query sent to a Vertex AI Reasoning Engine agent. */
    def getAiReasoningEngineQuery(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineQueryResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineQuery(args(argsBuilder).build)

    /** Get the output of a query sent to a Vertex AI Reasoning Engine agent. */
    def getAiReasoningEngineQueryPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineQueryResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineQueryPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder)
    /**
     * @param bigQuerySource Configures how data is supposed to be extracted from a BigQuery source to be loaded onto the FeatureOnlineStore.
     *  Structure is documented below.
     * @return builder
     */
    def bigQuerySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.builder
      builder.bigQuerySource(args(argsBuilder).build)

    /**
     * @param featureRegistrySource Configures the features from a Feature Registry source that need to be loaded onto the FeatureOnlineStore.
     *  Structure is documented below.
     * @return builder
     */
    def featureRegistrySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.builder
      builder.featureRegistrySource(args(argsBuilder).build)

    /**
     * @param syncConfig Configures when data is to be synced/updated for this FeatureView. At the end of the sync the latest featureValues for each entityId of this FeatureView are made ready for online serving.
     *  Structure is documented below.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

    /**
     * @param vectorSearchConfig (Optional, Beta)
     *  Configuration for vector search. It contains the required configurations to create an index from source data, so that approximate nearest neighbor (a.k.a ANN) algorithms search can be performed during online serving.
     *  Structure is documented below.
     * @return builder
     */
    def vectorSearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.builder
      builder.vectorSearchConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder)
    /**
     * @param contextSpec (Optional, Beta)
     *  Optional. Configuration for how Agent Engine sub-resources should manage context.
     *  Structure is documented below.
     * @return builder
     */
    def contextSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.builder
      builder.contextSpec(args(argsBuilder).build)

    /**
     * @param encryptionSpec Optional. Customer-managed encryption key spec for a ReasoningEngine.
     *  If set, this ReasoningEngine and all sub-resources of this ReasoningEngine
     *  will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param spec Optional. Configurations of the ReasoningEngine.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   *  * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved.
   *  * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.vertex.AiReasoningEngineIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
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
   *          var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
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
   *          var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
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
   *          var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI ReasoningEngine
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   *  * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved.
   *  * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.vertex.AiReasoningEngineIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
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
   *          var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
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
   *          var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
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
   *          var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
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
   *  * projects/{{project}}/locations/{{region}}/reasoningEngines/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI reasoningengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_reasoning_engine_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_reasoning_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiReasoningEngineIamMember:AiReasoningEngineIamMember editor projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiReasoningEngineIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngineIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiTensorboardArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-resources of this Tensorboard will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiTensorboardArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  /**
   * A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
   * 
   *  To get more information about Index, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexes/)
   */
  def AiIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiIndexArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiIndexArgs.builder
    com.pulumi.gcp.vertex.AiIndex(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Create an Endpoint and deploy a Model Garden model to it.
   * 
   *  To get more information about EndpointWithModelGardenDeployment, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations/deploy)
   *  * How-to Guides
   *      * [Overview of Model Garden](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/explore-models)
   *      * [Overview of self-deployed models](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/self-deployed-models)
   *      * [Use models in Model Garden](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/use-models)
   */
  def AiEndpointWithModelGardenDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.builder
    com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   *  * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved.
   *  * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.vertex.AiReasoningEngineIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
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
   *          var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
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
   *          var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
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
   *          var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI ReasoningEngine
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   *  * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved.
   *  * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.vertex.AiReasoningEngineIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
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
   *          var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
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
   *          var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
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
   *          var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
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
   *  * projects/{{project}}/locations/{{region}}/reasoningEngines/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI reasoningengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_reasoning_engine_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_reasoning_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiReasoningEngineIamBinding:AiReasoningEngineIamBinding editor projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiReasoningEngineIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngineIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
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
   *          var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
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
   *          var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
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
   *  # IAM policy for Vertex AI FeaturestoreEntitytype
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
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
   *          var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
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
   *          var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
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
   *  * {{featurestore}}/entityTypes/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_entitytype_iam_member.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_entitytype_iam_binding.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamBinding:AiFeatureStoreEntityTypeIamBinding editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreEntityTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureOnlineStore
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
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
   *  * projects/{{project}}/locations/{{region}}/featureOnlineStores/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featureonlinestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureOnlineStoreIamBinding:AiFeatureOnlineStoreIamBinding editor projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureOnlineStore
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *              .region(featureOnlineStore.region())
   *              .featureOnlineStore(featureOnlineStore.name())
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
   *  * projects/{{project}}/locations/{{region}}/featureOnlineStores/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featureonlinestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureOnlineStoreIamPolicy:AiFeatureOnlineStoreIamPolicy editor projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  def AiEndpointIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiEndpointIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
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
   *          var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
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
   *          var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
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
   *  # IAM policy for Vertex AI FeaturestoreEntitytype
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved.
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
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
   *          var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
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
   *          var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *              .featurestore(entity.featurestore())
   *              .entitytype(entity.name())
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
   *  * {{featurestore}}/entityTypes/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_entitytype_iam_member.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_entitytype_iam_binding.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreEntityTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEndpointArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param predictRequestResponseLoggingConfig Configures the request-response logging for online prediction.
     *  Structure is documented below.
     * @return builder
     */
    def predictRequestResponseLoggingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.builder
      builder.predictRequestResponseLoggingConfig(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   *  * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved.
   *  * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.vertex.AiReasoningEngineIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
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
   *          var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
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
   *          var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
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
   *          var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI ReasoningEngine
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   *  * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved.
   *  * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.vertex.AiReasoningEngineIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
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
   *          var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
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
   *          var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiReasoningEngineIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   *  import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
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
   *          var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *              .project(reasoningEngine.project())
   *              .region(reasoningEngine.region())
   *              .reasoningEngine(reasoningEngine.name())
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
   *  * projects/{{project}}/locations/{{region}}/reasoningEngines/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI reasoningengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_reasoning_engine_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_reasoning_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiReasoningEngineIamPolicy:AiReasoningEngineIamPolicy editor projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiReasoningEngineIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder)
    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param onlineServingConfig Config for online serving resources.
     *  Structure is documented below.
     * @return builder
     */
    def onlineServingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.builder
      builder.onlineServingConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved.
   *  * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureGroupIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
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
   *          var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
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
   *          var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
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
   *          var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureGroup
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved.
   *  * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureGroupIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
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
   *          var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
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
   *          var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
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
   *          var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
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
   *  * projects/{{project}}/locations/{{region}}/featureGroups/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featuregroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember editor projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Instance of a metadata store. Contains a set of metadata that can be queried.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about MetadataStore, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.metadataStores)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiMetadataStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiMetadataStoreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiMetadataStoreArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiMetadataStore(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureOnlineStoreFeatureview
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
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
   *  * {{feature_online_store}}/featureViews/{{name}}
   *  * {{feature_online_store}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_featureview_iam_member.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_featureview_iam_binding.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamPolicy:AiFeatureOnlineStoreFeatureviewIamPolicy editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreFeatureviewIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiRagEngineConfigArgs.Builder)
    /**
     * @param ragManagedDbConfig Required. The config of the RagManagedDb used by RagEngine.
     *  Structure is documented below.
     * @return builder
     */
    def ragManagedDbConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiRagEngineConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.builder
      builder.ragManagedDbConfig(args(argsBuilder).build)

  def AiEndpointIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiEndpointIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved.
   *  * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureGroupIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
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
   *          var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
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
   *          var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
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
   *          var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureGroup
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved.
   *  * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureGroupIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
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
   *          var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
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
   *          var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
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
   *          var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
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
   *  * projects/{{project}}/locations/{{region}}/featureGroups/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featuregroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureGroupIamBinding:AiFeatureGroupIamBinding editor projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder)
    /**
     * @param automaticResources A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration.
     *  Structure is documented below.
     * @return builder
     */
    def automaticResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.builder
      builder.automaticResources(args(argsBuilder).build)

    /**
     * @param dedicatedResources A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field minReplicaCount must be set to a value strictly greater than 0, or else validation will fail. We don&#39;t provide SLA when minReplicaCount=1. If maxReplicaCount is not set, the default value is minReplicaCount. The max allowed replica count is 1000.
     *  Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
     *  Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard.
     *  Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
     *  n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

    /**
     * @param deployedIndexAuthConfig If set, the authentication is enabled for the private endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def deployedIndexAuthConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.builder
      builder.deployedIndexAuthConfig(args(argsBuilder).build)

  /**
   * Models are deployed into it, and afterwards Endpoint is called to obtain predictions and explanations.
   * 
   *  To get more information about Endpoint, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.endpoints)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiEndpointArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved.
   *  * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
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
   *          var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
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
   *          var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI Featurestore
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved.
   *  * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
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
   *          var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
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
   *          var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
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
   *  * projects/{{project}}/locations/{{region}}/featurestores/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featurestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureStoreIamMember:AiFeatureStoreIamMember editor projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &#39;DeploymentResourcePool can be shared by multiple deployed models,
   *  whose underlying specification consists of dedicated resources.&#39;
   * 
   *  To get more information about DeploymentResourcePool, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.deploymentResourcePools)
   */
  def AiDeploymentResourcePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiDeploymentResourcePool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved.
   *  * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureGroupIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
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
   *          var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
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
   *          var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
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
   *          var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureGroup
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved.
   *  * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureGroupIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
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
   *          var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
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
   *          var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureGroupIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
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
   *          var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *              .region(featureGroup.region())
   *              .featureGroup(featureGroup.name())
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
   *  * projects/{{project}}/locations/{{region}}/featureGroups/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featuregroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureGroupIamPolicy:AiFeatureGroupIamPolicy editor projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureGroupArgs.Builder)
    /**
     * @param bigQuery Indicates that features for this group come from BigQuery Table/View. By default treats the source as a sparse time series source, which is required to have an entityId and a featureTimestamp column in the source.
     *  Structure is documented below.
     * @return builder
     */
    def bigQuery(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureGroupArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.builder
      builder.bigQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Vertex AI RAG Engine lets you scale your RagManagedDb instance based on your usage and performance requirements using a choice of two tiers, and optionally, lets you delete your Vertex AI RAG Engine data using a third tier. The tier is a project-level setting that&#39;s available in the RagEngineConfig resource that impacts all RAG corpora using RagManagedDb. The following tiers are available in RagEngineConfig: Basic, Scaled and Unprovisioned.
   * 
   *  To get more information about RagEngineConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/reference/rest/v1/RagEngineConfig)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/rag-engine/understanding-ragmanageddb)
   */
  def AiRagEngineConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiRagEngineConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiRagEngineConfigArgs.builder
    com.pulumi.gcp.vertex.AiRagEngineConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.Builder)
    /**
     * @param dedicatedResources The underlying dedicated resources that the deployment resource pool uses.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.AiIndexArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Index. If set, this Index and all sub-resources of this Index will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param metadata Additional information about the Index.
     *  Although this field is not marked as required in the API specification, it is currently required when creating an Index and must be provided.
     *  Attempts to create an Index without this field will result in an API error.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder]):
        com.pulumi.gcp.vertex.AiIndexArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  /**
   * Vertex AI Feature Group Feature is feature metadata information.
   * 
   *  To get more information about FeatureGroupFeature, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.featureGroups.features)
   *  * How-to Guides
   *      * [Creating a Feature](https://cloud.google.com/vertex-ai/docs/featurestore/latest/create-feature)
   */
  def AiFeatureGroupFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupFeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupFeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureGroupFeature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureOnlineStoreFeatureview
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
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
   *  * {{feature_online_store}}/featureViews/{{name}}
   *  * {{feature_online_store}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_featureview_iam_member.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_featureview_iam_binding.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreFeatureviewIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * ReasoningEngine provides a customizable runtime for models to determine which actions to take and in which order.
   * 
   *  To get more information about ReasoningEngine, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.reasoningEngines/)
   *  * How-to Guides
   *      * [Develop and deploy agents on Vertex AI Agent Engine](https://cloud.google.com/vertex-ai/generative-ai/docs/agent-engine/quickstart)
   */
  def AiReasoningEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngine(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Config of GenAI caching features. This is a singleton resource.
   * 
   *  To get more information about CacheConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/reference/rest/v1/projects/updateCacheConfig)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/reference/rest/Shared.Types/CacheConfig)
   */
  def AiCacheConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiCacheConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiCacheConfigArgs.builder
    com.pulumi.gcp.vertex.AiCacheConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiDatasetArgs.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.AiDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  /**
   * An entity type is a type of object in a system that needs to be modeled and have stored information about. For example, driver is an entity type, and driver0 is an instance of an entity type driver.
   * 
   *  To get more information about FeaturestoreEntitytype, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureStoreEntityType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureStoreEntityType(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI FeatureOnlineStoreFeatureview
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved.
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
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
   *          var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
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
   *          var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
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
   *          var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *              .region(featureview.region())
   *              .featureOnlineStore(featureview.featureOnlineStore())
   *              .featureView(featureview.name())
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
   *  * {{feature_online_store}}/featureViews/{{name}}
   *  * {{feature_online_store}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_featureview_iam_member.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_feature_online_store_featureview_iam_binding.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamBinding:AiFeatureOnlineStoreFeatureviewIamBinding editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreFeatureviewIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreState.Builder)
    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param onlineServingConfig Config for online serving resources.
     *  Structure is documented below.
     * @return builder
     */
    def onlineServingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.builder
      builder.onlineServingConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagEngineConfigState.Builder)
    /**
     * @param ragManagedDbConfig Required. The config of the RagManagedDb used by RagEngine.
     *  Structure is documented below.
     * @return builder
     */
    def ragManagedDbConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.builder
      builder.ragManagedDbConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeState.Builder)
    /**
     * @param monitoringConfig The default monitoring configuration for all Features under this EntityType.
     *  If this is populated with [FeaturestoreMonitoringConfig.monitoring_interval] specified, snapshot analysis monitoring is enabled. Otherwise, snapshot analysis monitoring is disabled.
     *  Structure is documented below.
     * @return builder
     */
    def monitoringConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.builder
      builder.monitoringConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder)
    /**
     * @param deployedModels Output only. The models deployed in this Endpoint. To add or remove DeployedModels use EndpointService.DeployModel and EndpointService.UndeployModel respectively. Models can also be deployed and undeployed using the [Cloud Console](https://console.cloud.google.com/vertex-ai/).
     *  Structure is documented below.
     * @return builder
     */
    def deployedModels(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.builder
      builder.deployedModels(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Endpoint. If set, this Endpoint and all sub-resources of this Endpoint will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param predictRequestResponseLoggingConfig Configures the request-response logging for online prediction.
     *  Structure is documented below.
     * @return builder
     */
    def predictRequestResponseLoggingConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.builder
      builder.predictRequestResponseLoggingConfig(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiTensorboardState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-resources of this Tensorboard will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiTensorboardState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiTensorboardEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiMetadataStoreState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a MetadataStore. If set, this MetadataStore and all sub-resources of this MetadataStore will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiMetadataStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiMetadataStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param states State information of the MetadataStore.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiMetadataStoreStateArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiMetadataStoreState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiMetadataStoreStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.Builder)
    /**
     * @param algorithmConfig The configuration with regard to the algorithms used for efficient search. This field may be required based on your configuration.
     *  Structure is documented below.
     * @return builder
     */
    def algorithmConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.builder
      builder.algorithmConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexState.Builder)
    /**
     * @param deployedIndexes The pointers to DeployedIndexes created from this Index. An Index can be only deleted if all its DeployedIndexes had been undeployed first.
     *  Structure is documented below.
     * @return builder
     */
    def deployedIndexes(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexDeployedIndexArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexDeployedIndexArgs.builder
      builder.deployedIndexes(args.map(_(argsBuilder).build)*)

    /**
     * @param encryptionSpec Customer-managed encryption key spec for an Index. If set, this Index and all sub-resources of this Index will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param indexStats Stats of the index resource.
     *  Structure is documented below.
     * @return builder
     */
    def indexStats(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexIndexStatArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexIndexStatArgs.builder
      builder.indexStats(args.map(_(argsBuilder).build)*)

    /**
     * @param metadata Additional information about the Index.
     *  Although this field is not marked as required in the API specification, it is currently required when creating an Index and must be provided.
     *  Attempts to create an Index without this field will result in an API error.
     *  Structure is documented below.
     * @return builder
     */
    def metadata(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.builder
      builder.metadata(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder)
    /**
     * @param config The configuration of the Matching Engine Index.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder)
    /**
     * @param automaticResources A description of resources that the DeployedIndex uses, which to large degree are decided by Vertex AI, and optionally allows only a modest additional configuration.
     *  Structure is documented below.
     * @return builder
     */
    def automaticResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexAutomaticResourcesArgs.builder
      builder.automaticResources(args(argsBuilder).build)

    /**
     * @param dedicatedResources A description of resources that are dedicated to the DeployedIndex, and that need a higher degree of manual configuration. The field minReplicaCount must be set to a value strictly greater than 0, or else validation will fail. We don&#39;t provide SLA when minReplicaCount=1. If maxReplicaCount is not set, the default value is minReplicaCount. The max allowed replica count is 1000.
     *  Available machine types for SMALL shard: e2-standard-2 and all machine types available for MEDIUM and LARGE shard.
     *  Available machine types for MEDIUM shard: e2-standard-16 and all machine types available for LARGE shard.
     *  Available machine types for LARGE shard: e2-highmem-16, n2d-standard-32.
     *  n1-standard-16 and n1-standard-32 are still available, but we recommend e2-standard-16 and e2-highmem-16 for cost efficiency.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

    /**
     * @param deployedIndexAuthConfig If set, the authentication is enabled for the private endpoint.
     *  Structure is documented below.
     * @return builder
     */
    def deployedIndexAuthConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.builder
      builder.deployedIndexAuthConfig(args(argsBuilder).build)

    /**
     * @param privateEndpoints Provides paths for users to send requests directly to the deployed index services running on Cloud via private services access. This field is populated if [network](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#IndexEndpoint.FIELDS.network) is configured.
     *  Structure is documented below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexState.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder)
    /**
     * @param automaticResources (Output)
     *  A description of resources that to large degree are decided by Vertex AI, and require only a modest additional configuration.
     *  Structure is documented below.
     * @return builder
     */
    def automaticResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelAutomaticResourceArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelAutomaticResourceArgs.builder
      builder.automaticResources(args.map(_(argsBuilder).build)*)

    /**
     * @param dedicatedResources (Output)
     *  A description of resources that are dedicated to the DeployedModel, and that need a higher degree of manual configuration.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.builder
      builder.dedicatedResources(args.map(_(argsBuilder).build)*)

    /**
     * @param privateEndpoints (Output)
     *  Output only. Provide paths for users to send predict/explain/health requests directly to the deployed model services running on Cloud via private services access. This field is populated if network is configured.
     *  Structure is documented below.
     * @return builder
     */
    def privateEndpoints(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelPrivateEndpointArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelPrivateEndpointArgs.builder
      builder.privateEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     *  Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder)
    /**
     * @param containerSpec Deploy from a container image with a defined entrypoint and commands.
     *  Structure is documented below.
     * @return builder
     */
    def containerSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecContainerSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecContainerSpecArgs.builder
      builder.containerSpec(args(argsBuilder).build)

    /**
     * @param deploymentSpec Optional. The specification of a Reasoning Engine deployment.
     *  Structure is documented below.
     * @return builder
     */
    def deploymentSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.builder
      builder.deploymentSpec(args(argsBuilder).build)

    /**
     * @param packageSpec Optional. User provided package spec of the ReasoningEngine.
     *  Ignored when users directly specify a deployment image through
     *  deploymentSpec.first_party_image_override, but keeping the
     *  fieldBehavior to avoid introducing breaking changes.
     *  Structure is documented below.
     * @return builder
     */
    def packageSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecPackageSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecPackageSpecArgs.builder
      builder.packageSpec(args(argsBuilder).build)

    /**
     * @param sourceCodeSpec Specification for deploying from source code.
     *  Structure is documented below.
     * @return builder
     */
    def sourceCodeSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.builder
      builder.sourceCodeSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     *  Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder)
    /**
     * @param developerConnectSource Specification for source code to be fetched from a Git repository managed through the Developer Connect service.
     *  Structure is documented below.
     * @return builder
     */
    def developerConnectSource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.builder
      builder.developerConnectSource(args(argsBuilder).build)

    /**
     * @param imageSpec Configuration for building an image with custom config file.
     *  Structure is documented below.
     * @return builder
     */
    def imageSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecImageSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecImageSpecArgs.builder
      builder.imageSpec(args(argsBuilder).build)

    /**
     * @param inlineSource Source code is provided directly in the request.
     *  Structure is documented below.
     * @return builder
     */
    def inlineSource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecInlineSourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecInlineSourceArgs.builder
      builder.inlineSource(args(argsBuilder).build)

    /**
     * @param pythonSpec Specification for running a Python application from source.
     *  Structure is documented below.
     * @return builder
     */
    def pythonSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecPythonSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecPythonSpecArgs.builder
      builder.pythonSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolState.Builder)
    /**
     * @param dedicatedResources The underlying dedicated resources that the deployment resource pool uses.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder)
    /**
     * @param privateServiceConnectConfig The configuration for Private Service Connect (PSC).
     *  Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder)
    /**
     * @param autoScaling Autoscaling config applied to Bigtable Instance.
     *  Structure is documented below.
     * @return builder
     */
    def autoScaling(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableAutoScalingArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableAutoScalingArgs.builder
      builder.autoScaling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder)
    /**
     * @param autoscalingMetricSpecs A list of the metric specifications that overrides a resource utilization metric.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingMetricSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesAutoscalingMetricSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesAutoscalingMetricSpecArgs.builder
      builder.autoscalingMetricSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param machineSpec The specification of a single machine used by the prediction
     *  Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesMachineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDeploymentResourcePoolDedicatedResourcesMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.Builder)
    /**
     * @param config The Developer Connect configuration that defines the specific repository, revision, and directory to use as the source code root.
     *  Structure is documented below.
     * @return builder
     */
    def config(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecSourceCodeSpecDeveloperConnectSourceConfigArgs.builder
      builder.config(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder)
    /**
     * @param contextSpec (Optional, Beta)
     *  Optional. Configuration for how Agent Engine sub-resources should manage context.
     *  Structure is documented below.
     * @return builder
     */
    def contextSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.builder
      builder.contextSpec(args(argsBuilder).build)

    /**
     * @param encryptionSpec Optional. Customer-managed encryption key spec for a ReasoningEngine.
     *  If set, this ReasoningEngine and all sub-resources of this ReasoningEngine
     *  will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param spec Optional. Configurations of the ReasoningEngine.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder)
    /**
     * @param bigqueryDestination BigQuery table for logging. If only given a project, a new dataset will be created with name `logging_&lt;endpoint-display-name&gt;_&lt;endpoint-id&gt;` where will be made BigQuery-dataset-name compatible (e.g. most special characters will become underscores). If no table name is given, a new table will be created with name `requestResponseLogging`
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDestination(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigBigqueryDestinationArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPredictRequestResponseLoggingConfigBigqueryDestinationArgs.builder
      builder.bigqueryDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder)
    /**
     * @param envs Optional. Environment variables to be set with the Reasoning
     *  Engine deployment.
     *  Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecEnvArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param pscInterfaceConfig Optional. Configuration for PSC-Interface.
     *  Structure is documented below.
     * @return builder
     */
    def pscInterfaceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.builder
      builder.pscInterfaceConfig(args(argsBuilder).build)

    /**
     * @param secretEnvs Optional. Environment variables where the value is a secret in
     *  Cloud Secret Manager. To use this feature, add &#39;Secret Manager
     *  Secret Accessor&#39; role (roles/secretmanager.secretAccessor) to AI
     *  Platform Reasoning Engine service Agent.
     *  Structure is documented below.
     * @return builder
     */
    def secretEnvs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.builder
      builder.secretEnvs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder)
    /**
     * @param autoscalingMetricSpecs (Output)
     *  The metric specifications that overrides a resource utilization metric (CPU utilization, accelerator&#39;s duty cycle, and so on) target value (default to 60 if not set). At most one entry is allowed per metric. If machine_spec.accelerator_count is above 0, the autoscaling will be based on both CPU utilization and accelerator&#39;s duty cycle metrics and scale up when either metrics exceeds its target value while scale down if both metrics are under their target value. The default target value is 60 for both metrics. If machine_spec.accelerator_count is 0, the autoscaling will be based on CPU utilization metric only with default target value 60 if not explicitly set. For example, in the case of Online Prediction, if you want to override target CPU utilization to 80, you should set autoscaling_metric_specs.metric_name to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and autoscaling_metric_specs.target to `80`.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingMetricSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceAutoscalingMetricSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceAutoscalingMetricSpecArgs.builder
      builder.autoscalingMetricSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param machineSpecs (Output)
     *  The specification of a single machine used by the prediction.
     *  Structure is documented below.
     * @return builder
     */
    def machineSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceMachineSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointDeployedModelDedicatedResourceMachineSpecArgs.builder
      builder.machineSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder)
    /**
     * @param bruteForceConfig Configuration options for using brute force search, which simply implements the
     *  standard linear search in the database for each query.
     * @return builder
     */
    def bruteForceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigBruteForceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigBruteForceConfigArgs.builder
      builder.bruteForceConfig(args(argsBuilder).build)

    /**
     * @param treeAhConfig Configuration options for using the tree-AH algorithm (Shallow tree + Asymmetric Hashing).
     *  Please refer to this paper for more details: https://arxiv.org/abs/1908.10396
     *  Structure is documented below.
     * @return builder
     */
    def treeAhConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigTreeAhConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexMetadataConfigAlgorithmConfigTreeAhConfigArgs.builder
      builder.treeAhConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder)
    /**
     * @param dedicatedResources A description of resources that are dedicated to a DeployedModel or
     *  DeployedIndex, and that need a higher degree of manual configuration.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedResources(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.builder
      builder.dedicatedResources(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.Builder)
    /**
     * @param secretRef Reference to a secret stored in the Cloud Secret Manager
     *  that will provide the value for this environment variable.
     *  Structure is documented below.
     * @return builder
     */
    def secretRef(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvSecretRefArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecSecretEnvSecretRefArgs.builder
      builder.secretRef(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.Builder)
    /**
     * @param pscAutomatedEndpoints (Output)
     *  PscAutomatedEndpoints is populated if private service connect is enabled if PscAutomatedConfig is set.
     *  Structure is documented below.
     * @return builder
     */
    def pscAutomatedEndpoints(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointPscAutomatedEndpointArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexPrivateEndpointPscAutomatedEndpointArgs.builder
      builder.pscAutomatedEndpoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder)
    /**
     * @param bigQuerySource The BigQuery source URI that points to either a BigQuery Table or View.
     *  Structure is documented below.
     * @return builder
     */
    def bigQuerySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryBigQuerySourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryBigQuerySourceArgs.builder
      builder.bigQuerySource(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.Builder)
    /**
     * @param granularTtlConfig The granular TTL configuration of the memories in the Memory Bank.
     *  Structure is documented below.
     * @return builder
     */
    def granularTtlConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigGranularTtlConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigGranularTtlConfigArgs.builder
      builder.granularTtlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder)
    /**
     * @param featureGroups List of features that need to be synced to Online Store.
     *  Structure is documented below.
     * @return builder
     */
    def featureGroups(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroupArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceFeatureGroupArgs.builder
      builder.featureGroups(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder)
    /**
     * @param bigtable Settings for Cloud Bigtable instance that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore.
     *  Structure is documented below.
     * @return builder
     */
    def bigtable(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreBigtableArgs.builder
      builder.bigtable(args(argsBuilder).build)

    /**
     * @param dedicatedServingEndpoint The dedicated serving endpoint for this FeatureOnlineStore, which is different from common vertex service endpoint. Only need to be set when you choose Optimized storage type or enable EmbeddingManagement. Will use public endpoint by default.
     *  Structure is documented below.
     * @return builder
     */
    def dedicatedServingEndpoint(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.builder
      builder.dedicatedServingEndpoint(args(argsBuilder).build)

    /**
     * @param embeddingManagement (Optional, Beta, Deprecated)
     *  The settings for embedding management in FeatureOnlineStore. Embedding management can only be set for BigTable. It is enabled by default for optimized storagetype.
     *  Structure is documented below.
     * 
     *  &gt; **Warning:** `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     * @return builder
     * @deprecated `embeddingManagement` is deprecated. This field is no longer needed anymore and embedding management is automatically enabled when specifying Optimized storage type
     */
    @deprecated def embeddingManagement(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEmbeddingManagementArgs.builder
      builder.embeddingManagement(args(argsBuilder).build)

    /**
     * @param encryptionSpec If set, both of the online and offline data storage will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param optimized Settings for the Optimized store that will be created to serve featureValues for all FeatureViews under this FeatureOnlineStore
     * @return builder
     */
    def optimized(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreOptimizedArgs.builder
      builder.optimized(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.Builder)
    /**
     * @param pscAutomationConfigs PSC config that is used to automatically create PSC endpoints in the user projects.
     *  Structure is documented below.
     * @return builder
     */
    def pscAutomationConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigPscAutomationConfigsArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigPrivateServiceConnectConfigPscAutomationConfigsArgs.builder
      builder.pscAutomationConfigs(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder)
    /**
     * @param deployConfig The deploy config to use for the deployment.
     *  Structure is documented below.
     * @return builder
     */
    def deployConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigArgs.builder
      builder.deployConfig(args(argsBuilder).build)

    /**
     * @param endpointConfig The endpoint config to use for the deployment.
     *  Structure is documented below.
     * @return builder
     */
    def endpointConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentEndpointConfigArgs.builder
      builder.endpointConfig(args(argsBuilder).build)

    /**
     * @param modelConfig The model config to use for the deployment.
     *  Structure is documented below.
     * @return builder
     */
    def modelConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.builder
      builder.modelConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder)
    /**
     * @param envs List of environment variables to set in the container. After the container
     *  starts running, code running in the container can read these environment
     *  variables.
     *  Additionally, the command and
     *  args fields can reference these variables. Later
     *  entries in this list can also reference earlier entries. For example, the
     *  following example sets the variable `VAR_2` to have the value `foo bar`:
     * 
     *  If you switch the order of the variables in the example, then the expansion
     *  does not occur.
     *  This field corresponds to the `env` field of the Kubernetes Containers
     *  [v1 core
     *  API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
     *  Structure is documented below.
     * @return builder
     */
    def envs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecEnvArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecEnvArgs.builder
      builder.envs(args.map(_(argsBuilder).build)*)

    /**
     * @param grpcPorts List of ports to expose from the container. Vertex AI sends gRPC
     *  prediction requests that it receives to the first port on this list. Vertex
     *  AI also sends liveness and health checks to this port.
     *  If you do not specify this field, gRPC requests to the container will be
     *  disabled.
     *  Vertex AI does not use ports other than the first one listed. This field
     *  corresponds to the `ports` field of the Kubernetes Containers v1 core API.
     *  Structure is documented below.
     * @return builder
     */
    def grpcPorts(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecGrpcPortArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecGrpcPortArgs.builder
      builder.grpcPorts(args.map(_(argsBuilder).build)*)

    /**
     * @param healthProbe Probe describes a health check to be performed against a container to
     *  determine whether it is alive or ready to receive traffic.
     *  Structure is documented below.
     * @return builder
     */
    def healthProbe(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.builder
      builder.healthProbe(args(argsBuilder).build)

    /**
     * @param livenessProbe Probe describes a health check to be performed against a container to
     *  determine whether it is alive or ready to receive traffic.
     *  Structure is documented below.
     * @return builder
     */
    def livenessProbe(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.builder
      builder.livenessProbe(args(argsBuilder).build)

    /**
     * @param ports List of ports to expose from the container. Vertex AI sends any
     *  prediction requests that it receives to the first port on this list. Vertex
     *  AI also sends
     *  [liveness and health
     *  checks](https://cloud.google.com/vertex-ai/docs/predictions/custom-container-requirements#liveness)
     *  to this port.
     *  If you do not specify this field, it defaults to following value:
     * 
     *  Vertex AI does not use ports other than the first one listed. This field
     *  corresponds to the `ports` field of the Kubernetes Containers
     *  [v1 core
     *  API](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
     *  Structure is documented below.
     * @return builder
     */
    def ports(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecPortArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecPortArgs.builder
      builder.ports(args.map(_(argsBuilder).build)*)

    /**
     * @param startupProbe Probe describes a health check to be performed against a container to
     *  determine whether it is alive or ready to receive traffic.
     *  Structure is documented below.
     * @return builder
     */
    def startupProbe(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.builder
      builder.startupProbe(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder)
    /**
     * @param generationConfig Configuration for how to generate memories for the Memory Bank.
     *  Structure is documented below.
     * @return builder
     */
    def generationConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigGenerationConfigArgs.builder
      builder.generationConfig(args(argsBuilder).build)

    /**
     * @param similaritySearchConfig Configuration for how to perform similarity search on memories.
     *  Structure is documented below.
     * @return builder
     */
    def similaritySearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigSimilaritySearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigSimilaritySearchConfigArgs.builder
      builder.similaritySearchConfig(args(argsBuilder).build)

    /**
     * @param ttlConfig Configuration for automatic TTL (&#34;time-to-live&#34;) of the memories in the Memory Bank.
     *  Structure is documented below.
     * @return builder
     */
    def ttlConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigTtlConfigArgs.builder
      builder.ttlConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder)
    /**
     * @param pscAutomationConfigs List of projects and networks where the PSC endpoints will be created. This field is used by Online Inference(Prediction) only.
     *  Structure is documented below.
     * @return builder
     */
    def pscAutomationConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.builder
      builder.pscAutomationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiDatasetState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiDatasetState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder)
    /**
     * @param memoryBankConfig Specification for a Memory Bank, which manages memories for the Agent Engine.
     *  Structure is documented below.
     * @return builder
     */
    def memoryBankConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineContextSpecMemoryBankConfigArgs.builder
      builder.memoryBankConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder)
    /**
     * @param categoricalThresholdConfig Threshold for categorical features of anomaly detection. This is shared by all types of Featurestore Monitoring for categorical features (i.e. Features with type (Feature.ValueType) BOOL or STRING).
     *  Structure is documented below.
     * @return builder
     */
    def categoricalThresholdConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigCategoricalThresholdConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigCategoricalThresholdConfigArgs.builder
      builder.categoricalThresholdConfig(args(argsBuilder).build)

    /**
     * @param importFeaturesAnalysis The config for ImportFeatures Analysis Based Feature Monitoring.
     *  Structure is documented below.
     * @return builder
     */
    def importFeaturesAnalysis(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigImportFeaturesAnalysisArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigImportFeaturesAnalysisArgs.builder
      builder.importFeaturesAnalysis(args(argsBuilder).build)

    /**
     * @param numericalThresholdConfig Threshold for numerical features of anomaly detection. This is shared by all objectives of Featurestore Monitoring for numerical features (i.e. Features with type (Feature.ValueType) DOUBLE or INT64).
     *  Structure is documented below.
     * @return builder
     */
    def numericalThresholdConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigNumericalThresholdConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigNumericalThresholdConfigArgs.builder
      builder.numericalThresholdConfig(args(argsBuilder).build)

    /**
     * @param snapshotAnalysis The config for Snapshot Analysis Based Feature Monitoring.
     *  Structure is documented below.
     * @return builder
     */
    def snapshotAnalysis(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisArgs.builder
      builder.snapshotAnalysis(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder)
    /**
     * @param autoscalingMetricSpecs The metric specifications that overrides a resource
     *  utilization metric (CPU utilization, accelerator&#39;s duty cycle, and so on)
     *  target value (default to 60 if not set). At most one entry is allowed per
     *  metric.
     *  If machine_spec.accelerator_count is
     *  above 0, the autoscaling will be based on both CPU utilization and
     *  accelerator&#39;s duty cycle metrics and scale up when either metrics exceeds
     *  its target value while scale down if both metrics are under their target
     *  value. The default target value is 60 for both metrics.
     *  If machine_spec.accelerator_count is
     *  0, the autoscaling will be based on CPU utilization metric only with
     *  default target value 60 if not explicitly set.
     *  For example, in the case of Online Prediction, if you want to override
     *  target CPU utilization to 80, you should set
     *  autoscaling_metric_specs.metric_name
     *  to `aiplatform.googleapis.com/prediction/online/cpu/utilization` and
     *  autoscaling_metric_specs.target to `80`.
     *  Structure is documented below.
     * @return builder
     */
    def autoscalingMetricSpecs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesAutoscalingMetricSpecArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesAutoscalingMetricSpecArgs.builder
      builder.autoscalingMetricSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param machineSpec Specification of a single machine.
     *  Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupState.Builder)
    /**
     * @param bigQuery Indicates that features for this group come from BigQuery Table/View. By default treats the source as a sparse time series source, which is required to have an entityId and a featureTimestamp column in the source.
     *  Structure is documented below.
     * @return builder
     */
    def bigQuery(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupBigQueryArgs.builder
      builder.bigQuery(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.Builder)
    /**
     * @param reservationAffinity A ReservationAffinity can be used to configure a Vertex AI resource (e.g., a
     *  DeployedModel) to draw its Compute Engine resources from a Shared
     *  Reservation, or exclusively from on-demand capacity.
     *  Structure is documented below.
     * @return builder
     */
    def reservationAffinity(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecReservationAffinityArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentDeployConfigDedicatedResourcesMachineSpecReservationAffinityArgs.builder
      builder.reservationAffinity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder)
    /**
     * @param exec ExecAction specifies a command to execute.
     *  Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeExecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param grpc GrpcAction checks the health of a container using a gRPC service.
     *  Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeGrpcArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGetAction describes an action based on HTTP Get requests.
     *  Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocketAction probes the health of a container by opening a TCP socket
     *  connection.
     *  Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecHealthProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder)
    /**
     * @param pscAutomationConfigs List of projects and networks where the PSC endpoints will be created. This field is used by Online Inference(Prediction) only.
     *  Structure is documented below.
     * @return builder
     */
    def pscAutomationConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointPrivateServiceConnectConfigPscAutomationConfigArgs.builder
      builder.pscAutomationConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder)
    /**
     * @param bruteForceConfig Configuration options for using brute force search, which simply implements the standard linear search in the database for each query. It is primarily meant for benchmarking and to generate the ground truth for approximate search.
     * @return builder
     */
    def bruteForceConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigBruteForceConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigBruteForceConfigArgs.builder
      builder.bruteForceConfig(args(argsBuilder).build)

    /**
     * @param treeAhConfig Configuration options for the tree-AH algorithm (Shallow tree + Asymmetric Hashing). Please refer to this paper for more details: https://arxiv.org/abs/1908.10396
     *  Structure is documented below.
     * @return builder
     */
    def treeAhConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigTreeAhConfigArgs.builder
      builder.treeAhConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder)
    /**
     * @param privateServiceConnectConfig Private service connect config.
     *  Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreDedicatedServingEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder)
    /**
     * @param bigQuerySource Configures how data is supposed to be extracted from a BigQuery source to be loaded onto the FeatureOnlineStore.
     *  Structure is documented below.
     * @return builder
     */
    def bigQuerySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewBigQuerySourceArgs.builder
      builder.bigQuerySource(args(argsBuilder).build)

    /**
     * @param featureRegistrySource Configures the features from a Feature Registry source that need to be loaded onto the FeatureOnlineStore.
     *  Structure is documented below.
     * @return builder
     */
    def featureRegistrySource(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewFeatureRegistrySourceArgs.builder
      builder.featureRegistrySource(args(argsBuilder).build)

    /**
     * @param syncConfig Configures when data is to be synced/updated for this FeatureView. At the end of the sync the latest featureValues for each entityId of this FeatureView are made ready for online serving.
     *  Structure is documented below.
     * @return builder
     */
    def syncConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewSyncConfigArgs.builder
      builder.syncConfig(args(argsBuilder).build)

    /**
     * @param vectorSearchConfig (Optional, Beta)
     *  Configuration for vector search. It contains the required configurations to create an index from source data, so that approximate nearest neighbor (a.k.a ANN) algorithms search can be performed during online serving.
     *  Structure is documented below.
     * @return builder
     */
    def vectorSearchConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewVectorSearchConfigArgs.builder
      builder.vectorSearchConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder)
    /**
     * @param basic Basic tier is a cost-effective and low compute tier suitable for the following cases: Experimenting with RagManagedDb, Small data size, Latency insensitive workload, Only using RAG Engine with external vector DBs.
     *  NOTE: This is the default tier if not explicitly chosen.
     * @return builder
     */
    def basic(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigBasicArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigBasicArgs.builder
      builder.basic(args(argsBuilder).build)

    /**
     * @param scaled Scaled tier offers production grade performance along with autoscaling functionality. It is suitable for customers with large amounts of data or performance sensitive workloads.
     * @return builder
     */
    def scaled(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigScaledArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigScaledArgs.builder
      builder.scaled(args(argsBuilder).build)

    /**
     * @param unprovisioned Disables the RAG Engine service and deletes all your data held within this service. This will halt the billing of the service.
     *  NOTE: Once deleted the data cannot be recovered. To start using RAG Engine again, you will need to update the tier by calling the UpdateRagEngineConfig API.
     * @return builder
     */
    def unprovisioned(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigUnprovisionedArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiRagEngineConfigRagManagedDbConfigUnprovisionedArgs.builder
      builder.unprovisioned(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder)
    /**
     * @param containerSpec Specification of a container for serving predictions. Some fields in this
     *  message correspond to fields in the [Kubernetes Container v1 core
     *  specification](https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#container-v1-core).
     *  Structure is documented below.
     * @return builder
     */
    def containerSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecArgs.builder
      builder.containerSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointState.Builder)
    /**
     * @param encryptionSpec Customer-managed encryption key spec for an IndexEndpoint. If set, this IndexEndpoint and all sub-resources of this IndexEndpoint will be secured by this key.
     *  Structure is documented below.
     * @return builder
     */
    def encryptionSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointEncryptionSpecArgs.builder
      builder.encryptionSpec(args(argsBuilder).build)

    /**
     * @param privateServiceConnectConfig Optional. Configuration for private service connect. `network` and `privateServiceConnectConfig` are mutually exclusive.
     *  Structure is documented below.
     * @return builder
     */
    def privateServiceConnectConfig(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointPrivateServiceConnectConfigArgs.builder
      builder.privateServiceConnectConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder)
    /**
     * @param authProvider Defines the authentication provider that the DeployedIndex uses.
     *  Structure is documented below.
     * @return builder
     */
    def authProvider(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDeployedIndexAuthConfigAuthProviderArgs.builder
      builder.authProvider(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder)
    /**
     * @param machineSpec The minimum number of replicas this DeployedModel will be always deployed on.
     *  Structure is documented below.
     * @return builder
     */
    def machineSpec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesMachineSpecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiIndexEndpointDeployedIndexDedicatedResourcesMachineSpecArgs.builder
      builder.machineSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.Builder)
    /**
     * @param dnsPeeringConfigs Optional. DNS peering configurations.
     *  When specified, Vertex AI will attempt to configure DNS
     *  peering zones in the tenant project VPC to resolve the
     *  specified domains using the target network&#39;s Cloud DNS.
     *  The user must grant the dns.peer role to the Vertex AI
     *  service Agent on the target project.
     *  Structure is documented below.
     * @return builder
     */
    def dnsPeeringConfigs(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigDnsPeeringConfigArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiReasoningEngineSpecDeploymentSpecPscInterfaceConfigDnsPeeringConfigArgs.builder
      builder.dnsPeeringConfigs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureOnlineStoreFeatureviewIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder)
    /**
     * @param exec ExecAction specifies a command to execute.
     *  Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeExecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param grpc GrpcAction checks the health of a container using a gRPC service.
     *  Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeGrpcArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGetAction describes an action based on HTTP Get requests.
     *  Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocketAction probes the health of a container by opening a TCP socket
     *  connection.
     *  Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder)
    /**
     * @param scaling Online serving scaling configuration. Only one of fixedNodeCount and scaling can be set. Setting one will reset the other.
     *  Structure is documented below.
     * @return builder
     */
    def scaling(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigScalingArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigScalingArgs.builder
      builder.scaling(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder)
    /**
     * @param exec ExecAction specifies a command to execute.
     *  Structure is documented below.
     * @return builder
     */
    def exec(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeExecArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeExecArgs.builder
      builder.exec(args(argsBuilder).build)

    /**
     * @param grpc GrpcAction checks the health of a container using a gRPC service.
     *  Structure is documented below.
     * @return builder
     */
    def grpc(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeGrpcArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeGrpcArgs.builder
      builder.grpc(args(argsBuilder).build)

    /**
     * @param httpGet HttpGetAction describes an action based on HTTP Get requests.
     *  Structure is documented below.
     * @return builder
     */
    def httpGet(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeHttpGetArgs.builder
      builder.httpGet(args(argsBuilder).build)

    /**
     * @param tcpSocket TcpSocketAction probes the health of a container by opening a TCP socket
     *  connection.
     *  Structure is documented below.
     * @return builder
     */
    def tcpSocket(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeTcpSocketArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecStartupProbeTcpSocketArgs.builder
      builder.tcpSocket(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.AiFeatureStoreEntityTypeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.Builder)
    /**
     * @param httpHeaders Custom headers to set in the request. HTTP allows repeated headers.
     *  Structure is documented below.
     * @return builder
     */
    def httpHeaders(args: Endofunction[com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetHttpHeaderArgs.Builder]*):
        com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.vertex.inputs.AiEndpointWithModelGardenDeploymentModelConfigContainerSpecLivenessProbeHttpGetHttpHeaderArgs.builder
      builder.httpHeaders(args.map(_(argsBuilder).build)*)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved.
   *  * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
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
   *          var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
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
   *          var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
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
   *  # IAM policy for Vertex AI Featurestore
   * 
   *  Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   *  * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved.
   *  * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  ## gcp.vertex.AiFeatureStoreIamPolicy
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
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
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
   *          var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
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
   *          var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.vertex.AiFeatureStoreIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   *  import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
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
   *          var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *              .project(featurestore.project())
   *              .region(featurestore.region())
   *              .featurestore(featurestore.name())
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
   *  * projects/{{project}}/locations/{{region}}/featurestores/{{name}}
   *  * {{project}}/{{region}}/{{name}}
   *  * {{region}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Vertex AI featurestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_vertex_ai_featurestore_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:vertex/aiFeatureStoreIamPolicy:AiFeatureStoreIamPolicy editor projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Vertex AI Feature Group.
   * 
   *  To get more information about FeatureGroup, see:
   * 
   *  * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureGroups)
   *  * How-to Guides
   *      * [Creating a Feature Group](https://cloud.google.com/vertex-ai/docs/featurestore/latest/create-featuregroup)
   */
  def AiFeatureGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
