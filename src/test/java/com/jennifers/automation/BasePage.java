package com.jennifers.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.jennifers.automation.DriverWrapper.getDriver;

//This class includes all common methods for any webpage

public class BasePage {
    public void clickOn(By locator) {
        try {
            getDriver().findElement(locator).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
            }
    }

    public void sendAValueToInputField(By locator, String value) {
        try {
            getDriver().findElement(locator).sendKeys(value);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }
    }

    public String getTextFromElement(By locator) {
        try {
            return getDriver().findElement(locator).getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        return null;
        }
    }

    public boolean isLocatorDisplayed(By locator) {
        try {
            return getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }

        return false;
    }

    public boolean isLocatorEnabled(By locator) {
        try {
            return getDriver().findElement(locator).isEnabled();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }

        return false;
    }

    public boolean isLocatorSelected(By locator) {
        try {
            return getDriver().findElement(locator).isSelected();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken.");
            Assert.fail("element is not found with this locator" +locator.toString());
        }

        return false;
    }

    //Overloaded selectFromDropdown methods
    public void selectFromDropdown(By locator, int index) {
        //select from a dropdown by numeric index value
        Select dropdown = new Select(getDriver().findElement(locator));
        clickOn(locator);
        dropdown.selectByIndex(index);
    }
    public void selectFromDropdown(By locator, String textValue)  {
        //select from a dropdown by a text value
        Select dropdown = new Select(getDriver().findElement(locator));
        clickOn(locator);
        dropdown.selectByValue(textValue);
    }

    public void selectValueFromCalendar(By locator, String dateToSelect) throws Exception {
        getDriver().findElement(locator);
        List<WebElement> days = getDriver().findElements(locator);

        for (WebElement day : days) {
            String calendarDay = day.getText();
            if (calendarDay.equals(dateToSelect)) {
                day.click();
                Thread.sleep(3000);
                break;
            }
        }
    }

    public void switchFromRootToNewWindow(int index) {
        List<String> listOfWindows = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(listOfWindows.get(index));
    }

    public void switchBackToRootWindow() {
        List<String> listOfWindows = new ArrayList<String>(getDriver().getWindowHandles());

        for(int i = 1; i < listOfWindows.size(); i++){
            getDriver().switchTo().window(listOfWindows.get(i));
            getDriver().close();
        }
        getDriver().switchTo().window(listOfWindows.get(0));

    }

    public void mouseOver(String hoverOnThis, String whileHoveringClickOnThis) throws InterruptedException {
        WebElement element = getDriver().findElement(By.linkText(hoverOnThis));
        Actions action = new Actions(getDriver());
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
        getDriver().findElement(By.linkText(whileHoveringClickOnThis)).click();
        Thread.sleep(2000);
    }

    public void handleAutoComplete(String locator, String locator2, String inputValue, String valueToFind) throws InterruptedException {
        getDriver().findElement(By.xpath(locator)).click();
        getDriver().findElement(By.xpath(locator)).sendKeys(inputValue);
        Thread.sleep(3000);
        List<WebElement> list = getDriver().findElements(By.className(locator2));
        for (WebElement ele : list) {
            if(ele.getText().contains(valueToFind)) {
                ele.click();
                Thread.sleep(3000);
                break;
            }
        }
    }

    public void acceptAlert() {
        getDriver().switchTo().alert().accept();
    }

    public void dismissAlert() {
        getDriver().switchTo().alert().dismiss();
    }

    public void getTextFromAlert() {
        getDriver().switchTo().alert().getText();
    }

    public void sendKeysToAlert() {
       // getDriver().switchTo().alert().sendKeys(String someText);
    }
}

