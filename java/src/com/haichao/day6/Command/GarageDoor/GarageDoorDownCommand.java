package com.haichao.day6.Command.GarageDoor;

import com.haichao.day6.Command.Command;

public class GarageDoorDownCommand implements Command {

  public GarageDoor garageDoor;

  public GarageDoorDownCommand(GarageDoor garageDoor){
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    this.garageDoor.down();
  }

  @Override
  public void undo() {
    garageDoor.up();
  }
}
