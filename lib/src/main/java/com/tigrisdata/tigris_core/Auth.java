/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.HTTPRequest;
import com.tigrisdata.tigris_core.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * The auth section of API provides OAuth 2.0 APIs. Tigris supports pluggable OAuth provider. Pass the token in the headers for authentication, as an example `-H "Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6I"`(replace it with your token). All API requests must be made over HTTPS. Calls made over plain HTTP will fail. API requests without authentication will also fail.
 */
public class Auth {
	
	private SDKConfiguration sdkConfiguration;

	public Auth(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Access Token
     * Endpoint for receiving access token from Tigris Server. The endpoint requires Grant Type(`grant_type`) which has
     *  two possible values &lt;i&gt;"REFRESH_TOKEN"&lt;/i&gt; or &lt;i&gt;"CLIENT_CREDENTIALS"&lt;/i&gt; based on which either Refresh token(`refresh_token`)
     *  needs to be set or client credentials(`client_id`, `client_secret`).
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.tigrisdata.tigris_core.models.operations.AuthGetAccessTokenResponse get() throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.tigrisdata.tigris_core.utils.Utils.generateURL(baseUrl, "/v1/auth/token");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.tigrisdata.tigris_core.models.operations.AuthGetAccessTokenResponse res = new com.tigrisdata.tigris_core.models.operations.AuthGetAccessTokenResponse(contentType, httpRes.statusCode()) {{
            getAccessTokenResponse = null;
            status = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.tigrisdata.tigris_core.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.tigrisdata.tigris_core.models.shared.GetAccessTokenResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.tigrisdata.tigris_core.models.shared.GetAccessTokenResponse.class);
                res.getAccessTokenResponse = out;
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