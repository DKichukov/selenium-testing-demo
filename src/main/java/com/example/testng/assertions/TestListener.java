package com.example.testng.assertions;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

  @Override
  public void onTestStart(ITestResult result) {
    ITestListener.super.onTestStart(result);
    System.out.println("Test start...");
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    ITestListener.super.onTestSuccess(result);
    System.out.println("Test succeed...");
  }

  @Override
  public void onTestFailure(ITestResult result) {
    ITestListener.super.onTestFailure(result);
    System.out.println("Test failed...");
  }

  @Override
  public void onTestSkipped(ITestResult result) {
    ITestListener.super.onTestSkipped(result);
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
  }

  @Override
  public void onTestFailedWithTimeout(ITestResult result) {
    ITestListener.super.onTestFailedWithTimeout(result);
  }

  @Override
  public void onStart(ITestContext context) {
    ITestListener.super.onStart(context);
  }

  @Override
  public void onFinish(ITestContext context) {
    ITestListener.super.onFinish(context);
  }

}
