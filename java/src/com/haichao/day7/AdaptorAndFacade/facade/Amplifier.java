package com.haichao.day7.AdaptorAndFacade.facade;

public class Amplifier implements Switcher {
  Tunner tunner;
  DvdPlayer dvdPlayer;
  CdPlayer cdPlayer;

  @Override
  public void on() {

  }

  @Override
  public void off() {

  }

  public void setCd(){

  }

  public void setDvd() {

  }

  public void setStereoSound(){

  }

  public void setSurroundSound(){

  }

  public void setTunner(){

  }

  public void setVolume(){

  }

  @Override
  public String toString() {
    return super.toString();
  }
}
