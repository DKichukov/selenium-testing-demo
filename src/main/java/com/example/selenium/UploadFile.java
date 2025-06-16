package com.example.selenium;

import static com.example.selenium.constant.Urls.W3SCHOOLS_UPLOAD;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadFile {

  public static void main(String[] args) {
    WebDriver driver = createChromeDriver();
    driver.get(W3SCHOOLS_UPLOAD);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("src/main/resources/test.txt");


  }

}
