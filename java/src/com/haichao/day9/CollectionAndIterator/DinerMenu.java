package com.haichao.day9.CollectionAndIterator;

public class DinerMenu implements AddMenu,Menu {
  static final int MAX_ITEMS= 6;

  int numberOfItems =0;

  MenuItem[] menuItems;

  public DinerMenu(){
    menuItems = new MenuItem[MAX_ITEMS];


  }

  @Override
  public void addMenu(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    if(numberOfItems >= MAX_ITEMS){
      System.out.println("Sorry, menu is full! Can't add item to menu");
    }else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems = numberOfItems +1;
    }
  }

  public MenuItem[] getMenuItems() {
    return menuItems;
  }

  public DinerMenuIterator createIterator(){
    return  new DinerMenuIterator(menuItems);
  }
}
