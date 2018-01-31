package com.jennifers.automation;

import org.openqa.selenium.By;

public class FacebookCreateNewAccountPage extends BasePage {

    //Locators
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

    public void selectBirthdayMonth(String monthToSelect) { selectFromDropdown(birthdayMonthDropdown, monthToSelect); }

    public void selectBirthdayDay(String dayToSelect) { selectFromDropdown(birthdayDayDropdown, dayToSelect);

    public void selectBirthdayYear(String yearToSelect) { selectFromDropdown(birthdayYearDropdown, yearToSelect);

    public void selectGender(String gender) {
        if (gender == "female")
            clickOn(femaleRadioButton)
        else if (gender == "male")
            clickOn(maleRadioButton);
    }
}

    public void loginToApp(String fname, String lname, String mobilenum, String newPassword,
                           String monthToSelect, String dayToSelect, String yearToSelect, String gender ) {
        enterFirstName("Jennifer");
        enterLastName("Dooley");
        enterMobileNumber("5555556666");
        enterNewPassword("Test1234");
        selectBirthdayMonth("May");
        selectBirthdayDay("6");
        selectBirthdayYear("1976");
        selectGender("female");
        clickOn(createAccountButton);
    }
}
