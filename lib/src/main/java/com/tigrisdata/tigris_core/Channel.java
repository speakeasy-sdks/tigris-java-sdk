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
 * The realtime section provide APIs that can be used realtime operations.
 */
public class Channel {
	
	private SDKConfiguration sdkConfiguration;

	public Channel(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get the details about a channel
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse get(com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelRequest.class, baseUrl, "/v1/projects/{project}/realtime/channels/{channel}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse res = new com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse(contentType, httpRes.statusCode()) {{
            getRTChannelResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetRTChannelResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetRTChannelResponse.class);
                res.getRTChannelResponse = out;
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
     * Get all messages for a channel
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse getMessages(com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest.class, baseUrl, "/v1/projects/{project}/realtime/channels/{channel}/messages", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = com.tigrisdata.tigris_core.utils.Utils.getQueryParams(com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse res = new com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse(contentType, httpRes.statusCode()) {{
            readMessagesResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ReadMessagesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ReadMessagesResponse.class);
                res.readMessagesResponse = out;
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
     * Get all channels for your application project
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse list(com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsRequest.class, baseUrl, "/v1/projects/{project}/realtime/channels", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse res = new com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse(contentType, httpRes.statusCode()) {{
            getRTChannelsResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetRTChannelsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetRTChannelsResponse.class);
                res.getRTChannelsResponse = out;
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
     * Get the subscriptions details about a channel
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse listSubscriptions(com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest.class, baseUrl, "/v1/projects/{project}/realtime/channels/{channel}/subscriptions", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = com.tigrisdata.tigris_core.utils.Utils.getQueryParams(com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse res = new com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse(contentType, httpRes.statusCode()) {{
            listSubscriptionResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.ListSubscriptionResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.ListSubscriptionResponse.class);
                res.listSubscriptionResponse = out;
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
     * push messages to a single channel
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse pushMessages(com.tigrisdata.tigris_core.models.operations.RealtimeMessagesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.RealtimeMessagesRequest.class, baseUrl, "/v1/projects/{project}/realtime/channels/{channel}/messages", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.tigrisdata.tigris_core.utils.Utils.serializeRequestBody(request, "messagesRequest", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse res = new com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse(contentType, httpRes.statusCode()) {{
            messagesResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.MessagesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.MessagesResponse.class);
                res.messagesResponse = out;
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
     * Presence about the channel
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse realtimePresence(com.tigrisdata.tigris_core.models.operations.RealtimePresenceRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(com.tigrisdata.tigris_core.models.operations.RealtimePresenceRequest.class, baseUrl, "/v1/projects/{project}/realtime/channels/{channel}/presence", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse res = new com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse(contentType, httpRes.statusCode()) {{
            presenceResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.PresenceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.PresenceResponse.class);
                res.presenceResponse = out;
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