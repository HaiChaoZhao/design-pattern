package com.haichao.day3.Decorator;

public class DarkRoast extends  Beverage{

  DarkRoast() {
    description = "DarkRoast";
  }

  @Override
  public double coast() {
    return 1.5;
  }
}
