package com.jennifers.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyINVALIDLogin extends DriverWrapper {
    @Test
    public void verifyInvalidLogin () {
        FacebookLandingPage landingPage = new FacebookLandingPage();
        FacebookLoginPage loginPage = new FacebookLoginPage();
        landingPage.loginToApp("jenzlenz@gmail.com", "Abc12345");

        //Assert.assertEquals(FacebookLoginPage.getRecoverAccountLinkText(), "Recover Your Account");
    }

}
