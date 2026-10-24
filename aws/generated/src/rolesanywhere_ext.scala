package jp.ukiba.ko_pulumi
package aws

object rolesanywhere_ext:
  extension (builder: com.pulumi.aws.rolesanywhere.TrustAnchorArgs.Builder)
    def notificationSettings(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.Builder]*):
        com.pulumi.aws.rolesanywhere.TrustAnchorArgs.Builder =
      def argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.builder
      builder.notificationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param source The source of trust, documented below
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder]):
        com.pulumi.aws.rolesanywhere.TrustAnchorArgs.Builder =
      val argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.builder
      builder.source(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder)
    /**
     * @param sourceData The data denoting the source of trust, documented below
     * @return builder
     */
    def sourceData(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceSourceDataArgs.Builder]):
        com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder =
      val argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceSourceDataArgs.builder
      builder.sourceData(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.rolesanywhere.inputs.TrustAnchorState.Builder)
    def notificationSettings(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.Builder]*):
        com.pulumi.aws.rolesanywhere.inputs.TrustAnchorState.Builder =
      def argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorNotificationSettingArgs.builder
      builder.notificationSettings(args.map(_(argsBuilder).build)*)

    /**
     * @param source The source of trust, documented below
     * @return builder
     */
    def source(args: Endofunction[com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.Builder]):
        com.pulumi.aws.rolesanywhere.inputs.TrustAnchorState.Builder =
      val argsBuilder = com.pulumi.aws.rolesanywhere.inputs.TrustAnchorSourceArgs.builder
      builder.source(args(argsBuilder).build)
