package jp.ukiba.ko_pulumi
package azure

object hpc_ext:
  extension (builder: com.pulumi.azure.hpc.CacheAccessPolicyArgs.Builder)
    /**
     * @param accessRules One or more `accessRule` blocks (up to three) as defined below.
     * @return builder
     */
    inline def accessRules(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.Builder]*):
        com.pulumi.azure.hpc.CacheAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.builder
      builder.accessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.CacheArgs.Builder)
    /**
     * @param defaultAccessPolicy A `defaultAccessPolicy` block as defined below.
     * @return builder
     */
    inline def defaultAccessPolicy(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.builder
      builder.defaultAccessPolicy(args(argsBuilder).build)

    /**
     * @param directoryActiveDirectory A `directoryActiveDirectory` block as defined below.
     * @return builder
     */
    inline def directoryActiveDirectory(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.builder
      builder.directoryActiveDirectory(args(argsBuilder).build)

    /**
     * @param directoryFlatFile A `directoryFlatFile` block as defined below.
     * @return builder
     */
    inline def directoryFlatFile(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.builder
      builder.directoryFlatFile(args(argsBuilder).build)

    /**
     * @param directoryLdap A `directoryLdap` block as defined below.
     * 
     * &gt; **Note:** Only one of `directoryActiveDirectory`, `directoryFlatFile` and `directoryLdap` can be set.
     * @return builder
     */
    inline def directoryLdap(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.builder
      builder.directoryLdap(args(argsBuilder).build)

    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    inline def dns(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDnsArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheIdentityArgs.Builder]):
        com.pulumi.azure.hpc.CacheArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hpc.CacheNfsTargetArgs.Builder)
    /**
     * @param namespaceJunctions Can be specified multiple times to define multiple `namespaceJunction`. Each `namespaceJunction` block supports fields documented below.
     * @return builder
     */
    inline def namespaceJunctions(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.Builder]*):
        com.pulumi.azure.hpc.CacheNfsTargetArgs.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.builder
      builder.namespaceJunctions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheAccessPolicyState.Builder)
    /**
     * @param accessRules One or more `accessRule` blocks (up to three) as defined below.
     * @return builder
     */
    inline def accessRules(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.Builder]*):
        com.pulumi.azure.hpc.inputs.CacheAccessPolicyState.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheAccessPolicyAccessRuleArgs.builder
      builder.accessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder)
    /**
     * @param accessRules One or more `accessRule` blocks (up to three) as defined above.
     * @return builder
     */
    inline def accessRules(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyAccessRuleArgs.Builder]*):
        com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyAccessRuleArgs.builder
      builder.accessRules(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder)
    /**
     * @param bind A `bind` block as defined above.
     * @return builder
     */
    inline def bind(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryLdapBindArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryLdapBindArgs.builder
      builder.bind(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheNfsTargetState.Builder)
    /**
     * @param namespaceJunctions Can be specified multiple times to define multiple `namespaceJunction`. Each `namespaceJunction` block supports fields documented below.
     * @return builder
     */
    inline def namespaceJunctions(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.Builder]*):
        com.pulumi.azure.hpc.inputs.CacheNfsTargetState.Builder =
      def argsBuilder = com.pulumi.azure.hpc.inputs.CacheNfsTargetNamespaceJunctionArgs.builder
      builder.namespaceJunctions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.hpc.inputs.CacheState.Builder)
    /**
     * @param defaultAccessPolicy A `defaultAccessPolicy` block as defined below.
     * @return builder
     */
    inline def defaultAccessPolicy(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDefaultAccessPolicyArgs.builder
      builder.defaultAccessPolicy(args(argsBuilder).build)

    /**
     * @param directoryActiveDirectory A `directoryActiveDirectory` block as defined below.
     * @return builder
     */
    inline def directoryActiveDirectory(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryActiveDirectoryArgs.builder
      builder.directoryActiveDirectory(args(argsBuilder).build)

    /**
     * @param directoryFlatFile A `directoryFlatFile` block as defined below.
     * @return builder
     */
    inline def directoryFlatFile(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryFlatFileArgs.builder
      builder.directoryFlatFile(args(argsBuilder).build)

    /**
     * @param directoryLdap A `directoryLdap` block as defined below.
     * 
     * &gt; **Note:** Only one of `directoryActiveDirectory`, `directoryFlatFile` and `directoryLdap` can be set.
     * @return builder
     */
    inline def directoryLdap(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDirectoryLdapArgs.builder
      builder.directoryLdap(args(argsBuilder).build)

    /**
     * @param dns A `dns` block as defined below.
     * @return builder
     */
    inline def dns(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheDnsArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheDnsArgs.builder
      builder.dns(args(argsBuilder).build)

    /**
     * @param identity An `identity` block as defined below. Changing this forces a new resource to be created.
     * @return builder
     */
    inline def identity(args: Endofunction[com.pulumi.azure.hpc.inputs.CacheIdentityArgs.Builder]):
        com.pulumi.azure.hpc.inputs.CacheState.Builder =
      val argsBuilder = com.pulumi.azure.hpc.inputs.CacheIdentityArgs.builder
      builder.identity(args(argsBuilder).build)
