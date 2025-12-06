package com.objectwaregroup.formation.craft.designpattern.behaviorial.templatemethod;

public class CheesyMaker extends PizzaMaker {

  @Override
  protected void preparePizzaDough() {
    System.out.println("Prepare mozza dough");
  }

  @Override
  protected void addBase() {
    System.out.println("Add cream base");
  }

  @Override
  protected void addIngredients() {
    System.out.println("Add goat cheese cheese, mozzarella, gruyere and blue cheese");
  }

  @Override
  protected void bakePizza() {
    System.out.println("Bake at 260°C for 7 minutes");
  }

  @Override
  protected void addToppings() {
    System.out.println("Add olives");
  }

  @Override
  protected void packPizza() {
    System.out.println("Pack in white box");
  }

}
