package com.haichao.day7.AdaptorAndFacade.facade;

public class Projector implements Switcher{

  DvdPlayer dvdPlayer;

  public Projector (DvdPlayer dvdPlayer){
    this.dvdPlayer = dvdPlayer;
  }

  @Override
  public void on() {

  }

  @Override
  public void off() {

  }

  public void tvMode(){

  }

  public void wideScreenMode(){

  }

  @Override
  public String toString() {
    return super.toString();
  }
}
