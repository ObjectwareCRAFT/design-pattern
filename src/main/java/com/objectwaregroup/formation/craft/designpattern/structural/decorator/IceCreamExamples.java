package com.objectwaregroup.formation.craft.designpattern.structural.decorator;

public class IceCreamExamples {

  public static void main(String[] args) {
    IceCream vanillaIceCream = new VanillaIceCream();

    IceCream vanillaIceCreamWithWhippedCream = new IceCreamWithWhippedCream(vanillaIceCream);
    IceCream vanillaIceCreamWithNuts = new IceCreamWithNuts(vanillaIceCream);

    System.out.println(vanillaIceCream.description() + " : " + vanillaIceCream.cost());
    System.out.println(vanillaIceCreamWithWhippedCream.description() + " : " + vanillaIceCreamWithWhippedCream.cost());
    System.out.println(vanillaIceCreamWithNuts.description() + " : " + vanillaIceCreamWithNuts.cost());
  }

}
