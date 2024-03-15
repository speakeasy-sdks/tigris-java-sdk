# Database
(*database()*)

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
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisBeginTransactionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisBeginTransactionResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.BeginTransactionRequest;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.TransactionOptions;
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

            TigrisBeginTransactionRequest req = TigrisBeginTransactionRequest.builder()
                .beginTransactionRequest(BeginTransactionRequest.builder()
                        .branch("<value>")
                        .options(TransactionOptions.builder()
                            .build())
                        .build())
                .project("<value>")
                .build();

            TigrisBeginTransactionResponse res = sdk.database().beginTransaction()
                .request(req)
                .call();

            if (res.beginTransactionResponse().isPresent()) {
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.tigrisdata.tigris_core.models.operations.TigrisBeginTransactionRequest](../../models/operations/TigrisBeginTransactionRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisBeginTransactionResponse>](../../models/operations/TigrisBeginTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## commitTransaction

Atomically commit all the changes performed in the context of the transaction. Commit provides all
 or nothing semantics by ensuring no partial updates are in the project due to a transaction failure.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisCommitTransactionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCommitTransactionResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CommitTransactionRequest;
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

            TigrisCommitTransactionRequest req = TigrisCommitTransactionRequest.builder()
                .commitTransactionRequest(CommitTransactionRequest.builder()
                        .branch("<value>")
                        .build())
                .project("<value>")
                .build();

            TigrisCommitTransactionResponse res = sdk.database().commitTransaction()
                .request(req)
                .call();

            if (res.commitTransactionResponse().isPresent()) {
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [com.tigrisdata.tigris_core.models.operations.TigrisCommitTransactionRequest](../../models/operations/TigrisCommitTransactionRequest.md) | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisCommitTransactionResponse>](../../models/operations/TigrisCommitTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## createBranch

Creates a new database branch, if not already existing.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateBranchRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisCreateBranchResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.CreateBranchRequest;
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

            TigrisCreateBranchRequest req = TigrisCreateBranchRequest.builder()
                .createBranchRequest(CreateBranchRequest.builder()
                        .build())
                .branch("<value>")
                .project("<value>")
                .build();

            TigrisCreateBranchResponse res = sdk.database().createBranch()
                .request(req)
                .call();

            if (res.createBranchResponse().isPresent()) {
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
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisCreateBranchRequest](../../models/operations/TigrisCreateBranchRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisCreateBranchResponse>](../../models/operations/TigrisCreateBranchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteBranch

Deletes a database branch, if exists.
 Throws 400 Bad Request if "main" branch is being deleted

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteBranchRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDeleteBranchResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DeleteBranchRequest;
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

            TigrisDeleteBranchRequest req = TigrisDeleteBranchRequest.builder()
                .deleteBranchRequest(DeleteBranchRequest.builder()
                        .build())
                .branch("<value>")
                .project("<value>")
                .build();

            TigrisDeleteBranchResponse res = sdk.database().deleteBranch()
                .request(req)
                .call();

            if (res.deleteBranchResponse().isPresent()) {
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
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisDeleteBranchRequest](../../models/operations/TigrisDeleteBranchRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisDeleteBranchResponse>](../../models/operations/TigrisDeleteBranchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## describe

This API returns information related to the project along with all the collections inside the project.
 This can be used to retrieve the size of the project or to retrieve schemas, branches and the size of all the collections present in this project.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeDatabaseRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisDescribeDatabaseResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.DescribeDatabaseRequest;
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

            TigrisDescribeDatabaseRequest req = TigrisDescribeDatabaseRequest.builder()
                .describeDatabaseRequest(DescribeDatabaseRequest.builder()
                        .branch("<value>")
                        .project("<value>")
                        .schemaFormat("<value>")
                        .build())
                .project("<value>")
                .build();

            TigrisDescribeDatabaseResponse res = sdk.database().describe()
                .request(req)
                .call();

            if (res.describeDatabaseResponse().isPresent()) {
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [com.tigrisdata.tigris_core.models.operations.TigrisDescribeDatabaseRequest](../../models/operations/TigrisDescribeDatabaseRequest.md) | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisDescribeDatabaseResponse>](../../models/operations/TigrisDescribeDatabaseResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listCollections

List all the collections present in the project passed in the request.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisListCollectionsRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisListCollectionsResponse;
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

            TigrisListCollectionsRequest req = TigrisListCollectionsRequest.builder()
                .project("<value>")
                .branch("<value>")
                .build();

            TigrisListCollectionsResponse res = sdk.database().listCollections()
                .request(req)
                .call();

            if (res.listCollectionsResponse().isPresent()) {
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
| `request`                                                                                                                            | [com.tigrisdata.tigris_core.models.operations.TigrisListCollectionsRequest](../../models/operations/TigrisListCollectionsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisListCollectionsResponse>](../../models/operations/TigrisListCollectionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## rollbackTransaction

Rollback transaction discards all the changes
 performed in the transaction

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisRollbackTransactionRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisRollbackTransactionResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.RollbackTransactionRequest;
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

            TigrisRollbackTransactionRequest req = TigrisRollbackTransactionRequest.builder()
                .rollbackTransactionRequest(RollbackTransactionRequest.builder()
                        .branch("<value>")
                        .build())
                .project("<value>")
                .build();

            TigrisRollbackTransactionResponse res = sdk.database().rollbackTransaction()
                .request(req)
                .call();

            if (res.rollbackTransactionResponse().isPresent()) {
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
| `request`                                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.TigrisRollbackTransactionRequest](../../models/operations/TigrisRollbackTransactionRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisRollbackTransactionResponse>](../../models/operations/TigrisRollbackTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## tigrisListBranches

List database branches

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.TigrisListBranchesRequest;
import com.tigrisdata.tigris_core.models.operations.TigrisListBranchesResponse;
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

            TigrisListBranchesRequest req = TigrisListBranchesRequest.builder()
                .project("<value>")
                .build();

            TigrisListBranchesResponse res = sdk.database().tigrisListBranches()
                .request(req)
                .call();

            if (res.listBranchesResponse().isPresent()) {
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
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.operations.TigrisListBranchesRequest](../../models/operations/TigrisListBranchesRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.TigrisListBranchesResponse>](../../models/operations/TigrisListBranchesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
