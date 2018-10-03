package calc

class MyCalculator {
  def add(first: Int, second: Int): Int = {
    first + second
  }
  def sub(first: Int, second: Int): Int = {
      first - second
  }

  def power(base: Double, exponent: Double): Int = {
    math.pow(base, exponent).toInt
  }
  def module(numerator: Int, denominator: Int): Int = {
    if (denominator == 0) System.exit(1) //Exits with error code 1 if a 0 is given in the denominator
    numerator % denominator
  }
}
