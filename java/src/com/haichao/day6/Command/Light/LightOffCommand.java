package com.haichao.day6.Command.Light;

import com.haichao.day6.Command.Command;

public class LightOffCommand implements Command {
  private Light light;
  public LightOffCommand(Light light){
    this.light = light;
  }
  @Override
  public void execute() {
    light.off();
  }
}
