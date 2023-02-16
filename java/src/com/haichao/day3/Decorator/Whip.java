package com.haichao.day3.Decorator;

public class Whip extends CondimentDecorator{
  Beverage beverage;
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }
  @Override
  public double coast() {
    return beverage.coast() + .9;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
