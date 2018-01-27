package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {
    // Web driver instance
    public static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException {
        // Google home page object
        GoogleHomePageObject home = new GoogleHomePageObject(driver);

        // Open google.co.in site
        driver.navigate().to("http://www.google.co.in");

        // Call page object function to perform search operation
        home.searchGoogle("selenium");

        // click on selenium link and assign retured page object in test
        SeleniumHomePageObject seleniumPage = home.clickSeleniumLink(driver);

        // Wait for 5 seconds before performing actions on selenium page
        Thread.sleep(5000);

        // click Download and home links in selenium hq page.
        seleniumPage.clickDownload();
        seleniumPage.clickHome();

        // Close web driver session
        driver.quit();

    }
}
