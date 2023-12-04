/** Search API Use the Search REST API to manage your data (indices and records), implement search, and improve
  * relevance (with Rules, synonyms, and language dictionaries). Although Algolia provides a REST API, you should use
  * the official open source API [clients, libraries, and
  * tools](https://www.algolia.com/doc/guides/getting-started/how-algolia-works/in-depth/ecosystem/) instead. There's no
  * [SLA](https://www.algolia.com/policies/sla/) if you use the REST API directly.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.search

/** FetchedIndex
  *
  * @param name
  *   Index name.
  * @param createdAt
  *   Index creation date. An empty string means that the index has no records.
  * @param updatedAt
  *   Timestamp of the last update in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
  * @param entries
  *   Number of records contained in the index.
  * @param dataSize
  *   Number of bytes of the index in minified format.
  * @param fileSize
  *   Number of bytes of the index binary file.
  * @param lastBuildTimeS
  *   Last build time.
  * @param numberOfPendingTasks
  *   Number of pending indexing operations. This value is deprecated and should not be used.
  * @param pendingTask
  *   A boolean which says whether the index has pending tasks. This value is deprecated and should not be used.
  * @param primary
  *   Only present if the index is a replica. Contains the name of the related primary index.
  * @param replicas
  *   Only present if the index is a primary index with replicas. Contains the names of all linked replicas.
  */
case class FetchedIndex(
    name: String,
    createdAt: String,
    updatedAt: String,
    entries: Int,
    dataSize: Int,
    fileSize: Int,
    lastBuildTimeS: Int,
    numberOfPendingTasks: Int,
    pendingTask: Boolean,
    primary: Option[String] = scala.None,
    replicas: Option[Seq[String]] = scala.None
)