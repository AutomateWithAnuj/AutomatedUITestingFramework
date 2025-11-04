package org.example.pages.PageObjectModel.Improved_POM;

import org.example.base.CommonToAllPage;
import org.example.pages.PageObjectModel.Normal_POM.LoginPage;
import org.example.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends CommonToAllPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    
    private By TextOnDashboard = By.xpath("//*[@data-qa='cotirufajo']");
    //Page Actions
    public String loggedInText(){
        WaitHelpers.waitJVM(20000);
        return getText(TextOnDashboard);
    }
}
