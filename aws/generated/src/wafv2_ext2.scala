package jp.ukiba.ko_pulumi
package aws

object wafv2_ext2:
  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    inline def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body as plain text. See Body below.
     * @return builder
     */
    inline def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the request cookies. See Cookies below.
     * @return builder
     */
    inline def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request. See Header Order below.
     * @return builder
     */
    inline def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Match against the request&#39;s JA3 fingerprint (CloudFront and ALB only). See JA3 Fingerprint below.
     * @return builder
     */
    inline def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Match against the request&#39;s JA4 fingerprint (CloudFront and ALB only). See JA4 Fingerprint below.
     * @return builder
     */
    inline def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body below.
     * @return builder
     */
    inline def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method.
     * @return builder
     */
    inline def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string.
     * @return builder
     */
    inline def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below.
     * @return builder
     */
    inline def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below.
     * @return builder
     */
    inline def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect fragments of the request URI. See URI Fragment below.
     * @return builder
     */
    inline def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path.
     * @return builder
     */
    inline def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns Cookies to inspect. See Cookies Match Pattern below.
     * @return builder
     */
    inline def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern Headers to inspect. See Headers Match Pattern below.
     * @return builder
     */
    inline def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern JSON content to inspect. See JSON Body Match Pattern below.
     * @return builder
     */
    inline def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSizeConstraintStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.Builder)
    inline def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    inline def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    inline def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body as plain text. See Body below.
     * @return builder
     */
    inline def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the request cookies. See Cookies below.
     * @return builder
     */
    inline def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request. See Header Order below.
     * @return builder
     */
    inline def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Match against the request&#39;s JA3 fingerprint (CloudFront and ALB only). See JA3 Fingerprint below.
     * @return builder
     */
    inline def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Match against the request&#39;s JA4 fingerprint (CloudFront and ALB only). See JA4 Fingerprint below.
     * @return builder
     */
    inline def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body below.
     * @return builder
     */
    inline def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method.
     * @return builder
     */
    inline def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string.
     * @return builder
     */
    inline def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below.
     * @return builder
     */
    inline def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below.
     * @return builder
     */
    inline def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect fragments of the request URI. See URI Fragment below.
     * @return builder
     */
    inline def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path.
     * @return builder
     */
    inline def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns Cookies to inspect. See Cookies Match Pattern below.
     * @return builder
     */
    inline def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern Headers to inspect. See Headers Match Pattern below.
     * @return builder
     */
    inline def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern JSON content to inspect. See JSON Body Match Pattern below.
     * @return builder
     */
    inline def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementSqliMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.Builder)
    inline def fieldToMatch(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.builder
      builder.fieldToMatch(args(argsBuilder).build)

    inline def textTransformations(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementTextTransformationArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementTextTransformationArgs.builder
      builder.textTransformations(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder)
    /**
     * @param allQueryArguments Inspect all query arguments.
     * @return builder
     */
    inline def allQueryArguments(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs.builder
      builder.allQueryArguments(args(argsBuilder).build)

    /**
     * @param body Inspect the request body as plain text. See Body below.
     * @return builder
     */
    inline def body(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchBodyArgs.builder
      builder.body(args(argsBuilder).build)

    /**
     * @param cookies Inspect the request cookies. See Cookies below.
     * @return builder
     */
    inline def cookies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.builder
      builder.cookies(args(argsBuilder).build)

    /**
     * @param headerOrders Inspect a string containing the list of the request&#39;s header names, ordered as they appear in the web request. See Header Order below.
     * @return builder
     */
    inline def headerOrders(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderOrderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderOrderArgs.builder
      builder.headerOrders(args.map(_(argsBuilder).build)*)

    /**
     * @param headers Inspect the request headers. See Headers below.
     * @return builder
     */
    inline def headers(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

    /**
     * @param ja3Fingerprint Match against the request&#39;s JA3 fingerprint (CloudFront and ALB only). See JA3 Fingerprint below.
     * @return builder
     */
    inline def ja3Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa3FingerprintArgs.builder
      builder.ja3Fingerprint(args(argsBuilder).build)

    /**
     * @param ja4Fingerprint Match against the request&#39;s JA4 fingerprint (CloudFront and ALB only). See JA4 Fingerprint below.
     * @return builder
     */
    inline def ja4Fingerprint(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJa4FingerprintArgs.builder
      builder.ja4Fingerprint(args(argsBuilder).build)

    /**
     * @param jsonBody Inspect the request body as JSON. See JSON Body below.
     * @return builder
     */
    inline def jsonBody(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.builder
      builder.jsonBody(args(argsBuilder).build)

    /**
     * @param method Inspect the HTTP method.
     * @return builder
     */
    inline def method(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchMethodArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchMethodArgs.builder
      builder.method(args(argsBuilder).build)

    /**
     * @param queryString Inspect the query string.
     * @return builder
     */
    inline def queryString(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchQueryStringArgs.builder
      builder.queryString(args(argsBuilder).build)

    /**
     * @param singleHeader Inspect a single header. See Single Header below.
     * @return builder
     */
    inline def singleHeader(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeaderArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleHeaderArgs.builder
      builder.singleHeader(args(argsBuilder).build)

    /**
     * @param singleQueryArgument Inspect a single query argument. See Single Query Argument below.
     * @return builder
     */
    inline def singleQueryArgument(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs.builder
      builder.singleQueryArgument(args(argsBuilder).build)

    /**
     * @param uriFragment Inspect fragments of the request URI. See URI Fragment below.
     * @return builder
     */
    inline def uriFragment(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriFragmentArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriFragmentArgs.builder
      builder.uriFragment(args(argsBuilder).build)

    /**
     * @param uriPath Inspect the request URI path.
     * @return builder
     */
    inline def uriPath(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriPathArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchUriPathArgs.builder
      builder.uriPath(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder)
    /**
     * @param matchPatterns Cookies to inspect. See Cookies Match Pattern below.
     * @return builder
     */
    inline def matchPatterns(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesArgs.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.builder
      builder.matchPatterns(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchCookiesMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder)
    /**
     * @param matchPattern Headers to inspect. See Headers Match Pattern below.
     * @return builder
     */
    inline def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchHeaderMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder)
    /**
     * @param matchPattern JSON content to inspect. See JSON Body Match Pattern below.
     * @return builder
     */
    inline def matchPattern(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.builder
      builder.matchPattern(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder)
    inline def all(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternArgs.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleStatementXssMatchStatementFieldToMatchJsonBodyMatchPatternAllArgs.builder
      builder.all(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.wafv2.inputs.WebAclState.Builder)
    /**
     * @param associationConfig Custom configurations for the associations between the web ACL and protected resources. See `associationConfig` below for details.
     * @return builder
     */
    inline def associationConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclAssociationConfigArgs.builder
      builder.associationConfig(args(argsBuilder).build)

    /**
     * @param captchaConfig Configuration for how AWS WAF handles CAPTCHA evaluations at the web ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `captchaConfig` below for details.
     * @return builder
     */
    inline def captchaConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclCaptchaConfigArgs.builder
      builder.captchaConfig(args(argsBuilder).build)

    /**
     * @param challengeConfig Configuration for how AWS WAF handles Challenge evaluations at the web ACL level (used by [AWS Bot Control](https://docs.aws.amazon.com/waf/latest/developerguide/aws-managed-rule-groups-bot.html)). See `challengeConfig` below for details.
     * @return builder
     */
    inline def challengeConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclChallengeConfigArgs.builder
      builder.challengeConfig(args(argsBuilder).build)

    /**
     * @param customResponseBodies Custom response bodies that can be referenced by `customResponse` actions. See `customResponseBody` below for details.
     * @return builder
     */
    inline def customResponseBodies(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclCustomResponseBodyArgs.builder
      builder.customResponseBodies(args.map(_(argsBuilder).build)*)

    /**
     * @param dataProtectionConfig Data protection to apply to the web request data for the web ACL. This is a web ACL level data protection option. See `dataProtectionConfig` below for details.
     * @return builder
     */
    inline def dataProtectionConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDataProtectionConfigArgs.builder
      builder.dataProtectionConfig(args(argsBuilder).build)

    /**
     * @param defaultAction Action to perform if none of the `rules` contained in the WebACL match. See `defaultAction` below for details.
     * @return builder
     */
    inline def defaultAction(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclDefaultActionArgs.builder
      builder.defaultAction(args(argsBuilder).build)

    /**
     * @param monetizationConfig Monetization configuration for the web ACL. Provide this when any rule in the web ACL uses the `monetize` action. See `monetizationConfig` below for details.
     * @return builder
     */
    inline def monetizationConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclMonetizationConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclMonetizationConfigArgs.builder
      builder.monetizationConfig(args(argsBuilder).build)

    /**
     * @param rules **`rule` blocks in this resource have several known limitations.** Consider using `aws.wafv2.WebAclRule` to manage rules as separate resources instead. Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See `rule` below for details.
     * @return builder
     */
    inline def rules(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.Builder]*):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      def argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclRuleArgs.builder
      builder.rules(args.map(_(argsBuilder).build)*)

    /**
     * @param visibilityConfig Amazon CloudWatch metrics and web request sample collection configuration. See `visibilityConfig` below for details.
     * @return builder
     */
    inline def visibilityConfig(args: Endofunction[com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigArgs.Builder]):
        com.pulumi.aws.wafv2.inputs.WebAclState.Builder =
      val argsBuilder = com.pulumi.aws.wafv2.inputs.WebAclVisibilityConfigArgs.builder
      builder.visibilityConfig(args(argsBuilder).build)
