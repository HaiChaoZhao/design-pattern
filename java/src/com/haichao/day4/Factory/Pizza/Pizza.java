package com.haichao.day4.Factory.Pizza;

import com.haichao.day4.Factory.Ingredient.Cheese.Cheese;
import com.haichao.day4.Factory.Ingredient.Clams.Clams;
import com.haichao.day4.Factory.Ingredient.Dough.Dough;
import com.haichao.day4.Factory.Ingredient.Pepperoni.Pepperoni;
import com.haichao.day4.Factory.Ingredient.Sauce.Sauce;
import com.haichao.day4.Factory.Ingredient.Veggies.Veggies;

import java.util.ArrayList;

public abstract class Pizza {
  protected String  name;

  protected Dough dough;
  protected Sauce sauce;
  protected Veggies[] veggies;
  protected Cheese cheese;
  protected Pepperoni pepperoni;
  protected Clams clam;

  public  abstract void prepare();

  public void bake(){
    System.out.println("Bake for 25 minutes at 350");
  };

  public  void cut() {
    System.out.println("cutting the pizza into diagonal slices");
  };

  public  void box(){
    System.out.println("Place pizza in official PizzaStore box");
  };

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
