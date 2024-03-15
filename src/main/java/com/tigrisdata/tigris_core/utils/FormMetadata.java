/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.tigrisdata.tigris_core.utils;

import java.lang.reflect.Field;

class FormMetadata {

    String style = "form";
    boolean explode = true;
    boolean json;
    String name;

    private FormMetadata() {
    }

    // form:name=propName,style=spaceDelimited,explode=true
    static FormMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        return Metadata.parse("form", new FormMetadata(), field);
    }
}
