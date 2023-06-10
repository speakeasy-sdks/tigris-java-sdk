# search

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
import com.tigrisdata.tigris_core.models.operations.SearchCreateByIdRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateByIdResponse;
import com.tigrisdata.tigris_core.models.shared.CreateByIdRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quaerat") {{
                    bearerAuth = "";
                }})
                .build();

            SearchCreateByIdRequest req = new SearchCreateByIdRequest(                new CreateByIdRequest() {{
                                document = "quos";
                                id = "633323f9-b77f-43a4-9006-74ebf69280d1";
                                index = "soluta";
                                project = "dolorum";
                            }};, "iusto", "voluptate", "dolorum");            

            SearchCreateByIdResponse res = sdk.search.createDocument(req);

            if (res.createByIdResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.SearchCreateByIdResponse](../../models/operations/SearchCreateByIdResponse.md)**


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
import com.tigrisdata.tigris_core.models.operations.SearchCreateRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateResponse;
import com.tigrisdata.tigris_core.models.shared.CreateDocumentRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("deleniti") {{
                    bearerAuth = "";
                }})
                .build();

            SearchCreateRequest req = new SearchCreateRequest(                new CreateDocumentRequest() {{
                                documents = new String[]{{
                                    add("necessitatibus"),
                                    add("distinctio"),
                                    add("asperiores"),
                                }};
                                index = "nihil";
                                project = "ipsum";
                            }};, "voluptate", "id");            

            SearchCreateResponse res = sdk.search.createDocuments(req);

            if (res.createDocumentResponse != null) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchCreateRequest](../../models/operations/SearchCreateRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.SearchCreateResponse](../../models/operations/SearchCreateResponse.md)**


## deleteDocuments

Delete one or more documents by id. Returns an array of status indicating the status of each document. Each status
 has an error field that is set to null in case document is deleted successfully otherwise it will non null with
 an error code and message.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteRequest;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteDocumentRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("saepe") {{
                    bearerAuth = "";
                }})
                .build();

            SearchDeleteRequest req = new SearchDeleteRequest(                new DeleteDocumentRequest() {{
                                ids = new String[]{{
                                    add("aspernatur"),
                                    add("perferendis"),
                                }};
                                index = "amet";
                                project = "optio";
                            }};, "accusamus", "ad");            

            SearchDeleteResponse res = sdk.search.deleteDocuments(req);

            if (res.deleteDocumentResponse != null) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchDeleteRequest](../../models/operations/SearchDeleteRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.SearchDeleteResponse](../../models/operations/SearchDeleteResponse.md)**


## deleteIndex

Deletes search index

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexRequest;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteIndexRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("saepe") {{
                    bearerAuth = "";
                }})
                .build();

            SearchDeleteIndexRequest req = new SearchDeleteIndexRequest(                new DeleteIndexRequest() {{
                                name = "Rosie McKenzie";
                                project = "totam";
                            }};, "similique", "alias");            

            SearchDeleteIndexResponse res = sdk.search.deleteIndex(req);

            if (res.deleteIndexResponse != null) {
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
| `request`                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexRequest](../../models/operations/SearchDeleteIndexRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.tigrisdata.tigris_core.models.operations.SearchDeleteIndexResponse](../../models/operations/SearchDeleteIndexResponse.md)**


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
import com.tigrisdata.tigris_core.models.operations.SearchSearchRequest;
import com.tigrisdata.tigris_core.models.operations.SearchSearchResponse;
import com.tigrisdata.tigris_core.models.shared.Collation;
import com.tigrisdata.tigris_core.models.shared.SearchIndexRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("at") {{
                    bearerAuth = "";
                }})
                .build();

            SearchSearchRequest req = new SearchSearchRequest(                new SearchIndexRequest() {{
                                collation = new Collation() {{
                                    case_ = "quaerat";
                                }};;
                                excludeFields = new String[]{{
                                    add("vel"),
                                    add("quod"),
                                }};
                                facet = "officiis";
                                filter = "qui";
                                includeFields = new String[]{{
                                    add("a"),
                                    add("esse"),
                                    add("harum"),
                                }};
                                index = "iusto";
                                page = 215507;
                                pageSize = 788740;
                                project = "tenetur";
                                q = "amet";
                                searchFields = new String[]{{
                                    add("accusamus"),
                                    add("numquam"),
                                    add("enim"),
                                }};
                                sort = "dolorem";
                            }};, "sapiente", "totam");            

            SearchSearchResponse res = sdk.search.findDocuments(req);

            if (res.searchIndexResponse != null) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchSearchRequest](../../models/operations/SearchSearchRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.SearchSearchResponse](../../models/operations/SearchSearchResponse.md)**


## getDocuments

Retrieves one or more documents by id. The response is an array of documents in the same order it is requests.
 A null is returned for the documents that are not found.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchGetRequest;
import com.tigrisdata.tigris_core.models.operations.SearchGetResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("nihil") {{
                    bearerAuth = "";
                }})
                .build();

            SearchGetRequest req = new SearchGetRequest("sit", "expedita") {{
                ids = new String[]{{
                    add("sed"),
                }};
            }};            

            SearchGetResponse res = sdk.search.getDocuments(req);

            if (res.getDocumentResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.SearchGetResponse](../../models/operations/SearchGetResponse.md)**


