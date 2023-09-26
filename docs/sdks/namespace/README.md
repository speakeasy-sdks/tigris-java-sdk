# Namespace

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
import com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse;
import com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("maxime") {{
                    bearerAuth = "";
                }})
                .build();

            com.tigrisdata.tigris_core.models.shared.CreateNamespaceRequest req = new CreateNamespaceRequest() {{
                code = 411397L;
                id = "92601fb5-76b0-4d5f-8d30-c5fbb2587053";
                name = "Dorothy Dach";
            }};            

            CreateNamespaceResponse res = sdk.namespace.create(req);

            if (res.createNamespaceResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.CreateNamespaceResponse](../../models/operations/CreateNamespaceResponse.md)**


## get

Get details for all namespaces

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("dolor") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementDescribeNamespacesResponse res = sdk.namespace.get();

            if (res.describeNamespacesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.tigrisdata.tigris_core.models.operations.ManagementDescribeNamespacesResponse](../../models/operations/ManagementDescribeNamespacesResponse.md)**


## getMetadata

GetNamespaceMetadata inserts the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.GetNamespaceMetadataRequestValue;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("vero") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementGetNamespaceMetadataRequest req = new ManagementGetNamespaceMetadataRequest(                new GetNamespaceMetadataRequest() {{
                                metadataKey = "nostrum";
                                value = new GetNamespaceMetadataRequestValue();;
                            }};, "hic");            

            ManagementGetNamespaceMetadataResponse res = sdk.namespace.getMetadata(req);

            if (res.getNamespaceMetadataResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.ManagementGetNamespaceMetadataResponse](../../models/operations/ManagementGetNamespaceMetadataResponse.md)**


## insertMetadata

InsertNamespaceMetadata inserts the namespace metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.InsertNamespaceMetadataRequestValue;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("recusandae") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementInsertNamespaceMetadataRequest req = new ManagementInsertNamespaceMetadataRequest(                new InsertNamespaceMetadataRequest() {{
                                metadataKey = "omnis";
                                value = new InsertNamespaceMetadataRequestValue();;
                            }};, "facilis");            

            ManagementInsertNamespaceMetadataResponse res = sdk.namespace.insertMetadata(req);

            if (res.insertNamespaceMetadataResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.ManagementInsertNamespaceMetadataResponse](../../models/operations/ManagementInsertNamespaceMetadataResponse.md)**


## list

List all namespace

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("perspiciatis") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementListNamespacesResponse res = sdk.namespace.list();

            if (res.listNamespacesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[com.tigrisdata.tigris_core.models.operations.ManagementListNamespacesResponse](../../models/operations/ManagementListNamespacesResponse.md)**


## updateMetadata

UpdateNamespaceMetadata updates the user metadata object

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataRequest;
import com.tigrisdata.tigris_core.models.shared.UpdateNamespaceMetadataRequestValue;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("voluptatem") {{
                    bearerAuth = "";
                }})
                .build();

            ManagementUpdateNamespaceMetadataRequest req = new ManagementUpdateNamespaceMetadataRequest(                new UpdateNamespaceMetadataRequest() {{
                                metadataKey = "porro";
                                value = new UpdateNamespaceMetadataRequestValue();;
                            }};, "consequuntur");            

            ManagementUpdateNamespaceMetadataResponse res = sdk.namespace.updateMetadata(req);

            if (res.updateNamespaceMetadataResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.ManagementUpdateNamespaceMetadataResponse](../../models/operations/ManagementUpdateNamespaceMetadataResponse.md)**

