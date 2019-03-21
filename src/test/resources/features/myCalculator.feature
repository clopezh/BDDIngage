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
      | 2        | 10        |
      | 45       | 3         |
    Then result should be equal to
      | result |
      | 20     |
      | 135    |

  @wip
  Scenario: Should divide two positive numbers
    Given my calculator is running
    When I divide the following numbers
      | firstNum | secondNum |
      | 15       | 5         |
      | 80       | 20        |
    Then result should be equal to
      | result |
      | 3      |
      | 4      |

  @wip
  Scenario: Should raise first number to the power of the second
    Given my calculator is running
    When I calculate the exponentiation of the following numbers
      | firstNum | secondNum |
      | 3        | 3         |
      | 2        | 10        |
    Then result should be equal to
      | result |
      | 27     |
      | 1024   |

  @wip
  Scenario: Should get square root of a number
    Given my calculator is running
    When I calculate the square roots of the following numbers
      | firstNum |
      | 81       |
      | 36       |
    Then result should be equal to
      | result |
      | 9      |
      | 6      |

  @wip
  Scenario: Should get log n of a number
    Given my calculator is running
    When I calculate the log n of the following numbers
      | firstNum      |
      | 2.71828182846 |
      | 2980.95798704 |
    Then result should be equal to
      | result |
      | 1      |
      | 8      |