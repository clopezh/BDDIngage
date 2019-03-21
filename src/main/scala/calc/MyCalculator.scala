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
  def log(number: Double, base: Double, decimals: Int): Double = {
    BigDecimal(scala.math.log10(number) / scala.math.log10(base)).setScale(decimals, BigDecimal.RoundingMode.FLOOR).toDouble
  }
  def sqr(number: Double, decimals: Int): Double = {
    BigDecimal(scala.math.sqrt(number)).setScale(decimals, BigDecimal.RoundingMode.FLOOR).toDouble
  }
  def nrt(number: Double, index: Double, decimals: Int): Double = {
    BigDecimal(scala.math.pow(number, 1/index)).setScale(decimals, BigDecimal.RoundingMode.FLOOR).toDouble
  }
}
