package com.haichao.day4.Factory.Pizza;

import com.haichao.day4.Factory.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
  public PizzaIngredientFactory pizzaIngredientFactory;

  public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory){
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    pepperoni = pizzaIngredientFactory.createPepperoni();
  }
}
