package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePage() {
        driver.get("http://your-qa-server-url"); // Replace with your QA server URL
        String title = driver.getTitle();
        assertEquals("Expected Title", title);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
