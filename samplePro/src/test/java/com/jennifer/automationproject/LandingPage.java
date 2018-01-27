package com.jennifer.automationproject;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");
    private By SignUpButton = By.linkText("Sign Up for Facebook");

    //Methods
    public void enterEmail(String email) {
        setValueToInputField(email, emailTextField);
    }

    public void enterPassword(String password) {
        setValueToInputField(password, passTextField);
    }

    public void clickOnLoginButton() {
        clickOnLoginButton();
    }

    public void clickOnSignUpButton(SignUpButton) {
        clickOnSignUpButton();
    }

    public void loginToApp(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOnLoginButton();
    }

}
