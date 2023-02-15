package com.haichao.day2.Observer.JavaUtil;

import java.util.Observable;
import java.util.Observer;

public class ThirdDisplay implements Observer {

  private Observable weatherData;

  public ThirdDisplay(Observable observable){
    this.weatherData = observable;
  }

  @Override
  public void update(Observable o, Object arg) {
    
  }
}
