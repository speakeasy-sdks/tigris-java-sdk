/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class TigrisListCollectionsResponse {
    
    public String contentType;

    public TigrisListCollectionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.tigrisdata.tigris_core.models.shared.ListCollectionsResponse listCollectionsResponse;

    public TigrisListCollectionsResponse withListCollectionsResponse(com.tigrisdata.tigris_core.models.shared.ListCollectionsResponse listCollectionsResponse) {
        this.listCollectionsResponse = listCollectionsResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public com.tigrisdata.tigris_core.models.shared.Status status;

    public TigrisListCollectionsResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    
    public Integer statusCode;

    public TigrisListCollectionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public TigrisListCollectionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public TigrisListCollectionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
