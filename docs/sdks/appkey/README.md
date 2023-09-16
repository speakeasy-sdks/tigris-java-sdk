# AppKey

## Overview

The application keys section provide APIs that can be used to manage application keys for your project. A single project can have one or more application keys.

### Available Operations

* [delete](#delete) - Deletes the app key
* [list](#list) - List all the app keys
* [rotate](#rotate) - Rotates the app key secret
* [tigrisCreateAppKey](#tigriscreateappkey) - Creates the app key
* [update](#update) - Updates the description of the app key

## delete

Delete an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteAppKeyRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("unde") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisDeleteAppKeyRequest req = new TigrisDeleteAppKeyRequest(                new DeleteAppKeyRequest() {{
                                id = "d8d69a67-4e0f-4467-8c87-96ed151a05df";
                            }};, "quo");            

            TigrisDeleteAppKeyResponse res = sdk.appKey.delete(req);

            if (res.deleteAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest](../../models/operations/TigrisDeleteAppKeyRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse](../../models/operations/TigrisDeleteAppKeyResponse.md)**


## list

Lists all app keys visible to requesting actor.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("odit") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisListAppKeysRequest req = new TigrisListAppKeysRequest("at");            

            TigrisListAppKeysResponse res = sdk.appKey.list(req);

            if (res.listAppKeysResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysRequest](../../models/operations/TigrisListAppKeysRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse](../../models/operations/TigrisListAppKeysResponse.md)**


## rotate

Endpoint is used to rotate the secret for the app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse;
import com.tigrisdata.tigris_core.models.shared.RotateAppKeyRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("at") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisRotateAppKeySecretRequest req = new TigrisRotateAppKeySecretRequest(                new RotateAppKeyRequest() {{
                                id = "f7cc78ca-1ba9-428f-8816-742cb7392059";
                                project = "sed";
                            }};, "iste");            

            TigrisRotateAppKeySecretResponse res = sdk.appKey.rotate(req);

            if (res.rotateAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretRequest](../../models/operations/TigrisRotateAppKeySecretRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse](../../models/operations/TigrisRotateAppKeySecretResponse.md)**


## tigrisCreateAppKey

Create an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.CreateAppKeyRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("dolor") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisCreateAppKeyRequest req = new TigrisCreateAppKeyRequest(                new CreateAppKeyRequest() {{
                                description = "natus";
                                name = "May Turcotte";
                            }};, "corporis");            

            TigrisCreateAppKeyResponse res = sdk.appKey.tigrisCreateAppKey(req);

            if (res.createAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest](../../models/operations/TigrisCreateAppKeyRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse](../../models/operations/TigrisCreateAppKeyResponse.md)**


## update

Update the description of an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateAppKeyRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("iste") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisUpdateAppKeyRequest req = new TigrisUpdateAppKeyRequest(                new UpdateAppKeyRequest() {{
                                description = "iure";
                                id = "eb10faaa-2352-4c59-9590-7aff1a3a2fa9";
                                name = "Lucy Konopelski";
                            }};, "error");            

            TigrisUpdateAppKeyResponse res = sdk.appKey.update(req);

            if (res.updateAppKeyResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyRequest](../../models/operations/TigrisUpdateAppKeyRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse](../../models/operations/TigrisUpdateAppKeyResponse.md)**

