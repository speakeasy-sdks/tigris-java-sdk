package com.tigrisdata.tigris_core;

import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.SpeakeasyHTTPClient;

/** SDK Documentation: # Overview
 * This section is organized around HTTP APIs. The APIs accepts JSON requests and returns JSON-encoded responses.The APIs conforms to standard HTTP status codes.
 * 
 * # Errors
 * Tigris uses conventional HTTP response codes to indicate the success or failure of an API request.The response will  contain an error code or other information that reveals the reason of the error. 
 * The error response is in JSON format and is structured like this:
 * ```
 *  {
 *    "error": {
 *      "code": "ALREADY_EXISTS",
 *      "message": "row already exists"
 *    }
 *  }
 * 
 * ```
 * 
 * ## Status 2xx
 * 
 *   HTTP Code  | Reason
 *   ----------------|-------------
 *   200 - OK | Everything worked as expected.
 * 
 * 
 * ## Status 4xx
 * Status codes in the `400-499` range indicate errors that have been caused by the requesting application (e.g., a malformed request body has been sent).
 * Retrying such requests with the same request body is pointless and _will_ result in the same status code again. Some `4xx` errors can be handled programmatically. Change the request accordingly before retrying. Below you can find the most frequent 4XX errors and how to fix them.
 * 
 *   HTTP Code  | Tigris Code | Reason
 *   ----------------|-------------|---------
 *   400 - Bad Request | INVALID_ARGUMENT | The request was unacceptable, often due to missing a required parameter. <br>Examples: <li>Missing documents for write request</li><li>Collection or Database name is not following the allowed characters</li>
 *   401 - Unauthorized | UNAUTHENTICATED | No valid API key provided. Check that your `api_key` and `api_secret` are correct.
 *   403 - Forbidden | PERMISSION_DENIED | The API key doesn't have permissions to perform the request.
 *   404 - Not Found | NOT_FOUND | The requested resource doesn't exist. <br>Examples: <li>Database or Collection doesn't exists</li><li>Access Token missing in the request header</li>
 *   409 - Conflict | ALREADY_EXISTS | TThe request conflicts with another request (perhaps due to using the same idempotent key). <br>Examples: <li>Trying to insert document again for the primary key that already exists</li><li>Creating a database that already exists</li>
 *   429 - Too Many Requests | RESOURCE_EXHAUSTED | Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
 *   
 *   
 *   
 * ## Status 5xx
 * The 5xx range indicate an error with Tigris servers (these are rare).
 * 
 *   HTTP Code  | Tigris Code | Reason
 *   ----------------|-------------|---------
 *   500 - Internal Server Error | UNKNOWN | Something went wrong on Tigris server side.                    
 *   501 - Not Implemented       | UNIMPLEMENTED | Not supported by the Tigris server and cannot be handled. 
 *   502 - Bad Gateway           | BAD_GATEWAY | The API key doesn't have permissions to perform the request.
 *   503 - Service Unavailable   | UNAVAILABLE | The server is not ready to handle the request. Common causes are a server that is down for maintenance or that is overloaded.
 *   504 - Gateway Timeout       | DEADLINE_EXCEEDED | Tigris server is unable to process the request timely. Common causes are that request is expensive, or server is overloaded.
 *   
 * # Idempotent Requests
 *   
 *   Tigris provides idempotency guarantees when an API call is disrupted and either no response is returned or an HTTP 
 *   Status code `429,500,501,502,503` is returned. These errors ensure that the request is not committed and retrying the same request will have the same effect.
 * 
 * 
 * # Limitations
 * <li>Do not rely on case to distinguish between databases or collections names.</li> <li>Database Name and Collection Name cannot be empty and can only have the characters matches the regex: <code>^[a-zA-Z]+[a-zA-Z0-9_]+$</code>.</li> <li>Duplicate field names are not allowed. </li> <li>The maximum allowed document size is 100KB.</li> <li>The maximum allowed transaction size is 10MB.</li>
 * **/
public class SDK {
	public static final String[] SERVERS = {
		"https://api.preview.tigrisdata.cloud",
		"http://localhost:8081",
	};
  	
  	public AppKey appKey;
  	public Auth auth;
  	public Cache cache;
  	public Channel channel;
  	public Collection collection;
  	public Database database;
  	public Namespace namespace;
  	public Project project;
  	public Search search;
  	public System system;
  	public User user;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private com.tigrisdata.tigris_core.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "0.2.1";
	private String _genVersion = "1.12.1";
	public static class Builder {
		private HTTPClient client;
		private com.tigrisdata.tigris_core.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(com.tigrisdata.tigris_core.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		public SDK build() throws Exception {
			return new SDK(this.client, this.security, this.serverUrl, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, com.tigrisdata.tigris_core.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = com.tigrisdata.tigris_core.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = com.tigrisdata.tigris_core.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
		
		
		this.appKey = new AppKey(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.auth = new Auth(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.cache = new Cache(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.channel = new Channel(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.collection = new Collection(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.database = new Database(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.namespace = new Namespace(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.project = new Project(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.search = new Search(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.system = new System(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.user = new User(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}