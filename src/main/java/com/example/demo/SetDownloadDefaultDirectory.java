package com.example.demo;

import static com.example.demo.constant.Urls.SELENIUM;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetDownloadDefaultDirectory {

  public static void main(String[] args) {
    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("download.default_directory", "resources/downloads");
    options.setExperimentalOption("prefs", prefs);

    WebDriver driver = createChromeDriver();
    driver.get(SELENIUM);
    driver.manage().window().maximize();

    driver.findElement(By.xpath("//a[normalize-space()='4.33.0']")).click();
  }


}
