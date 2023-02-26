package com.haichao.day9.CollectionAndIterator.combination;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
  ArrayList<MenuComponent> menuComponents = new ArrayList();
  String name;
  String description;

  public Menu(String name,String description){
    this.name = name;
    this.description = description;
  }

  public void add(MenuComponent menuComponent){
    menuComponents.add(menuComponent);
  }

  public void remove(MenuComponent menuComponent){
    menuComponents.remove(menuComponent);
  }

  public MenuComponent getChild(int i){
    return menuComponents.get(i);
  }

  public String getName(){
    return this.name;
  }

  public String getDescription(){
    return this.description;
  }

  public void print(){
    System.out.println("  " + getName());
    System.out.println(", " + getDescription());
    System.out.println("----------------------");
    Iterator iterator = menuComponents.iterator();
    while (iterator.hasNext()){
      MenuComponent menuComponent = (MenuComponent) iterator.next();
      menuComponent.print();
    }
  }
}
