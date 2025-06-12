package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
  private static final String ABV_BG = "https://www.abv.bg/";

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        "chrome-driver/chromedriver-win64/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    driver.get(ABV_BG);
    driver.findElement(By.cssSelector("input[id='username']")).sendKeys("abcd");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
//    driver.findElement(By.xpath("//input[contains(@type='word')]")).sendKeys("1234");
    driver.findElement(By.cssSelector("input[value='Вход']")).click();

//    driver.quit();
  }
}
