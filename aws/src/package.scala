package jp.ukiba.ko_pulumi.aws

// https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html
// Each managed policy has a single documented ID: the console attaches by name, and
// CloudFormation / the CLI / the API (so IaC) attach by this ID. The same IDs could be resolved
// at deploy time by `CloudfrontFunctions.getCachePolicy(_.name("Managed-CachingOptimized"))`,
// but the name lookup calls `ListCachePolicies` then `GetCachePolicy` on every preview/up and
// needs those IAM permissions.
// (Amplify Hosting's own policies, e.g. Amplify-Default, also have documented IDs, but the doc
// states they are only used by Amplify and recommends against attaching them.)
object CloudFrontManagedCachePolicy:
  val Amplify                                     = "2e54312d-136d-493c-8eb9-b001f22f67d2"
  val CachingDisabled                             = "4135ea2d-6df8-44a3-9df3-4b5a84be39ad"
  val CachingOptimized                            = "658327ea-f89d-4fab-a63d-7e88639e58f6"
  val CachingOptimizedForUncompressedObjects      = "b2884449-e4de-46a7-ac36-70bc7f1ddd6d"
  val `Elemental-MediaPackage`                    = "08627262-05a9-4f76-9ded-b50ca2e3a84f"
  val UseOriginCacheControlHeaders                = "83da9c7e-98b4-4e11-a168-04f0df8e2c65"
  val `UseOriginCacheControlHeaders-QueryStrings` = "4cc15a8a-d715-48a4-82b8-cc0b614638fe"

// https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-response-headers-policies.html
object CloudFrontManagedResponseHeadersPolicy:
  val `CORS-and-SecurityHeadersPolicy`                = "e61eb60c-9c35-4d20-a928-2b84e02af89c"
  val `CORS-With-Preflight`                           = "5cc3b908-e619-4b99-88e5-2cf7f45965bd"
  val `CORS-with-preflight-and-SecurityHeadersPolicy` = "eaab4381-ed33-4a86-88ca-d9558dc6cd63"
  val SecurityHeadersPolicy                           = "67f7725c-6f97-4210-82d7-5512b31e9d03"
  val SimpleCORS                                      = "60669652-455b-4ae9-85a4-c4c02393f86c"

// https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html
object CloudFrontManagedOriginRequestPolicy:
  val AllViewer                                     = "216adef6-5c7f-47e4-b989-5492eafa07d3"
  val `AllViewerAndCloudFrontHeaders-2022-06`       = "33f36d7e-f396-46d9-90e0-52428a34d9dc"
  val AllViewerExceptHostHeader                     = "b689b0a8-53d0-40ab-baf2-68738e2966ac" // API GW / Lambda URL origins
  val `CORS-CustomOrigin`                           = "59781a5b-3903-41f3-afcb-af62929ccde1"
  val `CORS-S3Origin`                               = "88a5eaf4-2fd4-4709-b370-b4c650ea3fcf"
  val `Elemental-MediaTailor-PersonalizedManifests` = "775133bc-15f2-49f9-abea-afb2e0bf67d2"
  val HostHeaderOnly                                = "bf0718e1-ba1e-49d1-88b1-f726733018ae"
  val UserAgentRefererHeaders                       = "acba4595-bd28-49b8-b9fe-13317c0390fa"

// https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html
object CloudFrontX:  // `X` avoid `Generated class jp.ukiba.ko_pulumi.aws.CloudFront$ differs only in case` warning
  /** Route 53 alias hosted zone ID; the AliasTarget reference says to specify exactly this
    * value for any CloudFront distribution. A Route 53 alias needs the ID of the AWS-managed
    * zone in which to resolve the target name; CloudFront is global, with every distribution
    * under the single suffix `*.cloudfront.net` served from one such zone -- hence one
    * constant ID, unlike per-region ELB/S3-website zones (aws partition; AWS China is a
    * separate system using `*.cloudfront.cn`). The `.hostedZoneId()` output of an in-stack
    * `Distribution` is this same hardcoded literal; use this constant for distributions
    * referenced as plain domain-name strings. */
  val HostedZoneId = "Z2FDTNDATAQYW2"

  /** Canonical user ID of the `awslogsdelivery` account, for the bucket ACL grant required by
    * legacy standard logging (v1) only; standard logging v2 delivers via CloudWatch vended
    * logs (bucket policy, no ACLs). Also available without an API call as
    * `CloudfrontFunctions.getLogDeliveryCanonicalUserId` (a provider-local constant).
    * aws partition; the cn partition uses a different canonical ID
    * (a52cb28745c0c06e84ec548334e44bfa7fc2a85c54af20cd59e4969344b7af56). */
  val LogDeliveryCanonicalUserId = "c4c1ede66af53448b93c283ce9448c4ba468c9432aa01d700d3878632f77d2d0"

// https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html
object GlobalAcceleratorX:  // `X` avoid `Generated class jp.ukiba.ko_pulumi.aws.CloudFront$ differs only in case` warning
  /** Route 53 alias hosted zone ID; one global constant for the same reason as CloudFront's
    * (single suffix `*.awsglobalaccelerator.com`). `Accelerator.hostedZoneId()` returns
    * this same literal. */
  val HostedZoneId = "Z2BJ6XQ5FK7U4H"
