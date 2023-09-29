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

/**
 * The Collections section provide APIs that can be used to manage collections. A collection can have one or more documents.
 */
public class Collection {
	
	private SDKConfiguration sdkConfiguration;

	public Collection(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create or update a collection
     * Creates a new collection or atomically upgrades the collection to the new schema provided in the request.
     *  Schema changes are applied atomically and immediately without any downtime.
     *  Tigris Offers two types of collections: &lt;p&gt;&lt;/p&gt;
     *     &lt;li&gt; `DOCUMENTS`: Offers rich CRUD APIs.
     *     &lt;li&gt; `MESSAGES`: Offers event streaming APIs.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionResponse create(com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/createOrUpdate", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "createOrUpdateCollectionRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionResponse(contentType, httpRes.statusCode()) {{
            createOrUpdateCollectionResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionResponse.class);
                res.createOrUpdateCollectionResponse = out;
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
     * Delete Documents
     * Delete a range of documents in the collection using the condition provided in the filter.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisDeleteResponse deleteDocuments(com.tigrisdata.tigris_core.models.operations.TigrisDeleteRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisDeleteRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/documents/delete", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "deleteRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisDeleteResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisDeleteResponse(contentType, httpRes.statusCode()) {{
            deleteResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DeleteResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DeleteResponse.class);
                res.deleteResponse = out;
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
     * Describe Collection
     * Returns the information related to the collection. This can be used to retrieve the schema or size of the collection.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse describe(com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/describe", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "describeCollectionRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse(contentType, httpRes.statusCode()) {{
            describeCollectionResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DescribeCollectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DescribeCollectionResponse.class);
                res.describeCollectionResponse = out;
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
     * Drop Collection
     * Drops the collection inside this project. This API deletes all of the
     *  documents inside this collection and any metadata associated with it.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse drop(com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/drop", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "dropCollectionRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse(contentType, httpRes.statusCode()) {{
            dropCollectionResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.DropCollectionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.DropCollectionResponse.class);
                res.dropCollectionResponse = out;
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
     * Import Documents
     * Imports documents into the collection.
     * 
     *  It automatically:
     *   * Detects the schema of the documents in the batch
     *   * Evolves the schema as soon as it's backward compatible
     *   * Creates collection with inferred schema (if requested)
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisImportResponse importDocuments(com.tigrisdata.tigris_core.models.operations.TigrisImportRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisImportRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/documents/import", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "importRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisImportResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisImportResponse(contentType, httpRes.statusCode()) {{
            importResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ImportResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ImportResponse.class);
                res.importResponse = out;
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
     * Insert Documents
     * Inserts new documents in the collection and returns an AlreadyExists error if any of the documents
     *  in the request already exists. Insert provides idempotency by returning an error if the document
     *  already exists. To replace documents, use REPLACE API instead of INSERT.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisInsertResponse insertDocuments(com.tigrisdata.tigris_core.models.operations.TigrisInsertRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisInsertRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/documents/insert", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "insertRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisInsertResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisInsertResponse(contentType, httpRes.statusCode()) {{
            insertResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.InsertResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.InsertResponse.class);
                res.insertResponse = out;
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
     * Read Documents
     * Reads a range of documents from the collection, or messages from a collection in case of event streaming. Tigris does not require you to
     *  index any fields and automatically index all the fields which means you can filter by any field in the document.
     *  An empty filter will trigger reading all the documents inside this collection. The API supports pagination that
     *  can be used by passing `Limit/Skip` parameters. The `skip` parameter skips the number of documents from the start and
     *  the `limit` parameter is used to specify the number of documents to read. You can find more detailed documentation
     *  of the Read API &lt;a href="https://docs.tigrisdata.com/overview/query" title="here"&gt;here&lt;/a&gt;.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisReadResponse readDocuments(com.tigrisdata.tigris_core.models.operations.TigrisReadRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisReadRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/documents/read", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "readRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisReadResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisReadResponse(contentType, httpRes.statusCode()) {{
            streamingReadResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.StreamingReadResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.StreamingReadResponse.class);
                res.streamingReadResponse = out;
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
     * Insert or Replace Documents
     * Inserts the documents or replaces the existing documents in the collections.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse replaceDocuments(com.tigrisdata.tigris_core.models.operations.TigrisReplaceRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisReplaceRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/documents/replace", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "replaceRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse(contentType, httpRes.statusCode()) {{
            replaceResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ReplaceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ReplaceResponse.class);
                res.replaceResponse = out;
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
     * Search Documents.
     * Searches a collection for the documents matching the query, or messages in case of event streaming. A search can be
     *  a term search or a phrase search. Search API allows filtering the result set using filters as documented &lt;a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here"&gt;here&lt;/a&gt;.
     *  You can also perform a faceted search by passing the fields in the facet parameter.
     *  You can find more detailed documentation of the Search API with multiple examples &lt;a href="https://docs.tigrisdata.com/overview/search" title="here"&gt;here&lt;/a&gt;.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisSearchResponse searchDocuments(com.tigrisdata.tigris_core.models.operations.TigrisSearchRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisSearchRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/documents/search", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "searchRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisSearchResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisSearchResponse(contentType, httpRes.statusCode()) {{
            streamingSearchResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.StreamingSearchResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.StreamingSearchResponse.class);
                res.streamingSearchResponse = out;
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
     * Update Documents.
     * Update a range of documents in the collection using the condition provided in the filter.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.TigrisUpdateResponse updateDocuments(com.tigrisdata.tigris_core.models.operations.TigrisUpdateRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.TigrisUpdateRequest.class, baseUrl, "/v1/projects/{project}/database/collections/{collection}/documents/update", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "updateRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.TigrisUpdateResponse res = new com.tigrisdata.tigris_core.models.operations.TigrisUpdateResponse(contentType, httpRes.statusCode()) {{
            updateResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.UpdateResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.UpdateResponse.class);
                res.updateResponse = out;
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