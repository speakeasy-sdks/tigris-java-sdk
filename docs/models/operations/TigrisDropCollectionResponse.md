# TigrisDropCollectionResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `dropCollectionResponse`                                                                                                 | [com.tigrisdata.tigris_core.models.shared.DropCollectionResponse](../../models/shared/DropCollectionResponse.md)         | :heavy_minus_sign:                                                                                                       | OK                                                                                                                       |
| `status`                                                                                                                 | [com.tigrisdata.tigris_core.models.shared.Status](../../models/shared/Status.md)                                         | :heavy_minus_sign:                                                                                                       | Default error response                                                                                                   |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |