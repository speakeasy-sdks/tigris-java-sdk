package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class TigrisDeleteAppKeyPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public TigrisDeleteAppKeyPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
