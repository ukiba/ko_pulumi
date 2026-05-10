package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object bigqueryanalyticshub:
  type BigqueryanalyticshubFunctions = com.pulumi.gcp.bigqueryanalyticshub.BigqueryanalyticshubFunctions
  object BigqueryanalyticshubFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.gcp.bigqueryanalyticshub.BigqueryanalyticshubFunctions.*
  extension (self: BigqueryanalyticshubFunctions.type)
    /** Retrieves the current IAM policy data for dataexchange */
    def getDataExchangeIamPolicy(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.GetDataExchangeIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigqueryanalyticshub.outputs.GetDataExchangeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.GetDataExchangeIamPolicyArgs.builder
      com.pulumi.gcp.bigqueryanalyticshub.BigqueryanalyticshubFunctions.getDataExchangeIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for dataexchange */
    def getDataExchangeIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.GetDataExchangeIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigqueryanalyticshub.outputs.GetDataExchangeIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.GetDataExchangeIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigqueryanalyticshub.BigqueryanalyticshubFunctions.getDataExchangeIamPolicyPlain(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for listing */
    def getListingIamPolicy(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.GetListingIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.bigqueryanalyticshub.outputs.GetListingIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.GetListingIamPolicyArgs.builder
      com.pulumi.gcp.bigqueryanalyticshub.BigqueryanalyticshubFunctions.getListingIamPolicy(args(argsBuilder).build)

    /** Retrieves the current IAM policy data for listing */
    def getListingIamPolicyPlain(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.GetListingIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.bigqueryanalyticshub.outputs.GetListingIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.GetListingIamPolicyPlainArgs.builder
      com.pulumi.gcp.bigqueryanalyticshub.BigqueryanalyticshubFunctions.getListingIamPolicyPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder)
    /**
     * @param bigqueryDataset Shared dataset i.e. BigQuery dataset source.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.builder
      builder.bigqueryDataset(args(argsBuilder).build)

    /**
     * @param dataProvider Details of the data provider who owns the source data.
     *  Structure is documented below.
     * @return builder
     */
    def dataProvider(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.builder
      builder.dataProvider(args(argsBuilder).build)

    /**
     * @param publisher Details of the publisher who owns the listing and who can share the source data.
     *  Structure is documented below.
     * @return builder
     */
    def publisher(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.builder
      builder.publisher(args(argsBuilder).build)

    /**
     * @param pubsubTopic Pub/Sub topic source.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubTopic(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.builder
      builder.pubsubTopic(args(argsBuilder).build)

    /**
     * @param restrictedExportConfig If set, restricted export configuration will be propagated and enforced on the linked dataset.
     *  Structure is documented below.
     * @return builder
     */
    def restrictedExportConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.builder
      builder.restrictedExportConfig(args(argsBuilder).build)

  /**
   * A Bigquery Analytics Hub data exchange listing
   * 
   *  To get more information about Listing, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/analytics-hub/rest/v1/projects.locations.dataExchanges.listings)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/bigquery/docs/analytics-hub-introduction)
   */
  def Listing(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.ListingArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.Listing(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamBinding` and `gcp.bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs;
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
   *          var policy = new DataExchangeIamPolicy("policy", DataExchangeIamPolicyArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs;
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
   *          var binding = new DataExchangeIamBinding("binding", DataExchangeIamBindingArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs;
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
   *          var member = new DataExchangeIamMember("member", DataExchangeIamMemberArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
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
   *  # IAM policy for BigQuery Analytics Hub DataExchange
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamBinding` and `gcp.bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs;
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
   *          var policy = new DataExchangeIamPolicy("policy", DataExchangeIamPolicyArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs;
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
   *          var binding = new DataExchangeIamBinding("binding", DataExchangeIamBindingArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs;
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
   *          var member = new DataExchangeIamMember("member", DataExchangeIamMemberArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
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
   *  * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
   *  * {{project}}/{{location}}/{{data_exchange_id}}
   *  * {{location}}/{{data_exchange_id}}
   *  * {{data_exchange_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Analytics Hub dataexchange IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_data_exchange_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_data_exchange_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigqueryanalyticshub/dataExchangeIamPolicy:DataExchangeIamPolicy editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataExchangeIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Bigquery Analytics Hub Data Exchange subscription
   * 
   *  &gt; **Warning:** This resource is in beta, and should be used with the terraform-provider-google-beta provider.
   *  See Provider Versions for more details on beta resources.
   * 
   *  To get more information about DataExchangeSubscription, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/analytics-hub/rest/v1/projects.locations.subscriptions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/bigquery/docs/analytics-hub-introduction)
   * 
   *  &gt; **Note:** When importing the resource with `pulumi import`, provide the destination/subscriber&#39;s project and location
   *  in the format projects/{{subscriber_project}}/locations/{{subscriber_location}}/subscriptions/{{subscription_id}}
   */
  def DataExchangeSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.DataExchangeSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.DataExchangeSubscriptionArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.DataExchangeSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
   *  * `gcp.bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.ListingIamBinding` and `gcp.bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs;
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
   *          var policy = new ListingIamPolicy("policy", ListingIamPolicyArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs;
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
   *          var binding = new ListingIamBinding("binding", ListingIamBindingArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs;
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
   *          var member = new ListingIamMember("member", ListingIamMemberArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
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
   *  # IAM policy for BigQuery Analytics Hub Listing
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
   *  * `gcp.bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.ListingIamBinding` and `gcp.bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs;
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
   *          var policy = new ListingIamPolicy("policy", ListingIamPolicyArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs;
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
   *          var binding = new ListingIamBinding("binding", ListingIamBindingArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs;
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
   *          var member = new ListingIamMember("member", ListingIamMemberArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
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
   *  * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
   *  * {{project}}/{{location}}/{{data_exchange_id}}/{{listing_id}}
   *  * {{location}}/{{data_exchange_id}}/{{listing_id}}
   *  * {{listing_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Analytics Hub listing IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_listing_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_listing_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigqueryanalyticshub/listingIamPolicy:ListingIamPolicy editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ListingIamPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.ListingSubscriptionArgs.Builder)
    /**
     * @param destinationDataset The destination dataset for this subscription.
     *  Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.ListingSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

  /**
   * A Bigquery Analytics Hub listing subscription
   * 
   *  To get more information about ListingSubscription, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/analytics-hub/rest/v1/projects.locations.subscriptions)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/bigquery/docs/analytics-hub-introduction)
   * 
   *  &gt; **Note:** When importing the resource with `pulumi import`, provide the destination project and location
   *  in the format projects/{{destination_project}}/locations/{{destination_location}}/subscriptions/{{subscription_id}}
   */
  def ListingSubscription(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.ListingSubscriptionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.ListingSubscriptionArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.ListingSubscription(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs.Builder)
    /**
     * @param sharingEnvironmentConfig Configurable data sharing environment option for a data exchange.
     *  This field is required for data clean room exchanges.
     *  Structure is documented below.
     * @return builder
     */
    def sharingEnvironmentConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.builder
      builder.sharingEnvironmentConfig(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamBinding` and `gcp.bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs;
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
   *          var policy = new DataExchangeIamPolicy("policy", DataExchangeIamPolicyArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs;
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
   *          var binding = new DataExchangeIamBinding("binding", DataExchangeIamBindingArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs;
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
   *          var member = new DataExchangeIamMember("member", DataExchangeIamMemberArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
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
   *  # IAM policy for BigQuery Analytics Hub DataExchange
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamBinding` and `gcp.bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs;
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
   *          var policy = new DataExchangeIamPolicy("policy", DataExchangeIamPolicyArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs;
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
   *          var binding = new DataExchangeIamBinding("binding", DataExchangeIamBindingArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs;
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
   *          var member = new DataExchangeIamMember("member", DataExchangeIamMemberArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
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
   *  * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
   *  * {{project}}/{{location}}/{{data_exchange_id}}
   *  * {{location}}/{{data_exchange_id}}
   *  * {{data_exchange_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Analytics Hub dataexchange IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_data_exchange_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_data_exchange_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigqueryanalyticshub/dataExchangeIamMember:DataExchangeIamMember editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataExchangeIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeSubscriptionArgs.Builder)
    /**
     * @param destinationDataset BigQuery destination dataset to create for the subscriber.
     *  Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeSubscriptionArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
   *  * `gcp.bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.ListingIamBinding` and `gcp.bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs;
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
   *          var policy = new ListingIamPolicy("policy", ListingIamPolicyArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs;
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
   *          var binding = new ListingIamBinding("binding", ListingIamBindingArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs;
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
   *          var member = new ListingIamMember("member", ListingIamMemberArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
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
   *  # IAM policy for BigQuery Analytics Hub Listing
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
   *  * `gcp.bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.ListingIamBinding` and `gcp.bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs;
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
   *          var policy = new ListingIamPolicy("policy", ListingIamPolicyArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs;
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
   *          var binding = new ListingIamBinding("binding", ListingIamBindingArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs;
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
   *          var member = new ListingIamMember("member", ListingIamMemberArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
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
   *  * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
   *  * {{project}}/{{location}}/{{data_exchange_id}}/{{listing_id}}
   *  * {{location}}/{{data_exchange_id}}/{{listing_id}}
   *  * {{listing_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Analytics Hub listing IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_listing_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_listing_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigqueryanalyticshub/listingIamMember:ListingIamMember editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ListingIamMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.ListingIamMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
   *  * `gcp.bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.ListingIamBinding` and `gcp.bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs;
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
   *          var policy = new ListingIamPolicy("policy", ListingIamPolicyArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs;
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
   *          var binding = new ListingIamBinding("binding", ListingIamBindingArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs;
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
   *          var member = new ListingIamMember("member", ListingIamMemberArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
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
   *  # IAM policy for BigQuery Analytics Hub Listing
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Analytics Hub Listing. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Authoritative. Sets the IAM policy for the listing and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.ListingIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the listing are preserved.
   *  * `gcp.bigqueryanalyticshub.ListingIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the listing are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.ListingIamPolicy`: Retrieves the IAM policy for the listing
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.ListingIamBinding` and `gcp.bigqueryanalyticshub.ListingIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.ListingIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.ListingIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamPolicyArgs;
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
   *          var policy = new ListingIamPolicy("policy", ListingIamPolicyArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs;
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
   *          var binding = new ListingIamBinding("binding", ListingIamBindingArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.ListingIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.ListingIamMemberArgs;
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
   *          var member = new ListingIamMember("member", ListingIamMemberArgs.builder()
   *              .project(listing.project())
   *              .location(listing.location())
   *              .dataExchangeId(listing.dataExchangeId())
   *              .listingId(listing.listingId())
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
   *  * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
   *  * {{project}}/{{location}}/{{data_exchange_id}}/{{listing_id}}
   *  * {{location}}/{{data_exchange_id}}/{{listing_id}}
   *  * {{listing_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Analytics Hub listing IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_listing_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_listing_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigqueryanalyticshub/listingIamBinding:ListingIamBinding editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def ListingIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.ListingIamBindingArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.ListingIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Bigquery Analytics Hub data exchange
   * 
   *  To get more information about DataExchange, see:
   * 
   *  * [API documentation](https://cloud.google.com/bigquery/docs/reference/analytics-hub/rest/v1/projects.locations.dataExchanges)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/bigquery/docs/analytics-hub-introduction)
   */
  def DataExchange(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.DataExchangeArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.DataExchange(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamBinding` and `gcp.bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs;
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
   *          var policy = new DataExchangeIamPolicy("policy", DataExchangeIamPolicyArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs;
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
   *          var binding = new DataExchangeIamBinding("binding", DataExchangeIamBindingArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs;
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
   *          var member = new DataExchangeIamMember("member", DataExchangeIamMemberArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
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
   *  # IAM policy for BigQuery Analytics Hub DataExchange
   * 
   *  Three different resources help you manage your IAM policy for BigQuery Analytics Hub DataExchange. Each of these resources serves a different use case:
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Authoritative. Sets the IAM policy for the dataexchange and replaces any existing policy already attached.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataexchange are preserved.
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataexchange are preserved.
   * 
   *  A data source can be used to retrieve policy data in advent you do not need creation
   * 
   *  * `gcp.bigqueryanalyticshub.DataExchangeIamPolicy`: Retrieves the IAM policy for the dataexchange
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamPolicy` **cannot** be used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamBinding` and `gcp.bigqueryanalyticshub.DataExchangeIamMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.bigqueryanalyticshub.DataExchangeIamBinding` resources **can be** used in conjunction with `gcp.bigqueryanalyticshub.DataExchangeIamMember` resources **only if** they do not grant privilege to the same role.
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamPolicy
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
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicy;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamPolicyArgs;
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
   *          var policy = new DataExchangeIamPolicy("policy", DataExchangeIamPolicyArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .policyData(admin.policyData())
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamBinding
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBinding;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs;
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
   *          var binding = new DataExchangeIamBinding("binding", DataExchangeIamBindingArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
   *              .role("roles/viewer")
   *              .members("user:jane}{@literal @}{@code example.com")
   *              .build());
   * 
   *      }}{@code
   *  }}{@code
   *  }
   *  </pre>
   * 
   *  ## gcp.bigqueryanalyticshub.DataExchangeIamMember
   * 
   *  <pre>
   *  {@code
   *  package generated_program;
   * 
   *  import com.pulumi.Context;
   *  import com.pulumi.Pulumi;
   *  import com.pulumi.core.Output;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMember;
   *  import com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamMemberArgs;
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
   *          var member = new DataExchangeIamMember("member", DataExchangeIamMemberArgs.builder()
   *              .project(dataExchange.project())
   *              .location(dataExchange.location())
   *              .dataExchangeId(dataExchange.dataExchangeId())
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
   *  * projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
   *  * {{project}}/{{location}}/{{data_exchange_id}}
   *  * {{location}}/{{data_exchange_id}}
   *  * {{data_exchange_id}}
   * 
   *  Any variables not passed in the import command will be taken from the provider configuration.
   * 
   *  BigQuery Analytics Hub dataexchange IAM resources can be imported using the resource identifiers, role, and member.
   * 
   *  IAM member imports use space-delimited identifiers: the resource in question, the role, and the member identity, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_data_exchange_iam_member.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer user:jane{@literal @}example.com&#34;
   *  ```
   * 
   *  IAM binding imports use space-delimited identifiers: the resource in question and the role, e.g.
   *  ```sh
   *  $ terraform import google_bigquery_analytics_hub_data_exchange_iam_binding.editor &#34;projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}} roles/viewer&#34;
   *  ```
   * 
   *  IAM policy imports use the identifier of the resource in question, e.g.
   *  ```sh
   *  $ pulumi import gcp:bigqueryanalyticshub/dataExchangeIamBinding:DataExchangeIamBinding editor projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}
   *  ```
   * 
   *  &gt; **Custom Roles** If you&#39;re importing a IAM resource with a custom role, make sure to use the
   *   full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
   */
  def DataExchangeIamBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBindingArgs.builder
    com.pulumi.gcp.bigqueryanalyticshub.DataExchangeIamBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder)
    /**
     * @param commercialInfos Commercial info metadata for this subscription. This is set if this is a commercial subscription i.e. if this subscription was created from subscribing to a commercial listing.
     *  Structure is documented below.
     * @return builder
     */
    def commercialInfos(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.builder
      builder.commercialInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param destinationDataset The destination dataset for this subscription.
     *  Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

    /**
     * @param linkedDatasetMaps Output only. Map of listing resource names to associated linked resource,
     *  e.g. projects/123/locations/US/dataExchanges/456/listings/789 &gt; projects/123/datasets/my_dataset
     *  Structure is documented below.
     * @return builder
     */
    def linkedDatasetMaps(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedDatasetMapArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedDatasetMapArgs.builder
      builder.linkedDatasetMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedResources Output only. Linked resources created in the subscription. Only contains values if state = STATE_ACTIVE.
     *  Structure is documented below.
     * @return builder
     */
    def linkedResources(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedResourceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionLinkedResourceArgs.builder
      builder.linkedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.Builder)
    /**
     * @param cloudMarketplaces (Output)
     *  Details of the Marketplace Data Product associated with the Listing.
     *  Structure is documented below.
     * @return builder
     */
    def cloudMarketplaces(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoCloudMarketplaceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoCloudMarketplaceArgs.builder
      builder.cloudMarketplaces(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeState.Builder)
    /**
     * @param sharingEnvironmentConfig Configurable data sharing environment option for a data exchange.
     *  This field is required for data clean room exchanges.
     *  Structure is documented below.
     * @return builder
     */
    def sharingEnvironmentConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.builder
      builder.sharingEnvironmentConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder)
    /**
     * @param effectiveReplicas (Output)
     *  Server owned effective state of replicas. Contains both primary and secondary replicas.
     *  Each replica includes a system-computed (output-only) state and primary designation.
     *  Structure is documented below.
     * @return builder
     */
    def effectiveReplicas(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetEffectiveReplicaArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetEffectiveReplicaArgs.builder
      builder.effectiveReplicas(args.map(_(argsBuilder).build)*)

    /**
     * @param selectedResources Resource in this dataset that is selectively shared. This field is required for data clean room exchanges.
     *  Structure is documented below.
     * @return builder
     */
    def selectedResources(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetSelectedResourceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetSelectedResourceArgs.builder
      builder.selectedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder)
    /**
     * @param datasetReference A reference that identifies the destination dataset.
     *  Structure is documented below.
     * @return builder
     */
    def datasetReference(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetDatasetReferenceArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionDestinationDatasetDatasetReferenceArgs.builder
      builder.datasetReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder)
    /**
     * @param destinationDataset BigQuery destination dataset to create for the subscriber.
     *  Structure is documented below.
     * @return builder
     */
    def destinationDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.builder
      builder.destinationDataset(args(argsBuilder).build)

    /**
     * @param linkedDatasetMaps Output only. Map of listing resource names to associated linked resource,
     *  e.g. projects/123/locations/us/dataExchanges/456/listings/789 &gt; projects/123/datasets/my_dataset
     *  For Data Exchange subscriptions, this map may contain multiple entries if the Data Exchange has multiple listings.
     *  Structure is documented below.
     * @return builder
     */
    def linkedDatasetMaps(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedDatasetMapArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedDatasetMapArgs.builder
      builder.linkedDatasetMaps(args.map(_(argsBuilder).build)*)

    /**
     * @param linkedResources Output only. Linked resources created in the subscription. Only contains values if state = STATE_ACTIVE.
     *  Structure is documented below.
     * @return builder
     */
    def linkedResources(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedResourceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionLinkedResourceArgs.builder
      builder.linkedResources(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder)
    /**
     * @param dcrExchangeConfig Data Clean Room (DCR), used for privacy-safe and secured data sharing.
     * @return builder
     */
    def dcrExchangeConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDcrExchangeConfigArgs.builder
      builder.dcrExchangeConfig(args(argsBuilder).build)

    /**
     * @param defaultExchangeConfig Default Analytics Hub data exchange, used for secured data sharing.
     * @return builder
     */
    def defaultExchangeConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSharingEnvironmentConfigDefaultExchangeConfigArgs.builder
      builder.defaultExchangeConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder)
    /**
     * @param datasetReference A reference that identifies the destination dataset.
     *  Structure is documented below.
     * @return builder
     */
    def datasetReference(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetDatasetReferenceArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetArgs.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.DataExchangeSubscriptionDestinationDatasetDatasetReferenceArgs.builder
      builder.datasetReference(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingState.Builder)
    def condition(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder)
    /**
     * @param bigqueryDataset Shared dataset i.e. BigQuery dataset source.
     *  Structure is documented below.
     * @return builder
     */
    def bigqueryDataset(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingBigqueryDatasetArgs.builder
      builder.bigqueryDataset(args(argsBuilder).build)

    /**
     * @param commercialInfos Commercial info contains the information about the commercial data products associated with the listing.
     *  Structure is documented below.
     * @return builder
     */
    def commercialInfos(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingCommercialInfoArgs.builder
      builder.commercialInfos(args.map(_(argsBuilder).build)*)

    /**
     * @param dataProvider Details of the data provider who owns the source data.
     *  Structure is documented below.
     * @return builder
     */
    def dataProvider(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingDataProviderArgs.builder
      builder.dataProvider(args(argsBuilder).build)

    /**
     * @param publisher Details of the publisher who owns the listing and who can share the source data.
     *  Structure is documented below.
     * @return builder
     */
    def publisher(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPublisherArgs.builder
      builder.publisher(args(argsBuilder).build)

    /**
     * @param pubsubTopic Pub/Sub topic source.
     *  Structure is documented below.
     * @return builder
     */
    def pubsubTopic(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingPubsubTopicArgs.builder
      builder.pubsubTopic(args(argsBuilder).build)

    /**
     * @param restrictedExportConfig If set, restricted export configuration will be propagated and enforced on the linked dataset.
     *  Structure is documented below.
     * @return builder
     */
    def restrictedExportConfig(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.Builder]):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingState.Builder =
      val argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingRestrictedExportConfigArgs.builder
      builder.restrictedExportConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.Builder)
    /**
     * @param cloudMarketplaces (Output)
     *  Cloud Marketplace commercial metadata for this subscription.
     *  Structure is documented below.
     * @return builder
     */
    def cloudMarketplaces(args: Endofunction[com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoCloudMarketplaceArgs.Builder]*):
        com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoArgs.Builder =
      def argsBuilder = com.pulumi.gcp.bigqueryanalyticshub.inputs.ListingSubscriptionCommercialInfoCloudMarketplaceArgs.builder
      builder.cloudMarketplaces(args.map(_(argsBuilder).build)*)
