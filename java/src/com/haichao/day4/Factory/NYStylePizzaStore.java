package com.haichao.day4.Factory;

public class NYStylePizzaStore extends PizzaStore{
  public NYStylePizzaStore(NYStylePizzaFactory pizzaFactory) {
    super(pizzaFactory);
  }

  @Override
  public Pizza createPizza(String type) {

    return null;
  }
}
