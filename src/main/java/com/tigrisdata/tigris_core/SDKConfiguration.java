/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core;

import com.tigrisdata.tigris_core.utils.HTTPClient;
import com.tigrisdata.tigris_core.utils.RetryConfig;
import com.tigrisdata.tigris_core.models.shared.Security;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    public HTTPClient defaultClient;
	  public String serverUrl;
    public int serverIdx = 0;
  	public String language = "java";
  	public String openapiDocVersion = "0.0.1";
  	public String sdkVersion = "0.54.2";
  	public String genVersion = "2.295.1";
  	public String userAgent = "speakeasy-sdk/java 0.54.2 2.295.1 0.0.1 com.tigrisdata.tigris_core";
  	
  	
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
