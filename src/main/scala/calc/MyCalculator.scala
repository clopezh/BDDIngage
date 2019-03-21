package calc

class MyCalculator {
  def add(first: Int, second: Int): Int = {
    first + second
  }
  def sub(first: Int, second: Int): Int = {
    first - second
  }
  def mul(first: Int, second: Int): Int = {
    first * second
  }
  def div(first: Int, second: Int): Float = {
    first / second
  }
  def pow(base: Double, exponent: Double): Double = {
    scala.math.pow(base, exponent)
  }
  def sqroot(number: Double): Double = {
    scala.math.sqrt(number)
  }
  def logn(number: Double): Double = {
    scala.math.log(number)
  }
}
