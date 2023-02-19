package com.haichao.day4.Factory.Pizza;

import com.haichao.day4.Factory.Ingredient.Ingredient;
import com.haichao.day4.Factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
  PizzaIngredientFactory pizzaIngredientFactory;

  public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void prepare() {
    System.out.println("Preparing " + name);
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
  }

}
