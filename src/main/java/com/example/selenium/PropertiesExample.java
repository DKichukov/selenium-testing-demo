package com.example.selenium;

import static com.example.selenium.constant.Urls.ESKY_BG;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class PropertiesExample {

  public static void main(String[] args) {

    FileInputStream fis = null;
    String proFilePath = "src/main/resources/data.properties";

    try {
      fis = new FileInputStream(proFilePath);
      Properties prop = new Properties();
      prop.load(fis);

      String myBrowser = prop.getProperty("browser");
      System.out.println(myBrowser);

      if (myBrowser.equals("chrome")){
        WebDriver driver = createChromeDriver();
        driver.get(ESKY_BG);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      }else if(myBrowser.equals("firefox")){
        System.out.println("firefox browser is use .... logic body");
      }

    }  catch (IOException e) {
      throw new RuntimeException(e.getMessage());
    }

    WebDriver driver = createChromeDriver();
    driver.get(ESKY_BG);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


  }

}
