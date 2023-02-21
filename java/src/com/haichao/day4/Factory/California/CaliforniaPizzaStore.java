package com.haichao.day4.Factory.California;

import com.haichao.day4.Factory.Pizza.Pizza;
import com.haichao.day4.Factory.PizzaStore;

public class CaliforniaPizzaStore extends PizzaStore {
  public CaliforniaPizzaStore(CaliforniaPizzaFactory californiaPizzaFactory) {
    super(californiaPizzaFactory);
  }

  @Override
  public Pizza createPizza(String type) {
    return null;
  }
}
