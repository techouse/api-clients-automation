// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

public struct DeleteByParams: Codable, JSONEncodable {
    public var facetFilters: SearchFacetFilters?
    /// Filter expression to only include items that match the filter criteria in the response.  You can use these
    /// filter expressions:  - **Numeric filters.** `<facet> <op> <number>`, where `<op>` is one of `<`, `<=`, `=`,
    /// `!=`, `>`, `>=`. - **Ranges.** `<facet>:<lower> TO <upper>` where `<lower>` and `<upper>` are the lower and
    /// upper limits of the range (inclusive). - **Facet filters.** `<facet>:<value>` where `<facet>` is a facet
    /// attribute (case-sensitive) and `<value>` a facet value. - **Tag filters.** `_tags:<value>` or just `<value>`
    /// (case-sensitive). - **Boolean filters.** `<facet>: true | false`.  You can combine filters with `AND`, `OR`, and
    /// `NOT` operators with the following restrictions:  - You can only combine filters of the same type with `OR`.  
    /// **Not supported:** `facet:value OR num > 3`. - You can't use `NOT` with combinations of filters.   **Not
    /// supported:** `NOT(facet:value OR facet:value)` - You can't combine conjunctions (`AND`) with `OR`.   **Not
    /// supported:** `facet:value OR (facet:value AND facet:value)`  Use quotes around your filters, if the facet
    /// attribute name or facet value has spaces, keywords (`OR`, `AND`, `NOT`), or quotes. If a facet attribute is an
    /// array, the filter matches if it matches at least one element of the array.  For more information, see
    /// [Filters](https://www.algolia.com/doc/guides/managing-results/refine-results/filtering/).
    public var filters: String?
    public var numericFilters: SearchNumericFilters?
    public var tagFilters: SearchTagFilters?
    /// Coordinates for the center of a circle, expressed as a comma-separated string of latitude and longitude.  Only
    /// records included within circle around this central location are included in the results. The radius of the
    /// circle is determined by the `aroundRadius` and `minimumAroundRadius` settings. This parameter is ignored if you
    /// also specify `insidePolygon` or `insideBoundingBox`.
    public var aroundLatLng: String?
    public var aroundRadius: SearchAroundRadius?
    /// Coordinates for a rectangular area in which to search.  Each bounding box is defined by the two opposite points
    /// of its diagonal, and expressed as latitude and longitude pair: `[p1 lat, p1 long, p2 lat, p2 long]`. Provide
    /// multiple bounding boxes as nested arrays. For more information, see [rectangular area](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas).
    public var insideBoundingBox: [[Double]]?
    /// Coordinates of a polygon in which to search.  Polygons are defined by 3 to 10,000 points. Each point is
    /// represented by its latitude and longitude. Provide multiple polygons as nested arrays. For more information, see
    /// [filtering inside polygons](https://www.algolia.com/doc/guides/managing-results/refine-results/geolocation/#filtering-inside-rectangular-or-polygonal-areas).
    /// This parameter is ignored if you also specify `insideBoundingBox`.
    public var insidePolygon: [[Double]]?

    public init(
        facetFilters: SearchFacetFilters? = nil,
        filters: String? = nil,
        numericFilters: SearchNumericFilters? = nil,
        tagFilters: SearchTagFilters? = nil,
        aroundLatLng: String? = nil,
        aroundRadius: SearchAroundRadius? = nil,
        insideBoundingBox: [[Double]]? = nil,
        insidePolygon: [[Double]]? = nil
    ) {
        self.facetFilters = facetFilters
        self.filters = filters
        self.numericFilters = numericFilters
        self.tagFilters = tagFilters
        self.aroundLatLng = aroundLatLng
        self.aroundRadius = aroundRadius
        self.insideBoundingBox = insideBoundingBox
        self.insidePolygon = insidePolygon
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case facetFilters
        case filters
        case numericFilters
        case tagFilters
        case aroundLatLng
        case aroundRadius
        case insideBoundingBox
        case insidePolygon
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(self.facetFilters, forKey: .facetFilters)
        try container.encodeIfPresent(self.filters, forKey: .filters)
        try container.encodeIfPresent(self.numericFilters, forKey: .numericFilters)
        try container.encodeIfPresent(self.tagFilters, forKey: .tagFilters)
        try container.encodeIfPresent(self.aroundLatLng, forKey: .aroundLatLng)
        try container.encodeIfPresent(self.aroundRadius, forKey: .aroundRadius)
        try container.encodeIfPresent(self.insideBoundingBox, forKey: .insideBoundingBox)
        try container.encodeIfPresent(self.insidePolygon, forKey: .insidePolygon)
    }
}

extension DeleteByParams: Equatable {
    public static func ==(lhs: DeleteByParams, rhs: DeleteByParams) -> Bool {
        lhs.facetFilters == rhs.facetFilters &&
            lhs.filters == rhs.filters &&
            lhs.numericFilters == rhs.numericFilters &&
            lhs.tagFilters == rhs.tagFilters &&
            lhs.aroundLatLng == rhs.aroundLatLng &&
            lhs.aroundRadius == rhs.aroundRadius &&
            lhs.insideBoundingBox == rhs.insideBoundingBox &&
            lhs.insidePolygon == rhs.insidePolygon
    }
}

extension DeleteByParams: Hashable {
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.facetFilters?.hashValue)
        hasher.combine(self.filters?.hashValue)
        hasher.combine(self.numericFilters?.hashValue)
        hasher.combine(self.tagFilters?.hashValue)
        hasher.combine(self.aroundLatLng?.hashValue)
        hasher.combine(self.aroundRadius?.hashValue)
        hasher.combine(self.insideBoundingBox?.hashValue)
        hasher.combine(self.insidePolygon?.hashValue)
    }
}
