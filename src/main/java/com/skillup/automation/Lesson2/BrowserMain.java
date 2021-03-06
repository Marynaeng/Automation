package com.skillup.automation.Lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMain {

    private static final String EXPECTED_TITLE = "Google";
    private static final String URL = "https://www.google.com/";

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (EXPECTED_TITLE.equals(actualTitle)) {
            System.out.println("HEY HEY. TEST PASSED");

        } else {
            System.out.println("SAD. TEST FAILED");

            driver.quit();

        }
    }
}
