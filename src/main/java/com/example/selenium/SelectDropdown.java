package com.example.selenium;

import static com.example.selenium.constant.Urls.W3SCHOOLS_DROPDOWN;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

  public static void main(String[] args) {
    WebDriver driver = createChromeDriver();
    driver.get(W3SCHOOLS_DROPDOWN);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.switchTo().frame("iframeResult");

    WebElement we = driver.findElement(By.xpath("//select[@id='cars']"));

    Select dropdown = new Select(we);
    dropdown.selectByIndex(2);


  }

}
