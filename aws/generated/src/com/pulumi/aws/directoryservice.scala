package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object directoryservice:
  /** Provides a conditional forwarder for managed Microsoft AD in AWS Directory Service. */
  def ConditionalForwarder(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.ConditionalForwarderArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directoryservice.ConditionalForwarderArgs.builder
    
    com.pulumi.aws.directoryservice.ConditionalForwarder(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.directoryservice.ServiceRegionArgs.Builder)
    /**
     * @param vpcSettings VPC information in the replicated Region. Detailed below.
     * @return builder
     */
    def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.ServiceRegionArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  /** Manages a directory in your account (directory owner) shared with another account (directory consumer). */
  def SharedDirectory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.SharedDirectoryArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directoryservice.SharedDirectoryArgs.builder
    
    com.pulumi.aws.directoryservice.SharedDirectory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Simple or Managed Microsoft directory in AWS Directory Service. */
  def Directory(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.DirectoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directoryservice.DirectoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directoryservice.Directory(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.directoryservice.DirectoryArgs.Builder)
    /**
     * @param connectSettings Connector related information about the directory. Fields documented below.
     * @return builder
     */
    def connectSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.builder
      builder.connectSettings(args(argsBuilder).build)

    /**
     * @param vpcSettings VPC related information about the directory. Fields documented below.
     * @return builder
     */
    def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.DirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  type DirectoryserviceFunctions = com.pulumi.aws.directoryservice.DirectoryserviceFunctions
  object DirectoryserviceFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.directoryservice.DirectoryserviceFunctions.*
  extension (self: DirectoryserviceFunctions.type)
    /** Get attributes of AWS Directory Service directory (SimpleAD, Managed AD, AD Connector). It&#39;s especially useful to refer AWS Managed AD or on-premise AD in AD Connector configuration. */
    def getDirectory(args: Endofunction[com.pulumi.aws.directoryservice.inputs.GetDirectoryArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.directoryservice.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.GetDirectoryArgs.builder
      com.pulumi.aws.directoryservice.DirectoryserviceFunctions.getDirectory(args(argsBuilder).build)

    /** Get attributes of AWS Directory Service directory (SimpleAD, Managed AD, AD Connector). It&#39;s especially useful to refer AWS Managed AD or on-premise AD in AD Connector configuration. */
    def getDirectoryPlain(args: Endofunction[com.pulumi.aws.directoryservice.inputs.GetDirectoryPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.directoryservice.outputs.GetDirectoryResult] =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.GetDirectoryPlainArgs.builder
      com.pulumi.aws.directoryservice.DirectoryserviceFunctions.getDirectoryPlain(args(argsBuilder).build)

  /**
   * Manages a replicated Region and directory for Multi-Region replication.
   *  Multi-Region replication is only supported for the Enterprise Edition of AWS Managed Microsoft AD.
   */
  def ServiceRegion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.ServiceRegionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.directoryservice.ServiceRegionArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.directoryservice.ServiceRegion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Provides a Log subscription for AWS Directory Service that pushes logs to cloudwatch. */
  def LogSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.LogSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directoryservice.LogSubscriptionArgs.builder
    
    com.pulumi.aws.directoryservice.LogSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.directoryservice.SharedDirectoryArgs.Builder)
    /**
     * @param target Identifier for the directory consumer account with whom the directory is to be shared. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.Builder]):
        com.pulumi.aws.directoryservice.SharedDirectoryArgs.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.builder
      builder.target(args(argsBuilder).build)

  /** Manages a directory&#39;s multi-factor authentication (MFA) using a Remote Authentication Dial In User Service (RADIUS) server. */
  def RadiusSettings(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.RadiusSettingsArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directoryservice.RadiusSettingsArgs.builder
    
    com.pulumi.aws.directoryservice.RadiusSettings(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Accepts a shared directory in a consumer account.
   *  
   *  &gt; **NOTE:** Destroying this resource removes the shared directory from the consumer account only.
   */
  def SharedDirectoryAccepter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.SharedDirectoryAccepterArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directoryservice.SharedDirectoryAccepterArgs.builder
    
    com.pulumi.aws.directoryservice.SharedDirectoryAccepter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.DirectoryState.Builder)
    /**
     * @param connectSettings Connector related information about the directory. Fields documented below.
     * @return builder
     */
    def connectSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryConnectSettingsArgs.builder
      builder.connectSettings(args(argsBuilder).build)

    /**
     * @param vpcSettings VPC related information about the directory. Fields documented below.
     * @return builder
     */
    def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.DirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.DirectoryVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.SharedDirectoryState.Builder)
    /**
     * @param target Identifier for the directory consumer account with whom the directory is to be shared. See below.
     *  
     *  The following arguments are optional:
     * @return builder
     */
    def target(args: Endofunction[com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.SharedDirectoryState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs.builder
      builder.target(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.directoryservice.inputs.ServiceRegionState.Builder)
    /**
     * @param vpcSettings VPC information in the replicated Region. Detailed below.
     * @return builder
     */
    def vpcSettings(args: Endofunction[com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.Builder]):
        com.pulumi.aws.directoryservice.inputs.ServiceRegionState.Builder =
      val argsBuilder = com.pulumi.aws.directoryservice.inputs.ServiceRegionVpcSettingsArgs.builder
      builder.vpcSettings(args(argsBuilder).build)

  /**
   * Manages a trust relationship between two Active Directory Directories.
   *  
   *  The directories may either be both AWS Managed Microsoft AD domains or an AWS Managed Microsoft AD domain and a self-managed Active Directory Domain.
   *  
   *  The Trust relationship must be configured on both sides of the relationship.
   *  If a Trust has only been created on one side, it will be in the state `VerifyFailed`.
   *  Once the second Trust is created, the first will update to the correct state.
   */
  def Trust(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.directoryservice.TrustArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.directoryservice.TrustArgs.builder
    
    com.pulumi.aws.directoryservice.Trust(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
