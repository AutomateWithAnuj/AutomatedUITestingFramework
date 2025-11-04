package org.example.pages.PageObjectModel.Normal_POM;

import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private By TextOnDashboard = By.xpath("//*[@data-qa='cotirufajo']");
    //Page Actions
    public String loggedInText(){
        WaitHelpers.waitJVM(10000);
        return driver.findElement(TextOnDashboard).getText();
    }
}
