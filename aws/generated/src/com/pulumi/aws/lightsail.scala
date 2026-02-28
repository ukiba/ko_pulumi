package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object lightsail:
  /**
   * Manages a static IP address.
   *  
   *  Use this resource to allocate a static IP address that can be attached to Lightsail instances to provide a consistent public IP address that persists across instance restarts.
   *  
   *  &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def StaticIp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.StaticIpArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.StaticIpArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lightsail.StaticIp(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a static IP address attachment - relationship between a Lightsail static IP and Lightsail instance.
   *  
   *  Use this resource to attach a static IP address to a Lightsail instance to provide a consistent public IP address that persists across instance restarts.
   *  
   *  &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def StaticIpAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.StaticIpAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.StaticIpAttachmentArgs.builder
    
    com.pulumi.aws.lightsail.StaticIpAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail load balancer resource.
   *  
   *  Use this resource to distribute incoming traffic across multiple Lightsail instances to improve application availability and performance.
   */
  def Lb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.LbArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.Lb(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail domain entry (DNS record). Use this resource to define how DNS queries for your domain are handled.
   *  
   *  &gt; **NOTE on `id`:** In an effort to simplify imports, this resource `id` field has been updated to the standard resource id separator, a comma (`,`). For backward compatibility, the previous separator (underscore `_`) can still be used to read and import existing resources. When state is refreshed, the `id` will be updated to use the new standard separator. The previous separator will be deprecated in a future major release.
   */
  def DomainEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DomainEntryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DomainEntryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lightsail.DomainEntry(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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
     *  The following arguments are optional:
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.Builder]):
        com.pulumi.aws.lightsail.DistributionArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.builder
      builder.origin(args(argsBuilder).build)

  /** Manages a Lightsail bucket resource access. Use this resource to grant a Lightsail resource (such as an instance) access to a specific bucket. */
  def BucketResourceAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.BucketResourceAccessArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.BucketResourceAccessArgs.builder
    
    com.pulumi.aws.lightsail.BucketResourceAccess(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Lightsail disk. Use this resource to create additional block storage that can be attached to Lightsail instances for extra storage capacity. */
  def Disk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DiskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DiskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.Disk(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages session stickiness for a Lightsail Load Balancer.
   *  
   *  Use this resource to configure session stickiness to ensure that user sessions are consistently routed to the same backend instance. This helps maintain session state for applications that store session data locally on the server.
   */
  def LbStickinessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbStickinessPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.LbStickinessPolicyArgs.builder
    
    com.pulumi.aws.lightsail.LbStickinessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lightsail.InstanceArgs.Builder)
    /**
     * @param addOn Add-on configuration for the instance. See below.
     * @return builder
     */
    def addOn(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.Builder]):
        com.pulumi.aws.lightsail.InstanceArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.builder
      builder.addOn(args(argsBuilder).build)

  /**
   * Manages a Lightsail Load Balancer Certificate attachment to a Lightsail Load Balancer.
   *  
   *  Use this resource to attach a validated SSL/TLS certificate to a Lightsail Load Balancer to enable HTTPS traffic. The certificate must be validated before it can be attached to the load balancer.
   */
  def LbCertificateAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbCertificateAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.LbCertificateAttachmentArgs.builder
    
    com.pulumi.aws.lightsail.LbCertificateAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Lightsail Load Balancer Attachment. Use this resource to attach Lightsail instances to a load balancer for distributing traffic across multiple instances. */
  def LbAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbAttachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.LbAttachmentArgs.builder
    
    com.pulumi.aws.lightsail.LbAttachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail container service. Use this resource to create and manage a scalable compute and networking platform for deploying, running, and managing containerized applications in Lightsail.
   *  
   *  &gt; **Note:** For more information about the AWS Regions in which you can create Amazon Lightsail container services, see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail).
   *  
   *  &gt; **NOTE:** You must create and validate an SSL/TLS certificate before you can use `publicDomainNames` with your container service. For more information, see [Enabling and managing custom domains for your Amazon Lightsail container services](https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-container-services-certificates).
   */
  def ContainerService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.ContainerServiceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.ContainerServiceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.ContainerService(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail database. Use this resource to create and manage fully managed database instances with automated backups, monitoring, and maintenance in Lightsail.
   *  
   *  &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones&#34;](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services/) for more details
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DatabaseArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DatabaseArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.Database(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages public ports for a Lightsail instance. Use this resource to open ports for a specific Amazon Lightsail instance and specify the IP addresses allowed to connect to the instance through the ports and the protocol.
   *  
   *  &gt; See [What is Amazon Lightsail?](https://lightsail.aws.amazon.com/ls/docs/getting-started/article/what-is-amazon-lightsail) for more information.
   *  
   *  &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def InstancePublicPorts(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.InstancePublicPortsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.InstancePublicPortsArgs.builder
    
    com.pulumi.aws.lightsail.InstancePublicPorts(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Lightsail certificate. Use this resource to create and manage SSL/TLS certificates for securing custom domains with your Lightsail resources. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.CertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.CertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.Certificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

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

  /**
   * Manages a Lightsail container service deployment version. Use this resource to deploy containerized applications to your Lightsail container service with specific container configurations and settings.
   *  
   *  &gt; **NOTE:** The Amazon Lightsail container service must be enabled to create a deployment.
   *  
   *  &gt; **NOTE:** This resource allows you to manage an Amazon Lightsail container service deployment version but the provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile.
   */
  def ContainerServiceDeploymentVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs.builder
    
    com.pulumi.aws.lightsail.ContainerServiceDeploymentVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages HTTPS redirection for a Lightsail Load Balancer.
   *  
   *  Use this resource to configure automatic redirection of HTTP traffic to HTTPS on a Lightsail Load Balancer. A valid certificate must be attached to the load balancer before enabling HTTPS redirection.
   */
  def LbHttpsRedirectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbHttpsRedirectionPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.LbHttpsRedirectionPolicyArgs.builder
    
    com.pulumi.aws.lightsail.LbHttpsRedirectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail Instance. Use this resource to create easy virtual private servers with custom software already setup.
   *  
   *  &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.InstanceArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.InstanceArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.Instance(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail Key Pair for use with Lightsail Instances. Use this resource to create or import key pairs that are separate from EC2 Key Pairs and required for Lightsail instances.
   *  
   *  &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
   */
  def KeyPair(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.KeyPairArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.KeyPairArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.KeyPair(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Lightsail bucket access key. Use this resource to create credentials that allow programmatic access to your Lightsail bucket via API requests. */
  def BucketAccessKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.BucketAccessKeyArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.BucketAccessKeyArgs.builder
    
    com.pulumi.aws.lightsail.BucketAccessKey(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail Load Balancer Certificate.
   *  
   *  Use this resource to create and manage SSL/TLS certificates for Lightsail Load Balancers. The certificate must be validated before it can be attached to a load balancer to enable HTTPS traffic.
   */
  def LbCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbCertificateArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.LbCertificateArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.lightsail.LbCertificate(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lightsail.InstancePublicPortsArgs.Builder)
    /**
     * @param portInfos Descriptor of the ports to open for the specified instance. AWS closes all currently open ports that are not included in this argument. See `portInfo` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def portInfos(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.Builder]*):
        com.pulumi.aws.lightsail.InstancePublicPortsArgs.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.builder
      builder.portInfos(args.map(_(argsBuilder).build)*)

  /** Manages a Lightsail content delivery network (CDN) distribution. Use this resource to cache content at edge locations and reduce latency for users accessing your content. */
  def Distribution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DistributionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DistributionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.Distribution(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.CertificateState.Builder)
    /**
     * @param domainValidationOptions Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined. Each element contains the following attributes:
     * @return builder
     */
    def domainValidationOptions(args: Endofunction[com.pulumi.aws.lightsail.inputs.CertificateDomainValidationOptionArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.CertificateState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.CertificateDomainValidationOptionArgs.builder
      builder.domainValidationOptions(args.map(_(argsBuilder).build)*)

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
     *  The following arguments are optional:
     * @return builder
     */
    def origin(args: Endofunction[com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.DistributionState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.DistributionOriginArgs.builder
      builder.origin(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.Builder)
    /**
     * @param certificates Set of certificate configurations for the public domain names. Each element contains the following attributes:
     * @return builder
     */
    def certificates(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesCertificateArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesArgs.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePublicDomainNamesCertificateArgs.builder
      builder.certificates(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.Builder)
    /**
     * @param ecrImagePullerRole Configuration to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. See below.
     * @return builder
     */
    def ecrImagePullerRole(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessEcrImagePullerRoleArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServicePrivateRegistryAccessEcrImagePullerRoleArgs.builder
      builder.ecrImagePullerRole(args(argsBuilder).build)

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

  extension (builder: com.pulumi.aws.lightsail.inputs.InstancePublicPortsState.Builder)
    /**
     * @param portInfos Descriptor of the ports to open for the specified instance. AWS closes all currently open ports that are not included in this argument. See `portInfo` Block for details.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def portInfos(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.InstancePublicPortsState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs.builder
      builder.portInfos(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lightsail.inputs.LbCertificateState.Builder)
    /**
     * @param domainValidationRecords Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g., if SANs are defined.
     * @return builder
     */
    def domainValidationRecords(args: Endofunction[com.pulumi.aws.lightsail.inputs.LbCertificateDomainValidationRecordArgs.Builder]*):
        com.pulumi.aws.lightsail.inputs.LbCertificateState.Builder =
      def argsBuilder = com.pulumi.aws.lightsail.inputs.LbCertificateDomainValidationRecordArgs.builder
      builder.domainValidationRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.Builder)
    /**
     * @param healthCheck Configuration block that describes the health check configuration of the container. See below.
     * @return builder
     */
    def healthCheck(args: Endofunction[com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointHealthCheckArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointArgs.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.ContainerServiceDeploymentVersionPublicEndpointHealthCheckArgs.builder
      builder.healthCheck(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.lightsail.inputs.InstanceState.Builder)
    /**
     * @param addOn Add-on configuration for the instance. See below.
     * @return builder
     */
    def addOn(args: Endofunction[com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.Builder]):
        com.pulumi.aws.lightsail.inputs.InstanceState.Builder =
      val argsBuilder = com.pulumi.aws.lightsail.inputs.InstanceAddOnArgs.builder
      builder.addOn(args(argsBuilder).build)

  /** Manages a Lightsail bucket. Use this resource to create and manage object storage buckets for storing files, images, and other data in Lightsail. */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.BucketArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.BucketArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.lightsail.Bucket(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Lightsail domain for DNS management. Use this resource to manage DNS records for a domain that you have already registered with a domain registrar.
   *  
   *  &gt; **Note:** You cannot register a new domain name using Lightsail. Register your domain using Amazon Route 53 or another domain name registrar before using this resource.
   *  
   *  &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DomainArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.DomainArgs.builder
    
    com.pulumi.aws.lightsail.Domain(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages a Lightsail disk attachment. Use this resource to attach additional storage disks to your Lightsail instances for expanded storage capacity. */
  def Disk_attachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.Disk_attachmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.lightsail.Disk_attachmentArgs.builder
    
    com.pulumi.aws.lightsail.Disk_attachment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
