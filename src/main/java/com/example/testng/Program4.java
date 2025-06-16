package com.example.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Program4 {

  @BeforeSuite
  public void before() {
    System.out.println("Before suite ...");
  }

  @AfterSuite
  public void after() {
    System.out.println("After suite ...");
  }

  @Test
  public void testcase1() {
    System.out.println("In test case 7");
  }

  @Test
  public void testcase2() {
    System.out.println("In test case 8");
  }

}
