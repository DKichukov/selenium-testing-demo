package com.example.demo;

import static com.example.demo.constant.Urls.JQUERYUI;
import static com.example.demo.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragDrop {

  public static void main(String[] args) {

    WebDriver driver = createChromeDriver();
    driver.get(JQUERYUI);
    Actions act = new Actions(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    WebElement w = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
    driver.switchTo().frame(w);

    act.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),
            driver.findElement(By.xpath("//div[@id='droppable']"))).build()
        .perform();

  }

}
