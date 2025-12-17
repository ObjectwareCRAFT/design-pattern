package com.objectwaregroup.formation.craft.designpattern.structural.decorator;

public class ChocolateIceCream implements IceCream {

  @Override
  public String description() {
    return "Chocolate Ice Cream";
  }

  @Override
  public Double cost() {
    return 2.0;
  }

}
