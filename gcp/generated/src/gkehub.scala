package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object gkehub:
  /**
   * Fleet contains information about a group of clusters.
   * 
   *  To get more information about Fleet, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/multicluster-management/reference/rest/v1/projects.locations.fleets)
   *  * How-to Guides
   *      * [Registering a Cluster to a Fleet](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def Fleet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.FleetArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.FleetArgs.builder
    com.pulumi.gcp.gkehub.Fleet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * RolloutSequence defines the desired order of upgrades.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about RolloutSequence, see:
   * 
   *  * [API documentation](https://docs.cloud.google.com/kubernetes-engine/fleet-management/docs/reference/rest/v1beta/projects.locations.rolloutSequences)
   *  * How-to Guides
   *      * [Rollout Sequencing Overview](https://cloud.google.com/kubernetes-engine/docs/concepts/rollout-sequencing-custom-stages/about-rollout-sequencing)
   * 
   *  ## Import
   * 
   *  RolloutSequence can be imported using any of these accepted formats:
   * 
   *  * `projects/{{project}}/locations/global/rolloutSequences/{{rollout_sequence_id}}`
   *  * `{{project}}/{{rollout_sequence_id}}`
   *  * `{{rollout_sequence_id}}`
   * 
   *  When using the `pulumi import` command, RolloutSequence can be imported using one of the formats above. For example:
   * 
   *  ```sh
   *  $ pulumi import gcp:gkehub/rolloutSequence:RolloutSequence default projects/{{project}}/locations/global/rolloutSequences/{{rollout_sequence_id}}
   *  $ pulumi import gcp:gkehub/rolloutSequence:RolloutSequence default {{project}}/{{rollout_sequence_id}}
   *  $ pulumi import gcp:gkehub/rolloutSequence:RolloutSequence default {{rollout_sequence_id}}
   *  ```
   */
  def RolloutSequence(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.RolloutSequenceArgs.builder
    com.pulumi.gcp.gkehub.RolloutSequence(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
   *  * `gcp.gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
   *  * `gcp.gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.FeatureIamBinding` and `gcp.gkehub.FeatureIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gcp.gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.FeatureIamPolicy
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
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicy;
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicyArgs;
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
   *          var policy = new FeatureIamPolicy("policy", FeatureIamPolicyArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamBinding;
   *  import com.pulumi.gcp.gkehub.FeatureIamBindingArgs;
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
   *          var binding = new FeatureIamBinding("binding", FeatureIamBindingArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamMember;
   *  import com.pulumi.gcp.gkehub.FeatureIamMemberArgs;
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
   *          var member = new FeatureIamMember("member", FeatureIamMemberArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
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
   *  # IAM policy for GKEHub Feature
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
   *  * `gcp.gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
   *  * `gcp.gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.FeatureIamBinding` and `gcp.gkehub.FeatureIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gcp.gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.FeatureIamPolicy
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
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicy;
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicyArgs;
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
   *          var policy = new FeatureIamPolicy("policy", FeatureIamPolicyArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamBinding;
   *  import com.pulumi.gcp.gkehub.FeatureIamBindingArgs;
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
   *          var binding = new FeatureIamBinding("binding", FeatureIamBindingArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamMember;
   *  import com.pulumi.gcp.gkehub.FeatureIamMemberArgs;
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
   *          var member = new FeatureIamMember("member", FeatureIamMemberArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
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
   *  * projects/{{project}}/locations/{{location}}/features/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub feature IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_feature_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_feature_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/featureIamBinding:FeatureIamBinding editor projects/{{project}}/locations/{{location}}/features/{{feature}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FeatureIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.FeatureIamBindingArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkehub.FeatureIamBindingArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkehub.FeatureIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder)
    /**
     * @param ignoredClustersSelector Selector for clusters to exclude from the Rollout Sequence.
     *  Structure is documented below.
     * @return builder
     */
    def ignoredClustersSelector(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.Builder]):
        com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.builder
      builder.ignoredClustersSelector(args(argsBuilder).build)

    /**
     * @param stages Ordered list of stages that constitute this Rollout Sequence.
     *  Structure is documented below.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder]*):
        com.pulumi.gcp.gkehub.RolloutSequenceArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  /**
   * MembershipBinding is a subresource of a Membership, representing what Fleet Scopes (or other, future Fleet resources) a Membership is bound to.
   * 
   *  To get more information about MembershipBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.memberships.bindings)
   *  * How-to Guides
   *      * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def MembershipBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.MembershipBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.MembershipBindingArgs.builder
    com.pulumi.gcp.gkehub.MembershipBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Namespace represents a namespace across the Fleet.
   * 
   *  To get more information about Namespace, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.scopes.namespaces)
   *  * How-to Guides
   *      * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def Namespace(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.NamespaceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.NamespaceArgs.builder
    com.pulumi.gcp.gkehub.Namespace(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder)
    /**
     * @param configmanagement Config Management-specific spec. Structure is documented below.
     * @return builder
     */
    def configmanagement(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.builder
      builder.configmanagement(args(argsBuilder).build)

    /**
     * @param mesh Service mesh specific spec. Structure is documented below.
     * @return builder
     */
    def mesh(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.builder
      builder.mesh(args(argsBuilder).build)

    /**
     * @param policycontroller Policy Controller-specific spec. Structure is documented below.
     * @return builder
     */
    def policycontroller(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.builder
      builder.policycontroller(args(argsBuilder).build)

  /**
   * RBACRoleBinding represents a rbacrolebinding across the Fleet.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about MembershipRBACRoleBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.memberships)
   *  * How-to Guides
   *      * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def MembershipRbacRoleBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.MembershipRbacRoleBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.MembershipRbacRoleBindingArgs.builder
    com.pulumi.gcp.gkehub.MembershipRbacRoleBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  type GkehubFunctions = com.pulumi.gcp.gkehub.GkehubFunctions
  object GkehubFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.gkehub.GkehubFunctions.*
  extension (self: GkehubFunctions.type)
    /** Retrieves the details of a specific GKE Hub Feature. Use this data source to retrieve the feature&#39;s configuration and state. */
    def getFeature(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetFeatureArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkehub.outputs.GetFeatureResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetFeatureArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getFeature(args(argsBuilder).build)

    /** Retrieves the details of a specific GKE Hub Feature. Use this data source to retrieve the feature&#39;s configuration and state. */
    def getFeaturePlain(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetFeaturePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkehub.outputs.GetFeatureResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetFeaturePlainArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getFeaturePlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for feature */
    def getFeatureIamPolicy(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetFeatureIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkehub.outputs.GetFeatureIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetFeatureIamPolicyArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getFeatureIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for feature */
    def getFeatureIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetFeatureIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkehub.outputs.GetFeatureIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetFeatureIamPolicyPlainArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getFeatureIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the details of a specific GKE Hub Membership. Use this data source to retrieve the membership&#39;s configuration and state. */
    def getMembership(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetMembershipArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkehub.outputs.GetMembershipResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetMembershipArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getMembership(args(argsBuilder).build)

    /** Retrieves the details of a specific GKE Hub Membership. Use this data source to retrieve the membership&#39;s configuration and state. */
    def getMembershipPlain(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetMembershipPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkehub.outputs.GetMembershipResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetMembershipPlainArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getMembershipPlain(args(argsBuilder).build)

    /**
     * Retrieves the details of a specific GKE Hub Membership Binding. Use this data source to retrieve the membership binding&#39;s configuration and state.
     * 
     *  A membership binding associates a GKE Hub membership with a scope, enabling the membership to participate in fleet-wide configurations and policies defined by the scope.
     */
    def getMembershipBinding(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetMembershipBindingArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkehub.outputs.GetMembershipBindingResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetMembershipBindingArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getMembershipBinding(args(argsBuilder).build)

    /**
     * Retrieves the details of a specific GKE Hub Membership Binding. Use this data source to retrieve the membership binding&#39;s configuration and state.
     * 
     *  A membership binding associates a GKE Hub membership with a scope, enabling the membership to participate in fleet-wide configurations and policies defined by the scope.
     */
    def getMembershipBindingPlain(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetMembershipBindingPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkehub.outputs.GetMembershipBindingResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetMembershipBindingPlainArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getMembershipBindingPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for membership */
    def getMembershipIamPolicy(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetMembershipIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkehub.outputs.GetMembershipIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetMembershipIamPolicyArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getMembershipIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for membership */
    def getMembershipIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetMembershipIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkehub.outputs.GetMembershipIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetMembershipIamPolicyPlainArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getMembershipIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for scope */
    def getScopeIamPolicy(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetScopeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.gkehub.outputs.GetScopeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetScopeIamPolicyArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getScopeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for scope */
    def getScopeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.gkehub.inputs.GetScopeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.gkehub.outputs.GetScopeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.GetScopeIamPolicyPlainArgs.builder
      com.pulumi.gcp.gkehub.GkehubFunctions.getScopeIamPolicyPlain(args(argsBuilder).build)

  /** Contains information about a GKEHub Feature Memberships. Feature Memberships configure GKEHub Features that apply to specific memberships rather than the project as a whole. The googleGkeHub is the Fleet API. */
  def FeatureMembership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.FeatureMembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.FeatureMembershipArgs.builder
    com.pulumi.gcp.gkehub.FeatureMembership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.ScopeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.ScopeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
   *  * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
   *  * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.ScopeIamPolicy
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
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicy;
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicyArgs;
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
   *          var policy = new ScopeIamPolicy("policy", ScopeIamPolicyArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamBinding;
   *  import com.pulumi.gcp.gkehub.ScopeIamBindingArgs;
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
   *          var binding = new ScopeIamBinding("binding", ScopeIamBindingArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamMember;
   *  import com.pulumi.gcp.gkehub.ScopeIamMemberArgs;
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
   *          var member = new ScopeIamMember("member", ScopeIamMemberArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
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
   *  # IAM policy for GKEHub Scope
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
   *  * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
   *  * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.ScopeIamPolicy
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
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicy;
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicyArgs;
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
   *          var policy = new ScopeIamPolicy("policy", ScopeIamPolicyArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamBinding;
   *  import com.pulumi.gcp.gkehub.ScopeIamBindingArgs;
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
   *          var binding = new ScopeIamBinding("binding", ScopeIamBindingArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamMember;
   *  import com.pulumi.gcp.gkehub.ScopeIamMemberArgs;
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
   *          var member = new ScopeIamMember("member", ScopeIamMemberArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
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
   *  * projects/{{project}}/locations/global/scopes/{{scope_id}}
   *  * {{project}}/{{scope_id}}
   *  * {{scope_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub scope IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_scope_iam_member.editor &#34;projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_scope_iam_binding.editor &#34;projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/scopeIamBinding:ScopeIamBinding editor projects/{{project}}/locations/global/scopes/{{scope_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ScopeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.ScopeIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.ScopeIamBindingArgs.builder
    com.pulumi.gcp.gkehub.ScopeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipArgs.Builder)
    /**
     * @param authority Authority encodes how Google will recognize identities from this Membership.
     *  See the workload identity documentation for more details:
     *  https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     *  Structure is documented below.
     * @return builder
     */
    def authority(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.builder
      builder.authority(args(argsBuilder).build)

    /**
     * @param endpoint If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     *  Structure is documented below.
     * @return builder
     */
    def endpoint(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.FeatureIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
   *  * `gcp.gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
   *  * `gcp.gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.FeatureIamBinding` and `gcp.gkehub.FeatureIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gcp.gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.FeatureIamPolicy
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
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicy;
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicyArgs;
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
   *          var policy = new FeatureIamPolicy("policy", FeatureIamPolicyArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamBinding;
   *  import com.pulumi.gcp.gkehub.FeatureIamBindingArgs;
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
   *          var binding = new FeatureIamBinding("binding", FeatureIamBindingArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamMember;
   *  import com.pulumi.gcp.gkehub.FeatureIamMemberArgs;
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
   *          var member = new FeatureIamMember("member", FeatureIamMemberArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
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
   *  # IAM policy for GKEHub Feature
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
   *  * `gcp.gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
   *  * `gcp.gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.FeatureIamBinding` and `gcp.gkehub.FeatureIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gcp.gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.FeatureIamPolicy
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
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicy;
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicyArgs;
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
   *          var policy = new FeatureIamPolicy("policy", FeatureIamPolicyArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamBinding;
   *  import com.pulumi.gcp.gkehub.FeatureIamBindingArgs;
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
   *          var binding = new FeatureIamBinding("binding", FeatureIamBindingArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamMember;
   *  import com.pulumi.gcp.gkehub.FeatureIamMemberArgs;
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
   *          var member = new FeatureIamMember("member", FeatureIamMemberArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
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
   *  * projects/{{project}}/locations/{{location}}/features/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub feature IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_feature_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_feature_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/featureIamPolicy:FeatureIamPolicy editor projects/{{project}}/locations/{{location}}/features/{{feature}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FeatureIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.FeatureIamPolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkehub.FeatureIamPolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkehub.FeatureIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipRbacRoleBindingArgs.Builder)
    /**
     * @param role Role to bind to the principal.
     *  Structure is documented below.
     * @return builder
     */
    def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipRbacRoleBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.ScopeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.ScopeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
   *  * `gcp.gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
   *  * `gcp.gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.MembershipIamBinding` and `gcp.gkehub.MembershipIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gcp.gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.MembershipIamPolicy
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
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicy;
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicyArgs;
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
   *          var policy = new MembershipIamPolicy("policy", MembershipIamPolicyArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamBinding;
   *  import com.pulumi.gcp.gkehub.MembershipIamBindingArgs;
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
   *          var binding = new MembershipIamBinding("binding", MembershipIamBindingArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamMember;
   *  import com.pulumi.gcp.gkehub.MembershipIamMemberArgs;
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
   *          var member = new MembershipIamMember("member", MembershipIamMemberArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
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
   *  # IAM policy for GKEHub Membership
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
   *  * `gcp.gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
   *  * `gcp.gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.MembershipIamBinding` and `gcp.gkehub.MembershipIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gcp.gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.MembershipIamPolicy
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
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicy;
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicyArgs;
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
   *          var policy = new MembershipIamPolicy("policy", MembershipIamPolicyArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamBinding;
   *  import com.pulumi.gcp.gkehub.MembershipIamBindingArgs;
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
   *          var binding = new MembershipIamBinding("binding", MembershipIamBindingArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamMember;
   *  import com.pulumi.gcp.gkehub.MembershipIamMemberArgs;
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
   *          var member = new MembershipIamMember("member", MembershipIamMemberArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
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
   *  * projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
   *  * {{project}}/{{location}}/{{membership_id}}
   *  * {{location}}/{{membership_id}}
   *  * {{membership_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub membership IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_membership_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_membership_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/membershipIamPolicy:MembershipIamPolicy editor projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MembershipIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.MembershipIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.MembershipIamPolicyArgs.builder
    com.pulumi.gcp.gkehub.MembershipIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
   *  * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
   *  * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.ScopeIamPolicy
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
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicy;
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicyArgs;
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
   *          var policy = new ScopeIamPolicy("policy", ScopeIamPolicyArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamBinding;
   *  import com.pulumi.gcp.gkehub.ScopeIamBindingArgs;
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
   *          var binding = new ScopeIamBinding("binding", ScopeIamBindingArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamMember;
   *  import com.pulumi.gcp.gkehub.ScopeIamMemberArgs;
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
   *          var member = new ScopeIamMember("member", ScopeIamMemberArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
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
   *  # IAM policy for GKEHub Scope
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
   *  * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
   *  * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.ScopeIamPolicy
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
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicy;
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicyArgs;
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
   *          var policy = new ScopeIamPolicy("policy", ScopeIamPolicyArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamBinding;
   *  import com.pulumi.gcp.gkehub.ScopeIamBindingArgs;
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
   *          var binding = new ScopeIamBinding("binding", ScopeIamBindingArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamMember;
   *  import com.pulumi.gcp.gkehub.ScopeIamMemberArgs;
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
   *          var member = new ScopeIamMember("member", ScopeIamMemberArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
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
   *  * projects/{{project}}/locations/global/scopes/{{scope_id}}
   *  * {{project}}/{{scope_id}}
   *  * {{scope_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub scope IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_scope_iam_member.editor &#34;projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_scope_iam_binding.editor &#34;projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/scopeIamMember:ScopeIamMember editor projects/{{project}}/locations/global/scopes/{{scope_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ScopeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.ScopeIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.ScopeIamMemberArgs.builder
    com.pulumi.gcp.gkehub.ScopeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.FeatureArgs.Builder)
    /**
     * @param fleetDefaultMemberConfig Optional. Fleet Default Membership Configuration.
     *  Structure is documented below.
     * @return builder
     */
    def fleetDefaultMemberConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.builder
      builder.fleetDefaultMemberConfig(args(argsBuilder).build)

    /**
     * @param spec Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.builder
      builder.spec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.MembershipIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.MembershipIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Scope represents a Scope in a Fleet.
   * 
   *  To get more information about Scope, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.scopes)
   *  * How-to Guides
   *      * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def Scope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.ScopeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.ScopeArgs.builder
    com.pulumi.gcp.gkehub.Scope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
   *  * `gcp.gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
   *  * `gcp.gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.FeatureIamBinding` and `gcp.gkehub.FeatureIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gcp.gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.FeatureIamPolicy
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
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicy;
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicyArgs;
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
   *          var policy = new FeatureIamPolicy("policy", FeatureIamPolicyArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamBinding;
   *  import com.pulumi.gcp.gkehub.FeatureIamBindingArgs;
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
   *          var binding = new FeatureIamBinding("binding", FeatureIamBindingArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamMember;
   *  import com.pulumi.gcp.gkehub.FeatureIamMemberArgs;
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
   *          var member = new FeatureIamMember("member", FeatureIamMemberArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
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
   *  # IAM policy for GKEHub Feature
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Feature. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Authoritative. Sets the IAM policy for the feature and replaces any existing policy already attached.
   *  * `gcp.gkehub.FeatureIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the feature are preserved.
   *  * `gcp.gkehub.FeatureIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the feature are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.FeatureIamPolicy`: Retrieves the IAM policy for the feature
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.FeatureIamBinding` and `gcp.gkehub.FeatureIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.FeatureIamBinding` resources **can be** used in conjunction with `gcp.gkehub.FeatureIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.FeatureIamPolicy
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
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicy;
   *  import com.pulumi.gcp.gkehub.FeatureIamPolicyArgs;
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
   *          var policy = new FeatureIamPolicy("policy", FeatureIamPolicyArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamBinding;
   *  import com.pulumi.gcp.gkehub.FeatureIamBindingArgs;
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
   *          var binding = new FeatureIamBinding("binding", FeatureIamBindingArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.FeatureIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.FeatureIamMember;
   *  import com.pulumi.gcp.gkehub.FeatureIamMemberArgs;
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
   *          var member = new FeatureIamMember("member", FeatureIamMemberArgs.builder()
   *              .project(feature.project())
   *              .location(feature.location())
   *              .name(feature.name())
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
   *  * projects/{{project}}/locations/{{location}}/features/{{name}}
   *  * {{project}}/{{location}}/{{name}}
   *  * {{location}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub feature IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_feature_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_feature_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/features/{{feature}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/featureIamMember:FeatureIamMember editor projects/{{project}}/locations/{{location}}/features/{{feature}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def FeatureIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.FeatureIamMemberArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkehub.FeatureIamMemberArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkehub.FeatureIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.FleetArgs.Builder)
    /**
     * @param defaultClusterConfig The default cluster configurations to apply across the fleet.
     *  Structure is documented below.
     * @return builder
     */
    def defaultClusterConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.FleetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.builder
      builder.defaultClusterConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
   *  * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
   *  * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.ScopeIamPolicy
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
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicy;
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicyArgs;
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
   *          var policy = new ScopeIamPolicy("policy", ScopeIamPolicyArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamBinding;
   *  import com.pulumi.gcp.gkehub.ScopeIamBindingArgs;
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
   *          var binding = new ScopeIamBinding("binding", ScopeIamBindingArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamMember;
   *  import com.pulumi.gcp.gkehub.ScopeIamMemberArgs;
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
   *          var member = new ScopeIamMember("member", ScopeIamMemberArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
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
   *  # IAM policy for GKEHub Scope
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Scope. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Authoritative. Sets the IAM policy for the scope and replaces any existing policy already attached.
   *  * `gcp.gkehub.ScopeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the scope are preserved.
   *  * `gcp.gkehub.ScopeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the scope are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.ScopeIamPolicy`: Retrieves the IAM policy for the scope
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.ScopeIamBinding` and `gcp.gkehub.ScopeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.ScopeIamBinding` resources **can be** used in conjunction with `gcp.gkehub.ScopeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.ScopeIamPolicy
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
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicy;
   *  import com.pulumi.gcp.gkehub.ScopeIamPolicyArgs;
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
   *          var policy = new ScopeIamPolicy("policy", ScopeIamPolicyArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamBinding;
   *  import com.pulumi.gcp.gkehub.ScopeIamBindingArgs;
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
   *          var binding = new ScopeIamBinding("binding", ScopeIamBindingArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.ScopeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.ScopeIamMember;
   *  import com.pulumi.gcp.gkehub.ScopeIamMemberArgs;
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
   *          var member = new ScopeIamMember("member", ScopeIamMemberArgs.builder()
   *              .project(scope.project())
   *              .scopeId(scope.scopeId())
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
   *  * projects/{{project}}/locations/global/scopes/{{scope_id}}
   *  * {{project}}/{{scope_id}}
   *  * {{scope_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub scope IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_scope_iam_member.editor &#34;projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_scope_iam_binding.editor &#34;projects/{{project}}/locations/global/scopes/{{scope_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/scopeIamPolicy:ScopeIamPolicy editor projects/{{project}}/locations/global/scopes/{{scope_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ScopeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.ScopeIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.ScopeIamPolicyArgs.builder
    com.pulumi.gcp.gkehub.ScopeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
   *  * `gcp.gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
   *  * `gcp.gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.MembershipIamBinding` and `gcp.gkehub.MembershipIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gcp.gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.MembershipIamPolicy
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
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicy;
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicyArgs;
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
   *          var policy = new MembershipIamPolicy("policy", MembershipIamPolicyArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamBinding;
   *  import com.pulumi.gcp.gkehub.MembershipIamBindingArgs;
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
   *          var binding = new MembershipIamBinding("binding", MembershipIamBindingArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamMember;
   *  import com.pulumi.gcp.gkehub.MembershipIamMemberArgs;
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
   *          var member = new MembershipIamMember("member", MembershipIamMemberArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
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
   *  # IAM policy for GKEHub Membership
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
   *  * `gcp.gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
   *  * `gcp.gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.MembershipIamBinding` and `gcp.gkehub.MembershipIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gcp.gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.MembershipIamPolicy
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
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicy;
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicyArgs;
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
   *          var policy = new MembershipIamPolicy("policy", MembershipIamPolicyArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamBinding;
   *  import com.pulumi.gcp.gkehub.MembershipIamBindingArgs;
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
   *          var binding = new MembershipIamBinding("binding", MembershipIamBindingArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamMember;
   *  import com.pulumi.gcp.gkehub.MembershipIamMemberArgs;
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
   *          var member = new MembershipIamMember("member", MembershipIamMemberArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
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
   *  * projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
   *  * {{project}}/{{location}}/{{membership_id}}
   *  * {{location}}/{{membership_id}}
   *  * {{membership_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub membership IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_membership_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_membership_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/membershipIamMember:MembershipIamMember editor projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MembershipIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.MembershipIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.MembershipIamMemberArgs.builder
    com.pulumi.gcp.gkehub.MembershipIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Membership contains information about a member cluster.
   * 
   *  To get more information about Membership, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/multicluster-management/reference/rest/v1/projects.locations.memberships)
   *  * How-to Guides
   *      * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def Membership(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.MembershipArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.MembershipArgs.builder
    com.pulumi.gcp.gkehub.Membership(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.FeatureIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.FeatureIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * RBACRoleBinding represents a rbacrolebinding across the Fleet.
   * 
   *  To get more information about ScopeRBACRoleBinding, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.scopes.rbacrolebindings)
   *  * How-to Guides
   *      * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def ScopeRbacRoleBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.ScopeRbacRoleBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.ScopeRbacRoleBindingArgs.builder
    com.pulumi.gcp.gkehub.ScopeRbacRoleBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.ScopeRbacRoleBindingArgs.Builder)
    /**
     * @param role Role to bind to the principal.
     *  Structure is documented below.
     * @return builder
     */
    def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.ScopeRbacRoleBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

  /**
   * Feature represents the settings and status of any Hub Feature.
   * 
   *  To get more information about Feature, see:
   * 
   *  * [API documentation](https://cloud.google.com/anthos/fleet-management/docs/reference/rest/v1/projects.locations.features)
   *  * How-to Guides
   *      * [Registering a Cluster](https://cloud.google.com/anthos/multicluster-management/connect/registering-a-cluster#register_cluster)
   */
  def Feature(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.FeatureArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.gkehub.FeatureArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.gkehub.Feature(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
   *  * `gcp.gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
   *  * `gcp.gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.MembershipIamBinding` and `gcp.gkehub.MembershipIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gcp.gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.MembershipIamPolicy
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
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicy;
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicyArgs;
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
   *          var policy = new MembershipIamPolicy("policy", MembershipIamPolicyArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamBinding;
   *  import com.pulumi.gcp.gkehub.MembershipIamBindingArgs;
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
   *          var binding = new MembershipIamBinding("binding", MembershipIamBindingArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamMember;
   *  import com.pulumi.gcp.gkehub.MembershipIamMemberArgs;
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
   *          var member = new MembershipIamMember("member", MembershipIamMemberArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
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
   *  # IAM policy for GKEHub Membership
   * 
   *  Three different resources help you manage your IAM policy for GKEHub Membership. Each of these resources serves a different use case:
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Authoritative. Sets the IAM policy for the membership and replaces any existing policy already attached.
   *  * `gcp.gkehub.MembershipIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the membership are preserved.
   *  * `gcp.gkehub.MembershipIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the membership are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.gkehub.MembershipIamPolicy`: Retrieves the IAM policy for the membership
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamPolicy` **cannot** be used in conjunction with `gcp.gkehub.MembershipIamBinding` and `gcp.gkehub.MembershipIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.gkehub.MembershipIamBinding` resources **can be** used in conjunction with `gcp.gkehub.MembershipIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.gkehub.MembershipIamPolicy
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
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicy;
   *  import com.pulumi.gcp.gkehub.MembershipIamPolicyArgs;
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
   *          var policy = new MembershipIamPolicy("policy", MembershipIamPolicyArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamBinding;
   *  import com.pulumi.gcp.gkehub.MembershipIamBindingArgs;
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
   *          var binding = new MembershipIamBinding("binding", MembershipIamBindingArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.gkehub.MembershipIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.gkehub.MembershipIamMember;
   *  import com.pulumi.gcp.gkehub.MembershipIamMemberArgs;
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
   *          var member = new MembershipIamMember("member", MembershipIamMemberArgs.builder()
   *              .project(membership.project())
   *              .location(membership.location())
   *              .membershipId(membership.membershipId())
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
   *  * projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
   *  * {{project}}/{{location}}/{{membership_id}}
   *  * {{location}}/{{membership_id}}
   *  * {{membership_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  GKEHub membership IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_membership_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_gke_hub_membership_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/memberships/{{membership_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:gkehub/membershipIamBinding:MembershipIamBinding editor projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def MembershipIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.gkehub.MembershipIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.gkehub.MembershipIamBindingArgs.builder
    com.pulumi.gcp.gkehub.MembershipIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.Builder)
    /**
     * @param states (Output)
     *  Output only. The &#34;running state&#34; of the Feature in this Hub.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureStateStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureStateStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder)
    /**
     * @param defaultConfig Specified if applying the default routing config to logs not specified in other configs.
     *  Structure is documented below.
     * @return builder
     */
    def defaultConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigDefaultConfigArgs.builder
      builder.defaultConfig(args(argsBuilder).build)

    /**
     * @param fleetScopeLogsConfig Specified if applying the routing config to all logs for all fleet scopes.
     *  Structure is documented below.
     * @return builder
     */
    def fleetScopeLogsConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigFleetScopeLogsConfigArgs.builder
      builder.fleetScopeLogsConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingState.Builder)
    /**
     * @param role Role to bind to the principal.
     *  Structure is documented below.
     * @return builder
     */
    def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

    /**
     * @param states State of the RBAC Role Binding resource.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeRbacRoleBindingStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder)
    /**
     * @param configSync Config Sync configuration for the cluster. Structure is documented below.
     * @return builder
     */
    def configSync(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.builder
      builder.configSync(args(argsBuilder).build)

    /**
     * @param hierarchyController Hierarchy Controller configuration for the cluster. Structure is documented below.
     *  Configuring Hierarchy Controller through the configmanagement feature is no longer recommended.
     *  Use open source Kubernetes [Hierarchical Namespace Controller (HNC)](https://github.com/kubernetes-sigs/hierarchical-namespaces) instead.
     *  Follow the [instructions](https://cloud.google.com/kubernetes-engine/enterprise/config-sync/docs/how-to/migrate-hierarchy-controller)
     *  to migrate from Hierarchy Controller to HNC.
     * @return builder
     */
    def hierarchyController(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementHierarchyControllerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementHierarchyControllerArgs.builder
      builder.hierarchyController(args(argsBuilder).build)

    /**
     * @param policyController Policy Controller configuration for the cluster. Structure is documented below.
     *  Configuring Policy Controller through the configmanagement feature is no longer recommended.
     *  Use the policycontroller feature instead.
     * @return builder
     */
    def policyController(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.builder
      builder.policyController(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder)
    /**
     * @param policyControllerHubConfig Policy Controller configuration for the cluster. Structure is documented below.
     * @return builder
     */
    def policyControllerHubConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.builder
      builder.policyControllerHubConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder)
    /**
     * @param deploymentConfigs Map of deployment configs to deployments (&#34;admission&#34;, &#34;audit&#34;, &#34;mutation&#34;).
     *  Structure is documented below.
     * @return builder
     */
    def deploymentConfigs(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.builder
      builder.deploymentConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param monitoring Monitoring specifies the configuration of monitoring Policy Controller.
     *  Structure is documented below.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoringArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param policyContent Specifies the desired policy content on the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def policyContent(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.builder
      builder.policyContent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState.Builder)
    /**
     * @param role Role to bind to the principal.
     *  Structure is documented below.
     * @return builder
     */
    def role(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingRoleArgs.builder
      builder.role(args(argsBuilder).build)

    /**
     * @param states State of the RBAC Role Binding resource.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipState.Builder)
    /**
     * @param authority Authority encodes how Google will recognize identities from this Membership.
     *  See the workload identity documentation for more details:
     *  https://cloud.google.com/kubernetes-engine/docs/how-to/workload-identity
     *  Structure is documented below.
     * @return builder
     */
    def authority(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipAuthorityArgs.builder
      builder.authority(args(argsBuilder).build)

    /**
     * @param endpoint If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     *  Structure is documented below.
     * @return builder
     */
    def endpoint(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.builder
      builder.endpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder)
    /**
     * @param postConditions Post conditions to override for the specified upgrade.
     *  Structure is documented below.
     * @return builder
     */
    def postConditions(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverridePostConditionsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverridePostConditionsArgs.builder
      builder.postConditions(args(argsBuilder).build)

    /**
     * @param upgrade Which upgrade to override.
     *  Structure is documented below.
     * @return builder
     */
    def upgrade(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideUpgradeArgs.builder
      builder.upgrade(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder)
    /**
     * @param ignoredClustersSelector Selector for clusters to exclude from the Rollout Sequence.
     *  Structure is documented below.
     * @return builder
     */
    def ignoredClustersSelector(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceIgnoredClustersSelectorArgs.builder
      builder.ignoredClustersSelector(args(argsBuilder).build)

    /**
     * @param stages Ordered list of stages that constitute this Rollout Sequence.
     *  Structure is documented below.
     * @return builder
     */
    def stages(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.builder
      builder.stages(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder)
    /**
     * @param deploymentConfigs Map of deployment configs to deployments (&#34;admission&#34;, &#34;audit&#34;, &#34;mutation&#34;).
     * @return builder
     */
    def deploymentConfigs(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.builder
      builder.deploymentConfigs(args.map(_(argsBuilder).build)*)

    /**
     * @param monitoring Specifies the backends Policy Controller should export metrics to. Structure is documented below.
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoringArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

    /**
     * @param policyContent Specifies the desired policy content on the cluster. Structure is documented below.
     * @return builder
     */
    def policyContent(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.builder
      builder.policyContent(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeState.Builder)
    /**
     * @param states State of the scope resource.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.ScopeState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder)
    /**
     * @param bundles map of bundle name to BundleInstallSpec. The bundle name maps to the `bundleName` key in the `policycontroller.gke.io/constraintData` annotation on a constraint.
     * @return builder
     */
    def bundles(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.builder
      builder.bundles(args.map(_(argsBuilder).build)*)

    /**
     * @param templateLibrary Configures the installation of the Template Library. Structure is documented below.
     * @return builder
     */
    def templateLibrary(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.builder
      builder.templateLibrary(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder)
    /**
     * @param git Git repo configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def git(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGitArgs.builder
      builder.git(args(argsBuilder).build)

    /**
     * @param oci OCI repo configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def oci(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOciArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOciArgs.builder
      builder.oci(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder)
    /**
     * @param configmanagement Config Management spec
     *  Structure is documented below.
     * @return builder
     */
    def configmanagement(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.builder
      builder.configmanagement(args(argsBuilder).build)

    /**
     * @param mesh Service Mesh spec
     *  Structure is documented below.
     * @return builder
     */
    def mesh(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigMeshArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigMeshArgs.builder
      builder.mesh(args(argsBuilder).build)

    /**
     * @param policycontroller Policy Controller spec
     *  Structure is documented below.
     * @return builder
     */
    def policycontroller(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.builder
      builder.policycontroller(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.Builder)
    /**
     * @param monitoring Specifies the backends Policy Controller should export metrics to. For example, to specify metrics should be exported to Cloud Monitoring and Prometheus, specify backends: [&#34;cloudmonitoring&#34;, &#34;prometheus&#34;]. Default: [&#34;cloudmonitoring&#34;, &#34;prometheus&#34;]
     * @return builder
     */
    def monitoring(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerMonitoringArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementPolicyControllerMonitoringArgs.builder
      builder.monitoring(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder)
    /**
     * @param limits Limits describes the maximum amount of compute resources allowed for use by the running container.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param requests Requests describes the amount of compute resources reserved for the container by the kube-scheduler.
     * @return builder
     */
    def requests(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder)
    /**
     * @param bundles Configures which bundles to install and their corresponding install specs.
     *  Structure is documented below.
     * @return builder
     */
    def bundles(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentBundleArgs.builder
      builder.bundles(args.map(_(argsBuilder).build)*)

    /**
     * @param templateLibrary Configures the installation of the Template Library.
     *  Structure is documented below.
     * @return builder
     */
    def templateLibrary(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigPolicyContentTemplateLibraryArgs.builder
      builder.templateLibrary(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder)
    /**
     * @param containerResources Container resource requirements.
     * @return builder
     */
    def containerResources(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.builder
      builder.containerResources(args(argsBuilder).build)

    /**
     * @param podTolerations Pod tolerations of node taints.
     * @return builder
     */
    def podTolerations(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.builder
      builder.podTolerations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder)
    /**
     * @param configmanagement Config Management-specific spec. Structure is documented below.
     * @return builder
     */
    def configmanagement(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementArgs.builder
      builder.configmanagement(args(argsBuilder).build)

    /**
     * @param mesh Service mesh specific spec. Structure is documented below.
     * @return builder
     */
    def mesh(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipMeshArgs.builder
      builder.mesh(args(argsBuilder).build)

    /**
     * @param policycontroller Policy Controller-specific spec. Structure is documented below.
     * @return builder
     */
    def policycontroller(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipPolicycontrollerArgs.builder
      builder.policycontroller(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.ScopeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder)
    /**
     * @param containerResources Container resource requirements.
     *  Structure is documented below.
     * @return builder
     */
    def containerResources(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.builder
      builder.containerResources(args(argsBuilder).build)

    /**
     * @param podTolerations Pod tolerations of node taints.
     *  Structure is documented below.
     * @return builder
     */
    def podTolerations(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigPodTolerationArgs.builder
      builder.podTolerations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureState.Builder)
    /**
     * @param fleetDefaultMemberConfig Optional. Fleet Default Membership Configuration.
     *  Structure is documented below.
     * @return builder
     */
    def fleetDefaultMemberConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigArgs.builder
      builder.fleetDefaultMemberConfig(args(argsBuilder).build)

    /**
     * @param resourceStates State of the Feature resource itself.
     *  Structure is documented below.
     * @return builder
     */
    def resourceStates(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureResourceStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureResourceStateArgs.builder
      builder.resourceStates(args.map(_(argsBuilder).build)*)

    /**
     * @param spec Optional. Hub-wide Feature configuration. If this Feature does not support any Hub-wide configuration, this field may be unused.
     *  Structure is documented below.
     * @return builder
     */
    def spec(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.builder
      builder.spec(args(argsBuilder).build)

    /**
     * @param states (Output)
     *  Output only. The &#34;running state&#34; of the Feature in this Hub.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.ScopeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.ScopeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.ScopeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder)
    /**
     * @param gkeUpgradeOverrides Configuration overrides for individual upgrades.
     *  Structure is documented below.
     * @return builder
     */
    def gkeUpgradeOverrides(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeGkeUpgradeOverrideArgs.builder
      builder.gkeUpgradeOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param postConditions Post conditions to override for the specified upgrade.
     *  Structure is documented below.
     * @return builder
     */
    def postConditions(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradePostConditionsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradePostConditionsArgs.builder
      builder.postConditions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.NamespaceState.Builder)
    /**
     * @param states State of the namespace resource.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.NamespaceStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.NamespaceState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.NamespaceStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder)
    /**
     * @param clusterSelector Filter to select a subset of clusters from the specified Fleet projects.
     *  If not specified, all clusters in the fleet projects are selected.
     *  Structure is documented below.
     * @return builder
     */
    def clusterSelector(args: Endofunction[com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageClusterSelectorArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.RolloutSequenceStageClusterSelectorArgs.builder
      builder.clusterSelector(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FleetState.Builder)
    /**
     * @param defaultClusterConfig The default cluster configurations to apply across the fleet.
     *  Structure is documented below.
     * @return builder
     */
    def defaultClusterConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FleetState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.builder
      builder.defaultClusterConfig(args(argsBuilder).build)

    /**
     * @param states The state of the fleet resource.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FleetState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.Builder)
    /**
     * @param containers The override configurations for the containers in the Deployment. Structure is documented below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder)
    /**
     * @param deploymentOverrides The override configurations for the Config Sync Deployments. Structure is documented below. The field is only available on Config Sync version 1.20.1 or later.
     * @return builder
     */
    def deploymentOverrides(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncDeploymentOverrideArgs.builder
      builder.deploymentOverrides(args.map(_(argsBuilder).build)*)

    /**
     * @param git (Optional) Structure is documented below.
     * @return builder
     */
    def git(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncGitArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncGitArgs.builder
      builder.git(args(argsBuilder).build)

    /**
     * @param oci (Optional) Supported from Config Sync versions 1.12.0 onwards. Structure is documented below.
     * 
     *  Use either `git` or `oci` config option.
     * @return builder
     */
    def oci(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncOciArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureMembershipConfigmanagementConfigSyncOciArgs.builder
      builder.oci(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder)
    /**
     * @param binaryAuthorizationConfig Enable/Disable binary authorization features for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def binaryAuthorizationConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.builder
      builder.binaryAuthorizationConfig(args(argsBuilder).build)

    /**
     * @param securityPostureConfig Enable/Disable Security Posture features for the cluster.
     *  Structure is documented below.
     * @return builder
     */
    def securityPostureConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigSecurityPostureConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigSecurityPostureConfigArgs.builder
      builder.securityPostureConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder)
    /**
     * @param limits Limits describes the maximum amount of compute resources allowed for use by the running container.
     *  Structure is documented below.
     * @return builder
     */
    def limits(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesLimitsArgs.builder
      builder.limits(args(argsBuilder).build)

    /**
     * @param requests Requests describes the amount of compute resources reserved for the container by the kube-scheduler.
     *  Structure is documented below.
     * @return builder
     */
    def requests(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigDeploymentConfigContainerResourcesRequestsArgs.builder
      builder.requests(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.Builder)
    /**
     * @param configSync ConfigSync configuration for the cluster
     *  Structure is documented below.
     * @return builder
     */
    def configSync(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs.builder
      builder.configSync(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder)
    /**
     * @param clusterupgrade Clusterupgrade feature spec.
     *  Structure is documented below.
     * @return builder
     */
    def clusterupgrade(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecClusterupgradeArgs.builder
      builder.clusterupgrade(args(argsBuilder).build)

    /**
     * @param fleetobservability Fleet Observability feature spec.
     *  Structure is documented below.
     * @return builder
     */
    def fleetobservability(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.builder
      builder.fleetobservability(args(argsBuilder).build)

    /**
     * @param multiclusteringress Multicluster Ingress-specific spec.
     *  Structure is documented below.
     * @return builder
     */
    def multiclusteringress(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecMulticlusteringressArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecMulticlusteringressArgs.builder
      builder.multiclusteringress(args(argsBuilder).build)

    /**
     * @param rbacrolebindingactuation RBACRolebinding Actuation feature spec.
     *  Structure is documented below.
     * @return builder
     */
    def rbacrolebindingactuation(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecRbacrolebindingactuationArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecRbacrolebindingactuationArgs.builder
      builder.rbacrolebindingactuation(args(argsBuilder).build)

    /**
     * @param workloadidentity Workload Identity feature spec.
     *  Structure is documented below.
     * @return builder
     */
    def workloadidentity(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecWorkloadidentityArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecWorkloadidentityArgs.builder
      builder.workloadidentity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.Builder)
    /**
     * @param policyControllerHubConfig Configuration of Policy Controller
     *  Structure is documented below.
     * @return builder
     */
    def policyControllerHubConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureFleetDefaultMemberConfigPolicycontrollerPolicyControllerHubConfigArgs.builder
      builder.policyControllerHubConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.Builder)
    /**
     * @param policyBindings Binauthz policies that apply to this cluster.
     *  Structure is documented below.
     * @return builder
     */
    def policyBindings(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.FleetDefaultClusterConfigBinaryAuthorizationConfigPolicyBindingArgs.builder
      builder.policyBindings(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder)
    /**
     * @param gkeCluster If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     *  Structure is documented below.
     * @return builder
     */
    def gkeCluster(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.MembershipEndpointArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterArgs.builder
      builder.gkeCluster(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.gkehub.inputs.MembershipBindingState.Builder)
    /**
     * @param states State of the membership binding resource.
     *  Structure is documented below.
     * @return builder
     */
    def states(args: Endofunction[com.pulumi.gcp.gkehub.inputs.MembershipBindingStateArgs.Builder]*):
        com.pulumi.gcp.gkehub.inputs.MembershipBindingState.Builder =
      def argsBuilder = com.pulumi.gcp.gkehub.inputs.MembershipBindingStateArgs.builder
      builder.states(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.Builder)
    /**
     * @param loggingConfig Specified if fleet logging feature is enabled for the entire fleet. If UNSPECIFIED, fleet logging feature is disabled for the entire fleet.
     *  Structure is documented below.
     * @return builder
     */
    def loggingConfig(args: Endofunction[com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.Builder]):
        com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityArgs.Builder =
      val argsBuilder = com.pulumi.gcp.gkehub.inputs.FeatureSpecFleetobservabilityLoggingConfigArgs.builder
      builder.loggingConfig(args(argsBuilder).build)
