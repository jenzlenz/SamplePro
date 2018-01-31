package com.jennifers.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

//This class includes all common methods for any webpage

//Homework Assigned on Jan 27 2018:
//        1. Create base method for dropdown, we should have options to select by text
//        and select by index (hint: you can use overloaded concept here)
//        2. Create a base method that can be used to select value from calendar
//        3. Create base method to switch to new window and also another method to switch
//        to root window.
//        4. Create base method to handle auto-complete
//        5. Create a base method to handle mouseover
//        6. Create method for all of alert functionality.

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
        try {
            return DriverWrapper.getDriver().findElement(locator).getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
        Assert.fail("element is not found with this locator" +locator.toString());
        }
    }

    public boolean isLocatorDisplayed(By locator) {
        try {
            return DriverWrapper.getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }

        return false;
    }

    public boolean isLocatorEnabled(By locator) {
        try {
            return DriverWrapper.getDriver().findElement(locator).isEnabled();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }

        return false;
    }

    public boolean isLocatorSelected(By locator) {
        try {
            return DriverWrapper.getDriver().findElement(locator).isSelected();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }

        return false;
    }

    //Overloaded selectFromDropdown methods
    public void selectFromDropdown(String dropdownLocator, int index) throws Exception{
        //select from a dropdown by numeric index value
        Select dropdown = new Select(DriverWrapper.getDriver().findElement(By.id(dropdownLocator));
        dropdown.selectByIndex(index);
    }
    public void selectFromDropdown(String dropdownLocator, String textValue) throws Exception {
        //select from a dropdown by a text value
        Select dropdown = new Select(DriverWrapper.getDriver().findElement(By.id(dropdownLocator));
        dropdown.selectByVisibleText(textValue);
    }

    public void selectValueFromCalendar(String calendarLocator, String dateToSelect) throws Exception {
        DriverWrapper.getDriver().findElement(By.id(calendarLocator);
        List<WebElement> days = DriverWrapper.getDriver().findElements(By.id(calendarLocator));

        for (WebElement day : days) {
            String calendarDay = day.getText();
            if (calendarDay.equals(dateToSelect)) {
                day.click();
                Thread.sleep(3000);
                break;
            }
        }
    }

    public void switchFromRootToNewWindow() {
        List<String> listOfWindows = new ArrayList<~>(getDriver().getWindowHandles());
        getDriver().switchTo().window(listOfWindows.get(index));
    }

    public void switchBackToRootWindow() {
        List<String> listOfWindows = new ArrayList<~>(getDriver().getWindowHandles());

        for(int i = 1; i < listOfWindows.size(); i++){
            getDriver().switchTo().window(listOfWindows.get(i));
            getDriver().close();
        }
        getDriver().switchTo().window(listOfWindows.get(0));

    }

    public void mouseOver(String hoverOnThis, String whileHoveringClickOnThis) {
        WebElement element = getDriver().findElement(By.linkText(hoverOnThis));
        Actions action = new Actions(getDriver());
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
        getDriver().findElement(By.linkText(whileHoveringClickOnThis)).click();
        Thread.sleep(2000);
    }

    public void handleAutoComplete(String locator, String locator2, String inputValue, String valueToFind) {
        getDriver().findElement(By.xpath(locator)).click();
        getDriver().findElement(By.xpath(locator)).sendKeys(inputValue);
        Thread.sleep(3000);
        List<WebElement> list = getDriver().findElements(By.className(locator2));
        for )WebElement ele : list) {
            if(ele.getText().contains(valueToFind)) {
                ele.click();
                Thread.sleep(3000);
                break;
            }
        }
    }

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
        Thread.sleep(2000);

    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
        Thread.sleep(2000);

    public void getTextFromAlert() {
        getDriver().switchTo().alert().getText();
        Thread.sleep(2000);

    public void sendKeysToAlert() {
        getDriver().switchTo().alert().sendKeys(String someText);
        Thread.sleep(2000);

    }
}

