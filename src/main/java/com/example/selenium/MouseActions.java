package com.example.selenium;

import static com.example.selenium.constant.Urls.AMAZON_DE;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = createChromeDriver();
    driver.get(AMAZON_DE);
    Actions act = new Actions(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")))
        .build().perform();

    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Books')]"))).click().build()
        .perform();

    Thread.sleep(3000);
    driver.navigate().back();

    //type in search and double click
    act.moveToElement(
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
        .sendKeys("usb drive").doubleClick().build().perform();

    //right button click
//    act.moveToElement(
//            driver.findElement(By.xpath("//a[@href='/-/en/gp/bestsellers/?ref_=nav_cs_bestsellers']")))
//        .contextClick().build().perform();

    act.contextClick(
            driver.findElement(By.xpath("//a[@href='/-/en/gp/bestsellers/?ref_=nav_cs_bestsellers']")))
        .build().perform();

    Thread.sleep(10000);
    driver.quit();
  }

}
