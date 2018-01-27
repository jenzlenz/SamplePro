package com.jennifer.automationproject;

import org.testng.Assert;
import org.testng.annotations.*;


public class verifyURL extends DriverWrapper {
    @Test
    public void verifyUrl(){
        //get url
        String currentURL = getDriver().getCurrentUrl();
        //verify if URL is correct
        Assert.assertEquals(currentURL, url, "Invalid URL");
    }
}
