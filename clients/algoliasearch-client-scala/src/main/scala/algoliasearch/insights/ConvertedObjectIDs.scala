/** Insights API The Algolia Insights API lets you collect events related to your search and discovery experience.
  * Events represent actions that users take on your app or website. They unlock powerful features, such as
  * recommendations, personalization, smarter search results, and analytics that help you optimize your user experience.
  *
  * The version of the OpenAPI document: 1.0.0
  *
  * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
  * https://openapi-generator.tech Do not edit the class manually.
  */
package algoliasearch.insights

import algoliasearch.insights.ConversionEvent._

/** Use this event to track when users convert on items unrelated to a previous Algolia request. For example, if you
  * don't use Algolia to build your category pages, use this event. To track conversion events related to Algolia
  * requests, use the \"Converted object IDs after search\" event.
  *
  * @param eventName
  *   Can contain up to 64 ASCII characters. Consider naming events consistently—for example, by adopting Segment's
  *   [object-action](https://segment.com/academy/collecting-data/naming-conventions-for-clean-data/#the-object-action-framework)
  *   framework.
  * @param index
  *   Name of the Algolia index.
  * @param objectIDs
  *   List of object identifiers for items of an Algolia index.
  * @param userToken
  *   Anonymous or pseudonymous user identifier. > **Note**: Never include personally identifiable information in user
  *   tokens.
  * @param timestamp
  *   Time of the event in milliseconds in [Unix epoch time](https://wikipedia.org/wiki/Unix_time). By default, the
  *   Insights API uses the time it receives an event as its timestamp.
  * @param authenticatedUserToken
  *   User token for authenticated users.
  */
case class ConvertedObjectIDs(
    eventName: String,
    eventType: ConversionEvent,
    index: String,
    objectIDs: Seq[String],
    userToken: String,
    timestamp: Option[Long] = scala.None,
    authenticatedUserToken: Option[String] = scala.None
) extends EventsItemsTrait

object ConvertedObjectIDsEnums {}
