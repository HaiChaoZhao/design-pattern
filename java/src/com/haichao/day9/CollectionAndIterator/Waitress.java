package com.haichao.day9.CollectionAndIterator;

public class Waitress {
  PancakeHouseMenu pancakeHouseMenu;
  DinerMenu dinerMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
    this.dinerMenu = dinerMenu;
    this.pancakeHouseMenu = pancakeHouseMenu;
  }

  public void printMenu(){
    java.util.Iterator pancakeHouseMenuIterator = this.pancakeHouseMenu.createIterator();
    java.util.Iterator dinerMenuIterator = this.dinerMenu.createIterator();
    printMenu(pancakeHouseMenuIterator);
    printMenu(dinerMenuIterator);
  }

  private void printMenu(java.util.Iterator iterator){
    while (iterator.hasNext()){
      MenuItem menuItem = (MenuItem) iterator.next();
      System.out.println(menuItem);
    }
  }
}
