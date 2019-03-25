package calc

class MyCalculator {
  def add(first: Int, second: Int): Int = {
    first + second
  }
  def sub(first: Int, second: Int): Int = {
    first - second
  }
  def div(first: Int, second: Int): Int={
    first / second
  }
  def mul(first: Int, second: Int): Int={
    first * second
  }

  def pow(first: Double, second: Double): Double={
    scala.math.pow(first, second)
  }

  def sqrt(first: Int): Double={
    scala.math.sqrt(first)
  }

  def log(first: Double): Double={
    scala.math.log(first)
  }
}
