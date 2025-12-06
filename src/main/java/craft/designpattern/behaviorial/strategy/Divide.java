package craft.designpattern.behaviorial.strategy;

class Divide implements Operation {

  @Override
  public double execute(double a,
                        double b) {
    if (b == 0) {
      throw new ArithmeticException("Division par zéro");
    }
    return a / b;
  }

}