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
import com.tigrisdata.tigris_core.models.shared.CreateOrUpdateCollectionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("accusantium") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisCreateOrUpdateCollectionRequest req = new TigrisCreateOrUpdateCollectionRequest(                new CreateOrUpdateCollectionRequest() {{
                                branch = "consequuntur";
                                onlyCreate = false;
                                options = new java.util.HashMap<String, Object>() {{
                                    put("natus", "magni");
                                    put("sunt", "quo");
                                    put("illum", "pariatur");
                                }};
                                schema = new java.util.HashMap<String, Object>() {{
                                    put("ea", "excepturi");
                                    put("odit", "ea");
                                    put("accusantium", "ab");
                                    put("maiores", "quidem");
                                }};
                            }};, "ipsam", "voluptate");            

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
import com.tigrisdata.tigris_core.models.shared.DeleteRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("autem") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDeleteRequest req = new TigrisDeleteRequest(                new DeleteRequest() {{
                                branch = "nam";
                                filter = new java.util.HashMap<String, Object>() {{
                                    put("pariatur", "nemo");
                                }};
                                options = new DeleteRequestOptions() {{
                                    collation = new Collation() {{
                                        case_ = "voluptatibus";
                                    }};;
                                    limit = 16627L;
                                    writeOptions = new java.util.HashMap<String, Object>() {{
                                        put("amet", "aut");
                                        put("cumque", "corporis");
                                        put("hic", "libero");
                                        put("nobis", "dolores");
                                    }};
                                }};;
                            }};, "quis", "totam");            

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

## describe

Returns the information related to the collection. This can be used to retrieve the schema or size of the collection.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.DescribeCollectionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("dignissimos") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDescribeCollectionRequest req = new TigrisDescribeCollectionRequest(                new DescribeCollectionRequest() {{
                                branch = "eaque";
                                collection = "quis";
                                options = new java.util.HashMap<String, Object>() {{
                                    put("eos", "perferendis");
                                }};
                                project = "dolores";
                                schemaFormat = "minus";
                            }};, "quam", "dolor");            

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

## drop

Drops the collection inside this project. This API deletes all of the
 documents inside this collection and any metadata associated with it.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDropCollectionResponse;
import com.tigrisdata.tigris_core.models.shared.DropCollectionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("vero") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDropCollectionRequest req = new TigrisDropCollectionRequest(                new DropCollectionRequest() {{
                                branch = "nostrum";
                                options = new java.util.HashMap<String, Object>() {{
                                    put("recusandae", "omnis");
                                    put("facilis", "perspiciatis");
                                    put("voluptatem", "porro");
                                    put("consequuntur", "blanditiis");
                                }};
                            }};, "error", "eaque");            

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
import com.tigrisdata.tigris_core.models.shared.ImportRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("occaecati") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisImportRequest req = new TigrisImportRequest(                new ImportRequest() {{
                                autogenerated = new String[]{{
                                    add("adipisci"),
                                    add("asperiores"),
                                    add("earum"),
                                }};
                                branch = "modi";
                                createCollection = false;
                                documents = new java.util.HashMap<String, Object>[]{{
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("deleniti", "pariatur");
                                        put("provident", "nobis");
                                        put("libero", "delectus");
                                    }}),
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("quos", "aliquid");
                                        put("dolorem", "dolorem");
                                    }}),
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("qui", "ipsum");
                                    }}),
                                }};
                                options = new ImportRequestOptions() {{
                                    writeOptions = new java.util.HashMap<String, Object>() {{
                                        put("excepturi", "cum");
                                        put("voluptate", "dignissimos");
                                        put("reiciendis", "amet");
                                        put("dolorum", "numquam");
                                    }};
                                }};;
                                primaryKey = new String[]{{
                                    add("ipsa"),
                                }};
                            }};, "ipsa", "iure");            

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
import com.tigrisdata.tigris_core.models.shared.InsertRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("odio") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisInsertRequest req = new TigrisInsertRequest(                new InsertRequest() {{
                                branch = "quaerat";
                                documents = new java.util.HashMap<String, Object>[]{{
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("voluptatibus", "voluptas");
                                        put("natus", "eos");
                                        put("atque", "sit");
                                    }}),
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("ab", "soluta");
                                        put("dolorum", "iusto");
                                        put("voluptate", "dolorum");
                                        put("deleniti", "omnis");
                                    }}),
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("distinctio", "asperiores");
                                        put("nihil", "ipsum");
                                        put("voluptate", "id");
                                        put("saepe", "eius");
                                    }}),
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("perferendis", "amet");
                                    }}),
                                }};
                                options = new InsertRequestOptions() {{
                                    writeOptions = new java.util.HashMap<String, Object>() {{
                                        put("accusamus", "ad");
                                        put("saepe", "suscipit");
                                        put("deserunt", "provident");
                                        put("minima", "repellendus");
                                    }};
                                }};;
                            }};, "totam", "similique");            

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
import com.tigrisdata.tigris_core.models.shared.ReadRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("alias") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisReadRequest req = new TigrisReadRequest(                new ReadRequest() {{
                                branch = "at";
                                fields = new java.util.HashMap<String, Object>() {{
                                    put("tempora", "vel");
                                    put("quod", "officiis");
                                }};
                                filter = new java.util.HashMap<String, Object>() {{
                                    put("dolorum", "a");
                                }};
                                options = new ReadRequestOptions() {{
                                    collation = new Collation() {{
                                        case_ = "esse";
                                    }};;
                                    limit = 687488L;
                                    offset = "iusto";
                                    skip = 215507L;
                                }};;
                                sort = "quisquam";
                            }};, "tenetur", "amet");            

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

