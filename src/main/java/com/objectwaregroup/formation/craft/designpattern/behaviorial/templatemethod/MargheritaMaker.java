package com.objectwaregroup.formation.craft.designpattern.behaviorial.templatemethod;

public class MargheritaMaker extends PizzaMaker {

  @Override
  protected void preparePizzaDough() {
    System.out.println("Prepare basic dough");
  }

  @Override
  protected void addBase() {
    System.out.println("Add tomato base");
  }

  @Override
  protected void addIngredients() {
    System.out.println("Add mozzarella cheese");
  }

  @Override
  protected void bakePizza() {
    System.out.println("Bake at 250°C for 5 minutes");
  }

  @Override
  protected void addToppings() {
    System.out.println("Add basil");
  }

  @Override
  protected void packPizza() {
    System.out.println("Pack in red box");
  }

}
