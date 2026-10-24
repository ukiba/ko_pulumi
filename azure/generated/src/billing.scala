package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object billing:
  /** Manages a Cost Management Export for a Billing Account. */
  def AccountCostManagementExport(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.azure.billing.AccountCostManagementExportArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.billing.AccountCostManagementExportArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    com.pulumi.azure.billing.AccountCostManagementExport(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  object BillingFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing Enrollment Account Billing Scope. */
    inline def getEnrollmentAccountScope(args: Endofunction[com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.billing.outputs.GetEnrollmentAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopeArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getEnrollmentAccountScope(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing Enrollment Account Billing Scope. */
    inline def getEnrollmentAccountScopePlain(args: Endofunction[com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.billing.outputs.GetEnrollmentAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetEnrollmentAccountScopePlainArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getEnrollmentAccountScopePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access an ID for your MCA Account billing scope. */
    inline def getMcaAccountScope(args: Endofunction[com.pulumi.azure.billing.inputs.GetMcaAccountScopeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.billing.outputs.GetMcaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMcaAccountScopeArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMcaAccountScope(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access an ID for your MCA Account billing scope. */
    inline def getMcaAccountScopePlain(args: Endofunction[com.pulumi.azure.billing.inputs.GetMcaAccountScopePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.billing.outputs.GetMcaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMcaAccountScopePlainArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMcaAccountScopePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Use this data source to access an ID for your MPA Account billing scope. */
    inline def getMpaAccountScope(args: Endofunction[com.pulumi.azure.billing.inputs.GetMpaAccountScopeArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.billing.outputs.GetMpaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMpaAccountScopeArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMpaAccountScope(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access an ID for your MPA Account billing scope. */
    inline def getMpaAccountScopePlain(args: Endofunction[com.pulumi.azure.billing.inputs.GetMpaAccountScopePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.billing.outputs.GetMpaAccountScopeResult] =
      val argsBuilder = com.pulumi.azure.billing.inputs.GetMpaAccountScopePlainArgs.builder
      com.pulumi.azure.billing.BillingFunctions.getMpaAccountScopePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
