package com.haichao.day9.CollectionAndIterator.combination;

public class MenuTestDrive {
  public static void main(String[] args) {
    MenuComponent pancakaHouseMenu = new Menu("PANCAKA HOUSE MENU", "breakfast");
    MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
    MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
    MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

    MenuComponent allMenu = new Menu("ALL MENUS", "All menus combined");
    allMenu.add(pancakaHouseMenu);
    allMenu.add(dinerMenu);
    allMenu.add(cafeMenu);

    dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
    dinerMenu.add(dessertMenu);

    dessertMenu.add(new MenuItem("Apple pie", "Apple pie with a flakey crust, topped with vanilla ice cream", true, 1.59));

    Waitress waitress = new Waitress(allMenu);
    waitress.printMenu();
    waitress.printVegetarianMenu();
  }
}
