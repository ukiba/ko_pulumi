package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object configdeployment:
  /**
   * A group of Google Cloud resources described by a Terraform blueprint.
   * 
   * To get more information about Deployment, see:
   * 
   * * [API documentation](https://cloud.google.com/infrastructure-manager/docs/reference/rest/v1/projects.locations.deployments)
   */
  def Deployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.configdeployment.DeploymentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.configdeployment.DeploymentArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.configdeployment.Deployment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)
