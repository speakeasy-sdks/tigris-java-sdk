# tigris-data

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'com.tigrisdata.tigris_core:tigris-data:0.0.2'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyPathParams;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteAppKeyRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK.Builder builder = SDK.builder();

            builder.setSecurity(
                new Security() {{
                    bearerAuth = new SchemeBearerAuth() {{
                        authorization = "Bearer YOUR_BEARER_TOKEN_HERE";
                    }};
                }}
            );

            SDK sdk = builder.build();

            TigrisDeleteAppKeyRequest req = new TigrisDeleteAppKeyRequest() {{
                pathParams = new TigrisDeleteAppKeyPathParams() {{
                    project = "unde";
                }};
                request = new DeleteAppKeyRequest() {{
                    id = "deserunt";
                }};
            }};

            TigrisDeleteAppKeyResponse res = sdk.appKey.delete(req);

            if (res.deleteAppKeyResponse.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations


### appKey

* `delete` - Deletes the app key
* `list` - List all the app keys
* `rotate` - Rotates the app key secret
* `tigrisCreateAppKey` - Creates the app key
* `update` - Updates the description of the app key

### auth

* `get` - Access Token

### cache

* `create` - Creates the cache
* `delete` - Deletes the cache
* `deleteKeys` - Deletes an entry from cache
* `getKey` - Reads an entry from cache
* `getSetKey` - Sets an entry in the cache and returns the previous value if exists
* `list` - Lists all the caches for the given project
* `listKeys` - Lists all the key for this cache
* `setKey` - Sets an entry in the cache

### channel

* `get` - Get the details about a channel
* `getMessages` - Get all messages for a channel
* `list` - Get all channels for your application project
* `listSubscriptions` - Get the subscriptions details about a channel
* `pushMessages` - push messages to a single channel
* `realtimePresence` - Presence about the channel

### collection

* `create` - Create or update a collection
* `deleteDocuments` - Delete Documents
* `describe` - Describe Collection
* `drop` - Drop Collection
* `importDocuments` - Import Documents
* `insertDocuments` - Insert Documents
* `readDocuments` - Read Documents
* `replaceDocuments` - Insert or Replace Documents
* `searchDocuments` - Search Documents.
* `updateDocuments` - Update Documents.

### database

* `beginTransaction` - Begin a transaction
* `commitTransaction` - Commit a Transaction
* `createBranch` - Create a database branch
* `deleteBranch` - Delete a database branch
* `describe` - Describe database
* `listCollections` - List Collections
* `rollbackTransaction` - Rollback a transaction
* `tigrisListBranches` - List database branches

### namespace

* `create` - Creates a Namespace
* `get` - Describe the details of all namespaces
* `getMetadata` - Reads the Namespace Metadata
* `insertMetadata` - Inserts Namespace Metadata
* `list` - Lists all Namespaces
* `updateMetadata` - Updates Namespace Metadata

### project

* `create` - Create Project
* `deleteProject` - Delete Project and all resources under project
* `list` - List Projects

### search

* `createDocument` - Create a single document
* `createDocuments` - Create multiple documents
* `deleteDocuments` - Delete documents by ids
* `deleteIndex` - Deletes search index
* `findDocuments` - Search Documents.
* `getDocuments` - Get a single or multiple documents
* `getIndex` - Get information about a search index
* `listIndexes` - List search indexes
* `queryDeleteDocuments` - Delete documents by query
* `replaceDocuments` - Create or replace documents in an index
* `updateDocuments` - Update documents in an index
* `updateIndex` - Creates or updates search index

### system

* `getHealth` - Health Check
* `getServerInfo` - Information about the server
* `observabilityQuotaUsage` - Queries current namespace quota usage
* `queryQuotaLimits` - Queries current namespace quota limits
* `queryTimeSeriesMetrics` - Queries time series metrics

### user

* `getMetadata` - Reads the User Metadata
* `insertMetadata` - Inserts User Metadata
* `updateMetadata` - Updates User Metadata
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
