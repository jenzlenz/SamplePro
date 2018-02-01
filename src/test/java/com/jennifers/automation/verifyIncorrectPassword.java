package com.jennifers.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class verifyIncorrectPassword extends DriverWrapper {

    @Test
    public void verifyIncorrectPwd() {

        FacebookLandingPage facebookLandingPage = new FacebookLandingPage();
        FacebookLoginPage facebookLoginPage = new FacebookLoginPage();
        facebookLandingPage.loginToApp("jenzlenz@gmail.com", "WrongPassword!");

        boolean isMessageDisplayed = getDriver().findElement(By.xpath("//*[@id='login_link']/div[2]/a[1]")).isDisplayed();
        Assert.assertEquals(isMessageDisplayed, true, "Recover Your Account button is NOT displayed.");
        ;
    }
}
