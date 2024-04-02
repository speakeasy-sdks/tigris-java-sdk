/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * SearchResponse - Response struct for search
 */

public class SearchResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("facets")
    private Optional<? extends java.util.Map<String, SearchFacet>> facets;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hits")
    private Optional<? extends java.util.List<SearchHit>> hits;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta")
    private Optional<? extends SearchMetadata> meta;

    public SearchResponse(
            @JsonProperty("facets") Optional<? extends java.util.Map<String, SearchFacet>> facets,
            @JsonProperty("hits") Optional<? extends java.util.List<SearchHit>> hits,
            @JsonProperty("meta") Optional<? extends SearchMetadata> meta) {
        Utils.checkNotNull(facets, "facets");
        Utils.checkNotNull(hits, "hits");
        Utils.checkNotNull(meta, "meta");
        this.facets = facets;
        this.hits = hits;
        this.meta = meta;
    }

    public Optional<? extends java.util.Map<String, SearchFacet>> facets() {
        return facets;
    }

    public Optional<? extends java.util.List<SearchHit>> hits() {
        return hits;
    }

    public Optional<? extends SearchMetadata> meta() {
        return meta;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SearchResponse withFacets(java.util.Map<String, SearchFacet> facets) {
        Utils.checkNotNull(facets, "facets");
        this.facets = Optional.ofNullable(facets);
        return this;
    }

    public SearchResponse withFacets(Optional<? extends java.util.Map<String, SearchFacet>> facets) {
        Utils.checkNotNull(facets, "facets");
        this.facets = facets;
        return this;
    }

    public SearchResponse withHits(java.util.List<SearchHit> hits) {
        Utils.checkNotNull(hits, "hits");
        this.hits = Optional.ofNullable(hits);
        return this;
    }

    public SearchResponse withHits(Optional<? extends java.util.List<SearchHit>> hits) {
        Utils.checkNotNull(hits, "hits");
        this.hits = hits;
        return this;
    }

    public SearchResponse withMeta(SearchMetadata meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = Optional.ofNullable(meta);
        return this;
    }

    public SearchResponse withMeta(Optional<? extends SearchMetadata> meta) {
        Utils.checkNotNull(meta, "meta");
        this.meta = meta;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResponse other = (SearchResponse) o;
        return 
            java.util.Objects.deepEquals(this.facets, other.facets) &&
            java.util.Objects.deepEquals(this.hits, other.hits) &&
            java.util.Objects.deepEquals(this.meta, other.meta);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            facets,
            hits,
            meta);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchResponse.class,
                "facets", facets,
                "hits", hits,
                "meta", meta);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.Map<String, SearchFacet>> facets = Optional.empty();
 
        private Optional<? extends java.util.List<SearchHit>> hits = Optional.empty();
 
        private Optional<? extends SearchMetadata> meta = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder facets(java.util.Map<String, SearchFacet> facets) {
            Utils.checkNotNull(facets, "facets");
            this.facets = Optional.ofNullable(facets);
            return this;
        }

        public Builder facets(Optional<? extends java.util.Map<String, SearchFacet>> facets) {
            Utils.checkNotNull(facets, "facets");
            this.facets = facets;
            return this;
        }

        public Builder hits(java.util.List<SearchHit> hits) {
            Utils.checkNotNull(hits, "hits");
            this.hits = Optional.ofNullable(hits);
            return this;
        }

        public Builder hits(Optional<? extends java.util.List<SearchHit>> hits) {
            Utils.checkNotNull(hits, "hits");
            this.hits = hits;
            return this;
        }

        public Builder meta(SearchMetadata meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = Optional.ofNullable(meta);
            return this;
        }

        public Builder meta(Optional<? extends SearchMetadata> meta) {
            Utils.checkNotNull(meta, "meta");
            this.meta = meta;
            return this;
        }
        
        public SearchResponse build() {
            return new SearchResponse(
                facets,
                hits,
                meta);
        }
    }
}
