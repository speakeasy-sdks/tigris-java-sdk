# tigris-data

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'com.tigrisdata.tigris_core:tigris-data:0.1.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyPathParams;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateAppKeyResponse;
import com.tigrisdata.tigris_core.models.shared.CreateAppKeyRequest;

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

            TigrisCreateAppKeyRequest req = new TigrisCreateAppKeyRequest() {{
                pathParams = new TigrisCreateAppKeyPathParams() {{
                    project = "unde";
                }};
                request = new CreateAppKeyRequest() {{
                    description = "deserunt";
                    name = "porro";
                }};
            }};

            TigrisCreateAppKeyResponse res = sdk.applicationKeys.tigrisCreateAppKey(req);

            if (res.createAppKeyResponse.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## SDK Available Operations


### applicationKeys

* `tigrisCreateAppKey` - Creates the app key
* `tigrisDeleteAppKey` - Deletes the app key
* `tigrisListAppKeys` - List all the app keys
* `tigrisRotateAppKeySecret` - Rotates the app key secret
* `tigrisUpdateAppKey` - Updates the description of the app key

### authentication

* `authGetAccessToken` - Access Token

### cache

* `cacheCreateCache` - Creates the cache
* `cacheDel` - Deletes an entry from cache
* `cacheDeleteCache` - Deletes the cache
* `cacheGet` - Reads an entry from cache
* `cacheGetSet` - Sets an entry in the cache and returns the previous value if exists
* `cacheKeys` - Lists all the key for this cache
* `cacheListCaches` - Lists all the caches for the given project
* `cacheSet` - Sets an entry in the cache

### collections

* `tigrisCreateOrUpdateCollection` - Create or update a collection
* `tigrisDelete` - Delete Documents
* `tigrisDescribeCollection` - Describe Collection
* `tigrisDropCollection` - Drop Collection
* `tigrisImport` - Import Documents
* `tigrisInsert` - Insert Documents
* `tigrisRead` - Read Documents
* `tigrisReplace` - Insert or Replace Documents
* `tigrisSearch` - Search Documents.
* `tigrisUpdate` - Update Documents.

### database

* `tigrisBeginTransaction` - Begin a transaction
* `tigrisCommitTransaction` - Commit a Transaction
* `tigrisCreateBranch` - Create a database branch
* `tigrisDeleteBranch` - Delete a database branch
* `tigrisDescribeDatabase` - Describe database
* `tigrisListBranches` - List database branches
* `tigrisListCollections` - List Collections
* `tigrisRollbackTransaction` - Rollback a transaction

### management

* `managementCreateNamespace` - Creates a Namespace
* `managementDescribeNamespaces` - Describe the details of all namespaces
* `managementGetNamespaceMetadata` - Reads the Namespace Metadata
* `managementGetUserMetadata` - Reads the User Metadata
* `managementInsertNamespaceMetadata` - Inserts Namespace Metadata
* `managementInsertUserMetadata` - Inserts User Metadata
* `managementListNamespaces` - Lists all Namespaces
* `managementUpdateNamespaceMetadata` - Updates Namespace Metadata
* `managementUpdateUserMetadata` - Updates User Metadata

### observability

* `healthAPIHealth` - Health Check
* `observabilityGetInfo` - Information about the server
* `observabilityQueryTimeSeriesMetrics` - Queries time series metrics
* `observabilityQuotaLimits` - Queries current namespace quota limits
* `observabilityQuotaUsage` - Queries current namespace quota usage

### projects

* `tigrisCreateProject` - Create Project
* `tigrisDeleteProject` - Delete Project and all resources under project
* `tigrisListProjects` - List Projects

### realtime

* `realtimeGetRTChannel` - Get the details about a channel
* `realtimeGetRTChannels` - Get all channels for your application project
* `realtimeListSubscriptions` - Get the subscriptions details about a channel
* `realtimeMessages` - push messages to a single channel
* `realtimePresence` - Presence about the channel
* `realtimeReadMessages` - Get all messages for a channel

### search

* `searchCreate` - Create multiple documents
* `searchCreateById` - Create a single document
* `searchCreateOrReplace` - Create or replace documents in an index
* `searchCreateOrUpdateIndex` - Creates or updates search index
* `searchDelete` - Delete documents by ids
* `searchDeleteByQuery` - Delete documents by query
* `searchDeleteIndex` - Deletes search index
* `searchGet` - Get a single or multiple documents
* `searchGetIndex` - Get information about a search index
* `searchListIndexes` - List search indexes
* `searchSearch` - Search Documents.
* `searchUpdate` - Update documents in an index
* `searchUpdate` - Update documents in an index
<!-- End SDK Available Operations -->

### SDK Generated by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
