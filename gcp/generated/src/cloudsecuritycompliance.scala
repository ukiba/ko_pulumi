package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object cloudsecuritycompliance:
  /**
   * Cloud controls are the building blocks that make up frameworks. Each cloud control is a unit encapsulating various platform-specific logic for prevention, detection, and audit.
   * 
   * To get more information about CloudControl, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/security-command-center/docs/reference/cloudsecuritycompliance/rest/v1/organizations.locations.cloudControls)
   */
  inline def CloudControl(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.CloudControlArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.CloudControlArgs.builder
    com.pulumi.gcp.cloudsecuritycompliance.CloudControl(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Frameworks allow you to monitor and enforce compliance and security requirements. Manage compliance by assigning built-in or custom frameworks to resources.
   * 
   * To get more information about Framework, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/security-command-center/docs/reference/cloudsecuritycompliance/rest/v1/organizations.locations.frameworks)
   */
  inline def Framework(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.FrameworkArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.FrameworkArgs.builder
    com.pulumi.gcp.cloudsecuritycompliance.Framework(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Framework deployments represent the assignment of a framework to a target resource. Supported target resources are organizations, folders, and projects.
   * 
   * To get more information about FrameworkDeployment, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/security-command-center/docs/reference/cloudsecuritycompliance/rest/v1/organizations.locations.frameworkDeployments)
   */
  inline def FrameworkDeployment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeploymentArgs.builder
    com.pulumi.gcp.cloudsecuritycompliance.FrameworkDeployment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
