package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object deploymentmanager:
  /**
   * A collection of resources that are deployed and managed together using
   * a configuration file
   * 
   * &gt; **Warning:** This resource is intended only to manage a Deployment resource,
   * and attempts to manage the Deployment&#39;s resources in the provider as well
   * will likely result in errors or unexpected behavior as the two tools
   * fight over ownership. We strongly discourage doing so unless you are an
   * experienced user of both tools.
   * 
   * In addition, due to limitations of the API, the provider will treat
   * deployments in preview as recreate-only for any update operation other
   * than actually deploying an in-preview deployment (i.e. `preview=true` to
   * `preview=false`).
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.deploymentmanager.DeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.deploymentmanager.DeploymentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.deploymentmanager.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
