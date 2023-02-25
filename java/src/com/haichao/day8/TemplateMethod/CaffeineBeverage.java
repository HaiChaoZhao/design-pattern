package com.haichao.day8.TemplateMethod;

public abstract class CaffeineBeverage {

  public final void prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  abstract void addCondiments();

  abstract void brew();

  void boilWater(){

  }

  void pourInCup(){

  }
}
