package com.jennifer.automationproject;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    //Locators
    private By recoverEmailLink = By.linkText("Recover Your Account");

    //Methods
    public String getRecoverAccountLinkText() {
        return getTextFromElement(recoverEmailLink);
    }
}
