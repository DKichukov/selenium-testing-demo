package com.example.demo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
