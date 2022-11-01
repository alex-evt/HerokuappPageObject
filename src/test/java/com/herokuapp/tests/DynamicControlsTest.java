package com.herokuapp.tests;

import com.herokuapp.services.DynamicControlsService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    DynamicControlsService dynamicControlsService;

    @BeforeClass
    public void openPage() {
        dynamicControlsService = new DynamicControlsService();
        dynamicControlsService.openDynamicControlPage();
    }

    @Test(priority = 1)
    public void verifyCheckboxPresence() {
        int actualCheckboxCondition = dynamicControlsService.isCheckboxPresentOnPage();
        int expectedCheckboxCondition = 1;
        Assert.assertEquals(actualCheckboxCondition, expectedCheckboxCondition);
    }

    @Test(priority = 2)
    public void verifyRemoveMessage() {
        String actualText = dynamicControlsService.getRemovalMessage();
        String expectedText = "It's gone!";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test(priority = 3)
    public void verifyCheckboxDisappearance() {
        int actualCheckboxCondition = dynamicControlsService.isCheckboxPresentOnPage();
        int expectedCheckboxCondition = 0;
        Assert.assertEquals(actualCheckboxCondition, expectedCheckboxCondition);
    }

    @Test(priority = 4)
    public void verifyInputDisabled(){
        boolean actualConditionInputField = dynamicControlsService.isInputFieldConditionEnabled();
        Assert.assertFalse(actualConditionInputField);
    }

    @Test(priority = 5)
    public void verifyEnableButton(){
        String actualTextAfterClickingEnableButton = dynamicControlsService.getInputMessage();
        String expectedTextAfterClickingEnableButton = "It's enabled!";
        Assert.assertEquals(actualTextAfterClickingEnableButton,expectedTextAfterClickingEnableButton);
    }

    @Test(priority = 6)
    public void verifyInputEnable(){
        boolean actualConditionInputField = dynamicControlsService.isInputFieldConditionEnabled();
        Assert.assertTrue(actualConditionInputField);
    }
}
