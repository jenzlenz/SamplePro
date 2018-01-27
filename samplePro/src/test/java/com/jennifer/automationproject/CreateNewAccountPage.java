package com.jennifer.automationproject;

import org.openqa.selenium.By;

public class CreateNewAccountPage extends BasePage {

    //Locators
    private By firstNameTextField = By.id("u_0_l");
    private By lastNameTextField = By.id("u_0_m");
    private By mobileNumberTextField = By.id("u_0_q");
    private By newPasswordTextField = By.id("u_0_x");
    private By createAccountButton = By.id("u_0_13");

    //Methods
    public void enterFirstName(String fname) {
        setValueToInputField(fname, firstNameTextField);
    }

    public void enterLastName(String lname) {
        setValueToInputField(lname, lastNameTextField);
    }

    public void enterMobileNumber(String mobilenum) {
        setValueToInputField(mobilenum, mobileNumberTextField);
    }

    public void enterNewPassword(String newPassword) {
        setValueToInputField(newPassword, newPasswordTextField);
    }

    public void clickOnCreateAccountButton() {
        clickOnCreateAccountButton();
    }

    public void loginToApp(String fname, String lname, String mobilenum, String newPassword) {
        enterFirstName(fname);
        enterLastName(lname);
        enterMobileNumber(mobilenum);
        enterNewPassword(newPassword);
        clickOnCreateAccountButton();
    }
}
