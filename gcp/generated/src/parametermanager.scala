package jp.ukiba.ko_pulumi
package gcp

import com.pulumi.resources.CustomResourceOptions

object parametermanager:
  /**
   * A Parameter resource is a logical parameter.
   * 
   *  To get more information about Parameter, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters)
   */
  def Parameter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.parametermanager.ParameterArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.parametermanager.ParameterArgs.builder
    com.pulumi.gcp.parametermanager.Parameter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Parameter Version resource that stores the actual value of the parameter.
   * 
   *  To get more information about ParameterVersion, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions)
   */
  def ParameterVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.parametermanager.ParameterVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.parametermanager.ParameterVersionArgs.builder
    com.pulumi.gcp.parametermanager.ParameterVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * A Regional Parameter Version resource that stores the actual value of the regional parameter.
   * 
   *  To get more information about RegionalParameterVersion, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions)
   */
  def RegionalParameterVersion(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.parametermanager.RegionalParameterVersionArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.parametermanager.RegionalParameterVersionArgs.builder
    com.pulumi.gcp.parametermanager.RegionalParameterVersion(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object ParametermanagerFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to get information about a Parameter Manager Parameter. */
    inline def getParameter(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParameterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetParameterResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParameterArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParameter(args(argsBuilder).build)

    /** Use this data source to get information about a Parameter Manager Parameter. */
    inline def getParameterPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParameterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetParameterResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParameterPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParameterPlain(args(argsBuilder).build)

    /** Get the value and metadata from a Parameter Manager Parameter version. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions). */
    inline def getParameterVersion(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParameterVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetParameterVersionResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParameterVersionArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParameterVersion(args(argsBuilder).build)

    /** Get the value and metadata from a Parameter Manager Parameter version. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions). */
    inline def getParameterVersionPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParameterVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetParameterVersionResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParameterVersionPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParameterVersionPlain(args(argsBuilder).build)

    /** Get the value and metadata from a Parameter Manager Parameter version with render payload data. For this datasource to work as expected, the principal of the parameter must be provided with the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions/render). */
    inline def getParameterVersionRender(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParameterVersionRenderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetParameterVersionRenderResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParameterVersionRenderArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParameterVersionRender(args(argsBuilder).build)

    /** Get the value and metadata from a Parameter Manager Parameter version with render payload data. For this datasource to work as expected, the principal of the parameter must be provided with the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions/render). */
    inline def getParameterVersionRenderPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParameterVersionRenderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetParameterVersionRenderResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParameterVersionRenderPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParameterVersionRenderPlain(args(argsBuilder).build)

    /** Use this data source to list the Parameter Manager Parameters. */
    inline def getParameters(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParametersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetParametersResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParametersArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParameters(args(argsBuilder).build)

    /** Use this data source to list the Parameter Manager Parameters. */
    inline def getParametersPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetParametersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetParametersResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetParametersPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getParametersPlain(args(argsBuilder).build)

    /** Use this data source to get information about a Parameter Manager Regional Parameter. */
    inline def getRegionalParameter(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetRegionalParameterResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParameter(args(argsBuilder).build)

    /** Use this data source to get information about a Parameter Manager Regional Parameter. */
    inline def getRegionalParameterPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetRegionalParameterResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParameterPlain(args(argsBuilder).build)

    /** Get the value and metadata from a Parameter Manager Regional Parameter version. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview) and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions). */
    inline def getRegionalParameterVersion(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetRegionalParameterVersionResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParameterVersion(args(argsBuilder).build)

    /** Get the value and metadata from a Parameter Manager Regional Parameter version. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview) and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions). */
    inline def getRegionalParameterVersionPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetRegionalParameterVersionResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParameterVersionPlain(args(argsBuilder).build)

    /**
     * Get the value and metadata from a Parameter Manager Regional Parameter version with rendered payload data. For this datasource to work as expected, the principal of the parameter must be provided with the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions/render).
     * 
     *  &gt; **Warning:** To use this data source, we must grant the `Secret Manager Secret Accessor` role to the principal of the parameter. Please note that it can take up to 7 minutes for the role to take effect. Hence, we might need to wait approximately 7 minutes after granting  `Secret Manager Secret Accessor` role to the principal of the parameter. For more information see the [access change propagation documentation](https://cloud.google.com/iam/docs/access-change-propagation).
     */
    inline def getRegionalParameterVersionRender(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionRenderArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetRegionalParameterVersionRenderResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionRenderArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParameterVersionRender(args(argsBuilder).build)

    /**
     * Get the value and metadata from a Parameter Manager Regional Parameter version with rendered payload data. For this datasource to work as expected, the principal of the parameter must be provided with the [Secret Manager Secret Accessor](https://cloud.google.com/secret-manager/docs/access-control#secretmanager.secretAccessor) role. For more information see the [official documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/overview)  and [API](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters.versions/render).
     * 
     *  &gt; **Warning:** To use this data source, we must grant the `Secret Manager Secret Accessor` role to the principal of the parameter. Please note that it can take up to 7 minutes for the role to take effect. Hence, we might need to wait approximately 7 minutes after granting  `Secret Manager Secret Accessor` role to the principal of the parameter. For more information see the [access change propagation documentation](https://cloud.google.com/iam/docs/access-change-propagation).
     */
    inline def getRegionalParameterVersionRenderPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionRenderPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetRegionalParameterVersionRenderResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParameterVersionRenderPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParameterVersionRenderPlain(args(argsBuilder).build)

    /** Use this data source to list the Parameter Manager Regional Parameters. */
    inline def getRegionalParameters(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParametersArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.gcp.parametermanager.outputs.GetRegionalParametersResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParametersArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParameters(args(argsBuilder).build)

    /** Use this data source to list the Parameter Manager Regional Parameters. */
    inline def getRegionalParametersPlain(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.GetRegionalParametersPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.gcp.parametermanager.outputs.GetRegionalParametersResult] =
      val argsBuilder = com.pulumi.gcp.parametermanager.inputs.GetRegionalParametersPlainArgs.builder
      com.pulumi.gcp.parametermanager.ParametermanagerFunctions.getRegionalParametersPlain(args(argsBuilder).build)

  /**
   * A Regional Parameter is a logical regional parameter.
   * 
   *  To get more information about RegionalParameter, see:
   * 
   *  * [API documentation](https://cloud.google.com/secret-manager/parameter-manager/docs/reference/rest/v1/projects.locations.parameters)
   */
  def RegionalParameter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.gcp.parametermanager.RegionalParameterArgs.Builder]) =
    val argsBuilder = com.pulumi.gcp.parametermanager.RegionalParameterArgs.builder
    com.pulumi.gcp.parametermanager.RegionalParameter(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.gcp.parametermanager.inputs.RegionalParameterState.Builder)
    /**
     * @param policyMembers An object containing a unique resource identity tied to the regional parameter.
     *  Structure is documented below.
     * @return builder
     */
    def policyMembers(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.RegionalParameterPolicyMemberArgs.Builder]*):
        com.pulumi.gcp.parametermanager.inputs.RegionalParameterState.Builder =
      def argsBuilder = com.pulumi.gcp.parametermanager.inputs.RegionalParameterPolicyMemberArgs.builder
      builder.policyMembers(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.parametermanager.inputs.ParameterState.Builder)
    /**
     * @param policyMembers Policy member strings of a Google Cloud resource.
     *  Structure is documented below.
     * @return builder
     */
    def policyMembers(args: Endofunction[com.pulumi.gcp.parametermanager.inputs.ParameterPolicyMemberArgs.Builder]*):
        com.pulumi.gcp.parametermanager.inputs.ParameterState.Builder =
      def argsBuilder = com.pulumi.gcp.parametermanager.inputs.ParameterPolicyMemberArgs.builder
      builder.policyMembers(args.map(_(argsBuilder).build)*)
