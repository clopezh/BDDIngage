package calc
import scala.math._

class MyCalculator {
  def add(first: Int, second: Int): Int = {
    first + second
  }
  def sub(first: Int, second: Int): Int = {
    first - second
  }
  def div(first: Float, second: Float): Float = {
    if (second == 0)
      0 //Error
    else
      first / second
  }
  def sqrt(number: Double): Double = {
    if (number < 0)
      0 //Error
    else
      math.sqrt(number)

  }

}
