package com.example.selenium;

import static com.example.selenium.constant.Urls.AMAZON_DE;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetProxy {

  public static void main(String[] args) {
    ChromeOptions options = new ChromeOptions();
    //create proxy
    Proxy p =new Proxy();
    p.setHttpProxy("1.1.1.1");
    options.setCapability("proxy", p);

    WebDriver driver = createChromeDriver();
    driver.get(AMAZON_DE);
    driver.manage().window().maximize();


  }
}
