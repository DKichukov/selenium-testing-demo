package com.example.selenium;

import static com.example.selenium.constant.Urls.ESKY_BG;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputDropdown {

  public static void main(String[] args) throws InterruptedException {

    WebDriver driver = createChromeDriver();
    driver.get(ESKY_BG);
    driver.manage().window().maximize();

    //oneway
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='TripTypeOneway']")).click();

    //From
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='departureOneway']"))
        .sendKeys("Варна, Варна, Варна, България (VAR)");

    //To
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='arrivalOneway']"))
        .sendKeys("Виена, Швехат, Австрия (VIE)");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));
    //select date
//    driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='12']")).click();
    //select today()
    driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[contains(@class,'ui-datepicker-today')]//a")).click();
    //search
    driver.findElement(By.xpath("//button[contains(@class,'btn transaction qsf-search')]")).click();

    Thread.sleep(10000);

    driver.quit();
  }

}
