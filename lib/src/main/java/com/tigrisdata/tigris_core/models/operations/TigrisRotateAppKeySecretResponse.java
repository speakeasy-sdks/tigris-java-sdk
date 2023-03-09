package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisRotateAppKeySecretResponse {
    public String contentType;
    public TigrisRotateAppKeySecretResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.RotateAppKeyResponse rotateAppKeyResponse;
    public TigrisRotateAppKeySecretResponse withRotateAppKeyResponse(com.tigrisdata.tigris_core.models.shared.RotateAppKeyResponse rotateAppKeyResponse) {
        this.rotateAppKeyResponse = rotateAppKeyResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisRotateAppKeySecretResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisRotateAppKeySecretResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisRotateAppKeySecretResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
