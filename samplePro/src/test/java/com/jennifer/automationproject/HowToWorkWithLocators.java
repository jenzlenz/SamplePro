package com.jennifer.automationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.*;

public class HowToWorkWithLocators extends DriverWrapper {

    @Test
    public void findElementById() {
        //getDriver().findElement(By.id("email")).sendKeys("jenzlenz@gmail.com");
        //getDriver().findElement(By.id("pass")).sendKeys("Daddy0811");
        //getDriver().findElement(By.id("lognbutton")).click();
    }

    @Test
    public void findElementByName() {
        //getDriver().findElement(By.name("email")).sendKeys("jenzlenz@gmail.com");
        //getDriver().findElement(By.name("pass")).sendKeys("Daddy0811");
        //getDriver().findElement(By.id("lognbutton")).click();
    }

    @Test
    public void findElementByTagName() {
        //getDriver().findElement(By.tagName("input")).sendKeys("jenzlenz@gmail.com");
    }

    @Test
    public void findElementByLinkText() throws InterruptedException {
        //getDriver().findElement(By.linkText("Forgot account?")).click();
    }

    @Test
    public void findElementByPartialLinkText() {
        //getDriver().findElement(By.partialLinkText("Forgot")).click();
    }

    @Test
    public void findElementByXPath() {
     //   getDriver().findElement(By.xpath("//*[@id='email']")).sendKeys("jenzlenz@gmail.com");
     //   getDriver().findElement(By.xpath("//*[@id='pass']")).sendKeys("Daddy0811");
     //   getDriver().findElement(By.xpath("//*[@id='lognbutton']")).click();
     //   Thread.sleep(5000);
    }

    @Test
    public void findElementByCSS() {
        //getDriver().findElement(By.cssSelector("#email")).sendKeys("jenzlenz@gmail.com");
        //getDriver().findElement(By.cssSelector("#pass")).sendKeys("Daddy0811");
        //getDriver().findElement(By.cssSelector("#lognbutton")).click();
    }

    @Test
    public void findElementByList() throws InterruptedException {
        //note: findElement looks for only one element,
        //but findElements looks for any and all elements, returns a list
        List<WebElement> listOfLinks = getDriver().findElements(By.tagName("a"));
        /////////following line allows you to interact with a specific index of that list
        /////////listOfLinks.get(0).click();
        //for (WebElement element : listOfLinks) {
        //   if (element.getText().equals("Forgot account?")) {
        //       element.click();
        //   break;
            //}
    }

    //@Test
    //public void getDefaultFirstName() {
        //WebElement firstNameTextField = getDriver().findElement(By.xpath(".//*[@id=\"u_0_e\"]"));
        //System.out.println("First name default value in text box is: " + firstNameTextField.getAttribute("aria-label"));
    //}
}
