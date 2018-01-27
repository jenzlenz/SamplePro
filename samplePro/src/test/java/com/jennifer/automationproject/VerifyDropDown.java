package com.jennifer.automationproject;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class VerifyDropDown extends DriverWrapper {

    @Test
    public void selectFromDropdown() throws Exception {
        //select value from dropdown
        Select monthDropDown = new Select(getDriver().findElement(By.id("month")));
        // Select element by visible text
        monthDropDown.selectByVisibleText("Jan");
        Thread.sleep(5000);
//        // Select element by index
        monthDropDown.selectByIndex(3);
        Thread.sleep(5000);
//        // Select element by value
        monthDropDown.selectByValue("4");
        Thread.sleep(5000);
//

        List<WebElement> allOptions = monthDropDown.getOptions();
        boolean isFound = false;
        for(WebElement option : allOptions){
            if(option.getText().equals("Jan")) {
                System.out.println("January Was found in Dropdown ");
                isFound = true;
                break;
            }
        }
        if(!isFound) {
            Assert.fail("Specified month was not found in monthDropDown");
        }
    }
}
