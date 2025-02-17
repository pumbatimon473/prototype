package com.assignment.question;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConfigurationTest {
    @Test
    void testShallowCopy() {
        Configuration defaultConfig = new Configuration("white", false, "en-us", false, 14, "consolas", ConfigurationType.DEFAULT);
        Configuration defaultConfigCopy = defaultConfig.cloneObject();

        assertNotSame(defaultConfig, defaultConfigCopy);
        // attrs references are same
        assertSame(defaultConfig.getThemeColor(), defaultConfigCopy.getThemeColor());
        assertSame(defaultConfig.getAutoSave(), defaultConfigCopy.getAutoSave());
        assertSame(defaultConfig.getLanguage(), defaultConfigCopy.getLanguage());
        assertSame(defaultConfig.getFontSize(), defaultConfigCopy.getFontSize());
        assertSame(defaultConfig.getFontFamily(), defaultConfigCopy.getFontFamily());
        assertSame(defaultConfig.getType(), defaultConfigCopy.getType());
    }
}
