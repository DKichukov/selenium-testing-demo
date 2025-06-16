package com.example.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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

}
