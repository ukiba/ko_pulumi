package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object vertex:
  /**
   * An Agent Anomaly Detection (AAD) scope defines the Cloud Logging and
   * Observability buckets that AAD monitors for anomalous agent behavior within
   * a location. Creating a scope provisions a dedicated tenant project for
   * detection. Only one scope may exist per location.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about AgentAnomalyDetectionScope, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.agentAnomalyDetectionScopes)
   * * How-to Guides
   *     * [Agent Anomaly Detection](https://cloud.google.com/vertex-ai/generative-ai/docs/agent-engine/)
   */
  def AiAgentAnomalyDetectionScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiAgentAnomalyDetectionScopeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiAgentAnomalyDetectionScopeArgs.builder
    com.pulumi.gcp.vertex.AiAgentAnomalyDetectionScope(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Config of GenAI caching features. This is a singleton resource.
   * 
   * To get more information about CacheConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/reference/rest/v1/projects/updateCacheConfig)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/reference/rest/Shared.Types/CacheConfig)
   */
  def AiCacheConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiCacheConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiCacheConfigArgs.builder
    com.pulumi.gcp.vertex.AiCacheConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A collection of DataItems and Annotations on them.
   * 
   * To get more information about Dataset, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.datasets)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiDataset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiDatasetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiDatasetArgs.builder
    com.pulumi.gcp.vertex.AiDataset(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * &#39;DeploymentResourcePool can be shared by multiple deployed models,
   * whose underlying specification consists of dedicated resources.&#39;
   * 
   * To get more information about DeploymentResourcePool, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.deploymentResourcePools)
   */
  def AiDeploymentResourcePool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiDeploymentResourcePoolArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiDeploymentResourcePool(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Models are deployed into it, and afterwards Endpoint is called to obtain predictions and explanations.
   * 
   * To get more information about Endpoint, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.endpoints)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiEndpointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def AiEndpointIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiEndpointIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def AiEndpointIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiEndpointIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  def AiEndpointIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiEndpointIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Create an Endpoint and deploy a Model Garden model to it.
   * 
   * To get more information about EndpointWithModelGardenDeployment, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations/deploy)
   * * How-to Guides
   *     * [Overview of Model Garden](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/explore-models)
   *     * [Overview of self-deployed models](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/self-deployed-models)
   *     * [Use models in Model Garden](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/use-models)
   */
  def AiEndpointWithModelGardenDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeploymentArgs.builder
    com.pulumi.gcp.vertex.AiEndpointWithModelGardenDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A reusable metric configuration for Vertex AI evaluation. EvaluationMetrics
   * define how model outputs are scored, supporting predefined metrics,
   * LLM-based metrics, pointwise and pairwise comparisons, and custom code
   * execution metrics.
   * 
   * To get more information about EvaluationMetric, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.evaluationMetrics)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/evaluation/overview)
   */
  def AiEvaluationMetric(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiEvaluationMetricArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiEvaluationMetricArgs.builder
    com.pulumi.gcp.vertex.AiEvaluationMetric(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Vertex AI Feature Group.
   * 
   * To get more information about FeatureGroup, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureGroups)
   * * How-to Guides
   *     * [Creating a Feature Group](https://cloud.google.com/vertex-ai/docs/featurestore/latest/create-featuregroup)
   */
  def AiFeatureGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureGroup(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Vertex AI Feature Group Feature is feature metadata information.
   * 
   * To get more information about FeatureGroupFeature, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.locations.featureGroups.features)
   * * How-to Guides
   *     * [Creating a Feature](https://cloud.google.com/vertex-ai/docs/featurestore/latest/create-feature)
   */
  def AiFeatureGroupFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupFeatureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupFeatureArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureGroupFeature(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureGroupIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
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
   * # IAM policy for Vertex AI FeatureGroup
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureGroupIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featureGroups/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featuregroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureGroupIamBinding:AiFeatureGroupIamBinding editor projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureGroupIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureGroupIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureGroupIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
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
   * # IAM policy for Vertex AI FeatureGroup
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureGroupIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featureGroups/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featuregroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureGroupIamMember:AiFeatureGroupIamMember editor projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureGroupIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureGroupIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureGroupIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
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
   * # IAM policy for Vertex AI FeatureGroup
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureGroup. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Authoritative. Sets the IAM policy for the featuregroup and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureGroupIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featuregroup are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureGroupIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featuregroup are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureGroupIamPolicy`: Retrieves the IAM policy for the featuregroup
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureGroupIamBinding` and `gcp.vertex.AiFeatureGroupIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureGroupIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureGroupIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureGroupIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureGroupIamPolicy("policy", AiFeatureGroupIamPolicyArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureGroupIamBinding("binding", AiFeatureGroupIamBindingArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureGroupIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureGroupIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureGroupIamMember("member", AiFeatureGroupIamMemberArgs.builder()
   *             .region(featureGroup.get("region"))
   *             .featureGroup(featureGroup.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featureGroups/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featuregroup IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_group_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_group_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureGroupIamPolicy:AiFeatureGroupIamPolicy editor projects/{{project}}/locations/{{region}}/featureGroups/{{feature_group}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureGroupIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureGroupIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureGroupIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Vertex AI Feature Online Store provides a centralized repository for serving ML features and embedding indexes at low latency. The Feature Online Store is a top-level container.
   * 
   * To get more information about FeatureOnlineStore, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureOnlineStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureOnlineStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * FeatureView is representation of values that the FeatureOnlineStore will serve based on its syncConfig.
   * 
   * To get more information about FeatureOnlineStoreFeatureview, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featureOnlineStores.featureViews)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureOnlineStoreFeatureview(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureview(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
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
   * # IAM policy for Vertex AI FeatureOnlineStoreFeatureview
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
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
   * * {{feature_online_store}}/featureViews/{{name}}
   * * {{feature_online_store}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_featureview_iam_member.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_featureview_iam_binding.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamBinding:AiFeatureOnlineStoreFeatureviewIamBinding editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreFeatureviewIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
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
   * # IAM policy for Vertex AI FeatureOnlineStoreFeatureview
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
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
   * * {{feature_online_store}}/featureViews/{{name}}
   * * {{feature_online_store}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_featureview_iam_member.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_featureview_iam_binding.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamMember:AiFeatureOnlineStoreFeatureviewIamMember editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreFeatureviewIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
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
   * # IAM policy for Vertex AI FeatureOnlineStoreFeatureview
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStoreFeatureview. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestorefeatureview and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestorefeatureview are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestorefeatureview are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy`: Retrieves the IAM policy for the featureonlinestorefeatureview
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` and `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreFeatureviewIamPolicy("policy", AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreFeatureviewIamBinding("binding", AiFeatureOnlineStoreFeatureviewIamBindingArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreFeatureviewIamMember("member", AiFeatureOnlineStoreFeatureviewIamMemberArgs.builder()
   *             .region(featureview.get("region"))
   *             .featureOnlineStore(featureview.get("featureOnlineStore"))
   *             .featureView(featureview.get("name"))
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
   * * {{feature_online_store}}/featureViews/{{name}}
   * * {{feature_online_store}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featureonlinestorefeatureview IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_featureview_iam_member.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_featureview_iam_binding.editor &#34;{{feature_online_store}}/featureViews/{{feature_online_store_featureview}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureOnlineStoreFeatureviewIamPolicy:AiFeatureOnlineStoreFeatureviewIamPolicy editor {{feature_online_store}}/featureViews/{{feature_online_store_featureview}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreFeatureviewIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreFeatureviewIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
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
   * # IAM policy for Vertex AI FeatureOnlineStore
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featureOnlineStores/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featureonlinestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureOnlineStoreIamBinding:AiFeatureOnlineStoreIamBinding editor projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
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
   * # IAM policy for Vertex AI FeatureOnlineStore
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featureOnlineStores/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featureonlinestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureOnlineStoreIamMember:AiFeatureOnlineStoreIamMember editor projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
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
   * # IAM policy for Vertex AI FeatureOnlineStore
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeatureOnlineStore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Authoritative. Sets the IAM policy for the featureonlinestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureOnlineStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featureonlinestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureOnlineStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featureonlinestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureOnlineStoreIamPolicy`: Retrieves the IAM policy for the featureonlinestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamBinding` and `gcp.vertex.AiFeatureOnlineStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureOnlineStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureOnlineStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureOnlineStoreIamPolicy("policy", AiFeatureOnlineStoreIamPolicyArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureOnlineStoreIamBinding("binding", AiFeatureOnlineStoreIamBindingArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureOnlineStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureOnlineStoreIamMember("member", AiFeatureOnlineStoreIamMemberArgs.builder()
   *             .region(featureOnlineStore.get("region"))
   *             .featureOnlineStore(featureOnlineStore.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featureOnlineStores/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featureonlinestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_feature_online_store_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureOnlineStoreIamPolicy:AiFeatureOnlineStoreIamPolicy editor projects/{{project}}/locations/{{region}}/featureOnlineStores/{{feature_online_store}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureOnlineStoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureOnlineStoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A collection of DataItems and Annotations on them.
   * 
   * To get more information about Featurestore, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An entity type is a type of object in a system that needs to be modeled and have stored information about. For example, driver is an entity type, and driver0 is an instance of an entity type driver.
   * 
   * To get more information about FeaturestoreEntitytype, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureStoreEntityType(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureStoreEntityType(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Feature Metadata information that describes an attribute of an entity type. For example, apple is an entity type, and color is a feature that describes apple.
   * 
   * To get more information about FeaturestoreEntitytypeFeature, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.featurestores.entityTypes.features)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiFeatureStoreEntityTypeFeature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeFeatureArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeFeatureArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeFeature(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Vertex AI FeaturestoreEntitytype
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
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
   * * {{featurestore}}/entityTypes/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_entitytype_iam_member.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_entitytype_iam_binding.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamBinding:AiFeatureStoreEntityTypeIamBinding editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreEntityTypeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Vertex AI FeaturestoreEntitytype
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
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
   * * {{featurestore}}/entityTypes/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_entitytype_iam_member.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_entitytype_iam_binding.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamMember:AiFeatureStoreEntityTypeIamMember editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreEntityTypeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .member("user:jane}{@literal @}{@code example.com")
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
   * # IAM policy for Vertex AI FeaturestoreEntitytype
   * 
   * Three different resources help you manage your IAM policy for Vertex AI FeaturestoreEntitytype. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Authoritative. Sets the IAM policy for the featurestoreentitytype and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestoreentitytype are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestoreentitytype are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`: Retrieves the IAM policy for the featurestoreentitytype
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` and `gcp.vertex.AiFeatureStoreEntityTypeIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreEntityTypeIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreEntityTypeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreEntityTypeIamPolicy("policy", AiFeatureStoreEntityTypeIamPolicyArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreEntityTypeIamBinding("binding", AiFeatureStoreEntityTypeIamBindingArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreEntityTypeIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreEntityTypeIamMember("member", AiFeatureStoreEntityTypeIamMemberArgs.builder()
   *             .featurestore(entity.get("featurestore"))
   *             .entitytype(entity.get("name"))
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
   * * {{featurestore}}/entityTypes/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featurestoreentitytype IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_entitytype_iam_member.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_entitytype_iam_binding.editor &#34;{{featurestore}}/entityTypes/{{featurestore_entitytype}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureStoreEntityTypeIamPolicy:AiFeatureStoreEntityTypeIamPolicy editor {{featurestore}}/entityTypes/{{featurestore_entitytype}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreEntityTypeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreEntityTypeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
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
   * # IAM policy for Vertex AI Featurestore
   * 
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featurestores/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featurestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureStoreIamBinding:AiFeatureStoreIamBinding editor projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
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
   * # IAM policy for Vertex AI Featurestore
   * 
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featurestores/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featurestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureStoreIamMember:AiFeatureStoreIamMember editor projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
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
   * # IAM policy for Vertex AI Featurestore
   * 
   * Three different resources help you manage your IAM policy for Vertex AI Featurestore. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Authoritative. Sets the IAM policy for the featurestore and replaces any existing policy already attached.
   * * `gcp.vertex.AiFeatureStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the featurestore are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiFeatureStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the featurestore are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiFeatureStoreIamPolicy`: Retrieves the IAM policy for the featurestore
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiFeatureStoreIamBinding` and `gcp.vertex.AiFeatureStoreIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiFeatureStoreIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiFeatureStoreIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * ## gcp.vertex.AiFeatureStoreIamPolicy
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
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiFeatureStoreIamPolicy("policy", AiFeatureStoreIamPolicyArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBinding;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiFeatureStoreIamBinding("binding", AiFeatureStoreIamBindingArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiFeatureStoreIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMember;
   * import com.pulumi.gcp.vertex.AiFeatureStoreIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiFeatureStoreIamMember("member", AiFeatureStoreIamMemberArgs.builder()
   *             .project(featurestore.get("project"))
   *             .region(featurestore.get("region"))
   *             .featurestore(featurestore.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/featurestores/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI featurestore IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_featurestore_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiFeatureStoreIamPolicy:AiFeatureStoreIamPolicy editor projects/{{project}}/locations/{{region}}/featurestores/{{featurestore}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiFeatureStoreIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiFeatureStoreIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiFeatureStoreIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
   * 
   * To get more information about Index, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexes/)
   */
  def AiIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiIndexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiIndexArgs.builder
    com.pulumi.gcp.vertex.AiIndex(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An endpoint indexes are deployed into. An index endpoint can have multiple deployed indexes.
   * 
   * To get more information about IndexEndpoint, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints/)
   */
  def AiIndexEndpoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiIndexEndpointArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiIndexEndpointArgs.builder
    com.pulumi.gcp.vertex.AiIndexEndpoint(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An endpoint indexes are deployed into. An index endpoint can have multiple deployed indexes.
   * 
   * To get more information about IndexEndpointDeployedIndex, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.indexEndpoints#DeployedIndex)
   */
  def AiIndexEndpointDeployedIndex(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndexArgs.builder
    com.pulumi.gcp.vertex.AiIndexEndpointDeployedIndex(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Instance of a metadata store. Contains a set of metadata that can be queried.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about MetadataStore, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.metadataStores)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiMetadataStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiMetadataStoreArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiMetadataStoreArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiMetadataStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Enables a Model Garden publisher model for a project so that it can be
   * deployed. This calls the synchronous
   * `ModelGardenService.EnableModel` method, which checks that the prerequisites
   * for the model are met (for example, a completed questionnaire and accepted
   * consents, or an active Private Offer) before enabling it.
   * 
   * &gt; **Note:** The underlying API does not provide a way to disable a model
   * once it has been enabled, so destroying this resource only removes it from
   * Terraform state and does not affect the project&#39;s enablement status.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about ModelGardenEnableModel, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1beta1/projects.publishers.models/enableModel)
   * * How-to Guides
   *     * [Overview of Model Garden](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/explore-models)
   *     * [Use models in Model Garden](https://cloud.google.com/vertex-ai/generative-ai/docs/model-garden/use-models)
   */
  def AiModelGardenEnableModel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiModelGardenEnableModelArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiModelGardenEnableModelArgs.builder
    com.pulumi.gcp.vertex.AiModelGardenEnableModel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * An OnlineEvaluator contains the configuration for an Online Evaluation. It
   * periodically samples traces or sessions emitted by an agent and evaluates them
   * using the configured metric sources.
   * 
   * To get more information about OnlineEvaluator, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/gemini-enterprise-agent-platform/reference/rest#rest-resource:-v1beta1.projects.locations.onlineevaluators)
   * * How-to Guides
   *     * [Official Documentation](https://docs.cloud.google.com/gemini-enterprise-agent-platform/optimize/evaluation/evaluate-online)
   */
  def AiOnlineEvaluator(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiOnlineEvaluatorArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiOnlineEvaluatorArgs.builder
    com.pulumi.gcp.vertex.AiOnlineEvaluator(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents long-lasting resources that are dedicated to users to runs custom
   * workloads. A PersistentResource can have multiple node pools and each node
   * pool can have its own machine spec.
   * 
   * To get more information about PersistentResource, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.persistentResources)
   */
  def AiPersistentResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiPersistentResourceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.vertex.AiPersistentResourceArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.vertex.AiPersistentResource(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A RAG corpus is a container for user data uploaded to Vertex AI RAG Engine for chunking, embedding, and indexing.
   * 
   * To get more information about RagCorpus, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/gemini-enterprise-agent-platform/reference/rest/v1/projects.locations.ragCorpora)
   * * How-to Guides
   *     * [Manage your RAG corpus](https://docs.cloud.google.com/gemini-enterprise-agent-platform/build/rag-engine/manage-your-rag-corpus)
   */
  def AiRagCorpus(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiRagCorpusArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiRagCorpusArgs.builder
    com.pulumi.gcp.vertex.AiRagCorpus(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Vertex AI RAG Engine lets you scale your RagManagedDb instance based on your usage and performance requirements using a choice of two tiers, and optionally, lets you delete your Vertex AI RAG Engine data using a third tier. The tier is a project-level setting that&#39;s available in the RagEngineConfig resource that impacts all RAG corpora using RagManagedDb. The following tiers are available in RagEngineConfig: Basic, Scaled and Unprovisioned.
   * 
   * To get more information about RagEngineConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/reference/rest/v1/RagEngineConfig)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/generative-ai/docs/rag-engine/understanding-ragmanageddb)
   */
  def AiRagEngineConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiRagEngineConfigArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiRagEngineConfigArgs.builder
    com.pulumi.gcp.vertex.AiRagEngineConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * ReasoningEngine provides a customizable runtime for models to determine which actions to take and in which order.
   * 
   * To get more information about ReasoningEngine, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/gemini-enterprise-agent-platform/reference/rest/v1/projects.locations.reasoningEngines)
   * * How-to Guides
   *     * [Scale your agents](https://docs.cloud.google.com/gemini-enterprise-agent-platform/scale)
   */
  def AiReasoningEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   * * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.vertex.AiReasoningEngineIamPolicy
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
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
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
   * # IAM policy for Vertex AI ReasoningEngine
   * 
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   * * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.vertex.AiReasoningEngineIamPolicy
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
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/reasoningEngines/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI reasoningengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_reasoning_engine_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_reasoning_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiReasoningEngineIamBinding:AiReasoningEngineIamBinding editor projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiReasoningEngineIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngineIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   * * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.vertex.AiReasoningEngineIamPolicy
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
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
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
   * # IAM policy for Vertex AI ReasoningEngine
   * 
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   * * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.vertex.AiReasoningEngineIamPolicy
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
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/reasoningEngines/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI reasoningengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_reasoning_engine_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_reasoning_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiReasoningEngineIamMember:AiReasoningEngineIamMember editor projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiReasoningEngineIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngineIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   * * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.vertex.AiReasoningEngineIamPolicy
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
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
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
   * # IAM policy for Vertex AI ReasoningEngine
   * 
   * Three different resources help you manage your IAM policy for Vertex AI ReasoningEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Authoritative. Sets the IAM policy for the reasoningengine and replaces any existing policy already attached.
   * * `gcp.vertex.AiReasoningEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the reasoningengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.vertex.AiReasoningEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the reasoningengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.vertex.AiReasoningEngineIamPolicy`: Retrieves the IAM policy for the reasoningengine
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamPolicy` **cannot** be used in conjunction with `gcp.vertex.AiReasoningEngineIamBinding` and `gcp.vertex.AiReasoningEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.vertex.AiReasoningEngineIamBinding` resources **can be** used in conjunction with `gcp.vertex.AiReasoningEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.vertex.AiReasoningEngineIamPolicy
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
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *         var policy = new AiReasoningEngineIamPolicy("policy", AiReasoningEngineIamPolicyArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBinding;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new AiReasoningEngineIamBinding("binding", AiReasoningEngineIamBindingArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
   *             .role("roles/viewer")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.vertex.AiReasoningEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMember;
   * import com.pulumi.gcp.vertex.AiReasoningEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new AiReasoningEngineIamMember("member", AiReasoningEngineIamMemberArgs.builder()
   *             .project(reasoningEngine.get("project"))
   *             .region(reasoningEngine.get("region"))
   *             .reasoningEngine(reasoningEngine.get("name"))
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
   * * projects/{{project}}/locations/{{region}}/reasoningEngines/{{name}}
   * * {{project}}/{{region}}/{{name}}
   * * {{region}}/{{name}}
   * * {{name}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Vertex AI reasoningengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_reasoning_engine_iam_member.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_vertex_ai_reasoning_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}} roles/viewer&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:vertex/aiReasoningEngineIamPolicy:AiReasoningEngineIamPolicy editor projects/{{project}}/locations/{{region}}/reasoningEngines/{{reasoning_engine}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def AiReasoningEngineIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiReasoningEngineIamPolicyArgs.builder
    com.pulumi.gcp.vertex.AiReasoningEngineIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A Semantic Governance Policy governs an AI agent&#39;s actions and tool execution
   * using natural language constraints. A policy requires an active
   * SemanticGovernancePolicyEngine (`gcp.vertex.AiSemanticGovernancePolicyEngine`)
   * in the same project and region.
   * 
   * To get more information about SemanticGovernancePolicy, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/gemini-enterprise-agent-platform/reference/rest/v1/projects.locations.semanticGovernancePolicies)
   * * How-to Guides
   *     * [Semantic governance overview](https://docs.cloud.google.com/gemini-enterprise-agent-platform/govern/policies/semantic-governance-overview)
   */
  def AiSemanticGovernancePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiSemanticGovernancePolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiSemanticGovernancePolicyArgs.builder
    com.pulumi.gcp.vertex.AiSemanticGovernancePolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A SemanticGovernancePolicyEngine (SGPE) is the managed, runtime evaluation
   * infrastructure for Semantic Governance Policies (SGP): the natural-language
   * constraints that govern an AI agent&#39;s tool calls. It is a project-level,
   * regional singleton, so each project has at most one engine per region.
   * 
   * Provisioning the engine sets up managed Private Service Connect (PSC)
   * networking in your VPC and a policy decision point that the Agent Gateway
   * consults at runtime to allow or deny an agent&#39;s proposed tool calls. The
   * Semantic Governance Policies themselves, and the Agent Gateway integration
   * that routes agent traffic through the engine, are configured separately and
   * are not managed by this resource.
   * 
   * Reading an uninitialized or deprovisioned engine returns the singleton
   * with state INACTIVE rather than reporting it as absent.
   * 
   * To get more information about SemanticGovernancePolicyEngine, see:
   * * How-to Guides
   *     * [Semantic governance overview](https://docs.cloud.google.com/gemini-enterprise-agent-platform/govern/policies/semantic-governance-overview)
   */
  def AiSemanticGovernancePolicyEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiSemanticGovernancePolicyEngineArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiSemanticGovernancePolicyEngineArgs.builder
    com.pulumi.gcp.vertex.AiSemanticGovernancePolicyEngine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Tensorboard is a physical database that stores users&#39; training metrics. A default Tensorboard is provided in each region of a GCP project. If needed users can also create extra Tensorboards in their projects.
   * 
   * To get more information about Tensorboard, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.tensorboards)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiTensorboard(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiTensorboardArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiTensorboardArgs.builder
    com.pulumi.gcp.vertex.AiTensorboard(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A TensorboardExperiment is a group of TensorboardRuns that are logically grouped together.
   * 
   * To get more information about TensorboardExperiment, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.tensorboards.experiments)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiTensorboardExperiment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiTensorboardExperimentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiTensorboardExperimentArgs.builder
    com.pulumi.gcp.vertex.AiTensorboardExperiment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * A TensorboardRun is a single execution of a training job.
   * 
   * To get more information about TensorboardRun, see:
   * 
   * * [API documentation](https://cloud.google.com/vertex-ai/docs/reference/rest/v1/projects.locations.tensorboards.experiments.runs)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/vertex-ai/docs)
   */
  def AiTensorboardRun(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.vertex.AiTensorboardRunArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.vertex.AiTensorboardRunArgs.builder
    com.pulumi.gcp.vertex.AiTensorboardRun(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object VertexFunctions:
    /**
     * Retrieves the current IAM policy data for endpoint
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiEndpointIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiEndpointIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiEndpointIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieves the current IAM policy data for endpoint
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiEndpointIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiEndpointIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiEndpointIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiEndpointIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieves the current IAM policy data for featuregroup
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeatureGroupIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeatureGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureGroupIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieves the current IAM policy data for featuregroup
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeatureGroupIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeatureGroupIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureGroupIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureGroupIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestorefeatureview
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeatureOnlineStoreFeatureviewIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreFeatureviewIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestorefeatureview
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeatureOnlineStoreFeatureviewIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreFeatureviewIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreFeatureviewIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestore
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeatureOnlineStoreIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieves the current IAM policy data for featureonlinestore
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeatureOnlineStoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeatureOnlineStoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeatureOnlineStoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeatureOnlineStoreIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieves the current IAM policy data for featurestoreentitytype
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeaturestoreEntitytypeIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreEntitytypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreEntitytypeIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieves the current IAM policy data for featurestoreentitytype
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeaturestoreEntitytypeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreEntitytypeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreEntitytypeIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieves the current IAM policy data for featurestore
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeaturestoreIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieves the current IAM policy data for featurestore
     * &gt; **Warning:** This datasource is in beta, and should be used with the terraform-provider-google-beta provider.
     * See Provider Versions for more details on beta resources.
     */
    inline def getAiFeaturestoreIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiFeaturestoreIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search. */
    inline def getAiIndex(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiIndexArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiIndexResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiIndexArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiIndex(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search. */
    inline def getAiIndexPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiIndexPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiIndexResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiIndexPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiIndexPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for reasoningengine */
    inline def getAiReasoningEngineIamPolicy(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for reasoningengine */
    inline def getAiReasoningEngineIamPolicyPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineIamPolicyPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Get the output of a query sent to a Vertex AI Reasoning Engine agent. */
    inline def getAiReasoningEngineQuery(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineQueryResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineQuery(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Get the output of a query sent to a Vertex AI Reasoning Engine agent. */
    inline def getAiReasoningEngineQueryPlain(args: Endofunction[com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.vertex.outputs.GetAiReasoningEngineQueryResult] =
      val argsBuilder = com.pulumi.gcp.vertex.inputs.GetAiReasoningEngineQueryPlainArgs.builder
      com.pulumi.gcp.vertex.VertexFunctions.getAiReasoningEngineQueryPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
