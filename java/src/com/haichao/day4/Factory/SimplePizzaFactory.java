package com.haichao.day4.Factory;

import com.haichao.day4.Factory.Pizza.*;

public class SimplePizzaFactory implements PizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory = null;
    if(type.equals("cheese")){
      pizza = new CheesePizza(pizzaIngredientFactory);
    }else if(type.equals("pepperoni")){
      pizza = new PepperoniPizza(pizzaIngredientFactory);
    }else if(type.equals(("clam"))) {
      pizza = new ClamPizza(pizzaIngredientFactory);
    }else if(type.equals("veggie")){
      pizza = new VeggiePizza(pizzaIngredientFactory);
    }

    return pizza;
  }
}
