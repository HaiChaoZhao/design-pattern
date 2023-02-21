package com.haichao.day4.Factory.Chicago;

import com.haichao.day4.Factory.NYStyle.NYPizzaIngredientFactory;
import com.haichao.day4.Factory.Pizza.*;
import com.haichao.day4.Factory.PizzaIngredientFactory;
import com.haichao.day4.Factory.PizzaStore;

public class ChichagoPizzaStore extends PizzaStore {
  public ChichagoPizzaStore() {
    super(new ChicagoPizzaFactory());
  }

  @Override
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();
    if(type.equals("cheese")){
      pizza = new CheesePizza(ingredientFactory);
      pizza.setName("Chicago Style Chesse Pizza");
    }else if(type.equals("veggie")){
      pizza = new VeggiePizza(ingredientFactory);
      pizza.setName("Chicago Style Veggie Pizza");
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(ingredientFactory);
      pizza.setName("Chicago Style Clam Pizza");
    } else if (type.equals("pepperoni")) {
      pizza = new PepperoniPizza(ingredientFactory);
      pizza.setName("Chicago Style Pepperoni Pizza");
    }
    return pizza;
  }
}