## getIndex

Get information about a search index

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchGetIndexRequest;
import com.tigrisdata.tigris_core.models.operations.SearchGetIndexResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("vel") {{
                    bearerAuth = "";
                }})
                .build();

            SearchGetIndexRequest req = new SearchGetIndexRequest("libero", "voluptas");            

            SearchGetIndexResponse res = sdk.search.getIndex(req);

            if (res.getIndexResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.SearchGetIndexResponse](../../models/operations/SearchGetIndexResponse.md)**


## listIndexes

List search indexes

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchListIndexesRequest;
import com.tigrisdata.tigris_core.models.operations.SearchListIndexesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("deserunt") {{
                    bearerAuth = "";
                }})
                .build();

            SearchListIndexesRequest req = new SearchListIndexesRequest("quam") {{
                filterBranch = "ipsum";
                filterCollection = "incidunt";
                filterType = "qui";
            }};            

            SearchListIndexesResponse res = sdk.search.listIndexes(req);

            if (res.listIndexesResponse != null) {
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
| `request`                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.SearchListIndexesRequest](../../models/operations/SearchListIndexesRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[com.tigrisdata.tigris_core.models.operations.SearchListIndexesResponse](../../models/operations/SearchListIndexesResponse.md)**


## queryDeleteDocuments

DeleteByQuery is used to delete documents that match the filter. A filter is required. To delete document by id,
 you can pass the filter as follows ```{"id": "test"}```. Returns a count of number of documents deleted.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryRequest;
import com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryResponse;
import com.tigrisdata.tigris_core.models.shared.DeleteByQueryRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("cupiditate") {{
                    bearerAuth = "";
                }})
                .build();

            SearchDeleteByQueryRequest req = new SearchDeleteByQueryRequest(                new DeleteByQueryRequest() {{
                                filter = "maxime";
                                index = "pariatur";
                                project = "soluta";
                            }};, "dicta", "laborum");            

            SearchDeleteByQueryResponse res = sdk.search.queryDeleteDocuments(req);

            if (res.deleteByQueryResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.SearchDeleteByQueryResponse](../../models/operations/SearchDeleteByQueryResponse.md)**


## replaceDocuments

Creates or replaces one or more documents. Each document is a JSON object. A document is replaced
 if it already exists. An "id" is generated automatically in case it is missing in the document. The
 document is created if "id" doesn't exists otherwise it is replaced. Returns an array of status indicating
 the status of each document.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceResponse;
import com.tigrisdata.tigris_core.models.shared.CreateOrReplaceDocumentRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("totam") {{
                    bearerAuth = "";
                }})
                .build();

            SearchCreateOrReplaceRequest req = new SearchCreateOrReplaceRequest(                new CreateOrReplaceDocumentRequest() {{
                                documents = new String[]{{
                                    add("aspernatur"),
                                    add("dolores"),
                                }};
                                index = "distinctio";
                                project = "facilis";
                            }};, "aliquid", "quam");            

            SearchCreateOrReplaceResponse res = sdk.search.replaceDocuments(req);

            if (res.createOrReplaceDocumentResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.SearchCreateOrReplaceResponse](../../models/operations/SearchCreateOrReplaceResponse.md)**


## updateDocuments

Updates one or more documents by "id". Each document is required to have the
 "id" field in it. Returns an array of status indicating the status of each document. Each status
 has an error field that is set to null in case document is updated successfully otherwise the error
 field is set with a code and message.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchUpdateRequest;
import com.tigrisdata.tigris_core.models.operations.SearchUpdateResponse;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.UpdateDocumentRequest;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("molestias") {{
                    bearerAuth = "";
                }})
                .build();

            SearchUpdateRequest req = new SearchUpdateRequest(                new UpdateDocumentRequest() {{
                                documents = new String[]{{
                                    add("qui"),
                                    add("neque"),
                                    add("fugit"),
                                    add("magni"),
                                }};
                                index = "odio";
                                project = "sunt";
                            }};, "ullam", "nam");            

            SearchUpdateResponse res = sdk.search.updateDocuments(req);

            if (res.updateDocumentResponse != null) {
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
| `request`                                                                                                          | [com.tigrisdata.tigris_core.models.operations.SearchUpdateRequest](../../models/operations/SearchUpdateRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.SearchUpdateResponse](../../models/operations/SearchUpdateResponse.md)**


## updateIndex

Creates or updates search index

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexRequest;
import com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexResponse;
import com.tigrisdata.tigris_core.models.shared.CreateOrUpdateIndexRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("hic") {{
                    bearerAuth = "";
                }})
                .build();

            SearchCreateOrUpdateIndexRequest req = new SearchCreateOrUpdateIndexRequest(                new CreateOrUpdateIndexRequest() {{
                                name = "Erma Rogahn PhD";
                                onlyCreate = false;
                                project = "ipsum";
                                schema = "veritatis";
                            }};, "nobis", "quos");            

            SearchCreateOrUpdateIndexResponse res = sdk.search.updateIndex(req);

            if (res.createOrUpdateIndexResponse != null) {
                // handle response
            }
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

**[com.tigrisdata.tigris_core.models.operations.SearchCreateOrUpdateIndexResponse](../../models/operations/SearchCreateOrUpdateIndexResponse.md)**
