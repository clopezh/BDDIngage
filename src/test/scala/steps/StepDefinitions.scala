package steps

import calc.MyCalculator
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}

import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import scala.collection.mutable.ArrayBuffer

class StepDefinitions extends ScalaDsl with EN {
  var calc: MyCalculator = _
  var result: ArrayBuffer[Int] = ArrayBuffer[Int]()
  var resultDiv: ArrayBuffer[Float] = ArrayBuffer[Float]()
  var resultSqrt: ArrayBuffer[Double] = ArrayBuffer[Double]()

  Given("""^my calculator is running$"""){ () =>
    calc = new MyCalculator
    result = ArrayBuffer[Int]()
  }

  When("""^I add the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.add(list.get(i).get("firstNum").toInt, list.get(i).get("secondNum").toInt))

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
      result.append(calc.sub(list.get(i).get("firstNum").toInt, list.get(i).get("secondNum").toInt))

      {
        i += 1; i - 1
      }
    }
  }

  Then("""^result should be equal to$"""){ (results:DataTable) =>
    var i = 0;
    for (row <- results.asMaps(classOf[String], classOf[String])) {
      assert(result(i) == row.get("result").toInt, "Incorrect result of calculator computation")
      i += 1
    }
  }

  Given("""^my calculator is running for division$"""){ () =>
    calc = new MyCalculator
    resultDiv = ArrayBuffer[Float]()
  }

  When("""^I divide the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      resultDiv.append(calc.div(list.get(i).get("firstNum").toFloat, list.get(i).get("secondNum").toFloat))

      {
        i += 1; i - 1
      }
    }
  }

  Then("""^resultDiv should be equal to$"""){ (results:DataTable) =>
    var i = 0;
    for (row <- results.asMaps(classOf[String], classOf[String])) {
      assert(resultDiv(i) == row.get("result").toFloat, "Incorrect result of calculator computation")
      i += 1
    }
  }
  Given("""^my calculator is running for square root$"""){ () =>
    calc = new MyCalculator
    resultSqrt = ArrayBuffer[Double]()
  }

  When("""^I calculate the square root of the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      resultSqrt.append(calc.sqrt(list.get(i).get("firstNum").toDouble))

      {
        i += 1; i - 1
      }
    }
  }

  Then("""^resultSqrt should be equal to$"""){ (results:DataTable) =>
    var i = 0;
    for (row <- results.asMaps(classOf[String], classOf[String])) {
      assert(resultSqrt(i) == row.get("result").toDouble, "Incorrect result of calculator computation")
      i += 1
    }
  }

}
