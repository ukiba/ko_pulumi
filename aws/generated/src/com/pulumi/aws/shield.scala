package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object shield:
  /**
   * Creates an association between a Route53 Health Check and a Shield Advanced protected resource.
   *  This association uses the health of your applications to improve responsiveness and accuracy in attack detection and mitigation.
   *  
   *  Blog post: [AWS Shield Advanced now supports Health Based Detection](https://aws.amazon.com/about-aws/whats-new/2020/02/aws-shield-advanced-now-supports-health-based-detection/)
   */
  def ProtectionHealthCheckAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.ProtectionHealthCheckAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.shield.ProtectionHealthCheckAssociationArgs.builder
    
    com.pulumi.aws.shield.ProtectionHealthCheckAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.shield.ProactiveEngagementArgs.Builder)
    /**
     * @param emergencyContacts One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergencyContacts`.
     * @return builder
     */
    def emergencyContacts(args: Endofunction[com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.Builder]*):
        com.pulumi.aws.shield.ProactiveEngagementArgs.Builder =
      def argsBuilder = com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.builder
      builder.emergencyContacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  type ShieldFunctions = com.pulumi.aws.shield.ShieldFunctions
  object ShieldFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.shield.ShieldFunctions.*
  extension (self: ShieldFunctions.type)
    /** Data source for managing an AWS Shield Protection. */
    def getProtection(args: Endofunction[com.pulumi.aws.shield.inputs.GetProtectionArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.shield.outputs.GetProtectionResult] =
      val argsBuilder = com.pulumi.aws.shield.inputs.GetProtectionArgs.builder
      com.pulumi.aws.shield.ShieldFunctions.getProtection(args(argsBuilder).build)

    /** Data source for managing an AWS Shield Protection. */
    def getProtectionPlain(args: Endofunction[com.pulumi.aws.shield.inputs.GetProtectionPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.shield.outputs.GetProtectionResult] =
      val argsBuilder = com.pulumi.aws.shield.inputs.GetProtectionPlainArgs.builder
      com.pulumi.aws.shield.ShieldFunctions.getProtectionPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.ApplicationLayerAutomaticResponseArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.ApplicationLayerAutomaticResponseArgs.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Resource for managing an AWS Shield DRT Access Log Bucket Association.
   *  Up to 10 log buckets can be associated for DRT Access sharing with the Shield Response Team (SRT).
   */
  def DrtAccessLogBucketAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs.builder
    
    com.pulumi.aws.shield.DrtAccessLogBucketAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables AWS Shield Advanced for a specific AWS resource.
   *  The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.
   */
  def Protection(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.ProtectionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.shield.ProtectionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.shield.Protection(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing a AWS Shield Proactive Engagement.
   *  Proactive engagement authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT and to initiate proactive customer support.
   */
  def ProactiveEngagement(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.ProactiveEngagementArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.shield.ProactiveEngagementArgs.builder
    
    com.pulumi.aws.shield.ProactiveEngagement(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /**
   * Creates a grouping of protected resources so they can be handled as a collective.
   *  This resource grouping improves the accuracy of detection and reduces false positives. For more information see
   *  [Managing AWS Shield Advanced protection groups](https://docs.aws.amazon.com/waf/latest/developerguide/manage-protection-group.html)
   */
  def ProtectionGroup(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.ProtectionGroupArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.shield.ProtectionGroupArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.shield.ProtectionGroup(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS Shield Application Layer Automatic Response for automatic DDoS mitigation. */
  def ApplicationLayerAutomaticResponse(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.ApplicationLayerAutomaticResponseArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.shield.ApplicationLayerAutomaticResponseArgs.builder
    
    com.pulumi.aws.shield.ApplicationLayerAutomaticResponse(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Resource for managing an AWS Shield Subscription.
   *  
   *  &gt; This resource creates a subscription to AWS Shield Advanced, which requires a 1 year subscription commitment with a monthly fee. Refer to the [AWS Shield Pricing](https://aws.amazon.com/shield/pricing/) page for more details.
   *  
   *  &gt; Destruction of this resource will set `autoRenew` to `DISABLED`. Automatic renewal can only be disabled during the last 30 days of a subscription. To unsubscribe outside of this window, you must contact AWS Support. Set `skipDestroy` to `true` to skip modifying the `autoRenew` argument during destruction.
   */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.SubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.shield.SubscriptionArgs.builder
    
    com.pulumi.aws.shield.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Authorizes the Shield Response Team (SRT) using the specified role, to access your AWS account to assist with DDoS attack mitigation during potential attacks.
   *  For more information see [Configure AWS SRT Support](https://docs.aws.amazon.com/waf/latest/developerguide/authorize-srt.html)
   */
  def DrtAccessRoleArnAssociation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs.builder
    
    com.pulumi.aws.shield.DrtAccessRoleArnAssociation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessRoleArnAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationState.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.shield.inputs.ProactiveEngagementState.Builder)
    /**
     * @param emergencyContacts One or more emergency contacts. You must provide at least one phone number in the emergency contact list. See `emergencyContacts`.
     * @return builder
     */
    def emergencyContacts(args: Endofunction[com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.Builder]*):
        com.pulumi.aws.shield.inputs.ProactiveEngagementState.Builder =
      def argsBuilder = com.pulumi.aws.shield.inputs.ProactiveEngagementEmergencyContactArgs.builder
      builder.emergencyContacts(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseState.Builder)
    def timeouts(args: Endofunction[com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.Builder]):
        com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseState.Builder =
      val argsBuilder = com.pulumi.aws.shield.inputs.ApplicationLayerAutomaticResponseTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)
