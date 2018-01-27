package com.jennifer.automationproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyINVALIDLogin extends DriverWrapper {
    @Test
    public void verifyInvalidLogin () {
        LandingPage landingPage = new LandingPage();
        LoginPage loginPage = new LoginPage();
        landingPage.loginToApp("jenzlenz@gmail.com", "Abc12345");

        Assert.assertEquals(loginPage.getRecoverAccountLinkText(), "Recover Your Account");
    }

}
