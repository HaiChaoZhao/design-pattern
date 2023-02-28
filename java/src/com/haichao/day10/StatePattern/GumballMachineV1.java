package com.haichao.day10.StatePattern;

public class GumballMachineV1 {
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;

  State winnerState;
  private State state = soldOutState;
  private int count = 0;

  public GumballMachineV1(int numberGumballs){
    soldState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    soldState = new SoldState(this);
    hasQuarterState = new HasQuarterState(this);
    winnerState = new WinnerState(this);

    this.count = numberGumballs;
    if(numberGumballs > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter(){
    state.insertQuarter();
  }

  public void ejectQuarter(){
    state.ejectQuarter();
  }

  public void turnCrank(){
    state.turnCrank();
    state.dispense();
  }

  public void setState(State state){
    this.state = state;
  }

  void releaseBall(){
    System.out.println("A gumball comes rolling out the slot");

  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public int getCount() {
    return count;
  }
}
