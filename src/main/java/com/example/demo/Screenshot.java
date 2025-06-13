package com.example.demo;

import static com.example.demo.constant.Urls.AMAZON_DE;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {

  public static void main(String[] args) throws InterruptedException {
    WebDriver driver = createChromeDriver();
    driver.get(AMAZON_DE);
    driver.manage().window().maximize();

    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    Thread.sleep(2000);

    Path destinationDir = Path.of("src/main/resources/downloads");
    Path destinationFile = destinationDir.resolve("screenshot.jpg");

    try {
      Files.copy(screenshot.toPath(), destinationFile, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("Screenshot saved to: " + destinationFile.toAbsolutePath());
    } catch (IOException e) {
      System.err.println("Failed to copy screenshot: " + e.getMessage());
      e.printStackTrace();
    }

    //partial screenshot
    WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    element.click();
    element.sendKeys("usb drive");

    File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    Thread.sleep(2000);

    Path destinationFile1 = destinationDir.resolve("screenshot1.jpg");

    try {
      Files.copy(screenshot1.toPath(), destinationFile1, StandardCopyOption.REPLACE_EXISTING);
      System.out.println("Screenshot1 saved to: " + destinationFile1.toAbsolutePath());
    } catch (IOException e) {
      System.err.println("Failed to copy screenshot1: " + e.getMessage());
      e.printStackTrace();
    }
  }

}
