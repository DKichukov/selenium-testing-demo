package com.example.selenium;

import static com.example.selenium.constant.Urls.ABV_BG;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators1 {

  public static void main(String[] args) {

    WebDriver driver = createChromeDriver();
    driver.get(ABV_BG);
    driver.findElement(By.id("username")).sendKeys("abc");
    driver.findElement(By.name("password")).sendKeys("1234");
    driver.findElement(By.id("loginBut")).click();
    String text = driver.findElement(By.id("form.errors")).getText();
    System.out.println(text);

//    driver.findElement(By.linkText("Забравена парола")).click();
    driver.findElement(By.partialLinkText("парола")).click();
    driver.navigate().back();
    driver.navigate().forward();

//    driver.quit();
  }
}
