package com.haichao.day8.TemplateMethod;

public abstract class CaffeineBeverageWithHook {
  public void  prepareRecipe(){
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments()){
      addCondiments();
    }
  }

  abstract void addCondiments();

  public void boilWater(){

  }

  public abstract void brew();
  public void pourInCup(){}

  boolean customerWantsCondiments(){
    return  true;
  }
}
