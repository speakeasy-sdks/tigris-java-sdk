/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class TigrisUpdateResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public TigrisUpdateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public TigrisUpdateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public TigrisUpdateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public com.tigrisdata.tigris_core.models.shared.Status status;

    public TigrisUpdateResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.tigrisdata.tigris_core.models.shared.UpdateResponse updateResponse;

    public TigrisUpdateResponse withUpdateResponse(com.tigrisdata.tigris_core.models.shared.UpdateResponse updateResponse) {
        this.updateResponse = updateResponse;
        return this;
    }
    
    public TigrisUpdateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
