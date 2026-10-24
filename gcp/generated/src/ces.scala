package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object ces:
  /** Description */
  def Agent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AgentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.AgentArgs.builder
    com.pulumi.gcp.ces.Agent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Customer Engagement Suite App
   * 
   * To get more information about App, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/customer-engagement-ai/conversational-agents/ps/reference/rest/v1/projects.locations.apps)
   */
  def App(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AppArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.AppArgs.builder
    com.pulumi.gcp.ces.App(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Sets the root agent of a CES App after both the app and the agent have
   * been created.
   * 
   * Because a CES Agent must reference its parent app at creation time, the
   * app must exist before any agent can be created. This means the root agent
   * cannot be set on the app at creation time \u2014 use this resource to set it
   * afterwards.
   * 
   * &gt; **Note:** This resource modifies the `rootAgent` field on the parent
   * `gcp.ces.App`. Add `lifecycle { ignoreChanges = [rootAgent] }` to
   * your `gcp.ces.App` resource to prevent Terraform from detecting drift
   * and clearing the field on every plan.
   */
  def AppRootAgentAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AppRootAgentAssociationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.AppRootAgentAssociationArgs.builder
    com.pulumi.gcp.ces.AppRootAgentAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Description */
  def AppVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.AppVersionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.AppVersionArgs.builder
    com.pulumi.gcp.ces.AppVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Description
   * 
   * &gt; **Note:**  All arguments marked as write-only values will not be stored in the state: `instagram_credentials.auth_code_wo`, `whatsapp_credentials.auth_code_wo`, `whatsapp_credentials.pin_wo`.
   * Read more about Write-only Arguments.
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.DeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.DeploymentArgs.builder
    com.pulumi.gcp.ces.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Customer Engagement Suite Evaluation
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about Evaluation, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/customer-engagement-ai/conversational-agents/ps/reference/rest/v1beta/projects.locations.apps.evaluations)
   */
  def Evaluation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.EvaluationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.EvaluationArgs.builder
    com.pulumi.gcp.ces.Evaluation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** An example represents a sample conversation between the user and the agent(s). */
  def Example(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.ExampleArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.ExampleArgs.builder
    com.pulumi.gcp.ces.Example(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Description */
  def Guardrail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.GuardrailArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.GuardrailArgs.builder
    com.pulumi.gcp.ces.Guardrail(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Security settings for a location in Customer Engagement Suite.
   * 
   * &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   * See Provider Versions for more details on beta resources.
   * 
   * To get more information about SecuritySettings, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/customer-engagement-ai/conversational-agents/ps/reference/rest/v1beta/SecuritySettings)
   * * How-to Guides
   *     * [Official Documentation](https://cloud.google.com/customer-engagement-ai/docs)
   */
  def SecuritySettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.SecuritySettingsArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.SecuritySettingsArgs.builder
    com.pulumi.gcp.ces.SecuritySettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Description
   * 
   * &gt; **Note:** **Direct Management Restriction for Certain Tool Types:**
   * 
   * Individual tools of type `openApiTool`, `mcpTool`, `connectorTool`, and `remoteAgentTool` **cannot** be created, updated, or managed directly using the `gcp.ces.Tool` resource.
   * 
   * `openApiTool`, `mcpTool`, and `connectorTool` are dynamically generated at runtime based on their corresponding **toolsets** (configured via the `gcp.ces.Toolset` resource), `remoteAgentTool` represents A2A connections configured externally, and `systemTool` represents pre-defined platform tools managed entirely by Google Cloud.
   * 
   * Consequently, blocks like `openApiTool`, `mcpTool`, `connectorTool`, `remoteAgentTool`, and `systemTool` are marked as **read-only (output-only)** in this resource. They are populated by the server for reference purposes only (e.g., after importing an existing tool into your state) and **cannot** be configured in your Terraform HCL configuration.
   */
  def Tool(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.ToolArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.ToolArgs.builder
    com.pulumi.gcp.ces.Tool(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Description */
  def Toolset(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.ces.ToolsetArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.ces.ToolsetArgs.builder
    com.pulumi.gcp.ces.Toolset(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
