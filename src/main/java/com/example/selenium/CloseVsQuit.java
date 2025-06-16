package com.example.selenium;

import static com.example.selenium.constant.Urls.IRCTC;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseVsQuit {

  public static void main(String[] args) {
    WebDriver driver = createChromeDriver();
    driver.get(IRCTC);
    Actions act = new Actions(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();

    driver.quit(); //all windows are getting close
//    driver.close();  //current window get closed or previous window get closed
  }

}
