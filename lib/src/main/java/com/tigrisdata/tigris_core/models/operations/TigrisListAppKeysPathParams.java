/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisListAppKeysPathParams {
    /**
     * Project name filter
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")public String project;
    public TigrisListAppKeysPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
