// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatement
    {
        /// <summary>
        /// Rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement? ByteMatchStatement;
        /// <summary>
        /// Rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement? GeoMatchStatement;
        /// <summary>
        /// Rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement? IpSetReferenceStatement;
        /// <summary>
        /// Rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement? LabelMatchStatement;
        /// <summary>
        /// Rule statement used to search web request components for a match against a single regular expression. See Regex Match Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexMatchStatement? RegexMatchStatement;
        /// <summary>
        /// Rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement? RegexPatternSetReferenceStatement;
        /// <summary>
        /// Rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement? SizeConstraintStatement;
        /// <summary>
        /// An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement? SqliMatchStatement;
        /// <summary>
        /// Rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
        /// </summary>
        public readonly Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement? XssMatchStatement;

        [OutputConstructor]
        private WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatement(
            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementByteMatchStatement? byteMatchStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementGeoMatchStatement? geoMatchStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement? ipSetReferenceStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementLabelMatchStatement? labelMatchStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexMatchStatement? regexMatchStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementRegexPatternSetReferenceStatement? regexPatternSetReferenceStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementSizeConstraintStatement? sizeConstraintStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementSqliMatchStatement? sqliMatchStatement,

            Outputs.WebAclRuleStatementAndStatementStatementNotStatementStatementNotStatementStatementXssMatchStatement? xssMatchStatement)
        {
            ByteMatchStatement = byteMatchStatement;
            GeoMatchStatement = geoMatchStatement;
            IpSetReferenceStatement = ipSetReferenceStatement;
            LabelMatchStatement = labelMatchStatement;
            RegexMatchStatement = regexMatchStatement;
            RegexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            SizeConstraintStatement = sizeConstraintStatement;
            SqliMatchStatement = sqliMatchStatement;
            XssMatchStatement = xssMatchStatement;
        }
    }
}
