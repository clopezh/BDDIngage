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
  var resultLog: ArrayBuffer[Double] = ArrayBuffer[Double]()

  Given("""^my calculator is running$"""){ () =>
    calc = new MyCalculator
    result = ArrayBuffer[Int]()
  }

  Given("""^my calculator is running into log10$"""){ () =>
    calc = new MyCalculator
    resultLog = ArrayBuffer[Double]()
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
    while (  i < list.size  ) {
      result.append(calc.sub(list.get(i).get("firstNum").toInt, list.get(i).get("secondNum").toInt))

        i += 1;
    }
  }


  Then("""^result should be equal to$"""){ (results:DataTable) =>
    var i = 0;
    for (row <- results.asMaps(classOf[String], classOf[String])) {
      assert(result(i) == row.get("result").toInt, "Incorrect result of calculator computation")
      i += 1
    }
  }

  When("""^I take a percentage of the following numbers$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      val unit: Unit = result.append(calc.percentage(list.get(i).get("firstNum").toInt, list.get(i).get("secondNum").toInt))
      i += 1
      i - 1

    }
  }

  Then("""^result should be equal to log10$"""){ (results:DataTable) =>
    var i = 0;
    for (row <- results.asMaps(classOf[String], classOf[String])) {
      assert(resultLog(i) == row.get("resultLog").toDouble, "Incorrect result of calculator computation")
      i += 1
    }
  }

  When("""^I take log10$"""){ (numbers:DataTable) =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      resultLog.append(calc.logBase10(list.get(i).get("firstNum").toDouble))

      i += 1
      i - 1
    }
  }
}

