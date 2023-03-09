package com.tigrisdata.tigris_core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.HTTPRequest;
import com.tigrisdata.tigris_core.utils.JSON;
import com.tigrisdata.tigris_core.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ApplicationKeys {
	
	
	
	
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public ApplicationKeys(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * tigrisCreateAppKey - Creates the app key
     *
     * Create an app key.
    **/
    public com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse tigrisCreateAppKey(com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/apps/keys/create", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse() {{
            createAppKeyResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateAppKeyResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateAppKeyResponse.class);
                res.createAppKeyResponse = out;
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
     * tigrisDeleteAppKey - Deletes the app key
     *
     * Delete an app key.
    **/
    public com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse tigrisDeleteAppKey(com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/apps/keys/delete", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse() {{
            deleteAppKeyResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DeleteAppKeyResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DeleteAppKeyResponse.class);
                res.deleteAppKeyResponse = out;
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
     * tigrisListAppKeys - List all the app keys
     *
     * Lists all app keys visible to requesting actor.
    **/
    public com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse tigrisListAppKeys(com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/apps/keys", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse() {{
            listAppKeysResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ListAppKeysResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ListAppKeysResponse.class);
                res.listAppKeysResponse = out;
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
     * tigrisRotateAppKeySecret - Rotates the app key secret
     *
     * Endpoint is used to rotate the secret for the app key.
    **/
    public com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse tigrisRotateAppKeySecret(com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/apps/keys/rotate", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse() {{
            rotateAppKeyResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.RotateAppKeyResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.RotateAppKeyResponse.class);
                res.rotateAppKeyResponse = out;
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
     * tigrisUpdateAppKey - Updates the description of the app key
     *
     * Update the description of an app key.
    **/
    public com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse tigrisUpdateAppKey(com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/apps/keys/update", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse() {{
            updateAppKeyResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.UpdateAppKeyResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.UpdateAppKeyResponse.class);
                res.updateAppKeyResponse = out;
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