## replaceDocuments

Inserts the documents or replaces the existing documents in the collections.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisReplaceRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisReplaceResponse;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequest;
import com.tigrisdata.tigris_core.models.shared.ReplaceRequestOptions;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("tempore") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisReplaceRequest req = new TigrisReplaceRequest(                new ReplaceRequest() {{
                                branch = "accusamus";
                                documents = new java.util.HashMap<String, Object>[]{{
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("dolorem", "sapiente");
                                        put("totam", "nihil");
                                    }}),
                                    add(new java.util.HashMap<String, Object>() {{
                                        put("expedita", "neque");
                                    }}),
                                }};
                                options = new ReplaceRequestOptions() {{
                                    writeOptions = new java.util.HashMap<String, Object>() {{
                                        put("vel", "libero");
                                    }};
                                }};;
                            }};, "voluptas", "deserunt");            

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
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quam") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisSearchRequest req = new TigrisSearchRequest(                new SearchRequest() {{
                                branch = "ipsum";
                                collation = new Collation() {{
                                    case_ = "incidunt";
                                }};;
                                excludeFields = new String[]{{
                                    add("cupiditate"),
                                }};
                                facet = new java.util.HashMap<String, Object>() {{
                                    put("pariatur", "soluta");
                                    put("dicta", "laborum");
                                    put("totam", "incidunt");
                                    put("aspernatur", "dolores");
                                }};
                                fields = new java.util.HashMap<String, Object>() {{
                                    put("facilis", "aliquid");
                                    put("quam", "molestias");
                                    put("temporibus", "qui");
                                }};
                                filter = new java.util.HashMap<String, Object>() {{
                                    put("fugit", "magni");
                                }};
                                includeFields = new String[]{{
                                    add("sunt"),
                                    add("ullam"),
                                }};
                                page = 722081;
                                pageSize = 940432;
                                q = "voluptatem";
                                searchFields = new String[]{{
                                    add("soluta"),
                                    add("nobis"),
                                    add("et"),
                                    add("saepe"),
                                }};
                                sort = new java.util.HashMap<String, Object>() {{
                                    put("veritatis", "nobis");
                                }};
                            }};, "quos", "tempore");            

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
import com.tigrisdata.tigris_core.models.shared.UpdateRequestOptions;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("cupiditate") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisUpdateRequest req = new TigrisUpdateRequest(                new UpdateRequest() {{
                                branch = "aperiam";
                                fields = new java.util.HashMap<String, Object>() {{
                                    put("dolorem", "dolore");
                                    put("labore", "adipisci");
                                    put("dolorum", "architecto");
                                    put("quae", "aut");
                                }};
                                filter = new java.util.HashMap<String, Object>() {{
                                    put("itaque", "consequatur");
                                    put("est", "repellendus");
                                    put("porro", "doloribus");
                                }};
                                options = new UpdateRequestOptions() {{
                                    collation = new Collation() {{
                                        case_ = "ut";
                                    }};;
                                    limit = 703495L;
                                    writeOptions = new java.util.HashMap<String, Object>() {{
                                        put("qui", "quae");
                                        put("laudantium", "odio");
                                        put("occaecati", "voluptatibus");
                                    }};
                                }};;
                            }};, "quisquam", "vero");            

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
