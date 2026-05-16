package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object pubsub:
  extension (builder: com.pulumi.gcp.pubsub.SubscriptionArgs.Builder)
    /**
     * @param bigqueryConfig If delivery to BigQuery is used with this subscription, this field is used to configure it.
     *  Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     *  If all three are empty, then the subscriber will pull and ack messages using API methods.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.builder
      builder.bigqueryConfig(args(argsBuilder).build)

    /**
     * @param cloudStorageConfig If delivery to Cloud Storage is used with this subscription, this field is used to configure it.
     *  Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     *  If all three are empty, then the subscriber will pull and ack messages using API methods.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.builder
      builder.cloudStorageConfig(args(argsBuilder).build)

    /**
     * @param deadLetterPolicy A policy that specifies the conditions for dead lettering messages in
     *  this subscription. If deadLetterPolicy is not set, dead lettering
     *  is disabled.
     *  The Cloud Pub/Sub service account associated with this subscription&#39;s
     *  parent project (i.e.,
     *  service-{project_number}{@literal @}gcp-sa-pubsub.iam.gserviceaccount.com) must have
     *  permission to Acknowledge() messages on this subscription.
     *  Structure is documented below.
     * @return builder
     */
    def deadLetterPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.builder
      builder.deadLetterPolicy(args(argsBuilder).build)

    /**
     * @param expirationPolicy A policy that specifies the conditions for this subscription&#39;s expiration.
     *  A subscription is considered active as long as any connected subscriber
     *  is successfully consuming messages from the subscription or is issuing
     *  operations on the subscription. If expirationPolicy is not set, a default
     *  policy with ttl of 31 days will be used.  If it is set but ttl is &#34;&#34;, the
     *  resource never expires.  The minimum allowed value for expirationPolicy.ttl
     *  is 1 day.
     *  Structure is documented below.
     * @return builder
     */
    def expirationPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.builder
      builder.expirationPolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     *  order specified.
     *  Structure is documented below.
     * @return builder
     */
    def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param pushConfig If push delivery is used with this subscription, this field is used to
     *  configure it. An empty pushConfig signifies that the subscriber will
     *  pull and ack messages using API methods.
     *  Structure is documented below.
     * @return builder
     */
    def pushConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.builder
      builder.pushConfig(args(argsBuilder).build)

    /**
     * @param retryPolicy A policy that specifies how Pub/Sub retries message delivery for this subscription.
     *  If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     *  RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.pubsub.SubscriptionArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * &gt; **Warning:** [Pubsub Lite is deprecated and will be turned down effective March 18, 2026](https://cloud.google.com/pubsub/lite/docs/release-notes#June_17_2024). The resource will be removed in a future major release, please use `googlePubsubReservation` instead.
   * 
   *  A named resource representing a shared pool of capacity.
   * 
   *  To get more information about Reservation, see:
   * 
   *  * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.reservations)
   *  * How-to Guides
   *      * [Managing Reservations](https://cloud.google.com/pubsub/lite/docs/reservations)
   */
  def LiteReservation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.LiteReservationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.pubsub.LiteReservationArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.pubsub.LiteReservation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for pubsub subscription. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SubscriptionIAMPolicy`: Authoritative. Sets the IAM policy for the subscription and replaces any existing policy already attached.
   *  * `gcp.pubsub.SubscriptionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the subscription are preserved.
   *  * `gcp.pubsub.SubscriptionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the subscription are preserved.
   * 
   *  &gt; **Note:** `gcp.pubsub.SubscriptionIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.SubscriptionIAMBinding` and `gcp.pubsub.SubscriptionIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SubscriptionIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.SubscriptionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SubscriptionIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMPolicy;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new SubscriptionIAMPolicy("editor", SubscriptionIAMPolicyArgs.builder()
   *              .subscription("your-subscription-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBinding;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMBinding("editor", SubscriptionIAMBindingArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMember;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMMember("editor", SubscriptionIAMMemberArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBinding;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMBinding("editor", SubscriptionIAMBindingArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMember;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMMember("editor", SubscriptionIAMMemberArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SubscriptionIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs.builder
    com.pulumi.gcp.pubsub.SubscriptionIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for pubsub subscription. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SubscriptionIAMPolicy`: Authoritative. Sets the IAM policy for the subscription and replaces any existing policy already attached.
   *  * `gcp.pubsub.SubscriptionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the subscription are preserved.
   *  * `gcp.pubsub.SubscriptionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the subscription are preserved.
   * 
   *  &gt; **Note:** `gcp.pubsub.SubscriptionIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.SubscriptionIAMBinding` and `gcp.pubsub.SubscriptionIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SubscriptionIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.SubscriptionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SubscriptionIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMPolicy;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new SubscriptionIAMPolicy("editor", SubscriptionIAMPolicyArgs.builder()
   *              .subscription("your-subscription-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBinding;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMBinding("editor", SubscriptionIAMBindingArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMember;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMMember("editor", SubscriptionIAMMemberArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBinding;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMBinding("editor", SubscriptionIAMBindingArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMember;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMMember("editor", SubscriptionIAMMemberArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SubscriptionIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs.builder
    com.pulumi.gcp.pubsub.SubscriptionIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * &gt; **Warning:** [Pubsub Lite is deprecated and will be turned down effective March 18, 2026](https://cloud.google.com/pubsub/lite/docs/release-notes#June_17_2024). The resource will be removed in a future major release, please use `gcp.pubsub.Topic` instead.
   * 
   *  A named resource to which messages are sent by publishers.
   * 
   *  To get more information about Topic, see:
   * 
   *  * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.topics)
   *  * How-to Guides
   *      * [Managing Topics](https://cloud.google.com/pubsub/lite/docs/topics)
   */
  def LiteTopic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.LiteTopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.pubsub.LiteTopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.pubsub.LiteTopic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.pubsub.LiteTopicArgs.Builder)
    /**
     * @param partitionConfig The settings for this topic&#39;s partitions.
     *  Structure is documented below.
     * @return builder
     */
    def partitionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.builder
      builder.partitionConfig(args(argsBuilder).build)

    /**
     * @param reservationConfig The settings for this topic&#39;s Reservation usage.
     *  Structure is documented below.
     * @return builder
     */
    def reservationConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.builder
      builder.reservationConfig(args(argsBuilder).build)

    /**
     * @param retentionConfig The settings for a topic&#39;s message retention.
     *  Structure is documented below.
     * @return builder
     */
    def retentionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteTopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.builder
      builder.retentionConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
   *  * `gcp.pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
   *  * `gcp.pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `gcp.pubsub.SchemaIamBinding` and `gcp.pubsub.SchemaIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamBinding` resources **can be** used in conjunction with `gcp.pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SchemaIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicy;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SchemaIamPolicy("policy", SchemaIamPolicyArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamBinding;
   *  import com.pulumi.gcp.pubsub.SchemaIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SchemaIamBinding("binding", SchemaIamBindingArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamMember;
   *  import com.pulumi.gcp.pubsub.SchemaIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SchemaIamMember("member", SchemaIamMemberArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud Pub/Sub Schema
   * 
   *  Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
   *  * `gcp.pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
   *  * `gcp.pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `gcp.pubsub.SchemaIamBinding` and `gcp.pubsub.SchemaIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamBinding` resources **can be** used in conjunction with `gcp.pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SchemaIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicy;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SchemaIamPolicy("policy", SchemaIamPolicyArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamBinding;
   *  import com.pulumi.gcp.pubsub.SchemaIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SchemaIamBinding("binding", SchemaIamBindingArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamMember;
   *  import com.pulumi.gcp.pubsub.SchemaIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SchemaIamMember("member", SchemaIamMemberArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/schemas/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Pub/Sub schema IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_schema_iam_member.editor &#34;projects/{{project}}/schemas/{{schema}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_schema_iam_binding.editor &#34;projects/{{project}}/schemas/{{schema}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:pubsub/schemaIamMember:SchemaIamMember editor projects/{{project}}/schemas/{{schema}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SchemaIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SchemaIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.SchemaIamMemberArgs.builder
    com.pulumi.gcp.pubsub.SchemaIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A schema is a format that messages must follow,
   *  creating a contract between publisher and subscriber that Pub/Sub will enforce.
   * 
   *  To get more information about Schema, see:
   * 
   *  * [API documentation](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.schemas)
   *  * How-to Guides
   *      * [Creating and managing schemas](https://cloud.google.com/pubsub/docs/schemas)
   */
  def Schema(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SchemaArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.pubsub.SchemaArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.pubsub.Schema(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for pubsub subscription. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SubscriptionIAMPolicy`: Authoritative. Sets the IAM policy for the subscription and replaces any existing policy already attached.
   *  * `gcp.pubsub.SubscriptionIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the subscription are preserved.
   *  * `gcp.pubsub.SubscriptionIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the subscription are preserved.
   * 
   *  &gt; **Note:** `gcp.pubsub.SubscriptionIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.SubscriptionIAMBinding` and `gcp.pubsub.SubscriptionIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SubscriptionIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.SubscriptionIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SubscriptionIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMPolicy;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/editor")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var editor = new SubscriptionIAMPolicy("editor", SubscriptionIAMPolicyArgs.builder()
   *              .subscription("your-subscription-name")
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBinding;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMBinding("editor", SubscriptionIAMBindingArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMember;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMMember("editor", SubscriptionIAMMemberArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBinding;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMBinding("editor", SubscriptionIAMBindingArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SubscriptionIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMember;
   *  import com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var editor = new SubscriptionIAMMember("editor", SubscriptionIAMMemberArgs.builder()
   *              .subscription("your-subscription-name")
   *              .role("roles/editor")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SubscriptionIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SubscriptionIAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.SubscriptionIAMPolicyArgs.builder
    com.pulumi.gcp.pubsub.SubscriptionIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
   *  * `gcp.pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
   *  * `gcp.pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `gcp.pubsub.SchemaIamBinding` and `gcp.pubsub.SchemaIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamBinding` resources **can be** used in conjunction with `gcp.pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SchemaIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicy;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SchemaIamPolicy("policy", SchemaIamPolicyArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamBinding;
   *  import com.pulumi.gcp.pubsub.SchemaIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SchemaIamBinding("binding", SchemaIamBindingArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamMember;
   *  import com.pulumi.gcp.pubsub.SchemaIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SchemaIamMember("member", SchemaIamMemberArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud Pub/Sub Schema
   * 
   *  Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
   *  * `gcp.pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
   *  * `gcp.pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `gcp.pubsub.SchemaIamBinding` and `gcp.pubsub.SchemaIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamBinding` resources **can be** used in conjunction with `gcp.pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SchemaIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicy;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SchemaIamPolicy("policy", SchemaIamPolicyArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamBinding;
   *  import com.pulumi.gcp.pubsub.SchemaIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SchemaIamBinding("binding", SchemaIamBindingArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamMember;
   *  import com.pulumi.gcp.pubsub.SchemaIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SchemaIamMember("member", SchemaIamMemberArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/schemas/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Pub/Sub schema IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_schema_iam_member.editor &#34;projects/{{project}}/schemas/{{schema}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_schema_iam_binding.editor &#34;projects/{{project}}/schemas/{{schema}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:pubsub/schemaIamPolicy:SchemaIamPolicy editor projects/{{project}}/schemas/{{schema}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SchemaIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SchemaIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.SchemaIamPolicyArgs.builder
    com.pulumi.gcp.pubsub.SchemaIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.pubsub.TopicIAMBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
   *  * `gcp.pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
   *  * `gcp.pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `gcp.pubsub.SchemaIamBinding` and `gcp.pubsub.SchemaIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamBinding` resources **can be** used in conjunction with `gcp.pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SchemaIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicy;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SchemaIamPolicy("policy", SchemaIamPolicyArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamBinding;
   *  import com.pulumi.gcp.pubsub.SchemaIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SchemaIamBinding("binding", SchemaIamBindingArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamMember;
   *  import com.pulumi.gcp.pubsub.SchemaIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SchemaIamMember("member", SchemaIamMemberArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud Pub/Sub Schema
   * 
   *  Three different resources help you manage your IAM policy for Cloud Pub/Sub Schema. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Authoritative. Sets the IAM policy for the schema and replaces any existing policy already attached.
   *  * `gcp.pubsub.SchemaIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the schema are preserved.
   *  * `gcp.pubsub.SchemaIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the schema are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.SchemaIamPolicy`: Retrieves the IAM policy for the schema
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamPolicy` **cannot** be used in conjunction with `gcp.pubsub.SchemaIamBinding` and `gcp.pubsub.SchemaIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.SchemaIamBinding` resources **can be** used in conjunction with `gcp.pubsub.SchemaIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.SchemaIamPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicy;
   *  import com.pulumi.gcp.pubsub.SchemaIamPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new SchemaIamPolicy("policy", SchemaIamPolicyArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamBinding;
   *  import com.pulumi.gcp.pubsub.SchemaIamBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new SchemaIamBinding("binding", SchemaIamBindingArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.SchemaIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.SchemaIamMember;
   *  import com.pulumi.gcp.pubsub.SchemaIamMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new SchemaIamMember("member", SchemaIamMemberArgs.builder()
   *              .project(example.project())
   *              .schema(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/schemas/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Pub/Sub schema IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_schema_iam_member.editor &#34;projects/{{project}}/schemas/{{schema}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_schema_iam_binding.editor &#34;projects/{{project}}/schemas/{{schema}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:pubsub/schemaIamBinding:SchemaIamBinding editor projects/{{project}}/schemas/{{schema}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def SchemaIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SchemaIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.SchemaIamBindingArgs.builder
    com.pulumi.gcp.pubsub.SchemaIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.pubsub.SchemaIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SchemaIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * &gt; **Warning:** [Pubsub Lite is deprecated and will be turned down effective March 18, 2026](https://cloud.google.com/pubsub/lite/docs/release-notes#June_17_2024). The resource will be removed in a future major release, please use `gcp.pubsub.Subscription` instead.
   * 
   *  A named resource representing the stream of messages from a single,
   *  specific topic, to be delivered to the subscribing application.
   * 
   *  To get more information about Subscription, see:
   * 
   *  * [API documentation](https://cloud.google.com/pubsub/lite/docs/reference/rest/v1/admin.projects.locations.subscriptions)
   *  * How-to Guides
   *      * [Managing Subscriptions](https://cloud.google.com/pubsub/lite/docs/subscriptions)
   */
  def LiteSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.LiteSubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.pubsub.LiteSubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.gcp.pubsub.LiteSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.pubsub.SchemaIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SchemaIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Pub/Sub Topic. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
   *  * `gcp.pubsub.TopicIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
   *  * `gcp.pubsub.TopicIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Retrieves the IAM policy for the topic
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.TopicIAMBinding` and `gcp.pubsub.TopicIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.TopicIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.TopicIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicy;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new TopicIAMPolicy("policy", TopicIAMPolicyArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMBinding;
   *  import com.pulumi.gcp.pubsub.TopicIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TopicIAMBinding("binding", TopicIAMBindingArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMMember;
   *  import com.pulumi.gcp.pubsub.TopicIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TopicIAMMember("member", TopicIAMMemberArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud Pub/Sub Topic
   * 
   *  Three different resources help you manage your IAM policy for Cloud Pub/Sub Topic. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
   *  * `gcp.pubsub.TopicIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
   *  * `gcp.pubsub.TopicIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Retrieves the IAM policy for the topic
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.TopicIAMBinding` and `gcp.pubsub.TopicIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.TopicIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.TopicIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicy;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new TopicIAMPolicy("policy", TopicIAMPolicyArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMBinding;
   *  import com.pulumi.gcp.pubsub.TopicIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TopicIAMBinding("binding", TopicIAMBindingArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMMember;
   *  import com.pulumi.gcp.pubsub.TopicIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TopicIAMMember("member", TopicIAMMemberArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/topics/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Pub/Sub topic IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_topic_iam_member.editor &#34;projects/{{project}}/topics/{{topic}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_topic_iam_binding.editor &#34;projects/{{project}}/topics/{{topic}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:pubsub/topicIAMMember:TopicIAMMember editor projects/{{project}}/topics/{{topic}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TopicIAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.TopicIAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.TopicIAMMemberArgs.builder
    com.pulumi.gcp.pubsub.TopicIAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Pub/Sub Topic. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
   *  * `gcp.pubsub.TopicIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
   *  * `gcp.pubsub.TopicIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Retrieves the IAM policy for the topic
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.TopicIAMBinding` and `gcp.pubsub.TopicIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.TopicIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.TopicIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicy;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new TopicIAMPolicy("policy", TopicIAMPolicyArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMBinding;
   *  import com.pulumi.gcp.pubsub.TopicIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TopicIAMBinding("binding", TopicIAMBindingArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMMember;
   *  import com.pulumi.gcp.pubsub.TopicIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TopicIAMMember("member", TopicIAMMemberArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud Pub/Sub Topic
   * 
   *  Three different resources help you manage your IAM policy for Cloud Pub/Sub Topic. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
   *  * `gcp.pubsub.TopicIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
   *  * `gcp.pubsub.TopicIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Retrieves the IAM policy for the topic
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.TopicIAMBinding` and `gcp.pubsub.TopicIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.TopicIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.TopicIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicy;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new TopicIAMPolicy("policy", TopicIAMPolicyArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMBinding;
   *  import com.pulumi.gcp.pubsub.TopicIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TopicIAMBinding("binding", TopicIAMBindingArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMMember;
   *  import com.pulumi.gcp.pubsub.TopicIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TopicIAMMember("member", TopicIAMMemberArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/topics/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Pub/Sub topic IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_topic_iam_member.editor &#34;projects/{{project}}/topics/{{topic}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_topic_iam_binding.editor &#34;projects/{{project}}/topics/{{topic}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:pubsub/topicIAMBinding:TopicIAMBinding editor projects/{{project}}/topics/{{topic}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TopicIAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.TopicIAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.TopicIAMBindingArgs.builder
    com.pulumi.gcp.pubsub.TopicIAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.pubsub.TopicIAMMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionIAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A named resource to which messages are sent by publishers.
   * 
   *  To get more information about Topic, see:
   * 
   *  * [API documentation](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.topics)
   *  * How-to Guides
   *      * [Managing Topics](https://cloud.google.com/pubsub/docs/admin#managing_topics)
   * 
   *  &gt; **Note:** You can retrieve the email of the Google Managed Pub/Sub Service Account used for forwarding
   *  by using the `gcp.projects.ServiceIdentity` resource.
   */
  def Topic(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.TopicArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.pubsub.TopicArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.pubsub.Topic(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object PubsubFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Retrieves the current IAM policy data for schema */
    inline def getSchemaIamPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetSchemaIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.pubsub.outputs.GetSchemaIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetSchemaIamPolicyArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getSchemaIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for schema */
    inline def getSchemaIamPolicyPlain(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetSchemaIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.pubsub.outputs.GetSchemaIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetSchemaIamPolicyPlainArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getSchemaIamPolicyPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Pub/Sub Subscription. For more information see
     *  the [official documentation](https://cloud.google.com/pubsub/docs/)
     *  and [API](https://cloud.google.com/pubsub/docs/apis).
     */
    inline def getSubscription(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetSubscriptionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.pubsub.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetSubscriptionArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getSubscription(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Pub/Sub Subscription. For more information see
     *  the [official documentation](https://cloud.google.com/pubsub/docs/)
     *  and [API](https://cloud.google.com/pubsub/docs/apis).
     */
    inline def getSubscriptionPlain(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetSubscriptionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.pubsub.outputs.GetSubscriptionResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetSubscriptionPlainArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getSubscriptionPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Pubsub subscription.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.pubsub.PubsubFunctions;
     *  import com.pulumi.gcp.pubsub.inputs.GetSubscriptionIamPolicyArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var policy = PubsubFunctions.getSubscriptionIamPolicy(GetSubscriptionIamPolicyArgs.builder()
     *              .subscription(subscription.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getSubscriptionIamPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetSubscriptionIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.pubsub.outputs.GetSubscriptionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetSubscriptionIamPolicyArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getSubscriptionIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a Pubsub subscription.
     * 
     *  ## example
     * 
     *  <pre>
     *  {@code
     *  package generated_program;
     * 
     *  import com.pulumi.Context;
     *  import com.pulumi.Pulumi;
     *  import com.pulumi.core.Output;
     *  import com.pulumi.gcp.pubsub.PubsubFunctions;
     *  import com.pulumi.gcp.pubsub.inputs.GetSubscriptionIamPolicyArgs;
     *  import java.util.List;
     *  import java.util.ArrayList;
     *  import java.util.Map;
     *  import java.io.File;
     *  import java.nio.file.Files;
     *  import java.nio.file.Paths;
     * 
     *  public class App {
     *      public static void main(String[] args) {
     *          Pulumi.run(App::stack);
     *      }
     * 
     *      public static void stack(Context ctx) {
     *          final var policy = PubsubFunctions.getSubscriptionIamPolicy(GetSubscriptionIamPolicyArgs.builder()
     *              .subscription(subscription.id())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getSubscriptionIamPolicyPlain(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetSubscriptionIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.pubsub.outputs.GetSubscriptionIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetSubscriptionIamPolicyPlainArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getSubscriptionIamPolicyPlain(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Pub/Sub Topic. For more information see
     *  the [official documentation](https://cloud.google.com/pubsub/docs/)
     *  and [API](https://cloud.google.com/pubsub/docs/apis).
     */
    inline def getTopic(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetTopicArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.pubsub.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetTopicArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getTopic(args(argsBuilder).build)

    /**
     * Get information about a Google Cloud Pub/Sub Topic. For more information see
     *  the [official documentation](https://cloud.google.com/pubsub/docs/)
     *  and [API](https://cloud.google.com/pubsub/docs/apis).
     */
    inline def getTopicPlain(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetTopicPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.pubsub.outputs.GetTopicResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetTopicPlainArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getTopicPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for topic */
    inline def getTopicIamPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetTopicIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.pubsub.outputs.GetTopicIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetTopicIamPolicyArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getTopicIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for topic */
    inline def getTopicIamPolicyPlain(args: Endofunction[com.pulumi.gcp.pubsub.inputs.GetTopicIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.pubsub.outputs.GetTopicIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.GetTopicIamPolicyPlainArgs.builder
      com.pulumi.gcp.pubsub.PubsubFunctions.getTopicIamPolicyPlain(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for Cloud Pub/Sub Topic. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
   *  * `gcp.pubsub.TopicIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
   *  * `gcp.pubsub.TopicIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Retrieves the IAM policy for the topic
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.TopicIAMBinding` and `gcp.pubsub.TopicIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.TopicIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.TopicIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicy;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new TopicIAMPolicy("policy", TopicIAMPolicyArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMBinding;
   *  import com.pulumi.gcp.pubsub.TopicIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TopicIAMBinding("binding", TopicIAMBindingArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMMember;
   *  import com.pulumi.gcp.pubsub.TopicIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TopicIAMMember("member", TopicIAMMemberArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## This resource supports User Project Overrides.
   * 
   *  -
   * 
   *  # IAM policy for Cloud Pub/Sub Topic
   * 
   *  Three different resources help you manage your IAM policy for Cloud Pub/Sub Topic. Each of these resources serves a different use case:
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Authoritative. Sets the IAM policy for the topic and replaces any existing policy already attached.
   *  * `gcp.pubsub.TopicIAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the topic are preserved.
   *  * `gcp.pubsub.TopicIAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the topic are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.pubsub.TopicIAMPolicy`: Retrieves the IAM policy for the topic
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMPolicy` **cannot** be used in conjunction with `gcp.pubsub.TopicIAMBinding` and `gcp.pubsub.TopicIAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.pubsub.TopicIAMBinding` resources **can be** used in conjunction with `gcp.pubsub.TopicIAMMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.pubsub.TopicIAMPolicy
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.organizations.OrganizationsFunctions;
   *  import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicy;
   *  import com.pulumi.gcp.pubsub.TopicIAMPolicyArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
   *              .bindings(GetIAMPolicyBindingArgs.builder()
   *                  .role("roles/viewer")
   *                  .members("user:jane}{@literal @}{@code example.com")
   *                  .build())
   *              .build());
   * 
   *          var policy = new TopicIAMPolicy("policy", TopicIAMPolicyArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMBinding;
   *  import com.pulumi.gcp.pubsub.TopicIAMBindingArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var binding = new TopicIAMBinding("binding", TopicIAMBindingArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.pubsub.TopicIAMMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.pubsub.TopicIAMMember;
   *  import com.pulumi.gcp.pubsub.TopicIAMMemberArgs;
   *  import java.util.List;
   *  import java.util.ArrayList;
   *  import java.util.Map;
   *  import java.io.File;
   *  import java.nio.file.Files;
   *  import java.nio.file.Paths;
   * 
   *  public class App }{{@code
   *      public static void main(String[] args) }{{@code
   *          Pulumi.run(App::stack);
   *      }}{@code
   * 
   *      public static void stack(Context ctx) }{{@code
   *          var member = new TopicIAMMember("member", TopicIAMMemberArgs.builder()
   *              .project(example.project())
   *              .topic(example.name())
   *              .role("roles/viewer")
   *              .member("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## Import
   * 
   *  For all import syntaxes, the &#34;resource in question&#34; can take any of the following forms:
   * 
   *  * projects/{{project}}/topics/{{name}}
   *  * {{project}}/{{name}}
   *  * {{name}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  Cloud Pub/Sub topic IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_topic_iam_member.editor &#34;projects/{{project}}/topics/{{topic}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_pubsub_topic_iam_binding.editor &#34;projects/{{project}}/topics/{{topic}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:pubsub/topicIAMPolicy:TopicIAMPolicy editor projects/{{project}}/topics/{{topic}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def TopicIAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.TopicIAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.pubsub.TopicIAMPolicyArgs.builder
    com.pulumi.gcp.pubsub.TopicIAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.pubsub.TopicArgs.Builder)
    /**
     * @param ingestionDataSourceSettings Settings for ingestion from a data source into this topic.
     *  Structure is documented below.
     * @return builder
     */
    def ingestionDataSourceSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.builder
      builder.ingestionDataSourceSettings(args(argsBuilder).build)

    /**
     * @param messageStoragePolicy Policy constraining the set of Google Cloud Platform regions where
     *  messages published to the topic may be stored. If not present, then no
     *  constraints are in effect.
     *  Structure is documented below.
     * @return builder
     */
    def messageStoragePolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.builder
      builder.messageStoragePolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     *  order specified.
     *  Structure is documented below.
     * @return builder
     */
    def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaSettings Settings for validating messages published against a schema.
     *  Structure is documented below.
     * @return builder
     */
    def schemaSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.builder
      builder.schemaSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.pubsub.TopicArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.SubscriptionIAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * A named resource representing the stream of messages from a single,
   *  specific topic, to be delivered to the subscribing application.
   * 
   *  To get more information about Subscription, see:
   * 
   *  * [API documentation](https://cloud.google.com/pubsub/docs/reference/rest/v1/projects.subscriptions)
   *  * How-to Guides
   *      * [Managing Subscriptions](https://cloud.google.com/pubsub/docs/admin#managing_subscriptions)
   * 
   *  &gt; **Note:** You can retrieve the email of the Google Managed Pub/Sub Service Account used for forwarding
   *  by using the `gcp.projects.ServiceIdentity` resource.
   */
  def Subscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.pubsub.SubscriptionArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.gcp.pubsub.SubscriptionArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.gcp.pubsub.Subscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder)
    /**
     * @param aiInference AI Inference. Specifies the Vertex AI endpoint that inference
     *  requests built from the Pub/Sub message data and provided parameters will
     *  be sent to.
     *  Structure is documented below.
     * @return builder
     */
    def aiInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.builder
      builder.aiInference(args(argsBuilder).build)

    /**
     * @param javascriptUdf Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
     *  each one must have a unique `functionName`.
     *  Structure is documented below.
     * @return builder
     */
    def javascriptUdf(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformJavascriptUdfArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformJavascriptUdfArgs.builder
      builder.javascriptUdf(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder)
    /**
     * @param partitionConfig The settings for this topic&#39;s partitions.
     *  Structure is documented below.
     * @return builder
     */
    def partitionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.builder
      builder.partitionConfig(args(argsBuilder).build)

    /**
     * @param reservationConfig The settings for this topic&#39;s Reservation usage.
     *  Structure is documented below.
     * @return builder
     */
    def reservationConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigArgs.builder
      builder.reservationConfig(args(argsBuilder).build)

    /**
     * @param retentionConfig The settings for a topic&#39;s message retention.
     *  Structure is documented below.
     * @return builder
     */
    def retentionConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigArgs.builder
      builder.retentionConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder)
    /**
     * @param avroFormat Configuration for reading Cloud Storage data in Avro binary format. The
     *  bytes of each object will be set to the `data` field of a Pub/Sub message.
     * @return builder
     */
    def avroFormat(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageAvroFormatArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageAvroFormatArgs.builder
      builder.avroFormat(args(argsBuilder).build)

    /**
     * @param pubsubAvroFormat Configuration for reading Cloud Storage data written via Cloud Storage
     *  subscriptions(See https://cloud.google.com/pubsub/docs/cloudstorage). The
     *  data and attributes fields of the originally exported Pub/Sub message
     *  will be restored when publishing.
     * @return builder
     */
    def pubsubAvroFormat(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStoragePubsubAvroFormatArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStoragePubsubAvroFormatArgs.builder
      builder.pubsubAvroFormat(args(argsBuilder).build)

    /**
     * @param textFormat Configuration for reading Cloud Storage data in text format. Each line of
     *  text as specified by the delimiter will be set to the `data` field of a
     *  Pub/Sub message.
     *  Structure is documented below.
     * @return builder
     */
    def textFormat(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageTextFormatArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageTextFormatArgs.builder
      builder.textFormat(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.LiteSubscriptionState.Builder)
    /**
     * @param deliveryConfig The settings for this subscription&#39;s message delivery.
     *  Structure is documented below.
     * @return builder
     */
    def deliveryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteSubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.builder
      builder.deliveryConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder)
    /**
     * @param bigqueryConfig If delivery to BigQuery is used with this subscription, this field is used to configure it.
     *  Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     *  If all three are empty, then the subscriber will pull and ack messages using API methods.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionBigqueryConfigArgs.builder
      builder.bigqueryConfig(args(argsBuilder).build)

    /**
     * @param cloudStorageConfig If delivery to Cloud Storage is used with this subscription, this field is used to configure it.
     *  Either pushConfig, bigQueryConfig or cloudStorageConfig can be set, but not combined.
     *  If all three are empty, then the subscriber will pull and ack messages using API methods.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorageConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.builder
      builder.cloudStorageConfig(args(argsBuilder).build)

    /**
     * @param deadLetterPolicy A policy that specifies the conditions for dead lettering messages in
     *  this subscription. If deadLetterPolicy is not set, dead lettering
     *  is disabled.
     *  The Cloud Pub/Sub service account associated with this subscription&#39;s
     *  parent project (i.e.,
     *  service-{project_number}{@literal @}gcp-sa-pubsub.iam.gserviceaccount.com) must have
     *  permission to Acknowledge() messages on this subscription.
     *  Structure is documented below.
     * @return builder
     */
    def deadLetterPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionDeadLetterPolicyArgs.builder
      builder.deadLetterPolicy(args(argsBuilder).build)

    /**
     * @param expirationPolicy A policy that specifies the conditions for this subscription&#39;s expiration.
     *  A subscription is considered active as long as any connected subscriber
     *  is successfully consuming messages from the subscription or is issuing
     *  operations on the subscription. If expirationPolicy is not set, a default
     *  policy with ttl of 31 days will be used.  If it is set but ttl is &#34;&#34;, the
     *  resource never expires.  The minimum allowed value for expirationPolicy.ttl
     *  is 1 day.
     *  Structure is documented below.
     * @return builder
     */
    def expirationPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionExpirationPolicyArgs.builder
      builder.expirationPolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     *  order specified.
     *  Structure is documented below.
     * @return builder
     */
    def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param pushConfig If push delivery is used with this subscription, this field is used to
     *  configure it. An empty pushConfig signifies that the subscriber will
     *  pull and ack messages using API methods.
     *  Structure is documented below.
     * @return builder
     */
    def pushConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.builder
      builder.pushConfig(args(argsBuilder).build)

    /**
     * @param retryPolicy A policy that specifies how Pub/Sub retries message delivery for this subscription.
     *  If not set, the default retry policy is applied. This generally implies that messages will be retried as soon as possible for healthy subscribers.
     *  RetryPolicy will be triggered on NACKs or acknowledgement deadline exceeded events for a given message
     *  Structure is documented below.
     * @return builder
     */
    def retryPolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionRetryPolicyArgs.builder
      builder.retryPolicy(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIAMBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.Builder)
    /**
     * @param unstructuredInference Configuration for making inferences using arbitrary JSON payloads.
     *  Structure is documented below.
     * @return builder
     */
    def unstructuredInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceUnstructuredInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionMessageTransformAiInferenceUnstructuredInferenceArgs.builder
      builder.unstructuredInference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder)
    /**
     * @param awsKinesis Settings for ingestion from Amazon Kinesis Data Streams.
     *  Structure is documented below.
     * @return builder
     */
    def awsKinesis(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsKinesisArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsKinesisArgs.builder
      builder.awsKinesis(args(argsBuilder).build)

    /**
     * @param awsMsk Settings for ingestion from Amazon Managed Streaming for Apache Kafka.
     *  Structure is documented below.
     * @return builder
     */
    def awsMsk(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsMskArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAwsMskArgs.builder
      builder.awsMsk(args(argsBuilder).build)

    /**
     * @param azureEventHubs Settings for ingestion from Azure Event Hubs.
     *  Structure is documented below.
     * @return builder
     */
    def azureEventHubs(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAzureEventHubsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsAzureEventHubsArgs.builder
      builder.azureEventHubs(args(argsBuilder).build)

    /**
     * @param cloudStorage Settings for ingestion from Cloud Storage.
     *  Structure is documented below.
     * @return builder
     */
    def cloudStorage(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsCloudStorageArgs.builder
      builder.cloudStorage(args(argsBuilder).build)

    /**
     * @param confluentCloud Settings for ingestion from Confluent Cloud.
     *  Structure is documented below.
     * @return builder
     */
    def confluentCloud(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsConfluentCloudArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsConfluentCloudArgs.builder
      builder.confluentCloud(args(argsBuilder).build)

    /**
     * @param platformLogsSettings Settings for Platform Logs regarding ingestion to Pub/Sub. If unset,
     *  no Platform Logs will be generated.&#39;
     *  Structure is documented below.
     * @return builder
     */
    def platformLogsSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsPlatformLogsSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsPlatformLogsSettingsArgs.builder
      builder.platformLogsSettings(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder)
    /**
     * @param noWrapper When set, the payload to the push endpoint is not wrapped.Sets the
     *  `data` field as the HTTP body for delivery.
     *  Structure is documented below.
     * @return builder
     */
    def noWrapper(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigNoWrapperArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigNoWrapperArgs.builder
      builder.noWrapper(args(argsBuilder).build)

    /**
     * @param oidcToken If specified, Pub/Sub will generate and attach an OIDC JWT token as
     *  an Authorization header in the HTTP request for every pushed message.
     *  Structure is documented below.
     * @return builder
     */
    def oidcToken(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenArgs.builder
      builder.oidcToken(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SchemaIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SchemaIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicState.Builder)
    /**
     * @param ingestionDataSourceSettings Settings for ingestion from a data source into this topic.
     *  Structure is documented below.
     * @return builder
     */
    def ingestionDataSourceSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIngestionDataSourceSettingsArgs.builder
      builder.ingestionDataSourceSettings(args(argsBuilder).build)

    /**
     * @param messageStoragePolicy Policy constraining the set of Google Cloud Platform regions where
     *  messages published to the topic may be stored. If not present, then no
     *  constraints are in effect.
     *  Structure is documented below.
     * @return builder
     */
    def messageStoragePolicy(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageStoragePolicyArgs.builder
      builder.messageStoragePolicy(args(argsBuilder).build)

    /**
     * @param messageTransforms Transforms to be applied to messages published to the topic. Transforms are applied in the
     *  order specified.
     *  Structure is documented below.
     * @return builder
     */
    def messageTransforms(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder]*):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      def argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.builder
      builder.messageTransforms(args.map(_(argsBuilder).build)*)

    /**
     * @param schemaSettings Settings for validating messages published against a schema.
     *  Structure is documented below.
     * @return builder
     */
    def schemaSettings(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicSchemaSettingsArgs.builder
      builder.schemaSettings(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.gcp.pubsub.inputs.TopicState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionIAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicIAMMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicIAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicIAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder)
    /**
     * @param avroConfig If set, message data will be written to Cloud Storage in Avro format.
     *  Structure is documented below.
     * @return builder
     */
    def avroConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigAvroConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigAvroConfigArgs.builder
      builder.avroConfig(args(argsBuilder).build)

    /**
     * @param textConfig If set, message data will be written to Cloud Storage in text format.
     *  Structure is documented below.
     * @return builder
     */
    def textConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigTextConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SubscriptionCloudStorageConfigTextConfigArgs.builder
      builder.textConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.Builder)
    /**
     * @param unstructuredInference Configuration for making inferences using arbitrary JSON payloads.
     *  Structure is documented below.
     * @return builder
     */
    def unstructuredInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceUnstructuredInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceUnstructuredInferenceArgs.builder
      builder.unstructuredInference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder)
    /**
     * @param capacity The capacity configuration.
     *  Structure is documented below.
     * @return builder
     */
    def capacity(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigCapacityArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigCapacityArgs.builder
      builder.capacity(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder)
    /**
     * @param aiInference AI Inference. Specifies the Vertex AI endpoint that inference
     *  requests built from the Pub/Sub message data and provided parameters will
     *  be sent to.
     *  Structure is documented below.
     * @return builder
     */
    def aiInference(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformAiInferenceArgs.builder
      builder.aiInference(args(argsBuilder).build)

    /**
     * @param javascriptUdf Javascript User Defined Function. If multiple Javascript UDFs are specified on a resource,
     *  each one must have a unique `functionName`.
     *  Structure is documented below.
     * @return builder
     */
    def javascriptUdf(args: Endofunction[com.pulumi.gcp.pubsub.inputs.TopicMessageTransformJavascriptUdfArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.TopicMessageTransformArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.TopicMessageTransformJavascriptUdfArgs.builder
      builder.javascriptUdf(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.inputs.SchemaIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.pubsub.inputs.SchemaIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.SchemaIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.pubsub.LiteSubscriptionArgs.Builder)
    /**
     * @param deliveryConfig The settings for this subscription&#39;s message delivery.
     *  Structure is documented below.
     * @return builder
     */
    def deliveryConfig(args: Endofunction[com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.Builder]):
        com.pulumi.gcp.pubsub.LiteSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.pubsub.inputs.LiteSubscriptionDeliveryConfigArgs.builder
      builder.deliveryConfig(args(argsBuilder).build)
