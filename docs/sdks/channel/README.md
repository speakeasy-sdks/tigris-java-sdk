# Channel
(*channel()*)

## Overview

The realtime section provide APIs that can be used realtime operations.

### Available Operations

* [get](#get) - Get the details about a channel
* [getMessages](#getmessages) - Get all messages for a channel
* [list](#list) - Get all channels for your application project
* [listSubscriptions](#listsubscriptions) - Get the subscriptions details about a channel
* [pushMessages](#pushmessages) - push messages to a single channel
* [realtimePresence](#realtimepresence) - Presence about the channel

## get

Get the details about a channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse;
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

            RealtimeGetRTChannelRequest req = RealtimeGetRTChannelRequest.builder()
                .channel("<value>")
                .project("<value>")
                .build();

            RealtimeGetRTChannelResponse res = sdk.channel().get()
                .request(req)
                .call();

            if (res.getRTChannelResponse().isPresent()) {
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
| `request`                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelRequest](../../models/operations/RealtimeGetRTChannelRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse>](../../models/operations/RealtimeGetRTChannelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getMessages

Get all messages for a channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse;
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

            RealtimeReadMessagesRequest req = RealtimeReadMessagesRequest.builder()
                .channel("<value>")
                .project("<value>")
                .end("<value>")
                .event("<value>")
                .limit(7235L)
                .sessionId("<value>")
                .socketId("<value>")
                .start("<value>")
                .build();

            RealtimeReadMessagesResponse res = sdk.channel().getMessages()
                .request(req)
                .call();

            if (res.readMessagesResponse().isPresent()) {
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
| `request`                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest](../../models/operations/RealtimeReadMessagesRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse>](../../models/operations/RealtimeReadMessagesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## list

Get all channels for your application project

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse;
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

            RealtimeGetRTChannelsRequest req = RealtimeGetRTChannelsRequest.builder()
                .project("<value>")
                .build();

            RealtimeGetRTChannelsResponse res = sdk.channel().list()
                .request(req)
                .call();

            if (res.getRTChannelsResponse().isPresent()) {
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
| `request`                                                                                                                            | [com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsRequest](../../models/operations/RealtimeGetRTChannelsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse>](../../models/operations/RealtimeGetRTChannelsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listSubscriptions

Get the subscriptions details about a channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse;
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

            RealtimeListSubscriptionsRequest req = RealtimeListSubscriptionsRequest.builder()
                .channel("<value>")
                .project("<value>")
                .page(994262)
                .pageSize(462408)
                .build();

            RealtimeListSubscriptionsResponse res = sdk.channel().listSubscriptions()
                .request(req)
                .call();

            if (res.listSubscriptionResponse().isPresent()) {
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
| `request`                                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest](../../models/operations/RealtimeListSubscriptionsRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse>](../../models/operations/RealtimeListSubscriptionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## pushMessages

push messages to a single channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.RealtimeMessagesRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse;
import com.tigrisdata.tigris_core.models.shared.*;
import com.tigrisdata.tigris_core.models.shared.Message;
import com.tigrisdata.tigris_core.models.shared.MessagesRequest;
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

            RealtimeMessagesRequest req = RealtimeMessagesRequest.builder()
                .messagesRequest(MessagesRequest.builder()
                        .channel("<value>")
                        .messages(java.util.List.of(
                            Message.builder()
                                .build()))
                        .project("<value>")
                        .build())
                .channel("<value>")
                .project("<value>")
                .build();

            RealtimeMessagesResponse res = sdk.channel().pushMessages()
                .request(req)
                .call();

            if (res.messagesResponse().isPresent()) {
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
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.RealtimeMessagesRequest](../../models/operations/RealtimeMessagesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse>](../../models/operations/RealtimeMessagesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## realtimePresence

Presence about the channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.*;
import com.tigrisdata.tigris_core.models.operations.RealtimePresenceRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse;
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

            RealtimePresenceRequest req = RealtimePresenceRequest.builder()
                .channel("<value>")
                .project("<value>")
                .build();

            RealtimePresenceResponse res = sdk.channel().realtimePresence()
                .request(req)
                .call();

            if (res.presenceResponse().isPresent()) {
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
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.RealtimePresenceRequest](../../models/operations/RealtimePresenceRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse>](../../models/operations/RealtimePresenceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
