package jp.ukiba.ko_pulumi
package azure

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions

object expressroute:
  object ExpressrouteFunctions:
    /** Use this data source to access information about an existing ExpressRoute Circuit Peering. */
    inline def getCircuitPeering(args: Endofunction[com.pulumi.azure.expressroute.inputs.GetCircuitPeeringArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.azure.expressroute.outputs.GetCircuitPeeringResult] =
      val argsBuilder = com.pulumi.azure.expressroute.inputs.GetCircuitPeeringArgs.builder
      com.pulumi.azure.expressroute.ExpressrouteFunctions.getCircuitPeering(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Use this data source to access information about an existing ExpressRoute Circuit Peering. */
    inline def getCircuitPeeringPlain(args: Endofunction[com.pulumi.azure.expressroute.inputs.GetCircuitPeeringPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.expressroute.outputs.GetCircuitPeeringResult] =
      val argsBuilder = com.pulumi.azure.expressroute.inputs.GetCircuitPeeringPlainArgs.builder
      com.pulumi.azure.expressroute.ExpressrouteFunctions.getCircuitPeeringPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)
