package com.haichao.day4.Factory.Chicago;

import com.haichao.day4.Factory.Ingredient.Cheese.Cheese;
import com.haichao.day4.Factory.Ingredient.Cheese.Mozzarella;
import com.haichao.day4.Factory.Ingredient.Clams.Clams;
import com.haichao.day4.Factory.Ingredient.Clams.FronzenClams;
import com.haichao.day4.Factory.Ingredient.Dough.Dough;
import com.haichao.day4.Factory.Ingredient.Dough.ThickCrustDough;
import com.haichao.day4.Factory.Ingredient.Pepperoni.Pepperoni;
import com.haichao.day4.Factory.Ingredient.Pepperoni.SlicedPepperoni;
import com.haichao.day4.Factory.Ingredient.Sauce.PlumTomatoSauce;
import com.haichao.day4.Factory.Ingredient.Sauce.Sauce;
import com.haichao.day4.Factory.Ingredient.Veggies.BlackOlives;
import com.haichao.day4.Factory.Ingredient.Veggies.Eggplant;
import com.haichao.day4.Factory.Ingredient.Veggies.Spinach;
import com.haichao.day4.Factory.Ingredient.Veggies.Veggies;
import com.haichao.day4.Factory.PizzaIngredientFactory;

public class ChicagoIngredientFactory implements PizzaIngredientFactory {

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new Mozzarella();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies[] veggies = {new Spinach(), new BlackOlives(), new Eggplant()};
    return new Veggies[0];
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FronzenClams();
  }
}
