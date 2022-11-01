package com.herokuapp.pages;

import com.herokuapp.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    private final static int WAIT_TIMEOUT_SECONDS = 5;

    protected WebDriver driver = DriverSingleton.getDriver();

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement waitVisibilityOf(WebElement element){
       return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
               .until(ExpectedConditions.visibilityOf(element));
    }
}
