package com.herokuapp.tests;

import com.herokuapp.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getDriver();
    }


    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        DriverSingleton.closeBrowser();
    }
}
