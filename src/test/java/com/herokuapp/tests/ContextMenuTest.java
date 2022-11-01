package com.herokuapp.tests;

import com.herokuapp.services.ContextMenuService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    ContextMenuService contextMenuService;
    @Test
    public void verifyAlert() {
        contextMenuService = new ContextMenuService();
        String expectedAlertText = "You selected a context menu";
        contextMenuService.
                rightClickInTheBox();
        String actualAlertText = contextMenuService.getTextAndCloseAlert();
        Assert.assertEquals(actualAlertText, expectedAlertText);
    }
}