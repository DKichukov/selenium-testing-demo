package com.example.selenium;

import static com.example.selenium.constant.Urls.ABV_BG;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.WebDriver;

public class LaunchChrome {

  public static void main(String[] args) {

    WebDriver driver = createChromeDriver();
    driver.get(ABV_BG);
    driver.quit();
  }

}
