package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object serviceaccount:
  /**
   * When managing IAM roles, you can treat a service account either as a resource or as an identity. This resource is to add iam policy bindings to a service account resource, such as allowing the members to run operations as or modify the service account. To configure permissions for a service account on other GCP resources, use the googleProjectIam set of resources.
   * 
   *  Three different resources help you manage your IAM policy for a service account. Each of these resources serves a different use case:
   * 
   *  * `gcp.serviceaccount.IAMPolicy`: Authoritative. Sets the IAM policy for the service account and replaces any existing policy already attached.
   *  * `gcp.serviceaccount.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service account are preserved.
   *  * `gcp.serviceaccount.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service account are preserved.
   * 
   *  &gt; **Note:** `gcp.serviceaccount.IAMPolicy` **cannot** be used in conjunction with `gcp.serviceaccount.IAMBinding` and `gcp.serviceaccount.IAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.serviceaccount.IAMBinding` resources **can be** used in conjunction with `gcp.serviceaccount.IAMMember` resources **only if** they do not grant privilege to the same role.
   */
  def IAMPolicy(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceaccount.IAMPolicyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.serviceaccount.IAMPolicyArgs.builder
    com.pulumi.gcp.serviceaccount.IAMPolicy(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ServiceaccountFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Get the service account from a project. For more information see
     *  the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.
     */
    inline def getAccount(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.serviceaccount.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccount(args(argsBuilder).build)

    /**
     * Get the service account from a project. For more information see
     *  the official [API](https://cloud.google.com/compute/docs/access/service-accounts) documentation.
     */
    inline def getAccountPlain(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.serviceaccount.outputs.GetAccountResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountPlainArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountPlain(args(argsBuilder).build)

    /**
     * This data source provides a google `oauth2` `accessToken` for a different service account than the one initially running the script.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials) as well as [iamcredentials.generateAccessToken()](https://cloud.google.com/iam/credentials/reference/rest/v1/projects.serviceAccounts/generateAccessToken)
     */
    inline def getAccountAccessToken(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountAccessTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.serviceaccount.outputs.GetAccountAccessTokenResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountAccessTokenArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountAccessToken(args(argsBuilder).build)

    /**
     * This data source provides a google `oauth2` `accessToken` for a different service account than the one initially running the script.
     * 
     *  For more information see
     *  [the official documentation](https://cloud.google.com/iam/docs/creating-short-lived-service-account-credentials) as well as [iamcredentials.generateAccessToken()](https://cloud.google.com/iam/credentials/reference/rest/v1/projects.serviceAccounts/generateAccessToken)
     */
    inline def getAccountAccessTokenPlain(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountAccessTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.serviceaccount.outputs.GetAccountAccessTokenResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountAccessTokenPlainArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountAccessTokenPlain(args(argsBuilder).build)

    /**
     * This data source provides a Google OpenID Connect (`oidc`) `idToken`.  Tokens issued from this data source are typically used to call external services that accept OIDC tokens for authentication (e.g. [Google Cloud Run](https://cloud.google.com/run/docs/authenticating/service-to-service)).
     * 
     *  For more information see
     *  [OpenID Connect](https://openid.net/specs/openid-connect-core-1_0.html#IDToken).
     */
    inline def getAccountIdToken(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountIdTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.serviceaccount.outputs.GetAccountIdTokenResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountIdTokenArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountIdToken(args(argsBuilder).build)

    /**
     * This data source provides a Google OpenID Connect (`oidc`) `idToken`.  Tokens issued from this data source are typically used to call external services that accept OIDC tokens for authentication (e.g. [Google Cloud Run](https://cloud.google.com/run/docs/authenticating/service-to-service)).
     * 
     *  For more information see
     *  [OpenID Connect](https://openid.net/specs/openid-connect-core-1_0.html#IDToken).
     */
    inline def getAccountIdTokenPlain(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountIdTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.serviceaccount.outputs.GetAccountIdTokenResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountIdTokenPlainArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountIdTokenPlain(args(argsBuilder).build)

    /** This data source provides a [self-signed JWT](https://cloud.google.com/iam/docs/create-short-lived-credentials-direct#sa-credentials-jwt).  Tokens issued from this data source are typically used to call external services that accept JWTs for authentication. */
    inline def getAccountJwt(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountJwtArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.serviceaccount.outputs.GetAccountJwtResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountJwtArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountJwt(args(argsBuilder).build)

    /** This data source provides a [self-signed JWT](https://cloud.google.com/iam/docs/create-short-lived-credentials-direct#sa-credentials-jwt).  Tokens issued from this data source are typically used to call external services that accept JWTs for authentication. */
    inline def getAccountJwtPlain(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountJwtPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.serviceaccount.outputs.GetAccountJwtResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountJwtPlainArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountJwtPlain(args(argsBuilder).build)

    /** Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get). */
    inline def getAccountKey(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountKeyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.serviceaccount.outputs.GetAccountKeyResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountKeyArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountKey(args(argsBuilder).build)

    /** Get service account public key. For more information, see [the official documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys) and [API](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys/get). */
    inline def getAccountKeyPlain(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetAccountKeyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.serviceaccount.outputs.GetAccountKeyResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetAccountKeyPlainArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getAccountKeyPlain(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a service account.
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
     *  import com.pulumi.gcp.serviceaccount.ServiceaccountFunctions;
     *  import com.pulumi.gcp.serviceaccount.inputs.GetIamPolicyArgs;
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
     *          final var foo = ServiceaccountFunctions.getIamPolicy(GetIamPolicyArgs.builder()
     *              .serviceAccountId(testAccount.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getIamPolicy(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetIamPolicyArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.serviceaccount.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetIamPolicyArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getIamPolicy(args(argsBuilder).build)

    /**
     * Retrieves the current IAM policy data for a service account.
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
     *  import com.pulumi.gcp.serviceaccount.ServiceaccountFunctions;
     *  import com.pulumi.gcp.serviceaccount.inputs.GetIamPolicyArgs;
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
     *          final var foo = ServiceaccountFunctions.getIamPolicy(GetIamPolicyArgs.builder()
     *              .serviceAccountId(testAccount.name())
     *              .build());
     * 
     *      }
     *  }
     *  }
     *  </pre>
     */
    inline def getIamPolicyPlain(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetIamPolicyPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.serviceaccount.outputs.GetIamPolicyResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetIamPolicyPlainArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getIamPolicyPlain(args(argsBuilder).build)

    /**
     * Gets a list of all service accounts from a project.
     *  See [the official documentation](https://cloud.google.com/iam/docs/service-account-overview)
     *  and [API](https://cloud.google.com/iam/docs/reference/rest/v1/projects.serviceAccounts).
     */
    inline def getS(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetSArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.serviceaccount.outputs.GetSResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetSArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getS(args(argsBuilder).build)

    /**
     * Gets a list of all service accounts from a project.
     *  See [the official documentation](https://cloud.google.com/iam/docs/service-account-overview)
     *  and [API](https://cloud.google.com/iam/docs/reference/rest/v1/projects.serviceAccounts).
     */
    inline def getSPlain(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.GetSPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.serviceaccount.outputs.GetSResult] =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.GetSPlainArgs.builder
      com.pulumi.gcp.serviceaccount.ServiceaccountFunctions.getSPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.serviceaccount.IAMMemberArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.IAMMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  /**
   * When managing IAM roles, you can treat a service account either as a resource or as an identity. This resource is to add iam policy bindings to a service account resource, such as allowing the members to run operations as or modify the service account. To configure permissions for a service account on other GCP resources, use the googleProjectIam set of resources.
   * 
   *  Three different resources help you manage your IAM policy for a service account. Each of these resources serves a different use case:
   * 
   *  * `gcp.serviceaccount.IAMPolicy`: Authoritative. Sets the IAM policy for the service account and replaces any existing policy already attached.
   *  * `gcp.serviceaccount.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service account are preserved.
   *  * `gcp.serviceaccount.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service account are preserved.
   * 
   *  &gt; **Note:** `gcp.serviceaccount.IAMPolicy` **cannot** be used in conjunction with `gcp.serviceaccount.IAMBinding` and `gcp.serviceaccount.IAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.serviceaccount.IAMBinding` resources **can be** used in conjunction with `gcp.serviceaccount.IAMMember` resources **only if** they do not grant privilege to the same role.
   */
  def IAMMember(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceaccount.IAMMemberArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.serviceaccount.IAMMemberArgs.builder
    com.pulumi.gcp.serviceaccount.IAMMember(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Allows management of a Google Cloud service account.
   * 
   *  * [API documentation](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/compute/docs/access/service-accounts)
   * 
   *  &gt; **Warning:**  If you delete and recreate a service account, you must reapply any IAM roles that it had before.
   * 
   *  &gt; Creation of service accounts is eventually consistent, and that can lead to
   *  errors when you try to apply ACLs to service accounts immediately after
   *  creation.
   */
  def Account(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceaccount.AccountArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.serviceaccount.AccountArgs.builder
    com.pulumi.gcp.serviceaccount.Account(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * When managing IAM roles, you can treat a service account either as a resource or as an identity. This resource is to add iam policy bindings to a service account resource, such as allowing the members to run operations as or modify the service account. To configure permissions for a service account on other GCP resources, use the googleProjectIam set of resources.
   * 
   *  Three different resources help you manage your IAM policy for a service account. Each of these resources serves a different use case:
   * 
   *  * `gcp.serviceaccount.IAMPolicy`: Authoritative. Sets the IAM policy for the service account and replaces any existing policy already attached.
   *  * `gcp.serviceaccount.IAMBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the service account are preserved.
   *  * `gcp.serviceaccount.IAMMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the service account are preserved.
   * 
   *  &gt; **Note:** `gcp.serviceaccount.IAMPolicy` **cannot** be used in conjunction with `gcp.serviceaccount.IAMBinding` and `gcp.serviceaccount.IAMMember` or they will fight over what your policy should be.
   * 
   *  &gt; **Note:** `gcp.serviceaccount.IAMBinding` resources **can be** used in conjunction with `gcp.serviceaccount.IAMMember` resources **only if** they do not grant privilege to the same role.
   */
  def IAMBinding(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceaccount.IAMBindingArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.serviceaccount.IAMBindingArgs.builder
    com.pulumi.gcp.serviceaccount.IAMBinding(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Creates and manages service account keys, which allow the use of a service account with Google Cloud.
   * 
   *  &gt; **Warning**: This resource persists a sensitive credential in plaintext in the remote state used by Terraform.
   *  Please take appropriate measures to protect your remote state.
   * 
   *  * [API documentation](https://cloud.google.com/iam/reference/rest/v1/projects.serviceAccounts.keys)
   *  * How-to Guides
   *      * [Official Documentation](https://cloud.google.com/iam/docs/creating-managing-service-account-keys)
   */
  def Key(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.serviceaccount.KeyArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.serviceaccount.KeyArgs.builder
    com.pulumi.gcp.serviceaccount.Key(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.serviceaccount.inputs.IAMMemberState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.inputs.IAMMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.serviceaccount.inputs.IAMBindingState.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.inputs.IAMBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.serviceaccount.IAMBindingArgs.Builder)
    /**
     * @param condition An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     *  Structure is documented below.
     * @return builder
     */
    def condition(args: Endofunction[com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.Builder]):
        com.pulumi.gcp.serviceaccount.IAMBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.serviceaccount.inputs.IAMBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)
