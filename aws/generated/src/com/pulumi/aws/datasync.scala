package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object datasync:
  /**
   * Manages an NFS Location within AWS DataSync.
   *  
   *  &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
   */
  def NfsLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.NfsLocationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.NfsLocationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.NfsLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Resource for managing an AWS DataSync Location FSx Ontap File System. */
  def LocationFsxOntapFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.LocationFsxOntapFileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.LocationFsxOntapFileSystemArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.LocationFsxOntapFileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a SMB Location within AWS DataSync.
   *  
   *  &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
   */
  def LocationSmb(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.LocationSmbArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.LocationSmbArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.LocationSmb(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datasync.NfsLocationArgs.Builder)
    /**
     * @param mountOptions Configuration block containing mount options used by DataSync to access the NFS Server.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.aws.datasync.inputs.NfsLocationMountOptionsArgs.Builder]):
        com.pulumi.aws.datasync.NfsLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.NfsLocationMountOptionsArgs.builder
      builder.mountOptions(args(argsBuilder).build)

    /**
     * @param onPremConfig Configuration block containing information for connecting to the NFS File System.
     * @return builder
     */
    def onPremConfig(args: Endofunction[com.pulumi.aws.datasync.inputs.NfsLocationOnPremConfigArgs.Builder]):
        com.pulumi.aws.datasync.NfsLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.NfsLocationOnPremConfigArgs.builder
      builder.onPremConfig(args(argsBuilder).build)

  /**
   * Manages a Microsoft Azure Blob Storage Location within AWS DataSync.
   *  
   *  &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
   */
  def LocationAzureBlob(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.LocationAzureBlobArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.LocationAzureBlobArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.LocationAzureBlob(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an HDFS Location within AWS DataSync.
   *  
   *  &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
   */
  def LocationHdfs(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.LocationHdfsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.LocationHdfsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.LocationHdfs(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages an AWS DataSync EFS Location.
   *  
   *  &gt; **NOTE:** The EFS File System must have a mounted EFS Mount Target before creating this resource.
   */
  def EfsLocation(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.EfsLocationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.EfsLocationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.EfsLocation(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datasync.EfsLocationArgs.Builder)
    /**
     * @param ec2Config Configuration block containing EC2 configurations for connecting to the EFS File System.
     * @return builder
     */
    def ec2Config(args: Endofunction[com.pulumi.aws.datasync.inputs.EfsLocationEc2ConfigArgs.Builder]):
        com.pulumi.aws.datasync.EfsLocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.EfsLocationEc2ConfigArgs.builder
      builder.ec2Config(args(argsBuilder).build)

  /** Manages an AWS DataSync FSx Windows Location. */
  def LocationFsxWindows(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.LocationFsxWindowsArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.LocationFsxWindowsArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.LocationFsxWindows(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datasync.LocationHdfsArgs.Builder)
    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * @return builder
     */
    def nameNodes(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationHdfsNameNodeArgs.Builder]*):
        com.pulumi.aws.datasync.LocationHdfsArgs.Builder =
      def argsBuilder = com.pulumi.aws.datasync.inputs.LocationHdfsNameNodeArgs.builder
      builder.nameNodes(args.map(_(argsBuilder).build)*)

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If `qopConfiguration` isn&#39;t specified, `rpcProtection` and `dataTransferProtection` default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * @return builder
     */
    def qopConfiguration(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationHdfsQopConfigurationArgs.Builder]):
        com.pulumi.aws.datasync.LocationHdfsArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationHdfsQopConfigurationArgs.builder
      builder.qopConfiguration(args(argsBuilder).build)

  /** Manages an AWS DataSync FSx Lustre Location. */
  def LocationFsxLustre(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.LocationFsxLustreArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.LocationFsxLustreArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.LocationFsxLustre(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Manages a Object Storage Location within AWS DataSync.
   *  
   *  &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
   */
  def LocationObjectStorage(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.LocationObjectStorageArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.LocationObjectStorageArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.LocationObjectStorage(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datasync.LocationSmbArgs.Builder)
    /**
     * @param mountOptions Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationSmbMountOptionsArgs.Builder]):
        com.pulumi.aws.datasync.LocationSmbArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationSmbMountOptionsArgs.builder
      builder.mountOptions(args(argsBuilder).build)

  /**
   * Manages an AWS DataSync Agent deployed on premises.
   *  
   *  &gt; **NOTE:** One of `activationKey` or `ipAddress` must be provided for resource creation (agent activation). Neither is required for resource import. If using `ipAddress`, this provider must be able to make an HTTP (port 80) GET request to the specified IP address from where it is running. The agent will turn off that HTTP server after activation.
   */
  def Agent(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.AgentArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.AgentArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.Agent(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /** Manages an S3 Location within AWS DataSync. */
  def S3Location(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.S3LocationArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.S3LocationArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.S3Location(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datasync.TaskArgs.Builder)
    /**
     * @param excludes Filter rules that determines which files to exclude from a task.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskExcludesArgs.Builder]):
        com.pulumi.aws.datasync.TaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskExcludesArgs.builder
      builder.excludes(args(argsBuilder).build)

    /**
     * @param includes Filter rules that determines which files to include in a task.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskIncludesArgs.Builder]):
        com.pulumi.aws.datasync.TaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskIncludesArgs.builder
      builder.includes(args(argsBuilder).build)

    /**
     * @param options Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskOptionsArgs.Builder]):
        com.pulumi.aws.datasync.TaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a destination location.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskScheduleArgs.Builder]):
        com.pulumi.aws.datasync.TaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param taskReportConfig Configuration block containing the configuration of a DataSync Task Report. See `taskReportConfig` below.
     * @return builder
     */
    def taskReportConfig(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskTaskReportConfigArgs.Builder]):
        com.pulumi.aws.datasync.TaskArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskTaskReportConfigArgs.builder
      builder.taskReportConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.S3LocationArgs.Builder)
    /**
     * @param s3Config Configuration block containing information for connecting to S3.
     * @return builder
     */
    def s3Config(args: Endofunction[com.pulumi.aws.datasync.inputs.S3LocationS3ConfigArgs.Builder]):
        com.pulumi.aws.datasync.S3LocationArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.S3LocationS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  /** Manages an AWS DataSync Task, which represents a configuration for synchronization. Starting an execution of these DataSync Tasks (actually synchronizing files) is performed outside of this resource. */
  def Task(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.TaskArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.TaskArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.Task(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datasync.LocationFsxOntapFileSystemArgs.Builder)
    /**
     * @param protocol The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
     * @return builder
     */
    def protocol(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolArgs.Builder]):
        com.pulumi.aws.datasync.LocationFsxOntapFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolArgs.builder
      builder.protocol(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.FsxOpenZfsFileSystemArgs.Builder)
    /**
     * @param protocol The type of protocol that DataSync uses to access your file system. See below.
     * @return builder
     */
    def protocol(args: Endofunction[com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolArgs.Builder]):
        com.pulumi.aws.datasync.FsxOpenZfsFileSystemArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolArgs.builder
      builder.protocol(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.LocationAzureBlobArgs.Builder)
    /**
     * @param sasConfiguration The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
     * @return builder
     */
    def sasConfiguration(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationAzureBlobSasConfigurationArgs.Builder]):
        com.pulumi.aws.datasync.LocationAzureBlobArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationAzureBlobSasConfigurationArgs.builder
      builder.sasConfiguration(args(argsBuilder).build)

  /** Manages an AWS DataSync FSx OpenZfs Location. */
  def FsxOpenZfsFileSystem(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = identity)
      (args: Endofunction[com.pulumi.aws.datasync.FsxOpenZfsFileSystemArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.datasync.FsxOpenZfsFileSystemArgs.builder
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    
    com.pulumi.aws.datasync.FsxOpenZfsFileSystem(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.S3LocationState.Builder)
    /**
     * @param s3Config Configuration block containing information for connecting to S3.
     * @return builder
     */
    def s3Config(args: Endofunction[com.pulumi.aws.datasync.inputs.S3LocationS3ConfigArgs.Builder]):
        com.pulumi.aws.datasync.inputs.S3LocationState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.S3LocationS3ConfigArgs.builder
      builder.s3Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.LocationAzureBlobState.Builder)
    /**
     * @param sasConfiguration The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
     * @return builder
     */
    def sasConfiguration(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationAzureBlobSasConfigurationArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationAzureBlobState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationAzureBlobSasConfigurationArgs.builder
      builder.sasConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.LocationSmbState.Builder)
    /**
     * @param mountOptions Configuration block containing mount options used by DataSync to access the SMB Server. Can be `AUTOMATIC`, `SMB2`, or `SMB3`.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationSmbMountOptionsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationSmbState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationSmbMountOptionsArgs.builder
      builder.mountOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.NfsLocationState.Builder)
    /**
     * @param mountOptions Configuration block containing mount options used by DataSync to access the NFS Server.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.aws.datasync.inputs.NfsLocationMountOptionsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.NfsLocationState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.NfsLocationMountOptionsArgs.builder
      builder.mountOptions(args(argsBuilder).build)

    /**
     * @param onPremConfig Configuration block containing information for connecting to the NFS File System.
     * @return builder
     */
    def onPremConfig(args: Endofunction[com.pulumi.aws.datasync.inputs.NfsLocationOnPremConfigArgs.Builder]):
        com.pulumi.aws.datasync.inputs.NfsLocationState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.NfsLocationOnPremConfigArgs.builder
      builder.onPremConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.TaskTaskReportConfigArgs.Builder)
    /**
     * @param reportOverrides Configuration block containing the configuration of the reporting level for aspects of your task report. See `reportOverrides` below.
     * @return builder
     */
    def reportOverrides(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskTaskReportConfigReportOverridesArgs.Builder]):
        com.pulumi.aws.datasync.inputs.TaskTaskReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskTaskReportConfigReportOverridesArgs.builder
      builder.reportOverrides(args(argsBuilder).build)

    /**
     * @param s3Destination Configuration block containing the configuration for the Amazon S3 bucket where DataSync uploads your task report. See `s3Destination` below.
     * @return builder
     */
    def s3Destination(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskTaskReportConfigS3DestinationArgs.Builder]):
        com.pulumi.aws.datasync.inputs.TaskTaskReportConfigArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskTaskReportConfigS3DestinationArgs.builder
      builder.s3Destination(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.LocationHdfsState.Builder)
    /**
     * @param nameNodes The NameNode that manages the HDFS namespace. The NameNode performs operations such as opening, closing, and renaming files and directories. The NameNode contains the information to map blocks of data to the DataNodes. You can use only one NameNode. See configuration below.
     * @return builder
     */
    def nameNodes(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationHdfsNameNodeArgs.Builder]*):
        com.pulumi.aws.datasync.inputs.LocationHdfsState.Builder =
      def argsBuilder = com.pulumi.aws.datasync.inputs.LocationHdfsNameNodeArgs.builder
      builder.nameNodes(args.map(_(argsBuilder).build)*)

    /**
     * @param qopConfiguration The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. If `qopConfiguration` isn&#39;t specified, `rpcProtection` and `dataTransferProtection` default to `PRIVACY`. If you set RpcProtection or DataTransferProtection, the other parameter assumes the same value.  See configuration below.
     * @return builder
     */
    def qopConfiguration(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationHdfsQopConfigurationArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationHdfsState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationHdfsQopConfigurationArgs.builder
      builder.qopConfiguration(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.TaskState.Builder)
    /**
     * @param excludes Filter rules that determines which files to exclude from a task.
     * @return builder
     */
    def excludes(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskExcludesArgs.Builder]):
        com.pulumi.aws.datasync.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskExcludesArgs.builder
      builder.excludes(args(argsBuilder).build)

    /**
     * @param includes Filter rules that determines which files to include in a task.
     * @return builder
     */
    def includes(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskIncludesArgs.Builder]):
        com.pulumi.aws.datasync.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskIncludesArgs.builder
      builder.includes(args(argsBuilder).build)

    /**
     * @param options Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
     * @return builder
     */
    def options(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskOptionsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskOptionsArgs.builder
      builder.options(args(argsBuilder).build)

    /**
     * @param schedule Specifies a schedule used to periodically transfer files from a source to a destination location.
     * @return builder
     */
    def schedule(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskScheduleArgs.Builder]):
        com.pulumi.aws.datasync.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskScheduleArgs.builder
      builder.schedule(args(argsBuilder).build)

    /**
     * @param taskReportConfig Configuration block containing the configuration of a DataSync Task Report. See `taskReportConfig` below.
     * @return builder
     */
    def taskReportConfig(args: Endofunction[com.pulumi.aws.datasync.inputs.TaskTaskReportConfigArgs.Builder]):
        com.pulumi.aws.datasync.inputs.TaskState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.TaskTaskReportConfigArgs.builder
      builder.taskReportConfig(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.EfsLocationState.Builder)
    /**
     * @param ec2Config Configuration block containing EC2 configurations for connecting to the EFS File System.
     * @return builder
     */
    def ec2Config(args: Endofunction[com.pulumi.aws.datasync.inputs.EfsLocationEc2ConfigArgs.Builder]):
        com.pulumi.aws.datasync.inputs.EfsLocationState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.EfsLocationEc2ConfigArgs.builder
      builder.ec2Config(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolSmbArgs.Builder)
    /**
     * @param mountOptions Mount options that are available for DataSync to access an SMB location. See SMB Mount Options below.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolSmbMountOptionsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolSmbArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolSmbMountOptionsArgs.builder
      builder.mountOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolNfsArgs.Builder)
    /**
     * @param mountOptions Represents the mount options that are available for DataSync to access an NFS location. See below.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolNfsMountOptionsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolNfsArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolNfsMountOptionsArgs.builder
      builder.mountOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolNfsArgs.Builder)
    /**
     * @param mountOptions Mount options that are available for DataSync to access an NFS location. See NFS Mount Options below.
     * @return builder
     */
    def mountOptions(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolNfsMountOptionsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolNfsArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolNfsMountOptionsArgs.builder
      builder.mountOptions(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemState.Builder)
    /**
     * @param protocol The type of protocol that DataSync uses to access your file system. See below.
     * @return builder
     */
    def protocol(args: Endofunction[com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolArgs.Builder]):
        com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolArgs.builder
      builder.protocol(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolArgs.Builder)
    /**
     * @param nfs Represents the Network File System (NFS) protocol that DataSync uses to access your FSx for OpenZFS file system. See below.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolNfsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.FsxOpenZfsFileSystemProtocolNfsArgs.builder
      builder.nfs(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemState.Builder)
    /**
     * @param protocol The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
     * @return builder
     */
    def protocol(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemState.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolArgs.builder
      builder.protocol(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolArgs.Builder)
    /**
     * @param nfs Network File System (NFS) protocol that DataSync uses to access your FSx ONTAP file system. See NFS below.
     * @return builder
     */
    def nfs(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolNfsArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolNfsArgs.builder
      builder.nfs(args(argsBuilder).build)

    /**
     * @param smb Server Message Block (SMB) protocol that DataSync uses to access your FSx ONTAP file system. See [SMB] (#smb) below.
     * @return builder
     */
    def smb(args: Endofunction[com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolSmbArgs.Builder]):
        com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolArgs.Builder =
      val argsBuilder = com.pulumi.aws.datasync.inputs.LocationFsxOntapFileSystemProtocolSmbArgs.builder
      builder.smb(args(argsBuilder).build)
