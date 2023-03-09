package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListProjectsResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("projects")
    public ProjectInfo[] projects;
    public ListProjectsResponse withProjects(ProjectInfo[] projects) {
        this.projects = projects;
        return this;
    }
    
}
