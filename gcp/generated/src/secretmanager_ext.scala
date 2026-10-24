package jp.ukiba.ko_pulumi
package gcp

object secretmanager_ext:
  extension (builder: com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder)
    /**
     * @param customerManagedEncryption The customer-managed encryption configuration of the regional secret.
     * Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a regional secret. At `nextRotationTime`, Secret Manager
     * will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be
     * set to configure rotation.
     * Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane
     * operations are called on the regional secret or its versions.
     * Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.RegionalSecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.RegionalSecretIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.SecretArgs.Builder)
    /**
     * @param replication The replication policy of the secret data attached to the Secret. It cannot be changed
     * after the Secret has been created.
     * Structure is documented below.
     * @return builder
     */
    def replication(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.builder
      builder.replication(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a Secret. At `nextRotationTime`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     * Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.SecretArgs.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.secretmanager.SecretIamBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.SecretIamMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.SecretIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder)
    /**
     * @param customerManagedEncryption The customer-managed encryption configuration of the regional secret.
     * Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a regional secret. At `nextRotationTime`, Secret Manager
     * will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be
     * set to configure rotation.
     * Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane
     * operations are called on the regional secret or its versions.
     * Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretState.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionState.Builder)
    /**
     * @param customerManagedEncryptions The customer-managed encryption configuration of the regional secret.
     * Structure is documented below.
     * @return builder
     */
    def customerManagedEncryptions(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionCustomerManagedEncryptionArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionState.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.RegionalSecretVersionCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryptions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretIamBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretIamMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder)
    /**
     * @param auto The Secret will automatically be replicated without any restrictions.
     * Structure is documented below.
     * @return builder
     */
    def auto(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.builder
      builder.auto(args(argsBuilder).build)

    /**
     * @param userManaged The Secret will be replicated to the regions specified by the user.
     * Structure is documented below.
     * @return builder
     */
    def userManaged(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.builder
      builder.userManaged(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.Builder)
    /**
     * @param customerManagedEncryption The customer-managed encryption configuration of the Secret.
     * If no configuration is provided, Google-managed default
     * encryption is used.
     * Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.Builder)
    /**
     * @param replicas The list of Replicas for this Secret. Cannot be empty.
     * Structure is documented below.
     * @return builder
     */
    def replicas(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.builder
      builder.replicas(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.Builder)
    /**
     * @param customerManagedEncryption Customer Managed Encryption for the secret.
     * Structure is documented below.
     * @return builder
     */
    def customerManagedEncryption(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaCustomerManagedEncryptionArgs.builder
      builder.customerManagedEncryption(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.secretmanager.inputs.SecretState.Builder)
    /**
     * @param replication The replication policy of the secret data attached to the Secret. It cannot be changed
     * after the Secret has been created.
     * Structure is documented below.
     * @return builder
     */
    def replication(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs.builder
      builder.replication(args(argsBuilder).build)

    /**
     * @param rotation The rotation time and period for a Secret. At `nextRotationTime`, Secret Manager will send a Pub/Sub notification to the topics configured on the Secret. `topics` must be set to configure rotation.
     * Structure is documented below.
     * @return builder
     */
    def rotation(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.Builder]):
        com.pulumi.gcp.secretmanager.inputs.SecretState.Builder =
      val argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretRotationArgs.builder
      builder.rotation(args(argsBuilder).build)

    /**
     * @param topics A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * Structure is documented below.
     * @return builder
     */
    def topics(args: Endofunction[com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.Builder]*):
        com.pulumi.gcp.secretmanager.inputs.SecretState.Builder =
      def argsBuilder = com.pulumi.gcp.secretmanager.inputs.SecretTopicArgs.builder
      builder.topics(args.map(_(argsBuilder).build)*)
