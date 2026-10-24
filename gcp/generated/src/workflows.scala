package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object workflows:
  /**
   * Workflow program to be executed by Workflows.
   * 
   * To get more information about Workflow, see:
   * 
   * * [API documentation](https://cloud.google.com/workflows/docs/reference/rest/v1/projects.locations.workflows)
   * * How-to Guides
   *     * [Managing Workflows](https://cloud.google.com/workflows/docs/creating-updating-workflow)
   */
  def Workflow(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.gcp.workflows.WorkflowArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.workflows.WorkflowArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.workflows.Workflow(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
