package com.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage {

    @FindBy(xpath = "//input[@id='file-upload']")
    private WebElement fileUploadButton;

    @FindBy(xpath = "//input[@id='file-submit']")
    private WebElement submitFileButton;

    @FindBy(xpath = "//div[@id='drag-drop-upload']")
    private WebElement dragDropUpload;

    @FindBy(xpath = "//div[@id='uploaded-files']")
    private WebElement uploadedFiles;

    public UploadPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public UploadPage uploadFile(String fileSource) {
        fileUploadButton.sendKeys(fileSource);
        return this;
    }

    public UploadPage clickSubmitFileButton() {
        submitFileButton.click();
        return this;
    }

    public String uploadedFilesName() {
        return uploadedFiles.getText();
    }
}
