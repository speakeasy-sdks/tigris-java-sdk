# Project
(*project()*)

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
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateProjectRequest;
import com.tigrisdata.tigris_core.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            TigrisCreateProjectRequest req = TigrisCreateProjectRequest.builder()
                .createProjectRequest(CreateProjectRequest.builder()
                        .build())
                .project("<value>")
                .build();

            TigrisCreateProjectResponse res = sdk.project().create()
                .request(req)
                .call();

            if (res.createProjectResponse().isPresent()) {
                // handle response
            }
        } catch (com.tigrisdata.tigris_core.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisCreateProjectResponse>](../../models/operations/TigrisCreateProjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteProject

Delete Project deletes all the collections in this project along with all of the documents, and associated metadata for these collections.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DeleteProjectRequest;
import com.tigrisdata.tigris_core.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            TigrisDeleteProjectRequest req = TigrisDeleteProjectRequest.builder()
                .deleteProjectRequest(DeleteProjectRequest.builder()
                        .build())
                .project("<value>")
                .build();

            TigrisDeleteProjectResponse res = sdk.project().deleteProject()
                .request(req)
                .call();

            if (res.deleteProjectResponse().isPresent()) {
                // handle response
            }
        } catch (com.tigrisdata.tigris_core.models.errors.SDKError e) {
            // handle exception
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

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisDeleteProjectResponse>](../../models/operations/TigrisDeleteProjectResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

List returns all the projects.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisListProjectsResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Security;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            TigrisListProjectsResponse res = sdk.project().list()
                .call();

            if (res.listProjectsResponse().isPresent()) {
                // handle response
            }
        } catch (com.tigrisdata.tigris_core.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisListProjectsResponse>](../../models/operations/TigrisListProjectsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
