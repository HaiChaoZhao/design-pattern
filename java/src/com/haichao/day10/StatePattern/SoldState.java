package com.haichao.day10.StatePattern;

public class SoldState implements State{

  private transient final GumballMachineV1 gumballMachine;

  public SoldState(GumballMachineV1 gumballMachineV1){
    this.gumballMachine = gumballMachineV1;
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
    gumballMachine.releaseBall();
    if(gumballMachine.getCount() > 0){
      gumballMachine.setState(gumballMachine.noQuarterState);
    }else {
      System.out.println("Oops, out of gumballs");
      gumballMachine.setState(gumballMachine.soldOutState);
    }
  }
}
