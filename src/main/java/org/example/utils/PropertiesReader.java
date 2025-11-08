package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

    public static String readKey(String key) throws Exception {
        try {
            // First try to load from classpath (recommended approach)
            InputStream inputStream = PropertiesReader.class.getClassLoader()
                    .getResourceAsStream("data.properties");
            
            if (inputStream == null) {
                // Fallback: try absolute path
                String filePath = System.getProperty("user.dir") + "/src/main/resources/data.properties";
                inputStream = new FileInputStream(filePath);
            }
            
            Properties properties = new Properties();
            properties.load(inputStream);
            return properties.getProperty(key);
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading properties file: " + e.getMessage(), e);
        }
    }
}
