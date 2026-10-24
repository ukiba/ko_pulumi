package jp.ukiba.ko_pulumi
package azure

object domainservices_ext:
  extension (builder: com.pulumi.azure.domainservices.ServiceArgs.Builder)
    /**
     * @param initialReplicaSet An `initialReplicaSet` block as defined below. The initial replica set inherits the same location as the Domain Service resource.
     * @return builder
     */
    def initialReplicaSet(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.builder
      builder.initialReplicaSet(args(argsBuilder).build)

    /**
     * @param notifications A `notifications` block as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.builder
      builder.notifications(args(argsBuilder).build)

    /**
     * @param secureLdap A `secureLdap` block as defined below.
     * @return builder
     */
    def secureLdap(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.builder
      builder.secureLdap(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.domainservices.ServiceArgs.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.domainservices.inputs.ServiceState.Builder)
    /**
     * @param initialReplicaSet An `initialReplicaSet` block as defined below. The initial replica set inherits the same location as the Domain Service resource.
     * @return builder
     */
    def initialReplicaSet(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceInitialReplicaSetArgs.builder
      builder.initialReplicaSet(args(argsBuilder).build)

    /**
     * @param notifications A `notifications` block as defined below.
     * @return builder
     */
    def notifications(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceNotificationsArgs.builder
      builder.notifications(args(argsBuilder).build)

    /**
     * @param secureLdap A `secureLdap` block as defined below.
     * @return builder
     */
    def secureLdap(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecureLdapArgs.builder
      builder.secureLdap(args(argsBuilder).build)

    /**
     * @param security A `security` block as defined below.
     * @return builder
     */
    def security(args: Endofunction[com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.Builder]):
        com.pulumi.azure.domainservices.inputs.ServiceState.Builder =
      val argsBuilder = com.pulumi.azure.domainservices.inputs.ServiceSecurityArgs.builder
      builder.security(args(argsBuilder).build)
