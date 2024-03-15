# AppKey
(*appKey()*)

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
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DeleteAppKeyRequest;
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

            TigrisDeleteAppKeyRequest req = TigrisDeleteAppKeyRequest.builder()
                .deleteAppKeyRequest(DeleteAppKeyRequest.builder()
                        .id("<id>")
                        .build())
                .project("<value>")
                .build();

            TigrisDeleteAppKeyResponse res = sdk.appKey().delete()
                .request(req)
                .call();

            if (res.deleteAppKeyResponse().isPresent()) {
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest](../../models/operations/TigrisDeleteAppKeyRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse>](../../models/operations/TigrisDeleteAppKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

Lists all app keys visible to requesting actor.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse;
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

            TigrisListAppKeysRequest req = TigrisListAppKeysRequest.builder()
                .project("<value>")
                .build();

            TigrisListAppKeysResponse res = sdk.appKey().list()
                .request(req)
                .call();

            if (res.listAppKeysResponse().isPresent()) {
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysRequest](../../models/operations/TigrisListAppKeysRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisListAppKeysResponse>](../../models/operations/TigrisListAppKeysResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## rotate

Endpoint is used to rotate the secret for the app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.RotateAppKeyRequest;
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

            TigrisRotateAppKeySecretRequest req = TigrisRotateAppKeySecretRequest.builder()
                .rotateAppKeyRequest(RotateAppKeyRequest.builder()
                        .id("<id>")
                        .project("<value>")
                        .build())
                .project("<value>")
                .build();

            TigrisRotateAppKeySecretResponse res = sdk.appKey().rotate()
                .request(req)
                .call();

            if (res.rotateAppKeyResponse().isPresent()) {
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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretRequest](../../models/operations/TigrisRotateAppKeySecretRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisRotateAppKeySecretResponse>](../../models/operations/TigrisRotateAppKeySecretResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## tigrisCreateAppKey

Create an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateAppKeyRequest;
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

            TigrisCreateAppKeyRequest req = TigrisCreateAppKeyRequest.builder()
                .createAppKeyRequest(CreateAppKeyRequest.builder()
                        .description("User-centric bifurcated product")
                        .name("<value>")
                        .build())
                .project("<value>")
                .build();

            TigrisCreateAppKeyResponse res = sdk.appKey().tigrisCreateAppKey()
                .request(req)
                .call();

            if (res.createAppKeyResponse().isPresent()) {
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest](../../models/operations/TigrisCreateAppKeyRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse>](../../models/operations/TigrisCreateAppKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Update the description of an app key.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateAppKeyRequest;
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

            TigrisUpdateAppKeyRequest req = TigrisUpdateAppKeyRequest.builder()
                .updateAppKeyRequest(UpdateAppKeyRequest.builder()
                        .description("Optimized 24/7 middleware")
                        .id("<id>")
                        .name("<value>")
                        .build())
                .project("<value>")
                .build();

            TigrisUpdateAppKeyResponse res = sdk.appKey().update()
                .request(req)
                .call();

            if (res.updateAppKeyResponse().isPresent()) {
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyRequest](../../models/operations/TigrisUpdateAppKeyRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisUpdateAppKeyResponse>](../../models/operations/TigrisUpdateAppKeyResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
