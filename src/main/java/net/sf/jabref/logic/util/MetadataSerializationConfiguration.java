package net.sf.jabref.logic.util;

import net.sf.jabref.model.groups.AllEntriesGroup;
import net.sf.jabref.model.groups.SimpleKeywordGroup;

/**
 * Specifies how metadata is read and written.
 */
public class MetadataSerializationConfiguration {
    /**
     * Character used for quoting in the string representation.
     */
    public static final char GROUP_QUOTE_CHAR = '\\';

    /**
     * For separating units (e.g. name and hierarchic context) in the string representation
     */
    public static final String GROUP_UNIT_SEPARATOR = ";";

    /**
     * Identifier for {@link SimpleKeywordGroup}.
     */
    public static final String KEYWORD_GROUP_ID = "KeywordGroup:";

    /**
     * Identifier for {@link AllEntriesGroup}.
     */
    public static final String ALL_ENTRIES_GROUP_ID = "AllEntriesGroup:";
}
