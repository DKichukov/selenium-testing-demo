package com.example.demo;

import static com.example.demo.constant.Urls.BOOK_MY_SHOW;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = createChromeDriver();
    driver.get(BOOK_MY_SHOW);
    String marathiElement = "//img[@alt='Chandramukhi (Marathi)']";
    String ballerinaPoster = "//img[@alt='From the World of John Wick: Ballerina']";

    //Fluent wait polling 2 sec
    Wait<WebDriver> wait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofSeconds(2))
        .ignoring(NoSuchElementException.class);

    driver.findElement(By.xpath("(//div[text()='Marathi'])[3]")).click();

    WebElement foo1 = wait.until(new Function<WebDriver, WebElement>() {

      public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath(marathiElement));
      }
    });

    driver.findElement(By.xpath(marathiElement)).click();

    driver.navigate().back();
    driver.findElement(By.xpath("(//div[text()='English'])[3]")).click();

    WebElement foo2 = wait.until(new Function<WebDriver, WebElement>() {
      public WebElement apply(WebDriver driver) {
        return driver.findElement(By.xpath(ballerinaPoster));
      }
    });

    driver.findElement(By.xpath(ballerinaPoster)).click();
  }

}
