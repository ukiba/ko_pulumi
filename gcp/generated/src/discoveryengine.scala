package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object discoveryengine:
  /**
   * Access Control Configuration.
   * 
   * To get more information about AclConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rpc/google.cloud.discoveryengine.v1alpha#aclconfigservice)
   */
  def AclConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.AclConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.AclConfigArgs.builder
    com.pulumi.gcp.discoveryengine.AclConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Assistant
   * 
   * To get more information about Assistant, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rpc/google.cloud.discoveryengine.v1#assistantservice)
   */
  def Assistant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.AssistantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.AssistantArgs.builder
    com.pulumi.gcp.discoveryengine.Assistant(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Vertex chat and Conversation Engine Chat type
   * 
   * To get more information about ChatEngine, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.engines)
   * * How-to Guides
   *     * [Vertex AI Conversation](https://cloud.google.com/dialogflow/cx/docs/concept/generative)
   */
  def ChatEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.ChatEngineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.ChatEngineArgs.builder
    com.pulumi.gcp.discoveryengine.ChatEngine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * CmekConfig represents configurations used to enable CMEK data encryption with
   * Cloud KMS keys.
   * 
   * To get more information about CmekConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.cmekConfigs)
   */
  def CmekConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.CmekConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.CmekConfigArgs.builder
    com.pulumi.gcp.discoveryengine.CmekConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Controls are rules that influence search results.
   * 
   * To get more information about Control, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1/projects.locations.collections.engines.controls)
   * * How-to Guides
   *     * [Configure serving controls](https://cloud.google.com/gemini/enterprise/docs/configure-serving-controls)
   */
  def Control(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.ControlArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.ControlArgs.builder
    com.pulumi.gcp.discoveryengine.Control(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * DataConnector manages the connection to external data sources for all data stores grouped
   * under a Collection. It&#39;s a singleton resource of Collection. The initialization is only
   * supported through DataConnectorService.SetUpDataConnector method, which will create a new
   * Collection and initialize its DataConnector.
   * 
   * To get more information about DataConnector, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rpc/google.cloud.discoveryengine.v1alpha#dataconnectorservice)
   * * How-to Guides
   *     * [Introduction](https://cloud.google.com/agentspace/docs/introduction-to-connectors-and-data-stores)
   */
  def DataConnector(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.DataConnectorArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.DataConnectorArgs.builder
    com.pulumi.gcp.discoveryengine.DataConnector(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Data store is a collection of websites and documents used to find answers for
   * end-user&#39;s questions in Discovery Engine (a.k.a. Vertex AI Search and
   * Conversation).
   * 
   * To get more information about DataStore, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores)
   * * How-to Guides
   *     * [Create a search data store](https://cloud.google.com/generative-ai-app-builder/docs/create-data-store-es)
   */
  def DataStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.DataStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.DataStoreArgs.builder
    com.pulumi.gcp.discoveryengine.DataStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object DiscoveryengineFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Gets an existing Discovery Engine data store by ID or display name.
     * See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     * and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/get).
     */
    inline def getDataStore(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStoreArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.discoveryengine.outputs.GetDataStoreResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStoreArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStore(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Gets an existing Discovery Engine data store by ID or display name.
     * See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     * and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/get).
     */
    inline def getDataStorePlain(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStorePlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.discoveryengine.outputs.GetDataStoreResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStorePlainArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStorePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Gets a list of existing Discovery Engine data stores.
     * See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     * and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/list).
     */
    inline def getDataStores(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStoresArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.discoveryengine.outputs.GetDataStoresResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStoresArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStores(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Gets a list of existing Discovery Engine data stores.
     * See [the official documentation](https://cloud.google.com/generative-ai-app-builder/docs/manage-data-stores)
     * and [API](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores/list).
     */
    inline def getDataStoresPlain(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetDataStoresPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.discoveryengine.outputs.GetDataStoresResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetDataStoresPlainArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getDataStoresPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Retrieves the current IAM policy data for searchengine */
    inline def getSearchEngineIamPolicy(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetSearchEngineIamPolicyArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.discoveryengine.outputs.GetSearchEngineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetSearchEngineIamPolicyArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getSearchEngineIamPolicy(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Retrieves the current IAM policy data for searchengine */
    inline def getSearchEngineIamPolicyPlain(args: Endofunction[com.pulumi.gcp.discoveryengine.inputs.GetSearchEngineIamPolicyPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.discoveryengine.outputs.GetSearchEngineIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.discoveryengine.inputs.GetSearchEngineIamPolicyPlainArgs.builder
      com.pulumi.gcp.discoveryengine.DiscoveryengineFunctions.getSearchEngineIamPolicyPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * License Configuration.
   * 
   * To get more information about LicenseConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.licenseConfigs)
   */
  def LicenseConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.LicenseConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.LicenseConfigArgs.builder
    com.pulumi.gcp.discoveryengine.LicenseConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Vertex AI Search recommendation apps.
   * 
   * To get more information about RecommendationEngine, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.engines)
   * * How-to Guides
   *     * [Create a Recommendation Engine](https://cloud.google.com/generative-ai-app-builder/docs/create-generic-recommendations-app)
   */
  def RecommendationEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.RecommendationEngineArgs.builder
    com.pulumi.gcp.discoveryengine.RecommendationEngine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Schema defines the structure and layout of a type of document data.
   * 
   * To get more information about Schema, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.schemas)
   * * How-to Guides
   *     * [Provide a schema for your data store](https://cloud.google.com/generative-ai-app-builder/docs/provide-schema)
   */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SchemaArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SchemaArgs.builder
    com.pulumi.gcp.discoveryengine.Schema(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Vertex AI Search and Conversation can be used to create a search engine or a chat application by connecting it with a datastore
   * 
   * To get more information about SearchEngine, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.engines)
   * * How-to Guides
   *     * [Create a Search Engine](https://cloud.google.com/generative-ai-app-builder/docs/create-engine-es)
   */
  def SearchEngine(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SearchEngineArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SearchEngineArgs.builder
    com.pulumi.gcp.discoveryengine.SearchEngine(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Discovery Engine SearchEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Authoritative. Sets the IAM policy for the searchengine and replaces any existing policy already attached.
   * * `gcp.discoveryengine.SearchEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the searchengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.discoveryengine.SearchEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the searchengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Retrieves the IAM policy for the searchengine
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamPolicy` **cannot** be used in conjunction with `gcp.discoveryengine.SearchEngineIamBinding` and `gcp.discoveryengine.SearchEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamBinding` resources **can be** used in conjunction with `gcp.discoveryengine.SearchEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.discoveryengine.SearchEngineIamPolicy
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
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicy;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/discoveryengine.agentspaceUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SearchEngineIamPolicy("policy", SearchEngineIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBinding;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SearchEngineIamBinding("binding", SearchEngineIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMember;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SearchEngineIamMember("member", SearchEngineIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
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
   * # IAM policy for Discovery Engine SearchEngine
   * 
   * Three different resources help you manage your IAM policy for Discovery Engine SearchEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Authoritative. Sets the IAM policy for the searchengine and replaces any existing policy already attached.
   * * `gcp.discoveryengine.SearchEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the searchengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.discoveryengine.SearchEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the searchengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Retrieves the IAM policy for the searchengine
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamPolicy` **cannot** be used in conjunction with `gcp.discoveryengine.SearchEngineIamBinding` and `gcp.discoveryengine.SearchEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamBinding` resources **can be** used in conjunction with `gcp.discoveryengine.SearchEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.discoveryengine.SearchEngineIamPolicy
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
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicy;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/discoveryengine.agentspaceUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SearchEngineIamPolicy("policy", SearchEngineIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBinding;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SearchEngineIamBinding("binding", SearchEngineIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMember;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SearchEngineIamMember("member", SearchEngineIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
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
   * * projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}
   * * {{project}}/{{location}}/{{collection_id}}/{{engine_id}}
   * * {{location}}/{{collection_id}}/{{engine_id}}
   * * {{engine_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Discovery Engine searchengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_discovery_engine_search_engine_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}} roles/discoveryengine.agentspaceUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_discovery_engine_search_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}} roles/discoveryengine.agentspaceUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:discoveryengine/searchEngineIamBinding:SearchEngineIamBinding editor projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SearchEngineIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs.builder
    com.pulumi.gcp.discoveryengine.SearchEngineIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Discovery Engine SearchEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Authoritative. Sets the IAM policy for the searchengine and replaces any existing policy already attached.
   * * `gcp.discoveryengine.SearchEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the searchengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.discoveryengine.SearchEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the searchengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Retrieves the IAM policy for the searchengine
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamPolicy` **cannot** be used in conjunction with `gcp.discoveryengine.SearchEngineIamBinding` and `gcp.discoveryengine.SearchEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamBinding` resources **can be** used in conjunction with `gcp.discoveryengine.SearchEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.discoveryengine.SearchEngineIamPolicy
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
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicy;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/discoveryengine.agentspaceUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SearchEngineIamPolicy("policy", SearchEngineIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBinding;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SearchEngineIamBinding("binding", SearchEngineIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMember;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SearchEngineIamMember("member", SearchEngineIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
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
   * # IAM policy for Discovery Engine SearchEngine
   * 
   * Three different resources help you manage your IAM policy for Discovery Engine SearchEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Authoritative. Sets the IAM policy for the searchengine and replaces any existing policy already attached.
   * * `gcp.discoveryengine.SearchEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the searchengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.discoveryengine.SearchEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the searchengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Retrieves the IAM policy for the searchengine
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamPolicy` **cannot** be used in conjunction with `gcp.discoveryengine.SearchEngineIamBinding` and `gcp.discoveryengine.SearchEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamBinding` resources **can be** used in conjunction with `gcp.discoveryengine.SearchEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.discoveryengine.SearchEngineIamPolicy
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
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicy;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/discoveryengine.agentspaceUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SearchEngineIamPolicy("policy", SearchEngineIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBinding;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SearchEngineIamBinding("binding", SearchEngineIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMember;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SearchEngineIamMember("member", SearchEngineIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
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
   * * projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}
   * * {{project}}/{{location}}/{{collection_id}}/{{engine_id}}
   * * {{location}}/{{collection_id}}/{{engine_id}}
   * * {{engine_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Discovery Engine searchengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_discovery_engine_search_engine_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}} roles/discoveryengine.agentspaceUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_discovery_engine_search_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}} roles/discoveryengine.agentspaceUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:discoveryengine/searchEngineIamMember:SearchEngineIamMember editor projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SearchEngineIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs.builder
    com.pulumi.gcp.discoveryengine.SearchEngineIamMember(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Discovery Engine SearchEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Authoritative. Sets the IAM policy for the searchengine and replaces any existing policy already attached.
   * * `gcp.discoveryengine.SearchEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the searchengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.discoveryengine.SearchEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the searchengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Retrieves the IAM policy for the searchengine
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamPolicy` **cannot** be used in conjunction with `gcp.discoveryengine.SearchEngineIamBinding` and `gcp.discoveryengine.SearchEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamBinding` resources **can be** used in conjunction with `gcp.discoveryengine.SearchEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.discoveryengine.SearchEngineIamPolicy
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
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicy;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/discoveryengine.agentspaceUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SearchEngineIamPolicy("policy", SearchEngineIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBinding;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SearchEngineIamBinding("binding", SearchEngineIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMember;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SearchEngineIamMember("member", SearchEngineIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
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
   * # IAM policy for Discovery Engine SearchEngine
   * 
   * Three different resources help you manage your IAM policy for Discovery Engine SearchEngine. Each of these resources serves a different use case:
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Authoritative. Sets the IAM policy for the searchengine and replaces any existing policy already attached.
   * * `gcp.discoveryengine.SearchEngineIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the searchengine are preserved. Members added outside of Terraform for the same role will be detected as drift and removed on the next `pulumi up`.
   * * `gcp.discoveryengine.SearchEngineIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the searchengine are preserved. Members added outside of Terraform will **not** be detected as drift.
   * 
   * A data source can be used to retrieve policy data in advent you do not need creation
   * 
   * * `gcp.discoveryengine.SearchEngineIamPolicy`: Retrieves the IAM policy for the searchengine
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamPolicy` **cannot** be used in conjunction with `gcp.discoveryengine.SearchEngineIamBinding` and `gcp.discoveryengine.SearchEngineIamMember` or they will fight over what your policy should be.
   * 
   * &gt; **Note:** `gcp.discoveryengine.SearchEngineIamBinding` resources **can be** used in conjunction with `gcp.discoveryengine.SearchEngineIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   * ## gcp.discoveryengine.SearchEngineIamPolicy
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
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicy;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
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
   *                 .role("roles/discoveryengine.agentspaceUser")
   *                 .members("user:jane}{@literal @}{@code example.com")
   *                 .build())
   *             .build());
   * 
   *         var policy = new SearchEngineIamPolicy("policy", SearchEngineIamPolicyArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .policyData(admin.policyData())
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamBinding
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBinding;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamBindingArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var binding = new SearchEngineIamBinding("binding", SearchEngineIamBindingArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
   *             .members("user:jane}{@literal @}{@code example.com")
   *             .build());
   * 
   *     }}{@code
   * }}{@code
   * }
   * </pre>
   * 
   * ## gcp.discoveryengine.SearchEngineIamMember
   * 
   * <pre>
   * {@code
   * package generated_program;
   * 
   * import com.pulumi.Context;
   * import com.pulumi.Pulumi;
   * import com.pulumi.core.Output;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMember;
   * import com.pulumi.gcp.discoveryengine.SearchEngineIamMemberArgs;
   * import java.util.ArrayList;
   * import java.util.Arrays;
   * import java.util.Map;
   * import java.io.File;
   * import java.nio.file.Files;
   * import java.nio.file.Paths;
   * 
   * public class App }{{@code
   *     public static void main(String[] args) }{{@code
   *         Pulumi.run(App::stack);
   *     }}{@code
   * 
   *     public static void stack(Context ctx) }{{@code
   *         var member = new SearchEngineIamMember("member", SearchEngineIamMemberArgs.builder()
   *             .project(basic.get("project"))
   *             .location(basic.get("location"))
   *             .collectionId(basic.get("collectionId"))
   *             .engineId(basic.get("engineId"))
   *             .role("roles/discoveryengine.agentspaceUser")
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
   * * projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}
   * * {{project}}/{{location}}/{{collection_id}}/{{engine_id}}
   * * {{location}}/{{collection_id}}/{{engine_id}}
   * * {{engine_id}}
   * 
   * Any variables not passed in the import command will be taken from the provider configuration.
   * 
   * Discovery Engine searchengine IAM resources can be imported using the resource identifiers, role, and member.
   * 
   * IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   * ```sh
   * \$ terraform import google_discovery_engine_search_engine_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}} roles/discoveryengine.agentspaceUser user:jane{@literal @}example.com&#34;
   * ```
   * 
   * IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   * ```sh
   * \$ terraform import google_discovery_engine_search_engine_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}} roles/discoveryengine.agentspaceUser&#34;
   * ```
   * 
   * IAM policy imports use the identifier of the resource in question, e.g.
   * ```sh
   * \$ pulumi import gcp:discoveryengine/searchEngineIamPolicy:SearchEngineIamPolicy editor projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}
   * ```
   * 
   * &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *  full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SearchEngineIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SearchEngineIamPolicyArgs.builder
    com.pulumi.gcp.discoveryengine.SearchEngineIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a serving config which is a singleton resource under engine. A default
   * serving config is automatically provisioned and deleted with its parent engine.
   * 
   * To get more information about ServingConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1/projects.locations.collections.engines.servingConfigs)
   * 
   * ## Import
   * 
   * ServingConfig can be imported using any of these accepted formats:
   * 
   * * `projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}/servingConfigs/{{serving_config_id}}`
   * * `{{project}}/{{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}`
   * * `{{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}`
   * 
   * When using the `pulumi import` command, ServingConfig can be imported using one of the formats above. For example:
   * 
   * ```sh
   * \$ pulumi import gcp:discoveryengine/servingConfig:ServingConfig default projects/{{project}}/locations/{{location}}/collections/{{collection_id}}/engines/{{engine_id}}/servingConfigs/{{serving_config_id}}
   * \$ pulumi import gcp:discoveryengine/servingConfig:ServingConfig default {{project}}/{{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}
   * \$ pulumi import gcp:discoveryengine/servingConfig:ServingConfig default {{location}}/{{collection_id}}/{{engine_id}}/{{serving_config_id}}
   * ```
   */
  def ServingConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.ServingConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.ServingConfigArgs.builder
    com.pulumi.gcp.discoveryengine.ServingConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Sitemap is a file where you provide information about the pages, videos, and
   * other files on your site, and the relationships between them.
   * 
   * To get more information about Sitemap, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.siteSearchEngine.sitemaps)
   */
  def Sitemap(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.SitemapArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.SitemapArgs.builder
    com.pulumi.gcp.discoveryengine.Sitemap(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * TargetSite represents a URI pattern that the users want to confine their
   * search.
   * 
   * To get more information about TargetSite, see:
   * 
   * * [API documentation](https://cloud.google.com/generative-ai-app-builder/docs/reference/rest/v1/projects.locations.collections.dataStores.siteSearchEngine.targetSites)
   */
  def TargetSite(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.TargetSiteArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.TargetSiteArgs.builder
    com.pulumi.gcp.discoveryengine.TargetSite(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a user store.
   * 
   * To get more information about UserStore, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1/projects.locations.userStores)
   */
  def UserStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.UserStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.UserStoreArgs.builder
    com.pulumi.gcp.discoveryengine.UserStore(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Represents a WidgetConfig.
   * 
   * To get more information about WidgetConfig, see:
   * 
   * * [API documentation](https://cloud.google.com/gemini/enterprise/docs/reference/rest/v1alpha/projects.locations.collections.engines.widgetConfigs)
   */
  def WidgetConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.discoveryengine.WidgetConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.discoveryengine.WidgetConfigArgs.builder
    com.pulumi.gcp.discoveryengine.WidgetConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
