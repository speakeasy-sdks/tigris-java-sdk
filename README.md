# tigris-data

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.tigrisdata.tigris_core:tigris-data:0.54.2'
```

Maven:
```xml
<dependency>
    <groupId>com.tigrisdata.tigris_core</groupId>
    <artifactId>tigris-data</artifactId>
    <version>0.54.2</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.CacheCreateCacheRequest;
import com.tigrisdata.tigris_core.models.operations.CacheCreateCacheResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateCacheOptions;
import com.tigrisdata.tigris_core.models.shared.CreateCacheRequest;
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

            CacheCreateCacheRequest req = CacheCreateCacheRequest.builder()
                .createCacheRequest(CreateCacheRequest.builder()
                        .options(CreateCacheOptions.builder()
                            .ttlMs(481196L)
                            .build())
                        .build())
                .name("<value>")
                .project("<value>")
                .build();

            CacheCreateCacheResponse res = sdk.cache().create()
                .request(req)
                .call();

            if (res.createCacheResponse().isPresent()) {
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
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [auth()](docs/sdks/auth/README.md)

* [get](docs/sdks/auth/README.md#get) - Access Token

### [system()](docs/sdks/system/README.md)

* [getHealth](docs/sdks/system/README.md#gethealth) - Health Check
* [getServerInfo](docs/sdks/system/README.md#getserverinfo) - Information about the server
* [observabilityQuotaUsage](docs/sdks/system/README.md#observabilityquotausage) - Queries current namespace quota usage
* [queryQuotaLimits](docs/sdks/system/README.md#queryquotalimits) - Queries current namespace quota limits
* [queryTimeSeriesMetrics](docs/sdks/system/README.md#querytimeseriesmetrics) - Queries time series metrics

### [namespace()](docs/sdks/namespace/README.md)

* [create](docs/sdks/namespace/README.md#create) - Creates a Namespace
* [get](docs/sdks/namespace/README.md#get) - Describe the details of all namespaces
* [getMetadata](docs/sdks/namespace/README.md#getmetadata) - Reads the Namespace Metadata
* [insertMetadata](docs/sdks/namespace/README.md#insertmetadata) - Inserts Namespace Metadata
* [list](docs/sdks/namespace/README.md#list) - Lists all Namespaces
* [updateMetadata](docs/sdks/namespace/README.md#updatemetadata) - Updates Namespace Metadata

### [user()](docs/sdks/user/README.md)

* [getMetadata](docs/sdks/user/README.md#getmetadata) - Reads the User Metadata
* [insertMetadata](docs/sdks/user/README.md#insertmetadata) - Inserts User Metadata
* [updateMetadata](docs/sdks/user/README.md#updatemetadata) - Updates User Metadata

### [project()](docs/sdks/project/README.md)

* [create](docs/sdks/project/README.md#create) - Create Project
* [deleteProject](docs/sdks/project/README.md#deleteproject) - Delete Project and all resources under project
* [list](docs/sdks/project/README.md#list) - List Projects

### [appKey()](docs/sdks/appkey/README.md)

* [delete](docs/sdks/appkey/README.md#delete) - Deletes the app key
* [list](docs/sdks/appkey/README.md#list) - List all the app keys
* [rotate](docs/sdks/appkey/README.md#rotate) - Rotates the app key secret
* [tigrisCreateAppKey](docs/sdks/appkey/README.md#tigriscreateappkey) - Creates the app key
* [update](docs/sdks/appkey/README.md#update) - Updates the description of the app key

### [cache()](docs/sdks/cache/README.md)

* [create](docs/sdks/cache/README.md#create) - Creates the cache
* [delete](docs/sdks/cache/README.md#delete) - Deletes the cache
* [deleteKeys](docs/sdks/cache/README.md#deletekeys) - Deletes an entry from cache
* [getKey](docs/sdks/cache/README.md#getkey) - Reads an entry from cache
* [getSetKey](docs/sdks/cache/README.md#getsetkey) - Sets an entry in the cache and returns the previous value if exists
* [list](docs/sdks/cache/README.md#list) - Lists all the caches for the given project
* [listKeys](docs/sdks/cache/README.md#listkeys) - Lists all the key for this cache
* [setKey](docs/sdks/cache/README.md#setkey) - Sets an entry in the cache

### [database()](docs/sdks/database/README.md)

* [beginTransaction](docs/sdks/database/README.md#begintransaction) - Begin a transaction
* [commitTransaction](docs/sdks/database/README.md#committransaction) - Commit a Transaction
* [createBranch](docs/sdks/database/README.md#createbranch) - Create a database branch
* [deleteBranch](docs/sdks/database/README.md#deletebranch) - Delete a database branch
* [describe](docs/sdks/database/README.md#describe) - Describe database
* [listCollections](docs/sdks/database/README.md#listcollections) - List Collections
* [rollbackTransaction](docs/sdks/database/README.md#rollbacktransaction) - Rollback a transaction
* [tigrisListBranches](docs/sdks/database/README.md#tigrislistbranches) - List database branches

### [collection()](docs/sdks/collection/README.md)

* [create](docs/sdks/collection/README.md#create) - Create or update a collection
* [deleteDocuments](docs/sdks/collection/README.md#deletedocuments) - Delete Documents
* [describe](docs/sdks/collection/README.md#describe) - Describe Collection
* [drop](docs/sdks/collection/README.md#drop) - Drop Collection
* [importDocuments](docs/sdks/collection/README.md#importdocuments) - Import Documents
* [insertDocuments](docs/sdks/collection/README.md#insertdocuments) - Insert Documents
* [readDocuments](docs/sdks/collection/README.md#readdocuments) - Read Documents
* [replaceDocuments](docs/sdks/collection/README.md#replacedocuments) - Insert or Replace Documents
* [searchDocuments](docs/sdks/collection/README.md#searchdocuments) - Search Documents.
* [updateDocuments](docs/sdks/collection/README.md#updatedocuments) - Update Documents.

### [channel()](docs/sdks/channel/README.md)

* [get](docs/sdks/channel/README.md#get) - Get the details about a channel
* [getMessages](docs/sdks/channel/README.md#getmessages) - Get all messages for a channel
* [list](docs/sdks/channel/README.md#list) - Get all channels for your application project
* [listSubscriptions](docs/sdks/channel/README.md#listsubscriptions) - Get the subscriptions details about a channel
* [pushMessages](docs/sdks/channel/README.md#pushmessages) - push messages to a single channel
* [realtimePresence](docs/sdks/channel/README.md#realtimepresence) - Presence about the channel

### [search()](docs/sdks/search/README.md)

* [createDocument](docs/sdks/search/README.md#createdocument) - Create a single document
* [createDocuments](docs/sdks/search/README.md#createdocuments) - Create multiple documents
* [deleteDocuments](docs/sdks/search/README.md#deletedocuments) - Delete documents by ids
* [deleteIndex](docs/sdks/search/README.md#deleteindex) - Deletes search index
* [findDocuments](docs/sdks/search/README.md#finddocuments) - Search Documents.
* [getDocuments](docs/sdks/search/README.md#getdocuments) - Get a single or multiple documents
* [getIndex](docs/sdks/search/README.md#getindex) - Get information about a search index
* [listIndexes](docs/sdks/search/README.md#listindexes) - List search indexes
* [queryDeleteDocuments](docs/sdks/search/README.md#querydeletedocuments) - Delete documents by query
* [replaceDocuments](docs/sdks/search/README.md#replacedocuments) - Create or replace documents in an index
* [updateDocuments](docs/sdks/search/README.md#updatedocuments) - Update documents in an index
* [updateIndex](docs/sdks/search/README.md#updateindex) - Creates or updates search index
<!-- End Available Resources and Operations [operations] -->



<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://api.preview.tigrisdata.cloud` | None |
| 1 | `http://localhost:8081` | None |

#### Example

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.AuthGetAccessTokenResponse;
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
                .serverIndex(1)
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            AuthGetAccessTokenResponse res = sdk.auth().get()
                .call();

            if (res.getAccessTokenResponse().isPresent()) {
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


### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.AuthGetAccessTokenResponse;
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
                .serverURL("https://api.preview.tigrisdata.cloud")
                .security(Security.builder()
                    .bearerAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .build();

            AuthGetAccessTokenResponse res = sdk.auth().get()
                .call();

            if (res.getAccessTokenResponse().isPresent()) {
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
<!-- End Server Selection [server] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

### Example

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.AuthGetAccessTokenResponse;
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

            AuthGetAccessTokenResponse res = sdk.auth().get()
                .call();

            if (res.getAccessTokenResponse().isPresent()) {
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
<!-- End Error Handling [errors] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name         | Type         | Scheme       |
| ------------ | ------------ | ------------ |
| `bearerAuth` | http         | HTTP Bearer  |

You can set the security parameters through the `security` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.AuthGetAccessTokenResponse;
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

            AuthGetAccessTokenResponse res = sdk.auth().get()
                .call();

            if (res.getAccessTokenResponse().isPresent()) {
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
<!-- End Authentication [security] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
