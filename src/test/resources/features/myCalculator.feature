Feature: My Calculator

  @wip
  Scenario: Should add two positive numbers
    Given my calculator is running
    When I add the following numbers
      | firstNum | secondNum |
      | 1        | 2         |
      | 2        | 3         |
    Then result should be equal to
      | result |
      | 3      |
      | 5      |

  @wip
  Scenario: Should subtract two positive numbers
    Given my calculator is running
    When I subtract the following numbers
      | firstNum | secondNum |
      | 4        | 2         |
      | 10       | 3         |
    Then result should be equal to
      | result |
      | 2      |
      | 7      |

  @wip
  Scenario: Should multiply two positive numbers
    Given my calculator is running
    When I multiply the following numbers
      | firstNum | secondNum |
      | 4        | 2         |
      | 10       | 3         |
    Then result should be equal to
      | result |
      | 8      |
      | 30     |

  @wip
  Scenario: Should divide two positive numbers
    Given my calculator is running
    When I divide the following numbers
      | firstNum | secondNum |
      | 4        | 2         |
      | 12       | 3         |
    Then result should be equal to
      | result |
      | 2      |
      | 4      |



  @wip
  Scenario: Should power two positive numbers
    Given my calculator is running
    When I power the following numbers
      | firstNum | secondNum |
      | 4        | 2         |
      | 8        | 3         |
    Then result should be equal to
      | result |
      | 16      |
      | 512     |

  @wip
  Scenario: Should square root  one positive number
    Given my calculator is running
    When I square root a number
      | firstNum |
      | 9        |
      | 25       |
    Then result should be equal to
      | result |
      | 3      |
      | 5      |

  @wip
  Scenario: Should log one positive number
    Given my calculator is running
    When I log a number
      | firstNum |
      | 1        |
      | 2.718281 |

    Then result should be equal to
      | result |
      | 0      |
      | 1      |
