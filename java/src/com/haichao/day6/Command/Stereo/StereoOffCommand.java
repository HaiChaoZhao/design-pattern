package com.haichao.day6.Command.Stereo;

import com.haichao.day6.Command.Command;

public class StereoOffCommand implements Command {
  private Stereo stereo;
  public StereoOffCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void undo() {
    stereo.on();
  }

  @Override
  public void execute() {
    this.stereo.off();
  }
}
