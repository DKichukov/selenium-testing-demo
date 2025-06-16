package com.example.pageobject.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomaPage {

  WebDriver driver;
//      By logo = By.xpath("(//div[@class='logo'])[1]");
//      By signIn = By.xpath("(//div[@class='logo'])[1]");

  @FindBy(xpath = "(//div[@class='logo'])[1]")
  WebElement logo;

  @FindBy(xpath = "(//div[@class='logo'])[1]")
  WebElement signIn;

  public RediffHomaPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver,this);
  }

  public WebElement logo() {
//    return driver.findElement(logo);
    return logo;
  }

  public WebElement signIn() {
//    return driver.findElement(signIn);
    return signIn;
  }

  public void username() {

  }

}

