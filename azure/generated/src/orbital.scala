package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object orbital:
  /**
   * Manages an orbital contact.
   * 
   * &gt; **Note:** The `azure.orbital.Contact` resource has been deprecated and will be removed in v5.0 of the AzureRM Provider.
   */
  def Contact(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.orbital.ContactArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.orbital.ContactArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.orbital.Contact(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /**
   * Manages a Contact profile.
   * 
   * &gt; **Note:** The `azure.orbital.ContactProfile` resource has been deprecated and will be removed in v5.0 of the AzureRM Provider.
   */
  def ContactProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.orbital.ContactProfileArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.orbital.ContactProfileArgs.builder
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
    com.pulumi.azure.orbital.ContactProfile(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.orbital.ContactProfileArgs.Builder)
    /**
     * @param links A list of spacecraft links. A `links` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    def links(args: Endofunction[com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.Builder]*):
        com.pulumi.azure.orbital.ContactProfileArgs.Builder =
      def argsBuilder = com.pulumi.azure.orbital.inputs.ContactProfileLinkArgs.builder
      builder.links(args.map(_(argsBuilder).build)*)

  /**
   * Manages a Spacecraft.
   * 
   * &gt; **Note:** The `azure.orbital.Spacecraft` resource has been deprecated and will be removed in v5.0 of the AzureRM Provider.
   */
  def Spacecraft(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.orbital.SpacecraftArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.orbital.SpacecraftArgs.builder
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
    com.pulumi.azure.orbital.Spacecraft(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

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
