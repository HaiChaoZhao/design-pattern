package com.haichao.day9.CollectionAndIterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
  Hashtable menuItems = new Hashtable();

  @Override
  public Iterator<MenuItem> createIterator() {
    return menuItems.values().iterator();
  }
}
