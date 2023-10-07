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
                .setSecurity(new Security("motivating"){{
                    bearerAuth = "";
                }})
                .build();

            RealtimeGetRTChannelRequest req = new RealtimeGetRTChannelRequest("Account", "if");            

            RealtimeGetRTChannelResponse res = sdk.channel.get(req);

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
                .setSecurity(new Security("East"){{
                    bearerAuth = "";
                }})
                .build();

            RealtimeReadMessagesRequest req = new RealtimeReadMessagesRequest("Platinum", "sympathetic"){{
                end = "asymmetric withdrawal";
                event = "Generic Bypass";
                limit = 32889L;
                sessionId = "Rock Automotive Grove";
                socketId = "vortals Sedan";
                start = "to Drive monitor";
            }};            

            RealtimeReadMessagesResponse res = sdk.channel.getMessages(req);

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
                .setSecurity(new Security("Future"){{
                    bearerAuth = "";
                }})
                .build();

            RealtimeGetRTChannelsRequest req = new RealtimeGetRTChannelsRequest("Southeast");            

            RealtimeGetRTChannelsResponse res = sdk.channel.list(req);

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
                .setSecurity(new Security("internationalise"){{
                    bearerAuth = "";
                }})
                .build();

            RealtimeListSubscriptionsRequest req = new RealtimeListSubscriptionsRequest("which", "Car"){{
                page = 121134;
                pageSize = 980290;
            }};            

            RealtimeListSubscriptionsResponse res = sdk.channel.listSubscriptions(req);

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
                .setSecurity(new Security("payment"){{
                    bearerAuth = "";
                }})
                .build();

            RealtimeMessagesRequest req = new RealtimeMessagesRequest(new MessagesRequest(){{
channel = "Manager seamless Folk";
messages = new com.tigrisdata.tigris_core.models.shared.Message[]{{
    add(new Message(){{}}),
}};
project = "City niches Directives";
}}, "purple", "yet");            

            RealtimeMessagesResponse res = sdk.channel.pushMessages(req);

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
                .setSecurity(new Security("successfully"){{
                    bearerAuth = "";
                }})
                .build();

            RealtimePresenceRequest req = new RealtimePresenceRequest("Applications", "Buckinghamshire");            

            RealtimePresenceResponse res = sdk.channel.realtimePresence(req);

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

