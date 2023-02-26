package com.haichao.day9.CollectionAndIterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements AddMenu,Menu {
  ArrayList menuItems;

  public PancakeHouseMenu(){
    menuItems = new ArrayList();

  }

  public ArrayList getMenuItems() {
    return menuItems;
  }

  @Override
  public void addMenu(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }

  public PancakeHouseMenuIterator createIterator(){
    return new PancakeHouseMenuIterator(this.menuItems);
  }
}
