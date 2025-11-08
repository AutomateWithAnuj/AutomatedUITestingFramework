package org.example.utils;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public static String readKey(String key) {
        try {
            Properties properties = new Properties();
            InputStream inputStream = PropertiesReader.class.getClassLoader()
                    .getResourceAsStream("data.properties");
            
            if (inputStream == null) {
                throw new RuntimeException("data.properties not found in classpath");
            }
            
            properties.load(inputStream);
            String value = properties.getProperty(key);
            if (value == null) {
                throw new RuntimeException("Property '" + key + "' not found in data.properties");
            }
            return value;
        } catch (Exception e) {
            throw new RuntimeException("Error reading property '" + key + "': " + e.getMessage(), e);
        }
    }
}
