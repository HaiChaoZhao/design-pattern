package com.haichao.day6.Command.Stereo;

import com.haichao.day6.Command.Command;

public class StereoOnWithCDCommand implements Command {
  private Stereo stereo;
  public StereoOnWithCDCommand(Stereo stereo){
    this.stereo = stereo;
  }
  @Override
  public void execute() {
    this.stereo.on();
    this.stereo.setCd();
    this.stereo.setVolume(11);
  }
}
