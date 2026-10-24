package jp.ukiba.ko_pulumi
package aws

import com.pulumi.deployment.InvokeOptions
import com.pulumi.deployment.InvokeOutputOptions
import com.pulumi.resources.CustomResourceOptions

object signer:
  object SignerFunctions:
    /** Provides information about a Signer Signing Job. */
    inline def getSigningJob(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningJobArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.signer.outputs.GetSigningJobResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningJobArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningJob(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a Signer Signing Job. */
    inline def getSigningJobPlain(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningJobPlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.signer.outputs.GetSigningJobResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningJobPlainArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningJobPlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

    /** Provides information about a Signer Signing Profile. */
    inline def getSigningProfile(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningProfileArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOutputOptions.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.signer.outputs.GetSigningProfileResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningProfileArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningProfile(args(argsBuilder).build,
          invokeOptions(InvokeOutputOptions.Builder()).build)

    /** Provides information about a Signer Signing Profile. */
    inline def getSigningProfilePlain(args: Endofunction[com.pulumi.aws.signer.inputs.GetSigningProfilePlainArgs.Builder] = identity,
        invokeOptions: Endofunction[InvokeOptions.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.signer.outputs.GetSigningProfileResult] =
      val argsBuilder = com.pulumi.aws.signer.inputs.GetSigningProfilePlainArgs.builder
      com.pulumi.aws.signer.SignerFunctions.getSigningProfilePlain(args(argsBuilder).build,
          invokeOptions(InvokeOptions.builder).build)

  /** Creates a Signer Signing Job. */
  inline def SigningJob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningJobArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.signer.SigningJobArgs.builder
    com.pulumi.aws.signer.SigningJob(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a Signer Signing Profile. A signing profile contains information about the code signing configuration parameters that can be used by a given code signing user. */
  inline def SigningProfile(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningProfileArgs.Builder] = identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.signer.SigningProfileArgs.builder
    conf.logicalName2physicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    argsBuilder = args(argsBuilder)
    conf.logicalName2tagName(name) match
      case Some(tagName) =>
        argsBuilder = argsBuilder.tags:
          transformOptOutputMap(argsBuilder.build.tags, map =>
              if map.contains("Name") then map else map + ("Name" -> tagName))
      case None =>
    com.pulumi.aws.signer.SigningProfile(name,
        argsBuilder.build,
        resourceOptions(conf.customResourceOptionsBuilder).build)

  /** Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile. */
  inline def SigningProfilePermission(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.signer.SigningProfilePermissionArgs.Builder] = identity)(using conf: KoPulumiConf) =
    val argsBuilder = com.pulumi.aws.signer.SigningProfilePermissionArgs.builder
    com.pulumi.aws.signer.SigningProfilePermission(name,
        args(argsBuilder).build,
        resourceOptions(conf.customResourceOptionsBuilder).build)
