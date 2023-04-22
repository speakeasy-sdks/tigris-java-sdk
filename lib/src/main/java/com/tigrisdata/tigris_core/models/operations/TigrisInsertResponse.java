/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class TigrisInsertResponse {
    
    public String contentType;
    public TigrisInsertResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.tigrisdata.tigris_core.models.shared.InsertResponse insertResponse;
    public TigrisInsertResponse withInsertResponse(com.tigrisdata.tigris_core.models.shared.InsertResponse insertResponse) {
        this.insertResponse = insertResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisInsertResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    
    public Integer statusCode;
    public TigrisInsertResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisInsertResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    

    public TigrisInsertResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}
