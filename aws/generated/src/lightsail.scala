package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object lightsail:
  /** Manages a Lightsail bucket. Use this resource to create and manage object storage buckets for storing files, images, and other data in Lightsail. */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.BucketArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.BucketArgs.builder
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
    com.pulumi.aws.lightsail.Bucket(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Lightsail bucket access key. Use this resource to create credentials that allow programmatic access to your Lightsail bucket via API requests. */
  def BucketAccessKey(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.BucketAccessKeyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.BucketAccessKeyArgs.builder
    com.pulumi.aws.lightsail.BucketAccessKey(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Lightsail bucket resource access. Use this resource to grant a Lightsail resource (such as an instance) access to a specific bucket. */
  def BucketResourceAccess(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.BucketResourceAccessArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.BucketResourceAccessArgs.builder
    com.pulumi.aws.lightsail.BucketResourceAccess(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Lightsail certificate. Use this resource to create and manage SSL/TLS certificates for securing custom domains with your Lightsail resources. */
  def Certificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.CertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.CertificateArgs.builder
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
    com.pulumi.aws.lightsail.Certificate(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail container service. Use this resource to create and manage a scalable compute and networking platform for deploying, running, and managing containerized applications in Lightsail.
   * 
   * &gt; **Note:** For more information about the AWS Regions in which you can create Amazon Lightsail container services, see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail).
   * 
   * &gt; **NOTE:** You must create and validate an SSL/TLS certificate before you can use `publicDomainNames` with your container service. For more information, see [Enabling and managing custom domains for your Amazon Lightsail container services](https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-creating-container-services-certificates).
   */
  def ContainerService(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.ContainerServiceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.ContainerServiceArgs.builder
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
    com.pulumi.aws.lightsail.ContainerService(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail container service deployment version. Use this resource to deploy containerized applications to your Lightsail container service with specific container configurations and settings.
   * 
   * &gt; **NOTE:** The Amazon Lightsail container service must be enabled to create a deployment.
   * 
   * &gt; **NOTE:** This resource allows you to manage an Amazon Lightsail container service deployment version but the provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile.
   */
  def ContainerServiceDeploymentVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.ContainerServiceDeploymentVersionArgs.builder
    com.pulumi.aws.lightsail.ContainerServiceDeploymentVersion(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail database. Use this resource to create and manage fully managed database instances with automated backups, monitoring, and maintenance in Lightsail.
   * 
   * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones&#34;](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services/) for more details
   */
  def Database(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DatabaseArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DatabaseArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.lightsail.Database(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Lightsail disk. Use this resource to create additional block storage that can be attached to Lightsail instances for extra storage capacity. */
  def Disk(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DiskArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DiskArgs.builder
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
    com.pulumi.aws.lightsail.Disk(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Lightsail disk attachment. Use this resource to attach additional storage disks to your Lightsail instances for expanded storage capacity. */
  def Disk_attachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.Disk_attachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.Disk_attachmentArgs.builder
    com.pulumi.aws.lightsail.Disk_attachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Lightsail content delivery network (CDN) distribution. Use this resource to cache content at edge locations and reduce latency for users accessing your content. */
  def Distribution(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DistributionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DistributionArgs.builder
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
    com.pulumi.aws.lightsail.Distribution(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail domain for DNS management. Use this resource to manage DNS records for a domain that you have already registered with a domain registrar.
   * 
   * &gt; **Note:** You cannot register a new domain name using Lightsail. Register your domain using Amazon Route 53 or another domain name registrar before using this resource.
   * 
   * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def Domain(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DomainArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.DomainArgs.builder
    com.pulumi.aws.lightsail.Domain(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail domain entry (DNS record). Use this resource to define how DNS queries for your domain are handled.
   * 
   * &gt; **NOTE on `id`:** In an effort to simplify imports, this resource `id` field has been updated to the standard resource ID separator, a comma (`,`). For backward compatibility, the previous separator (underscore `_`) can still be used to read and import existing resources. When state is refreshed, the `id` will be updated to use the new standard separator. The previous separator will be deprecated in a future major release.
   */
  def DomainEntry(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.DomainEntryArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.DomainEntryArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lightsail.DomainEntry(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail Instance. Use this resource to create easy virtual private servers with custom software already setup.
   * 
   * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
   */
  def Instance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.InstanceArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.InstanceArgs.builder
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
    com.pulumi.aws.lightsail.Instance(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages public ports for a Lightsail instance. Use this resource to open ports for a specific Amazon Lightsail instance and specify the IP addresses allowed to connect to the instance through the ports and the protocol.
   * 
   * &gt; See [What is Amazon Lightsail?](https://lightsail.aws.amazon.com/ls/docs/getting-started/article/what-is-amazon-lightsail) for more information.
   * 
   * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def InstancePublicPorts(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.InstancePublicPortsArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.InstancePublicPortsArgs.builder
    com.pulumi.aws.lightsail.InstancePublicPorts(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail Key Pair for use with Lightsail Instances. Use this resource to create or import key pairs that are separate from EC2 Key Pairs and required for Lightsail instances.
   * 
   * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details
   */
  def KeyPair(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.KeyPairArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.KeyPairArgs.builder
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
    com.pulumi.aws.lightsail.KeyPair(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail load balancer resource.
   * 
   * Use this resource to distribute incoming traffic across multiple Lightsail instances to improve application availability and performance.
   */
  def Lb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.LbArgs.builder
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
    com.pulumi.aws.lightsail.Lb(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Manages a Lightsail Load Balancer Attachment. Use this resource to attach Lightsail instances to a load balancer for distributing traffic across multiple instances. */
  def LbAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.LbAttachmentArgs.builder
    com.pulumi.aws.lightsail.LbAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail Load Balancer Certificate.
   * 
   * Use this resource to create and manage SSL/TLS certificates for Lightsail Load Balancers. The certificate must be validated before it can be attached to a load balancer to enable HTTPS traffic.
   */
  def LbCertificate(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbCertificateArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.LbCertificateArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lightsail.LbCertificate(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a Lightsail Load Balancer Certificate attachment to a Lightsail Load Balancer.
   * 
   * Use this resource to attach a validated SSL/TLS certificate to a Lightsail Load Balancer to enable HTTPS traffic. The certificate must be validated before it can be attached to the load balancer.
   */
  def LbCertificateAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbCertificateAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.LbCertificateAttachmentArgs.builder
    com.pulumi.aws.lightsail.LbCertificateAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages HTTPS redirection for a Lightsail Load Balancer.
   * 
   * Use this resource to configure automatic redirection of HTTP traffic to HTTPS on a Lightsail Load Balancer. A valid certificate must be attached to the load balancer before enabling HTTPS redirection.
   */
  def LbHttpsRedirectionPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbHttpsRedirectionPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.LbHttpsRedirectionPolicyArgs.builder
    com.pulumi.aws.lightsail.LbHttpsRedirectionPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages session stickiness for a Lightsail Load Balancer.
   * 
   * Use this resource to configure session stickiness to ensure that user sessions are consistently routed to the same backend instance. This helps maintain session state for applications that store session data locally on the server.
   */
  def LbStickinessPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.LbStickinessPolicyArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.LbStickinessPolicyArgs.builder
    com.pulumi.aws.lightsail.LbStickinessPolicy(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a static IP address.
   * 
   * Use this resource to allocate a static IP address that can be attached to Lightsail instances to provide a consistent public IP address that persists across instance restarts.
   * 
   * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def StaticIp(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.StaticIpArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.lightsail.StaticIpArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.lightsail.StaticIp(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Manages a static IP address attachment - relationship between a Lightsail static IP and Lightsail instance.
   * 
   * Use this resource to attach a static IP address to a Lightsail instance to provide a consistent public IP address that persists across instance restarts.
   * 
   * &gt; **Note:** Lightsail is currently only supported in a limited number of AWS Regions, please see [&#34;Regions and Availability Zones in Amazon Lightsail&#34;](https://lightsail.aws.amazon.com/ls/docs/overview/article/understanding-regions-and-availability-zones-in-amazon-lightsail) for more details.
   */
  def StaticIpAttachment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.lightsail.StaticIpAttachmentArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.lightsail.StaticIpAttachmentArgs.builder
    com.pulumi.aws.lightsail.StaticIpAttachment(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
