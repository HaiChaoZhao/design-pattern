package com.haichao.day6.Command;

public class SimpleRemoteControl {
  Command slot;

  public SimpleRemoteControl(){

  }

  public void setCommand(Command command) {
    this.slot = command;
  }

  public void btnWasPressed(){
    this.slot.execute();
  }
}
