package com.haichao.day3.Decorator;

public class StarBuzzCoffe {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription()+ "$" + beverage.coast());

    Beverage beverage1 = new DarkRoast();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    beverage1 = new Mocha(beverage1);

    System.out.println(beverage1.getDescription() + "$" + beverage1.coast());

    Beverage beverage2 = new HouseBlend();
    beverage2 = new Soy(beverage2);
    beverage2 = new Whip(beverage2);
    beverage2 = new Mocha(beverage2);

    System.out.println(beverage2.getDescription() + "$" + beverage2.coast());
  }
}
