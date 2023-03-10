package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class AuthGetAccessTokenResponse {
    public String contentType;
    public AuthGetAccessTokenResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.GetAccessTokenResponse getAccessTokenResponse;
    public AuthGetAccessTokenResponse withGetAccessTokenResponse(com.tigrisdata.tigris_core.models.shared.GetAccessTokenResponse getAccessTokenResponse) {
        this.getAccessTokenResponse = getAccessTokenResponse;
        return this;
    }
    
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public AuthGetAccessTokenResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    public Integer statusCode;
    public AuthGetAccessTokenResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public AuthGetAccessTokenResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
