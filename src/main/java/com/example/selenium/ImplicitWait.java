package com.example.selenium;

import static com.example.selenium.constant.Urls.BOOK_MY_SHOW;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ImplicitWait {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = createChromeDriver();
    driver.get(BOOK_MY_SHOW);

    //implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.findElement(By.xpath("(//div[text()='Marathi'])[3]")).click();

    driver.findElement(By.xpath("//img[@alt='Chandramukhi (Marathi)']")).click();

    driver.navigate().back();

    driver.findElement(By.xpath("(//div[text()='English'])[3]")).click();

    driver.findElement(By.xpath("//img[@alt='From the World of John Wick: Ballerina']")).click();
  }

}
