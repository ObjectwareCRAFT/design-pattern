package com.objectwaregroup.formation.craft.designpattern.behaviorial.strategy;

class CalculatorStrategy {

  public double calculate(double a,
                          double b,
                          Operation strategy) {
    return strategy.execute(a, b);
  }

}