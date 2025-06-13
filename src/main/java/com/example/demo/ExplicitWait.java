package com.example.demo;

import static com.example.demo.constant.Urls.BOOK_MY_SHOW;
import static com.example.demo.util.WebDriverManager.createChromeDriver;
import static com.example.demo.util.WebDriverManager.createWebDriverWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = createChromeDriver();
    driver.get(BOOK_MY_SHOW);
    String marathiElement = "//img[@alt='Chandramukhi (Marathi)']";
    String ballerinaPoster = "//img[@alt='From the World of John Wick: Ballerina']";

    //explicit wait
    WebDriverWait wait = createWebDriverWait(driver, 5);

    driver.findElement(By.xpath("(//div[text()='Marathi'])[3]")).click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(marathiElement)));
    driver.findElement(By.xpath(marathiElement)).click();

    driver.navigate().back();

    driver.findElement(By.xpath("(//div[text()='English'])[3]")).click();

    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ballerinaPoster)));
    driver.findElement(By.xpath(ballerinaPoster)).click();
  }

}
