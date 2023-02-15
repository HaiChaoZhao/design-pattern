package com.haichao.day1.StrategyPattern;

public class FlyWithWings implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("i'm flying!");
  }
}
