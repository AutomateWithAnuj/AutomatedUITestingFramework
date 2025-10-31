package org.example.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    //File to read te data from the data.properties (key, value)
    public static String readKey(String key){
        Properties p = null;
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"C:\\Users\\DELL\\IdeaProjects\\AutomatedUITestingPrograms_New\\src\\main\\java\\org\\example\\utils\\PropertiesReader.java");
            p =  new Properties();
            p.load(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return p.getProperty(key);
    }
}
