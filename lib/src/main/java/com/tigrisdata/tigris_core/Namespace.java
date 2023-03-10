package com.tigrisdata.tigris_core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.HTTPRequest;
import com.tigrisdata.tigris_core.utils.JSON;
import com.tigrisdata.tigris_core.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Namespace {
	
	
	
	
	
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Namespace(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * create - Creates a Namespace
     *
     * Creates a new namespace, if it does not exist
    **/
    public com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse create(com.tigrisdata.tigris_core.models.operations.CreateNamespaceRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/management/namespaces/create");
        
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

        com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse res = new com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse() {{
            createNamespaceResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateNamespaceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateNamespaceResponse.class);
                res.createNamespaceResponse = out;
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
     * get - Describe the details of all namespaces
     *
     * Get details for all namespaces
    **/
    public com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse get() throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/management/namespaces/describe");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse res = new com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse() {{
            describeNamespacesResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DescribeNamespacesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DescribeNamespacesResponse.class);
                res.describeNamespacesResponse = out;
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
     * getMetadata - Reads the Namespace Metadata
     *
     * GetNamespaceMetadata inserts the user metadata object
    **/
    public com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse getMetadata(com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/management/namespace/metadata/{metadataKey}/get", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse res = new com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse() {{
            getNamespaceMetadataResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataResponse.class);
                res.getNamespaceMetadataResponse = out;
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
     * insertMetadata - Inserts Namespace Metadata
     *
     * InsertNamespaceMetadata inserts the namespace metadata object
    **/
    public com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse insertMetadata(com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/management/namespace/metadata/{metadataKey}/insert", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse res = new com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse() {{
            insertNamespaceMetadataResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataResponse.class);
                res.insertNamespaceMetadataResponse = out;
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
     * list - Lists all Namespaces
     *
     * List all namespace
    **/
    public com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse list() throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/management/namespaces/list");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse res = new com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse() {{
            listNamespacesResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ListNamespacesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ListNamespacesResponse.class);
                res.listNamespacesResponse = out;
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
     * updateMetadata - Updates Namespace Metadata
     *
     * UpdateNamespaceMetadata updates the user metadata object
    **/
    public com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse updateMetadata(com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/management/namespace/metadata/{metadataKey}/update", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse res = new com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse() {{
            updateNamespaceMetadataResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataResponse.class);
                res.updateNamespaceMetadataResponse = out;
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