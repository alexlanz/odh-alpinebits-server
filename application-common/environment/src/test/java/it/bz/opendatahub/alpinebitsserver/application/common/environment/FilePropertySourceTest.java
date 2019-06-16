package it.bz.opendatahub.alpinebitsserver.application.common.environment;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Tests for {@link EmptyPropertySource}.
 */
public class FilePropertySourceTest {

    private static final String DEFAULT_KEY = "DEFAULT_KEY";
    private static final String DEFAULT_VALUE = "DEFAULT_VALUE";

    @Test
    public void testGetValue_whenKeyIsNull_thenResultIsNull() {
        PropertySource source = FilePropertySource.fromDefaultFile();
        assertNull(source.getValue(null));
    }

    @Test
    public void testGetValue_whenKeyIsSetAndNotFound_thenResultIsNull() {
        PropertySource source = FilePropertySource.fromDefaultFile();
        assertNull(source.getValue("some key"));
    }

    @Test
    public void testGetValue_whenKeyIsSetAndFound_thenResultValue() {
        PropertySource source = FilePropertySource.fromDefaultFile();
        assertEquals(source.getValue(DEFAULT_KEY), DEFAULT_VALUE);
    }


}