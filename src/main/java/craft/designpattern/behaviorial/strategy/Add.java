package craft.designpattern.behaviorial.strategy;

class Add implements Operation {

  @Override
  public double execute(double a,
                        double b) {
    return a + b;
  }

}