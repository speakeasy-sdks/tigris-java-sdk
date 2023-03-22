/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import java.net.http.HttpResponse;

public class ManagementUpdateNamespaceMetadataResponse {
    public String contentType;
    public ManagementUpdateNamespaceMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public Integer statusCode;
    public ManagementUpdateNamespaceMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public ManagementUpdateNamespaceMetadataResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    public com.tigrisdata.tigris_core.models.shared.Status status;
    public ManagementUpdateNamespaceMetadataResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    /**
     * OK
     */
    public com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataResponse updateNamespaceMetadataResponse;
    public ManagementUpdateNamespaceMetadataResponse withUpdateNamespaceMetadataResponse(com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataResponse updateNamespaceMetadataResponse) {
        this.updateNamespaceMetadataResponse = updateNamespaceMetadataResponse;
        return this;
    }
    
}
