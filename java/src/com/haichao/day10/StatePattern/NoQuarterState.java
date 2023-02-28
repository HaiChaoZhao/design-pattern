package com.haichao.day10.StatePattern;

public class NoQuarterState implements State{

  private final GumballMachineV1 gumballMachine;

  public NoQuarterState(GumballMachineV1 gumballMachineV1){
    this.gumballMachine = gumballMachineV1;
  }

  @Override
  public void insertQuarter() {

  }

  @Override
  public void ejectQuarter() {

  }

  @Override
  public void turnCrank() {

  }

  @Override
  public void dispense() {

  }
}
