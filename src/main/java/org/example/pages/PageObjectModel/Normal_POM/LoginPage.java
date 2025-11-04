package org.example.pages.PageObjectModel.Normal_POM;

import org.example.utils.PropertiesReader;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Page Class
public class LoginPage {
    WebDriver driver;
    // Step 1 - Page Locators
    private By username = By.xpath("//input[@id='login-username']");
    private By password = By.xpath("//input[@id='login-password']");
    private By loginButton = By.xpath("//button[@id='js-login-btn']");
    private By error_MSG = By.xpath("//div[@id='js-notification-box-msg']");

    // Correct constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;  // assign properly
    }


    // Step 2 - Page Actions
    public String loginToVWOloginInvalidCred(String user, String pwd) {
        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();

        WaitHelpers.waitJVM(3000);
        WaitHelpers.checkVisibility(driver, error_MSG);
        return driver.findElement(error_MSG).getText();
    }

    public void loginToVWOloginvalidCred(String user, String pwd, WebDriver driver) {
        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();

        WaitHelpers.waitJVM(3000);

        ;
    }
}
