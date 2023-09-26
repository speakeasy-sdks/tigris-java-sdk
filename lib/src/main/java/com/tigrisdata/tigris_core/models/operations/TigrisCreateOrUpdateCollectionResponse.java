/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class TigrisCreateOrUpdateCollectionResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public TigrisCreateOrUpdateCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionResponse createOrUpdateCollectionResponse;

    public TigrisCreateOrUpdateCollectionResponse withCreateOrUpdateCollectionResponse(com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionResponse createOrUpdateCollectionResponse) {
        this.createOrUpdateCollectionResponse = createOrUpdateCollectionResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public com.tigrisdata.tigris_core.models.shared.Status status;

    public TigrisCreateOrUpdateCollectionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public TigrisCreateOrUpdateCollectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public TigrisCreateOrUpdateCollectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public TigrisCreateOrUpdateCollectionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
