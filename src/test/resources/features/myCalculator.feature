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
  Scenario: Should get the log of a positive numbers
    Given my calculator is running
    When I log a number by a number base
      | Number   | Base      |
      | 4        | 5         |
      | 10       | 8         |
    Then result should be equal to
      | result       |
      | 0.86135      |
      | 1.10730      |

  @wip
  Scenario: Should multiply two positive numbers
    Given my calculator is running
    When I multiply the following numbers
      | firstNum | secondNum |
      | 2        | 2         |
      | 9        | 3         |
    Then result should be equal to
      | result       |
      | 4            |
      | 27           |

  @wip
  Scenario: Should divide two positive numbers
    Given my calculator is running
    When I divide the following numbers
      | firstNum | secondNum |
      | 9        | 9         |
      | 5        | 3         |
    Then result should be equal to
      | result       |
      | 1            |
      | 1.66666      |

  @wip
  Scenario: Should power two positive numbers
    Given my calculator is running
    When I power the following numbers
      | Base     | Exponent |
      | 3        | 3        |
      | 5        | 3        |
    Then result should be equal to
      | result    |
      | 27        |
      | 125       |

  @wip
  Scenario: Should get the square root of a positive number
    Given my calculator is running
    When I get the square root of a positive following number
      | firstNum |
      | 7        |
      | 25       |
    Then result should be equal to
      | result   |
      | 2.64575  |
      | 5        |
