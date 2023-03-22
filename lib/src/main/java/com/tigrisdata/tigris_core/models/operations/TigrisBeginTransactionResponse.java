/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisBeginTransactionResponse {
    /**
     * OK
     */
    public com.tigrisdata.tigris_core.models.shared.BeginTransactionResponse beginTransactionResponse;
    public TigrisBeginTransactionResponse withBeginTransactionResponse(com.tigrisdata.tigris_core.models.shared.BeginTransactionResponse beginTransactionResponse) {
        this.beginTransactionResponse = beginTransactionResponse;
        return this;
    }
    
    public String contentType;
    public TigrisBeginTransactionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Default error response
     */
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisBeginTransactionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisBeginTransactionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisBeginTransactionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
