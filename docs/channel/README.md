# channel

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
                .setSecurity(new Security("fugit") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            RealtimeGetRTChannelRequest req = new RealtimeGetRTChannelRequest("dolorum", "excepturi");            

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
                .setSecurity(new Security("tempora") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            RealtimeReadMessagesRequest req = new RealtimeReadMessagesRequest("facilis", "tempore") {{
                end = "labore";
                event = "delectus";
                limit = 433288L;
                sessionId = "non";
                socketId = "eligendi";
                start = "sint";
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
                .setSecurity(new Security("aliquid") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            RealtimeGetRTChannelsRequest req = new RealtimeGetRTChannelsRequest("provident");            

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
                .setSecurity(new Security("necessitatibus") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            RealtimeListSubscriptionsRequest req = new RealtimeListSubscriptionsRequest("sint", "officia") {{
                page = 223081;
                pageSize = 891555;
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
                .setSecurity(new Security("a") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            RealtimeMessagesRequest req = new RealtimeMessagesRequest(                new MessagesRequest() {{
                                channel = "dolorum";
                                messages = new com.tigrisdata.tigris_core.models.shared.Message[]{{
                                    add(new Message() {{
                                        data = "in";
                                        id = "dfb14cd6-6ae3-495e-bb9b-a88f3a669970";
                                        name = "Megan Rau";
                                        sequence = "labore";
                                    }}),
                                    add(new Message() {{
                                        data = "suscipit";
                                        id = "9b6e2141-9598-490a-ba56-3e2516fe4c8b";
                                        name = "Alice Bradtke";
                                        sequence = "expedita";
                                    }}),
                                }};
                                project = "nihil";
                            }};, "repellat", "quibusdam");            

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
                .setSecurity(new Security("sed") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            RealtimePresenceRequest req = new RealtimePresenceRequest("saepe", "pariatur");            

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
