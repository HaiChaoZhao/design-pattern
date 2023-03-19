package com.haichao.day10.StatePattern;

public class SoldOutState implements State{

  private transient final GumballMachineV1 gumballMachine;

  public SoldOutState(GumballMachineV1 gumballMachineV1){
    this.gumballMachine = gumballMachineV1;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert a quarter, the machine is sold out");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can't eject, you haven't inserted a quarter yet");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned, but no gumballs");
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispense");
  }
}
