# Project
(*project*)

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
import com.tigrisdata.tigris_core.models.shared.CreateProjectRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectRequest req = new TigrisCreateProjectRequest(
                new CreateProjectRequest(
),
                "string");

            com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectResponse res = sdk.project.create(req);

            if (res.createProjectResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectRequest](../../models/operations/TigrisCreateProjectRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectResponse](../../models/operations/TigrisCreateProjectResponse.md)**


## deleteProject

Delete Project deletes all the collections in this project along with all of the documents, and associated metadata for these collections.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteProjectRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectRequest req = new TigrisDeleteProjectRequest(
                new DeleteProjectRequest(
),
                "string");

            com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectResponse res = sdk.project.deleteProject(req);

            if (res.deleteProjectResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectRequest](../../models/operations/TigrisDeleteProjectRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectResponse](../../models/operations/TigrisDeleteProjectResponse.md)**


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
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.TigrisListProjectsResponse res = sdk.project.list();

            if (res.listProjectsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisListProjectsResponse](../../models/operations/TigrisListProjectsResponse.md)**

