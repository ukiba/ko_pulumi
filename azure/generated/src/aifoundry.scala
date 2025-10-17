package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object aifoundry:
  /**
   * Manages a Microsoft Foundry Hub (classic) resource.
   * 
   * &gt; **Note:** Hub\u2011based projects are considered legacy and are not compatible with the new Foundry experience. Microsoft recommends using the new Microsoft Foundry resource, which should be provisioned using
   * `azure.cognitive.Account`.
   */
  def Hub(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.aifoundry.HubArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.aifoundry.HubArgs.builder
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
    com.pulumi.azure.aifoundry.Hub(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.aifoundry.HubArgs.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new AI Foundry Hub to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.Builder]):
        com.pulumi.azure.aifoundry.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedNetwork A `managedNetwork` block as defined below.
     * @return builder
     */
    def managedNetwork(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.Builder]):
        com.pulumi.azure.aifoundry.HubArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.builder
      builder.managedNetwork(args(argsBuilder).build)

  /**
   * Manages a Microsoft Foundry Hub (classic) Project resource.
   * 
   * &gt; **Note:** Hub\u2011based projects are considered legacy and are not compatible with the new Foundry experience. Microsoft recommends using the new Microsoft Foundry project resource, which should be provisioned using
   * `azure.cognitive.Account` and `azure.cognitive.AccountProject`.
   */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.aifoundry.ProjectArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.aifoundry.ProjectArgs.builder
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
    com.pulumi.azure.aifoundry.Project(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.azure.aifoundry.ProjectArgs.Builder)
    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.ProjectArgs.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.aifoundry.inputs.HubState.Builder)
    /**
     * @param encryption An `encryption` block as defined below. Changing this forces a new AI Foundry Hub to be created.
     * @return builder
     */
    def encryption(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubEncryptionArgs.builder
      builder.encryption(args(argsBuilder).build)

    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

    /**
     * @param managedNetwork A `managedNetwork` block as defined below.
     * @return builder
     */
    def managedNetwork(args: Endofunction[com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.HubState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.HubManagedNetworkArgs.builder
      builder.managedNetwork(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.aifoundry.inputs.ProjectState.Builder)
    /**
     * @param identity A `identity` block as defined below.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.Builder]):
        com.pulumi.azure.aifoundry.inputs.ProjectState.Builder =
      val argsBuilder = com.pulumi.azure.aifoundry.inputs.ProjectIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
