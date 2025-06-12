package com.example.demo;

import static com.example.demo.constant.Urls.ESKY_BG;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.WebDriver;

public class Dropdown {

  public static void main(String[] args) {

    WebDriver driver = createChromeDriver();
    driver.get(ESKY_BG);

    driver.quit();
  }

}
