package com.jennifers.automation;

import org.testng.Assert;
import org.testng.annotations.*;


public class verifyURL extends DriverWrapper {

    @Test
    public void verifyUrl(){
        //get url
        String currentURL = getDriver().getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        System.out.println("url = " + url);
        //verify if URL is correct
        Assert.assertEquals(currentURL, url, "Invalid URL");
    }
}
