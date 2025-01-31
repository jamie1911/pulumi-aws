// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig;
import com.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig;
import com.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOrigin {
    /**
     * @return Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs;
    /**
     * @return A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    private Boolean enableAcceptEncodingBrotli;
    /**
     * @return A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    private Boolean enableAcceptEncodingGzip;
    /**
     * @return Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs;
    /**
     * @return Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs;

    private GetCachePolicyParametersInCacheKeyAndForwardedToOrigin() {}
    /**
     * @return Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs() {
        return this.cookiesConfigs;
    }
    /**
     * @return A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    public Boolean enableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli;
    }
    /**
     * @return A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    public Boolean enableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }
    /**
     * @return Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs() {
        return this.headersConfigs;
    }
    /**
     * @return Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs() {
        return this.queryStringsConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs;
        private Boolean enableAcceptEncodingBrotli;
        private Boolean enableAcceptEncodingGzip;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs;
        public Builder() {}
        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfigs = defaults.cookiesConfigs;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfigs = defaults.headersConfigs;
    	      this.queryStringsConfigs = defaults.queryStringsConfigs;
        }

        @CustomType.Setter
        public Builder cookiesConfigs(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs) {
            this.cookiesConfigs = Objects.requireNonNull(cookiesConfigs);
            return this;
        }
        public Builder cookiesConfigs(GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig... cookiesConfigs) {
            return cookiesConfigs(List.of(cookiesConfigs));
        }
        @CustomType.Setter
        public Builder enableAcceptEncodingBrotli(Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = Objects.requireNonNull(enableAcceptEncodingBrotli);
            return this;
        }
        @CustomType.Setter
        public Builder enableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip);
            return this;
        }
        @CustomType.Setter
        public Builder headersConfigs(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs) {
            this.headersConfigs = Objects.requireNonNull(headersConfigs);
            return this;
        }
        public Builder headersConfigs(GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig... headersConfigs) {
            return headersConfigs(List.of(headersConfigs));
        }
        @CustomType.Setter
        public Builder queryStringsConfigs(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs) {
            this.queryStringsConfigs = Objects.requireNonNull(queryStringsConfigs);
            return this;
        }
        public Builder queryStringsConfigs(GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig... queryStringsConfigs) {
            return queryStringsConfigs(List.of(queryStringsConfigs));
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOrigin build() {
            final var o = new GetCachePolicyParametersInCacheKeyAndForwardedToOrigin();
            o.cookiesConfigs = cookiesConfigs;
            o.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            o.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
            o.headersConfigs = headersConfigs;
            o.queryStringsConfigs = queryStringsConfigs;
            return o;
        }
    }
}
