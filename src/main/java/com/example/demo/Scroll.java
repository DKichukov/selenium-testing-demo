package com.example.demo;

import static com.example.demo.constant.Urls.SCROLL;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = createChromeDriver();
    driver.get(SCROLL);
    driver.manage().window().maximize();

    JavascriptExecutor js = (JavascriptExecutor) driver;
      //scroll window
    js.executeScript("window.scroll(0,350)");

    Thread.sleep(5000);
    driver.quit();
  }

}
