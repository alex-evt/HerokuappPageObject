package com.herokuapp.services;

import com.herokuapp.pages.IFramePage;

public class IFrameService {

    private static final String IFRAME_URL = "http://the-internet.herokuapp.com/iframe";

    IFramePage iFramePage = new IFramePage();

    public String getTextFromIFrameTextArea(){
       return iFramePage
                .openPage(IFRAME_URL)
                .switchToFrame()
                .getTextFromTextArea();
    }
}
