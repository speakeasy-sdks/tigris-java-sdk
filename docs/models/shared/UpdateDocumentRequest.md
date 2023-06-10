# UpdateDocumentRequest


## Fields

| Field                                                                                                                 | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `documents`                                                                                                           | List<*String*>                                                                                                        | :heavy_minus_sign:                                                                                                    | An array of documents. Each document should have "id" present which will be used by Tigris for updating the document. |
| `index`                                                                                                               | *String*                                                                                                              | :heavy_minus_sign:                                                                                                    | Index name where to create documents.                                                                                 |
| `project`                                                                                                             | *String*                                                                                                              | :heavy_minus_sign:                                                                                                    | Project name whose db is under target to insert documents.                                                            |