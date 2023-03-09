package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchCreateByIdResponse {
    public String contentType;
    public SearchCreateByIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.CreateByIdResponse createByIdResponse;
    public SearchCreateByIdResponse withCreateByIdResponse(com.tigrisdata.tigris_core.models.shared.CreateByIdResponse createByIdResponse) {
        this.createByIdResponse = createByIdResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchCreateByIdResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchCreateByIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchCreateByIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
