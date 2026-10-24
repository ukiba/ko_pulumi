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

  /** Provides a resource to manage an S3 Multi-Region Access Point access control policy. */
  def MultiRegionAccessPointPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.s3control.MultiRegionAccessPointPolicyArgs.builder
    com.pulumi.aws.s3control.MultiRegionAccessPointPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
