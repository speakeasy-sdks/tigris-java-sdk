/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class TigrisDescribeCollectionResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public TigrisDescribeCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public com.tigrisdata.tigris_core.models.shared.DescribeCollectionResponse describeCollectionResponse;

    public TigrisDescribeCollectionResponse withDescribeCollectionResponse(com.tigrisdata.tigris_core.models.shared.DescribeCollectionResponse describeCollectionResponse) {
        this.describeCollectionResponse = describeCollectionResponse;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public com.tigrisdata.tigris_core.models.shared.Status status;

    public TigrisDescribeCollectionResponse withStatus(com.tigrisdata.tigris_core.models.shared.Status status) {
        this.status = status;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public TigrisDescribeCollectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public TigrisDescribeCollectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public TigrisDescribeCollectionResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
