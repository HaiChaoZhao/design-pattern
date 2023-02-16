package com.haichao.day3.Decorator;

public class Espresso extends  Beverage{

  public  Espresso() {
    description= "Espresso";
  }
  @Override
  public double coast() {
    return 1.99;
  }
}
