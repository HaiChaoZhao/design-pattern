package com.haichao.day6.Command;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;

  public RemoteControl(){
    offCommands = new Command[7];
    onCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i]=noCommand;
      offCommands[i] = noCommand;
    }
  }

  public void setCommands(int slotIndex, Command onCommand, Command offCommand){
    onCommands[slotIndex] = onCommand;
    offCommands[slotIndex] = offCommand;
  }

  public void onBtnWasPressed(int slotIndex){
    onCommands[slotIndex].execute();
  }
  public void offBtnWasPressed(int slotIndex){
    offCommands[slotIndex].execute();
  }

  @Override
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("\n------ Remote Control ------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()+ "      "+ offCommands[i].getClass().getName() + "\n");

    }
    return  stringBuffer.toString();
  }
}
