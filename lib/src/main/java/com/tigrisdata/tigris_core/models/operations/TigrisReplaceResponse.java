package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class TigrisReplaceResponse {
    public String contentType;
    public TigrisReplaceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.ReplaceResponse replaceResponse;
    public TigrisReplaceResponse withReplaceResponse(com.tigrisdata.tigris_core.models.shared.ReplaceResponse replaceResponse) {
        this.replaceResponse = replaceResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public TigrisReplaceResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public TigrisReplaceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public TigrisReplaceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
