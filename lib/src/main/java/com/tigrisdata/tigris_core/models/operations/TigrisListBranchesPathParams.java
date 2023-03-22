/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisListBranchesPathParams {
    /**
     * List database branches in this project
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")public String project;
    public TigrisListBranchesPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
