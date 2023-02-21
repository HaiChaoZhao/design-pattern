package com.haichao.day4.Factory.Chicago;

import com.haichao.day4.Factory.Pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza(){
//    name = "Chicago Style Deep Dish Cheese Pizza";
//    dough = "Extra thick Crust Dough";
//    toppings.add("Shredded Mozzarella Cheese");

  }

  @Override
  public void prepare() {

  }

  @Override
  public void cut() {
    System.out.println("Cutting the Pizza into square slices");
  }
}
