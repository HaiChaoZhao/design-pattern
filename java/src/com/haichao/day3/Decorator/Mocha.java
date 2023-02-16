package com.haichao.day3.Decorator;

public class Mocha extends CondimentDecorator{
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double coast() {
    return beverage.coast() + .5;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}
