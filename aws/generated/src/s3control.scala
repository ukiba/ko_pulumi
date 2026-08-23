package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object s3control:
  /**
   * Provides a resource to manage an S3 Access Grant.
   * Each access grant has its own ID and gives an IAM user or role or a directory user, or group (the grantee) access to a registered location. You determine the level of access, such as `READ` or `READWRITE`.
   * Before you can create a grant, you must have an S3 Access Grants instance in the same Region as the S3 data.
   */
  def AccessGrant(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.AccessGrantArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.AccessGrantArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3control.AccessGrant(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.AccessGrantArgs.Builder)
    /**
     * @param accessGrantsLocationConfiguration See `accessGrantsLocationConfiguration` Block below for more details.
     * @return builder
     */
    def accessGrantsLocationConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.AccessGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.builder
      builder.accessGrantsLocationConfiguration(args(argsBuilder).build)

    /**
     * @param grantee See `grantee` Block below for more details.
     * @return builder
     */
    def grantee(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3control.AccessGrantArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  /**
   * Provides a resource to manage an S3 Access Grants instance, which serves as a logical grouping for access grants.
   * You can have one S3 Access Grants instance per Region in your account.
   */
  def AccessGrantsInstance(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.AccessGrantsInstanceArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.AccessGrantsInstanceArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3control.AccessGrantsInstance(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage an S3 Access Grants instance resource policy.
   * Use a resource policy to manage cross-account access to your S3 Access Grants instance.
   */
  def AccessGrantsInstanceResourcePolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.AccessGrantsInstanceResourcePolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.AccessGrantsInstanceResourcePolicyArgs.builder
    com.pulumi.aws.s3control.AccessGrantsInstanceResourcePolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage an S3 Access Grants location.
   * A location is an S3 resource (bucket or prefix) in a permission grant that the grantee can access.
   * The S3 data must be in the same Region as your S3 Access Grants instance.
   * When you register a location, you must include the IAM role that has permission to manage the S3 location that you are registering.
   */
  def AccessGrantsLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.AccessGrantsLocationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.AccessGrantsLocationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3control.AccessGrantsLocation(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage an S3 Access Point resource policy.
   * 
   * &gt; **NOTE on Access Points and Access Point Policies:** The provider provides both a standalone Access Point Policy resource and an Access Point resource with a resource policy defined in-line. You cannot use an Access Point with in-line resource policy in conjunction with an Access Point Policy resource. Doing so will cause a conflict of policies and will overwrite the access point&#39;s resource policy.
   */
  def AccessPointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.AccessPointPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.AccessPointPolicyArgs.builder
    com.pulumi.aws.s3control.AccessPointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage an S3 Control Bucket.
   * 
   * &gt; This functionality is for managing [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html). To manage S3 Buckets in an AWS Partition, see the `aws.s3.Bucket` resource.
   */
  def Bucket(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.BucketArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.BucketArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3control.Bucket(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage an S3 Control Bucket Lifecycle Configuration.
   * 
   * &gt; **NOTE:** Each S3 Control Bucket can only have one Lifecycle Configuration. Using multiple of this resource against the same S3 Control Bucket will result in perpetual differences each provider run.
   * 
   * &gt; This functionality is for managing [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html). To manage S3 Bucket Lifecycle Configurations in an AWS Partition, see the `aws.s3.Bucket` resource.
   */
  def BucketLifecycleConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.BucketLifecycleConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.BucketLifecycleConfigurationArgs.builder
    com.pulumi.aws.s3control.BucketLifecycleConfiguration(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.BucketLifecycleConfigurationArgs.Builder)
    /**
     * @param rules Configuration block(s) containing lifecycle rules for the bucket. See `rule` below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3control.BucketLifecycleConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage an S3 Control Bucket Policy.
   * 
   * &gt; This functionality is for managing [S3 on Outposts](https://docs.aws.amazon.com/AmazonS3/latest/dev/S3onOutposts.html). To manage S3 Bucket Policies in an AWS Partition, see the `aws.s3.BucketPolicy` resource.
   */
  def BucketPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.BucketPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.BucketPolicyArgs.builder
    com.pulumi.aws.s3control.BucketPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Provides a resource to manage the access point scope for a directory bucket.
   * 
   * With access points for directory buckets, you can use the access point scope to restrict access to specific prefixes, API actions, or a combination of both. You can specify any amount of prefixes, but the total length of characters of all prefixes must be less than 256 bytes. For more information, see [AWS Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points-directory-buckets-manage-scope.html).
   * 
   * &gt; For all the services in AWS Local Zones, including Amazon S3, your accountID must be enabled before you can create or access any resource in the Local Zone. You can use the `DescribeAvailabilityZones` API operation to confirm your accountID access to a Local Zone. For more information, see [AWS Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/opt-in-directory-bucket-lz.html)
   * 
   * &gt; Terraform manages access point scopes for directory buckets with the standalone `aws.s3control.DirectoryBucketAccessPointScope` resource. The `aws.s3.AccessPoint` resource does not support an in-line scope.
   */
  def DirectoryBucketAccessPointScope(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.DirectoryBucketAccessPointScopeArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.DirectoryBucketAccessPointScopeArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.s3control.DirectoryBucketAccessPointScope(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.DirectoryBucketAccessPointScopeArgs.Builder)
    /**
     * @param scope . Scope is used to restrict access to specific prefixes, API operations, or a combination of both. To remove the `scope`, set it to `{permissions=[] prefixes=[]}`. The default scope is `{permissions=[] prefixes=[]}`.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.Builder]):
        com.pulumi.aws.s3control.DirectoryBucketAccessPointScopeArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  /**
   * Provides a resource to manage an S3 Multi-Region Access Point associated with specified buckets.
   * 
   * &gt; This resource cannot be used with S3 directory buckets.
   * 
   * For more information, see the documentation on [Multi-Region Access Points](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPoints.html).
   */
  def MultiRegionAccessPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.MultiRegionAccessPointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.MultiRegionAccessPointArgs.builder
    com.pulumi.aws.s3control.MultiRegionAccessPoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.MultiRegionAccessPointArgs.Builder)
    /**
     * @param details Configuration block containing details about the Multi-Region Access Point. See `details` Block below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder]):
        com.pulumi.aws.s3control.MultiRegionAccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  /** Provides a resource to manage an S3 Multi-Region Access Point access control policy. */
  def MultiRegionAccessPointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.builder
    com.pulumi.aws.s3control.MultiRegionAccessPointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.Builder)
    /**
     * @param details Configuration block containing details about the policy for the Multi-Region Access Point. See `details` Block below for more details
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.Builder]):
        com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  /**
   * Provides a resource to manage the routing configuration for an S3 Multi-Region Access Point.
   * 
   * &gt; Note: Destruction of this resource only removes it from state. It __does not__ alter the configured traffic routing percentages.
   */
  def MultiRegionAccessPointRoutes(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.MultiRegionAccessPointRoutesArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.MultiRegionAccessPointRoutesArgs.builder
    com.pulumi.aws.s3control.MultiRegionAccessPointRoutes(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.MultiRegionAccessPointRoutesArgs.Builder)
    /**
     * @param routes Route configurations. At least one route must have a `trafficDialPercentage` of `100`. See `route` below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.Builder]*):
        com.pulumi.aws.s3control.MultiRegionAccessPointRoutesArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  /**
   * Provides a resource to manage an S3 Object Lambda Access Point.
   * An Object Lambda access point is associated with exactly one standard access point and thus one Amazon S3 bucket.
   */
  def ObjectLambdaAccessPoint(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.ObjectLambdaAccessPointArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.ObjectLambdaAccessPointArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.s3control.ObjectLambdaAccessPoint(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.ObjectLambdaAccessPointArgs.Builder)
    /**
     * @param configuration Configuration block containing details about the Object Lambda Access Point. See `configuration` Block below for more details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.ObjectLambdaAccessPointArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  /** Provides a resource to manage an S3 Object Lambda Access Point resource policy. */
  def ObjectLambdaAccessPointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.ObjectLambdaAccessPointPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.ObjectLambdaAccessPointPolicyArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.aws.s3control.ObjectLambdaAccessPointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  object S3controlFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Provides details about an AWS S3 Control Access Points. */
    inline def getAccessPoints(args: Endofunction[com.pulumi.aws.s3control.inputs.GetAccessPointsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3control.outputs.GetAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.s3control.inputs.GetAccessPointsArgs.builder
      com.pulumi.aws.s3control.S3controlFunctions.getAccessPoints(args(argsBuilder).build)

    /** Provides details about an AWS S3 Control Access Points. */
    inline def getAccessPointsPlain(args: Endofunction[com.pulumi.aws.s3control.inputs.GetAccessPointsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3control.outputs.GetAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.s3control.inputs.GetAccessPointsPlainArgs.builder
      com.pulumi.aws.s3control.S3controlFunctions.getAccessPointsPlain(args(argsBuilder).build)

    /** Provides details on a specific S3 Multi-Region Access Point. */
    inline def getMultiRegionAccessPoint(args: Endofunction[com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3control.outputs.GetMultiRegionAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointArgs.builder
      com.pulumi.aws.s3control.S3controlFunctions.getMultiRegionAccessPoint(args(argsBuilder).build)

    /** Provides details on a specific S3 Multi-Region Access Point. */
    inline def getMultiRegionAccessPointPlain(args: Endofunction[com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3control.outputs.GetMultiRegionAccessPointResult] =
      val argsBuilder = com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointPlainArgs.builder
      com.pulumi.aws.s3control.S3controlFunctions.getMultiRegionAccessPointPlain(args(argsBuilder).build)

    /** Provides details about AWS S3 Control Multi-Region Access Points. */
    inline def getMultiRegionAccessPoints(args: Endofunction[com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointsArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.s3control.outputs.GetMultiRegionAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointsArgs.builder
      com.pulumi.aws.s3control.S3controlFunctions.getMultiRegionAccessPoints(args(argsBuilder).build)

    /** Provides details about AWS S3 Control Multi-Region Access Points. */
    inline def getMultiRegionAccessPointsPlain(args: Endofunction[com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointsPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.s3control.outputs.GetMultiRegionAccessPointsResult] =
      val argsBuilder = com.pulumi.aws.s3control.inputs.GetMultiRegionAccessPointsPlainArgs.builder
      com.pulumi.aws.s3control.S3controlFunctions.getMultiRegionAccessPointsPlain(args(argsBuilder).build)

  /** Provides a resource to manage an S3 Storage Lens configuration. */
  def StorageLensConfiguration(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.StorageLensConfigurationArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.s3control.StorageLensConfigurationArgs.builder
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.s3control.StorageLensConfiguration(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.s3control.StorageLensConfigurationArgs.Builder)
    /**
     * @param storageLensConfiguration S3 Storage Lens configuration. See `storageLensConfiguration` below for more details.
     * @return builder
     */
    def storageLensConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.StorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.builder
      builder.storageLensConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.AccessGrantState.Builder)
    /**
     * @param accessGrantsLocationConfiguration See `accessGrantsLocationConfiguration` Block below for more details.
     * @return builder
     */
    def accessGrantsLocationConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.AccessGrantState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantAccessGrantsLocationConfigurationArgs.builder
      builder.accessGrantsLocationConfiguration(args(argsBuilder).build)

    /**
     * @param grantee See `grantee` Block below for more details.
     * @return builder
     */
    def grantee(args: Endofunction[com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.AccessGrantState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.AccessGrantGranteeArgs.builder
      builder.grantee(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder)
    /**
     * @param abortIncompleteMultipartUpload Configuration block containing settings for abort incomplete multipart upload. See `abortIncompleteMultipartUpload` below.
     * @return builder
     */
    def abortIncompleteMultipartUpload(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.Builder]):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadArgs.builder
      builder.abortIncompleteMultipartUpload(args(argsBuilder).build)

    /**
     * @param expiration Configuration block containing settings for expiration of objects. See `expiration` below.
     * @return builder
     */
    def expiration(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleExpirationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleExpirationArgs.builder
      builder.expiration(args(argsBuilder).build)

    /**
     * @param filter Configuration block containing settings for filtering. See `filter` below.
     * @return builder
     */
    def filter(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleFilterArgs.Builder]):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleFilterArgs.builder
      builder.filter(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationState.Builder)
    /**
     * @param rules Configuration block(s) containing lifecycle rules for the bucket. See `rule` below.
     * @return builder
     */
    def rules(args: Endofunction[com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationState.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.BucketLifecycleConfigurationRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeState.Builder)
    /**
     * @param scope . Scope is used to restrict access to specific prefixes, API operations, or a combination of both. To remove the `scope`, set it to `{permissions=[] prefixes=[]}`. The default scope is `{permissions=[] prefixes=[]}`.
     * @return builder
     */
    def scope(args: Endofunction[com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.DirectoryBucketAccessPointScopeScopeArgs.builder
      builder.scope(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder)
    /**
     * @param publicAccessBlock Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See `publicAccessBlock` Block below.
     * @return builder
     */
    def publicAccessBlock(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsPublicAccessBlockArgs.Builder]):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsPublicAccessBlockArgs.builder
      builder.publicAccessBlock(args(argsBuilder).build)

    /**
     * @param regions Region configuration block to specify the bucket associated with the Multi-Region Access Point. See `region` Block below.
     * @return builder
     */
    def regions(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsRegionArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsRegionArgs.builder
      builder.regions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyState.Builder)
    /**
     * @param details Configuration block containing details about the policy for the Multi-Region Access Point. See `details` Block below for more details
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointPolicyDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesState.Builder)
    /**
     * @param routes Route configurations. At least one route must have a `trafficDialPercentage` of `100`. See `route` below.
     * @return builder
     */
    def routes(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesState.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointRoutesRouteArgs.builder
      builder.routes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.MultiRegionAccessPointState.Builder)
    /**
     * @param details Configuration block containing details about the Multi-Region Access Point. See `details` Block below.
     * @return builder
     */
    def details(args: Endofunction[com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.MultiRegionAccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsArgs.builder
      builder.details(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder)
    /**
     * @param transformationConfigurations List of transformation configurations for the Object Lambda Access Point. See `transformationConfiguration` Block below for more details.
     * @return builder
     */
    def transformationConfigurations(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.Builder]*):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.builder
      builder.transformationConfigurations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.Builder)
    /**
     * @param contentTransformation Content transformation of an Object Lambda Access Point configuration. See `contentTransformation` Block below for more details.
     * @return builder
     */
    def contentTransformation(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.builder
      builder.contentTransformation(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.Builder)
    /**
     * @param awsLambda Configuration for an AWS Lambda function. See `awsLambda` Block below for more details.
     * @return builder
     */
    def awsLambda(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs.Builder]):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambdaArgs.builder
      builder.awsLambda(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointState.Builder)
    /**
     * @param configuration Configuration block containing details about the Object Lambda Access Point. See `configuration` Block below for more details.
     * @return builder
     */
    def configuration(args: Endofunction[com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationArgs.builder
      builder.configuration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationState.Builder)
    /**
     * @param storageLensConfiguration S3 Storage Lens configuration. See `storageLensConfiguration` below for more details.
     * @return builder
     */
    def storageLensConfiguration(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationState.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.builder
      builder.storageLensConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder)
    /**
     * @param activityMetrics S3 Storage Lens activity metrics. See `activityMetrics` below for more details.
     * @return builder
     */
    def activityMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelActivityMetricsArgs.builder
      builder.activityMetrics(args(argsBuilder).build)

    /**
     * @param advancedCostOptimizationMetrics Advanced cost-optimization metrics for S3 Storage Lens. See `advancedCostOptimizationMetrics` below for more details.
     * @return builder
     */
    def advancedCostOptimizationMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedCostOptimizationMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedCostOptimizationMetricsArgs.builder
      builder.advancedCostOptimizationMetrics(args(argsBuilder).build)

    /**
     * @param advancedDataProtectionMetrics Advanced data-protection metrics for S3 Storage Lens. See `advancedDataProtectionMetrics` below for more details.
     * @return builder
     */
    def advancedDataProtectionMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedDataProtectionMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedDataProtectionMetricsArgs.builder
      builder.advancedDataProtectionMetrics(args(argsBuilder).build)

    /**
     * @param advancedPerformanceMetrics Advanced performance metrics for S3 Storage Lens. See `advancedPerformanceMetrics` below for more details.
     * @return builder
     */
    def advancedPerformanceMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedPerformanceMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelAdvancedPerformanceMetricsArgs.builder
      builder.advancedPerformanceMetrics(args(argsBuilder).build)

    /**
     * @param bucketLevel S3 Storage Lens bucket-level configuration. See `bucketLevel` below for more details.
     * @return builder
     */
    def bucketLevel(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.builder
      builder.bucketLevel(args(argsBuilder).build)

    /**
     * @param detailedStatusCodeMetrics Detailed status code metrics for S3 Storage Lens. See `detailedStatusCodeMetrics` below for more details.
     * @return builder
     */
    def detailedStatusCodeMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelDetailedStatusCodeMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelDetailedStatusCodeMetricsArgs.builder
      builder.detailedStatusCodeMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder)
    /**
     * @param activityMetrics S3 Storage Lens activity metrics. See `activityMetrics` above for more details.
     * @return builder
     */
    def activityMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelActivityMetricsArgs.builder
      builder.activityMetrics(args(argsBuilder).build)

    /**
     * @param advancedCostOptimizationMetrics Advanced cost-optimization metrics for S3 Storage Lens. See `advancedCostOptimizationMetrics` above for more details.
     * @return builder
     */
    def advancedCostOptimizationMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedCostOptimizationMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedCostOptimizationMetricsArgs.builder
      builder.advancedCostOptimizationMetrics(args(argsBuilder).build)

    /**
     * @param advancedDataProtectionMetrics Advanced data-protection metrics for S3 Storage Lens. See `advancedDataProtectionMetrics` above for more details.
     * @return builder
     */
    def advancedDataProtectionMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedDataProtectionMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedDataProtectionMetricsArgs.builder
      builder.advancedDataProtectionMetrics(args(argsBuilder).build)

    /**
     * @param advancedPerformanceMetrics Advanced performance metrics for S3 Storage Lens. See `advancedPerformanceMetrics` above for more details.
     * @return builder
     */
    def advancedPerformanceMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedPerformanceMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelAdvancedPerformanceMetricsArgs.builder
      builder.advancedPerformanceMetrics(args(argsBuilder).build)

    /**
     * @param detailedStatusCodeMetrics Detailed status code metrics for S3 Storage Lens. See `detailedStatusCodeMetrics` above for more details.
     * @return builder
     */
    def detailedStatusCodeMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelDetailedStatusCodeMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelDetailedStatusCodeMetricsArgs.builder
      builder.detailedStatusCodeMetrics(args(argsBuilder).build)

    /**
     * @param prefixLevel Prefix-level metrics for S3 Storage Lens. See `prefixLevel` below for more details.
     * @return builder
     */
    def prefixLevel(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.builder
      builder.prefixLevel(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.Builder)
    /**
     * @param storageMetrics Prefix-level storage metrics for S3 Storage Lens. See `storageMetrics` below for more details.
     * @return builder
     */
    def storageMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.builder
      builder.storageMetrics(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.Builder)
    /**
     * @param selectionCriteria Selection criteria. See `selectionCriteria` below for more details.
     * @return builder
     */
    def selectionCriteria(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsSelectionCriteriaArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelBucketLevelPrefixLevelStorageMetricsSelectionCriteriaArgs.builder
      builder.selectionCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder)
    /**
     * @param accountLevel Account-level configurations of the S3 Storage Lens configuration. See `accountLevel` below for more details.
     * @return builder
     */
    def accountLevel(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAccountLevelArgs.builder
      builder.accountLevel(args(argsBuilder).build)

    /**
     * @param awsOrg Amazon Web Services organization for the S3 Storage Lens configuration. See `awsOrg` below for more details.
     * @return builder
     */
    def awsOrg(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAwsOrgArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationAwsOrgArgs.builder
      builder.awsOrg(args(argsBuilder).build)

    /**
     * @param dataExport Properties of S3 Storage Lens metrics export including the destination, schema and format. See `dataExport` below for more details.
     * @return builder
     */
    def dataExport(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.builder
      builder.dataExport(args(argsBuilder).build)

    /**
     * @param exclude What is excluded in this configuration. Conflicts with `include`. See `exclude` below for more details.
     * @return builder
     */
    def exclude(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExcludeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExcludeArgs.builder
      builder.exclude(args(argsBuilder).build)

    /**
     * @param expandedPrefixesDataExport Configuration for the S3 Storage Lens expanded prefix metrics report. Unlike the default Storage Lens metrics report, the enhanced prefix metrics report includes all S3 Storage Lens storage and activity data related to the full list of prefixes in your Storage Lens configuration. See `expandedPrefixesDataExport` below for more details.
     * @return builder
     */
    def expandedPrefixesDataExport(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.builder
      builder.expandedPrefixesDataExport(args(argsBuilder).build)

    /**
     * @param include What is included in this configuration. Conflicts with `exclude`. See `include` below for more details.
     * @return builder
     */
    def include(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationIncludeArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationIncludeArgs.builder
      builder.include(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder)
    /**
     * @param cloudWatchMetrics Amazon CloudWatch publishing for S3 Storage Lens metrics. See `cloudWatchMetrics` below for more details.
     * @return builder
     */
    def cloudWatchMetrics(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportCloudWatchMetricsArgs.builder
      builder.cloudWatchMetrics(args(argsBuilder).build)

    /**
     * @param s3BucketDestination Bucket where the S3 Storage Lens metrics export will be located. See `s3BucketDestination` below for more details.
     * @return builder
     */
    def s3BucketDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.builder
      builder.s3BucketDestination(args(argsBuilder).build)

    /**
     * @param storageLensTableDestination S3 table bucket where the S3 Storage Lens metrics export will be located. See `storageLensTableDestination` below for more details.
     * @return builder
     */
    def storageLensTableDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.builder
      builder.storageLensTableDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this bucket. See `encryption` below for more details.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportS3BucketDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this S3 tables bucket. See `encryption` below for more details.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationDataExportStorageLensTableDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder)
    /**
     * @param s3BucketDestination Bucket where the S3 Storage Lens expanded prefix metrics export will be located. See `s3BucketDestination` below for more details.
     * @return builder
     */
    def s3BucketDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.builder
      builder.s3BucketDestination(args(argsBuilder).build)

    /**
     * @param storageLensTableDestination S3 table bucket where the S3 Storage Lens expanded prefix metrics export will be located. See `storageLensTableDestination` below for more details.
     * @return builder
     */
    def storageLensTableDestination(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.builder
      builder.storageLensTableDestination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this bucket. See `encryption` below for more details.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportS3BucketDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.Builder)
    /**
     * @param encryption Encryption of the metrics exports in this S3 tables bucket. See `encryption` below for more details.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder)
    /**
     * @param sseKms SSE-KMS encryption. See `sseKms` below for more details.
     * @return builder
     */
    def sseKms(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseKmsArgs.Builder]):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseKmsArgs.builder
      builder.sseKms(args(argsBuilder).build)

    /**
     * @param sseS3s SSE-S3 encryption. An empty configuration block `{}` should be used.
     * @return builder
     */
    def sseS3s(args: Endofunction[com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseS3Args.Builder]*):
        com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionArgs.Builder =
      def argsBuilder = com.pulumi.aws.s3control.inputs.StorageLensConfigurationStorageLensConfigurationExpandedPrefixesDataExportStorageLensTableDestinationEncryptionSseS3Args.builder
      builder.sseS3s(args.map(_(argsBuilder).build)*)
