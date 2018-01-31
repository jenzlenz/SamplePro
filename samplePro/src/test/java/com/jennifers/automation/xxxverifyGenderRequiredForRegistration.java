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

public class xxxverifyGenderRequiredForRegistration extends DriverWrapper {

    @Test
    public void verifyGENDERRequiredForRegistration() {

        FacebookLandingPage landingPage = new FacebookLandingPage();
        FacebookLoginPage loginPage = new FacebookLoginPage();

        //Enter first name
        //BasePage.setValueToInputField("Jennifer","firstname");
        getDriver().findElement(By.name("firstname")).sendKeys("Jennifer");
        //Enter last name
        //BasePage.setValueToInputField("Dooley","lastname");
        getDriver().findElement(By.name("lastname")).sendKeys("Dooley");
        //Enter Mobile Number
        //BasePage.setValueToInputField("1112223333","reg_mail__");
        getDriver().findElement(By.name("reg_mail__")).sendKeys("1112223333");
        //Enter Password
        //BasePage.setValueToInputField("myPass1234","freg_passwd__");
        getDriver().findElement(By.name("reg_passwd__")).sendKeys("myPass1234");
        //Select birthday
        BasePage.selectFromDropdown("month", "May");
        //BasePage.selectFromDropdown("day", "6");
        //BasePage.selectFromDropdown("year", "1976");
        //Click on Create Account button
        //BasePage.clickOn("websubmit");
        getDriver().findElement(By.name("websubmit")).click();

        //Assert the missing gender selection error message is displayed as follows:
        //"Please choose a gender.  You can change who can see this later."
        boolean isGenderErrorDisplayed = getDriver().findElement(By.id("js_bc")).isDisplayed();
        Assert.assertEquals(isGenderErrorDisplayed, "true", "No error message for missing gender selection is displayed");
        //

    }
}
