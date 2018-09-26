$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/myCalculator.feature");
formatter.feature({
  "line": 1,
  "name": "My Calculator",
  "description": "",
  "id": "my-calculator",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Should add two positive numbers",
  "description": "",
  "id": "my-calculator;should-add-two-positive-numbers",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "my calculator is running",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add the following numbers",
  "rows": [
    {
      "cells": [
        "firstNum",
        "secondNum"
      ],
      "line": 7
    },
    {
      "cells": [
        "1",
        "2"
      ],
      "line": 8
    },
    {
      "cells": [
        "2",
        "3"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "result should be equal to",
  "rows": [
    {
      "cells": [
        "result"
      ],
      "line": 11
    },
    {
      "cells": [
        "3"
      ],
      "line": 12
    },
    {
      "cells": [
        "5"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.scala:15"
});
formatter.result({
  "duration": 145162751,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.scala:20"
});
formatter.result({
  "duration": 13822560,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.scala:50"
});
formatter.result({
  "duration": 1005258,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Should subtract two positive numbers",
  "description": "",
  "id": "my-calculator;should-subtract-two-positive-numbers",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "my calculator is running",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I subtract the following numbers",
  "rows": [
    {
      "cells": [
        "firstNum",
        "secondNum"
      ],
      "line": 19
    },
    {
      "cells": [
        "4",
        "2"
      ],
      "line": 20
    },
    {
      "cells": [
        "10",
        "3"
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "result should be equal to",
  "rows": [
    {
      "cells": [
        "result"
      ],
      "line": 23
    },
    {
      "cells": [
        "2"
      ],
      "line": 24
    },
    {
      "cells": [
        "7"
      ],
      "line": 25
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.scala:15"
});
formatter.result({
  "duration": 78934,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.scala:35"
});
formatter.result({
  "duration": 567466,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.scala:50"
});
formatter.result({
  "duration": 224417,
  "status": "passed"
});
});