package com.jennifers.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;

//All references are from www.facebook.com

public class FindElement extends DriverWrapper {

    @Test
    public void findElementById() throws InterruptedException {
        getDriver().findElement(By.id("email")).sendKeys("jenzlenz@gmail.com");
        getDriver().findElement(By.id("pass")).sendKeys("Daddy0811");
        getDriver().findElement(By.id("lognbutton")).click();

        getDriver().findElement(By.id("terms-link")).click();
        Thread.sleep(5000);
    }

    @Test
    public void findElementByName() {
        //class example
        //getDriver().findElement(By.name("email")).sendKeys("jenzlenz@gmail.com");
        //getDriver().findElement(By.name("pass")).sendKeys("Daddy0811");
        //getDriver().findElement(By.id("lognbutton")).click();

        //my homework
        //getDriver().findElement(By.name("websubmit")).click();
        //Thread.sleep(5000);
    }

    @Test
    //not used too often because there is usually something better, but works well for getting links
    public void findElementByTagName() {
        //class example
        //getDriver().findElement(By.tagName("input")).sendKeys("jenzlenz@gmail.com");

        //my homework
        //GET ALL LINKS IN A WEBPAGE
        //List<WebElement> allLinks = getDriver().findElements(By.tagName("a"));
        //CHANGE TAGNAME TO INPUT TO GET ALL TEXT BOXES IN A WEBPAGE
        //List<WebElement> allLinks = getDriver().findElements(By.tagName("input"));
        //CHANGE TAGNAME TO SELECT TO GET ALL DROPDOWNS BOXES IN A WEBPAGE
        //List<WebElement> allLinks = getDriver().findElements(By.tagName("select"));
        //System.out.println("Links count is: "+allLinks.size());
        //for(WebElement link : allLinks)
        //System.out.println(link.getText());
        //Thread.sleep(5000);
    }

    @Test
    public void findElementByLinkText() throws InterruptedException {
        //class example
        //getDriver().findElement(By.linkText("Forgot account?")).click();

        //my homework
        //getDriver().findElement(By.linkText("People")).click();
        //getDriver().findElement(By.linkText("Careers")).click();
        //getDriver().findElement(By.linkText("Italiano")).click();
        //Thread.sleep(5000);
    }

    @Test
    //Don't use this one unless nothing else works
    public void findElementByPartialLinkText() throws InterruptedException {
        //class example
        //getDriver().findElement(By.partialLinkText("Forgot")).click();

        //my homework
        //getDriver().findElement(By.partialLinkText("birthday")).click();
        //Thread.sleep(5000);
    }

    @Test
    public void findElementByXPath() throws InterruptedException {
        //class example

//           getDriver().findElement(By.xpath("//*[@id='email']")).sendKeys("jenzlenz@gmail.com");
//           getDriver().findElement(By.xpath("//*[@id='pass']")).sendKeys("Daddy0811");
//           //getDriver().findElement(By.xpath("//*[@id='lognbutton']")).click();
//           Thread.sleep(5000);

        //my homework - none of these pass though - I get cannot focus error
        //I tried clicking on the elemnt first then sendKeys, did not work
        //chro path confirms the xpath is correct though...
        //is there something special or different about these text fields?
//            getDriver().findElement(By.xpath("//*[@id='u_0_p']")).sendKeys("Jennifer");
//            getDriver().findElement(By.xpath("//*[@id='u_0_r']")).sendKeys("Dooley");
//            getDriver().findElement(By.xpath("//*[@id='u_0_u']")).sendKeys("1112223333");
//            getDriver().findElement(By.xpath("//*[@id='u_0_11']")).click();
//            getDriver().findElement(By.xpath("//*[@id='u_0_11']")).sendKeys("newpassword");
//            getDriver().findElement(By.xpath("//*[@id='u_0_15']/span[1]/label")).click();
//            getDriver().findElement(By.xpath("//*[@id=\'u_0_17\']")).click();
        //these below do work though
//      getDriver().findElement(By.xpath("//*[@id='pageFooter']/ul/li[3]/a")).click();
//      getDriver().findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click();
//      Thread.sleep(5000);
    }

    @Test
    public void findElementByCSS() throws InterruptedException {
        //classexample
        //getDriver().findElement(By.cssSelector("#email")).sendKeys("jenzlenz@gmail.com");
        //getDriver().findElement(By.cssSelector("#pass")).sendKeys("Daddy0811");
        //getDriver().findElement(By.cssSelector("#lognbutton")).click();

        //my homework
//        getDriver().findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();
//        getDriver().findElement(By.cssSelector("#privacy-link")).click();
//        getDriver().findElement(By.cssSelector("#month")).click();
//        getDriver().findElement(By.cssSelector("#day")).click();
//        getDriver().findElement(By.cssSelector("#year")).click();
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
