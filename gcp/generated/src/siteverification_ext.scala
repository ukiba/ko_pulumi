package jp.ukiba.ko_pulumi
package gcp

object siteverification_ext:
  extension (builder: com.pulumi.gcp.siteverification.WebResourceArgs.Builder)
    /**
     * @param site Container for the address and type of a site for which a verification token will be verified.
     * Structure is documented below.
     * @return builder
     */
    inline def site(args: Endofunction[com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.Builder]):
        com.pulumi.gcp.siteverification.WebResourceArgs.Builder =
      val argsBuilder = com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.builder
      builder.site(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.siteverification.inputs.WebResourceState.Builder)
    /**
     * @param site Container for the address and type of a site for which a verification token will be verified.
     * Structure is documented below.
     * @return builder
     */
    inline def site(args: Endofunction[com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.Builder]):
        com.pulumi.gcp.siteverification.inputs.WebResourceState.Builder =
      val argsBuilder = com.pulumi.gcp.siteverification.inputs.WebResourceSiteArgs.builder
      builder.site(args(argsBuilder).build)
