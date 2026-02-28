package jp.ukiba.ko_pulumi
package aws


object aws:
  type AwsFunctions = com.pulumi.aws.AwsFunctions
  object AwsFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.AwsFunctions.*
  extension (self: AwsFunctions.type)
    /** Parses an ARN into its constituent parts. */
    def getArn(args: Endofunction[com.pulumi.aws.inputs.GetArnArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetArnResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetArnArgs.builder
      com.pulumi.aws.AwsFunctions.getArn(args(argsBuilder).build)

    /** Parses an ARN into its constituent parts. */
    def getArnPlain(args: Endofunction[com.pulumi.aws.inputs.GetArnPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetArnResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetArnPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getArnPlain(args(argsBuilder).build)

    /**
     * `aws.getAvailabilityZone` provides details about a specific availability zone (AZ)
     *  in the current Region.
     *  
     *  This can be used both to validate an availability zone given in a variable
     *  and to split the AZ name into its component parts of an AWS Region and an
     *  AZ identifier letter. The latter may be useful e.g., for implementing a
     *  consistent subnet numbering scheme across several regions by mapping both
     *  the region and the subnet letter to network numbers.
     *  
     *  This is different from the `aws.getAvailabilityZones` (plural) data source,
     *  which provides a list of the available zones.
     */
    def getAvailabilityZone(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZoneArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetAvailabilityZoneResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZoneArgs.builder
      com.pulumi.aws.AwsFunctions.getAvailabilityZone(args(argsBuilder).build)

    /**
     * `aws.getAvailabilityZone` provides details about a specific availability zone (AZ)
     *  in the current Region.
     *  
     *  This can be used both to validate an availability zone given in a variable
     *  and to split the AZ name into its component parts of an AWS Region and an
     *  AZ identifier letter. The latter may be useful e.g., for implementing a
     *  consistent subnet numbering scheme across several regions by mapping both
     *  the region and the subnet letter to network numbers.
     *  
     *  This is different from the `aws.getAvailabilityZones` (plural) data source,
     *  which provides a list of the available zones.
     */
    def getAvailabilityZonePlain(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZonePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetAvailabilityZoneResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZonePlainArgs.builder
      com.pulumi.aws.AwsFunctions.getAvailabilityZonePlain(args(argsBuilder).build)

    /**
     * The Availability Zones data source allows access to the list of AWS
     *  Availability Zones which can be accessed by an AWS account within the region
     *  configured in the provider.
     *  
     *  This is different from the `aws.getAvailabilityZone` (singular) data source,
     *  which provides some details about a specific availability zone.
     *  
     *  &gt; When [Local Zones](https://aws.amazon.com/about-aws/global-infrastructure/localzones/) are enabled in a region, by default the API and this data source include both Local Zones and Availability Zones. To return only Availability Zones, see the example section below.
     */
    def getAvailabilityZones(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZonesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetAvailabilityZonesResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZonesArgs.builder
      com.pulumi.aws.AwsFunctions.getAvailabilityZones(args(argsBuilder).build)

    /**
     * The Availability Zones data source allows access to the list of AWS
     *  Availability Zones which can be accessed by an AWS account within the region
     *  configured in the provider.
     *  
     *  This is different from the `aws.getAvailabilityZone` (singular) data source,
     *  which provides some details about a specific availability zone.
     *  
     *  &gt; When [Local Zones](https://aws.amazon.com/about-aws/global-infrastructure/localzones/) are enabled in a region, by default the API and this data source include both Local Zones and Availability Zones. To return only Availability Zones, see the example section below.
     */
    def getAvailabilityZonesPlain(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZonesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetAvailabilityZonesResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZonesPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getAvailabilityZonesPlain(args(argsBuilder).build)

    /** Use this data source to get the Account ID of the [AWS Billing and Cost Management Service Account](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-getting-started.html#step-2) for the purpose of permitting in S3 bucket policy. */
    def getBillingServiceAccount(args: Endofunction[com.pulumi.aws.inputs.GetBillingServiceAccountArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetBillingServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetBillingServiceAccountArgs.builder
      com.pulumi.aws.AwsFunctions.getBillingServiceAccount(args(argsBuilder).build)

    /** Use this data source to get the Account ID of the [AWS Billing and Cost Management Service Account](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-getting-started.html#step-2) for the purpose of permitting in S3 bucket policy. */
    def getBillingServiceAccountPlain(args: Endofunction[com.pulumi.aws.inputs.GetBillingServiceAccountPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetBillingServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetBillingServiceAccountPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getBillingServiceAccountPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the access to the effective Account ID, User ID, and ARN in
     *  which this provider is authorized.
     */
    def getCallerIdentity(args: Endofunction[com.pulumi.aws.inputs.GetCallerIdentityArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetCallerIdentityResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetCallerIdentityArgs.builder
      com.pulumi.aws.AwsFunctions.getCallerIdentity(args(argsBuilder).build)

    /**
     * Use this data source to get the access to the effective Account ID, User ID, and ARN in
     *  which this provider is authorized.
     */
    def getCallerIdentityPlain(args: Endofunction[com.pulumi.aws.inputs.GetCallerIdentityPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetCallerIdentityResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetCallerIdentityPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getCallerIdentityPlain(args(argsBuilder).build)

    /**
     * Use this data source to get the default tags configured on the provider.
     *  
     *  With this data source, you can apply default tags to resources not _directly_ managed by a resource, such as the instances underneath an Auto Scaling group or the volumes created for an EC2 instance.
     */
    def getDefaultTags(args: Endofunction[com.pulumi.aws.inputs.GetDefaultTagsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetDefaultTagsResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetDefaultTagsArgs.builder
      com.pulumi.aws.AwsFunctions.getDefaultTags(args(argsBuilder).build)

    /**
     * Use this data source to get the default tags configured on the provider.
     *  
     *  With this data source, you can apply default tags to resources not _directly_ managed by a resource, such as the instances underneath an Auto Scaling group or the volumes created for an EC2 instance.
     */
    def getDefaultTagsPlain(args: Endofunction[com.pulumi.aws.inputs.GetDefaultTagsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetDefaultTagsResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetDefaultTagsPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getDefaultTagsPlain(args(argsBuilder).build)

    /** Use this data source to get the IP ranges of various AWS products and services. For more information about the contents of this data source and required JSON syntax if referencing a custom URL, see the [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). */
    def getIpRanges(args: Endofunction[com.pulumi.aws.inputs.GetIpRangesArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetIpRangesResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetIpRangesArgs.builder
      com.pulumi.aws.AwsFunctions.getIpRanges(args(argsBuilder).build)

    /** Use this data source to get the IP ranges of various AWS products and services. For more information about the contents of this data source and required JSON syntax if referencing a custom URL, see the [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). */
    def getIpRangesPlain(args: Endofunction[com.pulumi.aws.inputs.GetIpRangesPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetIpRangesResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetIpRangesPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getIpRangesPlain(args(argsBuilder).build)

    /**
     * Use this data source to lookup information about the current AWS partition in
     *  which the provider is working.
     */
    def getPartition(args: Endofunction[com.pulumi.aws.inputs.GetPartitionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetPartitionResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetPartitionArgs.builder
      com.pulumi.aws.AwsFunctions.getPartition(args(argsBuilder).build)

    /**
     * Use this data source to lookup information about the current AWS partition in
     *  which the provider is working.
     */
    def getPartitionPlain(args: Endofunction[com.pulumi.aws.inputs.GetPartitionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetPartitionResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetPartitionPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getPartitionPlain(args(argsBuilder).build)

    /**
     * `aws.getRegion` provides details about a specific AWS Region.
     *  
     *  As well as validating a given Region name this resource can be used to
     *  discover the name of the Region configured within the provider. The latter
     *  can be useful in a child module which is inheriting an AWS provider
     *  configuration from its parent module.
     */
    def getRegion(args: Endofunction[com.pulumi.aws.inputs.GetRegionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetRegionResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetRegionArgs.builder
      com.pulumi.aws.AwsFunctions.getRegion(args(argsBuilder).build)

    /**
     * `aws.getRegion` provides details about a specific AWS Region.
     *  
     *  As well as validating a given Region name this resource can be used to
     *  discover the name of the Region configured within the provider. The latter
     *  can be useful in a child module which is inheriting an AWS provider
     *  configuration from its parent module.
     */
    def getRegionPlain(args: Endofunction[com.pulumi.aws.inputs.GetRegionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetRegionResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetRegionPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getRegionPlain(args(argsBuilder).build)

    /** Provides information about AWS Regions. Can be used to filter regions i.e., by Opt-In status or only regions enabled for current account. To get details like endpoint and description of each region the data source can be combined with the `aws.getRegion` data source. */
    def getRegions(args: Endofunction[com.pulumi.aws.inputs.GetRegionsArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetRegionsResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetRegionsArgs.builder
      com.pulumi.aws.AwsFunctions.getRegions(args(argsBuilder).build)

    /** Provides information about AWS Regions. Can be used to filter regions i.e., by Opt-In status or only regions enabled for current account. To get details like endpoint and description of each region the data source can be combined with the `aws.getRegion` data source. */
    def getRegionsPlain(args: Endofunction[com.pulumi.aws.inputs.GetRegionsPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetRegionsResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetRegionsPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getRegionsPlain(args(argsBuilder).build)

    /** Use this data source to compose and decompose AWS service DNS names. */
    def getService(args: Endofunction[com.pulumi.aws.inputs.GetServiceArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetServiceArgs.builder
      com.pulumi.aws.AwsFunctions.getService(args(argsBuilder).build)

    /** Use this data source to compose and decompose AWS service DNS names. */
    def getServicePlain(args: Endofunction[com.pulumi.aws.inputs.GetServicePlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetServiceResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetServicePlainArgs.builder
      com.pulumi.aws.AwsFunctions.getServicePlain(args(argsBuilder).build)

    /** Use this data source to create a Service Principal Name for a service in a given region. Service Principal Names should always end in the standard global format: `{servicename}.amazonaws.com`. However, in some AWS partitions, AWS may expect a different format. */
    def getServicePrincipal(args: Endofunction[com.pulumi.aws.inputs.GetServicePrincipalArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.outputs.GetServicePrincipalResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetServicePrincipalArgs.builder
      com.pulumi.aws.AwsFunctions.getServicePrincipal(args(argsBuilder).build)

    /** Use this data source to create a Service Principal Name for a service in a given region. Service Principal Names should always end in the standard global format: `{servicename}.amazonaws.com`. However, in some AWS partitions, AWS may expect a different format. */
    def getServicePrincipalPlain(args: Endofunction[com.pulumi.aws.inputs.GetServicePrincipalPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.outputs.GetServicePrincipalResult] =
      val argsBuilder = com.pulumi.aws.inputs.GetServicePrincipalPlainArgs.builder
      com.pulumi.aws.AwsFunctions.getServicePrincipalPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.ProviderArgs.Builder)
    def assumeRoleWithWebIdentity(args: Endofunction[com.pulumi.aws.inputs.ProviderAssumeRoleWithWebIdentityArgs.Builder]):
        com.pulumi.aws.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.inputs.ProviderAssumeRoleWithWebIdentityArgs.builder
      builder.assumeRoleWithWebIdentity(args(argsBuilder).build)

    def assumeRoles(args: Endofunction[com.pulumi.aws.inputs.ProviderAssumeRoleArgs.Builder]*):
        com.pulumi.aws.ProviderArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.ProviderAssumeRoleArgs.builder
      builder.assumeRoles(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultTags Configuration block with settings to default resource tags across all resources.
     * @return builder
     */
    def defaultTags(args: Endofunction[com.pulumi.aws.inputs.ProviderDefaultTagsArgs.Builder]):
        com.pulumi.aws.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.inputs.ProviderDefaultTagsArgs.builder
      builder.defaultTags(args(argsBuilder).build)

    def endpoints(args: Endofunction[com.pulumi.aws.inputs.ProviderEndpointArgs.Builder]*):
        com.pulumi.aws.ProviderArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.ProviderEndpointArgs.builder
      builder.endpoints(args.map(_(argsBuilder).build)*)

    /**
     * @param ignoreTags Configuration block with settings to ignore resource tags across all resources.
     * @return builder
     */
    def ignoreTags(args: Endofunction[com.pulumi.aws.inputs.ProviderIgnoreTagsArgs.Builder]):
        com.pulumi.aws.ProviderArgs.Builder =
      val argsBuilder = com.pulumi.aws.inputs.ProviderIgnoreTagsArgs.builder
      builder.ignoreTags(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.inputs.GetRegionsArgs.Builder)
    /**
     * @param filters Configuration block(s) to use as filters. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.inputs.GetRegionsFilterArgs.Builder]*):
        com.pulumi.aws.inputs.GetRegionsArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetRegionsFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inputs.GetAvailabilityZoneArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZoneFilterArgs.Builder]*):
        com.pulumi.aws.inputs.GetAvailabilityZoneArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZoneFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.inputs.GetAvailabilityZonesArgs.Builder)
    /**
     * @param filters Configuration block(s) for filtering. Detailed below.
     * @return builder
     */
    def filters(args: Endofunction[com.pulumi.aws.inputs.GetAvailabilityZonesFilterArgs.Builder]*):
        com.pulumi.aws.inputs.GetAvailabilityZonesArgs.Builder =
      def argsBuilder = com.pulumi.aws.inputs.GetAvailabilityZonesFilterArgs.builder
      builder.filters(args.map(_(argsBuilder).build)*)
