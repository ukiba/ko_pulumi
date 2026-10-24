package jp.ukiba.ko_pulumi
package aws

object macie_ext:
  extension (builder: com.pulumi.aws.macie.FindingsFilterArgs.Builder)
    /**
     * @param findingCriteria Criteria to use to filter findings. See `findingCriteria` Block for details.
     * @return builder
     */
    def findingCriteria(args: Endofunction[com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.macie.FindingsFilterArgs.Builder =
      val argsBuilder = com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)

  extension (builder: com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder)
    /**
     * @param criterions Condition that specifies the property, operator, and one or more values to use to filter the results. See `criterion` Block for details.
     * @return builder
     */
    def criterions(args: Endofunction[com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaCriterionArgs.Builder]*):
        com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder =
      def argsBuilder = com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaCriterionArgs.builder
      builder.criterions(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.aws.macie.inputs.FindingsFilterState.Builder)
    /**
     * @param findingCriteria Criteria to use to filter findings. See `findingCriteria` Block for details.
     * @return builder
     */
    def findingCriteria(args: Endofunction[com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.Builder]):
        com.pulumi.aws.macie.inputs.FindingsFilterState.Builder =
      val argsBuilder = com.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaArgs.builder
      builder.findingCriteria(args(argsBuilder).build)
