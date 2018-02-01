package com.jennifers.automation;

import org.openqa.selenium.By;

public class FacebookLoginPage extends BasePage {

    //Locators
    protected By recoverEmailLink = By.linkText("Recover Your Account");

    //Methods
    public String getRecoverAccountLinkText() {
        return getTextFromElement(recoverEmailLink);
    }
}
