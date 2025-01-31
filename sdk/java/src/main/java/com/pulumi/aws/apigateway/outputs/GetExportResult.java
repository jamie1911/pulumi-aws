// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetExportResult {
    private @Nullable String accepts;
    /**
     * @return API Spec.
     * 
     */
    private String body;
    /**
     * @return Content-disposition header value in the HTTP response.
     * 
     */
    private String contentDisposition;
    /**
     * @return Content-type header value in the HTTP response.
     * 
     */
    private String contentType;
    private String exportType;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Map<String,String> parameters;
    private String restApiId;
    private String stageName;

    private GetExportResult() {}
    public Optional<String> accepts() {
        return Optional.ofNullable(this.accepts);
    }
    /**
     * @return API Spec.
     * 
     */
    public String body() {
        return this.body;
    }
    /**
     * @return Content-disposition header value in the HTTP response.
     * 
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }
    /**
     * @return Content-type header value in the HTTP response.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    public String exportType() {
        return this.exportType;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public String restApiId() {
        return this.restApiId;
    }
    public String stageName() {
        return this.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accepts;
        private String body;
        private String contentDisposition;
        private String contentType;
        private String exportType;
        private String id;
        private @Nullable Map<String,String> parameters;
        private String restApiId;
        private String stageName;
        public Builder() {}
        public Builder(GetExportResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepts = defaults.accepts;
    	      this.body = defaults.body;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentType = defaults.contentType;
    	      this.exportType = defaults.exportType;
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
    	      this.restApiId = defaults.restApiId;
    	      this.stageName = defaults.stageName;
        }

        @CustomType.Setter
        public Builder accepts(@Nullable String accepts) {
            this.accepts = accepts;
            return this;
        }
        @CustomType.Setter
        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        @CustomType.Setter
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = Objects.requireNonNull(contentDisposition);
            return this;
        }
        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        @CustomType.Setter
        public Builder exportType(String exportType) {
            this.exportType = Objects.requireNonNull(exportType);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder restApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        @CustomType.Setter
        public Builder stageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }
        public GetExportResult build() {
            final var o = new GetExportResult();
            o.accepts = accepts;
            o.body = body;
            o.contentDisposition = contentDisposition;
            o.contentType = contentType;
            o.exportType = exportType;
            o.id = id;
            o.parameters = parameters;
            o.restApiId = restApiId;
            o.stageName = stageName;
            return o;
        }
    }
}
