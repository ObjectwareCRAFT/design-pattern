package com.objectwaregroup.formation.craft.designpattern.behaviorial.templatemethod;

public abstract class PizzaMaker {

  public void make() {
    preparePizzaDough();
    addBase();
    addIngredients();
    bakePizza();
    addToppings();
    packPizza();
  }

  protected abstract void preparePizzaDough();
  protected abstract void addBase();
  protected abstract void addIngredients();
  protected abstract void bakePizza();
  protected abstract void addToppings();
  protected abstract void packPizza();

}