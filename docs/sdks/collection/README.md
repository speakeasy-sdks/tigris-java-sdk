# Collection
(*collection()*)

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
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CollectionOptions;
import com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest;
import com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequestSchema;
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

            TigrisCreateOrUpdateCollectionRequest req = TigrisCreateOrUpdateCollectionRequest.builder()
                .createOrUpdateCollectionRequest(CreateOrUpdateCollectionRequest.builder()
                        .branch("<value>")
                        .onlyCreate(false)
                        .options(CollectionOptions.builder()
                            .build())
                        .schema(CreateOrUpdateCollectionRequestSchema.builder()
                            .build())
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisCreateOrUpdateCollectionResponse res = sdk.collection().create()
                .request(req)
                .call();

            if (res.createOrUpdateCollectionResponse().isPresent()) {
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
| `request`                                                                                                                                              | [com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionRequest](../../models/operations/TigrisCreateOrUpdateCollectionRequest.md) | :heavy_check_mark:                                                                                                                                     | The request object to use for the request.                                                                                                             |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisCreateOrUpdateCollectionResponse>](../../models/operations/TigrisCreateOrUpdateCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDocuments

Delete a range of documents in the collection using the condition provided in the filter.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.DeleteRequest;
import com.tigrisdata.tigris_core.models.shared.DeleteRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Filter;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;
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

            TigrisDeleteRequest req = TigrisDeleteRequest.builder()
                .deleteRequest(DeleteRequest.builder()
                        .branch("<value>")
                        .filter(Filter.builder()
                            .build())
                        .options(DeleteRequestOptions.builder()
                            .collation(Collation.builder()
                                .case_("<value>")
                                .build())
                            .limit(968874L)
                            .writeOptions(WriteOptions.builder()
                                .build())
                            .build())
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisDeleteResponse res = sdk.collection().deleteDocuments()
                .request(req)
                .call();

            if (res.deleteResponse().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisDeleteRequest](../../models/operations/TigrisDeleteRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisDeleteResponse>](../../models/operations/TigrisDeleteResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## describe

Returns the information related to the collection. This can be used to retrieve the schema or size of the collection.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CollectionOptions;
import com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest;
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

            TigrisDescribeCollectionRequest req = TigrisDescribeCollectionRequest.builder()
                .describeCollectionRequest(DescribeCollectionRequest.builder()
                        .branch("<value>")
                        .collection("<value>")
                        .options(CollectionOptions.builder()
                            .build())
                        .project("<value>")
                        .schemaFormat("<value>")
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisDescribeCollectionResponse res = sdk.collection().describe()
                .request(req)
                .call();

            if (res.describeCollectionResponse().isPresent()) {
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
| `request`                                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionRequest](../../models/operations/TigrisDescribeCollectionRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse>](../../models/operations/TigrisDescribeCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## drop

Drops the collection inside this project. This API deletes all of the
 documents inside this collection and any metadata associated with it.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CollectionOptions;
import com.tigrisdata.tigris_core.models.shared.DropCollectionRequest;
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

            TigrisDropCollectionRequest req = TigrisDropCollectionRequest.builder()
                .dropCollectionRequest(DropCollectionRequest.builder()
                        .branch("<value>")
                        .options(CollectionOptions.builder()
                            .build())
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisDropCollectionResponse res = sdk.collection().drop()
                .request(req)
                .call();

            if (res.dropCollectionResponse().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionRequest](../../models/operations/TigrisDropCollectionRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse>](../../models/operations/TigrisDropCollectionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

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
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisImportRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisImportResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Documents;
import com.tigrisdata.tigris_core.models.shared.ImportRequest;
import com.tigrisdata.tigris_core.models.shared.ImportRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;
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

            TigrisImportRequest req = TigrisImportRequest.builder()
                .importRequest(ImportRequest.builder()
                        .autogenerated(java.util.List.of(
                            "<value>"))
                        .branch("<value>")
                        .createCollection(false)
                        .documents(java.util.List.of(
                            Documents.builder()
                                .build()))
                        .options(ImportRequestOptions.builder()
                            .writeOptions(WriteOptions.builder()
                                .build())
                            .build())
                        .primaryKey(java.util.List.of(
                            "<value>"))
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisImportResponse res = sdk.collection().importDocuments()
                .request(req)
                .call();

            if (res.importResponse().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisImportRequest](../../models/operations/TigrisImportRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisImportResponse>](../../models/operations/TigrisImportResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## insertDocuments

Inserts new documents in the collection and returns an AlreadyExists error if any of the documents
 in the request already exists. Insert provides idempotency by returning an error if the document
 already exists. To replace documents, use REPLACE API instead of INSERT.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisInsertRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisInsertResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.InsertRequest;
import com.tigrisdata.tigris_core.models.shared.InsertRequestDocuments;
import com.tigrisdata.tigris_core.models.shared.InsertRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;
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

            TigrisInsertRequest req = TigrisInsertRequest.builder()
                .insertRequest(InsertRequest.builder()
                        .branch("<value>")
                        .documents(java.util.List.of(
                            InsertRequestDocuments.builder()
                                .build()))
                        .options(InsertRequestOptions.builder()
                            .writeOptions(WriteOptions.builder()
                                .build())
                            .build())
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisInsertResponse res = sdk.collection().insertDocuments()
                .request(req)
                .call();

            if (res.insertResponse().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisInsertRequest](../../models/operations/TigrisInsertRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisInsertResponse>](../../models/operations/TigrisInsertResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

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
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisReadRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisReadResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.Fields;
import com.tigrisdata.tigris_core.models.shared.ReadRequest;
import com.tigrisdata.tigris_core.models.shared.ReadRequestFilter;
import com.tigrisdata.tigris_core.models.shared.ReadRequestOptions;
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

            TigrisReadRequest req = TigrisReadRequest.builder()
                .readRequest(ReadRequest.builder()
                        .branch("<value>")
                        .fields(Fields.builder()
                            .build())
                        .filter(ReadRequestFilter.builder()
                            .build())
                        .options(ReadRequestOptions.builder()
                            .collation(Collation.builder()
                                .case_("<value>")
                                .build())
                            .limit(649883L)
                            .offset("<value>")
                            .skip(11274L)
                            .build())
                        .sort("<value>")
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisReadResponse res = sdk.collection().readDocuments()
                .request(req)
                .call();

            if (res.streamingReadResponse().isPresent()) {
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisReadRequest](../../models/operations/TigrisReadRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisReadResponse>](../../models/operations/TigrisReadResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## replaceDocuments

Inserts the documents or replaces the existing documents in the collections.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisReplaceRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequest;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequestDocuments;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;
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

            TigrisReplaceRequest req = TigrisReplaceRequest.builder()
                .replaceRequest(ReplaceRequest.builder()
                        .branch("<value>")
                        .documents(java.util.List.of(
                            ReplaceRequestDocuments.builder()
                                .build()))
                        .options(ReplaceRequestOptions.builder()
                            .writeOptions(WriteOptions.builder()
                                .build())
                            .build())
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisReplaceResponse res = sdk.collection().replaceDocuments()
                .request(req)
                .call();

            if (res.replaceResponse().isPresent()) {
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.tigrisdata.tigris_core.models.operations.TigrisReplaceRequest](../../models/operations/TigrisReplaceRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse>](../../models/operations/TigrisReplaceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## searchDocuments

Searches a collection for the documents matching the query, or messages in case of event streaming. A search can be
 a term search or a phrase search. Search API allows filtering the result set using filters as documented <a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here">here</a>.
 You can also perform a faceted search by passing the fields in the facet parameter.
 You can find more detailed documentation of the Search API with multiple examples <a href="https://docs.tigrisdata.com/overview/search" title="here">here</a>.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisSearchRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisSearchResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.Facet;
import com.tigrisdata.tigris_core.models.shared.SearchRequest;
import com.tigrisdata.tigris_core.models.shared.SearchRequestFields;
import com.tigrisdata.tigris_core.models.shared.SearchRequestFilter;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.Sort;
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

            TigrisSearchRequest req = TigrisSearchRequest.builder()
                .searchRequest(SearchRequest.builder()
                        .branch("<value>")
                        .collation(Collation.builder()
                            .case_("<value>")
                            .build())
                        .excludeFields(java.util.List.of(
                            "<value>"))
                        .facet(Facet.builder()
                            .build())
                        .fields(SearchRequestFields.builder()
                            .build())
                        .filter(SearchRequestFilter.builder()
                            .build())
                        .includeFields(java.util.List.of(
                            "<value>"))
                        .page(124504)
                        .pageSize(87653)
                        .q("<value>")
                        .searchFields(java.util.List.of(
                            "<value>"))
                        .sort(Sort.builder()
                            .build())
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisSearchResponse res = sdk.collection().searchDocuments()
                .request(req)
                .call();

            if (res.streamingSearchResponse().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisSearchRequest](../../models/operations/TigrisSearchRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisSearchResponse>](../../models/operations/TigrisSearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDocuments

Update a range of documents in the collection using the condition provided in the filter.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisUpdateResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateRequest;
import com.tigrisdata.tigris_core.models.shared.UpdateRequestFields;
import com.tigrisdata.tigris_core.models.shared.UpdateRequestFilter;
import com.tigrisdata.tigris_core.models.shared.UpdateRequestOptions;
import com.tigrisdata.tigris_core.models.shared.WriteOptions;
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

            TigrisUpdateRequest req = TigrisUpdateRequest.builder()
                .updateRequest(UpdateRequest.builder()
                        .branch("<value>")
                        .fields(UpdateRequestFields.builder()
                            .build())
                        .filter(UpdateRequestFilter.builder()
                            .build())
                        .options(UpdateRequestOptions.builder()
                            .collation(Collation.builder()
                                .case_("<value>")
                                .build())
                            .limit(286496L)
                            .writeOptions(WriteOptions.builder()
                                .build())
                            .build())
                        .build())
                .collection("<value>")
                .project("<value>")
                .build();

            TigrisUpdateResponse res = sdk.collection().updateDocuments()
                .request(req)
                .call();

            if (res.updateResponse().isPresent()) {
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.TigrisUpdateRequest](../../models/operations/TigrisUpdateRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisUpdateResponse>](../../models/operations/TigrisUpdateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
