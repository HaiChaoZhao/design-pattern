package com.haichao.day1.StrategyPattern;

public abstract class Duck {
    FlyBehavior flayBehavior;
    QuackBehavior quackBehavior;

    public void performFly(){
        flayBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public void setFlayBehavior(FlyBehavior flayBehavior){
        this.flayBehavior = flayBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

     public abstract void display();
}
