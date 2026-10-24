package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object cloudtrail:
  object CloudtrailFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
     * in a given region for the purpose of allowing CloudTrail to store trail data in S3.
     * 
     * &gt; **Warning:** This data source is deprecated. The AWS documentation [states that](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create-s3-bucket-policy-for-cloudtrail.html#troubleshooting-s3-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
     */
    inline def getServiceAccount(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.GetServiceAccountArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.aws.cloudtrail.outputs.GetServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.cloudtrail.inputs.GetServiceAccountArgs.builder
      com.pulumi.aws.cloudtrail.CloudtrailFunctions.getServiceAccount(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /**
     * Use this data source to get the Account ID of the [AWS CloudTrail Service Account](http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-supported-regions.html)
     * in a given region for the purpose of allowing CloudTrail to store trail data in S3.
     * 
     * &gt; **Warning:** This data source is deprecated. The AWS documentation [states that](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/create-s3-bucket-policy-for-cloudtrail.html#troubleshooting-s3-bucket-policy) a [service principal name](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services) should be used instead of an AWS account ID in any relevant IAM policy.
     */
    inline def getServiceAccountPlain(args: Endofunction[com.pulumi.aws.cloudtrail.inputs.GetServiceAccountPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.cloudtrail.outputs.GetServiceAccountResult] =
      val argsBuilder = com.pulumi.aws.cloudtrail.inputs.GetServiceAccountPlainArgs.builder
      com.pulumi.aws.cloudtrail.CloudtrailFunctions.getServiceAccountPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /**
   * Provides a CloudTrail Event Data Store.
   * 
   * More information about event data stores can be found in the [Event Data Store User Guide](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/query-event-data-store.html).
   * 
   * &gt; **Tip:** For an organization event data store you must create this resource in the management account.
   */
  def EventDataStore(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudtrail.EventDataStoreArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudtrail.EventDataStoreArgs.builder
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
    com.pulumi.aws.cloudtrail.EventDataStore(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Provides a resource to manage an AWS CloudTrail Delegated Administrator. */
  def OrganizationDelegatedAdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudtrail.OrganizationDelegatedAdminAccountArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.cloudtrail.OrganizationDelegatedAdminAccountArgs.builder
    com.pulumi.aws.cloudtrail.OrganizationDelegatedAdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /**
   * Provides a CloudTrail resource.
   * 
   * &gt; **Tip:** For a multi-region trail, this resource must be in the home region of the trail.
   * 
   * &gt; **Tip:** For an organization trail, this resource must be in the master account of the organization.
   */
  def Trail(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.cloudtrail.TrailArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.cloudtrail.TrailArgs.builder
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
    com.pulumi.aws.cloudtrail.Trail(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
