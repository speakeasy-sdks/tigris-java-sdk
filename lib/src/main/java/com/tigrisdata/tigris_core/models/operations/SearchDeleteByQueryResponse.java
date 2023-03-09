package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class SearchDeleteByQueryResponse {
    public String contentType;
    public SearchDeleteByQueryResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.DeleteByQueryResponse deleteByQueryResponse;
    public SearchDeleteByQueryResponse withDeleteByQueryResponse(com.tigrisdata.tigris_core.models.shared.DeleteByQueryResponse deleteByQueryResponse) {
        this.deleteByQueryResponse = deleteByQueryResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public SearchDeleteByQueryResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public SearchDeleteByQueryResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public SearchDeleteByQueryResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
