package jp.ukiba.ko_pulumi
package aws

object fms_ext:
  extension (builder: com.pulumi.aws.fms.PolicyArgs.Builder)
    /**
     * @param excludeMap Map of lists of accounts and OUs to exclude from the policy. See the `excludeMap` block.
     * @return builder
     */
    def excludeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.Builder]):
        com.pulumi.aws.fms.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.builder
      builder.excludeMap(args(argsBuilder).build)

    /**
     * @param includeMap Map of lists of accounts and OUs to include in the policy. See the `includeMap` block.
     * @return builder
     */
    def includeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.Builder]):
        com.pulumi.aws.fms.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.builder
      builder.includeMap(args(argsBuilder).build)

    /**
     * @param securityServicePolicyData Objects to include in Security Service Policy Data. See the `securityServicePolicyData` block.
     * @return builder
     */
    def securityServicePolicyData(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder]):
        com.pulumi.aws.fms.PolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.builder
      builder.securityServicePolicyData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.ResourceSetArgs.Builder)
    /**
     * @param resourceSets Details about the resource set to be created or updated. See `resourceSet` Block below.
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

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder)
    /**
     * @param policyOption Network Firewall firewall policy options to configure a centralized deployment model. See the `policyOption` block.
     * @return builder
     */
    def policyOption(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.builder
      builder.policyOption(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder)
    /**
     * @param networkAclCommonPolicy Network ACL rules applied across accounts in the AWS Organization. See the `networkAclCommonPolicy` block.
     * @return builder
     */
    def networkAclCommonPolicy(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.builder
      builder.networkAclCommonPolicy(args(argsBuilder).build)

    /**
     * @param networkFirewallPolicy Network Firewall policy options that configure a centralized deployment model. See the `networkFirewallPolicy` block.
     * @return builder
     */
    def networkFirewallPolicy(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkFirewallPolicyArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkFirewallPolicyArgs.builder
      builder.networkFirewallPolicy(args(argsBuilder).build)

    /**
     * @param thirdPartyFirewallPolicy Third-party firewall policy options. See the `thirdPartyFirewallPolicy` block.
     * @return builder
     */
    def thirdPartyFirewallPolicy(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionThirdPartyFirewallPolicyArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionThirdPartyFirewallPolicyArgs.builder
      builder.thirdPartyFirewallPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.Builder)
    /**
     * @param networkAclEntrySet Network ACL entries for the Network ACL policy. See the `networkAclEntrySet` block.
     * @return builder
     */
    def networkAclEntrySet(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyArgs.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.builder
      builder.networkAclEntrySet(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder)
    /**
     * @param firstEntries Rules to run first in the Firewall Manager managed network ACLs. Firewall Manager creates entries with ID value between 1 and 5000. See the `firstEntry` block.
     * @return builder
     */
    def firstEntries(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.builder
      builder.firstEntries(args.map(_(argsBuilder).build)*)

    /**
     * @param lastEntries Rules to run last in the Firewall Manager managed network ACLs. Firewall Manager creates entries with ID value between 32000 and 32766. See the `lastEntry` block.
     * @return builder
     */
    def lastEntries(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.builder
      builder.lastEntries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder)
    /**
     * @param icmpTypeCodes ICMP protocol configuration specifying the ICMP type and code. See the `icmpTypeCode` block.
     * @return builder
     */
    def icmpTypeCodes(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryIcmpTypeCodeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryIcmpTypeCodeArgs.builder
      builder.icmpTypeCodes(args.map(_(argsBuilder).build)*)

    /**
     * @param portRanges Port range configuration for the rule. See the `portRange` block.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryPortRangeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetFirstEntryPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder)
    /**
     * @param icmpTypeCodes ICMP protocol configuration specifying the ICMP type and code. See the `icmpTypeCode` block.
     * @return builder
     */
    def icmpTypeCodes(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryIcmpTypeCodeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryIcmpTypeCodeArgs.builder
      builder.icmpTypeCodes(args.map(_(argsBuilder).build)*)

    /**
     * @param portRanges Port range configuration for the rule. See the `portRange` block.
     * @return builder
     */
    def portRanges(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryPortRangeArgs.Builder]*):
        com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryArgs.Builder =
      def argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataPolicyOptionNetworkAclCommonPolicyNetworkAclEntrySetLastEntryPortRangeArgs.builder
      builder.portRanges(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.fms.inputs.PolicyState.Builder)
    /**
     * @param excludeMap Map of lists of accounts and OUs to exclude from the policy. See the `excludeMap` block.
     * @return builder
     */
    def excludeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyExcludeMapArgs.builder
      builder.excludeMap(args(argsBuilder).build)

    /**
     * @param includeMap Map of lists of accounts and OUs to include in the policy. See the `includeMap` block.
     * @return builder
     */
    def includeMap(args: Endofunction[com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicyIncludeMapArgs.builder
      builder.includeMap(args(argsBuilder).build)

    /**
     * @param securityServicePolicyData Objects to include in Security Service Policy Data. See the `securityServicePolicyData` block.
     * @return builder
     */
    def securityServicePolicyData(args: Endofunction[com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.Builder]):
        com.pulumi.aws.fms.inputs.PolicyState.Builder =
      val argsBuilder = com.pulumi.aws.fms.inputs.PolicySecurityServicePolicyDataArgs.builder
      builder.securityServicePolicyData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.fms.inputs.ResourceSetState.Builder)
    /**
     * @param resourceSets Details about the resource set to be created or updated. See `resourceSet` Block below.
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
