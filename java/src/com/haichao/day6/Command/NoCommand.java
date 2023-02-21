package com.haichao.day6.Command;

public class NoCommand implements Command {
  @Override
  public void execute() {
    System.out.println("No Command;");
  }
}
