// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on
// https://github.com/algolia/api-clients-automation. DO NOT EDIT.

import Foundation
#if canImport(Core)
    import Core
#endif

/// Order of facet values that aren&#39;t explicitly positioned with the &#x60;order&#x60; setting.  &lt;dl&gt;
/// &lt;dt&gt;&lt;code&gt;count&lt;/code&gt;&lt;/dt&gt; &lt;dd&gt; Order remaining facet values by decreasing count. The
/// count is the number of matching records containing this facet value. &lt;/dd&gt;
/// &lt;dt&gt;&lt;code&gt;alpha&lt;/code&gt;&lt;/dt&gt; &lt;dd&gt;Sort facet values alphabetically.&lt;/dd&gt;
/// &lt;dt&gt;&lt;code&gt;hidden&lt;/code&gt;&lt;/dt&gt; &lt;dd&gt;Don&#39;t show facet values that aren&#39;t
/// explicitly positioned.&lt;/dd&gt; &lt;/dl&gt;.
public enum RecommendSortRemainingBy: String, Codable, CaseIterable {
    case count
    case alpha
    case hidden
}

extension RecommendSortRemainingBy: Hashable {}
