package com.haichao.day3.Decorator;

public abstract class Beverage {
  String description = "unkown beverage";

  public String getDescription(){
    return description;
  }

  public abstract double coast();
}
