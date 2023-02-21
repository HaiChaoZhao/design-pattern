package com.haichao.day4.Factory.NYStyle;

import com.haichao.day4.Factory.Ingredient.Cheese.Cheese;
import com.haichao.day4.Factory.Ingredient.Cheese.ReggianoCheese;
import com.haichao.day4.Factory.Ingredient.Clams.Clams;
import com.haichao.day4.Factory.Ingredient.Clams.FreshClams;
import com.haichao.day4.Factory.Ingredient.Dough.Dough;
import com.haichao.day4.Factory.Ingredient.Dough.ThinCrustDough;
import com.haichao.day4.Factory.Ingredient.Pepperoni.Pepperoni;
import com.haichao.day4.Factory.Ingredient.Pepperoni.SlicedPepperoni;
import com.haichao.day4.Factory.Ingredient.Sauce.MarinaraSauce;
import com.haichao.day4.Factory.Ingredient.Sauce.Sauce;
import com.haichao.day4.Factory.Ingredient.Veggies.Garlic;
import com.haichao.day4.Factory.Ingredient.Veggies.Mushroom;
import com.haichao.day4.Factory.Ingredient.Veggies.RedPepper;
import com.haichao.day4.Factory.Ingredient.Veggies.Veggies;
import com.haichao.day4.Factory.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies[] veggies = {new Garlic(), new Mushroom(), new RedPepper()};
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FreshClams();
  }
}
