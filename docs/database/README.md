# database

## Overview

The Database section provide APIs that can be used to interact with the database. A single Database can have one or more collections. A database is created automatically for you when you create a project.

### Available Operations

* [beginTransaction](#begintransaction) - Begin a transaction
* [commitTransaction](#committransaction) - Commit a Transaction
* [createBranch](#createbranch) - Create a database branch
* [deleteBranch](#deletebranch) - Delete a database branch
* [describe](#describe) - Describe database
* [listCollections](#listcollections) - List Collections
* [rollbackTransaction](#rollbacktransaction) - Rollback a transaction
* [tigrisListBranches](#tigrislistbranches) - List database branches

## beginTransaction

Starts a new transaction and returns a transactional object. All reads/writes performed
 within a transaction will run with serializable isolation. Tigris offers global transactions,
 with ACID properties and strict serializability.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisBeginTransactionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisBeginTransactionResponse;
import com.tigrisdata.tigris_core.models.shared.BeginTransactionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("omnis") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisBeginTransactionRequest req = new TigrisBeginTransactionRequest(                new BeginTransactionRequest() {{
                                branch = "quis";
                                options = new java.util.HashMap<String, Object>() {{
                                    put("delectus", "voluptate");
                                }};
                            }};, "consectetur");            

            TigrisBeginTransactionResponse res = sdk.database.beginTransaction(req);

            if (res.beginTransactionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## commitTransaction

Atomically commit all the changes performed in the context of the transaction. Commit provides all
 or nothing semantics by ensuring no partial updates are in the project due to a transaction failure.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisCommitTransactionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCommitTransactionResponse;
import com.tigrisdata.tigris_core.models.shared.CommitTransactionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("vero") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisCommitTransactionRequest req = new TigrisCommitTransactionRequest(                new CommitTransactionRequest() {{
                                branch = "tenetur";
                            }};, "dignissimos");            

            TigrisCommitTransactionResponse res = sdk.database.commitTransaction(req);

            if (res.commitTransactionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## createBranch

Creates a new database branch, if not already existing.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateBranchRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateBranchResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("hic") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisCreateBranchRequest req = new TigrisCreateBranchRequest(                new java.util.HashMap<String, Object>() {{
                                put("quod", "odio");
                                put("similique", "facilis");
                                put("vero", "ducimus");
                            }}, "dolore", "quibusdam");            

            TigrisCreateBranchResponse res = sdk.database.createBranch(req);

            if (res.createBranchResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## deleteBranch

Deletes a database branch, if exists.
 Throws 400 Bad Request if "main" branch is being deleted

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteBranchRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteBranchResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("illum") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDeleteBranchRequest req = new TigrisDeleteBranchRequest(                new java.util.HashMap<String, Object>() {{
                                put("natus", "impedit");
                            }}, "aut", "voluptatibus");            

            TigrisDeleteBranchResponse res = sdk.database.deleteBranch(req);

            if (res.deleteBranchResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## describe

This API returns information related to the project along with all the collections inside the project.
 This can be used to retrieve the size of the project or to retrieve schemas, branches and the size of all the collections present in this project.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeDatabaseRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeDatabaseResponse;
import com.tigrisdata.tigris_core.models.shared.DescribeDatabaseRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("exercitationem") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisDescribeDatabaseRequest req = new TigrisDescribeDatabaseRequest(                new DescribeDatabaseRequest() {{
                                branch = "nulla";
                                project = "fugit";
                                schemaFormat = "porro";
                            }};, "maiores");            

            TigrisDescribeDatabaseResponse res = sdk.database.describe(req);

            if (res.describeDatabaseResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listCollections

List all the collections present in the project passed in the request.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisListCollectionsRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisListCollectionsResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("doloribus") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisListCollectionsRequest req = new TigrisListCollectionsRequest("iusto") {{
                branch = "eligendi";
            }};            

            TigrisListCollectionsResponse res = sdk.database.listCollections(req);

            if (res.listCollectionsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## rollbackTransaction

Rollback transaction discards all the changes
 performed in the transaction

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisRollbackTransactionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisRollbackTransactionResponse;
import com.tigrisdata.tigris_core.models.shared.RollbackTransactionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ducimus") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisRollbackTransactionRequest req = new TigrisRollbackTransactionRequest(                new RollbackTransactionRequest() {{
                                branch = "alias";
                            }};, "officia");            

            TigrisRollbackTransactionResponse res = sdk.database.rollbackTransaction(req);

            if (res.rollbackTransactionResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## tigrisListBranches

List database branches

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.TigrisListBranchesRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisListBranchesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("tempora") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            TigrisListBranchesRequest req = new TigrisListBranchesRequest("ipsam");            

            TigrisListBranchesResponse res = sdk.database.tigrisListBranches(req);

            if (res.listBranchesResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```