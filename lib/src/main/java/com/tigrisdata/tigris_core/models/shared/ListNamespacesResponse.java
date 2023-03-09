package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListNamespacesResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaces")
    public NamespaceInfo[] namespaces;
    public ListNamespacesResponse withNamespaces(NamespaceInfo[] namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    
}
