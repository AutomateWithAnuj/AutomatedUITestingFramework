package org.example.tests.PageObjectModel.VWO;

import io.qameta.allure.Description;
import org.example.base.CommonToAllTest;
import org.example.driver.DriverManager;
import org.example.pages.PageObjectModelTests.LoginPage;
import org.example.utils.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestVWOLogin_01_NormalScript_POM extends CommonToAllTest {

    @Description("Verify that with invalid email, pass, error message is shown on the page")
    @Test
    public void test_negative_vwo_login() {
        // Step 1: Initialize Driver
        WebDriver driver = DriverManager.getDriver();

        // Step 2: Create Page Object
        LoginPage loginPage = new LoginPage(driver);

        // Step 3: Perform Login
        String error_MSG = loginPage.loginToVWOloginInvalidCred(
                PropertiesReader.readKey("valid_username"),
                PropertiesReader.readKey("invalid_password")
        );

        // Step 4: Assert
        assertThat(error_MSG).isNotNull().isNotEmpty().isNotBlank();
        Assert.assertEquals(error_MSG, "Your email, password, IP address or location did not match");

        driver.quit();
    }
}