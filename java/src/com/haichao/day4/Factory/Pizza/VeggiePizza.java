package com.haichao.day4.Factory.Pizza;

import com.haichao.day4.Factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
  private PizzaIngredientFactory pizzaIngredientFactory;

  public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }
  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    veggies = pizzaIngredientFactory.createVeggies();
  }
}
