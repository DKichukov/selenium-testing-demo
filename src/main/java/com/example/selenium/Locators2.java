package com.example.selenium;

import static com.example.selenium.constant.Urls.ABV_BG;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators2 {

  public static void main(String[] args) {

    WebDriver driver = createChromeDriver();
    driver.get(ABV_BG);
    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("abcd");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
//    driver.findElement(By.xpath("//input[contains(@type='word')]")).sendKeys("1234");
    driver.findElement(By.cssSelector("input[value='Вход']")).click();

//    driver.quit();
  }
}
