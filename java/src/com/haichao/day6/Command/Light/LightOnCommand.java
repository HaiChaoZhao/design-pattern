package com.haichao.day6.Command.Light;

import com.haichao.day6.Command.Command;

public class LightOnCommand implements Command {
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }
  @Override
  public void execute() {
    light.on();
  }
}
