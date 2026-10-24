package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object servicequotas:
  /**
   * Manages AWS Service Quotas Automatic Management.
   * 
   * &gt; **Note:** Due to AWS API limitations, the `notificationArn` attribute cannot be removed once set without recreating the resource. Removing this value from your configuration will trigger resource replacement.
   */
  def AutoManagement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicequotas.AutoManagementArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.servicequotas.AutoManagementArgs.builder
    com.pulumi.aws.servicequotas.AutoManagement(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages an individual Service Quota.
   * 
   * &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
   */
  def ServiceQuota(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicequotas.ServiceQuotaArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.servicequotas.ServiceQuotaArgs.builder
    com.pulumi.aws.servicequotas.ServiceQuota(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object ServicequotasFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Retrieve information about a Service Quotas Service.
     * 
     * &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    inline def getService(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServiceArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicequotas.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServiceArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getService(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieve information about a Service Quotas Service.
     * 
     * &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    inline def getServicePlain(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServicePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicequotas.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getServicePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /**
     * Retrieve information about a Service Quota.
     * 
     * &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    inline def getServiceQuota(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServiceQuotaArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicequotas.outputs.GetServiceQuotaResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServiceQuotaArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getServiceQuota(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Retrieve information about a Service Quota.
     * 
     * &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    inline def getServiceQuotaPlain(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServiceQuotaPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicequotas.outputs.GetServiceQuotaResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServiceQuotaPlainArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getServiceQuotaPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Data source for managing AWS Service Quotas Templates. */
    inline def getTemplates(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetTemplatesArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicequotas.outputs.GetTemplatesResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetTemplatesArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getTemplates(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Data source for managing AWS Service Quotas Templates. */
    inline def getTemplatesPlain(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetTemplatesPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicequotas.outputs.GetTemplatesResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetTemplatesPlainArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getTemplatesPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Resource for managing an AWS Service Quotas Template.
   * 
   * &gt; Only the management account of an organization can alter Service Quota templates, and this must be done from the `us-east-1` region.
   */
  def Template(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicequotas.TemplateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.servicequotas.TemplateArgs.builder
    com.pulumi.aws.servicequotas.Template(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Resource for managing an AWS Service Quotas Template Association.
   * 
   * &gt; Only the management account of an organization can associate Service Quota templates, and this must be done from the `us-east-1` region.
   */
  def TemplateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicequotas.TemplateAssociationArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.servicequotas.TemplateAssociationArgs.builder
    com.pulumi.aws.servicequotas.TemplateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
