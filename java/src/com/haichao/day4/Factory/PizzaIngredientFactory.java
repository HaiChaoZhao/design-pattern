package com.haichao.day4.Factory;

import com.haichao.day4.Factory.Ingredient.Cheese.Cheese;
import com.haichao.day4.Factory.Ingredient.Clams.Clams;
import com.haichao.day4.Factory.Ingredient.Dough.Dough;
import com.haichao.day4.Factory.Ingredient.Pepperoni.Pepperoni;
import com.haichao.day4.Factory.Ingredient.Sauce.Sauce;
import com.haichao.day4.Factory.Ingredient.Veggies.Veggies;

public interface PizzaIngredientFactory {
  public Dough createDough();
  public Sauce createSauce();
  public Cheese createCheese();
  public Veggies[] createVeggies();
  public Pepperoni createPepperoni();
  public Clams createClam();
}
