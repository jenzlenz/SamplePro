package com.jennifer.automationproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class DriverWrapper {

    private static WebDriver driver = null;
    protected static String url = "https://www.facebook.com/";
    protected static String pageTitle = "Facebook - Log In or Sign Up";

    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/jenniferdooley/Downloads/TechnosoftProjectDownloads/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to(url);

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
        driver.quit();
    }
}
