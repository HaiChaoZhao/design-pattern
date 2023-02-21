package com.haichao.day6.Command.Fan;

import com.haichao.day6.Command.Command;

public class CeillingFanOnCommand implements Command {

  CeillingFan ceillingFan;

  public CeillingFanOnCommand(CeillingFan ceillingFan){
    this.ceillingFan = ceillingFan;
  }

  @Override
  public void execute() {
    this.ceillingFan.on();
  }
}
