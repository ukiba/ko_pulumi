package jp.ukiba.ko_pulumi
package gcp

object pubsub_ext:
  extension (builder: com.pulumi.gcp.pubsub.LiteSubscriptionArgs.Builder)
    /**
     * @param deliveryConfig The settings for this subscription&#39;s message delivery.
     * Structure is documented below.
     * @return builder
     */
    inline def deliveryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.builder
      builder.deliveryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.LiteTopicArgs.Builder)
    /**
     * @param partitionConfig The settings for this topic&#39;s partitions.
     * Structure is documented below.
     * @return builder
     */
    inline def partitionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.builder
      builder.partitionConfig(args(argsBuilder).build)

    /**
     * @param reservationConfig The settings for this topic&#39;s Reservation usage.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.builder
      builder.reservationConfig(args(argsBuilder).build)

    /**
     * @param retentionConfig The settings for a topic&#39;s message retention.
     * Structure is documented below.
     * @return builder
     */
    inline def retentionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.builder
      builder.retentionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.SchemaIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SchemaIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.SchemaIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SchemaIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.SubscriptionArgs.Builder)
    /**
     * @param bigqueryConfig If delivery to BigQuery is used with this subscription, this field is used to configure it.
     * Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     * If all three are empty, then the subscriber will pull and ack messages using API methods.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.builder
      builder.bigqueryConfig(args(argsBuilder).build)

    /**
     * @param cloudStorageConfig If delivery to Cloud Storage is used with this subscription, this field is used to configure it.
     * Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     * If all three are empty, then the subscriber will pull and ack messages using API methods.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudStorageConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.builder
      builder.cloudStorageConfig(args(argsBuilder).build)

    /**
     * @param deadLetterPolicy A policy that specifies the conditions for dead lettering messages in
     * this subscription. If deadLetterPolicy is not set, dead lettering
     * is disabled.
     * The Cloud Pub/Sub service account associated with this subscription&#39;s
     * parent project (i.e.,
     * service-{project_number}{@literal @}gcp-sa-pubsub.iam.gserviceaccount.com) must have
     * permission to Acknowledge() messages on this subscription.
     * Structure is documented below.
     * @return builder
     */
    inline def deadLetterPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.builder
      builder.deadLetterPolicy(args(argsBuilder).build)

    /**
     * @param expirationPolicy A policy that specifies the conditions for this subscription&#39;s expiration.
     * A subscription is considered active as long as any connected subscriber
     * is successfully consuming messages from the subscription or is issuing
     * operations on the subscription. If expirationPolicy is not set, a default
     * policy with ttl of 31 days will be used.  If it is set but ttl is &#34;&#34;, the
     * resource never expires.  The minimum allowed value for expirationPolicy.ttl
     * is 1 day.
     * Structure is documented below.
     * @return builder
     */
    inline def expirationPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.builder
      builder.expirationPolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     * order specified.
     * Structure is documented below.
     * @return builder
     */
    inline def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param pushConfig If push delivery is used with this subscription, this field is used to
     * configure it. An empty pushConfig signifies that the subscriber will
     * pull and ack messages using API methods.
     * Structure is documented below.
     * @return builder
     */
    inline def pushConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.builder
      builder.pushConfig(args(argsBuilder).build)

    /**
     * @param retryPolicy A policy that specifies how Pub/Sub retries message delivery for this subscription.
     * If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     * RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     * Structure is documented below.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.TopicArgs.Builder)
    /**
     * @param ingestionDataSourceSettings Settings for ingestion from a data source into this topic.
     * Structure is documented below.
     * @return builder
     */
    inline def ingestionDataSourceSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.builder
      builder.ingestionDataSourceSettings(args(argsBuilder).build)

    /**
     * @param messageStoragePolicy Policy constraining the set of Google Cloud Platform regions where
     * messages published to the topic may be stored. If not present, then no
     * constraints are in effect.
     * Structure is documented below.
     * @return builder
     */
    inline def messageStoragePolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.builder
      builder.messageStoragePolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     * order specified.
     * Structure is documented below.
     * @return builder
     */
    inline def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaSettings Settings for validating messages published against a schema.
     * Structure is documented below.
     * @return builder
     */
    inline def schemaSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.builder
      builder.schemaSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.TopicIAMBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.TopicIAMMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.LiteSubscriptionState.Builder)
    /**
     * @param deliveryConfig The settings for this subscription&#39;s message delivery.
     * Structure is documented below.
     * @return builder
     */
    inline def deliveryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteSubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.builder
      builder.deliveryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder)
    /**
     * @param capacity The capacity configuration.
     * Structure is documented below.
     * @return builder
     */
    inline def capacity(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigCapacityArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder)
    /**
     * @param partitionConfig The settings for this topic&#39;s partitions.
     * Structure is documented below.
     * @return builder
     */
    inline def partitionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.builder
      builder.partitionConfig(args(argsBuilder).build)

    /**
     * @param reservationConfig The settings for this topic&#39;s Reservation usage.
     * Structure is documented below.
     * @return builder
     */
    inline def reservationConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.builder
      builder.reservationConfig(args(argsBuilder).build)

    /**
     * @param retentionConfig The settings for a topic&#39;s message retention.
     * Structure is documented below.
     * @return builder
     */
    inline def retentionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.builder
      builder.retentionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SchemaIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SchemaIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SchemaIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SchemaIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder)
    /**
     * @param avroConfig If set, message data will be written to Cloud Storage in Avro format.
     * Structure is documented below.
     * @return builder
     */
    inline def avroConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigAvroConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigAvroConfigArgs.builder
      builder.avroConfig(args(argsBuilder).build)

    /**
     * @param textConfig If set, message data will be written to Cloud Storage in text format.
     * Structure is documented below.
     * @return builder
     */
    inline def textConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigTextConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigTextConfigArgs.builder
      builder.textConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.Builder)
    /**
     * @param unstructuredInference Configuration for making inferences using arbitrary JSON payloads.
     * Structure is documented below.
     * @return builder
     */
    inline def unstructuredInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceUnstructuredInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceUnstructuredInferenceArgs.builder
      builder.unstructuredInference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder)
    /**
     * @param aiInference AI Inference. Specifies the Vertex AI endpoint that inference
     * requests built from the Pub/Sub message data and provided parameters will
     * be sent to.
     * Structure is documented below.
     * @return builder
     */
    inline def aiInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.builder
      builder.aiInference(args(argsBuilder).build)

    /**
     * @param javascriptUdf Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
     * each one must have a unique `functionName`.
     * Structure is documented below.
     * @return builder
     */
    inline def javascriptUdf(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformJavascriptUdfArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformJavascriptUdfArgs.builder
      builder.javascriptUdf(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder)
    /**
     * @param noWrapper When set, the payload to the push endpoint is not wrapped.Sets the
     * `data` field as the HTTP body for delivery.
     * Structure is documented below.
     * @return builder
     */
    inline def noWrapper(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigNoWrapperArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigNoWrapperArgs.builder
      builder.noWrapper(args(argsBuilder).build)

    /**
     * @param oidcToken If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * @return builder
     */
    inline def oidcToken(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder)
    /**
     * @param bigqueryConfig If delivery to BigQuery is used with this subscription, this field is used to configure it.
     * Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     * If all three are empty, then the subscriber will pull and ack messages using API methods.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.builder
      builder.bigqueryConfig(args(argsBuilder).build)

    /**
     * @param cloudStorageConfig If delivery to Cloud Storage is used with this subscription, this field is used to configure it.
     * Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     * If all three are empty, then the subscriber will pull and ack messages using API methods.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudStorageConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.builder
      builder.cloudStorageConfig(args(argsBuilder).build)

    /**
     * @param deadLetterPolicy A policy that specifies the conditions for dead lettering messages in
     * this subscription. If deadLetterPolicy is not set, dead lettering
     * is disabled.
     * The Cloud Pub/Sub service account associated with this subscription&#39;s
     * parent project (i.e.,
     * service-{project_number}{@literal @}gcp-sa-pubsub.iam.gserviceaccount.com) must have
     * permission to Acknowledge() messages on this subscription.
     * Structure is documented below.
     * @return builder
     */
    inline def deadLetterPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.builder
      builder.deadLetterPolicy(args(argsBuilder).build)

    /**
     * @param expirationPolicy A policy that specifies the conditions for this subscription&#39;s expiration.
     * A subscription is considered active as long as any connected subscriber
     * is successfully consuming messages from the subscription or is issuing
     * operations on the subscription. If expirationPolicy is not set, a default
     * policy with ttl of 31 days will be used.  If it is set but ttl is &#34;&#34;, the
     * resource never expires.  The minimum allowed value for expirationPolicy.ttl
     * is 1 day.
     * Structure is documented below.
     * @return builder
     */
    inline def expirationPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.builder
      builder.expirationPolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     * order specified.
     * Structure is documented below.
     * @return builder
     */
    inline def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param pushConfig If push delivery is used with this subscription, this field is used to
     * configure it. An empty pushConfig signifies that the subscriber will
     * pull and ack messages using API methods.
     * Structure is documented below.
     * @return builder
     */
    inline def pushConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.builder
      builder.pushConfig(args(argsBuilder).build)

    /**
     * @param retryPolicy A policy that specifies how Pub/Sub retries message delivery for this subscription.
     * If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     * RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     * Structure is documented below.
     * @return builder
     */
    inline def retryPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIAMBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIAMMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder)
    /**
     * @param awsKinesis Settings for ingestion from Amazon Kinesis Data Streams.
     * Structure is documented below.
     * @return builder
     */
    inline def awsKinesis(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsKinesisArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsKinesisArgs.builder
      builder.awsKinesis(args(argsBuilder).build)

    /**
     * @param awsMsk Settings for ingestion from Amazon Managed Streaming for Apache Kafka.
     * Structure is documented below.
     * @return builder
     */
    inline def awsMsk(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsMskArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsMskArgs.builder
      builder.awsMsk(args(argsBuilder).build)

    /**
     * @param azureEventHubs Settings for ingestion from Azure Event Hubs.
     * Structure is documented below.
     * @return builder
     */
    inline def azureEventHubs(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAzureEventHubsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAzureEventHubsArgs.builder
      builder.azureEventHubs(args(argsBuilder).build)

    /**
     * @param cloudStorage Settings for ingestion from Cloud Storage.
     * Structure is documented below.
     * @return builder
     */
    inline def cloudStorage(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.builder
      builder.cloudStorage(args(argsBuilder).build)

    /**
     * @param confluentCloud Settings for ingestion from Confluent Cloud.
     * Structure is documented below.
     * @return builder
     */
    inline def confluentCloud(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsConfluentCloudArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsConfluentCloudArgs.builder
      builder.confluentCloud(args(argsBuilder).build)

    /**
     * @param platformLogsSettings Settings for Platform Logs regarding ingestion to Pub/Sub. If unset,
     * no Platform Logs will be generated.&#39;
     * Structure is documented below.
     * @return builder
     */
    inline def platformLogsSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsPlatformLogsSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsPlatformLogsSettingsArgs.builder
      builder.platformLogsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder)
    /**
     * @param avroFormat Configuration for reading Cloud Storage data in Avro binary format. The
     * bytes of each object will be set to the `data` field of a Pub/Sub message.
     * @return builder
     */
    inline def avroFormat(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageAvroFormatArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageAvroFormatArgs.builder
      builder.avroFormat(args(argsBuilder).build)

    /**
     * @param pubsubAvroFormat Configuration for reading Cloud Storage data written via Cloud Storage
     * subscriptions(See https://cloud.google.com/pubsub/docs/cloudstorage). The
     * data and attributes fields of the originally exported Pub/Sub message
     * will be restored when publishing.
     * @return builder
     */
    inline def pubsubAvroFormat(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStoragePubsubAvroFormatArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStoragePubsubAvroFormatArgs.builder
      builder.pubsubAvroFormat(args(argsBuilder).build)

    /**
     * @param textFormat Configuration for reading Cloud Storage data in text format. Each line of
     * text as specified by the delimiter will be set to the `data` field of a
     * Pub/Sub message.
     * Structure is documented below.
     * @return builder
     */
    inline def textFormat(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageTextFormatArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageTextFormatArgs.builder
      builder.textFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.Builder)
    /**
     * @param unstructuredInference Configuration for making inferences using arbitrary JSON payloads.
     * Structure is documented below.
     * @return builder
     */
    inline def unstructuredInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceUnstructuredInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceUnstructuredInferenceArgs.builder
      builder.unstructuredInference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder)
    /**
     * @param aiInference AI Inference. Specifies the Vertex AI endpoint that inference
     * requests built from the Pub/Sub message data and provided parameters will
     * be sent to.
     * Structure is documented below.
     * @return builder
     */
    inline def aiInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.builder
      builder.aiInference(args(argsBuilder).build)

    /**
     * @param javascriptUdf Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
     * each one must have a unique `functionName`.
     * Structure is documented below.
     * @return builder
     */
    inline def javascriptUdf(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformJavascriptUdfArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformJavascriptUdfArgs.builder
      builder.javascriptUdf(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicState.Builder)
    /**
     * @param ingestionDataSourceSettings Settings for ingestion from a data source into this topic.
     * Structure is documented below.
     * @return builder
     */
    inline def ingestionDataSourceSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.builder
      builder.ingestionDataSourceSettings(args(argsBuilder).build)

    /**
     * @param messageStoragePolicy Policy constraining the set of Google Cloud Platform regions where
     * messages published to the topic may be stored. If not present, then no
     * constraints are in effect.
     * Structure is documented below.
     * @return builder
     */
    inline def messageStoragePolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.builder
      builder.messageStoragePolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     * order specified.
     * Structure is documented below.
     * @return builder
     */
    inline def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaSettings Settings for validating messages published against a schema.
     * Structure is documented below.
     * @return builder
     */
    inline def schemaSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.builder
      builder.schemaSettings(args(argsBuilder).build)
