package jp.ukiba.ko_pulumi
package aws

object organizations_ext:
  extension (builder: com.pulumi.aws.organizations.inputs.OrganizationRootArgs.Builder)
    /**
     * @param policyTypes List of policy types enabled for this root. All elements have these attributes:
     * @return builder
     */
    def policyTypes(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationRootPolicyTypeArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationRootArgs.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationRootPolicyTypeArgs.builder
      builder.policyTypes(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.organizations.inputs.OrganizationState.Builder)
    /**
     * @param accounts List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
     * @return builder
     */
    def accounts(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationAccountArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationAccountArgs.builder
      builder.accounts(args.map(_(argsBuilder).build)*)

    /**
     * @param nonMasterAccounts List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
     * @return builder
     */
    def nonMasterAccounts(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationNonMasterAccountArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationNonMasterAccountArgs.builder
      builder.nonMasterAccounts(args.map(_(argsBuilder).build)*)

    /**
     * @param roots List of organization roots. All elements have these attributes:
     * @return builder
     */
    def roots(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationRootArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationRootArgs.builder
      builder.roots(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.organizations.inputs.OrganizationalUnitState.Builder)
    /**
     * @param accounts List of child accounts for this Organizational Unit. Does not return account information for child Organizational Units. All elements have these attributes:
     * @return builder
     */
    def accounts(args: Endofunction[com.pulumi.aws.organizations.inputs.OrganizationalUnitAccountArgs.Builder]*):
        com.pulumi.aws.organizations.inputs.OrganizationalUnitState.Builder =
      def argsBuilder = com.pulumi.aws.organizations.inputs.OrganizationalUnitAccountArgs.builder
      builder.accounts(args.map(_(argsBuilder).build)*)
