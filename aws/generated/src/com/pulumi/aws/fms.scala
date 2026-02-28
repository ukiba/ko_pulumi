package jp.ukiba.ko_pulumi
package aws

import scala.language.implicitConversions

import com.pulumi.resources.CustomResourceOptions

object fms:
  extension (builder: com.pulumi.aws.fms.ResourceSetArgs.Builder)
    /**
     * @param resourceSets Details about the resource set to be created or updated. See `resourceSet` Attribute Reference below.
     * @return builder
     */
    def resourceSets(args: Endofunction[com.pulumi.aws.fms.inputs.ResourceSetResourceSetArgs.Builder]*):
        com.pulumi.aws.fms.ResourceSetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.ResourceSetResourceSetArgs.builder
      builder.resourceSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.fms.inputs.ResourceSetTimeoutsArgs.Builder]):
        com.pulumi.aws.fms.ResourceSetArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.ResourceSetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  /** Provides a resource to associate/disassociate an AWS Firewall Manager administrator account. This operation must be performed in the `us-east-1` region. */
  def AdminAccount(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fms.AdminAccountArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.fms.AdminAccountArgs.builder
    
    com.pulumi.aws.fms.AdminAccount(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fms.PolicyArgs.Builder)
    /**
     * @param excludeMap A map of lists of accounts and OU&#39;s to exclude from the policy. See the `excludeMap` block.
     * @return builder
     */
    def excludeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.Builder]):
        com.pulumi.aws.fms.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.builder
      builder.excludeMap(args(argsBuilder).build)

    /**
     * @param includeMap A map of lists of accounts and OU&#39;s to include in the policy. See the `includeMap` block.
     * @return builder
     */
    def includeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.Builder]):
        com.pulumi.aws.fms.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.builder
      builder.includeMap(args(argsBuilder).build)

    /**
     * @param securityServicePolicyData The objects to include in Security Service Policy Data. See the `securityServicePolicyData` block.
     * @return builder
     */
    def securityServicePolicyData(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder]):
        com.pulumi.aws.fms.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.builder
      builder.securityServicePolicyData(args(argsBuilder).build)

  /**
   * Provides a resource to create an AWS Firewall Manager policy. You need to be using AWS organizations and have enabled the Firewall Manager administrator account.
   *  
   *  &gt; **NOTE:** Due to limitations with testing, we provide it as best effort. If you find it useful, and have the ability to help test or notice issues, consider reaching out to us on GitHub.
   */
  def Policy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fms.PolicyArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fms.PolicyArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fms.Policy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder)
    /**
     * @param networkAclCommonPolicy Defines NACL rules across accounts in their AWS Organization. See the `networkAclCommonPolicy` block.
     * @return builder
     */
    def networkAclCommonPolicy(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.builder
      builder.networkAclCommonPolicy(args(argsBuilder).build)

    /**
     * @param networkFirewallPolicy Defines the deployment model to use for the firewall policy.  See the `networkFirewallPolicy` block.
     * @return builder
     */
    def networkFirewallPolicy(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkFirewallPolicyArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkFirewallPolicyArgs.builder
      builder.networkFirewallPolicy(args(argsBuilder).build)

    def thirdPartyFirewallPolicy(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionThirdPartyFirewallPolicyArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionThirdPartyFirewallPolicyArgs.builder
      builder.thirdPartyFirewallPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder)
    /**
     * @param policyOption Contains the Network Firewall firewall policy options to configure a centralized deployment model. See the `policyOption` block.
     * @return builder
     */
    def policyOption(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.builder
      builder.policyOption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder)
    /**
     * @param icmpTypeCodes A configuration block for ICMP protocol: The ICMP type and code. See the `icmpTypeCode` block.
     * @return builder
     */
    def icmpTypeCodes(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryIcmpTypeCodeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryIcmpTypeCodeArgs.builder
      builder.icmpTypeCodes(args.map(_(argsBuilder).build)*)

    /**
     * @param portRanges A configuration block for PortRange. See the `portRange` block.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryPortRangeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.Builder)
    /**
     * @param networkAclEntrySet Defines NACL entries for Network ACL policy. See the `networkAclEntrySet` block.
     * @return builder
     */
    def networkAclEntrySet(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.builder
      builder.networkAclEntrySet(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.ResourceSetState.Builder)
    /**
     * @param resourceSets Details about the resource set to be created or updated. See `resourceSet` Attribute Reference below.
     * @return builder
     */
    def resourceSets(args: Endofunction[com.pulumi.aws.fms.inputs.ResourceSetResourceSetArgs.Builder]*):
        com.pulumi.aws.fms.inputs.ResourceSetState.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.ResourceSetResourceSetArgs.builder
      builder.resourceSets(args.map(_(argsBuilder).build)*)

    def timeouts(args: Endofunction[com.pulumi.aws.fms.inputs.ResourceSetTimeoutsArgs.Builder]):
        com.pulumi.aws.fms.inputs.ResourceSetState.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.ResourceSetTimeoutsArgs.builder
      builder.timeouts(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicyState.Builder)
    /**
     * @param excludeMap A map of lists of accounts and OU&#39;s to exclude from the policy. See the `excludeMap` block.
     * @return builder
     */
    def excludeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.builder
      builder.excludeMap(args(argsBuilder).build)

    /**
     * @param includeMap A map of lists of accounts and OU&#39;s to include in the policy. See the `includeMap` block.
     * @return builder
     */
    def includeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.builder
      builder.includeMap(args(argsBuilder).build)

    /**
     * @param securityServicePolicyData The objects to include in Security Service Policy Data. See the `securityServicePolicyData` block.
     * @return builder
     */
    def securityServicePolicyData(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.builder
      builder.securityServicePolicyData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder)
    /**
     * @param firstEntries The rules that you want to run first in the Firewall Manager managed network ACLs. Firewall manager creates entries with ID value between 1 and 5000. See the `firstEntry` block.
     * @return builder
     */
    def firstEntries(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.builder
      builder.firstEntries(args.map(_(argsBuilder).build)*)

    /**
     * @param lastEntries The rules that you want to run last in the Firewall Manager managed network ACLs. Firewall manager creates entries with ID value between 32000 and 32766. See the `lastEntry` block.
     * @return builder
     */
    def lastEntries(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.builder
      builder.lastEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder)
    /**
     * @param icmpTypeCodes A configuration block for ICMP protocol: The ICMP type and code. See the `icmpTypeCode` block.
     * @return builder
     */
    def icmpTypeCodes(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryIcmpTypeCodeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryIcmpTypeCodeArgs.builder
      builder.icmpTypeCodes(args.map(_(argsBuilder).build)*)

    /**
     * @param portRanges A configuration block for PortRange. See the `portRange` block.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryPortRangeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  /** Resource for managing an AWS FMS (Firewall Manager) Resource Set. */
  def ResourceSet(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.fms.ResourceSetArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.fms.ResourceSetArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.fms.ResourceSet(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)
