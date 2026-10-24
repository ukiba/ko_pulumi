package jp.ukiba.ko_pulumi
package azure

object communication_ext:
  extension (builder: com.pulumi.azure.communication.inputs.EmailServiceDomainState.Builder)
    /**
     * @param verificationRecords (Optional) An `verificationRecords` block as defined below.
     * @return builder
     */
    def verificationRecords(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainState.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.builder
      builder.verificationRecords(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder)
    /**
     * @param dkim2s (Optional) An `dkim2` block as defined below.
     * @return builder
     */
    def dkim2s(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkim2Args.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkim2Args.builder
      builder.dkim2s(args.map(_(argsBuilder).build)*)

    /**
     * @param dkims (Optional) An `dkim` block as defined below.
     * @return builder
     */
    def dkims(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkimArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDkimArgs.builder
      builder.dkims(args.map(_(argsBuilder).build)*)

    /**
     * @param dmarcs (Optional) An `dmarc` block as defined below.
     * @return builder
     */
    def dmarcs(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDmarcArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDmarcArgs.builder
      builder.dmarcs(args.map(_(argsBuilder).build)*)

    /**
     * @param domains (Optional) An `domain` block as defined below.
     * @return builder
     */
    def domains(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDomainArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordDomainArgs.builder
      builder.domains(args.map(_(argsBuilder).build)*)

    /**
     * @param spfs (Optional) An `spf` block as defined below.
     * @return builder
     */
    def spfs(args: Endofunction[com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordSpfArgs.Builder]*):
        com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.communication.inputs.EmailServiceDomainVerificationRecordSpfArgs.builder
      builder.spfs(args.map(_(argsBuilder).build)*)
