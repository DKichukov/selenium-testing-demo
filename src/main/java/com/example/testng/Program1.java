package com.example.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program1 {

  @BeforeClass
  public void before() {
    System.out.println("Before class ...");
  }

  @AfterClass
  public void after() {
    System.out.println("After class...");
  }

  @Test
  public void testcase1() {
    System.out.println("In test case 1");
  }

  @Test
  public void testcase2() {
    System.out.println("In test case 2");
  }

  @Parameters({"url", "key"})
  @Test
  public void useParameterTest(String url, String key) {
    System.out.println("In test you can seen parameter: " + url + "/" + key);

  }


//  @Test(dataProvider = "getData")  // use it if method has no name
  @Test(dataProvider = "myData")
  public void useDataProviderTest(String user, String password) {
    System.out.println("In test you can seen data provider usage: "+ user+":"+password);

  }

  @DataProvider(name = "myData")
  public Object[][] getData() {

    Object[][] data = new Object[3][2];

    data[0][0] = "user1";
    data[0][1] = "password1";
    data[1][0] = "user2";
    data[1][1] = "password2";
    data[2][0] = "user3";
    data[2][1] = "password3";

    return data;

  }

}
