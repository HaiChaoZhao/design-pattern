package com.haichao.day10.StatePattern;

public class WinnerState implements State{

  GumballMachineV1 gumballMachineV1;

  public WinnerState(GumballMachineV1 gumballMachineV1){
    this.gumballMachineV1 = gumballMachineV1;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you a gumball");

  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank");

  }

  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball");

  }

  @Override
  public void dispense() {
    System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
    gumballMachineV1.releaseBall();
    if(gumballMachineV1.getCount() == 0){
      gumballMachineV1.setState(gumballMachineV1.getSoldOutState());
    }else {
      gumballMachineV1.releaseBall();
      if(gumballMachineV1.getCount() > 0){
        gumballMachineV1.setState(gumballMachineV1.noQuarterState);
      }else {
        System.out.println("Oops, out of gumballs");
        gumballMachineV1.setState(gumballMachineV1.getSoldOutState());
      }
    }
  }
}
