package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object servicequotas:
  type ServicequotasFunctions = com.pulumi.aws.servicequotas.ServicequotasFunctions
  object ServicequotasFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.servicequotas.ServicequotasFunctions.*
  extension (self: ServicequotasFunctions.type)
    /**
     * Retrieve information about a Service Quotas Service.
     *  
     *  &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    def getService(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServiceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicequotas.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServiceArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getService(args(argsBuilder).build)

    /**
     * Retrieve information about a Service Quotas Service.
     *  
     *  &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    def getServicePlain(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServicePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicequotas.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getServicePlain(args(argsBuilder).build)

    /**
     * Retrieve information about a Service Quota.
     *  
     *  &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    def getServiceQuota(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServiceQuotaArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicequotas.outputs.GetServiceQuotaResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServiceQuotaArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getServiceQuota(args(argsBuilder).build)

    /**
     * Retrieve information about a Service Quota.
     *  
     *  &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
     */
    def getServiceQuotaPlain(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetServiceQuotaPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicequotas.outputs.GetServiceQuotaResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetServiceQuotaPlainArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getServiceQuotaPlain(args(argsBuilder).build)

    /** Data source for managing AWS Service Quotas Templates. */
    def getTemplates(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetTemplatesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.servicequotas.outputs.GetTemplatesResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetTemplatesArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getTemplates(args(argsBuilder).build)

    /** Data source for managing AWS Service Quotas Templates. */
    def getTemplatesPlain(args: Endofunction[com.pulumi.aws.servicequotas.inputs.GetTemplatesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.servicequotas.outputs.GetTemplatesResult] =
      val argsBuilder = com.pulumi.aws.servicequotas.inputs.GetTemplatesPlainArgs.builder
      com.pulumi.aws.servicequotas.ServicequotasFunctions.getTemplatesPlain(args(argsBuilder).build)

  /**
   * Manages an individual Service Quota.
   *  
   *  &gt; **NOTE:** Global quotas apply to all AWS regions, but can only be accessed in `us-east-1` in the Commercial partition or `us-gov-west-1` in the GovCloud partition. In other regions, the AWS API will return the error `The request failed because the specified service does not exist.`
   */
  def ServiceQuota(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicequotas.ServiceQuotaArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicequotas.ServiceQuotaArgs.builder
    
    com.pulumi.aws.servicequotas.ServiceQuota(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS Service Quotas Template.
   *  
   *  &gt; Only the management account of an organization can alter Service Quota templates, and this must be done from the `us-east-1` region.
   */
  def Template(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicequotas.TemplateArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicequotas.TemplateArgs.builder
    
    com.pulumi.aws.servicequotas.Template(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS Service Quotas Template Association.
   *  
   *  &gt; Only the management account of an organization can associate Service Quota templates, and this must be done from the `us-east-1` region.
   */
  def TemplateAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.servicequotas.TemplateAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.servicequotas.TemplateAssociationArgs.builder
    
    com.pulumi.aws.servicequotas.TemplateAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.servicequotas.inputs.ServiceQuotaState.Builder)
    /**
     * @param usageMetrics Information about the measurement.
     * @return builder
     */
    def usageMetrics(args: Endofunction[com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.Builder]*):
        com.pulumi.aws.servicequotas.inputs.ServiceQuotaState.Builder =
      def argsBuilder = com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.builder
      builder.usageMetrics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.Builder)
    /**
     * @param metricDimensions The metric dimensions.
     * @return builder
     */
    def metricDimensions(args: Endofunction[com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricMetricDimensionArgs.Builder]*):
        com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricArgs.Builder =
      def argsBuilder = com.pulumi.aws.servicequotas.inputs.ServiceQuotaUsageMetricMetricDimensionArgs.builder
      builder.metricDimensions(args.map(_(argsBuilder).build)*)
