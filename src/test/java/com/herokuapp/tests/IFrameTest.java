package com.herokuapp.tests;

import com.herokuapp.services.IFrameService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest{

    IFrameService iFrameService;

    @Test
    public void verifyTextArea(){
        iFrameService = new IFrameService();

        String actual = iFrameService.getTextFromIFrameTextArea();
        String expected = "Your content goes here.";
        Assert.assertEquals(actual, expected);
    }
}
