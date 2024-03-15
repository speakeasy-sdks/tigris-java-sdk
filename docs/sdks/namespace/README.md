# Namespace
(*namespace()*)

## Overview

The Management section provide APIs that can be used to manage users, and app_keys.

### Available Operations

* [create](#create) - Creates a Namespace
* [get](#get) - Describe the details of all namespaces
* [getMetadata](#getmetadata) - Reads the Namespace Metadata
* [insertMetadata](#insertmetadata) - Inserts Namespace Metadata
* [list](#list) - Lists all Namespaces
* [updateMetadata](#updatemetadata) - Updates Namespace Metadata

## create

Creates a new namespace, if it does not exist

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest;
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

            CreateNamespaceRequest req = CreateNamespaceRequest.builder()
                .code(481196L)
                .id("<id>")
                .name("<value>")
                .build();

            CreateNamespaceResponse res = sdk.namespace().create()
                .request(req)
                .call();

            if (res.createNamespaceResponse().isPresent()) {
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest](../../models/shared/CreateNamespaceRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse>](../../models/operations/CreateNamespaceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Get details for all namespaces

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse;
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

            ManagementDescribeNamespacesResponse res = sdk.namespace().get()
                .call();

            if (res.describeNamespacesResponse().isPresent()) {
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

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse>](../../models/operations/ManagementDescribeNamespacesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getMetadata

GetNamespaceMetadata inserts the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.Value;
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

            ManagementGetNamespaceMetadataRequest req = ManagementGetNamespaceMetadataRequest.builder()
                .getNamespaceMetadataRequest(GetNamespaceMetadataRequest.builder()
                        .metadataKey("<value>")
                        .value(Value.builder()
                            .build())
                        .build())
                .metadataKey("<value>")
                .build();

            ManagementGetNamespaceMetadataResponse res = sdk.namespace().getMetadata()
                .request(req)
                .call();

            if (res.getNamespaceMetadataResponse().isPresent()) {
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

| Parameter                                                                                                                                              | Type                                                                                                                                                   | Required                                                                                                                                               | Description                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                              | [com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataRequest](../../models/operations/ManagementGetNamespaceMetadataRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse>](../../models/operations/ManagementGetNamespaceMetadataResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## insertMetadata

InsertNamespaceMetadata inserts the namespace metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequestValue;
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

            ManagementInsertNamespaceMetadataRequest req = ManagementInsertNamespaceMetadataRequest.builder()
                .insertNamespaceMetadataRequest(InsertNamespaceMetadataRequest.builder()
                        .metadataKey("<value>")
                        .value(InsertNamespaceMetadataRequestValue.builder()
                            .build())
                        .build())
                .metadataKey("<value>")
                .build();

            ManagementInsertNamespaceMetadataResponse res = sdk.namespace().insertMetadata()
                .request(req)
                .call();

            if (res.insertNamespaceMetadataResponse().isPresent()) {
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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataRequest](../../models/operations/ManagementInsertNamespaceMetadataRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse>](../../models/operations/ManagementInsertNamespaceMetadataResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

List all namespace

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse;
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

            ManagementListNamespacesResponse res = sdk.namespace().list()
                .call();

            if (res.listNamespacesResponse().isPresent()) {
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

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse>](../../models/operations/ManagementListNamespacesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateMetadata

UpdateNamespaceMetadata updates the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataRequestValue;
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

            ManagementUpdateNamespaceMetadataRequest req = ManagementUpdateNamespaceMetadataRequest.builder()
                .updateNamespaceMetadataRequest(UpdateNamespaceMetadataRequest.builder()
                        .metadataKey("<value>")
                        .value(UpdateNamespaceMetadataRequestValue.builder()
                            .build())
                        .build())
                .metadataKey("<value>")
                .build();

            ManagementUpdateNamespaceMetadataResponse res = sdk.namespace().updateMetadata()
                .request(req)
                .call();

            if (res.updateNamespaceMetadataResponse().isPresent()) {
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

| Parameter                                                                                                                                                    | Type                                                                                                                                                         | Required                                                                                                                                                     | Description                                                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataRequest](../../models/operations/ManagementUpdateNamespaceMetadataRequest.md) | :heavy_check_mark:                                                                                                                                           | The request object to use for the request.                                                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse>](../../models/operations/ManagementUpdateNamespaceMetadataResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
