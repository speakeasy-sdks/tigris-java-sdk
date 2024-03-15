/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.utils;

import java.io.InputStream;
import java.net.http.HttpResponse;

public interface Response {
    
    /**
     * Returns the value of the Content-Type header.
     **/
    String contentType();
    
    /** 
     * Returns the HTTP status code.
     **/
    int statusCode();
    
    /**
     * Returns the raw response.
     **/
    HttpResponse<InputStream> rawResponse();
}