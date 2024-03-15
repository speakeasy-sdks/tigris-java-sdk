# System
(*system()*)

## Overview

The Observability section has APIs that provides full visibility into the health, metrics, and monitoring of the Server.

### Available Operations

* [getHealth](#gethealth) - Health Check
* [getServerInfo](#getserverinfo) - Information about the server
* [observabilityQuotaUsage](#observabilityquotausage) - Queries current namespace quota usage
* [queryQuotaLimits](#queryquotalimits) - Queries current namespace quota limits
* [queryTimeSeriesMetrics](#querytimeseriesmetrics) - Queries time series metrics

## getHealth

This endpoint can be used to check the liveness of the server.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.HealthAPIHealthResponse;
import com.tigrisdata.tigris_core.models.shared.*;
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
                .build();

            HealthAPIHealthResponse res = sdk.system().getHealth()
                .call();

            if (res.healthCheckResponse().isPresent()) {
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


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.HealthAPIHealthResponse>](../../models/operations/HealthAPIHealthResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getServerInfo

Provides the information about the server. This information includes returning the server version, etc.

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ObservabilityGetInfoResponse;
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

            ObservabilityGetInfoResponse res = sdk.system().getServerInfo()
                .call();

            if (res.getInfoResponse().isPresent()) {
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


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ObservabilityGetInfoResponse>](../../models/operations/ObservabilityGetInfoResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## observabilityQuotaUsage

Returns current namespace quota limits

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.QuotaUsageRequest;
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

            QuotaUsageRequest req = QuotaUsageRequest.builder()
                .build();

            ObservabilityQuotaUsageResponse res = sdk.system().observabilityQuotaUsage()
                .request(req)
                .call();

            if (res.quotaUsageResponse().isPresent()) {
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

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [com.tigrisdata.tigris_core.models.shared.QuotaUsageRequest](../../models/shared/QuotaUsageRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaUsageResponse>](../../models/operations/ObservabilityQuotaUsageResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## queryQuotaLimits

Returns current namespace quota limits

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.QuotaLimitsRequest;
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

            QuotaLimitsRequest req = QuotaLimitsRequest.builder()
                .build();

            ObservabilityQuotaLimitsResponse res = sdk.system().queryQuotaLimits()
                .request(req)
                .call();

            if (res.quotaLimitsResponse().isPresent()) {
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [com.tigrisdata.tigris_core.models.shared.QuotaLimitsRequest](../../models/shared/QuotaLimitsRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ObservabilityQuotaLimitsResponse>](../../models/operations/ObservabilityQuotaLimitsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## queryTimeSeriesMetrics

Queries time series metrics

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.ObservabilityQueryTimeSeriesMetricsResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.AdditionalFunction;
import com.tigrisdata.tigris_core.models.shared.Aggregator;
import com.tigrisdata.tigris_core.models.shared.Function;
import com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest;
import com.tigrisdata.tigris_core.models.shared.RollupFunction;
import com.tigrisdata.tigris_core.models.shared.Security;
import com.tigrisdata.tigris_core.models.shared.SpaceAggregation;
import com.tigrisdata.tigris_core.models.shared.TigrisOperation;
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

            QueryTimeSeriesMetricsRequest req = QueryTimeSeriesMetricsRequest.builder()
                .additionalFunctions(java.util.List.of(
                    AdditionalFunction.builder()
                        .build()))
                .branch("<value>")
                .collection("<value>")
                .db("<value>")
                .from(262768L)
                .function(Function.NONE)
                .metricName("<value>")
                .quantile(3054.25f)
                .spaceAggregatedBy(java.util.List.of(
                    "<value>"))
                .spaceAggregation(SpaceAggregation.MAX)
                .tigrisOperation(TigrisOperation.READ)
                .to(424991L)
                .build();

            ObservabilityQueryTimeSeriesMetricsResponse res = sdk.system().queryTimeSeriesMetrics()
                .request(req)
                .call();

            if (res.queryTimeSeriesMetricsResponse().isPresent()) {
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
| `request`                                                                                                                      | [com.tigrisdata.tigris_core.models.shared.QueryTimeSeriesMetricsRequest](../../models/shared/QueryTimeSeriesMetricsRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.ObservabilityQueryTimeSeriesMetricsResponse>](../../models/operations/ObservabilityQueryTimeSeriesMetricsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
