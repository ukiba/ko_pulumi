package jp.ukiba.ko_pulumi
package azure

object dns_ext:
  extension (builder: com.pulumi.azure.dns.CaaRecordArgs.Builder)
    /**
     * @param records A list of values that make up the CAA record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.CaaRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.MxRecordArgs.Builder)
    /**
     * @param records A list of values that make up the MX record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.MxRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.SrvRecordArgs.Builder)
    /**
     * @param records A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.SrvRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.TxtRecordArgs.Builder)
    /**
     * @param records A list of values that make up the txt record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.TxtRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.ZoneArgs.Builder)
    /**
     * @param soaRecord A `soaRecord` block as defined below.
     * @return builder
     */
    def soaRecord(args: Endofunction[com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.dns.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.dns.inputs.CaaRecordState.Builder)
    /**
     * @param records A list of values that make up the CAA record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.CaaRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.inputs.MxRecordState.Builder)
    /**
     * @param records A list of values that make up the MX record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.MxRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.inputs.SrvRecordState.Builder)
    /**
     * @param records A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.SrvRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.inputs.TxtRecordState.Builder)
    /**
     * @param records A list of values that make up the txt record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.TxtRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.dns.inputs.ZoneState.Builder)
    /**
     * @param soaRecord A `soaRecord` block as defined below.
     * @return builder
     */
    def soaRecord(args: Endofunction[com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.dns.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)
