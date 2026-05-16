package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object siteverification:
  object SiteverificationFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * A verification token is used to demonstrate ownership of a website or domain.
     * 
     *  To get more information about Token, see:
     * 
     *  * [API documentation](https://developers.google.com/site-verification/v1)
     *  * How-to Guides
     *      * [Getting Started](https://developers.google.com/site-verification/v1/getting_started)
     */
    inline def getToken(args: Endofunction[com.pulumi.gcp.siteverification.inputs.GetTokenArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.siteverification.outputs.GetTokenResult] =
      val argsBuilder = com.pulumi.gcp.siteverification.inputs.GetTokenArgs.builder
      com.pulumi.gcp.siteverification.SiteverificationFunctions.getToken(args(argsBuilder).build)

    /**
     * A verification token is used to demonstrate ownership of a website or domain.
     * 
     *  To get more information about Token, see:
     * 
     *  * [API documentation](https://developers.google.com/site-verification/v1)
     *  * How-to Guides
     *      * [Getting Started](https://developers.google.com/site-verification/v1/getting_started)
     */
    inline def getTokenPlain(args: Endofunction[com.pulumi.gcp.siteverification.inputs.GetTokenPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.siteverification.outputs.GetTokenResult] =
      val argsBuilder = com.pulumi.gcp.siteverification.inputs.GetTokenPlainArgs.builder
      com.pulumi.gcp.siteverification.SiteverificationFunctions.getTokenPlain(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.siteverification.WebResourceArgs.Builder)
    /**
     * @param site Container for the address and type of a site for which a verification token will be verified.
     *  Structure is documented below.
     * @return builder
     */
    def site(args: Endofunction[com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.Builder]):
        com.pulumi.gcp.siteverification.WebResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.builder
      builder.site(args(argsBuilder).build)

  /**
   * An owner is an additional user that may manage a verified web site in the
   *  [Google Search Console](https://www.google.com/webmasters/tools/). There
   *  are two types of web resource owners:
   * 
   *  * Verified owners, which are added to a web resource automatically when it
   *      is created (i.e., when the resource is verified). A verified owner is
   *      determined by the identity of the user requesting verification.
   *  * Additional owners, which can be added to the resource by verified owners.
   * 
   *  `gcp.siteverification.Owner` creates additional owners. If your web site
   *  was verified using the
   *  `gcp.siteverification.WebResource`
   *  resource then you (or the identity was used to create the resource, such as a
   *  service account) are already an owner.
   * 
   *  &gt; **Note:** The email address of the owner must belong to a Google account,
   *  such as a Gmail account, a Google Workspace account, or a GCP service account.
   * 
   *  Working with site verification requires the `https://www.googleapis.com/auth/siteverification`
   *  authentication scope. See the
   *  Google Provider authentication documentation
   *  to learn how to configure additional scopes.
   * 
   *  To get more information about site owners, see:
   * 
   *  * [API documentation](https://developers.google.com/site-verification/v1)
   *  * How-to Guides
   *      * [Getting Started](https://developers.google.com/site-verification/v1/getting_started)
   */
  def Owner(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.siteverification.OwnerArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.siteverification.OwnerArgs.builder
    com.pulumi.gcp.siteverification.Owner(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A web resource is a website or domain with verified ownership. Once your
   *  ownership is verified you will be able to manage your website in the
   *  [Google Search Console](https://www.google.com/webmasters/tools/).
   * 
   *  &gt; **Note:** The verification data (DNS `TXT` record, HTML file, `meta` tag, etc.)
   *  must already exist before the web resource is created, and must be deleted before
   *  the web resource is destroyed. The Google Site Verification API checks that the
   *  verification data exists at creation time and does not exist at destruction time
   *  and will fail if the required condition is not met.
   * 
   *  To get more information about WebResource, see:
   * 
   *  * [API documentation](https://developers.google.com/site-verification/v1)
   *  * How-to Guides
   *      * [Getting Started](https://developers.google.com/site-verification/v1/getting_started)
   */
  def WebResource(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.siteverification.WebResourceArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.siteverification.WebResourceArgs.builder
    com.pulumi.gcp.siteverification.WebResource(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.siteverification.inputs.WebResourceState.Builder)
    /**
     * @param site Container for the address and type of a site for which a verification token will be verified.
     *  Structure is documented below.
     * @return builder
     */
    def site(args: Endofunction[com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.Builder]):
        com.pulumi.gcp.siteverification.inputs.WebResourceState.Builder =
      val argsBuilder = com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.builder
      builder.site(args(argsBuilder).build)
