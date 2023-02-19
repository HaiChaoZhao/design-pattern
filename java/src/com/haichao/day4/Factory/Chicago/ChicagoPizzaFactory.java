package com.haichao.day4.Factory.Chicago;

import com.haichao.day4.Factory.Pizza.Pizza;
import com.haichao.day4.Factory.PizzaFactory;

public class ChicagoPizzaFactory implements PizzaFactory {
  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;

    if(type.equals("cheese")){
      return new ChicagoStyleCheesePizza();
    }

    return null;
  }
}
