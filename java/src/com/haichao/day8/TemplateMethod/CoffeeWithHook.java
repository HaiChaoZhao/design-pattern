package com.haichao.day8.TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class CoffeeWithHook  extends CaffeineBeverageWithHook{
  @Override
  void addCondiments() {

  }

  @Override
  public void brew() {

  }

  @Override
  boolean customerWantsCondiments() {
    String answer = getUserInput();
    if(answer.toLowerCase().startsWith("y")){
      return  true;
    }else {
      return  false;
    }
  }

  private String getUserInput(){
    String answer = null;

    System.out.println("would you lije milk and sugar with your coffee (y/n)");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try{
      answer = in.readLine();
    }catch (IOException ioException){
      System.err.println("IO error trying to read your answer");
    }

    if(answer == null){
      return  "no";
    }
    return  answer;
  }
}
