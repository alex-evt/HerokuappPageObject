package com.herokuapp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFramePage extends BasePage {

    @FindBy(xpath = "//iframe[@id='mce_0_ifr']")
    private WebElement iframe;

    @FindBy(xpath = "//body[@id='tinymce']")
    private WebElement textArea;

    public IFramePage switchToFrame(){
       driver.switchTo().frame(iframe);
       return this;
    }

    public String getTextFromTextArea(){
       return textArea.getText();
    }

    public IFramePage openPage(String url) {
        driver.get(url);
        return this;
    }


}
