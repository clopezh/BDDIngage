package calc

class MyCalculator {
  def add(first: Double, second: Double): Double = {
    first + second
  }
  def sub(first: Double, second: Double): Double = {
    first - second
  }
  def div(first: Double, second: Double): Double = {
    if (second > 0) first / second else 0
  }
  def mul(first: Double, second: Double): Double = {
    first * second
  }
  def log(number: Double): Double = {
    BigDecimal(scala.math.log(number)).setScale(4, BigDecimal.RoundingMode.FLOOR).toDouble
  }
  def sqr(number: Double): Double = {
    BigDecimal(scala.math.sqrt(number)).setScale(4, BigDecimal.RoundingMode.FLOOR).toDouble
  }
  def nrt(number: Double, index: Double): Double = {
    BigDecimal(scala.math.pow(number, 1/index)).setScale(4, BigDecimal.RoundingMode.FLOOR).toDouble
  }
}
