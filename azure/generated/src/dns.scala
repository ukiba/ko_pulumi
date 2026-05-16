package jp.ukiba.ko_pulumi
package azure

import com.pulumi.resources.CustomResourceOptions

object dns:
  extension (builder: com.pulumi.azure.dns.TxtRecordArgs.Builder)
    /**
     * @param records A list of values that make up the txt record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.TxtRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.TxtRecordArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Enables you to manage DNS NS Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def NsRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.NsRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.NsRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.NsRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables you to manage DNS CNAME Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def CNameRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.CNameRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.CNameRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.CNameRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables you to manage DNS AAAA Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def AaaaRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.AaaaRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.AaaaRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.AaaaRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dns.SrvRecordArgs.Builder)
    /**
     * @param records A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.SrvRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.SrvRecordArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dns.ZoneArgs.Builder)
    /**
     * @param soaRecord A `soaRecord` block as defined below.
     * @return builder
     */
    def soaRecord(args: Endofunction[com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.dns.ZoneArgs.Builder =
      val argsBuilder = com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.ZoneArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Enables you to manage DNS MX Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def MxRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.MxRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.MxRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.MxRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dns.MxRecordArgs.Builder)
    /**
     * @param records A list of values that make up the MX record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.MxRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.MxRecordArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Enables you to manage DNS A Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def ARecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.ARecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.ARecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.ARecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dns.CaaRecordArgs.Builder)
    /**
     * @param records A list of values that make up the CAA record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.CaaRecordArgs.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.CaaRecordArgs.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  /**
   * Enables you to manage DNS SRV Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def SrvRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.SrvRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.SrvRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.SrvRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables you to manage DNS PTR Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def PtrRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.PtrRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.PtrRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.PtrRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables you to manage DNS CAA Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def CaaRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.CaaRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.CaaRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.CaaRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  /**
   * Enables you to manage DNS TXT Records within Azure DNS.
   * 
   *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
   */
  def TxtRecord(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.TxtRecordArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.TxtRecordArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.TxtRecord(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  object DnsFunctions:
    // Pulumi methods are reproduced as Scala methods.
    // Java methods cause Scala warnings under -Yexplicit-nulls flag
    // when the return value is assigned to class member without explicit type, e.g.:
    //
    //     value foo exposes a flexible type in its inferred result type com.pulumi.core.Output[(String)?]. Consider annotating the type explicitly

    /**
     * Use this data source to access information about an existing DNS AAAA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getAAAARecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetAAAARecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetAAAARecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetAAAARecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getAAAARecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS AAAA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getAAAARecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetAAAARecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetAAAARecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetAAAARecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getAAAARecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS A Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getARecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetARecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetARecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetARecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getARecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS A Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getARecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetARecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetARecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetARecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getARecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS CAA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getCAARecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetCAARecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetCAARecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetCAARecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getCAARecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS CAA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getCAARecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetCAARecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetCAARecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetCAARecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getCAARecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS CNAME Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getCnameRecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetCnameRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetCnameRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetCnameRecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getCnameRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS CNAME Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getCnameRecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetCnameRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetCnameRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetCnameRecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getCnameRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS MX Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getMxRecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetMxRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetMxRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetMxRecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getMxRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS MX Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getMxRecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetMxRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetMxRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetMxRecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getMxRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS NS Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getNsRecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetNsRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetNsRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetNsRecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getNsRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS NS Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getNsRecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetNsRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetNsRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetNsRecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getNsRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS PTR Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getPtrRecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetPtrRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetPtrRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetPtrRecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getPtrRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS PTR Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getPtrRecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetPtrRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetPtrRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetPtrRecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getPtrRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS SOA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getSoaRecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetSoaRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetSoaRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetSoaRecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getSoaRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS SOA Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getSoaRecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetSoaRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetSoaRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetSoaRecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getSoaRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS SRV Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getSrvRecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetSrvRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetSrvRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetSrvRecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getSrvRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS SRV Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getSrvRecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetSrvRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetSrvRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetSrvRecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getSrvRecordPlain(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS TXT Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getTxtRecord(args: Endofunction[com.pulumi.azure.dns.inputs.GetTxtRecordArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetTxtRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetTxtRecordArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getTxtRecord(args(argsBuilder).build)

    /**
     * Use this data source to access information about an existing DNS TXT Record within Azure DNS.
     * 
     *  &gt; **Note:** [The Azure DNS API has a throttle limit of 500 read (GET) operations per 5 minutes](https://docs.microsoft.com/azure/azure-resource-manager/management/request-limits-and-throttling#network-throttling) - whilst the default read timeouts will work for most cases - in larger configurations you may need to set a larger read timeout then the default 5min. Although, we&#39;d generally recommend that you split the resources out into smaller Terraform configurations to avoid the problem entirely.
     */
    inline def getTxtRecordPlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetTxtRecordPlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetTxtRecordResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetTxtRecordPlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getTxtRecordPlain(args(argsBuilder).build)

    /** Use this data source to access information about an existing DNS Zone. */
    inline def getZone(args: Endofunction[com.pulumi.azure.dns.inputs.GetZoneArgs.Builder] = scala.Predef.identity):
        com.pulumi.core.Output[com.pulumi.azure.dns.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetZoneArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getZone(args(argsBuilder).build)

    /** Use this data source to access information about an existing DNS Zone. */
    inline def getZonePlain(args: Endofunction[com.pulumi.azure.dns.inputs.GetZonePlainArgs.Builder] = scala.Predef.identity):
        java.util.concurrent.CompletableFuture[com.pulumi.azure.dns.outputs.GetZoneResult] =
      val argsBuilder = com.pulumi.azure.dns.inputs.GetZonePlainArgs.builder
      com.pulumi.azure.dns.DnsFunctions.getZonePlain(args(argsBuilder).build)

  /** Enables you to manage DNS zones within Azure DNS. These zones are hosted on Azure&#39;s name servers to which you can delegate the zone from the parent domain. */
  def Zone(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.azure.dns.ZoneArgs.Builder])(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.azure.dns.ZoneArgs.builder
    conf.logicalName2pysicalName(name) match
      case Some(physicalName) => argsBuilder = argsBuilder.name(physicalName)
      case None               =>
    conf.logicalName2tagName(name) match
      case Some(tagName) => argsBuilder = argsBuilder.tags(java.util.Map.of("Name", tagName))
      case None          =>
    com.pulumi.azure.dns.Zone(name,
        args(argsBuilder).build,
        resourceOptions(CustomResourceOptions.builder).build)

  extension (builder: com.pulumi.azure.dns.inputs.MxRecordState.Builder)
    /**
     * @param records A list of values that make up the MX record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.MxRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.MxRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.MxRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.inputs.MxRecordState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dns.inputs.ZoneState.Builder)
    /**
     * @param soaRecord A `soaRecord` block as defined below.
     * @return builder
     */
    def soaRecord(args: Endofunction[com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.Builder]):
        com.pulumi.azure.dns.inputs.ZoneState.Builder =
      val argsBuilder = com.pulumi.azure.dns.inputs.ZoneSoaRecordArgs.builder
      builder.soaRecord(args(argsBuilder).build)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.inputs.ZoneState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dns.inputs.SrvRecordState.Builder)
    /**
     * @param records A list of values that make up the SRV record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.SrvRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.SrvRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.inputs.SrvRecordState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dns.inputs.TxtRecordState.Builder)
    /**
     * @param records A list of values that make up the txt record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.TxtRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.TxtRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.inputs.TxtRecordState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))

  extension (builder: com.pulumi.azure.dns.inputs.CaaRecordState.Builder)
    /**
     * @param records A list of values that make up the CAA record. Each `record` block supports fields documented below.
     * @return builder
     */
    def records(args: Endofunction[com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.Builder]*):
        com.pulumi.azure.dns.inputs.CaaRecordState.Builder =
      def argsBuilder = com.pulumi.azure.dns.inputs.CaaRecordRecordArgs.builder
      builder.records(args.map(_(argsBuilder).build)*)

    def mapTags(fn: Endofunction[Map[String, String]]):
        com.pulumi.azure.dns.inputs.CaaRecordState.Builder =
      builder.tags(transformOptOutputMap(builder.build.tags, fn))
