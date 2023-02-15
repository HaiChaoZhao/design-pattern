package com.haichao.day1.StrategyPattern;

public class MallardDuck extends Duck{
  MallardDuck() {
    quackBehavior = new Quack();
    flayBehavior = new FlyWithWings();
  }

  public void display(){
    System.out.println("I'm a real Mallard duck");
  }

}
