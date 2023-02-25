package com.haichao.day6.Command.GarageDoor;

import com.haichao.day6.Command.Command;

public class GarageDoorOpenCommand implements Command {
  public GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor){
    this.garageDoor = garageDoor;
  }
  @Override
  public void execute() {
    this.garageDoor.up();
  }

  @Override
  public void undo() {
    garageDoor.down();
  }
}
