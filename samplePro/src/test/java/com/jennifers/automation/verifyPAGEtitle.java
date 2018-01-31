package com.jennifers.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyPAGEtitle extends DriverWrapper {
    @Test
    public void verifyPageTitle(){
        //get page title
        String currentPageTitle = getDriver().getTitle();
        //verify if page title is correct
        Assert.assertEquals(currentPageTitle, pageTitle, "Incorrect page title");
    }
}
