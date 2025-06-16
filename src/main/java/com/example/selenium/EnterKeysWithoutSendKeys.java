package com.example.selenium;

import static com.example.selenium.constant.Urls.REDIFF_MAIL;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class EnterKeysWithoutSendKeys {

  public static void main(String[] args) {
      WebDriver driver = createChromeDriver();
      driver.get(REDIFF_MAIL);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    JavascriptExecutor je = (JavascriptExecutor) driver;
//    je.executeScript("document.getElementById('login1').value=\"abcde\"");
//    je.executeScript("document.getElementsByName('login')[0].value=\"abcde\"");
    je.executeScript("document.querySelector('#login1').value=\"abcde\"");
  }
}
