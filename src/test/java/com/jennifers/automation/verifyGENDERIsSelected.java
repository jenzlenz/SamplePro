package com.jennifers.automation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//Homework Assignment from Sat Jan 20, 2018
//Write a test that does the following:
//On www.facebook.com
//Determines if female radio button is selected or not
//If it is NOT alredy selected, select female radio button
//Verify that the female radio button has been selected

public class verifyGENDERIsSelected extends DriverWrapper {
    @Test
    public void verifyGender(){
        //step 1:  Determine if female gender radio button selected or not
        boolean femaleRadioButtonDisplayed = getDriver().findElement(By.id("u_0_b")).isDisplayed();
        System.out.println("isDisplayed is: " + femaleRadioButtonDisplayed);
        boolean femaleRadioButtonEnabled = getDriver().findElement(By.id("u_0_b")).isEnabled();
        System.out.println("isEnabled is: " + femaleRadioButtonEnabled);
        boolean femaleRadioButtonSelected = getDriver().findElement(By.id("u_0_b")).isSelected();
        System.out.println("isSelected is: " + femaleRadioButtonSelected);

        //Step 2: If female radio button is NOT selected, select it
        if (femaleRadioButtonDisplayed) //female radio button must be displayed
            if (femaleRadioButtonEnabled)  //female radio button must be enabled
                if (femaleRadioButtonSelected) {
                    System.out.println("Female radio button is already selected.");
                } else {
                    getDriver().findElement(By.id("u_0_b")).click();
                    System.out.println("Female radio button has been selected.");
        }

        //Step 3
        // verify female radio button is selected
        femaleRadioButtonSelected = getDriver().findElement(By.id("u_0_b")).isSelected();
        Assert.assertEquals(femaleRadioButtonSelected, true, "Female radio button is NOT selected.");
    }
}
