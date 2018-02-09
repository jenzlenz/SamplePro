package com.jennifers.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class DriverWrapper {

    private static WebDriver driver = null;
    protected static final String url = "https://www.facebook.com/";
    protected static final String pageTitle = "Facebook - Log In or Sign Up";
    private static final String calendar = "https://www.hotels.com/";
    private static final String autoComplete = "https://www.expedia.com/";
    private static final String mouseOver = "https://dhtmlx.com/";
    private static final String amazon = "https://www.amazon.com/";


    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/jenniferdooley/Downloads/TechnosoftProjectDownloads/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.get(amazon);

//        System.setProperty("webdriver.safari.driver", "/Users/jenniferdooley/Downloads/TechnosoftProjectDownloads/safaridriver");
//        driver = new SafariDriver();
//        driver.navigate().to(url);
//
//        System.setProperty("webdriver.firefox.driver", "/Users/jenniferdooley/Downloads/TechnosoftProjectDownloads/firefoxdriver");
//        driver = new FirefoxDriver();
//        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }

    }
}
