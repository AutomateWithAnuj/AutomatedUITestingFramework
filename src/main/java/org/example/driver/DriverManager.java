package org.example.driver;

import org.example.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    // When we want to start the browser
    public static void init() {
        String browser = PropertiesReader.readKey("browser");

        if (browser == null || browser.isEmpty()) {
            System.out.println("Browser not specified in properties file. Using default: edge");
            browser = "edge";
        }

        switch (browser) {
            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.addArguments("--guest");
                driver = new EdgeDriver(edgeOptions);
                break;

            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                driver = new FirefoxDriver(firefoxOptions);
                break;

            default:
                System.out.println("Browser not supported!");
        }
        //When we want to close the browser
    }
    public static void down(){
        if(getDriver() != null){
            driver.quit();
            driver = null;
        }
    }
}
