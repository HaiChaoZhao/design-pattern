package com.haichao.day6.Command;

public class RemoteControl {
  Command[] onCommands;
  Command[] offCommands;

  Command undoCommand;

  public RemoteControl(){
    offCommands = new Command[7];
    onCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i]=noCommand;
      offCommands[i] = noCommand;
    }

    undoCommand = noCommand;
  }

  public void setCommands(int slotIndex, Command onCommand, Command offCommand){
    onCommands[slotIndex] = onCommand;
    offCommands[slotIndex] = offCommand;
  }

  public void onBtnWasPressed(int slotIndex){
    onCommands[slotIndex].execute();
    undoCommand = onCommands[slotIndex];
  }
  public void offBtnWasPressed(int slotIndex){
    offCommands[slotIndex].execute();
    undoCommand = offCommands[slotIndex];
  }

  public void undoButtonWasPressed(){
    undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuilder stringBuffer = new StringBuilder();
    stringBuffer.append("\n------ Remote Control ------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuffer.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("      ").append(offCommands[i].getClass().getName()).append("\n");

    }
    return  stringBuffer.toString();
  }
}
