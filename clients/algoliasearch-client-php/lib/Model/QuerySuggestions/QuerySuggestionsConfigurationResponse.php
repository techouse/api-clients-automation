<?php

// Code generated by OpenAPI Generator (https://openapi-generator.tech), manual changes will be lost - read more on https://github.com/algolia/api-clients-automation. DO NOT EDIT.

namespace Algolia\AlgoliaSearch\Model\QuerySuggestions;

/**
 * QuerySuggestionsConfigurationResponse Class Doc Comment.
 *
 * @category Class
 * @description API response for retrieving Query Suggestions configurations.
 */
class QuerySuggestionsConfigurationResponse extends \Algolia\AlgoliaSearch\Model\AbstractModel implements ModelInterface, \ArrayAccess, \JsonSerializable
{
    /**
     * Array of property to type mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelTypes = [
        'appID' => 'string',
        'indexName' => 'string',
        'sourceIndices' => '\Algolia\AlgoliaSearch\Model\QuerySuggestions\SourceIndex[]',
        'languages' => '\Algolia\AlgoliaSearch\Model\QuerySuggestions\Languages',
        'exclude' => 'string[]',
        'enablePersonalization' => 'bool',
        'allowSpecialCharacters' => 'bool',
    ];

    /**
     * Array of property to format mappings. Used for (de)serialization.
     *
     * @var string[]
     */
    protected static $modelFormats = [
        'appID' => null,
        'indexName' => null,
        'sourceIndices' => null,
        'languages' => null,
        'exclude' => null,
        'enablePersonalization' => null,
        'allowSpecialCharacters' => null,
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name.
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'appID' => 'appID',
        'indexName' => 'indexName',
        'sourceIndices' => 'sourceIndices',
        'languages' => 'languages',
        'exclude' => 'exclude',
        'enablePersonalization' => 'enablePersonalization',
        'allowSpecialCharacters' => 'allowSpecialCharacters',
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses).
     *
     * @var string[]
     */
    protected static $setters = [
        'appID' => 'setAppID',
        'indexName' => 'setIndexName',
        'sourceIndices' => 'setSourceIndices',
        'languages' => 'setLanguages',
        'exclude' => 'setExclude',
        'enablePersonalization' => 'setEnablePersonalization',
        'allowSpecialCharacters' => 'setAllowSpecialCharacters',
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests).
     *
     * @var string[]
     */
    protected static $getters = [
        'appID' => 'getAppID',
        'indexName' => 'getIndexName',
        'sourceIndices' => 'getSourceIndices',
        'languages' => 'getLanguages',
        'exclude' => 'getExclude',
        'enablePersonalization' => 'getEnablePersonalization',
        'allowSpecialCharacters' => 'getAllowSpecialCharacters',
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
    public function __construct(array $data = null)
    {
        if (isset($data['appID'])) {
            $this->container['appID'] = $data['appID'];
        }
        if (isset($data['indexName'])) {
            $this->container['indexName'] = $data['indexName'];
        }
        if (isset($data['sourceIndices'])) {
            $this->container['sourceIndices'] = $data['sourceIndices'];
        }
        if (isset($data['languages'])) {
            $this->container['languages'] = $data['languages'];
        }
        if (isset($data['exclude'])) {
            $this->container['exclude'] = $data['exclude'];
        }
        if (isset($data['enablePersonalization'])) {
            $this->container['enablePersonalization'] = $data['enablePersonalization'];
        }
        if (isset($data['allowSpecialCharacters'])) {
            $this->container['allowSpecialCharacters'] = $data['allowSpecialCharacters'];
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

        if (!isset($this->container['appID']) || null === $this->container['appID']) {
            $invalidProperties[] = "'appID' can't be null";
        }
        if (!isset($this->container['indexName']) || null === $this->container['indexName']) {
            $invalidProperties[] = "'indexName' can't be null";
        }
        if (!isset($this->container['sourceIndices']) || null === $this->container['sourceIndices']) {
            $invalidProperties[] = "'sourceIndices' can't be null";
        }
        if (count($this->container['sourceIndices']) < 1) {
            $invalidProperties[] = "invalid value for 'sourceIndices', number of items must be greater than or equal to 1.";
        }

        if (!isset($this->container['languages']) || null === $this->container['languages']) {
            $invalidProperties[] = "'languages' can't be null";
        }
        if (!isset($this->container['exclude']) || null === $this->container['exclude']) {
            $invalidProperties[] = "'exclude' can't be null";
        }
        if (!isset($this->container['enablePersonalization']) || null === $this->container['enablePersonalization']) {
            $invalidProperties[] = "'enablePersonalization' can't be null";
        }
        if (!isset($this->container['allowSpecialCharacters']) || null === $this->container['allowSpecialCharacters']) {
            $invalidProperties[] = "'allowSpecialCharacters' can't be null";
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
     * Gets appID.
     *
     * @return string
     */
    public function getAppID()
    {
        return $this->container['appID'] ?? null;
    }

    /**
     * Sets appID.
     *
     * @param string $appID algolia application ID to which this Query Suggestions configuration belongs
     *
     * @return self
     */
    public function setAppID($appID)
    {
        $this->container['appID'] = $appID;

        return $this;
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
     * @param string $indexName name of the Query Suggestions index
     *
     * @return self
     */
    public function setIndexName($indexName)
    {
        $this->container['indexName'] = $indexName;

        return $this;
    }

    /**
     * Gets sourceIndices.
     *
     * @return \Algolia\AlgoliaSearch\Model\QuerySuggestions\SourceIndex[]
     */
    public function getSourceIndices()
    {
        return $this->container['sourceIndices'] ?? null;
    }

    /**
     * Sets sourceIndices.
     *
     * @param \Algolia\AlgoliaSearch\Model\QuerySuggestions\SourceIndex[] $sourceIndices algolia indices from which to get the popular searches for query suggestions
     *
     * @return self
     */
    public function setSourceIndices($sourceIndices)
    {
        if (count($sourceIndices) < 1) {
            throw new \InvalidArgumentException('invalid length for $sourceIndices when calling QuerySuggestionsConfigurationResponse., number of items must be greater than or equal to 1.');
        }
        $this->container['sourceIndices'] = $sourceIndices;

        return $this;
    }

    /**
     * Gets languages.
     *
     * @return \Algolia\AlgoliaSearch\Model\QuerySuggestions\Languages
     */
    public function getLanguages()
    {
        return $this->container['languages'] ?? null;
    }

    /**
     * Sets languages.
     *
     * @param \Algolia\AlgoliaSearch\Model\QuerySuggestions\Languages $languages languages
     *
     * @return self
     */
    public function setLanguages($languages)
    {
        $this->container['languages'] = $languages;

        return $this;
    }

    /**
     * Gets exclude.
     *
     * @return string[]
     */
    public function getExclude()
    {
        return $this->container['exclude'] ?? null;
    }

    /**
     * Sets exclude.
     *
     * @param string[] $exclude exclude
     *
     * @return self
     */
    public function setExclude($exclude)
    {
        $this->container['exclude'] = $exclude;

        return $this;
    }

    /**
     * Gets enablePersonalization.
     *
     * @return bool
     */
    public function getEnablePersonalization()
    {
        return $this->container['enablePersonalization'] ?? null;
    }

    /**
     * Sets enablePersonalization.
     *
     * @param bool $enablePersonalization whether to turn on personalized query suggestions
     *
     * @return self
     */
    public function setEnablePersonalization($enablePersonalization)
    {
        $this->container['enablePersonalization'] = $enablePersonalization;

        return $this;
    }

    /**
     * Gets allowSpecialCharacters.
     *
     * @return bool
     */
    public function getAllowSpecialCharacters()
    {
        return $this->container['allowSpecialCharacters'] ?? null;
    }

    /**
     * Sets allowSpecialCharacters.
     *
     * @param bool $allowSpecialCharacters whether to include suggestions with special characters
     *
     * @return self
     */
    public function setAllowSpecialCharacters($allowSpecialCharacters)
    {
        $this->container['allowSpecialCharacters'] = $allowSpecialCharacters;

        return $this;
    }

    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param int $offset Offset
     *
     * @return bool
     */
    public function offsetExists($offset)
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
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param null|int $offset Offset
     * @param mixed    $value  Value to be set
     */
    public function offsetSet($offset, $value)
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
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }
}
