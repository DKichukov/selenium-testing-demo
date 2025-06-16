package com.example.selenium;

import static com.example.selenium.constant.Urls.AMAZON_DE;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GetCssProperties {
  public static void main(String[] args) {
    WebDriver driver = createChromeDriver();
    driver.get(AMAZON_DE);
    Actions act = new Actions(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    WebElement element = driver.findElement(By.xpath("//span[@id='glow-ingress-line2']"));
    System.out.println(element.getCssValue("font-size"));
    System.out.println(element.getCssValue("font-style"));
    System.out.println(element.getCssValue("color"));

    driver.quit();
  }
}
