package com.haichao.day7.AdaptorAndFacade.facade;

public class HomeTheaterFacade {

  Amplifier amplifier;
  Tunner tunner;
  DvdPlayer dvdPlayer;
  CdPlayer cdPlayer;
  Projector projector;
  TheaterLights theaterLights;
  Screen screen;
  PopcornPopper popcornPopper;


  public HomeTheaterFacade(
      Amplifier amplifier,
      Tunner tunner,
      DvdPlayer dvdPlayer,
      CdPlayer cdPlayer,
      Projector projector,
      TheaterLights theaterLights,
      Screen screen,
      PopcornPopper popcornPopper
  ){
    this.amplifier = amplifier;
    this.cdPlayer = cdPlayer;
    this.tunner = tunner;
    this.dvdPlayer = dvdPlayer;
    this.projector = projector;
    this.theaterLights = theaterLights;
    this.screen = screen;
    this.popcornPopper = popcornPopper;
  }

  public void watchMovie(String movie){
    System.out.println("Get ready to watch movie");
    popcornPopper.on();
    popcornPopper.pop();
    theaterLights.dim();
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amplifier.on();
    amplifier.setDvd();
    amplifier.setSurroundSound();
    amplifier.setVolume();
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }

  public void endMovie(){
    System.out.println("Shutting movie theater down...");
    popcornPopper.off();
    theaterLights.on();
    screen.up();
    projector.off();
    amplifier.off();
    dvdPlayer.stop();
    dvdPlayer.eject();
    dvdPlayer.off();
  }

  public void listenToCd(){

  }

  public void endCd(){

  }

  public void listenToRadio(){

  }

  public void endRadio(){

  }
}
