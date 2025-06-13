package com.example.demo.util;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverManager {

  private static final String CHROME_DRIVER_PATH = "chrome-driver/chromedriver-win64/chromedriver.exe";

  private WebDriverManager() {
  }

  public static WebDriver createChromeDriver() {
    try {
      System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
      return new ChromeDriver();
    } catch (Exception ex) {
      throw new RuntimeException("Failed to initialize ChromeDriver", ex);
    }
  }

  public static WebDriverWait createWebDriverWait(WebDriver driver, long timeoutSeconds) {
    return new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
  }

}
