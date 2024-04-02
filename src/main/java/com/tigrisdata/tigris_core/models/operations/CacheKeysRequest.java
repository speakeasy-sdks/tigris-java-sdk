/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import com.tigrisdata.tigris_core.utils.SpeakeasyMetadata;
import com.tigrisdata.tigris_core.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class CacheKeysRequest {

    /**
     * optional - count of keys to return a stream response line.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=count")
    private Optional<? extends Long> count;

    /**
     * optional - cursor - skip this argument if no cursor is associated
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cursor")
    private Optional<? extends Long> cursor;

    /**
     * cache name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=name")
    private String name;

    /**
     * optional key pattern
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pattern")
    private Optional<? extends String> pattern;

    /**
     * Tigris project name
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=project")
    private String project;

    public CacheKeysRequest(
            Optional<? extends Long> count,
            Optional<? extends Long> cursor,
            String name,
            Optional<? extends String> pattern,
            String project) {
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(cursor, "cursor");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(pattern, "pattern");
        Utils.checkNotNull(project, "project");
        this.count = count;
        this.cursor = cursor;
        this.name = name;
        this.pattern = pattern;
        this.project = project;
    }

    /**
     * optional - count of keys to return a stream response line.
     */
    public Optional<? extends Long> count() {
        return count;
    }

    /**
     * optional - cursor - skip this argument if no cursor is associated
     */
    public Optional<? extends Long> cursor() {
        return cursor;
    }

    /**
     * cache name
     */
    public String name() {
        return name;
    }

    /**
     * optional key pattern
     */
    public Optional<? extends String> pattern() {
        return pattern;
    }

    /**
     * Tigris project name
     */
    public String project() {
        return project;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * optional - count of keys to return a stream response line.
     */
    public CacheKeysRequest withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    /**
     * optional - count of keys to return a stream response line.
     */
    public CacheKeysRequest withCount(Optional<? extends Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    /**
     * optional - cursor - skip this argument if no cursor is associated
     */
    public CacheKeysRequest withCursor(long cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = Optional.ofNullable(cursor);
        return this;
    }

    /**
     * optional - cursor - skip this argument if no cursor is associated
     */
    public CacheKeysRequest withCursor(Optional<? extends Long> cursor) {
        Utils.checkNotNull(cursor, "cursor");
        this.cursor = cursor;
        return this;
    }

    /**
     * cache name
     */
    public CacheKeysRequest withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * optional key pattern
     */
    public CacheKeysRequest withPattern(String pattern) {
        Utils.checkNotNull(pattern, "pattern");
        this.pattern = Optional.ofNullable(pattern);
        return this;
    }

    /**
     * optional key pattern
     */
    public CacheKeysRequest withPattern(Optional<? extends String> pattern) {
        Utils.checkNotNull(pattern, "pattern");
        this.pattern = pattern;
        return this;
    }

    /**
     * Tigris project name
     */
    public CacheKeysRequest withProject(String project) {
        Utils.checkNotNull(project, "project");
        this.project = project;
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
        CacheKeysRequest other = (CacheKeysRequest) o;
        return 
            java.util.Objects.deepEquals(this.count, other.count) &&
            java.util.Objects.deepEquals(this.cursor, other.cursor) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.pattern, other.pattern) &&
            java.util.Objects.deepEquals(this.project, other.project);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            count,
            cursor,
            name,
            pattern,
            project);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CacheKeysRequest.class,
                "count", count,
                "cursor", cursor,
                "name", name,
                "pattern", pattern,
                "project", project);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> count = Optional.empty();
 
        private Optional<? extends Long> cursor = Optional.empty();
 
        private String name;
 
        private Optional<? extends String> pattern = Optional.empty();
 
        private String project;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * optional - count of keys to return a stream response line.
         */
        public Builder count(long count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        /**
         * optional - count of keys to return a stream response line.
         */
        public Builder count(Optional<? extends Long> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        /**
         * optional - cursor - skip this argument if no cursor is associated
         */
        public Builder cursor(long cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = Optional.ofNullable(cursor);
            return this;
        }

        /**
         * optional - cursor - skip this argument if no cursor is associated
         */
        public Builder cursor(Optional<? extends Long> cursor) {
            Utils.checkNotNull(cursor, "cursor");
            this.cursor = cursor;
            return this;
        }

        /**
         * cache name
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * optional key pattern
         */
        public Builder pattern(String pattern) {
            Utils.checkNotNull(pattern, "pattern");
            this.pattern = Optional.ofNullable(pattern);
            return this;
        }

        /**
         * optional key pattern
         */
        public Builder pattern(Optional<? extends String> pattern) {
            Utils.checkNotNull(pattern, "pattern");
            this.pattern = pattern;
            return this;
        }

        /**
         * Tigris project name
         */
        public Builder project(String project) {
            Utils.checkNotNull(project, "project");
            this.project = project;
            return this;
        }
        
        public CacheKeysRequest build() {
            return new CacheKeysRequest(
                count,
                cursor,
                name,
                pattern,
                project);
        }
    }
}
