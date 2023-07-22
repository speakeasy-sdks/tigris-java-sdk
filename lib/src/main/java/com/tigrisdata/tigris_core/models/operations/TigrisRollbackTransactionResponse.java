/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class TigrisRollbackTransactionResponse {
    
    public String contentType;

    public TigrisRollbackTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.tigrisdata.tigris_core.models.shared.RollbackTransactionResponse rollbackTransactionResponse;

    public TigrisRollbackTransactionResponse withRollbackTransactionResponse(com.tigrisdata.tigris_core.models.shared.RollbackTransactionResponse rollbackTransactionResponse) {
        this.rollbackTransactionResponse = rollbackTransactionResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public com.tigrisdata.tigris_core.models.shared.Status status;

    public TigrisRollbackTransactionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    
    public Integer statusCode;

    public TigrisRollbackTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public TigrisRollbackTransactionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public TigrisRollbackTransactionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
