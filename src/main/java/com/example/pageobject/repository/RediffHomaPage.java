package com.example.pageobject.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomaPage {

  WebDriver driver;
      By logo = By.xpath("(//div[@class='logo'])[1]");
      By signIn = By.xpath("(//div[@class='logo'])[1]");

  public RediffHomaPage(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement logo() {
    return driver.findElement(logo);
  }

  public WebElement signIn() {
    return driver.findElement(signIn);
  }

  public void username() {

  }

}

