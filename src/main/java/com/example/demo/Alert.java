package com.example.demo;

import static com.example.demo.constant.Urls.W3SCHOOLS_COM;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alert {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = createChromeDriver();
    driver.get(W3SCHOOLS_COM);

//    driver.manage().window().maximize();

    WebElement w = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

    driver.switchTo().frame(w);
    //click on try
    driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

    //click on OK
    Thread.sleep(3000);
    driver.switchTo().alert().accept();

    //Click on cancel
//    driver.switchTo().alert().dismiss();

    //get out from the frame
    driver.switchTo().defaultContent();

    driver.findElement(By.xpath("//a[@id='getwebsitebtn']")).click();

    Thread.sleep(5000);
    driver.quit();

  }

}
