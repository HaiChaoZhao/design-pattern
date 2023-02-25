package com.haichao.day8.TemplateMethod;

public class Tea extends CaffeineBeverage{
  @Override
  void boilWater() {
    System.out.println("烧80摄氏度的水");
  }

  @Override
  void addCondiments() {
    System.out.println("Steeping the tea");
  }

  @Override
  void brew() {
    System.out.println("Adding Lemon");
  }
}
