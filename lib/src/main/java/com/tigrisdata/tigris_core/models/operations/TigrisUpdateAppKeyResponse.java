package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisUpdateAppKeyResponse {
    public String contentType;
    public TigrisUpdateAppKeyResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public TigrisUpdateAppKeyResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisUpdateAppKeyResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisUpdateAppKeyResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.UpdateAppKeyResponse updateAppKeyResponse;
    public TigrisUpdateAppKeyResponse withUpdateAppKeyResponse(com.tigrisdata.tigris_core.models.shared.UpdateAppKeyResponse updateAppKeyResponse) {
        this.updateAppKeyResponse = updateAppKeyResponse;
        return this;
    }
    
}
