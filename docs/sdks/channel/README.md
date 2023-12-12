# Channel
(*channel*)

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
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelRequest req = new RealtimeGetRTChannelRequest(
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse res = sdk.channel.get(req);

            if (res.getRTChannelResponse != null) {
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
| `request`                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelRequest](../../models/operations/RealtimeGetRTChannelRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelResponse](../../models/operations/RealtimeGetRTChannelResponse.md)**


## getMessages

Get all messages for a channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest req = new RealtimeReadMessagesRequest(
                "string",
                "string"){{
                end = "string";
                event = "string";
                limit = 7235L;
                sessionId = "string";
                socketId = "string";
                start = "string";

            }};

            com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse res = sdk.channel.getMessages(req);

            if (res.readMessagesResponse != null) {
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
| `request`                                                                                                                          | [com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesRequest](../../models/operations/RealtimeReadMessagesRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[com.tigrisdata.tigris_core.models.operations.RealtimeReadMessagesResponse](../../models/operations/RealtimeReadMessagesResponse.md)**


## list

Get all channels for your application project

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsRequest req = new RealtimeGetRTChannelsRequest(
                "string");

            com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse res = sdk.channel.list(req);

            if (res.getRTChannelsResponse != null) {
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
| `request`                                                                                                                            | [com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsRequest](../../models/operations/RealtimeGetRTChannelsRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[com.tigrisdata.tigris_core.models.operations.RealtimeGetRTChannelsResponse](../../models/operations/RealtimeGetRTChannelsResponse.md)**


## listSubscriptions

Get the subscriptions details about a channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest req = new RealtimeListSubscriptionsRequest(
                "string",
                "string"){{
                page = 994262;
                pageSize = 462408;

            }};

            com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse res = sdk.channel.listSubscriptions(req);

            if (res.listSubscriptionResponse != null) {
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
| `request`                                                                                                                                    | [com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsRequest](../../models/operations/RealtimeListSubscriptionsRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[com.tigrisdata.tigris_core.models.operations.RealtimeListSubscriptionsResponse](../../models/operations/RealtimeListSubscriptionsResponse.md)**


## pushMessages

push messages to a single channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.RealtimeMessagesRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse;
import com.tigrisdata.tigris_core.models.shared.Message;
import com.tigrisdata.tigris_core.models.shared.MessagesRequest;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.RealtimeMessagesRequest req = new RealtimeMessagesRequest(
                new MessagesRequest(
){{
                    channel = "string";
                    messages = new com.tigrisdata.tigris_core.models.shared.Message[]{{
                        add(new Message(
                        ){{}}),
                    }};
                    project = "string";

                }},
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse res = sdk.channel.pushMessages(req);

            if (res.messagesResponse != null) {
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
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.RealtimeMessagesRequest](../../models/operations/RealtimeMessagesRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.RealtimeMessagesResponse](../../models/operations/RealtimeMessagesResponse.md)**


## realtimePresence

Presence about the channel

### Example Usage

```java
package hello.world;

import com.tigrisdata.tigris_core.SDK;
import com.tigrisdata.tigris_core.models.operations.RealtimePresenceRequest;
import com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse;
import com.tigrisdata.tigris_core.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    bearerAuth = "<YOUR_BEARER_TOKEN_HERE>";
                }})
                .build();

            com.tigrisdata.tigris_core.models.operations.RealtimePresenceRequest req = new RealtimePresenceRequest(
                "string",
                "string");

            com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse res = sdk.channel.realtimePresence(req);

            if (res.presenceResponse != null) {
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
| `request`                                                                                                                  | [com.tigrisdata.tigris_core.models.operations.RealtimePresenceRequest](../../models/operations/RealtimePresenceRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[com.tigrisdata.tigris_core.models.operations.RealtimePresenceResponse](../../models/operations/RealtimePresenceResponse.md)**

