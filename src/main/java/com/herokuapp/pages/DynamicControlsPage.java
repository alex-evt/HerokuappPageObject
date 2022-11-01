package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends BasePage{

    private final static String checkbox = "//input[@type='checkbox']";

    @FindBy(xpath = "//form[@id='checkbox-example']//button")
    private WebElement removeButton;

    @FindBy(xpath = "//form[@id='checkbox-example']//p[@id='message']")
    private WebElement checkboxRemovalMessage;



    @FindBy(xpath = "//form[@id='input-example']//button")
    private WebElement enableButton;

    @FindBy(xpath = "//form[@id='input-example']//input")
    private WebElement inputField;

    @FindBy(xpath = "//form[@id='input-example']//p[@id='message']")
    private WebElement inputMessage;

    public DynamicControlsPage openPage(String url){
        driver.get(url);
        return this;
    }

    public DynamicControlsPage clickOnRemoveButton(){
        removeButton.click();
        return this;
    }

    public DynamicControlsPage waitForRemovalMessageAppearance(){
        waitVisibilityOf(checkboxRemovalMessage);
        return this;
    }

    public String getTextOfRemovalMessage(){
       return checkboxRemovalMessage.getText();
    }

    public int checkboxSize(){
        return driver.findElements(By.xpath(checkbox)).size();
    }





    public DynamicControlsPage clickOnEnableButton(){
        enableButton.click();
        return this;
    }

    public boolean isInputFieldEnabled(){
       return inputField.isEnabled();
    }

    public DynamicControlsPage waitForInputMessage(){
        waitVisibilityOf(inputMessage);
        return this;
    }
    public String getTexOfInputMessage(){
       return inputMessage.getText();
    }
}
