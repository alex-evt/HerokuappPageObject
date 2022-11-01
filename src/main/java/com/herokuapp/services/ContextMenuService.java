package com.herokuapp.services;

import com.herokuapp.pages.ContextMenuPage;

public class ContextMenuService {

    public static final String CONTEXT_MENU_URL = "http://the-internet.herokuapp.com/context_menu";


    protected ContextMenuPage contextMenuPage = new ContextMenuPage();

    public ContextMenuPage rightClickInTheBox() {
        return contextMenuPage.openPage(CONTEXT_MENU_URL)
                .rightClickHotSpot();
    }


    public String getTextAndCloseAlert(){
       String alertText = contextMenuPage.alert().getText();
       contextMenuPage.alert().dismiss();
       return alertText;
    }
}
