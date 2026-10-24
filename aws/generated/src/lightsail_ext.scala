package jp.ukiba.ko_pulumi
package aws

object lightsail_ext:
  extension (builder: com.pulumi.aws.lightsail.ContainerServiceArgs.Builder)
    /**
     * @param privateRegistryAccess Configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See below.
     * @return builder
     */
    def privateRegistryAccess(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.Builder]):
        com.pulumi.aws.lightsail.ContainerServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.builder
      builder.privateRegistryAccess(args(argsBuilder).build)

    /**
     * @param publicDomainNames Public domain names to use with the container service, such as example.com and www.example.com. You can specify up to four public domain names for a container service. The domain names that you specify are used when you create a deployment with a container configured as the public endpoint of your container service. If you don&#39;t specify public domain names, then you can use the default domain of the container service. See below.
     * @return builder
     */
    def publicDomainNames(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.Builder]):
        com.pulumi.aws.lightsail.ContainerServiceArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.builder
      builder.publicDomainNames(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs.Builder)
    /**
     * @param containers Set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. See below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionContainerArgs.Builder]*):
        com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param publicEndpoint Configuration block that describes the settings of the public endpoint for the container service. See below.
     * @return builder
     */
    def publicEndpoint(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.Builder]):
        com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.builder
      builder.publicEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.DistributionArgs.Builder)
    /**
     * @param cacheBehaviorSettings Cache behavior settings of the distribution. See below.
     * @return builder
     */
    def cacheBehaviorSettings(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.Builder]):
        com.pulumi.aws.lightsail.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.builder
      builder.cacheBehaviorSettings(args(argsBuilder).build)

    /**
     * @param cacheBehaviors Per-path cache behavior of the distribution. See below.
     * @return builder
     */
    def cacheBehaviors(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorArgs.Builder]*):
        com.pulumi.aws.lightsail.DistributionArgs.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorArgs.builder
      builder.cacheBehaviors(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultCacheBehavior Default cache behavior of the distribution. See below.
     * @return builder
     */
    def defaultCacheBehavior(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionDefaultCacheBehaviorArgs.Builder]):
        com.pulumi.aws.lightsail.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionDefaultCacheBehaviorArgs.builder
      builder.defaultCacheBehavior(args(argsBuilder).build)

    /**
     * @param origin Origin resource of the distribution, such as a Lightsail instance, bucket, or load balancer. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.Builder]):
        com.pulumi.aws.lightsail.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.builder
      builder.origin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.InstanceArgs.Builder)
    /**
     * @param addOn Add-on configuration for the instance. See below.
     * @return builder
     */
    def addOn(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.Builder]):
        com.pulumi.aws.lightsail.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.builder
      builder.addOn(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.InstancePublicPortsArgs.Builder)
    /**
     * @param portInfos Descriptor of the ports to open for the specified instance. AWS closes all currently open ports that are not included in this argument. See `portInfo` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def portInfos(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.Builder]*):
        com.pulumi.aws.lightsail.InstancePublicPortsArgs.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.builder
      builder.portInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lightsail.inputs.CertificateState.Builder)
    /**
     * @param domainValidationOptions Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Each element contains the following attributes:
     * @return builder
     */
    def domainValidationOptions(args: Endofunction[com.pulumi.aws.lightsail.inputs.CertificateDomainValidationOptionArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.CertificateDomainValidationOptionArgs.builder
      builder.domainValidationOptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.Builder)
    /**
     * @param healthCheck Configuration block that describes the health check configuration of the container. See below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointHealthCheckArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionState.Builder)
    /**
     * @param containers Set of configuration blocks that describe the settings of the containers that will be launched on the container service. Maximum of 53. See below.
     * @return builder
     */
    def containers(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionContainerArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionContainerArgs.builder
      builder.containers(args.map(_(argsBuilder).build)*)

    /**
     * @param publicEndpoint Configuration block that describes the settings of the public endpoint for the container service. See below.
     * @return builder
     */
    def publicEndpoint(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.builder
      builder.publicEndpoint(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.Builder)
    /**
     * @param ecrImagePullerRole Configuration to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See below.
     * @return builder
     */
    def ecrImagePullerRole(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessEcrImagePullerRoleArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessEcrImagePullerRoleArgs.builder
      builder.ecrImagePullerRole(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.Builder)
    /**
     * @param certificates Set of certificate configurations for the public domain names. Each element contains the following attributes:
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesCertificateArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServiceState.Builder)
    /**
     * @param privateRegistryAccess Configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See below.
     * @return builder
     */
    def privateRegistryAccess(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.ContainerServiceState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.builder
      builder.privateRegistryAccess(args(argsBuilder).build)

    /**
     * @param publicDomainNames Public domain names to use with the container service, such as example.com and www.example.com. You can specify up to four public domain names for a container service. The domain names that you specify are used when you create a deployment with a container configured as the public endpoint of your container service. If you don&#39;t specify public domain names, then you can use the default domain of the container service. See below.
     * @return builder
     */
    def publicDomainNames(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.ContainerServiceState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.builder
      builder.publicDomainNames(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.Builder)
    /**
     * @param forwardedCookies Cookies that are forwarded to the origin. Your content is cached based on the cookies that are forwarded. See below.
     * @return builder
     */
    def forwardedCookies(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsForwardedCookiesArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsForwardedCookiesArgs.builder
      builder.forwardedCookies(args(argsBuilder).build)

    /**
     * @param forwardedHeaders Headers that are forwarded to the origin. Your content is cached based on the headers that are forwarded. See below.
     * @return builder
     */
    def forwardedHeaders(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsForwardedHeadersArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsForwardedHeadersArgs.builder
      builder.forwardedHeaders(args(argsBuilder).build)

    /**
     * @param forwardedQueryStrings Query strings that are forwarded to the origin. Your content is cached based on the query strings that are forwarded. See below.
     * @return builder
     */
    def forwardedQueryStrings(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsForwardedQueryStringsArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsForwardedQueryStringsArgs.builder
      builder.forwardedQueryStrings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.DistributionState.Builder)
    /**
     * @param cacheBehaviorSettings Cache behavior settings of the distribution. See below.
     * @return builder
     */
    def cacheBehaviorSettings(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorSettingsArgs.builder
      builder.cacheBehaviorSettings(args(argsBuilder).build)

    /**
     * @param cacheBehaviors Per-path cache behavior of the distribution. See below.
     * @return builder
     */
    def cacheBehaviors(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionCacheBehaviorArgs.builder
      builder.cacheBehaviors(args.map(_(argsBuilder).build)*)

    /**
     * @param defaultCacheBehavior Default cache behavior of the distribution. See below.
     * @return builder
     */
    def defaultCacheBehavior(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionDefaultCacheBehaviorArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionDefaultCacheBehaviorArgs.builder
      builder.defaultCacheBehavior(args(argsBuilder).build)

    /**
     * @param locations Location of the distribution, such as the AWS Region and Availability Zone. See below.
     * @return builder
     */
    def locations(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionLocationArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.DistributionState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionLocationArgs.builder
      builder.locations(args.map(_(argsBuilder).build)*)

    /**
     * @param origin Origin resource of the distribution, such as a Lightsail instance, bucket, or load balancer. See below.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.builder
      builder.origin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.InstancePublicPortsState.Builder)
    /**
     * @param portInfos Descriptor of the ports to open for the specified instance. AWS closes all currently open ports that are not included in this argument. See `portInfo` Block for details.
     * 
     * The following arguments are optional:
     * @return builder
     */
    def portInfos(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.InstancePublicPortsState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.builder
      builder.portInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lightsail.inputs.InstanceState.Builder)
    /**
     * @param addOn Add-on configuration for the instance. See below.
     * @return builder
     */
    def addOn(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.builder
      builder.addOn(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.LbCertificateState.Builder)
    /**
     * @param domainValidationRecords Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Each element contains the following attributes:
     * @return builder
     */
    def domainValidationRecords(args: Endofunction[com.pulumi.aws.lightsail.inputs.LbCertificateDomainValidationRecordArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.LbCertificateState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.LbCertificateDomainValidationRecordArgs.builder
      builder.domainValidationRecords(args.map(_(argsBuilder).build)*)
