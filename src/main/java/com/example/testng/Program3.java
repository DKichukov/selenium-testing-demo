package com.example.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program3 {

  @BeforeTest
  public void before() {
    System.out.println("Before test ...");
  }

  @AfterTest
  public void after() {
    System.out.println("After test ...");
  }

  @Test
  public void testcase1() {
    System.out.println("In test case 5");
  }

  @Test
  public void testcase2() {
    System.out.println("In test case 6");
  }

}
