package jp.ukiba.ko_pulumi
package gcp

object datacatalog_ext:
  extension (builder: com.pulumi.gcp.datacatalog.EntryArgs.Builder)
    /**
     * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * @return builder
     */
    inline def gcsFilesetSpec(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder]):
        com.pulumi.gcp.datacatalog.EntryArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.builder
      builder.gcsFilesetSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.EntryGroupIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.EntryGroupIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.PolicyTagIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.PolicyTagIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TagArgs.Builder)
    /**
     * @param fields This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * @return builder
     */
    inline def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.TagArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.TagTemplateArgs.Builder)
    /**
     * @param fields Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields. The change of fieldId will be resulting in re-creating of field. The change of primitiveType will be resulting in re-creating of field, however if the field is a required, you cannot update it.
     * Structure is documented below.
     * @return builder
     */
    inline def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.TagTemplateArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TagTemplateIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TagTemplateIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TaxonomyIamBindingArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.TaxonomyIamMemberArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder)
    /**
     * @param tableSpecs (Output)
     * Spec of a BigQuery table. This field should only be populated if tableSourceType is BIGQUERY_TABLE.
     * Structure is documented below.
     * @return builder
     */
    inline def tableSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecTableSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecTableSpecArgs.builder
      builder.tableSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param viewSpecs (Output)
     * Table view specification. This field should only be populated if tableSourceType is BIGQUERY_VIEW.
     * Structure is documented below.
     * @return builder
     */
    inline def viewSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecViewSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecViewSpecArgs.builder
      builder.viewSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder)
    /**
     * @param sampleGcsFileSpecs (Output)
     * Sample files contained in this fileset, not all files contained in this fileset are represented here.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nestedGcsFilesetSpecSampleGcsFileSpecs&#34;&gt;&lt;/a&gt;The `sampleGcsFileSpecs` block contains:
     * @return builder
     */
    inline def sampleGcsFileSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecSampleGcsFileSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecSampleGcsFileSpecArgs.builder
      builder.sampleGcsFileSpecs(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.EntryState.Builder)
    /**
     * @param bigqueryDateShardedSpecs Specification for a group of BigQuery tables with name pattern [prefix]YYYYMMDD.
     * Context: https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryDateShardedSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryDateShardedSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryDateShardedSpecArgs.builder
      builder.bigqueryDateShardedSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param bigqueryTableSpecs Specification that applies to a BigQuery table. This is only valid on entries of type TABLE.
     * Structure is documented below.
     * @return builder
     */
    inline def bigqueryTableSpecs(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.EntryState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecArgs.builder
      builder.bigqueryTableSpecs(args.map(_(argsBuilder).build)*)

    /**
     * @param gcsFilesetSpec Specification that applies to a Cloud Storage fileset. This is only valid on entries of type FILESET.
     * Structure is documented below.
     * @return builder
     */
    inline def gcsFilesetSpec(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.EntryState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.EntryGcsFilesetSpecArgs.builder
      builder.gcsFilesetSpec(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.PolicyTagIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagState.Builder)
    /**
     * @param fields This maps the ID of a tag field to the value of and additional information about that field.
     * Valid field IDs are defined by the tag&#39;s template. A tag must have at least 1 field and at most 500 fields.
     * Structure is documented below.
     * @return builder
     */
    inline def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.TagState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder)
    /**
     * @param type The type of value this tag field can contain.
     * Structure is documented below.
     * @return builder
     */
    inline def `type`(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.builder
      builder.`type`(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.Builder)
    /**
     * @param enumType Represents an enum type.
     * Exactly one of `primitiveType` or `enumType` must be set
     * Structure is documented below.
     * @return builder
     */
    inline def enumType(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeArgs.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.builder
      builder.enumType(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.Builder)
    /**
     * @param allowedValues The set of allowed values for this enum. The display names of the
     * values must be case-insensitively unique within this set. Currently,
     * enum values can only be added to the list of allowed values. Deletion
     * and renaming of enum values are not supported.
     * Can have up to 500 allowed values.
     * Structure is documented below.
     * @return builder
     */
    inline def allowedValues(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeAllowedValueArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeArgs.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeAllowedValueArgs.builder
      builder.allowedValues(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TagTemplateState.Builder)
    /**
     * @param fields Set of tag template field IDs and the settings for the field. This set is an exhaustive list of the allowed fields. This set must contain at least one field and at most 500 fields. The change of fieldId will be resulting in re-creating of field. The change of primitiveType will be resulting in re-creating of field, however if the field is a required, you cannot update it.
     * Structure is documented below.
     * @return builder
     */
    inline def fields(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.Builder]*):
        com.pulumi.gcp.datacatalog.inputs.TagTemplateState.Builder =
      def argsBuilder = com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldArgs.builder
      builder.fields(args.map(_(argsBuilder).build)*)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamBindingConditionArgs.builder
      builder.condition(args(argsBuilder).build)

  extension (builder: com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberState.Builder)
    inline def condition(args: Endofunction[com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.Builder]):
        com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberState.Builder =
      val argsBuilder = com.pulumi.gcp.datacatalog.inputs.TaxonomyIamMemberConditionArgs.builder
      builder.condition(args(argsBuilder).build)
