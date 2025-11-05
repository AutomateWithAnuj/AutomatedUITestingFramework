package org.example.tests.PageObjectModel.VWO;

import org.example.base.CommonToAllTest;
import org.example.listeners.RetryAnalyzer;
import org.example.listeners.ScreenshotListener;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.driver.DriverManager;
import static org.example.driver.DriverManager.getDriver;

@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLogin_03_Retry extends CommonToAllTest {
    private static final Logger logger = LogManager.getLogger(TestVWOLogin_03_Retry.class);

    @Owner("Anuj")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() throws InterruptedException { //this is the failed test case which will run 3 times
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Allure.addAttachment("Log output", "text/plain", "This is some log text");
        Assert.assertTrue(false);
        Thread.sleep(5000);
    }

    @Owner("Anuj")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() throws InterruptedException {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(true);
        Thread.sleep(5000);
    }
}