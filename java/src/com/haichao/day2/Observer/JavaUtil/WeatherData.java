package com.haichao.day2.Observer.JavaUtil;

import java.util.Observable;

public class WeatherData extends Observable {
  public void dataChanged(){
    this.setChanged();
    this.notifyObservers();
  }
}
