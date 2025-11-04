package org.example.pages.PageObjectModel.Improved_POM;

import org.example.base.CommonToAllPage;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.example.driver.DriverManager.getDriver;

public class LoginPage extends CommonToAllPage {
    //Page Class
    //Page Locators
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver; //
    }

    // Step 1 - Page Locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    public String loginToVWOloginInvalidCred(String user, String pwd){
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

        WaitHelpers.checkVisibility(getDriver(),By.id("js-notification-box-msg"));
        return getText(error_message);
    }
    //it is more reusable
    public void loginToVWOloginvalidCred(String user, String pwd){
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);
    }
}
