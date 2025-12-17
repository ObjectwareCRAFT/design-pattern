package com.objectwaregroup.formation.craft.designpattern.structural.decorator;

public class VanillaIceCream implements IceCream {

  @Override
  public String description() {
    return "Vanilla Ice Cream";
  }

  @Override
  public Double cost() {
    return 3.0;
  }

}
