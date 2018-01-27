package com.jennifer.automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

public class BasePage {
    public void clickOn(By locator) {
        try {
            DriverWrapper.getDriver().findElement(locator).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
            }
    }

    public void setValueToInputField(String value, By locator) {
        try {
            DriverWrapper.getDriver().findElement(locator).sendKeys(value);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }
    }

    public String getTextFromElement(By locator) {
        //try {
            return DriverWrapper.getDriver().findElement(locator).getText();
        //} catch (NoSuchElementException e) {
        //    e.printStackTrace();
        //    System.out.println("Screenshot taken.");
        //Assert.fail("element is not found with this locator" +locator.toString());
        //}
    }

    public boolean isLocatorDisplayed(By locator) {
        try {
            return DriverWrapper.getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }
    }

    public boolean isLocatorEnabled(By locator) {
        try {
            return DriverWrapper.getDriver().findElement(locator).isEnabled();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }
    }

    public boolean isLocatorSelected(By locator) {
        try {
            return DriverWrapper.getDriver().findElement(locator).isSelected();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }
    }

}

