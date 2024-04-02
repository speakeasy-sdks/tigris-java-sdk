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


public class TigrisUpdateResponse implements com.tigrisdata.tigris_core.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

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

    /**
     * OK
     */
    private Optional<? extends com.tigrisdata.tigris_core.models.shared.UpdateResponse> updateResponse;

    public TigrisUpdateResponse(
            String contentType,
            Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.tigrisdata.tigris_core.models.shared.UpdateResponse> updateResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(updateResponse, "updateResponse");
        this.contentType = contentType;
        this.status = status;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.updateResponse = updateResponse;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
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

    /**
     * OK
     */
    public Optional<? extends com.tigrisdata.tigris_core.models.shared.UpdateResponse> updateResponse() {
        return updateResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public TigrisUpdateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public TigrisUpdateResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Default error response
     */
    public TigrisUpdateResponse withStatus(Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public TigrisUpdateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public TigrisUpdateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public TigrisUpdateResponse withUpdateResponse(com.tigrisdata.tigris_core.models.shared.UpdateResponse updateResponse) {
        Utils.checkNotNull(updateResponse, "updateResponse");
        this.updateResponse = Optional.ofNullable(updateResponse);
        return this;
    }

    /**
     * OK
     */
    public TigrisUpdateResponse withUpdateResponse(Optional<? extends com.tigrisdata.tigris_core.models.shared.UpdateResponse> updateResponse) {
        Utils.checkNotNull(updateResponse, "updateResponse");
        this.updateResponse = updateResponse;
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
        TigrisUpdateResponse other = (TigrisUpdateResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.updateResponse, other.updateResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            status,
            statusCode,
            rawResponse,
            updateResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TigrisUpdateResponse.class,
                "contentType", contentType,
                "status", status,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "updateResponse", updateResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends com.tigrisdata.tigris_core.models.shared.Status> status = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.tigrisdata.tigris_core.models.shared.UpdateResponse> updateResponse = Optional.empty();  
        
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

        /**
         * OK
         */
        public Builder updateResponse(com.tigrisdata.tigris_core.models.shared.UpdateResponse updateResponse) {
            Utils.checkNotNull(updateResponse, "updateResponse");
            this.updateResponse = Optional.ofNullable(updateResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder updateResponse(Optional<? extends com.tigrisdata.tigris_core.models.shared.UpdateResponse> updateResponse) {
            Utils.checkNotNull(updateResponse, "updateResponse");
            this.updateResponse = updateResponse;
            return this;
        }
        
        public TigrisUpdateResponse build() {
            return new TigrisUpdateResponse(
                contentType,
                status,
                statusCode,
                rawResponse,
                updateResponse);
        }
    }
}
