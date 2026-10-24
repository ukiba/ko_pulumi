package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object apihub:
  /**
   * An ApiHubInstance represents the instance resources of the API Hub.
   * Currently, only one ApiHub instance is allowed for each project.
   * Currently, updation/deletion of ApiHub instance is not allowed.
   */
  def ApiHubInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.ApiHubInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apihub.ApiHubInstanceArgs.builder
    com.pulumi.gcp.apihub.ApiHubInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Description */
  def Curation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.CurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apihub.CurationArgs.builder
    com.pulumi.gcp.apihub.Curation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Host project registration refers to the registration of a Google cloud project with API hub as a host project.
   * This is the project where API hub is provisioned.
   * It acts as the consumer project for the API hub instance provisioned.
   * Multiple runtime projects can be attached to the host project and these attachments define the scope of API hub.
   */
  def HostProjectRegistration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.HostProjectRegistrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apihub.HostProjectRegistrationArgs.builder
    com.pulumi.gcp.apihub.HostProjectRegistration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** A plugin resource in the API hub. */
  def Plugin(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.PluginArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apihub.PluginArgs.builder
    com.pulumi.gcp.apihub.Plugin(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Description */
  def PluginInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.PluginInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apihub.PluginInstanceArgs.builder
    com.pulumi.gcp.apihub.PluginInstance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Runtime project attachment represents an attachment from the runtime project to the host project. API Hub looks for deployments in the attached runtime projects and creates corresponding resources in API Hub for the discovered deployments. */
  def RuntimeProjectAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apihub.RuntimeProjectAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apihub.RuntimeProjectAttachmentArgs.builder
    com.pulumi.gcp.apihub.RuntimeProjectAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
