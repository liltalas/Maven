package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAutomation { // class name will always end with Test, by default
    @Test
    public void firstTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Thread.sleep(2000); // it will take 2 sec
        driver.manage().window().maximize();
        driver.quit(); // selenium method
    }

    @Test
    public void secondTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000); // it will take 2 sec
        driver.manage().window().maximize();
        driver.quit(); // selenium method
    }

    @Test
    public void thirdTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000); // it will take 2 sec
        driver.manage().window().maximize();
        driver.quit(); // selenium method
    }
}
