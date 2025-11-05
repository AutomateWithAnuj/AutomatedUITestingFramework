package org.example.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    //Analyser will analyse the failed test case
    //Any failed test case is their it will be passed to analyser
    private int retryCount;
    private static final int maxRetryCount = 1;
    @Override
    public boolean retry(ITestResult result) {
        if(retryCount<maxRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}