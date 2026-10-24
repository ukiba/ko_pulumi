package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object devopsguru:
  object DevopsguruFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Data source for managing an AWS DevOps Guru Notification Channel. */
    inline def getNotificationChannel(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.devopsguru.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getNotificationChannel(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS DevOps Guru Notification Channel. */
    inline def getNotificationChannelPlain(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetNotificationChannelPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.devopsguru.outputs.GetNotificationChannelResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetNotificationChannelPlainArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getNotificationChannelPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing an AWS DevOps Guru Resource Collection. */
    inline def getResourceCollection(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetResourceCollectionArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.devopsguru.outputs.GetResourceCollectionResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetResourceCollectionArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getResourceCollection(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing an AWS DevOps Guru Resource Collection. */
    inline def getResourceCollectionPlain(args: Endofunction[com.pulumi.aws.devopsguru.inputs.GetResourceCollectionPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.devopsguru.outputs.GetResourceCollectionResult] =
      val argsBuilder = com.pulumi.aws.devopsguru.inputs.GetResourceCollectionPlainArgs.builder
      com.pulumi.aws.devopsguru.DevopsguruFunctions.getResourceCollectionPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Resource for managing an AWS DevOps Guru Event Sources Config. Currently the only service that can be integrated with DevOps Guru is Amazon CodeGuru Profiler, which can produce proactive recommendations which can be stored and viewed in DevOps Guru.
   * 
   * &gt; Destruction of this resource will set the CodeGuru profiler status to `DISABLED`. If you wish to preserve an `ENABLED` configuration while removing the Terraform resource, utilize a `removed` block (available in Terraform 1.7+).
   * 
   * &gt; Event sources are configured at the account level. To avoid persistent differences, this resource should be defined only once.
   */
  def EventSourcesConfig(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.EventSourcesConfigArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.devopsguru.EventSourcesConfigArgs.builder
    com.pulumi.aws.devopsguru.EventSourcesConfig(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Resource for managing an AWS DevOps Guru Notification Channel. */
  def NotificationChannel(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.NotificationChannelArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.devopsguru.NotificationChannelArgs.builder
    com.pulumi.aws.devopsguru.NotificationChannel(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS DevOps Guru Resource Collection.
   * 
   * &gt; Only one type of resource collection (All Account Resources, CloudFormation, or Tags) can be enabled in an account at a time. To avoid persistent differences, this resource should be defined only once.
   */
  def ResourceCollection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.ResourceCollectionArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.devopsguru.ResourceCollectionArgs.builder
    com.pulumi.aws.devopsguru.ResourceCollection(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS DevOps Guru Service Integration.
   * 
   * &gt; To prevent unintentional deletion of account wide settings, destruction of this resource will only remove it from the Terraform state. To disable any configured settings, explicitly set the opt-in value to `DISABLED` and apply again before destroying.
   */
  def ServiceIntegration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.devopsguru.ServiceIntegrationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.devopsguru.ServiceIntegrationArgs.builder
    com.pulumi.aws.devopsguru.ServiceIntegration(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
