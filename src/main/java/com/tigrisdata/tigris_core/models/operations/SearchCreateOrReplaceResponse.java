/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class SearchCreateOrReplaceResponse implements com.tigrisdata.tigris_core.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * OK
     */
    private Optional<? extends com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse> createOrReplaceDocumentResponse;

    /**
     * Default error response
     */
    private Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public SearchCreateOrReplaceResponse(
            String contentType,
            Optional<? extends com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse> createOrReplaceDocumentResponse,
            Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(createOrReplaceDocumentResponse, "createOrReplaceDocumentResponse");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.createOrReplaceDocumentResponse = createOrReplaceDocumentResponse;
        this.status = status;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * OK
     */
    public Optional<? extends com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse> createOrReplaceDocumentResponse() {
        return createOrReplaceDocumentResponse;
    }

    /**
     * Default error response
     */
    public Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status() {
        return status;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public SearchCreateOrReplaceResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public SearchCreateOrReplaceResponse withCreateOrReplaceDocumentResponse(com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse createOrReplaceDocumentResponse) {
        Utils.checkNotNull(createOrReplaceDocumentResponse, "createOrReplaceDocumentResponse");
        this.createOrReplaceDocumentResponse = Optional.ofNullable(createOrReplaceDocumentResponse);
        return this;
    }

    /**
     * OK
     */
    public SearchCreateOrReplaceResponse withCreateOrReplaceDocumentResponse(Optional<? extends com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse> createOrReplaceDocumentResponse) {
        Utils.checkNotNull(createOrReplaceDocumentResponse, "createOrReplaceDocumentResponse");
        this.createOrReplaceDocumentResponse = createOrReplaceDocumentResponse;
        return this;
    }

    /**
     * Default error response
     */
    public SearchCreateOrReplaceResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Default error response
     */
    public SearchCreateOrReplaceResponse withStatus(Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public SearchCreateOrReplaceResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public SearchCreateOrReplaceResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchCreateOrReplaceResponse other = (SearchCreateOrReplaceResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.createOrReplaceDocumentResponse, other.createOrReplaceDocumentResponse) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            createOrReplaceDocumentResponse,
            status,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchCreateOrReplaceResponse.class,
                "contentType", contentType,
                "createOrReplaceDocumentResponse", createOrReplaceDocumentResponse,
                "status", status,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse> createOrReplaceDocumentResponse = Optional.empty();
 
        private Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * OK
         */
        public Builder createOrReplaceDocumentResponse(com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse createOrReplaceDocumentResponse) {
            Utils.checkNotNull(createOrReplaceDocumentResponse, "createOrReplaceDocumentResponse");
            this.createOrReplaceDocumentResponse = Optional.ofNullable(createOrReplaceDocumentResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder createOrReplaceDocumentResponse(Optional<? extends com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse> createOrReplaceDocumentResponse) {
            Utils.checkNotNull(createOrReplaceDocumentResponse, "createOrReplaceDocumentResponse");
            this.createOrReplaceDocumentResponse = createOrReplaceDocumentResponse;
            return this;
        }

        /**
         * Default error response
         */
        public Builder status(com.tigrisdata.tigris_core.models.shared.Status status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Default error response
         */
        public Builder status(Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public SearchCreateOrReplaceResponse build() {
            return new SearchCreateOrReplaceResponse(
                contentType,
                createOrReplaceDocumentResponse,
                status,
                statusCode,
                rawResponse);
        }
    }
}

