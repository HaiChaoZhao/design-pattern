package com.haichao.day1.StrategyPattern;

public class MuteQuack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
