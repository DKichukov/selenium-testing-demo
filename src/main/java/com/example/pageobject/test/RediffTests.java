package com.example.pageobject.test;

import static com.example.selenium.constant.Urls.REDIFF;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import com.example.pageobject.repository.RediffHomaPage;
import com.example.pageobject.repository.RediffSignInPage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RediffTests {

  WebDriver driver;
  RediffHomaPage homePage;
  RediffSignInPage signInPage;

  @BeforeMethod
  public void setup(){
    driver = createChromeDriver();
    driver.get(REDIFF);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    // Initialize page objects
    homePage = new RediffHomaPage(driver);
    signInPage = new RediffSignInPage(driver);
  }

  @AfterTest
  public void tearDown(){
    if (driver != null) {
      driver.quit();
    }
  }

  @Test
  public void verifyLogo() {
    RediffHomaPage homePage = new RediffHomaPage(driver);

    WebElement logo = homePage.logo();

    boolean isDisplayed = logo.isDisplayed();
    Assert.assertTrue(isDisplayed);
  }

  @Test
  public void testSignInWithInvalidCredentialsShouldFail(){

    homePage.signIn().click();
    signInPage.username().sendKeys("abc");
    signInPage.password().sendKeys("1234");
    signInPage.signInButton().click();

    //if login succeeded then will redirect to 4fmail.rediff.com
    boolean succeed= driver.getCurrentUrl().contains("4fmail.rediff.com");
    System.out.println(succeed);
    Assert.assertFalse(succeed);

  }

}
