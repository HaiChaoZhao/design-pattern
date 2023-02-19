package com.haichao.day4.Factory;

import com.haichao.day4.Factory.Pizza.Pizza;

public interface PizzaFactory {
  public Pizza createPizza(String type);
}
