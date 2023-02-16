package com.haichao.day3.Decorator;

public class Soy extends CondimentDecorator{

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public double coast() {
    return beverage.coast() + .3;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}
