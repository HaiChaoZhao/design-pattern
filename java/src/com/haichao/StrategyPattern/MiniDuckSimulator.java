package com.haichao.StrategyPattern;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
    mallard.setFlayBehavior(new FlyRocketPowered());
    mallard.performFly();
    Duck model = new ModelDuck();
    model.performFly();
    model.performQuack();
    model.setFlayBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
