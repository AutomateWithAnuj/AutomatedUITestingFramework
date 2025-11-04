package org.example.tests.PageObjectModel.VWO;

import org.example.base.CommonToAllTest;
import org.example.pages.PageObjectModel.Normal_POM.LoginPage;
import org.example.utils.PropertiesReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.example.driver.DriverManager.driver;

public class TestVWOLogin_PF_WithLog4j extends CommonToAllTest {


    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF_WithLog4j.class);

    @Test
    public void testLoginNegativeVWO_PF() {
        logger.info("Starting the Testcases Page Factory");
        LoginPage loginPage = new LoginPage(driver);
        String error_MSG = loginPage.loginToVWOloginInvalidCred(
                PropertiesReader.readKey("invalid_username"),
                PropertiesReader.readKey("invalid_password")
        );
        logger.info("Error msg I got "+ error_MSG);
        logger.info("Finished the Testcases Page Factory");
        logger.debug("Finished the Testcases Page Factory");
        logger.error("Finished the Testcases Page Factory");
        logger.fatal("Fatal error - code is dead!");
        Assert.assertEquals(error_MSG, PropertiesReader.readKey("error_message"));
    }
}