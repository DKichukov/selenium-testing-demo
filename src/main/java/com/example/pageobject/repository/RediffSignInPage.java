package com.example.pageobject.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffSignInPage {

  WebDriver driver;
  By username = By.xpath("//input[@id='login1']");
  By password = By.xpath("//input[@id='password']");
  By signInButton = By.xpath("//button[@name='proceed']");

  public RediffSignInPage(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement username() {
    return driver.findElement(username);
  }

  public WebElement password() {
    return driver.findElement(password);
  }

  public WebElement signInButton() {
    return driver.findElement(signInButton);
  }

}
