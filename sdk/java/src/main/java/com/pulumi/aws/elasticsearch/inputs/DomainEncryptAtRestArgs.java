// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainEncryptAtRestArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainEncryptAtRestArgs Empty = new DomainEncryptAtRestArgs();

    /**
     * Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `elasticsearch_version` of `6.0` or greater.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `elasticsearch_version` of `6.0` or greater.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * KMS key ARN to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key. Note that KMS will accept a KMS key ID but will return the key ARN. To prevent the provider detecting unwanted changes, use the key ARN instead.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return KMS key ARN to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key. Note that KMS will accept a KMS key ID but will return the key ARN. To prevent the provider detecting unwanted changes, use the key ARN instead.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    private DomainEncryptAtRestArgs() {}

    private DomainEncryptAtRestArgs(DomainEncryptAtRestArgs $) {
        this.enabled = $.enabled;
        this.kmsKeyId = $.kmsKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainEncryptAtRestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainEncryptAtRestArgs $;

        public Builder() {
            $ = new DomainEncryptAtRestArgs();
        }

        public Builder(DomainEncryptAtRestArgs defaults) {
            $ = new DomainEncryptAtRestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `elasticsearch_version` of `6.0` or greater.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable node-to-node encryption. If the `node_to_node_encryption` block is not provided then this defaults to `false`. Enabling node-to-node encryption of a new domain requires an `elasticsearch_version` of `6.0` or greater.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param kmsKeyId KMS key ARN to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key. Note that KMS will accept a KMS key ID but will return the key ARN. To prevent the provider detecting unwanted changes, use the key ARN instead.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId KMS key ARN to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key. Note that KMS will accept a KMS key ID but will return the key ARN. To prevent the provider detecting unwanted changes, use the key ARN instead.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public DomainEncryptAtRestArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
