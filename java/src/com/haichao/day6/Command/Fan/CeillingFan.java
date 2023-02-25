package com.haichao.day6.Command.Fan;

public class CeillingFan {

  public static final int HIGH = 3;
  public static final int MEDIUM = 2;

  public static final int LOW = 1;

  public static final int OFF = 0;

  String loation;
  int speed;

  public CeillingFan(String loation){
    this.loation = loation;
    speed = OFF;
  }

  public void on(){
    System.out.println("ceilling fan open");
  }

  public void off(){
    System.out.println("ceilling fan off");
  }

  public void high(){
    speed = HIGH;
  }

  public void medium(){
    speed = MEDIUM;
  }

  public void low(){
    speed = LOW;
  }

  public int getSpeed() {
    return speed;
  }
}
