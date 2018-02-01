package com.jennifers.automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.jennifers.automation.FacebookLoginPage.*;

public class verifyIncorrectEmail extends DriverWrapper {
    @Test
    public void verifyIncorrectEMAIL () {
        FacebookLandingPage landingPage = new FacebookLandingPage();
        landingPage.loginToApp("incorrectemail%gmail.com", "Password");

        boolean isMessageDisplayed = getDriver().findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).isDisplayed();
        Assert.assertEquals(isMessageDisplayed, true, "No invalid email message displayed.");
    }

}
