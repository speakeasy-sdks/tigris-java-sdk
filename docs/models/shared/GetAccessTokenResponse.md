# GetAccessTokenResponse

The response of GetAccessToken which contains access_token and optionally refresh_token.


## Fields

| Field                                       | Type                                        | Required                                    | Description                                 |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| `accessToken`                               | *String*                                    | :heavy_minus_sign:                          | An Access Token.                            |
| `expiresIn`                                 | *Integer*                                   | :heavy_minus_sign:                          | Access token expiration timeout in seconds. |
| `refreshToken`                              | *String*                                    | :heavy_minus_sign:                          | The Refresh Token.                          |