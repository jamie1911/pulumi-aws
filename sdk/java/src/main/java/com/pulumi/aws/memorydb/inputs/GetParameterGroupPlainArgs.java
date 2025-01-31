// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetParameterGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetParameterGroupPlainArgs Empty = new GetParameterGroupPlainArgs();

    /**
     * Name of the parameter group.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the parameter group.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Map of tags assigned to the parameter group.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Map of tags assigned to the parameter group.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetParameterGroupPlainArgs() {}

    private GetParameterGroupPlainArgs(GetParameterGroupPlainArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetParameterGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetParameterGroupPlainArgs $;

        public Builder() {
            $ = new GetParameterGroupPlainArgs();
        }

        public Builder(GetParameterGroupPlainArgs defaults) {
            $ = new GetParameterGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags Map of tags assigned to the parameter group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetParameterGroupPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
