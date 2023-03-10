package com.tigrisdata.tigris_core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.HTTPRequest;
import com.tigrisdata.tigris_core.utils.JSON;
import com.tigrisdata.tigris_core.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Search {
	
	
	
	
	
	
	
	
	
	
	
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Search(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
	
    
    /**
     * createDocument - Create a single document
     *
     * CreateById is used for indexing a single document. The API expects a single document. An "id" is optional
     *  and the server can automatically generate it for you in case it is missing. In cases an id is provided in
     *  the document and the document already exists then that document will not be indexed and an error is returned
     *  with HTTP status code 409.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchCreateByIdResponse createDocument(com.tigrisdata.tigris_core.models.operations.SearchCreateByIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents/{id}", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.SearchCreateByIdResponse res = new com.tigrisdata.tigris_core.models.operations.SearchCreateByIdResponse() {{
            createByIdResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateByIdResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateByIdResponse.class);
                res.createByIdResponse = out;
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
     * createDocuments - Create multiple documents
     *
     * Create is used for indexing a single or multiple documents. The API expects an array of documents.
     *  Each document is a JSON object. An "id" is optional and the server can automatically generate it for you in
     *  case it is missing. In cases when an id is provided in the document and the document already exists then that
     *  document will not be indexed and in the response there will be an error corresponding to that document id other
     *  documents will succeed. Returns an array of status indicating the status of each document.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchCreateResponse createDocuments(com.tigrisdata.tigris_core.models.operations.SearchCreateRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.SearchCreateResponse res = new com.tigrisdata.tigris_core.models.operations.SearchCreateResponse() {{
            createDocumentResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateDocumentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateDocumentResponse.class);
                res.createDocumentResponse = out;
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
     * deleteDocuments - Delete documents by ids
     *
     * Delete one or more documents by id. Returns an array of status indicating the status of each document. Each status
     *  has an error field that is set to null in case document is deleted successfully otherwise it will non null with
     *  an error code and message.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchDeleteResponse deleteDocuments(com.tigrisdata.tigris_core.models.operations.SearchDeleteRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.SearchDeleteResponse res = new com.tigrisdata.tigris_core.models.operations.SearchDeleteResponse() {{
            deleteDocumentResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DeleteDocumentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DeleteDocumentResponse.class);
                res.deleteDocumentResponse = out;
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
     * deleteIndex - Deletes search index
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexResponse deleteIndex(com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{name}", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexResponse res = new com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexResponse() {{
            deleteIndexResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DeleteIndexResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DeleteIndexResponse.class);
                res.deleteIndexResponse = out;
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
     * findDocuments - Search Documents.
     *
     * Searches an index for the documents matching the query. A search can be a term search or a phrase search.
     *  Search API allows filtering the result set using filters as documented
     *  <a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here">here</a>. You can also perform
     *  a faceted search by passing the fields in the facet parameter. You can find more detailed documentation of the
     *  Search API with multiple examples <a href="https://docs.tigrisdata.com/overview/search" title="here">here</a>.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchSearchResponse findDocuments(com.tigrisdata.tigris_core.models.operations.SearchSearchRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents/search", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.SearchSearchResponse res = new com.tigrisdata.tigris_core.models.operations.SearchSearchResponse() {{
            searchIndexResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.SearchIndexResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.SearchIndexResponse.class);
                res.searchIndexResponse = out;
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
     * getDocuments - Get a single or multiple documents
     *
     * Retrieves one or more documents by id. The response is an array of documents in the same order it is requests.
     *  A null is returned for the documents that are not found.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchGetResponse getDocuments(com.tigrisdata.tigris_core.models.operations.SearchGetRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = com.tigrisdata.tigris_core.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.SearchGetResponse res = new com.tigrisdata.tigris_core.models.operations.SearchGetResponse() {{
            getDocumentResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetDocumentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetDocumentResponse.class);
                res.getDocumentResponse = out;
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
     * getIndex - Get information about a search index
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchGetIndexResponse getIndex(com.tigrisdata.tigris_core.models.operations.SearchGetIndexRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{name}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.SearchGetIndexResponse res = new com.tigrisdata.tigris_core.models.operations.SearchGetIndexResponse() {{
            getIndexResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetIndexResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetIndexResponse.class);
                res.getIndexResponse = out;
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
     * listIndexes - List search indexes
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchListIndexesResponse listIndexes(com.tigrisdata.tigris_core.models.operations.SearchListIndexesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = com.tigrisdata.tigris_core.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.SearchListIndexesResponse res = new com.tigrisdata.tigris_core.models.operations.SearchListIndexesResponse() {{
            listIndexesResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ListIndexesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ListIndexesResponse.class);
                res.listIndexesResponse = out;
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
     * queryDeleteDocuments - Delete documents by query
     *
     * DeleteByQuery is used to delete documents that match the filter. A filter is required. To delete document by id,
     *  you can pass the filter as follows ```{"id": "test"}```. Returns a count of number of documents deleted.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryResponse queryDeleteDocuments(com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents/deleteByQuery", request.pathParams);
        
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

        com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryResponse res = new com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryResponse() {{
            deleteByQueryResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DeleteByQueryResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DeleteByQueryResponse.class);
                res.deleteByQueryResponse = out;
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
     * replaceDocuments - Create or replace documents in an index
     *
     * Creates or replaces one or more documents. Each document is a JSON object. A document is replaced
     *  if it already exists. An "id" is generated automatically in case it is missing in the document. The
     *  document is created if "id" doesn't exists otherwise it is replaced. Returns an array of status indicating
     *  the status of each document.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceResponse replaceDocuments(com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceResponse res = new com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceResponse() {{
            createOrReplaceDocumentResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentResponse.class);
                res.createOrReplaceDocumentResponse = out;
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
     * updateDocuments - Update documents in an index
     *
     * Updates one or more documents by "id". Each document is required to have the
     *  "id" field in it. Returns an array of status indicating the status of each document. Each status
     *  has an error field that is set to null in case document is updated successfully otherwise the error
     *  field is set with a code and message.
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchUpdateResponse updateDocuments(com.tigrisdata.tigris_core.models.operations.SearchUpdateRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{index}/documents", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.SearchUpdateResponse res = new com.tigrisdata.tigris_core.models.operations.SearchUpdateResponse() {{
            updateDocumentResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.UpdateDocumentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.UpdateDocumentResponse.class);
                res.updateDocumentResponse = out;
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
     * updateIndex - Creates or updates search index
    **/
    public com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexResponse updateIndex(com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/projects/{project}/search/indexes/{name}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexResponse res = new com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexResponse() {{
            createOrUpdateIndexResponse = null;
            status = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateOrUpdateIndexResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateOrUpdateIndexResponse.class);
                res.createOrUpdateIndexResponse = out;
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