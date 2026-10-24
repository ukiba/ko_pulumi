package jp.ukiba.ko_pulumi
package azure

object orbital_ext:
  extension (builder: com.pulumi.azure.orbital.ContactProfileArgs.Builder)
    /**
     * @param links A list of spacecraft links. A `links` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.Builder]*):
        com.pulumi.azure.orbital.ContactProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.orbital.SpacecraftArgs.Builder)
    /**
     * @param links A `links` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.azure.orbital.inputs.SpacecraftLinkArgs.Builder]*):
        com.pulumi.azure.orbital.SpacecraftArgs.Builder =
      def argsBuilder = com.pulumi.azure.orbital.inputs.SpacecraftLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.Builder)
    /**
     * @param channels A list of contact profile link channels. A `channels` block as defined below.
     * @return builder
     */
    def channels(args: Endofunction[com.pulumi.azure.orbital.inputs.ContactProfileLinkChannelArgs.Builder]*):
        com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.Builder =
      def argsBuilder = com.pulumi.azure.orbital.inputs.ContactProfileLinkChannelArgs.builder
      builder.channels(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.orbital.inputs.ContactProfileLinkChannelArgs.Builder)
    /**
     * @param endPoints Customer End point to store/retrieve data during a contact. An `endPoint` block as defined below.
     * @return builder
     */
    def endPoints(args: Endofunction[com.pulumi.azure.orbital.inputs.ContactProfileLinkChannelEndPointArgs.Builder]*):
        com.pulumi.azure.orbital.inputs.ContactProfileLinkChannelArgs.Builder =
      def argsBuilder = com.pulumi.azure.orbital.inputs.ContactProfileLinkChannelEndPointArgs.builder
      builder.endPoints(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.orbital.inputs.ContactProfileState.Builder)
    /**
     * @param links A list of spacecraft links. A `links` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.Builder]*):
        com.pulumi.azure.orbital.inputs.ContactProfileState.Builder =
      def argsBuilder = com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.orbital.inputs.SpacecraftState.Builder)
    /**
     * @param links A `links` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.azure.orbital.inputs.SpacecraftLinkArgs.Builder]*):
        com.pulumi.azure.orbital.inputs.SpacecraftState.Builder =
      def argsBuilder = com.pulumi.azure.orbital.inputs.SpacecraftLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)
