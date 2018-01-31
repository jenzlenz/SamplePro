package com.jennifers.automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//All references are from www.facebook.com

public class Booleans extends DriverWrapper {

    @Test
    public void isElementExample() {
        boolean maleRadioButton = getDriver().findElement(By.id("u_0_8")).isSelected();
        //this returns the word true or false
        System.out.println("Male button is selected? " + maleRadioButton);

        boolean createAccountButton = getDriver().findElement(By.id("u_0_s")).isDisplayed();
        //this returns the word true or false
        System.out.println("Create account button is displayed? " + createAccountButton);

        boolean loginButton = getDriver().findElement(By.id("loginbutton")).isEnabled();
        //this returns the word true or false
        System.out.println("Login button is enabled? " + loginButton);

    }
}
