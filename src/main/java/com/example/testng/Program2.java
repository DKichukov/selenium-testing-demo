package com.example.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Program2 {

  @BeforeMethod
  public void before() {
    System.out.println("Before method ...");
  }

  @AfterMethod
  public void after() {
    System.out.println("After method ...");
  }

  @Test
  public void testcase1() {
    System.out.println("In test case 3");
  }

  @Test
  public void testcase2() {
    System.out.println("In test case 4");
  }

}
