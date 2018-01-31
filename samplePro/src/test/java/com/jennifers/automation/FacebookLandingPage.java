package com.jennifers.automation;

import org.openqa.selenium.By;

//This class is specific to www.facebook.com
//It contains locators an methods that are specific to the www.facebook.com landing page

public class FacebookLandingPage extends BasePage {

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");
    //private By signUpButton = By.linkText("Sign Up for Facebook");

    //Methods
    public void enterEmail(String email) {
        setValueToInputField(email, emailTextField);
    }

    public void enterPassword(String password) {
        setValueToInputField(password, passTextField);
    }

    public void loginToApp(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOn(loginButton);
    }

}
