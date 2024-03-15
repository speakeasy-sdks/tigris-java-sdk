# Search
(*search()*)

## Overview

The search section provides you APIs that can be used to implement powerful apps with search experiences. You can manage storing documents on your own or you can simply integrate it with your database.

### Available Operations

* [createDocument](#createdocument) - Create a single document
* [createDocuments](#createdocuments) - Create multiple documents
* [deleteDocuments](#deletedocuments) - Delete documents by ids
* [deleteIndex](#deleteindex) - Deletes search index
* [findDocuments](#finddocuments) - Search Documents.
* [getDocuments](#getdocuments) - Get a single or multiple documents
* [getIndex](#getindex) - Get information about a search index
* [listIndexes](#listindexes) - List search indexes
* [queryDeleteDocuments](#querydeletedocuments) - Delete documents by query
* [replaceDocuments](#replacedocuments) - Create or replace documents in an index
* [updateDocuments](#updatedocuments) - Update documents in an index
* [updateIndex](#updateindex) - Creates or updates search index

## createDocument

CreateById is used for indexing a single document. The API expects a single document. An "id" is optional
 and the server can automatically generate it for you in case it is missing. In cases an id is provided in
 the document and the document already exists then that document will not be indexed and an error is returned
 with HTTP status code 409.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchCreateByIdRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateByIdResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateByIdRequest;
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

            SearchCreateByIdRequest req = SearchCreateByIdRequest.builder()
                .createByIdRequest(CreateByIdRequest.builder()
                        .document("<value>")
                        .id("<id>")
                        .index("<value>")
                        .project("<value>")
                        .build())
                .id("<value>")
                .index("<value>")
                .project("<value>")
                .build();

            SearchCreateByIdResponse res = sdk.search().createDocument()
                .request(req)
                .call();

            if (res.createByIdResponse().isPresent()) {
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.SearchCreateByIdRequest](../../models/operations/SearchCreateByIdRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchCreateByIdResponse>](../../models/operations/SearchCreateByIdResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createDocuments

Create is used for indexing a single or multiple documents. The API expects an array of documents.
 Each document is a JSON object. An "id" is optional and the server can automatically generate it for you in
 case it is missing. In cases when an id is provided in the document and the document already exists then that
 document will not be indexed and in the response there will be an error corresponding to that document id other
 documents will succeed. Returns an array of status indicating the status of each document.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchCreateRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest;
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

            SearchCreateRequest req = SearchCreateRequest.builder()
                .createDocumentRequest(CreateDocumentRequest.builder()
                        .documents(java.util.List.of(
                            "<value>"))
                        .index("<value>")
                        .project("<value>")
                        .build())
                .index("<value>")
                .project("<value>")
                .build();

            SearchCreateResponse res = sdk.search().createDocuments()
                .request(req)
                .call();

            if (res.createDocumentResponse().isPresent()) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchCreateRequest](../../models/operations/SearchCreateRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchCreateResponse>](../../models/operations/SearchCreateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDocuments

Delete one or more documents by id. Returns an array of status indicating the status of each document. Each status
 has an error field that is set to null in case document is deleted successfully otherwise it will non null with
 an error code and message.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteRequest;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DeleteDocumentRequest;
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

            SearchDeleteRequest req = SearchDeleteRequest.builder()
                .deleteDocumentRequest(DeleteDocumentRequest.builder()
                        .ids(java.util.List.of(
                            "<value>"))
                        .index("<value>")
                        .project("<value>")
                        .build())
                .index("<value>")
                .project("<value>")
                .build();

            SearchDeleteResponse res = sdk.search().deleteDocuments()
                .request(req)
                .call();

            if (res.deleteDocumentResponse().isPresent()) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchDeleteRequest](../../models/operations/SearchDeleteRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchDeleteResponse>](../../models/operations/SearchDeleteResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteIndex

Deletes search index

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexRequest;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DeleteIndexRequest;
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

            SearchDeleteIndexRequest req = SearchDeleteIndexRequest.builder()
                .deleteIndexRequest(DeleteIndexRequest.builder()
                        .name("<value>")
                        .project("<value>")
                        .build())
                .name("<value>")
                .project("<value>")
                .build();

            SearchDeleteIndexResponse res = sdk.search().deleteIndex()
                .request(req)
                .call();

            if (res.deleteIndexResponse().isPresent()) {
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
| `request`                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexRequest](../../models/operations/SearchDeleteIndexRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexResponse>](../../models/operations/SearchDeleteIndexResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## findDocuments

Searches an index for the documents matching the query. A search can be a term search or a phrase search.
 Search API allows filtering the result set using filters as documented
 <a href="https://docs.tigrisdata.com/overview/query#specification-1" title="here">here</a>. You can also perform
 a faceted search by passing the fields in the facet parameter. You can find more detailed documentation of the
 Search API with multiple examples <a href="https://docs.tigrisdata.com/overview/search" title="here">here</a>.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchSearchRequest;
import com.tigrisdata.tigris_core.models.operations.SearchSearchResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.SearchIndexRequest;
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

            SearchSearchRequest req = SearchSearchRequest.builder()
                .searchIndexRequest(SearchIndexRequest.builder()
                        .collation(Collation.builder()
                            .case_("<value>")
                            .build())
                        .excludeFields(java.util.List.of(
                            "<value>"))
                        .facet("<value>")
                        .filter("<value>")
                        .includeFields(java.util.List.of(
                            "<value>"))
                        .index("<value>")
                        .page(71364)
                        .pageSize(998280)
                        .project("<value>")
                        .q("<value>")
                        .searchFields(java.util.List.of(
                            "<value>"))
                        .sort("<value>")
                        .build())
                .index("<value>")
                .project("<value>")
                .build();

            SearchSearchResponse res = sdk.search().findDocuments()
                .request(req)
                .call();

            if (res.searchIndexResponse().isPresent()) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchSearchRequest](../../models/operations/SearchSearchRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchSearchResponse>](../../models/operations/SearchSearchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDocuments

Retrieves one or more documents by id. The response is an array of documents in the same order it is requests.
 A null is returned for the documents that are not found.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchGetRequest;
import com.tigrisdata.tigris_core.models.operations.SearchGetResponse;
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

            SearchGetRequest req = SearchGetRequest.builder()
                .index("<value>")
                .project("<value>")
                .ids(java.util.List.of(
                    "<value>"))
                .build();

            SearchGetResponse res = sdk.search().getDocuments()
                .request(req)
                .call();

            if (res.getDocumentResponse().isPresent()) {
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

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [com.tigrisdata.tigris_core.models.operations.SearchGetRequest](../../models/operations/SearchGetRequest.md) | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchGetResponse>](../../models/operations/SearchGetResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getIndex

Get information about a search index

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchGetIndexRequest;
import com.tigrisdata.tigris_core.models.operations.SearchGetIndexResponse;
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

            SearchGetIndexRequest req = SearchGetIndexRequest.builder()
                .name("<value>")
                .project("<value>")
                .build();

            SearchGetIndexResponse res = sdk.search().getIndex()
                .request(req)
                .call();

            if (res.getIndexResponse().isPresent()) {
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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.tigrisdata.tigris_core.models.operations.SearchGetIndexRequest](../../models/operations/SearchGetIndexRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchGetIndexResponse>](../../models/operations/SearchGetIndexResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listIndexes

List search indexes

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchListIndexesRequest;
import com.tigrisdata.tigris_core.models.operations.SearchListIndexesResponse;
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

            SearchListIndexesRequest req = SearchListIndexesRequest.builder()
                .project("<value>")
                .filterBranch("<value>")
                .filterCollection("<value>")
                .filterType("<value>")
                .build();

            SearchListIndexesResponse res = sdk.search().listIndexes()
                .request(req)
                .call();

            if (res.listIndexesResponse().isPresent()) {
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
| `request`                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.SearchListIndexesRequest](../../models/operations/SearchListIndexesRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchListIndexesResponse>](../../models/operations/SearchListIndexesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## queryDeleteDocuments

DeleteByQuery is used to delete documents that match the filter. A filter is required. To delete document by id,
 you can pass the filter as follows ```{"id": "test"}```. Returns a count of number of documents deleted.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryRequest;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest;
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

            SearchDeleteByQueryRequest req = SearchDeleteByQueryRequest.builder()
                .deleteByQueryRequest(DeleteByQueryRequest.builder()
                        .filter("<value>")
                        .index("<value>")
                        .project("<value>")
                        .build())
                .index("<value>")
                .project("<value>")
                .build();

            SearchDeleteByQueryResponse res = sdk.search().queryDeleteDocuments()
                .request(req)
                .call();

            if (res.deleteByQueryResponse().isPresent()) {
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
| `request`                                                                                                                        | [com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryRequest](../../models/operations/SearchDeleteByQueryRequest.md) | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryResponse>](../../models/operations/SearchDeleteByQueryResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## replaceDocuments

Creates or replaces one or more documents. Each document is a JSON object. A document is replaced
 if it already exists. An "id" is generated automatically in case it is missing in the document. The
 document is created if "id" doesn't exists otherwise it is replaced. Returns an array of status indicating
 the status of each document.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentRequest;
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

            SearchCreateOrReplaceRequest req = SearchCreateOrReplaceRequest.builder()
                .createOrReplaceDocumentRequest(CreateOrReplaceDocumentRequest.builder()
                        .documents(java.util.List.of(
                            "<value>"))
                        .index("<value>")
                        .project("<value>")
                        .build())
                .index("<value>")
                .project("<value>")
                .build();

            SearchCreateOrReplaceResponse res = sdk.search().replaceDocuments()
                .request(req)
                .call();

            if (res.createOrReplaceDocumentResponse().isPresent()) {
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceRequest](../../models/operations/SearchCreateOrReplaceRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceResponse>](../../models/operations/SearchCreateOrReplaceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDocuments

Updates one or more documents by "id". Each document is required to have the
 "id" field in it. Returns an array of status indicating the status of each document. Each status
 has an error field that is set to null in case document is updated successfully otherwise the error
 field is set with a code and message.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchUpdateRequest;
import com.tigrisdata.tigris_core.models.operations.SearchUpdateResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest;
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

            SearchUpdateRequest req = SearchUpdateRequest.builder()
                .updateDocumentRequest(UpdateDocumentRequest.builder()
                        .documents(java.util.List.of(
                            "<value>"))
                        .index("<value>")
                        .project("<value>")
                        .build())
                .index("<value>")
                .project("<value>")
                .build();

            SearchUpdateResponse res = sdk.search().updateDocuments()
                .request(req)
                .call();

            if (res.updateDocumentResponse().isPresent()) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchUpdateRequest](../../models/operations/SearchUpdateRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchUpdateResponse>](../../models/operations/SearchUpdateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateIndex

Creates or updates search index

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateOrUpdateIndexRequest;
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

            SearchCreateOrUpdateIndexRequest req = SearchCreateOrUpdateIndexRequest.builder()
                .createOrUpdateIndexRequest(CreateOrUpdateIndexRequest.builder()
                        .name("<value>")
                        .onlyCreate(false)
                        .project("<value>")
                        .schema("<value>")
                        .build())
                .name("<value>")
                .project("<value>")
                .build();

            SearchCreateOrUpdateIndexResponse res = sdk.search().updateIndex()
                .request(req)
                .call();

            if (res.createOrUpdateIndexResponse().isPresent()) {
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

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexRequest](../../models/operations/SearchCreateOrUpdateIndexRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexResponse>](../../models/operations/SearchCreateOrUpdateIndexResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
