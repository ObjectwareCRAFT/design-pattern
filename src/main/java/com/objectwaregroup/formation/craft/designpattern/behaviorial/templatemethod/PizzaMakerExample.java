package com.objectwaregroup.formation.craft.designpattern.behaviorial.templatemethod;

public class PizzaMakerExample {

  public static void main(String[] args) {
    PizzaMaker margheritaMaker = new MargheritaMaker();
    PizzaMaker cheesyMaker = new CheesyMaker();

    System.out.println("How to make a margherita :");
    margheritaMaker.make();
    System.out.println();
    System.out.println("How to make a cheesy :");
    cheesyMaker.make();
  }

}
