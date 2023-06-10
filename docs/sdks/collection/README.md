# collection

## Overview

The Collections section provide APIs that can be used to manage collections. A collection can have one or more documents.

### Available Operations

* [create](#create) - Create or update a collection
* [deleteDocuments](#deletedocuments) - Delete Documents
* [describe](#describe) - Describe Collection
* [drop](#drop) - Drop Collection
* [importDocuments](#importdocuments) - Import Documents
* [insertDocuments](#insertdocuments) - Insert Documents
* [readDocuments](#readdocuments) - Read Documents
* [replaceDocuments](#replacedocuments) - Insert or Replace Documents
* [searchDocuments](#searchdocuments) - Search Documents.
* [updateDocuments](#updatedocuments) - Update Documents.

## create

Creates a new collection or atomically upgrades the collection to the new schema provided in the request.
 Schema changes are applied atomically and immediately without any downtime.
 Tigris Offers two types of collections: <p></p>
    <li> `DOCUMENTS`: Offers rich CRUD APIs.
    <li> `MESSAGES`: Offers event streaming APIs.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.CollectionOptions;
import com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest;
import com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequestSchema;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("illum") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisCreateOrUpdateCollectionRequest req = new TigrisCreateOrUpdateCollectionRequest(                new CreateOrUpdateCollectionRequest() {{
                                branch = "maiores";
                                onlyCreate = false;
                                options = new CollectionOptions();;
                                schema = new CreateOrUpdateCollectionRequestSchema();;
                            }};, "rerum", "dicta");            

            TigrisCreateOrUpdateCollectionResponse res = sdk.collection.create(req);

            if (res.createOrUpdateCollectionResponse != null) {
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
| `request`                                                                                                                                              | [com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionRequest](../../models/operations/TigrisCreateOrUpdateCollectionRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionResponse](../../models/operations/TigrisCreateOrUpdateCollectionResponse.md)**


## deleteDocuments

Delete a range of documents in the collection using the condition provided in the filter.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteResponse;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.DeleteRequest;
import com.tigrisdata.tigris_core.models.shared.DeleteRequestFilter;
import com.tigrisdata.tigris_core.models.shared.DeleteRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("magnam") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisDeleteRequest req = new TigrisDeleteRequest(                new DeleteRequest() {{
                                branch = "cumque";
                                filter = new DeleteRequestFilter();;
                                options = new DeleteRequestOptions() {{
                                    collation = new Collation() {{
                                        case_ = "facere";
                                    }};;
                                    limit = 411820L;
                                    writeOptions = new WriteOptions();;
                                }};;
                            }};, "aliquid", "laborum");            

            TigrisDeleteResponse res = sdk.collection.deleteDocuments(req);

            if (res.deleteResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisDeleteRequest](../../models/operations/TigrisDeleteRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisDeleteResponse](../../models/operations/TigrisDeleteResponse.md)**


## describe

Returns the information related to the collection. This can be used to retrieve the schema or size of the collection.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.CollectionOptions;
import com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("accusamus") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisDescribeCollectionRequest req = new TigrisDescribeCollectionRequest(                new DescribeCollectionRequest() {{
                                branch = "non";
                                collection = "occaecati";
                                options = new CollectionOptions();;
                                project = "enim";
                                schemaFormat = "accusamus";
                            }};, "delectus", "quidem");            

            TigrisDescribeCollectionResponse res = sdk.collection.describe(req);

            if (res.describeCollectionResponse != null) {
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
| `request`                                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionRequest](../../models/operations/TigrisDescribeCollectionRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse](../../models/operations/TigrisDescribeCollectionResponse.md)**


## drop

Drops the collection inside this project. This API deletes all of the
 documents inside this collection and any metadata associated with it.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.CollectionOptions;
import com.tigrisdata.tigris_core.models.shared.DropCollectionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("provident") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisDropCollectionRequest req = new TigrisDropCollectionRequest(                new DropCollectionRequest() {{
                                branch = "nam";
                                options = new CollectionOptions();;
                            }};, "id", "blanditiis");            

            TigrisDropCollectionResponse res = sdk.collection.drop(req);

            if (res.dropCollectionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionRequest](../../models/operations/TigrisDropCollectionRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse](../../models/operations/TigrisDropCollectionResponse.md)**


## importDocuments

Imports documents into the collection.

 It automatically:
  * Detects the schema of the documents in the batch
  * Evolves the schema as soon as it's backward compatible
  * Creates collection with inferred schema (if requested)

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisImportRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisImportResponse;
import com.tigrisdata.tigris_core.models.shared.ImportRequest;
import com.tigrisdata.tigris_core.models.shared.ImportRequestDocuments;
import com.tigrisdata.tigris_core.models.shared.ImportRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("deleniti") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisImportRequest req = new TigrisImportRequest(                new ImportRequest() {{
                                autogenerated = new String[]{{
                                    add("amet"),
                                    add("deserunt"),
                                    add("nisi"),
                                    add("vel"),
                                }};
                                branch = "natus";
                                createCollection = false;
                                documents = new com.tigrisdata.tigris_core.models.shared.ImportRequestDocuments[]{{
                                    add(new ImportRequestDocuments() {{}}),
                                    add(new ImportRequestDocuments() {{}}),
                                    add(new ImportRequestDocuments() {{}}),
                                }};
                                options = new ImportRequestOptions() {{
                                    writeOptions = new WriteOptions();;
                                }};;
                                primaryKey = new String[]{{
                                    add("perferendis"),
                                    add("nihil"),
                                }};
                            }};, "magnam", "distinctio");            

            TigrisImportResponse res = sdk.collection.importDocuments(req);

            if (res.importResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisImportRequest](../../models/operations/TigrisImportRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisImportResponse](../../models/operations/TigrisImportResponse.md)**


## insertDocuments

Inserts new documents in the collection and returns an AlreadyExists error if any of the documents
 in the request already exists. Insert provides idempotency by returning an error if the document
 already exists. To replace documents, use REPLACE API instead of INSERT.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisInsertRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisInsertResponse;
import com.tigrisdata.tigris_core.models.shared.InsertRequest;
import com.tigrisdata.tigris_core.models.shared.InsertRequestDocuments;
import com.tigrisdata.tigris_core.models.shared.InsertRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("id") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisInsertRequest req = new TigrisInsertRequest(                new InsertRequest() {{
                                branch = "labore";
                                documents = new com.tigrisdata.tigris_core.models.shared.InsertRequestDocuments[]{{
                                    add(new InsertRequestDocuments() {{}}),
                                    add(new InsertRequestDocuments() {{}}),
                                }};
                                options = new InsertRequestOptions() {{
                                    writeOptions = new WriteOptions();;
                                }};;
                            }};, "suscipit", "natus");            

            TigrisInsertResponse res = sdk.collection.insertDocuments(req);

            if (res.insertResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisInsertRequest](../../models/operations/TigrisInsertRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisInsertResponse](../../models/operations/TigrisInsertResponse.md)**


## readDocuments

Reads a range of documents from the collection, or messages from a collection in case of event streaming. Tigris does not require you to
 index any fields and automatically index all the fields which means you can filter by any field in the document.
 An empty filter will trigger reading all the documents inside this collection. The API supports pagination that
 can be used by passing `Limit/Skip` parameters. The `skip` parameter skips the number of documents from the start and
 the `limit` parameter is used to specify the number of documents to read. You can find more detailed documentation
 of the Read API <a href="https://docs.tigrisdata.com/overview/query" title="here">here</a>.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisReadRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisReadResponse;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.ReadRequest;
import com.tigrisdata.tigris_core.models.shared.ReadRequestFields;
import com.tigrisdata.tigris_core.models.shared.ReadRequestFilter;
import com.tigrisdata.tigris_core.models.shared.ReadRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("nobis") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisReadRequest req = new TigrisReadRequest(                new ReadRequest() {{
                                branch = "eum";
                                fields = new ReadRequestFields();;
                                filter = new ReadRequestFilter();;
                                options = new ReadRequestOptions() {{
                                    collation = new Collation() {{
                                        case_ = "vero";
                                    }};;
                                    limit = 135474L;
                                    offset = "architecto";
                                    skip = 298282L;
                                }};;
                                sort = "et";
                            }};, "excepturi", "ullam");            

            TigrisReadResponse res = sdk.collection.readDocuments(req);

            if (res.streamingReadResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisReadRequest](../../models/operations/TigrisReadRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisReadResponse](../../models/operations/TigrisReadResponse.md)**


## replaceDocuments

Inserts the documents or replaces the existing documents in the collections.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisReplaceRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequest;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequestDocuments;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("provident") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisReplaceRequest req = new TigrisReplaceRequest(                new ReplaceRequest() {{
                                branch = "quos";
                                documents = new com.tigrisdata.tigris_core.models.shared.ReplaceRequestDocuments[]{{
                                    add(new ReplaceRequestDocuments() {{}}),
                                    add(new ReplaceRequestDocuments() {{}}),
                                    add(new ReplaceRequestDocuments() {{}}),
                                }};
                                options = new ReplaceRequestOptions() {{
                                    writeOptions = new WriteOptions();;
                                }};;
                            }};, "accusantium", "mollitia");            

            TigrisReplaceResponse res = sdk.collection.replaceDocuments(req);

            if (res.replaceResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.tigrisdata.tigris_core.models.operations.TigrisReplaceRequest](../../models/operations/TigrisReplaceRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse](../../models/operations/TigrisReplaceResponse.md)**


## searchDocuments

Searches a collection for the documents matching the query, or messages in case of event streaming. A search can be
 a term search or a phrase search. Search API allows filtering the result set using filters as documented <a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here">here</a>.
 You can also perform a faceted search by passing the fields in the facet parameter.
 You can find more detailed documentation of the Search API with multiple examples <a href="https://docs.tigrisdata.com/overview/search" title="here">here</a>.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisSearchRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisSearchResponse;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.SearchRequest;
import com.tigrisdata.tigris_core.models.shared.SearchRequestFacet;
import com.tigrisdata.tigris_core.models.shared.SearchRequestFields;
import com.tigrisdata.tigris_core.models.shared.SearchRequestFilter;
import com.tigrisdata.tigris_core.models.shared.SearchRequestSort;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("reiciendis") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisSearchRequest req = new TigrisSearchRequest(                new SearchRequest() {{
                                branch = "mollitia";
                                collation = new Collation() {{
                                    case_ = "ad";
                                }};;
                                excludeFields = new String[]{{
                                    add("dolor"),
                                    add("necessitatibus"),
                                }};
                                facet = new SearchRequestFacet();;
                                fields = new SearchRequestFields();;
                                filter = new SearchRequestFilter();;
                                includeFields = new String[]{{
                                    add("nemo"),
                                }};
                                page = 97260;
                                pageSize = 435865;
                                q = "doloribus";
                                searchFields = new String[]{{
                                    add("eius"),
                                    add("maxime"),
                                    add("deleniti"),
                                    add("facilis"),
                                }};
                                sort = new SearchRequestSort();;
                            }};, "in", "architecto");            

            TigrisSearchResponse res = sdk.collection.searchDocuments(req);

            if (res.streamingSearchResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisSearchRequest](../../models/operations/TigrisSearchRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisSearchResponse](../../models/operations/TigrisSearchResponse.md)**


## updateDocuments

Update a range of documents in the collection using the condition provided in the filter.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateResponse;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateRequest;
import com.tigrisdata.tigris_core.models.shared.UpdateRequestFields;
import com.tigrisdata.tigris_core.models.shared.UpdateRequestFilter;
import com.tigrisdata.tigris_core.models.shared.UpdateRequestOptions;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("architecto") {{
                    bearerAuth = "";
                }})
                .build();

            TigrisUpdateRequest req = new TigrisUpdateRequest(                new UpdateRequest() {{
                                branch = "repudiandae";
                                fields = new UpdateRequestFields();;
                                filter = new UpdateRequestFilter();;
                                options = new UpdateRequestOptions() {{
                                    collation = new Collation() {{
                                        case_ = "ullam";
                                    }};;
                                    limit = 714242L;
                                    writeOptions = new WriteOptions();;
                                }};;
                            }};, "nihil", "repellat");            

            TigrisUpdateResponse res = sdk.collection.updateDocuments(req);

            if (res.updateResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisUpdateRequest](../../models/operations/TigrisUpdateRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.TigrisUpdateResponse](../../models/operations/TigrisUpdateResponse.md)**
