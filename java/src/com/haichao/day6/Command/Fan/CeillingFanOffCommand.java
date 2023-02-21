package com.haichao.day6.Command.Fan;

import com.haichao.day6.Command.Command;

public class CeillingFanOffCommand implements Command {

  CeillingFan ceillingFan;

  public CeillingFanOffCommand(CeillingFan ceillingFan){
    this.ceillingFan = ceillingFan;
  }

  @Override
  public void execute() {
    this.ceillingFan.off();
  }
}
