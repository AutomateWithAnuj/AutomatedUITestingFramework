package org.example.listeners;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.FileInputStream;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.example.driver.DriverManager.getDriver;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = getDriver();

        String methodName = result.getName();

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");

        if(driver != null) {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try{
                String screenshotPath = "failure_screenshots/" + methodName + "_" + formatter.format(cal.getTime()) + ".png";
                FileUtils.copyFile(srcFile, new File(screenshotPath));

                //Add Screenshot Link to TestNG report
                org.testng.Reporter.log("<a href='"+screenshotPath+"'>Screenshot</a>");
                Allure.addAttachment("Screenshot", new FileInputStream(srcFile));//to attach the screenshot in the allure report
                Allure.addAttachment("Log output", "text/plain", "This is some log text"); //to attach the log in the allure report
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}