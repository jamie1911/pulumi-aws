// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch;
import com.pulumi.aws.wafv2.outputs.WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatement {
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    private List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;

    private WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatement() {}
    /**
     * @return Part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;
        public Builder() {}
        public Builder(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        @CustomType.Setter
        public Builder fieldToMatch(@Nullable WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        @CustomType.Setter
        public Builder textTransformations(List<WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }
        public WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatement build() {
            final var o = new WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatement();
            o.fieldToMatch = fieldToMatch;
            o.textTransformations = textTransformations;
            return o;
        }
    }
}
