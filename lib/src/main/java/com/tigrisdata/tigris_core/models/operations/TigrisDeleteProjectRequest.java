/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDeleteProjectRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, Object> requestBody;
    public TigrisDeleteProjectRequest withRequestBody(java.util.Map<String, Object> requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Delete Project with this name. &lt;p&gt;&lt;/p&gt;**Note**: Deletes all resources under this project. Use with caution.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public TigrisDeleteProjectRequest withProject(String project) {
        this.project = project;
        return this;
    }
    
}
