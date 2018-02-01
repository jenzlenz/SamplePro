package com.jennifers.automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//Classwork assigned on Jan 24 2018
//www.facebook.com
//Enter first name
//Enter last name
//Enter Mobile Number
//Enter Password
//Select birthday
//Click on Create Account button
//Assert the missing gender selection error message is displayed as follows:
//"Please choose a gender.  You can change who can see this later."

public class verifyGenderRequiredForRegistration extends DriverWrapper {

    @Test
    public static void verifyGENDERRequiredForRegistration() {

        FacebookLandingPage facebookLandingPage = new FacebookLandingPage();

        //Enter first name
        facebookLandingPage.enterFirstName("Jennifer");
        //getDriver().findElement(By.name("firstname")).sendKeys("Jennifer");
        //Enter last name
        facebookLandingPage.enterLastName("Dooley");
        //getDriver().findElement(By.name("lastname")).sendKeys("Dooley");
        //Enter Mobile Number
        facebookLandingPage.enterMobileNumber("1112223333");
        //getDriver().findElement(By.name("reg_mail__")).sendKeys("1112223333");
        //Enter Password
        facebookLandingPage.enterNewPassword("myPass1234");
        //getDriver().findElement(By.name("reg_passwd__")).sendKeys("myPass1234");
        //Select birthday
        facebookLandingPage.selectBirthdayMonth("May");
        facebookLandingPage.selectBirthdayDay("6");
        facebookLandingPage.selectBirthdayYear("1976");
        //Click on Create Account button
        facebookLandingPage.clickCreateAccountButton();
        //getDriver().findElement(By.name("websubmit")).click();

        //Assert the missing gender selection error message is displayed as follows:
        //"Please choose a gender.  You can change who can see this later."
        boolean isGenderErrorDisplayed = getDriver().findElement(By.id("js_bc")).isDisplayed();
        Assert.assertEquals(isGenderErrorDisplayed, true, "No error message for missing gender selection.");
        //

    }
}
