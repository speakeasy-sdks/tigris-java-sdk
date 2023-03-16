package com.tigrisdata.tigris_core.models.operations;

import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;

public class CacheGetPathParams {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=key")
    public String key;
    public CacheGetPathParams withKey(String key) {
        this.key = key;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    public String name;
    public CacheGetPathParams withName(String name) {
        this.name = name;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    public String project;
    public CacheGetPathParams withProject(String project) {
        this.project = project;
        return this;
    }
    
}