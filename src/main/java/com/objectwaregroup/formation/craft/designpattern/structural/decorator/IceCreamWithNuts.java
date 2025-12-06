package com.objectwaregroup.formation.craft.designpattern.structural.decorator;

public class IceCreamWithNuts implements IceCream {

  private final IceCream iceCream;

  public IceCreamWithNuts(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public String description() {
    return iceCream.description() + " with nuts";
  }

  @Override
  public Double cost() {
    return iceCream.cost() + 0.5;
  }

}
