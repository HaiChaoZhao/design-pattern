package com.haichao.day6.Command.Fan;

import com.haichao.day6.Command.Command;

public class CeillingFanHighCommand implements Command {

  CeillingFan ceillingFan;

  int prevSpeed;

  public CeillingFanHighCommand(CeillingFan ceillingFan){
    this.ceillingFan = ceillingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceillingFan.getSpeed();
    ceillingFan.high();
  }

  @Override
  public void undo() {
    if(prevSpeed == CeillingFan.HIGH){
      ceillingFan.high();
    } else if (prevSpeed == CeillingFan.MEDIUM) {
      ceillingFan.medium();
    } else if (prevSpeed == CeillingFan.LOW) {
      ceillingFan.low();
    } else if (prevSpeed == CeillingFan.OFF) {
      ceillingFan.off();
    }
  }
}
