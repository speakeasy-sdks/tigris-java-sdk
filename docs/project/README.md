# project

## Overview

Every Tigris projects comes with a transactional document database built on FoundationDB, one of the most resilient and battle-tested open source distributed key-value store. A database is created automatically for you when you create a project.

### Available Operations

* [create](#create) - Create Project
* [deleteProject](#deleteproject) - Delete Project and all resources under project
* [list](#list) - List Projects

## create

Creates a new project. Returns an AlreadyExists error with a status code 409 if the project already exists.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ex") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisCreateProjectRequest req = new TigrisCreateProjectRequest(                new java.util.HashMap<String, Object>() {{
                                put("excepturi", "voluptatibus");
                                put("nostrum", "sapiente");
                                put("quisquam", "saepe");
                                put("ea", "impedit");
                            }}, "corporis");            

            TigrisCreateProjectResponse res = sdk.project.create(req);

            if (res.createProjectResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteProject

Delete Project deletes all the collections in this project along with all of the documents, and associated metadata for these collections.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("veniam") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDeleteProjectRequest req = new TigrisDeleteProjectRequest(                new java.util.HashMap<String, Object>() {{
                                put("inventore", "magnam");
                                put("ea", "quo");
                            }}, "consectetur");            

            TigrisDeleteProjectResponse res = sdk.project.deleteProject(req);

            if (res.deleteProjectResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## list

List returns all the projects.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisListProjectsResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("recusandae") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisListProjectsResponse res = sdk.project.list();

            if (res.listProjectsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
