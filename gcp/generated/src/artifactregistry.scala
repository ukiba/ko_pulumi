package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object artifactregistry:
  extension (builder: com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder)
    /**
     * @param cleanupPolicies Cleanup policies for this repository. Cleanup policies indicate when
     *  certain package versions can be automatically deleted.
     *  Map keys are policy IDs supplied by users during policy creation. They must
     *  unique within a repository and be under 128 characters in length.
     *  Structure is documented below.
     * @return builder
     */
    def cleanupPolicies(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder]*):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      def argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.builder
      builder.cleanupPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param dockerConfig Docker repository config contains repository level configuration for the repositories of docker type.
     *  Structure is documented below.
     * @return builder
     */
    def dockerConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.builder
      builder.dockerConfig(args(argsBuilder).build)

    /**
     * @param mavenConfig MavenRepositoryConfig is maven related repository details.
     *  Provides additional configuration details for repositories of the maven
     *  format type.
     *  Structure is documented below.
     * @return builder
     */
    def mavenConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.builder
      builder.mavenConfig(args(argsBuilder).build)

    /**
     * @param remoteRepositoryConfig Configuration specific for a Remote Repository.
     *  Structure is documented below.
     * @return builder
     */
    def remoteRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.builder
      builder.remoteRepositoryConfig(args(argsBuilder).build)

    /**
     * @param virtualRepositoryConfig Configuration specific for a Virtual Repository.
     *  Structure is documented below.
     * @return builder
     */
    def virtualRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.builder
      builder.virtualRepositoryConfig(args(argsBuilder).build)

    /**
     * @param vulnerabilityScanningConfig Configuration for vulnerability scanning of artifacts stored in this repository.
     *  Structure is documented below.
     * @return builder
     */
    def vulnerabilityScanningConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.builder
      builder.vulnerabilityScanningConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Artifact Registry Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.artifactregistry.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.artifactregistry.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.artifactregistry.RepositoryIamBinding` and `gcp.artifactregistry.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.artifactregistry.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.artifactregistry.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicy;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/artifactregistry.reader")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBinding;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMember;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
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
   *  # IAM policy for Artifact Registry Repository
   * 
   *  Three different resources help you manage your IAM policy for Artifact Registry Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.artifactregistry.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.artifactregistry.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.artifactregistry.RepositoryIamBinding` and `gcp.artifactregistry.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.artifactregistry.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.artifactregistry.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicy;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/artifactregistry.reader")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBinding;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMember;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
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
   *  * projects/{{project}}/locations/{{location}}/repositories/{{repository}}
   *  * {{project}}/{{location}}/{{repository}}
   *  * {{location}}/{{repository}}
   *  * {{repository}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Artifact Registry repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_artifact_registry_repository_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/artifactregistry.reader user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_artifact_registry_repository_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/artifactregistry.reader&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:artifactregistry/repositoryIamMember:RepositoryIamMember editor projects/{{project}}/locations/{{location}}/repositories/{{repository}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs.builder
    com.pulumi.gcp.artifactregistry.RepositoryIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.RuleArgs.Builder)
    /**
     * @param condition Optional. A CEL expression for conditions that must be met in order for the
     *  rule to apply. If not provided, the rule matches all objects.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RuleArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  type ArtifactregistryFunctions = com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions
  object ArtifactregistryFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.*
  extension (self: ArtifactregistryFunctions.type)
    /**
     * This data source fetches information from a provided Artifact Registry repository, including the fully qualified name and URI for an image, based on a the latest version of image name and optional digest or tag.
     * 
     *  &gt; **Note**
     *  Requires one of the following OAuth scopes: `https://www.googleapis.com/auth/cloud-platform` or `https://www.googleapis.com/auth/cloud-platform.read-only`.
     */
    def getDockerImage(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetDockerImageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetDockerImageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetDockerImageArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getDockerImage(args(argsBuilder).build)

    /**
     * This data source fetches information from a provided Artifact Registry repository, including the fully qualified name and URI for an image, based on a the latest version of image name and optional digest or tag.
     * 
     *  &gt; **Note**
     *  Requires one of the following OAuth scopes: `https://www.googleapis.com/auth/cloud-platform` or `https://www.googleapis.com/auth/cloud-platform.read-only`.
     */
    def getDockerImagePlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetDockerImagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetDockerImageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetDockerImagePlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getDockerImagePlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Docker images.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/docker)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages/list).
     */
    def getDockerImages(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetDockerImagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetDockerImagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetDockerImagesArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getDockerImages(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Docker images.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/docker)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.dockerImages/list).
     */
    def getDockerImagesPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetDockerImagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetDockerImagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetDockerImagesPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getDockerImagesPlain(args(argsBuilder).build)

    /**
     * Downloads a single file from a Google Artifact Registry repository to a local
     *  path and exposes its metadata and content hashes. Applies to file-based
     *  Artifact Registry formats (Generic, Maven, npm, Python, Apt, Yum, Go). For
     *  Docker/OCI images, use
     *  `gcp.artifactregistry.getDockerImage`.
     * 
     *  &gt; **Note:** This data source downloads the file on every Terraform read
     *  (i.e. every `plan` and `apply`). For large files this can add significant
     *  time to each run. Use `overwrite = false` to skip the download when the
     *  local file already matches the remote \u2014 see the `overwrite` argument below.
     * 
     *  To get more information about Artifact Registry files, see:
     * 
     *  * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.files)
     */
    def getFile(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetFileArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetFileResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetFileArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getFile(args(argsBuilder).build)

    /**
     * Downloads a single file from a Google Artifact Registry repository to a local
     *  path and exposes its metadata and content hashes. Applies to file-based
     *  Artifact Registry formats (Generic, Maven, npm, Python, Apt, Yum, Go). For
     *  Docker/OCI images, use
     *  `gcp.artifactregistry.getDockerImage`.
     * 
     *  &gt; **Note:** This data source downloads the file on every Terraform read
     *  (i.e. every `plan` and `apply`). For large files this can add significant
     *  time to each run. Use `overwrite = false` to skip the download when the
     *  local file already matches the remote \u2014 see the `overwrite` argument below.
     * 
     *  To get more information about Artifact Registry files, see:
     * 
     *  * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.files)
     */
    def getFilePlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetFilePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetFileResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetFilePlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getFilePlain(args(argsBuilder).build)

    /**
     * Get Artifact Registry locations available for a project.
     * 
     *  To get more information about Artifact Registry, see:
     * 
     *  * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations/list)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/artifact-registry/docs/overview)
     */
    def getLocations(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetLocationsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetLocationsArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getLocations(args(argsBuilder).build)

    /**
     * Get Artifact Registry locations available for a project.
     * 
     *  To get more information about Artifact Registry, see:
     * 
     *  * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations/list)
     *  * How-to Guides
     *      * [Official Documentation](https://cloud.google.com/artifact-registry/docs/overview)
     */
    def getLocationsPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetLocationsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetLocationsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetLocationsPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getLocationsPlain(args(argsBuilder).build)

    /** This data source fetches information from a provided Artifact Registry repository, based on a the latest version of the artifact and optional version. */
    def getMavenArtifact(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetMavenArtifactResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getMavenArtifact(args(argsBuilder).build)

    /** This data source fetches information from a provided Artifact Registry repository, based on a the latest version of the artifact and optional version. */
    def getMavenArtifactPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetMavenArtifactResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getMavenArtifactPlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Maven artifacts.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/java)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.mavenArtifacts/list).
     */
    def getMavenArtifacts(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetMavenArtifactsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactsArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getMavenArtifacts(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Maven artifacts.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/java)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.mavenArtifacts/list).
     */
    def getMavenArtifactsPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetMavenArtifactsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetMavenArtifactsPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getMavenArtifactsPlain(args(argsBuilder).build)

    /** This data source fetches information from a provided Artifact Registry repository, based on a the latest version of the package and optional version. */
    def getNpmPackage(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetNpmPackageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetNpmPackageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetNpmPackageArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getNpmPackage(args(argsBuilder).build)

    /** This data source fetches information from a provided Artifact Registry repository, based on a the latest version of the package and optional version. */
    def getNpmPackagePlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetNpmPackagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetNpmPackageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetNpmPackagePlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getNpmPackagePlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Npm packages.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/nodejs)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.npmPackages/list).
     */
    def getNpmPackages(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetNpmPackagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetNpmPackagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetNpmPackagesArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getNpmPackages(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Npm packages.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/nodejs)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.npmPackages/list).
     */
    def getNpmPackagesPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetNpmPackagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetNpmPackagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetNpmPackagesPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getNpmPackagesPlain(args(argsBuilder).build)

    /** This data source fetches information of a package from a provided Artifact Registry repository. */
    def getPackage(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPackageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetPackageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPackageArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPackage(args(argsBuilder).build)

    /** This data source fetches information of a package from a provided Artifact Registry repository. */
    def getPackagePlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPackagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetPackageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPackagePlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPackagePlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry packages.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/overview)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.packages/list).
     */
    def getPackages(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPackagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetPackagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPackagesArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPackages(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry packages.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/overview)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.packages/list).
     */
    def getPackagesPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPackagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetPackagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPackagesPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPackagesPlain(args(argsBuilder).build)

    /** This data source fetches information from a provided Artifact Registry repository, based on a the latest version of the package and optional version. */
    def getPythonPackage(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPythonPackageArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetPythonPackageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPythonPackageArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPythonPackage(args(argsBuilder).build)

    /** This data source fetches information from a provided Artifact Registry repository, based on a the latest version of the package and optional version. */
    def getPythonPackagePlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPythonPackagePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetPythonPackageResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPythonPackagePlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPythonPackagePlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Python packages.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/python)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.pythonPackages/list).
     */
    def getPythonPackages(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPythonPackagesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetPythonPackagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPythonPackagesArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPythonPackages(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry Python packages.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/python)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.pythonPackages/list).
     */
    def getPythonPackagesPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetPythonPackagesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetPythonPackagesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetPythonPackagesPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getPythonPackagesPlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry repositories.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories/list).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions;
     *  import com.pulumi.gcp.artifactregistry.inputs.GetRepositoriesArgs;
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
     *          final var example = ArtifactregistryFunctions.getRepositories(GetRepositoriesArgs.builder()
     *              .location("us-central1")
     *              .project("my-project")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getRepositories(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetRepositoriesArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetRepositoriesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetRepositoriesArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getRepositories(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry repositories.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories/list).
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions;
     *  import com.pulumi.gcp.artifactregistry.inputs.GetRepositoriesArgs;
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
     *          final var example = ArtifactregistryFunctions.getRepositories(GetRepositoriesArgs.builder()
     *              .location("us-central1")
     *              .project("my-project")
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    def getRepositoriesPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetRepositoriesPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetRepositoriesResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetRepositoriesPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getRepositoriesPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Artifact Registry Repository. For more information see
     *  the [official documentation](https://cloud.google.com/artifact-registry/docs/)
     *  and [API](https://cloud.google.com/artifact-registry/docs/apis).
     */
    def getRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetRepositoryArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetRepositoryArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getRepository(args(argsBuilder).build)

    /**
     * Get information about a Google Artifact Registry Repository. For more information see
     *  the [official documentation](https://cloud.google.com/artifact-registry/docs/)
     *  and [API](https://cloud.google.com/artifact-registry/docs/apis).
     */
    def getRepositoryPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetRepositoryPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetRepositoryResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetRepositoryPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getRepositoryPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repository */
    def getRepositoryIamPolicy(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetRepositoryIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetRepositoryIamPolicyArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getRepositoryIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for repository */
    def getRepositoryIamPolicyPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetRepositoryIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetRepositoryIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetRepositoryIamPolicyPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getRepositoryIamPolicyPlain(args(argsBuilder).build)

    /** This data source fetches information of a tag from a provided Artifact Registry repository. */
    def getTag(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetTagArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetTagResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetTagArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getTag(args(argsBuilder).build)

    /** This data source fetches information of a tag from a provided Artifact Registry repository. */
    def getTagPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetTagPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetTagResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetTagPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getTagPlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry tags.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/overview)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.packages.tags/list).
     */
    def getTags(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetTagsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetTagsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetTagsArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getTags(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry tags.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/overview)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.packages.tags/list).
     */
    def getTagsPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetTagsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetTagsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetTagsPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getTagsPlain(args(argsBuilder).build)

    /** This data source fetches information of a version from a provided Artifact Registry repository. */
    def getVersion(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetVersionResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetVersionArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getVersion(args(argsBuilder).build)

    /** This data source fetches information of a version from a provided Artifact Registry repository. */
    def getVersionPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetVersionResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetVersionPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getVersionPlain(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry versions.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/overview)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.packages.versions/list).
     */
    def getVersions(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetVersionsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.artifactregistry.outputs.GetVersionsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetVersionsArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getVersions(args(argsBuilder).build)

    /**
     * Get information about Artifact Registry versions.
     *  See [the official documentation](https://cloud.google.com/artifact-registry/docs/overview)
     *  and [API](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.packages.versions/list).
     */
    def getVersionsPlain(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.GetVersionsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.artifactregistry.outputs.GetVersionsResult] =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.GetVersionsPlainArgs.builder
      com.pulumi.gcp.artifactregistry.ArtifactregistryFunctions.getVersionsPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Artifact Registry Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.artifactregistry.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.artifactregistry.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.artifactregistry.RepositoryIamBinding` and `gcp.artifactregistry.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.artifactregistry.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.artifactregistry.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicy;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/artifactregistry.reader")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBinding;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMember;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
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
   *  # IAM policy for Artifact Registry Repository
   * 
   *  Three different resources help you manage your IAM policy for Artifact Registry Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.artifactregistry.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.artifactregistry.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.artifactregistry.RepositoryIamBinding` and `gcp.artifactregistry.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.artifactregistry.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.artifactregistry.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicy;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/artifactregistry.reader")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBinding;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMember;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
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
   *  * projects/{{project}}/locations/{{location}}/repositories/{{repository}}
   *  * {{project}}/{{location}}/{{repository}}
   *  * {{location}}/{{repository}}
   *  * {{repository}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Artifact Registry repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_artifact_registry_repository_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/artifactregistry.reader user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_artifact_registry_repository_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/artifactregistry.reader&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:artifactregistry/repositoryIamPolicy:RepositoryIamPolicy editor projects/{{project}}/locations/{{location}}/repositories/{{repository}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs.builder
    com.pulumi.gcp.artifactregistry.RepositoryIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Artifact Registry Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.artifactregistry.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.artifactregistry.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.artifactregistry.RepositoryIamBinding` and `gcp.artifactregistry.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.artifactregistry.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.artifactregistry.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicy;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/artifactregistry.reader")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBinding;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMember;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
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
   *  # IAM policy for Artifact Registry Repository
   * 
   *  Three different resources help you manage your IAM policy for Artifact Registry Repository. Each of these resources serves a different use case:
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Authoritative. Sets the IAM policy for the repository and replaces any existing policy already attached.
   *  * `gcp.artifactregistry.RepositoryIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the repository are preserved.
   *  * `gcp.artifactregistry.RepositoryIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the repository are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.artifactregistry.RepositoryIamPolicy`: Retrieves the IAM policy for the repository
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamPolicy` **cannot** be used in conjunction with `gcp.artifactregistry.RepositoryIamBinding` and `gcp.artifactregistry.RepositoryIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.artifactregistry.RepositoryIamBinding` resources **can be** used in conjunction with `gcp.artifactregistry.RepositoryIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.artifactregistry.RepositoryIamPolicy
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
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicy;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
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
   *                  .role("roles/artifactregistry.reader")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new RepositoryIamPolicy("policy", RepositoryIamPolicyArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBinding;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new RepositoryIamBinding("binding", RepositoryIamBindingArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.artifactregistry.RepositoryIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMember;
   *  import com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new RepositoryIamMember("member", RepositoryIamMemberArgs.builder()
   *              .project(my_repo.project())
   *              .location(my_repo.location())
   *              .repository(my_repo.name())
   *              .role("roles/artifactregistry.reader")
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
   *  * projects/{{project}}/locations/{{location}}/repositories/{{repository}}
   *  * {{project}}/{{location}}/{{repository}}
   *  * {{location}}/{{repository}}
   *  * {{repository}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Artifact Registry repository IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_artifact_registry_repository_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/artifactregistry.reader user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_artifact_registry_repository_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository}} roles/artifactregistry.reader&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:artifactregistry/repositoryIamBinding:RepositoryIamBinding editor projects/{{project}}/locations/{{location}}/repositories/{{repository}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def RepositoryIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.artifactregistry.RepositoryIamBindingArgs.builder
    com.pulumi.gcp.artifactregistry.RepositoryIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A repository for storing artifacts
   * 
   *  To get more information about Repository, see:
   * 
   *  * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/artifact-registry/docs/overview)
   */
  def Repository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.artifactregistry.RepositoryArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.artifactregistry.RepositoryArgs.builder
    com.pulumi.gcp.artifactregistry.Repository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A rule defines the deny or allow action of the operation it applies to and the conditions required for the rule to apply. You can set one rule for an entire repository and one rule for each package within.
   * 
   *  To get more information about Rule, see:
   * 
   *  * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories.rules)
   *  * How-to Guides
   *      * [Official Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/artifacts/rules)
   */
  def Rule(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.artifactregistry.RuleArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.artifactregistry.RuleArgs.builder
    com.pulumi.gcp.artifactregistry.Rule(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * The Artifact Registry VPC SC config that applies to a Project.
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about VPCSCConfig, see:
   * 
   *  * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/VPCSCConfig)
   * 
   *  &gt; **Note:** VPC SC configs are automatically created for a given location. Creating a
   *  resource of this type will acquire and update the resource that already
   *  exists at the location. Deleting this resource will remove the config from
   *  your Terraform state but leave the resource as is.
   */
  def VpcscConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.artifactregistry.VpcscConfigArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.artifactregistry.VpcscConfigArgs.builder
    com.pulumi.gcp.artifactregistry.VpcscConfig(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     *  Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder)
    /**
     * @param condition Policy condition for matching versions.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyConditionArgs.builder
      builder.condition(args(argsBuilder).build)

    /**
     * @param mostRecentVersions Policy condition for retaining a minimum number of versions. May only be
     *  specified with a Keep action.
     *  Structure is documented below.
     * @return builder
     */
    def mostRecentVersions(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyMostRecentVersionsArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyMostRecentVersionsArgs.builder
      builder.mostRecentVersions(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     *  Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.Builder)
    /**
     * @param publicRepository One of the publicly available Yum repositories supported by Artifact Registry.
     *  Structure is documented below.
     * @return builder
     */
    def publicRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs.builder
      builder.publicRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.Builder)
    /**
     * @param publicRepository One of the publicly available Apt repositories supported by Artifact Registry.
     *  Structure is documented below.
     * @return builder
     */
    def publicRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryArgs.builder
      builder.publicRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     *  Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder)
    /**
     * @param upstreamPolicies Policies that configure the upstream artifacts distributed by the Virtual
     *  Repository. Upstream policies cannot be set on a standard repository.
     *  Structure is documented below.
     * @return builder
     */
    def upstreamPolicies(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigUpstreamPolicyArgs.Builder]*):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder =
      def argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigUpstreamPolicyArgs.builder
      builder.upstreamPolicies(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder)
    /**
     * @param cleanupPolicies Cleanup policies for this repository. Cleanup policies indicate when
     *  certain package versions can be automatically deleted.
     *  Map keys are policy IDs supplied by users during policy creation. They must
     *  unique within a repository and be under 128 characters in length.
     *  Structure is documented below.
     * @return builder
     */
    def cleanupPolicies(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.Builder]*):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      def argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs.builder
      builder.cleanupPolicies(args.map(_(argsBuilder).build)*)

    /**
     * @param dockerConfig Docker repository config contains repository level configuration for the repositories of docker type.
     *  Structure is documented below.
     * @return builder
     */
    def dockerConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs.builder
      builder.dockerConfig(args(argsBuilder).build)

    /**
     * @param mavenConfig MavenRepositoryConfig is maven related repository details.
     *  Provides additional configuration details for repositories of the maven
     *  format type.
     *  Structure is documented below.
     * @return builder
     */
    def mavenConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryMavenConfigArgs.builder
      builder.mavenConfig(args(argsBuilder).build)

    /**
     * @param remoteRepositoryConfig Configuration specific for a Remote Repository.
     *  Structure is documented below.
     * @return builder
     */
    def remoteRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.builder
      builder.remoteRepositoryConfig(args(argsBuilder).build)

    /**
     * @param virtualRepositoryConfig Configuration specific for a Virtual Repository.
     *  Structure is documented below.
     * @return builder
     */
    def virtualRepositoryConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs.builder
      builder.virtualRepositoryConfig(args(argsBuilder).build)

    /**
     * @param vulnerabilityScanningConfig Configuration for vulnerability scanning of artifacts stored in this repository.
     *  Structure is documented below.
     * @return builder
     */
    def vulnerabilityScanningConfig(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryVulnerabilityScanningConfigArgs.builder
      builder.vulnerabilityScanningConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.Builder)
    /**
     * @param customRepository [Deprecated, please use commonRepository instead] Settings for a remote repository with a custom uri.
     *  Structure is documented below.
     * @return builder
     */
    def customRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryCustomRepositoryArgs.builder
      builder.customRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder)
    /**
     * @param aptRepository Specific settings for an Apt remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def aptRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs.builder
      builder.aptRepository(args(argsBuilder).build)

    /**
     * @param commonRepository Specific settings for an Artifact Registory remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def commonRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigCommonRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigCommonRepositoryArgs.builder
      builder.commonRepository(args(argsBuilder).build)

    /**
     * @param dockerRepository Specific settings for a Docker remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def dockerRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs.builder
      builder.dockerRepository(args(argsBuilder).build)

    /**
     * @param mavenRepository Specific settings for a Maven remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def mavenRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigMavenRepositoryArgs.builder
      builder.mavenRepository(args(argsBuilder).build)

    /**
     * @param npmRepository Specific settings for an Npm remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def npmRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigNpmRepositoryArgs.builder
      builder.npmRepository(args(argsBuilder).build)

    /**
     * @param pythonRepository Specific settings for a Python remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def pythonRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigPythonRepositoryArgs.builder
      builder.pythonRepository(args(argsBuilder).build)

    /**
     * @param upstreamCredentials The credentials used to access the remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def upstreamCredentials(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.builder
      builder.upstreamCredentials(args(argsBuilder).build)

    /**
     * @param yumRepository Specific settings for an Yum remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def yumRepository(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs.builder
      builder.yumRepository(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.Builder)
    /**
     * @param usernamePasswordCredentials Use username and password to access the remote repository.
     *  Structure is documented below.
     * @return builder
     */
    def usernamePasswordCredentials(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigUpstreamCredentialsUsernamePasswordCredentialsArgs.builder
      builder.usernamePasswordCredentials(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RuleState.Builder)
    /**
     * @param condition Optional. A CEL expression for conditions that must be met in order for the
     *  rule to apply. If not provided, the rule matches all objects.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RuleState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RuleConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.artifactregistry.RepositoryIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.artifactregistry.inputs.RepositoryIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
