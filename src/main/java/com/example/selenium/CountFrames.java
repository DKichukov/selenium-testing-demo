package com.example.selenium;

import static com.example.selenium.constant.Urls.W3SCHOOLS_COM;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CountFrames {

  public static void main(String[] args) {
    WebDriver driver = createChromeDriver();
    driver.get(W3SCHOOLS_COM);
    driver.manage().window().maximize();

    List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
    System.out.println(iframes);
    System.out.println("--------------");
    System.out.println("Size: " + iframes.size());

    driver.quit();
  }

}
