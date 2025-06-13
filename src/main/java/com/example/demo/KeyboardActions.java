package com.example.demo;

import static com.example.demo.constant.Urls.AMAZON_DE;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = createChromeDriver();
    driver.get(AMAZON_DE);
    Actions act = new Actions(driver);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    act.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
        .keyDown(
            Keys.SHIFT).sendKeys("usd drive").build().perform();

    Thread.sleep(2000);

    act
        .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).build().perform();

    Thread.sleep(10000);
    driver.quit();
  }

}
