package com.example.selenium;

import static com.example.selenium.constant.Urls.BAD_SSL;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AcceptInsecureSSL {

  public static void main(String[] args) throws InterruptedException {

    ChromeOptions options = new ChromeOptions();
    options.setAcceptInsecureCerts(true);
    //add extension to the Chrome session that run tests
    // you have to download plugin crx file and put path in the file
    options.addExtensions(new File("chrome-driver/chrome-extensions/SelectorsHub-Chrome.crx"));

    WebDriver driver = createChromeDriver(options);
    driver.get(BAD_SSL);
    driver.manage().window().maximize();

    System.out.println(driver.getTitle());


    Thread.sleep(7000);
    driver.quit();
  }

}
