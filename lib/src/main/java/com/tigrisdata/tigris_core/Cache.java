/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.HTTPRequest;
import com.tigrisdata.tigris_core.utils.JSON;
import com.tigrisdata.tigris_core.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

/**
 * The cache section provide APIs that can be used to perform cache operations.
 */
public class Cache {
	
	private SDKConfiguration sdkConfiguration;

	public Cache(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Creates the cache
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse create(com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest.class, baseUrl, "/v1/projects/{project}/caches/{name}/create", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "createCacheRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse res = new com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse(contentType, httpRes.statusCode(), httpRes) {{
            createCacheResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateCacheResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateCacheResponse.class);
                res.createCacheResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Deletes the cache
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse delete(com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheRequest.class, baseUrl, "/v1/projects/{project}/caches/{name}/delete", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "deleteCacheRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse res = new com.tigrisdata.tigris_core.models.operations.CacheDeleteCacheResponse(contentType, httpRes.statusCode(), httpRes) {{
            deleteCacheResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DeleteCacheResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DeleteCacheResponse.class);
                res.deleteCacheResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Deletes an entry from cache
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheDelResponse deleteKeys(com.tigrisdata.tigris_core.models.operations.CacheDelRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheDelRequest.class, baseUrl, "/v1/projects/{project}/caches/{name}/{key}/delete", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "delRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheDelResponse res = new com.tigrisdata.tigris_core.models.operations.CacheDelResponse(contentType, httpRes.statusCode(), httpRes) {{
            delResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DelResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DelResponse.class);
                res.delResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Reads an entry from cache
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheGetResponse getKey(com.tigrisdata.tigris_core.models.operations.CacheGetRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheGetRequest.class, baseUrl, "/v1/projects/{project}/caches/{name}/{key}/get", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheGetResponse res = new com.tigrisdata.tigris_core.models.operations.CacheGetResponse(contentType, httpRes.statusCode(), httpRes) {{
            getResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetResponse.class);
                res.getResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Sets an entry in the cache and returns the previous value if exists
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse getSetKey(com.tigrisdata.tigris_core.models.operations.CacheGetSetRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheGetSetRequest.class, baseUrl, "/v1/projects/{project}/caches/{name}/{key}/getset", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "getSetRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse res = new com.tigrisdata.tigris_core.models.operations.CacheGetSetResponse(contentType, httpRes.statusCode(), httpRes) {{
            getSetResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetSetResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetSetResponse.class);
                res.getSetResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Lists all the caches for the given project
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse list(com.tigrisdata.tigris_core.models.operations.CacheListCachesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheListCachesRequest.class, baseUrl, "/v1/projects/{project}/caches/list", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse res = new com.tigrisdata.tigris_core.models.operations.CacheListCachesResponse(contentType, httpRes.statusCode(), httpRes) {{
            listCachesResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ListCachesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ListCachesResponse.class);
                res.listCachesResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Lists all the key for this cache
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheKeysResponse listKeys(com.tigrisdata.tigris_core.models.operations.CacheKeysRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheKeysRequest.class, baseUrl, "/v1/projects/{project}/caches/{name}/keys", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.tigrisdata.tigris_core.utils.Utils.getQueryParams(com.tigrisdata.tigris_core.models.operations.CacheKeysRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheKeysResponse res = new com.tigrisdata.tigris_core.models.operations.CacheKeysResponse(contentType, httpRes.statusCode(), httpRes) {{
            keysResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.KeysResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.KeysResponse.class);
                res.keysResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }

    /**
     * Sets an entry in the cache
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.CacheSetResponse setKey(com.tigrisdata.tigris_core.models.operations.CacheSetRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.CacheSetRequest.class, baseUrl, "/v1/projects/{project}/caches/{name}/{key}/set", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "setRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.tigrisdata.tigris_core.models.operations.CacheSetResponse res = new com.tigrisdata.tigris_core.models.operations.CacheSetResponse(contentType, httpRes.statusCode(), httpRes) {{
            setResponse = null;
            status = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.SetResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.SetResponse.class);
                res.setResponse = out;
            }
        }
        else {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.Status out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.Status.class);
                res.status = out;
            }
        }

        return res;
    }
}