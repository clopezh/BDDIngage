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

  When("""^Get the first number's nth_root, n being the second number""") { numbers: DataTable =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.n_root(list.get(i).get("firstNum").toInt, list.get(i).get("secondNum").toInt))

      {
        i += 1
        i - 1
      }
    }
  }

  When("""^I divide the following numbers$"""){ numbers:DataTable =>
    val list = numbers.asMaps(classOf[String], classOf[String])
    var i = 0
    while ( {
      i < list.size
    }) {
      result.append(calc.remainder(list.get(i).get("firstNum").toInt, list.get(i).get("secondNum").toInt))

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
}
