package com.example.miniproject.project1;

import static com.example.selenium.constant.Urls.AMAZON_DE;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazon {

  WebDriver driver;

  @BeforeMethod
  public void setup() {
    driver = createChromeDriver();
    driver.get(AMAZON_DE);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void teardown() {
    driver.quit();
  }

  @Test
  public void verifyTitle() throws InterruptedException {
    String actualTittle = driver.getTitle();
    String expectedTittle = "Amazon.de";

    Assert.assertEquals(actualTittle, expectedTittle);
  }

  @Test
  public void verifyLogo(){
    boolean displayed = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).isDisplayed();

    Assert.assertTrue(displayed);
  }

}
