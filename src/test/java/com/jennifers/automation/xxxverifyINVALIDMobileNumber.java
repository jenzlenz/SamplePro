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

public class xxxverifyINVALIDMobileNumber extends DriverWrapper {
    @Test
    public void verifyInvalidMobileNumber() {

        FacebookLandingPage facebookLandingPage = new FacebookLandingPage();

        //Enter first name
        facebookLandingPage.enterFirstName("Jennifer");
        //getDriver().findElement(By.name("firstname")).sendKeys("Jennifer");
        //Enter last name
        facebookLandingPage.enterLastName("Dooley");
        //getDriver().findElement(By.name("lastname")).sendKeys("Dooley");
        //Enter Mobile Number
        facebookLandingPage.enterMobileNumber("111aaa333");
        //getDriver().findElement(By.name("reg_mail__")).sendKeys("1112223333");
        //Enter Password
        facebookLandingPage.enterNewPassword("myPass1234");
        //getDriver().findElement(By.name("reg_passwd__")).sendKeys("myPass1234");
        //Select birthday
        facebookLandingPage.selectBirthdayMonth(5);
        facebookLandingPage.selectBirthdayDay(6);
        facebookLandingPage.selectBirthdayYear("1976");
        //Click on Create Account button
        facebookLandingPage.clickCreateAccountButton();
        //getDriver().findElement(By.name("websubmit")).click();

        //having trouble finding the right locator for the invalid mobilenumber error message - this is not the right one
        boolean isErrorDisplayed = getDriver().findElement(By.id("reg_error")).isDisplayed();
        Assert.assertEquals(isErrorDisplayed, true, "Invalid Mobile Number error message is NOT displayed.");

    }
}
