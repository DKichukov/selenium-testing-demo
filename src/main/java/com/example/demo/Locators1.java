package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
  private static final String ABV_BG = "https://www.abv.bg/";

  public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
        "chrome-driver/chromedriver-win64/chromedriver.exe");

    WebDriver driver = new ChromeDriver();
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
