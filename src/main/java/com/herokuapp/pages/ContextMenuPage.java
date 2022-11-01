package com.herokuapp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class ContextMenuPage extends BasePage {

    Actions action;

    @FindBy(xpath = "//div[@id= 'hot-spot']")
    private WebElement hotSpot;


    public ContextMenuPage rightClickHotSpot() {
        action = new Actions(driver);
        action.contextClick(hotSpot).perform();
        return this;
    }
    public ContextMenuPage openPage(String url){
        driver.get(url);
        return this;
    }

    public Alert alert(){
     return driver.switchTo().alert();
    }
}
