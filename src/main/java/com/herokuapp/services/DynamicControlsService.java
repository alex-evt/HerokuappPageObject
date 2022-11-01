package com.herokuapp.services;

import com.herokuapp.pages.DynamicControlsPage;

public class DynamicControlsService {

    private static final String DYNAMIC_CONTROLS_URL = "http://the-internet.herokuapp.com/dynamic_controls";


    protected DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();

    public DynamicControlsPage openDynamicControlPage(){
        return dynamicControlsPage
                .openPage(DYNAMIC_CONTROLS_URL);
    }

    public String getRemovalMessage(){
       return dynamicControlsPage
               .clickOnRemoveButton()
               .waitForRemovalMessageAppearance()
               .getTextOfRemovalMessage();
    }

    public int isCheckboxPresentOnPage(){
      return dynamicControlsPage.checkboxSize();
    }


    public String getInputMessage(){
        return dynamicControlsPage
                .clickOnEnableButton()
                .waitForInputMessage()
                .getTexOfInputMessage();
    }

    public boolean isInputFieldConditionEnabled(){
        return dynamicControlsPage.isInputFieldEnabled();
    }

}
