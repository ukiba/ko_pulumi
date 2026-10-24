package jp.ukiba.ko_pulumi
package aws

object codecatalyst_ext:
  extension (builder: com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder)
    /**
     * @param ides Information about the integrated development environment (IDE) configured for a Dev Environment.
     * @return builder
     */
    inline def ides(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.Builder]):
        com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.builder
      builder.ides(args(argsBuilder).build)

    /**
     * @param persistentStorage Information about the amount of storage allocated to the Dev Environment.
     * @return builder
     */
    inline def persistentStorage(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.Builder]):
        com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.builder
      builder.persistentStorage(args(argsBuilder).build)

    /**
     * @param repositories The source repository that contains the branch to clone into the Dev Environment.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.Builder]*):
        com.pulumi.aws.codecatalyst.DevEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder)
    /**
     * @param ides Information about the integrated development environment (IDE) configured for a Dev Environment.
     * @return builder
     */
    inline def ides(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.Builder]):
        com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentIdesArgs.builder
      builder.ides(args(argsBuilder).build)

    /**
     * @param persistentStorage Information about the amount of storage allocated to the Dev Environment.
     * @return builder
     */
    inline def persistentStorage(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.Builder]):
        com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder =
      val argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentPersistentStorageArgs.builder
      builder.persistentStorage(args(argsBuilder).build)

    /**
     * @param repositories The source repository that contains the branch to clone into the Dev Environment.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.Builder]*):
        com.pulumi.aws.codecatalyst.inputs.DevEnvironmentState.Builder =
      def argsBuilder = com.pulumi.aws.codecatalyst.inputs.DevEnvironmentRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.Builder)
    /**
     * @param repositories The source repository that contains the branch to clone into the Dev Environment.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentRepositoryArgs.Builder]*):
        com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentArgs.Builder =
      def argsBuilder = com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentRepositoryArgs.builder
      builder.repositories(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentPlainArgs.Builder)
    /**
     * @param repositories The source repository that contains the branch to clone into the Dev Environment.
     * @return builder
     */
    inline def repositories(args: Endofunction[com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentRepository.Builder]*):
        com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentPlainArgs.Builder =
      def argsBuilder = com.pulumi.aws.codecatalyst.inputs.GetDevEnvironmentRepository.builder
      builder.repositories(args.map(_(argsBuilder).build)*)
