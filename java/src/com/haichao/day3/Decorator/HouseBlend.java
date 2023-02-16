package com.haichao.day3.Decorator;

public class HouseBlend extends Beverage{

  HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double coast() {
    return .89;
  }
}
