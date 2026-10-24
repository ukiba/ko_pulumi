package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object apphub:
  object ApphubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Application is a functional grouping of Services and Workloads that helps achieve a desired end-to-end business functionality. Services and Workloads are owned by the Application. */
    inline def getApplication(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetApplicationArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apphub.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetApplicationArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getApplication(args(argsBuilder).build)

    /** Application is a functional grouping of Services and Workloads that helps achieve a desired end-to-end business functionality. Services and Workloads are owned by the Application. */
    inline def getApplicationPlain(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetApplicationPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apphub.outputs.GetApplicationResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetApplicationPlainArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getApplicationPlain(args(argsBuilder).build)

    /** Get information about a discovered service from its uri. */
    inline def getDiscoveredService(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredServiceArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apphub.outputs.GetDiscoveredServiceResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredServiceArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredService(args(argsBuilder).build)

    /** Get information about a discovered service from its uri. */
    inline def getDiscoveredServicePlain(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredServicePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apphub.outputs.GetDiscoveredServiceResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredServicePlainArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredServicePlain(args(argsBuilder).build)

    /** Get information about a discovered workload from its uri. */
    inline def getDiscoveredWorkload(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.apphub.outputs.GetDiscoveredWorkloadResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredWorkload(args(argsBuilder).build)

    /** Get information about a discovered workload from its uri. */
    inline def getDiscoveredWorkloadPlain(args: Endofunction[com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.apphub.outputs.GetDiscoveredWorkloadResult] =
      val argsBuilder = com.pulumi.gcp.apphub.inputs.GetDiscoveredWorkloadPlainArgs.builder
      com.pulumi.gcp.apphub.ApphubFunctions.getDiscoveredWorkloadPlain(args(argsBuilder).build)

  /** Application is a functional grouping of Services and Workloads that helps achieve a desired end-to-end business functionality. Services and Workloads are owned by the Application. */
  def Application(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.ApplicationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apphub.ApplicationArgs.builder
    com.pulumi.gcp.apphub.Application(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Application management boundary.
   * 
   * To get more information about Boundary, see:
   * 
   * * [API documentation](https://docs.cloud.google.com/app-hub/docs/reference/rest/v1/Boundary)
   * * How-to Guides
   *     * [AppHub](https://docs.cloud.google.com/app-hub/docs/)
   */
  def Boundary(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.BoundaryArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apphub.BoundaryArgs.builder
    com.pulumi.gcp.apphub.Boundary(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Service is a network/api interface that exposes some functionality to clients for consumption over the network. Service typically has one or more Workloads behind it. It registers identified service to the Application. */
  def Service(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.ServiceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apphub.ServiceArgs.builder
    com.pulumi.gcp.apphub.Service(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Represents a Service project attachment to the Host Project. */
  def ServiceProjectAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.ServiceProjectAttachmentArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apphub.ServiceProjectAttachmentArgs.builder
    com.pulumi.gcp.apphub.ServiceProjectAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Workload represents a binary deployment (such as Managed Instance Groups (MIGs), GKE deployments, etc.) that performs the smallest logical subset of business functionality. It registers identified workload to the Application. */
  def Workload(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.apphub.WorkloadArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.gcp.apphub.WorkloadArgs.builder
    com.pulumi.gcp.apphub.Workload(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
