package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object expressroute:
  object ExpressrouteFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /** Use this data source to access information about an existing ExpressRoute Circuit Peering. */
    inline def getCircuitPeering(args: Endofunction[com.pulumi.azure.expressroute.inputs.GetCircuitPeeringArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.expressroute.outputs.GetCircuitPeeringResult] =
      val argsBuilder = com.pulumi.azure.expressroute.inputs.GetCircuitPeeringArgs.builder
      com.pulumi.azure.expressroute.ExpressrouteFunctions.getCircuitPeering(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing ExpressRoute Circuit Peering. */
    inline def getCircuitPeeringPlain(args: Endofunction[com.pulumi.azure.expressroute.inputs.GetCircuitPeeringPlainArgs.Builder] = scala.Predef.identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.expressroute.outputs.GetCircuitPeeringResult] =
      val argsBuilder = com.pulumi.azure.expressroute.inputs.GetCircuitPeeringPlainArgs.builder
      com.pulumi.azure.expressroute.ExpressrouteFunctions.getCircuitPeeringPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
