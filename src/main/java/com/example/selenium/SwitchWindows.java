package com.example.selenium;

import static com.example.selenium.constant.Urls.ESKY_BG;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchWindows {

  public static void main(String[] args) {

    WebDriver driver = createChromeDriver();
    driver.get(ESKY_BG);
    Actions act = new Actions(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.findElement(
            By.xpath("//a[@class='menu-link link-6 tx-link'][contains(text(),'Коли под наем')]"))
        .click();
    Set<String> windowHandles = driver.getWindowHandles();

    Iterator<String> it = windowHandles.iterator();
    var parentId = it.next();
    var childId = it.next();
    driver.switchTo().window(childId);

    driver.findElement(By.xpath("//input[@placeholder='Airport, city or station']"))
        .sendKeys("toyota");
  }

}
