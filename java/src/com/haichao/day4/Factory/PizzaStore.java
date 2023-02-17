package com.haichao.day4.Factory;

public abstract class PizzaStore {
  PizzaFactory pizzaFactory;

  public PizzaStore(PizzaFactory pizzaFactory ){
    this.pizzaFactory = pizzaFactory;
  }

  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  public abstract Pizza createPizza(String type);
}
