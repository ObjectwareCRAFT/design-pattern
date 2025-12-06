package com.objectwaregroup.formation.craft.designpattern.structural.decorator;

public class IceCreamWithWhippedCream implements IceCream {

  private final IceCream iceCream;

  public IceCreamWithWhippedCream(IceCream iceCream) {
    this.iceCream = iceCream;
  }

  @Override
  public String description() {
    return iceCream.description() + " with whipped cream";
  }

  @Override
  public Double cost() {
    return iceCream.cost() + 1;
  }

}
