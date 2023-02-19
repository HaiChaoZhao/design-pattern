package com.haichao.day4.Factory.NYStyle;

import com.haichao.day4.Factory.Pizza.*;
import com.haichao.day4.Factory.PizzaIngredientFactory;
import com.haichao.day4.Factory.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {
  public NYStylePizzaStore() {
    super(new NYStylePizzaFactory());
  }

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    if(type.equals("cheese")){
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("New York Style Chesse Pizza");
    }else if(type.equals("veggie")){
      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("New York Style Veggie Pizza");
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("New York Style Clam Pizza");
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("New York Style Pepperoni Pizza");
    }
    return pizza;
  }
}
