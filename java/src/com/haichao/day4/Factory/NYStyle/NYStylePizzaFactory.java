package com.haichao.day4.Factory.NYStyle;

import com.haichao.day4.Factory.Pizza.Pizza;
import com.haichao.day4.Factory.PizzaFactory;

public class NYStylePizzaFactory implements PizzaFactory {
  @Override
  public Pizza createPizza(String type) {
    if(type.equals("cheese")){
      Pizza pizza = new NYStyleCheesePizza();
      return pizza;
    }

    return null;
  }
}
