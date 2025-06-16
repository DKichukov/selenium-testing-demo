package com.example.selenium;

import static com.example.selenium.constant.Urls.SCROLL;
import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchInWebTable {

  public static void main(String[] args) {
    WebDriver driver = createChromeDriver();
    driver.get(SCROLL);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    JavascriptExecutor je = (JavascriptExecutor) driver;

    int scrollCount = 50;
    int count = 0;

    List<WebElement> webElements = driver.findElements(
        By.cssSelector(".table.table-bordered.table-striped.mb-0 td:nth-child(2)"));

    System.out.println(webElements.size());

    for (var l : webElements) {
      if (l.isDisplayed()) {
        if (l.getText().equals("Mark")) {
          count++;
        }

        System.out.println(l);
      } else {
        String scroll =
            "document.querySelector('.table-wrapper-scroll-y.my-custom-scrollbar').scrollTop="
                + scrollCount;
        je.executeScript(scroll);
        if (l.getText().equals("Mark")) {
          count++;
        }
        scrollCount += 50;
      }
    }
    System.out.println("The number of time Mark has appeared :" + count);
    driver.quit();

  }

}
