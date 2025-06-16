package com.example.selenium;

import static com.example.selenium.constant.Urls.PICT;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {

  public static void main(String[] args) throws IOException {
    WebDriver driver = createChromeDriver();
    driver.get(PICT);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

    List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'.')]"));

    for (var l : links) {
      String url = l.getDomAttribute("href");
      HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
      con.setRequestMethod("HEAD");
      con.connect();

      int respCode = con.getResponseCode();
      if (respCode >= 400) {
        System.out.println("Link Text: " + l.getText() + " Response code: " + respCode);
      }

    }
    driver.quit();

  }

}
