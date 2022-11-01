package com.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPage extends BasePage {

    @FindBy(xpath = "//a[text() = 'test1.txt']")
    private WebElement fileLinkTest1;

    public void clickFileTest1() {
        fileLinkTest1.click();
    }

    public String checkFileName() {
        return fileLinkTest1.getText();
    }


    public DownloadPage openPage(String url) {
        driver.get(url);
        return this;
    }
}
