package jp.ukiba.ko_pulumi
package aws

import com.pulumi.resources.CustomResourceOptions

object macie:
  /** Provides a resource to manage an [AWS Macie Custom Data Identifier](https://docs.aws.amazon.com/macie/latest/APIReference/custom-data-identifiers-id.html). */
  def CustomDataIdentifier(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.macie.CustomDataIdentifierArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.macie.CustomDataIdentifierArgs.builder
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
    com.pulumi.aws.macie.CustomDataIdentifier(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  /** Provides a resource to manage an [Amazon Macie Findings Filter](https://docs.aws.amazon.com/macie/latest/APIReference/findingsfilters-id.html). */
  def FindingsFilter(name: String, resourceOptions: Endofunction[CustomResourceOptions.Builder] = scala.Predef.identity)
      (args: Endofunction[com.pulumi.aws.macie.FindingsFilterArgs.Builder] = scala.Predef.identity)(using conf: KoPulumiConf) =
    var argsBuilder = com.pulumi.aws.macie.FindingsFilterArgs.builder
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
    com.pulumi.aws.macie.FindingsFilter(name,
        argsBuilder.build,
        resourceOptions(CustomResourceOptions.builder.protect(conf.defaultProtect)).build)

  extension (builder: com.pulumi.aws.macie.FindingsFilterArgs.Builder)
    /**
     * @param findingCriteria The criteria to use to filter findings.
     * @return builder
     */
    def findingCriteria(args: Endofunction[com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.macie.FindingsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder)
    /**
     * @param criterions A condition that specifies the property, operator, and one or more values to use to filter the results.  (documented below)
     * @return builder
     */
    def criterions(args: Endofunction[com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaCriterionArgs.Builder]*):
        com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaCriterionArgs.builder
      builder.criterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie.inputs.FindingsFilterState.Builder)
    /**
     * @param findingCriteria The criteria to use to filter findings.
     * @return builder
     */
    def findingCriteria(args: Endofunction[com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.macie.inputs.FindingsFilterState.Builder =
      val argsBuilder = com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)
