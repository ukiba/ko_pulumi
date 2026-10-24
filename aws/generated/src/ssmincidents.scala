package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object ssmincidents:
  /**
   * Provides a resource for managing a replication set in AWS Systems Manager Incident Manager.
   * 
   * &gt; **NOTE:** Deleting a replication set also deletes all Incident Manager related data including response plans, incident records, contacts and escalation plans.
   */
  def ReplicationSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssmincidents.ReplicationSetArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmincidents.ReplicationSetArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ssmincidents.ReplicationSet(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a resource to manage response plans in AWS Systems Manager Incident Manager.
   * 
   * &gt; NOTE: A response plan implicitly depends on a replication set. If you configured your replication set in Pulumi, we recommend you add it to the `dependsOn` argument for the ResponsePlan Resource.
   */
  def ResponsePlan(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.ssmincidents.ResponsePlanArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.ssmincidents.ResponsePlanArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.ssmincidents.ResponsePlan(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object SsmincidentsFunctions:
    /**
     * &gt; **NOTE:** The AWS Region specified by a provider must always be one of the Regions specified for the replication set.
     * 
     * Use this data source to manage a replication set in AWS Systems Manager Incident Manager.
     */
    inline def getReplicationSet(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetReplicationSetArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmincidents.outputs.GetReplicationSetResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetReplicationSetArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getReplicationSet(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * &gt; **NOTE:** The AWS Region specified by a provider must always be one of the Regions specified for the replication set.
     * 
     * Use this data source to manage a replication set in AWS Systems Manager Incident Manager.
     */
    inline def getReplicationSetPlain(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetReplicationSetPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmincidents.outputs.GetReplicationSetResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetReplicationSetPlainArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getReplicationSetPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to manage a response plan in AWS Systems Manager Incident Manager. */
    inline def getResponsePlan(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetResponsePlanArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.ssmincidents.outputs.GetResponsePlanResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetResponsePlanArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getResponsePlan(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to manage a response plan in AWS Systems Manager Incident Manager. */
    inline def getResponsePlanPlain(args: Endofunction[com.pulumi.aws.ssmincidents.inputs.GetResponsePlanPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.ssmincidents.outputs.GetResponsePlanResult] =
      val argsBuilder = com.pulumi.aws.ssmincidents.inputs.GetResponsePlanPlainArgs.builder
      com.pulumi.aws.ssmincidents.SsmincidentsFunctions.getResponsePlanPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
