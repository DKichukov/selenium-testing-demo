package com.example.selenium;

import static com.example.selenium.util.WebDriverManager.createChromeDriver;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class AuthenticationPopupForLogin {

  public static void main(String[] args) {
    WebDriver driver = createChromeDriver();
//    driver.get(BASIC_AUTH);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    String username = "abc";
    String password = "123";
    String url = "https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth";

    driver.get(url);

    //how to login
    //    https://abc:123@the-internet.herokuapp.com/basic_auth
  }

}
