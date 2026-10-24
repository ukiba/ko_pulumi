package jp.ukiba.ko_pulumi
package azure

object appinsights_ext:
  extension (builder: com.pulumi.azure.appinsights.StandardWebTestArgs.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    def request(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder]):
        com.pulumi.azure.appinsights.StandardWebTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param validationRules A `validationRules` block as defined below.
     * @return builder
     */
    def validationRules(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder]):
        com.pulumi.azure.appinsights.StandardWebTestArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.builder
      builder.validationRules(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.WorkbookArgs.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Workbook to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.Builder]):
        com.pulumi.azure.appinsights.WorkbookArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.WorkbookTemplateArgs.Builder)
    /**
     * @param galleries A `galleries` block as defined below.
     * @return builder
     */
    def galleries(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.Builder]*):
        com.pulumi.azure.appinsights.WorkbookTemplateArgs.Builder =
      def argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.builder
      builder.galleries(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder)
    /**
     * @param headers One or more `header` blocks as defined above.
     * @return builder
     */
    def headers(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestRequestHeaderArgs.Builder]*):
        com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder =
      def argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestRequestHeaderArgs.builder
      builder.headers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.azure.appinsights.inputs.StandardWebTestState.Builder)
    /**
     * @param request A `request` block as defined below.
     * @return builder
     */
    def request(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.StandardWebTestState.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestRequestArgs.builder
      builder.request(args(argsBuilder).build)

    /**
     * @param validationRules A `validationRules` block as defined below.
     * @return builder
     */
    def validationRules(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.StandardWebTestState.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.builder
      builder.validationRules(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder)
    /**
     * @param content A `content` block as defined above.
     * @return builder
     */
    def content(args: Endofunction[com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesContentArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesArgs.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.StandardWebTestValidationRulesContentArgs.builder
      builder.content(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.inputs.WorkbookState.Builder)
    /**
     * @param identity An `identity` block as defined below. Changing this forces a new Workbook to be created.
     * @return builder
     */
    def identity(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.Builder]):
        com.pulumi.azure.appinsights.inputs.WorkbookState.Builder =
      val argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookIdentityArgs.builder
      builder.identity(args(argsBuilder).build)

  extension (builder: com.pulumi.azure.appinsights.inputs.WorkbookTemplateState.Builder)
    /**
     * @param galleries A `galleries` block as defined below.
     * @return builder
     */
    def galleries(args: Endofunction[com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.Builder]*):
        com.pulumi.azure.appinsights.inputs.WorkbookTemplateState.Builder =
      def argsBuilder = com.pulumi.azure.appinsights.inputs.WorkbookTemplateGalleryArgs.builder
      builder.galleries(args.map(_(argsBuilder).build)*)
