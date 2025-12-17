package com.objectwaregroup.formation.craft.designpattern.behaviorial.strategy;

class Multiply implements Operation {

  @Override
  public double execute(double a,
                        double b) {
    return a * b;
  }

}