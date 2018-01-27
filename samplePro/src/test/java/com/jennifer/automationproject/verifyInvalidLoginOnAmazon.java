package com.jennifer.automationproject;

import org.testng.annotations.Test;

public class verifyInvalidLoginOnAmazon extends DriverWrapper {

/* Classwork on Jan 27 2018:
1. Goto Amazon.com
2. Hover over hello sign in header
3. Click on Sign in button
4. Enter invalid email
5. Enter invalid password
6. Verify error message "There was a problem
We cannot find an account with that email address"
*/

    @Test
            //1. Goto Amazon.com
            driver.navigate().to("https://www.amazon.com");
    //2. Hover over hello sign in header
    WebElement element = getDriver().findElement(By.linkText("#nav-link-accountList"));

    Actions action = new Actions(getDriver());
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
    getDriver().findElement(By.linkText("Visual designer")).click();
        Thread.sleep(2000);

//    3. Click on Sign in button
//4. Enter invalid email
//5. Enter invalid password
//6. Verify error message "There was a problem
//    We cannot find an account with that email address"
}
