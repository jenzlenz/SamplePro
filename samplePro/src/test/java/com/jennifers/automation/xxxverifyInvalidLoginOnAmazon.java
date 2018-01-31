package com.jennifers.automation;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Action;
import org.testng.*;

public class xxxverifyInvalidLoginOnAmazon extends DriverWrapper {

/* Classwork on Jan 27 2018:
1. Goto Amazon.com
2. Hover over hello sign in header
3. Click on Sign in button
4. Enter invalid email
5. Enter invalid password
6. Verify error message "There was a problem
We cannot find an account with that email address"


    @Test
    //1. Goto Amazon.com
            // driver.navigateto("https://www.amazon.com");
    //2. Hover over hello sign in header
    WebElement element = getDriver().findElement(By.class("#nav-line-1"));
    Actions action = new Actions(getDriver());
    action.moveToElement(element).build().perform();
    Thread.sleep(2000);
    //3. Click on Sign in button
    getDriver().findElement(By.linkText("Sign In")).click();
    Thread.sleep(2000);
    //4. Enter invalid email
    private emailTextField = By.ById = "app-email";
    public void enterEmail(String email) {
    setValueToInputField(email, emailTextField);
}
    //5. Enter invalid password
            (By.ById = "app-password")
    //6. Verify error message "There was a problem
    //   We cannot find an account with that email address"
    Assert.ByClassName = "a-alert-heading"); // There was a problem
    Assert.assertEqualsByClassName = ("a-list-item", "We cannot find an account with that email address");
*/
}
