package com.jennifers.automation;

import org.openqa.selenium.By;

//This class is specific to www.facebook.com
//It contains locators an methods that are specific to the www.facebook.com landing page
//this is the page you arrive at by just yuping www.facebook.com

public class FacebookLandingPage extends BasePage {

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");
    private By firstNameTextField = By.id("u_0_l");
    private By lastNameTextField = By.id("u_0_m");
    private By mobileNumberTextField = By.id("u_0_q");
    private By newPasswordTextField = By.id("u_0_x");
    private By birthdayMonthDropdown = By.name("month");
    private By birthdayDayDropdown = By.name("day");
    private By birthdayYearDropdown = By.name("year");
    private By femaleRadioButton = By.id("u_0_b");
    private By maleRadioButton = By.id("u_0_c");
    private By createAccountButton = By.id("u_0_13");
    //private By signUpButton = By.linkText("Sign Up for Facebook");

    //Methods
    public void enterEmail(String email) {
        sendAValueToInputField(emailTextField, email);
    }

    public void enterPassword(String password) {
        sendAValueToInputField(passTextField, password);
    }

    public void enterFirstName(String fname) {
        sendAValueToInputField(firstNameTextField, fname);
    }

    public void enterLastName(String lname) {
        sendAValueToInputField(lastNameTextField, lname);
    }

    public void enterMobileNumber(String mobilenum) {
        sendAValueToInputField(mobileNumberTextField, mobilenum);
    }

    public void enterNewPassword(String newPassword) {
        sendAValueToInputField(newPasswordTextField, newPassword);
    }

    public void selectBirthdayMonth(String monthToSelect) { selectFromDropdown(birthdayMonthDropdown, monthToSelect); }

    public void selectBirthdayDay(String dayToSelect) { selectFromDropdown(birthdayDayDropdown, dayToSelect); }

    public void selectBirthdayYear(String yearToSelect) { selectFromDropdown(birthdayYearDropdown, yearToSelect); }

    public void clickCreateAccountButton() {clickOn(createAccountButton); }

    public void selectGender(String gender) {
        if (gender == "female")
            clickOn(femaleRadioButton);
        else if (gender == "male")
            clickOn(maleRadioButton);
    }

    //below method is for users who need to register first, than login
    public void loginToApp(String fname, String lname, String mobilenum, String newPassword, String monthToSelect, String dayToSelect, String yearToSelect, String gender ) {
        enterFirstName(fname);
        enterLastName(lname);
        enterMobileNumber(mobilenum);
        enterNewPassword(newPassword);
        selectBirthdayMonth(monthToSelect);
        selectBirthdayDay(dayToSelect);
        selectBirthdayYear(yearToSelect);
        selectGender(gender);
        clickCreateAccountButton();

    }

    //below method is for users already registered
    public void loginToApp(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickOn(loginButton);
    }

}
