package calc

class MyCalculator {
  def add(first: Int, second: Int): Int = {
    first + second
  }
  def sub(first: Int, second: Int): Int = {
      first - second
  }
  def remainder(first: Int, second: Int): Int = {
    if(second == 0){
      500 //error code
    }
    else {
      first % second
    }
  }
  def n_root(first: Int, second: Int): Int = {
    if(second == 0){
      500 //error code
    }
    else {
      scala.math.pow(first, 1.0 / second).toInt
    }
  }
}
