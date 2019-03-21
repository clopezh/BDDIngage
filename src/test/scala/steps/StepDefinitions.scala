package steps

import calc.MyCalculator
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

class StepDefinitions extends ScalaDsl with EN {
  var calc: MyCalculator = _
  var result: ArrayBuffer[Double] = ArrayBuffer[Double]()

  Given("""^my calculator is running$"""){ () =>
    calc = new MyCalculator
    result = ArrayBuffer[Double]()
  }

  When("""^I add the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.add(list.get(i).get("firstNum").toDouble, list.get(i).get("secondNum").toDouble))

      {
        i += 1; i - 1
      }
    }
  }

  When("""^I subtract the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.sub(list.get(i).get("firstNum").toDouble, list.get(i).get("secondNum").toDouble))

      {
        i += 1; i - 1
      }
    }
  }

  When("""^I divide the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.div(list.get(i).get("firstNum").toDouble, list.get(i).get("secondNum").toDouble))

      {
        i += 1; i - 1
      }
    }
  }

  When("""^I multiply the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.mul(list.get(i).get("firstNum").toDouble, list.get(i).get("secondNum").toDouble))

      {
        i += 1; i - 1
      }
    }
  }

  When("""^I get the logarithm of the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.log(list.get(i).get("firstNum").toDouble, list.get(i).get("secondNum").toDouble, list.get(i).get("thirdNum").toInt))

      {
        i += 1; i - 1
      }
    }
  }

  When("""^I get the square of the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.sqr(list.get(i).get("firstNum").toDouble, list.get(i).get("secondNum").toInt))

      {
        i += 1; i - 1
      }
    }
  }

  When("""^I get the nth root of the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.nrt(list.get(i).get("firstNum").toDouble, list.get(i).get("secondNum").toDouble, list.get(i).get("thirdNum").toInt))

      {
        i += 1; i - 1
      }
    }
  }

  Then("""^result should be equal to$"""){ (results:DataTable) =>
    var i = 0;
    for (row <- results.asMaps(classOf[String], classOf[String])) {
      assert(result(i) == row.get("result").toDouble, "Incorrect result of calculator computation")
      i += 1
    }
  }
}
