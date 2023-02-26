package com.haichao.day9.CollectionAndIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
  ArrayList menuItems;
  int position;
  public PancakeHouseMenuIterator(ArrayList menuItems){
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext() {
    if(position >= menuItems.size()){
      return  false;
    }else {
      return true;
    }
  }

  @Override
  public Object next() {
    MenuItem menuItem = (MenuItem) menuItems.get(position);
    position += 1;
    return menuItem;
  }
}
