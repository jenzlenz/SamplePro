package com.jennifers.automation;

import org.testng.Assert;
import org.testng.annotations.*;


public class verifyURL extends DriverWrapper {
    @Test
    public void verifyUrl(String url){
        //get url
        String currentURL = getDriver().getCurrentUrl();
        //verify if URL is correct
        Assert.assertEquals(currentURL, url, "Invalid URL");
    }
}
