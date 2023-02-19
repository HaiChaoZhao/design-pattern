package com.haichao.day4.Factory;

import com.haichao.day4.Factory.Pizza.Pizza;

public abstract class PizzaStore {
  protected PizzaFactory pizzaFactory;

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

  protected abstract Pizza createPizza(String type);
}
