package com.jennifers.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.Assert;

public class verifyIncorrectPassword extends DriverWrapper {

    @Test
    public void verifyIncorrectPwd() {

        FacebookLandingPage facebookLandingPage = new FacebookLandingPage();
        facebookLandingPage.loginToApp("jenzlenz@gmail.com", "WrongPassword!");

        boolean isButtonDisplayed = getDriver().findElement(By.xpath("//*[@id='login_link']/div[2]/a[1]")).isDisplayed();
        Assert.assertEquals(isButtonDisplayed, true, "Recover Your Account button is NOT displayed.");
        ;
    }
}
