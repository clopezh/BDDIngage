package calc

class MyCalculator {
  
  def add(first: Int, second: Int): Int = {
    first + second
  }
  
  def sub(first: Int, second: Int): Int = {
      first - second
  }
  
  def percentage(first: Int, second: Int): Int = {
    if (first!=0){
      first * second / 100
    }
    else{
      0
    }
  }

  def logBase10(first: Double): Double = {
    if (first!=0) {
      log10(first)
    }
    else{
      0
    }
  }
}
