package com.example.demo;

import static com.example.demo.constant.Urls.ABV_BG;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.WebDriver;

public class LaunchChrome {

  public static void main(String[] args) {

    WebDriver driver = createChromeDriver();
    driver.get(ABV_BG);
    driver.quit();
  }

}
