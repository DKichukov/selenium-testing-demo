package com.example.testng.assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Program1 {

  @Test

  public void test1() {

    //Assert.assertEquals(actual, expected);

    assertEquals("parag", "parag");


  }

  @Test

  public void test2() {

    assertEquals("parag", "comrevo", "Test to check title");

  }

  @Test

  public void test3() {

    assertEquals(true, true);

  }

  @Test

  public void test4() {

    assertEquals(true, false, "Test to check login credentials");

  }

  @Test

  public void test5() {

    assertTrue(true);

  }

  @Test

  public void test6() {

    assertTrue(false, "Test to check login credentials");

  }

  @Test

  public void test7() {

    assertFalse(false);

  }

  @Test

  public void test8() {

    assertFalse(true, "Test to check login credentials");

  }


}
