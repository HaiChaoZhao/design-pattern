package com.haichao.StrategyPattern;

public class ModelDuck extends Duck{
  ModelDuck(){
    flayBehavior = new FlyNoWay();
    quackBehavior = new Quack();

  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
