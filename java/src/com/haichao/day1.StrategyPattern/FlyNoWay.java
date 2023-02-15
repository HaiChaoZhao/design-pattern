package com.haichao.day1.StrategyPattern;

public class FlyNoWay implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("i can't fly");
  }
}
