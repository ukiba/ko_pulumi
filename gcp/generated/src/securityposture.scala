package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object securityposture:
  /**
   * A Posture represents a collection of policy set including its name, state, description
   * and policy sets. A policy set includes set of policies along with their definition.
   * A posture can be created at the organization level.
   * Every update to a deployed posture creates a new posture revision with an updated revision_id.
   * 
   * To get more information about Posture, see:
   * 
   * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/securityposture/rest/v1/Posture)
   * * How-to Guides
   *     * [Create and deploy a posture](https://cloud.google.com/security-command-center/docs/how-to-use-security-posture)
   */
  def Posture(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securityposture.PostureArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.securityposture.PostureArgs.builder
    com.pulumi.gcp.securityposture.Posture(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Represents a deployment of a security posture on a resource. A posture contains user curated policy sets. A posture can
   * be deployed on a project or on a folder or on an organization. To deploy a posture we need to populate the posture&#39;s name
   * and its revisionId in the posture deployment configuration. Every update to a deployed posture generates a new revision_id.
   * Thus, the updated revisionId should be used in the respective posture deployment&#39;s configuration to deploy that posture
   * on a resource.
   * 
   * To get more information about PostureDeployment, see:
   * 
   * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/securityposture/rest/v1/organizations.locations.postureDeployments)
   * * How-to Guides
   *     * [Create and deploy a posture](https://cloud.google.com/security-command-center/docs/how-to-use-security-posture)
   * 
   * ## Import
   * 
   * PostureDeployment can be imported using any of these accepted formats:
   * 
   * * `{{parent}}/locations/{{location}}/postureDeployments/{{posture_deployment_id}}`
   * 
   * When using the `pulumi import` command, PostureDeployment can be imported using one of the formats above. For example:
   * 
   * ```sh
   * \$ pulumi import gcp:securityposture/postureDeployment:PostureDeployment default {{parent}}/locations/{{location}}/postureDeployments/{{posture_deployment_id}}
   * ```
   */
  def PostureDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.securityposture.PostureDeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.securityposture.PostureDeploymentArgs.builder
    com.pulumi.gcp.securityposture.PostureDeployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
