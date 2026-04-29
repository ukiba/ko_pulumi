package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object codecatalyst:
  extension (builder: com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder)
    /**
     * @param ides Information about the integrated development environment (IDE) configured for a Dev Environment.
     * @return builder
     */
    def ides(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.Builder]):
        com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.builder
      builder.ides(args(argsBuilder).build)

    /**
     * @param persistentStorage Information about the amount of storage allocated to the Dev Environment.
     * @return builder
     */
    def persistentStorage(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.Builder]):
        com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.builder
      builder.persistentStorage(args(argsBuilder).build)

    /**
     * @param repositories The source repository that contains the branch to clone into the Dev Environment.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.Builder]*):
        com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  type CodecatalystFunctions = com.pulumi.aws.codecatalyst.CodecatalystFunctions
  object CodecatalystFunctions:
    // TODO [erasedDefinitions](https://github.com/lampepfl/dotty-feature-requests/issues/168#issuecomment-1486536624)
    export com.pulumi.aws.codecatalyst.CodecatalystFunctions.*
  extension (self: CodecatalystFunctions.type)
    /** Data source for managing an AWS CodeCatalyst Dev Environment. */
    def getDevEnvironment(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.Builder] = identity):
        com.pulumi.core.Output[com.pulumi.aws.codecatalyst.outputs.GetDevEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.builder
      com.pulumi.aws.codecatalyst.CodecatalystFunctions.getDevEnvironment(args(argsBuilder).build)

    /** Data source for managing an AWS CodeCatalyst Dev Environment. */
    def getDevEnvironmentPlain(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentPlainArgs.Builder] = identity):
        java.util.concurrent.CompletableFuture[com.pulumi.aws.codecatalyst.outputs.GetDevEnvironmentResult] =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentPlainArgs.builder
      com.pulumi.aws.codecatalyst.CodecatalystFunctions.getDevEnvironmentPlain(args(argsBuilder).build)

  /** Resource for managing an AWS CodeCatalyst Dev Environment. */
  def DevEnvironment(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codecatalyst.DevEnvironmentArgs.builder
    
    com.pulumi.aws.codecatalyst.DevEnvironment(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CodeCatalyst Project. */
  def Project(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecatalyst.ProjectArgs.Builder]) =
    val argsBuilder = com.pulumi.aws.codecatalyst.ProjectArgs.builder
    
    com.pulumi.aws.codecatalyst.Project(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS CodeCatalyst Source Repository. */
  def SourceRepository(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.codecatalyst.SourceRepositoryArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.codecatalyst.SourceRepositoryArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    
    com.pulumi.aws.codecatalyst.SourceRepository(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.Builder)
    /**
     * @param repositories The source repository that contains the branch to clone into the Dev Environment.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentRepositoryArgs.Builder]*):
        com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder)
    /**
     * @param ides Information about the integrated development environment (IDE) configured for a Dev Environment.
     * @return builder
     */
    def ides(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.Builder]):
        com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.builder
      builder.ides(args(argsBuilder).build)

    /**
     * @param persistentStorage Information about the amount of storage allocated to the Dev Environment.
     * @return builder
     */
    def persistentStorage(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.Builder]):
        com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.builder
      builder.persistentStorage(args(argsBuilder).build)

    /**
     * @param repositories The source repository that contains the branch to clone into the Dev Environment.
     * @return builder
     */
    def repositories(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.Builder]*):
        com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)
