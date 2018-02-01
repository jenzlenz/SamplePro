package com.jennifers.automation;

//Assignment from class on Jan 17th is:
// Go to www.facebook.com
//click on Sign Up hyperlink and bottom of page
//Enter first name, last name, mobile number 5555556666
//Click on Create New Account button
//Verify the error message on the mobile umber field is displayed

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyInvalidMobileNumber extends DriverWrapper {
    @Test
    public void verifyInvalidMobileNum() {

        FacebookLandingPage facebookLandingPage = new FacebookLandingPage();
        //Populate all fields, but mobile number is an invalid entry
        facebookLandingPage.enterFirstName("Jennifer");
        facebookLandingPage.enterLastName("Dooley");
        facebookLandingPage.enterMobileNumber("111aaa333");
        facebookLandingPage.enterNewPassword("myPass1234");
        facebookLandingPage.selectBirthdayMonth(5);
        facebookLandingPage.selectBirthdayDay(6);
        facebookLandingPage.selectBirthdayYear("1976");
        facebookLandingPage.selectGender("female");
        facebookLandingPage.clickCreateAccountButton();

        //having trouble finding the right locator for the invalid mobilenumber error message
        //this is not the right one, I've tried so many
        boolean isErrorDisplayed = getDriver().findElement(By.partialLinkText("valid mobile")).isDisplayed();
        Assert.assertEquals(isErrorDisplayed, true, "Invalid Mobile Number error message is NOT displayed.");

    }
}
