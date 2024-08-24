<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Model\Ingestion;

use Algolia\AlgoliaSearch\Model\AbstractModel;

/**
 * DestinationIndexName Class Doc Comment.
 *
 * @category Class
 */
class DestinationIndexName extends AbstractModel implements ModelInterface, \ArrayAccess, \JsonSerializable
{
    /**
     * Array of property to type mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelTypes = [
        'indexName' => 'string',
        'recordType' => '\Algolia\AlgoliaSearch\Model\Ingestion\RecordType',
        'attributesToExclude' => 'string[]',
    ];

    /**
     * Array of property to format mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelFormats = [
        'indexName' => null,
        'recordType' => null,
        'attributesToExclude' => null,
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name.
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'indexName' => 'indexName',
        'recordType' => 'recordType',
        'attributesToExclude' => 'attributesToExclude',
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses).
     *
     * @var string[]
     */
    protected static $setters = [
        'indexName' => 'setIndexName',
        'recordType' => 'setRecordType',
        'attributesToExclude' => 'setAttributesToExclude',
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests).
     *
     * @var string[]
     */
    protected static $getters = [
        'indexName' => 'getIndexName',
        'recordType' => 'getRecordType',
        'attributesToExclude' => 'getAttributesToExclude',
    ];

    /**
     * Associative array for storing property values.
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor.
     *
     * @param mixed[] $data Associated array of property values
     */
    public function __construct(?array $data = null)
    {
        if (isset($data['indexName'])) {
            $this->container['indexName'] = $data['indexName'];
        }
        if (isset($data['recordType'])) {
            $this->container['recordType'] = $data['recordType'];
        }
        if (isset($data['attributesToExclude'])) {
            $this->container['attributesToExclude'] = $data['attributesToExclude'];
        }
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name.
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of property to type mappings. Used for (de)serialization.
     *
     * @return array
     */
    public static function modelTypes()
    {
        return self::$modelTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization.
     *
     * @return array
     */
    public static function modelFormats()
    {
        return self::$modelFormats;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses).
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests).
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if (!isset($this->container['indexName']) || null === $this->container['indexName']) {
            $invalidProperties[] = "'indexName' can't be null";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed.
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return 0 === count($this->listInvalidProperties());
    }

    /**
     * Gets indexName.
     *
     * @return string
     */
    public function getIndexName()
    {
        return $this->container['indexName'] ?? null;
    }

    /**
     * Sets indexName.
     *
     * @param string $indexName algolia index name (case-sensitive)
     *
     * @return self
     */
    public function setIndexName($indexName)
    {
        $this->container['indexName'] = $indexName;

        return $this;
    }

    /**
     * Gets recordType.
     *
     * @return null|RecordType
     */
    public function getRecordType()
    {
        return $this->container['recordType'] ?? null;
    }

    /**
     * Sets recordType.
     *
     * @param null|RecordType $recordType recordType
     *
     * @return self
     */
    public function setRecordType($recordType)
    {
        $this->container['recordType'] = $recordType;

        return $this;
    }

    /**
     * Gets attributesToExclude.
     *
     * @return null|string[]
     */
    public function getAttributesToExclude()
    {
        return $this->container['attributesToExclude'] ?? null;
    }

    /**
     * Sets attributesToExclude.
     *
     * @param null|string[] $attributesToExclude Attributes from your source to exclude from Algolia records.  Not all your data attributes will be useful for searching. Keeping your Algolia records small increases indexing and search performance.  - Exclude nested attributes with `.` notation. For example, `foo.bar` indexes the `foo` attribute and all its children **except** the `bar` attribute. - Exclude attributes from arrays with `[i]`, where `i` is the index of the array element.   For example, `foo.[0].bar` only excludes the `bar` attribute from the first element of the `foo` array, but indexes the complete `foo` attribute for all other elements.   Use `*` as wildcard: `foo.[*].bar` excludes `bar` from all elements of the `foo` array.
     *
     * @return self
     */
    public function setAttributesToExclude($attributesToExclude)
    {
        $this->container['attributesToExclude'] = $attributesToExclude;

        return $this;
    }

    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param int $offset Offset
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param int $offset Offset
     *
     * @return null|mixed
     */
    public function offsetGet($offset): mixed
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param null|int $offset Offset
     * @param mixed    $value  Value to be set
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param int $offset Offset
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }
}
