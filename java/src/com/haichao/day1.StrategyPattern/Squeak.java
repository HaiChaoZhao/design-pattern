package com.haichao.day1.StrategyPattern;

public class Squeak implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
