package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheGetSetPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    public String key;
    public CacheGetSetPathParams withKey(String key) {
        this.key = key;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;
    public CacheGetSetPathParams withName(String name) {
        this.name = name;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public CacheGetSetPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}
