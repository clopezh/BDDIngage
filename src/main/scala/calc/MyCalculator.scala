package calc

class MyCalculator {
  def add(first: Int, second: Int): Int = {
    first + second
  }
  def sub(first: Int, second: Int): Int = {
      first - second
  }

  def log(first: Double, second: Int): Double = {
    BigDecimal(scala.math.log10(first)/scala.math.log10(second)).setScale(5,BigDecimal.RoundingMode.FLOOR).toDouble
  }

  def mul(first: Int, second: Int): Int = {
    first * second
  }

  def div(first: Double, second: Double): Double = {
    BigDecimal(first/second).setScale(5,BigDecimal.RoundingMode.FLOOR).toDouble
  }

  def pow(first: Int, second: Int): Int = {
    scala.math.pow(first,second).toInt
  }

  def sqrt(first: Double): Double = {
    BigDecimal(scala.math.sqrt(first)).setScale(5,BigDecimal.RoundingMode.FLOOR).toDouble
  }
}
